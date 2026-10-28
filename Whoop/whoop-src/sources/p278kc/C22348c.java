package p278kc;

import ad3.C0783z;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import bc3.InterfaceC3027k1;
import com.google.crypto.tink.internal.C5101l0;
import hg3.AbstractC17269i;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import mc.AbstractC25406c;
import mc.AbstractC25412i;
import mc.C25404a;
import mc.C25405b;
import mc.C25411h;
import mc.InterfaceC25409f;
import p014aj.C0928c;
import p034bl.C3363c;
import p073cq.RunnableC11044m;
import p185h6.RunnableC16957l;
import p218ic.C18348b;
import p218ic.C18354e;
import p218ic.C18389w;
import p218ic.EnumC18371m0;
import p249jc.C21577g;
import p249jc.C21586l;
import p249jc.InterfaceC21571d;
import p249jc.InterfaceC21581i;
import p364oc.C27815i;
import p420qc.C30200j;
import p420qc.C30207q;
import p457rc.AbstractC31225h;
import p581we.C37199o;
import p715kotlin.jvm.internal.AbstractC22676k;
import sc.C32352b;
import sc.InterfaceC32351a;

/* JADX INFO: renamed from: kc.c */
/* JADX INFO: loaded from: classes.dex */
public final class C22348c implements InterfaceC21581i, InterfaceC25409f, InterfaceC21571d {

    /* JADX INFO: renamed from: O */
    public static final String f87194O = C18389w.m52887f("GreedyScheduler");

    /* JADX INFO: renamed from: F */
    public final C37199o f87196F;

    /* JADX INFO: renamed from: G */
    public final C21577g f87197G;

    /* JADX INFO: renamed from: H */
    public final C5101l0 f87198H;

    /* JADX INFO: renamed from: I */
    public final C18348b f87199I;

    /* JADX INFO: renamed from: J */
    public final HashMap f87200J;

    /* JADX INFO: renamed from: K */
    public Boolean f87201K;

    /* JADX INFO: renamed from: L */
    public final C25411h f87202L;

    /* JADX INFO: renamed from: M */
    public final InterfaceC32351a f87203M;

    /* JADX INFO: renamed from: N */
    public final C3363c f87204N;

    /* JADX INFO: renamed from: w */
    public final Context f87205w;

    /* JADX INFO: renamed from: y */
    public final C22346a f87207y;

    /* JADX INFO: renamed from: z */
    public boolean f87208z;

    /* JADX INFO: renamed from: x */
    public final HashMap f87206x = new HashMap();

    /* JADX INFO: renamed from: E */
    public final Object f87195E = new Object();

    public C22348c(Context context, C18348b c18348b, C27815i c27815i, C21577g c21577g, C5101l0 c5101l0, InterfaceC32351a interfaceC32351a) {
        C0928c c0928c = new C0928c(18, (byte) 0);
        C37199o c37199o = new C37199o();
        c37199o.f159040w = c0928c;
        c37199o.f159041x = new Object();
        this.f87196F = c37199o;
        this.f87200J = new HashMap();
        this.f87205w = context;
        C0783z c0783z = c18348b.f71452g;
        this.f87207y = new C22346a(this, c0783z, c18348b.f71449d);
        this.f87204N = new C3363c(c0783z, c5101l0);
        this.f87203M = interfaceC32351a;
        this.f87202L = new C25411h(c27815i);
        this.f87199I = c18348b;
        this.f87197G = c21577g;
        this.f87198H = c5101l0;
    }

