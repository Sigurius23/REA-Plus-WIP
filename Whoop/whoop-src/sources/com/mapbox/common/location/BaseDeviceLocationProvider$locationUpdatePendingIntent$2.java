package com.mapbox.common.location;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import c93.InterfaceC4339a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m65681d2 = {"<anonymous>", "Landroid/app/PendingIntent;", "kotlin.jvm.PlatformType", "invoke"}, m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class BaseDeviceLocationProvider$locationUpdatePendingIntent$2 extends AbstractC22680m implements InterfaceC4339a {
    final /* synthetic */ BaseDeviceLocationProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDeviceLocationProvider$locationUpdatePendingIntent$2(BaseDeviceLocationProvider baseDeviceLocationProvider) {
        super(0);
        this.this$0 = baseDeviceLocationProvider;
    }

    @Override // c93.InterfaceC4339a
    public final PendingIntent invoke() {
        Intent intent = new Intent(this.this$0.getContext(), (Class<?>) LocationUpdatesReceiver.class);
        intent.setAction(LocationUpdatesReceiver.ACTION_PROCESS_LOCATION_UPDATES);
        int i13 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        intent.putExtra(LocationUpdatesReceiver.LOCATION_PROVIDER_ID_KEY, this.this$0.getPersistentId());
        return PendingIntent.getBroadcast(this.this$0.getContext(), this.this$0.getPersistentId(), intent, i13);
    }
}
