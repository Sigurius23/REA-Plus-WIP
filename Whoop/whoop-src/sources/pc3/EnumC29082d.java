package pc3;

import ge3.AbstractC15751g;
import t83.C33617b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: pc3.d */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC29082d {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ EnumC29082d[] f117675w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ C33617b f117676x;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC29082d EF5;

    static {
        EnumC29082d[] enumC29082dArr = {new EnumC29082d("MONDAY", 0), new EnumC29082d("TUESDAY", 1), new EnumC29082d("WEDNESDAY", 2), new EnumC29082d("THURSDAY", 3), new EnumC29082d("FRIDAY", 4), new EnumC29082d("SATURDAY", 5), new EnumC29082d("SUNDAY", 6)};
        f117675w = enumC29082dArr;
        f117676x = AbstractC15751g.m44468u(enumC29082dArr);
    }

    public static EnumC29082d valueOf(String str) {
        return (EnumC29082d) Enum.valueOf(EnumC29082d.class, str);
    }

    public static EnumC29082d[] values() {
        return (EnumC29082d[]) f117675w.clone();
    }
}
