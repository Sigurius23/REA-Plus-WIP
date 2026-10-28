package lb3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lb3.b1 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC23761b1 {

    /* JADX INFO: renamed from: w */
    public static final EnumC23761b1 f94123w;

    /* JADX INFO: renamed from: x */
    public static final EnumC23761b1 f94124x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC23761b1[] f94125y;

    static {
        EnumC23761b1 enumC23761b1 = new EnumC23761b1("SUPERTYPE", 0);
        f94123w = enumC23761b1;
        EnumC23761b1 enumC23761b2 = new EnumC23761b1("COMMON", 1);
        f94124x = enumC23761b2;
        EnumC23761b1[] enumC23761b1Arr = {enumC23761b1, enumC23761b2};
        f94125y = enumC23761b1Arr;
        AbstractC15751g.m44468u(enumC23761b1Arr);
    }

    public static EnumC23761b1 valueOf(String str) {
        return (EnumC23761b1) Enum.valueOf(EnumC23761b1.class, str);
    }

    public static EnumC23761b1[] values() {
        return (EnumC23761b1[]) f94125y.clone();
    }
}
