package bc3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: bc3.d0 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC2998d0 {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ EnumC2998d0[] f12003E;

    /* JADX INFO: renamed from: w */
    public static final EnumC2998d0 f12004w;

    /* JADX INFO: renamed from: x */
    public static final EnumC2998d0 f12005x;

    /* JADX INFO: renamed from: y */
    public static final EnumC2998d0 f12006y;

    /* JADX INFO: renamed from: z */
    public static final EnumC2998d0 f12007z;

    static {
        EnumC2998d0 enumC2998d0 = new EnumC2998d0("DEFAULT", 0);
        f12004w = enumC2998d0;
        EnumC2998d0 enumC2998d1 = new EnumC2998d0("LAZY", 1);
        f12005x = enumC2998d1;
        EnumC2998d0 enumC2998d2 = new EnumC2998d0("ATOMIC", 2);
        f12006y = enumC2998d2;
        EnumC2998d0 enumC2998d3 = new EnumC2998d0("UNDISPATCHED", 3);
        f12007z = enumC2998d3;
        EnumC2998d0[] enumC2998d0Arr = {enumC2998d0, enumC2998d1, enumC2998d2, enumC2998d3};
        f12003E = enumC2998d0Arr;
        AbstractC15751g.m44468u(enumC2998d0Arr);
    }

    public static EnumC2998d0 valueOf(String str) {
        return (EnumC2998d0) Enum.valueOf(EnumC2998d0.class, str);
    }

    public static EnumC2998d0[] values() {
        return (EnumC2998d0[]) f12003E.clone();
    }
}
