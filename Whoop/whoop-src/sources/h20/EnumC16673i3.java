package h20;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: h20.i3 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC16673i3 {

    /* JADX INFO: renamed from: w */
    public static final EnumC16673i3 f64121w;

    /* JADX INFO: renamed from: x */
    public static final EnumC16673i3 f64122x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC16673i3[] f64123y;

    static {
        EnumC16673i3 enumC16673i3 = new EnumC16673i3("AUTOMATIC", 0);
        f64121w = enumC16673i3;
        EnumC16673i3 enumC16673i4 = new EnumC16673i3("NEVER", 1);
        f64122x = enumC16673i4;
        EnumC16673i3[] enumC16673i3Arr = {enumC16673i3, enumC16673i4};
        f64123y = enumC16673i3Arr;
        AbstractC15751g.m44468u(enumC16673i3Arr);
    }

    public static EnumC16673i3 valueOf(String str) {
        return (EnumC16673i3) Enum.valueOf(EnumC16673i3.class, str);
    }

    public static EnumC16673i3[] values() {
        return (EnumC16673i3[]) f64123y.clone();
    }
}
