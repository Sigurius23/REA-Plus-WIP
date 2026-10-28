package fm;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: fm.t */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC14590t {

    /* JADX INFO: renamed from: w */
    public static final SparseArray f53663w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC14590t[] f53664x;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC14590t EF1;

    static {
        EnumC14590t enumC14590t = new EnumC14590t("UNKNOWN_MOBILE_SUBTYPE", 0);
        EnumC14590t enumC14590t2 = new EnumC14590t("GPRS", 1);
        EnumC14590t enumC14590t3 = new EnumC14590t("EDGE", 2);
        EnumC14590t enumC14590t4 = new EnumC14590t("UMTS", 3);
        EnumC14590t enumC14590t5 = new EnumC14590t("CDMA", 4);
        EnumC14590t enumC14590t6 = new EnumC14590t("EVDO_0", 5);
        EnumC14590t enumC14590t7 = new EnumC14590t("EVDO_A", 6);
        EnumC14590t enumC14590t8 = new EnumC14590t("RTT", 7);
        EnumC14590t enumC14590t9 = new EnumC14590t("HSDPA", 8);
        EnumC14590t enumC14590t10 = new EnumC14590t("HSUPA", 9);
        EnumC14590t enumC14590t11 = new EnumC14590t("HSPA", 10);
        EnumC14590t enumC14590t12 = new EnumC14590t("IDEN", 11);
        EnumC14590t enumC14590t13 = new EnumC14590t("EVDO_B", 12);
        EnumC14590t enumC14590t14 = new EnumC14590t("LTE", 13);
        EnumC14590t enumC14590t15 = new EnumC14590t("EHRPD", 14);
        EnumC14590t enumC14590t16 = new EnumC14590t("HSPAP", 15);
        EnumC14590t enumC14590t17 = new EnumC14590t("GSM", 16);
        EnumC14590t enumC14590t18 = new EnumC14590t("TD_SCDMA", 17);
        EnumC14590t enumC14590t19 = new EnumC14590t("IWLAN", 18);
        EnumC14590t enumC14590t20 = new EnumC14590t("LTE_CA", 19);
        f53664x = new EnumC14590t[]{enumC14590t, enumC14590t2, enumC14590t3, enumC14590t4, enumC14590t5, enumC14590t6, enumC14590t7, enumC14590t8, enumC14590t9, enumC14590t10, enumC14590t11, enumC14590t12, enumC14590t13, enumC14590t14, enumC14590t15, enumC14590t16, enumC14590t17, enumC14590t18, enumC14590t19, enumC14590t20, new EnumC14590t("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        f53663w = sparseArray;
        sparseArray.put(0, enumC14590t);
        sparseArray.put(1, enumC14590t2);
        sparseArray.put(2, enumC14590t3);
        sparseArray.put(3, enumC14590t4);
        sparseArray.put(4, enumC14590t5);
        sparseArray.put(5, enumC14590t6);
        sparseArray.put(6, enumC14590t7);
        sparseArray.put(7, enumC14590t8);
        sparseArray.put(8, enumC14590t9);
        sparseArray.put(9, enumC14590t10);
        sparseArray.put(10, enumC14590t11);
        sparseArray.put(11, enumC14590t12);
        sparseArray.put(12, enumC14590t13);
        sparseArray.put(13, enumC14590t14);
        sparseArray.put(14, enumC14590t15);
        sparseArray.put(15, enumC14590t16);
        sparseArray.put(16, enumC14590t17);
        sparseArray.put(17, enumC14590t18);
        sparseArray.put(18, enumC14590t19);
        sparseArray.put(19, enumC14590t20);
    }

    public static EnumC14590t valueOf(String str) {
        return (EnumC14590t) Enum.valueOf(EnumC14590t.class, str);
    }

    public static EnumC14590t[] values() {
        return (EnumC14590t[]) f53664x.clone();
    }
}
