package p114eb;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.room.AbstractC1772c1;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p143fb.AbstractC14334a;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: eb.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class C12993v0 {

    /* JADX INFO: renamed from: c */
    public static final ThreadLocal f44883c = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public final Context f44884a;

    /* JADX INFO: renamed from: b */
    public final C12967j1 f44885b;

    public C12993v0(Context context, C12967j1 navigatorProvider) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(navigatorProvider, "navigatorProvider");
        this.f44884a = context;
        this.f44885b = navigatorProvider;
    }

    /* JADX INFO: renamed from: c */
    public static C12971l m36504c(TypedArray typedArray, Resources resources, int i13) throws XmlPullParserException {
        AbstractC12958g1 abstractC12958g1M118992p;
        C12968k c12968k = new C12968k();
        int i14 = 0;
        c12968k.f44789a = typedArray.getBoolean(3, false);
        ThreadLocal threadLocal = f44883c;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(2);
        Object objMo36413d = null;
        if (string != null) {
            String resourcePackageName = resources.getResourcePackageName(i13);
            if (string.startsWith("java")) {
                try {
                    abstractC12958g1M118992p = AbstractC1772c1.m5401s("j$" + string.substring(4), resourcePackageName);
                } catch (RuntimeException e5) {
                    if (!(e5.getCause() instanceof ClassNotFoundException)) {
                        throw e5;
                    }
                    abstractC12958g1M118992p = AbstractC1772c1.m5401s(string, resourcePackageName);
                }
            } else {
                abstractC12958g1M118992p = AbstractC1772c1.m5401s(string, resourcePackageName);
            }
        } else {
            abstractC12958g1M118992p = null;
        }
        if (typedArray.getValue(1, typedValue)) {
            C12940a1 c12940a1 = AbstractC12958g1.f44758c;
            if (abstractC12958g1M118992p == c12940a1) {
                int i15 = typedValue.resourceId;
                if (i15 != 0) {
                    i14 = i15;
                } else if (typedValue.type != 16 || typedValue.data != 0) {
                    throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + abstractC12958g1M118992p.mo36412b() + ". Must be a reference to a resource.");
                }
                objMo36413d = Integer.valueOf(i14);
            } else {
                int i16 = typedValue.resourceId;
                if (i16 == 0) {
                    C12940a1 c12940a2 = AbstractC12958g1.f44770o;
                    if (abstractC12958g1M118992p == c12940a2) {
                        objMo36413d = typedArray.getString(1);
                    } else {
                        int i17 = typedValue.type;
                        C12940a1 c12940a3 = AbstractC12958g1.f44767l;
                        C12940a1 c12940a4 = AbstractC12958g1.f44757b;
                        C12940a1 c12940a5 = AbstractC12958g1.f44764i;
                        if (i17 == 3) {
                            String value = typedValue.string.toString();
                            if (abstractC12958g1M118992p == null) {
                                AbstractC22676k.m65750j(value, "value");
                                try {
                                    try {
                                        try {
                                            try {
                                                c12940a4.mo36417g(value);
                                                abstractC12958g1M118992p = c12940a4;
                                            } catch (IllegalArgumentException unused) {
                                                C12940a1 c12940a6 = AbstractC12958g1.f44761f;
                                                c12940a6.mo36417g(value);
                                                abstractC12958g1M118992p = c12940a6;
                                            }
                                        } catch (IllegalArgumentException unused2) {
                                            abstractC12958g1M118992p = c12940a2;
                                        }
                                    } catch (IllegalArgumentException unused3) {
                                        c12940a3.mo36417g(value);
                                        abstractC12958g1M118992p = c12940a3;
                                    }
                                } catch (IllegalArgumentException unused4) {
                                    c12940a5.mo36417g(value);
                                    abstractC12958g1M118992p = c12940a5;
                                }
                            }
                            objMo36413d = abstractC12958g1M118992p.mo36417g(value);
                        } else if (i17 == 4) {
                            abstractC12958g1M118992p = AbstractC37056f.m118992p(typedValue, abstractC12958g1M118992p, c12940a5, string, "float");
                            objMo36413d = Float.valueOf(typedValue.getFloat());
                        } else if (i17 == 5) {
                            abstractC12958g1M118992p = AbstractC37056f.m118992p(typedValue, abstractC12958g1M118992p, c12940a4, string, "dimension");
                            objMo36413d = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                        } else if (i17 == 18) {
                            abstractC12958g1M118992p = AbstractC37056f.m118992p(typedValue, abstractC12958g1M118992p, c12940a3, string, "boolean");
                            objMo36413d = Boolean.valueOf(typedValue.data != 0);
                        } else {
                            if (i17 < 16 || i17 > 31) {
                                throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                            }
                            if (abstractC12958g1M118992p == c12940a5) {
                                abstractC12958g1M118992p = AbstractC37056f.m118992p(typedValue, abstractC12958g1M118992p, c12940a5, string, "float");
                                objMo36413d = Float.valueOf(typedValue.data);
                            } else {
                                abstractC12958g1M118992p = AbstractC37056f.m118992p(typedValue, abstractC12958g1M118992p, c12940a4, string, "integer");
                                objMo36413d = Integer.valueOf(typedValue.data);
                            }
                        }
                    }
                } else {
                    if (abstractC12958g1M118992p != null) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + abstractC12958g1M118992p.mo36412b() + ". You must use a \"reference\" type to reference other resources.");
                    }
                    objMo36413d = Integer.valueOf(i16);
                    abstractC12958g1M118992p = c12940a1;
                }
            }
        }
        if (objMo36413d != null) {
            c12968k.f44792d = objMo36413d;
            c12968k.f44790b = true;
        }
        if (abstractC12958g1M118992p != null) {
            c12968k.f44791c = abstractC12958g1M118992p;
        }
        return c12968k.m36452a();
    }

    /* JADX INFO: renamed from: a */
    public final C12977n0 m36505a(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i13) throws XmlPullParserException, IOException {
        int depth;
        String strM125926K;
        String strM125926K2;
        String strM125926K3;
        Context context;
        int i14;
        TypedArray typedArray;
        Object obj;
        int i15 = i13;
        String name = xmlResourceParser.getName();
        AbstractC22676k.m65749i(name, "parser.name");
        C12977n0 c12977n0Mo36423a = this.f44885b.mo36434b(name).mo36423a();
        Context context2 = this.f44884a;
        c12977n0Mo36423a.mo36416m(context2, attributeSet);
        int i16 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == i16 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = xmlResourceParser.getName();
                boolean zEquals = "argument".equals(name2);
                int[] iArr = AbstractC14334a.f52342b;
                if (zEquals) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, iArr);
                    AbstractC22676k.m65749i(typedArrayObtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
                    String string = typedArrayObtainAttributes.getString(0);
                    if (string == null) {
                        throw new XmlPullParserException("Arguments must have a name");
                    }
                    c12977n0Mo36423a.f44818G.put(string, m36504c(typedArrayObtainAttributes, resources, i15));
                    typedArrayObtainAttributes.recycle();
                } else if ("deepLink".equals(name2)) {
                    TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(attributeSet, AbstractC14334a.f52343c);
                    AbstractC22676k.m65749i(typedArrayObtainAttributes2, "res.obtainAttributes(att… R.styleable.NavDeepLink)");
                    String string2 = typedArrayObtainAttributes2.getString(3);
                    String string3 = typedArrayObtainAttributes2.getString(i16);
                    String string4 = typedArrayObtainAttributes2.getString(2);
                    if ((string2 == null || string2.length() == 0) && ((string3 == null || string3.length() == 0) && (string4 == null || string4.length() == 0))) {
                        throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
                    }
                    if (string2 != null) {
                        String packageName = context2.getPackageName();
                        AbstractC22676k.m65749i(packageName, "context.packageName");
                        strM125926K = AbstractC39421y.m125926K(string2, "${applicationId}", packageName, false);
                    } else {
                        strM125926K = null;
                    }
                    if (string3 == null || string3.length() == 0) {
                        strM125926K2 = null;
                    } else {
                        String packageName2 = context2.getPackageName();
                        AbstractC22676k.m65749i(packageName2, "context.packageName");
                        strM125926K2 = AbstractC39421y.m125926K(string3, "${applicationId}", packageName2, false);
                        if (strM125926K2.length() <= 0) {
                            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
                        }
                    }
                    if (string4 != null) {
                        String packageName3 = context2.getPackageName();
                        AbstractC22676k.m65749i(packageName3, "context.packageName");
                        strM125926K3 = AbstractC39421y.m125926K(string4, "${applicationId}", packageName3, false);
                    } else {
                        strM125926K3 = null;
                    }
                    c12977n0Mo36423a.m36463a(new C12954f0(strM125926K, strM125926K2, strM125926K3));
                    typedArrayObtainAttributes2.recycle();
                } else {
                    if ("action".equals(name2)) {
                        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC14334a.f52341a, 0, 0);
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                        int i17 = i16;
                        C12956g c12956g = new C12956g(typedArrayObtainStyledAttributes.getResourceId(i16, 0));
                        c12956g.f44753b = new C12997x0(typedArrayObtainStyledAttributes.getBoolean(4, false), typedArrayObtainStyledAttributes.getBoolean(10, false), typedArrayObtainStyledAttributes.getResourceId(7, -1), typedArrayObtainStyledAttributes.getBoolean(8, false), typedArrayObtainStyledAttributes.getBoolean(9, false), typedArrayObtainStyledAttributes.getResourceId(2, -1), typedArrayObtainStyledAttributes.getResourceId(3, -1), typedArrayObtainStyledAttributes.getResourceId(5, -1), typedArrayObtainStyledAttributes.getResourceId(6, -1));
                        Bundle bundle = new Bundle();
                        int depth3 = xmlResourceParser.getDepth() + 1;
                        context = context2;
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            i14 = depth2;
                            if (next2 == i17) {
                                typedArray = typedArrayObtainStyledAttributes;
                                break;
                            }
                            int depth4 = xmlResourceParser.getDepth();
                            typedArray = typedArrayObtainStyledAttributes;
                            if (depth4 < depth3 && next2 == 3) {
                                break;
                            }
                            if (next2 == 2 && depth4 <= depth3) {
                                if ("argument".equals(xmlResourceParser.getName())) {
                                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(attributeSet, iArr);
                                    AbstractC22676k.m65749i(typedArrayObtainAttributes3, "res.obtainAttributes(att… R.styleable.NavArgument)");
                                    String string5 = typedArrayObtainAttributes3.getString(0);
                                    if (string5 == null) {
                                        throw new XmlPullParserException("Arguments must have a name");
                                    }
                                    C12971l c12971lM36504c = m36504c(typedArrayObtainAttributes3, resources, i15);
                                    boolean z4 = c12971lM36504c.f44800c;
                                    if (z4 && z4 && (obj = c12971lM36504c.f44801d) != null) {
                                        c12971lM36504c.f44798a.mo36414e(bundle, string5, obj);
                                    }
                                    typedArrayObtainAttributes3.recycle();
                                }
                                i15 = i13;
                            }
                            depth2 = i14;
                            typedArrayObtainStyledAttributes = typedArray;
                            i17 = 1;
                        }
                        if (!bundle.isEmpty()) {
                            c12956g.f44754c = bundle;
                        }
                        c12977n0Mo36423a.m36470n(resourceId, c12956g);
                        typedArray.recycle();
                    } else {
                        context = context2;
                        i14 = depth2;
                        if ("include".equals(name2) && (c12977n0Mo36423a instanceof C12985r0)) {
                            TypedArray typedArrayObtainAttributes4 = resources.obtainAttributes(attributeSet, AbstractC12973l1.f44810c);
                            AbstractC22676k.m65749i(typedArrayObtainAttributes4, "res.obtainAttributes(att…n.R.styleable.NavInclude)");
                            ((C12985r0) c12977n0Mo36423a).m36484p(m36506b(typedArrayObtainAttributes4.getResourceId(0, 0)));
                            typedArrayObtainAttributes4.recycle();
                        } else if (c12977n0Mo36423a instanceof C12985r0) {
                            ((C12985r0) c12977n0Mo36423a).m36484p(m36505a(resources, xmlResourceParser, attributeSet, i13));
                        }
                    }
                    i15 = i13;
                    context2 = context;
                    depth2 = i14;
                    i16 = 1;
                }
            }
        }
        return c12977n0Mo36423a;
    }

    /* JADX INFO: renamed from: b */
    public final C12985r0 m36506b(int i13) {
        int next;
        Resources resources = this.f44884a.getResources();
        XmlResourceParser xml = resources.getXml(i13);
        AbstractC22676k.m65749i(xml, "res.getXml(graphResId)");
        AttributeSet attrs = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e5) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i13) + " line " + xml.getLineNumber(), e5);
                }
            } catch (Throwable th3) {
                xml.close();
                throw th3;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        AbstractC22676k.m65749i(attrs, "attrs");
        C12977n0 c12977n0M36505a = m36505a(resources, xml, attrs, i13);
        if (c12977n0M36505a instanceof C12985r0) {
            C12985r0 c12985r0 = (C12985r0) c12977n0M36505a;
            xml.close();
            return c12985r0;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }
}
