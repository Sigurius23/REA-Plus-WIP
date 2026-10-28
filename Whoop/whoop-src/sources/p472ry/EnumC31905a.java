package p472ry;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ry.a */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC31905a {

    /* JADX INFO: renamed from: w */
    public static final EnumC31905a f132445w;

    /* JADX INFO: renamed from: x */
    public static final EnumC31905a f132446x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC31905a[] f132447y;

    static {
        EnumC31905a enumC31905a = new EnumC31905a("CustomTabs", 0);
        f132445w = enumC31905a;
        EnumC31905a enumC31905a2 = new EnumC31905a("Unknown", 1);
        f132446x = enumC31905a2;
        EnumC31905a[] enumC31905aArr = {enumC31905a, enumC31905a2};
        f132447y = enumC31905aArr;
        AbstractC15751g.m44468u(enumC31905aArr);
    }

    public static EnumC31905a valueOf(String str) {
        return (EnumC31905a) Enum.valueOf(EnumC31905a.class, str);
    }

    public static EnumC31905a[] values() {
        return (EnumC31905a[]) f132447y.clone();
    }
}
