package d33;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: d33.a */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC11579a {

    /* JADX INFO: renamed from: w */
    public static final EnumC11579a f37356w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC11579a[] f37357x;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC11579a EF0;

    static {
        EnumC11579a enumC11579a = new EnumC11579a("NOTIFICATION", 0);
        EnumC11579a enumC11579a2 = new EnumC11579a("VIDEO_CLIENT", 1);
        f37356w = enumC11579a2;
        EnumC11579a[] enumC11579aArr = {enumC11579a, enumC11579a2};
        f37357x = enumC11579aArr;
        AbstractC15751g.m44468u(enumC11579aArr);
    }

    public static EnumC11579a valueOf(String str) {
        return (EnumC11579a) Enum.valueOf(EnumC11579a.class, str);
    }

    public static EnumC11579a[] values() {
        return (EnumC11579a[]) f37357x.clone();
    }
}
