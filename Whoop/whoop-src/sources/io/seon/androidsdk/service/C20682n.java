package io.seon.androidsdk.service;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.hardware.display.DisplayManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import android.view.Display;
import android.view.accessibility.AccessibilityManager;
import androidx.lifecycle.RunnableC1645z0;
import co.C4857e;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import p027b3.RunnableC2411n;
import p037bu.C3632c;

/* JADX INFO: renamed from: io.seon.androidsdk.service.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C20682n extends AbstractC20664g {

    /* JADX INFO: renamed from: i */
    public static final String[] f77401i = {"audio_mute_status", "audio_volume_current", "is_remote_control_connected", "remote_control_provider", "is_screen_being_mirrored", "is_click_automator_installed", "enabled_accessibility_apps", "interfering_apps", "media_drm_id"};

    /* JADX INFO: renamed from: j */
    public static final C3632c f77402j = new C3632c(C20682n.class.getName());

    /* JADX INFO: renamed from: k */
    public static final UUID f77403k = new UUID(-1301668207276963122L, -6645017420763422227L);

    /* JADX INFO: renamed from: l */
    public static final ArrayList f77404l;

    /* JADX INFO: renamed from: m */
    public static final C20691r0 f77405m;

    /* JADX INFO: renamed from: n */
    public static final C20691r0 f77406n;

    /* JADX INFO: renamed from: e */
    public AccessibilityManager f77407e;

    /* JADX INFO: renamed from: f */
    public DisplayManager f77408f;

    /* JADX INFO: renamed from: g */
    public PackageManager f77409g;

    /* JADX INFO: renamed from: h */
    public Context f77410h;

    static {
        UUID uuid = new UUID(1186680826959645954L, -5988876978535335093L);
        f77404l = new ArrayList(Arrays.asList(new UUID(7915273996377279080L, -4667308015798344538L), new UUID(-992507800680445872L, -7199381120623628549L), new UUID(7020113915151479668L, 3265235552863347572L), new UUID(-7724087898164736189L, -5928826375076672350L), new UUID(4422091961135677928L, -5169044695670406100L), new UUID(2855251872710412542L, -5915247801538268145L), new UUID(-2129748144642739255L, 8654423357094679310L), new UUID(7228250692166569901L, -7738864887904840524L), new UUID(4018110648156769406L, -5666344514801360556L), new UUID(5031789394971871680L, -5933022823712443662L), new UUID(-2525142925290940392L, 8909820388469371869L), new UUID(3872842222027031255L, -8402279516758276337L), new UUID(-9176437742005367753L, -7029884071836333870L), new UUID(6801168765294362723L, -8541191043631480108L), new UUID(-7348484286925749626L, -6083546864340672619L), new UUID(7681262094454315298L, -7309041776357940493L), new UUID(-5930083867628189075L, -7670962396607644779L), new UUID(2270907025534308109L, -5030698059018986906L), new UUID(-7409469329982928743L, -5287136925416878535L), new UUID(-6448827203737399526L, -7153349929997633597L), new UUID(-6192002537030071734L, -8171282535135843795L), new UUID(-7338653513101981915L, -8305690818819724279L), new UUID(-5458022420440088656L, -7735543098249644349L), new UUID(8735709315166652742L, -6250393853774379852L), uuid));
        f77405m = new C20691r0(300000L);
        f77406n = new C20691r0(300000L);
    }

    /* JADX INFO: renamed from: h */
    public static String[] m56843h() throws Throwable {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(f77403k);
        arrayList2.addAll(f77404l);
        MediaDrm mediaDrm = null;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            try {
                MediaDrm mediaDrm2 = new MediaDrm((UUID) arrayList2.get(i13));
                try {
                    byte[] propertyByteArray = mediaDrm2.getPropertyByteArray("deviceUniqueId");
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    messageDigest.update(propertyByteArray);
                    arrayList.add(i13 + "," + AbstractC20684o.m56849b(messageDigest.digest()));
                    mediaDrm2.close();
                } catch (Exception unused) {
                    mediaDrm = mediaDrm2;
                    if (mediaDrm != null) {
                        mediaDrm.close();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    mediaDrm = mediaDrm2;
                    if (mediaDrm != null) {
                        mediaDrm.close();
                    }
                    throw th;
                }
            } catch (Exception unused2) {
            } catch (Throwable th4) {
                th = th4;
            }
            mediaDrm = null;
        }
        String[] strArr = new String[arrayList.size()];
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            strArr[i14] = (String) arrayList.get(i14);
        }
        return strArr;
    }

    @Override // io.seon.androidsdk.service.InterfaceC20670i
    /* JADX INFO: renamed from: a */
    public final Map mo56774a() {
        Boolean boolValueOf;
        Integer numValueOf;
        Display[] displays;
        Boolean boolValueOf2;
        ArrayList arrayList;
        C3632c c3632c = AbstractC20664g.f77301d;
        HashMap map = new HashMap();
        ArrayList arrayList2 = null;
        try {
            boolValueOf = Boolean.valueOf(((AudioManager) this.f77410h.getSystemService("audio")).getRingerMode() != 2);
        } catch (Exception e5) {
            c3632c.m11163L(3, e5);
            boolValueOf = null;
        } catch (Throwable unused) {
            boolValueOf = null;
        }
        map.put("audio_mute_status", boolValueOf);
        try {
            numValueOf = Integer.valueOf((int) ((((double) ((AudioManager) this.f77410h.getSystemService("audio")).getStreamVolume(3)) / ((double) ((AudioManager) this.f77410h.getSystemService("audio")).getStreamMaxVolume(3))) * 100.0d));
        } catch (Exception e13) {
            c3632c.m11163L(3, e13);
            numValueOf = null;
        } catch (Throwable unused2) {
            numValueOf = null;
        }
        map.put("audio_volume_current", numValueOf);
        map.put("is_remote_control_connected", AbstractC20664g.m56801d(new C20678l(this, 2)));
        map.put("remote_control_provider", AbstractC20664g.m56801d(new C20678l(this, 3)));
        try {
            try {
                displays = this.f77408f.getDisplays();
            } catch (Throwable unused3) {
                boolValueOf2 = null;
            }
        } catch (Exception e14) {
            try {
                try {
                    AbstractC20684o.m56853f("ConnDisp", e14);
                    displays = null;
                } catch (Exception e15) {
                    c3632c.m11163L(3, e15);
                    boolValueOf2 = null;
                }
            } catch (Exception unused4) {
                boolValueOf2 = Boolean.FALSE;
            }
        }
        boolValueOf2 = Boolean.valueOf(displays.length > 1);
        map.put("is_screen_being_mirrored", boolValueOf2);
        map.put("is_click_automator_installed", AbstractC20664g.m56801d(new C20678l(this, 4)));
        try {
            C4857e c4857eM56846i = m56846i();
            arrayList = c4857eM56846i == null ? null : c4857eM56846i.f20201x;
        } catch (Exception e16) {
            c3632c.m11163L(3, e16);
        } catch (Throwable unused5) {
        }
        map.put("enabled_accessibility_apps", arrayList);
        try {
            C4857e c4857eM56846i2 = m56846i();
            if (c4857eM56846i2 != null) {
                arrayList2 = c4857eM56846i2.f20200w;
            }
        } catch (Exception e17) {
            c3632c.m11163L(3, e17);
        } catch (Throwable unused6) {
        }
        map.put("interfering_apps", arrayList2);
        map.put("media_drm_id", AbstractC20664g.m56801d(new C20678l(this, 5)));
        return map;
    }

    @Override // io.seon.androidsdk.service.InterfaceC20670i
    /* JADX INFO: renamed from: b */
    public final Map mo56775b() {
        int type;
        Integer numValueOf;
        AudioDeviceInfo communicationDevice;
        HashMap map = new HashMap();
        map.put("codec_hash", AbstractC20664g.m56801d(new C20678l(this, 0)));
        map.put("display_flags", AbstractC20664g.m56801d(new C20678l(this, 1)));
        map.put("media_drm_id_list", AbstractC20664g.m56801d(new C20680m(this, 0)));
        AudioManager audioManager = (AudioManager) this.f77410h.getSystemService("audio");
        C3632c c3632c = AbstractC20664g.f77301d;
        Boolean boolM56847j = null;
        if (audioManager != null) {
            try {
                try {
                    type = (Build.VERSION.SDK_INT < 31 || (communicationDevice = audioManager.getCommunicationDevice()) == null) ? 0 : communicationDevice.getType();
                } catch (Exception unused) {
                    type = -1;
                }
                try {
                    numValueOf = Integer.valueOf(type);
                } catch (Exception e5) {
                    c3632c.m11163L(3, e5);
                    numValueOf = null;
                }
            } catch (Throwable unused2) {
                numValueOf = null;
                map.put("current_active_audio_device", numValueOf);
                boolM56847j = m56847j();
                map.put("is_speakerphone_active", boolM56847j);
                return map;
            }
            map.put("current_active_audio_device", numValueOf);
        } else {
            map.put("current_active_audio_device", null);
        }
        try {
            boolM56847j = m56847j();
        } catch (Exception e13) {
            c3632c.m11163L(3, e13);
        } catch (Throwable unused3) {
        }
        map.put("is_speakerphone_active", boolM56847j);
        return map;
    }

    @Override // io.seon.androidsdk.service.InterfaceC20670i
    /* JADX INFO: renamed from: c */
    public final void mo56776c(C20663f1 c20663f1) {
        this.f77410h = c20663f1.f77299a;
        this.f77303b = c20663f1;
        AtomicInteger atomicInteger = AbstractC20684o.f77414a;
        try {
            AtomicInteger atomicInteger2 = AbstractC20684o.f77414a;
            try {
                this.f77407e = (AccessibilityManager) this.f77410h.getSystemService("accessibility");
            } catch (Throwable unused) {
            }
            try {
                this.f77408f = (DisplayManager) this.f77410h.getSystemService("display");
            } catch (Throwable unused2) {
            }
            this.f77409g = this.f77410h.getPackageManager();
        } catch (Throwable unused3) {
        }
        try {
            new Thread(new RunnableC1645z0(this, 13)).start();
        } catch (Throwable unused4) {
        }
        try {
            new Thread(new RunnableC2411n(this)).start();
        } catch (Throwable unused5) {
        }
    }

    /* JADX INFO: renamed from: f */
    public final Boolean m56844f(String str) {
        Display[] displays;
        try {
            try {
                displays = this.f77408f.getDisplays();
            } catch (Exception e5) {
                AbstractC20684o.m56853f("ConnDisp", e5);
                displays = null;
            }
            for (Display display : displays) {
                if (display.getName().contains(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: g */
    public final String m56845g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(f77403k);
        arrayList.addAll(f77404l);
        if (Build.VERSION.SDK_INT >= 30) {
            arrayList.addAll(MediaDrm.getSupportedCryptoSchemes());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                MediaDrm mediaDrm = new MediaDrm((UUID) it.next());
                byte[] propertyByteArray = mediaDrm.getPropertyByteArray("deviceUniqueId");
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(propertyByteArray);
                String strM56849b = AbstractC20684o.m56849b(messageDigest.digest());
                mediaDrm.close();
                return strM56849b;
            } catch (UnsupportedSchemeException unused) {
            } catch (IllegalArgumentException unused2) {
                e = new IllegalArgumentException("Suppressed");
                AbstractC20684o.m56853f("DRM", e);
            } catch (NoSuchAlgorithmException e5) {
                f77402j.m11163L(6, e5);
            } catch (Exception e13) {
                e = e13;
                AbstractC20684o.m56853f("DRM", e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final C4857e m56846i() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        String strReplace;
        ApplicationInfo applicationInfo;
        try {
            enabledAccessibilityServiceList = this.f77407e.getEnabledAccessibilityServiceList(-1);
        } catch (Exception e5) {
            AbstractC20684o.m56853f("AccServ", e5);
            enabledAccessibilityServiceList = null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (enabledAccessibilityServiceList == null) {
            return null;
        }
        int length = 0;
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            try {
                ServiceInfo serviceInfo = accessibilityServiceInfo.getResolveInfo().serviceInfo;
                ProviderInfo providerInfo = accessibilityServiceInfo.getResolveInfo().providerInfo;
                ActivityInfo activityInfo = accessibilityServiceInfo.getResolveInfo().activityInfo;
                if (serviceInfo != null) {
                    String strReplace2 = serviceInfo.toString().replace("ServiceInfo{", "").replace("}", "");
                    ApplicationInfo applicationInfo2 = serviceInfo.applicationInfo;
                    strReplace = strReplace2;
                    applicationInfo = applicationInfo2;
                } else if (providerInfo == null) {
                    strReplace = activityInfo.toString().replace("ActivityInfo{", "").replace("}", "");
                    applicationInfo = activityInfo.applicationInfo;
                } else {
                    strReplace = providerInfo.toString().replace("ProviderInfo{", "").replace("}", "");
                    applicationInfo = providerInfo.applicationInfo;
                }
                if (strReplace.contains(" ")) {
                    strReplace = strReplace.split(" ")[1];
                }
                PackageManager packageManager = this.f77409g;
                if (packageManager != null) {
                    arrayList2.add((String) packageManager.getApplicationLabel(applicationInfo));
                }
                if (strReplace.length() + length <= 900) {
                    arrayList.add(strReplace);
                    length += strReplace.length();
                }
            } catch (Exception unused) {
            }
        }
        return new C4857e(arrayList2, arrayList);
    }

    /* JADX INFO: renamed from: j */
    public final Boolean m56847j() {
        try {
            AudioManager audioManager = (AudioManager) this.f77410h.getSystemService("audio");
            if (audioManager == null) {
                return Boolean.FALSE;
            }
            if (Build.VERSION.SDK_INT < 34) {
                return Boolean.valueOf(((AudioManager) this.f77410h.getSystemService("audio")).isSpeakerphoneOn());
            }
            AudioDeviceInfo communicationDevice = audioManager.getCommunicationDevice();
            boolean z4 = false;
            if (communicationDevice != null) {
                int type = communicationDevice.getType();
                if (type == 2 || type == 24 || type == 27) {
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            }
            for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
                int type2 = audioDeviceInfo.getType();
                if (type2 == 2 || type2 == 24 || type2 == 27) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (Exception unused) {
            return null;
        }
    }
}
