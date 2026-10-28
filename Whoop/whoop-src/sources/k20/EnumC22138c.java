package k20;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: k20.c */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC22138c {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ EnumC22138c[] f85883w;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC22138c EF5;

    static {
        EnumC22138c[] enumC22138cArr = {new EnumC22138c("Edit", 0), new EnumC22138c("Add", 1)};
        f85883w = enumC22138cArr;
        AbstractC15751g.m44468u(enumC22138cArr);
    }

    public static EnumC22138c valueOf(String str) {
        return (EnumC22138c) Enum.valueOf(EnumC22138c.class, str);
    }

    public static EnumC22138c[] values() {
        return (EnumC22138c[]) f85883w.clone();
    }
}
