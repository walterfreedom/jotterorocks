package com.ferret.mcserverlog.bootstrap;

import com.ferret.mcserverlog.model.categoryModel;
import com.ferret.mcserverlog.model.post;
import com.ferret.mcserverlog.repositories.postRepo;
import org.springframework.boot.CommandLineRunner;
import com.ferret.mcserverlog.repositories.categoryModelRepo0;
import org.springframework.stereotype.Component;

@Component
public class bootStrapData implements CommandLineRunner {
    private final categoryModelRepo0 categoryModelRepo;
    private final postRepo postRepo;

    public bootStrapData(categoryModelRepo0 categoryModelRepo, com.ferret.mcserverlog.repositories.postRepo postRepo) {
        this.categoryModelRepo = categoryModelRepo;
        this.postRepo = postRepo;
    }


    @Override
    public void run(String... args) throws Exception {

        categoryModel based = new categoryModel("Based");
        post concrete = new post("cool concrete facts","fact 1: concrets are cool");
        based.getPosts().add(concrete);
        concrete.getCategories().add(based);

        categoryModelRepo.save(based);
        postRepo.save(concrete);

        System.out.println("Started bootstrap");
        System.out.println("Number of categories: "+ categoryModelRepo.count());
    }
}
