package p090df;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: df.c */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC11994c {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ EnumC11994c[] f39481w;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC11994c EF5;

    static {
        EnumC11994c[] enumC11994cArr = {new EnumC11994c("WHEN_SUPPORTED", 0), new EnumC11994c("WHEN_REQUIRED", 1)};
        f39481w = enumC11994cArr;
        AbstractC15751g.m44468u(enumC11994cArr);
    }

    public static EnumC11994c valueOf(String str) {
        return (EnumC11994c) Enum.valueOf(EnumC11994c.class, str);
    }

    public static EnumC11994c[] values() {
        return (EnumC11994c[]) f39481w.clone();
    }
}
