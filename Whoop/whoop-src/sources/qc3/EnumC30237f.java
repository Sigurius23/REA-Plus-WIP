package qc3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: qc3.f */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC30237f {

    /* JADX INFO: renamed from: w */
    public static final EnumC30237f f123778w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC30237f[] f123779x;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC30237f EF0;

    static {
        EnumC30237f enumC30237f = new EnumC30237f("AM", 0);
        EnumC30237f enumC30237f2 = new EnumC30237f("PM", 1);
        f123778w = enumC30237f2;
        EnumC30237f[] enumC30237fArr = {enumC30237f, enumC30237f2};
        f123779x = enumC30237fArr;
        AbstractC15751g.m44468u(enumC30237fArr);
    }

    public static EnumC30237f valueOf(String str) {
        return (EnumC30237f) Enum.valueOf(EnumC30237f.class, str);
    }

    public static EnumC30237f[] values() {
        return (EnumC30237f[]) f123779x.clone();
    }
}
