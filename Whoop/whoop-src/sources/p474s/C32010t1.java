package p474s;

import android.widget.AbsListView;

/* JADX INFO: renamed from: s.t1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C32010t1 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C32018v1 f132827a;

    public C32010t1(C32018v1 c32018v1) {
        this.f132827a = c32018v1;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i13, int i14, int i15) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i13) {
        C32018v1 c32018v1 = this.f132827a;
        RunnableC32006s1 runnableC32006s1 = c32018v1.f132863R;
        C32016v c32016v = c32018v1.f132871Z;
        if (i13 != 1 || c32016v.getInputMethodMode() == 2 || c32016v.getContentView() == null) {
            return;
        }
        c32018v1.f132867V.removeCallbacks(runnableC32006s1);
        runnableC32006s1.run();
    }
}
