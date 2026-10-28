package am;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: am.h */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC0996h {

    /* JADX INFO: renamed from: w */
    public static final EnumC0996h f3748w;

    /* JADX INFO: renamed from: x */
    public static final EnumC0996h f3749x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC0996h[] f3750y;

    static {
        EnumC0996h enumC0996h = new EnumC0996h("Wrap", 0);
        f3748w = enumC0996h;
        EnumC0996h enumC0996h2 = new EnumC0996h("Expand", 1);
        f3749x = enumC0996h2;
        EnumC0996h[] enumC0996hArr = {enumC0996h, enumC0996h2};
        f3750y = enumC0996hArr;
        AbstractC15751g.m44468u(enumC0996hArr);
    }

    public static EnumC0996h valueOf(String str) {
        return (EnumC0996h) Enum.valueOf(EnumC0996h.class, str);
    }

    public static EnumC0996h[] values() {
        return (EnumC0996h[]) f3750y.clone();
    }
}
