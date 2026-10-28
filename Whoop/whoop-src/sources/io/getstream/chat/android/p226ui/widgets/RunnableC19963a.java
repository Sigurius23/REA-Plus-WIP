package io.getstream.chat.android.p226ui.widgets;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.widgets.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC19963a implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74897w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ EndlessScrollListener f74898x;

    public /* synthetic */ RunnableC19963a(EndlessScrollListener endlessScrollListener, int i13) {
        this.f74897w = i13;
        this.f74898x = endlessScrollListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f74897w) {
            case 0:
                EndlessScrollListener.handleScrollUp$lambda$1(this.f74898x);
                break;
            default:
                EndlessScrollListener.handleScrollDown$lambda$2(this.f74898x);
                break;
        }
    }
}
