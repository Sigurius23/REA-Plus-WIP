package p291l0;

import p636y3.InterfaceC39171c;

/* JADX INFO: renamed from: l0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C22957g implements InterfaceC22974l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f90601a;

    @Override // p291l0.InterfaceC22974l
    /* JADX INFO: renamed from: b */
    public final void mo66728b(InterfaceC39171c interfaceC39171c, int i13, int[] iArr, int[] iArr2) {
        switch (this.f90601a) {
            case 0:
                AbstractC22977m.m66742e(i13, iArr, iArr2, false);
                break;
            default:
                AbstractC22977m.m66741d(iArr, iArr2, false);
                break;
        }
    }

    public final String toString() {
        switch (this.f90601a) {
            case 0:
                return "Arrangement#Bottom";
            default:
                return "Arrangement#Top";
        }
    }
}
