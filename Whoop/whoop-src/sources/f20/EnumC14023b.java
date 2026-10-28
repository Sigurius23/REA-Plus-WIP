package f20;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: f20.b */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC14023b {

    /* JADX INFO: renamed from: w */
    public static final EnumC14023b f50045w;

    /* JADX INFO: renamed from: x */
    public static final EnumC14023b f50046x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC14023b[] f50047y;

    static {
        EnumC14023b enumC14023b = new EnumC14023b("Full", 0);
        f50045w = enumC14023b;
        EnumC14023b enumC14023b2 = new EnumC14023b("Lite", 1);
        f50046x = enumC14023b2;
        EnumC14023b[] enumC14023bArr = {enumC14023b, enumC14023b2};
        f50047y = enumC14023bArr;
        AbstractC15751g.m44468u(enumC14023bArr);
    }

    public static EnumC14023b valueOf(String str) {
        return (EnumC14023b) Enum.valueOf(EnumC14023b.class, str);
    }

    public static EnumC14023b[] values() {
        return (EnumC14023b[]) f50047y.clone();
    }
}
