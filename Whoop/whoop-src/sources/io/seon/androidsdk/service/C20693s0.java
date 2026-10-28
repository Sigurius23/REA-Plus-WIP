package io.seon.androidsdk.service;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.nfc.NfcAdapter;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import androidx.lifecycle.RunnableC1645z0;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p037bu.C3632c;

/* JADX INFO: renamed from: io.seon.androidsdk.service.s0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20693s0 extends AbstractC20664g {

    /* JADX INFO: renamed from: j */
    public static final String[] f77450j = {"battery_charging", "battery_health", "battery_level", "battery_temperature", "battery_voltage", "battery_total_capacity", "cpu_type", "cpu_count", "cpu_speed", "cpu_hash", "last_boot_time", "physical_memory", "system_uptime", "is_nfc_available", "is_nfc_enabled", "input_device_data", "power_source"};

    /* JADX INFO: renamed from: k */
    public static final C3632c f77451k = new C3632c(C20693s0.class.getName());

    /* JADX INFO: renamed from: l */
    public static final String[] f77452l = {"cpu_model", "Processor", "vendor_id", "Hardware", "cpu_architecture"};

    /* JADX INFO: renamed from: e */
    public PowerManager f77453e;

    /* JADX INFO: renamed from: f */
    public HashMap f77454f;

    /* JADX INFO: renamed from: g */
    public NfcAdapter f77455g;

    /* JADX INFO: renamed from: h */
    public Context f77456h;

    /* JADX INFO: renamed from: i */
    public SharedPreferences f77457i;

    /* JADX INFO: renamed from: h */
    public static long m56881h() {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/cpu0/cpufreq/stats/time_in_state", "r");
            long j7 = -1;
            while (true) {
                try {
                    String line = randomAccessFile.readLine();
                    if (line == null) {
                        return j7;
                    }
                    String[] strArrSplit = line.split("\\s+");
                    if (strArrSplit.length != 2) {
                        return -1L;
                    }
                    if (Integer.parseInt(strArrSplit[1]) > 0) {
                        long j13 = Long.parseLong(strArrSplit[0].replace("\"", "")) / 1000;
                        if (j13 > j7) {
                            j7 = j13;
                        }
                    }
                } catch (IOException unused) {
                    return j7;
                }
            }
        } catch (IOException unused2) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: j */
    public static String m56882j() {
        return Arrays.toString(Build.SUPPORTED_ABIS);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005d A[Catch: all -> 0x006e, TryCatch #6 {all -> 0x006e, blocks: (B:15:0x0050, B:17:0x005d, B:19:0x0065), top: B:83:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:53:0x012b  */
    /* JADX WARN: Code duplicated, block: B:54:0x012d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0146 A[Catch: Exception -> 0x0153, all -> 0x0157, TryCatch #15 {Exception -> 0x0153, all -> 0x0157, blocks: (B:62:0x0140, B:64:0x0146, B:65:0x014e), top: B:93:0x0140 }] */
    @Override // io.seon.androidsdk.service.InterfaceC20670i
    /* JADX INFO: renamed from: a */
    public final Map mo56774a() {
        Integer numValueOf;
        Double dValueOf;
        Double dValueOf2;
        int iAvailableProcessors;
        Integer numValueOf2;
        Long lValueOf;
        Long lValueOf2;
        Boolean boolValueOf;
        boolean z4;
        Intent intentRegisterReceiver;
        int intExtra;
        C3632c c3632c = AbstractC20664g.f77301d;
        HashMap map = new HashMap();
        map.put("battery_charging", AbstractC20664g.m56801d(new C20689q0(this, 3)));
        map.put("battery_health", AbstractC20664g.m56801d(new C20689q0(this, 7)));
        Boolean boolValueOf2 = null;
        int intExtra2 = -1;
        try {
            try {
                Intent intentRegisterReceiver2 = this.f77456h.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver2 != null) {
                    intExtra2 = intentRegisterReceiver2.getIntExtra("level", -1);
                }
            } catch (Throwable unused) {
                numValueOf = null;
                map.put("battery_level", numValueOf);
                intentRegisterReceiver = this.f77456h.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver != null) {
                    intExtra = intentRegisterReceiver.getIntExtra("temperature", 0);
                } else {
                    intExtra = 0;
                }
                dValueOf = Double.valueOf(((double) intExtra) / 10.0d);
                map.put("battery_temperature", dValueOf);
                map.put("battery_voltage", AbstractC20664g.m56801d(new C20689q0(this, 8)));
                dValueOf2 = Double.valueOf(m56884g());
                map.put("battery_total_capacity", dValueOf2);
                map.put("cpu_type", AbstractC20664g.m56801d(new C20689q0(this, 9)));
                try {
                    iAvailableProcessors = Runtime.getRuntime().availableProcessors();
                } catch (Exception unused2) {
                    iAvailableProcessors = 0;
                }
                try {
                    numValueOf2 = Integer.valueOf(iAvailableProcessors);
                } catch (Exception e5) {
                    c3632c.m11163L(3, e5);
                    numValueOf2 = null;
                }
                map.put("cpu_count", numValueOf2);
                map.put("cpu_speed", AbstractC20664g.m56801d(new C20680m(this, 3)));
                map.put("cpu_hash", AbstractC20664g.m56801d(new C20689q0(this, 0)));
                lValueOf = Long.valueOf((System.currentTimeMillis() - SystemClock.elapsedRealtime()) / 1000);
                map.put("last_boot_time", lValueOf);
                map.put("physical_memory", AbstractC20664g.m56801d(new C20689q0(this, 4)));
                lValueOf2 = Long.valueOf(SystemClock.elapsedRealtime() / 1000);
                map.put("system_uptime", lValueOf2);
                if (m56885i() != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolValueOf = Boolean.valueOf(z4);
                map.put("is_nfc_available", boolValueOf);
                boolValueOf2 = Boolean.valueOf(m56885i() != null ? m56885i().isEnabled() : false);
                map.put("is_nfc_enabled", boolValueOf2);
                map.put("input_device_data", AbstractC20664g.m56801d(new C20689q0(this, 5)));
                map.put("power_source", AbstractC20664g.m56801d(new C20689q0(this, 6)));
                return map;
            }
        } catch (Exception unused3) {
        }
        try {
            numValueOf = Integer.valueOf(intExtra2);
        } catch (Exception e13) {
            c3632c.m11163L(3, e13);
            numValueOf = null;
        }
        map.put("battery_level", numValueOf);
        try {
            intentRegisterReceiver = this.f77456h.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                intExtra = intentRegisterReceiver.getIntExtra("temperature", 0);
            } else {
                intExtra = 0;
            }
            dValueOf = Double.valueOf(((double) intExtra) / 10.0d);
        } catch (Throwable unused4) {
            dValueOf = null;
        }
        map.put("battery_temperature", dValueOf);
        map.put("battery_voltage", AbstractC20664g.m56801d(new C20689q0(this, 8)));
        try {
            dValueOf2 = Double.valueOf(m56884g());
        } catch (Exception e14) {
            c3632c.m11163L(3, e14);
            dValueOf2 = null;
        } catch (Throwable unused5) {
            dValueOf2 = null;
        }
        map.put("battery_total_capacity", dValueOf2);
        map.put("cpu_type", AbstractC20664g.m56801d(new C20689q0(this, 9)));
        try {
            iAvailableProcessors = Runtime.getRuntime().availableProcessors();
            numValueOf2 = Integer.valueOf(iAvailableProcessors);
        } catch (Throwable unused6) {
            numValueOf2 = null;
            map.put("cpu_count", numValueOf2);
            map.put("cpu_speed", AbstractC20664g.m56801d(new C20680m(this, 3)));
            map.put("cpu_hash", AbstractC20664g.m56801d(new C20689q0(this, 0)));
            lValueOf = Long.valueOf((System.currentTimeMillis() - SystemClock.elapsedRealtime()) / 1000);
            map.put("last_boot_time", lValueOf);
            map.put("physical_memory", AbstractC20664g.m56801d(new C20689q0(this, 4)));
            lValueOf2 = Long.valueOf(SystemClock.elapsedRealtime() / 1000);
            map.put("system_uptime", lValueOf2);
            if (m56885i() != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolValueOf = Boolean.valueOf(z4);
            map.put("is_nfc_available", boolValueOf);
            boolValueOf2 = Boolean.valueOf(m56885i() != null ? m56885i().isEnabled() : false);
            map.put("is_nfc_enabled", boolValueOf2);
            map.put("input_device_data", AbstractC20664g.m56801d(new C20689q0(this, 5)));
            map.put("power_source", AbstractC20664g.m56801d(new C20689q0(this, 6)));
            return map;
        }
        map.put("cpu_count", numValueOf2);
        map.put("cpu_speed", AbstractC20664g.m56801d(new C20680m(this, 3)));
        map.put("cpu_hash", AbstractC20664g.m56801d(new C20689q0(this, 0)));
        try {
            lValueOf = Long.valueOf((System.currentTimeMillis() - SystemClock.elapsedRealtime()) / 1000);
        } catch (Exception e15) {
            c3632c.m11163L(3, e15);
            lValueOf = null;
        } catch (Throwable unused7) {
            lValueOf = null;
        }
        map.put("last_boot_time", lValueOf);
        map.put("physical_memory", AbstractC20664g.m56801d(new C20689q0(this, 4)));
        try {
            lValueOf2 = Long.valueOf(SystemClock.elapsedRealtime() / 1000);
        } catch (Exception e16) {
            c3632c.m11163L(3, e16);
            lValueOf2 = null;
        } catch (Throwable unused8) {
            lValueOf2 = null;
        }
        map.put("system_uptime", lValueOf2);
        try {
            if (m56885i() != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolValueOf = Boolean.valueOf(z4);
        } catch (Exception e17) {
            c3632c.m11163L(3, e17);
            boolValueOf = null;
        } catch (Throwable unused9) {
            boolValueOf = null;
        }
        map.put("is_nfc_available", boolValueOf);
        try {
            boolValueOf2 = Boolean.valueOf(m56885i() != null ? m56885i().isEnabled() : false);
        } catch (Exception e18) {
            c3632c.m11163L(3, e18);
        } catch (Throwable unused10) {
        }
        map.put("is_nfc_enabled", boolValueOf2);
        map.put("input_device_data", AbstractC20664g.m56801d(new C20689q0(this, 5)));
        map.put("power_source", AbstractC20664g.m56801d(new C20689q0(this, 6)));
        return map;
    }

    @Override // io.seon.androidsdk.service.InterfaceC20670i
    /* JADX INFO: renamed from: b */
    public final Map mo56775b() {
        boolean zIsSecureNfcSupported;
        String glEsVersion;
        String string;
        Object objMo56800a;
        C3632c c3632c = AbstractC20664g.f77301d;
        HashMap map = new HashMap();
        boolean zIsSecureNfcEnabled = false;
        try {
            zIsSecureNfcSupported = (Build.VERSION.SDK_INT < 29 || m56885i() == null) ? false : m56885i().isSecureNfcSupported();
        } catch (Exception unused) {
        }
        map.put("is_secure_nfc_available", Boolean.valueOf(zIsSecureNfcSupported));
        try {
            if (Build.VERSION.SDK_INT >= 29 && m56885i() != null && m56885i() != null) {
                zIsSecureNfcEnabled = m56885i().isSecureNfcEnabled();
            }
        } catch (Exception unused2) {
        }
        map.put("is_secure_nfc_enabled", Boolean.valueOf(zIsSecureNfcEnabled));
        Boolean bool = null;
        try {
            glEsVersion = ((ActivityManager) this.f77456h.getSystemService("activity")).getDeviceConfigurationInfo().getGlEsVersion();
        } catch (Throwable unused3) {
            glEsVersion = null;
        }
        map.put("gles_version", glEsVersion);
        try {
            string = Arrays.toString(Build.SUPPORTED_ABIS);
        } catch (Exception e5) {
            c3632c.m11163L(3, e5);
            string = null;
        } catch (Throwable unused4) {
            string = null;
        }
        map.put("supported_abis", string);
        map.put("calculated_total_battery_capacity", AbstractC20664g.m56801d(new C20689q0(this, 2)));
        try {
            C20689q0 c20689q0 = new C20689q0(this, 1);
            AtomicInteger atomicInteger = AbstractC20684o.f77414a;
            try {
                objMo56800a = c20689q0.mo56800a();
            } catch (Throwable unused5) {
                objMo56800a = null;
            }
            bool = (Boolean) objMo56800a;
        } catch (Exception e13) {
            c3632c.m11163L(3, e13);
        } catch (Throwable unused6) {
        }
        map.put("is_power_saving", bool);
        return map;
    }

    @Override // io.seon.androidsdk.service.InterfaceC20670i
    /* JADX INFO: renamed from: c */
    public final void mo56776c(C20663f1 c20663f1) {
        this.f77456h = c20663f1.f77299a;
        this.f77303b = c20663f1;
        AtomicInteger atomicInteger = AbstractC20684o.f77414a;
        try {
            this.f77457i = this.f77456h.getSharedPreferences("seonLocalPreferences", 0);
        } catch (Throwable unused) {
        }
        try {
            this.f77453e = (PowerManager) this.f77456h.getSystemService("power");
        } catch (Throwable unused2) {
        }
        try {
            new RunnableC1645z0(this, 15).run();
        } catch (Throwable unused3) {
        }
    }

    /* JADX INFO: renamed from: f */
    public final String m56883f(String str) {
        Object value;
        try {
            HashMap map = this.f77454f;
            if (map != null && str != null) {
                if (map.containsKey(str)) {
                    value = this.f77454f.get(str);
                } else {
                    for (Map.Entry entry : this.f77454f.entrySet()) {
                        if (str.equalsIgnoreCase((String) entry.getKey())) {
                            value = entry.getValue();
                        }
                    }
                }
                return (String) value;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final double m56884g() {
        try {
            return ((Double) Class.forName("com.android.internal.os.PowerProfile").getMethod("getBatteryCapacity", null).invoke(Class.forName("com.android.internal.os.PowerProfile").getConstructor(Context.class).newInstance(this.f77456h), null)).doubleValue();
        } catch (Exception e5) {
            AbstractC20684o.m56853f("BatTot", e5);
            return 0.0d;
        }
    }

    /* JADX INFO: renamed from: i */
    public final NfcAdapter m56885i() {
        if (this.f77455g == null) {
            this.f77455g = NfcAdapter.getDefaultAdapter(this.f77456h);
        }
        return this.f77455g;
    }
}
