package p005a3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: a3.o2 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC0236o2 {

    /* JADX INFO: renamed from: w */
    public static final EnumC0236o2 f807w;

    /* JADX INFO: renamed from: x */
    public static final EnumC0236o2 f808x;

    /* JADX INFO: renamed from: y */
    public static final EnumC0236o2 f809y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC0236o2[] f810z;

    static {
        EnumC0236o2 enumC0236o2 = new EnumC0236o2("ContinueTraversal", 0);
        f807w = enumC0236o2;
        EnumC0236o2 enumC0236o3 = new EnumC0236o2("SkipSubtreeAndContinueTraversal", 1);
        f808x = enumC0236o3;
        EnumC0236o2 enumC0236o4 = new EnumC0236o2("CancelTraversal", 2);
        f809y = enumC0236o4;
        EnumC0236o2[] enumC0236o2Arr = {enumC0236o2, enumC0236o3, enumC0236o4};
        f810z = enumC0236o2Arr;
        AbstractC15751g.m44468u(enumC0236o2Arr);
    }

    public static EnumC0236o2 valueOf(String str) {
        return (EnumC0236o2) Enum.valueOf(EnumC0236o2.class, str);
    }

    public static EnumC0236o2[] values() {
        return (EnumC0236o2[]) f810z.clone();
    }
}
