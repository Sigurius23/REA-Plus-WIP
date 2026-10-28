package cz;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: cz.h */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC11202h {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ EnumC11202h[] f35929w;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC11202h EF5;

    static {
        EnumC11202h[] enumC11202hArr = {new EnumC11202h("CustomerAdapter", 0), new EnumC11202h("CustomerSession", 1)};
        f35929w = enumC11202hArr;
        AbstractC15751g.m44468u(enumC11202hArr);
    }

    public static EnumC11202h valueOf(String str) {
        return (EnumC11202h) Enum.valueOf(EnumC11202h.class, str);
    }

    public static EnumC11202h[] values() {
        return (EnumC11202h[]) f35929w.clone();
    }
}
