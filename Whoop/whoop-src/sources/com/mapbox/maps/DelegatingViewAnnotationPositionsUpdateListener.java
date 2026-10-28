package com.mapbox.maps;

import com.mapbox.geojson.Point;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&¢\u0006\u0004\b\f\u0010\t¨\u0006\r"}, m65681d2 = {"Lcom/mapbox/maps/DelegatingViewAnnotationPositionsUpdateListener;", "Lcom/mapbox/maps/ViewAnnotationPositionsUpdateListener;", "<init>", "()V", "", "Lcom/mapbox/maps/ViewAnnotationPositionDescriptor;", "positions", "Ll83/a0;", "onViewAnnotationPositionsUpdate", "(Ljava/util/List;)V", "", "Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;", "onDelegatingViewAnnotationPositionsUpdate", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public abstract class DelegatingViewAnnotationPositionsUpdateListener implements ViewAnnotationPositionsUpdateListener {
    public abstract void onDelegatingViewAnnotationPositionsUpdate(List<DelegatingViewAnnotationPositionDescriptor> positions);

    @Override // com.mapbox.maps.ViewAnnotationPositionsUpdateListener
    public final void onViewAnnotationPositionsUpdate(List<ViewAnnotationPositionDescriptor> positions) {
        AbstractC22676k.m65750j(positions, "positions");
        List<ViewAnnotationPositionDescriptor> list = positions;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (ViewAnnotationPositionDescriptor viewAnnotationPositionDescriptor : list) {
            String identifier = viewAnnotationPositionDescriptor.getIdentifier();
            AbstractC22676k.m65749i(identifier, "it.identifier");
            double width = viewAnnotationPositionDescriptor.getWidth();
            double height = viewAnnotationPositionDescriptor.getHeight();
            ScreenCoordinate leftTopCoordinate = viewAnnotationPositionDescriptor.getLeftTopCoordinate();
            AbstractC22676k.m65749i(leftTopCoordinate, "it.leftTopCoordinate");
            Point anchorCoordinate = viewAnnotationPositionDescriptor.getAnchorCoordinate();
            AbstractC22676k.m65749i(anchorCoordinate, "it.anchorCoordinate");
            ViewAnnotationAnchorConfig anchorConfig = viewAnnotationPositionDescriptor.getAnchorConfig();
            AbstractC22676k.m65749i(anchorConfig, "it.anchorConfig");
            arrayList.add(new DelegatingViewAnnotationPositionDescriptor(identifier, width, height, leftTopCoordinate, anchorCoordinate, anchorConfig));
        }
        onDelegatingViewAnnotationPositionsUpdate(arrayList);
    }
}
