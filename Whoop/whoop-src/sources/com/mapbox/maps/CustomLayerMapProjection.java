package com.mapbox.maps;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface CustomLayerMapProjection {
    List<Double> convertMercatorModelMatrix(List<Double> list, boolean z4);

    List<Double> getModelMatrix();

    List<Double> getTransitionMatrix();

    float getTransitionPhase();
}
