package p503tp;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import p073cq.C11040i;

/* JADX INFO: renamed from: tp.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C34046q extends AbstractC34036g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C11040i f142723a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FusedLocationProviderClient f142724b;

    public C34046q(FusedLocationProviderClient fusedLocationProviderClient, C11040i c11040i) {
        this.f142724b = fusedLocationProviderClient;
        this.f142723a = c11040i;
    }

    @Override // p503tp.AbstractC34036g
    public final void onLocationAvailability(LocationAvailability locationAvailability) {
    }

    @Override // p503tp.AbstractC34036g
    public final void onLocationResult(LocationResult locationResult) {
        this.f142723a.m29689d(locationResult.m15632b());
        this.f142724b.removeLocationUpdates(this);
    }
}
