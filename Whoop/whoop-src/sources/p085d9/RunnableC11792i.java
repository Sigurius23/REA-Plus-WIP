package p085d9;

import io.sentry.internal.debugmeta.C20378c;
import p031b9.C2830f0;
import p031b9.C2871w;
import p031b9.SurfaceHolderCallbackC2821c0;
import p309lo.AbstractC24567y;
import p412q3.C29875i;
import p465rm.C31571u;
import p465rm.SurfaceHolderCallbackC31565r;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: d9.i */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC11792i implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f38239w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f38240x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f38241y;

    public /* synthetic */ RunnableC11792i(Object obj, boolean z4, int i13) {
        this.f38239w = i13;
        this.f38241y = obj;
        this.f38240x = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f38239w;
        boolean z4 = this.f38240x;
        Object obj = this.f38241y;
        switch (i13) {
            case 0:
                SurfaceHolderCallbackC2821c0 surfaceHolderCallbackC2821c0 = (SurfaceHolderCallbackC2821c0) ((C20378c) obj).f76423y;
                int i14 = AbstractC38065t.f163031a;
                C2830f0 c2830f0 = surfaceHolderCallbackC2821c0.f11043w;
                if (c2830f0.f11098A0 != z4) {
                    c2830f0.f11098A0 = z4;
                    c2830f0.f11118N.m121835e(23, new C2871w(z4, 1));
                    break;
                }
                break;
            default:
                SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r = (SurfaceHolderCallbackC31565r) ((C29875i) obj).f122096x;
                int i15 = AbstractC24567y.f95875a;
                C31571u c31571u = surfaceHolderCallbackC31565r.f130359w;
                if (c31571u.f130378D0 != z4) {
                    c31571u.f130378D0 = z4;
                    c31571u.f130395M.m31625i(23, new C2871w(z4, 3));
                    break;
                }
                break;
        }
    }
}
