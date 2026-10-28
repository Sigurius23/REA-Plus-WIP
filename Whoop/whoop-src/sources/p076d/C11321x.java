package p076d;

import java.io.IOException;
import ro.C31624i;

/* JADX INFO: renamed from: d.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C11321x extends AbstractC11290h1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f36273b;

    /* JADX INFO: renamed from: c */
    public int f36274c;

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: c */
    public final int mo30479c(boolean z4) {
        switch (this.f36273b) {
            case 0:
                if (this.f36274c < 0) {
                    int length = this.f36215a.length;
                    int iMo30479c = 0;
                    for (int i13 = 0; i13 < length; i13++) {
                        iMo30479c += this.f36215a[i13].mo30482d().mo30476j().mo30479c(true);
                    }
                    this.f36274c = iMo30479c;
                }
                break;
            default:
                if (this.f36274c < 0) {
                    int length2 = this.f36215a.length;
                    int iMo30479c2 = 0;
                    for (int i14 = 0; i14 < length2; i14++) {
                        iMo30479c2 += this.f36215a[i14].mo30482d().mo30477k().mo30479c(true);
                    }
                    this.f36274c = iMo30479c2;
                }
                break;
        }
        return C31624i.m97696b(this.f36274c, z4);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: f */
    public final void mo30480f(C31624i c31624i, boolean z4) throws IOException {
        switch (this.f36273b) {
            case 0:
                c31624i.m97709n(48, z4);
                C11309r c11309rMo30515c = c31624i.mo30515c();
                InterfaceC11307q[] interfaceC11307qArr = this.f36215a;
                int length = interfaceC11307qArr.length;
                int i13 = this.f36274c;
                int i14 = 0;
                if (i13 >= 0 || length > 16) {
                    if (i13 < 0) {
                        int length2 = interfaceC11307qArr.length;
                        int iMo30479c = 0;
                        for (int i15 = 0; i15 < length2; i15++) {
                            iMo30479c += this.f36215a[i15].mo30482d().mo30476j().mo30479c(true);
                        }
                        this.f36274c = iMo30479c;
                    }
                    c31624i.m97705d(this.f36274c);
                    while (i14 < length) {
                        this.f36215a[i14].mo30482d().mo30476j().mo30480f(c11309rMo30515c, true);
                        i14++;
                    }
                } else {
                    AbstractC11272b1[] abstractC11272b1Arr = new AbstractC11272b1[length];
                    int iMo30479c2 = 0;
                    for (int i16 = 0; i16 < length; i16++) {
                        AbstractC11272b1 abstractC11272b1Mo30476j = this.f36215a[i16].mo30482d().mo30476j();
                        abstractC11272b1Arr[i16] = abstractC11272b1Mo30476j;
                        iMo30479c2 += abstractC11272b1Mo30476j.mo30479c(true);
                    }
                    this.f36274c = iMo30479c2;
                    c31624i.m97705d(iMo30479c2);
                    while (i14 < length) {
                        abstractC11272b1Arr[i14].mo30480f(c11309rMo30515c, true);
                        i14++;
                    }
                }
                break;
            default:
                c31624i.m97709n(48, z4);
                C11326z0 c11326z0Mo30533l = c31624i.mo30533l();
                InterfaceC11307q[] interfaceC11307qArr2 = this.f36215a;
                int length3 = interfaceC11307qArr2.length;
                int i17 = this.f36274c;
                int i18 = 0;
                if (i17 >= 0 || length3 > 16) {
                    if (i17 < 0) {
                        int length4 = interfaceC11307qArr2.length;
                        int iMo30479c3 = 0;
                        for (int i19 = 0; i19 < length4; i19++) {
                            iMo30479c3 += this.f36215a[i19].mo30482d().mo30477k().mo30479c(true);
                        }
                        this.f36274c = iMo30479c3;
                    }
                    c31624i.m97705d(this.f36274c);
                    while (i18 < length3) {
                        c11326z0Mo30533l.mo30514I(this.f36215a[i18].mo30482d());
                        i18++;
                    }
                } else {
                    AbstractC11272b1[] abstractC11272b1Arr2 = new AbstractC11272b1[length3];
                    int iMo30479c4 = 0;
                    for (int i24 = 0; i24 < length3; i24++) {
                        AbstractC11272b1 abstractC11272b1Mo30477k = this.f36215a[i24].mo30482d().mo30477k();
                        abstractC11272b1Arr2[i24] = abstractC11272b1Mo30477k;
                        iMo30479c4 += abstractC11272b1Mo30477k.mo30479c(true);
                    }
                    this.f36274c = iMo30479c4;
                    c31624i.m97705d(iMo30479c4);
                    while (i18 < length3) {
                        c11326z0Mo30533l.mo30514I(abstractC11272b1Arr2[i18]);
                        i18++;
                    }
                }
                break;
        }
    }

    @Override // p076d.AbstractC11290h1, p076d.AbstractC11272b1
    /* JADX INFO: renamed from: j */
    public AbstractC11272b1 mo30476j() {
        switch (this.f36273b) {
            case 0:
                return this;
            default:
                return super.mo30476j();
        }
    }

    @Override // p076d.AbstractC11290h1, p076d.AbstractC11272b1
    /* JADX INFO: renamed from: k */
    public final AbstractC11272b1 mo30477k() {
        int i13 = this.f36273b;
        return this;
    }

    @Override // p076d.AbstractC11290h1
    /* JADX INFO: renamed from: p */
    public final AbstractC11285g mo30490p() {
        switch (this.f36273b) {
            case 0:
                return new C11304o0(C11313t.m30527m(m30506n()), 1);
            default:
                return new C11304o0(C11313t.m30527m(m30506n()), 0);
        }
    }

    @Override // p076d.AbstractC11290h1
    /* JADX INFO: renamed from: q */
    public final AbstractC11322x0 mo30491q() {
        switch (this.f36273b) {
            case 0:
                int length = this.f36215a.length;
                AbstractC11322x0[] abstractC11322x0Arr = new AbstractC11322x0[length];
                for (int i13 = 0; i13 < length; i13++) {
                    abstractC11322x0Arr[i13] = AbstractC11322x0.m30532l(this.f36215a[i13]);
                }
                return new C11297l(C11268a0.m30478m(abstractC11322x0Arr));
            default:
                int length2 = this.f36215a.length;
                AbstractC11322x0[] abstractC11322x0Arr2 = new AbstractC11322x0[length2];
                for (int i14 = 0; i14 < length2; i14++) {
                    abstractC11322x0Arr2[i14] = AbstractC11322x0.m30532l(this.f36215a[i14]);
                }
                return new C11297l(C11268a0.m30478m(abstractC11322x0Arr2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11321x(C11311s c11311s, int i13) {
        super(c11311s);
        this.f36273b = i13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11321x(AbstractC11272b1 abstractC11272b1, int i13) {
        super(abstractC11272b1);
        this.f36273b = i13;
    }

    public C11321x(InterfaceC11307q[] interfaceC11307qArr, int i13) {
        this.f36273b = i13;
        this.f36215a = interfaceC11307qArr;
    }
}
