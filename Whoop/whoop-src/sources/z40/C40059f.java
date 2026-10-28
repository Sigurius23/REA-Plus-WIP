package z40;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import java.util.regex.Pattern;
import kr.C22786e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: z40.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C40059f {

    /* JADX INFO: renamed from: a */
    public final Context f172866a;

    /* JADX INFO: renamed from: b */
    public final C22786e f172867b;

    /* JADX INFO: renamed from: c */
    public final AudioManager f172868c;

    /* JADX INFO: renamed from: d */
    public final AudioManager.OnAudioFocusChangeListener f172869d;

    /* JADX INFO: renamed from: e */
    public int f172870e;

    /* JADX INFO: renamed from: f */
    public boolean f172871f;

    /* JADX INFO: renamed from: g */
    public boolean f172872g;

    /* JADX INFO: renamed from: h */
    public AudioFocusRequest f172873h;

    public C40059f(Context context, C22786e c22786e, AudioManager audioManager, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        this.f172866a = context;
        this.f172867b = c22786e;
        this.f172868c = audioManager;
        this.f172869d = onAudioFocusChangeListener;
    }

    /* JADX INFO: renamed from: a */
    public final void m128404a(boolean z4) {
        AudioManager audioManager = this.f172868c;
        audioManager.setSpeakerphoneOn(z4);
        if (audioManager.isSpeakerphoneOn()) {
            return;
        }
        Pattern patternCompile = Pattern.compile("^SM-G(960|99)");
        AbstractC22676k.m65749i(patternCompile, "compile(...)");
        String MODEL = Build.MODEL;
        AbstractC22676k.m65749i(MODEL, "MODEL");
        if (patternCompile.matcher(MODEL).find()) {
            AudioDeviceInfo[] devices = audioManager.getDevices(2);
            AbstractC22676k.m65749i(devices, "devices");
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (audioDeviceInfo.getType() == 22) {
                    audioManager.setMode(0);
                    return;
                }
            }
        }
    }
}
