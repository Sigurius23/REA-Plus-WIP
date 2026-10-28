package oa3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: oa3.c */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC27760c {

    /* JADX INFO: renamed from: w */
    public static final EnumC27760c f111941w;

    /* JADX INFO: renamed from: x */
    public static final EnumC27760c f111942x;

    /* JADX INFO: renamed from: y */
    public static final EnumC27760c f111943y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC27760c[] f111944z;

    static {
        EnumC27760c enumC27760c = new EnumC27760c("PROPERTY", 0);
        f111941w = enumC27760c;
        EnumC27760c enumC27760c2 = new EnumC27760c("BACKING_FIELD", 1);
        f111942x = enumC27760c2;
        EnumC27760c enumC27760c3 = new EnumC27760c("DELEGATE_FIELD", 2);
        f111943y = enumC27760c3;
        EnumC27760c[] enumC27760cArr = {enumC27760c, enumC27760c2, enumC27760c3};
        f111944z = enumC27760cArr;
        AbstractC15751g.m44468u(enumC27760cArr);
    }

    public static EnumC27760c valueOf(String str) {
        return (EnumC27760c) Enum.valueOf(EnumC27760c.class, str);
    }

    public static EnumC27760c[] values() {
        return (EnumC27760c[]) f111944z.clone();
    }
}
