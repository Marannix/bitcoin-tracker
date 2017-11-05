package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Tobi on 04-Nov-17.
 */

public class DataModel {
    private String mPriceTextView;

    public static DataModel fromJson(JSONObject jsonObject) {

        try {
            DataModel dataModel = new DataModel();

            dataModel.mPriceTextView = jsonObject.getString("low");

            return dataModel;
        } catch (JSONException e)  {
            e.printStackTrace();
            return null;
        }
    }

    public String getmPriceTextView() {
        return mPriceTextView;
    }
}
