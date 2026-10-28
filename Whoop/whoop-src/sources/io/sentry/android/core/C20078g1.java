package io.sentry.android.core;

import i63.AbstractC18171j;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: io.sentry.android.core.g1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20078g1 extends AbstractC18171j {
    @Override // i63.AbstractC18171j
    /* JADX INFO: renamed from: c */
    public final void mo52170c(boolean z4) {
        super.mo52170c(z4);
        if (z4) {
            m52168a("android.webkit.WebView");
            m52168a("android.widget.VideoView");
            m52168a("androidx.camera.view.PreviewView");
            m52168a("androidx.media3.ui.PlayerView");
            m52168a("com.google.android.exoplayer2.ui.PlayerView");
            m52168a("com.google.android.exoplayer2.ui.StyledPlayerView");
            return;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f70498b;
        copyOnWriteArraySet.remove("android.webkit.WebView");
        copyOnWriteArraySet.remove("android.widget.VideoView");
        copyOnWriteArraySet.remove("androidx.camera.view.PreviewView");
        copyOnWriteArraySet.remove("androidx.media3.ui.PlayerView");
        copyOnWriteArraySet.remove("com.google.android.exoplayer2.ui.PlayerView");
        copyOnWriteArraySet.remove("com.google.android.exoplayer2.ui.StyledPlayerView");
    }

    @Override // i63.AbstractC18171j
    /* JADX INFO: renamed from: e */
    public final void mo52172e() {
    }
}
