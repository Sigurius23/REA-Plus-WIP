package p077d0;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: d0.i */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC11360i {

    /* JADX INFO: renamed from: w */
    public static final EnumC11360i f36414w;

    /* JADX INFO: renamed from: x */
    public static final EnumC11360i f36415x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC11360i[] f36416y;

    static {
        EnumC11360i enumC11360i = new EnumC11360i("BoundReached", 0);
        f36414w = enumC11360i;
        EnumC11360i enumC11360i2 = new EnumC11360i("Finished", 1);
        f36415x = enumC11360i2;
        EnumC11360i[] enumC11360iArr = {enumC11360i, enumC11360i2};
        f36416y = enumC11360iArr;
        AbstractC15751g.m44468u(enumC11360iArr);
    }

    public static EnumC11360i valueOf(String str) {
        return (EnumC11360i) Enum.valueOf(EnumC11360i.class, str);
    }

    public static EnumC11360i[] values() {
        return (EnumC11360i[]) f36416y.clone();
    }
}
