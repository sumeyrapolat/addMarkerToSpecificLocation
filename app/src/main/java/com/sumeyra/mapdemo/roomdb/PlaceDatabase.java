package com.sumeyra.mapdemo.roomdb;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.sumeyra.mapdemo.model.Place;

@Database(entities = {Place.class}, version = 1)
public abstract class PlaceDatabase extends RoomDatabase {
    public abstract PlaceDao placeDao();
}