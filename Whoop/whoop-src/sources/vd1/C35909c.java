package vd1;

import c93.InterfaceC4351m;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import io.sentry.InterfaceC20313d6;
import java.util.concurrent.ScheduledFuture;
import m83.AbstractC25265s;
import p073cq.InterfaceC11035d;
import p073cq.InterfaceC11037f;
import p668z1.AbstractC39963l;
import p692zt.C41097b0;
import p692zt.C41119w;
import p73.InterfaceC28961b;
import ud3.AbstractC34798a0;
import ud3.InterfaceC34853z;
import x30.C37900j1;
import zd3.C40571o;

/* JADX INFO: renamed from: vd1.c */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C35909c implements InterfaceC28961b, InterfaceC34853z, InterfaceC20313d6, InterfaceC11037f, InterfaceC11035d {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f152880w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f152881x;

    public /* synthetic */ C35909c(Object obj, int i13) {
        this.f152880w = i13;
        this.f152881x = obj;
    }

    /* JADX INFO: renamed from: a */
    public void m114042a() {
        switch (this.f152880w) {
            case 3:
                C37900j1 c37900j1 = (C37900j1) this.f152881x;
                synchronized (AbstractC39963l.f172462c) {
                    AbstractC39963l.f172468i = AbstractC25265s.m74124b1((Iterable) AbstractC39963l.f172468i, c37900j1);
                }
                AbstractC39963l.m128161a();
                return;
            default:
                InterfaceC4351m interfaceC4351m = (InterfaceC4351m) this.f152881x;
                synchronized (AbstractC39963l.f172462c) {
                    AbstractC39963l.f172467h = AbstractC25265s.m74124b1((Iterable) AbstractC39963l.f172467h, interfaceC4351m);
                }
                return;
        }
    }

    @Override // p73.InterfaceC28961b
    public void accept(Object obj) {
        C35910d.m114044B((C35908b) this.f152881x, obj);
    }

    @Override // ud3.InterfaceC34853z
    /* JADX INFO: renamed from: b */
    public AbstractC34798a0 mo8619b(C40571o c40571o) {
        return (AbstractC34798a0) this.f152881x;
    }

    @Override // p073cq.InterfaceC11037f
    public void onSuccess(Object obj) {
        boolean z4;
        C41119w c41119w = (C41119w) obj;
        if (!((FirebaseMessaging) this.f152881x).f21619e.m37077c() || c41119w.f177255h.m133482a() == null) {
            return;
        }
        synchronized (c41119w) {
            z4 = c41119w.f177254g;
        }
        if (z4) {
            return;
        }
        c41119w.m133488f(0L);
    }

    @Override // p073cq.InterfaceC11035d
    /* JADX INFO: renamed from: q */
    public void mo944q(Task task) {
        switch (this.f152880w) {
            case 6:
                ((C41097b0) this.f152881x).f177180b.m29689d(null);
                break;
            default:
                ((ScheduledFuture) this.f152881x).cancel(false);
                break;
        }
    }
}
