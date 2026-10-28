package v00;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: v00.t */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC35492t {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ EnumC35492t[] f151079w;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC35492t EF5;

    static {
        EnumC35492t[] enumC35492tArr = {new EnumC35492t("SetupIntent", 0), new EnumC35492t("CreateAttach", 1)};
        f151079w = enumC35492tArr;
        AbstractC15751g.m44468u(enumC35492tArr);
    }

    public static EnumC35492t valueOf(String str) {
        return (EnumC35492t) Enum.valueOf(EnumC35492t.class, str);
    }

    public static EnumC35492t[] values() {
        return (EnumC35492t[]) f151079w.clone();
    }
}
