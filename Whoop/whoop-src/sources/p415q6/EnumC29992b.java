package p415q6;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: q6.b */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC29992b {

    /* JADX INFO: renamed from: w */
    public static final EnumC29992b f122479w;

    /* JADX INFO: renamed from: x */
    public static final EnumC29992b f122480x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC29992b[] f122481y;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC29992b EF0;

    static {
        EnumC29992b enumC29992b = new EnumC29992b("ACTIVITY", 0);
        EnumC29992b enumC29992b2 = new EnumC29992b("BROADCAST", 1);
        f122479w = enumC29992b2;
        EnumC29992b enumC29992b3 = new EnumC29992b("SERVICE", 2);
        EnumC29992b enumC29992b4 = new EnumC29992b("FOREGROUND_SERVICE", 3);
        EnumC29992b enumC29992b5 = new EnumC29992b("CALLBACK", 4);
        f122480x = enumC29992b5;
        EnumC29992b[] enumC29992bArr = {enumC29992b, enumC29992b2, enumC29992b3, enumC29992b4, enumC29992b5};
        f122481y = enumC29992bArr;
        AbstractC15751g.m44468u(enumC29992bArr);
    }

    public static EnumC29992b valueOf(String str) {
        return (EnumC29992b) Enum.valueOf(EnumC29992b.class, str);
    }

    public static EnumC29992b[] values() {
        return (EnumC29992b[]) f122481y.clone();
    }
}
