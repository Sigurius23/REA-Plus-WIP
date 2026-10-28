package p299l9;

import android.net.Uri;
import ga.C15615b;
import gm.C15990r;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import ma.C25362d;
import p031b9.C2852m1;
import p398p9.InterfaceC28985i;
import p470rv.AbstractC31834n;
import p499t9.C33638k;
import p499t9.C33650s;
import p499t9.InterfaceC33639k0;
import p499t9.InterfaceC33644n;
import p674z8.C40171g;
import p674z8.C40177m;
import p674z8.InterfaceC40170f;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: l9.p0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23520p0 implements InterfaceC28985i {

    /* JADX INFO: renamed from: E */
    public final C2852m1 f93093E;

    /* JADX INFO: renamed from: G */
    public volatile boolean f93095G;

    /* JADX INFO: renamed from: I */
    public long f93097I;

    /* JADX INFO: renamed from: J */
    public C40171g f93098J;

    /* JADX INFO: renamed from: K */
    public InterfaceC33639k0 f93099K;

    /* JADX INFO: renamed from: L */
    public boolean f93100L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ C23526s0 f93101M;

    /* JADX INFO: renamed from: w */
    public final Uri f93102w;

    /* JADX INFO: renamed from: x */
    public final C40177m f93103x;

    /* JADX INFO: renamed from: y */
    public final C15990r f93104y;

    /* JADX INFO: renamed from: z */
    public final C23526s0 f93105z;

    /* JADX INFO: renamed from: F */
    public final C33650s f93094F = new C33650s();

    /* JADX INFO: renamed from: H */
    public boolean f93096H = true;

    public C23520p0(C23526s0 c23526s0, Uri uri, InterfaceC40170f interfaceC40170f, C15990r c15990r, C23526s0 c23526s1, C2852m1 c2852m1) {
        this.f93101M = c23526s0;
        this.f93102w = uri;
        this.f93103x = new C40177m(interfaceC40170f);
        this.f93104y = c15990r;
        this.f93105z = c23526s1;
        this.f93093E = c2852m1;
        C23527t.f93159a.getAndIncrement();
        this.f93098J = m68092a(0L);
    }

    /* JADX INFO: renamed from: a */
    public final C40171g m68092a(long j7) {
        Map map = Collections.EMPTY_MAP;
        Map map2 = C23526s0.f93116p0;
        Uri uri = this.f93102w;
        AbstractC35849g.m113809k(uri, "The uri must be set.");
        return new C40171g(uri, 1, null, map2, j7, -1L, null, 6);
    }

    @Override // p398p9.InterfaceC28985i
    /* JADX INFO: renamed from: b */
    public final void mo68093b() {
        InterfaceC40170f c23525s;
        InterfaceC33644n interfaceC33644n;
        int i13;
        int iMo1543i = 0;
        while (iMo1543i == 0 && !this.f93095G) {
            try {
                long j7 = this.f93094F.f140436a;
                C40171g c40171gM68092a = m68092a(j7);
                this.f93098J = c40171gM68092a;
                long jOpen = this.f93103x.open(c40171gM68092a);
                if (this.f93095G) {
                    if (iMo1543i != 1 && this.f93104y.m45142E() != -1) {
                        this.f93094F.f140436a = this.f93104y.m45142E();
                    }
                    AbstractC31834n.m98896e(this.f93103x);
                    return;
                }
                if (jOpen != -1) {
                    jOpen += j7;
                    C23526s0 c23526s0 = this.f93101M;
                    c23526s0.f93130Q.post(new RunnableC23516n0(c23526s0, 0));
                }
                long j13 = jOpen;
                this.f93101M.f93132S = C15615b.m43934b(this.f93103x.f173385w.getResponseHeaders());
                C40177m c40177m = this.f93103x;
                C15615b c15615b = this.f93101M.f93132S;
                if (c15615b == null || (i13 = c15615b.f58628f) == -1) {
                    c23525s = c40177m;
                } else {
                    c23525s = new C23525s(c40177m, i13, this);
                    InterfaceC33639k0 interfaceC33639k0M68097C = this.f93101M.m68097C(new C23524r0(0, true));
                    this.f93099K = interfaceC33639k0M68097C;
                    interfaceC33639k0M68097C.mo36173a(C23526s0.f93117q0);
                }
                this.f93104y.m45146K(c23525s, this.f93102w, this.f93103x.f173385w.getResponseHeaders(), j7, j13, this.f93105z);
                if (this.f93101M.f93132S != null && (interfaceC33644n = (InterfaceC33644n) this.f93104y.f60513y) != null && (interfaceC33644n instanceof C25362d)) {
                    ((C25362d) interfaceC33644n).f99412r = true;
                }
                if (this.f93096H) {
                    C15990r c15990r = this.f93104y;
                    long j14 = this.f93097I;
                    InterfaceC33644n interfaceC33644n2 = (InterfaceC33644n) c15990r.f60513y;
                    interfaceC33644n2.getClass();
                    interfaceC33644n2.mo1540b(j7, j14);
                    this.f93096H = false;
                }
                while (iMo1543i == 0 && !this.f93095G) {
                    try {
                        C2852m1 c2852m1 = this.f93093E;
                        synchronized (c2852m1) {
                            while (!c2852m1.f11320x) {
                                try {
                                    c2852m1.wait();
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                        }
                        C15990r c15990r2 = this.f93104y;
                        C33650s c33650s = this.f93094F;
                        InterfaceC33644n interfaceC33644n3 = (InterfaceC33644n) c15990r2.f60513y;
                        interfaceC33644n3.getClass();
                        C33638k c33638k = (C33638k) c15990r2.f60514z;
                        c33638k.getClass();
                        iMo1543i = interfaceC33644n3.mo1543i(c33638k, c33650s);
                        long jM45142E = this.f93104y.m45142E();
                        if (jM45142E > this.f93101M.f93122I + j7) {
                            C2852m1 c2852m2 = this.f93093E;
                            synchronized (c2852m2) {
                                c2852m2.f11320x = false;
                            }
                            C23526s0 c23526s1 = this.f93101M;
                            c23526s1.f93130Q.post(c23526s1.f93129P);
                            j7 = jM45142E;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (iMo1543i == 1) {
                    iMo1543i = 0;
                } else if (this.f93104y.m45142E() != -1) {
                    this.f93094F.f140436a = this.f93104y.m45142E();
                }
                AbstractC31834n.m98896e(this.f93103x);
            } catch (Throwable th4) {
                if (iMo1543i != 1 && this.f93104y.m45142E() != -1) {
                    this.f93094F.f140436a = this.f93104y.m45142E();
                }
                AbstractC31834n.m98896e(this.f93103x);
                throw th4;
            }
        }
    }

    @Override // p398p9.InterfaceC28985i
    /* JADX INFO: renamed from: c */
    public final void mo68094c() {
        this.f93095G = true;
    }
}
