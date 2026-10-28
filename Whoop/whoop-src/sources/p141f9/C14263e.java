package p141f9;

import a33.C0352d;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.media3.common.ParserException;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.chat.android.p226ui.common.model.MimeType;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import na.AbstractC26501n;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p012ab.C0682h0;
import p094dn.C12194n;
import p284ko.C22629m;
import p398p9.InterfaceC28989m;
import p460rg.AbstractC31375j;
import p516u8.AbstractC34590f;
import p516u8.C34600k;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p690zr.AbstractC41047q;

/* JADX INFO: renamed from: f9.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C14263e extends DefaultHandler implements InterfaceC28989m {

    /* JADX INFO: renamed from: w */
    public final XmlPullParserFactory f52086w;

    /* JADX INFO: renamed from: x */
    public static final Pattern f52083x = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* JADX INFO: renamed from: y */
    public static final Pattern f52084y = Pattern.compile("CC([1-4])=.*");

    /* JADX INFO: renamed from: z */
    public static final Pattern f52085z = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* JADX INFO: renamed from: E */
    public static final int[] f52081E = {2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2};

    /* JADX INFO: renamed from: F */
    public static final int[] f52082F = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    public C14263e() {
        try {
            this.f52086w = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e5) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e5);
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m40731a(ArrayList arrayList, long j7, long j13, int i13, long j14) {
        int i14;
        if (i13 >= 0) {
            i14 = i13 + 1;
        } else {
            int i15 = AbstractC38065t.f163031a;
            i14 = (int) ((((j14 - j7) + j13) - 1) / j13);
        }
        for (int i16 = 0; i16 < i14; i16++) {
            arrayList.add(new C14275q(j7, j13));
            j7 += j13;
        }
        return j7;
    }

    /* JADX INFO: renamed from: b */
    public static void m40732b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() == 2) {
            int i13 = 1;
            while (i13 != 0) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i13++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i13--;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0093 A[PHI: r13
      0x0093: PHI (r13v30 int) = (r13v5 int), (r13v8 int), (r13v33 int) binds: [B:128:0x01a3, B:120:0x0190, B:47:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x00b3  */
    /* JADX INFO: renamed from: d */
    public static int m40733d(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        int iBitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = null;
        }
        attributeValue.getClass();
        int i13 = 5;
        byte b = 4;
        int i14 = 0;
        int i15 = -1;
        switch (attributeValue) {
            case "urn:dts:dash:audio_channel_configuration:2012":
            case "tag:dts.com,2014:dash:audio_channel_configuration:2012":
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
                iBitCount = attributeValue2 == null ? -1 : Integer.parseInt(attributeValue2);
                if (iBitCount > 0 && iBitCount < 33) {
                    i15 = iBitCount;
                    break;
                }
                break;
            case "tag:dolby.com,2015:dash:audio_channel_configuration:2015":
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue3 != null && attributeValue3.length() == 6) {
                    int i16 = Integer.parseInt(attributeValue3, 16);
                    if ((8388608 & i16) == 0) {
                        iBitCount = 0;
                        while (true) {
                            int[] iArr = f52081E;
                            if (i14 < iArr.length) {
                                iBitCount += ((i16 >> i14) & 1) * iArr[i14];
                                i14++;
                            } else if (iBitCount != 0) {
                                i15 = iBitCount;
                            }
                        }
                    } else {
                        String[] strArrM121906T = AbstractC38065t.m121906T(str);
                        if (strArrM121906T.length != 0) {
                            List listM1707w = C0682h0.m1685s('.').m1707w(AbstractC31375j.m96499o(strArrM121906T[0].trim()));
                            if (listM1707w.size() == 4 && ((String) listM1707w.get(0)).equals("ac-4")) {
                                String str2 = (String) listM1707w.get(3);
                                str2.getClass();
                                if (str2.equals("03")) {
                                    i15 = 18;
                                } else if (str2.equals("04")) {
                                    i15 = 21;
                                }
                            }
                        }
                    }
                    break;
                }
                break;
            case "urn:mpeg:dash:23003:3:audio_channel_configuration:2011":
                String attributeValue4 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue4 != null) {
                    i15 = Integer.parseInt(attributeValue4);
                    break;
                }
                break;
            case "tag:dolby.com,2014:dash:audio_channel_configuration:2011":
            case "urn:dolby:dash:audio_channel_configuration:2011":
                String attributeValue5 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue5 != null) {
                    String strM96499o = AbstractC31375j.m96499o(attributeValue5);
                    strM96499o.getClass();
                    switch (strM96499o.hashCode()) {
                        case 1596796:
                            b = !strM96499o.equals("4000") ? (byte) -1 : (byte) 0;
                            break;
                        case 2937391:
                            b = !strM96499o.equals("a000") ? (byte) -1 : (byte) 1;
                            break;
                        case 3094034:
                            b = !strM96499o.equals("f800") ? (byte) -1 : (byte) 2;
                            break;
                        case 3094035:
                            b = !strM96499o.equals("f801") ? (byte) -1 : (byte) 3;
                            break;
                        case 3133436:
                            if (!strM96499o.equals("fa01")) {
                                b = -1;
                            }
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        case 0:
                            i13 = 1;
                            break;
                        case 1:
                            i13 = 2;
                            break;
                        case 2:
                            break;
                        case 3:
                            i13 = 6;
                            break;
                        case 4:
                            i13 = 8;
                            break;
                        default:
                            i13 = -1;
                            break;
                    }
                } else {
                    i13 = -1;
                }
                i15 = i13;
                break;
            case "urn:mpeg:mpegB:cicp:ChannelConfiguration":
                String attributeValue6 = xmlPullParser.getAttributeValue(null, "value");
                int i17 = attributeValue6 == null ? -1 : Integer.parseInt(attributeValue6);
                if (i17 >= 0) {
                    int[] iArr2 = f52082F;
                    if (i17 < iArr2.length) {
                        i15 = iArr2[i17];
                    }
                    break;
                }
                break;
            case "tag:dts.com,2018:uhd:audio_channel_configuration":
                String attributeValue7 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue7 != null && (iBitCount = Integer.bitCount(Integer.parseInt(attributeValue7, 16))) != 0) {
                    i15 = iBitCount;
                    break;
                }
                break;
        }
        do {
            xmlPullParser.next();
        } while (!AbstractC38046a.m121819n(xmlPullParser, "AudioChannelConfiguration"));
        return i15;
    }

    /* JADX INFO: renamed from: e */
    public static long m40734e(XmlPullParser xmlPullParser, long j7) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j7;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    /* JADX INFO: renamed from: f */
    public static ArrayList m40735f(XmlPullParser xmlPullParser, ArrayList arrayList, boolean z4) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i13 = attributeValue != null ? Integer.parseInt(attributeValue) : z4 ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i14 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                m40732b(xmlPullParser);
            }
        } while (!AbstractC38046a.m121819n(xmlPullParser, "BaseURL"));
        if (text != null && AbstractC38046a.m121817l(text)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = text;
            }
            return AbstractC41047q.m133283m(new C14260b(text, attributeValue3, i13, i14));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            C14260b c14260b = (C14260b) arrayList.get(i15);
            String strM121823r = AbstractC38046a.m121823r(c14260b.f52058a, text);
            String str = attributeValue3 == null ? strM121823r : attributeValue3;
            if (z4) {
                i13 = c14260b.f52060c;
                i14 = c14260b.f52061d;
                str = c14260b.f52059b;
            }
            arrayList2.add(new C14260b(strM121823r, str, i13, i14));
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:81:0x013b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x013d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0160  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX INFO: renamed from: g */
    public static Pair m40736g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue;
        UUID uuid;
        UUID uuid2;
        ?? text;
        ?? M78553a;
        UUID uuid3;
        String attributeValue2;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue3 != null) {
            String strM96499o = AbstractC31375j.m96499o(attributeValue3);
            strM96499o.getClass();
            switch (strM96499o) {
                case "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e":
                    uuid = AbstractC34590f.f145653c;
                    attributeValue = null;
                    uuid2 = null;
                    text = uuid2;
                    M78553a = uuid2;
                    break;
                case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95":
                    uuid = AbstractC34590f.f145655e;
                    attributeValue = null;
                    uuid2 = null;
                    text = uuid2;
                    M78553a = uuid2;
                    break;
                case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed":
                    uuid = AbstractC34590f.f145654d;
                    attributeValue = null;
                    uuid2 = null;
                    text = uuid2;
                    M78553a = uuid2;
                    break;
                case "urn:mpeg:dash:mp4protection:2011":
                    attributeValue = xmlPullParser.getAttributeValue(null, "value");
                    int attributeCount = xmlPullParser.getAttributeCount();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= attributeCount) {
                            attributeValue2 = null;
                        } else {
                            String attributeName = xmlPullParser.getAttributeName(i13);
                            int iIndexOf = attributeName.indexOf(58);
                            if (iIndexOf != -1) {
                                attributeName = attributeName.substring(iIndexOf + 1);
                            }
                            if (attributeName.equals("default_KID")) {
                                attributeValue2 = xmlPullParser.getAttributeValue(i13);
                            } else {
                                i13++;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(attributeValue2) && !"00000000-0000-0000-0000-000000000000".equals(attributeValue2)) {
                        String[] strArrSplit = attributeValue2.split("\\s+");
                        UUID[] uuidArr = new UUID[strArrSplit.length];
                        for (int i14 = 0; i14 < strArrSplit.length; i14++) {
                            uuidArr[i14] = UUID.fromString(strArrSplit[i14]);
                        }
                        uuid = AbstractC34590f.f145652b;
                        text = 0;
                        M78553a = AbstractC26501n.m78553a(uuid, uuidArr, null);
                        break;
                    } else {
                        AbstractC38046a.m121826u("MpdParser", "Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute.");
                        uuid = null;
                        uuid2 = uuid;
                        text = uuid2;
                        M78553a = uuid2;
                        break;
                    }
                    break;
                default:
                    attributeValue = null;
                    uuid = null;
                    uuid2 = uuid;
                    text = uuid2;
                    M78553a = uuid2;
                    break;
            }
        } else {
            attributeValue = null;
            uuid = null;
            uuid2 = uuid;
            text = uuid2;
            M78553a = uuid2;
        }
        do {
            xmlPullParser.next();
            if ((AbstractC38046a.m121820o(xmlPullParser, "clearkey:Laurl") || AbstractC38046a.m121820o(xmlPullParser, "dashif:Laurl")) && xmlPullParser.next() == 4) {
                M78553a = M78553a;
                text = xmlPullParser.getText();
            } else if (AbstractC38046a.m121820o(xmlPullParser, "ms:laurl")) {
                M78553a = M78553a;
                text = xmlPullParser.getAttributeValue(null, "licenseUrl");
            } else if (M78553a == 0 && xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                int iIndexOf2 = name.indexOf(58);
                if (iIndexOf2 != -1) {
                    name = name.substring(iIndexOf2 + 1);
                }
                if (name.equals("pssh") && xmlPullParser.next() == 4) {
                    byte[] bArrDecode = Base64.decode(xmlPullParser.getText(), 0);
                    C12194n c12194nM78562j = AbstractC26501n.m78562j(bArrDecode);
                    UUID uuid4 = c12194nM78562j == null ? null : c12194nM78562j.f40710a;
                    if (uuid4 == null) {
                        AbstractC38046a.m121826u("MpdParser", "Skipping malformed cenc:pssh data");
                        uuid = uuid4;
                        M78553a = 0;
                        text = text;
                    } else {
                        UUID uuid5 = uuid4;
                        M78553a = bArrDecode;
                        uuid = uuid5;
                        text = text;
                    }
                } else if (M78553a == 0) {
                    uuid3 = AbstractC34590f.f145655e;
                    if (!uuid3.equals(uuid)) {
                        m40732b(xmlPullParser);
                        M78553a = M78553a;
                        text = text;
                    } else {
                        m40732b(xmlPullParser);
                        M78553a = M78553a;
                        text = text;
                    }
                } else {
                    m40732b(xmlPullParser);
                    M78553a = M78553a;
                    text = text;
                }
            } else if (M78553a == 0) {
                uuid3 = AbstractC34590f.f145655e;
                if (!uuid3.equals(uuid) && AbstractC38046a.m121820o(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                    M78553a = AbstractC26501n.m78553a(uuid3, null, Base64.decode(xmlPullParser.getText(), 0));
                    text = text;
                } else {
                    m40732b(xmlPullParser);
                    M78553a = M78553a;
                    text = text;
                }
            } else {
                m40732b(xmlPullParser);
                M78553a = M78553a;
                text = text;
            }
        } while (!AbstractC38046a.m121819n(xmlPullParser, "ContentProtection"));
        return Pair.create(attributeValue, uuid != null ? new C34600k(uuid, text, MimeType.MIME_TYPE_VIDEO_MP4, M78553a) : null);
    }

    /* JADX INFO: renamed from: h */
    public static int m40737h(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    /* JADX INFO: renamed from: i */
    public static C14264f m40738i(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!AbstractC38046a.m121819n(xmlPullParser, str));
        return new C14264f(attributeValue, attributeValue2, str2);
    }

    /* JADX INFO: renamed from: j */
    public static long m40739j(XmlPullParser xmlPullParser, String str, long j7) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j7;
        }
        Matcher matcher = AbstractC38065t.f163036f.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d3 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d14 = d3 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d15 = d14 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d16 = d15 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d17 = d16 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j13 = (long) ((d17 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return !zIsEmpty ? -j13 : j13;
    }

    /* JADX INFO: renamed from: k */
    public static float m40740k(XmlPullParser xmlPullParser, float f13) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = f52083x.matcher(attributeValue);
            if (matcher.matches()) {
                int i13 = Integer.parseInt(matcher.group(1));
                String strGroup = matcher.group(2);
                return !TextUtils.isEmpty(strGroup) ? i13 / Integer.parseInt(strGroup) : i13;
            }
        }
        return f13;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because the return value of "jadx.core.dex.instructions.PhiInsn.getResult()" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:117)
        	at jadx.core.dex.visitors.InitCodeVariables.lambda$collectConnectedVars$1(InitCodeVariables.java:124)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:121)
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        */
    /* JADX INFO: renamed from: l */
    public static p141f9.C14261c m40741l(org.xmlpull.v1.XmlPullParser r164, android.net.Uri r165) {
        /*
            Method dump skipped, instruction units count: 5160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p141f9.C14263e.m40741l(org.xmlpull.v1.XmlPullParser, android.net.Uri):f9.c");
    }

    /* JADX INFO: renamed from: m */
    public static C14268j m40742m(XmlPullParser xmlPullParser, String str, String str2) {
        long j7;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        long j13 = -1;
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j7 = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j13 = (Long.parseLong(strArrSplit[1]) - j7) + 1;
            }
        } else {
            j7 = 0;
        }
        return new C14268j(attributeValue, j7, j13);
    }

    /* JADX INFO: renamed from: n */
    public static int m40743n(String str) {
        if (str != null) {
            switch (str) {
                case "subtitle":
                case "forced_subtitle":
                case "forced-subtitle":
                    return 128;
                case "description":
                    return 512;
                case "enhanced-audio-intelligibility":
                    return DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                case "alternate":
                    return 2;
                case "dub":
                    return 16;
                case "main":
                    return 1;
                case "sign":
                    return 256;
                case "caption":
                    return 64;
                case "commentary":
                    return 8;
                case "emergency":
                    return 32;
                case "supplementary":
                    return 4;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public static int m40744o(ArrayList arrayList) {
        int i13 = 0;
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            if (AbstractC31375j.m96492h("http://dashif.org/guidelines/trickmode", ((C14264f) arrayList.get(i14)).f52087a)) {
                i13 = DfuBaseService.ERROR_CONNECTION_MASK;
            }
        }
        return i13;
    }

    /* JADX INFO: renamed from: p */
    public static C14276r m40745p(XmlPullParser xmlPullParser, C14276r c14276r) throws XmlPullParserException, IOException {
        long j7 = c14276r != null ? c14276r.f52130b : 1L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j7 = Long.parseLong(attributeValue);
        }
        long j13 = j7;
        long j14 = c14276r != null ? c14276r.f52131c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j14 = Long.parseLong(attributeValue2);
        }
        long j15 = j14;
        long j16 = c14276r != null ? c14276r.f52127d : 0L;
        long j17 = c14276r != null ? c14276r.f52128e : 0L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] strArrSplit = attributeValue3.split("-");
            j16 = Long.parseLong(strArrSplit[0]);
            j17 = (Long.parseLong(strArrSplit[1]) - j16) + 1;
        }
        long j18 = j17;
        long j19 = j16;
        C14268j c14268jM40742m = c14276r != null ? c14276r.f52129a : null;
        while (true) {
            xmlPullParser.next();
            if (AbstractC38046a.m121820o(xmlPullParser, "Initialization")) {
                c14268jM40742m = m40742m(xmlPullParser, "sourceURL", "range");
            } else {
                m40732b(xmlPullParser);
            }
            C14268j c14268j = c14268jM40742m;
            if (AbstractC38046a.m121819n(xmlPullParser, "SegmentBase")) {
                return new C14276r(c14268j, j13, j15, j19, j18);
            }
            c14268jM40742m = c14268j;
        }
    }

    /* JADX INFO: renamed from: q */
    public static C14273o m40746q(XmlPullParser xmlPullParser, C14273o c14273o, long j7, long j13, long j14, long j15, long j16) throws XmlPullParserException, IOException {
        long j17 = c14273o != null ? c14273o.f52130b : 1L;
        List arrayList = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j17 = Long.parseLong(attributeValue);
        }
        long j18 = j17;
        long j19 = c14273o != null ? c14273o.f52131c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j19 = Long.parseLong(attributeValue2);
        }
        long j24 = j19;
        long j25 = c14273o != null ? c14273o.f52116e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, AttachmentExtensionsKt.EXTRA_DURATION);
        if (attributeValue3 != null) {
            j25 = Long.parseLong(attributeValue3);
        }
        long j26 = j25;
        long j27 = c14273o != null ? c14273o.f52115d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j27 = Long.parseLong(attributeValue4);
        }
        long j28 = j27;
        long j29 = j15 == -9223372036854775807L ? j14 : j15;
        long j34 = j29 == Long.MAX_VALUE ? -9223372036854775807L : j29;
        C14268j c14268jM40742m = null;
        List listM40748s = null;
        do {
            xmlPullParser.next();
            if (AbstractC38046a.m121820o(xmlPullParser, "Initialization")) {
                c14268jM40742m = m40742m(xmlPullParser, "sourceURL", "range");
            } else if (AbstractC38046a.m121820o(xmlPullParser, "SegmentTimeline")) {
                listM40748s = m40748s(xmlPullParser, j18, j13);
            } else if (AbstractC38046a.m121820o(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(m40742m(xmlPullParser, "media", "mediaRange"));
            } else {
                m40732b(xmlPullParser);
            }
        } while (!AbstractC38046a.m121819n(xmlPullParser, "SegmentList"));
        if (c14273o != null) {
            if (c14268jM40742m == null) {
                c14268jM40742m = c14273o.f52129a;
            }
            if (listM40748s == null) {
                listM40748s = c14273o.f52117f;
            }
            if (arrayList == null) {
                arrayList = c14273o.f52121j;
            }
        }
        return new C14273o(c14268jM40742m, j18, j24, j28, j26, listM40748s, j34, arrayList, AbstractC38065t.m121896J(j16), AbstractC38065t.m121896J(j7));
    }

    /* JADX INFO: renamed from: r */
    public static C14274p m40747r(XmlPullParser xmlPullParser, C14274p c14274p, List list, long j7, long j13, long j14, long j15, long j16) throws XmlPullParserException, IOException {
        long j17;
        long j18 = c14274p != null ? c14274p.f52130b : 1L;
        C14268j c14268jM40742m = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j18 = Long.parseLong(attributeValue);
        }
        long j19 = j18;
        long j24 = c14274p != null ? c14274p.f52131c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j24 = Long.parseLong(attributeValue2);
        }
        long j25 = j24;
        long j26 = c14274p != null ? c14274p.f52116e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, AttachmentExtensionsKt.EXTRA_DURATION);
        if (attributeValue3 != null) {
            j26 = Long.parseLong(attributeValue3);
        }
        long j27 = j26;
        long j28 = c14274p != null ? c14274p.f52115d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j28 = Long.parseLong(attributeValue4);
        }
        long j29 = j28;
        int i13 = 0;
        while (true) {
            if (i13 >= list.size()) {
                j17 = -1;
                break;
            }
            C14264f c14264f = (C14264f) list.get(i13);
            if (AbstractC31375j.m96492h("http://dashif.org/guidelines/last-segment-number", c14264f.f52087a)) {
                j17 = Long.parseLong(c14264f.f52088b);
                break;
            }
            i13++;
        }
        long j34 = j17;
        long j35 = j15 == -9223372036854775807L ? j14 : j15;
        long j36 = j35 == Long.MAX_VALUE ? -9223372036854775807L : j35;
        C0352d c0352dM40749t = m40749t(xmlPullParser, "media", c14274p != null ? c14274p.f52123k : null);
        C0352d c0352dM40749t2 = m40749t(xmlPullParser, "initialization", c14274p != null ? c14274p.f52122j : null);
        List listM40748s = null;
        do {
            xmlPullParser.next();
            if (AbstractC38046a.m121820o(xmlPullParser, "Initialization")) {
                c14268jM40742m = m40742m(xmlPullParser, "sourceURL", "range");
            } else if (AbstractC38046a.m121820o(xmlPullParser, "SegmentTimeline")) {
                listM40748s = m40748s(xmlPullParser, j19, j13);
            } else {
                m40732b(xmlPullParser);
            }
        } while (!AbstractC38046a.m121819n(xmlPullParser, "SegmentTemplate"));
        if (c14274p != null) {
            if (c14268jM40742m == null) {
                c14268jM40742m = c14274p.f52129a;
            }
            if (listM40748s == null) {
                listM40748s = c14274p.f52117f;
            }
        }
        return new C14274p(c14268jM40742m, j19, j25, j29, j34, j27, listM40748s, j36, c0352dM40749t2, c0352dM40749t, AbstractC38065t.m121896J(j16), AbstractC38065t.m121896J(j7));
    }

    /* JADX INFO: renamed from: s */
    public static ArrayList m40748s(XmlPullParser xmlPullParser, long j7, long j13) throws XmlPullParserException, IOException {
        long j14;
        ArrayList arrayList = new ArrayList();
        long jM40731a = 0;
        long j15 = -9223372036854775807L;
        boolean z4 = false;
        int i13 = 0;
        do {
            xmlPullParser.next();
            if (AbstractC38046a.m121820o(xmlPullParser, "S")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "t");
                long j16 = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                if (z4) {
                    int i14 = i13;
                    j14 = j16;
                    jM40731a = m40731a(arrayList, jM40731a, j15, i14, j14);
                } else {
                    j14 = j16;
                }
                if (j14 != -9223372036854775807L) {
                    jM40731a = j14;
                }
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "d");
                j15 = attributeValue2 == null ? -9223372036854775807L : Long.parseLong(attributeValue2);
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "r");
                i13 = attributeValue3 == null ? 0 : Integer.parseInt(attributeValue3);
                z4 = true;
            } else {
                m40732b(xmlPullParser);
            }
        } while (!AbstractC38046a.m121819n(xmlPullParser, "SegmentTimeline"));
        if (z4) {
            int i15 = AbstractC38065t.f163031a;
            m40731a(arrayList, jM40731a, j15, i13, AbstractC38065t.m121903Q(j13, j7, 1000L, RoundingMode.DOWN));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00ff. Please report as an issue. */
    /* JADX INFO: renamed from: t */
    public static C0352d m40749t(XmlPullParser xmlPullParser, String str, C0352d c0352d) {
        String strSubstring;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return c0352d;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList.add("");
        int length = 0;
        while (length < attributeValue.length()) {
            int iIndexOf = attributeValue.indexOf("$", length);
            if (iIndexOf == -1) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(length));
                length = attributeValue.length();
            } else if (iIndexOf != length) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(length, iIndexOf));
                length = iIndexOf;
            } else if (attributeValue.startsWith("$$", length)) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + "$");
                length += 2;
            } else {
                arrayList3.add("");
                int i13 = length + 1;
                int iIndexOf2 = attributeValue.indexOf("$", i13);
                String strSubstring2 = attributeValue.substring(i13, iIndexOf2);
                if (strSubstring2.equals("RepresentationID")) {
                    arrayList2.add(1);
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith("d") && !strSubstring.endsWith("x") && !strSubstring.endsWith("X")) {
                            strSubstring = strSubstring.concat("d");
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = "%01d";
                    }
                    strSubstring2.getClass();
                    switch (strSubstring2) {
                        case "Number":
                            arrayList2.add(2);
                            break;
                        case "Time":
                            arrayList2.add(4);
                            break;
                        case "Bandwidth":
                            arrayList2.add(3);
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                    }
                    arrayList3.set(arrayList2.size() - 1, strSubstring);
                }
                arrayList.add("");
                length = iIndexOf2 + 1;
            }
        }
        return new C0352d(arrayList, arrayList2, arrayList3, 20);
    }

    @Override // p398p9.InterfaceC28989m
    /* JADX INFO: renamed from: c */
    public final Object mo36141c(Uri uri, C22629m c22629m) throws ParserException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f52086w.newPullParser();
            xmlPullParserNewPullParser.setInput(c22629m, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return m40741l(xmlPullParserNewPullParser, uri);
            }
            throw ParserException.m5050b(null, "inputStream does not contain a valid media presentation description");
        } catch (XmlPullParserException e5) {
            throw ParserException.m5050b(e5, null);
        }
    }
}
