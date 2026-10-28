package t23;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: t23.c4 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC33372c4 {

    /* JADX INFO: renamed from: w */
    public static final EnumC33372c4 f139322w;

    /* JADX INFO: renamed from: x */
    public static final EnumC33372c4 f139323x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC33372c4[] f139324y;

    static {
        EnumC33372c4 enumC33372c4 = new EnumC33372c4("LEGACY_BEHAVIOUR", 0);
        f139322w = enumC33372c4;
        EnumC33372c4 enumC33372c5 = new EnumC33372c4("PUBLISHER_CONNECTED", 1);
        f139323x = enumC33372c5;
        EnumC33372c4[] enumC33372c4Arr = {enumC33372c4, enumC33372c5};
        f139324y = enumC33372c4Arr;
        AbstractC15751g.m44468u(enumC33372c4Arr);
    }

    public static EnumC33372c4 valueOf(String str) {
        return (EnumC33372c4) Enum.valueOf(EnumC33372c4.class, str);
    }

    public static EnumC33372c4[] values() {
        return (EnumC33372c4[]) f139324y.clone();
    }
}
