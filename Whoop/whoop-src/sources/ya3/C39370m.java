package ya3;

import y00.AbstractC38963t7;

/* JADX INFO: renamed from: ya3.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C39370m {

    /* JADX INFO: renamed from: c */
    public static final C39370m f169416c = new C39370m(1, "SUCCESS");

    /* JADX INFO: renamed from: a */
    public final int f169417a;

    /* JADX INFO: renamed from: b */
    public final String f169418b;

    public C39370m(int i13, String str) {
        if (i13 == 0) {
            m125547a(3);
            throw null;
        }
        this.f169417a = i13;
        this.f169418b = str;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0031  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m125547a(int i13) {
        String str = (i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4) ? 3 : 2];
        if (i13 == 1 || i13 == 2) {
            objArr[0] = "debugMessage";
        } else if (i13 == 3) {
            objArr[0] = "success";
        } else if (i13 != 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
        } else {
            objArr[0] = "debugMessage";
        }
        switch (i13) {
            case 1:
            case 2:
            case 3:
            case 4:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                break;
            case 5:
                objArr[1] = "getResult";
                break;
            case 6:
                objArr[1] = "getDebugMessage";
                break;
            default:
                objArr[1] = "success";
                break;
        }
        if (i13 == 1) {
            objArr[2] = "incompatible";
        } else if (i13 == 2) {
            objArr[2] = "conflict";
        } else if (i13 == 3 || i13 == 4) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i13 != 1 && i13 != 2 && i13 != 3 && i13 != 4) {
            throw new IllegalStateException(str2);
        }
        throw new IllegalArgumentException(str2);
    }

    /* JADX INFO: renamed from: c */
    public static C39370m m125548c(String str) {
        return new C39370m(2, str);
    }

    /* JADX INFO: renamed from: b */
    public final int m125549b() {
        int i13 = this.f169417a;
        if (i13 != 0) {
            return i13;
        }
        m125547a(5);
        throw null;
    }

    public final String toString() {
        return AbstractC38963t7.m124396z(this.f169417a) + ": " + this.f169418b;
    }
}
