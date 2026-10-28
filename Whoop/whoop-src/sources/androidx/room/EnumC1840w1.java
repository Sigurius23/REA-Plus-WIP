package androidx.room;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.room.w1 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1840w1 {

    /* JADX INFO: renamed from: w */
    public static final EnumC1840w1 f7203w;

    /* JADX INFO: renamed from: x */
    public static final EnumC1840w1 f7204x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC1840w1[] f7205y;

    static {
        EnumC1840w1 enumC1840w1 = new EnumC1840w1("DEFERRED", 0);
        f7203w = enumC1840w1;
        EnumC1840w1 enumC1840w2 = new EnumC1840w1("IMMEDIATE", 1);
        f7204x = enumC1840w2;
        EnumC1840w1[] enumC1840w1Arr = {enumC1840w1, enumC1840w2, new EnumC1840w1("EXCLUSIVE", 2)};
        f7205y = enumC1840w1Arr;
        AbstractC15751g.m44468u(enumC1840w1Arr);
    }

    public static EnumC1840w1 valueOf(String str) {
        return (EnumC1840w1) Enum.valueOf(EnumC1840w1.class, str);
    }

    public static EnumC1840w1[] values() {
        return (EnumC1840w1[]) f7205y.clone();
    }
}
