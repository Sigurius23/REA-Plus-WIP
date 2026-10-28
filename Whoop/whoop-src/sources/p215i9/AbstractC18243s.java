package p215i9;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import androidx.health.platform.client.proto.C1533u;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import androidx.profileinstaller.ProfileVerifier;
import g73.C15553a;
import hn.C17511s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import no.nordicsemi.android.dfu.DfuBaseService;
import p460rg.AbstractC31375j;
import p516u8.AbstractC34587d0;
import p516u8.C34592g;
import p516u8.C34610p;
import p555vl.AbstractC36095b;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38047b;
import p607x8.AbstractC38065t;
import p690zr.AbstractC41023g0;
import p690zr.C41014d0;
import p690zr.C41060w0;
import p705ea2.C12915l;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: i9.s */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18243s {

    /* JADX INFO: renamed from: a */
    public static final HashMap f71028a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static void m52547a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (AbstractC38065t.f163031a < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((C18237m) arrayList.get(0)).f70948a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(C18237m.m52509i("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new C12915l(new C18232h(), 4));
        }
        if (AbstractC38065t.f163031a >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((C18237m) arrayList.get(0)).f70948a)) {
            return;
        }
        arrayList.add((C18237m) arrayList.remove(0));
    }

    /* JADX INFO: renamed from: b */
    public static String m52548b(C34610p c34610p) {
        Pair pairM52550d;
        String str = c34610p.f145783n;
        String str2 = c34610p.f145783n;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (pairM52550d = m52550d(c34610p)) != null) {
            int iIntValue = ((Integer) pairM52550d.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str2)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static String m52549c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
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
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0199  */
    /* JADX WARN: Code duplicated, block: B:101:0x019d  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:108:0x01af  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:112:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:113:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:116:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:120:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:121:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:124:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:125:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:128:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:129:0x01df  */
    /* JADX WARN: Code duplicated, block: B:132:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:133:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:136:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:137:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:140:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:143:0x0202  */
    /* JADX WARN: Code duplicated, block: B:144:0x0207  */
    /* JADX WARN: Code duplicated, block: B:145:0x020c  */
    /* JADX WARN: Code duplicated, block: B:146:0x020f  */
    /* JADX WARN: Code duplicated, block: B:147:0x0212  */
    /* JADX WARN: Code duplicated, block: B:148:0x0215  */
    /* JADX WARN: Code duplicated, block: B:149:0x0218  */
    /* JADX WARN: Code duplicated, block: B:150:0x021b  */
    /* JADX WARN: Code duplicated, block: B:151:0x021e  */
    /* JADX WARN: Code duplicated, block: B:152:0x0220  */
    /* JADX WARN: Code duplicated, block: B:153:0x0223  */
    /* JADX WARN: Code duplicated, block: B:154:0x0226  */
    /* JADX WARN: Code duplicated, block: B:156:0x022a  */
    /* JADX WARN: Code duplicated, block: B:158:0x0230  */
    /* JADX WARN: Code duplicated, block: B:162:0x0248  */
    /* JADX WARN: Code duplicated, block: B:81:0x015e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0164  */
    /* JADX WARN: Code duplicated, block: B:85:0x0168  */
    /* JADX WARN: Code duplicated, block: B:86:0x016c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0173  */
    /* JADX WARN: Code duplicated, block: B:89:0x0176  */
    /* JADX WARN: Code duplicated, block: B:92:0x017f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0183  */
    /* JADX WARN: Code duplicated, block: B:96:0x018c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0190  */
    /* JADX INFO: renamed from: d */
    public static Pair m52550d(C34610p c34610p) {
        byte b;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        Integer num;
        byte b6;
        Integer num2;
        String str;
        byte[] bArr = AbstractC38047b.f162977a;
        Integer numValueOf = 1;
        String str2 = c34610p.f145780k;
        C34592g c34592g = c34610p.f145757B;
        if (str2 == null) {
            return null;
        }
        String[] strArrSplit = str2.split("\\.");
        int i26 = 16;
        if (!"video/dolby-vision".equals(c34610p.f145783n)) {
            String str3 = strArrSplit[0];
            str3.getClass();
            switch (str3) {
                case "av01":
                    b = 0;
                    break;
                case "avc1":
                    b = 1;
                    break;
                case "avc2":
                    b = 2;
                    break;
                case "hev1":
                    b = 3;
                    break;
                case "hvc1":
                    b = 4;
                    break;
                case "mp4a":
                    b = 5;
                    break;
                case "s263":
                    b = 6;
                    break;
                case "vp09":
                    b = 7;
                    break;
                default:
                    b = -1;
                    break;
            }
            int i27 = DfuBaseService.ERROR_CONNECTION_MASK;
            switch (b) {
                case 0:
                    if (strArrSplit.length < 4) {
                        AbstractC36095b.m114693u("Ignoring malformed AV1 codec string: ", str2, "CodecSpecificDataUtil");
                        return null;
                    }
                    try {
                        int i28 = Integer.parseInt(strArrSplit[1]);
                        int i29 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                        int i34 = Integer.parseInt(strArrSplit[3]);
                        if (i28 != 0) {
                            AbstractC38963t7.m124388r(i28, "Unknown AV1 profile: ", "CodecSpecificDataUtil");
                            return null;
                        }
                        if (i34 != 8 && i34 != 10) {
                            AbstractC38963t7.m124388r(i34, "Unknown AV1 bit depth: ", "CodecSpecificDataUtil");
                            return null;
                        }
                        int i35 = i34 == 8 ? 1 : (c34592g == null || !(c34592g.f145661d != null || (i13 = c34592g.f145660c) == 7 || i13 == 6)) ? 2 : 4096;
                        switch (i29) {
                            case 0:
                                i27 = 1;
                                i14 = -1;
                                break;
                            case 1:
                                i27 = 2;
                                i14 = -1;
                                break;
                            case 2:
                                i27 = 4;
                                i14 = -1;
                                break;
                            case 3:
                                i27 = 8;
                                i14 = -1;
                                break;
                            case 4:
                                i27 = 16;
                                i14 = -1;
                                break;
                            case 5:
                                i27 = 32;
                                i14 = -1;
                                break;
                            case 6:
                                i27 = 64;
                                i14 = -1;
                                break;
                            case 7:
                                i27 = 128;
                                i14 = -1;
                                break;
                            case 8:
                                i27 = 256;
                                i14 = -1;
                                break;
                            case 9:
                                i27 = 512;
                                i14 = -1;
                                break;
                            case 10:
                                i27 = 1024;
                                i14 = -1;
                                break;
                            case 11:
                                i27 = 2048;
                                i14 = -1;
                                break;
                            case 12:
                                i27 = 4096;
                                i14 = -1;
                                break;
                            case 13:
                                i27 = 8192;
                                i14 = -1;
                                break;
                            case 14:
                                i14 = -1;
                                break;
                            case 15:
                                i27 = 32768;
                                i14 = -1;
                                break;
                            case 16:
                                i27 = 65536;
                                i14 = -1;
                                break;
                            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                                i14 = -1;
                                break;
                            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION;
                                i14 = -1;
                                break;
                            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                i27 = 524288;
                                i14 = -1;
                                break;
                            case 20:
                                i27 = 1048576;
                                i14 = -1;
                                break;
                            case 21:
                                i27 = 2097152;
                                i14 = -1;
                                break;
                            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                i27 = 4194304;
                                i14 = -1;
                                break;
                            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                i27 = 8388608;
                                i14 = -1;
                                break;
                            default:
                                i14 = -1;
                                i27 = -1;
                                break;
                        }
                        if (i27 != i14) {
                            return new Pair(Integer.valueOf(i35), Integer.valueOf(i27));
                        }
                        AbstractC38963t7.m124388r(i29, "Unknown AV1 level: ", "CodecSpecificDataUtil");
                        return null;
                    } catch (NumberFormatException unused) {
                        AbstractC36095b.m114693u("Ignoring malformed AV1 codec string: ", str2, "CodecSpecificDataUtil");
                    }
                    break;
                case 1:
                case 2:
                    if (strArrSplit.length < 2) {
                        AbstractC36095b.m114693u("Ignoring malformed AVC codec string: ", str2, "CodecSpecificDataUtil");
                        return null;
                    }
                    try {
                        if (strArrSplit[1].length() == 6) {
                            i15 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                            i16 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                        } else {
                            if (strArrSplit.length < 3) {
                                AbstractC38046a.m121826u("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str2);
                                return null;
                            }
                            i15 = Integer.parseInt(strArrSplit[1]);
                            i16 = Integer.parseInt(strArrSplit[2]);
                        }
                        if (i15 == 66) {
                            i17 = 1;
                        } else if (i15 == 77) {
                            i17 = 2;
                        } else if (i15 == 88) {
                            i17 = 4;
                        } else if (i15 == 100) {
                            i17 = 8;
                        } else if (i15 == 110) {
                            i17 = 16;
                        } else if (i15 != 122) {
                            i17 = i15 != 244 ? -1 : 64;
                        } else {
                            i17 = 32;
                        }
                        if (i17 == -1) {
                            AbstractC38963t7.m124388r(i15, "Unknown AVC profile: ", "CodecSpecificDataUtil");
                            return null;
                        }
                        switch (i16) {
                            case 10:
                                i18 = -1;
                                i27 = 1;
                                break;
                            case 11:
                                i18 = -1;
                                i27 = 4;
                                break;
                            case 12:
                                i18 = -1;
                                i27 = 8;
                                break;
                            case 13:
                                i27 = 16;
                                i18 = -1;
                                break;
                            default:
                                switch (i16) {
                                    case 20:
                                        i27 = 32;
                                        i18 = -1;
                                        break;
                                    case 21:
                                        i27 = 64;
                                        i18 = -1;
                                        break;
                                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                        i27 = 128;
                                        i18 = -1;
                                        break;
                                    default:
                                        switch (i16) {
                                            case 30:
                                                i27 = 256;
                                                i18 = -1;
                                                break;
                                            case 31:
                                                i27 = 512;
                                                i18 = -1;
                                                break;
                                            case 32:
                                                i27 = 1024;
                                                i18 = -1;
                                                break;
                                            default:
                                                switch (i16) {
                                                    case 40:
                                                        i27 = 2048;
                                                        i18 = -1;
                                                        break;
                                                    case 41:
                                                        i27 = 4096;
                                                        i18 = -1;
                                                        break;
                                                    case 42:
                                                        i27 = 8192;
                                                        i18 = -1;
                                                        break;
                                                    default:
                                                        switch (i16) {
                                                            case 50:
                                                                i18 = -1;
                                                                break;
                                                            case 51:
                                                                i27 = 32768;
                                                                i18 = -1;
                                                                break;
                                                            case 52:
                                                                i27 = 65536;
                                                                i18 = -1;
                                                                break;
                                                            default:
                                                                i18 = -1;
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
                        if (i27 != i18) {
                            return new Pair(Integer.valueOf(i17), Integer.valueOf(i27));
                        }
                        AbstractC38963t7.m124388r(i16, "Unknown AVC level: ", "CodecSpecificDataUtil");
                        return null;
                    } catch (NumberFormatException unused2) {
                        AbstractC36095b.m114693u("Ignoring malformed AVC codec string: ", str2, "CodecSpecificDataUtil");
                    }
                    break;
                case 3:
                case 4:
                    return AbstractC38047b.m121829b(str2, strArrSplit, c34592g);
                case 5:
                    if (strArrSplit.length != 3) {
                        AbstractC36095b.m114693u("Ignoring malformed MP4A codec string: ", str2, "CodecSpecificDataUtil");
                        return null;
                    }
                    try {
                        if ("audio/mp4a-latm".equals(AbstractC34587d0.m109373f(Integer.parseInt(strArrSplit[1], 16)))) {
                            int i36 = Integer.parseInt(strArrSplit[2]);
                            int i37 = 17;
                            if (i36 == 17) {
                                i19 = -1;
                            } else {
                                if (i36 != 20) {
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
                                                            i19 = -1;
                                                            i37 = 1;
                                                            break;
                                                        case 2:
                                                            i19 = -1;
                                                            i37 = 2;
                                                            break;
                                                        case 3:
                                                            i19 = -1;
                                                            i37 = 3;
                                                            break;
                                                        case 4:
                                                            i19 = -1;
                                                            i37 = 4;
                                                            break;
                                                        case 5:
                                                            i19 = -1;
                                                            i37 = 5;
                                                            break;
                                                        case 6:
                                                            i19 = -1;
                                                            i37 = 6;
                                                            break;
                                                        default:
                                                            i19 = -1;
                                                            i37 = -1;
                                                            break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    i37 = 20;
                                }
                                i19 = -1;
                            }
                            if (i37 != i19) {
                                return new Pair(Integer.valueOf(i37), 0);
                            }
                        }
                    } catch (NumberFormatException unused3) {
                        AbstractC36095b.m114693u("Ignoring malformed MP4A codec string: ", str2, "CodecSpecificDataUtil");
                    }
                    break;
                case 6:
                    Pair pair = new Pair(numValueOf, numValueOf);
                    if (strArrSplit.length < 3) {
                        AbstractC36095b.m114693u("Ignoring malformed H263 codec string: ", str2, "CodecSpecificDataUtil");
                        return pair;
                    }
                    try {
                        return new Pair(Integer.valueOf(Integer.parseInt(strArrSplit[1])), Integer.valueOf(Integer.parseInt(strArrSplit[2])));
                    } catch (NumberFormatException unused4) {
                        AbstractC36095b.m114693u("Ignoring malformed H263 codec string: ", str2, "CodecSpecificDataUtil");
                        return pair;
                    }
                case 7:
                    if (strArrSplit.length < 3) {
                        AbstractC36095b.m114693u("Ignoring malformed VP9 codec string: ", str2, "CodecSpecificDataUtil");
                        return null;
                    }
                    try {
                        int i38 = Integer.parseInt(strArrSplit[1]);
                        int i39 = Integer.parseInt(strArrSplit[2]);
                        if (i38 == 0) {
                            i24 = 1;
                        } else if (i38 == 1) {
                            i24 = 2;
                        } else if (i38 != 2) {
                            i24 = i38 != 3 ? -1 : 8;
                        } else {
                            i24 = 4;
                        }
                        if (i24 == -1) {
                            AbstractC38963t7.m124388r(i38, "Unknown VP9 profile: ", "CodecSpecificDataUtil");
                            return null;
                        }
                        if (i39 == 10) {
                            i25 = -1;
                            i26 = 1;
                        } else if (i39 == 11) {
                            i25 = -1;
                            i26 = 2;
                        } else if (i39 == 20) {
                            i25 = -1;
                            i26 = 4;
                        } else if (i39 == 21) {
                            i25 = -1;
                            i26 = 8;
                        } else if (i39 == 30) {
                            i25 = -1;
                        } else {
                            if (i39 == 31) {
                                i26 = 32;
                            } else if (i39 == 40) {
                                i26 = 64;
                            } else if (i39 == 41) {
                                i26 = 128;
                            } else if (i39 == 50) {
                                i26 = 256;
                            } else if (i39 != 51) {
                                switch (i39) {
                                    case 60:
                                        i26 = 2048;
                                        break;
                                    case 61:
                                        i26 = 4096;
                                        break;
                                    case 62:
                                        i26 = 8192;
                                        break;
                                    default:
                                        i25 = -1;
                                        i26 = -1;
                                        break;
                                }
                            } else {
                                i26 = 512;
                            }
                            i25 = -1;
                        }
                        if (i26 != i25) {
                            return new Pair(Integer.valueOf(i24), Integer.valueOf(i26));
                        }
                        AbstractC38963t7.m124388r(i39, "Unknown VP9 level: ", "CodecSpecificDataUtil");
                        return null;
                    } catch (NumberFormatException unused5) {
                        AbstractC36095b.m114693u("Ignoring malformed VP9 codec string: ", str2, "CodecSpecificDataUtil");
                    }
                    break;
                default:
                    return null;
            }
            return null;
        }
        Integer numValueOf2 = Integer.valueOf(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
        if (strArrSplit.length < 3) {
            AbstractC36095b.m114693u("Ignoring malformed Dolby Vision codec string: ", str2, "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = AbstractC38047b.f162979c.matcher(strArrSplit[1]);
        if (!matcher.matches()) {
            AbstractC36095b.m114693u("Ignoring malformed Dolby Vision codec string: ", str2, "CodecSpecificDataUtil");
            return null;
        }
        String strGroup = matcher.group(1);
        if (strGroup != null) {
            switch (strGroup.hashCode()) {
                case 1536:
                    num = 8;
                    b6 = !strGroup.equals("00") ? (byte) -1 : (byte) 0;
                    break;
                case 1537:
                    if (!strGroup.equals("01")) {
                        num = 8;
                    } else {
                        num = 8;
                        b6 = 1;
                    }
                    break;
                case 1538:
                    if (!strGroup.equals("02")) {
                        num = 8;
                    } else {
                        num = 8;
                        b6 = 2;
                    }
                    break;
                case 1539:
                    if (!strGroup.equals("03")) {
                        num = 8;
                    } else {
                        num = 8;
                        b6 = 3;
                    }
                    break;
                case 1540:
                    if (!strGroup.equals("04")) {
                        num = 8;
                    } else {
                        num = 8;
                        b6 = 4;
                    }
                    break;
                case 1541:
                    if (!strGroup.equals("05")) {
                        num = 8;
                    } else {
                        num = 8;
                        b6 = 5;
                    }
                    break;
                case 1542:
                    if (!strGroup.equals("06")) {
                        num = 8;
                    } else {
                        num = 8;
                        b6 = 6;
                    }
                    break;
                case 1543:
                    if (!strGroup.equals("07")) {
                        num = 8;
                    } else {
                        num = 8;
                        b6 = 7;
                    }
                    break;
                case 1544:
                    if (!strGroup.equals("08")) {
                        num = 8;
                    } else {
                        num = 8;
                        b6 = 8;
                    }
                    break;
                case 1545:
                    if (!strGroup.equals("09")) {
                        num = 8;
                    } else {
                        num = 8;
                        b6 = 9;
                    }
                    break;
                case 1567:
                    if (!strGroup.equals("10")) {
                        num = 8;
                    } else {
                        num = 8;
                        b6 = 10;
                    }
                    break;
                default:
                    num = 8;
                    break;
            }
            switch (b6) {
                case 0:
                    num2 = numValueOf;
                    break;
                case 1:
                    num2 = 2;
                    break;
                case 2:
                    num2 = 4;
                    break;
                case 3:
                    num2 = num;
                    break;
                case 4:
                    num2 = 16;
                    break;
                case 5:
                    num2 = 32;
                    break;
                case 6:
                    num2 = 64;
                    break;
                case 7:
                    num2 = 128;
                    break;
                case 8:
                    num2 = 256;
                    break;
                case 9:
                    num2 = 512;
                    break;
                case 10:
                    num2 = numValueOf2;
                    break;
            }
            if (num2 == null) {
                AbstractC36095b.m114693u("Unknown Dolby Vision profile string: ", strGroup, "CodecSpecificDataUtil");
                return null;
            }
            str = strArrSplit[2];
            if (str == null) {
                switch (str) {
                    case "01":
                        break;
                    case "02":
                        numValueOf = 2;
                        break;
                    case "03":
                        numValueOf = 4;
                        break;
                    case "04":
                        numValueOf = num;
                        break;
                    case "05":
                        numValueOf = 16;
                        break;
                    case "06":
                        numValueOf = 32;
                        break;
                    case "07":
                        numValueOf = 64;
                        break;
                    case "08":
                        numValueOf = 128;
                        break;
                    case "09":
                        numValueOf = 256;
                        break;
                    case "10":
                        numValueOf = 512;
                        break;
                    case "11":
                        numValueOf = numValueOf2;
                        break;
                    case "12":
                        numValueOf = Integer.valueOf(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS);
                        break;
                    case "13":
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
                return new Pair(num2, numValueOf);
            }
            AbstractC36095b.m114693u("Unknown Dolby Vision level string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        num = 8;
        num2 = null;
        if (num2 == null) {
            AbstractC36095b.m114693u("Unknown Dolby Vision profile string: ", strGroup, "CodecSpecificDataUtil");
            return null;
        }
        str = strArrSplit[2];
        if (str == null) {
            switch (str) {
                case 1537:
                    if (str.equals("01")) {
                    }
                    break;
                case 1538:
                    if (str.equals("02")) {
                    }
                    break;
                case 1539:
                    if (str.equals("03")) {
                    }
                    break;
                case 1540:
                    if (str.equals("04")) {
                    }
                    break;
                case 1541:
                    if (str.equals("05")) {
                    }
                    break;
                case 1542:
                    if (str.equals("06")) {
                    }
                    break;
                case 1543:
                    if (str.equals("07")) {
                    }
                    break;
                case 1544:
                    if (str.equals("08")) {
                    }
                    break;
                case 1545:
                    if (str.equals("09")) {
                    }
                    break;
                case 1567:
                    if (str.equals("10")) {
                    }
                    break;
                case 1568:
                    if (str.equals("11")) {
                    }
                    break;
                case 1569:
                    if (str.equals("12")) {
                    }
                    break;
                case 1570:
                    if (str.equals("13")) {
                    }
                    break;
                default:
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
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                Method dump skipped, instruction units count: 1766
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p215i9.AbstractC18243s.m52550d(u8.p):android.util.Pair");
        }

        /* JADX INFO: renamed from: e */
        public static synchronized List m52551e(String str, boolean z4, boolean z13) {
            try {
                C18240p c18240p = new C18240p(str, z4, z13);
                HashMap map = f71028a;
                List list = (List) map.get(c18240p);
                if (list != null) {
                    return list;
                }
                ArrayList arrayListM52552f = m52552f(c18240p, new C17511s(z4, z13, str.equals("video/mv-hevc")));
                if (z4 && arrayListM52552f.isEmpty() && AbstractC38065t.f163031a <= 23) {
                    arrayListM52552f = m52552f(c18240p, new C15553a(6));
                    if (!arrayListM52552f.isEmpty()) {
                        AbstractC38046a.m121826u("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((C18237m) arrayListM52552f.get(0)).f70948a);
                    }
                }
                m52547a(str, arrayListM52552f);
                AbstractC41023g0 abstractC41023g0M133252m = AbstractC41023g0.m133252m(arrayListM52552f);
                map.put(c18240p, abstractC41023g0M133252m);
                return abstractC41023g0M133252m;
            } catch (Throwable th3) {
                throw th3;
            }
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0047  */
        /* JADX WARN: Code duplicated, block: B:74:0x0119 A[Catch: Exception -> 0x0163, TRY_ENTER, TryCatch #4 {Exception -> 0x0163, blocks: (B:3:0x000a, B:5:0x001f, B:7:0x0029, B:77:0x0138, B:10:0x0035, B:13:0x0040, B:71:0x0111, B:74:0x0119, B:76:0x011f, B:78:0x0140, B:79:0x0161), top: B:92:0x000a }] */
        /* JADX WARN: Code duplicated, block: B:96:0x0140 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX INFO: renamed from: f */
        public static ArrayList m52552f(C18240p c18240p, InterfaceC18241q interfaceC18241q) throws MediaCodecUtil$DecoderQueryException {
            boolean z4;
            String str;
            int i13;
            int i14;
            C18240p c18240p2 = c18240p;
            boolean z13 = c18240p2.f71026b;
            try {
                ArrayList arrayList = new ArrayList();
                String str2 = c18240p2.f71025a;
                int iMo43797f = interfaceC18241q.mo43797f();
                boolean zMo43798g = interfaceC18241q.mo43798g();
                int i15 = 0;
                while (i15 < iMo43797f) {
                    MediaCodecInfo mediaCodecInfoMo43794a = interfaceC18241q.mo43794a(i15);
                    int i16 = AbstractC38065t.f163031a;
                    if (i16 < 29 || !mediaCodecInfoMo43794a.isAlias()) {
                        String name = mediaCodecInfoMo43794a.getName();
                        if (m52554h(mediaCodecInfoMo43794a, name, zMo43798g, str2)) {
                            int i17 = i15;
                            String strM52549c = m52549c(mediaCodecInfoMo43794a, name, str2);
                            if (strM52549c == null) {
                                z4 = zMo43798g;
                                i13 = i17;
                            } else {
                                try {
                                    MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoMo43794a.getCapabilitiesForType(strM52549c);
                                    boolean zMo43795c = interfaceC18241q.mo43795c("tunneled-playback", strM52549c, capabilitiesForType);
                                    boolean zMo43796d = interfaceC18241q.mo43796d("tunneled-playback", capabilitiesForType);
                                    boolean z14 = c18240p2.f71027c;
                                    if (!z14 && zMo43796d) {
                                        z4 = zMo43798g;
                                        i13 = i17;
                                    } else if (!z14 || zMo43795c) {
                                        boolean zMo43795c2 = interfaceC18241q.mo43795c("secure-playback", strM52549c, capabilitiesForType);
                                        boolean zMo43796d2 = interfaceC18241q.mo43796d("secure-playback", capabilitiesForType);
                                        if (!z13 && zMo43796d2) {
                                            z4 = zMo43798g;
                                            i13 = i17;
                                        } else if (!z13 || zMo43795c2) {
                                            boolean zIsVendor = true;
                                            boolean zIsHardwareAccelerated = i16 >= 29 ? mediaCodecInfoMo43794a.isHardwareAccelerated() : !m52555i(mediaCodecInfoMo43794a, str2);
                                            z4 = zMo43798g;
                                            try {
                                                boolean zM52555i = m52555i(mediaCodecInfoMo43794a, str2);
                                                if (i16 >= 29) {
                                                    zIsVendor = mediaCodecInfoMo43794a.isVendor();
                                                } else {
                                                    String strM96499o = AbstractC31375j.m96499o(mediaCodecInfoMo43794a.getName());
                                                    if (strM96499o.startsWith("omx.google.") || strM96499o.startsWith("c2.android.") || strM96499o.startsWith("c2.google.")) {
                                                        zIsVendor = false;
                                                    }
                                                }
                                                if (!(z4 && z13 == zMo43795c2) && (z4 || z13)) {
                                                    boolean z15 = zIsHardwareAccelerated;
                                                    i14 = i17;
                                                    boolean z16 = zIsVendor;
                                                    if (!z4 && zMo43795c2) {
                                                        i13 = i14;
                                                        str = name;
                                                        try {
                                                            arrayList.add(C18237m.m52509i(name + ".secure", str2, strM52549c, capabilitiesForType, z15, zM52555i, z16, true));
                                                            break;
                                                        } catch (Exception e5) {
                                                            e = e5;
                                                            if (AbstractC38065t.f163031a <= 23) {
                                                            }
                                                            AbstractC38046a.m121812g("MediaCodecUtil", "Failed to query codec " + str + " (" + strM52549c + ")");
                                                            throw e;
                                                        }
                                                    }
                                                } else {
                                                    boolean z17 = zIsHardwareAccelerated;
                                                    i14 = i17;
                                                    try {
                                                        arrayList.add(C18237m.m52509i(name, str2, strM52549c, capabilitiesForType, z17, zM52555i, zIsVendor, false));
                                                    } catch (Exception e13) {
                                                        e = e13;
                                                        i13 = i14;
                                                        str = name;
                                                        if (AbstractC38065t.f163031a <= 23 || arrayList.isEmpty()) {
                                                            AbstractC38046a.m121812g("MediaCodecUtil", "Failed to query codec " + str + " (" + strM52549c + ")");
                                                            throw e;
                                                        }
                                                        AbstractC38046a.m121812g("MediaCodecUtil", "Skipping codec " + str + " (failed to query capabilities)");
                                                    }
                                                }
                                                i13 = i14;
                                            } catch (Exception e14) {
                                                e = e14;
                                                str = name;
                                                i13 = i17;
                                                if (AbstractC38065t.f163031a <= 23) {
                                                }
                                                AbstractC38046a.m121812g("MediaCodecUtil", "Failed to query codec " + str + " (" + strM52549c + ")");
                                                throw e;
                                            }
                                        } else {
                                            z4 = zMo43798g;
                                            i13 = i17;
                                        }
                                    } else {
                                        z4 = zMo43798g;
                                        i13 = i17;
                                    }
                                } catch (Exception e15) {
                                    e = e15;
                                    z4 = zMo43798g;
                                    str = name;
                                }
                            }
                        } else {
                            z4 = zMo43798g;
                            i13 = i15;
                        }
                    } else {
                        z4 = zMo43798g;
                        i13 = i15;
                    }
                    i15 = i13 + 1;
                    c18240p2 = c18240p;
                    zMo43798g = z4;
                }
                return arrayList;
            } catch (Exception e16) {
                throw new MediaCodecUtil$DecoderQueryException("Failed to query underlying media codecs", e16);
            }
        }

        /* JADX INFO: renamed from: g */
        public static C41060w0 m52553g(C18232h c18232h, C34610p c34610p, boolean z4, boolean z13) {
            List listM52503b = c18232h.m52503b(c34610p.f145783n, z4, z13);
            String strM52548b = m52548b(c34610p);
            List listM52503b2 = strM52548b == null ? C41060w0.f177067E : c18232h.m52503b(strM52548b, z4, z13);
            C41014d0 c41014d0M133251l = AbstractC41023g0.m133251l();
            c41014d0M133251l.m133224c(listM52503b);
            c41014d0M133251l.m133224c(listM52503b2);
            return c41014d0M133251l.m133239f();
        }

        /* JADX INFO: renamed from: h */
        public static boolean m52554h(MediaCodecInfo mediaCodecInfo, String str, boolean z4, String str2) {
            if (mediaCodecInfo.isEncoder()) {
                return false;
            }
            if (!z4 && str.endsWith(".secure")) {
                return false;
            }
            int i13 = AbstractC38065t.f163031a;
            if (i13 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Build.MANUFACTURER))) {
                String str3 = Build.DEVICE;
                if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                    return false;
                }
            }
            return (i13 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
        }

        /* JADX INFO: renamed from: i */
        public static boolean m52555i(MediaCodecInfo mediaCodecInfo, String str) {
            if (AbstractC38065t.f163031a >= 29) {
                return mediaCodecInfo.isSoftwareOnly();
            }
            if (AbstractC34587d0.m109378k(str)) {
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
    }
