package c33;

import java.util.concurrent.ThreadFactory;
import live.hms.video.factories.HappyEyeballsDns;
import live.hms.video.utils.HMSCoroutineScope;

/* JADX INFO: renamed from: c33.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ThreadFactoryC3934a implements ThreadFactory {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16064w;

    public /* synthetic */ ThreadFactoryC3934a(int i13) {
        this.f16064w = i13;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f16064w) {
            case 0:
                Thread thread = new Thread(runnable, "stream-audio-thread");
                thread.setDaemon(true);
                return thread;
            case 1:
                return HappyEyeballsDns.defaultExecutor_delegate$lambda$10$lambda$8(runnable);
            case 2:
                return HMSCoroutineScope.executor$lambda$0(runnable);
            default:
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
        }
    }
}
