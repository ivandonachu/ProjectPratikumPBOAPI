package com.example.projectpratikum.view.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.projectpratikum.model.holiday.HolidayDiscoveryResponse;
import com.example.projectpratikum.model.holiday.HolidaysDiscoveryResultItem;
import com.example.projectpratikum.seervice.ApiMain;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HolidayViewModel extends ViewModel {
    private ApiMain apiMain;

    private MutableLiveData<ArrayList<HolidaysDiscoveryResultItem>> listDiscoverHoliday = new MutableLiveData<>();

    public void setHolidayDiscover(){
        if(this.apiMain == null){
            apiMain = new ApiMain();
        }

        apiMain.getApiHoliday().getHolidayDiscovery().enqueue(new Callback<HolidayDiscoveryResponse>() {
            @Override
            public void onResponse(Call<HolidayDiscoveryResponse> call, Response<HolidayDiscoveryResponse> response) {
                HolidayDiscoveryResponse responseDiscover = response.body();
                if (responseDiscover != null && responseDiscover.getHolidays() != null){
                        ArrayList<HolidaysDiscoveryResultItem> holidayDiscoveryItem = responseDiscover.getHolidays();
                        listDiscoverHoliday.postValue(holidayDiscoveryItem);
                }
            }

            @Override
            public void onFailure(Call<HolidayDiscoveryResponse> call, Throwable t) {

            }
        });
    }
    public LiveData<ArrayList<HolidaysDiscoveryResultItem>> getHolidayDiscover(){
        return  listDiscoverHoliday;
    }
}
