package c43;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: c43.x */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC4208x {

    /* JADX INFO: renamed from: w */
    public static final EnumC4208x f17068w;

    /* JADX INFO: renamed from: x */
    public static final EnumC4208x f17069x;

    /* JADX INFO: renamed from: y */
    public static final EnumC4208x f17070y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC4208x[] f17071z;

    static {
        EnumC4208x enumC4208x = new EnumC4208x("VISIBLE", 0);
        f17068w = enumC4208x;
        EnumC4208x enumC4208x2 = new EnumC4208x("INVISIBLE", 1);
        f17069x = enumC4208x2;
        EnumC4208x enumC4208x3 = new EnumC4208x("UNKNOWN", 2);
        f17070y = enumC4208x3;
        EnumC4208x[] enumC4208xArr = {enumC4208x, enumC4208x2, enumC4208x3};
        f17071z = enumC4208xArr;
        AbstractC15751g.m44468u(enumC4208xArr);
    }

    public static EnumC4208x valueOf(String str) {
        return (EnumC4208x) Enum.valueOf(EnumC4208x.class, str);
    }

    public static EnumC4208x[] values() {
        return (EnumC4208x[]) f17071z.clone();
    }
}
