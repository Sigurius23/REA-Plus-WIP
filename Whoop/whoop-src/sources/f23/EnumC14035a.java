package f23;

import ge3.AbstractC15751g;
import kr.C22786e;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: f23.a */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC14035a {

    /* JADX INFO: renamed from: E */
    public static final EnumC14035a f50084E;

    /* JADX INFO: renamed from: F */
    public static final EnumC14035a f50085F;

    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ EnumC14035a[] f50086G;

    /* JADX INFO: renamed from: w */
    public static final C22786e f50087w;

    /* JADX INFO: renamed from: x */
    public static final EnumC14035a f50088x;

    /* JADX INFO: renamed from: y */
    public static final EnumC14035a f50089y;

    /* JADX INFO: renamed from: z */
    public static final EnumC14035a f50090z;

    static {
        EnumC14035a enumC14035a = new EnumC14035a("NOT_DETECTED", 0);
        f50088x = enumC14035a;
        EnumC14035a enumC14035a2 = new EnumC14035a("UP", 1);
        f50089y = enumC14035a2;
        EnumC14035a enumC14035a3 = new EnumC14035a("DOWN", 2);
        f50090z = enumC14035a3;
        EnumC14035a enumC14035a4 = new EnumC14035a("LEFT", 3);
        f50084E = enumC14035a4;
        EnumC14035a enumC14035a5 = new EnumC14035a("RIGHT", 4);
        f50085F = enumC14035a5;
        EnumC14035a[] enumC14035aArr = {enumC14035a, enumC14035a2, enumC14035a3, enumC14035a4, enumC14035a5};
        f50086G = enumC14035aArr;
        AbstractC15751g.m44468u(enumC14035aArr);
        f50087w = new C22786e(28);
    }

    public static EnumC14035a valueOf(String str) {
        return (EnumC14035a) Enum.valueOf(EnumC14035a.class, str);
    }

    public static EnumC14035a[] values() {
        return (EnumC14035a[]) f50086G.clone();
    }
}
