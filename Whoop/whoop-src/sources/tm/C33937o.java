package tm;

import android.media.AudioTrack;

/* JADX INFO: renamed from: tm.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C33937o extends Thread {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ AudioTrack f142228w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C33941s f142229x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33937o(C33941s c33941s, AudioTrack audioTrack) {
        super("ExoPlayer:AudioTrackReleaseThread");
        this.f142229x = c33941s;
        this.f142228w = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C33941s c33941s = this.f142229x;
        AudioTrack audioTrack = this.f142228w;
        try {
            audioTrack.flush();
            audioTrack.release();
        } finally {
            c33941s.f142278h.open();
        }
    }
}
