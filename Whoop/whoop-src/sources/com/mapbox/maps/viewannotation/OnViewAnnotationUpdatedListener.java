package com.mapbox.maps.viewannotation;

import android.view.View;
import com.mapbox.geojson.Point;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.ViewAnnotationAnchorConfig;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lcom/mapbox/maps/viewannotation/OnViewAnnotationUpdatedListener;", "", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Lcom/mapbox/maps/ScreenCoordinate;", "leftTopCoordinate", "", "width", "height", "Ll83/a0;", "onViewAnnotationPositionUpdated", "(Landroid/view/View;Lcom/mapbox/maps/ScreenCoordinate;DD)V", "", "visible", "onViewAnnotationVisibilityUpdated", "(Landroid/view/View;Z)V", "Lcom/mapbox/geojson/Point;", "anchorCoordinate", "onViewAnnotationAnchorCoordinateUpdated", "(Landroid/view/View;Lcom/mapbox/geojson/Point;)V", "Lcom/mapbox/maps/ViewAnnotationAnchorConfig;", "anchor", "onViewAnnotationAnchorUpdated", "(Landroid/view/View;Lcom/mapbox/maps/ViewAnnotationAnchorConfig;)V", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public interface OnViewAnnotationUpdatedListener {

    @Metadata(m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class DefaultImpls {
        public static void onViewAnnotationAnchorCoordinateUpdated(OnViewAnnotationUpdatedListener onViewAnnotationUpdatedListener, View view, Point anchorCoordinate) {
            AbstractC22676k.m65750j(view, "view");
            AbstractC22676k.m65750j(anchorCoordinate, "anchorCoordinate");
        }

        public static void onViewAnnotationAnchorUpdated(OnViewAnnotationUpdatedListener onViewAnnotationUpdatedListener, View view, ViewAnnotationAnchorConfig anchor) {
            AbstractC22676k.m65750j(view, "view");
            AbstractC22676k.m65750j(anchor, "anchor");
        }

        public static void onViewAnnotationPositionUpdated(OnViewAnnotationUpdatedListener onViewAnnotationUpdatedListener, View view, ScreenCoordinate leftTopCoordinate, double d3, double d14) {
            AbstractC22676k.m65750j(view, "view");
            AbstractC22676k.m65750j(leftTopCoordinate, "leftTopCoordinate");
        }

        public static void onViewAnnotationVisibilityUpdated(OnViewAnnotationUpdatedListener onViewAnnotationUpdatedListener, View view, boolean z4) {
            AbstractC22676k.m65750j(view, "view");
        }
    }

    void onViewAnnotationAnchorCoordinateUpdated(View view, Point anchorCoordinate);

    void onViewAnnotationAnchorUpdated(View view, ViewAnnotationAnchorConfig anchor);

    void onViewAnnotationPositionUpdated(View view, ScreenCoordinate leftTopCoordinate, double width, double height);

    void onViewAnnotationVisibilityUpdated(View view, boolean visible);
}
