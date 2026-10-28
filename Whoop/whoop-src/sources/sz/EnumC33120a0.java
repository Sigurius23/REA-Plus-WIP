package sz;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: sz.a0 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC33120a0 {

    /* JADX INFO: renamed from: w */
    public static final EnumC33120a0 f138159w;

    /* JADX INFO: renamed from: x */
    public static final EnumC33120a0 f138160x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC33120a0[] f138161y;

    static {
        EnumC33120a0 enumC33120a0 = new EnumC33120a0("Min", 0);
        f138159w = enumC33120a0;
        EnumC33120a0 enumC33120a1 = new EnumC33120a0("Full", 1);
        f138160x = enumC33120a1;
        EnumC33120a0[] enumC33120a0Arr = {enumC33120a0, enumC33120a1};
        f138161y = enumC33120a0Arr;
        AbstractC15751g.m44468u(enumC33120a0Arr);
    }

    public static EnumC33120a0 valueOf(String str) {
        return (EnumC33120a0) Enum.valueOf(EnumC33120a0.class, str);
    }

    public static EnumC33120a0[] values() {
        return (EnumC33120a0[]) f138161y.clone();
    }
}
