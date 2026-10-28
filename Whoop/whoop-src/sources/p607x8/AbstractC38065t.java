package p607x8;

import android.app.UiModeManager;
import android.content.Context;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.health.platform.client.proto.C1533u;
import androidx.media3.common.ParserException;
import androidx.recyclerview.widget.AbstractC1707m0;
import bs.AbstractC3573b;
import bs.AbstractC3574c;
import ih0.AbstractC18489d0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import live.hms.video.error.ErrorCodes;
import live.hms.video.utils.HMSConstantsKt;
import org.joda.time.DateTimeConstants;
import p004a2.AbstractC0152a;
import p031b9.AbstractC2875y;
import p031b9.C2830f0;
import p309lo.C24553k;
import p460rg.AbstractC31375j;
import p516u8.InterfaceC34599j0;
import p522uf.AbstractC34870c0;
import se.AbstractC32417h;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: x8.t */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC38065t {

    /* JADX INFO: renamed from: a */
    public static final int f163031a;

    /* JADX INFO: renamed from: b */
    public static final String f163032b;

    /* JADX INFO: renamed from: c */
    public static final byte[] f163033c;

    /* JADX INFO: renamed from: d */
    public static final long[] f163034d;

    /* JADX INFO: renamed from: e */
    public static final Pattern f163035e;

    /* JADX INFO: renamed from: f */
    public static final Pattern f163036f;

    /* JADX INFO: renamed from: g */
    public static final Pattern f163037g;

    /* JADX INFO: renamed from: h */
    public static HashMap f163038h;

    /* JADX INFO: renamed from: i */
    public static final String[] f163039i;

    /* JADX INFO: renamed from: j */
    public static final String[] f163040j;

    /* JADX INFO: renamed from: k */
    public static final int[] f163041k;

    /* JADX INFO: renamed from: l */
    public static final int[] f163042l;

    /* JADX INFO: renamed from: m */
    public static final int[] f163043m;

    static {
        int i13 = Build.VERSION.SDK_INT;
        f163031a = i13;
        String str = Build.DEVICE;
        String str2 = Build.MANUFACTURER;
        f163032b = str + ", " + Build.MODEL + ", " + str2 + ", " + i13;
        f163033c = new byte[0];
        f163034d = new long[0];
        f163035e = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f163036f = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f163037g = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f163039i = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f163040j = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f163041k = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f163042l = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f163043m = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, DateTimeConstants.HOURS_PER_WEEK, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION, 253, 244, 243};
    }

    /* JADX INFO: renamed from: A */
    public static String m121887A(int i13) {
        switch (i13) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY;
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                return i13 >= 10000 ? AbstractC2875y.m8296i(i13, "custom (", ")") : "?";
        }
    }

    /* JADX INFO: renamed from: B */
    public static boolean m121888B(InterfaceC34599j0 interfaceC34599j0) {
        if (interfaceC34599j0 != null) {
            AbstractC0152a abstractC0152a = (AbstractC0152a) interfaceC34599j0;
            if (abstractC0152a.m367A(1)) {
                ((C2830f0) abstractC0152a).m8125z0(false);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0041  */
    /* JADX WARN: Code duplicated, block: B:20:0x0047 A[RETURN] */
    /* JADX INFO: renamed from: C */
    public static boolean m121889C(InterfaceC34599j0 interfaceC34599j0) {
        AbstractC0152a abstractC0152a;
        boolean z4 = false;
        if (interfaceC34599j0 == null) {
            return false;
        }
        C2830f0 c2830f0 = (C2830f0) interfaceC34599j0;
        int iM8110i0 = c2830f0.m8110i0();
        if (iM8110i0 != 1 || !((AbstractC0152a) interfaceC34599j0).m367A(2)) {
            if (iM8110i0 == 4) {
                AbstractC0152a abstractC0152a2 = (AbstractC0152a) interfaceC34599j0;
                if (abstractC0152a2.m367A(4)) {
                    abstractC0152a2.mo374H(((C2830f0) abstractC0152a2).m8101Z(), -9223372036854775807L, false);
                }
            }
            abstractC0152a = (AbstractC0152a) interfaceC34599j0;
            if (abstractC0152a.m367A(1)) {
                return z4;
            }
            ((C2830f0) abstractC0152a).m8125z0(true);
            return true;
        }
        c2830f0.m8116q0();
        z4 = true;
        abstractC0152a = (AbstractC0152a) interfaceC34599j0;
        if (abstractC0152a.m367A(1)) {
            return z4;
        }
        ((C2830f0) abstractC0152a).m8125z0(true);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x00e1 A[RETURN] */
    /* JADX INFO: renamed from: D */
    public static int m121890D(Uri uri, String str) {
        int i13;
        if (str != null) {
            switch (str) {
                case "application/x-mpegURL":
                    return 2;
                case "application/vnd.ms-sstr+xml":
                    return 1;
                case "application/dash+xml":
                    return 0;
                case "application/x-rtsp":
                    return 3;
                default:
                    return 4;
            }
        }
        String scheme = uri.getScheme();
        if (scheme == null || (!AbstractC31375j.m96492h("rtsp", scheme) && !AbstractC31375j.m96492h("rtspt", scheme))) {
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                if (iLastIndexOf >= 0) {
                    String strM96499o = AbstractC31375j.m96499o(lastPathSegment.substring(iLastIndexOf + 1));
                    strM96499o.getClass();
                    switch (strM96499o.hashCode()) {
                        case 104579:
                            if (strM96499o.equals("ism")) {
                            }
                            break;
                        case 108321:
                            if (strM96499o.equals("mpd")) {
                            }
                            break;
                        case 3242057:
                            if (strM96499o.equals("isml")) {
                            }
                            break;
                        case 3299913:
                            if (strM96499o.equals("m3u8")) {
                            }
                            break;
                    }
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException: Switch insn not found in header
                        	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                        	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        */
                    /*
                        Method dump skipped, instruction units count: 286
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p607x8.AbstractC38065t.m121890D(android.net.Uri, java.lang.String):int");
                }

                /* JADX INFO: renamed from: E */
                public static boolean m121891E(C38059n c38059n, C38059n c38059n2, Inflater inflater) {
                    if (c38059n.m121848a() <= 0) {
                        return false;
                    }
                    if (c38059n2.f163017a.length < c38059n.m121848a()) {
                        c38059n2.m121849b(c38059n.m121848a() * 2);
                    }
                    if (inflater == null) {
                        inflater = new Inflater();
                    }
                    inflater.setInput(c38059n.f163017a, c38059n.f163018b, c38059n.m121848a());
                    int iInflate = 0;
                    while (true) {
                        try {
                            byte[] bArr = c38059n2.f163017a;
                            iInflate += inflater.inflate(bArr, iInflate, bArr.length - iInflate);
                            if (inflater.finished()) {
                                c38059n2.m121845E(iInflate);
                                inflater.reset();
                                return true;
                            }
                            if (!inflater.needsDictionary() && !inflater.needsInput()) {
                                byte[] bArr2 = c38059n2.f163017a;
                                if (iInflate == bArr2.length) {
                                    c38059n2.m121849b(bArr2.length * 2);
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

                /* JADX INFO: renamed from: F */
                public static void m121892F(int i13) {
                    Integer.toString(i13, 36);
                }

                /* JADX INFO: renamed from: G */
                public static boolean m121893G(int i13) {
                    return i13 == 3 || i13 == 2 || i13 == 268435456 || i13 == 21 || i13 == 1342177280 || i13 == 22 || i13 == 1610612736 || i13 == 4;
                }

                /* JADX INFO: renamed from: H */
                public static boolean m121894H(Context context) {
                    int i13 = f163031a;
                    if (i13 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
                        return true;
                    }
                    if (i13 == 30) {
                        String str = Build.MODEL;
                        if (AbstractC31375j.m96492h(str, "moto g(20)") || AbstractC31375j.m96492h(str, "rmx3231")) {
                            return true;
                        }
                    }
                    return i13 == 34 && AbstractC31375j.m96492h(Build.MODEL, "sm-x200");
                }

                /* JADX INFO: renamed from: I */
                public static boolean m121895I(Context context) {
                    UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
                    return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
                }

                /* JADX INFO: renamed from: J */
                public static long m121896J(long j7) {
                    return (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? j7 : j7 * 1000;
                }

                /* JADX INFO: renamed from: K */
                public static String m121897K(String str) {
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
                    if (f163038h == null) {
                        String[] iSOLanguages = Locale.getISOLanguages();
                        int length = iSOLanguages.length;
                        String[] strArr = f163039i;
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
                        f163038h = map;
                    }
                    String str4 = (String) f163038h.get(str2);
                    if (str4 != null) {
                        StringBuilder sbM53374o = AbstractC18489d0.m53374o(str4);
                        sbM53374o.append(strM96499o.substring(str2.length()));
                        strM96499o = sbM53374o.toString();
                        str2 = str4;
                    }
                    if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
                        return strM96499o;
                    }
                    while (true) {
                        String[] strArr2 = f163040j;
                        if (i13 >= strArr2.length) {
                            return strM96499o;
                        }
                        if (strM96499o.startsWith(strArr2[i13])) {
                            return strArr2[i13 + 1] + strM96499o.substring(strArr2[i13].length());
                        }
                        i13 += 2;
                    }
                }

                /* JADX INFO: renamed from: L */
                public static Object[] m121898L(int i13, Object[] objArr) {
                    AbstractC35849g.m113802d(i13 <= objArr.length);
                    return Arrays.copyOf(objArr, i13);
                }

                /* JADX INFO: renamed from: M */
                public static long m121899M(String str) throws ParserException {
                    Matcher matcher = f163035e.matcher(str);
                    if (!matcher.matches()) {
                        throw ParserException.m5049a(null, "Invalid date/time format: " + str);
                    }
                    int i13 = 0;
                    if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                        i13 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
                        if ("-".equals(matcher.group(11))) {
                            i13 *= -1;
                        }
                    }
                    GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
                    gregorianCalendar.clear();
                    gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
                    if (!TextUtils.isEmpty(matcher.group(8))) {
                        gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
                    }
                    long timeInMillis = gregorianCalendar.getTimeInMillis();
                    return i13 != 0 ? timeInMillis - (((long) i13) * 60000) : timeInMillis;
                }

                /* JADX INFO: renamed from: N */
                public static void m121900N(Handler handler, Runnable runnable) {
                    Looper looper = handler.getLooper();
                    if (looper.getThread().isAlive()) {
                        if (looper == Looper.myLooper()) {
                            runnable.run();
                        } else {
                            handler.post(runnable);
                        }
                    }
                }

                /* JADX INFO: renamed from: O */
                public static long m121901O(int i13, long j7) {
                    return m121903Q(j7, 1000000L, i13, RoundingMode.DOWN);
                }

                /* JADX INFO: renamed from: P */
                public static void m121902P(long[] jArr, long j7) {
                    long j13;
                    RoundingMode roundingMode = RoundingMode.DOWN;
                    int i13 = 0;
                    if (j7 >= 1000000 && j7 % 1000000 == 0) {
                        long jM109975J = AbstractC34870c0.m109975J(j7, 1000000L, RoundingMode.UNNECESSARY);
                        while (i13 < jArr.length) {
                            jArr[i13] = AbstractC34870c0.m109975J(jArr[i13], jM109975J, roundingMode);
                            i13++;
                        }
                        return;
                    }
                    if (j7 < 1000000 && 1000000 % j7 == 0) {
                        long jM109975J2 = AbstractC34870c0.m109975J(1000000L, j7, RoundingMode.UNNECESSARY);
                        while (i13 < jArr.length) {
                            jArr[i13] = AbstractC34870c0.m110001i0(jArr[i13], jM109975J2);
                            i13++;
                        }
                        return;
                    }
                    int i14 = 0;
                    while (i14 < jArr.length) {
                        long j14 = jArr[i14];
                        if (j14 != 0) {
                            if (j7 >= j14 && j7 % j14 == 0) {
                                jArr[i14] = AbstractC34870c0.m109975J(1000000L, AbstractC34870c0.m109975J(j7, j14, RoundingMode.UNNECESSARY), roundingMode);
                            } else if (j7 >= j14 || j14 % j7 != 0) {
                                j13 = j7;
                                jArr[i14] = m121904R(j14, 1000000L, j13, roundingMode);
                            } else {
                                jArr[i14] = AbstractC34870c0.m110001i0(1000000L, AbstractC34870c0.m109975J(j14, j7, RoundingMode.UNNECESSARY));
                            }
                            j13 = j7;
                        } else {
                            j13 = j7;
                        }
                        i14++;
                        j7 = j13;
                    }
                }

                /* JADX INFO: renamed from: Q */
                public static long m121903Q(long j7, long j13, long j14, RoundingMode roundingMode) {
                    if (j7 == 0 || j13 == 0) {
                        return 0L;
                    }
                    if (j14 >= j13 && j14 % j13 == 0) {
                        return AbstractC34870c0.m109975J(j7, AbstractC34870c0.m109975J(j14, j13, RoundingMode.UNNECESSARY), roundingMode);
                    }
                    if (j14 < j13 && j13 % j14 == 0) {
                        return AbstractC34870c0.m110001i0(j7, AbstractC34870c0.m109975J(j13, j14, RoundingMode.UNNECESSARY));
                    }
                    if (j14 < j7 || j14 % j7 != 0) {
                        return (j14 >= j7 || j7 % j14 != 0) ? m121904R(j7, j13, j14, roundingMode) : AbstractC34870c0.m110001i0(j13, AbstractC34870c0.m109975J(j7, j14, RoundingMode.UNNECESSARY));
                    }
                    return AbstractC34870c0.m109975J(j13, AbstractC34870c0.m109975J(j14, j7, RoundingMode.UNNECESSARY), roundingMode);
                }

                /* JADX WARN: Code duplicated, block: B:60:0x00ef  */
                /* JADX WARN: Code duplicated, block: B:61:0x00f1  */
                /* JADX WARN: Code duplicated, block: B:65:0x00f7  */
                /* JADX WARN: Code duplicated, block: B:68:0x00fc  */
                /* JADX WARN: Code duplicated, block: B:70:0x00fe  */
                /* JADX WARN: Instruction removed from duplicated block: B:70:0x00fe, please report this as an issue */
                /* JADX INFO: renamed from: R */
                public static long m121904R(long j7, long j13, long j14, RoundingMode roundingMode) {
                    double dRint;
                    long j15;
                    boolean z4;
                    long jM110001i0 = AbstractC34870c0.m110001i0(j7, j13);
                    if (jM110001i0 != Long.MAX_VALUE && jM110001i0 != Long.MIN_VALUE) {
                        return AbstractC34870c0.m109975J(jM110001i0, j14, roundingMode);
                    }
                    long jM109978M = AbstractC34870c0.m109978M(Math.abs(j13), Math.abs(j14));
                    RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
                    long jM109975J = AbstractC34870c0.m109975J(j13, jM109978M, roundingMode2);
                    long jM109975J2 = AbstractC34870c0.m109975J(j14, jM109978M, roundingMode2);
                    long jM109978M2 = AbstractC34870c0.m109978M(Math.abs(j7), Math.abs(jM109975J2));
                    long jM109975J3 = AbstractC34870c0.m109975J(j7, jM109978M2, roundingMode2);
                    long jM109975J4 = AbstractC34870c0.m109975J(jM109975J2, jM109978M2, roundingMode2);
                    long jM110001i1 = AbstractC34870c0.m110001i0(jM109975J3, jM109975J);
                    if (jM110001i1 != Long.MAX_VALUE && jM110001i1 != Long.MIN_VALUE) {
                        return AbstractC34870c0.m109975J(jM110001i1, jM109975J4, roundingMode);
                    }
                    double d3 = jM109975J3 * (jM109975J / jM109975J4);
                    if (d3 > 9.223372036854776E18d) {
                        return Long.MAX_VALUE;
                    }
                    if (d3 < -9.223372036854776E18d) {
                        return Long.MIN_VALUE;
                    }
                    int i13 = AbstractC3574c.f14449a;
                    if (!AbstractC32417h.m101181L(d3)) {
                        throw new ArithmeticException("input is infinite or NaN");
                    }
                    switch (AbstractC3573b.f14448a[roundingMode.ordinal()]) {
                        case 1:
                            if (!AbstractC3574c.m10727a(d3)) {
                                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                            }
                            dRint = d3;
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4 && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d3 + " and rounding mode " + roundingMode);
                        case 2:
                            if (d3 >= 0.0d || AbstractC3574c.m10727a(d3)) {
                                dRint = d3;
                            } else {
                                j15 = ((long) d3) - 1;
                                dRint = j15;
                            }
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4 && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d3 + " and rounding mode " + roundingMode);
                        case 3:
                            if (d3 <= 0.0d || AbstractC3574c.m10727a(d3)) {
                                dRint = d3;
                            } else {
                                j15 = ((long) d3) + 1;
                                dRint = j15;
                            }
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4 && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d3 + " and rounding mode " + roundingMode);
                        case 4:
                            dRint = d3;
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4 && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d3 + " and rounding mode " + roundingMode);
                        case 5:
                            if (AbstractC3574c.m10727a(d3)) {
                                dRint = d3;
                            } else {
                                dRint = ((long) d3) + ((long) (d3 > 0.0d ? 1 : -1));
                            }
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4 && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d3 + " and rounding mode " + roundingMode);
                        case 6:
                            dRint = Math.rint(d3);
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4 && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d3 + " and rounding mode " + roundingMode);
                        case 7:
                            dRint = Math.rint(d3);
                            if (Math.abs(d3 - dRint) == 0.5d) {
                                dRint = Math.copySign(0.5d, d3) + d3;
                            }
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4 && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d3 + " and rounding mode " + roundingMode);
                        case 8:
                            dRint = Math.rint(d3);
                            if (Math.abs(d3 - dRint) == 0.5d) {
                                dRint = d3;
                            }
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4 && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d3 + " and rounding mode " + roundingMode);
                        default:
                            throw new AssertionError();
                    }
                }

                /* JADX INFO: renamed from: S */
                public static boolean m121905S(InterfaceC34599j0 interfaceC34599j0, boolean z4) {
                    if (interfaceC34599j0 != null) {
                        C2830f0 c2830f0 = (C2830f0) interfaceC34599j0;
                        if (c2830f0.m8108g0() && c2830f0.m8110i0() != 1 && c2830f0.m8110i0() != 4) {
                            if (!z4) {
                                return false;
                            }
                            c2830f0.m8091L0();
                            if (c2830f0.f11111I0.f11058n == 0) {
                                return false;
                            }
                        }
                    }
                    return true;
                }

                /* JADX INFO: renamed from: T */
                public static String[] m121906T(String str) {
                    return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
                }

                /* JADX INFO: renamed from: U */
                public static long m121907U(long j7) {
                    return (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? j7 : j7 / 1000;
                }

                /* JADX INFO: renamed from: a */
                public static int m121908a(long[] jArr, long j7, boolean z4) {
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

                /* JADX INFO: renamed from: b */
                public static int m121909b(C24553k c24553k, long j7) {
                    int i13 = c24553k.f95825b - 1;
                    int i14 = 0;
                    while (i14 <= i13) {
                        int i15 = (i14 + i13) >>> 1;
                        if (c24553k.m71601e(i15) < j7) {
                            i14 = i15 + 1;
                        } else {
                            i13 = i15 - 1;
                        }
                    }
                    int i16 = i13 + 1;
                    if (i16 < c24553k.f95825b && c24553k.m71601e(i16) == j7) {
                        return i16;
                    }
                    if (i13 == -1) {
                        return 0;
                    }
                    return i13;
                }

                /* JADX INFO: renamed from: c */
                public static int m121910c(int[] iArr, int i13, boolean z4, boolean z13) {
                    int i14;
                    int i15;
                    int iBinarySearch = Arrays.binarySearch(iArr, i13);
                    if (iBinarySearch < 0) {
                        i15 = -(iBinarySearch + 2);
                    } else {
                        while (true) {
                            i14 = iBinarySearch - 1;
                            if (i14 < 0 || iArr[i14] != i13) {
                                break;
                            }
                            iBinarySearch = i14;
                        }
                        i15 = z4 ? iBinarySearch : i14;
                    }
                    return z13 ? Math.max(0, i15) : i15;
                }

                /* JADX INFO: renamed from: d */
                public static int m121911d(long[] jArr, long j7, boolean z4) {
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

                /* JADX INFO: renamed from: e */
                public static int m121912e(int i13, int i14) {
                    return ((i13 + i14) - 1) / i14;
                }

                /* JADX INFO: renamed from: f */
                public static float m121913f(float f13, float f14, float f15) {
                    return Math.max(f14, Math.min(f13, f15));
                }

                /* JADX INFO: renamed from: g */
                public static int m121914g(int i13, int i14, int i15) {
                    return Math.max(i14, Math.min(i13, i15));
                }

                /* JADX INFO: renamed from: h */
                public static long m121915h(long j7, long j13, long j14) {
                    return Math.max(j13, Math.min(j7, j14));
                }

                /* JADX INFO: renamed from: i */
                public static boolean m121916i(SparseArray sparseArray, int i13) {
                    return sparseArray.indexOfKey(i13) >= 0;
                }

                /* JADX INFO: renamed from: j */
                public static boolean m121917j(SparseArray sparseArray, SparseArray sparseArray2) {
                    if (sparseArray == null) {
                        return sparseArray2 == null;
                    }
                    if (sparseArray2 == null) {
                        return false;
                    }
                    if (f163031a >= 31) {
                        return sparseArray.contentEquals(sparseArray2);
                    }
                    int size = sparseArray.size();
                    if (size != sparseArray2.size()) {
                        return false;
                    }
                    for (int i13 = 0; i13 < size; i13++) {
                        if (!Objects.equals(sparseArray.valueAt(i13), sparseArray2.get(sparseArray.keyAt(i13)))) {
                            return false;
                        }
                    }
                    return true;
                }

                /* JADX INFO: renamed from: k */
                public static int m121918k(SparseArray sparseArray) {
                    if (f163031a >= 31) {
                        return sparseArray.contentHashCode();
                    }
                    int iHashCode = 17;
                    for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                        iHashCode = Objects.hashCode(sparseArray.valueAt(i13)) + ((sparseArray.keyAt(i13) + (iHashCode * 31)) * 31);
                    }
                    return iHashCode;
                }

                /* JADX INFO: renamed from: l */
                public static int m121919l(int i13, int i14, int i15, byte[] bArr) {
                    while (i13 < i14) {
                        i15 = f163041k[((i15 >>> 24) ^ (bArr[i13] & 255)) & 255] ^ (i15 << 8);
                        i13++;
                    }
                    return i15;
                }

                /* JADX INFO: renamed from: m */
                public static Handler m121920m(Handler.Callback callback) {
                    Looper looperMyLooper = Looper.myLooper();
                    AbstractC35849g.m113808j(looperMyLooper);
                    return new Handler(looperMyLooper, callback);
                }

                /* JADX INFO: renamed from: n */
                public static String m121921n(byte[] bArr) {
                    return new String(bArr, StandardCharsets.UTF_8);
                }

                /* JADX INFO: renamed from: o */
                public static int m121922o(int i13) {
                    if (i13 == 20) {
                        return 30;
                    }
                    if (i13 == 22) {
                        return 31;
                    }
                    if (i13 == 30) {
                        return 34;
                    }
                    switch (i13) {
                        case 2:
                        case 3:
                            return 3;
                        case 4:
                        case 5:
                        case 6:
                            return 21;
                        case 7:
                        case 8:
                            return 23;
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            return 28;
                        default:
                            switch (i13) {
                                case 14:
                                    return 25;
                                case 15:
                                case 16:
                                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                                    return 28;
                                default:
                                    return Integer.MAX_VALUE;
                            }
                    }
                }

                /* JADX INFO: renamed from: p */
                public static AudioFormat m121923p(int i13, int i14, int i15) {
                    return new AudioFormat.Builder().setSampleRate(i13).setChannelMask(i14).setEncoding(i15).build();
                }

                /* JADX INFO: renamed from: q */
                public static int m121924q(int i13) {
                    int i14 = f163031a;
                    if (i13 == 10) {
                        return i14 >= 32 ? 737532 : 6396;
                    }
                    if (i13 == 12) {
                        return 743676;
                    }
                    if (i13 == 24) {
                        return i14 >= 32 ? 67108860 : 0;
                    }
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
                            return 6396;
                        default:
                            return 0;
                    }
                }

                /* JADX INFO: renamed from: r */
                public static int m121925r(int i13) {
                    if (i13 != 2) {
                        if (i13 == 3) {
                            return 1;
                        }
                        if (i13 != 4) {
                            if (i13 != 21) {
                                if (i13 != 22) {
                                    if (i13 != 268435456) {
                                        if (i13 != 1342177280) {
                                            if (i13 != 1610612736) {
                                                throw new IllegalArgumentException();
                                            }
                                        }
                                    }
                                }
                            }
                            return 3;
                        }
                        return 4;
                    }
                    return 2;
                }

                /* JADX INFO: renamed from: s */
                public static int m121926s(int i13) {
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

                /* JADX INFO: renamed from: t */
                public static int m121927t(String str) {
                    String[] strArrSplit;
                    int length;
                    int i13 = 0;
                    if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
                        return 0;
                    }
                    String str2 = strArrSplit[length - 1];
                    boolean z4 = length >= 3 && "neg".equals(strArrSplit[length - 2]);
                    try {
                        str2.getClass();
                        i13 = Integer.parseInt(str2);
                        if (z4) {
                            return -i13;
                        }
                    } catch (NumberFormatException unused) {
                    }
                    return i13;
                }

                /* JADX INFO: renamed from: u */
                public static long m121928u(float f13, long j7) {
                    return f13 == 1.0f ? j7 : Math.round(j7 * ((double) f13));
                }

                /* JADX INFO: renamed from: v */
                public static long m121929v(long j7) {
                    return j7 == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j7;
                }

                /* JADX INFO: renamed from: w */
                public static int m121930w(int i13) {
                    if (i13 == 8) {
                        return 3;
                    }
                    if (i13 == 16) {
                        return 2;
                    }
                    if (i13 != 24) {
                        return i13 != 32 ? 0 : 22;
                    }
                    return 21;
                }

                /* JADX INFO: renamed from: x */
                public static long m121931x(float f13, long j7) {
                    return f13 == 1.0f ? j7 : Math.round(j7 / ((double) f13));
                }

                /* JADX INFO: renamed from: y */
                public static String m121932y(StringBuilder sb4, Formatter formatter, long j7) {
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

                /* JADX INFO: renamed from: z */
                public static String m121933z(String str) {
                    try {
                        Class<?> cls = Class.forName("android.os.SystemProperties");
                        return (String) cls.getMethod("get", String.class).invoke(cls, str);
                    } catch (Exception e5) {
                        AbstractC38046a.m121813h("Util", "Failed to read system property ".concat(str), e5);
                        return null;
                    }
                }
            }
