package p090df;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: df.e */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC11996e {

    /* JADX INFO: renamed from: w */
    public static final EnumC11996e f39483w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC11996e[] f39484x;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC11996e EF0;

    static {
        EnumC11996e enumC11996e = new EnumC11996e("LEGACY", 0);
        EnumC11996e enumC11996e2 = new EnumC11996e("STANDARD", 1);
        f39483w = enumC11996e2;
        EnumC11996e[] enumC11996eArr = {enumC11996e, enumC11996e2, new EnumC11996e("ADAPTIVE", 2)};
        f39484x = enumC11996eArr;
        AbstractC15751g.m44468u(enumC11996eArr);
    }

    public static EnumC11996e valueOf(String str) {
        return (EnumC11996e) Enum.valueOf(EnumC11996e.class, str);
    }

    public static EnumC11996e[] values() {
        return (EnumC11996e[]) f39484x.clone();
    }
}
