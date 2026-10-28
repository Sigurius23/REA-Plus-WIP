package sh1;

import android.app.PendingIntent;
import android.location.Location;
import com.google.android.gms.location.LocationRequest;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: sh1.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH¦@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, m65681d2 = {"Lsh1/g;", "", "Lcom/google/android/gms/location/LocationRequest;", "request", "Landroid/app/PendingIntent;", "pendingIntent", "Ll83/a0;", "a", "(Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;Lq83/d;)Ljava/lang/Object;", "b", "(Landroid/app/PendingIntent;Lq83/d;)Ljava/lang/Object;", "", "priority", "Landroid/location/Location;", "c", "(ILq83/d;)Ljava/lang/Object;", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC32508g {
    /* JADX INFO: renamed from: a */
    Object mo101512a(LocationRequest locationRequest, PendingIntent pendingIntent, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: b */
    Object mo101513b(PendingIntent pendingIntent, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: c */
    Object mo101514c(int i13, InterfaceC30057d<? super Location> interfaceC30057d);
}
