package i63;

import com.whoop.data.remote.domain.dto.DateTimeRange;
import java.util.Set;
import m83.AbstractC25260n;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: i63.k */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18172k {

    /* JADX INFO: renamed from: a */
    public static final Set f70500a = AbstractC25260n.m74059b1(new Character[]{'(', ')', '<', '>', '@', Character.valueOf(DateTimeRange.lowerUpperDelimiter), ';', ':', '\\', '\"', '/', '[', ']', '?', '=', '{', '}', ' ', '\t', '\n', '\r'});

    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063 A[LOOP:2: B:28:0x0050->B:32:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x0062 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final boolean m52173a(String str) {
        int length;
        int i13;
        if (str.length() != 0) {
            if (str.length() < 2 || AbstractC39414r.m125882a0(str) != '\"' || AbstractC39414r.m125891j0(str) != '\"') {
                length = str.length();
                for (i13 = 0; i13 < length; i13++) {
                    if (f70500a.contains(Character.valueOf(str.charAt(i13)))) {
                    }
                }
                break;
                break;
            }
            int i14 = 1;
            do {
                int iM125887f0 = AbstractC39414r.m125887f0(str, '\"', i14, false, 4);
                if (iM125887f0 == AbstractC39414r.m125884c0(str)) {
                    break;
                }
                int i15 = 0;
                for (int i16 = iM125887f0 - 1; str.charAt(i16) == '\\'; i16--) {
                    i15++;
                }
                if (i15 % 2 == 0) {
                    length = str.length();
                    while (i13 < length) {
                        if (f70500a.contains(Character.valueOf(str.charAt(i13)))) {
                        }
                    }
                    break;
                }
                i14 = iM125887f0 + 1;
            } while (i14 < str.length());
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static final String m52174b(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        StringBuilder sb4 = new StringBuilder("\"");
        int length = str.length();
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = str.charAt(i13);
            if (cCharAt == '\\') {
                sb4.append("\\\\");
            } else if (cCharAt == '\n') {
                sb4.append("\\n");
            } else if (cCharAt == '\r') {
                sb4.append("\\r");
            } else if (cCharAt == '\t') {
                sb4.append("\\t");
            } else if (cCharAt == '\"') {
                sb4.append("\\\"");
            } else {
                sb4.append(cCharAt);
            }
        }
        sb4.append("\"");
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
