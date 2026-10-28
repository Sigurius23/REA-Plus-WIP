package q93;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: q93.h */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC30084h {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ EnumC30084h[] f122783w;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC30084h EF5;

    static {
        EnumC30084h[] enumC30084hArr = {new EnumC30084h("FROM_DEPENDENCIES", 0), new EnumC30084h("FROM_CLASS_LOADER", 1), new EnumC30084h("FALLBACK", 2)};
        f122783w = enumC30084hArr;
        AbstractC15751g.m44468u(enumC30084hArr);
    }

    public static EnumC30084h valueOf(String str) {
        return (EnumC30084h) Enum.valueOf(EnumC30084h.class, str);
    }

    public static EnumC30084h[] values() {
        return (EnumC30084h[]) f122783w.clone();
    }
}
