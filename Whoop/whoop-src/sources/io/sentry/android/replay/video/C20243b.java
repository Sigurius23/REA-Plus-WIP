package io.sentry.android.replay.video;

import android.media.MediaMuxer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.sentry.android.replay.video.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C20243b {

    /* JADX INFO: renamed from: a */
    public final long f76038a;

    /* JADX INFO: renamed from: b */
    public final MediaMuxer f76039b;

    /* JADX INFO: renamed from: c */
    public boolean f76040c;

    /* JADX INFO: renamed from: d */
    public int f76041d;

    /* JADX INFO: renamed from: e */
    public int f76042e;

    /* JADX INFO: renamed from: f */
    public long f76043f;

    public C20243b(String str, float f13) {
        this.f76038a = (long) (TimeUnit.SECONDS.toMicros(1L) / f13);
        this.f76039b = new MediaMuxer(str, 0);
    }
}
