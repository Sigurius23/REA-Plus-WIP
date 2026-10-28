package qc3;

import rc3.C31236a;

/* JADX INFO: renamed from: qc3.q0 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC30267q0 {
    /* JADX INFO: renamed from: b */
    default void mo92521b(C31236a c31236a) {
        mo92528l(c31236a != null ? Integer.valueOf(c31236a.m96188a(9)) : null);
    }

    /* JADX INFO: renamed from: c */
    Integer mo92522c();

    /* JADX INFO: renamed from: d */
    Integer mo92523d();

    /* JADX INFO: renamed from: g */
    Integer mo92524g();

    /* JADX INFO: renamed from: h */
    void mo92525h(Integer num);

    /* JADX INFO: renamed from: j */
    EnumC30237f mo92526j();

    /* JADX INFO: renamed from: k */
    void mo92527k(Integer num);

    /* JADX INFO: renamed from: l */
    void mo92528l(Integer num);

    /* JADX INFO: renamed from: n */
    Integer mo92529n();

    /* JADX INFO: renamed from: o */
    void mo92530o(Integer num);

    /* JADX INFO: renamed from: p */
    default C31236a mo92531p() {
        Integer numMo92522c = mo92522c();
        if (numMo92522c != null) {
            return new C31236a(numMo92522c.intValue(), 9);
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    void mo92532t(EnumC30237f enumC30237f);

    /* JADX INFO: renamed from: u */
    void mo92533u(Integer num);

    /* JADX INFO: renamed from: v */
    Integer mo92534v();
}
