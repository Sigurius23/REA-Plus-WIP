package y00;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: y00.l1 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC38885l1 {

    /* JADX INFO: renamed from: w */
    public static final EnumC38885l1 f167365w;

    /* JADX INFO: renamed from: x */
    public static final EnumC38885l1 f167366x;

    /* JADX INFO: renamed from: y */
    public static final EnumC38885l1 f167367y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC38885l1[] f167368z;

    static {
        EnumC38885l1 enumC38885l1 = new EnumC38885l1("Enabled", 0);
        f167365w = enumC38885l1;
        EnumC38885l1 enumC38885l2 = new EnumC38885l1("Partial", 1);
        f167366x = enumC38885l2;
        EnumC38885l1 enumC38885l3 = new EnumC38885l1("Disabled", 2);
        f167367y = enumC38885l3;
        EnumC38885l1[] enumC38885l1Arr = {enumC38885l1, enumC38885l2, enumC38885l3};
        f167368z = enumC38885l1Arr;
        AbstractC15751g.m44468u(enumC38885l1Arr);
    }

    public static EnumC38885l1 valueOf(String str) {
        return (EnumC38885l1) Enum.valueOf(EnumC38885l1.class, str);
    }

    public static EnumC38885l1[] values() {
        return (EnumC38885l1[]) f167368z.clone();
    }
}
