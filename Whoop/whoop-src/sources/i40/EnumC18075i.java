package i40;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: i40.i */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC18075i {

    /* JADX INFO: renamed from: w */
    public static final EnumC18075i f70275w;

    /* JADX INFO: renamed from: x */
    public static final EnumC18075i f70276x;

    /* JADX INFO: renamed from: y */
    public static final EnumC18075i f70277y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC18075i[] f70278z;

    static {
        EnumC18075i enumC18075i = new EnumC18075i("Focused", 0);
        f70275w = enumC18075i;
        EnumC18075i enumC18075i2 = new EnumC18075i("UnfocusedEmpty", 1);
        f70276x = enumC18075i2;
        EnumC18075i enumC18075i3 = new EnumC18075i("UnfocusedNotEmpty", 2);
        f70277y = enumC18075i3;
        EnumC18075i[] enumC18075iArr = {enumC18075i, enumC18075i2, enumC18075i3};
        f70278z = enumC18075iArr;
        AbstractC15751g.m44468u(enumC18075iArr);
    }

    public static EnumC18075i valueOf(String str) {
        return (EnumC18075i) Enum.valueOf(EnumC18075i.class, str);
    }

    public static EnumC18075i[] values() {
        return (EnumC18075i[]) f70278z.clone();
    }
}
