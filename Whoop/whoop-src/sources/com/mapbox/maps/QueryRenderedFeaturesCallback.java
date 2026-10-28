package com.mapbox.maps;

import com.mapbox.bindgen.Expected;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface QueryRenderedFeaturesCallback {
    void run(Expected<String, List<QueriedRenderedFeature>> expected);
}
