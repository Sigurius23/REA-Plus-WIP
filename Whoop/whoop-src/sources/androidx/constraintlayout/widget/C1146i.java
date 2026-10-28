package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C1146i {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f5098a;

    /* JADX INFO: renamed from: b */
    public int f5099b = -1;

    /* JADX INFO: renamed from: c */
    public int f5100c = -1;

    /* JADX INFO: renamed from: d */
    public final SparseArray f5101d = new SparseArray();

    /* JADX INFO: renamed from: e */
    public final SparseArray f5102e = new SparseArray();

    public C1146i(Context context, ConstraintLayout constraintLayout, int i13) {
        String str;
        this.f5098a = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i13);
        try {
            C1144g c1144g = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                m3627a(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                C1144g c1144g2 = new C1144g(context, xml);
                                this.f5101d.put(c1144g2.f5088a, c1144g2);
                                c1144g = c1144g2;
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                C1145h c1145h = new C1145h(context, xml);
                                if (c1144g != null) {
                                    c1144g.f5089b.add(c1145h);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException e5) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i13, e5);
        } catch (XmlPullParserException e13) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i13, e13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0109 A[Catch: IOException -> 0x0091, XmlPullParserException -> 0x0094, TryCatch #2 {IOException -> 0x0091, XmlPullParserException -> 0x0094, blocks: (B:20:0x0062, B:97:0x0209, B:28:0x0074, B:29:0x0082, B:31:0x0087, B:38:0x0097, B:46:0x00b1, B:41:0x00a0, B:44:0x00a9, B:47:0x00bf, B:51:0x00ce, B:53:0x00d6, B:54:0x00e0, B:63:0x0109, B:64:0x0110, B:65:0x0128, B:57:0x00e9, B:59:0x00f1, B:60:0x00ff, B:66:0x0129, B:68:0x0131, B:69:0x013f, B:72:0x0149, B:73:0x0154, B:74:0x016c, B:75:0x016d, B:78:0x0177, B:79:0x0182, B:80:0x019a, B:81:0x019b, B:83:0x01a3, B:84:0x01ac, B:87:0x01b6, B:88:0x01c0, B:89:0x01d8, B:90:0x01d9, B:93:0x01e3, B:94:0x01ed, B:95:0x0205, B:96:0x0206), top: B:105:0x0062 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public final void m3627a(Context context, XmlResourceParser xmlResourceParser) {
        C1153p c1153p = new C1153p();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i13 = 0; i13 < attributeCount; i13++) {
            String attributeName = xmlResourceParser.getAttributeName(i13);
            String attributeValue = xmlResourceParser.getAttributeValue(i13);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    int eventType = xmlResourceParser.getEventType();
                    C1148k c1148kM3639i = null;
                    while (eventType != 1) {
                        if (eventType == 0) {
                            xmlResourceParser.getName();
                        } else if (eventType == 2) {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        if (c1148kM3639i == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        c1148kM3639i.f5118d.m3634a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        if (c1148kM3639i == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        c1148kM3639i.f5117c.m3635a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1962203927:
                                    if (name.equals("ConstraintOverride")) {
                                        c1148kM3639i = C1153p.m3639i(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    }
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        if (c1148kM3639i == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        c1148kM3639i.f5116b.m3636a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        if (c1148kM3639i == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        c1148kM3639i.f5119e.m3637a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        c1148kM3639i = C1153p.m3639i(context, Xml.asAttributeSet(xmlResourceParser), false);
                                        c1148kM3639i.f5118d.f5148a = true;
                                    }
                                    break;
                                case 366511058:
                                    if (name.equals("CustomMethod")) {
                                        if (c1148kM3639i != null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        C1138a.m3613a(context, xmlResourceParser, c1148kM3639i.f5120f);
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        c1148kM3639i = C1153p.m3639i(context, Xml.asAttributeSet(xmlResourceParser), false);
                                        c1148kM3639i.f5118d.f5163h0 = 1;
                                    }
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        if (c1148kM3639i != null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        C1138a.m3613a(context, xmlResourceParser, c1148kM3639i.f5120f);
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        c1148kM3639i = C1153p.m3639i(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    }
                                    break;
                            }
                        } else if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        c1153p.f5222c.put(Integer.valueOf(c1148kM3639i.f5115a), c1148kM3639i);
                                        c1148kM3639i = null;
                                    }
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        c1153p.f5222c.put(Integer.valueOf(c1148kM3639i.f5115a), c1148kM3639i);
                                        c1148kM3639i = null;
                                    }
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        c1153p.f5222c.put(Integer.valueOf(c1148kM3639i.f5115a), c1148kM3639i);
                                        c1148kM3639i = null;
                                    }
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        this.f5102e.put(identifier, c1153p);
                                        return;
                                    }
                                    break;
                                    break;
                                default:
                                    break;
                            }
                        }
                        eventType = xmlResourceParser.next();
                    }
                } catch (IOException e5) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e5);
                } catch (XmlPullParserException e13) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e13);
                }
                this.f5102e.put(identifier, c1153p);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3628b(float f13, float f14, int i13) {
        int i14 = this.f5099b;
        int i15 = 0;
        ConstraintLayout constraintLayout = this.f5098a;
        SparseArray sparseArray = this.f5101d;
        if (i14 == i13) {
            C1144g c1144g = i13 == -1 ? (C1144g) sparseArray.valueAt(0) : (C1144g) sparseArray.get(i14);
            int i16 = this.f5100c;
            if (i16 == -1 || !((C1145h) c1144g.f5089b.get(i16)).m3626a(f13, f14)) {
                ArrayList arrayList = c1144g.f5089b;
                while (true) {
                    if (i15 >= arrayList.size()) {
                        i15 = -1;
                        break;
                    } else if (((C1145h) arrayList.get(i15)).m3626a(f13, f14)) {
                        break;
                    } else {
                        i15++;
                    }
                }
                ArrayList arrayList2 = c1144g.f5089b;
                if (this.f5100c == i15) {
                    return;
                }
                C1153p c1153p = i15 == -1 ? null : ((C1145h) arrayList2.get(i15)).f5097f;
                if (i15 != -1) {
                    int i17 = ((C1145h) arrayList2.get(i15)).f5096e;
                }
                if (c1153p == null) {
                    return;
                }
                this.f5100c = i15;
                c1153p.m3644a(constraintLayout);
                return;
            }
            return;
        }
        this.f5099b = i13;
        C1144g c1144g2 = (C1144g) sparseArray.get(i13);
        ArrayList arrayList3 = c1144g2.f5089b;
        while (true) {
            if (i15 >= arrayList3.size()) {
                i15 = -1;
                break;
            } else if (((C1145h) arrayList3.get(i15)).m3626a(f13, f14)) {
                break;
            } else {
                i15++;
            }
        }
        ArrayList arrayList4 = c1144g2.f5089b;
        C1153p c1153p2 = i15 == -1 ? c1144g2.f5091d : ((C1145h) arrayList4.get(i15)).f5097f;
        if (i15 != -1) {
            int i18 = ((C1145h) arrayList4.get(i15)).f5096e;
        }
        if (c1153p2 != null) {
            this.f5100c = i15;
            c1153p2.m3644a(constraintLayout);
            return;
        }
        Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i13 + ", dim =" + f13 + ", " + f14);
    }
}
