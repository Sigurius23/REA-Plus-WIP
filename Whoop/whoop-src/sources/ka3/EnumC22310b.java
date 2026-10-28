package ka3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ka3.b */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC22310b {

    /* JADX INFO: renamed from: w */
    public static final EnumC22310b f87071w;

    /* JADX INFO: renamed from: x */
    public static final EnumC22310b f87072x;

    /* JADX INFO: renamed from: y */
    public static final EnumC22310b f87073y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC22310b[] f87074z;

    static {
        EnumC22310b enumC22310b = new EnumC22310b("INFLEXIBLE", 0);
        f87071w = enumC22310b;
        EnumC22310b enumC22310b2 = new EnumC22310b("FLEXIBLE_UPPER_BOUND", 1);
        f87072x = enumC22310b2;
        EnumC22310b enumC22310b3 = new EnumC22310b("FLEXIBLE_LOWER_BOUND", 2);
        f87073y = enumC22310b3;
        EnumC22310b[] enumC22310bArr = {enumC22310b, enumC22310b2, enumC22310b3};
        f87074z = enumC22310bArr;
        AbstractC15751g.m44468u(enumC22310bArr);
    }

    public static EnumC22310b valueOf(String str) {
        return (EnumC22310b) Enum.valueOf(EnumC22310b.class, str);
    }

    public static EnumC22310b[] values() {
        return (EnumC22310b[]) f87074z.clone();
    }
}
