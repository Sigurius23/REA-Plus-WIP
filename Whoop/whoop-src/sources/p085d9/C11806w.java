package p085d9;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import tm.C33941s;

/* JADX INFO: renamed from: d9.w */
/* JADX INFO: loaded from: classes5.dex */
public final class C11806w {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38330a;

    /* JADX INFO: renamed from: b */
    public final Handler f38331b;

    /* JADX INFO: renamed from: c */
    public final Object f38332c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f38333d;

    public C11806w(C33941s c33941s) {
        this.f38330a = 1;
        this.f38333d = c33941s;
        this.f38331b = new Handler();
        this.f38332c = new C11805v(this, 1);
    }

    /* JADX INFO: renamed from: a */
    public final void m31628a(AudioTrack audioTrack) {
        switch (this.f38330a) {
            case 0:
                audioTrack.unregisterStreamEventCallback((C11805v) this.f38332c);
                this.f38331b.removeCallbacksAndMessages(null);
                break;
            default:
                audioTrack.unregisterStreamEventCallback((C11805v) this.f38332c);
                this.f38331b.removeCallbacksAndMessages(null);
                break;
        }
    }

    public C11806w(C11807x c11807x) {
        this.f38330a = 0;
        this.f38333d = c11807x;
        this.f38331b = new Handler(Looper.myLooper());
        this.f38332c = new C11805v(this, 0);
    }
}
