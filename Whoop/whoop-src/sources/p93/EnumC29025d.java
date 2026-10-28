package p93;

import ge3.AbstractC15751g;
import ng3.C26701n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: p93.d */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC29025d {

    /* JADX INFO: renamed from: w */
    public static final C26701n f117496w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC29025d[] f117497x;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC29025d EF5;

    static {
        EnumC29025d[] enumC29025dArr = {new EnumC29025d("Function", 0), new EnumC29025d("SuspendFunction", 1), new EnumC29025d("KFunction", 2), new EnumC29025d("KSuspendFunction", 3), new EnumC29025d("UNKNOWN", 4)};
        f117497x = enumC29025dArr;
        AbstractC15751g.m44468u(enumC29025dArr);
        f117496w = new C26701n(13);
    }

    public static EnumC29025d valueOf(String str) {
        return (EnumC29025d) Enum.valueOf(EnumC29025d.class, str);
    }

    public static EnumC29025d[] values() {
        return (EnumC29025d[]) f117497x.clone();
    }
}
