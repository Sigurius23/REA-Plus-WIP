package p510u0;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: u0.g0 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC34318g0 {

    /* JADX INFO: renamed from: w */
    public static final EnumC34318g0 f144086w;

    /* JADX INFO: renamed from: x */
    public static final EnumC34318g0 f144087x;

    /* JADX INFO: renamed from: y */
    public static final EnumC34318g0 f144088y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC34318g0[] f144089z;

    static {
        EnumC34318g0 enumC34318g0 = new EnumC34318g0("None", 0);
        f144086w = enumC34318g0;
        EnumC34318g0 enumC34318g1 = new EnumC34318g0("Selection", 1);
        f144087x = enumC34318g1;
        EnumC34318g0 enumC34318g2 = new EnumC34318g0("Cursor", 2);
        f144088y = enumC34318g2;
        EnumC34318g0[] enumC34318g0Arr = {enumC34318g0, enumC34318g1, enumC34318g2};
        f144089z = enumC34318g0Arr;
        AbstractC15751g.m44468u(enumC34318g0Arr);
    }

    public static EnumC34318g0 valueOf(String str) {
        return (EnumC34318g0) Enum.valueOf(EnumC34318g0.class, str);
    }

    public static EnumC34318g0[] values() {
        return (EnumC34318g0[]) f144089z.clone();
    }
}
