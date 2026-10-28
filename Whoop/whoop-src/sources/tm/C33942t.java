package tm;

import androidx.health.platform.client.proto.C1533u;

/* JADX INFO: renamed from: tm.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C33942t {

    /* JADX INFO: renamed from: a */
    public static final C33942t f142297a = new C33942t();

    /* JADX INFO: renamed from: a */
    public static int m107376a(int i13) {
        switch (i13) {
            case 5:
                return 80000;
            case 6:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return 336000;
        }
    }
}
