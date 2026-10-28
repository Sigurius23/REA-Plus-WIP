package io.seon.androidsdk.service;

import a00.C0072g;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Debug;
import android.provider.Settings;
import com.google.android.gms.common.C4987d;
import com.iterable.iterableapi.C5327g1;
import com.whoop.service.network.model.UserSessionDto;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p037bu.C3632c;
import p474s.C31983m2;

/* JADX INFO: renamed from: io.seon.androidsdk.service.h0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20668h0 extends AbstractC20664g {

    /* JADX INFO: renamed from: j */
    public static final String[] f77317j = {"android_version", "is_rooted", "kernel_arch", "kernel_name", "kernel_version", "usb_cable_state", "usb_debugging_state", "bootloader_state", "developer_options_state", "timestamp"};

    /* JADX INFO: renamed from: k */
    public static final C20691r0 f77318k = new C20691r0(30000);

    /* JADX INFO: renamed from: l */
    public static final C20691r0 f77319l = new C20691r0(30000);

    /* JADX INFO: renamed from: m */
    public static final C20691r0 f77320m = new C20691r0(5000);

    /* JADX INFO: renamed from: e */
    public SharedPreferences f77321e;

    /* JADX INFO: renamed from: f */
    public Context f77322f;

    /* JADX INFO: renamed from: g */
    public String f77323g;

    /* JADX INFO: renamed from: h */
    public boolean f77324h;

    /* JADX INFO: renamed from: i */
    public PackageManager f77325i;

    /* JADX INFO: renamed from: m */
    public static C20647a0 m56803m() {
        try {
            C20647a0 c20647a0 = new C20647a0();
            c20647a0.f77226a = new File("/proc/self/mounts").lastModified();
            c20647a0.f77227b = new File("/proc/self/mountinfo").lastModified();
            c20647a0.f77228c = new File("/proc/self/mountstats").lastModified();
            return c20647a0;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Removed unreachable split cross block B:77:0x00eb */
    @Override // io.seon.androidsdk.service.InterfaceC20670i
    /* JADX INFO: renamed from: a */
    public final Map mo56774a() {
        String str;
        Boolean boolValueOf;
        String property;
        OSProbe$OSEnum oSProbe$OSEnum;
        OSProbe$OSEnum oSProbe$OSEnumM56808j;
        OSProbe$OSEnum oSProbe$OSEnum2;
        C3632c c3632c = AbstractC20664g.f77301d;
        this.f77324h = false;
        HashMap map = new HashMap();
        Long lValueOf = null;
        try {
            String str2 = Build.VERSION.RELEASE;
            str = Build.VERSION.SDK_INT + " (" + str2 + ")";
        } catch (Exception e5) {
            c3632c.m11163L(3, e5);
            str = null;
        } catch (Throwable unused) {
            str = null;
        }
        map.put("android_version", str);
        try {
            boolValueOf = Boolean.valueOf(m56805g() || m56804f());
        } catch (Exception e13) {
            c3632c.m11163L(3, e13);
            boolValueOf = null;
        } catch (Throwable unused2) {
            boolValueOf = null;
        }
        map.put("is_rooted", boolValueOf);
        try {
            property = System.getProperty("os.arch");
        } catch (Exception e14) {
            c3632c.m11163L(3, e14);
            property = null;
        } catch (Throwable unused3) {
            property = null;
        }
        map.put("kernel_arch", property);
        map.put("kernel_name", AbstractC20664g.m56801d(new C20662f0(this, 1)));
        map.put("kernel_version", AbstractC20664g.m56801d(new C20662f0(this, 2)));
        map.put("usb_cable_state", AbstractC20664g.m56801d(new C20662f0(this, 0)));
        try {
            try {
                try {
                    oSProbe$OSEnum = Settings.Global.getInt(this.f77322f.getContentResolver(), "adb_enabled", 0) == 1 ? OSProbe$OSEnum.USB_DEBUGGING_ENABLED : OSProbe$OSEnum.USB_DEBUGGING_DISABLED;
                } catch (Exception unused4) {
                    oSProbe$OSEnum = OSProbe$OSEnum.UNKNOWN;
                }
            } catch (Exception e15) {
                c3632c.m11163L(3, e15);
                oSProbe$OSEnum = null;
            }
        } catch (Throwable unused5) {
            oSProbe$OSEnum = null;
        }
        map.put("usb_debugging_state", oSProbe$OSEnum);
        try {
            oSProbe$OSEnumM56808j = m56808j();
        } catch (Exception e16) {
            c3632c.m11163L(3, e16);
            oSProbe$OSEnumM56808j = null;
        } catch (Throwable unused6) {
            oSProbe$OSEnumM56808j = null;
        }
        map.put("bootloader_state", oSProbe$OSEnumM56808j);
        try {
            try {
                try {
                    oSProbe$OSEnum2 = Settings.Global.getInt(this.f77322f.getContentResolver(), "development_settings_enabled", 0) == 1 ? OSProbe$OSEnum.DEV_OPTIONS_ENABLED : OSProbe$OSEnum.DEV_OPTIONS_DISABLED;
                } catch (Throwable unused7) {
                    oSProbe$OSEnum2 = null;
                }
            } catch (Exception e17) {
                c3632c.m11163L(3, e17);
                oSProbe$OSEnum2 = null;
            }
        } catch (Exception unused8) {
            oSProbe$OSEnum2 = OSProbe$OSEnum.UNKNOWN;
        }
        map.put("developer_options_state", oSProbe$OSEnum2);
        try {
            lValueOf = Long.valueOf(System.currentTimeMillis());
        } catch (Exception e18) {
            c3632c.m11163L(3, e18);
        } catch (Throwable unused9) {
        }
        map.put("timestamp", lValueOf);
        return map;
    }

    @Override // io.seon.androidsdk.service.InterfaceC20670i
    /* JADX INFO: renamed from: b */
    public final Map mo56775b() {
        Boolean bool;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        String strM56811n;
        String string;
        String strM56856i;
        Boolean boolValueOf3;
        C20647a0 c20647a0M56803m;
        int i13;
        Integer numValueOf;
        Boolean boolValueOf4;
        ArrayList arrayList;
        Integer numM56768a;
        ArrayList arrayListM56812o;
        String strValueOf;
        int i14;
        C3632c c3632c = AbstractC20664g.f77301d;
        HashMap map = new HashMap();
        HashMap mapM56786a = null;
        try {
            String[] strArr = {"ro.is_ever_orange", "ro.boot.warranty_bit"};
            while (true) {
                if (i14 >= 2) {
                    bool = Boolean.TRUE;
                    break;
                }
                String strM56856i2 = AbstractC20684o.m56856i(this.f77322f, strArr[i14]);
                i14 = (strM56856i2 == null || strM56856i2.length() == 0) ? 0 : i14 + 1;
                bool = Boolean.FALSE;
                break;
            }
        } catch (Exception e5) {
            c3632c.m11163L(3, e5);
            bool = null;
        } catch (Throwable unused) {
            bool = null;
        }
        map.put("is_safetynetfix_loaded", bool);
        try {
            boolValueOf = Boolean.valueOf(Objects.equals(AbstractC20684o.m56856i(this.f77322f, "ro.allow.mock.location"), UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE));
        } catch (Exception e13) {
            c3632c.m11163L(3, e13);
            boolValueOf = null;
        } catch (Throwable unused2) {
            boolValueOf = null;
        }
        map.put("is_location_mocking_enabled", boolValueOf);
        try {
            boolValueOf2 = Boolean.valueOf(Objects.equals(AbstractC20684o.m56856i(this.f77322f, "sys.oem_unlock_allowed"), UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE));
        } catch (Exception e14) {
            c3632c.m11163L(3, e14);
            boolValueOf2 = null;
        } catch (Throwable unused3) {
            boolValueOf2 = null;
        }
        map.put("is_oem_unlock_allowed", boolValueOf2);
        try {
            strM56811n = m56811n();
        } catch (Exception e15) {
            c3632c.m11163L(3, e15);
            strM56811n = null;
        } catch (Throwable unused4) {
            strM56811n = null;
        }
        map.put("ld_preload_string", strM56811n);
        try {
            string = this.f77321e.getString("nativeUnsafe", "");
        } catch (Throwable unused5) {
            string = null;
        }
        if (Objects.equals(string, UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE)) {
            map.put("native_crash_bit", string);
        }
        try {
            strM56856i = AbstractC20684o.m56856i(this.f77322f, "ro.boot.vbmeta.digest");
        } catch (Exception e16) {
            c3632c.m11163L(3, e16);
            strM56856i = null;
        } catch (Throwable unused6) {
            strM56856i = null;
        }
        map.put("vbmeta_digest", strM56856i);
        try {
            try {
                boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
            } catch (Throwable unused7) {
                boolValueOf3 = null;
            }
        } catch (Exception e17) {
            try {
                AbstractC20684o.m56853f("DebCon", e17);
                boolValueOf3 = Boolean.FALSE;
            } catch (Exception e18) {
                c3632c.m11163L(3, e18);
                boolValueOf3 = null;
            }
        }
        map.put("is_debugger_connected", boolValueOf3);
        map.put("is_magisk_by_mount", AbstractC20664g.m56801d(new C20680m(this, 2)));
        try {
            c20647a0M56803m = m56803m();
        } catch (Exception e19) {
            c3632c.m11163L(3, e19);
            c20647a0M56803m = null;
        } catch (Throwable unused8) {
            c20647a0M56803m = null;
        }
        map.put("mount_files_modify_info", c20647a0M56803m);
        try {
            i13 = AbstractC20684o.f77414a.get();
        } catch (Throwable unused9) {
            i13 = -1;
        }
        try {
            numValueOf = Integer.valueOf(i13);
        } catch (Exception e22) {
            c3632c.m11163L(3, e22);
            numValueOf = null;
        } catch (Throwable unused10) {
            numValueOf = null;
        }
        map.put("running_fingerprints", numValueOf);
        map.put("is_rooted_rootbeer", AbstractC20664g.m56801d(new C20662f0(this, 3)));
        try {
            boolValueOf4 = Boolean.valueOf(m56804f());
        } catch (Exception e24) {
            c3632c.m11163L(3, e24);
            boolValueOf4 = null;
        } catch (Throwable unused11) {
            boolValueOf4 = null;
        }
        map.put("is_rooted_native", boolValueOf4);
        map.put("permissions", AbstractC20664g.m56801d(new C20662f0(this, 4)));
        try {
            try {
                arrayList = new ArrayList();
                try {
                    C20704y c20704y = new C20704y();
                    for (String str : c20704y.keySet()) {
                        AtomicInteger atomicInteger = AbstractC20684o.f77414a;
                        try {
                            Class.forName(str);
                            arrayList.add((String) c20704y.get(str));
                        } catch (Exception unused12) {
                        }
                    }
                } catch (Exception unused13) {
                }
            } catch (Exception e25) {
                c3632c.m11163L(3, e25);
                arrayList = null;
            }
        } catch (Throwable unused14) {
            arrayList = null;
        }
        map.put("wrappers", arrayList);
        try {
            numM56768a = new PageSizeUtil(this.f77322f).m56768a();
        } catch (Throwable unused15) {
            numM56768a = null;
        }
        map.put("page_size", numM56768a);
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            arrayListM56812o = m56812o();
        } catch (Exception e26) {
            c3632c.m11163L(3, e26);
            arrayListM56812o = null;
        } catch (Throwable unused16) {
            arrayListM56812o = null;
        }
        map.put("ns_apps", arrayListM56812o);
        try {
            strValueOf = String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e27) {
            c3632c.m11163L(3, e27);
            strValueOf = null;
        } catch (Throwable unused17) {
            strValueOf = null;
        }
        map.put("ns_perf", strValueOf);
        try {
            mapM56786a = m56806h(this.f77322f.getPackageName()).m56786a();
        } catch (Throwable unused18) {
        }
        map.put("src_inf", mapM56786a);
        return map;
    }

    @Override // io.seon.androidsdk.service.InterfaceC20670i
    /* JADX INFO: renamed from: c */
    public final void mo56776c(C20663f1 c20663f1) {
        this.f77322f = c20663f1.f77299a;
        this.f77303b = c20663f1;
        AtomicInteger atomicInteger = AbstractC20684o.f77414a;
        try {
            C20691r0 c20691r0 = f77318k;
            c20691r0.f77447d.lock();
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (System.currentTimeMillis() - c20691r0.f77445b >= c20691r0.f77446c || c20691r0.f77445b == -1) {
                    c20691r0.f77444a = m56809k();
                    c20691r0.f77445b = jCurrentTimeMillis;
                }
            } catch (Throwable unused) {
            }
            c20691r0.f77447d.unlock();
        } catch (Throwable unused2) {
        }
        try {
            C20691r0 c20691r1 = f77319l;
            c20691r1.f77447d.lock();
            try {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (System.currentTimeMillis() - c20691r1.f77445b >= c20691r1.f77446c || c20691r1.f77445b == -1) {
                    c20691r1.f77444a = m56810l();
                    c20691r1.f77445b = jCurrentTimeMillis2;
                }
            } catch (Throwable unused3) {
            }
            c20691r1.f77447d.unlock();
        } catch (Throwable unused4) {
        }
        try {
            this.f77325i = this.f77322f.getPackageManager();
        } catch (Throwable unused5) {
        }
        try {
            this.f77321e = this.f77322f.getSharedPreferences("seonLocalPreferences", 0);
        } catch (Exception unused6) {
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m56804f() throws Throwable {
        try {
            String strM56811n = m56811n();
            if (strM56811n == null || strM56811n.isEmpty()) {
                return false;
            }
            return strM56811n.contains("/system/bin/appwidget") || strM56811n.contains("magisk") || strM56811n.contains("zygisk");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m56805g() {
        C5327g1 c5327g1 = new C5327g1(this.f77322f);
        c5327g1.m16446h();
        return ((Boolean) f77320m.m56879a(new C20665g0(c5327g1, 0))).booleanValue();
    }

    /* JADX INFO: renamed from: h */
    public final C20656d0 m56806h(String str) {
        String installingPackageName;
        String initiatingPackageName;
        String originatingPackageName;
        try {
            List listAsList = Arrays.asList(null, C4987d.GOOGLE_PLAY_STORE_PACKAGE, "com.facebook.system");
            if (Build.VERSION.SDK_INT >= 30) {
                try {
                    InstallSourceInfo installSourceInfo = this.f77325i.getInstallSourceInfo(str);
                    installingPackageName = installSourceInfo.getInstallingPackageName();
                    try {
                        initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                        try {
                            originatingPackageName = installSourceInfo.getOriginatingPackageName();
                        } catch (Exception unused) {
                            originatingPackageName = null;
                        }
                    } catch (Exception unused2) {
                        initiatingPackageName = null;
                    }
                } catch (Exception unused3) {
                    installingPackageName = null;
                    initiatingPackageName = null;
                }
            } else {
                installingPackageName = this.f77325i.getInstallerPackageName(str);
                originatingPackageName = null;
                initiatingPackageName = null;
            }
            return new C20656d0(installingPackageName, initiatingPackageName, Boolean.valueOf((listAsList.contains(installingPackageName) && listAsList.contains(initiatingPackageName) && listAsList.contains(originatingPackageName)) ? false : true), originatingPackageName);
        } catch (Throwable unused4) {
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public final long m56807i(String str) {
        String[] strArr = {"android.permission.RECEIVE_SMS", "android.permission.READ_SMS", "android.permission.SEND_SMS", "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS", "android.permission.RECEIVE_BOOT_COMPLETED", "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS", "android.permission.REQUEST_INSTALL_PACKAGES", "android.permission.NFC", "android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR", "android.permission.SYSTEM_ALERT_WINDOW", "android.permission.WRITE_EXTERNAL_STORAGE"};
        try {
            String[] strArr2 = (Build.VERSION.SDK_INT >= 33 ? this.f77325i.getPackageInfo(str, PackageManager.PackageInfoFlags.of(4096L)) : this.f77325i.getPackageInfo(str, 4096)).requestedPermissions;
            if (strArr2 != null && strArr2.length != 0) {
                HashSet hashSet = new HashSet(Arrays.asList(strArr2));
                long j7 = 0;
                for (int i13 = 0; i13 < 13; i13++) {
                    if (hashSet.contains(strArr[i13])) {
                        j7 |= 1 << i13;
                    }
                }
                return j7;
            }
        } catch (Throwable unused) {
        }
        return 0L;
    }

    /* JADX INFO: renamed from: j */
    public final OSProbe$OSEnum m56808j() {
        try {
            HashMap map = new HashMap();
            map.put("ro.boot.vbmeta.device_state", new String[]{"unlocked"});
            map.put("vendor.boot.vbmeta.device_state", new String[]{"unlocked"});
            map.put("ro.boot.verifiedbootstate", new String[]{"orange", "yellow"});
            map.put("ro.boot.flash.locked", new String[]{UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE});
            map.put("ro.vendor.boot.warranty_bit", new String[]{UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE});
            map.put("ro.boot.warranty_bit", new String[]{UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE});
            map.put("ro.warranty_bit", new String[]{UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE});
            map.put("ro.vendor.warranty_bit", new String[]{UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE});
            map.put("ro.boot.veritymode", new String[]{"disabled"});
            for (String str : map.keySet()) {
                String[] strArr = (String[]) map.get(str);
                Objects.requireNonNull(strArr);
                for (String str2 : strArr) {
                    String strM56856i = AbstractC20684o.m56856i(this.f77322f, str);
                    if (strM56856i == null) {
                        break;
                    }
                    if (strM56856i.trim().equalsIgnoreCase(str2)) {
                        return OSProbe$OSEnum.BOOTLOADER_STATE_UNLOCKED;
                    }
                }
            }
            return OSProbe$OSEnum.BOOTLOADER_STATE_LOCKED;
        } catch (Exception e5) {
            AbstractC20684o.m56853f("BTL", e5);
            return OSProbe$OSEnum.UNKNOWN;
        }
    }

    /* JADX INFO: renamed from: k */
    public final String m56809k() {
        try {
            Process processExec = Runtime.getRuntime().exec("uname");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
            char[] cArr = new char[4096];
            StringBuilder sb4 = new StringBuilder();
            while (true) {
                int i13 = bufferedReader.read(cArr);
                if (i13 <= 0) {
                    break;
                }
                sb4.append(cArr, 0, i13);
            }
            bufferedReader.close();
            try {
                processExec.waitFor();
            } catch (Exception unused) {
            }
            return sb4.toString().replace("\n", "");
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public final String m56810l() {
        String string;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("uname -r").getInputStream()));
            StringBuilder sb4 = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb4.append(line);
            }
            string = sb4.toString();
        } catch (Exception unused) {
            string = "Unknown";
        }
        if (string != null && string != "Unknown") {
            return string;
        }
        try {
            return System.getProperty("os.version");
        } catch (Exception unused2) {
            return "Unknown";
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0089 A[Catch: Exception -> 0x008e, TRY_LEAVE, TryCatch #0 {Exception -> 0x008e, blocks: (B:10:0x0019, B:15:0x002a, B:23:0x003f, B:24:0x0044, B:26:0x0056, B:28:0x0061, B:29:0x0070, B:30:0x0077, B:31:0x0078, B:32:0x0086, B:33:0x0089), top: B:39:0x0019 }] */
    /* JADX INFO: renamed from: n */
    public final String m56811n() throws Throwable {
        Integer numM56768a;
        int i13;
        if (!this.f77324h) {
            String string = null;
            try {
                numM56768a = new PageSizeUtil(this.f77322f).m56768a();
            } catch (Throwable unused) {
                numM56768a = null;
            }
            if (numM56768a != null) {
                try {
                    if (numM56768a.intValue() > 4096) {
                        this.f77323g = "UNSUPPORTED_PAGE_SIZE";
                    } else {
                        try {
                            string = this.f77321e.getString("nativeUnsafe", "");
                        } catch (Exception unused2) {
                        }
                        if (Objects.equals(string, UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE)) {
                            try {
                                i13 = AbstractC20684o.f77414a.get();
                            } catch (Throwable unused3) {
                                i13 = -1;
                            }
                            this.f77323g = i13 > 1 ? "PARALLEL_RUN_DETECTED" : "NATIVE_CRASH_BIT_SET";
                            this.f77324h = true;
                        } else {
                            SharedPreferences.Editor editorEdit = this.f77321e.edit();
                            editorEdit.putString("nativeUnsafe", UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE);
                            editorEdit.commit();
                            Context context = this.f77322f;
                            if (!NativeDetector.f77220a) {
                                C31983m2 c31983m2 = new C31983m2(12);
                                if (context == null) {
                                    throw new IllegalArgumentException("Given context is null");
                                }
                                C31983m2.m99477o("Beginning load of %s...", "natdet");
                                c31983m2.m99490n(context, "natdet");
                                NativeDetector.f77220a = true;
                            }
                            String strGlp = NativeDetector.glp();
                            editorEdit.putString("nativeUnsafe", UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE);
                            editorEdit.apply();
                            this.f77323g = strGlp;
                        }
                    }
                    this.f77324h = true;
                } catch (Exception unused4) {
                }
            } else {
                this.f77323g = "UNSUPPORTED_PAGE_SIZE";
                this.f77324h = true;
            }
        }
        return this.f77323g;
    }

    /* JADX INFO: renamed from: o */
    public final ArrayList m56812o() {
        List<ApplicationInfo> installedApplications;
        C20656d0 c20656d0M56806h;
        try {
            ArrayList arrayList = new ArrayList();
            try {
                int i13 = Build.VERSION.SDK_INT;
                installedApplications = (i13 < 30 || AbstractC20684o.m56854g(this.f77322f, "android.permission.QUERY_ALL_PACKAGES")) ? i13 >= 33 ? this.f77325i.getInstalledApplications(PackageManager.ApplicationInfoFlags.of(0L)) : this.f77325i.getInstalledApplications(0) : null;
            } catch (Exception unused) {
            }
            if (installedApplications != null) {
                for (ApplicationInfo applicationInfo : installedApplications) {
                    String str = applicationInfo.packageName;
                    int i14 = applicationInfo.flags;
                    if ((i14 & 1) == 0 && (i14 & 128) == 0 && (c20656d0M56806h = m56806h(str)) != null && c20656d0M56806h.f77268d.booleanValue()) {
                        C0072g c0072g = new C0072g(str, this.f77325i.getApplicationLabel(applicationInfo).toString(), 15);
                        c0072g.f225z = c20656d0M56806h;
                        c0072g.f221E = Long.valueOf(m56807i(str));
                        arrayList.add(c0072g);
                    }
                }
                return arrayList;
            }
        } catch (Exception unused2) {
        }
        return null;
    }
}
