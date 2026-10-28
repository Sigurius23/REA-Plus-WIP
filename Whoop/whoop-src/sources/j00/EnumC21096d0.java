package j00;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j00.d0 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC21096d0 {

    /* JADX INFO: renamed from: w */
    public static final EnumC21096d0 f79989w;

    /* JADX INFO: renamed from: x */
    public static final EnumC21096d0 f79990x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC21096d0[] f79991y;

    static {
        EnumC21096d0 enumC21096d0 = new EnumC21096d0("InsteadOfSaveForFutureUse", 0);
        f79989w = enumC21096d0;
        EnumC21096d0 enumC21096d1 = new EnumC21096d0("AlongsideSaveForFutureUse", 1);
        f79990x = enumC21096d1;
        EnumC21096d0[] enumC21096d0Arr = {enumC21096d0, enumC21096d1};
        f79991y = enumC21096d0Arr;
        AbstractC15751g.m44468u(enumC21096d0Arr);
    }

    public static EnumC21096d0 valueOf(String str) {
        return (EnumC21096d0) Enum.valueOf(EnumC21096d0.class, str);
    }

    public static EnumC21096d0[] values() {
        return (EnumC21096d0[]) f79991y.clone();
    }
}
