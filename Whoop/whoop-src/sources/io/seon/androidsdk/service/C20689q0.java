package io.seon.androidsdk.service;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.hardware.input.InputManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.PowerManager;
import android.view.InputDevice;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: io.seon.androidsdk.service.q0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C20689q0 implements InterfaceC20695t0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f77434a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C20693s0 f77435b;

    public /* synthetic */ C20689q0(C20693s0 c20693s0, int i13) {
        this.f77434a = i13;
        this.f77435b = c20693s0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.seon.androidsdk.service.InterfaceC20695t0
    /* JADX INFO: renamed from: a */
    public final Object mo56800a() throws Throwable {
        int i13 = this.f77434a;
        int intExtra = -1;
        int i14 = 0;
        int i15 = 0;
        int intExtra2 = 0;
        boolean z4 = 0;
        RandomAccessFile randomAccessFile = null;
        Long lValueOf = null;
        C20693s0 c20693s0 = this.f77435b;
        switch (i13) {
            case 0:
                c20693s0.getClass();
                try {
                    StringBuilder sb4 = new StringBuilder();
                    int i16 = 0;
                    while (true) {
                        String[] strArr = Build.SUPPORTED_ABIS;
                        if (i16 < strArr.length) {
                            String str = strArr[i16];
                            if (str == null || str.isEmpty()) {
                                i16++;
                            } else {
                                sb4.append(str);
                            }
                        }
                    }
                    String[] strArr2 = C20693s0.f77452l;
                    for (int i17 = 0; i17 < 5; i17++) {
                        String strM56883f = c20693s0.m56883f(strArr2[i17]);
                        if (strM56883f != null) {
                            sb4.append(strM56883f);
                        }
                    }
                    if (sb4.length() <= 0) {
                        return null;
                    }
                    try {
                        String string = sb4.toString();
                        AtomicInteger atomicInteger = AbstractC20684o.f77414a;
                        byte[] bytes = string.getBytes("UTF-8");
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        messageDigest.reset();
                        messageDigest.update(bytes);
                        return AbstractC20684o.m56849b(messageDigest.digest());
                    } catch (UnsupportedEncodingException | NoSuchAlgorithmException e5) {
                        C20693s0.f77451k.m11163L(6, e5);
                        return null;
                    }
                } catch (Exception unused) {
                    return null;
                }
            case 1:
                PowerManager powerManager = c20693s0.f77453e;
                if (powerManager != null) {
                    return Boolean.valueOf(powerManager.isPowerSaveMode());
                }
                return null;
            case 2:
                c20693s0.getClass();
                double dRound = 0.0d;
                try {
                    BatteryManager batteryManager = (BatteryManager) c20693s0.f77456h.getSystemService("batterymanager");
                    if (batteryManager != null) {
                        int intProperty = batteryManager.getIntProperty(4);
                        double intProperty2 = ((double) batteryManager.getIntProperty(1)) / 1000.0d;
                        if (intProperty2 > 0.0d && intProperty > 0) {
                            dRound = Math.round(intProperty2 / (((double) intProperty) / 100.0d));
                        }
                    }
                } catch (Exception unused2) {
                }
                return Double.valueOf(dRound);
            case 3:
                c20693s0.getClass();
                try {
                    Intent intentRegisterReceiver = c20693s0.f77456h.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                    intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("plugged", -1) : -1;
                    boolean z13 = (intExtra == 1 || intExtra == 2 || intExtra == 4) ? (char) 1 : (char) 0;
                    z4 = Build.VERSION.SDK_INT >= 33 ? (intExtra == 8 ? (char) 1 : (char) 0) | z13 : z13;
                } catch (Exception unused3) {
                }
                return Boolean.valueOf(z4);
            case 4:
                c20693s0.getClass();
                try {
                    if (c20693s0.f77457i.contains("phiMem")) {
                        long j7 = c20693s0.f77457i.getLong("phiMem", -1L);
                        if (j7 > 0) {
                            return Long.valueOf(j7);
                        }
                    }
                } catch (Exception unused4) {
                }
                try {
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile("/proc/meminfo", "r");
                    try {
                        Matcher matcher = Pattern.compile("(\\d+)").matcher(randomAccessFile2.readLine());
                        String strGroup = "";
                        while (matcher.find()) {
                            strGroup = matcher.group(1);
                        }
                        randomAccessFile2.close();
                        if (strGroup != null) {
                            long j13 = ((long) Double.parseDouble(strGroup)) * 1000;
                            SharedPreferences.Editor editorEdit = c20693s0.f77457i.edit();
                            editorEdit.putLong("phiMem", j13);
                            editorEdit.apply();
                            lValueOf = Long.valueOf(j13);
                            break;
                        }
                        try {
                            randomAccessFile2.close();
                            break;
                        } catch (IOException unused5) {
                        }
                        return lValueOf;
                    } catch (Throwable th3) {
                        th = th3;
                        randomAccessFile = randomAccessFile2;
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                                break;
                            } catch (IOException unused6) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
                break;
            case 5:
                c20693s0.getClass();
                HashMap map = new HashMap();
                try {
                    InputManager inputManager = (InputManager) c20693s0.f77456h.getSystemService("input");
                    for (int i18 = 0; i18 < inputManager.getInputDeviceIds().length; i18++) {
                        InputDevice inputDevice = inputManager.getInputDevice(inputManager.getInputDeviceIds()[i18]);
                        map.put(inputDevice.getName(), Integer.valueOf(inputDevice.getVendorId()));
                    }
                    return map;
                } catch (Exception unused7) {
                    return null;
                }
            case 6:
                c20693s0.getClass();
                Intent intentRegisterReceiver2 = c20693s0.f77456h.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                int intExtra3 = intentRegisterReceiver2 != null ? intentRegisterReceiver2.getIntExtra("plugged", -1) : 0;
                if (intExtra3 == 1) {
                    return "AC";
                }
                if (intExtra3 == 2) {
                    return "USB";
                }
                if (intExtra3 != 4) {
                    return intExtra3 != 8 ? "NO DATA" : "DOCK";
                }
                return "WIRELESS";
            case 7:
                c20693s0.getClass();
                try {
                    Intent intentRegisterReceiver3 = c20693s0.f77456h.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                    if (intentRegisterReceiver3 != null) {
                        intExtra2 = intentRegisterReceiver3.getIntExtra("health", 0);
                        break;
                    }
                    if (intExtra2 == 7) {
                        return "COLD";
                    }
                    if (intExtra2 == 4) {
                        return "DEAD";
                    }
                    if (intExtra2 == 2) {
                        return "GOOD";
                    }
                    if (intExtra2 == 3) {
                        return "OVER HEAT";
                    }
                    if (intExtra2 == 5) {
                        return "OVER VOLTAGE";
                    }
                    if (intExtra2 == 1) {
                        return "UNKNOWN";
                    }
                    if (intExtra2 == 6) {
                        return "UNSPECIFIED FAILURE";
                    }
                    return null;
                } catch (Exception unused8) {
                    return null;
                }
            case 8:
                c20693s0.getClass();
                try {
                    Intent intentRegisterReceiver4 = c20693s0.f77456h.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                    if (intentRegisterReceiver4 != null) {
                        intExtra = intentRegisterReceiver4.getIntExtra("voltage", -1);
                    }
                    break;
                } catch (Exception unused9) {
                }
                try {
                    if (Integer.toString(intExtra).length() <= 2) {
                        intExtra *= 1000;
                    }
                    i15 = intExtra;
                } catch (Exception unused10) {
                }
                return Integer.valueOf(i15);
            default:
                c20693s0.getClass();
                try {
                    String strM56883f2 = c20693s0.m56883f("cpu_model");
                    if (strM56883f2 == null && (strM56883f2 = c20693s0.m56883f("Processor")) == null && (strM56883f2 = c20693s0.m56883f("Hardware")) == null) {
                        while (true) {
                            String[] strArr3 = Build.SUPPORTED_ABIS;
                            if (i14 >= strArr3.length) {
                                return null;
                            }
                            strM56883f2 = strArr3[i14];
                            if (strM56883f2 == null || strM56883f2.isEmpty()) {
                                i14++;
                            }
                        }
                    }
                    return strM56883f2;
                } catch (Exception unused11) {
                    return null;
                }
        }
    }
}
