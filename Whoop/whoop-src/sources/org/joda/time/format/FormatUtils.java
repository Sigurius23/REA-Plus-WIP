package org.joda.time.format;

import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.ChatClient;
import java.io.IOException;
import java.io.Writer;
import p088dc.AbstractC11895b;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes5.dex */
public class FormatUtils {
    private static final double LOG_10 = Math.log(10.0d);

    private FormatUtils() {
    }

    public static void appendPaddedInteger(StringBuffer stringBuffer, int i13, int i14) {
        try {
            appendPaddedInteger((Appendable) stringBuffer, i13, i14);
        } catch (IOException unused) {
        }
    }

    public static void appendUnpaddedInteger(StringBuffer stringBuffer, int i13) {
        try {
            appendUnpaddedInteger((Appendable) stringBuffer, i13);
        } catch (IOException unused) {
        }
    }

    public static int calculateDigitCount(long j7) {
        int iLog;
        if (j7 < 0) {
            if (j7 == Long.MIN_VALUE) {
                return 20;
            }
            iLog = calculateDigitCount(-j7);
        } else {
            if (j7 < 10) {
                return 1;
            }
            if (j7 < 100) {
                return 2;
            }
            if (j7 < 1000) {
                return 3;
            }
            if (j7 < ChatClient.RESOLVE_DEPENDENCY_TIMEOUT) {
                return 4;
            }
            iLog = (int) (Math.log(j7) / LOG_10);
        }
        return iLog + 1;
    }

    public static String createErrorMessage(String str, int i13) {
        String strConcat = str.length() <= i13 + 35 ? str : str.substring(0, i13 + 32).concat("...");
        if (i13 <= 0) {
            return AbstractC31061c.m95633i('\"', "Invalid format: \"", strConcat);
        }
        if (i13 >= str.length()) {
            return AbstractC11895b.m31996o("Invalid format: \"", strConcat, "\" is too short");
        }
        StringBuilder sbM53375p = AbstractC18489d0.m53375p("Invalid format: \"", strConcat, "\" is malformed at \"");
        sbM53375p.append(strConcat.substring(i13));
        sbM53375p.append('\"');
        return sbM53375p.toString();
    }

    public static int parseTwoDigits(CharSequence charSequence, int i13) {
        int iCharAt = charSequence.charAt(i13) - '0';
        return (charSequence.charAt(i13 + 1) + ((iCharAt << 3) + (iCharAt << 1))) - 48;
    }

    public static void writePaddedInteger(Writer writer, int i13, int i14) throws IOException {
        int iLog;
        if (i13 < 0) {
            writer.write(45);
            if (i13 == Integer.MIN_VALUE) {
                while (i14 > 10) {
                    writer.write(48);
                    i14--;
                }
                writer.write("2147483648");
                return;
            }
            i13 = -i13;
        }
        if (i13 < 10) {
            while (i14 > 1) {
                writer.write(48);
                i14--;
            }
            writer.write(i13 + 48);
            return;
        }
        if (i13 < 100) {
            while (i14 > 2) {
                writer.write(48);
                i14--;
            }
            int i15 = ((i13 + 1) * 13421772) >> 27;
            writer.write(i15 + 48);
            writer.write(((i13 - (i15 << 3)) - (i15 << 1)) + 48);
            return;
        }
        if (i13 < 1000) {
            iLog = 3;
        } else {
            iLog = i13 < 10000 ? 4 : ((int) (Math.log(i13) / LOG_10)) + 1;
        }
        while (i14 > iLog) {
            writer.write(48);
            i14--;
        }
        writer.write(Integer.toString(i13));
    }

    public static void writeUnpaddedInteger(Writer writer, int i13) throws IOException {
        if (i13 < 0) {
            writer.write(45);
            if (i13 == Integer.MIN_VALUE) {
                writer.write("2147483648");
                return;
            }
            i13 = -i13;
        }
        if (i13 < 10) {
            writer.write(i13 + 48);
        } else {
            if (i13 >= 100) {
                writer.write(Integer.toString(i13));
                return;
            }
            int i14 = ((i13 + 1) * 13421772) >> 27;
            writer.write(i14 + 48);
            writer.write(((i13 - (i14 << 3)) - (i14 << 1)) + 48);
        }
    }

