package p085d9;

import androidx.health.platform.client.proto.C1533u;

/* JADX INFO: renamed from: d9.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C11808y {

    /* JADX INFO: renamed from: a */
    public static final C11808y f38398a = new C11808y();

    /* JADX INFO: renamed from: a */
    public static int m31654a(int i13) {
        if (i13 == 20) {
            return 63750;
        }
        if (i13 == 30) {
            return 2250000;
        }
        switch (i13) {
            case 5:
                return 80000;
            case 6:
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
            default:
                switch (i13) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return 336000;
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return 768000;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }
}
