package ug;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ug.t */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC34931t {

    /* JADX INFO: renamed from: w */
    public static final EnumC34931t f147048w;

    /* JADX INFO: renamed from: x */
    public static final EnumC34931t f147049x;

    /* JADX INFO: renamed from: y */
    public static final EnumC34931t f147050y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC34931t[] f147051z;

    static {
        EnumC34931t enumC34931t = new EnumC34931t("ISO_8601", 0);
        f147048w = enumC34931t;
        EnumC34931t enumC34931t2 = new EnumC34931t("ISO_8601_CONDENSED", 1);
        f147049x = enumC34931t2;
        EnumC34931t enumC34931t3 = new EnumC34931t("ISO_8601_CONDENSED_DATE", 2);
        f147050y = enumC34931t3;
        EnumC34931t[] enumC34931tArr = {enumC34931t, enumC34931t2, enumC34931t3, new EnumC34931t("ISO_8601_FULL", 3), new EnumC34931t("RFC_5322", 4), new EnumC34931t("EPOCH_SECONDS", 5)};
        f147051z = enumC34931tArr;
        AbstractC15751g.m44468u(enumC34931tArr);
    }

    public static EnumC34931t valueOf(String str) {
        return (EnumC34931t) Enum.valueOf(EnumC34931t.class, str);
    }

    public static EnumC34931t[] values() {
        return (EnumC34931t[]) f147051z.clone();
    }
}
