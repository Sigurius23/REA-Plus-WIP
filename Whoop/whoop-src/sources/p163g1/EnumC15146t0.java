package p163g1;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: g1.t0 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC15146t0 {

    /* JADX INFO: renamed from: w */
    public static final EnumC15146t0 f56806w;

    /* JADX INFO: renamed from: x */
    public static final EnumC15146t0 f56807x;

    /* JADX INFO: renamed from: y */
    public static final EnumC15146t0 f56808y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC15146t0[] f56809z;

    static {
        EnumC15146t0 enumC15146t0 = new EnumC15146t0("Closed", 0);
        f56806w = enumC15146t0;
        EnumC15146t0 enumC15146t1 = new EnumC15146t0("Open", 1);
        f56807x = enumC15146t1;
        EnumC15146t0 enumC15146t2 = new EnumC15146t0("Expanded", 2);
        f56808y = enumC15146t2;
        EnumC15146t0[] enumC15146t0Arr = {enumC15146t0, enumC15146t1, enumC15146t2};
        f56809z = enumC15146t0Arr;
        AbstractC15751g.m44468u(enumC15146t0Arr);
    }

    public static EnumC15146t0 valueOf(String str) {
        return (EnumC15146t0) Enum.valueOf(EnumC15146t0.class, str);
    }

    public static EnumC15146t0[] values() {
        return (EnumC15146t0[]) f56809z.clone();
    }
}
