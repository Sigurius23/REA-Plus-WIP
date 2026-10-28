package p251jg;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: jg.q */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC21664q {

    /* JADX INFO: renamed from: E */
    public static final EnumC21664q f83178E;

    /* JADX INFO: renamed from: F */
    public static final EnumC21664q f83179F;

    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ EnumC21664q[] f83180G;

    /* JADX INFO: renamed from: w */
    public static final EnumC21664q f83181w;

    /* JADX INFO: renamed from: x */
    public static final EnumC21664q f83182x;

    /* JADX INFO: renamed from: y */
    public static final EnumC21664q f83183y;

    /* JADX INFO: renamed from: z */
    public static final EnumC21664q f83184z;

    static {
        EnumC21664q enumC21664q = new EnumC21664q("Initial", 0);
        f83181w = enumC21664q;
        EnumC21664q enumC21664q2 = new EnumC21664q("ArrayFirstValueOrEnd", 1);
        f83182x = enumC21664q2;
        EnumC21664q enumC21664q3 = new EnumC21664q("ArrayNextValueOrEnd", 2);
        f83183y = enumC21664q3;
        EnumC21664q enumC21664q4 = new EnumC21664q("ObjectFirstKeyOrEnd", 3);
        f83184z = enumC21664q4;
        EnumC21664q enumC21664q5 = new EnumC21664q("ObjectNextKeyOrEnd", 4);
        f83178E = enumC21664q5;
        EnumC21664q enumC21664q6 = new EnumC21664q("ObjectFieldValue", 5);
        f83179F = enumC21664q6;
        EnumC21664q[] enumC21664qArr = {enumC21664q, enumC21664q2, enumC21664q3, enumC21664q4, enumC21664q5, enumC21664q6};
        f83180G = enumC21664qArr;
        AbstractC15751g.m44468u(enumC21664qArr);
    }

    public static EnumC21664q valueOf(String str) {
        return (EnumC21664q) Enum.valueOf(EnumC21664q.class, str);
    }

    public static EnumC21664q[] values() {
        return (EnumC21664q[]) f83180G.clone();
    }
}
