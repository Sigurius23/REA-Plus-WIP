package com.mapbox.maps.dsl;

import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CameraState;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, m65681d2 = {"Lkotlin/Function1;", "Lcom/mapbox/maps/CameraOptions$Builder;", "Ll83/a0;", "block", "Lcom/mapbox/maps/CameraOptions;", "cameraOptions", "(Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/CameraOptions;", "Lcom/mapbox/maps/CameraState;", "cameraState", "(Lcom/mapbox/maps/CameraState;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/CameraOptions;", "sdk-base_release"}, m65682k = 2, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class CameraOptionsKtxKt {
    public static final CameraOptions cameraOptions(Function1 block) {
        AbstractC22676k.m65750j(block, "block");
        CameraOptions.Builder builder = new CameraOptions.Builder();
        block.invoke(builder);
        CameraOptions cameraOptionsBuild = builder.build();
        AbstractC22676k.m65749i(cameraOptionsBuild, "Builder().apply(block).build()");
        return cameraOptionsBuild;
    }

    public static final CameraOptions cameraOptions(CameraState cameraState, Function1 block) {
        AbstractC22676k.m65750j(cameraState, "cameraState");
        AbstractC22676k.m65750j(block, "block");
        CameraOptions.Builder builderPitch = new CameraOptions.Builder().padding(cameraState.getPadding()).center(cameraState.getCenter()).bearing(Double.valueOf(cameraState.getBearing())).zoom(Double.valueOf(cameraState.getZoom())).pitch(Double.valueOf(cameraState.getPitch()));
        block.invoke(builderPitch);
        CameraOptions cameraOptions = builderPitch.build();
        AbstractC22676k.m65749i(cameraOptions, "cameraOptions");
        return cameraOptions;
    }
}
