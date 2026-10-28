package com.mapbox.common.location;

import android.os.Handler;
import android.os.Looper;
import c93.InterfaceC4339a;
import com.google.android.gms.tasks.Task;
import com.mapbox.common.MapboxCommonLogger;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "invoke", "()V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
public final class GoogleDeviceLocationProvider$getLastLocation$1$1 extends AbstractC22680m implements InterfaceC4339a {
    final /* synthetic */ GetLocationCallback $callback;
    final /* synthetic */ BaseDeviceLocationProvider.LocationCancelable $cancelable;
    final /* synthetic */ Task<android.location.Location> $it;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleDeviceLocationProvider$getLastLocation$1$1(Task<android.location.Location> task, BaseDeviceLocationProvider.LocationCancelable locationCancelable, GetLocationCallback getLocationCallback) {
        super(0);
        this.$it = task;
        this.$cancelable = locationCancelable;
        this.$callback = getLocationCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(BaseDeviceLocationProvider.LocationCancelable cancelable, GetLocationCallback callback, android.location.Location location) {
        AbstractC22676k.m65750j(cancelable, "$cancelable");
        AbstractC22676k.m65750j(callback, "$callback");
        cancelable.invokeIfNotCanceled(new GoogleDeviceLocationProvider$getLastLocation$1$1$1$1(callback, location));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(BaseDeviceLocationProvider.LocationCancelable cancelable, GetLocationCallback callback) {
        AbstractC22676k.m65750j(cancelable, "$cancelable");
        AbstractC22676k.m65750j(callback, "$callback");
        cancelable.invokeIfNotCanceled(new GoogleDeviceLocationProvider$getLastLocation$1$1$2$1(callback));
    }

    @Override // c93.InterfaceC4339a
    public /* bridge */ /* synthetic */ Object invoke() {
        m134068invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m134068invoke() {
        android.location.Location location;
        if (this.$it.isCanceled()) {
            MapboxCommonLogger.INSTANCE.logW$common_release("GoogleDeviceLocationProvider", "The operation to get last location from GoogleFusedLocationProvider was cancelled.");
        } else if (!this.$it.isSuccessful() || (location = (android.location.Location) this.$it.getResult()) == null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC5436e(0, this.$cancelable, this.$callback));
        } else {
            new Handler(Looper.getMainLooper()).post(new RunnableC5435d(this.$cancelable, this.$callback, location, 0));
        }
    }
}
