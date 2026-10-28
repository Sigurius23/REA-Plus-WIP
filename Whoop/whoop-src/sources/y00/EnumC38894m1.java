package y00;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: y00.m1 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC38894m1 {

    /* JADX INFO: renamed from: w */
    public static final EnumC38894m1 f167436w;

    /* JADX INFO: renamed from: x */
    public static final EnumC38894m1 f167437x;

    /* JADX INFO: renamed from: y */
    public static final EnumC38894m1 f167438y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC38894m1[] f167439z;

    static {
        EnumC38894m1 enumC38894m1 = new EnumC38894m1("Enabled", 0);
        f167436w = enumC38894m1;
        EnumC38894m1 enumC38894m2 = new EnumC38894m1("Disabled", 1);
        f167437x = enumC38894m2;
        EnumC38894m1 enumC38894m3 = new EnumC38894m1("NotProvided", 2);
        f167438y = enumC38894m3;
        EnumC38894m1[] enumC38894m1Arr = {enumC38894m1, enumC38894m2, enumC38894m3};
        f167439z = enumC38894m1Arr;
        AbstractC15751g.m44468u(enumC38894m1Arr);
    }

    public static EnumC38894m1 valueOf(String str) {
        return (EnumC38894m1) Enum.valueOf(EnumC38894m1.class, str);
    }

    public static EnumC38894m1[] values() {
        return (EnumC38894m1[]) f167439z.clone();
    }
}
