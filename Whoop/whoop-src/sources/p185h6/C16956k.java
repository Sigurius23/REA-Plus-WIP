package p185h6;

import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;

/* JADX INFO: renamed from: h6.k */
/* JADX INFO: loaded from: classes.dex */
public final class C16956k implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ AbstractC1638x f65088w;

    public C16956k(EmojiCompatInitializer emojiCompatInitializer, AbstractC1638x abstractC1638x) {
        this.f65088w = abstractC1638x;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(InterfaceC1585g0 interfaceC1585g0) {
        AbstractC16947b.m47703a(Looper.getMainLooper()).postDelayed(new RunnableC16959n(0), 500L);
        this.f65088w.mo4988d(this);
    }
}
