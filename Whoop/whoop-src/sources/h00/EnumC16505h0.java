package h00;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: h00.h0 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC16505h0 {

    /* JADX INFO: renamed from: E */
    public static final EnumC16505h0 f63463E;

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ EnumC16505h0[] f63464F;

    /* JADX INFO: renamed from: w */
    public static final EnumC16505h0 f63465w;

    /* JADX INFO: renamed from: x */
    public static final EnumC16505h0 f63466x;

    /* JADX INFO: renamed from: y */
    public static final EnumC16505h0 f63467y;

    /* JADX INFO: renamed from: z */
    public static final EnumC16505h0 f63468z;

    static {
        EnumC16505h0 enumC16505h0 = new EnumC16505h0("InlineOptionalWithPhoneFirst", 0);
        f63465w = enumC16505h0;
        EnumC16505h0 enumC16505h1 = new EnumC16505h0("InlineOptional", 1);
        f63466x = enumC16505h1;
        EnumC16505h0 enumC16505h2 = new EnumC16505h0("Inline", 2);
        f63467y = enumC16505h2;
        EnumC16505h0 enumC16505h3 = new EnumC16505h0("InlineWithDefaultOptIn", 3);
        f63468z = enumC16505h3;
        EnumC16505h0 enumC16505h4 = new EnumC16505h0("Full", 4);
        f63463E = enumC16505h4;
        EnumC16505h0[] enumC16505h0Arr = {enumC16505h0, enumC16505h1, enumC16505h2, enumC16505h3, enumC16505h4};
        f63464F = enumC16505h0Arr;
        AbstractC15751g.m44468u(enumC16505h0Arr);
    }

    public static EnumC16505h0 valueOf(String str) {
        return (EnumC16505h0) Enum.valueOf(EnumC16505h0.class, str);
    }

    public static EnumC16505h0[] values() {
        return (EnumC16505h0[]) f63464F.clone();
    }
}
