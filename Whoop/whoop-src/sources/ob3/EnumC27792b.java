package ob3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ob3.b */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC27792b {

    /* JADX INFO: renamed from: w */
    public static final EnumC27792b f112043w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC27792b[] f112044x;

    static {
        EnumC27792b enumC27792b = new EnumC27792b("FOR_SUBTYPING", 0);
        f112043w = enumC27792b;
        EnumC27792b[] enumC27792bArr = {enumC27792b, new EnumC27792b("FOR_INCORPORATION", 1), new EnumC27792b("FROM_EXPRESSION", 2)};
        f112044x = enumC27792bArr;
        AbstractC15751g.m44468u(enumC27792bArr);
    }

    public static EnumC27792b valueOf(String str) {
        return (EnumC27792b) Enum.valueOf(EnumC27792b.class, str);
    }

    public static EnumC27792b[] values() {
        return (EnumC27792b[]) f112044x.clone();
    }
}
