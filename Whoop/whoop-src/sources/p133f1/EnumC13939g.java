package p133f1;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: f1.g */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC13939g {

    /* JADX INFO: renamed from: w */
    public static final EnumC13939g f49690w;

    /* JADX INFO: renamed from: x */
    public static final EnumC13939g f49691x;

    /* JADX INFO: renamed from: y */
    public static final EnumC13939g f49692y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC13939g[] f49693z;

    static {
        EnumC13939g enumC13939g = new EnumC13939g("CROSSED", 0);
        f49690w = enumC13939g;
        EnumC13939g enumC13939g2 = new EnumC13939g("NOT_CROSSED", 1);
        f49691x = enumC13939g2;
        EnumC13939g enumC13939g3 = new EnumC13939g("COLLAPSED", 2);
        f49692y = enumC13939g3;
        EnumC13939g[] enumC13939gArr = {enumC13939g, enumC13939g2, enumC13939g3};
        f49693z = enumC13939gArr;
        AbstractC15751g.m44468u(enumC13939gArr);
    }

    public static EnumC13939g valueOf(String str) {
        return (EnumC13939g) Enum.valueOf(EnumC13939g.class, str);
    }

    public static EnumC13939g[] values() {
        return (EnumC13939g[]) f49693z.clone();
    }
}
