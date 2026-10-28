package no.nordicsemi.android.dfu.internal.exception;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class UnknownResponseException extends Exception {
    private static final char[] HEX_ARRAY = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final long serialVersionUID = -8716125467309979289L;
    private final int mExpectedOpCode;
    private final int mExpectedReturnCode;
    private final byte[] mResponse;

    public UnknownResponseException(String str, byte[] bArr, int i13, int i14) {
        super(str);
        this.mResponse = bArr == null ? new byte[0] : bArr;
        this.mExpectedReturnCode = i13;
        this.mExpectedOpCode = i14;
    }

    public static String bytesToHex(byte[] bArr, int i13, int i14) {
        if (bArr == null || bArr.length <= i13 || i14 <= 0) {
            return "";
        }
        int iMin = Math.min(i14, bArr.length - i13);
        char[] cArr = new char[iMin * 2];
        for (int i15 = 0; i15 < iMin; i15++) {
            byte b = bArr[i13 + i15];
            int i16 = i15 * 2;
            char[] cArr2 = HEX_ARRAY;
            cArr[i16] = cArr2[(b & 255) >>> 4];
            cArr[i16 + 1] = cArr2[b & 15];
        }
        return "0x".concat(new String(cArr));
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        Locale locale = Locale.US;
        String message = super.getMessage();
        byte[] bArr = this.mResponse;
        return String.format(locale, "%s (response: %s, expected: 0x%02X%02X..)", message, bytesToHex(bArr, 0, bArr.length), Integer.valueOf(this.mExpectedReturnCode), Integer.valueOf(this.mExpectedOpCode));
    }
}
