package s40;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: s40.x0 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC32188x0 {

    /* JADX INFO: renamed from: E */
    public static final EnumC32188x0 f133305E;

    /* JADX INFO: renamed from: F */
    public static final EnumC32188x0 f133306F;

    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ EnumC32188x0[] f133307G;

    /* JADX INFO: renamed from: w */
    public static final EnumC32188x0 f133308w;

    /* JADX INFO: renamed from: x */
    public static final EnumC32188x0 f133309x;

    /* JADX INFO: renamed from: y */
    public static final EnumC32188x0 f133310y;

    /* JADX INFO: renamed from: z */
    public static final EnumC32188x0 f133311z;

    static {
        EnumC32188x0 enumC32188x0 = new EnumC32188x0("Line1", 0);
        f133308w = enumC32188x0;
        EnumC32188x0 enumC32188x1 = new EnumC32188x0("Line2", 1);
        f133309x = enumC32188x1;
        EnumC32188x0 enumC32188x2 = new EnumC32188x0("City", 2);
        f133310y = enumC32188x2;
        EnumC32188x0 enumC32188x3 = new EnumC32188x0("PostalCode", 3);
        f133311z = enumC32188x3;
        EnumC32188x0 enumC32188x4 = new EnumC32188x0("State", 4);
        f133305E = enumC32188x4;
        EnumC32188x0 enumC32188x5 = new EnumC32188x0("Phone", 5);
        f133306F = enumC32188x5;
        EnumC32188x0[] enumC32188x0Arr = {enumC32188x0, enumC32188x1, enumC32188x2, enumC32188x3, enumC32188x4, enumC32188x5};
        f133307G = enumC32188x0Arr;
        AbstractC15751g.m44468u(enumC32188x0Arr);
    }

    public static EnumC32188x0 valueOf(String str) {
        return (EnumC32188x0) Enum.valueOf(EnumC32188x0.class, str);
    }

    public static EnumC32188x0[] values() {
        return (EnumC32188x0[]) f133307G.clone();
    }
}
