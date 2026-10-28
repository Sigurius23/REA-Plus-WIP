package p465rm;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import p031b9.RunnableC2833g0;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: rm.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C31517b implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f130030a = 1;

    /* JADX INFO: renamed from: b */
    public final Handler f130031b;

    /* JADX INFO: renamed from: c */
    public final Object f130032c;

    public C31517b(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f130032c = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        int i13 = AbstractC38065t.f163031a;
        this.f130031b = new Handler(looper, null);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i13) {
        switch (this.f130030a) {
            case 0:
                this.f130031b.post(new RunnableC2833g0(this, i13, 6));
                break;
            default:
                AbstractC38065t.m121900N(this.f130031b, new RunnableC2833g0(this, i13, 10));
                break;
        }
    }

    public C31517b(C31520c c31520c, Handler handler) {
        this.f130032c = c31520c;
        this.f130031b = handler;
    }
}
