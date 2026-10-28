package xa3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: xa3.q */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC38156q {

    /* JADX INFO: renamed from: w */
    public static final EnumC38156q f163401w;

    /* JADX INFO: renamed from: x */
    public static final EnumC38156q f163402x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC38156q[] f163403y;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC38156q EF0;

    static {
        EnumC38156q enumC38156q = new EnumC38156q("PRETTY", 0);
        EnumC38156q enumC38156q2 = new EnumC38156q("DEBUG", 1);
        f163401w = enumC38156q2;
        EnumC38156q enumC38156q3 = new EnumC38156q("NONE", 2);
        f163402x = enumC38156q3;
        EnumC38156q[] enumC38156qArr = {enumC38156q, enumC38156q2, enumC38156q3};
        f163403y = enumC38156qArr;
        AbstractC15751g.m44468u(enumC38156qArr);
    }

    public static EnumC38156q valueOf(String str) {
        return (EnumC38156q) Enum.valueOf(EnumC38156q.class, str);
    }

    public static EnumC38156q[] values() {
        return (EnumC38156q[]) f163403y.clone();
    }
}
