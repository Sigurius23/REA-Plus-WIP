package p218ic;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ic.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC18371m0 {

    /* JADX INFO: renamed from: E */
    public static final EnumC18371m0 f71512E;

    /* JADX INFO: renamed from: F */
    public static final EnumC18371m0 f71513F;

    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ EnumC18371m0[] f71514G;

    /* JADX INFO: renamed from: w */
    public static final EnumC18371m0 f71515w;

    /* JADX INFO: renamed from: x */
    public static final EnumC18371m0 f71516x;

    /* JADX INFO: renamed from: y */
    public static final EnumC18371m0 f71517y;

    /* JADX INFO: renamed from: z */
    public static final EnumC18371m0 f71518z;

    static {
        EnumC18371m0 enumC18371m0 = new EnumC18371m0("ENQUEUED", 0);
        f71515w = enumC18371m0;
        EnumC18371m0 enumC18371m1 = new EnumC18371m0("RUNNING", 1);
        f71516x = enumC18371m1;
        EnumC18371m0 enumC18371m2 = new EnumC18371m0("SUCCEEDED", 2);
        f71517y = enumC18371m2;
        EnumC18371m0 enumC18371m3 = new EnumC18371m0("FAILED", 3);
        f71518z = enumC18371m3;
        EnumC18371m0 enumC18371m4 = new EnumC18371m0("BLOCKED", 4);
        f71512E = enumC18371m4;
        EnumC18371m0 enumC18371m5 = new EnumC18371m0("CANCELLED", 5);
        f71513F = enumC18371m5;
        EnumC18371m0[] enumC18371m0Arr = {enumC18371m0, enumC18371m1, enumC18371m2, enumC18371m3, enumC18371m4, enumC18371m5};
        f71514G = enumC18371m0Arr;
        AbstractC15751g.m44468u(enumC18371m0Arr);
    }

    public static EnumC18371m0 valueOf(String str) {
        return (EnumC18371m0) Enum.valueOf(EnumC18371m0.class, str);
    }

    public static EnumC18371m0[] values() {
        return (EnumC18371m0[]) f71514G.clone();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m52871a() {
        return this == f71517y || this == f71518z || this == f71513F;
    }
}
