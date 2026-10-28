package b30;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: b30.t1 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC2625t1 {

    /* JADX INFO: renamed from: w */
    public static final EnumC2625t1 f10216w;

    /* JADX INFO: renamed from: x */
    public static final EnumC2625t1 f10217x;

    /* JADX INFO: renamed from: y */
    public static final EnumC2625t1 f10218y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC2625t1[] f10219z;

    static {
        EnumC2625t1 enumC2625t1 = new EnumC2625t1("Disabled", 0);
        f10216w = enumC2625t1;
        EnumC2625t1 enumC2625t2 = new EnumC2625t1("InBillingDetailsForm", 1);
        f10217x = enumC2625t2;
        EnumC2625t1 enumC2625t3 = new EnumC2625t1("OutsideBillingDetailsForm", 2);
        f10218y = enumC2625t3;
        EnumC2625t1[] enumC2625t1Arr = {enumC2625t1, enumC2625t2, enumC2625t3};
        f10219z = enumC2625t1Arr;
        AbstractC15751g.m44468u(enumC2625t1Arr);
    }

    public static EnumC2625t1 valueOf(String str) {
        return (EnumC2625t1) Enum.valueOf(EnumC2625t1.class, str);
    }

    public static EnumC2625t1[] values() {
        return (EnumC2625t1[]) f10219z.clone();
    }
}
