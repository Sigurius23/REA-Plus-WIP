package androidx.room;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.room.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1783f0 {

    /* JADX INFO: renamed from: w */
    public static final EnumC1783f0 f7028w;

    /* JADX INFO: renamed from: x */
    public static final EnumC1783f0 f7029x;

    /* JADX INFO: renamed from: y */
    public static final EnumC1783f0 f7030y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC1783f0[] f7031z;

    static {
        EnumC1783f0 enumC1783f0 = new EnumC1783f0("NO_OP", 0);
        f7028w = enumC1783f0;
        EnumC1783f0 enumC1783f1 = new EnumC1783f0("ADD", 1);
        f7029x = enumC1783f1;
        EnumC1783f0 enumC1783f2 = new EnumC1783f0("REMOVE", 2);
        f7030y = enumC1783f2;
        EnumC1783f0[] enumC1783f0Arr = {enumC1783f0, enumC1783f1, enumC1783f2};
        f7031z = enumC1783f0Arr;
        AbstractC15751g.m44468u(enumC1783f0Arr);
    }

    public static EnumC1783f0 valueOf(String str) {
        return (EnumC1783f0) Enum.valueOf(EnumC1783f0.class, str);
    }

    public static EnumC1783f0[] values() {
        return (EnumC1783f0[]) f7031z.clone();
    }
}
