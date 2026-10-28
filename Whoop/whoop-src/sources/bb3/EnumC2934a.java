package bb3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: bb3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC2934a {

    /* JADX INFO: renamed from: w */
    public static final EnumC2934a f11820w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC2934a[] f11821x;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2934a EF0;

    static {
        EnumC2934a enumC2934a = new EnumC2934a("WARNING", 0);
        EnumC2934a enumC2934a2 = new EnumC2934a("ERROR", 1);
        f11820w = enumC2934a2;
        EnumC2934a[] enumC2934aArr = {enumC2934a, enumC2934a2, new EnumC2934a("HIDDEN", 2)};
        f11821x = enumC2934aArr;
        AbstractC15751g.m44468u(enumC2934aArr);
    }

    public static EnumC2934a valueOf(String str) {
        return (EnumC2934a) Enum.valueOf(EnumC2934a.class, str);
    }

    public static EnumC2934a[] values() {
        return (EnumC2934a[]) f11821x.clone();
    }
}
