package p005a3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: a3.y0 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC0268y0 {

    /* JADX INFO: renamed from: w */
    public static final EnumC0268y0 f916w;

    /* JADX INFO: renamed from: x */
    public static final EnumC0268y0 f917x;

    /* JADX INFO: renamed from: y */
    public static final EnumC0268y0 f918y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC0268y0[] f919z;

    static {
        EnumC0268y0 enumC0268y0 = new EnumC0268y0("IsPlacedInLookahead", 0);
        f916w = enumC0268y0;
        EnumC0268y0 enumC0268y1 = new EnumC0268y0("IsPlacedInApproach", 1);
        f917x = enumC0268y1;
        EnumC0268y0 enumC0268y2 = new EnumC0268y0("IsNotPlaced", 2);
        f918y = enumC0268y2;
        EnumC0268y0[] enumC0268y0Arr = {enumC0268y0, enumC0268y1, enumC0268y2};
        f919z = enumC0268y0Arr;
        AbstractC15751g.m44468u(enumC0268y0Arr);
    }

    public static EnumC0268y0 valueOf(String str) {
        return (EnumC0268y0) Enum.valueOf(EnumC0268y0.class, str);
    }

    public static EnumC0268y0[] values() {
        return (EnumC0268y0[]) f919z.clone();
    }
}
