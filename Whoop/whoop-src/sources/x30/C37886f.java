package x30;

import p412q3.InterfaceC29884r;

/* JADX INFO: renamed from: x30.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C37886f implements InterfaceC29884r {

    /* JADX INFO: renamed from: x */
    public static final C37886f f162232x = new C37886f(0);

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f162233w;

    public /* synthetic */ C37886f(int i13) {
        this.f162233w = i13;
    }

    @Override // p412q3.InterfaceC29884r
    /* JADX INFO: renamed from: n */
    public final int mo15743n(int i13) {
        switch (this.f162233w) {
            case 0:
                if (i13 == 0) {
                    return 0;
                }
                return i13 - (i13 / 3);
            case 1:
                return i13 <= 3 ? i13 : i13 - 3;
            case 2:
                if (i13 <= 4) {
                    return i13;
                }
                if (i13 <= 9) {
                    return i13 - 1;
                }
                return i13 <= 14 ? i13 - 2 : i13 - 3;
            case 3:
                if (i13 <= 4) {
                    return i13;
                }
                return i13 <= 11 ? i13 - 1 : i13 - 2;
            case 4:
                if (i13 <= 4) {
                    return i13;
                }
                if (i13 <= 9) {
                    return i13 - 1;
                }
                if (i13 <= 14) {
                    return i13 - 2;
                }
                return i13 <= 19 ? i13 - 3 : i13 - 4;
            default:
                return i13 - (i13 / 5);
        }
    }

    @Override // p412q3.InterfaceC29884r
    /* JADX INFO: renamed from: x */
    public final int mo15749x(int i13) {
        switch (this.f162233w) {
            case 0:
                if (i13 == 0) {
                    return 0;
                }
                int i14 = (i13 / 2) + i13;
                return i13 % 2 == 0 ? i14 - 1 : i14;
            case 1:
                return i13 <= 2 ? i13 : i13 + 3;
            case 2:
                if (i13 <= 3) {
                    return i13;
                }
                if (i13 <= 7) {
                    return i13 + 1;
                }
                return i13 <= 11 ? i13 + 2 : i13 + 3;
            case 3:
                if (i13 <= 3) {
                    return i13;
                }
                return i13 <= 9 ? i13 + 1 : i13 + 2;
            case 4:
                if (i13 <= 3) {
                    return i13;
                }
                if (i13 <= 7) {
                    return i13 + 1;
                }
                if (i13 <= 11) {
                    return i13 + 2;
                }
                return i13 <= 15 ? i13 + 3 : i13 + 4;
            default:
                return (i13 / 4) + i13;
        }
    }
}
