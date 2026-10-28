package p635y2;

import p636y3.C39169a;

/* JADX INFO: renamed from: y2.u0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C39136u0 implements InterfaceC39124q0 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC39124q0 f168279w;

    /* JADX INFO: renamed from: x */
    public final EnumC39142w0 f168280x;

    /* JADX INFO: renamed from: y */
    public final EnumC39145x0 f168281y;

    public C39136u0(InterfaceC39124q0 interfaceC39124q0, EnumC39142w0 enumC39142w0, EnumC39145x0 enumC39145x0) {
        this.f168279w = interfaceC39124q0;
        this.f168280x = enumC39142w0;
        this.f168281y = enumC39145x0;
    }

    @Override // p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: C */
    public final int mo438C(int i13) {
        return this.f168279w.mo438C(i13);
    }

    @Override // p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: O */
    public final int mo446O(int i13) {
        return this.f168279w.mo446O(i13);
    }

    @Override // p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: Q */
    public final int mo447Q(int i13) {
        return this.f168279w.mo447Q(i13);
    }

    @Override // p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: T */
    public final AbstractC39104j1 mo448T(long j7) {
        EnumC39145x0 enumC39145x0 = this.f168281y;
        EnumC39145x0 enumC39145x1 = EnumC39145x0.f168298w;
        EnumC39142w0 enumC39142w0 = this.f168280x;
        InterfaceC39124q0 interfaceC39124q0 = this.f168279w;
        if (enumC39145x0 == enumC39145x1) {
            return new C39139v0(enumC39142w0 == EnumC39142w0.f168291x ? interfaceC39124q0.mo447Q(C39169a.m124764h(j7)) : interfaceC39124q0.mo446O(C39169a.m124764h(j7)), C39169a.m124760d(j7) ? C39169a.m124764h(j7) : 32767);
        }
        return new C39139v0(C39169a.m124761e(j7) ? C39169a.m124765i(j7) : 32767, enumC39142w0 == EnumC39142w0.f168291x ? interfaceC39124q0.mo449b(C39169a.m124765i(j7)) : interfaceC39124q0.mo438C(C39169a.m124765i(j7)));
    }

    @Override // p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: b */
    public final int mo449b(int i13) {
        return this.f168279w.mo449b(i13);
    }

    @Override // p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: p */
    public final Object mo454p() {
        return this.f168279w.mo454p();
    }
}
