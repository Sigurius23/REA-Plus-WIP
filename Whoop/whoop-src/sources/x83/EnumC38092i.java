package x83;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: x83.i */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC38092i {

    /* JADX INFO: renamed from: w */
    public static final EnumC38092i f163140w;

    /* JADX INFO: renamed from: x */
    public static final EnumC38092i f163141x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC38092i[] f163142y;

    static {
        EnumC38092i enumC38092i = new EnumC38092i("TOP_DOWN", 0);
        f163140w = enumC38092i;
        EnumC38092i enumC38092i2 = new EnumC38092i("BOTTOM_UP", 1);
        f163141x = enumC38092i2;
        EnumC38092i[] enumC38092iArr = {enumC38092i, enumC38092i2};
        f163142y = enumC38092iArr;
        AbstractC15751g.m44468u(enumC38092iArr);
    }

    public static EnumC38092i valueOf(String str) {
        return (EnumC38092i) Enum.valueOf(EnumC38092i.class, str);
    }

    public static EnumC38092i[] values() {
        return (EnumC38092i[]) f163142y.clone();
    }
}
