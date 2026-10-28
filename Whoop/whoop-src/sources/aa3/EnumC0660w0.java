package aa3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: aa3.w0 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC0660w0 {

    /* JADX INFO: renamed from: w */
    public static final EnumC0660w0 f2290w;

    /* JADX INFO: renamed from: x */
    public static final EnumC0660w0 f2291x;

    /* JADX INFO: renamed from: y */
    public static final EnumC0660w0 f2292y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC0660w0[] f2293z;

    static {
        EnumC0660w0 enumC0660w0 = new EnumC0660w0("RETURNS_CONSTANT", 0);
        f2290w = enumC0660w0;
        EnumC0660w0 enumC0660w1 = new EnumC0660w0("CALLS", 1);
        f2291x = enumC0660w1;
        EnumC0660w0 enumC0660w2 = new EnumC0660w0("RETURNS_NOT_NULL", 2);
        f2292y = enumC0660w2;
        EnumC0660w0[] enumC0660w0Arr = {enumC0660w0, enumC0660w1, enumC0660w2};
        f2293z = enumC0660w0Arr;
        AbstractC15751g.m44468u(enumC0660w0Arr);
    }

    public static EnumC0660w0 valueOf(String str) {
        return (EnumC0660w0) Enum.valueOf(EnumC0660w0.class, str);
    }

    public static EnumC0660w0[] values() {
        return (EnumC0660w0[]) f2293z.clone();
    }
}
