package com.mapbox.maps;

import android.graphics.Bitmap;
import com.mapbox.bindgen.DataRef;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0007¨\u0006\b"}, m65681d2 = {"toCameraOptions", "Lcom/mapbox/maps/CameraOptions;", "Lcom/mapbox/maps/CameraState;", "anchor", "Lcom/mapbox/maps/ScreenCoordinate;", "toMapboxImage", "Lcom/mapbox/maps/Image;", "Landroid/graphics/Bitmap;", "sdk-base_release"}, m65682k = 2, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class ExtensionUtils {
    public static final CameraOptions toCameraOptions(CameraState cameraState) {
        AbstractC22676k.m65750j(cameraState, "<this>");
        return toCameraOptions$default(cameraState, null, 1, null);
    }

    public static /* synthetic */ CameraOptions toCameraOptions$default(CameraState cameraState, ScreenCoordinate screenCoordinate, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            screenCoordinate = null;
        }
        return toCameraOptions(cameraState, screenCoordinate);
    }

    @MapboxDelicateApi
    public static final Image toMapboxImage(Bitmap bitmap) {
        AbstractC22676k.m65750j(bitmap, "<this>");
        if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            throw new IllegalArgumentException("Only ARGB_8888 bitmap config is supported!");
        }
        DataRef dataRefAllocateNative = DataRef.allocateNative(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(dataRefAllocateNative.getBuffer());
        return new Image(bitmap.getWidth(), bitmap.getHeight(), dataRefAllocateNative);
    }

    public static final CameraOptions toCameraOptions(CameraState cameraState, ScreenCoordinate screenCoordinate) {
        AbstractC22676k.m65750j(cameraState, "<this>");
        if (screenCoordinate != null) {
            CameraOptions cameraOptionsBuild = new CameraOptions.Builder().anchor(screenCoordinate).padding(cameraState.getPadding()).zoom(Double.valueOf(cameraState.getZoom())).pitch(Double.valueOf(cameraState.getPitch())).bearing(Double.valueOf(cameraState.getBearing())).build();
            AbstractC22676k.m65749i(cameraOptionsBuild, "{\n    CameraOptions.Buil…aring)\n      .build()\n  }");
            return cameraOptionsBuild;
        }
        CameraOptions toCameraOptions = new CameraOptions.Builder().center(cameraState.getCenter()).padding(cameraState.getPadding()).zoom(Double.valueOf(cameraState.getZoom())).pitch(Double.valueOf(cameraState.getPitch())).bearing(Double.valueOf(cameraState.getBearing())).build();
        AbstractC22676k.m65749i(toCameraOptions, "toCameraOptions");
        return toCameraOptions;
    }
}
