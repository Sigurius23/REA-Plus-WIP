package p133f1;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: f1.s */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC13975s {

    /* JADX INFO: renamed from: w */
    public static final EnumC13975s f49836w;

    /* JADX INFO: renamed from: x */
    public static final EnumC13975s f49837x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC13975s[] f49838y;

    static {
        EnumC13975s enumC13975s = new EnumC13975s("EditableText", 0);
        f49836w = enumC13975s;
        EnumC13975s enumC13975s2 = new EnumC13975s("StaticText", 1);
        f49837x = enumC13975s2;
        EnumC13975s[] enumC13975sArr = {enumC13975s, enumC13975s2};
        f49838y = enumC13975sArr;
        AbstractC15751g.m44468u(enumC13975sArr);
    }

    public static EnumC13975s valueOf(String str) {
        return (EnumC13975s) Enum.valueOf(EnumC13975s.class, str);
    }

    public static EnumC13975s[] values() {
        return (EnumC13975s[]) f49838y.clone();
    }
}
