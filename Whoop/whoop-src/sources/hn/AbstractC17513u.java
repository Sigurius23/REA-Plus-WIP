package hn;

import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import androidx.health.platform.client.proto.C1533u;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException;
import com.whoop.service.network.model.UserSessionDto;
import g73.C15553a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import live.hms.video.utils.AndroidSDKConstants;
import mo.C25721b;
import no.nordicsemi.android.dfu.DfuBaseService;
import p309lo.AbstractC24555m;
import p309lo.AbstractC24567y;
import p460rg.AbstractC31375j;
import p465rm.C31521c0;
import p690zr.AbstractC41023g0;
import p705ea2.C12915l;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: hn.u */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC17513u {

    /* JADX INFO: renamed from: a */
    public static final Pattern f67745a = Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: b */
    public static final HashMap f67746b = new HashMap();

    /* JADX INFO: renamed from: c */
    public static int f67747c = -1;

    /* JADX INFO: renamed from: a */
    public static void m49750a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (AbstractC24567y.f95875a < 26 && AbstractC24567y.f95876b.equals("R9") && arrayList.size() == 1 && ((C17504l) arrayList.get(0)).f67657a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(C17504l.m49693g("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, false));
            }
            Collections.sort(arrayList, new C12915l(new C17507o(1), 2));
        }
        int i13 = AbstractC24567y.f95875a;
        if (i13 < 21 && arrayList.size() > 1) {
            String str2 = ((C17504l) arrayList.get(0)).f67657a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new C12915l(new C17507o(2), 2));
            }
        }
        if (i13 >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((C17504l) arrayList.get(0)).f67657a)) {
            return;
        }
        arrayList.add((C17504l) arrayList.remove(0));
    }

    /* JADX INFO: renamed from: b */
    public static String m49751b(C31521c0 c31521c0) {
        Pair pairM49753d;
        if ("audio/eac3-joc".equals(c31521c0.f130077L)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(c31521c0.f130077L) || (pairM49753d = m49753d(c31521c0)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairM49753d.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static String m49752c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:102:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:103:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:106:0x01af  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:110:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:111:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:115:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:118:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:119:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:122:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:123:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:126:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:127:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:130:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:131:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:134:0x0203  */
    /* JADX WARN: Code duplicated, block: B:135:0x0205  */
    /* JADX WARN: Code duplicated, block: B:138:0x020d  */
    /* JADX WARN: Code duplicated, block: B:139:0x0210  */
    /* JADX WARN: Code duplicated, block: B:142:0x0218  */
    /* JADX WARN: Code duplicated, block: B:143:0x021a  */
    /* JADX WARN: Code duplicated, block: B:146:0x0222  */
    /* JADX WARN: Code duplicated, block: B:149:0x0229  */
    /* JADX WARN: Code duplicated, block: B:150:0x022b  */
    /* JADX WARN: Code duplicated, block: B:151:0x022d  */
    /* JADX WARN: Code duplicated, block: B:152:0x022f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0231  */
    /* JADX WARN: Code duplicated, block: B:154:0x0233  */
    /* JADX WARN: Code duplicated, block: B:155:0x0235  */
    /* JADX WARN: Code duplicated, block: B:156:0x0238  */
    /* JADX WARN: Code duplicated, block: B:157:0x023b  */
    /* JADX WARN: Code duplicated, block: B:158:0x023e  */
    /* JADX WARN: Code duplicated, block: B:159:0x0241  */
    /* JADX WARN: Code duplicated, block: B:160:0x0244  */
    /* JADX WARN: Code duplicated, block: B:162:0x0248  */
    /* JADX WARN: Code duplicated, block: B:164:0x0254  */
    /* JADX WARN: Code duplicated, block: B:165:0x0259  */
    /* JADX WARN: Code duplicated, block: B:168:0x0262  */
    /* JADX WARN: Code duplicated, block: B:172:0x0276  */
    /* JADX WARN: Code duplicated, block: B:29:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:302:0x03fd A[PHI: r1
      0x03fd: PHI (r1v59 int) = (r1v58 int), (r1v61 int), (r1v62 int), (r1v63 int), (r1v64 int) binds: [B:283:0x03d6, B:287:0x03de, B:289:0x03e2, B:291:0x03e6, B:293:0x03ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:337:0x048c  */
    /* JADX WARN: Code duplicated, block: B:340:0x0497  */
    /* JADX WARN: Code duplicated, block: B:525:0x073d  */
    /* JADX WARN: Code duplicated, block: B:527:0x0745  */
    /* JADX WARN: Code duplicated, block: B:528:0x0748  */
    /* JADX WARN: Code duplicated, block: B:529:0x074b  */
    /* JADX WARN: Code duplicated, block: B:530:0x074e  */
    /* JADX WARN: Code duplicated, block: B:531:0x0751  */
    /* JADX WARN: Code duplicated, block: B:532:0x0754  */
    /* JADX WARN: Code duplicated, block: B:534:0x0757  */
    /* JADX WARN: Code duplicated, block: B:535:0x075a  */
    /* JADX WARN: Code duplicated, block: B:536:0x075d  */
    /* JADX WARN: Code duplicated, block: B:537:0x0760  */
    /* JADX WARN: Code duplicated, block: B:538:0x0763  */
    /* JADX WARN: Code duplicated, block: B:539:0x0766  */
    /* JADX WARN: Code duplicated, block: B:540:0x0769  */
    /* JADX WARN: Code duplicated, block: B:541:0x076c  */
    /* JADX WARN: Code duplicated, block: B:542:0x076f  */
    /* JADX WARN: Code duplicated, block: B:543:0x0772  */
    /* JADX WARN: Code duplicated, block: B:544:0x0775  */
    /* JADX WARN: Code duplicated, block: B:545:0x0778  */
    /* JADX WARN: Code duplicated, block: B:546:0x077b  */
    /* JADX WARN: Code duplicated, block: B:547:0x077d  */
    /* JADX WARN: Code duplicated, block: B:548:0x0780  */
    /* JADX WARN: Code duplicated, block: B:550:0x0784  */
    /* JADX WARN: Code duplicated, block: B:552:0x078a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0160  */
    /* JADX WARN: Code duplicated, block: B:85:0x016c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0171  */
    /* JADX WARN: Code duplicated, block: B:89:0x017a  */
    /* JADX WARN: Code duplicated, block: B:91:0x017e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0182  */
    /* JADX WARN: Code duplicated, block: B:94:0x0189  */
    /* JADX WARN: Code duplicated, block: B:95:0x018c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0195  */
    /* JADX WARN: Code duplicated, block: B:99:0x0199  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: d */
    public static Pair m49753d(C31521c0 c31521c0) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        char c3;
        Integer num;
        String str;
        byte b;
        String strValueOf;
        String str2;
        String strValueOf2;
        String str3;
        Integer numValueOf = Integer.valueOf(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
        Integer numValueOf2 = Integer.valueOf(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS);
        int i27 = 1;
        String str4 = c31521c0.f130074I;
        String str5 = c31521c0.f130074I;
        if (str4 == null) {
            return null;
        }
        String[] strArrSplit = str4.split("\\.");
        boolean zEquals = "video/dolby-vision".equals(c31521c0.f130077L);
        Pattern pattern = f67745a;
        if (zEquals) {
            if (strArrSplit.length < 3) {
                String strValueOf3 = String.valueOf(str5);
                Log.w("MediaCodecUtil", strValueOf3.length() != 0 ? "Ignoring malformed Dolby Vision codec string: ".concat(strValueOf3) : new String("Ignoring malformed Dolby Vision codec string: "));
                return null;
            }
            Matcher matcher = pattern.matcher(strArrSplit[1]);
            if (!matcher.matches()) {
                String strValueOf4 = String.valueOf(str5);
                Log.w("MediaCodecUtil", strValueOf4.length() != 0 ? "Ignoring malformed Dolby Vision codec string: ".concat(strValueOf4) : new String("Ignoring malformed Dolby Vision codec string: "));
                return null;
            }
            String strGroup = matcher.group(1);
            if (strGroup != null) {
                c3 = 2;
                switch (strGroup) {
                    case "00":
                        num = 1;
                        break;
                    case "01":
                        num = 2;
                        break;
                    case "02":
                        num = 4;
                        break;
                    case "03":
                        num = 8;
                        break;
                    case "04":
                        num = 16;
                        break;
                    case "05":
                        num = 32;
                        break;
                    case "06":
                        num = 64;
                        break;
                    case "07":
                        num = 128;
                        break;
                    case "08":
                        num = 256;
                        break;
                    case "09":
                        num = 512;
                        break;
                }
                if (num == null) {
                    strValueOf2 = String.valueOf(strGroup);
                    if (strValueOf2.length() != 0) {
                        str3 = "Unknown Dolby Vision profile string: ".concat(strValueOf2);
                    } else {
                        str3 = new String("Unknown Dolby Vision profile string: ");
                    }
                    Log.w("MediaCodecUtil", str3);
                    return null;
                }
                str = strArrSplit[c3];
                if (str == null) {
                    switch (str.hashCode()) {
                        case 1537:
                            if (str.equals("01")) {
                                b = -1;
                            } else {
                                b = 0;
                            }
                            break;
                        case 1538:
                            if (str.equals("02")) {
                                b = -1;
                            } else {
                                b = 1;
                            }
                            break;
                        case 1539:
                            if (str.equals("03")) {
                                b = -1;
                            } else {
                                b = c3;
                            }
                            break;
                        case 1540:
                            if (str.equals("04")) {
                                b = -1;
                            } else {
                                b = 3;
                            }
                            break;
                        case 1541:
                            if (str.equals("05")) {
                                b = -1;
                            } else {
                                b = 4;
                            }
                            break;
                        case 1542:
                            if (str.equals("06")) {
                                b = -1;
                            } else {
                                b = 5;
                            }
                            break;
                        case 1543:
                            if (str.equals("07")) {
                                b = -1;
                            } else {
                                b = 6;
                            }
                            break;
                        case 1544:
                            if (str.equals("08")) {
                                b = -1;
                            } else {
                                b = 7;
                            }
                            break;
                        case 1545:
                            if (str.equals("09")) {
                                b = -1;
                            } else {
                                b = 8;
                            }
                            break;
                        case 1567:
                            if (str.equals("10")) {
                                b = -1;
                            } else {
                                b = 9;
                            }
                            break;
                        case 1568:
                            if (str.equals("11")) {
                                b = -1;
                            } else {
                                b = 10;
                            }
                            break;
                        case 1569:
                            if (str.equals("12")) {
                                b = -1;
                            } else {
                                b = 11;
                            }
                            break;
                        case 1570:
                            if (str.equals("13")) {
                                b = -1;
                            } else {
                                b = 12;
                            }
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        case 0:
                            numValueOf = 1;
                            break;
                        case 1:
                            numValueOf = 2;
                            break;
                        case 2:
                            numValueOf = 4;
                            break;
                        case 3:
                            numValueOf = 8;
                            break;
                        case 4:
                            numValueOf = 16;
                            break;
                        case 5:
                            numValueOf = 32;
                            break;
                        case 6:
                            numValueOf = 64;
                            break;
                        case 7:
                            numValueOf = 128;
                            break;
                        case 8:
                            numValueOf = 256;
                            break;
                        case 9:
                            numValueOf = 512;
                            break;
                        case 10:
                            break;
                        case 11:
                            numValueOf = numValueOf2;
                            break;
                        case 12:
                            numValueOf = 4096;
                            break;
                        default:
                            numValueOf = null;
                            break;
                    }
                } else {
                    numValueOf = null;
                }
                if (numValueOf == null) {
                    return new Pair(num, numValueOf);
                }
                strValueOf = String.valueOf(str);
                if (strValueOf.length() != 0) {
                    str2 = "Unknown Dolby Vision level string: ".concat(strValueOf);
                } else {
                    str2 = new String("Unknown Dolby Vision level string: ");
                }
                Log.w("MediaCodecUtil", str2);
                return null;
            }
            c3 = 2;
            num = null;
            if (num == null) {
                strValueOf2 = String.valueOf(strGroup);
                if (strValueOf2.length() != 0) {
                    str3 = "Unknown Dolby Vision profile string: ".concat(strValueOf2);
                } else {
                    str3 = new String("Unknown Dolby Vision profile string: ");
                }
                Log.w("MediaCodecUtil", str3);
                return null;
            }
            str = strArrSplit[c3];
            if (str == null) {
                switch (str.hashCode()) {
                    case 1537:
                        if (str.equals("01")) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                        break;
                    case 1538:
                        if (str.equals("02")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                        break;
                    case 1539:
                        if (str.equals("03")) {
                            b = c3;
                        } else {
                            b = -1;
                        }
                        break;
                    case 1540:
                        if (str.equals("04")) {
                            b = 3;
                        } else {
                            b = -1;
                        }
                        break;
                    case 1541:
                        if (str.equals("05")) {
                            b = 4;
                        } else {
                            b = -1;
                        }
                        break;
                    case 1542:
                        if (str.equals("06")) {
                            b = 5;
                        } else {
                            b = -1;
                        }
                        break;
                    case 1543:
                        if (str.equals("07")) {
                            b = 6;
                        } else {
                            b = -1;
                        }
                        break;
                    case 1544:
                        if (str.equals("08")) {
                            b = 7;
                        } else {
                            b = -1;
                        }
                        break;
                    case 1545:
                        if (str.equals("09")) {
                            b = 8;
                        } else {
                            b = -1;
                        }
                        break;
                    case 1567:
                        if (str.equals("10")) {
                            b = 9;
                        } else {
                            b = -1;
                        }
                        break;
                    case 1568:
                        if (str.equals("11")) {
                            b = 10;
                        } else {
                            b = -1;
                        }
                        break;
                    case 1569:
                        if (str.equals("12")) {
                            b = 11;
                        } else {
                            b = -1;
                        }
                        break;
                    case 1570:
                        if (str.equals("13")) {
                            b = 12;
                        } else {
                            b = -1;
                        }
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                        numValueOf = 1;
                        break;
                    case 1:
                        numValueOf = 2;
                        break;
                    case 2:
                        numValueOf = 4;
                        break;
                    case 3:
                        numValueOf = 8;
                        break;
                    case 4:
                        numValueOf = 16;
                        break;
                    case 5:
                        numValueOf = 32;
                        break;
                    case 6:
                        numValueOf = 64;
                        break;
                    case 7:
                        numValueOf = 128;
                        break;
                    case 8:
                        numValueOf = 256;
                        break;
                    case 9:
                        numValueOf = 512;
                        break;
                    case 10:
                        break;
                    case 11:
                        numValueOf = numValueOf2;
                        break;
                    case 12:
                        numValueOf = 4096;
                        break;
                    default:
                        numValueOf = null;
                        break;
                }
            } else {
                numValueOf = null;
            }
            if (numValueOf == null) {
                return new Pair(num, numValueOf);
            }
            strValueOf = String.valueOf(str);
            if (strValueOf.length() != 0) {
                str2 = "Unknown Dolby Vision level string: ".concat(strValueOf);
            } else {
                str2 = new String("Unknown Dolby Vision level string: ");
            }
            Log.w("MediaCodecUtil", str2);
            return null;
        }
        String str6 = strArrSplit[0];
        str6.getClass();
        switch (str6) {
            case "av01":
                C25721b c25721b = c31521c0.f130089X;
                if (strArrSplit.length < 4) {
                    String strValueOf5 = String.valueOf(str5);
                    Log.w("MediaCodecUtil", strValueOf5.length() != 0 ? "Ignoring malformed AV1 codec string: ".concat(strValueOf5) : new String("Ignoring malformed AV1 codec string: "));
                    return null;
                }
                try {
                    int i28 = Integer.parseInt(strArrSplit[1]);
                    int i29 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                    int i34 = Integer.parseInt(strArrSplit[3]);
                    if (i28 != 0) {
                        AbstractC30007c.m91850t(32, i28, "Unknown AV1 profile: ", "MediaCodecUtil");
                        return null;
                    }
                    if (i34 != 8 && i34 != 10) {
                        AbstractC30007c.m91850t(34, i34, "Unknown AV1 bit depth: ", "MediaCodecUtil");
                        return null;
                    }
                    int i35 = i34 == 8 ? 1 : (c25721b == null || !(c25721b.f101329z != null || (i13 = c25721b.f101328y) == 7 || i13 == 6)) ? 2 : 4096;
                    switch (i29) {
                        case 0:
                            i14 = 1;
                            break;
                        case 1:
                            i14 = 2;
                            break;
                        case 2:
                            i14 = 4;
                            break;
                        case 3:
                            i14 = 8;
                            break;
                        case 4:
                            i14 = 16;
                            break;
                        case 5:
                            i14 = 32;
                            break;
                        case 6:
                            i14 = 64;
                            break;
                        case 7:
                            i14 = 128;
                            break;
                        case 8:
                            i14 = 256;
                            break;
                        case 9:
                            i14 = 512;
                            break;
                        case 10:
                            i14 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                            break;
                        case 11:
                            i14 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                            break;
                        case 12:
                            i14 = 4096;
                            break;
                        case 13:
                            i14 = 8192;
                            break;
                        case 14:
                            i14 = 16384;
                            break;
                        case 15:
                            i14 = 32768;
                            break;
                        case 16:
                            i14 = 65536;
                            break;
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            i14 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            break;
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            i14 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION;
                            break;
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            i14 = 524288;
                            break;
                        case 20:
                            i14 = 1048576;
                            break;
                        case 21:
                            i14 = 2097152;
                            break;
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            i14 = 4194304;
                            break;
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            i14 = 8388608;
                            break;
                        default:
                            i14 = -1;
                            break;
                    }
                    if (i14 != -1) {
                        return new Pair(Integer.valueOf(i35), Integer.valueOf(i14));
                    }
                    AbstractC30007c.m91850t(30, i29, "Unknown AV1 level: ", "MediaCodecUtil");
                    return null;
                } catch (NumberFormatException unused) {
                    String strValueOf6 = String.valueOf(str5);
                    Log.w("MediaCodecUtil", strValueOf6.length() != 0 ? "Ignoring malformed AV1 codec string: ".concat(strValueOf6) : new String("Ignoring malformed AV1 codec string: "));
                    return null;
                }
            case "avc1":
            case "avc2":
                if (strArrSplit.length < 2) {
                    String strValueOf7 = String.valueOf(str5);
                    Log.w("MediaCodecUtil", strValueOf7.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(strValueOf7) : new String("Ignoring malformed AVC codec string: "));
                    return null;
                }
                try {
                    if (strArrSplit[1].length() == 6) {
                        i15 = 16;
                        i16 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                        i17 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                    } else {
                        i15 = 16;
                        if (strArrSplit.length < 3) {
                            String strValueOf8 = String.valueOf(str5);
                            Log.w("MediaCodecUtil", strValueOf8.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(strValueOf8) : new String("Ignoring malformed AVC codec string: "));
                            return null;
                        }
                        i16 = Integer.parseInt(strArrSplit[1]);
                        i17 = Integer.parseInt(strArrSplit[2]);
                    }
                    if (i16 != 66) {
                        if (i16 == 77) {
                            i19 = -1;
                            i18 = 2;
                        } else if (i16 == 88) {
                            i19 = -1;
                            i18 = 4;
                        } else if (i16 == 100) {
                            i19 = -1;
                            i18 = 8;
                        } else if (i16 == 110) {
                            i18 = i15;
                        } else if (i16 == 122) {
                            i19 = -1;
                            i18 = 32;
                        } else if (i16 != 244) {
                            i19 = -1;
                            i18 = -1;
                        } else {
                            i19 = -1;
                            i18 = 64;
                        }
                        if (i18 == i19) {
                            AbstractC30007c.m91850t(32, i16, "Unknown AVC profile: ", "MediaCodecUtil");
                            return null;
                        }
                        switch (i17) {
                            case 10:
                                break;
                            case 11:
                                i27 = 4;
                                break;
                            case 12:
                                i27 = 8;
                                break;
                            case 13:
                                i27 = i15;
                                break;
                            default:
                                switch (i17) {
                                    case 20:
                                        i27 = 32;
                                        break;
                                    case 21:
                                        i27 = 64;
                                        break;
                                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                        i27 = 128;
                                        break;
                                    default:
                                        switch (i17) {
                                            case 30:
                                                i27 = 256;
                                                break;
                                            case 31:
                                                i27 = 512;
                                                break;
                                            case 32:
                                                i27 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                                                break;
                                            default:
                                                switch (i17) {
                                                    case 40:
                                                        i27 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                                                        break;
                                                    case 41:
                                                        i27 = 4096;
                                                        break;
                                                    case 42:
                                                        i27 = 8192;
                                                        break;
                                                    default:
                                                        switch (i17) {
                                                            case 50:
                                                                i27 = 16384;
                                                                break;
                                                            case 51:
                                                                i27 = 32768;
                                                                break;
                                                            case 52:
                                                                i27 = 65536;
                                                                break;
                                                            default:
                                                                i27 = -1;
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        if (i27 == -1) {
                            return new Pair(Integer.valueOf(i18), Integer.valueOf(i27));
                        }
                        AbstractC30007c.m91850t(30, i17, "Unknown AVC level: ", "MediaCodecUtil");
                        return null;
                    }
                    i18 = 1;
                    i19 = -1;
                    if (i18 == i19) {
                        AbstractC30007c.m91850t(32, i16, "Unknown AVC profile: ", "MediaCodecUtil");
                        return null;
                    }
                    switch (i17) {
                        case 10:
                            break;
                        case 11:
                            i27 = 4;
                            break;
                        case 12:
                            i27 = 8;
                            break;
                        case 13:
                            i27 = i15;
                            break;
                        default:
                            switch (i17) {
                                case 20:
                                    i27 = 32;
                                    break;
                                case 21:
                                    i27 = 64;
                                    break;
                                case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                    i27 = 128;
                                    break;
                                default:
                                    switch (i17) {
                                        case 30:
                                            i27 = 256;
                                            break;
                                        case 31:
                                            i27 = 512;
                                            break;
                                        case 32:
                                            i27 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                                            break;
                                        default:
                                            switch (i17) {
                                                case 40:
                                                    i27 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                                                    break;
                                                case 41:
                                                    i27 = 4096;
                                                    break;
                                                case 42:
                                                    i27 = 8192;
                                                    break;
                                                default:
                                                    switch (i17) {
                                                        case 50:
                                                            i27 = 16384;
                                                            break;
                                                        case 51:
                                                            i27 = 32768;
                                                            break;
                                                        case 52:
                                                            i27 = 65536;
                                                            break;
                                                        default:
                                                            i27 = -1;
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    if (i27 == -1) {
                        return new Pair(Integer.valueOf(i18), Integer.valueOf(i27));
                    }
                    AbstractC30007c.m91850t(30, i17, "Unknown AVC level: ", "MediaCodecUtil");
                    return null;
                } catch (NumberFormatException unused2) {
                    String strValueOf9 = String.valueOf(str5);
                    Log.w("MediaCodecUtil", strValueOf9.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(strValueOf9) : new String("Ignoring malformed AVC codec string: "));
                    return null;
                }
            case "hev1":
            case "hvc1":
                if (strArrSplit.length < 4) {
                    String strValueOf10 = String.valueOf(str5);
                    Log.w("MediaCodecUtil", strValueOf10.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(strValueOf10) : new String("Ignoring malformed HEVC codec string: "));
                    return null;
                }
                Matcher matcher2 = pattern.matcher(strArrSplit[1]);
                if (!matcher2.matches()) {
                    String strValueOf11 = String.valueOf(str5);
                    Log.w("MediaCodecUtil", strValueOf11.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(strValueOf11) : new String("Ignoring malformed HEVC codec string: "));
                    return null;
                }
                String strGroup2 = matcher2.group(1);
                if (UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE.equals(strGroup2)) {
                    i24 = 1;
                } else {
                    if (!"2".equals(strGroup2)) {
                        String strValueOf12 = String.valueOf(strGroup2);
                        Log.w("MediaCodecUtil", strValueOf12.length() != 0 ? "Unknown HEVC profile string: ".concat(strValueOf12) : new String("Unknown HEVC profile string: "));
                        return null;
                    }
                    i24 = 2;
                }
                String str7 = strArrSplit[3];
                if (str7 != null) {
                    switch (str7.hashCode()) {
                        case 70821:
                            if (!str7.equals("H30")) {
                                i25 = -1;
                            } else {
                                i25 = 0;
                            }
                            break;
                        case 70914:
                            if (!str7.equals("H60")) {
                                i25 = -1;
                            } else {
                                i25 = i27;
                            }
                            break;
                        case 70917:
                            if (!str7.equals("H63")) {
                                i25 = -1;
                            } else {
                                i25 = 2;
                            }
                            break;
                        case 71007:
                            if (!str7.equals("H90")) {
                                i25 = -1;
                            } else {
                                i25 = 3;
                            }
                            break;
                        case 71010:
                            if (!str7.equals("H93")) {
                                i25 = -1;
                            } else {
                                i25 = 4;
                            }
                            break;
                        case 74665:
                            if (!str7.equals("L30")) {
                                i25 = -1;
                            } else {
                                i25 = 5;
                            }
                            break;
                        case 74758:
                            if (!str7.equals("L60")) {
                                i25 = -1;
                            } else {
                                i25 = 6;
                            }
                            break;
                        case 74761:
                            if (!str7.equals("L63")) {
                                i25 = -1;
                            } else {
                                i25 = 7;
                            }
                            break;
                        case 74851:
                            if (!str7.equals("L90")) {
                                i25 = -1;
                            } else {
                                i25 = 8;
                            }
                            break;
                        case 74854:
                            if (!str7.equals("L93")) {
                                i25 = -1;
                            } else {
                                i25 = 9;
                            }
                            break;
                        case 2193639:
                            if (!str7.equals("H120")) {
                                i25 = -1;
                            } else {
                                i25 = 10;
                            }
                            break;
                        case 2193642:
                            if (!str7.equals("H123")) {
                                i25 = -1;
                            } else {
                                i25 = 11;
                            }
                            break;
                        case 2193732:
                            if (!str7.equals("H150")) {
                                i25 = -1;
                            } else {
                                i27 = 12;
                                i25 = i27;
                            }
                            break;
                        case 2193735:
                            if (!str7.equals("H153")) {
                                i25 = -1;
                            } else {
                                i27 = 13;
                                i25 = i27;
                            }
                            break;
                        case 2193738:
                            if (!str7.equals("H156")) {
                                i25 = -1;
                            } else {
                                i27 = 14;
                                i25 = i27;
                            }
                            break;
                        case 2193825:
                            if (!str7.equals("H180")) {
                                i25 = -1;
                            } else {
                                i27 = 15;
                                i25 = i27;
                            }
                            break;
                        case 2193828:
                            if (!str7.equals("H183")) {
                                i25 = -1;
                            } else {
                                i25 = 16;
                            }
                            break;
                        case 2193831:
                            if (!str7.equals("H186")) {
                                i25 = -1;
                            } else {
                                i27 = 17;
                                i25 = i27;
                            }
                            break;
                        case 2312803:
                            if (!str7.equals("L120")) {
                                i25 = -1;
                            } else {
                                i27 = 18;
                                i25 = i27;
                            }
                            break;
                        case 2312806:
                            if (!str7.equals("L123")) {
                                i25 = -1;
                            } else {
                                i27 = 19;
                                i25 = i27;
                            }
                            break;
                        case 2312896:
                            if (!str7.equals("L150")) {
                                i25 = -1;
                            } else {
                                i25 = 20;
                            }
                            break;
                        case 2312899:
                            if (!str7.equals("L153")) {
                                i25 = -1;
                            } else {
                                i27 = 21;
                                i25 = i27;
                            }
                            break;
                        case 2312902:
                            if (!str7.equals("L156")) {
                                i25 = -1;
                            } else {
                                i27 = 22;
                                i25 = i27;
                            }
                            break;
                        case 2312989:
                            if (!str7.equals("L180")) {
                                i25 = -1;
                            } else {
                                i27 = 23;
                                i25 = i27;
                            }
                            break;
                        case 2312992:
                            if (!str7.equals("L183")) {
                                i25 = -1;
                            } else {
                                i27 = 24;
                                i25 = i27;
                            }
                            break;
                        case 2312995:
                            if (!str7.equals("L186")) {
                                i25 = -1;
                            } else {
                                i27 = 25;
                                i25 = i27;
                            }
                            break;
                        default:
                            i25 = -1;
                            break;
                    }
                    switch (i25) {
                        case 0:
                            numValueOf = 2;
                            break;
                        case 1:
                            numValueOf = 8;
                            break;
                        case 2:
                            numValueOf = 32;
                            break;
                        case 3:
                            numValueOf = 128;
                            break;
                        case 4:
                            numValueOf = 512;
                            break;
                        case 5:
                            numValueOf = 1;
                            break;
                        case 6:
                            numValueOf = 4;
                            break;
                        case 7:
                            numValueOf = 16;
                            break;
                        case 8:
                            numValueOf = 64;
                            break;
                        case 9:
                            numValueOf = 256;
                            break;
                        case 10:
                            numValueOf = numValueOf2;
                            break;
                        case 11:
                            numValueOf = Integer.valueOf(DfuBaseService.ERROR_REMOTE_MASK);
                            break;
                        case 12:
                            numValueOf = 32768;
                            break;
                        case 13:
                            numValueOf = Integer.valueOf(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ);
                            break;
                        case 14:
                            numValueOf = 524288;
                            break;
                        case 15:
                            numValueOf = 2097152;
                            break;
                        case 16:
                            numValueOf = 8388608;
                            break;
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            numValueOf = Integer.valueOf(AndroidSDKConstants.FLAG_MUTABLE);
                            break;
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            break;
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            numValueOf = 4096;
                            break;
                        case 20:
                            numValueOf = Integer.valueOf(DfuBaseService.ERROR_CONNECTION_MASK);
                            break;
                        case 21:
                            numValueOf = Integer.valueOf(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST);
                            break;
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            numValueOf = Integer.valueOf(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION);
                            break;
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            numValueOf = 1048576;
                            break;
                        case 24:
                            numValueOf = 4194304;
                            break;
                        case 25:
                            numValueOf = 16777216;
                            break;
                        default:
                            numValueOf = null;
                            break;
                    }
                } else {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    return new Pair(Integer.valueOf(i24), numValueOf);
                }
                String strValueOf13 = String.valueOf(str7);
                Log.w("MediaCodecUtil", strValueOf13.length() != 0 ? "Unknown HEVC level string: ".concat(strValueOf13) : new String("Unknown HEVC level string: "));
                return null;
            case "mp4a":
                if (strArrSplit.length != 3) {
                    String strValueOf14 = String.valueOf(str5);
                    Log.w("MediaCodecUtil", strValueOf14.length() != 0 ? "Ignoring malformed MP4A codec string: ".concat(strValueOf14) : new String("Ignoring malformed MP4A codec string: "));
                    return null;
                }
                try {
                    if ("audio/mp4a-latm".equals(AbstractC24555m.m71610d(Integer.parseInt(strArrSplit[1], 16)))) {
                        int i36 = Integer.parseInt(strArrSplit[2]);
                        int i37 = 17;
                        if (i36 == 17) {
                            i27 = i37;
                        } else if (i36 != 20) {
                            i37 = 23;
                            if (i36 != 23) {
                                i37 = 29;
                                if (i36 != 29) {
                                    i37 = 39;
                                    if (i36 != 39) {
                                        i37 = 42;
                                        if (i36 != 42) {
                                            switch (i36) {
                                                case 1:
                                                    break;
                                                case 2:
                                                    i27 = 2;
                                                    break;
                                                case 3:
                                                    i27 = 3;
                                                    break;
                                                case 4:
                                                    i27 = 4;
                                                    break;
                                                case 5:
                                                    i27 = 5;
                                                    break;
                                                case 6:
                                                    i27 = 6;
                                                    break;
                                                default:
                                                    i27 = -1;
                                                    break;
                                            }
                                        } else {
                                            i27 = i37;
                                        }
                                    } else {
                                        i27 = i37;
                                    }
                                } else {
                                    i27 = i37;
                                }
                            } else {
                                i27 = i37;
                            }
                        } else {
                            i27 = 20;
                        }
                        if (i27 != -1) {
                            return new Pair(Integer.valueOf(i27), 0);
                        }
                    }
                } catch (NumberFormatException unused3) {
                    String strValueOf15 = String.valueOf(str5);
                    Log.w("MediaCodecUtil", strValueOf15.length() != 0 ? "Ignoring malformed MP4A codec string: ".concat(strValueOf15) : new String("Ignoring malformed MP4A codec string: "));
                }
                return null;
            case "vp09":
                if (strArrSplit.length < 3) {
                    String strValueOf16 = String.valueOf(str5);
                    Log.w("MediaCodecUtil", strValueOf16.length() != 0 ? "Ignoring malformed VP9 codec string: ".concat(strValueOf16) : new String("Ignoring malformed VP9 codec string: "));
                    return null;
                }
                try {
                    int i38 = Integer.parseInt(strArrSplit[1]);
                    int i39 = Integer.parseInt(strArrSplit[2]);
                    if (i38 == 0) {
                        i26 = 1;
                    } else if (i38 == 1) {
                        i26 = 2;
                    } else if (i38 != 2) {
                        i26 = i38 != 3 ? -1 : 8;
                    } else {
                        i26 = 4;
                    }
                    if (i26 == -1) {
                        AbstractC30007c.m91850t(32, i38, "Unknown VP9 profile: ", "MediaCodecUtil");
                        return null;
                    }
                    if (i39 != 10) {
                        if (i39 == 11) {
                            i27 = 2;
                        } else if (i39 == 20) {
                            i27 = 4;
                        } else if (i39 == 21) {
                            i27 = 8;
                        } else if (i39 == 30) {
                            i27 = 16;
                        } else if (i39 == 31) {
                            i27 = 32;
                        } else if (i39 == 40) {
                            i27 = 64;
                        } else if (i39 == 41) {
                            i27 = 128;
                        } else if (i39 == 50) {
                            i27 = 256;
                        } else if (i39 != 51) {
                            switch (i39) {
                                case 60:
                                    i27 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                                    break;
                                case 61:
                                    i27 = 4096;
                                    break;
                                case 62:
                                    i27 = 8192;
                                    break;
                                default:
                                    i27 = -1;
                                    break;
                            }
                        } else {
                            i27 = 512;
                        }
                    }
                    if (i27 != -1) {
                        return new Pair(Integer.valueOf(i26), Integer.valueOf(i27));
                    }
                    AbstractC30007c.m91850t(30, i39, "Unknown VP9 level: ", "MediaCodecUtil");
                    return null;
                } catch (NumberFormatException unused4) {
                    String strValueOf17 = String.valueOf(str5);
                    Log.w("MediaCodecUtil", strValueOf17.length() != 0 ? "Ignoring malformed VP9 codec string: ".concat(strValueOf17) : new String("Ignoring malformed VP9 codec string: "));
                    return null;
                }
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static synchronized List m49754e(String str, boolean z4, boolean z13) {
        try {
            C17509q c17509q = new C17509q(str, z4, z13);
            HashMap map = f67746b;
            List list = (List) map.get(c17509q);
            if (list != null) {
                return list;
            }
            int i13 = AbstractC24567y.f95875a;
            ArrayList arrayListM49755f = m49755f(c17509q, i13 >= 21 ? new C17511s(z4, z13) : new C15553a(5));
            if (z4 && arrayListM49755f.isEmpty() && 21 <= i13 && i13 <= 23) {
                arrayListM49755f = m49755f(c17509q, new C15553a(5));
                if (!arrayListM49755f.isEmpty()) {
                    String str2 = ((C17504l) arrayListM49755f.get(0)).f67657a;
                    StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                    sb4.append("MediaCodecList API didn't list secure decoder for: ");
                    sb4.append(str);
                    sb4.append(". Assuming: ");
                    sb4.append(str2);
                    Log.w("MediaCodecUtil", sb4.toString());
                }
            }
            m49750a(str, arrayListM49755f);
            AbstractC41023g0 abstractC41023g0M133252m = AbstractC41023g0.m133252m(arrayListM49755f);
            map.put(c17509q, abstractC41023g0M133252m);
            return abstractC41023g0M133252m;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: f */
    public static ArrayList m49755f(C17509q c17509q, InterfaceC17510r interfaceC17510r) throws MediaCodecUtil$DecoderQueryException {
        String strM49752c;
        String str;
        String str2;
        C17509q c17509q2 = c17509q;
        boolean z4 = c17509q2.f67740b;
        try {
            ArrayList arrayList = new ArrayList();
            String str3 = c17509q2.f67739a;
            int iMo43797f = interfaceC17510r.mo43797f();
            boolean zMo43798g = interfaceC17510r.mo43798g();
            int i13 = 0;
            while (i13 < iMo43797f) {
                MediaCodecInfo mediaCodecInfoMo43794a = interfaceC17510r.mo43794a(i13);
                int i14 = AbstractC24567y.f95875a;
                if (i14 < 29 || !mediaCodecInfoMo43794a.isAlias()) {
                    String name = mediaCodecInfoMo43794a.getName();
                    if (m49756g(mediaCodecInfoMo43794a, name, zMo43798g, str3) && (strM49752c = m49752c(mediaCodecInfoMo43794a, name, str3)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoMo43794a.getCapabilitiesForType(strM49752c);
                            boolean zMo43795c = interfaceC17510r.mo43795c("tunneled-playback", strM49752c, capabilitiesForType);
                            boolean zMo43796d = interfaceC17510r.mo43796d("tunneled-playback", capabilitiesForType);
                            boolean z13 = c17509q2.f67741c;
                            if ((z13 || !zMo43796d) && (!z13 || zMo43795c)) {
                                boolean zMo43795c2 = interfaceC17510r.mo43795c("secure-playback", strM49752c, capabilitiesForType);
                                boolean zMo43796d2 = interfaceC17510r.mo43796d("secure-playback", capabilitiesForType);
                                if ((z4 || !zMo43796d2) && (!z4 || zMo43795c2)) {
                                    boolean zIsHardwareAccelerated = i14 >= 29 ? mediaCodecInfoMo43794a.isHardwareAccelerated() : !m49757h(mediaCodecInfoMo43794a, str3);
                                    m49757h(mediaCodecInfoMo43794a, str3);
                                    if (i14 >= 29) {
                                        mediaCodecInfoMo43794a.isVendor();
                                    } else {
                                        String strM96499o = AbstractC31375j.m96499o(mediaCodecInfoMo43794a.getName());
                                        if (!strM96499o.startsWith("omx.google.") && !strM96499o.startsWith("c2.android.")) {
                                            strM96499o.startsWith("c2.google.");
                                        }
                                    }
                                    if (!(zMo43798g && z4 == zMo43795c2) && (zMo43798g || z4)) {
                                        boolean z14 = zIsHardwareAccelerated;
                                        str2 = name;
                                        if (!zMo43798g && zMo43795c2) {
                                            str = strM49752c;
                                            try {
                                                arrayList.add(C17504l.m49693g(String.valueOf(str2).concat(".secure"), str3, str, capabilitiesForType, z14, true));
                                                break;
                                            } catch (Exception e5) {
                                                e = e5;
                                                if (AbstractC24567y.f95875a <= 23 || arrayList.isEmpty()) {
                                                    StringBuilder sb4 = new StringBuilder(String.valueOf(str2).length() + 25 + str.length());
                                                    sb4.append("Failed to query codec ");
                                                    sb4.append(str2);
                                                    sb4.append(" (");
                                                    sb4.append(str);
                                                    sb4.append(")");
                                                    Log.e("MediaCodecUtil", sb4.toString());
                                                    throw e;
                                                }
                                                StringBuilder sb5 = new StringBuilder(String.valueOf(str2).length() + 46);
                                                sb5.append("Skipping codec ");
                                                sb5.append(str2);
                                                sb5.append(" (failed to query capabilities)");
                                                Log.e("MediaCodecUtil", sb5.toString());
                                                i13++;
                                                c17509q2 = c17509q;
                                            }
                                        }
                                    } else {
                                        str = strM49752c;
                                        try {
                                            C17504l c17504lM49693g = C17504l.m49693g(name, str3, str, capabilitiesForType, zIsHardwareAccelerated, false);
                                            str2 = name;
                                            try {
                                                arrayList.add(c17504lM49693g);
                                            } catch (Exception e13) {
                                                e = e13;
                                                str = str;
                                                if (AbstractC24567y.f95875a <= 23) {
                                                }
                                                StringBuilder sb6 = new StringBuilder(String.valueOf(str2).length() + 25 + str.length());
                                                sb6.append("Failed to query codec ");
                                                sb6.append(str2);
                                                sb6.append(" (");
                                                sb6.append(str);
                                                sb6.append(")");
                                                Log.e("MediaCodecUtil", sb6.toString());
                                                throw e;
                                            }
                                        } catch (Exception e14) {
                                            e = e14;
                                            str2 = name;
                                        }
                                    }
                                }
                            }
                        } catch (Exception e15) {
                            e = e15;
                            str = strM49752c;
                            str2 = name;
                        }
                    }
                }
                i13++;
                c17509q2 = c17509q;
            }
            return arrayList;
        } catch (Exception e16) {
            throw new MediaCodecUtil$DecoderQueryException("Failed to query underlying media codecs", e16);
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m49756g(MediaCodecInfo mediaCodecInfo, String str, boolean z4, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!z4 && str.endsWith(".secure")) {
            return false;
        }
        int i13 = AbstractC24567y.f95875a;
        if (i13 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i13 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = AbstractC24567y.f95876b;
            if ("a70".equals(str3)) {
                return false;
            }
            if ("Xiaomi".equals(AbstractC24567y.f95877c) && str3.startsWith("HM")) {
                return false;
            }
        }
        if (i13 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = AbstractC24567y.f95876b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i13 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = AbstractC24567y.f95876b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i13 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(AbstractC24567y.f95877c))) {
            String str6 = AbstractC24567y.f95876b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i13 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(AbstractC24567y.f95877c)) {
            String str7 = AbstractC24567y.f95876b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i13 <= 19 && AbstractC24567y.f95876b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i13 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m49757h(MediaCodecInfo mediaCodecInfo, String str) {
        if (AbstractC24567y.f95875a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (AbstractC24555m.m71614h(str)) {
            return true;
        }
        String strM96499o = AbstractC31375j.m96499o(mediaCodecInfo.getName());
        if (strM96499o.startsWith("arc.")) {
            return false;
        }
        if (strM96499o.startsWith("omx.google.") || strM96499o.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strM96499o.startsWith("omx.sec.") && strM96499o.contains(".sw.")) || strM96499o.equals("omx.qcom.video.decoder.hevcswvdec") || strM96499o.startsWith("c2.android.") || strM96499o.startsWith("c2.google.")) {
            return true;
        }
        return (strM96499o.startsWith("omx.") || strM96499o.startsWith("c2.")) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public static int m49758i() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i13;
        if (f67747c == -1) {
            int iMax = 0;
            List listM49754e = m49754e("video/avc", false, false);
            C17504l c17504l = listM49754e.isEmpty() ? null : (C17504l) listM49754e.get(0);
            if (c17504l != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = c17504l.f67660d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i14 = codecProfileLevelArr[iMax].level;
                    if (i14 != 1 && i14 != 2) {
                        switch (i14) {
                            case 8:
                            case 16:
                            case 32:
                                i13 = 101376;
                                break;
                            case 64:
                                i13 = 202752;
                                break;
                            case 128:
                            case 256:
                                i13 = 414720;
                                break;
                            case 512:
                                i13 = 921600;
                                break;
                            case DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED /* 1024 */:
                                i13 = 1310720;
                                break;
                            case DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS /* 2048 */:
                            case 4096:
                                i13 = 2097152;
                                break;
                            case DfuBaseService.ERROR_REMOTE_MASK /* 8192 */:
                                i13 = 2228224;
                                break;
                            case DfuBaseService.ERROR_CONNECTION_MASK /* 16384 */:
                                i13 = 5652480;
                                break;
                            case 32768:
                            case ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST /* 65536 */:
                                i13 = 9437184;
                                break;
                            case ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ /* 131072 */:
                            case ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION /* 262144 */:
                            case 524288:
                                i13 = 35651584;
                                break;
                            default:
                                i13 = -1;
                                break;
                        }
                    } else {
                        i13 = 25344;
                    }
                    iMax2 = Math.max(i13, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, AbstractC24567y.f95875a >= 21 ? 345600 : 172800);
            }
            f67747c = iMax;
        }
        return f67747c;
    }
}
