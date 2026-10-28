package com.mapbox.common.location;

import android.content.Context;
import android.location.LocationManager;
import c93.InterfaceC4339a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m65681d2 = {"<anonymous>", "Landroid/location/LocationManager;", "invoke"}, m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class AndroidDeviceLocationProvider$locationManager$2 extends AbstractC22680m implements InterfaceC4339a {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDeviceLocationProvider$locationManager$2(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // c93.InterfaceC4339a
    public final LocationManager invoke() {
        Object systemService = this.$context.getSystemService("location");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        return (LocationManager) systemService;
    }
}
