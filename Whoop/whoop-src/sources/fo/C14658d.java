package fo;

import android.text.Layout;
import android.text.TextUtils;
import android.util.Log;
import b30.C2570m;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.service.network.model.UserState;
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
import p047c9.C4320k;
import p077d0.C11387o2;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24544b;
import p309lo.AbstractC24567y;
import p460rg.AbstractC31375j;
import p621xn.AbstractC38467d;
import p621xn.InterfaceC38468e;
import p690zr.AbstractC41032j0;
import p690zr.AbstractC41047q;
import p690zr.C41012c1;
import p690zr.C41018e1;
import p690zr.C41030i1;
import p690zr.C41035k0;

/* JADX INFO: renamed from: fo.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C14658d extends AbstractC38467d {

    /* JADX INFO: renamed from: n */
    public static final Pattern f54095n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: o */
    public static final Pattern f54096o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: p */
    public static final Pattern f54097p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: q */
    public static final Pattern f54098q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: r */
    public static final Pattern f54099r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: s */
    public static final Pattern f54100s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: t */
    public static final Pattern f54101t = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: u */
    public static final C14657c f54102u = new C14657c(30.0f, 1, 1);

    /* JADX INFO: renamed from: v */
    public static final C11387o2 f54103v = new C11387o2(15, 3);

    /* JADX INFO: renamed from: m */
    public final XmlPullParserFactory f54104m;

    public C14658d() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f54104m = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e5) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e5);
        }
    }

    /* JADX INFO: renamed from: h */
    public static C14661g m41864h(C14661g c14661g) {
        return c14661g == null ? new C14661g() : c14661g;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m41865i(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    /* JADX INFO: renamed from: j */
    public static C11387o2 m41866j(XmlPullParser xmlPullParser, C11387o2 c11387o2) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return c11387o2;
        }
        Matcher matcher = f54101t.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.w("TtmlDecoder", attributeValue.length() != 0 ? "Ignoring malformed cell resolution: ".concat(attributeValue) : new String("Ignoring malformed cell resolution: "));
            return c11387o2;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i13 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i14 = Integer.parseInt(strGroup2);
            if (i13 != 0 && i14 != 0) {
                return new C11387o2(i14, 3);
            }
            StringBuilder sb4 = new StringBuilder(47);
            sb4.append("Invalid cell resolution ");
            sb4.append(i13);
            sb4.append(" ");
            sb4.append(i14);
            throw new SubtitleDecoderException(sb4.toString());
        } catch (NumberFormatException unused) {
            Log.w("TtmlDecoder", attributeValue.length() != 0 ? "Ignoring malformed cell resolution: ".concat(attributeValue) : new String("Ignoring malformed cell resolution: "));
            return c11387o2;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m41867k(String str, C14661g c14661g) throws SubtitleDecoderException {
        Matcher matcher;
        int i13 = AbstractC24567y.f95875a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = f54097p;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                int length2 = strArrSplit.length;
                StringBuilder sb4 = new StringBuilder(52);
                sb4.append("Invalid number of entries for fontSize: ");
                sb4.append(length2);
                sb4.append(".");
                throw new SubtitleDecoderException(sb4.toString());
            }
            matcher = pattern.matcher(strArrSplit[1]);
            Log.w("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            StringBuilder sb5 = new StringBuilder(str.length() + 36);
            sb5.append("Invalid expression for fontSize: '");
            sb5.append(str);
            sb5.append("'.");
            throw new SubtitleDecoderException(sb5.toString());
        }
        String strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                c14661g.f54137j = 3;
                break;
            case "em":
                c14661g.f54137j = 2;
                break;
            case "px":
                c14661g.f54137j = 1;
                break;
            default:
                StringBuilder sb6 = new StringBuilder(strGroup.length() + 30);
                sb6.append("Invalid unit for fontSize: '");
                sb6.append(strGroup);
                sb6.append("'.");
                throw new SubtitleDecoderException(sb6.toString());
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        c14661g.f54138k = Float.parseFloat(strGroup2);
    }

    /* JADX INFO: renamed from: l */
    public static C14657c m41868l(XmlPullParser xmlPullParser) throws SubtitleDecoderException {
        float f13;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i13 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i14 = AbstractC24567y.f95875a;
            String[] strArrSplit = attributeValue2.split(" ", -1);
            if (strArrSplit.length != 2) {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
            f13 = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        } else {
            f13 = 1.0f;
        }
        C14657c c14657c = f54102u;
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0207  */
    /* JADX WARN: Code duplicated, block: B:107:0x022b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0235  */
    /* JADX WARN: Code duplicated, block: B:110:0x023a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0244  */
    /* JADX WARN: Code duplicated, block: B:139:0x0116 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x0165 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0106  */
    /* JADX WARN: Code duplicated, block: B:59:0x0147  */
    /* JADX WARN: Code duplicated, block: B:61:0x014d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x014f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0155  */
    /* JADX WARN: Code duplicated, block: B:65:0x015a  */
    /* JADX WARN: Code duplicated, block: B:71:0x018f  */
    /* JADX WARN: Code duplicated, block: B:73:0x019e  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:81:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:83:0x01db  */
    /* JADX WARN: Code duplicated, block: B:84:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:95:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:98:0x0201  */
    /* JADX WARN: Code duplicated, block: B:99:0x0204 A[PHI: r14
      0x0204: PHI (r14v2 int) = (r14v1 int), (r14v0 int) binds: [B:100:0x0207, B:96:0x01fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: m */
    public static void m41869m(XmlPullParser xmlPullParser, HashMap map, C11387o2 c11387o2, C4320k c4320k, HashMap map2, HashMap map3) throws XmlPullParserException, IOException {
        String strM71582r;
        float f13;
        float f14;
        String strM71582r2;
        Matcher matcher;
        Matcher matcher2;
        float f15;
        float f16;
        String strM71582r3;
        float f17;
        int i13;
        String strM71582r4;
        int i14;
        C14660f c14660f;
        String strM96499o;
        String strM96499o2;
        String str;
        String str2;
        String[] strArrSplit;
        do {
            xmlPullParser.next();
            if (AbstractC24543a.m71587w(xmlPullParser, "style")) {
                String strM71582r5 = AbstractC24543a.m71582r(xmlPullParser, "style");
                C14661g c14661gM41871o = m41871o(xmlPullParser, new C14661g());
                if (strM71582r5 != null) {
                    String strTrim = strM71582r5.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[0];
                    } else {
                        int i15 = AbstractC24567y.f95875a;
                        strArrSplit = strTrim.split("\\s+", -1);
                    }
                    for (String str3 : strArrSplit) {
                        c14661gM41871o.m41883a((C14661g) map.get(str3));
                    }
                }
                String str4 = c14661gM41871o.f54139l;
                if (str4 != null) {
                    map.put(str4, c14661gM41871o);
                }
            } else if (AbstractC24543a.m71587w(xmlPullParser, "region")) {
                String strM71582r6 = AbstractC24543a.m71582r(xmlPullParser, "id");
                if (strM71582r6 != null) {
                    String strM71582r7 = AbstractC24543a.m71582r(xmlPullParser, AnalyticsRequestV2.HEADER_ORIGIN);
                    if (strM71582r7 != null) {
                        Pattern pattern = f54099r;
                        Matcher matcher3 = pattern.matcher(strM71582r7);
                        Pattern pattern2 = f54100s;
                        Matcher matcher4 = pattern2.matcher(strM71582r7);
                        int i16 = 2;
                        if (matcher3.matches()) {
                            try {
                                String strGroup = matcher3.group(1);
                                strGroup.getClass();
                                f13 = Float.parseFloat(strGroup) / 100.0f;
                                String strGroup2 = matcher3.group(2);
                                strGroup2.getClass();
                                f14 = Float.parseFloat(strGroup2) / 100.0f;
                                strM71582r2 = AbstractC24543a.m71582r(xmlPullParser, "extent");
                                if (strM71582r2 != null) {
                                    matcher = pattern.matcher(strM71582r2);
                                    matcher2 = pattern2.matcher(strM71582r2);
                                    if (matcher.matches()) {
                                        try {
                                            String strGroup3 = matcher.group(1);
                                            strGroup3.getClass();
                                            f15 = Float.parseFloat(strGroup3) / 100.0f;
                                            String strGroup4 = matcher.group(2);
                                            strGroup4.getClass();
                                            f16 = Float.parseFloat(strGroup4) / 100.0f;
                                        } catch (NumberFormatException unused) {
                                            Log.w("TtmlDecoder", strM71582r7.length() != 0 ? "Ignoring region with malformed extent: ".concat(strM71582r7) : new String("Ignoring region with malformed extent: "));
                                            c14660f = null;
                                        }
                                    } else if (matcher2.matches()) {
                                        if (strM71582r7.length() != 0) {
                                            str = "Ignoring region with unsupported extent: ".concat(strM71582r7);
                                        } else {
                                            str = new String("Ignoring region with unsupported extent: ");
                                        }
                                        Log.w("TtmlDecoder", str);
                                    } else if (c4320k == null) {
                                        if (strM71582r7.length() != 0) {
                                            str2 = "Ignoring region with missing tts:extent: ".concat(strM71582r7);
                                        } else {
                                            str2 = new String("Ignoring region with missing tts:extent: ");
                                        }
                                        Log.w("TtmlDecoder", str2);
                                    } else {
                                        try {
                                            String strGroup5 = matcher2.group(1);
                                            strGroup5.getClass();
                                            int i17 = Integer.parseInt(strGroup5);
                                            String strGroup6 = matcher2.group(2);
                                            strGroup6.getClass();
                                            int i18 = Integer.parseInt(strGroup6);
                                            f15 = i17 / c4320k.f17541x;
                                            f16 = i18 / c4320k.f17542y;
                                        } catch (NumberFormatException unused2) {
                                            Log.w("TtmlDecoder", strM71582r7.length() != 0 ? "Ignoring region with malformed extent: ".concat(strM71582r7) : new String("Ignoring region with malformed extent: "));
                                            c14660f = null;
                                        }
                                    }
                                    float f18 = f15;
                                    strM71582r3 = AbstractC24543a.m71582r(xmlPullParser, "displayAlign");
                                    if (strM71582r3 != null) {
                                        strM96499o2 = AbstractC31375j.m96499o(strM71582r3);
                                        strM96499o2.getClass();
                                        if (!strM96499o2.equals("center")) {
                                            f17 = f14 + (f16 / 2.0f);
                                            i13 = 1;
                                        } else if (strM96499o2.equals("after")) {
                                            f17 = f14 + f16;
                                            i13 = 2;
                                        } else {
                                            f17 = f14;
                                            i13 = 0;
                                        }
                                    } else {
                                        f17 = f14;
                                        i13 = 0;
                                    }
                                    float f19 = 1.0f / c11387o2.f36515x;
                                    strM71582r4 = AbstractC24543a.m71582r(xmlPullParser, "writingMode");
                                    if (strM71582r4 != null) {
                                        strM96499o = AbstractC31375j.m96499o(strM71582r4);
                                        strM96499o.getClass();
                                        switch (strM96499o) {
                                            case "tb":
                                            case "tblr":
                                                i14 = i16;
                                                break;
                                            case "tbrl":
                                                i14 = 1;
                                                break;
                                            default:
                                                i16 = Integer.MIN_VALUE;
                                                i14 = i16;
                                                break;
                                        }
                                    } else {
                                        i16 = Integer.MIN_VALUE;
                                        i14 = i16;
                                    }
                                    c14660f = new C14660f(strM71582r6, f13, f17, 0, i13, f18, f16, 1, f19, i14);
                                } else {
                                    Log.w("TtmlDecoder", "Ignoring region without an extent");
                                }
                            } catch (NumberFormatException unused3) {
                                Log.w("TtmlDecoder", strM71582r7.length() != 0 ? "Ignoring region with malformed origin: ".concat(strM71582r7) : new String("Ignoring region with malformed origin: "));
                            }
                        } else if (!matcher4.matches()) {
                            Log.w("TtmlDecoder", strM71582r7.length() != 0 ? "Ignoring region with unsupported origin: ".concat(strM71582r7) : new String("Ignoring region with unsupported origin: "));
                        } else if (c4320k == null) {
                            Log.w("TtmlDecoder", strM71582r7.length() != 0 ? "Ignoring region with missing tts:extent: ".concat(strM71582r7) : new String("Ignoring region with missing tts:extent: "));
                        } else {
                            try {
                                String strGroup7 = matcher4.group(1);
                                strGroup7.getClass();
                                int i19 = Integer.parseInt(strGroup7);
                                String strGroup8 = matcher4.group(2);
                                strGroup8.getClass();
                                int i24 = Integer.parseInt(strGroup8);
                                float f24 = i19 / c4320k.f17541x;
                                f14 = i24 / c4320k.f17542y;
                                f13 = f24;
                                strM71582r2 = AbstractC24543a.m71582r(xmlPullParser, "extent");
                                if (strM71582r2 != null) {
                                    matcher = pattern.matcher(strM71582r2);
                                    matcher2 = pattern2.matcher(strM71582r2);
                                    if (matcher.matches()) {
                                        String strGroup9 = matcher.group(1);
                                        strGroup9.getClass();
                                        f15 = Float.parseFloat(strGroup9) / 100.0f;
                                        String strGroup10 = matcher.group(2);
                                        strGroup10.getClass();
                                        f16 = Float.parseFloat(strGroup10) / 100.0f;
                                    } else if (matcher2.matches()) {
                                        if (strM71582r7.length() != 0) {
                                            str = "Ignoring region with unsupported extent: ".concat(strM71582r7);
                                        } else {
                                            str = new String("Ignoring region with unsupported extent: ");
                                        }
                                        Log.w("TtmlDecoder", str);
                                    } else if (c4320k == null) {
                                        if (strM71582r7.length() != 0) {
                                            str2 = "Ignoring region with missing tts:extent: ".concat(strM71582r7);
                                        } else {
                                            str2 = new String("Ignoring region with missing tts:extent: ");
                                        }
                                        Log.w("TtmlDecoder", str2);
                                    } else {
                                        String strGroup11 = matcher2.group(1);
                                        strGroup11.getClass();
                                        int i110 = Integer.parseInt(strGroup11);
                                        String strGroup12 = matcher2.group(2);
                                        strGroup12.getClass();
                                        int i111 = Integer.parseInt(strGroup12);
                                        f15 = i110 / c4320k.f17541x;
                                        f16 = i111 / c4320k.f17542y;
                                    }
                                    float f110 = f15;
                                    strM71582r3 = AbstractC24543a.m71582r(xmlPullParser, "displayAlign");
                                    if (strM71582r3 != null) {
                                        strM96499o2 = AbstractC31375j.m96499o(strM71582r3);
                                        strM96499o2.getClass();
                                        if (!strM96499o2.equals("center")) {
                                            f17 = f14 + (f16 / 2.0f);
                                            i13 = 1;
                                        } else if (strM96499o2.equals("after")) {
                                            f17 = f14;
                                            i13 = 0;
                                        } else {
                                            f17 = f14 + f16;
                                            i13 = 2;
                                        }
                                    } else {
                                        f17 = f14;
                                        i13 = 0;
                                    }
                                    float f111 = 1.0f / c11387o2.f36515x;
                                    strM71582r4 = AbstractC24543a.m71582r(xmlPullParser, "writingMode");
                                    if (strM71582r4 != null) {
                                        strM96499o = AbstractC31375j.m96499o(strM71582r4);
                                        strM96499o.getClass();
                                        switch (strM96499o) {
                                            case 3694:
                                                if (!strM96499o.equals("tb")) {
                                                }
                                                break;
                                            case 3553396:
                                                if (!strM96499o.equals("tblr")) {
                                                }
                                                break;
                                            case 3553576:
                                                if (!strM96499o.equals("tbrl")) {
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
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                                            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:216)
                                            	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
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
                                            Method dump skipped, instruction units count: 738
                                            To view this dump add '--comments-level debug' option
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: fo.C14658d.m41869m(org.xmlpull.v1.XmlPullParser, java.util.HashMap, d0.o2, c9.k, java.util.HashMap, java.util.HashMap):void");
                                    }

                                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                    /* JADX WARN: Code duplicated, block: B:6:0x003c  */
                                    /* JADX INFO: renamed from: n */
                                    public static C14659e m41870n(XmlPullParser xmlPullParser, C14659e c14659e, HashMap map, C14657c c14657c) throws SubtitleDecoderException {
                                        long j7;
                                        String[] strArrSplit;
                                        int attributeCount = xmlPullParser.getAttributeCount();
                                        String[] strArr = null;
                                        C14661g c14661gM41871o = m41871o(xmlPullParser, null);
                                        String strSubstring = null;
                                        String str = "";
                                        long jM41872p = -9223372036854775807L;
                                        long jM41872p2 = -9223372036854775807L;
                                        long jM41872p3 = -9223372036854775807L;
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
                                                    jM41872p3 = m41872p(attributeValue, c14657c);
                                                    break;
                                                case "end":
                                                    jM41872p2 = m41872p(attributeValue, c14657c);
                                                    break;
                                                case "begin":
                                                    jM41872p = m41872p(attributeValue, c14657c);
                                                    break;
                                                case "style":
                                                    String strTrim = attributeValue.trim();
                                                    if (strTrim.isEmpty()) {
                                                        strArrSplit = new String[0];
                                                    } else {
                                                        int i14 = AbstractC24567y.f95875a;
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
                                        if (c14659e != null) {
                                            long j13 = c14659e.f54108d;
                                            if (j13 != -9223372036854775807L) {
                                                if (jM41872p != -9223372036854775807L) {
                                                    jM41872p += j13;
                                                }
                                                if (jM41872p2 != -9223372036854775807L) {
                                                    jM41872p2 += j13;
                                                }
                                            }
                                        }
                                        if (jM41872p2 != -9223372036854775807L) {
                                            j7 = jM41872p2;
                                        } else {
                                            if (jM41872p3 != -9223372036854775807L) {
                                                jM41872p2 = jM41872p + jM41872p3;
                                            } else if (c14659e != null) {
                                                long j14 = c14659e.f54109e;
                                                if (j14 != -9223372036854775807L) {
                                                    j7 = j14;
                                                }
                                            }
                                            j7 = jM41872p2;
                                        }
                                        return new C14659e(xmlPullParser.getName(), null, jM41872p, j7, c14661gM41871o, strArr, str, strSubstring, c14659e);
                                    }

                                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                    /* JADX WARN: Code duplicated, block: B:116:0x019d  */
                                    /* JADX WARN: Code duplicated, block: B:144:0x0216  */
                                    /* JADX WARN: Code duplicated, block: B:146:0x022a  */
                                    /* JADX WARN: Code duplicated, block: B:152:0x0238  */
                                    /* JADX WARN: Code duplicated, block: B:155:0x0246  */
                                    /* JADX WARN: Code duplicated, block: B:160:0x0265  */
                                    /* JADX WARN: Code duplicated, block: B:162:0x0276  */
                                    /* JADX WARN: Code duplicated, block: B:165:0x027c  */
                                    /* JADX WARN: Code duplicated, block: B:168:0x0286  */
                                    /* JADX WARN: Code duplicated, block: B:172:0x029c  */
                                    /* JADX WARN: Code duplicated, block: B:174:0x02a1  */
                                    /* JADX WARN: Code duplicated, block: B:177:0x02a7  */
                                    /* JADX WARN: Code duplicated, block: B:180:0x02b1  */
                                    /* JADX WARN: Code duplicated, block: B:182:0x02b9  */
                                    /* JADX WARN: Code duplicated, block: B:183:0x02bb  */
                                    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
                                    /* JADX WARN: Code duplicated, block: B:72:0x0103  */
                                    /* JADX INFO: renamed from: o */
                                    public static C14661g m41871o(XmlPullParser xmlPullParser, C14661g c14661g) {
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
                                        C14656b c14656b;
                                        String str3;
                                        int iHashCode3;
                                        int attributeCount = xmlPullParser.getAttributeCount();
                                        C14661g c14661gM41864h = c14661g;
                                        for (int i15 = 0; i15 < attributeCount; i15++) {
                                            String attributeValue = xmlPullParser.getAttributeValue(i15);
                                            String attributeName = xmlPullParser.getAttributeName(i15);
                                            attributeName.getClass();
                                            switch (attributeName) {
                                                case "fontStyle":
                                                    b = 0;
                                                    break;
                                                case "fontFamily":
                                                    b = 1;
                                                    break;
                                                case "textAlign":
                                                    b = 2;
                                                    break;
                                                case "textDecoration":
                                                    b = 3;
                                                    break;
                                                case "fontWeight":
                                                    b = 4;
                                                    break;
                                                case "id":
                                                    b = 5;
                                                    break;
                                                case "ruby":
                                                    b = 6;
                                                    break;
                                                case "color":
                                                    b = 7;
                                                    break;
                                                case "shear":
                                                    b = 8;
                                                    break;
                                                case "textCombine":
                                                    b = 9;
                                                    break;
                                                case "fontSize":
                                                    b = 10;
                                                    break;
                                                case "textEmphasis":
                                                    b = 11;
                                                    break;
                                                case "rubyPosition":
                                                    b = 12;
                                                    break;
                                                case "backgroundColor":
                                                    b = 13;
                                                    break;
                                                case "multiRowAlign":
                                                    b = 14;
                                                    break;
                                                default:
                                                    b = -1;
                                                    break;
                                            }
                                            Layout.Alignment alignment = null;
                                            switch (b) {
                                                case 0:
                                                    c14661gM41864h = m41864h(c14661gM41864h);
                                                    c14661gM41864h.f54136i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                                                    break;
                                                case 1:
                                                    c14661gM41864h = m41864h(c14661gM41864h);
                                                    c14661gM41864h.f54128a = attributeValue;
                                                    break;
                                                case 2:
                                                    c14661gM41864h = m41864h(c14661gM41864h);
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
                                                    c14661gM41864h.f54142o = alignment;
                                                    break;
                                                case 3:
                                                    String strM96499o2 = AbstractC31375j.m96499o(attributeValue);
                                                    strM96499o2.getClass();
                                                    switch (strM96499o2) {
                                                        case "nounderline":
                                                            c14661gM41864h = m41864h(c14661gM41864h);
                                                            c14661gM41864h.f54134g = 0;
                                                            break;
                                                        case "underline":
                                                            c14661gM41864h = m41864h(c14661gM41864h);
                                                            c14661gM41864h.f54134g = 1;
                                                            break;
                                                        case "nolinethrough":
                                                            c14661gM41864h = m41864h(c14661gM41864h);
                                                            c14661gM41864h.f54133f = 0;
                                                            break;
                                                        case "linethrough":
                                                            c14661gM41864h = m41864h(c14661gM41864h);
                                                            c14661gM41864h.f54133f = 1;
                                                            break;
                                                    }
                                                    break;
                                                case 4:
                                                    c14661gM41864h = m41864h(c14661gM41864h);
                                                    c14661gM41864h.f54135h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                                                    break;
                                                case 5:
                                                    if ("style".equals(xmlPullParser.getName())) {
                                                        c14661gM41864h = m41864h(c14661gM41864h);
                                                        c14661gM41864h.f54139l = attributeValue;
                                                    }
                                                    break;
                                                case 6:
                                                    String strM96499o3 = AbstractC31375j.m96499o(attributeValue);
                                                    strM96499o3.getClass();
                                                    switch (strM96499o3) {
                                                        case "baseContainer":
                                                        case "base":
                                                            c14661gM41864h = m41864h(c14661gM41864h);
                                                            c14661gM41864h.f54140m = 2;
                                                            break;
                                                        case "container":
                                                            c14661gM41864h = m41864h(c14661gM41864h);
                                                            c14661gM41864h.f54140m = 1;
                                                            break;
                                                        case "delimiter":
                                                            c14661gM41864h = m41864h(c14661gM41864h);
                                                            c14661gM41864h.f54140m = 4;
                                                            break;
                                                        case "textContainer":
                                                        case "text":
                                                            c14661gM41864h = m41864h(c14661gM41864h);
                                                            c14661gM41864h.f54140m = 3;
                                                            break;
                                                    }
                                                    break;
                                                case 7:
                                                    c14661gM41864h = m41864h(c14661gM41864h);
                                                    try {
                                                        c14661gM41864h.f54129b = AbstractC24544b.m71591a(attributeValue, false);
                                                        c14661gM41864h.f54130c = true;
                                                    } catch (IllegalArgumentException unused) {
                                                        String strValueOf = String.valueOf(attributeValue);
                                                        Log.w("TtmlDecoder", strValueOf.length() != 0 ? "Failed parsing color value: ".concat(strValueOf) : new String("Failed parsing color value: "));
                                                    }
                                                    break;
                                                case 8:
                                                    C14661g c14661gM41864h2 = m41864h(c14661gM41864h);
                                                    Matcher matcher = f54098q.matcher(attributeValue);
                                                    float fMin = Float.MAX_VALUE;
                                                    if (matcher.matches()) {
                                                        try {
                                                            String strGroup = matcher.group(1);
                                                            strGroup.getClass();
                                                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                                                        } catch (NumberFormatException e5) {
                                                            String strValueOf2 = String.valueOf(attributeValue);
                                                            AbstractC24543a.m71564F("TtmlDecoder", strValueOf2.length() != 0 ? "Failed to parse shear: ".concat(strValueOf2) : new String("Failed to parse shear: "), e5);
                                                        }
                                                    } else {
                                                        String strValueOf3 = String.valueOf(attributeValue);
                                                        Log.w("TtmlDecoder", strValueOf3.length() != 0 ? "Invalid value for shear: ".concat(strValueOf3) : new String("Invalid value for shear: "));
                                                    }
                                                    c14661gM41864h2.f54146s = fMin;
                                                    c14661gM41864h = c14661gM41864h2;
                                                    break;
                                                case 9:
                                                    String strM96499o4 = AbstractC31375j.m96499o(attributeValue);
                                                    strM96499o4.getClass();
                                                    if (strM96499o4.equals("all")) {
                                                        c14661gM41864h = m41864h(c14661gM41864h);
                                                        c14661gM41864h.f54144q = 1;
                                                    } else if (strM96499o4.equals("none")) {
                                                        c14661gM41864h = m41864h(c14661gM41864h);
                                                        c14661gM41864h.f54144q = 0;
                                                    }
                                                    break;
                                                case 10:
                                                    try {
                                                        c14661gM41864h = m41864h(c14661gM41864h);
                                                        m41867k(attributeValue, c14661gM41864h);
                                                    } catch (SubtitleDecoderException unused2) {
                                                        String strValueOf4 = String.valueOf(attributeValue);
                                                        Log.w("TtmlDecoder", strValueOf4.length() != 0 ? "Failed parsing fontSize value: ".concat(strValueOf4) : new String("Failed parsing fontSize value: "));
                                                    }
                                                    break;
                                                case 11:
                                                    c14661gM41864h = m41864h(c14661gM41864h);
                                                    Pattern pattern = C14656b.f54084d;
                                                    if (attributeValue == null) {
                                                        c14656b = null;
                                                    } else {
                                                        String strM96499o5 = AbstractC31375j.m96499o(attributeValue.trim());
                                                        if (strM96499o5.isEmpty()) {
                                                            c14656b = null;
                                                        } else {
                                                            String[] strArrSplit = TextUtils.split(strM96499o5, C14656b.f54084d);
                                                            int length = strArrSplit.length;
                                                            AbstractC41032j0 abstractC41032j0M133263l = length != 0 ? length != 1 ? AbstractC41032j0.m133263l(strArrSplit.length, (Object[]) strArrSplit.clone()) : new C41030i1(strArrSplit[0]) : C41012c1.f176973J;
                                                            String str4 = (String) AbstractC41047q.m133278h("outside", AbstractC41047q.m133281k(C14656b.f54088h, abstractC41032j0M133263l));
                                                            int iHashCode4 = str4.hashCode();
                                                            if (iHashCode4 != -1392885889) {
                                                                if (iHashCode4 != -1106037339) {
                                                                    if (iHashCode4 == 92734940 && str4.equals("after")) {
                                                                        i13 = 2;
                                                                    }
                                                                } else if (str4.equals("outside")) {
                                                                    i13 = -2;
                                                                }
                                                                c41018e1M133281k = AbstractC41047q.m133281k(C14656b.f54085e, abstractC41032j0M133263l);
                                                                if (c41018e1M133281k.isEmpty()) {
                                                                    c41018e1M133281k2 = AbstractC41047q.m133281k(C14656b.f54087g, abstractC41032j0M133263l);
                                                                    c41018e1M133281k3 = AbstractC41047q.m133281k(C14656b.f54086f, abstractC41032j0M133263l);
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
                                                                                c14656b = new C14656b(i14, i16, i13);
                                                                            } else {
                                                                                str2.equals("circle");
                                                                            }
                                                                            i14 = 1;
                                                                            c14656b = new C14656b(i14, i16, i13);
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
                                                                            c14656b = new C14656b(i14, i16, i13);
                                                                        } else {
                                                                            str2.equals("circle");
                                                                        }
                                                                        i14 = 1;
                                                                        c14656b = new C14656b(i14, i16, i13);
                                                                    } else {
                                                                        c14656b = new C14656b(-1, 0, i13);
                                                                    }
                                                                } else {
                                                                    str3 = (String) new C41035k0(c41018e1M133281k).next();
                                                                    iHashCode3 = str3.hashCode();
                                                                    if (iHashCode3 != 3005871) {
                                                                        int i17 = (iHashCode3 != 3387192 && str3.equals("none")) ? 0 : -1;
                                                                        c14656b = new C14656b(i17, 0, i13);
                                                                    } else {
                                                                        str3.equals(UserState.Sources.AUTO);
                                                                    }
                                                                    c14656b = new C14656b(i17, 0, i13);
                                                                }
                                                            } else {
                                                                str4.equals("before");
                                                            }
                                                            i13 = 1;
                                                            c41018e1M133281k = AbstractC41047q.m133281k(C14656b.f54085e, abstractC41032j0M133263l);
                                                            if (c41018e1M133281k.isEmpty()) {
                                                                str3 = (String) new C41035k0(c41018e1M133281k).next();
                                                                iHashCode3 = str3.hashCode();
                                                                if (iHashCode3 != 3005871) {
                                                                    if (iHashCode3 != 3387192) {
                                                                    }
                                                                    c14656b = new C14656b(i17, 0, i13);
                                                                } else {
                                                                    str3.equals(UserState.Sources.AUTO);
                                                                }
                                                                c14656b = new C14656b(i17, 0, i13);
                                                            } else {
                                                                c41018e1M133281k2 = AbstractC41047q.m133281k(C14656b.f54087g, abstractC41032j0M133263l);
                                                                c41018e1M133281k3 = AbstractC41047q.m133281k(C14656b.f54086f, abstractC41032j0M133263l);
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
                                                                            c14656b = new C14656b(i14, i16, i13);
                                                                        } else {
                                                                            str2.equals("circle");
                                                                        }
                                                                        i14 = 1;
                                                                        c14656b = new C14656b(i14, i16, i13);
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
                                                                        c14656b = new C14656b(i14, i16, i13);
                                                                    } else {
                                                                        str2.equals("circle");
                                                                    }
                                                                    i14 = 1;
                                                                    c14656b = new C14656b(i14, i16, i13);
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
                                                                            c14656b = new C14656b(i14, i16, i13);
                                                                        } else {
                                                                            str2.equals("circle");
                                                                        }
                                                                        i14 = 1;
                                                                        c14656b = new C14656b(i14, i16, i13);
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
                                                                        c14656b = new C14656b(i14, i16, i13);
                                                                    } else {
                                                                        str2.equals("circle");
                                                                    }
                                                                    i14 = 1;
                                                                    c14656b = new C14656b(i14, i16, i13);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    c14661gM41864h.f54145r = c14656b;
                                                    break;
                                                case 12:
                                                    String strM96499o6 = AbstractC31375j.m96499o(attributeValue);
                                                    strM96499o6.getClass();
                                                    if (strM96499o6.equals("before")) {
                                                        c14661gM41864h = m41864h(c14661gM41864h);
                                                        c14661gM41864h.f54141n = 1;
                                                    } else if (strM96499o6.equals("after")) {
                                                        c14661gM41864h = m41864h(c14661gM41864h);
                                                        c14661gM41864h.f54141n = 2;
                                                    }
                                                    break;
                                                case 13:
                                                    c14661gM41864h = m41864h(c14661gM41864h);
                                                    try {
                                                        c14661gM41864h.f54131d = AbstractC24544b.m71591a(attributeValue, false);
                                                        c14661gM41864h.f54132e = true;
                                                    } catch (IllegalArgumentException unused3) {
                                                        String strValueOf5 = String.valueOf(attributeValue);
                                                        Log.w("TtmlDecoder", strValueOf5.length() != 0 ? "Failed parsing background value: ".concat(strValueOf5) : new String("Failed parsing background value: "));
                                                    }
                                                    break;
                                                case 14:
                                                    c14661gM41864h = m41864h(c14661gM41864h);
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
                                                    c14661gM41864h.f54143p = alignment;
                                                    break;
                                            }
                                        }
                                        return c14661gM41864h;
                                    }

                                    /* JADX INFO: renamed from: p */
                                    public static long m41872p(String str, C14657c c14657c) throws SubtitleDecoderException {
                                        double d3;
                                        double d14;
                                        Matcher matcher = f54095n.matcher(str);
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
                                        Matcher matcher2 = f54096o.matcher(str);
                                        if (!matcher2.matches()) {
                                            String strValueOf = String.valueOf(str);
                                            throw new SubtitleDecoderException(strValueOf.length() != 0 ? "Malformed time expression: ".concat(strValueOf) : new String("Malformed time expression: "));
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

                                    /* JADX INFO: renamed from: q */
                                    public static C4320k m41873q(XmlPullParser xmlPullParser) {
                                        String strM71582r = AbstractC24543a.m71582r(xmlPullParser, "extent");
                                        if (strM71582r == null) {
                                            return null;
                                        }
                                        Matcher matcher = f54100s.matcher(strM71582r);
                                        if (!matcher.matches()) {
                                            Log.w("TtmlDecoder", strM71582r.length() != 0 ? "Ignoring non-pixel tts extent: ".concat(strM71582r) : new String("Ignoring non-pixel tts extent: "));
                                            return null;
                                        }
                                        try {
                                            String strGroup = matcher.group(1);
                                            strGroup.getClass();
                                            int i13 = Integer.parseInt(strGroup);
                                            String strGroup2 = matcher.group(2);
                                            strGroup2.getClass();
                                            return new C4320k(i13, Integer.parseInt(strGroup2), 4);
                                        } catch (NumberFormatException unused) {
                                            Log.w("TtmlDecoder", strM71582r.length() != 0 ? "Ignoring malformed tts extent: ".concat(strM71582r) : new String("Ignoring malformed tts extent: "));
                                            return null;
                                        }
                                    }

                                    @Override // p621xn.AbstractC38467d
                                    /* JADX INFO: renamed from: f */
                                    public final InterfaceC38468e mo5527f(int i13, boolean z4, byte[] bArr) throws SubtitleDecoderException {
                                        try {
                                            XmlPullParser xmlPullParserNewPullParser = this.f54104m.newPullParser();
                                            HashMap map = new HashMap();
                                            HashMap map2 = new HashMap();
                                            HashMap map3 = new HashMap();
                                            map2.put("", new C14660f("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
                                            C4320k c4320kM41873q = null;
                                            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i13), null);
                                            ArrayDeque arrayDeque = new ArrayDeque();
                                            C14657c c14657c = f54102u;
                                            C11387o2 c11387o2 = f54103v;
                                            int i14 = 0;
                                            C14657c c14657cM41868l = c14657c;
                                            C2570m c2570m = null;
                                            C11387o2 c11387o2M41866j = c11387o2;
                                            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                                                C14659e c14659e = (C14659e) arrayDeque.peek();
                                                if (i14 == 0) {
                                                    String name = xmlPullParserNewPullParser.getName();
                                                    if (eventType == 2) {
                                                        if ("tt".equals(name)) {
                                                            c14657cM41868l = m41868l(xmlPullParserNewPullParser);
                                                            c11387o2M41866j = m41866j(xmlPullParserNewPullParser, c11387o2);
                                                            c4320kM41873q = m41873q(xmlPullParserNewPullParser);
                                                        }
                                                        C14657c c14657c2 = c14657cM41868l;
                                                        C11387o2 c11387o3 = c11387o2M41866j;
                                                        if (m41865i(name)) {
                                                            if ("head".equals(name)) {
                                                                m41869m(xmlPullParserNewPullParser, map, c11387o3, c4320kM41873q, map2, map3);
                                                            } else {
                                                                try {
                                                                    C14659e c14659eM41870n = m41870n(xmlPullParserNewPullParser, c14659e, map2, c14657c2);
                                                                    arrayDeque.push(c14659eM41870n);
                                                                    if (c14659e != null) {
                                                                        if (c14659e.f54117m == null) {
                                                                            c14659e.f54117m = new ArrayList();
                                                                        }
                                                                        c14659e.f54117m.add(c14659eM41870n);
                                                                    }
                                                                } catch (SubtitleDecoderException e5) {
                                                                    AbstractC24543a.m71564F("TtmlDecoder", "Suppressing parser error", e5);
                                                                    i14++;
                                                                }
                                                            }
                                                            c11387o2M41866j = c11387o3;
                                                            c14657cM41868l = c14657c2;
                                                        } else {
                                                            String strValueOf = String.valueOf(xmlPullParserNewPullParser.getName());
                                                            Log.i("TtmlDecoder", strValueOf.length() != 0 ? "Ignoring unsupported tag: ".concat(strValueOf) : new String("Ignoring unsupported tag: "));
                                                        }
                                                        i14++;
                                                        c11387o2M41866j = c11387o3;
                                                        c14657cM41868l = c14657c2;
                                                    } else if (eventType == 4) {
                                                        c14659e.getClass();
                                                        C14659e c14659eM41874a = C14659e.m41874a(xmlPullParserNewPullParser.getText());
                                                        if (c14659e.f54117m == null) {
                                                            c14659e.f54117m = new ArrayList();
                                                        }
                                                        c14659e.f54117m.add(c14659eM41874a);
                                                    } else if (eventType == 3) {
                                                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                                                            C14659e c14659e2 = (C14659e) arrayDeque.peek();
                                                            c14659e2.getClass();
                                                            c2570m = new C2570m(c14659e2, map, map2, map3);
                                                        }
                                                        arrayDeque.pop();
                                                    }
                                                } else if (eventType == 2) {
                                                    i14++;
                                                } else if (eventType == 3) {
                                                    i14--;
                                                }
                                                xmlPullParserNewPullParser.next();
                                            }
                                            if (c2570m != null) {
                                                return c2570m;
                                            }
                                            throw new SubtitleDecoderException("No TTML subtitles found");
                                        } catch (IOException e13) {
                                            throw new IllegalStateException("Unexpected error when reading input.", e13);
                                        } catch (XmlPullParserException e14) {
                                            throw new SubtitleDecoderException("Unable to decode source", e14);
                                        }
                                    }
                                }
