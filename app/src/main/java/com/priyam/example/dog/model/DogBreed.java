package com.priyam.example.dog.model;

import com.priyam.example.dog.net.Api;

import androidx.databinding.BaseObservable;
import retrofit2.Callback;

public class DogBreed extends BaseObservable {
    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void fetchImages(Callback<DogBreedImages> callback) {
        Api.getApi().getImagesByBreed(this.breed).enqueue(callback);
    }
}
