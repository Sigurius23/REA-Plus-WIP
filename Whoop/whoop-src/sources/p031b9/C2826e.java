package p031b9;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import java.io.Serializable;
import p076d.C11311s;
import p516u8.C34586d;
import p547v8.C35784a;
import p607x8.AbstractC38065t;
import p607x8.C38062q;
import p607x8.C38063r;
import p658yr.C39723j;
import p658yr.C39724k;
import p658yr.InterfaceC39722i;

/* JADX INFO: renamed from: b9.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C2826e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC39722i f11071a;

    /* JADX INFO: renamed from: b */
    public final Handler f11072b;

    /* JADX INFO: renamed from: c */
    public C2848l0 f11073c;

    /* JADX INFO: renamed from: d */
    public C34586d f11074d;

    /* JADX INFO: renamed from: e */
    public int f11075e;

    /* JADX INFO: renamed from: f */
    public int f11076f;

    /* JADX INFO: renamed from: g */
    public float f11077g = 1.0f;

    /* JADX INFO: renamed from: h */
    public C35784a f11078h;

    public C2826e(Context context, Looper looper, C2848l0 c2848l0) {
        C2823d c2823d = new C2823d(context, 0);
        this.f11071a = c2823d instanceof Serializable ? new C39723j(c2823d) : new C39724k(c2823d);
        this.f11073c = c2848l0;
        this.f11072b = new Handler(looper);
        this.f11075e = 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m8051a() {
        int i13 = this.f11075e;
        if (i13 == 1 || i13 == 0 || this.f11078h == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.f11071a.get();
        C35784a c35784a = this.f11078h;
        if (AbstractC38065t.f163031a < 26) {
            audioManager.abandonAudioFocus(c35784a.f152183b);
            return;
        }
        AudioFocusRequest audioFocusRequest = c35784a.f152187f;
        audioFocusRequest.getClass();
        audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    /* JADX INFO: renamed from: b */
    public final void m8052b(int i13) {
        C2848l0 c2848l0 = this.f11073c;
        if (c2848l0 != null) {
            C38063r c38063r = c2848l0.f11261H;
            c38063r.getClass();
            C38062q c38062qM121877b = C38063r.m121877b();
            c38062qM121877b.f163024a = c38063r.f163026a.obtainMessage(33, i13, 0);
            c38062qM121877b.m121876b();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m8053c(int i13) {
        if (this.f11075e == i13) {
            return;
        }
        this.f11075e = i13;
        float f13 = i13 == 4 ? 0.2f : 1.0f;
        if (this.f11077g == f13) {
            return;
        }
        this.f11077g = f13;
        C2848l0 c2848l0 = this.f11073c;
        if (c2848l0 != null) {
            c2848l0.f11261H.m121881e(34);
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m8054d(int i13, boolean z4) {
        int i14;
        int iRequestAudioFocus;
        C11311s c11311s;
        boolean z13 = false;
        if (i13 == 1 || (i14 = this.f11076f) != 1) {
            m8051a();
            m8053c(0);
            return 1;
        }
        if (!z4) {
            int i15 = this.f11075e;
            if (i15 == 1) {
                return -1;
            }
            if (i15 == 3) {
                return 0;
            }
        } else if (this.f11075e != 2) {
            C35784a c35784a = this.f11078h;
            if (c35784a == null) {
                if (c35784a == null) {
                    c11311s = new C11311s();
                    c11311s.f36246c = C34586d.f145642c;
                    c11311s.f36244a = i14;
                } else {
                    C11311s c11311s2 = new C11311s();
                    c11311s2.f36244a = c35784a.f152182a;
                    c11311s2.f36246c = c35784a.f152185d;
                    c11311s2.f36245b = c35784a.f152186e;
                    c11311s = c11311s2;
                }
                C34586d c34586d = this.f11074d;
                if (c34586d != null && c34586d.f145643a == 1) {
                    z13 = true;
                }
                c34586d.getClass();
                c11311s.f36246c = c34586d;
                c11311s.f36245b = z13;
                C2820c c2820c = new C2820c(this, 0);
                Handler handler = this.f11072b;
                handler.getClass();
                this.f11078h = new C35784a(c11311s.f36244a, c2820c, handler, (C34586d) c11311s.f36246c, c11311s.f36245b);
            }
            AudioManager audioManager = (AudioManager) this.f11071a.get();
            C35784a c35784a2 = this.f11078h;
            if (AbstractC38065t.f163031a >= 26) {
                AudioFocusRequest audioFocusRequest = c35784a2.f152187f;
                audioFocusRequest.getClass();
                iRequestAudioFocus = audioManager.requestAudioFocus(audioFocusRequest);
            } else {
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = c35784a2.f152183b;
                c35784a2.f152185d.getClass();
                iRequestAudioFocus = audioManager.requestAudioFocus(onAudioFocusChangeListener, 3, c35784a2.f152182a);
            }
            if (iRequestAudioFocus == 1) {
                m8053c(2);
                return 1;
            }
            m8053c(1);
            return -1;
        }
        return 1;
    }
}
