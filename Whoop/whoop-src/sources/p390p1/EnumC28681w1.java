package p390p1;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: p1.w1 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC28681w1 {

    /* JADX INFO: renamed from: E */
    public static final EnumC28681w1 f116011E;

    /* JADX INFO: renamed from: F */
    public static final EnumC28681w1 f116012F;

    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ EnumC28681w1[] f116013G;

    /* JADX INFO: renamed from: w */
    public static final EnumC28681w1 f116014w;

    /* JADX INFO: renamed from: x */
    public static final EnumC28681w1 f116015x;

    /* JADX INFO: renamed from: y */
    public static final EnumC28681w1 f116016y;

    /* JADX INFO: renamed from: z */
    public static final EnumC28681w1 f116017z;

    static {
        EnumC28681w1 enumC28681w1 = new EnumC28681w1("ShutDown", 0);
        f116014w = enumC28681w1;
        EnumC28681w1 enumC28681w2 = new EnumC28681w1("ShuttingDown", 1);
        f116015x = enumC28681w2;
        EnumC28681w1 enumC28681w3 = new EnumC28681w1("Inactive", 2);
        f116016y = enumC28681w3;
        EnumC28681w1 enumC28681w4 = new EnumC28681w1("InactivePendingWork", 3);
        f116017z = enumC28681w4;
        EnumC28681w1 enumC28681w5 = new EnumC28681w1("Idle", 4);
        f116011E = enumC28681w5;
        EnumC28681w1 enumC28681w6 = new EnumC28681w1("PendingWork", 5);
        f116012F = enumC28681w6;
        EnumC28681w1[] enumC28681w1Arr = {enumC28681w1, enumC28681w2, enumC28681w3, enumC28681w4, enumC28681w5, enumC28681w6};
        f116013G = enumC28681w1Arr;
        AbstractC15751g.m44468u(enumC28681w1Arr);
    }

    public static EnumC28681w1 valueOf(String str) {
        return (EnumC28681w1) Enum.valueOf(EnumC28681w1.class, str);
    }

    public static EnumC28681w1[] values() {
        return (EnumC28681w1[]) f116013G.clone();
    }
}
