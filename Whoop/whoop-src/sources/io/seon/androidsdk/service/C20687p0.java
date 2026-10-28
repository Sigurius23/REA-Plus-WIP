package io.seon.androidsdk.service;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.GnssCapabilities;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.core.app.NotificationCompat;
import ih0.AbstractC18489d0;
import io.sentry.android.core.RunnableC20151r0;
import io.sentry.hints.C20363j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import live.hms.video.error.ErrorCodes;
import live.hms.video.utils.HMSConstantsKt;
import p037bu.C3632c;

/* JADX INFO: renamed from: io.seon.androidsdk.service.p0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20687p0 extends AbstractC20664g implements LocationListener {

    /* JADX INFO: renamed from: p */
    public static final String[] f77421p = {"latitude", "longitude", "accuracy", "is_cached", NotificationCompat.CATEGORY_STATUS, "is_simulated", "mock_location_apps", "timestamp"};

    /* JADX INFO: renamed from: q */
    public static final Map f77422q;

    /* JADX INFO: renamed from: e */
    public final ArrayList f77423e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public C20363j f77424f;

    /* JADX INFO: renamed from: g */
    public Context f77425g;

    /* JADX INFO: renamed from: h */
    public LocationManager f77426h;

    /* JADX INFO: renamed from: i */
    public PackageManager f77427i;

    /* JADX INFO: renamed from: j */
    public CountDownLatch f77428j;

    /* JADX INFO: renamed from: k */
    public boolean f77429k;

    /* JADX INFO: renamed from: l */
    public Location f77430l;

    /* JADX INFO: renamed from: m */
    public Location f77431m;

    /* JADX INFO: renamed from: n */
    public GeolocationProbe$LocationStatus f77432n;

    /* JADX INFO: renamed from: o */
    public boolean f77433o;

    static {
        HashMap map = new HashMap();
        AbstractC18489d0.m53383x(1, map, "network", 2, "fused");
        map.put("gps", 3);
        f77422q = Collections.unmodifiableMap(map);
    }

    @Override // io.seon.androidsdk.service.InterfaceC20670i
    /* JADX INFO: renamed from: a */
    public final Map mo56774a() {
        return null;
    }

    @Override // io.seon.androidsdk.service.InterfaceC20670i
    /* JADX INFO: renamed from: b */
    public final Map mo56775b() {
        HashMap mapM56869k;
        String gnssHardwareModelName;
        Integer numValueOf;
        HashMap map = new HashMap();
        map.put("experimental_device_location", AbstractC20664g.m56801d(new C20665g0(this, 1)));
        try {
            mapM56869k = m56869k();
        } catch (Exception e5) {
            AbstractC20664g.f77301d.m11163L(3, e5);
            mapM56869k = null;
        } catch (Throwable unused) {
            mapM56869k = null;
        }
        map.put("gnss_capabilities", mapM56869k);
        try {
            gnssHardwareModelName = this.f77426h.getGnssHardwareModelName();
        } catch (Exception e13) {
            AbstractC20664g.f77301d.m11163L(3, e13);
            gnssHardwareModelName = null;
        } catch (Throwable unused2) {
            gnssHardwareModelName = null;
        }
        map.put("gnss_hardware_model_name", gnssHardwareModelName);
        try {
            numValueOf = Integer.valueOf(this.f77426h.getGnssYearOfHardware());
        } catch (Exception e14) {
            AbstractC20664g.f77301d.m11163L(3, e14);
            numValueOf = null;
        } catch (Throwable unused3) {
            numValueOf = null;
        }
        map.put("gnss_year_of_hardware", numValueOf);
        GeolocationProbe$LocationStatus geolocationProbe$LocationStatus = this.f77432n;
        if (geolocationProbe$LocationStatus != GeolocationProbe$LocationStatus.SUCCESS && geolocationProbe$LocationStatus != GeolocationProbe$LocationStatus.NO_SUPPORT) {
            this.f77431m = null;
            this.f77432n = GeolocationProbe$LocationStatus.UNKNOWN;
        }
        this.f77433o = false;
        if (!m56864f()) {
            return map;
        }
        this.f77424f.getClass();
        RunnableC20685o0 runnableC20685o0 = new RunnableC20685o0(this, 0);
        AtomicInteger atomicInteger = AbstractC20684o.f77414a;
        synchronized (AbstractC20684o.class) {
            AbstractC20684o.m56859l(runnableC20685o0);
        }
        RunnableC20685o0 runnableC20685o1 = new RunnableC20685o0(this, 1);
        synchronized (AbstractC20684o.class) {
            AbstractC20684o.m56859l(runnableC20685o1);
        }
        return map;
    }

    @Override // io.seon.androidsdk.service.InterfaceC20670i
    /* JADX INFO: renamed from: c */
    public final void mo56776c(C20663f1 c20663f1) {
        try {
            Context context = c20663f1.f77299a;
            this.f77303b = c20663f1;
            this.f77425g = context;
            this.f77426h = (LocationManager) context.getSystemService("location");
            this.f77427i = context.getPackageManager();
            Location location = new Location(HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY);
            this.f77430l = location;
            this.f77432n = GeolocationProbe$LocationStatus.UNKNOWN;
            if (this.f77426h != null && this.f77427i != null) {
                if (!m56864f()) {
                    if (this.f77432n == GeolocationProbe$LocationStatus.NO_SUPPORT) {
                        this.f77431m = this.f77430l;
                        return;
                    }
                    return;
                }
                boolean z4 = this.f77429k;
                ArrayList arrayList = this.f77423e;
                if (z4 && this.f77426h.isProviderEnabled("gps")) {
                    arrayList.add("gps");
                }
                if (this.f77426h.isProviderEnabled("fused")) {
                    arrayList.add("fused");
                }
                if (this.f77426h.isProviderEnabled("network")) {
                    arrayList.add("network");
                }
                if (this.f77426h.isProviderEnabled("passive")) {
                    arrayList.add("passive");
                }
                this.f77424f.getClass();
                try {
                    this.f77424f.getClass();
                    m56865g();
                } catch (Exception unused) {
                    m56865g();
                }
                m56865g();
                return;
            }
            this.f77431m = location;
            this.f77432n = GeolocationProbe$LocationStatus.NO_SUPPORT;
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m56864f() {
        GeolocationProbe$LocationStatus geolocationProbe$LocationStatus;
        if (!this.f77427i.hasSystemFeature("android.hardware.location")) {
            geolocationProbe$LocationStatus = GeolocationProbe$LocationStatus.NO_SUPPORT;
        } else if (!this.f77426h.isLocationEnabled()) {
            geolocationProbe$LocationStatus = GeolocationProbe$LocationStatus.DISABLED;
        } else {
            if (AbstractC20684o.m56854g(this.f77425g, "android.permission.ACCESS_FINE_LOCATION") && this.f77427i.hasSystemFeature("android.hardware.location.gps")) {
                this.f77429k = true;
                return true;
            }
            if (AbstractC20684o.m56854g(this.f77425g, "android.permission.ACCESS_COARSE_LOCATION")) {
                this.f77429k = false;
                return true;
            }
            geolocationProbe$LocationStatus = GeolocationProbe$LocationStatus.NO_PERMISSION;
        }
        this.f77432n = geolocationProbe$LocationStatus;
        this.f77429k = false;
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m56865g() {
        try {
            if (this.f77426h.isProviderEnabled("passive")) {
                this.f77426h.requestLocationUpdates("passive", m56866h("passive"), 0.0f, this);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: h */
    public final long m56866h(String str) {
        this.f77424f.getClass();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f77424f.getClass();
        long millis = timeUnit.toMillis(600);
        return Math.max(millis / 2, Math.max(millis - timeUnit.toMillis(Objects.equals(str, "gps") ? 30L : 10L), 100L));
    }

    /* JADX INFO: renamed from: i */
    public final void m56867i(C20363j c20363j) {
        if (c20363j == null) {
            c20363j = new C20363j(27);
        }
        this.f77424f = c20363j;
        if (this.f77426h == null || this.f77427i == null) {
            return;
        }
        m56864f();
        this.f77424f.getClass();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m56868j(Location location) {
        if (location != null) {
            double seconds = TimeUnit.NANOSECONDS.toSeconds(SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos());
            this.f77424f.getClass();
            if (seconds <= Math.max(600, 0.01d)) {
                if (Build.VERSION.SDK_INT < 33) {
                    return (location.getProvider() == null || !location.hasAccuracy() || location.getTime() == 0 || location.getElapsedRealtimeNanos() == 0) ? false : true;
                }
                return location.isComplete();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final HashMap m56869k() {
        boolean zHasAntennaInfo;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        Boolean boolValueOf4;
        Boolean boolValueOf5;
        Boolean boolValueOf6;
        Boolean boolValueOf7;
        Boolean boolValueOf8;
        Boolean boolValueOf9;
        int i13 = Build.VERSION.SDK_INT;
        Boolean boolValueOf10 = null;
        if (i13 < 30) {
            return null;
        }
        GnssCapabilities gnssCapabilities = this.f77426h.getGnssCapabilities();
        String string = gnssCapabilities.toString();
        HashMap map = new HashMap();
        C3632c c3632c = AbstractC20664g.f77301d;
        if (i13 >= 31) {
            try {
                zHasAntennaInfo = gnssCapabilities.hasAntennaInfo();
            } catch (Exception e5) {
                c3632c.m11163L(3, e5);
                boolValueOf = null;
            } catch (Throwable unused) {
                boolValueOf = null;
            }
        } else {
            zHasAntennaInfo = false;
        }
        boolValueOf = Boolean.valueOf(zHasAntennaInfo);
        map.put("has_antenna_info", boolValueOf);
        try {
            boolValueOf2 = Boolean.valueOf(Build.VERSION.SDK_INT >= 31 ? gnssCapabilities.hasMeasurements() : false);
        } catch (Exception e13) {
            c3632c.m11163L(3, e13);
            boolValueOf2 = null;
        } catch (Throwable unused2) {
            boolValueOf2 = null;
        }
        map.put("has_measurements", boolValueOf2);
        try {
            boolValueOf3 = Boolean.valueOf(Build.VERSION.SDK_INT >= 31 ? gnssCapabilities.hasNavigationMessages() : false);
        } catch (Exception e14) {
            c3632c.m11163L(3, e14);
            boolValueOf3 = null;
        } catch (Throwable unused3) {
            boolValueOf3 = null;
        }
        map.put("has_navigation_messages", boolValueOf3);
        try {
            boolValueOf4 = Boolean.valueOf(string.contains("SCHEDULING"));
        } catch (Exception e15) {
            c3632c.m11163L(3, e15);
            boolValueOf4 = null;
        } catch (Throwable unused4) {
            boolValueOf4 = null;
        }
        map.put("has_scheduling", boolValueOf4);
        try {
            boolValueOf5 = Boolean.valueOf(string.contains("TOTAL_POWER"));
        } catch (Exception e16) {
            c3632c.m11163L(3, e16);
            boolValueOf5 = null;
        } catch (Throwable unused5) {
            boolValueOf5 = null;
        }
        map.put("has_power_total", boolValueOf5);
        try {
            boolValueOf6 = Boolean.valueOf(string.contains("SINGLEBAND_TRACKING_POWER"));
        } catch (Exception e17) {
            c3632c.m11163L(3, e17);
            boolValueOf6 = null;
        } catch (Throwable unused6) {
            boolValueOf6 = null;
        }
        map.put("has_power_singleband_tracking", boolValueOf6);
        try {
            boolValueOf7 = Boolean.valueOf(string.contains("MULTIBAND_TRACKING_POWER"));
        } catch (Exception e18) {
            c3632c.m11163L(3, e18);
            boolValueOf7 = null;
        } catch (Throwable unused7) {
            boolValueOf7 = null;
        }
        map.put("has_power_multiband_tracking", boolValueOf7);
        try {
            boolValueOf8 = Boolean.valueOf(string.contains("SINGLEBAND_ACQUISITION_POWER"));
        } catch (Exception e19) {
            c3632c.m11163L(3, e19);
            boolValueOf8 = null;
        } catch (Throwable unused8) {
            boolValueOf8 = null;
        }
        map.put("has_power_singleband_acquisition", boolValueOf8);
        try {
            boolValueOf9 = Boolean.valueOf(string.contains("MULTIBAND_ACQUISITION_POWER"));
        } catch (Exception e22) {
            c3632c.m11163L(3, e22);
            boolValueOf9 = null;
        } catch (Throwable unused9) {
            boolValueOf9 = null;
        }
        map.put("has_power_multiband_acquisition", boolValueOf9);
        try {
            boolValueOf10 = Boolean.valueOf(string.contains("OTHER_MODES_POWER"));
        } catch (Exception e24) {
            c3632c.m11163L(3, e24);
        } catch (Throwable unused10) {
        }
        map.put("has_power_other_modes", boolValueOf10);
        return map;
    }

    /* JADX INFO: renamed from: l */
    public final Location m56870l() {
        Location location = this.f77431m;
        if (location == this.f77430l) {
            return location;
        }
        if (m56868j(location)) {
            TimeUnit.NANOSECONDS.toSeconds(SystemClock.elapsedRealtimeNanos() - this.f77431m.getElapsedRealtimeNanos());
            return this.f77431m;
        }
        GeolocationProbe$LocationStatus geolocationProbe$LocationStatus = this.f77432n;
        this.f77432n = GeolocationProbe$LocationStatus.UNKNOWN;
        if (!m56864f()) {
            Location location2 = this.f77430l;
            this.f77431m = location2;
            return location2;
        }
        if (geolocationProbe$LocationStatus == GeolocationProbe$LocationStatus.DISABLED || geolocationProbe$LocationStatus == GeolocationProbe$LocationStatus.NO_PERMISSION) {
            if (!this.f77423e.contains("gps") && this.f77429k && this.f77426h.isProviderEnabled("gps")) {
                this.f77423e.add("gps");
            }
            if (!this.f77423e.contains("fused") && this.f77426h.isProviderEnabled("fused")) {
                this.f77423e.add("fused");
            }
            if (!this.f77423e.contains("network") && this.f77426h.isProviderEnabled("network")) {
                this.f77423e.add("network");
            }
        }
        if (this.f77423e.size() == 0) {
            this.f77432n = GeolocationProbe$LocationStatus.NO_PROVIDER;
            Location location3 = this.f77430l;
            this.f77431m = location3;
            return location3;
        }
        Iterator it = this.f77423e.iterator();
        while (it.hasNext()) {
            Location lastKnownLocation = this.f77426h.getLastKnownLocation((String) it.next());
            if (!m56868j(lastKnownLocation)) {
                lastKnownLocation = null;
            }
            if (lastKnownLocation != null) {
                this.f77432n = GeolocationProbe$LocationStatus.SUCCESS;
                this.f77431m = lastKnownLocation;
                return lastKnownLocation;
            }
        }
        ArrayList arrayList = this.f77423e;
        this.f77428j = new CountDownLatch(1);
        RunnableC20151r0 runnableC20151r0 = new RunnableC20151r0(7, this, arrayList);
        synchronized (AbstractC20684o.class) {
            AbstractC20684o.m56859l(runnableC20151r0);
        }
        try {
            CountDownLatch countDownLatch = this.f77428j;
            this.f77424f.getClass();
            if (countDownLatch.await(ErrorCodes.TracksErrors.cGenericTrack, TimeUnit.MILLISECONDS)) {
                return this.f77431m;
            }
            this.f77424f.getClass();
            this.f77432n = GeolocationProbe$LocationStatus.TIMEOUT;
            this.f77431m = this.f77430l;
        } catch (Exception unused) {
            this.f77424f.getClass();
            this.f77432n = GeolocationProbe$LocationStatus.FAIL;
            this.f77431m = this.f77430l;
        }
        if (this.f77432n == GeolocationProbe$LocationStatus.UNKNOWN) {
            this.f77432n = GeolocationProbe$LocationStatus.FAIL;
        }
        if (this.f77431m == null) {
            this.f77431m = this.f77430l;
        }
        return this.f77431m;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        if (m56868j(location)) {
            if (m56868j(this.f77431m)) {
                String provider = location.getProvider();
                Map map = f77422q;
                Integer num = (Integer) map.get(provider);
                Integer num2 = (Integer) map.get(this.f77431m.getProvider());
                if (num2 == null || (num != null && ((num.equals(num2) && location.getAccuracy() < this.f77431m.getAccuracy()) || num.intValue() > num2.intValue()))) {
                    this.f77431m = location;
                    this.f77432n = GeolocationProbe$LocationStatus.SUCCESS;
                }
            } else {
                this.f77431m = location;
                this.f77432n = GeolocationProbe$LocationStatus.SUCCESS;
            }
            CountDownLatch countDownLatch = this.f77428j;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            if (this.f77433o) {
                this.f77424f.getClass();
                this.f77433o = false;
            }
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        boolean zM56864f = m56864f();
        boolean zEquals = str.equals("gps");
        ArrayList arrayList = this.f77423e;
        if (!zEquals && !this.f77429k) {
            arrayList.remove("gps");
        }
        arrayList.remove(str);
        if (zM56864f) {
            arrayList.size();
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
        boolean zM56864f = m56864f();
        if (!str.equals("gps") || this.f77429k) {
            this.f77423e.add(str);
            if (zM56864f) {
                this.f77424f.getClass();
                RunnableC20685o0 runnableC20685o0 = new RunnableC20685o0(this, 0);
                AtomicInteger atomicInteger = AbstractC20684o.f77414a;
                synchronized (AbstractC20684o.class) {
                    AbstractC20684o.m56859l(runnableC20685o0);
                }
                RunnableC20685o0 runnableC20685o1 = new RunnableC20685o0(this, 1);
                synchronized (AbstractC20684o.class) {
                    AbstractC20684o.m56859l(runnableC20685o1);
                }
            }
        }
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i13, Bundle bundle) {
        if (i13 == 2) {
            onProviderEnabled(str);
        } else {
            onProviderDisabled(str);
        }
    }
}
