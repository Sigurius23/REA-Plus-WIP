package y03;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: y03.b */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC39027b {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ EnumC39027b[] f167982w;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC39027b EF5;

    static {
        EnumC39027b[] enumC39027bArr = {new EnumC39027b("FIREBASE", 0), new EnumC39027b("HUAWEI", 1), new EnumC39027b("XIAOMI", 2), new EnumC39027b("UNKNOWN", 3)};
        f167982w = enumC39027bArr;
        AbstractC15751g.m44468u(enumC39027bArr);
    }

    public static EnumC39027b valueOf(String str) {
        return (EnumC39027b) Enum.valueOf(EnumC39027b.class, str);
    }

    public static EnumC39027b[] values() {
        return (EnumC39027b[]) f167982w.clone();
    }
}
