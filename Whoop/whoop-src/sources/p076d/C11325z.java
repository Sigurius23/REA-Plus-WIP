package p076d;

import java.io.IOException;
import ro.C31624i;

/* JADX INFO: renamed from: d.z */
/* JADX INFO: loaded from: classes5.dex */
public final class C11325z extends AbstractC11267a {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f36280c = 1;

    /* JADX INFO: renamed from: d */
    public int f36281d;

    public /* synthetic */ C11325z() {
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: c */
    public final int mo30479c(boolean z4) {
        switch (this.f36280c) {
            case 0:
                if (this.f36281d < 0) {
                    int iMo30479c = 0;
                    for (InterfaceC11307q interfaceC11307q : this.f36181a) {
                        iMo30479c += interfaceC11307q.mo30482d().mo30476j().mo30479c(true);
                    }
                    this.f36281d = iMo30479c;
                }
                break;
            default:
                if (this.f36281d < 0) {
                    int iMo30479c2 = 0;
                    for (InterfaceC11307q interfaceC11307q2 : this.f36181a) {
                        iMo30479c2 += interfaceC11307q2.mo30482d().mo30477k().mo30479c(true);
                    }
                    this.f36281d = iMo30479c2;
                }
                break;
        }
        return C31624i.m97696b(this.f36281d, z4);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: f */
    public final void mo30480f(C31624i c31624i, boolean z4) throws IOException {
        switch (this.f36280c) {
            case 0:
                c31624i.m97709n(49, z4);
                C11309r c11309rMo30515c = c31624i.mo30515c();
                InterfaceC11307q[] interfaceC11307qArr = this.f36181a;
                int length = interfaceC11307qArr.length;
                int i13 = this.f36281d;
                int i14 = 0;
                if (i13 >= 0 || length > 16) {
                    if (i13 < 0) {
                        int iMo30479c = 0;
                        for (InterfaceC11307q interfaceC11307q : interfaceC11307qArr) {
                            iMo30479c += interfaceC11307q.mo30482d().mo30476j().mo30479c(true);
                        }
                        this.f36281d = iMo30479c;
                    }
                    c31624i.m97705d(this.f36281d);
                    while (i14 < length) {
                        interfaceC11307qArr[i14].mo30482d().mo30476j().mo30480f(c11309rMo30515c, true);
                        i14++;
                    }
                } else {
                    AbstractC11272b1[] abstractC11272b1Arr = new AbstractC11272b1[length];
                    int iMo30479c2 = 0;
                    for (int i15 = 0; i15 < length; i15++) {
                        AbstractC11272b1 abstractC11272b1Mo30476j = interfaceC11307qArr[i15].mo30482d().mo30476j();
                        abstractC11272b1Arr[i15] = abstractC11272b1Mo30476j;
                        iMo30479c2 += abstractC11272b1Mo30476j.mo30479c(true);
                    }
                    this.f36281d = iMo30479c2;
                    c31624i.m97705d(iMo30479c2);
                    while (i14 < length) {
                        abstractC11272b1Arr[i14].mo30480f(c11309rMo30515c, true);
                        i14++;
                    }
                }
                break;
            default:
                c31624i.m97709n(49, z4);
                C11326z0 c11326z0Mo30533l = c31624i.mo30533l();
                InterfaceC11307q[] interfaceC11307qArr2 = this.f36181a;
                int length2 = interfaceC11307qArr2.length;
                int i16 = this.f36281d;
                int i17 = 0;
                if (i16 >= 0 || length2 > 16) {
                    if (i16 < 0) {
                        int iMo30479c3 = 0;
                        for (InterfaceC11307q interfaceC11307q2 : interfaceC11307qArr2) {
                            iMo30479c3 += interfaceC11307q2.mo30482d().mo30477k().mo30479c(true);
                        }
                        this.f36281d = iMo30479c3;
                    }
                    c31624i.m97705d(this.f36281d);
                    while (i17 < length2) {
                        c11326z0Mo30533l.mo30514I(interfaceC11307qArr2[i17].mo30482d());
                        i17++;
                    }
                } else {
                    AbstractC11272b1[] abstractC11272b1Arr2 = new AbstractC11272b1[length2];
                    int iMo30479c4 = 0;
                    for (int i18 = 0; i18 < length2; i18++) {
                        AbstractC11272b1 abstractC11272b1Mo30477k = interfaceC11307qArr2[i18].mo30482d().mo30477k();
                        abstractC11272b1Arr2[i18] = abstractC11272b1Mo30477k;
                        iMo30479c4 += abstractC11272b1Mo30477k.mo30479c(true);
                    }
                    this.f36281d = iMo30479c4;
                    c31624i.m97705d(iMo30479c4);
                    while (i17 < length2) {
                        c11326z0Mo30533l.mo30514I(abstractC11272b1Arr2[i17]);
                        i17++;
                    }
                }
                break;
        }
    }

    @Override // p076d.AbstractC11267a, p076d.AbstractC11272b1
    /* JADX INFO: renamed from: j */
    public AbstractC11272b1 mo30476j() {
        switch (this.f36280c) {
            case 0:
                return this.f36182b != null ? this : super.mo30476j();
            default:
                return super.mo30476j();
        }
    }

    @Override // p076d.AbstractC11267a, p076d.AbstractC11272b1
    /* JADX INFO: renamed from: k */
    public final AbstractC11272b1 mo30477k() {
        int i13 = this.f36280c;
        return this;
    }

    public /* synthetic */ C11325z(C11311s c11311s) {
        super(c11311s);
    }

    public /* synthetic */ C11325z(InterfaceC11307q[] interfaceC11307qArr) {
        super(interfaceC11307qArr);
    }

    public /* synthetic */ C11325z(InterfaceC11307q[] interfaceC11307qArr, InterfaceC11307q[] interfaceC11307qArr2) {
        super(interfaceC11307qArr, interfaceC11307qArr2);
    }
}
