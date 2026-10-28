package p114eb;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import e93.AbstractC12889b;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l83.C23470p;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25258m;
import p000.AbstractC11266d;
import p002a0.C0006a1;
import p002a0.C0024g1;
import p002a0.C0027h1;
import p005a3.C0222l0;
import p143fb.AbstractC14334a;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import xb3.AbstractC38176k;
import xb3.C38166a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: eb.n0 */
/* JADX INFO: loaded from: classes.dex */
public class C12977n0 {

    /* JADX INFO: renamed from: K */
    public static final /* synthetic */ int f44815K = 0;

    /* JADX INFO: renamed from: E */
    public final ArrayList f44816E;

    /* JADX INFO: renamed from: F */
    public final C0024g1 f44817F;

    /* JADX INFO: renamed from: G */
    public final LinkedHashMap f44818G;

    /* JADX INFO: renamed from: H */
    public int f44819H;

    /* JADX INFO: renamed from: I */
    public String f44820I;

    /* JADX INFO: renamed from: J */
    public C23470p f44821J;

    /* JADX INFO: renamed from: w */
    public final String f44822w;

    /* JADX INFO: renamed from: x */
    public C12985r0 f44823x;

    /* JADX INFO: renamed from: y */
    public String f44824y;

    /* JADX INFO: renamed from: z */
    public CharSequence f44825z;

    static {
        new LinkedHashMap();
    }

    public C12977n0(String str) {
        this.f44822w = str;
        this.f44816E = new ArrayList();
        this.f44817F = new C0024g1((Object) null);
        this.f44818G = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: a */
    public final void m36463a(C12954f0 navDeepLink) {
        AbstractC22676k.m65750j(navDeepLink, "navDeepLink");
        ArrayList arrayListM88498G = AbstractC29125c.m88498G(this.f44818G, new C12975m0(navDeepLink, 0));
        if (arrayListM88498G.isEmpty()) {
            this.f44816E.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.f44735a + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + arrayListM88498G).toString());
    }

