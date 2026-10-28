package qc3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: qc3.o0 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC30263o0 {

    /* JADX INFO: renamed from: w */
    public static final EnumC30263o0 f123804w;

    /* JADX INFO: renamed from: x */
    public static final EnumC30263o0 f123805x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC30263o0[] f123806y;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC30263o0 EF0;

    static {
        EnumC30263o0 enumC30263o0 = new EnumC30263o0("NONE", 0);
        EnumC30263o0 enumC30263o1 = new EnumC30263o0("ZERO", 1);
        f123804w = enumC30263o1;
        EnumC30263o0 enumC30263o2 = new EnumC30263o0("SPACE", 2);
        f123805x = enumC30263o2;
        EnumC30263o0[] enumC30263o0Arr = {enumC30263o0, enumC30263o1, enumC30263o2};
        f123806y = enumC30263o0Arr;
        AbstractC15751g.m44468u(enumC30263o0Arr);
    }

    public static EnumC30263o0 valueOf(String str) {
        return (EnumC30263o0) Enum.valueOf(EnumC30263o0.class, str);
    }

    public static EnumC30263o0[] values() {
        return (EnumC30263o0[]) f123806y.clone();
    }
}
