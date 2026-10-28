package kc3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: kc3.b */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC22362b {

    /* JADX INFO: renamed from: E */
    public static final EnumC22362b f87299E;

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ EnumC22362b[] f87300F;

    /* JADX INFO: renamed from: w */
    public static final EnumC22362b f87301w;

    /* JADX INFO: renamed from: x */
    public static final EnumC22362b f87302x;

    /* JADX INFO: renamed from: y */
    public static final EnumC22362b f87303y;

    /* JADX INFO: renamed from: z */
    public static final EnumC22362b f87304z;

    static {
        EnumC22362b enumC22362b = new EnumC22362b("CPU_ACQUIRED", 0);
        f87301w = enumC22362b;
        EnumC22362b enumC22362b2 = new EnumC22362b("BLOCKING", 1);
        f87302x = enumC22362b2;
        EnumC22362b enumC22362b3 = new EnumC22362b("PARKING", 2);
        f87303y = enumC22362b3;
        EnumC22362b enumC22362b4 = new EnumC22362b("DORMANT", 3);
        f87304z = enumC22362b4;
        EnumC22362b enumC22362b5 = new EnumC22362b("TERMINATED", 4);
        f87299E = enumC22362b5;
        EnumC22362b[] enumC22362bArr = {enumC22362b, enumC22362b2, enumC22362b3, enumC22362b4, enumC22362b5};
        f87300F = enumC22362bArr;
        AbstractC15751g.m44468u(enumC22362bArr);
    }

    public static EnumC22362b valueOf(String str) {
        return (EnumC22362b) Enum.valueOf(EnumC22362b.class, str);
    }

    public static EnumC22362b[] values() {
        return (EnumC22362b[]) f87300F.clone();
    }
}
