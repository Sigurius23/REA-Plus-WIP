package tm;

import android.media.AudioAttributes;
import android.media.AudioTrack;
import com.google.android.exoplayer2.audio.AudioSink$InitializationException;
import p309lo.AbstractC24567y;
import p465rm.C31521c0;

/* JADX INFO: renamed from: tm.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C33939q {

    /* JADX INFO: renamed from: a */
    public final C31521c0 f142230a;

    /* JADX INFO: renamed from: b */
    public final int f142231b;

    /* JADX INFO: renamed from: c */
    public final int f142232c;

    /* JADX INFO: renamed from: d */
    public final int f142233d;

    /* JADX INFO: renamed from: e */
    public final int f142234e;

    /* JADX INFO: renamed from: f */
    public final int f142235f;

    /* JADX INFO: renamed from: g */
    public final int f142236g;

    /* JADX INFO: renamed from: h */
    public final int f142237h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC33930h[] f142238i;

    public C33939q(C31521c0 c31521c0, int i13, int i14, int i15, int i16, int i17, int i18, int i19, InterfaceC33930h[] interfaceC33930hArr) {
        this.f142230a = c31521c0;
        this.f142231b = i13;
        this.f142232c = i14;
        this.f142233d = i15;
        this.f142234e = i16;
        this.f142235f = i17;
        this.f142236g = i18;
        this.f142237h = i19;
        this.f142238i = interfaceC33930hArr;
    }

    /* JADX INFO: renamed from: a */
    public final AudioTrack m107351a(boolean z4, C33926d c33926d, int i13) throws AudioSink$InitializationException {
        int i14 = this.f142232c;
        try {
            AudioTrack audioTrackM107352b = m107352b(z4, c33926d, i13);
            int state = audioTrackM107352b.getState();
            if (state == 1) {
                return audioTrackM107352b;
            }
            try {
                audioTrackM107352b.release();
            } catch (Exception unused) {
            }
            throw new AudioSink$InitializationException(state, this.f142234e, this.f142235f, this.f142237h, this.f142230a, i14 == 1, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e5) {
            throw new AudioSink$InitializationException(0, this.f142234e, this.f142235f, this.f142237h, this.f142230a, i14 == 1, e5);
        }
    }

    /* JADX INFO: renamed from: b */
    public final AudioTrack m107352b(boolean z4, C33926d c33926d, int i13) {
        int i14 = AbstractC24567y.f95875a;
        int i15 = this.f142236g;
        int i16 = this.f142235f;
        int i17 = this.f142234e;
        if (i14 >= 29) {
            return new AudioTrack.Builder().setAudioAttributes(z4 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : c33926d.m107343a()).setAudioFormat(C33941s.m107353e(i17, i16, i15)).setTransferMode(1).setBufferSizeInBytes(this.f142237h).setSessionId(i13).setOffloadedPlayback(this.f142232c == 1).build();
        }
        if (i14 >= 21) {
            return new AudioTrack(z4 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : c33926d.m107343a(), C33941s.m107353e(i17, i16, i15), this.f142237h, 1, i13);
        }
        int iM71689t = AbstractC24567y.m71689t(c33926d.f142167y);
        if (i13 == 0) {
            return new AudioTrack(iM71689t, this.f142234e, this.f142235f, this.f142236g, this.f142237h, 1);
        }
        return new AudioTrack(iM71689t, this.f142234e, this.f142235f, this.f142236g, this.f142237h, 1, i13);
    }
}
