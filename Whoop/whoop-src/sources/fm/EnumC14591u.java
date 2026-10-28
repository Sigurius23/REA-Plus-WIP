package fm;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: fm.u */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC14591u {

    /* JADX INFO: renamed from: w */
    public static final SparseArray f53665w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC14591u[] f53666x;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC14591u EF1;

    static {
        EnumC14591u enumC14591u = new EnumC14591u("MOBILE", 0);
        EnumC14591u enumC14591u2 = new EnumC14591u("WIFI", 1);
        EnumC14591u enumC14591u3 = new EnumC14591u("MOBILE_MMS", 2);
        EnumC14591u enumC14591u4 = new EnumC14591u("MOBILE_SUPL", 3);
        EnumC14591u enumC14591u5 = new EnumC14591u("MOBILE_DUN", 4);
        EnumC14591u enumC14591u6 = new EnumC14591u("MOBILE_HIPRI", 5);
        EnumC14591u enumC14591u7 = new EnumC14591u("WIMAX", 6);
        EnumC14591u enumC14591u8 = new EnumC14591u("BLUETOOTH", 7);
        EnumC14591u enumC14591u9 = new EnumC14591u("DUMMY", 8);
        EnumC14591u enumC14591u10 = new EnumC14591u("ETHERNET", 9);
        EnumC14591u enumC14591u11 = new EnumC14591u("MOBILE_FOTA", 10);
        EnumC14591u enumC14591u12 = new EnumC14591u("MOBILE_IMS", 11);
        EnumC14591u enumC14591u13 = new EnumC14591u("MOBILE_CBS", 12);
        EnumC14591u enumC14591u14 = new EnumC14591u("WIFI_P2P", 13);
        EnumC14591u enumC14591u15 = new EnumC14591u("MOBILE_IA", 14);
        EnumC14591u enumC14591u16 = new EnumC14591u("MOBILE_EMERGENCY", 15);
        EnumC14591u enumC14591u17 = new EnumC14591u("PROXY", 16);
        EnumC14591u enumC14591u18 = new EnumC14591u("VPN", 17);
        EnumC14591u enumC14591u19 = new EnumC14591u("NONE", 18);
        f53666x = new EnumC14591u[]{enumC14591u, enumC14591u2, enumC14591u3, enumC14591u4, enumC14591u5, enumC14591u6, enumC14591u7, enumC14591u8, enumC14591u9, enumC14591u10, enumC14591u11, enumC14591u12, enumC14591u13, enumC14591u14, enumC14591u15, enumC14591u16, enumC14591u17, enumC14591u18, enumC14591u19};
        SparseArray sparseArray = new SparseArray();
        f53665w = sparseArray;
        sparseArray.put(0, enumC14591u);
        sparseArray.put(1, enumC14591u2);
        sparseArray.put(2, enumC14591u3);
        sparseArray.put(3, enumC14591u4);
        sparseArray.put(4, enumC14591u5);
        sparseArray.put(5, enumC14591u6);
        sparseArray.put(6, enumC14591u7);
        sparseArray.put(7, enumC14591u8);
        sparseArray.put(8, enumC14591u9);
        sparseArray.put(9, enumC14591u10);
        sparseArray.put(10, enumC14591u11);
        sparseArray.put(11, enumC14591u12);
        sparseArray.put(12, enumC14591u13);
        sparseArray.put(13, enumC14591u14);
        sparseArray.put(14, enumC14591u15);
        sparseArray.put(15, enumC14591u16);
        sparseArray.put(16, enumC14591u17);
        sparseArray.put(17, enumC14591u18);
        sparseArray.put(-1, enumC14591u19);
    }

    public static EnumC14591u valueOf(String str) {
        return (EnumC14591u) Enum.valueOf(EnumC14591u.class, str);
    }

    public static EnumC14591u[] values() {
        return (EnumC14591u[]) f53666x.clone();
    }
}
