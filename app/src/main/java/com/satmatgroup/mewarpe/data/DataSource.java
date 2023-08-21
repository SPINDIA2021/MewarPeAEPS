package com.satmatgroup.mewarpe.data;




import com.satmatgroup.mewarpe.network.NetworkCall;
import com.satmatgroup.mewarpe.network.ServiceCallBack;

import okhttp3.RequestBody;
import retrofit2.http.Part;


public interface DataSource {

    void getCategory(ServiceCallBack myAppointmentPresenter, NetworkCall networkCall);

    void saveRetry(String txnid, ServiceCallBack myAppointmentPresenter, NetworkCall networkCall);

}

