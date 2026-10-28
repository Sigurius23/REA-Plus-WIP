package l83;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l83.i */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC23463i {

    /* JADX INFO: renamed from: w */
    public static final EnumC23463i f92933w;

    /* JADX INFO: renamed from: x */
    public static final EnumC23463i f92934x;

    /* JADX INFO: renamed from: y */
    public static final EnumC23463i f92935y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC23463i[] f92936z;

    static {
        EnumC23463i enumC23463i = new EnumC23463i("SYNCHRONIZED", 0);
        f92933w = enumC23463i;
        EnumC23463i enumC23463i2 = new EnumC23463i("PUBLICATION", 1);
        f92934x = enumC23463i2;
        EnumC23463i enumC23463i3 = new EnumC23463i("NONE", 2);
        f92935y = enumC23463i3;
        EnumC23463i[] enumC23463iArr = {enumC23463i, enumC23463i2, enumC23463i3};
        f92936z = enumC23463iArr;
        AbstractC15751g.m44468u(enumC23463iArr);
    }

    public static EnumC23463i valueOf(String str) {
        return (EnumC23463i) Enum.valueOf(EnumC23463i.class, str);
    }

    public static EnumC23463i[] values() {
        return (EnumC23463i[]) f92936z.clone();
    }
}
