package p133f1;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: f1.h */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC13942h {

    /* JADX INFO: renamed from: w */
    public static final EnumC13942h f49704w;

    /* JADX INFO: renamed from: x */
    public static final EnumC13942h f49705x;

    /* JADX INFO: renamed from: y */
    public static final EnumC13942h f49706y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC13942h[] f49707z;

    static {
        EnumC13942h enumC13942h = new EnumC13942h("BEFORE", 0);
        f49704w = enumC13942h;
        EnumC13942h enumC13942h2 = new EnumC13942h("ON", 1);
        f49705x = enumC13942h2;
        EnumC13942h enumC13942h3 = new EnumC13942h("AFTER", 2);
        f49706y = enumC13942h3;
        EnumC13942h[] enumC13942hArr = {enumC13942h, enumC13942h2, enumC13942h3};
        f49707z = enumC13942hArr;
        AbstractC15751g.m44468u(enumC13942hArr);
    }

    public static EnumC13942h valueOf(String str) {
        return (EnumC13942h) Enum.valueOf(EnumC13942h.class, str);
    }

    public static EnumC13942h[] values() {
        return (EnumC13942h[]) f49707z.clone();
    }
}
