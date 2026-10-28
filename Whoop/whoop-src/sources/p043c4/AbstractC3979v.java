package p043c4;

import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.os.Build;
import android.os.PowerManager;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.InputMethodManager;
import android.window.OnBackInvokedDispatcher;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p085d9.C11779a;
import p085d9.C11781b;
import p181h2.C16618c;
import p208i2.AbstractC17918w0;
import p516u8.C34586d;
import p550vd.AbstractC35903f;
import p607x8.AbstractC38065t;
import p690zr.AbstractC41023g0;
import p690zr.C41014d0;
import p715kotlin.time.DurationKt;
import ro.C31624i;

/* JADX INFO: renamed from: c4.v */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3979v {
    /* JADX INFO: renamed from: a */
    public static C11781b m12010a(AudioManager audioManager, C34586d c34586d) {
        List<AudioProfile> directProfilesForAttributes = audioManager.getDirectProfilesForAttributes((AudioAttributes) c34586d.m109367a().f143660x);
        HashMap map = new HashMap();
        map.put(2, new HashSet(AbstractC35903f.m114014i(12)));
        for (int i13 = 0; i13 < directProfilesForAttributes.size(); i13++) {
            AudioProfile audioProfile = directProfilesForAttributes.get(i13);
            if (audioProfile.getEncapsulationType() != 1) {
                int format = audioProfile.getFormat();
                if (AbstractC38065t.m121893G(format) || C11781b.f38193e.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) map.get(Integer.valueOf(format));
                        set.getClass();
                        set.addAll(AbstractC35903f.m114014i(audioProfile.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(AbstractC35903f.m114014i(audioProfile.getChannelMasks())));
                    }
                }
            }
        }
        C41014d0 c41014d0M133251l = AbstractC41023g0.m133251l();
        for (Map.Entry entry : map.entrySet()) {
            c41014d0M133251l.m133222a(new C11779a(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new C11781b(c41014d0M133251l.m133239f());
    }

    /* JADX INFO: renamed from: b */
    public static C31624i m12011b(AudioManager audioManager, C34586d c34586d) {
        try {
            audioManager.getClass();
            List<AudioDeviceInfo> audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes((AudioAttributes) c34586d.m109367a().f143660x);
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return new C31624i(audioDevicesForAttributes.get(0), 24);
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m12012c() {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 33 && (i13 < 30 || SdkExtensions.getExtensionVersion(30) < 2)) {
            return Integer.MAX_VALUE;
        }
        return MediaStore.getPickImagesMaxLimit();
    }

    /* JADX INFO: renamed from: d */
    public static Object m12013d(Intent intent, String str, Class cls) {
        return intent.getParcelableExtra(str, cls);
    }

    /* JADX INFO: renamed from: e */
    public static String m12014e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m12015f(PowerManager powerManager) {
        return powerManager.isLowPowerStandbyEnabled() || powerManager.isDeviceLightIdleMode();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m12016g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    /* JADX INFO: renamed from: h */
    public static final void m12017h(C3958f0 c3958f0, C3978u c3978u) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (c3978u == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = c3958f0.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(DurationKt.NANOS_IN_MILLIS, c3978u);
    }

    /* JADX INFO: renamed from: i */
    public static final void m12018i(C3958f0 c3958f0, C3978u c3978u) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (c3978u == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = c3958f0.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(c3978u);
    }

    /* JADX INFO: renamed from: j */
    public static final void m12019j(CursorAnchorInfo.Builder builder, C16618c c16618c) {
        builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(AbstractC17918w0.m51504F(c16618c)).setHandwritingBounds(AbstractC17918w0.m51504F(c16618c)).build());
    }

    /* JADX INFO: renamed from: k */
    public static final void m12020k(CursorAnchorInfo.Builder builder, C16618c c16618c) {
        builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(AbstractC17918w0.m51504F(c16618c)).setHandwritingBounds(AbstractC17918w0.m51504F(c16618c)).build());
    }

    /* JADX INFO: renamed from: l */
    public static void m12021l(InputMethodManager inputMethodManager, View view) {
        inputMethodManager.startStylusHandwriting(view);
    }
}
