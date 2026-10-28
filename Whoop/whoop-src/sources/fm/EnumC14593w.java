package fm;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: fm.w */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC14593w {

    /* JADX INFO: renamed from: w */
    public static final EnumC14593w f53667w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC14593w[] f53668x;

    static {
        EnumC14593w enumC14593w = new EnumC14593w("DEFAULT", 0);
        f53667w = enumC14593w;
        EnumC14593w enumC14593w2 = new EnumC14593w("UNMETERED_ONLY", 1);
        EnumC14593w enumC14593w3 = new EnumC14593w("UNMETERED_OR_DAILY", 2);
        EnumC14593w enumC14593w4 = new EnumC14593w("FAST_IF_RADIO_AWAKE", 3);
        EnumC14593w enumC14593w5 = new EnumC14593w("NEVER", 4);
        EnumC14593w enumC14593w6 = new EnumC14593w("UNRECOGNIZED", 5);
        f53668x = new EnumC14593w[]{enumC14593w, enumC14593w2, enumC14593w3, enumC14593w4, enumC14593w5, enumC14593w6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, enumC14593w);
        sparseArray.put(1, enumC14593w2);
        sparseArray.put(2, enumC14593w3);
        sparseArray.put(3, enumC14593w4);
        sparseArray.put(4, enumC14593w5);
        sparseArray.put(-1, enumC14593w6);
    }

    public static EnumC14593w valueOf(String str) {
        return (EnumC14593w) Enum.valueOf(EnumC14593w.class, str);
    }

    public static EnumC14593w[] values() {
        return (EnumC14593w[]) f53668x.clone();
    }
}
