package com.aclabs.aclabs2023.services;

import com.aclabs.aclabs2023.repositories.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService {

    @Autowired
    HomeRepository homeRepository;

    public String getFirstString(){
        return homeRepository.getFirstString();
    }

    public List<String> getAllStrings() {
        return homeRepository.getAllStrings();
    }

    public void addString(String string) {
        homeRepository.addString(string);
    }
}
