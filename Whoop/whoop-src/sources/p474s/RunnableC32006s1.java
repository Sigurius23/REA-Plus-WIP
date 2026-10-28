package p474s;

/* JADX INFO: renamed from: s.s1 */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC32006s1 implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f132819w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C32018v1 f132820x;

    public /* synthetic */ RunnableC32006s1(C32018v1 c32018v1, int i13) {
        this.f132819w = i13;
        this.f132820x = c32018v1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f132819w) {
            case 0:
                C31974k1 c31974k1 = this.f132820x.f132874y;
                if (c31974k1 != null) {
                    c31974k1.setListSelectionHidden(true);
                    c31974k1.requestLayout();
                }
                break;
            default:
                C32018v1 c32018v1 = this.f132820x;
                C31974k1 c31974k2 = c32018v1.f132874y;
                if (c31974k2 != null && c31974k2.isAttachedToWindow() && c32018v1.f132874y.getCount() > c32018v1.f132874y.getChildCount() && c32018v1.f132874y.getChildCount() <= c32018v1.f132858M) {
                    c32018v1.f132871Z.setInputMethodMode(2);
                    c32018v1.mo94785c();
                    break;
                }
                break;
        }
    }
}
