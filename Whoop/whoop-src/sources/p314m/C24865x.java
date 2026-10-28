package p314m;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import gm.C15990r;
import java.util.Calendar;
import p027b3.AbstractC2351b;
import p479s4.AbstractC32131l;
import p715kotlin.time.DurationKt;

/* JADX INFO: renamed from: m.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C24865x extends AbstractC2351b {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f97396d = 0;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ LayoutInflaterFactory2C24829a0 f97397e;

    /* JADX INFO: renamed from: f */
    public final Object f97398f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24865x(LayoutInflaterFactory2C24829a0 layoutInflaterFactory2C24829a0, C15990r c15990r) {
        super(layoutInflaterFactory2C24829a0);
        this.f97397e = layoutInflaterFactory2C24829a0;
        this.f97398f = c15990r;
    }

    @Override // p027b3.AbstractC2351b
    /* JADX INFO: renamed from: B */
    public final void mo7243B() {
        switch (this.f97396d) {
            case 0:
                this.f97397e.m72806s(true, true);
                break;
            default:
                this.f97397e.m72806s(true, true);
                break;
        }
    }

    /* JADX INFO: renamed from: L */
    public final int m72898L() {
        Location location;
        boolean z4;
        long j7;
        Location lastKnownLocation;
        switch (this.f97396d) {
            case 0:
                return AbstractC24861t.m72885a((PowerManager) this.f97398f) ? 2 : 1;
            default:
                C15990r c15990r = (C15990r) this.f97398f;
                C24849k0 c24849k0 = (C24849k0) c15990r.f60514z;
                LocationManager locationManager = (LocationManager) c15990r.f60513y;
                if (c24849k0.f97342b <= System.currentTimeMillis()) {
                    Context context = (Context) c15990r.f60512x;
                    Location lastKnownLocation2 = null;
                    if (AbstractC32131l.m100073e(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                            lastKnownLocation = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        } catch (Exception e5) {
                            Log.d("TwilightManager", "Failed to get last known location", e5);
                        }
                        location = lastKnownLocation;
                    } else {
                        location = null;
                    }
                    if (AbstractC32131l.m100073e(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e13) {
                            Log.d("TwilightManager", "Failed to get last known location", e13);
                        }
                    }
                    if (lastKnownLocation2 == null || location == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > location.getTime()) {
                        location = lastKnownLocation2;
                    }
                    z4 = false;
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (C24847j0.f97335d == null) {
                            C24847j0.f97335d = new C24847j0();
                        }
                        C24847j0 c24847j0 = C24847j0.f97335d;
                        c24847j0.m72854a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis - DurationKt.MILLIS_IN_DAY);
                        c24847j0.m72854a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis);
                        z4 = c24847j0.f97338c == 1;
                        long j13 = c24847j0.f97337b;
                        long j14 = c24847j0.f97336a;
                        c24847j0.m72854a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis + DurationKt.MILLIS_IN_DAY);
                        long j15 = c24847j0.f97337b;
                        if (j13 == -1 || j14 == -1) {
                            j7 = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j14) {
                                j13 = j15;
                            } else if (jCurrentTimeMillis > j13) {
                                j13 = j14;
                            }
                            j7 = j13 + 60000;
                        }
                        c24849k0.f97341a = z4;
                        c24849k0.f97342b = j7;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i13 = Calendar.getInstance().get(11);
                        if (i13 < 6 || i13 >= 22) {
                            z4 = true;
                        }
                    }
                    break;
                } else {
                    z4 = c24849k0.f97341a;
                }
                return z4 ? 2 : 1;
        }
    }

    @Override // p027b3.AbstractC2351b
    /* JADX INFO: renamed from: i */
    public final IntentFilter mo7256i() {
        switch (this.f97396d) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24865x(LayoutInflaterFactory2C24829a0 layoutInflaterFactory2C24829a0, Context context) {
        super(layoutInflaterFactory2C24829a0);
        this.f97397e = layoutInflaterFactory2C24829a0;
        this.f97398f = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
