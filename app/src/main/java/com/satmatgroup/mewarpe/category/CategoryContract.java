package com.satmatgroup.mewarpe.category;


import android.content.Context;

import com.myapp.onlysratchapp.category.CategoryResponse;
import com.satmatgroup.mewarpe.network.BaseView;

import java.util.ArrayList;


public interface CategoryContract {
    interface View extends BaseView<Presenter> {

        void categoryResponse(ArrayList<CategoryResponse> categoryResponse);
        void retryResponse(String retryResponse);

    }

    interface Presenter {


        void getCategory( Context context);
        void saveRetry( String txnid,Context context);


    }
}
