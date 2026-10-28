package p077d0;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: d0.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC11408v0 {

    /* JADX INFO: renamed from: w */
    public static final EnumC11408v0 f36577w;

    /* JADX INFO: renamed from: x */
    public static final EnumC11408v0 f36578x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC11408v0[] f36579y;

    static {
        EnumC11408v0 enumC11408v0 = new EnumC11408v0("Restart", 0);
        f36577w = enumC11408v0;
        EnumC11408v0 enumC11408v1 = new EnumC11408v0("Reverse", 1);
        f36578x = enumC11408v1;
        EnumC11408v0[] enumC11408v0Arr = {enumC11408v0, enumC11408v1};
        f36579y = enumC11408v0Arr;
        AbstractC15751g.m44468u(enumC11408v0Arr);
    }

    public static EnumC11408v0 valueOf(String str) {
        return (EnumC11408v0) Enum.valueOf(EnumC11408v0.class, str);
    }

    public static EnumC11408v0[] values() {
        return (EnumC11408v0[]) f36579y.clone();
    }
}
