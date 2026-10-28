package io.seon.androidsdk.service;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.text.TextUtils;
import com.whoop.service.network.model.UserSessionDto;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.json.JSONObject;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: io.seon.androidsdk.service.l0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20679l0 {

    /* JADX INFO: renamed from: f */
    public static PackageManager f77368f;

    /* JADX INFO: renamed from: g */
    public static final String[] f77369g = {"cpu_type", "kernel_arch", "battery_voltage", "battery_temperature", "kernel_version", "wifi_ssid", "is_tablet", "input_device_data", "battery_total_capacity", "cpu_count", "device_id"};

    /* JADX INFO: renamed from: a */
    public final Context f77370a;

    /* JADX INFO: renamed from: b */
    public final C20681m0 f77371b;

    /* JADX INFO: renamed from: c */
    public String f77372c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f77373d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final HashMap f77374e;

    public C20679l0(Context context, HashMap map) {
        this.f77370a = context;
        this.f77374e = map;
        C20681m0 c20681m0 = new C20681m0();
        c20681m0.f77377b = new String[]{"noxd"};
        c20681m0.f77400y = new String[]{"goldfish", "Genymotion"};
        c20681m0.f77379d = new String[]{"goldfish"};
        HashMap map2 = new HashMap();
        c20681m0.f77378c = map2;
        EmulatorDetectorConfigurator$Engine emulatorDetectorConfigurator$Engine = EmulatorDetectorConfigurator$Engine.LDPLAYER;
        map2.put("/system/priv-app/ldAppStore", String.valueOf(emulatorDetectorConfigurator$Engine));
        c20681m0.f77378c.put("/system/bin/ldinit", String.valueOf(emulatorDetectorConfigurator$Engine));
        c20681m0.f77378c.put("/system/etc/mumu-configs/device-prop-configs/mumu.config", String.valueOf(EmulatorDetectorConfigurator$Engine.MUMU));
        HashMap map3 = c20681m0.f77378c;
        EmulatorDetectorConfigurator$Engine emulatorDetectorConfigurator$Engine2 = EmulatorDetectorConfigurator$Engine.NOX;
        map3.put("fstab.nox", String.valueOf(emulatorDetectorConfigurator$Engine2));
        c20681m0.f77378c.put("init.nox.rc", String.valueOf(emulatorDetectorConfigurator$Engine2));
        c20681m0.f77378c.put("ueventd.nox.rc", String.valueOf(emulatorDetectorConfigurator$Engine2));
        c20681m0.f77378c.put("noxd", String.valueOf(emulatorDetectorConfigurator$Engine2));
        c20681m0.f77378c.put("/system/lib/libnoxspeedup.so", String.valueOf(emulatorDetectorConfigurator$Engine2));
        c20681m0.f77378c.put("/system/bin/nox-prop", String.valueOf(emulatorDetectorConfigurator$Engine2));
        c20681m0.f77378c.put("fstab.titan", String.valueOf(EmulatorDetectorConfigurator$Engine.TITAN_ENGINE));
        c20681m0.f77378c.put("/system/bin/windroyed", String.valueOf(EmulatorDetectorConfigurator$Engine.WINDROY));
        c20681m0.f77378c.put("/data/.bluestacks.prop", String.valueOf(EmulatorDetectorConfigurator$Engine.BLUESTACKS));
        HashMap map4 = c20681m0.f77378c;
        EmulatorDetectorConfigurator$Engine emulatorDetectorConfigurator$Engine3 = EmulatorDetectorConfigurator$Engine.ANDY;
        map4.put("fstab.andy", String.valueOf(emulatorDetectorConfigurator$Engine3));
        c20681m0.f77378c.put("ueventd.andy.rc", String.valueOf(emulatorDetectorConfigurator$Engine3));
        HashMap map5 = c20681m0.f77378c;
        EmulatorDetectorConfigurator$Engine emulatorDetectorConfigurator$Engine4 = EmulatorDetectorConfigurator$Engine.GENYMOTION;
        map5.put("/dev/socket/genyd", String.valueOf(emulatorDetectorConfigurator$Engine4));
        c20681m0.f77378c.put("/dev/socket/baseband_genyd", String.valueOf(emulatorDetectorConfigurator$Engine4));
        HashMap map6 = c20681m0.f77378c;
        EmulatorDetectorConfigurator$Engine emulatorDetectorConfigurator$Engine5 = EmulatorDetectorConfigurator$Engine.QEMU;
        map6.put("/dev/socket/qemud", String.valueOf(emulatorDetectorConfigurator$Engine5));
        c20681m0.f77378c.put("/dev/qemu_pipe", String.valueOf(emulatorDetectorConfigurator$Engine5));
        c20681m0.f77378c.put("/system/lib/libc_malloc_debug_qemu.so", String.valueOf(emulatorDetectorConfigurator$Engine5));
        c20681m0.f77378c.put("/system/bin/droid4x-prop", String.valueOf(EmulatorDetectorConfigurator$Engine.DROID4X));
        HashMap map7 = c20681m0.f77378c;
        EmulatorDetectorConfigurator$Engine emulatorDetectorConfigurator$Engine6 = EmulatorDetectorConfigurator$Engine.VIRTUAL_BOX;
        map7.put("ueventd.vbox86.rc", String.valueOf(emulatorDetectorConfigurator$Engine6));
        c20681m0.f77378c.put("fstab.vbox86", String.valueOf(emulatorDetectorConfigurator$Engine6));
        c20681m0.f77378c.put("init.vbox86.rc", String.valueOf(emulatorDetectorConfigurator$Engine6));
        HashMap map8 = c20681m0.f77378c;
        EmulatorDetectorConfigurator$Engine emulatorDetectorConfigurator$Engine7 = EmulatorDetectorConfigurator$Engine.X86;
        map8.put("x86.prop", String.valueOf(emulatorDetectorConfigurator$Engine7));
        c20681m0.f77378c.put("init.ttVM_x86.rc", String.valueOf(emulatorDetectorConfigurator$Engine7));
        c20681m0.f77378c.put("fstab.ttVM_x86", String.valueOf(emulatorDetectorConfigurator$Engine7));
        c20681m0.f77378c.put("ueventd.android_x86.rc", String.valueOf(emulatorDetectorConfigurator$Engine7));
        c20681m0.f77378c.put("ueventd.ttVM_x86.rc", String.valueOf(emulatorDetectorConfigurator$Engine7));
        HashMap map9 = c20681m0.f77378c;
        EmulatorDetectorConfigurator$Engine emulatorDetectorConfigurator$Engine8 = EmulatorDetectorConfigurator$Engine.UNKNOWN;
        map9.put("vmos.prop", String.valueOf(emulatorDetectorConfigurator$Engine8));
        c20681m0.f77378c.put("/system/bin/androVM-prop", String.valueOf(emulatorDetectorConfigurator$Engine8));
        c20681m0.f77378c.put("/system/etc/xxzs_prop.sh", String.valueOf(emulatorDetectorConfigurator$Engine8));
        c20681m0.f77378c.put("/system/bin/ttVM-prop", String.valueOf(emulatorDetectorConfigurator$Engine8));
        c20681m0.f77378c.put("/system/bin/microvirt-prop", String.valueOf(emulatorDetectorConfigurator$Engine8));
        c20681m0.f77378c.put("/system/app/AntStore", String.valueOf(emulatorDetectorConfigurator$Engine8));
        c20681m0.f77378c.put("/system/bin/duosconfig", String.valueOf(emulatorDetectorConfigurator$Engine8));
        c20681m0.f77378c.put("/system/lib/libdroid4x.so", String.valueOf(emulatorDetectorConfigurator$Engine8));
        HashMap map10 = new HashMap();
        c20681m0.f77380e = map10;
        map10.put("ro.bootloader", "unknown");
        c20681m0.f77380e.put("ro.bootmode", "unknown");
        c20681m0.f77380e.put("ro.hardware", "goldfish");
        c20681m0.f77380e.put("ro.kernel.qemu", UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE);
        c20681m0.f77380e.put("qemu.gles", UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE);
        c20681m0.f77380e.put("ro.product.device", "generic");
        c20681m0.f77380e.put("ro.product.model", "sdk");
        c20681m0.f77380e.put("ro.product.name", "sdk");
        new HashMap();
        c20681m0.f77382g = new String[]{"10.0.2.15"};
        c20681m0.f77381f = new String[]{"com.bluestacks.", "com.android.emulator.radio.config", "com.google.android.overlay.emulatorgmsconfig", "com.bignox.", "com.kop.", "cn.itools.", "com.kaopu.", "me.haima.", "com.vphone.", "com.genymotion.", "com.google.android.launcher.layouts.genymotion"};
        c20681m0.f77384i = new String[]{"generic", "unknown"};
        c20681m0.f77385j = new String[]{"google_sdk", "droid4x", "Emulator", "Android SDK built for x86", "sdk_gphone64_arm64", "windroy", "tiantian", "genymotion", "amiduos", "duos", "ProjectTitan", "Subsystem for Android"};
        c20681m0.f77386k = new String[]{"VirtualBox", "vbox", "appplayer", "droid4x", "generic", "generic_x86", "emu64a", "virtual", "ProjectTitan", "motion_phone", "windows"};
        c20681m0.f77387l = new String[]{"Genymotion", "Genymobile", "Andy", "Oracle Corporation", "Appetize.io"};
        c20681m0.f77388m = new String[]{"vbox86", "sdk_gphone"};
        c20681m0.f77389n = new String[]{"goldfish", "vbox", "vbox86", "ttvm", "cancro", "intel", "android_x86", "ranchu"};
        c20681m0.f77390o = new String[]{"google_sdk", "sdk_google", "sdk_gphone64", "sdk_x86", "vbox86p", "simulator", "emulator", "andy", "iToolsAVM", "vbox86tp", "genymotion", "bluestacks", "droid4x", "ttvm_hdragon", "duos_native", "vbox", "android_x86"};
        c20681m0.f77391p = new String[]{"goldfish_arm64"};
        c20681m0.f77392q = new String[]{"bignox"};
        c20681m0.f77393r = new String[]{"Build2", "bliss-os"};
        c20681m0.f77394s = new String[]{"1.0.0.0"};
        c20681m0.f77395t = new String[]{"generic"};
        c20681m0.f77396u = new String[]{"vbox", "sdk_gphone"};
        c20681m0.f77383h = new String[]{"bluestacks"};
        c20681m0.f77397v = new String[]{"intel", "amd", "x86", "virtual"};
        c20681m0.f77398w = new String[]{"i686", "x86_64", "x86"};
        c20681m0.f77399x = new String[]{"genymotion", "xanmod", "-titan", ".lxc", ".xl0n"};
        c20681m0.f77376a = new String[]{"VirtualBox", "Redfinger", "Genymotion", "Game China", "virtio_input", "AT Translated Set", "qwerty2", "VMware", "Android_Input", "inputDev-1"};
        this.f77371b = c20681m0;
    }

    /* JADX INFO: renamed from: a */
    public static C20679l0 m56836a(Context context, JSONObject jSONObject) {
        if (context == null) {
            throw new IllegalArgumentException("Context must not be null.");
        }
        try {
            f77368f = context.getPackageManager();
            HashMap map = new HashMap();
            String[] strArr = f77369g;
            for (int i13 = 0; i13 < 11; i13++) {
                String str = strArr[i13];
                if (jSONObject.has(str) && !map.containsKey(str)) {
                    map.put(str, jSONObject.get(str));
                }
            }
            return new C20679l0(context.getApplicationContext(), map);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0317  */
    /* JADX WARN: Code duplicated, block: B:103:0x0318 A[Catch: all -> 0x035a, TryCatch #24 {all -> 0x035a, blocks: (B:100:0x0311, B:103:0x0318, B:105:0x031f, B:106:0x0329, B:108:0x032f, B:110:0x033b), top: B:311:0x0311 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x031f A[Catch: all -> 0x035a, TryCatch #24 {all -> 0x035a, blocks: (B:100:0x0311, B:103:0x0318, B:105:0x031f, B:106:0x0329, B:108:0x032f, B:110:0x033b), top: B:311:0x0311 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x032f A[Catch: all -> 0x035a, TryCatch #24 {all -> 0x035a, blocks: (B:100:0x0311, B:103:0x0318, B:105:0x031f, B:106:0x0329, B:108:0x032f, B:110:0x033b), top: B:311:0x0311 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x035a A[EDGE_INSN: B:113:0x035a->B:114:0x035c BREAK  A[LOOP:12: B:104:0x031d->B:112:0x0357]] */
    /* JADX WARN: Code duplicated, block: B:117:0x036f  */
    /* JADX WARN: Code duplicated, block: B:122:0x03aa A[Catch: Exception -> 0x0369, TRY_LEAVE, TryCatch #2 {Exception -> 0x0369, blocks: (B:118:0x0375, B:120:0x0386, B:122:0x03aa), top: B:269:0x0375 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:129:0x03b7 A[PHI: r0
      0x03b7: PHI (r0v20 boolean) = (r0v19 boolean), (r0v19 boolean), (r0v62 boolean) binds: [B:126:0x03b2, B:128:0x03b5, B:334:0x03b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:147:0x042d  */
    /* JADX WARN: Code duplicated, block: B:149:0x0435  */
    /* JADX WARN: Code duplicated, block: B:163:0x0498  */
    /* JADX WARN: Code duplicated, block: B:165:0x049d  */
    /* JADX WARN: Code duplicated, block: B:177:0x04eb A[Catch: all -> 0x0541, TRY_LEAVE, TryCatch #15 {all -> 0x0541, blocks: (B:175:0x04e4, B:177:0x04eb), top: B:293:0x04e4 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x053a A[LOOP:9: B:176:0x04e9->B:192:0x053a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:226:0x0594 A[EDGE_INSN: B:226:0x0594->B:227:0x059a BREAK  A[LOOP:8: B:164:0x049b->B:225:0x058a], PHI: r4 r6
      0x0594: PHI (r4v21 boolean) = (r4v20 boolean), (r4v33 boolean) binds: [B:162:0x0496, B:344:0x0594] A[DONT_GENERATE, DONT_INLINE]
      0x0594: PHI (r6v9 boolean) = (r6v8 boolean), (r6v18 boolean) binds: [B:162:0x0496, B:344:0x0594] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:231:0x05c2 A[Catch: Exception -> 0x05e4, TryCatch #10 {Exception -> 0x05e4, blocks: (B:228:0x05b8, B:229:0x05bc, B:231:0x05c2, B:234:0x05ce, B:236:0x05de), top: B:283:0x05b8 }] */
    /* JADX WARN: Code duplicated, block: B:234:0x05ce A[Catch: Exception -> 0x05e4, TryCatch #10 {Exception -> 0x05e4, blocks: (B:228:0x05b8, B:229:0x05bc, B:231:0x05c2, B:234:0x05ce, B:236:0x05de), top: B:283:0x05b8 }] */
    /* JADX WARN: Code duplicated, block: B:238:0x05e1 A[LOOP:11: B:232:0x05ca->B:238:0x05e1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:242:0x061b  */
    /* JADX WARN: Code duplicated, block: B:243:0x061d A[Catch: Exception -> 0x0639, TryCatch #21 {Exception -> 0x0639, blocks: (B:240:0x05e6, B:243:0x061d, B:245:0x0625, B:248:0x0630, B:249:0x0636), top: B:305:0x05e6 }] */
    /* JADX WARN: Code duplicated, block: B:246:0x062d  */
    /* JADX WARN: Code duplicated, block: B:248:0x0630 A[Catch: Exception -> 0x0639, TryCatch #21 {Exception -> 0x0639, blocks: (B:240:0x05e6, B:243:0x061d, B:245:0x0625, B:248:0x0630, B:249:0x0636), top: B:305:0x05e6 }] */
    /* JADX WARN: Code duplicated, block: B:249:0x0636 A[Catch: Exception -> 0x0639, TRY_LEAVE, TryCatch #21 {Exception -> 0x0639, blocks: (B:240:0x05e6, B:243:0x061d, B:245:0x0625, B:248:0x0630, B:249:0x0636), top: B:305:0x05e6 }] */
    /* JADX WARN: Code duplicated, block: B:311:0x0311 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x022e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x020d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x02a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x028b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x02eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x02b3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:328:0x03ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:329:0x0386 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:330:0x03ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:0x0369 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x0485 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:0x047e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:0x0594 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:352:0x0503 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:354:0x05de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:0x035a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x033b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:? A[LOOP:13: B:106:0x0329->B:359:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:360:0x024b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x026c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x01d2 A[Catch: Exception -> 0x01d7, TryCatch #18 {Exception -> 0x01d7, blocks: (B:45:0x01ca, B:47:0x01d2, B:50:0x01dc, B:52:0x01e6, B:54:0x01ec), top: B:298:0x01ca }] */
    /* JADX WARN: Code duplicated, block: B:49:0x01db  */
    /* JADX WARN: Code duplicated, block: B:52:0x01e6 A[Catch: Exception -> 0x01d7, TryCatch #18 {Exception -> 0x01d7, blocks: (B:45:0x01ca, B:47:0x01d2, B:50:0x01dc, B:52:0x01e6, B:54:0x01ec), top: B:298:0x01ca }] */
    /* JADX WARN: Code duplicated, block: B:53:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:57:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:61:0x0225 A[Catch: Exception -> 0x026c, LOOP:0: B:56:0x01f3->B:61:0x0225, LOOP_END, TryCatch #1 {Exception -> 0x026c, blocks: (B:58:0x01f7, B:60:0x020d, B:67:0x0262, B:61:0x0225, B:62:0x022e, B:64:0x0237, B:66:0x024b), top: B:267:0x01f7 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0237 A[Catch: Exception -> 0x026c, TryCatch #1 {Exception -> 0x026c, blocks: (B:58:0x01f7, B:60:0x020d, B:67:0x0262, B:61:0x0225, B:62:0x022e, B:64:0x0237, B:66:0x024b), top: B:267:0x01f7 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0267 A[LOOP:14: B:63:0x0235->B:69:0x0267, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x0276 A[Catch: Exception -> 0x02a4, TryCatch #12 {Exception -> 0x02a4, blocks: (B:72:0x0270, B:74:0x0276, B:76:0x0283, B:78:0x028b), top: B:287:0x0270 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0283 A[Catch: Exception -> 0x02a4, TryCatch #12 {Exception -> 0x02a4, blocks: (B:72:0x0270, B:74:0x0276, B:76:0x0283, B:78:0x028b), top: B:287:0x0270 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x02a1 A[LOOP:1: B:75:0x0281->B:80:0x02a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x02a4 A[EDGE_INSN: B:81:0x02a4->B:82:0x02a6 BREAK  A[LOOP:1: B:75:0x0281->B:80:0x02a1]] */
    /* JADX WARN: Code duplicated, block: B:85:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:96:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:97:0x0304  */
    /* JADX INFO: renamed from: b */
    public final void m56837b(C20669h1 c20669h1) throws Throwable {
        String str;
        Class<String> cls;
        Context context;
        boolean z4;
        boolean z13;
        boolean zBooleanValue;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        int i13;
        boolean z19;
        HashMap map;
        String[] strArr;
        int length;
        int i14;
        String str2;
        Iterator it;
        boolean z24;
        boolean z25;
        String str3;
        HashMap map2;
        Iterator it3;
        boolean z26;
        String[] strArr2;
        boolean z27;
        boolean z28;
        boolean z29;
        File[] fileArr;
        int i15;
        boolean z34;
        boolean z35;
        boolean z36;
        File[] fileArrListFiles;
        boolean z37;
        boolean z38;
        boolean z39;
        String[] strArr3;
        int iRound;
        String str4;
        int iIntValue;
        int i16;
        String str5;
        int length2;
        int i17;
        String str6;
        int i18;
        FileInputStream fileInputStream;
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        BufferedReader bufferedReader;
        Throwable th3;
        String line;
        String[] strArr4;
        int length3;
        int i19;
        int i24;
        String str7;
        int i25;
        Locale locale;
        File file;
        String str8;
        File file2;
        String str9;
        String str10;
        String str11;
        String[] strArr5;
        int length4;
        int i26;
        Object obj;
        String str12;
        Object obj2;
        String str13;
        String[] strArr6;
        int length5;
        int i27;
        String[] strArr7;
        int length6;
        int i28;
        String str14;
        Locale locale2;
        String[] strArr8;
        String str15;
        String str16;
        String[] strArr9;
        Locale locale3;
        int i29;
        String str17 = Build.PRODUCT;
        String str18 = Build.MANUFACTURER;
        String str19 = Build.BRAND;
        String str20 = Build.DEVICE;
        String str21 = Build.DISPLAY;
        String str22 = Build.MODEL;
        String str23 = Build.HARDWARE;
        String str24 = Build.BOARD;
        String str25 = Build.SERIAL;
        String str26 = Build.HOST;
        String str27 = Build.BOOTLOADER;
        Build.getRadioVersion();
        String str28 = Build.FINGERPRINT;
        Class<String> cls2 = String.class;
        HashMap map3 = this.f77374e;
        Context context2 = this.f77370a;
        try {
            Class<?> clsLoadClass = context2.getApplicationContext().getClassLoader().loadClass("android.os.SystemProperties");
            str = (String) clsLoadClass.getMethod("get", cls2).invoke(clsLoadClass, "ro.build.flavor");
        } catch (Exception unused) {
            str = null;
        }
        C20681m0 c20681m0 = this.f77371b;
        boolean zM56838c = m56838c(str, c20681m0.f77396u) | m56838c(Build.FINGERPRINT, c20681m0.f77384i) | m56838c(Build.MODEL, c20681m0.f77385j) | m56838c(Build.DEVICE, c20681m0.f77386k) | m56838c(Build.MANUFACTURER, c20681m0.f77387l) | m56838c(Build.DISPLAY, c20681m0.f77388m);
        String str29 = Build.HARDWARE;
        boolean zM56838c2 = zM56838c | m56838c(str29, c20681m0.f77389n);
        String str30 = Build.PRODUCT;
        boolean zM56838c3 = zM56838c2 | m56838c(str30, c20681m0.f77390o) | m56838c(Build.BOARD, c20681m0.f77391p) | m56838c(str29, c20681m0.f77389n) | m56838c(str30, c20681m0.f77390o) | m56838c(Build.HOST, c20681m0.f77393r) | m56838c(Build.BRAND, c20681m0.f77395t);
        SensorManager sensorManager = (SensorManager) context2.getSystemService("sensor");
        ArrayList<String> arrayList = this.f77373d;
        if (sensorManager == null) {
            cls = cls2;
            context = context2;
            z4 = zM56838c3;
            z13 = false;
        } else {
            Iterator<Sensor> it4 = sensorManager.getSensorList(-1).iterator();
            while (true) {
                if (it4.hasNext()) {
                    Sensor next = it4.next();
                    cls = cls2;
                    StringBuilder sb4 = new StringBuilder();
                    context = context2;
                    sb4.append(next.getVendor());
                    sb4.append(" ");
                    sb4.append(next.getName());
                    String string = sb4.toString();
                    String[] strArr10 = c20681m0.f77400y;
                    int length7 = strArr10.length;
                    int i34 = 0;
                    while (true) {
                        if (i34 < length7) {
                            int i35 = i34;
                            String str31 = strArr10[i35];
                            z4 = zM56838c3;
                            Locale locale4 = Locale.ENGLISH;
                            Iterator<Sensor> it5 = it4;
                            if (string.toLowerCase(locale4).contains(str31.toLowerCase(locale4))) {
                                arrayList.add("Sensor name: " + string + " filter: " + str31);
                                z13 = true;
                            } else {
                                i34 = i35 + 1;
                                zM56838c3 = z4;
                                it4 = it5;
                            }
                        } else {
                            cls2 = cls;
                            context2 = context;
                        }
                    }
                } else {
                    cls = cls2;
                    context = context2;
                    z4 = zM56838c3;
                    z13 = false;
                }
            }
        }
        boolean zM56838c4 = z4 | z13;
        try {
            zBooleanValue = map3.containsKey("is_tablet") ? ((Boolean) map3.get("is_tablet")).booleanValue() : false;
        } catch (Exception unused2) {
        }
        if (!zBooleanValue) {
            zM56838c4 |= m56838c(Build.getRadioVersion(), c20681m0.f77394s);
        }
        try {
            try {
                String str32 = (String) (map3.containsKey("cpu_type") ? map3.get("cpu_type") : null);
                if (str32 != null) {
                    int i36 = 0;
                    while (true) {
                        String[] strArr11 = c20681m0.f77397v;
                        if (i36 < strArr11.length) {
                            String str33 = strArr11[i36];
                            Locale locale5 = Locale.ENGLISH;
                            String lowerCase = str33.toLowerCase(locale5);
                            if (str32.toLowerCase(locale5).contains(lowerCase.toLowerCase(locale5))) {
                                arrayList.add("CPU type: " + str32 + " Filter: " + lowerCase);
                                z14 = true;
                                break;
                            }
                            i36++;
                        }
                    }
                    z15 = z14 | zM56838c4;
                    if (map3.containsKey("kernel_arch")) {
                        obj = map3.get("kernel_arch");
                    } else {
                        obj = null;
                    }
                    str12 = (String) obj;
                    if (map3.containsKey("kernel_version")) {
                        obj2 = map3.get("kernel_version");
                    } else {
                        obj2 = null;
                    }
                    str13 = (String) obj2;
                    strArr6 = c20681m0.f77398w;
                    length5 = strArr6.length;
                    i27 = 0;
                    while (true) {
                        try {
                            try {
                                try {
                                    try {
                                        if (i27 < length5) {
                                            z16 = z15;
                                            try {
                                                str16 = strArr6[i27];
                                                strArr9 = strArr6;
                                                locale3 = Locale.ENGLISH;
                                                i29 = length5;
                                                if (str12.toLowerCase(locale3).contains(str16.toLowerCase(locale3))) {
                                                    str15 = "Kernel arch: " + str12 + " filter: " + str16;
                                                } else {
                                                    i27++;
                                                    z15 = z16;
                                                    strArr6 = strArr9;
                                                    length5 = i29;
                                                }
                                            } catch (Exception unused3) {
                                                z17 = false;
                                            }
                                        } else {
                                            z16 = z15;
                                            strArr7 = c20681m0.f77399x;
                                            length6 = strArr7.length;
                                            i28 = 0;
                                            while (true) {
                                                if (i28 < length6) {
                                                    z17 = false;
                                                    boolean z44 = z16 | z17;
                                                    if (map3.containsKey("wifi_ssid")) {
                                                        z18 = false;
                                                        break;
                                                    }
                                                    str11 = (String) map3.get("wifi_ssid");
                                                    strArr5 = c20681m0.f77383h;
                                                    length4 = strArr5.length;
                                                    i26 = 0;
                                                    while (true) {
                                                        if (i26 < length4) {
                                                            z18 = false;
                                                            break;
                                                        }
                                                        if (strArr5[i26].equalsIgnoreCase(str11)) {
                                                            arrayList.add("SSID: " + str11);
                                                            z18 = true;
                                                            break;
                                                        }
                                                        i26++;
                                                    }
                                                    boolean z45 = z18 | z44;
                                                    i13 = 0;
                                                    for (Map.Entry entry : c20681m0.f77380e.entrySet()) {
                                                        String str34 = (String) entry.getKey();
                                                        try {
                                                            Class<?> clsLoadClass2 = context.getApplicationContext().getClassLoader().loadClass("android.os.SystemProperties");
                                                            str10 = (String) clsLoadClass2.getMethod("get", cls).invoke(clsLoadClass2, str34);
                                                        } catch (Exception unused4) {
                                                            str10 = null;
                                                        }
                                                        if (entry.getValue() == null && str10.contains((CharSequence) entry.getValue())) {
                                                            i13++;
                                                        }
                                                    }
                                                    if (i13 >= 3) {
                                                        AbstractC38963t7.m124389s(i13, "Qemu props count: ", arrayList);
                                                        z19 = true;
                                                    } else {
                                                        z19 = false;
                                                    }
                                                    boolean z46 = z45 | z19;
                                                    map = (HashMap) map3.get("input_device_data");
                                                    if (map != null) {
                                                        z24 = false;
                                                        break;
                                                    }
                                                    try {
                                                        if (map.isEmpty()) {
                                                            strArr = c20681m0.f77376a;
                                                            length = strArr.length;
                                                            i14 = 0;
                                                            loop12: while (true) {
                                                                if (i14 < length) {
                                                                    str2 = strArr[i14];
                                                                    it = map.keySet().iterator();
                                                                    while (it.hasNext()) {
                                                                        if (((String) it.next()).contains(str2)) {
                                                                            arrayList.add("Input device: " + map + " Filter: " + str2);
                                                                            z24 = true;
                                                                            break loop12;
                                                                        }
                                                                    }
                                                                    i14++;
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable unused5) {
                                                    }
                                                    z24 = false;
                                                    break;
                                                    z25 = z24 | z46;
                                                    str3 = "/proc/";
                                                    map2 = c20681m0.f77378c;
                                                    it3 = map2.keySet().iterator();
                                                    while (true) {
                                                        if (it3.hasNext()) {
                                                            z26 = false;
                                                            break;
                                                        }
                                                        str8 = (String) it3.next();
                                                        try {
                                                            file2 = new File(str8);
                                                            str9 = (String) map2.get(str8);
                                                            if (file2.exists()) {
                                                                arrayList.add("File: " + str8 + " Engine: " + str9);
                                                                if (!Objects.equals(str9, "UNKNOWN")) {
                                                                    this.f77372c = str9;
                                                                }
                                                                z26 = true;
                                                                break;
                                                            }
                                                            continue;
                                                        } catch (Exception unused6) {
                                                        }
                                                    }
                                                    strArr2 = c20681m0.f77381f;
                                                    if (strArr2 != null || strArr2.length == 0) {
                                                        z27 = z26;
                                                        z28 = false;
                                                    } else {
                                                        Iterator<ApplicationInfo> it6 = (Build.VERSION.SDK_INT >= 33 ? f77368f.getInstalledApplications(PackageManager.ApplicationInfoFlags.of(128L)) : f77368f.getInstalledApplications(128)).iterator();
                                                        while (true) {
                                                            if (it6.hasNext()) {
                                                                ApplicationInfo next2 = it6.next();
                                                                String[] strArr12 = c20681m0.f77381f;
                                                                int length8 = strArr12.length;
                                                                int i37 = 0;
                                                                while (true) {
                                                                    if (i37 < length8) {
                                                                        z27 = z26;
                                                                        if (next2.packageName.startsWith(strArr12[i37])) {
                                                                            arrayList.add("Package name: " + next2.packageName);
                                                                            z28 = true;
                                                                        } else {
                                                                            i37++;
                                                                            z26 = z27;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                z27 = z26;
                                                                z28 = false;
                                                            }
                                                        }
                                                    }
                                                    z29 = z27 | z28;
                                                    fileArr = new File[]{new File("/proc/tty/drivers"), new File("/proc/cpuinfo")};
                                                    i15 = 0;
                                                    loop6: while (true) {
                                                        if (i15 < 2) {
                                                            z34 = z29;
                                                            z35 = false;
                                                            break;
                                                        }
                                                        file = fileArr[i15];
                                                        if (!file.exists() && file.canRead()) {
                                                            byte[] bArr = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];
                                                            try {
                                                                FileInputStream fileInputStream2 = new FileInputStream(file);
                                                                fileInputStream2.read(bArr);
                                                                fileInputStream2.close();
                                                            } catch (Exception unused7) {
                                                            }
                                                            String str35 = new String(bArr);
                                                            String[] strArr13 = c20681m0.f77379d;
                                                            int length9 = strArr13.length;
                                                            int i38 = 0;
                                                            while (i38 < length9) {
                                                                z34 = z29;
                                                                String str36 = strArr13[i38];
                                                                if (str35.contains(str36)) {
                                                                    arrayList.add("Driver: " + str35 + " filter: " + str36);
                                                                    z35 = true;
                                                                    break loop6;
                                                                }
                                                                i38++;
                                                                z29 = z34;
                                                            }
                                                        }
                                                        i15++;
                                                        z29 = z29;
                                                    }
                                                    z36 = z34 | z35;
                                                    fileArrListFiles = new File("/proc").listFiles();
                                                    if (fileArrListFiles != null) {
                                                        z37 = z25;
                                                        z38 = z36;
                                                        z39 = false;
                                                        break;
                                                    }
                                                    length2 = fileArrListFiles.length;
                                                    i17 = 0;
                                                    while (true) {
                                                        if (i17 < length2) {
                                                            z37 = z25;
                                                            z38 = z36;
                                                            z39 = false;
                                                            break;
                                                        }
                                                        File file3 = fileArrListFiles[i17];
                                                        try {
                                                            file3.getAbsolutePath();
                                                            i18 = Integer.parseInt(file3.getAbsolutePath().replace(str3, ""));
                                                            StringBuilder sb5 = new StringBuilder();
                                                            sb5.append(str3);
                                                            sb5.append(i18);
                                                            z37 = z25;
                                                            try {
                                                                sb5.append("/status");
                                                                fileInputStream = new FileInputStream(new File(sb5.toString()));
                                                                try {
                                                                    inputStreamReader = new InputStreamReader(fileInputStream);
                                                                    try {
                                                                        bufferedReader = new BufferedReader(inputStreamReader);
                                                                        try {
                                                                            line = bufferedReader.readLine();
                                                                            inputStreamReader2 = inputStreamReader;
                                                                            try {
                                                                                strArr4 = c20681m0.f77377b;
                                                                                str6 = str3;
                                                                                try {
                                                                                    length3 = strArr4.length;
                                                                                    i19 = 0;
                                                                                    while (i19 < length3) {
                                                                                        i24 = i19;
                                                                                        str7 = strArr4[i24];
                                                                                        i25 = length3;
                                                                                        locale = Locale.ENGLISH;
                                                                                        z38 = z36;
                                                                                        try {
                                                                                            if (line.toLowerCase(locale).contains(str7.toLowerCase(locale))) {
                                                                                                arrayList.add("Process: " + line + " Filter: " + str7 + " Procid: " + i18);
                                                                                                bufferedReader.close();
                                                                                                inputStreamReader2.close();
                                                                                                fileInputStream.close();
                                                                                                z39 = true;
                                                                                                break;
                                                                                            }
                                                                                            i19 = i24 + 1;
                                                                                            length3 = i25;
                                                                                            z36 = z38;
                                                                                        } catch (Throwable th4) {
                                                                                            th = th4;
                                                                                            th3 = th;
                                                                                            try {
                                                                                                bufferedReader.close();
                                                                                                throw th3;
                                                                                            } catch (Throwable th5) {
                                                                                                th3.addSuppressed(th5);
                                                                                                throw th3;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    z38 = z36;
                                                                                    try {
                                                                                        bufferedReader.close();
                                                                                        try {
                                                                                            inputStreamReader2.close();
                                                                                            try {
                                                                                                fileInputStream.close();
                                                                                            } catch (Exception unused8) {
                                                                                                continue;
                                                                                            }
                                                                                        } catch (Throwable th6) {
                                                                                            th = th6;
                                                                                            Throwable th7 = th;
                                                                                            try {
                                                                                                fileInputStream.close();
                                                                                                throw th7;
                                                                                            } catch (Throwable th8) {
                                                                                                th7.addSuppressed(th8);
                                                                                                throw th7;
                                                                                            }
                                                                                        }
                                                                                    } catch (Throwable th9) {
                                                                                        th = th9;
                                                                                        Throwable th10 = th;
                                                                                        try {
                                                                                            inputStreamReader2.close();
                                                                                            throw th10;
                                                                                        } catch (Throwable th11) {
                                                                                            th10.addSuppressed(th11);
                                                                                            throw th10;
                                                                                        }
                                                                                    }
                                                                                } catch (Throwable th12) {
                                                                                    th = th12;
                                                                                    z38 = z36;
                                                                                    th3 = th;
                                                                                    bufferedReader.close();
                                                                                    throw th3;
                                                                                }
                                                                            } catch (Throwable th13) {
                                                                                th = th13;
                                                                                str6 = str3;
                                                                                z38 = z36;
                                                                                th3 = th;
                                                                                bufferedReader.close();
                                                                                throw th3;
                                                                            }
                                                                        } catch (Throwable th14) {
                                                                            th = th14;
                                                                            inputStreamReader2 = inputStreamReader;
                                                                        }
                                                                    } catch (Throwable th15) {
                                                                        th = th15;
                                                                        inputStreamReader2 = inputStreamReader;
                                                                        str6 = str3;
                                                                        z38 = z36;
                                                                    }
                                                                } catch (Throwable th16) {
                                                                    th = th16;
                                                                    str6 = str3;
                                                                    z38 = z36;
                                                                }
                                                            } catch (Exception unused9) {
                                                                str6 = str3;
                                                                z38 = z36;
                                                            }
                                                        } catch (Exception unused10) {
                                                            z37 = z25;
                                                        }
                                                        i17++;
                                                        z25 = z37;
                                                        str3 = str6;
                                                        z36 = z38;
                                                    }
                                                    boolean z47 = z37 | z38 | z39;
                                                    strArr3 = new String[]{"BlueStacks", "Genymotion", "Droid4X", "Windroy", "LDPlayer", "Andy", "MEMU", "MUMU", "QEMU", "Titan_Engine", "NOX"};
                                                    loop10: for (String str37 : arrayList) {
                                                        for (i16 = 0; i16 < 11; i16++) {
                                                            str5 = strArr3[i16];
                                                            if (str37.toLowerCase().contains(str5.toLowerCase())) {
                                                                this.f77372c = str5;
                                                                break loop10;
                                                            }
                                                        }
                                                    }
                                                    iRound = (int) Math.round(((Double) map3.get(EmulatorDetector$PayloadProps.BATTERY_CAPACITY.toString())).doubleValue());
                                                    str4 = (String) map3.get(EmulatorDetector$PayloadProps.DEVICE_ID.toString());
                                                    iIntValue = ((Integer) map3.get(EmulatorDetector$PayloadProps.CPU_COUNT.toString())).intValue();
                                                    if (iRound == 1000) {
                                                        if (str4 == null && str4.length() < 64) {
                                                            arrayList.add("compound emu trigger - device id: ".concat(str4));
                                                        } else if (iIntValue == 1) {
                                                            arrayList.add("compound emu trigger - cpu count: 1");
                                                        } else {
                                                            m56839d();
                                                        }
                                                    }
                                                    String str38 = this.f77372c;
                                                    C20672i1 c20672i1 = (C20672i1) c20669h1.f77327x;
                                                    long j7 = c20669h1.f77326w;
                                                    JSONObject jSONObject = (JSONObject) c20669h1.f77328y;
                                                    c20672i1.f77342f = z47;
                                                    c20672i1.f77340d = arrayList;
                                                    c20672i1.f77341e = str38;
                                                    jSONObject.put("performance_emulator", Long.valueOf(System.currentTimeMillis() - j7));
                                                    return;
                                                }
                                                str14 = strArr7[i28];
                                                locale2 = Locale.ENGLISH;
                                                strArr8 = strArr7;
                                                if (str13.toLowerCase(locale2).contains(str14.toLowerCase(locale2))) {
                                                    str15 = "Kernel version: " + str13 + " filter: " + str14;
                                                } else {
                                                    i28++;
                                                    strArr7 = strArr8;
                                                }
                                            }
                                        }
                                        iRound = (int) Math.round(((Double) map3.get(EmulatorDetector$PayloadProps.BATTERY_CAPACITY.toString())).doubleValue());
                                        str4 = (String) map3.get(EmulatorDetector$PayloadProps.DEVICE_ID.toString());
                                        iIntValue = ((Integer) map3.get(EmulatorDetector$PayloadProps.CPU_COUNT.toString())).intValue();
                                        if (iRound == 1000) {
                                            if (str4 == null) {
                                                if (iIntValue == 1) {
                                                    arrayList.add("compound emu trigger - cpu count: 1");
                                                } else {
                                                    m56839d();
                                                }
                                            } else if (iIntValue == 1) {
                                                arrayList.add("compound emu trigger - cpu count: 1");
                                            } else {
                                                m56839d();
                                            }
                                        }
                                    } catch (Exception unused11) {
                                    }
                                    if (map3.containsKey("wifi_ssid")) {
                                        z18 = false;
                                        break;
                                    }
                                    str11 = (String) map3.get("wifi_ssid");
                                    strArr5 = c20681m0.f77383h;
                                    length4 = strArr5.length;
                                    i26 = 0;
                                    while (true) {
                                        if (i26 < length4) {
                                            z18 = false;
                                            break;
                                        }
                                        if (strArr5[i26].equalsIgnoreCase(str11)) {
                                            arrayList.add("SSID: " + str11);
                                            z18 = true;
                                            break;
                                        }
                                        i26++;
                                    }
                                    while (true) {
                                        if (it3.hasNext()) {
                                            z26 = false;
                                            break;
                                        }
                                        str8 = (String) it3.next();
                                        file2 = new File(str8);
                                        str9 = (String) map2.get(str8);
                                        if (file2.exists()) {
                                            arrayList.add("File: " + str8 + " Engine: " + str9);
                                            if (!Objects.equals(str9, "UNKNOWN")) {
                                                this.f77372c = str9;
                                            }
                                            z26 = true;
                                            break;
                                        }
                                        continue;
                                    }
                                    loop6: while (true) {
                                        if (i15 < 2) {
                                            z34 = z29;
                                            z35 = false;
                                            break;
                                        } else {
                                            file = fileArr[i15];
                                            if (!file.exists()) {
                                            }
                                            i15++;
                                            z29 = z29;
                                        }
                                    }
                                } catch (Exception unused12) {
                                }
                                loop10: while (r4.hasNext()) {
                                    while (i16 < 11) {
                                        str5 = strArr3[i16];
                                        if (str37.toLowerCase().contains(str5.toLowerCase())) {
                                            this.f77372c = str5;
                                            break loop10;
                                        }
                                    }
                                }
                            } catch (Exception unused13) {
                            }
                            jSONObject.put("performance_emulator", Long.valueOf(System.currentTimeMillis() - j7));
                            return;
                        } catch (Exception unused14) {
                            return;
                        }
                        arrayList.add(str15);
                        z17 = true;
                        boolean z48 = z16 | z17;
                        boolean z49 = z18 | z48;
                        i13 = 0;
                        while (r4.hasNext()) {
                            String str39 = (String) entry.getKey();
                            Class<?> clsLoadClass3 = context.getApplicationContext().getClassLoader().loadClass("android.os.SystemProperties");
                            str10 = (String) clsLoadClass3.getMethod("get", cls).invoke(clsLoadClass3, str39);
                            if (entry.getValue() == null) {
                            }
                        }
                        if (i13 >= 3) {
                            AbstractC38963t7.m124389s(i13, "Qemu props count: ", arrayList);
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        boolean z410 = z49 | z19;
                        map = (HashMap) map3.get("input_device_data");
                        if (map != null) {
                            z24 = false;
                            break;
                        }
                        if (map.isEmpty()) {
                            strArr = c20681m0.f77376a;
                            length = strArr.length;
                            i14 = 0;
                            loop12: while (true) {
                                if (i14 < length) {
                                    str2 = strArr[i14];
                                    it = map.keySet().iterator();
                                    while (it.hasNext()) {
                                        if (((String) it.next()).contains(str2)) {
                                            arrayList.add("Input device: " + map + " Filter: " + str2);
                                            z24 = true;
                                            break loop12;
                                        }
                                    }
                                    i14++;
                                }
                            }
                        }
                        z24 = false;
                        break;
                        z25 = z24 | z410;
                        str3 = "/proc/";
                        map2 = c20681m0.f77378c;
                        it3 = map2.keySet().iterator();
                        strArr2 = c20681m0.f77381f;
                        if (strArr2 != null) {
                            z27 = z26;
                            z28 = false;
                        } else {
                            z27 = z26;
                            z28 = false;
                        }
                        z29 = z27 | z28;
                        fileArr = new File[]{new File("/proc/tty/drivers"), new File("/proc/cpuinfo")};
                        i15 = 0;
                        z36 = z34 | z35;
                        fileArrListFiles = new File("/proc").listFiles();
                        if (fileArrListFiles != null) {
                            z37 = z25;
                            z38 = z36;
                            z39 = false;
                            break;
                        }
                        length2 = fileArrListFiles.length;
                        i17 = 0;
                        while (true) {
                            if (i17 < length2) {
                                z37 = z25;
                                z38 = z36;
                                z39 = false;
                                break;
                            }
                            File file4 = fileArrListFiles[i17];
                            file4.getAbsolutePath();
                            i18 = Integer.parseInt(file4.getAbsolutePath().replace(str3, ""));
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(str3);
                            sb6.append(i18);
                            z37 = z25;
                            sb6.append("/status");
                            fileInputStream = new FileInputStream(new File(sb6.toString()));
                            inputStreamReader = new InputStreamReader(fileInputStream);
                            bufferedReader = new BufferedReader(inputStreamReader);
                            line = bufferedReader.readLine();
                            inputStreamReader2 = inputStreamReader;
                            strArr4 = c20681m0.f77377b;
                            str6 = str3;
                            length3 = strArr4.length;
                            i19 = 0;
                            while (i19 < length3) {
                                i24 = i19;
                                str7 = strArr4[i24];
                                i25 = length3;
                                locale = Locale.ENGLISH;
                                z38 = z36;
                                if (line.toLowerCase(locale).contains(str7.toLowerCase(locale))) {
                                    arrayList.add("Process: " + line + " Filter: " + str7 + " Procid: " + i18);
                                    bufferedReader.close();
                                    inputStreamReader2.close();
                                    fileInputStream.close();
                                    z39 = true;
                                    break;
                                }
                                i19 = i24 + 1;
                                length3 = i25;
                                z36 = z38;
                            }
                            z38 = z36;
                            bufferedReader.close();
                            inputStreamReader2.close();
                            fileInputStream.close();
                            i17++;
                            z25 = z37;
                            str3 = str6;
                            z36 = z38;
                        }
                        boolean z411 = z37 | z38 | z39;
                        strArr3 = new String[]{"BlueStacks", "Genymotion", "Droid4X", "Windroy", "LDPlayer", "Andy", "MEMU", "MUMU", "QEMU", "Titan_Engine", "NOX"};
                        String str310 = this.f77372c;
                        C20672i1 c20672i2 = (C20672i1) c20669h1.f77327x;
                        long j13 = c20669h1.f77326w;
                        JSONObject jSONObject2 = (JSONObject) c20669h1.f77328y;
                        c20672i2.f77342f = z411;
                        c20672i2.f77340d = arrayList;
                        c20672i2.f77341e = str310;
                    }
                }
                while (true) {
                    if (i27 < length5) {
                        z16 = z15;
                        str16 = strArr6[i27];
                        strArr9 = strArr6;
                        locale3 = Locale.ENGLISH;
                        i29 = length5;
                        if (str12.toLowerCase(locale3).contains(str16.toLowerCase(locale3))) {
                            str15 = "Kernel arch: " + str12 + " filter: " + str16;
                        } else {
                            i27++;
                            z15 = z16;
                            strArr6 = strArr9;
                            length5 = i29;
                        }
                    } else {
                        z16 = z15;
                        strArr7 = c20681m0.f77399x;
                        length6 = strArr7.length;
                        i28 = 0;
                        while (true) {
                            if (i28 < length6) {
                                z17 = false;
                                boolean z412 = z16 | z17;
                                if (map3.containsKey("wifi_ssid")) {
                                    z18 = false;
                                    break;
                                }
                                str11 = (String) map3.get("wifi_ssid");
                                strArr5 = c20681m0.f77383h;
                                length4 = strArr5.length;
                                i26 = 0;
                                while (true) {
                                    if (i26 < length4) {
                                        z18 = false;
                                        break;
                                    }
                                    if (strArr5[i26].equalsIgnoreCase(str11)) {
                                        arrayList.add("SSID: " + str11);
                                        z18 = true;
                                        break;
                                    }
                                    i26++;
                                }
                                boolean z413 = z18 | z412;
                                i13 = 0;
                                while (r4.hasNext()) {
                                    String str311 = (String) entry.getKey();
                                    Class<?> clsLoadClass4 = context.getApplicationContext().getClassLoader().loadClass("android.os.SystemProperties");
                                    str10 = (String) clsLoadClass4.getMethod("get", cls).invoke(clsLoadClass4, str311);
                                    if (entry.getValue() == null) {
                                    }
                                }
                                if (i13 >= 3) {
                                    AbstractC38963t7.m124389s(i13, "Qemu props count: ", arrayList);
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                boolean z414 = z413 | z19;
                                map = (HashMap) map3.get("input_device_data");
                                if (map != null) {
                                    z24 = false;
                                    break;
                                }
                                if (map.isEmpty()) {
                                    strArr = c20681m0.f77376a;
                                    length = strArr.length;
                                    i14 = 0;
                                    loop12: while (true) {
                                        if (i14 < length) {
                                            str2 = strArr[i14];
                                            it = map.keySet().iterator();
                                            while (it.hasNext()) {
                                                if (((String) it.next()).contains(str2)) {
                                                    arrayList.add("Input device: " + map + " Filter: " + str2);
                                                    z24 = true;
                                                    break loop12;
                                                }
                                            }
                                            i14++;
                                        }
                                    }
                                }
                                z24 = false;
                                break;
                                z25 = z24 | z414;
                                str3 = "/proc/";
                                map2 = c20681m0.f77378c;
                                it3 = map2.keySet().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        z26 = false;
                                        break;
                                    }
                                    str8 = (String) it3.next();
                                    file2 = new File(str8);
                                    str9 = (String) map2.get(str8);
                                    if (file2.exists()) {
                                        arrayList.add("File: " + str8 + " Engine: " + str9);
                                        if (!Objects.equals(str9, "UNKNOWN")) {
                                            this.f77372c = str9;
                                        }
                                        z26 = true;
                                        break;
                                    }
                                    continue;
                                }
                                strArr2 = c20681m0.f77381f;
                                if (strArr2 != null) {
                                    z27 = z26;
                                    z28 = false;
                                } else {
                                    z27 = z26;
                                    z28 = false;
                                }
                                z29 = z27 | z28;
                                fileArr = new File[]{new File("/proc/tty/drivers"), new File("/proc/cpuinfo")};
                                i15 = 0;
                                loop6: while (true) {
                                    if (i15 < 2) {
                                        z34 = z29;
                                        z35 = false;
                                        break;
                                    } else {
                                        file = fileArr[i15];
                                        if (!file.exists()) {
                                        }
                                        i15++;
                                        z29 = z29;
                                    }
                                }
                                z36 = z34 | z35;
                                fileArrListFiles = new File("/proc").listFiles();
                                if (fileArrListFiles != null) {
                                    z37 = z25;
                                    z38 = z36;
                                    z39 = false;
                                    break;
                                }
                                length2 = fileArrListFiles.length;
                                i17 = 0;
                                while (true) {
                                    if (i17 < length2) {
                                        z37 = z25;
                                        z38 = z36;
                                        z39 = false;
                                        break;
                                    }
                                    File file5 = fileArrListFiles[i17];
                                    file5.getAbsolutePath();
                                    i18 = Integer.parseInt(file5.getAbsolutePath().replace(str3, ""));
                                    StringBuilder sb7 = new StringBuilder();
                                    sb7.append(str3);
                                    sb7.append(i18);
                                    z37 = z25;
                                    sb7.append("/status");
                                    fileInputStream = new FileInputStream(new File(sb7.toString()));
                                    inputStreamReader = new InputStreamReader(fileInputStream);
                                    bufferedReader = new BufferedReader(inputStreamReader);
                                    line = bufferedReader.readLine();
                                    inputStreamReader2 = inputStreamReader;
                                    strArr4 = c20681m0.f77377b;
                                    str6 = str3;
                                    length3 = strArr4.length;
                                    i19 = 0;
                                    while (i19 < length3) {
                                        i24 = i19;
                                        str7 = strArr4[i24];
                                        i25 = length3;
                                        locale = Locale.ENGLISH;
                                        z38 = z36;
                                        if (line.toLowerCase(locale).contains(str7.toLowerCase(locale))) {
                                            arrayList.add("Process: " + line + " Filter: " + str7 + " Procid: " + i18);
                                            bufferedReader.close();
                                            inputStreamReader2.close();
                                            fileInputStream.close();
                                            z39 = true;
                                            break;
                                        }
                                        i19 = i24 + 1;
                                        length3 = i25;
                                        z36 = z38;
                                    }
                                    z38 = z36;
                                    bufferedReader.close();
                                    inputStreamReader2.close();
                                    fileInputStream.close();
                                    i17++;
                                    z25 = z37;
                                    str3 = str6;
                                    z36 = z38;
                                }
                                boolean z415 = z37 | z38 | z39;
                                strArr3 = new String[]{"BlueStacks", "Genymotion", "Droid4X", "Windroy", "LDPlayer", "Andy", "MEMU", "MUMU", "QEMU", "Titan_Engine", "NOX"};
                                loop10: while (r4.hasNext()) {
                                    while (i16 < 11) {
                                        str5 = strArr3[i16];
                                        if (str37.toLowerCase().contains(str5.toLowerCase())) {
                                            this.f77372c = str5;
                                            break loop10;
                                        }
                                    }
                                }
                                iRound = (int) Math.round(((Double) map3.get(EmulatorDetector$PayloadProps.BATTERY_CAPACITY.toString())).doubleValue());
                                str4 = (String) map3.get(EmulatorDetector$PayloadProps.DEVICE_ID.toString());
                                iIntValue = ((Integer) map3.get(EmulatorDetector$PayloadProps.CPU_COUNT.toString())).intValue();
                                if (iRound == 1000) {
                                    if (str4 == null) {
                                        if (iIntValue == 1) {
                                            arrayList.add("compound emu trigger - cpu count: 1");
                                        } else {
                                            m56839d();
                                        }
                                    } else if (iIntValue == 1) {
                                        arrayList.add("compound emu trigger - cpu count: 1");
                                    } else {
                                        m56839d();
                                    }
                                }
                                String str312 = this.f77372c;
                                C20672i1 c20672i3 = (C20672i1) c20669h1.f77327x;
                                long j14 = c20669h1.f77326w;
                                JSONObject jSONObject3 = (JSONObject) c20669h1.f77328y;
                                c20672i3.f77342f = z415;
                                c20672i3.f77340d = arrayList;
                                c20672i3.f77341e = str312;
                                jSONObject3.put("performance_emulator", Long.valueOf(System.currentTimeMillis() - j14));
                                return;
                            }
                            str14 = strArr7[i28];
                            locale2 = Locale.ENGLISH;
                            strArr8 = strArr7;
                            if (str13.toLowerCase(locale2).contains(str14.toLowerCase(locale2))) {
                                str15 = "Kernel version: " + str13 + " filter: " + str14;
                            } else {
                                i28++;
                                strArr7 = strArr8;
                            }
                        }
                    }
                    arrayList.add(str15);
                    z17 = true;
                    boolean z416 = z16 | z17;
                    if (map3.containsKey("wifi_ssid")) {
                        z18 = false;
                        break;
                    }
                    str11 = (String) map3.get("wifi_ssid");
                    strArr5 = c20681m0.f77383h;
                    length4 = strArr5.length;
                    i26 = 0;
                    while (true) {
                        if (i26 < length4) {
                            z18 = false;
                            break;
                        }
                        if (strArr5[i26].equalsIgnoreCase(str11)) {
                            arrayList.add("SSID: " + str11);
                            z18 = true;
                            break;
                        }
                        i26++;
                        z18 = false;
                        break;
                    }
                    boolean z417 = z18 | z416;
                    i13 = 0;
                    while (r4.hasNext()) {
                        String str313 = (String) entry.getKey();
                        Class<?> clsLoadClass5 = context.getApplicationContext().getClassLoader().loadClass("android.os.SystemProperties");
                        str10 = (String) clsLoadClass5.getMethod("get", cls).invoke(clsLoadClass5, str313);
                        if (entry.getValue() == null) {
                        }
                    }
                    if (i13 >= 3) {
                        AbstractC38963t7.m124389s(i13, "Qemu props count: ", arrayList);
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z418 = z417 | z19;
                    map = (HashMap) map3.get("input_device_data");
                    if (map != null) {
                        z24 = false;
                        break;
                    }
                    if (map.isEmpty()) {
                        strArr = c20681m0.f77376a;
                        length = strArr.length;
                        i14 = 0;
                        loop12: while (true) {
                            if (i14 < length) {
                                str2 = strArr[i14];
                                it = map.keySet().iterator();
                                while (it.hasNext()) {
                                    if (((String) it.next()).contains(str2)) {
                                        arrayList.add("Input device: " + map + " Filter: " + str2);
                                        z24 = true;
                                        break loop12;
                                    }
                                }
                                i14++;
                            }
                        }
                    }
                    z24 = false;
                    break;
                    z25 = z24 | z418;
                    str3 = "/proc/";
                    map2 = c20681m0.f77378c;
                    it3 = map2.keySet().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            z26 = false;
                            break;
                        }
                        str8 = (String) it3.next();
                        file2 = new File(str8);
                        str9 = (String) map2.get(str8);
                        if (file2.exists()) {
                            arrayList.add("File: " + str8 + " Engine: " + str9);
                            if (!Objects.equals(str9, "UNKNOWN")) {
                                this.f77372c = str9;
                            }
                            z26 = true;
                            break;
                        }
                        continue;
                    }
                    strArr2 = c20681m0.f77381f;
                    if (strArr2 != null) {
                        z27 = z26;
                        z28 = false;
                    } else {
                        z27 = z26;
                        z28 = false;
                    }
                    z29 = z27 | z28;
                    fileArr = new File[]{new File("/proc/tty/drivers"), new File("/proc/cpuinfo")};
                    i15 = 0;
                    loop6: while (true) {
                        if (i15 < 2) {
                            z34 = z29;
                            z35 = false;
                            break;
                        } else {
                            file = fileArr[i15];
                            if (!file.exists()) {
                            }
                            i15++;
                            z29 = z29;
                        }
                    }
                    z36 = z34 | z35;
                    fileArrListFiles = new File("/proc").listFiles();
                    if (fileArrListFiles != null) {
                        z37 = z25;
                        z38 = z36;
                        z39 = false;
                        break;
                    }
                    length2 = fileArrListFiles.length;
                    i17 = 0;
                    while (true) {
                        if (i17 < length2) {
                            z37 = z25;
                            z38 = z36;
                            z39 = false;
                            break;
                        }
                        File file6 = fileArrListFiles[i17];
                        file6.getAbsolutePath();
                        i18 = Integer.parseInt(file6.getAbsolutePath().replace(str3, ""));
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append(str3);
                        sb8.append(i18);
                        z37 = z25;
                        sb8.append("/status");
                        fileInputStream = new FileInputStream(new File(sb8.toString()));
                        inputStreamReader = new InputStreamReader(fileInputStream);
                        bufferedReader = new BufferedReader(inputStreamReader);
                        line = bufferedReader.readLine();
                        inputStreamReader2 = inputStreamReader;
                        strArr4 = c20681m0.f77377b;
                        str6 = str3;
                        length3 = strArr4.length;
                        i19 = 0;
                        while (i19 < length3) {
                            i24 = i19;
                            str7 = strArr4[i24];
                            i25 = length3;
                            locale = Locale.ENGLISH;
                            z38 = z36;
                            if (line.toLowerCase(locale).contains(str7.toLowerCase(locale))) {
                                arrayList.add("Process: " + line + " Filter: " + str7 + " Procid: " + i18);
                                bufferedReader.close();
                                inputStreamReader2.close();
                                fileInputStream.close();
                                z39 = true;
                                break;
                            }
                            i19 = i24 + 1;
                            length3 = i25;
                            z36 = z38;
                        }
                        z38 = z36;
                        bufferedReader.close();
                        inputStreamReader2.close();
                        fileInputStream.close();
                        i17++;
                        z25 = z37;
                        str3 = str6;
                        z36 = z38;
                    }
                    boolean z419 = z37 | z38 | z39;
                    strArr3 = new String[]{"BlueStacks", "Genymotion", "Droid4X", "Windroy", "LDPlayer", "Andy", "MEMU", "MUMU", "QEMU", "Titan_Engine", "NOX"};
                    loop10: while (r4.hasNext()) {
                        while (i16 < 11) {
                            str5 = strArr3[i16];
                            if (str37.toLowerCase().contains(str5.toLowerCase())) {
                                this.f77372c = str5;
                                break loop10;
                            }
                        }
                    }
                    iRound = (int) Math.round(((Double) map3.get(EmulatorDetector$PayloadProps.BATTERY_CAPACITY.toString())).doubleValue());
                    str4 = (String) map3.get(EmulatorDetector$PayloadProps.DEVICE_ID.toString());
                    iIntValue = ((Integer) map3.get(EmulatorDetector$PayloadProps.CPU_COUNT.toString())).intValue();
                    if (iRound == 1000) {
                        if (str4 == null) {
                            if (iIntValue == 1) {
                                arrayList.add("compound emu trigger - cpu count: 1");
                            } else {
                                m56839d();
                            }
                        } else if (iIntValue == 1) {
                            arrayList.add("compound emu trigger - cpu count: 1");
                        } else {
                            m56839d();
                        }
                    }
                    String str314 = this.f77372c;
                    C20672i1 c20672i4 = (C20672i1) c20669h1.f77327x;
                    long j15 = c20669h1.f77326w;
                    JSONObject jSONObject4 = (JSONObject) c20669h1.f77328y;
                    c20672i4.f77342f = z419;
                    c20672i4.f77340d = arrayList;
                    c20672i4.f77341e = str314;
                    jSONObject4.put("performance_emulator", Long.valueOf(System.currentTimeMillis() - j15));
                    return;
                }
            } catch (Exception unused15) {
            }
            if (map3.containsKey("kernel_arch")) {
                obj = map3.get("kernel_arch");
            } else {
                obj = null;
            }
            str12 = (String) obj;
            if (map3.containsKey("kernel_version")) {
                obj2 = map3.get("kernel_version");
            } else {
                obj2 = null;
            }
            str13 = (String) obj2;
            strArr6 = c20681m0.f77398w;
            length5 = strArr6.length;
            i27 = 0;
        } catch (Exception unused16) {
            z16 = z15;
        }
        z14 = false;
        z15 = z14 | zM56838c4;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m56838c(String str, String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            for (int i13 = 0; i13 < strArr.length; i13++) {
                String str2 = strArr[i13];
                ArrayList arrayList = this.f77373d;
                if (str2 == null && str == null) {
                    arrayList.add("Build prop: null filter: null");
                    return true;
                }
                if (str2 == null) {
                    str2 = "";
                }
                if (!str2.isEmpty()) {
                    Locale locale = Locale.ENGLISH;
                    if (str.toLowerCase(locale).contains(str2.toLowerCase(locale))) {
                        arrayList.add("Build prop: " + str + " filter: " + str2);
                        return true;
                    }
                } else if (str.equalsIgnoreCase(str2)) {
                    arrayList.add("Build prop: empty filter: empty");
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m56839d() {
        try {
            int[] iArr = {17, 19, 18};
            int[] iArr2 = {13, 12, 6};
            ArrayList arrayList = new ArrayList();
            SensorManager sensorManager = (SensorManager) this.f77370a.getSystemService("sensor");
            for (int i13 = 0; i13 < 3; i13++) {
                int i14 = iArr[i13];
                if (sensorManager.getDefaultSensor(i14) == null) {
                    arrayList.add(Integer.valueOf(i14));
                }
            }
            for (int i15 = 0; i15 < 3; i15++) {
                int i16 = iArr2[i15];
                if (sensorManager.getDefaultSensor(i16) != null && arrayList.size() > 2) {
                    this.f77373d.add("compound emu trigger - sensors missing: " + TextUtils.join(", ", arrayList) + " has sensor: " + i16);
                    return;
                }
            }
        } catch (Exception unused) {
        }
    }
}
