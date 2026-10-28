package v30;

import ec3.C13045h2;
import l83.C23454a0;
import p179h.C16351i;
import p236j.C21073l;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v30.d */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C35595d implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f151361w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C35596e f151362x;

    public /* synthetic */ C35595d(C35596e c35596e, int i13) {
        this.f151361w = i13;
        this.f151362x = c35596e;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f151361w) {
            case 0:
                Throwable e5 = (Throwable) obj;
                AbstractC22676k.m65750j(e5, "e");
                this.f151362x.f151364b.mo46112d(e5);
                break;
            case 1:
                C21073l intentSenderRequest = (C21073l) obj;
                AbstractC22676k.m65750j(intentSenderRequest, "intentSenderRequest");
                C35596e c35596e = this.f151362x;
                c35596e.f151364b.mo46110b();
                C16351i c16351i = c35596e.f151369g;
                if (c16351i == null) {
                    AbstractC22676k.m65757q("activityLauncher");
                    throw null;
                }
                c16351i.mo4052a(intentSenderRequest, c35596e.f151363a);
                break;
                break;
            case 2:
                Throwable e13 = (Throwable) obj;
                AbstractC22676k.m65750j(e13, "e");
                C35596e c35596e2 = this.f151362x;
                C13045h2 c13045h2 = c35596e2.f151367e;
                Boolean bool = Boolean.FALSE;
                c13045h2.getClass();
                c13045h2.m36571k(null, bool);
                c35596e2.f151364b.mo46111c(e13);
                break;
            default:
                C21073l it = (C21073l) obj;
                AbstractC22676k.m65750j(it, "it");
                C35596e c35596e3 = this.f151362x;
                C13045h2 c13045h3 = c35596e3.f151367e;
                Boolean bool2 = Boolean.TRUE;
                c13045h3.getClass();
                c13045h3.m36571k(null, bool2);
                c35596e3.f151364b.mo46113e();
                break;
        }
        return C23454a0.f92919a;
    }
}
