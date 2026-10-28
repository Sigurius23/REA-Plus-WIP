package gw;

import java.io.Serializable;
import java.text.ParseException;
import p628xw.C38672b;

/* JADX INFO: renamed from: gw.g */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC16256g implements Serializable {

    /* JADX INFO: renamed from: w */
    public C16267r f61804w = null;

    /* JADX INFO: renamed from: a */
    public static C38672b[] m46077a(String str) throws ParseException {
        String strTrim = str.trim();
        int iIndexOf = strTrim.indexOf(".");
        if (iIndexOf == -1) {
            throw new ParseException("Invalid serialized unsecured/JWS/JWE object: Missing part delimiters", 0);
        }
        int i13 = iIndexOf + 1;
        int iIndexOf2 = strTrim.indexOf(".", i13);
        if (iIndexOf2 == -1) {
            throw new ParseException("Invalid serialized unsecured/JWS/JWE object: Missing second delimiter", 0);
        }
        int i14 = iIndexOf2 + 1;
        int iIndexOf3 = strTrim.indexOf(".", i14);
        if (iIndexOf3 == -1) {
            return new C38672b[]{new C38672b(strTrim.substring(0, iIndexOf)), new C38672b(strTrim.substring(i13, iIndexOf2)), new C38672b(strTrim.substring(i14))};
        }
        int i15 = iIndexOf3 + 1;
        int iIndexOf4 = strTrim.indexOf(".", i15);
        if (iIndexOf4 == -1) {
            throw new ParseException("Invalid serialized JWE object: Missing fourth delimiter", 0);
        }
        if (iIndexOf4 == -1 || strTrim.indexOf(".", iIndexOf4 + 1) == -1) {
            return new C38672b[]{new C38672b(strTrim.substring(0, iIndexOf)), new C38672b(strTrim.substring(i13, iIndexOf2)), new C38672b(strTrim.substring(i14, iIndexOf3)), new C38672b(strTrim.substring(i15, iIndexOf4)), new C38672b(strTrim.substring(iIndexOf4 + 1))};
        }
        throw new ParseException("Invalid serialized unsecured/JWS/JWE object: Too many part delimiters", 0);
    }
}
