package io.seon.androidsdk.service;

import android.hardware.biometrics.BiometricManager;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: io.seon.androidsdk.service.m */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C20680m implements InterfaceC20695t0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f77375a;

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ BiometricManager m56840b(Object obj) {
        return (BiometricManager) obj;
    }

    @Override // io.seon.androidsdk.service.InterfaceC20695t0
    /* JADX INFO: renamed from: a */
    public Object mo56800a() {
        long jM56881h;
        boolean z4 = false;
        int iIntValue = 0;
        z4 = false;
        long j7 = -1;
        switch (this.f77375a) {
            case 0:
                C20691r0 c20691r0 = C20682n.f77406n;
                c20691r0.f77447d.lock();
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (System.currentTimeMillis() - c20691r0.f77445b >= c20691r0.f77446c || c20691r0.f77445b == -1) {
                        c20691r0.f77444a = C20682n.m56843h();
                        c20691r0.f77445b = jCurrentTimeMillis;
                    }
                    break;
                } catch (Throwable unused) {
                }
                c20691r0.f77447d.unlock();
                return (String[]) c20691r0.f77444a;
            case 1:
                C20691r0 c20691r1 = C20650b0.f77233o;
                c20691r1.f77447d.lock();
                try {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (System.currentTimeMillis() - c20691r1.f77445b >= c20691r1.f77446c || c20691r1.f77445b == -1) {
                        c20691r1.f77444a = Long.valueOf(C20650b0.m56773i());
                        c20691r1.f77445b = jCurrentTimeMillis2;
                    }
                    break;
                } catch (Throwable unused2) {
                }
                c20691r1.f77447d.unlock();
                return (Long) c20691r1.f77444a;
            case 2:
                C20647a0 c20647a0M56803m = null;
                for (int i13 = 0; i13 < 2; i13++) {
                    try {
                        c20647a0M56803m = C20668h0.m56803m();
                        long j13 = c20647a0M56803m.f77226a;
                        if (j13 == c20647a0M56803m.f77227b && j13 == c20647a0M56803m.f77228c) {
                            return Boolean.FALSE;
                        }
                    } catch (Exception unused3) {
                        return null;
                    }
                }
                long j14 = c20647a0M56803m.f77226a;
                long j15 = j14 - c20647a0M56803m.f77228c;
                long j16 = j14 - c20647a0M56803m.f77227b;
                if (j15 == 0 && j16 > 100) {
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case 3:
                try {
                    if (new File("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq").exists()) {
                        try {
                            RandomAccessFile randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq", "r");
                            while (true) {
                                try {
                                    String line = randomAccessFile.readLine();
                                    if (line == null) {
                                        randomAccessFile.close();
                                        jM56881h = j7;
                                    } else {
                                        j7 = Long.parseLong(line) / 1000;
                                    }
                                    jM56881h = j7;
                                } catch (Throwable th3) {
                                    try {
                                        randomAccessFile.close();
                                        break;
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                    }
                                    throw th3;
                                }
                                AbstractC20684o.m56853f("CPUsp", e);
                            }
                        } catch (Exception e5) {
                            AbstractC20684o.m56853f("CPUsp", e5);
                        }
                    } else {
                        jM56881h = C20693s0.m56881h();
                    }
                } catch (Exception unused4) {
                }
                return Long.valueOf(jM56881h);
            default:
                HashMap map = new HashMap();
                try {
                    ArrayList arrayList = new ArrayList();
                    C20699v0 c20699v0 = new C20699v0(Collections.reverseOrder());
                    for (Integer num : c20699v0.keySet()) {
                        String str = (String) c20699v0.get(num);
                        AtomicInteger atomicInteger = AbstractC20684o.f77414a;
                        try {
                            Class.forName(str);
                            if (iIntValue < num.intValue()) {
                                iIntValue = num.intValue();
                            }
                        } catch (Exception unused5) {
                            if (iIntValue > num.intValue()) {
                                arrayList.add(num);
                            }
                        }
                    }
                    map.put(StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, Integer.valueOf(iIntValue));
                    map.put("m", arrayList);
                    break;
                } catch (Exception unused6) {
                }
                return map;
        }
    }
}
