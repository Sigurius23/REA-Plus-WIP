package p390p1;

import c93.InterfaceC4351m;

/* JADX INFO: renamed from: p1.c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC28599c {
    /* JADX INFO: renamed from: d */
    default void mo699d(Object obj, InterfaceC4351m interfaceC4351m) {
        interfaceC4351m.invoke(mo703i(), obj);
    }

    /* JADX INFO: renamed from: e */
    void mo700e(int i13, int i14, int i15);

    /* JADX INFO: renamed from: f */
    void mo701f(int i13, int i14);

    /* JADX INFO: renamed from: g */
    void mo702g(int i13, Object obj);

    /* JADX INFO: renamed from: h */
    default void mo751h() {
    }

    /* JADX INFO: renamed from: i */
    Object mo703i();

    /* JADX INFO: renamed from: k */
    void mo705k(int i13, Object obj);

    /* JADX INFO: renamed from: l */
    void mo706l(Object obj);

    /* JADX INFO: renamed from: m */
    default void mo707m() {
        Object objMo703i = mo703i();
        InterfaceC28623i interfaceC28623i = objMo703i instanceof InterfaceC28623i ? (InterfaceC28623i) objMo703i : null;
        if (interfaceC28623i != null) {
            interfaceC28623i.mo615e();
        }
    }

    /* JADX INFO: renamed from: p */
    void mo710p();
}
