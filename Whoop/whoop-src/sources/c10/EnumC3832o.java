package c10;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: c10.o */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC3832o {

    /* JADX INFO: renamed from: w */
    public static final EnumC3832o f15690w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC3832o[] f15691x;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC3832o EF0;

    static {
        EnumC3832o enumC3832o = new EnumC3832o("Continue", 0);
        EnumC3832o enumC3832o2 = new EnumC3832o("Confirm", 1);
        f15690w = enumC3832o2;
        EnumC3832o[] enumC3832oArr = {enumC3832o, enumC3832o2};
        f15691x = enumC3832oArr;
        AbstractC15751g.m44468u(enumC3832oArr);
    }

    public static EnumC3832o valueOf(String str) {
        return (EnumC3832o) Enum.valueOf(EnumC3832o.class, str);
    }

    public static EnumC3832o[] values() {
        return (EnumC3832o[]) f15691x.clone();
    }
}
