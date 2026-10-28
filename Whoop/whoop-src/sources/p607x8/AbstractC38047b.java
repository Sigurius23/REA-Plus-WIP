package p607x8;

import android.util.Pair;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.service.network.model.UserSessionDto;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p516u8.C34592g;
import p555vl.AbstractC36095b;

/* JADX INFO: renamed from: x8.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC38047b {

    /* JADX INFO: renamed from: a */
    public static final byte[] f162977a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b */
    public static final String[] f162978b = {"", "A", "B", "C"};

    /* JADX INFO: renamed from: c */
    public static final Pattern f162979c = Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: a */
    public static String m121828a(int i13, boolean z4, int i14, int i15, int[] iArr, int i16) {
        Object[] objArr = {f162978b[i13], Integer.valueOf(i14), Integer.valueOf(i15), Character.valueOf(z4 ? 'H' : 'L'), Integer.valueOf(i16)};
        int i17 = AbstractC38065t.f163031a;
        StringBuilder sb4 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i18 = 0; i18 < length; i18++) {
            sb4.append(String.format(".%02X", Integer.valueOf(iArr[i18])));
        }
        return sb4.toString();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX INFO: renamed from: b */
    public static Pair m121829b(String str, String[] strArr, C34592g c34592g) {
        int i13;
        Integer numValueOf;
        if (strArr.length < 4) {
            AbstractC36095b.m114693u("Ignoring malformed HEVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = f162979c.matcher(strArr[1]);
        if (!matcher.matches()) {
            AbstractC36095b.m114693u("Ignoring malformed HEVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        String strGroup = matcher.group(1);
        if (UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE.equals(strGroup)) {
            i13 = 1;
        } else if ("2".equals(strGroup)) {
            i13 = (c34592g == null || c34592g.f145660c != 6) ? 2 : 4096;
        } else {
            if (!"6".equals(strGroup)) {
                AbstractC36095b.m114693u("Unknown HEVC profile string: ", strGroup, "CodecSpecificDataUtil");
                return null;
            }
            i13 = 6;
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2) {
                case "H30":
                    numValueOf = 2;
                    break;
                case "H60":
                    numValueOf = 8;
                    break;
                case "H63":
                    numValueOf = 32;
                    break;
                case "H90":
                    numValueOf = 128;
                    break;
                case "H93":
                    numValueOf = 512;
                    break;
                case "L30":
                    numValueOf = 1;
                    break;
                case "L60":
                    numValueOf = 4;
                    break;
                case "L63":
                    numValueOf = 16;
                    break;
                case "L90":
                    numValueOf = 64;
                    break;
                case "L93":
                    numValueOf = 256;
                    break;
                case "H120":
                    numValueOf = Integer.valueOf(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS);
                    break;
                case "H123":
                    numValueOf = Integer.valueOf(DfuBaseService.ERROR_REMOTE_MASK);
                    break;
                case "H150":
                    numValueOf = 32768;
                    break;
                case "H153":
                    numValueOf = Integer.valueOf(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ);
                    break;
                case "H156":
                    numValueOf = 524288;
                    break;
                case "H180":
                    numValueOf = 2097152;
                    break;
                case "H183":
                    numValueOf = 8388608;
                    break;
                case "H186":
                    numValueOf = Integer.valueOf(AndroidSDKConstants.FLAG_MUTABLE);
                    break;
                case "L120":
                    numValueOf = Integer.valueOf(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
                    break;
                case "L123":
                    numValueOf = 4096;
                    break;
                case "L150":
                    numValueOf = Integer.valueOf(DfuBaseService.ERROR_CONNECTION_MASK);
                    break;
                case "L153":
                    numValueOf = Integer.valueOf(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST);
                    break;
                case "L156":
                    numValueOf = Integer.valueOf(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION);
                    break;
                case "L180":
                    numValueOf = 1048576;
                    break;
                case "L183":
                    numValueOf = 4194304;
                    break;
                case "L186":
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
            return new Pair(Integer.valueOf(i13), numValueOf);
        }
        AbstractC36095b.m114693u("Unknown HEVC level string: ", str2, "CodecSpecificDataUtil");
        return null;
    }
}
