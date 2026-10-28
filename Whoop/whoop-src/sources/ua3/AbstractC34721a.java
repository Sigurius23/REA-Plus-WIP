package ua3;

import live.hms.video.factories.MediaConstraintsFactory;

/* JADX INFO: renamed from: ua3.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC34721a {
    static {
        String property;
        try {
            property = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            property = null;
        }
        MediaConstraintsFactory.kValueTrue.equals(property);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m109645a(String[] strArr) {
        if (strArr == null) {
            Object[] objArr = new Object[3];
            objArr[0] = "data";
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
            switch (7) {
                case 1:
                case 3:
                case 6:
                case 8:
                case 10:
                case 12:
                case 14:
                    break;
                case 2:
                    objArr[2] = "encode8to7";
                    break;
                case 4:
                    objArr[2] = "addModuloByte";
                    break;
                case 5:
                    objArr[2] = "splitBytesToStringArray";
                    break;
                case 7:
                    objArr[2] = "decodeBytes";
                    break;
                case 9:
                    objArr[2] = "dropMarker";
                    break;
                case 11:
                    objArr[2] = "combineStringArrayIntoBytes";
                    break;
                case 13:
                    objArr[2] = "decode7to8";
                    break;
                default:
                    objArr[2] = "encodeBytes";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
        if (strArr.length > 0 && !strArr[0].isEmpty()) {
            char cCharAt = strArr[0].charAt(0);
            if (cCharAt == 0) {
                String[] strArr2 = (String[]) strArr.clone();
                strArr2[0] = strArr2[0].substring(1);
                int length = 0;
                for (String str : strArr2) {
                    length += str.length();
                }
                byte[] bArr = new byte[length];
                int i13 = 0;
                for (String str2 : strArr2) {
                    int length2 = str2.length();
                    int i14 = 0;
                    while (i14 < length2) {
                        bArr[i13] = (byte) str2.charAt(i14);
                        i14++;
                        i13++;
                    }
                }
                return bArr;
            }
            if (cCharAt == 65535) {
                strArr = (String[]) strArr.clone();
                strArr[0] = strArr[0].substring(1);
            }
        }
        int length3 = 0;
        for (String str3 : strArr) {
            length3 += str3.length();
        }
        byte[] bArr2 = new byte[length3];
        int i15 = 0;
        for (String str4 : strArr) {
            int length4 = str4.length();
            int i16 = 0;
            while (i16 < length4) {
                bArr2[i15] = (byte) str4.charAt(i16);
                i16++;
                i15++;
            }
        }
        for (int i17 = 0; i17 < length3; i17++) {
            bArr2[i17] = (byte) ((bArr2[i17] + 127) & 127);
        }
        int i18 = (length3 * 7) / 8;
        byte[] bArr3 = new byte[i18];
        int i19 = 0;
        int i24 = 0;
        for (int i25 = 0; i25 < i18; i25++) {
            int i26 = i19 + 1;
            int i27 = i24 + 1;
            bArr3[i25] = (byte) (((bArr2[i19] & 255) >>> i24) + ((bArr2[i26] & ((1 << i27) - 1)) << (7 - i24)));
            if (i24 == 6) {
                i19 += 2;
                i24 = 0;
            } else {
                i19 = i26;
                i24 = i27;
            }
        }
        return bArr3;
    }
}
