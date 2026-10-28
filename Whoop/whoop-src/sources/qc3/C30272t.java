package qc3;

import rc3.C31236a;
import uc3.InterfaceC34764b;

/* JADX INFO: renamed from: qc3.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C30272t implements InterfaceC30240g, InterfaceC30267q0, InterfaceC34764b {

    /* JADX INFO: renamed from: a */
    public final C30270s f123819a;

    /* JADX INFO: renamed from: b */
    public final C30274u f123820b;

    public C30272t(C30270s c30270s, C30274u c30274u) {
        this.f123819a = c30270s;
        this.f123820b = c30274u;
    }

    @Override // uc3.InterfaceC34764b
    /* JADX INFO: renamed from: a */
    public final Object mo92535a() {
        C30270s c30270s = this.f123819a;
        C30278w c30278w = c30270s.f123814a;
        C30270s c30270s2 = new C30270s(new C30278w(c30278w.f123834a, c30278w.f123835b), c30270s.f123815b, c30270s.f123816c, c30270s.f123817d);
        C30274u c30274u = this.f123820b;
        return new C30272t(c30270s2, new C30274u(c30274u.f123822a, c30274u.f123823b, c30274u.f123824c, c30274u.f123825d, c30274u.f123826e, c30274u.f123827f));
    }

    @Override // qc3.InterfaceC30267q0
    /* JADX INFO: renamed from: b */
    public final void mo92521b(C31236a c31236a) {
        this.f123820b.mo92521b(c31236a);
    }

    @Override // qc3.InterfaceC30267q0
    /* JADX INFO: renamed from: c */
    public final Integer mo92522c() {
        return this.f123820b.f123827f;
    }

    @Override // qc3.InterfaceC30267q0
    /* JADX INFO: renamed from: d */
    public final Integer mo92523d() {
        return this.f123820b.f123823b;
    }

    @Override // qc3.InterfaceC30240g
    /* JADX INFO: renamed from: e */
    public final void mo92513e(Integer num) {
        this.f123819a.f123815b = num;
    }

    @Override // qc3.InterfaceC30240g
    /* JADX INFO: renamed from: f */
    public final void mo92514f(Integer num) {
        this.f123819a.f123816c = num;
    }

    @Override // qc3.InterfaceC30267q0
    /* JADX INFO: renamed from: g */
    public final Integer mo92524g() {
        return this.f123820b.f123826e;
    }

    @Override // qc3.InterfaceC30240g
    public final Integer getDayOfWeek() {
        return this.f123819a.f123816c;
    }

    @Override // qc3.InterfaceC30240g
    public final Integer getDayOfYear() {
        return this.f123819a.f123817d;
    }

    @Override // qc3.InterfaceC30239f1
    public final Integer getYear() {
        return this.f123819a.f123814a.f123834a;
    }

    @Override // qc3.InterfaceC30267q0
    /* JADX INFO: renamed from: h */
    public final void mo92525h(Integer num) {
        this.f123820b.f123826e = num;
    }

    @Override // qc3.InterfaceC30240g
    /* JADX INFO: renamed from: i */
    public final void mo92515i(Integer num) {
        this.f123819a.f123817d = num;
    }

    @Override // qc3.InterfaceC30267q0
    /* JADX INFO: renamed from: j */
    public final EnumC30237f mo92526j() {
        return this.f123820b.f123824c;
    }

    @Override // qc3.InterfaceC30267q0
    /* JADX INFO: renamed from: k */
    public final void mo92527k(Integer num) {
        this.f123820b.f123823b = num;
    }

    @Override // qc3.InterfaceC30267q0
    /* JADX INFO: renamed from: l */
    public final void mo92528l(Integer num) {
        this.f123820b.f123827f = num;
    }

    @Override // qc3.InterfaceC30239f1
    /* JADX INFO: renamed from: m */
    public final void mo92510m(Integer num) {
        this.f123819a.f123814a.f123835b = num;
    }

    @Override // qc3.InterfaceC30267q0
    /* JADX INFO: renamed from: n */
    public final Integer mo92529n() {
        return this.f123820b.f123825d;
    }

    @Override // qc3.InterfaceC30267q0
    /* JADX INFO: renamed from: o */
    public final void mo92530o(Integer num) {
        this.f123820b.f123825d = num;
    }

    @Override // qc3.InterfaceC30267q0
    /* JADX INFO: renamed from: p */
    public final C31236a mo92531p() {
        return this.f123820b.mo92531p();
    }

    @Override // qc3.InterfaceC30240g
    /* JADX INFO: renamed from: q */
    public final Integer mo92516q() {
        return this.f123819a.f123815b;
    }

    @Override // qc3.InterfaceC30239f1
    /* JADX INFO: renamed from: r */
    public final void mo92511r(Integer num) {
        this.f123819a.f123814a.f123834a = num;
    }

    @Override // qc3.InterfaceC30239f1
    /* JADX INFO: renamed from: s */
    public final Integer mo92512s() {
        return this.f123819a.f123814a.f123835b;
    }

    @Override // qc3.InterfaceC30267q0
    /* JADX INFO: renamed from: t */
    public final void mo92532t(EnumC30237f enumC30237f) {
        this.f123820b.f123824c = enumC30237f;
    }

    @Override // qc3.InterfaceC30267q0
    /* JADX INFO: renamed from: u */
    public final void mo92533u(Integer num) {
        this.f123820b.f123822a = num;
    }

    @Override // qc3.InterfaceC30267q0
    /* JADX INFO: renamed from: v */
    public final Integer mo92534v() {
        return this.f123820b.f123822a;
    }
}
