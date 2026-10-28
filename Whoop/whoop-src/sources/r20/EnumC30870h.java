package r20;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: r20.h */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC30870h {

    /* JADX INFO: renamed from: w */
    public static final EnumC30870h f127290w;

    /* JADX INFO: renamed from: x */
    public static final EnumC30870h f127291x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC30870h[] f127292y;

    static {
        EnumC30870h enumC30870h = new EnumC30870h("PrimaryButtonAnchored", 0);
        f127290w = enumC30870h;
        EnumC30870h enumC30870h2 = new EnumC30870h("FullPage", 1);
        f127291x = enumC30870h2;
        EnumC30870h[] enumC30870hArr = {enumC30870h, enumC30870h2};
        f127292y = enumC30870hArr;
        AbstractC15751g.m44468u(enumC30870hArr);
    }

    public static EnumC30870h valueOf(String str) {
        return (EnumC30870h) Enum.valueOf(EnumC30870h.class, str);
    }

    public static EnumC30870h[] values() {
        return (EnumC30870h[]) f127292y.clone();
    }
}
