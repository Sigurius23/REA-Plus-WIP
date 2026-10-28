package p040c0;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: c0.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3771q0 {

    /* JADX INFO: renamed from: w */
    public static final EnumC3771q0 f15392w;

    /* JADX INFO: renamed from: x */
    public static final EnumC3771q0 f15393x;

    /* JADX INFO: renamed from: y */
    public static final EnumC3771q0 f15394y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC3771q0[] f15395z;

    static {
        EnumC3771q0 enumC3771q0 = new EnumC3771q0("PreEnter", 0);
        f15392w = enumC3771q0;
        EnumC3771q0 enumC3771q1 = new EnumC3771q0("Visible", 1);
        f15393x = enumC3771q1;
        EnumC3771q0 enumC3771q2 = new EnumC3771q0("PostExit", 2);
        f15394y = enumC3771q2;
        EnumC3771q0[] enumC3771q0Arr = {enumC3771q0, enumC3771q1, enumC3771q2};
        f15395z = enumC3771q0Arr;
        AbstractC15751g.m44468u(enumC3771q0Arr);
    }

    public static EnumC3771q0 valueOf(String str) {
        return (EnumC3771q0) Enum.valueOf(EnumC3771q0.class, str);
    }

    public static EnumC3771q0[] values() {
        return (EnumC3771q0[]) f15395z.clone();
    }
}
