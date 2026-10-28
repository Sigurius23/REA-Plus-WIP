package p499t9;

import android.util.Base64;
import androidx.health.platform.client.proto.C1533u;
import androidx.media3.common.ParserException;
import com.iterable.iterableapi.C5363q;
import com.mapbox.maps.C5538l;
import cr.C11078p;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import live.hms.video.error.ErrorCodes;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.joda.time.DateTimeConstants;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p085d9.C11793j;
import p142fa.C14293a;
import p188ha.C17040i;
import p276ka.C22307a;
import p309lo.C24561s;
import p497t7.InterfaceC33561b;
import p516u8.C34585c0;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: t9.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC33618a {

    /* JADX INFO: renamed from: a */
    public static final int[] f140302a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b */
    public static final int[] f140303b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: c */
    public static final int[] f140304c = {1, 2, 3, 6};

    /* JADX INFO: renamed from: d */
    public static final int[] f140305d = {48000, 44100, 32000};

    /* JADX INFO: renamed from: e */
    public static final int[] f140306e = {24000, 22050, 16000};

    /* JADX INFO: renamed from: f */
    public static final int[] f140307f = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: g */
    public static final int[] f140308g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: h */
    public static final int[] f140309h = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: i */
    public static final int[] f140310i = {ErrorCodes.InitAPIErrors.cInvalidEndpointURL, ErrorCodes.InitAPIErrors.cServerErrors, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS};

    /* JADX INFO: renamed from: j */
    public static final int[] f140311j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: k */
    public static final int[] f140312k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: l */
    public static final int[] f140313l = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED, 1152, 1280, 1536, 1920, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX INFO: renamed from: m */
    public static final int[] f140314m = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* JADX INFO: renamed from: n */
    public static final int[] f140315n = {5, 8, 10, 12};

    /* JADX INFO: renamed from: o */
    public static final int[] f140316o = {6, 9, 12, 15};

    /* JADX INFO: renamed from: p */
    public static final int[] f140317p = {2, 4, 6, 8};

    /* JADX INFO: renamed from: q */
    public static final int[] f140318q = {9, 11, 13, 16};

    /* JADX INFO: renamed from: r */
    public static final int[] f140319r = {5, 8, 10, 12};

    /* JADX INFO: renamed from: s */
    public static final String[] f140320s = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: t */
    public static final int[] f140321t = {44100, 48000, 32000};

    /* JADX INFO: renamed from: u */
    public static final int[] f140322u = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: v */
    public static final int[] f140323v = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: w */
    public static final int[] f140324w = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: x */
    public static final int[] f140325x = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: y */
    public static final int[] f140326y = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: renamed from: a */
    public static ArrayList m106209a(byte[] bArr) {
        long j7 = (((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255))) * 1000000000) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j7).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m106210b(C38059n c38059n, C33653v c33653v, int i13, C33650s c33650s) {
        long jM121869v = c38059n.m121869v();
        long j7 = jM121869v >>> 16;
        if (j7 != i13) {
            return false;
        }
        boolean z4 = (j7 & 1) == 1;
        int i14 = (int) ((jM121869v >> 12) & 15);
        int i15 = (int) ((jM121869v >> 8) & 15);
        int i16 = (int) ((jM121869v >> 4) & 15);
        int i17 = (int) ((jM121869v >> 1) & 7);
        boolean z13 = (jM121869v & 1) == 1;
        if (i16 <= 7) {
            if (i16 != c33653v.f140450h - 1) {
                return false;
            }
        } else if (i16 > 10 || c33653v.f140450h != 2) {
            return false;
        }
        if (!(i17 == 0 || i17 == c33653v.f140452j) || z13) {
            return false;
        }
        try {
            long jM121841A = c38059n.m121841A();
            if (!z4) {
                jM121841A *= (long) c33653v.f140445c;
            }
            c33650s.f140436a = jM121841A;
            int iM106227s = m106227s(i14, c38059n);
            if (iM106227s == -1 || iM106227s > c33653v.f140445c) {
                return false;
            }
            int i18 = c33653v.f140448f;
            if (i15 != 0) {
                if (i15 <= 11) {
                    if (i15 != c33653v.f140449g) {
                        return false;
                    }
                } else if (i15 != 12) {
                    if (i15 > 14) {
                        return false;
                    }
                    int iM121873z = c38059n.m121873z();
                    if (i15 == 14) {
                        iM121873z *= 10;
                    }
                    if (iM121873z != i18) {
                        return false;
                    }
                } else if (c38059n.m121867t() * 1000 != i18) {
                    return false;
                }
            }
            int iM121867t = c38059n.m121867t();
            int i19 = c38059n.f163018b;
            byte[] bArr = c38059n.f163017a;
            int i24 = i19 - 1;
            int i25 = 0;
            for (int i26 = c38059n.f163018b; i26 < i24; i26++) {
                i25 = AbstractC38065t.f163043m[i25 ^ (bArr[i26] & 255)];
            }
            int i27 = AbstractC38065t.f163031a;
            return iM121867t == i25;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m106211c(String str, boolean z4) throws ParserException {
        if (!z4) {
            throw ParserException.m5049a(null, str);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m106212d(long j7, C38059n c38059n, InterfaceC33639k0[] interfaceC33639k0Arr) {
        int i13;
        int iM121867t;
        while (true) {
            if (c38059n.m121848a() <= 1) {
                return;
            }
            int i14 = 0;
            while (true) {
                if (c38059n.m121848a() == 0) {
                    i13 = -1;
                    break;
                }
                int iM121867t2 = c38059n.m121867t();
                i14 += iM121867t2;
                if (iM121867t2 != 255) {
                    i13 = i14;
                    break;
                }
            }
            int i15 = 0;
            do {
                if (c38059n.m121848a() == 0) {
                    i15 = -1;
                    break;
                } else {
                    iM121867t = c38059n.m121867t();
                    i15 += iM121867t;
                }
            } while (iM121867t == 255);
            int i16 = c38059n.f163018b + i15;
            if (i15 == -1 || i15 > c38059n.m121848a()) {
                AbstractC38046a.m121826u("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i16 = c38059n.f163019c;
            } else if (i13 == 4 && i15 >= 8) {
                int iM121867t3 = c38059n.m121867t();
                int iM121873z = c38059n.m121873z();
                int iM121854g = iM121873z == 49 ? c38059n.m121854g() : 0;
                int iM121867t4 = c38059n.m121867t();
                if (iM121873z == 47) {
                    c38059n.m121847G(1);
                }
                boolean z4 = iM121867t3 == 181 && (iM121873z == 49 || iM121873z == 47) && iM121867t4 == 3;
                if (iM121873z == 49) {
                    z4 &= iM121854g == 1195456820;
                }
                if (z4) {
                    m106213e(j7, c38059n, interfaceC33639k0Arr);
                }
            }
            c38059n.m121846F(i16);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m106213e(long j7, C38059n c38059n, InterfaceC33639k0[] interfaceC33639k0Arr) {
        int iM121867t = c38059n.m121867t();
        if ((iM121867t & 64) != 0) {
            c38059n.m121847G(1);
            int i13 = (iM121867t & 31) * 3;
            int i14 = c38059n.f163018b;
            for (InterfaceC33639k0 interfaceC33639k0 : interfaceC33639k0Arr) {
                c38059n.m121846F(i14);
                interfaceC33639k0.mo36176d(c38059n, i13, 0);
                AbstractC35849g.m113807i(j7 != -9223372036854775807L);
                interfaceC33639k0.mo36174b(j7, 1, i13, 0, null);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m106214f(int i13, int i14) {
        int i15 = i14 / 2;
        if (i13 < 0 || i13 >= 3 || i14 < 0 || i15 >= 19) {
            return -1;
        }
        int i16 = f140305d[i13];
        if (i16 == 44100) {
            return ((i14 % 2) + f140309h[i15]) * 2;
        }
        int i17 = f140308g[i15];
        return i16 == 32000 ? i17 * 6 : i17 * 4;
    }

    /* JADX INFO: renamed from: g */
    public static void m106215g(int i13, C38059n c38059n) {
        c38059n.m121843C(7);
        byte[] bArr = c38059n.f163017a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i13 >> 16) & 255);
        bArr[5] = (byte) ((i13 >> 8) & 255);
        bArr[6] = (byte) (i13 & 255);
    }

    /* JADX INFO: renamed from: h */
    public static int m106216h(int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if ((i13 & (-2097152)) != -2097152 || (i14 = (i13 >>> 19) & 3) == 1 || (i15 = (i13 >>> 17) & 3) == 0 || (i16 = (i13 >>> 12) & 15) == 0 || i16 == 15 || (i17 = (i13 >>> 10) & 3) == 3) {
            return -1;
        }
        int i19 = f140321t[i17];
        if (i14 == 2) {
            i19 /= 2;
        } else if (i14 == 0) {
            i19 /= 4;
        }
        int i24 = (i13 >>> 9) & 1;
        if (i15 == 3) {
            return ((((i14 == 3 ? f140322u[i16 - 1] : f140323v[i16 - 1]) * 12) / i19) + i24) * 4;
        }
        if (i14 == 3) {
            i18 = i15 == 2 ? f140324w[i16 - 1] : f140325x[i16 - 1];
        } else {
            i18 = f140326y[i16 - 1];
        }
        if (i14 == 3) {
            return AbstractC11266d.m30446D(i18, 144, i19, i24);
        }
        return AbstractC11266d.m30446D(i15 == 1 ? 72 : 144, i18, i19, i24);
    }

    /* JADX INFO: renamed from: i */
    public static C24561s m106217i(byte[] bArr) {
        byte b = bArr[0];
        if (b == 127 || b == 100 || b == 64 || b == 113) {
            return new C24561s(bArr, bArr.length, 5, (byte) 0);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b6 = bArrCopyOf[0];
        if (b6 == -2 || b6 == -1 || b6 == 37 || b6 == -14 || b6 == -24) {
            for (int i13 = 0; i13 < bArrCopyOf.length - 1; i13 += 2) {
                byte b8 = bArrCopyOf[i13];
                int i14 = i13 + 1;
                bArrCopyOf[i13] = bArrCopyOf[i14];
                bArrCopyOf[i14] = b8;
            }
        }
        C24561s c24561s = new C24561s(bArrCopyOf, bArrCopyOf.length, 5, (byte) 0);
        if (bArrCopyOf[0] == 31) {
            C24561s c24561s2 = new C24561s(bArrCopyOf, bArrCopyOf.length, 5, (byte) 0);
            while (c24561s2.m71625b() >= 16) {
                c24561s2.m71643t(2);
                int iM71632i = c24561s2.m71632i(14) & 16383;
                int iMin = Math.min(8 - c24561s.f95860d, 14);
                int i15 = c24561s.f95860d;
                int i16 = (8 - i15) - iMin;
                byte[] bArr2 = c24561s.f95858b;
                int i17 = c24561s.f95859c;
                byte b14 = (byte) (((65280 >> i15) | ((1 << i16) - 1)) & bArr2[i17]);
                bArr2[i17] = b14;
                int i18 = 14 - iMin;
                bArr2[i17] = (byte) (b14 | ((iM71632i >>> i18) << i16));
                int i19 = i17 + 1;
                while (i18 > 8) {
                    c24561s.f95858b[i19] = (byte) (iM71632i >>> (i18 - 8));
                    i18 -= 8;
                    i19++;
                }
                int i24 = 8 - i18;
                byte[] bArr3 = c24561s.f95858b;
                byte b15 = (byte) (bArr3[i19] & ((1 << i24) - 1));
                bArr3[i19] = b15;
                bArr3[i19] = (byte) (((iM71632i & ((1 << i18) - 1)) << i24) | b15);
                c24561s.m71643t(14);
                c24561s.m71624a();
            }
        }
        c24561s.m71638o(bArrCopyOf.length, bArrCopyOf);
        return c24561s;
    }

    /* JADX INFO: renamed from: j */
    public static long m106218j(byte b, byte b6) {
        int i13;
        int i14;
        int i15 = b & 255;
        int i16 = b & 3;
        if (i16 != 0) {
            i13 = 2;
            if (i16 != 1 && i16 != 2) {
                i13 = b6 & 63;
            }
        } else {
            i13 = 1;
        }
        int i17 = i15 >> 3;
        int i18 = i17 & 3;
        if (i17 >= 16) {
            i14 = 2500 << i18;
        } else if (i17 >= 12) {
            i14 = InterfaceC33561b.INVALID_OWNERSHIP << (i17 & 1);
        } else {
            i14 = i18 == 3 ? DateTimeConstants.MILLIS_PER_MINUTE : InterfaceC33561b.INVALID_OWNERSHIP << i18;
        }
        return ((long) i13) * ((long) i14);
    }

    /* JADX INFO: renamed from: k */
    public static int m106219k(C24561s c24561s) throws ParserException {
        int iM71632i = c24561s.m71632i(4);
        if (iM71632i == 15) {
            if (c24561s.m71625b() >= 24) {
                return c24561s.m71632i(24);
            }
            throw ParserException.m5049a(null, "AAC header insufficient data");
        }
        if (iM71632i < 13) {
            return f140302a[iM71632i];
        }
        throw ParserException.m5049a(null, "AAC header wrong Sampling Frequency Index");
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    /* JADX INFO: renamed from: l */
    public static C11078p m106220l(C24561s c24561s) {
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
        int[] iArr = f140310i;
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

    /* JADX INFO: renamed from: m */
    public static C5363q m106221m(C24561s c24561s, boolean z4) throws ParserException {
        int iM71632i = c24561s.m71632i(5);
        if (iM71632i == 31) {
            iM71632i = c24561s.m71632i(6) + 32;
        }
        int iM106219k = m106219k(c24561s);
        int iM71632i2 = c24561s.m71632i(4);
        String strM8295h = AbstractC2875y.m8295h(iM71632i, "mp4a.40.");
        if (iM71632i == 5 || iM71632i == 29) {
            iM106219k = m106219k(c24561s);
            int iM71632i3 = c24561s.m71632i(5);
            if (iM71632i3 == 31) {
                iM71632i3 = c24561s.m71632i(6) + 32;
            }
            iM71632i = iM71632i3;
            if (iM71632i == 22) {
                iM71632i2 = c24561s.m71632i(4);
            }
        }
        if (z4) {
            if (iM71632i != 1 && iM71632i != 2 && iM71632i != 3 && iM71632i != 4 && iM71632i != 6 && iM71632i != 7 && iM71632i != 17) {
                switch (iM71632i) {
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    case 20:
                    case 21:
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        break;
                    default:
                        throw ParserException.m5051c("Unsupported audio object type: " + iM71632i);
                }
            }
            if (c24561s.m71631h()) {
                AbstractC38046a.m121826u("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (c24561s.m71631h()) {
                c24561s.m71643t(14);
            }
            boolean zM71631h = c24561s.m71631h();
            if (iM71632i2 == 0) {
                throw new UnsupportedOperationException();
            }
            if (iM71632i == 6 || iM71632i == 20) {
                c24561s.m71643t(3);
            }
            if (zM71631h) {
                if (iM71632i == 22) {
                    c24561s.m71643t(16);
                }
                if (iM71632i == 17 || iM71632i == 19 || iM71632i == 20 || iM71632i == 23) {
                    c24561s.m71643t(3);
                }
                c24561s.m71643t(1);
            }
            switch (iM71632i) {
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                case 20:
                case 21:
                case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                    int iM71632i4 = c24561s.m71632i(2);
                    if (iM71632i4 == 2 || iM71632i4 == 3) {
                        throw ParserException.m5051c("Unsupported epConfig: " + iM71632i4);
                    }
                    break;
            }
        }
        int i13 = f140303b[iM71632i2];
        if (i13 != -1) {
            return new C5363q(iM106219k, i13, strM8295h);
        }
        throw ParserException.m5049a(null, null);
    }

    /* JADX INFO: renamed from: n */
    public static void m106222n(C24561s c24561s, C11793j c11793j) throws ParserException {
        int iM71632i = c24561s.m71632i(5);
        c24561s.m71643t(2);
        if (c24561s.m71631h()) {
            c24561s.m71643t(5);
        }
        if (iM71632i >= 7 && iM71632i <= 10) {
            c24561s.m71642s();
        }
        if (c24561s.m71631h()) {
            int iM71632i2 = c24561s.m71632i(3);
            if (c11793j.f38243b == -1 && iM71632i >= 0 && iM71632i <= 15 && (iM71632i2 == 0 || iM71632i2 == 1)) {
                c11793j.f38243b = iM71632i;
            }
            if (c24561s.m71631h()) {
                m106230v(c24561s);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m106223o(C24561s c24561s, C11793j c11793j) throws ParserException {
        c24561s.m71643t(2);
        boolean zM71631h = c24561s.m71631h();
        int iM71632i = c24561s.m71632i(8);
        for (int i13 = 0; i13 < iM71632i; i13++) {
            c24561s.m71643t(2);
            if (c24561s.m71631h()) {
                c24561s.m71643t(5);
            }
            if (zM71631h) {
                c24561s.m71643t(24);
            } else {
                if (c24561s.m71631h()) {
                    if (!c24561s.m71631h()) {
                        c24561s.m71643t(4);
                    }
                    c11793j.f38244c = c24561s.m71632i(6) + 1;
                }
                c24561s.m71643t(4);
            }
        }
        if (c24561s.m71631h()) {
            c24561s.m71643t(3);
            if (c24561s.m71631h()) {
                m106230v(c24561s);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public static int m106224p(C24561s c24561s, int[] iArr) {
        int i13 = 0;
        for (int i14 = 0; i14 < 3 && c24561s.m71631h(); i14++) {
            i13++;
        }
        int i15 = 0;
        for (int i16 = 0; i16 < i13; i16++) {
            i15 += 1 << iArr[i16];
        }
        return c24561s.m71632i(iArr[i13]) + i15;
    }

    /* JADX INFO: renamed from: q */
    public static C34585c0 m106225q(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < list.size(); i13++) {
            String str = (String) list.get(i13);
            int i14 = AbstractC38065t.f163031a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                AbstractC38046a.m121826u("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(C14293a.m40836b(new C38059n(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e5) {
                    AbstractC38046a.m121827v("VorbisUtil", "Failed to parse vorbis picture", e5);
                }
            } else {
                arrayList.add(new C22307a(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C34585c0(arrayList);
    }

    /* JADX INFO: renamed from: r */
    public static C34585c0 m106226r(InterfaceC33646o interfaceC33646o, boolean z4) throws Throwable {
        C5538l c5538l = z4 ? null : C17040i.f65526b;
        C38059n c38059n = new C38059n(10);
        C34585c0 c34585c0M48121a0 = null;
        int i13 = 0;
        while (true) {
            try {
                interfaceC33646o.mo3103p(c38059n.f163017a, 0, 10);
                c38059n.m121846F(0);
                if (c38059n.m121870w() != 4801587) {
                    break;
                }
                c38059n.m121847G(3);
                int iM121866s = c38059n.m121866s();
                int i14 = iM121866s + 10;
                if (c34585c0M48121a0 == null) {
                    byte[] bArr = new byte[i14];
                    System.arraycopy(c38059n.f163017a, 0, bArr, 0, 10);
                    interfaceC33646o.mo3103p(bArr, 10, iM121866s);
                    c34585c0M48121a0 = new C17040i(c5538l).m48121a0(i14, bArr);
                } else {
                    interfaceC33646o.mo3096i(iM121866s);
                }
                i13 += i14;
            } catch (EOFException unused) {
            }
        }
        interfaceC33646o.mo3093e();
        interfaceC33646o.mo3096i(i13);
        if (c34585c0M48121a0 == null || c34585c0M48121a0.f145640a.length == 0) {
            return null;
        }
        return c34585c0M48121a0;
    }

    /* JADX INFO: renamed from: s */
    public static int m106227s(int i13, C38059n c38059n) {
        switch (i13) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i13 - 2);
            case 6:
                return c38059n.m121867t() + 1;
            case 7:
                return c38059n.m121873z() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i13 - 8);
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: t */
    public static C33652u m106228t(C38059n c38059n) {
        c38059n.m121847G(1);
        int iM121870w = c38059n.m121870w();
        long j7 = ((long) c38059n.f163018b) + ((long) iM121870w);
        int i13 = iM121870w / 18;
        long[] jArrCopyOf = new long[i13];
        long[] jArrCopyOf2 = new long[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            long jM121861n = c38059n.m121861n();
            if (jM121861n == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i14);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i14);
                break;
            }
            jArrCopyOf[i14] = jM121861n;
            jArrCopyOf2[i14] = c38059n.m121861n();
            c38059n.m121847G(2);
        }
        c38059n.m121847G((int) (j7 - ((long) c38059n.f163018b)));
        return new C33652u(jArrCopyOf, jArrCopyOf2);
    }

    /* JADX INFO: renamed from: u */
    public static C33643m0 m106229u(C38059n c38059n, boolean z4, boolean z13) throws ParserException {
        if (z4) {
            m106231w(3, c38059n, false);
        }
        c38059n.m121865r((int) c38059n.m121858k(), StandardCharsets.UTF_8);
        long jM121858k = c38059n.m121858k();
        String[] strArr = new String[(int) jM121858k];
        for (int i13 = 0; i13 < jM121858k; i13++) {
            strArr[i13] = c38059n.m121865r((int) c38059n.m121858k(), StandardCharsets.UTF_8);
        }
        if (z13 && (c38059n.m121867t() & 1) == 0) {
            throw ParserException.m5049a(null, "framing bit expected to be set");
        }
        return new C33643m0(strArr);
    }

    /* JADX INFO: renamed from: v */
    public static void m106230v(C24561s c24561s) throws ParserException {
        int iM71632i = c24561s.m71632i(6);
        if (iM71632i < 2 || iM71632i > 42) {
            throw ParserException.m5051c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iM71632i)));
        }
        c24561s.m71643t(iM71632i * 8);
    }

    /* JADX INFO: renamed from: w */
    public static boolean m106231w(int i13, C38059n c38059n, boolean z4) throws ParserException {
        if (c38059n.m121848a() < 7) {
            if (z4) {
                return false;
            }
            throw ParserException.m5049a(null, "too short header: " + c38059n.m121848a());
        }
        if (c38059n.m121867t() != i13) {
            if (z4) {
                return false;
            }
            throw ParserException.m5049a(null, "expected header type " + Integer.toHexString(i13));
        }
        if (c38059n.m121867t() == 118 && c38059n.m121867t() == 111 && c38059n.m121867t() == 114 && c38059n.m121867t() == 98 && c38059n.m121867t() == 105 && c38059n.m121867t() == 115) {
            return true;
        }
        if (z4) {
            return false;
        }
        throw ParserException.m5049a(null, "expected characters 'vorbis'");
    }
}
