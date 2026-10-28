package lb;

import java.util.Iterator;
import m83.AbstractC25265s;
import mc3.AbstractC25438d;
import mc3.C25437c;
import mc3.InterfaceC25435a;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: lb.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C23565h implements InterfaceC33687a, InterfaceC25435a {

    /* JADX INFO: renamed from: E */
    public final C23564g f93457E;

    /* JADX INFO: renamed from: w */
    public final InterfaceC33687a f93458w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC25435a f93459x;

    /* JADX INFO: renamed from: y */
    public InterfaceC30063j f93460y;

    /* JADX INFO: renamed from: z */
    public Throwable f93461z;

    public C23565h(InterfaceC33687a delegate) {
        C25437c c25437cM74669a = AbstractC25438d.m74669a();
        AbstractC22676k.m65750j(delegate, "delegate");
        this.f93458w = delegate;
        this.f93459x = c25437cM74669a;
        this.f93457E = new C23564g(this);
    }

    @Override // mc3.InterfaceC25435a
    /* JADX INFO: renamed from: b */
    public final Object mo68211b(InterfaceC30057d interfaceC30057d) {
        return this.f93459x.mo68211b(interfaceC30057d);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        C23564g c23564g = this.f93457E;
        if (c23564g != null) {
            c23564g.m8i(-1);
        }
        this.f93458w.close();
    }

    @Override // p500tb.InterfaceC33687a
    /* JADX INFO: renamed from: g1 */
    public final InterfaceC33689c mo68212g1(String sql) {
        AbstractC22676k.m65750j(sql, "sql");
        C23564g c23564g = this.f93457E;
        if (c23564g == null) {
            return this.f93458w.mo68212g1(sql);
        }
        Object objM2c = c23564g.m2c(sql);
        AbstractC22676k.m65747g(objM2c);
        return new C23563f((InterfaceC33689c) objM2c);
    }

    @Override // mc3.InterfaceC25435a
    /* JADX INFO: renamed from: h */
    public final boolean mo68213h() {
        return this.f93459x.mo68213h();
    }

    @Override // mc3.InterfaceC25435a
    /* JADX INFO: renamed from: i */
    public final void mo68214i(Object obj) {
        this.f93459x.mo68214i(null);
    }

    /* JADX INFO: renamed from: k */
    public final void m68215k(StringBuilder sb4) {
        int i13;
        C23564g c23564g = this.f93457E;
        if (this.f93460y == null && this.f93461z == null) {
            sb4.append("\t\tStatus: Free connection");
            sb4.append('\n');
        } else {
            sb4.append("\t\tStatus: Acquired connection");
            sb4.append('\n');
            InterfaceC30063j interfaceC30063j = this.f93460y;
            if (interfaceC30063j != null) {
                sb4.append("\t\tCoroutine: " + interfaceC30063j);
                sb4.append('\n');
            }
            Throwable th3 = this.f93461z;
            if (th3 != null) {
                sb4.append("\t\tAcquired:");
                sb4.append('\n');
                Iterator it = AbstractC25265s.m74161z0(AbstractC39414r.m125894m0(AbstractC29125c.m88514W(th3)), 1).iterator();
                while (it.hasNext()) {
                    sb4.append("\t\t" + ((String) it.next()));
                    sb4.append('\n');
                }
            }
        }
        if (c23564g != null) {
            StringBuilder sb5 = new StringBuilder("\t\tPrepared Statement Cache Size: ");
            synchronized (c23564g.f13c) {
                i13 = c23564g.f14d;
            }
            sb5.append(i13);
            sb4.append(sb5.toString());
            sb4.append('\n');
        }
    }

    public final String toString() {
        return this.f93458w.toString();
    }

    @Override // mc3.InterfaceC25435a
    public final boolean tryLock() {
        return this.f93459x.tryLock();
    }

    @Override // p500tb.InterfaceC33687a
    /* JADX INFO: renamed from: v */
    public final boolean mo68216v() {
        return this.f93458w.mo68216v();
    }
}
