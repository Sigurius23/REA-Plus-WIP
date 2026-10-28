package p309lo;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.health.platform.client.proto.C1533u;
import androidx.recyclerview.widget.AbstractC1707m0;
import ed3.C13117a;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import live.hms.video.error.ErrorCodes;
import mo.C25727h;
import org.joda.time.DateTimeConstants;
import p460rg.AbstractC31375j;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: lo.y */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC24567y {

    /* JADX INFO: renamed from: a */
    public static final int f95875a;

    /* JADX INFO: renamed from: b */
    public static final String f95876b;

    /* JADX INFO: renamed from: c */
    public static final String f95877c;

    /* JADX INFO: renamed from: d */
    public static final String f95878d;

    /* JADX INFO: renamed from: e */
    public static final String f95879e;

    /* JADX INFO: renamed from: f */
    public static final byte[] f95880f;

    /* JADX INFO: renamed from: g */
    public static final Pattern f95881g;

    /* JADX INFO: renamed from: h */
    public static final Pattern f95882h;

    /* JADX INFO: renamed from: i */
    public static HashMap f95883i;

    /* JADX INFO: renamed from: j */
    public static final String[] f95884j;

    /* JADX INFO: renamed from: k */
    public static final String[] f95885k;

    /* JADX INFO: renamed from: l */
    public static final int[] f95886l;

    /* JADX INFO: renamed from: m */
    public static final int[] f95887m;

    static {
        int i13 = Build.VERSION.SDK_INT;
        f95875a = i13;
        String str = Build.DEVICE;
        f95876b = str;
        String str2 = Build.MANUFACTURER;
        f95877c = str2;
        String str3 = Build.MODEL;
        f95878d = str3;
        StringBuilder sb4 = new StringBuilder(AbstractC30007c.m91832b(AbstractC30007c.m91832b(AbstractC30007c.m91832b(17, str), str3), str2));
        sb4.append(str);
        sb4.append(", ");
        sb4.append(str3);
        sb4.append(", ");
        sb4.append(str2);
        sb4.append(", ");
        sb4.append(i13);
        f95879e = sb4.toString();
        f95880f = new byte[0];
        f95881g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f95882h = Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
        f95884j = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f95885k = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f95886l = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f95887m = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, DateTimeConstants.HOURS_PER_WEEK, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION, 253, 244, 243};
    }

    /* JADX INFO: renamed from: A */
    public static String m71663A(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strM96499o = AbstractC31375j.m96499o(str);
        int i13 = 0;
        String str2 = strM96499o.split("-", 2)[0];
        if (f95883i == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = f95884j;
            HashMap map = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        map.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i14 = 0; i14 < strArr.length; i14 += 2) {
                map.put(strArr[i14], strArr[i14 + 1]);
            }
            f95883i = map;
        }
        String str4 = (String) f95883i.get(str2);
        if (str4 != null) {
            String strValueOf = String.valueOf(strM96499o.substring(str2.length()));
            strM96499o = strValueOf.length() != 0 ? str4.concat(strValueOf) : new String(str4);
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return strM96499o;
        }
        while (true) {
            String[] strArr2 = f95885k;
            if (i13 >= strArr2.length) {
                return strM96499o;
            }
            if (strM96499o.startsWith(strArr2[i13])) {
                String strValueOf2 = String.valueOf(strArr2[i13 + 1]);
                String strValueOf3 = String.valueOf(strM96499o.substring(strArr2[i13].length()));
                return strValueOf3.length() != 0 ? strValueOf2.concat(strValueOf3) : new String(strValueOf2);
            }
            i13 += 2;
        }
    }

    /* JADX INFO: renamed from: B */
    public static Object[] m71664B(int i13, Object[] objArr) {
        AbstractC24543a.m71569e(i13 <= objArr.length);
        return Arrays.copyOf(objArr, i13);
    }

    /* JADX INFO: renamed from: C */
    public static void m71665C(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public static long m71666D(long j7, long j13, long j14) {
        if (j14 >= j13 && j14 % j13 == 0) {
            return j7 / (j14 / j13);
        }
        if (j14 < j13 && j13 % j14 == 0) {
            return (j13 / j14) * j7;
        }
        return (long) (j7 * (j13 / j14));
    }

    /* JADX INFO: renamed from: E */
    public static void m71667E(long[] jArr, long j7) {
        int i13 = 0;
        if (j7 >= 1000000 && j7 % 1000000 == 0) {
            long j13 = j7 / 1000000;
            while (i13 < jArr.length) {
                jArr[i13] = jArr[i13] / j13;
                i13++;
            }
            return;
        }
        if (j7 >= 1000000 || 1000000 % j7 != 0) {
            double d3 = 1000000 / j7;
            while (i13 < jArr.length) {
                jArr[i13] = (long) (jArr[i13] * d3);
                i13++;
            }
            return;
        }
        long j14 = 1000000 / j7;
        while (i13 < jArr.length) {
            jArr[i13] = jArr[i13] * j14;
            i13++;
        }
    }

    /* JADX INFO: renamed from: F */
    public static String[] m71668F(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
    }

    /* JADX INFO: renamed from: G */
    public static long m71669G(long j7) {
        return (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? j7 : j7 / 1000;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m71670a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: b */
    public static int m71671b(long[] jArr, long j7, boolean z4) {
        int i13;
        int iBinarySearch = Arrays.binarySearch(jArr, j7);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i13 = iBinarySearch + 1;
            if (i13 >= jArr.length || jArr[i13] != j7) {
                break;
            }
            iBinarySearch = i13;
        }
        return z4 ? iBinarySearch : i13;
    }

    /* JADX INFO: renamed from: c */
    public static int m71672c(List list, Long l7, boolean z4) {
        int i13;
        int iBinarySearch = Collections.binarySearch(list, l7);
        if (iBinarySearch < 0) {
            i13 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i14 = iBinarySearch - 1;
                if (i14 < 0 || ((Comparable) list.get(i14)).compareTo(l7) != 0) {
                    break;
                }
                iBinarySearch = i14;
            }
            i13 = iBinarySearch;
        }
        return z4 ? Math.max(0, i13) : i13;
    }

    /* JADX INFO: renamed from: d */
    public static int m71673d(int[] iArr, int i13) {
        int iBinarySearch = Arrays.binarySearch(iArr, i13);
        if (iBinarySearch < 0) {
            return -(iBinarySearch + 2);
        }
        do {
            iBinarySearch--;
            if (iBinarySearch < 0) {
                break;
            }
        } while (iArr[iBinarySearch] == i13);
        return iBinarySearch;
    }

    /* JADX INFO: renamed from: e */
    public static int m71674e(long[] jArr, long j7, boolean z4) {
        int i13;
        int iBinarySearch = Arrays.binarySearch(jArr, j7);
        if (iBinarySearch < 0) {
            i13 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i14 = iBinarySearch - 1;
                if (i14 < 0 || jArr[i14] != j7) {
                    break;
                }
                iBinarySearch = i14;
            }
            i13 = iBinarySearch;
        }
        return z4 ? Math.max(0, i13) : i13;
    }

    /* JADX INFO: renamed from: f */
    public static int m71675f(int i13, int i14) {
        return ((i13 + i14) - 1) / i14;
    }

    /* JADX INFO: renamed from: g */
    public static float m71676g(float f13, float f14, float f15) {
        return Math.max(f14, Math.min(f13, f15));
    }

    /* JADX INFO: renamed from: h */
    public static int m71677h(int i13, int i14, int i15) {
        return Math.max(i14, Math.min(i13, i15));
    }

    /* JADX INFO: renamed from: i */
    public static long m71678i(long j7, long j13, long j14) {
        return Math.max(j13, Math.min(j7, j14));
    }

    /* JADX INFO: renamed from: j */
    public static boolean m71679j(Object[] objArr, Comparable comparable) {
        for (Object obj : objArr) {
            if (m71670a(obj, comparable)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static Handler m71680k(C25727h c25727h) {
        Looper looperMyLooper = Looper.myLooper();
        AbstractC24543a.m71574j(looperMyLooper);
        return new Handler(looperMyLooper, c25727h);
    }

    /* JADX INFO: renamed from: l */
    public static int m71681l(int i13) {
        switch (i13) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i14 = f95875a;
                return (i14 < 23 && i14 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: m */
    public static int m71682m(int i13, String str) {
        int i14 = 0;
        for (String str2 : m71668F(str)) {
            if (i13 == AbstractC24555m.m71613g(AbstractC24555m.m71609c(str2))) {
                i14++;
            }
        }
        return i14;
    }

    /* JADX INFO: renamed from: n */
    public static String m71683n(int i13, String str) {
        String[] strArrM71668F = m71668F(str);
        if (strArrM71668F.length == 0) {
            return null;
        }
        StringBuilder sb4 = new StringBuilder();
        for (String str2 : strArrM71668F) {
            if (i13 == AbstractC24555m.m71613g(AbstractC24555m.m71609c(str2))) {
                if (sb4.length() > 0) {
                    sb4.append(",");
                }
                sb4.append(str2);
            }
        }
        if (sb4.length() > 0) {
            return sb4.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static int m71684o(int i13) {
        if (i13 == 2 || i13 == 4) {
            return ErrorCodes.GenericErrors.cTrackMetadataMissing;
        }
        if (i13 == 10) {
            return ErrorCodes.GenericErrors.cJsonParsingFailed;
        }
        if (i13 == 7) {
            return ErrorCodes.GenericErrors.cTrackMetadataMissing;
        }
        if (i13 == 8) {
            return ErrorCodes.GenericErrors.cNotReady;
        }
        switch (i13) {
            case 15:
                return ErrorCodes.GenericErrors.cNotReady;
            case 16:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ErrorCodes.GenericErrors.cTrackMetadataMissing;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 20:
            case 21:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ErrorCodes.GenericErrors.cJsonParsingFailed;
            default:
                switch (i13) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return ErrorCodes.GenericErrors.cUnknown;
                    default:
                        return ErrorCodes.GenericErrors.cRTCTrackMissing;
                }
        }
    }

    /* JADX INFO: renamed from: p */
    public static long m71685p(float f13, long j7) {
        return f13 == 1.0f ? j7 : Math.round(j7 * ((double) f13));
    }

    /* JADX INFO: renamed from: q */
    public static int m71686q(int i13) {
        if (i13 == 8) {
            return 3;
        }
        if (i13 == 16) {
            return 2;
        }
        if (i13 != 24) {
            return i13 != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    /* JADX INFO: renamed from: r */
    public static int m71687r(int i13, int i14) {
        if (i13 != 2) {
            if (i13 == 3) {
                return i14;
            }
            if (i13 != 4) {
                if (i13 != 268435456) {
                    if (i13 == 536870912) {
                        return i14 * 3;
                    }
                    if (i13 != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i14 * 4;
        }
        return i14 * 2;
    }

    /* JADX INFO: renamed from: s */
    public static long m71688s(float f13, long j7) {
        return f13 == 1.0f ? j7 : Math.round(j7 / ((double) f13));
    }

    /* JADX INFO: renamed from: t */
    public static int m71689t(int i13) {
        if (i13 == 13) {
            return 1;
        }
        switch (i13) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* JADX INFO: renamed from: u */
    public static String m71690u(StringBuilder sb4, Formatter formatter, long j7) {
        if (j7 == -9223372036854775807L) {
            j7 = 0;
        }
        String str = j7 < 0 ? "-" : "";
        long jAbs = (Math.abs(j7) + 500) / 1000;
        long j13 = jAbs % 60;
        long j14 = (jAbs / 60) % 60;
        long j15 = jAbs / 3600;
        sb4.setLength(0);
        return j15 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j15), Long.valueOf(j14), Long.valueOf(j13)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j14), Long.valueOf(j13)).toString();
    }

    /* JADX INFO: renamed from: v */
    public static String m71691v(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e5) {
            AbstractC24543a.m71578n("Util", str.length() != 0 ? "Failed to read system property ".concat(str) : new String("Failed to read system property "), e5);
            return null;
        }
    }

    /* JADX INFO: renamed from: w */
    public static boolean m71692w(C13117a c13117a, C13117a c13117a2, Inflater inflater) {
        if (c13117a.m36692a() <= 0) {
            return false;
        }
        if (c13117a2.f45381a.length < c13117a.m36692a()) {
            c13117a2.m36693b(c13117a.m36692a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(c13117a.f45381a, c13117a.f45382b, c13117a.m36692a());
        int iInflate = 0;
        while (true) {
            try {
                byte[] bArr = c13117a2.f45381a;
                iInflate += inflater.inflate(bArr, iInflate, bArr.length - iInflate);
                if (inflater.finished()) {
                    c13117a2.m36688J(iInflate);
                    inflater.reset();
                    return true;
                }
                if (!inflater.needsDictionary() && !inflater.needsInput()) {
                    byte[] bArr2 = c13117a2.f45381a;
                    if (iInflate == bArr2.length) {
                        c13117a2.m36693b(bArr2.length * 2);
                    }
                }
                inflater.reset();
                return false;
            } catch (DataFormatException unused) {
                inflater.reset();
                return false;
            } catch (Throwable th3) {
                inflater.reset();
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public static boolean m71693x(int i13) {
        return i13 == 3 || i13 == 2 || i13 == 268435456 || i13 == 536870912 || i13 == 805306368 || i13 == 4;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m71694y(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* JADX INFO: renamed from: z */
    public static long m71695z(long j7) {
        return (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? j7 : j7 * 1000;
    }
}
