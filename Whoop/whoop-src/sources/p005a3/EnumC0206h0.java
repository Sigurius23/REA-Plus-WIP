package p005a3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: a3.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0206h0 {

    /* JADX INFO: renamed from: E */
    public static final EnumC0206h0 f689E;

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ EnumC0206h0[] f690F;

    /* JADX INFO: renamed from: w */
    public static final EnumC0206h0 f691w;

    /* JADX INFO: renamed from: x */
    public static final EnumC0206h0 f692x;

    /* JADX INFO: renamed from: y */
    public static final EnumC0206h0 f693y;

    /* JADX INFO: renamed from: z */
    public static final EnumC0206h0 f694z;

    static {
        EnumC0206h0 enumC0206h0 = new EnumC0206h0("Measuring", 0);
        f691w = enumC0206h0;
        EnumC0206h0 enumC0206h1 = new EnumC0206h0("LookaheadMeasuring", 1);
        f692x = enumC0206h1;
        EnumC0206h0 enumC0206h2 = new EnumC0206h0("LayingOut", 2);
        f693y = enumC0206h2;
        EnumC0206h0 enumC0206h3 = new EnumC0206h0("LookaheadLayingOut", 3);
        f694z = enumC0206h3;
        EnumC0206h0 enumC0206h4 = new EnumC0206h0("Idle", 4);
        f689E = enumC0206h4;
        EnumC0206h0[] enumC0206h0Arr = {enumC0206h0, enumC0206h1, enumC0206h2, enumC0206h3, enumC0206h4};
        f690F = enumC0206h0Arr;
        AbstractC15751g.m44468u(enumC0206h0Arr);
    }

    public static EnumC0206h0 valueOf(String str) {
        return (EnumC0206h0) Enum.valueOf(EnumC0206h0.class, str);
    }

    public static EnumC0206h0[] values() {
        return (EnumC0206h0[]) f690F.clone();
    }
}
