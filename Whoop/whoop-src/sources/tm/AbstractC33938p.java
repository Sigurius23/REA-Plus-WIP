package tm;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import sm.C32713f;

/* JADX INFO: renamed from: tm.p */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC33938p {
    /* JADX INFO: renamed from: a */
    public static void m107350a(AudioTrack audioTrack, C32713f c32713f) {
        c32713f.f135996a.getClass();
        LogSessionId logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (logSessionId.equals(logSessionId)) {
            return;
        }
        audioTrack.setLogSessionId(logSessionId);
    }
}
