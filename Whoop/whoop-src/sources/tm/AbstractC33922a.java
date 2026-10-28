package tm;

import android.util.Log;
import androidx.health.platform.client.proto.C1533u;
import com.google.android.exoplayer2.ParserException;
import com.iterable.iterableapi.C5363q;
import cr.C11078p;
import ed3.C13117a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import live.hms.video.error.ErrorCodes;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p309lo.C24561s;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: tm.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC33922a {

    /* JADX INFO: renamed from: a */
    public static final int[] f142136a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b */
    public static final int[] f142137b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: c */
    public static final int[] f142138c = {1, 2, 3, 6};

    /* JADX INFO: renamed from: d */
    public static final int[] f142139d = {48000, 44100, 32000};

    /* JADX INFO: renamed from: e */
    public static final int[] f142140e = {24000, 22050, 16000};

    /* JADX INFO: renamed from: f */
    public static final int[] f142141f = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: g */
    public static final int[] f142142g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: h */
    public static final int[] f142143h = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: i */
    public static final int[] f142144i = {ErrorCodes.InitAPIErrors.cInvalidEndpointURL, ErrorCodes.InitAPIErrors.cServerErrors, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS};

    /* JADX INFO: renamed from: j */
    public static final int[] f142145j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: k */
    public static final int[] f142146k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: l */
    public static final int[] f142147l = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED, 1152, 1280, 1536, 1920, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX INFO: renamed from: m */
    public static final String[] f142148m = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: n */
    public static final int[] f142149n = {44100, 48000, 32000};

    /* JADX INFO: renamed from: o */
    public static final int[] f142150o = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: p */
    public static final int[] f142151p = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: q */
    public static final int[] f142152q = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: r */
    public static final int[] f142153r = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: s */
    public static final int[] f142154s = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: renamed from: a */
    public static ArrayList m107327a(byte[] bArr) {
        long j7 = (((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255))) * 1000000000) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j7).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static int m107328b(int i13, int i14) {
        int i15 = i14 / 2;
        if (i13 < 0 || i13 >= 3 || i14 < 0 || i15 >= 19) {
            return -1;
        }
        int i16 = f142139d[i13];
        if (i16 == 44100) {
            return ((i14 % 2) + f142143h[i15]) * 2;
        }
        int i17 = f142142g[i15];
        return i16 == 32000 ? i17 * 6 : i17 * 4;
    }

    /* JADX INFO: renamed from: c */
    public static void m107329c(int i13, C13117a c13117a) {
        c13117a.m36686H(7);
        byte[] bArr = c13117a.f45381a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i13 >> 16) & 255);
        bArr[5] = (byte) ((i13 >> 8) & 255);
        bArr[6] = (byte) (i13 & 255);
    }

    /* JADX INFO: renamed from: d */
    public static int m107330d(int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if ((i13 & (-2097152)) != -2097152 || (i14 = (i13 >>> 19) & 3) == 1 || (i15 = (i13 >>> 17) & 3) == 0 || (i16 = (i13 >>> 12) & 15) == 0 || i16 == 15 || (i17 = (i13 >>> 10) & 3) == 3) {
            return -1;
        }
        int i19 = f142149n[i17];
        if (i14 == 2) {
            i19 /= 2;
        } else if (i14 == 0) {
            i19 /= 4;
        }
        int i24 = (i13 >>> 9) & 1;
        if (i15 == 3) {
            return ((((i14 == 3 ? f142150o[i16 - 1] : f142151p[i16 - 1]) * 12) / i19) + i24) * 4;
        }
        if (i14 == 3) {
            i18 = i15 == 2 ? f142152q[i16 - 1] : f142153r[i16 - 1];
        } else {
            i18 = f142154s[i16 - 1];
        }
        if (i14 == 3) {
            return AbstractC11266d.m30446D(i18, 144, i19, i24);
        }
        return AbstractC11266d.m30446D(i15 == 1 ? 72 : 144, i18, i19, i24);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    /* JADX INFO: renamed from: e */
    public static C11078p m107331e(C24561s c24561s) {
        int i13;
        int i14;
        int iM71632i = c24561s.m71632i(16);
        int iM71632i2 = c24561s.m71632i(16);
        if (iM71632i2 == 65535) {
            iM71632i2 = c24561s.m71632i(24);
            i13 = 7;
        } else {
            i13 = 4;
        }
        int i15 = iM71632i2 + i13;
        if (iM71632i == 44097) {
            i15 += 2;
        }
        if (c24561s.m71632i(2) == 3) {
            do {
                c24561s.m71632i(2);
            } while (c24561s.m71631h());
        }
        int iM71632i3 = c24561s.m71632i(10);
        if (c24561s.m71631h() && c24561s.m71632i(3) > 0) {
            c24561s.m71643t(2);
        }
        int i16 = c24561s.m71631h() ? 48000 : 44100;
        int iM71632i4 = c24561s.m71632i(4);
        int[] iArr = f142144i;
        if (i16 == 44100 && iM71632i4 == 13) {
            i14 = iArr[iM71632i4];
        } else if (i16 != 48000 || iM71632i4 >= 14) {
            i14 = 0;
        } else {
            int i17 = iArr[iM71632i4];
            int i18 = iM71632i3 % 5;
            if (i18 == 1) {
                if (iM71632i4 != 3 || iM71632i4 == 8) {
                    i14 = i17 + 1;
                } else {
                    i14 = i17;
                }
            } else if (i18 != 2) {
                if (i18 == 3) {
                    if (iM71632i4 != 3) {
                    }
                    i14 = i17 + 1;
                } else if (i18 == 4 && (iM71632i4 == 3 || iM71632i4 == 8 || iM71632i4 == 11)) {
                    i14 = i17 + 1;
                } else {
                    i14 = i17;
                }
            } else if (iM71632i4 == 8 || iM71632i4 == 11) {
                i14 = i17 + 1;
            } else {
                i14 = i17;
            }
        }
        return new C11078p(i16, i15, i14);
    }

    /* JADX INFO: renamed from: f */
    public static C5363q m107332f(C24561s c24561s, boolean z4) throws ParserException {
        int iM71632i;
        int iM71632i2;
        int iM71632i3 = c24561s.m71632i(5);
        if (iM71632i3 == 31) {
            iM71632i3 = c24561s.m71632i(6) + 32;
        }
        int iM71632i4 = c24561s.m71632i(4);
        int[] iArr = f142136a;
        if (iM71632i4 == 15) {
            iM71632i = c24561s.m71632i(24);
        } else {
            if (iM71632i4 >= 13) {
                throw ParserException.m15562a(null, null);
            }
            iM71632i = iArr[iM71632i4];
        }
        int iM71632i5 = c24561s.m71632i(4);
        String strM95634j = AbstractC31061c.m95634j(19, iM71632i3, "mp4a.40.");
        if (iM71632i3 == 5 || iM71632i3 == 29) {
            int iM71632i6 = c24561s.m71632i(4);
            if (iM71632i6 == 15) {
                iM71632i2 = c24561s.m71632i(24);
            } else {
                if (iM71632i6 >= 13) {
                    throw ParserException.m15562a(null, null);
                }
                iM71632i2 = iArr[iM71632i6];
            }
            iM71632i = iM71632i2;
            int iM71632i7 = c24561s.m71632i(5);
            if (iM71632i7 == 31) {
                iM71632i7 = c24561s.m71632i(6) + 32;
            }
            iM71632i3 = iM71632i7;
            if (iM71632i3 == 22) {
                iM71632i5 = c24561s.m71632i(4);
            }
        }
        if (z4) {
            if (iM71632i3 != 1 && iM71632i3 != 2 && iM71632i3 != 3 && iM71632i3 != 4 && iM71632i3 != 6 && iM71632i3 != 7 && iM71632i3 != 17) {
                switch (iM71632i3) {
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    case 20:
                    case 21:
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        break;
                    default:
                        StringBuilder sb4 = new StringBuilder(42);
                        sb4.append("Unsupported audio object type: ");
                        sb4.append(iM71632i3);
                        throw ParserException.m15564c(sb4.toString());
                }
            }
            if (c24561s.m71631h()) {
                Log.w("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (c24561s.m71631h()) {
                c24561s.m71643t(14);
            }
            boolean zM71631h = c24561s.m71631h();
            if (iM71632i5 == 0) {
                throw new UnsupportedOperationException();
            }
            if (iM71632i3 == 6 || iM71632i3 == 20) {
                c24561s.m71643t(3);
            }
            if (zM71631h) {
                if (iM71632i3 == 22) {
                    c24561s.m71643t(16);
                }
                if (iM71632i3 == 17 || iM71632i3 == 19 || iM71632i3 == 20 || iM71632i3 == 23) {
                    c24561s.m71643t(3);
                }
                c24561s.m71643t(1);
            }
            switch (iM71632i3) {
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                case 20:
                case 21:
                case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                    int iM71632i8 = c24561s.m71632i(2);
                    if (iM71632i8 == 2 || iM71632i8 == 3) {
                        StringBuilder sb5 = new StringBuilder(33);
                        sb5.append("Unsupported epConfig: ");
                        sb5.append(iM71632i8);
                        throw ParserException.m15564c(sb5.toString());
                    }
                    break;
            }
        }
        int i13 = f142137b[iM71632i5];
        if (i13 != -1) {
            return new C5363q(iM71632i, i13, strM95634j);
        }
        throw ParserException.m15562a(null, null);
    }

    /* JADX INFO: renamed from: g */
    public static int m107333g(int i13) {
        int i14;
        int i15;
        if ((i13 & (-2097152)) == -2097152 && (i14 = (i13 >>> 19) & 3) != 1 && (i15 = (i13 >>> 17) & 3) != 0) {
            int i16 = (i13 >>> 12) & 15;
            int i17 = (i13 >>> 10) & 3;
            if (i16 != 0 && i16 != 15 && i17 != 3) {
                if (i15 == 1) {
                    return i14 == 3 ? 1152 : 576;
                }
                if (i15 == 2) {
                    return 1152;
                }
                if (i15 == 3) {
                    return 384;
                }
                throw new IllegalArgumentException();
            }
        }
        return -1;
    }
}
