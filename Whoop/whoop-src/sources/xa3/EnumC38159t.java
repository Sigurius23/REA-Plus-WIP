package xa3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: xa3.t */
/* JADX INFO: loaded from: classes5.dex */
public abstract class EnumC38159t {

    /* JADX INFO: renamed from: w */
    public static final C38158s f163404w;

    /* JADX INFO: renamed from: x */
    public static final C38157r f163405x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC38159t[] f163406y;

    static {
        C38158s c38158s = new C38158s();
        f163404w = c38158s;
        C38157r c38157r = new C38157r();
        f163405x = c38157r;
        EnumC38159t[] enumC38159tArr = {c38158s, c38157r};
        f163406y = enumC38159tArr;
        AbstractC15751g.m44468u(enumC38159tArr);
    }

    public static EnumC38159t valueOf(String str) {
        return (EnumC38159t) Enum.valueOf(EnumC38159t.class, str);
    }

    public static EnumC38159t[] values() {
        return (EnumC38159t[]) f163406y.clone();
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo122223a(String str);
}
