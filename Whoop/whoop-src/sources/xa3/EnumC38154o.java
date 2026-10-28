package xa3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: xa3.o */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC38154o {

    /* JADX INFO: renamed from: w */
    public static final EnumC38154o f163394w;

    /* JADX INFO: renamed from: x */
    public static final EnumC38154o f163395x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC38154o[] f163396y;

    static {
        EnumC38154o enumC38154o = new EnumC38154o("RENDER_OVERRIDE", 0);
        f163394w = enumC38154o;
        EnumC38154o enumC38154o2 = new EnumC38154o("RENDER_OPEN", 1);
        f163395x = enumC38154o2;
        EnumC38154o[] enumC38154oArr = {enumC38154o, enumC38154o2, new EnumC38154o("RENDER_OPEN_OVERRIDE", 2)};
        f163396y = enumC38154oArr;
        AbstractC15751g.m44468u(enumC38154oArr);
    }

    public static EnumC38154o valueOf(String str) {
        return (EnumC38154o) Enum.valueOf(EnumC38154o.class, str);
    }

    public static EnumC38154o[] values() {
        return (EnumC38154o[]) f163396y.clone();
    }
}
