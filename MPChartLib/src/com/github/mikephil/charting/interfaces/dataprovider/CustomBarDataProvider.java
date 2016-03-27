package com.github.mikephil.charting.interfaces.dataprovider;

import com.github.mikephil.charting.data.CustomBarData;

public interface CustomBarDataProvider extends BarLineScatterCandleBubbleDataProvider {


    CustomBarData getBarData();
    boolean isDrawBarShadowEnabled();
    boolean isDrawValueAboveBarEnabled();
    boolean isDrawHighlightArrowEnabled();
}
