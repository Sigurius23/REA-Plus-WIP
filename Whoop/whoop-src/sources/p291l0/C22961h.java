package p291l0;

import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;

/* JADX INFO: renamed from: l0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C22961h implements InterfaceC22968j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f90612a;

    /* JADX INFO: renamed from: b */
    public final float f90613b;

    public C22961h(int i13) {
        this.f90612a = i13;
        switch (i13) {
            case 1:
                this.f90613b = 0;
                break;
            case 2:
                this.f90613b = 0;
                break;
            case 3:
                this.f90613b = 0;
                break;
            default:
                this.f90613b = 0;
                break;
        }
    }

    @Override // p291l0.InterfaceC22965i, p291l0.InterfaceC22974l
    /* JADX INFO: renamed from: a */
    public final float mo66735a() {
        switch (this.f90612a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.f90613b;
    }

    @Override // p291l0.InterfaceC22974l
    /* JADX INFO: renamed from: b */
    public final void mo66728b(InterfaceC39171c interfaceC39171c, int i13, int[] iArr, int[] iArr2) {
        switch (this.f90612a) {
            case 0:
                AbstractC22977m.m66740c(i13, iArr, iArr2, false);
                break;
            case 1:
                AbstractC22977m.m66743f(i13, iArr, iArr2, false);
                break;
            case 2:
                AbstractC22977m.m66744g(i13, iArr, iArr2, false);
                break;
            default:
                AbstractC22977m.m66745h(i13, iArr, iArr2, false);
                break;
        }
    }

    @Override // p291l0.InterfaceC22965i
    /* JADX INFO: renamed from: c */
    public final void mo66713c(InterfaceC39171c interfaceC39171c, int i13, int[] iArr, EnumC39181m enumC39181m, int[] iArr2) {
        switch (this.f90612a) {
            case 0:
                if (enumC39181m != EnumC39181m.f168423w) {
                    AbstractC22977m.m66740c(i13, iArr, iArr2, true);
                } else {
                    AbstractC22977m.m66740c(i13, iArr, iArr2, false);
                }
                break;
            case 1:
                if (enumC39181m != EnumC39181m.f168423w) {
                    AbstractC22977m.m66743f(i13, iArr, iArr2, true);
                } else {
                    AbstractC22977m.m66743f(i13, iArr, iArr2, false);
                }
                break;
            case 2:
                if (enumC39181m != EnumC39181m.f168423w) {
                    AbstractC22977m.m66744g(i13, iArr, iArr2, true);
                } else {
                    AbstractC22977m.m66744g(i13, iArr, iArr2, false);
                }
                break;
            default:
                if (enumC39181m != EnumC39181m.f168423w) {
                    AbstractC22977m.m66745h(i13, iArr, iArr2, true);
                } else {
                    AbstractC22977m.m66745h(i13, iArr, iArr2, false);
                }
                break;
        }
    }

    public final String toString() {
        switch (this.f90612a) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}
