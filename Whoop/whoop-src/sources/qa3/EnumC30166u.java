package qa3;

import wa3.InterfaceC37014q;

/* JADX INFO: renamed from: qa3.u */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC30166u implements InterfaceC37014q {
    AT_MOST_ONCE(0),
    EXACTLY_ONCE(1),
    AT_LEAST_ONCE(2);


    /* JADX INFO: renamed from: w */
    public final int f123435w;

    EnumC30166u(int i13) {
        this.f123435w = i13;
    }

    @Override // wa3.InterfaceC37014q
    /* JADX INFO: renamed from: a */
    public final int mo92274a() {
        return this.f123435w;
    }
}