    public static void appendPaddedInteger(Appendable appendable, int i13, int i14) throws IOException {
        int iLog;
        if (i13 < 0) {
            appendable.append('-');
            if (i13 == Integer.MIN_VALUE) {
                while (i14 > 10) {
                    appendable.append('0');
                    i14--;
                }
                appendable.append("2147483648");
                return;
            }
            i13 = -i13;
        }
        if (i13 < 10) {
            while (i14 > 1) {
                appendable.append('0');
                i14--;
            }
            appendable.append((char) (i13 + 48));
            return;
        }
        if (i13 < 100) {
            while (i14 > 2) {
                appendable.append('0');
                i14--;
            }
            int i15 = ((i13 + 1) * 13421772) >> 27;
            appendable.append((char) (i15 + 48));
            appendable.append((char) (((i13 - (i15 << 3)) - (i15 << 1)) + 48));
            return;
        }
        if (i13 < 1000) {
            iLog = 3;
        } else {
            iLog = i13 < 10000 ? 4 : ((int) (Math.log(i13) / LOG_10)) + 1;
        }
        while (i14 > iLog) {
            appendable.append('0');
            i14--;
        }
        appendable.append(Integer.toString(i13));
    }

    public static void appendUnpaddedInteger(Appendable appendable, int i13) throws IOException {
        if (i13 < 0) {
            appendable.append('-');
            if (i13 == Integer.MIN_VALUE) {
                appendable.append("2147483648");
                return;
            }
            i13 = -i13;
        }
        if (i13 < 10) {
            appendable.append((char) (i13 + 48));
        } else {
            if (i13 >= 100) {
                appendable.append(Integer.toString(i13));
                return;
            }
            int i14 = ((i13 + 1) * 13421772) >> 27;
            appendable.append((char) (i14 + 48));
            appendable.append((char) (((i13 - (i14 << 3)) - (i14 << 1)) + 48));
        }
    }

    public static void writeUnpaddedInteger(Writer writer, long j7) throws IOException {
        int i13 = (int) j7;
        if (i13 == j7) {
            writeUnpaddedInteger(writer, i13);
        } else {
            writer.write(Long.toString(j7));
        }
    }

    public static void appendUnpaddedInteger(StringBuffer stringBuffer, long j7) {
        try {
            appendUnpaddedInteger((Appendable) stringBuffer, j7);
        } catch (IOException unused) {
        }
    }

    public static void appendUnpaddedInteger(Appendable appendable, long j7) throws IOException {
        int i13 = (int) j7;
        if (i13 == j7) {
            appendUnpaddedInteger(appendable, i13);
        } else {
            appendable.append(Long.toString(j7));
        }
    }

    public static void writePaddedInteger(Writer writer, long j7, int i13) throws IOException {
        int i14 = (int) j7;
        if (i14 == j7) {
            writePaddedInteger(writer, i14, i13);
            return;
        }
        if (i13 <= 19) {
            writer.write(Long.toString(j7));
            return;
        }
        if (j7 < 0) {
            writer.write(45);
            if (j7 == Long.MIN_VALUE) {
                while (i13 > 19) {
                    writer.write(48);
                    i13--;
                }
                writer.write("9223372036854775808");
                return;
            }
            j7 = -j7;
        }
        int iLog = ((int) (Math.log(j7) / LOG_10)) + 1;
        while (i13 > iLog) {
            writer.write(48);
            i13--;
        }
        writer.write(Long.toString(j7));
    }

    public static void appendPaddedInteger(StringBuffer stringBuffer, long j7, int i13) {
        try {
            appendPaddedInteger((Appendable) stringBuffer, j7, i13);
        } catch (IOException unused) {
        }
    }

    public static void appendPaddedInteger(Appendable appendable, long j7, int i13) throws IOException {
        int i14 = (int) j7;
        if (i14 == j7) {
            appendPaddedInteger(appendable, i14, i13);
            return;
        }
        if (i13 <= 19) {
            appendable.append(Long.toString(j7));
            return;
        }
        if (j7 < 0) {
            appendable.append('-');
            if (j7 == Long.MIN_VALUE) {
                while (i13 > 19) {
                    appendable.append('0');
                    i13--;
                }
                appendable.append("9223372036854775808");
                return;
            }
            j7 = -j7;
        }
        int iLog = ((int) (Math.log(j7) / LOG_10)) + 1;
        while (i13 > iLog) {
            appendable.append('0');
            i13--;
        }
        appendable.append(Long.toString(j7));
    }
}
