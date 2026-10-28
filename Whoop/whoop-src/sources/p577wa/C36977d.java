package p577wa;

import android.text.Layout;
import android.text.TextUtils;
import androidx.media3.extractor.text.SubtitleDecoderException;
import b30.C2570m;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.service.network.model.UserState;
import fo.C14657c;
import ih0.AbstractC18489d0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p000.AbstractC11266d;
import p047c9.C4320k;
import p088dc.AbstractC11894a;
import p088dc.AbstractC11895b;
import p460rg.AbstractC31375j;
import p555vl.AbstractC36095b;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38048c;
import p607x8.AbstractC38065t;
import p607x8.InterfaceC38049d;
import p690zr.AbstractC41032j0;
import p690zr.AbstractC41047q;
import p690zr.C41012c1;
import p690zr.C41018e1;
import p690zr.C41030i1;
import p690zr.C41035k0;
import qa.C30106k;
import qa.InterfaceC30100e;
import qa.InterfaceC30107l;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: wa.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C36977d implements InterfaceC30107l {

    /* JADX INFO: renamed from: w */
    public final XmlPullParserFactory f158264w;

    /* JADX INFO: renamed from: x */
    public static final Pattern f158261x = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: y */
    public static final Pattern f158262y = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: z */
    public static final Pattern f158263z = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: E */
    public static final Pattern f158256E = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: F */
    public static final Pattern f158257F = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: G */
    public static final Pattern f158258G = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: H */
    public static final Pattern f158259H = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: I */
    public static final C14657c f158260I = new C14657c(30.0f, 1, 1);

    public C36977d() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f158264w = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e5) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e5);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C36979f m118702a(C36979f c36979f) {
        return c36979f == null ? new C36979f() : c36979f;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m118703b(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    /* JADX INFO: renamed from: c */
    public static int m118704c(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = f158259H.matcher(attributeValue);
        if (!matcher.matches()) {
            AbstractC38046a.m121826u("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z4 = true;
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i13 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i14 = Integer.parseInt(strGroup2);
            if (i13 == 0 || i14 == 0) {
                z4 = false;
            }
            AbstractC35849g.m113803e(z4, "Invalid cell resolution " + i13 + " " + i14);
            return i14;
        } catch (NumberFormatException unused) {
            AbstractC38046a.m121826u("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m118705d(String str, C36979f c36979f) throws SubtitleDecoderException {
        Matcher matcher;
        int i13 = AbstractC38065t.f163031a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = f158263z;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new SubtitleDecoderException(AbstractC18489d0.m53371l(new StringBuilder("Invalid number of entries for fontSize: "), strArrSplit.length, "."));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            AbstractC38046a.m121826u("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException(AbstractC11895b.m31996o("Invalid expression for fontSize: '", str, "'."));
        }
        String strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                c36979f.f158284j = 3;
                break;
            case "em":
                c36979f.f158284j = 2;
                break;
            case "px":
                c36979f.f158284j = 1;
                break;
            default:
                throw new SubtitleDecoderException(AbstractC11895b.m31996o("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        c36979f.f158285k = Float.parseFloat(strGroup2);
    }

    /* JADX INFO: renamed from: e */
    public static C14657c m118706e(XmlPullParser xmlPullParser) {
        float f13;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i13 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i14 = AbstractC38065t.f163031a;
            String[] strArrSplit = attributeValue2.split(" ", -1);
            AbstractC35849g.m113803e(strArrSplit.length == 2, "frameRateMultiplier doesn't have 2 parts");
            f13 = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        } else {
            f13 = 1.0f;
        }
        C14657c c14657c = f158260I;
        int i15 = c14657c.f54092a;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i15 = Integer.parseInt(attributeValue3);
        }
        int i16 = c14657c.f54094c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i16 = Integer.parseInt(attributeValue4);
        }
        return new C14657c(i13 * f13, i15, i16);
    }

    /* JADX WARN: Failed to calculate best type for var: r11v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v8 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v9 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v24 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v25 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v30 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v30 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: float
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    /* JADX INFO: renamed from: f */
    public static void m118707f(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, int r22, p047c9.C4320k r23, java.util.HashMap r24, java.util.HashMap r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p577wa.C36977d.m118707f(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, c9.k, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:6:0x003c  */
    /* JADX INFO: renamed from: g */
    public static C36976c m118708g(XmlPullParser xmlPullParser, C36976c c36976c, HashMap map, C14657c c14657c) throws SubtitleDecoderException {
        long j7;
        String[] strArrSplit;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        C36979f c36979fM118709h = m118709h(xmlPullParser, null);
        String strSubstring = null;
        String str = "";
        long jM118710i = -9223372036854775807L;
        long jM118710i2 = -9223372036854775807L;
        long jM118710i3 = -9223372036854775807L;
        for (int i13 = 0; i13 < attributeCount; i13++) {
            String attributeName = xmlPullParser.getAttributeName(i13);
            String attributeValue = xmlPullParser.getAttributeValue(i13);
            attributeName.getClass();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    break;
                case "dur":
                    jM118710i3 = m118710i(attributeValue, c14657c);
                    break;
                case "end":
                    jM118710i2 = m118710i(attributeValue, c14657c);
                    break;
                case "begin":
                    jM118710i = m118710i(attributeValue, c14657c);
                    break;
                case "style":
                    String strTrim = attributeValue.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[0];
                    } else {
                        int i14 = AbstractC38065t.f163031a;
                        strArrSplit = strTrim.split("\\s+", -1);
                    }
                    if (strArrSplit.length > 0) {
                        strArr = strArrSplit;
                        break;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith("#")) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (c36976c != null) {
            long j13 = c36976c.f158246d;
            if (j13 != -9223372036854775807L) {
                if (jM118710i != -9223372036854775807L) {
                    jM118710i += j13;
                }
                if (jM118710i2 != -9223372036854775807L) {
                    jM118710i2 += j13;
                }
            }
        }
        if (jM118710i2 != -9223372036854775807L) {
            j7 = jM118710i2;
        } else {
            if (jM118710i3 != -9223372036854775807L) {
                jM118710i2 = jM118710i + jM118710i3;
            } else if (c36976c != null) {
                long j14 = c36976c.f158247e;
                if (j14 != -9223372036854775807L) {
                    j7 = j14;
                }
            }
            j7 = jM118710i2;
        }
        return new C36976c(xmlPullParser.getName(), null, jM118710i, j7, c36979fM118709h, strArr, str, strSubstring, c36976c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:120:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:148:0x021f  */
    /* JADX WARN: Code duplicated, block: B:150:0x0233  */
    /* JADX WARN: Code duplicated, block: B:156:0x0241  */
    /* JADX WARN: Code duplicated, block: B:159:0x024f  */
    /* JADX WARN: Code duplicated, block: B:164:0x026e  */
    /* JADX WARN: Code duplicated, block: B:166:0x027f  */
    /* JADX WARN: Code duplicated, block: B:169:0x0285  */
    /* JADX WARN: Code duplicated, block: B:172:0x028f  */
    /* JADX WARN: Code duplicated, block: B:176:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:178:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:181:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:184:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:186:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:187:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0120  */
    /* JADX INFO: renamed from: h */
    public static C36979f m118709h(XmlPullParser xmlPullParser, C36979f c36979f) {
        byte b;
        int i13;
        C41018e1 c41018e1M133281k;
        C41018e1 c41018e1M133281k2;
        C41018e1 c41018e1M133281k3;
        String str;
        int iHashCode;
        String str2;
        int iHashCode2;
        int i14;
        C36975b c36975b;
        String str3;
        int iHashCode3;
        int attributeCount = xmlPullParser.getAttributeCount();
        C36979f c36979fM118702a = c36979f;
        for (int i15 = 0; i15 < attributeCount; i15++) {
            String attributeValue = xmlPullParser.getAttributeValue(i15);
            String attributeName = xmlPullParser.getAttributeName(i15);
            attributeName.getClass();
            switch (attributeName) {
                case "fontStyle":
                    b = 0;
                    break;
                case "extent":
                    b = 1;
                    break;
                case "fontFamily":
                    b = 2;
                    break;
                case "textAlign":
                    b = 3;
                    break;
                case "origin":
                    b = 4;
                    break;
                case "textDecoration":
                    b = 5;
                    break;
                case "fontWeight":
                    b = 6;
                    break;
                case "id":
                    b = 7;
                    break;
                case "ruby":
                    b = 8;
                    break;
                case "color":
                    b = 9;
                    break;
                case "shear":
                    b = 10;
                    break;
                case "textCombine":
                    b = 11;
                    break;
                case "fontSize":
                    b = 12;
                    break;
                case "textEmphasis":
                    b = 13;
                    break;
                case "rubyPosition":
                    b = 14;
                    break;
                case "backgroundColor":
                    b = 15;
                    break;
                case "multiRowAlign":
                    b = 16;
                    break;
                default:
                    b = -1;
                    break;
            }
            Layout.Alignment alignment = null;
            switch (b) {
                case 0:
                    c36979fM118702a = m118702a(c36979fM118702a);
                    c36979fM118702a.f158283i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 1:
                    c36979fM118702a = m118702a(c36979fM118702a);
                    c36979fM118702a.f158295u = attributeValue;
                    break;
                case 2:
                    c36979fM118702a = m118702a(c36979fM118702a);
                    c36979fM118702a.f158275a = attributeValue;
                    break;
                case 3:
                    c36979fM118702a = m118702a(c36979fM118702a);
                    String strM96499o = AbstractC31375j.m96499o(attributeValue);
                    strM96499o.getClass();
                    switch (strM96499o) {
                        case "center":
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case "end":
                        case "right":
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case "left":
                        case "start":
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    c36979fM118702a.f158289o = alignment;
                    break;
                case 4:
                    c36979fM118702a = m118702a(c36979fM118702a);
                    c36979fM118702a.f158294t = attributeValue;
                    break;
                case 5:
                    String strM96499o2 = AbstractC31375j.m96499o(attributeValue);
                    strM96499o2.getClass();
                    switch (strM96499o2) {
                        case "nounderline":
                            c36979fM118702a = m118702a(c36979fM118702a);
                            c36979fM118702a.f158281g = 0;
                            break;
                        case "underline":
                            c36979fM118702a = m118702a(c36979fM118702a);
                            c36979fM118702a.f158281g = 1;
                            break;
                        case "nolinethrough":
                            c36979fM118702a = m118702a(c36979fM118702a);
                            c36979fM118702a.f158280f = 0;
                            break;
                        case "linethrough":
                            c36979fM118702a = m118702a(c36979fM118702a);
                            c36979fM118702a.f158280f = 1;
                            break;
                    }
                    break;
                case 6:
                    c36979fM118702a = m118702a(c36979fM118702a);
                    c36979fM118702a.f158282h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 7:
                    if ("style".equals(xmlPullParser.getName())) {
                        c36979fM118702a = m118702a(c36979fM118702a);
                        c36979fM118702a.f158286l = attributeValue;
                    }
                    break;
                case 8:
                    String strM96499o3 = AbstractC31375j.m96499o(attributeValue);
                    strM96499o3.getClass();
                    switch (strM96499o3) {
                        case "baseContainer":
                        case "base":
                            c36979fM118702a = m118702a(c36979fM118702a);
                            c36979fM118702a.f158287m = 2;
                            break;
                        case "container":
                            c36979fM118702a = m118702a(c36979fM118702a);
                            c36979fM118702a.f158287m = 1;
                            break;
                        case "delimiter":
                            c36979fM118702a = m118702a(c36979fM118702a);
                            c36979fM118702a.f158287m = 4;
                            break;
                        case "textContainer":
                        case "text":
                            c36979fM118702a = m118702a(c36979fM118702a);
                            c36979fM118702a.f158287m = 3;
                            break;
                    }
                    break;
                case 9:
                    c36979fM118702a = m118702a(c36979fM118702a);
                    try {
                        c36979fM118702a.f158276b = AbstractC38048c.m121830a(attributeValue, false);
                        c36979fM118702a.f158277c = true;
                    } catch (IllegalArgumentException unused) {
                        AbstractC36095b.m114693u("Failed parsing color value: ", attributeValue, "TtmlParser");
                    }
                    break;
                case 10:
                    C36979f c36979fM118702a2 = m118702a(c36979fM118702a);
                    Matcher matcher = f158256E.matcher(attributeValue);
                    float fMin = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                        } catch (NumberFormatException e5) {
                            AbstractC38046a.m121827v("TtmlParser", "Failed to parse shear: " + attributeValue, e5);
                        }
                    } else {
                        AbstractC36095b.m114693u("Invalid value for shear: ", attributeValue, "TtmlParser");
                    }
                    c36979fM118702a2.f158293s = fMin;
                    c36979fM118702a = c36979fM118702a2;
                    break;
                case 11:
                    String strM96499o4 = AbstractC31375j.m96499o(attributeValue);
                    strM96499o4.getClass();
                    if (strM96499o4.equals("all")) {
                        c36979fM118702a = m118702a(c36979fM118702a);
                        c36979fM118702a.f158291q = 1;
                    } else if (strM96499o4.equals("none")) {
                        c36979fM118702a = m118702a(c36979fM118702a);
                        c36979fM118702a.f158291q = 0;
                    }
                    break;
                case 12:
                    try {
                        c36979fM118702a = m118702a(c36979fM118702a);
                        m118705d(attributeValue, c36979fM118702a);
                    } catch (SubtitleDecoderException unused2) {
                        AbstractC36095b.m114693u("Failed parsing fontSize value: ", attributeValue, "TtmlParser");
                    }
                    break;
                case 13:
                    c36979fM118702a = m118702a(c36979fM118702a);
                    Pattern pattern = C36975b.f158235d;
                    if (attributeValue == null) {
                        c36975b = null;
                    } else {
                        String strM96499o5 = AbstractC31375j.m96499o(attributeValue.trim());
                        if (strM96499o5.isEmpty()) {
                            c36975b = null;
                        } else {
                            String[] strArrSplit = TextUtils.split(strM96499o5, C36975b.f158235d);
                            int length = strArrSplit.length;
                            AbstractC41032j0 abstractC41032j0M133263l = length != 0 ? length != 1 ? AbstractC41032j0.m133263l(strArrSplit.length, (Object[]) strArrSplit.clone()) : new C41030i1(strArrSplit[0]) : C41012c1.f176973J;
                            String str4 = (String) AbstractC41047q.m133278h("outside", AbstractC41047q.m133281k(C36975b.f158239h, abstractC41032j0M133263l));
                            int iHashCode4 = str4.hashCode();
                            if (iHashCode4 != -1392885889) {
                                if (iHashCode4 != -1106037339) {
                                    if (iHashCode4 == 92734940 && str4.equals("after")) {
                                        i13 = 2;
                                    }
                                } else if (str4.equals("outside")) {
                                    i13 = -2;
                                }
                                c41018e1M133281k = AbstractC41047q.m133281k(C36975b.f158236e, abstractC41032j0M133263l);
                                if (c41018e1M133281k.isEmpty()) {
                                    c41018e1M133281k2 = AbstractC41047q.m133281k(C36975b.f158238g, abstractC41032j0M133263l);
                                    c41018e1M133281k3 = AbstractC41047q.m133281k(C36975b.f158237f, abstractC41032j0M133263l);
                                    if (c41018e1M133281k2.isEmpty() || !c41018e1M133281k3.isEmpty()) {
                                        str = (String) AbstractC41047q.m133278h("filled", c41018e1M133281k2);
                                        iHashCode = str.hashCode();
                                        if (iHashCode != -1274499742) {
                                            int i16 = (iHashCode != 3417674 && str.equals(ProfileAnalyticsKt.OPEN)) ? 2 : 1;
                                            str2 = (String) AbstractC41047q.m133278h("circle", c41018e1M133281k3);
                                            iHashCode2 = str2.hashCode();
                                            if (iHashCode2 != -1360216880) {
                                                if (iHashCode2 != -905816648) {
                                                    if (iHashCode2 == 99657 && str2.equals("dot")) {
                                                        i14 = 2;
                                                    }
                                                } else if (str2.equals("sesame")) {
                                                    i14 = 3;
                                                }
                                                c36975b = new C36975b(i14, i16, i13);
                                            } else {
                                                str2.equals("circle");
                                            }
                                            i14 = 1;
                                            c36975b = new C36975b(i14, i16, i13);
                                        } else {
                                            str.equals("filled");
                                        }
                                        str2 = (String) AbstractC41047q.m133278h("circle", c41018e1M133281k3);
                                        iHashCode2 = str2.hashCode();
                                        if (iHashCode2 != -1360216880) {
                                            if (iHashCode2 != -905816648) {
                                                if (iHashCode2 == 99657) {
                                                    i14 = 2;
                                                }
                                            } else if (str2.equals("sesame")) {
                                                i14 = 3;
                                            }
                                            c36975b = new C36975b(i14, i16, i13);
                                        } else {
                                            str2.equals("circle");
                                        }
                                        i14 = 1;
                                        c36975b = new C36975b(i14, i16, i13);
                                    } else {
                                        c36975b = new C36975b(-1, 0, i13);
                                    }
                                } else {
                                    str3 = (String) new C41035k0(c41018e1M133281k).next();
                                    iHashCode3 = str3.hashCode();
                                    if (iHashCode3 != 3005871) {
                                        int i17 = (iHashCode3 != 3387192 && str3.equals("none")) ? 0 : -1;
                                        c36975b = new C36975b(i17, 0, i13);
                                    } else {
                                        str3.equals(UserState.Sources.AUTO);
                                    }
                                    c36975b = new C36975b(i17, 0, i13);
                                }
                            } else {
                                str4.equals("before");
                            }
                            i13 = 1;
                            c41018e1M133281k = AbstractC41047q.m133281k(C36975b.f158236e, abstractC41032j0M133263l);
                            if (c41018e1M133281k.isEmpty()) {
                                str3 = (String) new C41035k0(c41018e1M133281k).next();
                                iHashCode3 = str3.hashCode();
                                if (iHashCode3 != 3005871) {
                                    if (iHashCode3 != 3387192) {
                                    }
                                    c36975b = new C36975b(i17, 0, i13);
                                } else {
                                    str3.equals(UserState.Sources.AUTO);
                                }
                                c36975b = new C36975b(i17, 0, i13);
                            } else {
                                c41018e1M133281k2 = AbstractC41047q.m133281k(C36975b.f158238g, abstractC41032j0M133263l);
                                c41018e1M133281k3 = AbstractC41047q.m133281k(C36975b.f158237f, abstractC41032j0M133263l);
                                if (c41018e1M133281k2.isEmpty()) {
                                    str = (String) AbstractC41047q.m133278h("filled", c41018e1M133281k2);
                                    iHashCode = str.hashCode();
                                    if (iHashCode != -1274499742) {
                                        if (iHashCode != 3417674) {
                                        }
                                        str2 = (String) AbstractC41047q.m133278h("circle", c41018e1M133281k3);
                                        iHashCode2 = str2.hashCode();
                                        if (iHashCode2 != -1360216880) {
                                            if (iHashCode2 != -905816648) {
                                                if (iHashCode2 == 99657) {
                                                    i14 = 2;
                                                }
                                            } else if (str2.equals("sesame")) {
                                                i14 = 3;
                                            }
                                            c36975b = new C36975b(i14, i16, i13);
                                        } else {
                                            str2.equals("circle");
                                        }
                                        i14 = 1;
                                        c36975b = new C36975b(i14, i16, i13);
                                    } else {
                                        str.equals("filled");
                                    }
                                    str2 = (String) AbstractC41047q.m133278h("circle", c41018e1M133281k3);
                                    iHashCode2 = str2.hashCode();
                                    if (iHashCode2 != -1360216880) {
                                        if (iHashCode2 != -905816648) {
                                            if (iHashCode2 == 99657) {
                                                i14 = 2;
                                            }
                                        } else if (str2.equals("sesame")) {
                                            i14 = 3;
                                        }
                                        c36975b = new C36975b(i14, i16, i13);
                                    } else {
                                        str2.equals("circle");
                                    }
                                    i14 = 1;
                                    c36975b = new C36975b(i14, i16, i13);
                                } else {
                                    str = (String) AbstractC41047q.m133278h("filled", c41018e1M133281k2);
                                    iHashCode = str.hashCode();
                                    if (iHashCode != -1274499742) {
                                        if (iHashCode != 3417674) {
                                        }
                                        str2 = (String) AbstractC41047q.m133278h("circle", c41018e1M133281k3);
                                        iHashCode2 = str2.hashCode();
                                        if (iHashCode2 != -1360216880) {
                                            if (iHashCode2 != -905816648) {
                                                if (iHashCode2 == 99657) {
                                                    i14 = 2;
                                                }
                                            } else if (str2.equals("sesame")) {
                                                i14 = 3;
                                            }
                                            c36975b = new C36975b(i14, i16, i13);
                                        } else {
                                            str2.equals("circle");
                                        }
                                        i14 = 1;
                                        c36975b = new C36975b(i14, i16, i13);
                                    } else {
                                        str.equals("filled");
                                    }
                                    str2 = (String) AbstractC41047q.m133278h("circle", c41018e1M133281k3);
                                    iHashCode2 = str2.hashCode();
                                    if (iHashCode2 != -1360216880) {
                                        if (iHashCode2 != -905816648) {
                                            if (iHashCode2 == 99657) {
                                                i14 = 2;
                                            }
                                        } else if (str2.equals("sesame")) {
                                            i14 = 3;
                                        }
                                        c36975b = new C36975b(i14, i16, i13);
                                    } else {
                                        str2.equals("circle");
                                    }
                                    i14 = 1;
                                    c36975b = new C36975b(i14, i16, i13);
                                }
                            }
                        }
                    }
                    c36979fM118702a.f158292r = c36975b;
                    break;
                case 14:
                    String strM96499o6 = AbstractC31375j.m96499o(attributeValue);
                    strM96499o6.getClass();
                    if (strM96499o6.equals("before")) {
                        c36979fM118702a = m118702a(c36979fM118702a);
                        c36979fM118702a.f158288n = 1;
                    } else if (strM96499o6.equals("after")) {
                        c36979fM118702a = m118702a(c36979fM118702a);
                        c36979fM118702a.f158288n = 2;
                    }
                    break;
                case 15:
                    c36979fM118702a = m118702a(c36979fM118702a);
                    try {
                        c36979fM118702a.f158278d = AbstractC38048c.m121830a(attributeValue, false);
                        c36979fM118702a.f158279e = true;
                    } catch (IllegalArgumentException unused3) {
                        AbstractC36095b.m114693u("Failed parsing background value: ", attributeValue, "TtmlParser");
                    }
                    break;
                case 16:
                    c36979fM118702a = m118702a(c36979fM118702a);
                    String strM96499o7 = AbstractC31375j.m96499o(attributeValue);
                    strM96499o7.getClass();
                    switch (strM96499o7) {
                        case "center":
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case "end":
                        case "right":
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case "left":
                        case "start":
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    c36979fM118702a.f158290p = alignment;
                    break;
            }
        }
        return c36979fM118702a;
    }

    /* JADX INFO: renamed from: i */
    public static long m118710i(String str, C14657c c14657c) throws SubtitleDecoderException {
        double d3;
        double d14;
        Matcher matcher = f158261x.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            double d15 = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            double d16 = d15 + (Long.parseLong(strGroup2) * 60);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d17 = d16 + Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d18 = d17 + (strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d);
            String strGroup5 = matcher.group(5);
            double d19 = d18 + (strGroup5 != null ? Long.parseLong(strGroup5) / c14657c.f54093b : 0.0d);
            String strGroup6 = matcher.group(6);
            return (long) ((d19 + (strGroup6 != null ? (Long.parseLong(strGroup6) / ((double) c14657c.f54092a)) / ((double) c14657c.f54093b) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f158262y.matcher(str);
        if (!matcher2.matches()) {
            throw new SubtitleDecoderException(AbstractC11266d.m30461o("Malformed time expression: ", str));
        }
        String strGroup7 = matcher2.group(1);
        strGroup7.getClass();
        double d24 = Double.parseDouble(strGroup7);
        String strGroup8 = matcher2.group(2);
        strGroup8.getClass();
        switch (strGroup8) {
            case "f":
                d3 = c14657c.f54093b;
                d24 /= d3;
                return (long) (d24 * 1000000.0d);
            case "h":
                d14 = 3600.0d;
                break;
            case "m":
                d14 = 60.0d;
                break;
            case "t":
                d3 = c14657c.f54094c;
                d24 /= d3;
                return (long) (d24 * 1000000.0d);
            case "ms":
                d3 = 1000.0d;
                d24 /= d3;
                return (long) (d24 * 1000000.0d);
            default:
                return (long) (d24 * 1000000.0d);
        }
        d24 *= d14;
        return (long) (d24 * 1000000.0d);
    }

    /* JADX INFO: renamed from: j */
    public static C4320k m118711j(XmlPullParser xmlPullParser) {
        String strM121815j = AbstractC38046a.m121815j(xmlPullParser, "extent");
        if (strM121815j == null) {
            return null;
        }
        Matcher matcher = f158258G.matcher(strM121815j);
        if (!matcher.matches()) {
            AbstractC38046a.m121826u("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strM121815j));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i13 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new C4320k(i13, Integer.parseInt(strGroup2), 11);
        } catch (NumberFormatException unused) {
            AbstractC38046a.m121826u("TtmlParser", "Ignoring malformed tts extent: ".concat(strM121815j));
            return null;
        }
    }

    @Override // qa.InterfaceC30107l
    /* JADX INFO: renamed from: L */
    public final InterfaceC30100e mo92227L(byte[] bArr, int i13, int i14) {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f158264w.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new C36978e("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            C4320k c4320kM118711j = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i13, i14), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            C14657c c14657cM118706e = f158260I;
            int i15 = 0;
            int iM118704c = 15;
            C2570m c2570m = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                C36976c c36976c = (C36976c) arrayDeque.peek();
                if (i15 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            c14657cM118706e = m118706e(xmlPullParserNewPullParser);
                            iM118704c = m118704c(xmlPullParserNewPullParser);
                            c4320kM118711j = m118711j(xmlPullParserNewPullParser);
                        }
                        C14657c c14657c = c14657cM118706e;
                        C4320k c4320k = c4320kM118711j;
                        int i16 = iM118704c;
                        if (m118703b(name)) {
                            if ("head".equals(name)) {
                                m118707f(xmlPullParserNewPullParser, map, i16, c4320k, map2, map3);
                            } else {
                                try {
                                    C36976c c36976cM118708g = m118708g(xmlPullParserNewPullParser, c36976c, map2, c14657c);
                                    arrayDeque.push(c36976cM118708g);
                                    if (c36976c != null) {
                                        if (c36976c.f158255m == null) {
                                            c36976c.f158255m = new ArrayList();
                                        }
                                        c36976c.f158255m.add(c36976cM118708g);
                                    }
                                } catch (SubtitleDecoderException e5) {
                                    AbstractC38046a.m121827v("TtmlParser", "Suppressing parser error", e5);
                                    i15++;
                                }
                            }
                            iM118704c = i16;
                            c4320kM118711j = c4320k;
                            c14657cM118706e = c14657c;
                        } else {
                            AbstractC38046a.m121818m("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                        }
                        i15++;
                        iM118704c = i16;
                        c4320kM118711j = c4320k;
                        c14657cM118706e = c14657c;
                    } else if (eventType == 4) {
                        c36976c.getClass();
                        C36976c c36976cM118693a = C36976c.m118693a(xmlPullParserNewPullParser.getText());
                        if (c36976c.f158255m == null) {
                            c36976c.f158255m = new ArrayList();
                        }
                        c36976c.f158255m.add(c36976cM118693a);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            C36976c c36976c2 = (C36976c) arrayDeque.peek();
                            c36976c2.getClass();
                            c2570m = new C2570m(c36976c2, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i15++;
                } else if (eventType == 3) {
                    i15--;
                }
                xmlPullParserNewPullParser.next();
            }
            c2570m.getClass();
            return c2570m;
        } catch (IOException e13) {
            throw new IllegalStateException("Unexpected error when reading input.", e13);
        } catch (XmlPullParserException e14) {
            throw new IllegalStateException("Unable to decode source", e14);
        }
    }

    @Override // qa.InterfaceC30107l
    /* JADX INFO: renamed from: c0 */
    public final int mo91110c0() {
        return 1;
    }

    @Override // qa.InterfaceC30107l
    /* JADX INFO: renamed from: k */
    public final void mo91120k(byte[] bArr, int i13, int i14, C30106k c30106k, InterfaceC38049d interfaceC38049d) {
        AbstractC11894a.m31948P(mo92227L(bArr, i13, i14), c30106k, interfaceC38049d);
    }
}
