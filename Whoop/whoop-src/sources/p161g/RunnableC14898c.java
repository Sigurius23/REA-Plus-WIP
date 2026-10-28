package p161g;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC14898c implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f55568w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractActivityC14909l f55569x;

    public /* synthetic */ RunnableC14898c(AbstractActivityC14909l abstractActivityC14909l, int i13) {
        this.f55568w = i13;
        this.f55569x = abstractActivityC14909l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f55568w) {
            case 0:
                this.f55569x.invalidateMenu();
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e5) {
                    if (!AbstractC22676k.m65745e(e5.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e5;
                    }
                    return;
                } catch (NullPointerException e13) {
                    if (!AbstractC22676k.m65745e(e13.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e13;
                    }
                    return;
                }
        }
    }
}
