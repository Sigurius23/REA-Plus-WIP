package hms.webrtc;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public interface NetworkChangeDetectorFactory {
    NetworkChangeDetector create(NetworkChangeDetector.Observer observer, Context context);
}
