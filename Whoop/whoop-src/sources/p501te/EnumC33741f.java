package p501te;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: te.f */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC33741f {

    /* JADX INFO: renamed from: w */
    public static final EnumC33741f f141128w;

    /* JADX INFO: renamed from: x */
    public static final EnumC33741f f141129x;

    /* JADX INFO: renamed from: y */
    public static final EnumC33741f f141130y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC33741f[] f141131z;

    static {
        EnumC33741f enumC33741f = new EnumC33741f("Client", 0);
        f141128w = enumC33741f;
        EnumC33741f enumC33741f2 = new EnumC33741f("Server", 1);
        f141129x = enumC33741f2;
        EnumC33741f enumC33741f3 = new EnumC33741f("Unknown", 2);
        f141130y = enumC33741f3;
        EnumC33741f[] enumC33741fArr = {enumC33741f, enumC33741f2, enumC33741f3};
        f141131z = enumC33741fArr;
        AbstractC15751g.m44468u(enumC33741fArr);
    }

    public static EnumC33741f valueOf(String str) {
        return (EnumC33741f) Enum.valueOf(EnumC33741f.class, str);
    }

    public static EnumC33741f[] values() {
        return (EnumC33741f[]) f141131z.clone();
    }
}
