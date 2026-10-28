package p390p1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p002a0.C0059w0;
import p037bu.C3632c;
import p537ux.C35331f0;
import p602x1.C37821g;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: p1.o */
/* JADX INFO: loaded from: classes.dex */
public final class C28647o extends AbstractC28667t {

    /* JADX INFO: renamed from: a */
    public final long f115860a;

    /* JADX INFO: renamed from: b */
    public final boolean f115861b;

    /* JADX INFO: renamed from: c */
    public final boolean f115862c;

    /* JADX INFO: renamed from: d */
    public HashSet f115863d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f115864e = new LinkedHashSet();

    /* JADX INFO: renamed from: f */
    public final C28633k1 f115865f = new C28633k1(C37821g.f161967z, C28676v0.f115977z);

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C28655q f115866g;

    public C28647o(C28655q c28655q, long j7, boolean z4, boolean z13, C3632c c3632c) {
        this.f115866g = c28655q;
        this.f115860a = j7;
        this.f115861b = z4;
        this.f115862c = z13;
    }

    @Override // p390p1.AbstractC28667t
    /* JADX INFO: renamed from: a */
    public final void mo87090a(C28679w c28679w, InterfaceC4351m interfaceC4351m) {
        this.f115866g.f115907b.mo87090a(c28679w, interfaceC4351m);
    }

    @Override // p390p1.AbstractC28667t
    /* JADX INFO: renamed from: b */
    public final C0059w0 mo87091b(C28679w c28679w, C35331f0 c35331f0, InterfaceC4351m interfaceC4351m) {
        return this.f115866g.f115907b.mo87091b(c28679w, c35331f0, interfaceC4351m);
    }

    @Override // p390p1.AbstractC28667t
    /* JADX INFO: renamed from: c */
    public final void mo87092c() {
        this.f115866g.f115885A--;
    }

    @Override // p390p1.AbstractC28667t
    /* JADX INFO: renamed from: d */
    public final boolean mo87093d() {
        return this.f115866g.f115907b.mo87093d();
    }

    @Override // p390p1.AbstractC28667t
    /* JADX INFO: renamed from: e */
    public final boolean mo87094e() {
        return this.f115861b;
    }

    @Override // p390p1.AbstractC28667t
    /* JADX INFO: renamed from: f */
    public final boolean mo87095f() {
        return this.f115862c;
    }

    @Override // p390p1.AbstractC28667t
    /* JADX INFO: renamed from: g */
    public final long mo87096g() {
        return this.f115860a;
    }

    @Override // p390p1.AbstractC28667t
    /* JADX INFO: renamed from: h */
    public final InterfaceC28663s mo87097h() {
        return this.f115866g.f115913h;
    }

    @Override // p390p1.AbstractC28667t
    /* JADX INFO: renamed from: i */
    public final InterfaceC28653p1 mo87098i() {
        return (InterfaceC28653p1) this.f115865f.getValue();
    }

    @Override // p390p1.AbstractC28667t
    /* JADX INFO: renamed from: j */
    public final InterfaceC30063j mo87099j() {
        return this.f115866g.f115907b.mo87099j();
    }

    @Override // p390p1.AbstractC28667t
    /* JADX INFO: renamed from: k */
    public final void mo87100k(C28679w c28679w) {
        C28655q c28655q = this.f115866g;
        c28655q.f115907b.mo87100k(c28655q.f115913h);
        c28655q.f115907b.mo87100k(c28679w);
    }

    @Override // p390p1.AbstractC28667t
    /* JADX INFO: renamed from: l */
    public final AbstractC28684x0 mo87101l(AbstractC28687y0 abstractC28687y0) {
        return this.f115866g.f115907b.mo87101l(abstractC28687y0);
    }

    @Override // p390p1.AbstractC28667t
    /* JADX INFO: renamed from: m */
    public final C0059w0 mo87102m(C28679w c28679w, C35331f0 c35331f0, C0059w0 c0059w0) {
        return this.f115866g.f115907b.mo87102m(c28679w, c35331f0, c0059w0);
    }

    @Override // p390p1.AbstractC28667t
    /* JADX INFO: renamed from: n */
    public final void mo87103n(Set set) {
        HashSet hashSet = this.f115863d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f115863d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // p390p1.AbstractC28667t
    /* JADX INFO: renamed from: o */
    public final void mo87104o(C28655q c28655q) {
        this.f115864e.add(c28655q);
    }

    @Override // p390p1.AbstractC28667t
    /* JADX INFO: renamed from: p */
    public final void mo87105p(C28677v1 c28677v1) {
        this.f115866g.f115907b.mo87105p(c28677v1);
    }

    @Override // p390p1.AbstractC28667t
    /* JADX INFO: renamed from: q */
    public final void mo87106q(C28679w c28679w) {
        this.f115866g.f115907b.mo87106q(c28679w);
    }

    @Override // p390p1.AbstractC28667t
    /* JADX INFO: renamed from: r */
    public final void mo87107r() {
        this.f115866g.f115885A++;
    }

    @Override // p390p1.AbstractC28667t
    /* JADX INFO: renamed from: s */
    public final void mo87108s(Composer composer) {
        HashSet<Set> hashSet = this.f115863d;
        if (hashSet != null) {
            for (Set set : hashSet) {
                AbstractC22676k.m65748h(composer, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                set.remove(((C28655q) composer).f115908c);
            }
        }
        LinkedHashSet linkedHashSet = this.f115864e;
        AbstractC22681m0.m65770a(linkedHashSet);
        linkedHashSet.remove(composer);
    }

    @Override // p390p1.AbstractC28667t
    /* JADX INFO: renamed from: t */
    public final void mo87109t(C28679w c28679w) {
        this.f115866g.f115907b.mo87109t(c28679w);
    }

    /* JADX INFO: renamed from: u */
    public final void m87110u() {
        LinkedHashSet<C28655q> linkedHashSet = this.f115864e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.f115863d;
        if (hashSet != null) {
            for (C28655q c28655q : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(c28655q.f115908c);
                }
            }
        }
        linkedHashSet.clear();
    }
}