    /* JADX INFO: renamed from: c */
    public final Bundle m36464c(Bundle bundle) {
        Object obj;
        LinkedHashMap linkedHashMap = this.f44818G;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String name = (String) entry.getKey();
            C12971l c12971l = (C12971l) entry.getValue();
            c12971l.getClass();
            AbstractC22676k.m65750j(name, "name");
            if (c12971l.f44800c && (obj = c12971l.f44801d) != null) {
                c12971l.f44798a.mo36414e(bundle2, name, obj);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String name2 = (String) entry2.getKey();
                C12971l c12971l2 = (C12971l) entry2.getValue();
                c12971l2.getClass();
                AbstractC12958g1 abstractC12958g1 = c12971l2.f44798a;
                AbstractC22676k.m65750j(name2, "name");
                if (c12971l2.f44799b || !bundle2.containsKey(name2) || bundle2.get(name2) != null) {
                    try {
                        abstractC12958g1.mo36411a(bundle2, name2);
                    } catch (ClassCastException unused) {
                    }
                }
                StringBuilder sbM53375p = AbstractC18489d0.m53375p("Wrong argument type for '", name2, "' in argument bundle. ");
                sbM53375p.append(abstractC12958g1.mo36412b());
                sbM53375p.append(" expected.");
                throw new IllegalArgumentException(sbM53375p.toString().toString());
            }
        }
        return bundle2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX WARN: Code duplicated, block: B:14:0x002b  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: d */
    public final int[] m36465d(C12977n0 c12977n0) {
        C25258m c25258m = new C25258m();
        C12977n0 c12977n1 = this;
        while (true) {
            C12985r0 c12985r0 = c12977n1.f44823x;
            if ((c12977n0 != null ? c12977n0.f44823x : null) != null) {
                C12985r0 c12985r1 = c12977n0.f44823x;
                AbstractC22676k.m65747g(c12985r1);
                if (c12985r1.m36486r(c12977n1.f44819H, c12985r1, null, false) != c12977n1) {
                    if (c12985r0 != null || c12985r0.f44856M != c12977n1.f44819H) {
                        c25258m.addFirst(c12977n1);
                    }
                    if (!AbstractC22676k.m65745e(c12985r0, c12977n0) || c12985r0 == null) {
                        break;
                    }
                    c12977n1 = c12985r0;
                } else {
                    c25258m.addFirst(c12977n1);
                    break;
                }
            } else {
                if (c12985r0 != null) {
                    c25258m.addFirst(c12977n1);
                } else {
                    c25258m.addFirst(c12977n1);
                }
                if (!AbstractC22676k.m65745e(c12985r0, c12977n0)) {
                    break;
                }
                c12977n1 = c12985r0;
            }
        }
        List listM74093D1 = AbstractC25265s.m74093D1(c25258m);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM74093D1, 10));
        Iterator it = listM74093D1.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((C12977n0) it.next()).f44819H));
        }
        return AbstractC25265s.m74091C1(arrayList);
    }

    /* JADX INFO: renamed from: e */
    public final C12956g m36466e(int i13) {
        C0024g1 c0024g1 = this.f44817F;
        C12956g c12956g = c0024g1.m58g() == 0 ? null : (C12956g) c0024g1.m55d(i13);
        if (c12956g != null) {
            return c12956g;
        }
        C12985r0 c12985r0 = this.f44823x;
        if (c12985r0 != null) {
            return c12985r0.m36466e(i13);
        }
        return null;
    }

    public boolean equals(Object obj) {
        boolean z4;
        boolean z13;
        if (this != obj) {
            if (obj != null && (obj instanceof C12977n0)) {
                C12977n0 c12977n0 = (C12977n0) obj;
                C0024g1 c0024g1 = c12977n0.f44817F;
                LinkedHashMap linkedHashMap = c12977n0.f44818G;
                boolean zM65745e = AbstractC22676k.m65745e(this.f44816E, c12977n0.f44816E);
                C0024g1 c0024g2 = this.f44817F;
                if (c0024g2.m58g() != c0024g1.m58g()) {
                    z4 = false;
                    break;
                }
                Iterator it = ((C38166a) AbstractC38176k.m122278n(new C0027h1(c0024g2))).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z4 = true;
                        break;
                    }
                    int iIntValue = ((Number) it.next()).intValue();
                    if (!AbstractC22676k.m65745e(c0024g2.m55d(iIntValue), c0024g1.m55d(iIntValue))) {
                        z4 = false;
                        break;
                    }
                }
                LinkedHashMap linkedHashMap2 = this.f44818G;
                if (linkedHashMap2.size() != linkedHashMap.size()) {
                    z13 = false;
                    break;
                }
                Iterator it3 = ((Iterable) AbstractC25265s.m74145r0(linkedHashMap2.entrySet()).f99158b).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z13 = true;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it3.next();
                    if (!linkedHashMap.containsKey(entry.getKey()) || !AbstractC22676k.m65745e(linkedHashMap.get(entry.getKey()), entry.getValue())) {
                        z13 = false;
                        break;
                    }
                }
                if (this.f44819H != c12977n0.f44819H || !AbstractC22676k.m65745e(this.f44820I, c12977n0.f44820I) || !zM65745e || !z4 || !z13) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public String mo36467g() {
        String str = this.f44824y;
        return str == null ? String.valueOf(this.f44819H) : str;
    }

    public int hashCode() {
        Set<String> setKeySet;
        int i13 = this.f44819H * 31;
        String str = this.f44820I;
        int iHashCode = i13 + (str != null ? str.hashCode() : 0);
        for (C12954f0 c12954f0 : this.f44816E) {
            int i14 = iHashCode * 31;
            String str2 = c12954f0.f44735a;
            int iHashCode2 = (i14 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = c12954f0.f44736b;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = c12954f0.f44737c;
            iHashCode = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        C0024g1 c0024g1 = this.f44817F;
        AbstractC22676k.m65750j(c0024g1, "<this>");
        int i15 = 0;
        while (true) {
            if (!(i15 < c0024g1.m58g())) {
                break;
            }
            int i16 = i15 + 1;
            C12956g c12956g = (C12956g) c0024g1.m59h(i15);
            int i17 = ((iHashCode * 31) + c12956g.f44752a) * 31;
            C12997x0 c12997x0 = c12956g.f44753b;
            iHashCode = i17 + (c12997x0 != null ? c12997x0.hashCode() : 0);
            Bundle bundle = c12956g.f44754c;
            if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                for (String str5 : setKeySet) {
                    int i18 = iHashCode * 31;
                    Bundle bundle2 = c12956g.f44754c;
                    AbstractC22676k.m65747g(bundle2);
                    Object obj = bundle2.get(str5);
                    iHashCode = i18 + (obj != null ? obj.hashCode() : 0);
                }
            }
            i15 = i16;
        }
        LinkedHashMap linkedHashMap = this.f44818G;
        for (String str6 : linkedHashMap.keySet()) {
            int iM30450d = AbstractC11266d.m30450d(iHashCode * 31, 31, str6);
            Object obj2 = linkedHashMap.get(str6);
            iHashCode = iM30450d + (obj2 != null ? obj2.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX INFO: renamed from: j */
    public C12972l0 mo36468j(C12969k0 navDeepLinkRequest) {
        int i13;
        int iM36419a;
        AbstractC22676k.m65750j(navDeepLinkRequest, "navDeepLinkRequest");
        ArrayList<C12954f0> arrayList = this.f44816E;
        if (arrayList.isEmpty()) {
            return null;
        }
        C12972l0 c12972l0 = null;
        for (C12954f0 c12954f0 : arrayList) {
            Uri uri = navDeepLinkRequest.f44793a;
            LinkedHashMap arguments = this.f44818G;
            Bundle bundleM36430d = uri != null ? c12954f0.m36430d(uri, arguments) : null;
            int iM36428b = c12954f0.m36428b(uri);
            String str = navDeepLinkRequest.f44794b;
            boolean z4 = str != null && str.equals(c12954f0.f44736b);
            String str2 = navDeepLinkRequest.f44795c;
            if (str2 != null) {
                String str3 = c12954f0.f44737c;
                if (str3 != null) {
                    Pattern pattern = (Pattern) c12954f0.f44749o.getValue();
                    AbstractC22676k.m65747g(pattern);
                    if (pattern.matcher(str2).matches()) {
                        iM36419a = new C12945c0(str3).compareTo(new C12945c0(str2));
                    } else {
                        iM36419a = -1;
                    }
                } else {
                    iM36419a = -1;
                }
                i13 = iM36419a;
            } else {
                i13 = -1;
            }
            if (bundleM36430d == null) {
                if (z4 || i13 > -1) {
                    AbstractC22676k.m65750j(arguments, "arguments");
                    Bundle bundle = new Bundle();
                    if (uri != null) {
                        Pattern pattern2 = (Pattern) c12954f0.f44740f.getValue();
                        Matcher matcher = pattern2 != null ? pattern2.matcher(uri.toString()) : null;
                        if (matcher != null && matcher.matches()) {
                            c12954f0.m36431e(matcher, bundle, arguments);
                            if (((Boolean) c12954f0.f44741g.getValue()).booleanValue()) {
                                c12954f0.m36432f(uri, bundle, arguments);
                            }
                        }
                    }
                    if (AbstractC29125c.m88498G(arguments, new C0006a1(bundle, 18)).isEmpty()) {
                    }
                }
            }
            C12972l0 c12972l1 = new C12972l0(this, bundleM36430d, c12954f0.f44750p, iM36428b, z4, i13);
            if (c12972l0 == null || c12972l1.compareTo(c12972l0) > 0) {
                c12972l0 = c12972l1;
            }
        }
        return c12972l0;
    }

    /* JADX INFO: renamed from: l */
    public final C12972l0 m36469l(String route) {
        C12954f0 c12954f0;
        AbstractC22676k.m65750j(route, "route");
        C23470p c23470p = this.f44821J;
        if (c23470p == null || (c12954f0 = (C12954f0) c23470p.getValue()) == null) {
            return null;
        }
        Uri uri = Uri.parse("android-app://androidx.navigation/".concat(route));
        AbstractC22676k.m65746f(uri);
        Bundle bundleM36430d = c12954f0.m36430d(uri, this.f44818G);
        if (bundleM36430d == null) {
            return null;
        }
        return new C12972l0(this, bundleM36430d, c12954f0.f44750p, c12954f0.m36428b(uri), false, -1);
    }

    /* JADX INFO: renamed from: m */
    public void mo36416m(Context context, AttributeSet attributeSet) {
        AbstractC22676k.m65750j(context, "context");
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC14334a.f52345e);
        AbstractC22676k.m65749i(typedArrayObtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        m36471o(typedArrayObtainAttributes.getString(2));
        if (typedArrayObtainAttributes.hasValue(1)) {
            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
            this.f44819H = resourceId;
            this.f44824y = null;
            this.f44824y = AbstractC34132o.m107895x(context, resourceId);
        }
        this.f44825z = typedArrayObtainAttributes.getText(0);
        typedArrayObtainAttributes.recycle();
    }

    /* JADX INFO: renamed from: n */
    public final void m36470n(int i13, C12956g action) {
        AbstractC22676k.m65750j(action, "action");
        if (!(this instanceof C12941b)) {
            if (i13 == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            this.f44817F.m57f(i13, action);
        } else {
            throw new UnsupportedOperationException("Cannot add action " + i13 + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m36471o(String str) {
        if (str == null) {
            this.f44819H = 0;
            this.f44824y = null;
        } else {
            if (AbstractC39414r.m125890i0(str)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String uriPattern = "android-app://androidx.navigation/".concat(str);
            AbstractC22676k.m65750j(uriPattern, "uriPattern");
            ArrayList arrayListM88498G = AbstractC29125c.m88498G(this.f44818G, new C12975m0(new C12954f0(uriPattern, null, null), 1));
            if (!arrayListM88498G.isEmpty()) {
                throw new IllegalArgumentException(("Cannot set route \"" + str + "\" for destination " + this + ". Following required arguments are missing: " + arrayListM88498G).toString());
            }
            this.f44821J = AbstractC30060g.m92088H(new C0222l0(uriPattern, 7));
            this.f44819H = uriPattern.hashCode();
            this.f44824y = null;
        }
        this.f44820I = str;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(getClass().getSimpleName());
        sb4.append("(");
        String str = this.f44824y;
        if (str == null) {
            sb4.append("0x");
            sb4.append(Integer.toHexString(this.f44819H));
        } else {
            sb4.append(str);
        }
        sb4.append(")");
        String str2 = this.f44820I;
        if (str2 != null && !AbstractC39414r.m125890i0(str2)) {
            sb4.append(" route=");
            sb4.append(this.f44820I);
        }
        if (this.f44825z != null) {
            sb4.append(" label=");
            sb4.append(this.f44825z);
        }
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "sb.toString()");
        return string;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12977n0(AbstractC12964i1 navigator) {
        this(AbstractC12889b.m36241G(navigator.getClass()));
        AbstractC22676k.m65750j(navigator, "navigator");
        LinkedHashMap linkedHashMap = C12967j1.f44787b;
    }
}
