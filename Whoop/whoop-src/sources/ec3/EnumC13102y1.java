package ec3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ec3.y1 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC13102y1 {

    /* JADX INFO: renamed from: w */
    public static final EnumC13102y1 f45274w;

    /* JADX INFO: renamed from: x */
    public static final EnumC13102y1 f45275x;

    /* JADX INFO: renamed from: y */
    public static final EnumC13102y1 f45276y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC13102y1[] f45277z;

    static {
        EnumC13102y1 enumC13102y1 = new EnumC13102y1("START", 0);
        f45274w = enumC13102y1;
        EnumC13102y1 enumC13102y2 = new EnumC13102y1("STOP", 1);
        f45275x = enumC13102y2;
        EnumC13102y1 enumC13102y3 = new EnumC13102y1("STOP_AND_RESET_REPLAY_CACHE", 2);
        f45276y = enumC13102y3;
        EnumC13102y1[] enumC13102y1Arr = {enumC13102y1, enumC13102y2, enumC13102y3};
        f45277z = enumC13102y1Arr;
        AbstractC15751g.m44468u(enumC13102y1Arr);
    }

    public static EnumC13102y1 valueOf(String str) {
        return (EnumC13102y1) Enum.valueOf(EnumC13102y1.class, str);
    }

    public static EnumC13102y1[] values() {
        return (EnumC13102y1[]) f45277z.clone();
    }
}
