package c33;

import android.media.AudioManager;
import b23.C2343i;
import b23.EnumC2341g;
import b23.InterfaceC2339e;

/* JADX INFO: renamed from: c33.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C3939f implements AudioManager.OnAudioFocusChangeListener {
    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i13) {
        String str;
        if (i13 == -3) {
            str = "AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK";
        } else if (i13 == -2) {
            str = "AUDIOFOCUS_LOSS_TRANSIENT";
        } else if (i13 == -1) {
            str = "AUDIOFOCUS_LOSS";
        } else if (i13 == 1) {
            str = "AUDIOFOCUS_GAIN";
        } else if (i13 == 2) {
            str = "AUDIOFOCUS_GAIN_TRANSIENT";
        } else if (i13 != 3) {
            str = i13 != 4 ? "AUDIOFOCUS_INVALID" : "AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE";
        } else {
            str = "AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK";
        }
        C2343i c2343i = C2343i.f9269a;
        InterfaceC2339e interfaceC2339e = C2343i.f9272d;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339e.isLoggable(enumC2341g, "AudioSwitchHandler")) {
            C2343i.f9271c.log(enumC2341g, "AudioSwitchHandler", "[onAudioFocusChange] focusChange: ".concat(str), null);
        }
    }
}
