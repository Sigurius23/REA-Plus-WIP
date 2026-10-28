package p316m1;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: m1.y */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC24927y {

    /* JADX INFO: renamed from: w */
    public static final EnumC24927y f97616w;

    /* JADX INFO: renamed from: x */
    public static final EnumC24927y f97617x;

    /* JADX INFO: renamed from: y */
    public static final EnumC24927y f97618y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC24927y[] f97619z;

    static {
        EnumC24927y enumC24927y = new EnumC24927y("Focused", 0);
        f97616w = enumC24927y;
        EnumC24927y enumC24927y2 = new EnumC24927y("UnfocusedEmpty", 1);
        f97617x = enumC24927y2;
        EnumC24927y enumC24927y3 = new EnumC24927y("UnfocusedNotEmpty", 2);
        f97618y = enumC24927y3;
        EnumC24927y[] enumC24927yArr = {enumC24927y, enumC24927y2, enumC24927y3};
        f97619z = enumC24927yArr;
        AbstractC15751g.m44468u(enumC24927yArr);
    }

    public static EnumC24927y valueOf(String str) {
        return (EnumC24927y) Enum.valueOf(EnumC24927y.class, str);
    }

    public static EnumC24927y[] values() {
        return (EnumC24927y[]) f97619z.clone();
    }
}
