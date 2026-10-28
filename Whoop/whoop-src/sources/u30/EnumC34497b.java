package u30;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: u30.b */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC34497b {

    /* JADX INFO: renamed from: w */
    public static final EnumC34497b f144990w;

    /* JADX INFO: renamed from: x */
    public static final EnumC34497b f144991x;

    /* JADX INFO: renamed from: y */
    public static final EnumC34497b f144992y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC34497b[] f144993z;

    static {
        EnumC34497b enumC34497b = new EnumC34497b("Automatic", 0);
        f144990w = enumC34497b;
        EnumC34497b enumC34497b2 = new EnumC34497b("Never", 1);
        f144991x = enumC34497b2;
        EnumC34497b enumC34497b3 = new EnumC34497b("Full", 2);
        f144992y = enumC34497b3;
        EnumC34497b[] enumC34497bArr = {enumC34497b, enumC34497b2, enumC34497b3};
        f144993z = enumC34497bArr;
        AbstractC15751g.m44468u(enumC34497bArr);
    }

    public static EnumC34497b valueOf(String str) {
        return (EnumC34497b) Enum.valueOf(EnumC34497b.class, str);
    }

    public static EnumC34497b[] values() {
        return (EnumC34497b[]) f144993z.clone();
    }
}
