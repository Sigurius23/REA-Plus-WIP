package j00;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j00.c0 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC21094c0 {

    /* JADX INFO: renamed from: w */
    public static final EnumC21094c0 f79980w;

    /* JADX INFO: renamed from: x */
    public static final EnumC21094c0 f79981x;

    /* JADX INFO: renamed from: y */
    public static final EnumC21094c0 f79982y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC21094c0[] f79983z;

    static {
        EnumC21094c0 enumC21094c0 = new EnumC21094c0("Email", 0);
        f79980w = enumC21094c0;
        EnumC21094c0 enumC21094c1 = new EnumC21094c0("Phone", 1);
        f79981x = enumC21094c1;
        EnumC21094c0 enumC21094c2 = new EnumC21094c0("Name", 2);
        f79982y = enumC21094c2;
        EnumC21094c0[] enumC21094c0Arr = {enumC21094c0, enumC21094c1, enumC21094c2};
        f79983z = enumC21094c0Arr;
        AbstractC15751g.m44468u(enumC21094c0Arr);
    }

    public static EnumC21094c0 valueOf(String str) {
        return (EnumC21094c0) Enum.valueOf(EnumC21094c0.class, str);
    }

    public static EnumC21094c0[] values() {
        return (EnumC21094c0[]) f79983z.clone();
    }
}
