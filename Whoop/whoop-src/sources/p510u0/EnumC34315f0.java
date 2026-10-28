package p510u0;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: u0.f0 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC34315f0 {

    /* JADX INFO: renamed from: w */
    public static final EnumC34315f0 f144080w;

    /* JADX INFO: renamed from: x */
    public static final EnumC34315f0 f144081x;

    /* JADX INFO: renamed from: y */
    public static final EnumC34315f0 f144082y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC34315f0[] f144083z;

    static {
        EnumC34315f0 enumC34315f0 = new EnumC34315f0("Cursor", 0);
        f144080w = enumC34315f0;
        EnumC34315f0 enumC34315f1 = new EnumC34315f0("SelectionStart", 1);
        f144081x = enumC34315f1;
        EnumC34315f0 enumC34315f2 = new EnumC34315f0("SelectionEnd", 2);
        f144082y = enumC34315f2;
        EnumC34315f0[] enumC34315f0Arr = {enumC34315f0, enumC34315f1, enumC34315f2};
        f144083z = enumC34315f0Arr;
        AbstractC15751g.m44468u(enumC34315f0Arr);
    }

    public static EnumC34315f0 valueOf(String str) {
        return (EnumC34315f0) Enum.valueOf(EnumC34315f0.class, str);
    }

    public static EnumC34315f0[] values() {
        return (EnumC34315f0[]) f144083z.clone();
    }
}
