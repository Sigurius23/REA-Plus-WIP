package io.seon.androidsdk.service;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.database.Cursor;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.lifecycle.RunnableC1645z0;
import fo.C14657c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import live.hms.video.services.HMSScreenCaptureService;
import p037bu.C3632c;

/* JADX INFO: renamed from: io.seon.androidsdk.service.b0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20650b0 extends AbstractC20664g {

    /* JADX INFO: renamed from: m */
    public static final String[] f77231m = {"android_id", "build_device", "build_model", "build_hardware", "device_orientation", "free_storage", "has_proximity_sensor", "pasteboard_hash", HMSScreenCaptureService.SCREEN_HEIGHT, HMSScreenCaptureService.SCREEN_WIDTH, "screen_scale", "screen_brightness", "sensor_hash", "total_storage", "gsf_id", "is_tablet", "true_device_id_source"};

    /* JADX INFO: renamed from: n */
    public static final C3632c f77232n = new C3632c(C20650b0.class.getName());

    /* JADX INFO: renamed from: o */
    public static final C20691r0 f77233o = new C20691r0(30000);

    /* JADX INFO: renamed from: p */
    public static final C20691r0 f77234p = new C20691r0(30000);

    /* JADX INFO: renamed from: e */
    public SeonNT f77235e;

    /* JADX INFO: renamed from: f */
    public ClipboardManager f77236f;

    /* JADX INFO: renamed from: g */
    public Context f77237g;

    /* JADX INFO: renamed from: h */
    public SensorManager f77238h;

    /* JADX INFO: renamed from: i */
    public List f77239i;

    /* JADX INFO: renamed from: j */
    public int[] f77240j;

    /* JADX INFO: renamed from: k */
    public WindowManager f77241k;

    /* JADX INFO: renamed from: l */
    public C14657c f77242l;

    /* JADX INFO: renamed from: h */
    public static int[] m56772h() {
        int[] iArr = new int[27];
        iArr[0] = 1;
        iArr[1] = 2;
        iArr[2] = 4;
        iArr[3] = 5;
        iArr[4] = 6;
        iArr[5] = 8;
        iArr[6] = 9;
        iArr[7] = 10;
        iArr[8] = 11;
        iArr[9] = 12;
        iArr[10] = 13;
        iArr[11] = 14;
        iArr[12] = 15;
        iArr[13] = 16;
        iArr[14] = 17;
        iArr[15] = 18;
        iArr[16] = 19;
        iArr[17] = 20;
        int i13 = Build.VERSION.SDK_INT;
        iArr[18] = 21;
        iArr[19] = 28;
        iArr[20] = 29;
        iArr[21] = 30;
        iArr[22] = 31;
        iArr[23] = 65536;
        iArr[24] = 34;
        iArr[25] = 35;
        if (i13 >= 30) {
            iArr[26] = 36;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: i */
    public static long m56773i() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getBlockSizeLong() * statFs.getBlockCountLong();
        } catch (Exception e5) {
            AbstractC20684o.m56853f("TotSD", e5);
            return -1L;
        }
    }

    @Override // io.seon.androidsdk.service.InterfaceC20670i
    /* JADX INFO: renamed from: a */
    public final Map mo56774a() {
        String string;
        String str;
        String str2;
        String str3;
        long blockSizeLong;
        Long lValueOf;
        Boolean boolValueOf;
        Integer numValueOf;
        Integer numValueOf2;
        Float fValueOf;
        Boolean boolValueOf2;
        C3632c c3632c = AbstractC20664g.f77301d;
        HashMap map = new HashMap();
        String strM56770b = null;
        try {
            string = Settings.Secure.getString(this.f77237g.getContentResolver(), "android_id");
        } catch (Exception e5) {
            c3632c.m11163L(3, e5);
            string = null;
        } catch (Throwable unused) {
            string = null;
        }
        map.put("android_id", string);
        try {
            str = Build.DEVICE;
        } catch (Throwable unused2) {
            str = null;
        }
        map.put("build_device", str);
        try {
            str2 = Build.MODEL;
        } catch (Throwable unused3) {
            str2 = null;
        }
        map.put("build_model", str2);
        try {
            str3 = Build.HARDWARE;
        } catch (Throwable unused4) {
            str3 = null;
        }
        map.put("build_hardware", str3);
        final int i13 = 3;
        map.put("device_orientation", AbstractC20664g.m56801d(new InterfaceC20695t0(this) { // from class: io.seon.androidsdk.service.z

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C20650b0 f77520b;

            {
                this.f77520b = this;
            }

            /* JADX WARN: Code duplicated, block: B:24:0x004f  */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x00a6, code lost:
            
                if (r1 == null) goto L46;
             */
            @Override // io.seon.androidsdk.service.InterfaceC20695t0
            /* JADX INFO: renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object mo56800a() {
                /*
                    Method dump skipped, instruction units count: 554
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: io.seon.androidsdk.service.C20706z.mo56800a():java.lang.Object");
            }
        }));
        try {
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                blockSizeLong = statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
            } catch (Throwable unused5) {
                lValueOf = null;
            }
        } catch (Exception e13) {
            try {
                AbstractC20684o.m56853f("FreeSD", e13);
                blockSizeLong = -1;
            } catch (Exception e14) {
                c3632c.m11163L(3, e14);
                lValueOf = null;
            }
        }
        lValueOf = Long.valueOf(blockSizeLong);
        map.put("free_storage", lValueOf);
        boolean z4 = false;
        try {
            boolValueOf = Boolean.valueOf(this.f77237g.getPackageManager().hasSystemFeature("android.hardware.sensor.proximity") || this.f77238h.getDefaultSensor(8) != null);
        } catch (Exception e15) {
            c3632c.m11163L(3, e15);
            boolValueOf = null;
        } catch (Throwable unused6) {
            boolValueOf = null;
        }
        map.put("has_proximity_sensor", boolValueOf);
        final int i14 = 4;
        map.put("pasteboard_hash", AbstractC20664g.m56801d(new InterfaceC20695t0(this) { // from class: io.seon.androidsdk.service.z

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C20650b0 f77520b;

            {
                this.f77520b = this;
            }

            /* JADX WARN: Code duplicated, block: B:24:0x004f  */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x00a6, code lost:
            
                if (r1 == null) goto L46;
             */
            @Override // io.seon.androidsdk.service.InterfaceC20695t0
            /* JADX INFO: renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object mo56800a() {
                /*
                    Method dump skipped, instruction units count: 554
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: io.seon.androidsdk.service.C20706z.mo56800a():java.lang.Object");
            }
        }));
        try {
            numValueOf = Integer.valueOf(m56778g().f54094c);
        } catch (Exception e16) {
            c3632c.m11163L(3, e16);
            numValueOf = null;
        } catch (Throwable unused7) {
            numValueOf = null;
        }
        map.put(HMSScreenCaptureService.SCREEN_HEIGHT, numValueOf);
        try {
            numValueOf2 = Integer.valueOf(m56778g().f54092a);
        } catch (Exception e17) {
            c3632c.m11163L(3, e17);
            numValueOf2 = null;
        } catch (Throwable unused8) {
            numValueOf2 = null;
        }
        map.put(HMSScreenCaptureService.SCREEN_WIDTH, numValueOf2);
        try {
            fValueOf = Float.valueOf(m56778g().f54093b);
        } catch (Exception e18) {
            c3632c.m11163L(3, e18);
            fValueOf = null;
        } catch (Throwable unused9) {
            fValueOf = null;
        }
        map.put("screen_scale", fValueOf);
        final int i15 = 0;
        map.put("screen_brightness", AbstractC20664g.m56801d(new InterfaceC20695t0(this) { // from class: io.seon.androidsdk.service.z

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C20650b0 f77520b;

            {
                this.f77520b = this;
            }

            /* JADX WARN: Code duplicated, block: B:24:0x004f  */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x00a6, code lost:
            
                if (r1 == null) goto L46;
             */
            @Override // io.seon.androidsdk.service.InterfaceC20695t0
            /* JADX INFO: renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object mo56800a() {
                /*
                    Method dump skipped, instruction units count: 554
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: io.seon.androidsdk.service.C20706z.mo56800a():java.lang.Object");
            }
        }));
        final int i16 = 1;
        map.put("sensor_hash", AbstractC20664g.m56801d(new InterfaceC20695t0(this) { // from class: io.seon.androidsdk.service.z

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C20650b0 f77520b;

            {
                this.f77520b = this;
            }

            /* JADX WARN: Code duplicated, block: B:24:0x004f  */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x00a6, code lost:
            
                if (r1 == null) goto L46;
             */
            @Override // io.seon.androidsdk.service.InterfaceC20695t0
            /* JADX INFO: renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object mo56800a() {
                /*
                    Method dump skipped, instruction units count: 554
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: io.seon.androidsdk.service.C20706z.mo56800a():java.lang.Object");
            }
        }));
        map.put("total_storage", AbstractC20664g.m56801d(new C20680m(this, 1)));
        final int i17 = 2;
        map.put("gsf_id", AbstractC20664g.m56801d(new InterfaceC20695t0(this) { // from class: io.seon.androidsdk.service.z

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C20650b0 f77520b;

            {
                this.f77520b = this;
            }

            /* JADX WARN: Code duplicated, block: B:24:0x004f  */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x00a6, code lost:
            
                if (r1 == null) goto L46;
             */
            @Override // io.seon.androidsdk.service.InterfaceC20695t0
            /* JADX INFO: renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object mo56800a() {
                /*
                    Method dump skipped, instruction units count: 554
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: io.seon.androidsdk.service.C20706z.mo56800a():java.lang.Object");
            }
        }));
        try {
            try {
                if (((TelephonyManager) this.f77237g.getSystemService("phone")).getPhoneType() == 0) {
                    z4 = true;
                }
            } catch (Exception unused10) {
            }
            try {
                boolValueOf2 = Boolean.valueOf(z4);
            } catch (Exception e19) {
                c3632c.m11163L(3, e19);
                boolValueOf2 = null;
            }
        } catch (Throwable unused11) {
            boolValueOf2 = null;
            map.put("is_tablet", boolValueOf2);
            try {
                SeonNT seonNT = this.f77235e;
                seonNT.getClass();
                strM56770b = seonNT.m56770b();
            } catch (Throwable unused12) {
            }
            map.put("true_device_id_source", strM56770b);
            return map;
        }
        map.put("is_tablet", boolValueOf2);
        try {
            SeonNT seonNT2 = this.f77235e;
            seonNT2.getClass();
            strM56770b = seonNT2.m56770b();
        } catch (Exception e22) {
            c3632c.m11163L(3, e22);
        }
        map.put("true_device_id_source", strM56770b);
        return map;
    }

    @Override // io.seon.androidsdk.service.InterfaceC20670i
    /* JADX INFO: renamed from: b */
    public final Map mo56775b() {
        Integer numValueOf;
        C3632c c3632c = AbstractC20664g.f77301d;
        HashMap map = new HashMap();
        Boolean boolValueOf = null;
        try {
            SensorManager sensorManager = this.f77238h;
            int[] iArr = this.f77240j;
            int i13 = 0;
            if (sensorManager != null && iArr != null) {
                int i14 = 0;
                while (i13 < iArr.length) {
                    if (sensorManager.getDefaultSensor(iArr[i13]) != null) {
                        i14 |= 1 << i13;
                    }
                    i13++;
                }
                i13 = i14;
            }
            numValueOf = Integer.valueOf(i13);
        } catch (Exception e5) {
            c3632c.m11163L(3, e5);
            numValueOf = null;
        } catch (Throwable unused) {
            numValueOf = null;
        }
        map.put("sensors_bitmask", numValueOf);
        try {
            boolValueOf = Boolean.valueOf(SeonNT.f77224b);
        } catch (Exception e13) {
            c3632c.m11163L(3, e13);
        } catch (Throwable unused2) {
        }
        map.put("nt_cb", boolValueOf);
        return map;
    }

    @Override // io.seon.androidsdk.service.InterfaceC20670i
    /* JADX INFO: renamed from: c */
    public final void mo56776c(C20663f1 c20663f1) {
        try {
            this.f77237g = c20663f1.f77299a;
            this.f77303b = c20663f1;
            WindowManager windowManager = null;
            this.f77236f = null;
            C20691r0 c20691r0 = f77233o;
            c20691r0.f77447d.lock();
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (System.currentTimeMillis() - c20691r0.f77445b >= c20691r0.f77446c || c20691r0.f77445b == -1) {
                    c20691r0.f77444a = Long.valueOf(m56773i());
                    c20691r0.f77445b = jCurrentTimeMillis;
                }
            } catch (Throwable unused) {
            }
            c20691r0.f77447d.unlock();
            C20691r0 c20691r1 = f77234p;
            c20691r1.f77447d.lock();
            try {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (System.currentTimeMillis() - c20691r1.f77445b >= c20691r1.f77446c || c20691r1.f77445b == -1) {
                    c20691r1.f77444a = m56777f();
                    c20691r1.f77445b = jCurrentTimeMillis2;
                }
            } catch (Throwable unused2) {
            }
            c20691r1.f77447d.unlock();
            try {
                RunnableC1645z0 runnableC1645z0 = new RunnableC1645z0(this, 14);
                synchronized (AbstractC20684o.class) {
                    AbstractC20684o.m56859l(runnableC1645z0);
                }
            } catch (Exception unused3) {
            }
            this.f77238h = (SensorManager) this.f77237g.getSystemService("sensor");
            this.f77240j = m56772h();
            Context context = this.f77237g;
            try {
                AtomicInteger atomicInteger = AbstractC20684o.f77414a;
                if (!(context instanceof Activity) || ((Activity) context).getWindow().getDecorView().getRootView() == null) {
                    Activity activityM56858k = AbstractC20684o.m56858k();
                    if (activityM56858k != null) {
                        windowManager = activityM56858k.getWindowManager();
                    }
                } else {
                    windowManager = (WindowManager) context.getSystemService("window");
                }
            } catch (Exception unused4) {
            }
            this.f77241k = windowManager;
            try {
                this.f77235e = new SeonNT(this.f77237g);
            } catch (Throwable unused5) {
            }
        } catch (Exception e5) {
            f77232n.m11163L(3, e5);
        }
    }

    /* JADX INFO: renamed from: f */
    public final String m56777f() {
        try {
            Cursor cursorQuery = this.f77237g.getContentResolver().query(Uri.parse("content://com.google.android.gsf.gservices"), null, null, new String[]{"android_id"}, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst() && cursorQuery.getColumnCount() >= 2) {
                        try {
                            String hexString = Long.toHexString(Long.parseLong(cursorQuery.getString(1)));
                            cursorQuery.close();
                            return hexString;
                        } catch (NumberFormatException unused) {
                            cursorQuery.close();
                            return null;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        cursorQuery.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0046 A[Catch: Exception -> 0x0044, TRY_LEAVE, TryCatch #1 {Exception -> 0x0044, blocks: (B:14:0x0037, B:16:0x003b, B:19:0x0046), top: B:43:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0065 A[Catch: Exception -> 0x0063, TRY_LEAVE, TryCatch #2 {Exception -> 0x0063, blocks: (B:24:0x0055, B:26:0x0059, B:30:0x0065), top: B:45:0x0055 }] */
    /* JADX INFO: renamed from: g */
    public final C14657c m56778g() {
        int iWidth;
        int iHeight;
        float f13;
        C14657c c14657c = this.f77242l;
        if (c14657c != null) {
            return c14657c;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = this.f77241k;
        WindowMetrics maximumWindowMetrics = null;
        if (windowManager != null) {
            maximumWindowMetrics = Build.VERSION.SDK_INT >= 30 ? windowManager.getMaximumWindowMetrics() : null;
            this.f77241k.getDefaultDisplay().getRealMetrics(displayMetrics);
        } else {
            displayMetrics = this.f77237g.getResources().getDisplayMetrics();
        }
        C14657c c14657c2 = new C14657c();
        this.f77242l = c14657c2;
        int i13 = -1;
        if (maximumWindowMetrics != null) {
            try {
                if (Build.VERSION.SDK_INT >= 30) {
                    iWidth = maximumWindowMetrics.getBounds().width();
                } else {
                    iWidth = displayMetrics.widthPixels;
                }
            } catch (Exception e5) {
                AbstractC20684o.m56853f("SWidth", e5);
                iWidth = -1;
            }
        } else {
            iWidth = displayMetrics.widthPixels;
        }
        c14657c2.f54092a = iWidth;
        C14657c c14657c3 = this.f77242l;
        if (maximumWindowMetrics != null) {
            try {
                if (Build.VERSION.SDK_INT >= 30) {
                    iHeight = maximumWindowMetrics.getBounds().height();
                } else {
                    iHeight = displayMetrics.heightPixels;
                }
                i13 = iHeight;
            } catch (Exception e13) {
                AbstractC20684o.m56853f("SHeight", e13);
            }
        } else {
            iHeight = displayMetrics.heightPixels;
            i13 = iHeight;
        }
        c14657c3.f54094c = i13;
        C14657c c14657c4 = this.f77242l;
        try {
            f13 = displayMetrics.density;
        } catch (Exception e14) {
            AbstractC20684o.m56853f("SDens", e14);
            f13 = -1.0f;
        }
        c14657c4.f54093b = f13;
        return this.f77242l;
    }
}
