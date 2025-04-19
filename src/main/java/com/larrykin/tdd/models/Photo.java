package com.larrykin.tdd.models;

public record Photo(Integer id, Integer albumId, String title, String url, String thumbnailUrl) {
}
