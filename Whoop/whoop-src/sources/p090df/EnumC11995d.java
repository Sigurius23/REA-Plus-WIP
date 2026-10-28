package p090df;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: df.d */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC11995d {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ EnumC11995d[] f39482w;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC11995d EF5;

    static {
        EnumC11995d[] enumC11995dArr = {new EnumC11995d("WHEN_SUPPORTED", 0), new EnumC11995d("WHEN_REQUIRED", 1)};
        f39482w = enumC11995dArr;
        AbstractC15751g.m44468u(enumC11995dArr);
    }

    public static EnumC11995d valueOf(String str) {
        return (EnumC11995d) Enum.valueOf(EnumC11995d.class, str);
    }

    public static EnumC11995d[] values() {
        return (EnumC11995d[]) f39482w.clone();
    }
}
