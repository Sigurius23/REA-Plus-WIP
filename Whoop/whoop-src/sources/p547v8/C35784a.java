package p547v8;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Objects;
import p465rm.C31517b;
import p516u8.C34586d;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: v8.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C35784a {

    /* JADX INFO: renamed from: a */
    public final int f152182a;

    /* JADX INFO: renamed from: b */
    public final AudioManager.OnAudioFocusChangeListener f152183b;

    /* JADX INFO: renamed from: c */
    public final Handler f152184c;

    /* JADX INFO: renamed from: d */
    public final C34586d f152185d;

    /* JADX INFO: renamed from: e */
    public final boolean f152186e;

    /* JADX INFO: renamed from: f */
    public final AudioFocusRequest f152187f;

    public C35784a(int i13, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, C34586d c34586d, boolean z4) {
        this.f152182a = i13;
        this.f152184c = handler;
        this.f152185d = c34586d;
        this.f152186e = z4;
        int i14 = AbstractC38065t.f163031a;
        if (i14 < 26) {
            this.f152183b = new C31517b(onAudioFocusChangeListener, handler);
        } else {
            this.f152183b = onAudioFocusChangeListener;
        }
        if (i14 >= 26) {
            this.f152187f = new AudioFocusRequest.Builder(i13).setAudioAttributes((AudioAttributes) c34586d.m109367a().f143660x).setWillPauseWhenDucked(z4).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f152187f = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35784a)) {
            return false;
        }
        C35784a c35784a = (C35784a) obj;
        return this.f152182a == c35784a.f152182a && this.f152186e == c35784a.f152186e && Objects.equals(this.f152183b, c35784a.f152183b) && Objects.equals(this.f152184c, c35784a.f152184c) && Objects.equals(this.f152185d, c35784a.f152185d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f152182a), this.f152183b, this.f152184c, this.f152185d, Boolean.valueOf(this.f152186e));
    }
}
