package dz;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: dz.j */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC12463j {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ EnumC12463j[] f42536w;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC12463j EF5;

    static {
        EnumC12463j[] enumC12463jArr = {new EnumC12463j("Add", 0), new EnumC12463j("Edit", 1)};
        f42536w = enumC12463jArr;
        AbstractC15751g.m44468u(enumC12463jArr);
    }

    public static EnumC12463j valueOf(String str) {
        return (EnumC12463j) Enum.valueOf(EnumC12463j.class, str);
    }

    public static EnumC12463j[] values() {
        return (EnumC12463j[]) f42536w.clone();
    }
}
