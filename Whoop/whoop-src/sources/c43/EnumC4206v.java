package c43;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: c43.v */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC4206v {

    /* JADX INFO: renamed from: w */
    public static final EnumC4206v f17063w;

    /* JADX INFO: renamed from: x */
    public static final EnumC4206v f17064x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC4206v[] f17065y;

    static {
        EnumC4206v enumC4206v = new EnumC4206v("PUBLISHER", 0);
        f17063w = enumC4206v;
        EnumC4206v enumC4206v2 = new EnumC4206v("SUBSCRIBER", 1);
        f17064x = enumC4206v2;
        EnumC4206v[] enumC4206vArr = {enumC4206v, enumC4206v2};
        f17065y = enumC4206vArr;
        AbstractC15751g.m44468u(enumC4206vArr);
    }

    public static EnumC4206v valueOf(String str) {
        return (EnumC4206v) Enum.valueOf(EnumC4206v.class, str);
    }

    public static EnumC4206v[] values() {
        return (EnumC4206v[]) f17065y.clone();
    }
}
