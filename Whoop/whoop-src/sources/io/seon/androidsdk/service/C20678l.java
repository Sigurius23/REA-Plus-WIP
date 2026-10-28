package io.seon.androidsdk.service;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.view.Display;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: io.seon.androidsdk.service.l */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C20678l implements InterfaceC20695t0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f77366a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C20682n f77367b;

    public /* synthetic */ C20678l(C20682n c20682n, int i13) {
        this.f77366a = i13;
        this.f77367b = c20682n;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0198 A[Catch: Exception -> 0x01ea, TryCatch #4 {Exception -> 0x01ea, blocks: (B:86:0x0154, B:102:0x0191, B:126:0x01e5, B:101:0x018f, B:105:0x0198, B:107:0x01a2, B:123:0x01de, B:122:0x01dc, B:121:0x01d9, B:100:0x018c, B:92:0x016a, B:93:0x016e, B:95:0x0174, B:97:0x0188, B:91:0x0166, B:88:0x015e, B:113:0x01b7, B:114:0x01bb, B:116:0x01c1, B:118:0x01d5, B:112:0x01b4, B:109:0x01ac), top: B:168:0x0154, inners: #3, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x01a2 A[Catch: Exception -> 0x01ea, TRY_LEAVE, TryCatch #4 {Exception -> 0x01ea, blocks: (B:86:0x0154, B:102:0x0191, B:126:0x01e5, B:101:0x018f, B:105:0x0198, B:107:0x01a2, B:123:0x01de, B:122:0x01dc, B:121:0x01d9, B:100:0x018c, B:92:0x016a, B:93:0x016e, B:95:0x0174, B:97:0x0188, B:91:0x0166, B:88:0x015e, B:113:0x01b7, B:114:0x01bb, B:116:0x01c1, B:118:0x01d5, B:112:0x01b4, B:109:0x01ac), top: B:168:0x0154, inners: #3, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01c1 A[Catch: Exception -> 0x01d8, TryCatch #6 {Exception -> 0x01d8, blocks: (B:113:0x01b7, B:114:0x01bb, B:116:0x01c1, B:118:0x01d5, B:112:0x01b4), top: B:172:0x01b4, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:174:0x01ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0112 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x013c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:? A[LOOP:2: B:71:0x0122->B:200:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x01dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:? A[LOOP:4: B:114:0x01bb->B:206:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0108 A[Catch: Exception -> 0x014d, TRY_LEAVE, TryCatch #1 {Exception -> 0x014d, blocks: (B:42:0x00b4, B:45:0x00c2, B:61:0x00ff, B:60:0x00fd, B:64:0x0108, B:80:0x0145, B:79:0x0143, B:78:0x0140, B:59:0x00fa, B:47:0x00cc, B:70:0x011e, B:71:0x0122, B:73:0x0128, B:75:0x013c, B:69:0x011a, B:66:0x0112, B:51:0x00d8, B:52:0x00dc, B:54:0x00e2, B:56:0x00f6, B:50:0x00d4), top: B:162:0x00b4, inners: #8, #10, #13, #14 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0128 A[Catch: Exception -> 0x013f, TryCatch #10 {Exception -> 0x013f, blocks: (B:70:0x011e, B:71:0x0122, B:73:0x0128, B:75:0x013c, B:69:0x011a), top: B:180:0x011a, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x014b  */
    @Override // io.seon.androidsdk.service.InterfaceC20695t0
    /* JADX INFO: renamed from: a */
    public final Object mo56800a() {
        Display[] displays;
        Boolean bool;
        Boolean bool2;
        Iterator<AccessibilityServiceInfo> it;
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        Iterator<AccessibilityServiceInfo> it3;
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList2;
        Boolean bool3;
        Iterator<AccessibilityServiceInfo> it4;
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList3;
        Boolean bool4;
        Iterator<AccessibilityServiceInfo> it5;
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList4;
        Boolean bool5;
        Iterator<AccessibilityServiceInfo> it6;
        z = false;
        boolean z4 = false;
        String str = null;
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList5 = null;
        str = null;
        str = null;
        switch (this.f77366a) {
            case 0:
                this.f77367b.getClass();
                StringBuilder sb4 = new StringBuilder();
                int codecCount = MediaCodecList.getCodecCount();
                for (int i13 = 0; i13 < codecCount; i13++) {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i13);
                    sb4.append(codecInfoAt.getName());
                    sb4.append(Arrays.asList((String[]) codecInfoAt.getSupportedTypes().clone()));
                }
                try {
                    String string = sb4.toString();
                    if (!string.equals("") && !string.trim().equals("")) {
                        AtomicInteger atomicInteger = AbstractC20684o.f77414a;
                        byte[] bytes = string.getBytes("UTF-8");
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        messageDigest.reset();
                        messageDigest.update(bytes);
                        return AbstractC20684o.m56849b(messageDigest.digest());
                    }
                    return null;
                } catch (Exception unused) {
                    return null;
                }
            case 1:
                C20682n c20682n = this.f77367b;
                c20682n.getClass();
                try {
                    StringBuilder sb5 = new StringBuilder();
                    try {
                        displays = c20682n.f77408f.getDisplays();
                        break;
                    } catch (Exception e5) {
                        AbstractC20684o.m56853f("ConnDisp", e5);
                        displays = null;
                    }
                    if (displays == null) {
                        return null;
                    }
                    for (Display display : displays) {
                        Locale locale = Locale.ENGLISH;
                        sb5.append(display.getName() + "(" + display.getDisplayId() + "):" + display.getFlags() + ";");
                    }
                    return sb5.toString();
                } catch (Exception e13) {
                    AbstractC20684o.m56853f("DispFl", e13);
                    return null;
                }
            case 2:
                C20682n c20682n2 = this.f77367b;
                c20682n2.getClass();
                try {
                    try {
                        if (!c20682n2.m56844f("screencap").booleanValue()) {
                            if (!c20682n2.m56844f("teamviewer").booleanValue()) {
                                z4 = true;
                            } else if (c20682n2.m56844f("ScreenCapture").booleanValue()) {
                                enabledAccessibilityServiceList5 = c20682n2.f77407e.getEnabledAccessibilityServiceList(-1);
                                it = enabledAccessibilityServiceList5.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        bool2 = Boolean.FALSE;
                                    } else if (it.next().getResolveInfo().toString().contains("it.nanosystems.supremo")) {
                                        bool2 = Boolean.TRUE;
                                        break;
                                    }
                                }
                                if (bool2.booleanValue()) {
                                    z4 = true;
                                }
                            }
                            return Boolean.valueOf(z4);
                        }
                        try {
                            enabledAccessibilityServiceList = c20682n2.f77407e.getEnabledAccessibilityServiceList(-1);
                            while (true) {
                                if (it3.hasNext()) {
                                    if (it3.next().getResolveInfo().toString().contains("com.anydesk")) {
                                        bool = Boolean.TRUE;
                                        break;
                                    }
                                }
                                bool = Boolean.FALSE;
                            }
                        } catch (Exception e14) {
                            AbstractC20684o.m56853f("AccServ", e14);
                            enabledAccessibilityServiceList = null;
                        }
                        it3 = enabledAccessibilityServiceList.iterator();
                        if (!bool.booleanValue()) {
                            if (!c20682n2.m56844f("teamviewer").booleanValue()) {
                                if (c20682n2.m56844f("ScreenCapture").booleanValue()) {
                                    try {
                                        enabledAccessibilityServiceList5 = c20682n2.f77407e.getEnabledAccessibilityServiceList(-1);
                                        while (true) {
                                            if (it.hasNext()) {
                                                bool2 = Boolean.FALSE;
                                            } else if (it.next().getResolveInfo().toString().contains("it.nanosystems.supremo")) {
                                                bool2 = Boolean.TRUE;
                                                break;
                                            }
                                        }
                                    } catch (Exception e15) {
                                        try {
                                            AbstractC20684o.m56853f("AccServ", e15);
                                        } catch (Exception e16) {
                                            AbstractC20684o.m56853f("SimAcc", e16);
                                        }
                                    }
                                    it = enabledAccessibilityServiceList5.iterator();
                                    if (bool2.booleanValue()) {
                                    }
                                }
                            }
                            return Boolean.valueOf(z4);
                        }
                        z4 = true;
                        return Boolean.valueOf(z4);
                    } catch (Exception e17) {
                        AbstractC20684o.m56853f("SimAcc", e17);
                    }
                } catch (Exception unused2) {
                    return Boolean.FALSE;
                }
                return Boolean.FALSE;
            case 3:
                C20682n c20682n3 = this.f77367b;
                c20682n3.getClass();
                try {
                    if (c20682n3.m56844f("teamviewer").booleanValue()) {
                        return "TeamViewer";
                    }
                    if (c20682n3.m56844f("screencap").booleanValue()) {
                        try {
                            enabledAccessibilityServiceList2 = c20682n3.f77407e.getEnabledAccessibilityServiceList(-1);
                            while (true) {
                                if (!it4.hasNext()) {
                                    bool3 = Boolean.FALSE;
                                } else if (it4.next().getResolveInfo().toString().contains("com.anydesk")) {
                                    bool3 = Boolean.TRUE;
                                    break;
                                }
                            }
                        } catch (Exception e18) {
                            try {
                                AbstractC20684o.m56853f("AccServ", e18);
                                enabledAccessibilityServiceList2 = null;
                            } catch (Exception e19) {
                                AbstractC20684o.m56853f("SimAcc", e19);
                            }
                        }
                        it4 = enabledAccessibilityServiceList2.iterator();
                        if (bool3.booleanValue()) {
                            str = "AnyDesk";
                        } else if (c20682n3.m56844f("ScreenCapture").booleanValue()) {
                            try {
                                enabledAccessibilityServiceList3 = c20682n3.f77407e.getEnabledAccessibilityServiceList(-1);
                                while (true) {
                                    if (it5.hasNext()) {
                                        bool4 = Boolean.FALSE;
                                    } else if (it5.next().getResolveInfo().toString().contains("it.nanosystems.supremo")) {
                                        bool4 = Boolean.TRUE;
                                        break;
                                    }
                                }
                            } catch (Exception e22) {
                                try {
                                    AbstractC20684o.m56853f("AccServ", e22);
                                    enabledAccessibilityServiceList3 = null;
                                } catch (Exception e24) {
                                    AbstractC20684o.m56853f("SimAcc", e24);
                                }
                            }
                            it5 = enabledAccessibilityServiceList3.iterator();
                            if (bool4.booleanValue()) {
                                str = "Supremo";
                            }
                        }
                    } else if (c20682n3.m56844f("ScreenCapture").booleanValue()) {
                        enabledAccessibilityServiceList3 = c20682n3.f77407e.getEnabledAccessibilityServiceList(-1);
                        it5 = enabledAccessibilityServiceList3.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                bool4 = Boolean.FALSE;
                            } else if (it5.next().getResolveInfo().toString().contains("it.nanosystems.supremo")) {
                                bool4 = Boolean.TRUE;
                                break;
                            }
                        }
                        if (bool4.booleanValue()) {
                            str = "Supremo";
                        }
                    }
                } catch (Exception unused3) {
                }
                return str;
            case 4:
                C20682n c20682n4 = this.f77367b;
                c20682n4.getClass();
                try {
                    String[] strArr = {"autoclicker", "com.applisto.appcloner", "com.bitspice.automate", "remotebot"};
                    for (int i14 = 0; i14 < 4; i14++) {
                        String str2 = strArr[i14];
                        try {
                            try {
                                enabledAccessibilityServiceList4 = c20682n4.f77407e.getEnabledAccessibilityServiceList(-1);
                                while (true) {
                                    if (!it6.hasNext()) {
                                        bool5 = Boolean.FALSE;
                                    } else if (it6.next().getResolveInfo().toString().contains(str2)) {
                                        bool5 = Boolean.TRUE;
                                    }
                                }
                            } catch (Exception e25) {
                                AbstractC20684o.m56853f("AccServ", e25);
                                enabledAccessibilityServiceList4 = null;
                            }
                            it6 = enabledAccessibilityServiceList4.iterator();
                        } catch (Exception e26) {
                            AbstractC20684o.m56853f("SimAcc", e26);
                        }
                        if (bool5.booleanValue()) {
                            return Boolean.TRUE;
                        }
                        break;
                    }
                    return Boolean.FALSE;
                } catch (Exception e27) {
                    AbstractC20684o.m56853f("ClickAu", e27);
                    return Boolean.FALSE;
                }
            default:
                C20682n c20682n5 = this.f77367b;
                c20682n5.getClass();
                C20691r0 c20691r0 = C20682n.f77405m;
                c20691r0.f77447d.lock();
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (System.currentTimeMillis() - c20691r0.f77445b >= c20691r0.f77446c || c20691r0.f77445b == -1) {
                        c20691r0.f77444a = c20682n5.m56845g();
                        c20691r0.f77445b = jCurrentTimeMillis;
                    }
                    break;
                } catch (Throwable unused4) {
                }
                c20691r0.f77447d.unlock();
                return (String) c20691r0.f77444a;
        }
    }
}
