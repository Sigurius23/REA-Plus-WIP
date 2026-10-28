package p516u8;

import android.text.TextUtils;
import com.mapbox.common.logger.LogPriority;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p047c9.C4320k;
import p460rg.AbstractC31375j;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: u8.d0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC34587d0 {

    /* JADX INFO: renamed from: a */
    public static final ArrayList f145645a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public static final Pattern f145646b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX INFO: renamed from: a */
    public static boolean m109368a(String str, String str2) {
        C4320k c4320kM109374g;
        int iM13611a;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/eac3-joc":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/ac3":
            case "audio/raw":
            case "audio/eac3":
            case "audio/flac":
            case "audio/mpeg":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return true;
            case "audio/mp4a-latm":
                return (str2 == null || (c4320kM109374g = m109374g(str2)) == null || (iM13611a = c4320kM109374g.m13611a()) == 0 || iM13611a == 16) ? false : true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m109369b(String str, String str2) {
        String string = null;
        if (str != null) {
            String[] strArrM121906T = AbstractC38065t.m121906T(str);
            StringBuilder sb4 = new StringBuilder();
            for (String str3 : strArrM121906T) {
                if (str2.equals(m109372e(str3))) {
                    if (sb4.length() > 0) {
                        sb4.append(",");
                    }
                    sb4.append(str3);
                }
            }
            if (sb4.length() > 0) {
                string = sb4.toString();
            }
        }
        return string != null;
    }

    /* JADX INFO: renamed from: c */
    public static String m109370c(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : AbstractC38065t.m121906T(str)) {
            String strM109372e = m109372e(str2);
            if (strM109372e != null && m109378k(strM109372e)) {
                return strM109372e;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static int m109371d(String str, String str2) {
        C4320k c4320kM109374g;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (c4320kM109374g = m109374g(str2)) == null) {
                    return 0;
                }
                return c4320kM109374g.m13611a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m109372e(String str) {
        C4320k c4320kM109374g;
        String strM109373f = null;
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
                if (strM96499o.startsWith("mp4a.") && (c4320kM109374g = m109374g(strM96499o)) != null) {
                    strM109373f = m109373f(c4320kM109374g.f17541x);
                }
                return strM109373f == null ? "audio/mp4a-latm" : strM109373f;
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
            ArrayList arrayList = f145645a;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static String m109373f(int i13) {
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
        if (i13 == 221) {
            return "audio/vorbis";
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
            case 108:
                return "image/jpeg";
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

    /* JADX INFO: renamed from: g */
    public static C4320k m109374g(String str) {
        Matcher matcher = f145646b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new C4320k(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0, 10);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m109375h(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    /* JADX INFO: renamed from: i */
    public static int m109376i(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m109378k(str)) {
            return 1;
        }
        if (m109381n(str)) {
            return 2;
        }
        if (m109380m(str)) {
            return 3;
        }
        if (m109379l(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = f145645a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: j */
    public static String m109377j(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : AbstractC38065t.m121906T(str)) {
            String strM109372e = m109372e(str2);
            if (strM109372e != null && m109381n(strM109372e)) {
                return strM109372e;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m109378k(String str) {
        return "audio".equals(m109375h(str));
    }

    /* JADX INFO: renamed from: l */
    public static boolean m109379l(String str) {
        return "image".equals(m109375h(str)) || "application/x-image-uri".equals(str);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m109380m(String str) {
        return "text".equals(m109375h(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m109381n(String str) {
        return "video".equals(m109375h(str));
    }

    /* JADX INFO: renamed from: o */
    public static String m109382o(String str) {
        if (str == null) {
            return null;
        }
        String strM96499o = AbstractC31375j.m96499o(str);
        strM96499o.getClass();
        switch (strM96499o) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return strM96499o;
        }
    }
}
