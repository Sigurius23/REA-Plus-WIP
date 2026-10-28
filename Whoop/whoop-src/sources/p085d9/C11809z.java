package p085d9;

import android.media.AudioAttributes;
import android.media.AudioTrack;
import p516u8.C34586d;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: d9.z */
/* JADX INFO: loaded from: classes5.dex */
public final class C11809z implements InterfaceC11798o {
    /* JADX INFO: renamed from: b */
    public static AudioAttributes m31655b(C34586d c34586d, boolean z4) {
        return z4 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : (AudioAttributes) c34586d.m109367a().f143660x;
    }

    /* JADX INFO: renamed from: a */
    public final AudioTrack m31656a(C11793j c11793j, C34586d c34586d, int i13) {
        boolean z4 = c11793j.f38242a;
        int i14 = c11793j.f38243b;
        int i15 = c11793j.f38246e;
        int i16 = c11793j.f38244c;
        int i17 = AbstractC38065t.f163031a;
        if (i17 < 23) {
            return new AudioTrack(m31655b(c34586d, z4), AbstractC38065t.m121923p(i16, i15, i14), c11793j.f38247f, 1, i13);
        }
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(m31655b(c34586d, z4)).setAudioFormat(AbstractC38065t.m121923p(i16, i15, i14)).setTransferMode(1).setBufferSizeInBytes(c11793j.f38247f).setSessionId(i13);
        if (i17 >= 29) {
            sessionId.setOffloadedPlayback(c11793j.f38245d);
        }
        return sessionId.build();
    }
}
