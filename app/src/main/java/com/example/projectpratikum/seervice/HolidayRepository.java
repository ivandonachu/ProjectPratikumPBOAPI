package com.example.projectpratikum.seervice;

import com.example.projectpratikum.model.holiday.HolidayDiscoveryResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface HolidayRepository {
    @GET("holidays?api_key=e80f9f62-5559-46eb-a8ca-a83a33aa59e2&country=US&year=2020")
    Call<HolidayDiscoveryResponse> getHolidayDiscovery();
}
