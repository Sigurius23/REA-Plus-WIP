package s40;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: s40.v0 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC32184v0 {

    /* JADX INFO: renamed from: w */
    public static final EnumC32184v0 f133294w;

    /* JADX INFO: renamed from: x */
    public static final EnumC32184v0 f133295x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC32184v0[] f133296y;

    static {
        EnumC32184v0 enumC32184v0 = new EnumC32184v0("Global", 0);
        f133294w = enumC32184v0;
        EnumC32184v0 enumC32184v1 = new EnumC32184v0("US", 1);
        f133295x = enumC32184v1;
        EnumC32184v0[] enumC32184v0Arr = {enumC32184v0, enumC32184v1};
        f133296y = enumC32184v0Arr;
        AbstractC15751g.m44468u(enumC32184v0Arr);
    }

    public static EnumC32184v0 valueOf(String str) {
        return (EnumC32184v0) Enum.valueOf(EnumC32184v0.class, str);
    }

    public static EnumC32184v0[] values() {
        return (EnumC32184v0[]) f133296y.clone();
    }
}
