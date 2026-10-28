package p218ic;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ic.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC18363i0 {

    /* JADX INFO: renamed from: w */
    public static final EnumC18363i0 f71494w;

    /* JADX INFO: renamed from: x */
    public static final EnumC18363i0 f71495x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC18363i0[] f71496y;

    static {
        EnumC18363i0 enumC18363i0 = new EnumC18363i0("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        f71494w = enumC18363i0;
        EnumC18363i0 enumC18363i1 = new EnumC18363i0("DROP_WORK_REQUEST", 1);
        f71495x = enumC18363i1;
        EnumC18363i0[] enumC18363i0Arr = {enumC18363i0, enumC18363i1};
        f71496y = enumC18363i0Arr;
        AbstractC15751g.m44468u(enumC18363i0Arr);
    }

    public static EnumC18363i0 valueOf(String str) {
        return (EnumC18363i0) Enum.valueOf(EnumC18363i0.class, str);
    }

    public static EnumC18363i0[] values() {
        return (EnumC18363i0[]) f71496y.clone();
    }
}
