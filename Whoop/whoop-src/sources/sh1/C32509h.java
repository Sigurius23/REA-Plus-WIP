package sh1;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import com.google.android.gms.common.api.C4975f;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import com.squareup.wire.AbstractC5583n;
import l83.C23454a0;
import p503tp.AbstractC34037h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: sh1.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0097@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0097@¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Lsh1/h;", "Lsh1/g;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/google/android/gms/location/LocationRequest;", "request", "Landroid/app/PendingIntent;", "pendingIntent", "Ll83/a0;", "a", "(Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;Lq83/d;)Ljava/lang/Object;", "b", "(Landroid/app/PendingIntent;Lq83/d;)Ljava/lang/Object;", "", "priority", "Landroid/location/Location;", "c", "(ILq83/d;)Ljava/lang/Object;", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "kotlin.jvm.PlatformType", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "delegate", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32509h implements InterfaceC32508g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FusedLocationProviderClient delegate;

    public C32509h(Context context) {
        AbstractC22676k.m65750j(context, "context");
        C4975f c4975f = AbstractC34037h.f142695a;
        this.delegate = new FusedLocationProviderClient(context);
    }

    @Override // sh1.InterfaceC32508g
    /* JADX INFO: renamed from: a */
    public Object mo101512a(LocationRequest locationRequest, PendingIntent pendingIntent, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Exception {
        Task<Void> taskRequestLocationUpdates = this.delegate.requestLocationUpdates(locationRequest, pendingIntent);
        AbstractC22676k.m65749i(taskRequestLocationUpdates, "requestLocationUpdates(...)");
        Object objM16789o = AbstractC5583n.m16789o(taskRequestLocationUpdates, interfaceC30057d);
        return objM16789o == EnumC31071a.f128113w ? objM16789o : C23454a0.f92919a;
    }

    @Override // sh1.InterfaceC32508g
    /* JADX INFO: renamed from: b */
    public Object mo101513b(PendingIntent pendingIntent, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Exception {
        Task<Void> taskRemoveLocationUpdates = this.delegate.removeLocationUpdates(pendingIntent);
        AbstractC22676k.m65749i(taskRemoveLocationUpdates, "removeLocationUpdates(...)");
        Object objM16789o = AbstractC5583n.m16789o(taskRemoveLocationUpdates, interfaceC30057d);
        return objM16789o == EnumC31071a.f128113w ? objM16789o : C23454a0.f92919a;
    }

    @Override // sh1.InterfaceC32508g
    /* JADX INFO: renamed from: c */
    public Object mo101514c(int i13, InterfaceC30057d<? super Location> interfaceC30057d) {
        Task<Location> currentLocation = this.delegate.getCurrentLocation(i13, null);
        AbstractC22676k.m65749i(currentLocation, "getCurrentLocation(...)");
        return AbstractC5583n.m16789o(currentLocation, interfaceC30057d);
    }
}
