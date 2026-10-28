package p368og;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: og.b */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC27905b {

    /* JADX INFO: renamed from: E */
    public static final EnumC27905b f112502E;

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ EnumC27905b[] f112503F;

    /* JADX INFO: renamed from: w */
    public static final EnumC27905b f112504w;

    /* JADX INFO: renamed from: x */
    public static final EnumC27905b f112505x;

    /* JADX INFO: renamed from: y */
    public static final EnumC27905b f112506y;

    /* JADX INFO: renamed from: z */
    public static final EnumC27905b f112507z;

    static {
        EnumC27905b enumC27905b = new EnumC27905b("Error", 0);
        f112504w = enumC27905b;
        EnumC27905b enumC27905b2 = new EnumC27905b("Warning", 1);
        f112505x = enumC27905b2;
        EnumC27905b enumC27905b3 = new EnumC27905b("Info", 2);
        f112506y = enumC27905b3;
        EnumC27905b enumC27905b4 = new EnumC27905b("Debug", 3);
        f112507z = enumC27905b4;
        EnumC27905b enumC27905b5 = new EnumC27905b("Trace", 4);
        f112502E = enumC27905b5;
        EnumC27905b[] enumC27905bArr = {enumC27905b, enumC27905b2, enumC27905b3, enumC27905b4, enumC27905b5};
        f112503F = enumC27905bArr;
        AbstractC15751g.m44468u(enumC27905bArr);
    }

    public static EnumC27905b valueOf(String str) {
        return (EnumC27905b) Enum.valueOf(EnumC27905b.class, str);
    }

    public static EnumC27905b[] values() {
        return (EnumC27905b[]) f112503F.clone();
    }
}
