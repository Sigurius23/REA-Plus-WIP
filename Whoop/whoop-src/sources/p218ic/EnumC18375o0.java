package p218ic;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ic.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC18375o0 {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ EnumC18375o0[] f71535w;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC18375o0 EF5;

    static {
        EnumC18375o0[] enumC18375o0Arr = {new EnumC18375o0("NOT_APPLIED", 0), new EnumC18375o0("APPLIED_IMMEDIATELY", 1), new EnumC18375o0("APPLIED_FOR_NEXT_RUN", 2)};
        f71535w = enumC18375o0Arr;
        AbstractC15751g.m44468u(enumC18375o0Arr);
    }

    public static EnumC18375o0 valueOf(String str) {
        return (EnumC18375o0) Enum.valueOf(EnumC18375o0.class, str);
    }

    public static EnumC18375o0[] values() {
        return (EnumC18375o0[]) f71535w.clone();
    }
}
