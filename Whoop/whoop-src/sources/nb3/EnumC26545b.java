package nb3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: nb3.b */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC26545b {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ EnumC26545b[] f105507w;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC26545b EF5;

    static {
        EnumC26545b[] enumC26545bArr = {new EnumC26545b("ERROR_CLASS", 0), new EnumC26545b("ERROR_FUNCTION", 1), new EnumC26545b("ERROR_SCOPE", 2), new EnumC26545b("ERROR_MODULE", 3), new EnumC26545b("ERROR_PROPERTY", 4), new EnumC26545b("ERROR_TYPE", 5), new EnumC26545b("PARENT_OF_ERROR_SCOPE", 6)};
        f105507w = enumC26545bArr;
        AbstractC15751g.m44468u(enumC26545bArr);
    }

    public static EnumC26545b valueOf(String str) {
        return (EnumC26545b) Enum.valueOf(EnumC26545b.class, str);
    }

    public static EnumC26545b[] values() {
        return (EnumC26545b[]) f105507w.clone();
    }
}
