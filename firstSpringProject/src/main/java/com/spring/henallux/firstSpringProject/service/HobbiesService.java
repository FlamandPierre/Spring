package com.spring.henallux.firstSpringProject.service;

import com.spring.henallux.firstSpringProject.model.Hobby;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class HobbiesService {
    private ArrayList<Hobby> hobbiesList;

    public HobbiesService() {
        hobbiesList = new ArrayList<Hobby>();
        hobbiesList.add(new Hobby("spt","Sport"));
        hobbiesList.add(new Hobby("nat", "Nature"));
        hobbiesList.add(new Hobby("rdg", "Reading"));
        hobbiesList.add(new Hobby("msc", "Music"));
    }

    public void setHobbiesList(ArrayList<Hobby> hobbiesList) {
        this.hobbiesList = hobbiesList;
    }

    public ArrayList<Hobby> getHobbiesList() {
        return hobbiesList;
    }
}
