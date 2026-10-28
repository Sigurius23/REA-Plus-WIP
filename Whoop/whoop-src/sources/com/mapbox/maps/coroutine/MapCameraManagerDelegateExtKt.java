package com.mapbox.maps.coroutine;

import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.ScreenCoordinate;
import ge3.AbstractC15751g;
import java.util.List;
import mv.InterfaceC25962a;
import p715kotlin.Metadata;
import q83.C30065l;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aQ\u0010\f\u001a\u00020\u0004*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, m65681d2 = {"Lmv/a;", "", "Lcom/mapbox/geojson/Point;", "coordinates", "Lcom/mapbox/maps/CameraOptions;", "camera", "Lcom/mapbox/maps/EdgeInsets;", "coordinatesPadding", "", "maxZoom", "Lcom/mapbox/maps/ScreenCoordinate;", MapboxMap.QFE_OFFSET, "awaitCameraForCoordinates", "(Lmv/a;Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;Lq83/d;)Ljava/lang/Object;", "maps-sdk_release"}, m65682k = 2, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class MapCameraManagerDelegateExtKt {
    public static final Object awaitCameraForCoordinates(InterfaceC25962a interfaceC25962a, List list, CameraOptions cameraOptions, EdgeInsets edgeInsets, Double d3, ScreenCoordinate screenCoordinate, InterfaceC30057d interfaceC30057d) {
        C30065l c30065l = new C30065l(AbstractC15751g.m44424D(interfaceC30057d));
        interfaceC25962a.cameraForCoordinates(list, cameraOptions, edgeInsets, d3, screenCoordinate, new MapCameraManagerDelegateExtKt$awaitCameraForCoordinates$2$1(c30065l));
        Object objM92140a = c30065l.m92140a();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM92140a;
    }

    public static /* synthetic */ Object awaitCameraForCoordinates$default(InterfaceC25962a interfaceC25962a, List list, CameraOptions cameraOptions, EdgeInsets edgeInsets, Double d3, ScreenCoordinate screenCoordinate, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            edgeInsets = null;
        }
        if ((i13 & 8) != 0) {
            d3 = null;
        }
        if ((i13 & 16) != 0) {
            screenCoordinate = null;
        }
        return awaitCameraForCoordinates(interfaceC25962a, list, cameraOptions, edgeInsets, d3, screenCoordinate, interfaceC30057d);
    }
}