    @Override // p249jc.InterfaceC21581i
    /* JADX INFO: renamed from: a */
    public final void mo60623a(String workSpecId) {
        List<C21586l> listM2306P;
        Runnable runnable;
        String str = f87194O;
        if (this.f87201K == null) {
            this.f87201K = Boolean.valueOf(AbstractC31225h.m96166a(this.f87205w, this.f87199I));
        }
        if (!this.f87201K.booleanValue()) {
            C18389w.m52886d().m52891e(str, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f87208z) {
            this.f87197G.m60619a(this);
            this.f87208z = true;
        }
        C18389w.m52886d().m52888a(str, "Cancelling work ID " + workSpecId);
        C22346a c22346a = this.f87207y;
        if (c22346a != null && (runnable = (Runnable) c22346a.f87191d.remove(workSpecId)) != null) {
            ((Handler) c22346a.f87189b.f2818x).removeCallbacks(runnable);
        }
        C37199o c37199o = this.f87196F;
        c37199o.getClass();
        AbstractC22676k.m65750j(workSpecId, "workSpecId");
        synchronized (c37199o.f159041x) {
            listM2306P = ((C0928c) c37199o.f159040w).m2306P(workSpecId);
        }
        for (C21586l c21586l : listM2306P) {
            this.f87204N.m9712a(c21586l);
            C5101l0 c5101l0 = this.f87198H;
            c5101l0.getClass();
            c5101l0.m16061j0(c21586l, -512);
        }
    }

    @Override // p249jc.InterfaceC21571d
    /* JADX INFO: renamed from: b */
    public final void mo5525b(C30200j c30200j, boolean z4) {
        InterfaceC3027k1 interfaceC3027k1;
        C21586l c21586lM119211Q = this.f87196F.m119211Q(c30200j);
        if (c21586lM119211Q != null) {
            this.f87204N.m9712a(c21586lM119211Q);
        }
        synchronized (this.f87195E) {
            interfaceC3027k1 = (InterfaceC3027k1) this.f87206x.remove(c30200j);
        }
        if (interfaceC3027k1 != null) {
            C18389w.m52886d().m52888a(f87194O, "Stopping tracking for " + c30200j);
            interfaceC3027k1.cancel((CancellationException) null);
        }
        if (z4) {
            return;
        }
        synchronized (this.f87195E) {
            this.f87200J.remove(c30200j);
        }
    }

    @Override // p249jc.InterfaceC21581i
    /* JADX INFO: renamed from: c */
    public final boolean mo60624c() {
        return false;
    }

    @Override // mc.InterfaceC25409f
    /* JADX INFO: renamed from: d */
    public final void mo64225d(C30207q c30207q, AbstractC25406c abstractC25406c) {
        C30200j c30200jM48869P = AbstractC17269i.m48869P(c30207q);
        boolean z4 = abstractC25406c instanceof C25404a;
        C5101l0 c5101l0 = this.f87198H;
        C3363c c3363c = this.f87204N;
        String str = f87194O;
        C37199o c37199o = this.f87196F;
        if (z4) {
            if (c37199o.m119228k(c30200jM48869P)) {
                return;
            }
            C18389w.m52886d().m52888a(str, "Constraints met: Scheduling work ID " + c30200jM48869P);
            C21586l c21586lM119216V = c37199o.m119216V(c30200jM48869P);
            c3363c.m9714c(c21586lM119216V);
            ((InterfaceC32351a) c5101l0.f21444y).m100716a(new RunnableC16957l(c5101l0, c21586lM119216V, null, 5));
            return;
        }
        C18389w.m52886d().m52888a(str, "Constraints not met: Cancelling work ID " + c30200jM48869P);
        C21586l c21586lM119211Q = c37199o.m119211Q(c30200jM48869P);
        if (c21586lM119211Q != null) {
            c3363c.m9712a(c21586lM119211Q);
            int iM74593a = ((C25405b) abstractC25406c).m74593a();
            c5101l0.getClass();
            c5101l0.m16061j0(c21586lM119211Q, iM74593a);
        }
    }

    @Override // p249jc.InterfaceC21581i
    /* JADX INFO: renamed from: e */
    public final void mo60625e(C30207q... c30207qArr) {
        long jMax;
        if (this.f87201K == null) {
            this.f87201K = Boolean.valueOf(AbstractC31225h.m96166a(this.f87205w, this.f87199I));
        }
        if (!this.f87201K.booleanValue()) {
            C18389w.m52886d().m52891e(f87194O, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.f87208z) {
            this.f87197G.m60619a(this);
            this.f87208z = true;
        }
        HashSet<C30207q> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C30207q c30207q : c30207qArr) {
            if (!this.f87196F.m119228k(AbstractC17269i.m48869P(c30207q))) {
                synchronized (this.f87195E) {
                    try {
                        C30200j c30200jM48869P = AbstractC17269i.m48869P(c30207q);
                        C22347b c22347b = (C22347b) this.f87200J.get(c30200jM48869P);
                        if (c22347b == null) {
                            int i13 = c30207q.f123644k;
                            this.f87199I.f71449d.getClass();
                            c22347b = new C22347b(i13, System.currentTimeMillis());
                            this.f87200J.put(c30200jM48869P, c22347b);
                        }
                        jMax = (((long) Math.max((c30207q.f123644k - c22347b.f87192a) - 5, 0)) * 30000) + c22347b.f87193b;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                long jMax2 = Math.max(c30207q.m92425a(), jMax);
                this.f87199I.f71449d.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (c30207q.f123635b == EnumC18371m0.f71515w) {
                    if (jCurrentTimeMillis < jMax2) {
                        C22346a c22346a = this.f87207y;
                        if (c22346a != null) {
                            C0783z c0783z = c22346a.f87189b;
                            HashMap map = c22346a.f87191d;
                            Runnable runnable = (Runnable) map.remove(c30207q.f123634a);
                            if (runnable != null) {
                                ((Handler) c0783z.f2818x).removeCallbacks(runnable);
                            }
                            RunnableC11044m runnableC11044m = new RunnableC11044m(9, c22346a, c30207q);
                            map.put(c30207q.f123634a, runnableC11044m);
                            c22346a.f87190c.getClass();
                            ((Handler) c0783z.f2818x).postDelayed(runnableC11044m, jMax2 - System.currentTimeMillis());
                        }
                    } else if (!AbstractC22676k.m65745e(C18354e.f71464j, c30207q.f123643j)) {
                        C18354e c18354e = c30207q.f123643j;
                        if (c18354e.f71468d) {
                            C18389w.m52886d().m52888a(f87194O, "Ignoring " + c30207q + ". Requires device idle.");
                        } else if (c18354e.m52857b()) {
                            C18389w.m52886d().m52888a(f87194O, "Ignoring " + c30207q + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(c30207q);
                            hashSet2.add(c30207q.f123634a);
                        }
                    } else if (!this.f87196F.m119228k(AbstractC17269i.m48869P(c30207q))) {
                        C18389w.m52886d().m52888a(f87194O, "Starting work for " + c30207q.f123634a);
                        C37199o c37199o = this.f87196F;
                        c37199o.getClass();
                        C21586l c21586lM119216V = c37199o.m119216V(AbstractC17269i.m48869P(c30207q));
                        this.f87204N.m9714c(c21586lM119216V);
                        C5101l0 c5101l0 = this.f87198H;
                        ((InterfaceC32351a) c5101l0.f21444y).m100716a(new RunnableC16957l(c5101l0, c21586lM119216V, null, 5));
                    }
                }
            }
        }
        synchronized (this.f87195E) {
            try {
                if (!hashSet.isEmpty()) {
                    C18389w.m52886d().m52888a(f87194O, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    for (C30207q c30207q2 : hashSet) {
                        C30200j c30200jM48869P2 = AbstractC17269i.m48869P(c30207q2);
                        if (!this.f87206x.containsKey(c30200jM48869P2)) {
                            this.f87206x.put(c30200jM48869P2, AbstractC25412i.m74599a(this.f87202L, c30207q2, ((C32352b) this.f87203M).f133916b, this));
                        }
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
