package p077d0;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: d0.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC11396r0 {

    /* JADX INFO: renamed from: w */
    public static final EnumC11396r0 f36538w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC11396r0[] f36539x;

    static {
        EnumC11396r0 enumC11396r0 = new EnumC11396r0("Default", 0);
        f36538w = enumC11396r0;
        EnumC11396r0[] enumC11396r0Arr = {enumC11396r0, new EnumC11396r0("UserInput", 1), new EnumC11396r0("PreventUserInput", 2)};
        f36539x = enumC11396r0Arr;
        AbstractC15751g.m44468u(enumC11396r0Arr);
    }

    public static EnumC11396r0 valueOf(String str) {
        return (EnumC11396r0) Enum.valueOf(EnumC11396r0.class, str);
    }

    public static EnumC11396r0[] values() {
        return (EnumC11396r0[]) f36539x.clone();
    }
}
