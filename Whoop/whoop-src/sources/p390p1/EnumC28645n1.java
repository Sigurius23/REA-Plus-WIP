package p390p1;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: p1.n1 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC28645n1 {

    /* JADX INFO: renamed from: E */
    public static final EnumC28645n1 f115851E;

    /* JADX INFO: renamed from: F */
    public static final EnumC28645n1 f115852F;

    /* JADX INFO: renamed from: G */
    public static final EnumC28645n1 f115853G;

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ EnumC28645n1[] f115854H;

    /* JADX INFO: renamed from: w */
    public static final EnumC28645n1 f115855w;

    /* JADX INFO: renamed from: x */
    public static final EnumC28645n1 f115856x;

    /* JADX INFO: renamed from: y */
    public static final EnumC28645n1 f115857y;

    /* JADX INFO: renamed from: z */
    public static final EnumC28645n1 f115858z;

    static {
        EnumC28645n1 enumC28645n1 = new EnumC28645n1("Invalid", 0);
        f115855w = enumC28645n1;
        EnumC28645n1 enumC28645n2 = new EnumC28645n1("Cancelled", 1);
        f115856x = enumC28645n2;
        EnumC28645n1 enumC28645n3 = new EnumC28645n1("InitialPending", 2);
        f115857y = enumC28645n3;
        EnumC28645n1 enumC28645n4 = new EnumC28645n1("RecomposePending", 3);
        f115858z = enumC28645n4;
        EnumC28645n1 enumC28645n5 = new EnumC28645n1("Recomposing", 4);
        f115851E = enumC28645n5;
        EnumC28645n1 enumC28645n6 = new EnumC28645n1("ApplyPending", 5);
        f115852F = enumC28645n6;
        EnumC28645n1 enumC28645n7 = new EnumC28645n1("Applied", 6);
        f115853G = enumC28645n7;
        EnumC28645n1[] enumC28645n1Arr = {enumC28645n1, enumC28645n2, enumC28645n3, enumC28645n4, enumC28645n5, enumC28645n6, enumC28645n7};
        f115854H = enumC28645n1Arr;
        AbstractC15751g.m44468u(enumC28645n1Arr);
    }

    public static EnumC28645n1 valueOf(String str) {
        return (EnumC28645n1) Enum.valueOf(EnumC28645n1.class, str);
    }

    public static EnumC28645n1[] values() {
        return (EnumC28645n1[]) f115854H.clone();
    }
}
