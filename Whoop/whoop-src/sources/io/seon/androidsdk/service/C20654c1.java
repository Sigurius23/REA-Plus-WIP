package io.seon.androidsdk.service;

import ai.C0904j;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.seon.androidsdk.exception.BehaviouralMonitoringException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p002a0.C0028i;

/* JADX INFO: renamed from: io.seon.androidsdk.service.c1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20654c1 {

    /* JADX INFO: renamed from: a */
    public final SensorManager f77250a;

    /* JADX INFO: renamed from: b */
    public final Sensor f77251b;

    /* JADX INFO: renamed from: c */
    public final Sensor f77252c;

    /* JADX INFO: renamed from: d */
    public final Sensor f77253d;

    /* JADX INFO: renamed from: e */
    public final Sensor f77254e;

    /* JADX INFO: renamed from: f */
    public final Sensor f77255f;

    /* JADX INFO: renamed from: h */
    public long f77257h;

    /* JADX INFO: renamed from: i */
    public long f77258i;

    /* JADX INFO: renamed from: j */
    public C20658e f77259j;

    /* JADX INFO: renamed from: k */
    public C20658e f77260k;

    /* JADX INFO: renamed from: l */
    public C20658e f77261l;

    /* JADX INFO: renamed from: m */
    public C20683n0 f77262m;

    /* JADX INFO: renamed from: n */
    public C20658e f77263n;

    /* JADX INFO: renamed from: g */
    public boolean f77256g = false;

    /* JADX INFO: renamed from: o */
    public final C20705y0 f77264o = new C20705y0(this);

    public C20654c1(Context context) {
        AtomicInteger atomicInteger = AbstractC20684o.f77414a;
        try {
            this.f77250a = (SensorManager) context.getApplicationContext().getSystemService("sensor");
        } catch (Throwable unused) {
        }
        try {
            this.f77251b = this.f77250a.getDefaultSensor(1);
        } catch (Throwable unused2) {
        }
        try {
            this.f77252c = this.f77250a.getDefaultSensor(4);
        } catch (Throwable unused3) {
        }
        try {
            this.f77253d = this.f77250a.getDefaultSensor(5);
        } catch (Throwable unused4) {
        }
        try {
            this.f77254e = this.f77250a.getDefaultSensor(8);
        } catch (Throwable unused5) {
        }
        try {
            this.f77255f = this.f77250a.getDefaultSensor(2);
        } catch (Throwable unused6) {
        }
        try {
            m56782b();
        } catch (Throwable unused7) {
        }
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [io.seon.androidsdk.service.b1] */
    /* JADX WARN: Type inference failed for: r7v4, types: [io.seon.androidsdk.service.b1] */
    /* JADX INFO: renamed from: a */
    public final HashMap m56781a() {
        final int i13;
        Object objMo56800a;
        Object objMo56800a2;
        Object objM56779a;
        Object objM56779a2;
        HashMap map = new HashMap();
        try {
            C20667h c20667hM56790i = this.f77261l.m56790i();
            C20683n0 c20683n0 = this.f77262m;
            int iMin = Math.min(c20683n0.f77288d, 20);
            float[][] fArr = new float[iMin][];
            final int i14 = 0;
            int i15 = 0;
            while (true) {
                i13 = 1;
                if (i15 >= iMin) {
                    break;
                }
                int i16 = (c20683n0.f77287c - 1) - i15;
                int i17 = c20683n0.f77289e;
                float[] fArr2 = ((float[][]) c20683n0.f77291g)[(i16 + i17) % i17];
                fArr[i15] = Arrays.copyOf(fArr2, fArr2.length);
                i15++;
            }
            C0904j c0904j = new C0904j(fArr, c20683n0.f77288d);
            final C0028i c0028iM56788g = this.f77259j.m56788g();
            final C0028i c0028iM56788g2 = this.f77260k.m56788g();
            C20667h c20667hM56789h = this.f77263n.m56789h();
            C20665g0 c20665g0 = new C20665g0(c20667hM56790i, 2);
            AtomicInteger atomicInteger = AbstractC20684o.f77414a;
            Object objMo56800a3 = null;
            try {
                objMo56800a = c20665g0.mo56800a();
            } catch (Throwable unused) {
                objMo56800a = null;
            }
            map.put("light", objMo56800a);
            try {
                objMo56800a2 = new C20665g0(c0904j, 3).mo56800a();
            } catch (Throwable unused2) {
                objMo56800a2 = null;
            }
            map.put("prox", objMo56800a2);
            try {
                objM56779a = new Object() { // from class: io.seon.androidsdk.service.b1
                    /* JADX INFO: renamed from: a */
                    public final Object m56779a() {
                        switch (i14) {
                            case 0:
                                C0028i c0028i = c0028iM56788g;
                                c0028i.getClass();
                                HashMap map2 = new HashMap();
                                map2.put("topDiffs", (ArrayList) c0028i.f73e);
                                map2.put("bc", Integer.valueOf(c0028i.f70b));
                                map2.put("sc", Integer.valueOf(c0028i.f71c));
                                map2.put("sample", Integer.valueOf(c0028i.f72d));
                                return map2;
                            default:
                                C0028i c0028i2 = c0028iM56788g;
                                c0028i2.getClass();
                                HashMap map3 = new HashMap();
                                map3.put("topDiffs", (ArrayList) c0028i2.f73e);
                                map3.put("bc", Integer.valueOf(c0028i2.f70b));
                                map3.put("sc", Integer.valueOf(c0028i2.f71c));
                                map3.put("sample", Integer.valueOf(c0028i2.f72d));
                                return map3;
                        }
                    }
                }.m56779a();
            } catch (Throwable unused3) {
                objM56779a = null;
            }
            map.put("acc", objM56779a);
            try {
                objM56779a2 = new Object() { // from class: io.seon.androidsdk.service.b1
                    /* JADX INFO: renamed from: a */
                    public final Object m56779a() {
                        switch (i13) {
                            case 0:
                                C0028i c0028i = c0028iM56788g2;
                                c0028i.getClass();
                                HashMap map2 = new HashMap();
                                map2.put("topDiffs", (ArrayList) c0028i.f73e);
                                map2.put("bc", Integer.valueOf(c0028i.f70b));
                                map2.put("sc", Integer.valueOf(c0028i.f71c));
                                map2.put("sample", Integer.valueOf(c0028i.f72d));
                                return map2;
                            default:
                                C0028i c0028i2 = c0028iM56788g2;
                                c0028i2.getClass();
                                HashMap map3 = new HashMap();
                                map3.put("topDiffs", (ArrayList) c0028i2.f73e);
                                map3.put("bc", Integer.valueOf(c0028i2.f70b));
                                map3.put("sc", Integer.valueOf(c0028i2.f71c));
                                map3.put("sample", Integer.valueOf(c0028i2.f72d));
                                return map3;
                        }
                    }
                }.m56779a();
            } catch (Throwable unused4) {
                objM56779a2 = null;
            }
            map.put("gyro", objM56779a2);
            try {
                objMo56800a3 = new C20665g0(c20667hM56789h, 4).mo56800a();
            } catch (Throwable unused5) {
            }
            map.put("mag", objMo56800a3);
            map.put(AttachmentExtensionsKt.EXTRA_DURATION, Long.valueOf(this.f77258i - this.f77257h));
        } catch (Exception e5) {
            map.put("error", e5.getClass().getSimpleName());
            AbstractC20684o.m56853f("bhvr", e5);
        }
        return map;
    }

    /* JADX INFO: renamed from: b */
    public final void m56782b() {
        this.f77259j = new C20658e();
        this.f77260k = new C20658e();
        this.f77261l = new C20658e(1000, 1, 2);
        this.f77262m = new C20683n0();
        this.f77263n = new C20658e(1000, 1, 0);
        this.f77257h = -1L;
        this.f77258i = -2L;
    }

    /* JADX INFO: renamed from: c */
    public final void m56783c() {
        try {
            if (this.f77256g) {
                return;
            }
            m56782b();
            this.f77256g = true;
            this.f77257h = System.currentTimeMillis();
            final int i13 = 0;
            try {
                new Runnable(this) { // from class: io.seon.androidsdk.service.a1

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ C20654c1 f77230x;

                    {
                        this.f77230x = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                C20654c1 c20654c1 = this.f77230x;
                                c20654c1.f77250a.registerListener(c20654c1.f77264o, c20654c1.f77251b, 3);
                                break;
                            case 1:
                                C20654c1 c20654c2 = this.f77230x;
                                c20654c2.f77250a.registerListener(c20654c2.f77264o, c20654c2.f77252c, 3);
                                break;
                            case 2:
                                C20654c1 c20654c3 = this.f77230x;
                                c20654c3.f77250a.registerListener(c20654c3.f77264o, c20654c3.f77254e, 3);
                                break;
                            case 3:
                                C20654c1 c20654c4 = this.f77230x;
                                c20654c4.f77250a.registerListener(c20654c4.f77264o, c20654c4.f77253d, 3);
                                break;
                            default:
                                C20654c1 c20654c5 = this.f77230x;
                                c20654c5.f77250a.registerListener(c20654c5.f77264o, c20654c5.f77255f, 3);
                                break;
                        }
                    }
                }.run();
            } catch (Throwable unused) {
            }
            final int i14 = 1;
            try {
                new Runnable(this) { // from class: io.seon.androidsdk.service.a1

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ C20654c1 f77230x;

                    {
                        this.f77230x = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                C20654c1 c20654c1 = this.f77230x;
                                c20654c1.f77250a.registerListener(c20654c1.f77264o, c20654c1.f77251b, 3);
                                break;
                            case 1:
                                C20654c1 c20654c2 = this.f77230x;
                                c20654c2.f77250a.registerListener(c20654c2.f77264o, c20654c2.f77252c, 3);
                                break;
                            case 2:
                                C20654c1 c20654c3 = this.f77230x;
                                c20654c3.f77250a.registerListener(c20654c3.f77264o, c20654c3.f77254e, 3);
                                break;
                            case 3:
                                C20654c1 c20654c4 = this.f77230x;
                                c20654c4.f77250a.registerListener(c20654c4.f77264o, c20654c4.f77253d, 3);
                                break;
                            default:
                                C20654c1 c20654c5 = this.f77230x;
                                c20654c5.f77250a.registerListener(c20654c5.f77264o, c20654c5.f77255f, 3);
                                break;
                        }
                    }
                }.run();
            } catch (Throwable unused2) {
            }
            final int i15 = 2;
            try {
                new Runnable(this) { // from class: io.seon.androidsdk.service.a1

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ C20654c1 f77230x;

                    {
                        this.f77230x = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i15) {
                            case 0:
                                C20654c1 c20654c1 = this.f77230x;
                                c20654c1.f77250a.registerListener(c20654c1.f77264o, c20654c1.f77251b, 3);
                                break;
                            case 1:
                                C20654c1 c20654c2 = this.f77230x;
                                c20654c2.f77250a.registerListener(c20654c2.f77264o, c20654c2.f77252c, 3);
                                break;
                            case 2:
                                C20654c1 c20654c3 = this.f77230x;
                                c20654c3.f77250a.registerListener(c20654c3.f77264o, c20654c3.f77254e, 3);
                                break;
                            case 3:
                                C20654c1 c20654c4 = this.f77230x;
                                c20654c4.f77250a.registerListener(c20654c4.f77264o, c20654c4.f77253d, 3);
                                break;
                            default:
                                C20654c1 c20654c5 = this.f77230x;
                                c20654c5.f77250a.registerListener(c20654c5.f77264o, c20654c5.f77255f, 3);
                                break;
                        }
                    }
                }.run();
            } catch (Throwable unused3) {
            }
            final int i16 = 3;
            try {
                new Runnable(this) { // from class: io.seon.androidsdk.service.a1

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ C20654c1 f77230x;

                    {
                        this.f77230x = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i16) {
                            case 0:
                                C20654c1 c20654c1 = this.f77230x;
                                c20654c1.f77250a.registerListener(c20654c1.f77264o, c20654c1.f77251b, 3);
                                break;
                            case 1:
                                C20654c1 c20654c2 = this.f77230x;
                                c20654c2.f77250a.registerListener(c20654c2.f77264o, c20654c2.f77252c, 3);
                                break;
                            case 2:
                                C20654c1 c20654c3 = this.f77230x;
                                c20654c3.f77250a.registerListener(c20654c3.f77264o, c20654c3.f77254e, 3);
                                break;
                            case 3:
                                C20654c1 c20654c4 = this.f77230x;
                                c20654c4.f77250a.registerListener(c20654c4.f77264o, c20654c4.f77253d, 3);
                                break;
                            default:
                                C20654c1 c20654c5 = this.f77230x;
                                c20654c5.f77250a.registerListener(c20654c5.f77264o, c20654c5.f77255f, 3);
                                break;
                        }
                    }
                }.run();
            } catch (Throwable unused4) {
            }
            final int i17 = 4;
            new Runnable(this) { // from class: io.seon.androidsdk.service.a1

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ C20654c1 f77230x;

                {
                    this.f77230x = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i17) {
                        case 0:
                            C20654c1 c20654c1 = this.f77230x;
                            c20654c1.f77250a.registerListener(c20654c1.f77264o, c20654c1.f77251b, 3);
                            break;
                        case 1:
                            C20654c1 c20654c2 = this.f77230x;
                            c20654c2.f77250a.registerListener(c20654c2.f77264o, c20654c2.f77252c, 3);
                            break;
                        case 2:
                            C20654c1 c20654c3 = this.f77230x;
                            c20654c3.f77250a.registerListener(c20654c3.f77264o, c20654c3.f77254e, 3);
                            break;
                        case 3:
                            C20654c1 c20654c4 = this.f77230x;
                            c20654c4.f77250a.registerListener(c20654c4.f77264o, c20654c4.f77253d, 3);
                            break;
                        default:
                            C20654c1 c20654c5 = this.f77230x;
                            c20654c5.f77250a.registerListener(c20654c5.f77264o, c20654c5.f77255f, 3);
                            break;
                    }
                }
            }.run();
        } catch (Throwable unused5) {
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m56784d() {
        try {
            if (!this.f77256g) {
                throw new BehaviouralMonitoringException("You have to start monitoring before collecting the results!");
            }
            this.f77256g = false;
            this.f77258i = System.currentTimeMillis();
            this.f77250a.unregisterListener(this.f77264o);
        } catch (BehaviouralMonitoringException e5) {
            throw e5;
        } catch (Exception unused) {
        }
    }
}
