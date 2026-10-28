package p390p1;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: p1.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC28652p0 {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ EnumC28652p0[] f115878E;

    /* JADX INFO: renamed from: w */
    public static final EnumC28652p0 f115879w;

    /* JADX INFO: renamed from: x */
    public static final EnumC28652p0 f115880x;

    /* JADX INFO: renamed from: y */
    public static final EnumC28652p0 f115881y;

    /* JADX INFO: renamed from: z */
    public static final EnumC28652p0 f115882z;

    static {
        EnumC28652p0 enumC28652p0 = new EnumC28652p0("IGNORED", 0);
        f115879w = enumC28652p0;
        EnumC28652p0 enumC28652p1 = new EnumC28652p0("SCHEDULED", 1);
        f115880x = enumC28652p1;
        EnumC28652p0 enumC28652p2 = new EnumC28652p0("DEFERRED", 2);
        f115881y = enumC28652p2;
        EnumC28652p0 enumC28652p3 = new EnumC28652p0("IMMINENT", 3);
        f115882z = enumC28652p3;
        EnumC28652p0[] enumC28652p0Arr = {enumC28652p0, enumC28652p1, enumC28652p2, enumC28652p3};
        f115878E = enumC28652p0Arr;
        AbstractC15751g.m44468u(enumC28652p0Arr);
    }

    public static EnumC28652p0 valueOf(String str) {
        return (EnumC28652p0) Enum.valueOf(EnumC28652p0.class, str);
    }

    public static EnumC28652p0[] values() {
        return (EnumC28652p0[]) f115878E.clone();
    }
}
