package p309lo;

import android.text.TextUtils;
import com.mapbox.common.logger.LogPriority;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p047c9.C4320k;
import p460rg.AbstractC31375j;

/* JADX INFO: renamed from: lo.m */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC24555m {

    /* JADX INFO: renamed from: a */
    public static final ArrayList f95827a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public static final Pattern f95828b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX INFO: renamed from: a */
    public static String m71607a(String str, String str2) {
        if (str != null && str2 != null) {
            String[] strArrM71668F = AbstractC24567y.m71668F(str);
            StringBuilder sb4 = new StringBuilder();
            for (String str3 : strArrM71668F) {
                if (str2.equals(m71609c(str3))) {
                    if (sb4.length() > 0) {
                        sb4.append(",");
                    }
                    sb4.append(str3);
                }
            }
            if (sb4.length() > 0) {
                return sb4.toString();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static int m71608b(String str, String str2) {
        C4320k c4320kM71611e;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (c4320kM71611e = m71611e(str2)) == null) {
                    return 0;
                }
                return c4320kM71611e.m13611a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m71609c(String str) {
        C4320k c4320kM71611e;
        String strM71610d = null;
        if (str != null) {
            String strM96499o = AbstractC31375j.m96499o(str.trim());
            if (strM96499o.startsWith("avc1") || strM96499o.startsWith("avc3")) {
                return "video/avc";
            }
            if (strM96499o.startsWith("hev1") || strM96499o.startsWith("hvc1")) {
                return "video/hevc";
            }
            if (strM96499o.startsWith("dvav") || strM96499o.startsWith("dva1") || strM96499o.startsWith("dvhe") || strM96499o.startsWith("dvh1")) {
                return "video/dolby-vision";
            }
            if (strM96499o.startsWith("av01")) {
                return "video/av01";
            }
            if (strM96499o.startsWith("vp9") || strM96499o.startsWith("vp09")) {
                return "video/x-vnd.on2.vp9";
            }
            if (strM96499o.startsWith("vp8") || strM96499o.startsWith("vp08")) {
                return "video/x-vnd.on2.vp8";
            }
            if (strM96499o.startsWith("mp4a")) {
                if (strM96499o.startsWith("mp4a.") && (c4320kM71611e = m71611e(strM96499o)) != null) {
                    strM71610d = m71610d(c4320kM71611e.f17541x);
                }
                return strM71610d == null ? "audio/mp4a-latm" : strM71610d;
            }
            if (strM96499o.startsWith("mha1")) {
                return "audio/mha1";
            }
            if (strM96499o.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (strM96499o.startsWith("ac-3") || strM96499o.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (strM96499o.startsWith("ec-3") || strM96499o.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (strM96499o.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (strM96499o.startsWith("ac-4") || strM96499o.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (strM96499o.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (strM96499o.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (strM96499o.startsWith("dtsh") || strM96499o.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (strM96499o.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (strM96499o.startsWith("opus")) {
                return "audio/opus";
            }
            if (strM96499o.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (strM96499o.startsWith("flac")) {
                return "audio/flac";
            }
            if (strM96499o.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (strM96499o.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (strM96499o.contains("cea708")) {
                return "application/cea-708";
            }
            if (strM96499o.contains("eia608") || strM96499o.contains("cea608")) {
                return "application/cea-608";
            }
            ArrayList arrayList = f95827a;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static String m71610d(int i13) {
        if (i13 == 32) {
            return "video/mp4v-es";
        }
        if (i13 == 33) {
            return "video/avc";
        }
        if (i13 == 35) {
            return "video/hevc";
        }
        if (i13 == 64) {
            return "audio/mp4a-latm";
        }
        if (i13 == 163) {
            return "video/wvc1";
        }
        if (i13 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i13 == 165) {
            return "audio/ac3";
        }
        if (i13 == 166) {
            return "audio/eac3";
        }
        switch (i13) {
            case 96:
            case 97:
            case 98:
            case LogPriority.NONE /* 99 */:
            case AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB /* 100 */:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i13) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* JADX INFO: renamed from: e */
    public static C4320k m71611e(String str) {
        Matcher matcher = f95828b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new C4320k(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0, 8);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m71612f(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    /* JADX INFO: renamed from: g */
    public static int m71613g(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m71614h(str)) {
            return 1;
        }
        if (m71616j(str)) {
            return 2;
        }
        if (m71615i(str)) {
            return 3;
        }
        if ("image".equals(m71612f(str))) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = f95827a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m71614h(String str) {
        return "audio".equals(m71612f(str));
    }

    /* JADX INFO: renamed from: i */
    public static boolean m71615i(String str) {
        return "text".equals(m71612f(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m71616j(String str) {
        return "video".equals(m71612f(str));
    }
}
