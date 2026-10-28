package p163g1;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: g1.r2 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC15128r2 {

    /* JADX INFO: renamed from: w */
    public static final EnumC15128r2 f56690w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC15128r2[] f56691x;

    static {
        EnumC15128r2 enumC15128r2 = new EnumC15128r2("Closed", 0);
        f56690w = enumC15128r2;
        EnumC15128r2[] enumC15128r2Arr = {enumC15128r2, new EnumC15128r2("Open", 1)};
        f56691x = enumC15128r2Arr;
        AbstractC15751g.m44468u(enumC15128r2Arr);
    }

    public static EnumC15128r2 valueOf(String str) {
        return (EnumC15128r2) Enum.valueOf(EnumC15128r2.class, str);
    }

    public static EnumC15128r2[] values() {
        return (EnumC15128r2[]) f56691x.clone();
    }
}
