package fr;

import android.os.SystemClock;

/* JADX INFO: renamed from: fr.b */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC14691b implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f54296w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC14693d f54297x;

    public /* synthetic */ RunnableC14691b(AbstractC14693d abstractC14693d, int i13) {
        this.f54296w = i13;
        this.f54297x = abstractC14693d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f54296w) {
            case 0:
                AbstractC14693d abstractC14693d = this.f54297x;
                if (abstractC14693d.f54311z > 0) {
                    SystemClock.uptimeMillis();
                }
                abstractC14693d.setVisibility(0);
                break;
            default:
                AbstractC14693d abstractC14693d2 = this.f54297x;
                ((AbstractC14702m) abstractC14693d2.getCurrentDrawable()).m42145c(false, false, true);
                if ((abstractC14693d2.getProgressDrawable() == null || !abstractC14693d2.getProgressDrawable().isVisible()) && (abstractC14693d2.getIndeterminateDrawable() == null || !abstractC14693d2.getIndeterminateDrawable().isVisible())) {
                    abstractC14693d2.setVisibility(4);
                }
                abstractC14693d2.getClass();
                break;
        }
    }
}
