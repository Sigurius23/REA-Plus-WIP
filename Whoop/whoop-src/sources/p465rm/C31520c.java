package p465rm;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import p309lo.AbstractC24567y;

/* JADX INFO: renamed from: rm.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C31520c {

    /* JADX INFO: renamed from: a */
    public final AudioManager f130063a;

    /* JADX INFO: renamed from: b */
    public final C31517b f130064b;

    /* JADX INFO: renamed from: c */
    public SurfaceHolderCallbackC31565r f130065c;

    /* JADX INFO: renamed from: d */
    public int f130066d;

    /* JADX INFO: renamed from: e */
    public float f130067e = 1.0f;

    public C31520c(Context context, Handler handler, SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f130063a = audioManager;
        this.f130065c = surfaceHolderCallbackC31565r;
        this.f130064b = new C31517b(this, handler);
        this.f130066d = 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m97110a() {
        if (this.f130066d == 0) {
            return;
        }
        if (AbstractC24567y.f95875a < 26) {
            this.f130063a.abandonAudioFocus(this.f130064b);
        }
        m97111b(0);
    }

    /* JADX INFO: renamed from: b */
    public final void m97111b(int i13) {
        if (this.f130066d == i13) {
            return;
        }
        this.f130066d = i13;
        float f13 = i13 == 3 ? 0.2f : 1.0f;
        if (this.f130067e == f13) {
            return;
        }
        this.f130067e = f13;
        SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r = this.f130065c;
        if (surfaceHolderCallbackC31565r != null) {
            C31571u c31571u = surfaceHolderCallbackC31565r.f130359w;
            c31571u.m97223r0(1, 2, Float.valueOf(c31571u.f130377C0 * c31571u.f130411b0.f130067e));
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m97112c(int i13, boolean z4) {
        m97110a();
        return z4 ? 1 : -1;
    }
}
