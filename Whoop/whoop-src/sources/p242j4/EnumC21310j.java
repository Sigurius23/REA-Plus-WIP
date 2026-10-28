package p242j4;

import ih0.AbstractC18489d0;
import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j4.j */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC21310j {

    /* JADX INFO: renamed from: w */
    public static final HashMap f81478w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC21310j[] f81479x;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC21310j EF0;

    static {
        EnumC21310j enumC21310j = new EnumC21310j("NONE", 0);
        EnumC21310j enumC21310j2 = new EnumC21310j("CHAIN", 1);
        EnumC21310j enumC21310j3 = new EnumC21310j("ALIGNED", 2);
        f81479x = new EnumC21310j[]{enumC21310j, enumC21310j2, enumC21310j3};
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        f81478w = map2;
        map.put("none", enumC21310j);
        map.put("chain", enumC21310j2);
        map.put("aligned", enumC21310j3);
        AbstractC18489d0.m53383x(0, map2, "none", 3, "chain");
        map2.put("aligned", 2);
    }

    /* JADX INFO: renamed from: a */
    public static int m59833a(String str) {
        HashMap map = f81478w;
        if (map.containsKey(str)) {
            return ((Integer) map.get(str)).intValue();
        }
        return -1;
    }

    public static EnumC21310j valueOf(String str) {
        return (EnumC21310j) Enum.valueOf(EnumC21310j.class, str);
    }

    public static EnumC21310j[] values() {
        return (EnumC21310j[]) f81479x.clone();
    }
}
