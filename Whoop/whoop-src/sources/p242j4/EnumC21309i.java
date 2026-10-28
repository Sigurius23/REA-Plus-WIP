package p242j4;

import ih0.AbstractC18489d0;
import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j4.i */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC21309i {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ EnumC21309i[] f81473E;

    /* JADX INFO: renamed from: w */
    public static final EnumC21309i f81474w;

    /* JADX INFO: renamed from: x */
    public static final EnumC21309i f81475x;

    /* JADX INFO: renamed from: y */
    public static final EnumC21309i f81476y;

    /* JADX INFO: renamed from: z */
    public static final HashMap f81477z;

    static {
        EnumC21309i enumC21309i = new EnumC21309i("SPREAD", 0);
        f81474w = enumC21309i;
        EnumC21309i enumC21309i2 = new EnumC21309i("SPREAD_INSIDE", 1);
        f81475x = enumC21309i2;
        EnumC21309i enumC21309i3 = new EnumC21309i("PACKED", 2);
        f81476y = enumC21309i3;
        f81473E = new EnumC21309i[]{enumC21309i, enumC21309i2, enumC21309i3};
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        f81477z = map2;
        map.put("packed", enumC21309i3);
        map.put("spread_inside", enumC21309i2);
        map.put("spread", enumC21309i);
        AbstractC18489d0.m53383x(2, map2, "packed", 1, "spread_inside");
        map2.put("spread", 0);
    }

    /* JADX INFO: renamed from: a */
    public static int m59832a(String str) {
        HashMap map = f81477z;
        if (map.containsKey(str)) {
            return ((Integer) map.get(str)).intValue();
        }
        return -1;
    }

    public static EnumC21309i valueOf(String str) {
        return (EnumC21309i) Enum.valueOf(EnumC21309i.class, str);
    }

    public static EnumC21309i[] values() {
        return (EnumC21309i[]) f81473E.clone();
    }
}
