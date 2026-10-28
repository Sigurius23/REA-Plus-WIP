package p005a3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: a3.y */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0267y {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ EnumC0267y[] f911E;

    /* JADX INFO: renamed from: w */
    public static final EnumC0267y f912w;

    /* JADX INFO: renamed from: x */
    public static final EnumC0267y f913x;

    /* JADX INFO: renamed from: y */
    public static final EnumC0267y f914y;

    /* JADX INFO: renamed from: z */
    public static final EnumC0267y f915z;

    static {
        EnumC0267y enumC0267y = new EnumC0267y("LookaheadMeasurement", 0);
        f912w = enumC0267y;
        EnumC0267y enumC0267y2 = new EnumC0267y("LookaheadPlacement", 1);
        f913x = enumC0267y2;
        EnumC0267y enumC0267y3 = new EnumC0267y("Measurement", 2);
        f914y = enumC0267y3;
        EnumC0267y enumC0267y4 = new EnumC0267y("Placement", 3);
        f915z = enumC0267y4;
        EnumC0267y[] enumC0267yArr = {enumC0267y, enumC0267y2, enumC0267y3, enumC0267y4};
        f911E = enumC0267yArr;
        AbstractC15751g.m44468u(enumC0267yArr);
    }

    public static EnumC0267y valueOf(String str) {
        return (EnumC0267y) Enum.valueOf(EnumC0267y.class, str);
    }

    public static EnumC0267y[] values() {
        return (EnumC0267y[]) f911E.clone();
    }
}
