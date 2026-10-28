package p312lx;

import mx.C25989b;

/* JADX INFO: renamed from: lx.b */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC24781b implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f96955w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f96956x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f96957y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C24782c f96958z;

    public /* synthetic */ RunnableC24781b(C24782c c24782c, int i13, int i14, int i15) {
        this.f96955w = i15;
        this.f96958z = c24782c;
        this.f96956x = i13;
        this.f96957y = i14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f96955w) {
            case 0:
                ((C25989b) this.f96958z.f96960b).notifyItemRangeChanged(this.f96956x, this.f96957y);
                break;
            case 1:
                ((C25989b) this.f96958z.f96960b).notifyItemRangeInserted(this.f96956x, this.f96957y);
                break;
            default:
                ((C25989b) this.f96958z.f96960b).notifyItemRangeRemoved(this.f96956x, this.f96957y);
                break;
        }
    }
}
