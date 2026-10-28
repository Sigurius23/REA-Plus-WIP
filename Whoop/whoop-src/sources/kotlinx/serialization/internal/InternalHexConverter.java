package kotlinx.serialization.internal;

import com.whoop.service.network.model.UserSessionDto;
import java.util.Locale;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m65681d2 = {"Lkotlinx/serialization/internal/InternalHexConverter;", "", "<init>", "()V", "hexCode", "", "parseHexBinary", "", "s", "hexToInt", "", "ch", "", "printHexBinary", "data", "lowerCase", "", "toHexString", "n", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class InternalHexConverter {
    public static final InternalHexConverter INSTANCE = new InternalHexConverter();
    private static final String hexCode = "0123456789ABCDEF";

    private InternalHexConverter() {
    }

    private final int hexToInt(char ch4) {
        if ('0' <= ch4 && ch4 < ':') {
            return ch4 - '0';
        }
        if ('A' <= ch4 && ch4 < 'G') {
            return ch4 - '7';
        }
        if ('a' > ch4 || ch4 >= 'g') {
            return -1;
        }
        return ch4 - 'W';
    }

    public static /* synthetic */ String printHexBinary$default(InternalHexConverter internalHexConverter, byte[] bArr, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        return internalHexConverter.printHexBinary(bArr, z4);
    }

    public final byte[] parseHexBinary(String s13) {
        AbstractC22676k.m65750j(s13, "s");
        int length = s13.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("HexBinary string must be even length");
        }
        byte[] bArr = new byte[length / 2];
        for (int i13 = 0; i13 < length; i13 += 2) {
            int iHexToInt = hexToInt(s13.charAt(i13));
            int i14 = i13 + 1;
            int iHexToInt2 = hexToInt(s13.charAt(i14));
            if (iHexToInt == -1 || iHexToInt2 == -1) {
                throw new IllegalArgumentException(("Invalid hex chars: " + s13.charAt(i13) + s13.charAt(i14)).toString());
            }
            bArr[i13 / 2] = (byte) ((iHexToInt << 4) + iHexToInt2);
        }
        return bArr;
    }

    public final String printHexBinary(byte[] data, boolean lowerCase) {
        AbstractC22676k.m65750j(data, "data");
        StringBuilder sb4 = new StringBuilder(data.length * 2);
        for (byte b : data) {
            sb4.append(hexCode.charAt((b >> 4) & 15));
            sb4.append(hexCode.charAt(b & 15));
        }
        if (!lowerCase) {
            String string = sb4.toString();
            AbstractC22676k.m65749i(string, "toString(...)");
            return string;
        }
        String string2 = sb4.toString();
        AbstractC22676k.m65749i(string2, "toString(...)");
        String lowerCase2 = string2.toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase2, "toLowerCase(...)");
        return lowerCase2;
    }

    public final String toHexString(int n) {
        byte[] bArr = new byte[4];
        for (int i13 = 0; i13 < 4; i13++) {
            bArr[i13] = (byte) (n >> (24 - (i13 * 8)));
        }
        String strM125874S0 = AbstractC39414r.m125874S0(printHexBinary(bArr, true), '0');
        if (strM125874S0.length() <= 0) {
            strM125874S0 = null;
        }
        return strM125874S0 == null ? UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE : strM125874S0;
    }
}
