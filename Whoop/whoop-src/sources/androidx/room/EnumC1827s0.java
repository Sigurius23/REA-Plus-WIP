package androidx.room;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.room.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1827s0 {

    /* JADX INFO: renamed from: w */
    public static final EnumC1827s0 f7170w;

    /* JADX INFO: renamed from: x */
    public static final EnumC1827s0 f7171x;

    /* JADX INFO: renamed from: y */
    public static final EnumC1827s0 f7172y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC1827s0[] f7173z;

    static {
        EnumC1827s0 enumC1827s0 = new EnumC1827s0("AUTOMATIC", 0);
        f7170w = enumC1827s0;
        EnumC1827s0 enumC1827s1 = new EnumC1827s0("TRUNCATE", 1);
        f7171x = enumC1827s1;
        EnumC1827s0 enumC1827s2 = new EnumC1827s0("WRITE_AHEAD_LOGGING", 2);
        f7172y = enumC1827s2;
        EnumC1827s0[] enumC1827s0Arr = {enumC1827s0, enumC1827s1, enumC1827s2};
        f7173z = enumC1827s0Arr;
        AbstractC15751g.m44468u(enumC1827s0Arr);
    }

    public static EnumC1827s0 valueOf(String str) {
        return (EnumC1827s0) Enum.valueOf(EnumC1827s0.class, str);
    }

    public static EnumC1827s0[] values() {
        return (EnumC1827s0[]) f7173z.clone();
    }
}
