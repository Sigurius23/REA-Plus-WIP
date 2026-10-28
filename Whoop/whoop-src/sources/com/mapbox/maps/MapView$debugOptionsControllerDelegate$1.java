package com.mapbox.maps;

import c93.InterfaceC4339a;
import com.mapbox.maps.debugoptions.DebugOptionsController;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m65681d2 = {"<anonymous>", "Lcom/mapbox/maps/debugoptions/DebugOptionsController;", "invoke"}, m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class MapView$debugOptionsControllerDelegate$1 extends AbstractC22680m implements InterfaceC4339a {
    final /* synthetic */ MapView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapView$debugOptionsControllerDelegate$1(MapView mapView) {
        super(0);
        this.this$0 = mapView;
    }

    @Override // c93.InterfaceC4339a
    public final DebugOptionsController invoke() {
        MapView mapView = this.this$0;
        return new DebugOptionsController(mapView, mapView.getMapController$maps_sdk_release().getMapboxMapDeprecated());
    }
}
