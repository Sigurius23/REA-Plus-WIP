package jb3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: jb3.i */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC21549i {

    /* JADX INFO: renamed from: w */
    public static final EnumC21549i f82647w;

    /* JADX INFO: renamed from: x */
    public static final EnumC21549i f82648x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC21549i[] f82649y;

    static {
        EnumC21549i enumC21549i = new EnumC21549i("STABLE", 0);
        f82647w = enumC21549i;
        EnumC21549i enumC21549i2 = new EnumC21549i("UNSTABLE", 1);
        f82648x = enumC21549i2;
        EnumC21549i[] enumC21549iArr = {enumC21549i, enumC21549i2};
        f82649y = enumC21549iArr;
        AbstractC15751g.m44468u(enumC21549iArr);
    }

    public static EnumC21549i valueOf(String str) {
        return (EnumC21549i) Enum.valueOf(EnumC21549i.class, str);
    }

    public static EnumC21549i[] values() {
        return (EnumC21549i[]) f82649y.clone();
    }
}
