package com.mapbox.maps;

import com.mapbox.bindgen.Expected;
import java.util.List;

/* JADX INFO: renamed from: com.mapbox.maps.k */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C5537k implements Expected.Transformer {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Double f22046E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ ScreenCoordinate f22047F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ MapboxMap f22048G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f22049w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ List f22050x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ CameraOptions f22051y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ EdgeInsets f22052z;

    public /* synthetic */ C5537k(List list, CameraOptions cameraOptions, EdgeInsets edgeInsets, Double d3, ScreenCoordinate screenCoordinate, MapboxMap mapboxMap, int i13) {
        this.f22049w = i13;
        this.f22050x = list;
        this.f22051y = cameraOptions;
        this.f22052z = edgeInsets;
        this.f22046E = d3;
        this.f22047F = screenCoordinate;
        this.f22048G = mapboxMap;
    }

    @Override // com.mapbox.bindgen.Expected.Transformer
    public final Object invoke(Object obj) {
        switch (this.f22049w) {
            case 0:
                return MapboxMap.C54823.invoke$lambda$1(this.f22050x, this.f22051y, this.f22052z, this.f22046E, this.f22047F, this.f22048G, (String) obj);
            default:
                return MapboxMap.cameraForCoordinates$lambda$17(this.f22050x, this.f22051y, this.f22052z, this.f22046E, this.f22047F, this.f22048G, (String) obj);
        }
    }
}
