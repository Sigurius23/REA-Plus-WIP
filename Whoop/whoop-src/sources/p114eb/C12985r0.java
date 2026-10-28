package p114eb;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import d93.InterfaceC11820a;
import java.util.ArrayList;
import java.util.Iterator;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p002a0.C0024g1;
import p002a0.C0030i1;
import p143fb.AbstractC14334a;
import p715kotlin.jvm.internal.AbstractC22676k;
import xb3.AbstractC38176k;
import xb3.C38166a;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: eb.r0 */
/* JADX INFO: loaded from: classes.dex */
public class C12985r0 extends C12977n0 implements Iterable, InterfaceC11820a {

    /* JADX INFO: renamed from: P */
    public static final /* synthetic */ int f44854P = 0;

    /* JADX INFO: renamed from: L */
    public final C0024g1 f44855L;

    /* JADX INFO: renamed from: M */
    public int f44856M;

    /* JADX INFO: renamed from: N */
    public String f44857N;

    /* JADX INFO: renamed from: O */
    public String f44858O;

    public C12985r0(C12989t0 c12989t0) {
        super(c12989t0);
        this.f44855L = new C0024g1((Object) null);
    }

    @Override // p114eb.C12977n0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C12985r0) || !super.equals(obj)) {
            return false;
        }
        C0024g1 c0024g1 = this.f44855L;
        int iM58g = c0024g1.m58g();
        C12985r0 c12985r0 = (C12985r0) obj;
        C0024g1 c0024g2 = c12985r0.f44855L;
        if (iM58g != c0024g2.m58g() || this.f44856M != c12985r0.f44856M) {
            return false;
        }
        for (C12977n0 c12977n0 : (C38166a) AbstractC38176k.m122278n(new C0030i1(c0024g1, 0))) {
            if (!c12977n0.equals(c0024g2.m55d(c12977n0.f44819H))) {
                return false;
            }
        }
        return true;
    }

    @Override // p114eb.C12977n0
    /* JADX INFO: renamed from: g */
    public final String mo36467g() {
        return this.f44819H != 0 ? super.mo36467g() : "the root navigation";
    }

    @Override // p114eb.C12977n0
    public final int hashCode() {
        int iM56e = this.f44856M;
        C0024g1 c0024g1 = this.f44855L;
        int iM58g = c0024g1.m58g();
        for (int i13 = 0; i13 < iM58g; i13++) {
            iM56e = (((iM56e * 31) + c0024g1.m56e(i13)) * 31) + ((C12977n0) c0024g1.m59h(i13)).hashCode();
        }
        return iM56e;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C12983q0(this);
    }

    @Override // p114eb.C12977n0
    /* JADX INFO: renamed from: j */
    public final C12972l0 mo36468j(C12969k0 navDeepLinkRequest) {
        AbstractC22676k.m65750j(navDeepLinkRequest, "navDeepLinkRequest");
        return m36487t(navDeepLinkRequest, false, this);
    }

    @Override // p114eb.C12977n0
    /* JADX INFO: renamed from: m */
    public final void mo36416m(Context context, AttributeSet attributeSet) {
        String strValueOf;
        AbstractC22676k.m65750j(context, "context");
        super.mo36416m(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC14334a.f52344d);
        AbstractC22676k.m65749i(typedArrayObtainAttributes, "context.resources.obtain…leable.NavGraphNavigator)");
        int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
        if (resourceId == this.f44819H) {
            throw new IllegalArgumentException(("Start destination " + resourceId + " cannot use the same id as the graph " + this).toString());
        }
        if (this.f44858O != null) {
            m36489v(null);
        }
        this.f44856M = resourceId;
        this.f44857N = null;
        int i13 = this.f44856M;
        if (i13 <= 16777215) {
            strValueOf = String.valueOf(i13);
        } else {
            try {
                strValueOf = context.getResources().getResourceName(i13);
            } catch (Resources.NotFoundException unused) {
                strValueOf = String.valueOf(i13);
            }
            AbstractC22676k.m65749i(strValueOf, "try {\n                  …tring()\n                }");
        }
        this.f44857N = strValueOf;
        typedArrayObtainAttributes.recycle();
    }

    /* JADX INFO: renamed from: p */
    public final void m36484p(C12977n0 node) {
        AbstractC22676k.m65750j(node, "node");
        int i13 = node.f44819H;
        String str = node.f44820I;
        if (i13 == 0 && str == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        String str2 = this.f44820I;
        if (str2 != null && AbstractC22676k.m65745e(str, str2)) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + this).toString());
        }
        if (i13 == this.f44819H) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + this).toString());
        }
        C0024g1 c0024g1 = this.f44855L;
        C12977n0 c12977n0 = (C12977n0) c0024g1.m55d(i13);
        if (c12977n0 == node) {
            return;
        }
        if (node.f44823x != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (c12977n0 != null) {
            c12977n0.f44823x = null;
        }
        node.f44823x = this;
        c0024g1.m57f(node.f44819H, node);
    }

    /* JADX INFO: renamed from: q */
    public final C12977n0 m36485q(String route, boolean z4) {
        Object next;
        C12985r0 c12985r0;
        C12977n0 c12977n0;
        AbstractC22676k.m65750j(route, "route");
        C0024g1 c0024g1 = this.f44855L;
        AbstractC22676k.m65750j(c0024g1, "<this>");
        Iterator it = ((C38166a) AbstractC38176k.m122278n(new C0030i1(c0024g1, 0))).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            c12977n0 = (C12977n0) next;
            if (AbstractC39421y.m125921F(c12977n0.f44820I, route, false)) {
                break;
            }
        } while (c12977n0.m36469l(route) == null);
        C12977n0 c12977n1 = (C12977n0) next;
        if (c12977n1 != null) {
            return c12977n1;
        }
        if (!z4 || (c12985r0 = this.f44823x) == null || AbstractC39414r.m125890i0(route)) {
            return null;
        }
        return c12985r0.m36485q(route, true);
    }

    /* JADX INFO: renamed from: r */
    public final C12977n0 m36486r(int i13, C12977n0 c12977n0, C12977n0 c12977n1, boolean z4) {
        C0024g1 c0024g1 = this.f44855L;
        C12977n0 c12977n0M36486r = (C12977n0) c0024g1.m55d(i13);
        if (c12977n1 != null) {
            if (AbstractC22676k.m65745e(c12977n0M36486r, c12977n1) && AbstractC22676k.m65745e(c12977n0M36486r.f44823x, c12977n1.f44823x)) {
                return c12977n0M36486r;
            }
            c12977n0M36486r = null;
        } else if (c12977n0M36486r != null) {
            return c12977n0M36486r;
        }
        if (z4) {
            Iterator it = ((C38166a) AbstractC38176k.m122278n(new C0030i1(c0024g1, 0))).iterator();
            do {
                if (!it.hasNext()) {
                    c12977n0M36486r = null;
                    break;
                }
                C12977n0 c12977n2 = (C12977n0) it.next();
                c12977n0M36486r = (!(c12977n2 instanceof C12985r0) || c12977n2.equals(c12977n0)) ? null : ((C12985r0) c12977n2).m36486r(i13, this, c12977n1, true);
            } while (c12977n0M36486r == null);
        }
        if (c12977n0M36486r != null) {
            return c12977n0M36486r;
        }
        C12985r0 c12985r0 = this.f44823x;
        if (c12985r0 == null || c12985r0.equals(c12977n0)) {
            return null;
        }
        C12985r0 c12985r1 = this.f44823x;
        AbstractC22676k.m65747g(c12985r1);
        return c12985r1.m36486r(i13, this, c12977n1, z4);
    }

    /* JADX INFO: renamed from: t */
    public final C12972l0 m36487t(C12969k0 navDeepLinkRequest, boolean z4, C12985r0 c12985r0) {
        C12972l0 c12972l0M36487t;
        AbstractC22676k.m65750j(navDeepLinkRequest, "navDeepLinkRequest");
        C12972l0 c12972l0Mo36468j = super.mo36468j(navDeepLinkRequest);
        ArrayList arrayList = new ArrayList();
        C12983q0 c12983q0 = new C12983q0(this);
        while (true) {
            c12972l0M36487t = null;
            if (!c12983q0.hasNext()) {
                break;
            }
            C12977n0 c12977n0 = (C12977n0) c12983q0.next();
            c12972l0M36487t = AbstractC22676k.m65745e(c12977n0, c12985r0) ? null : c12977n0.mo36468j(navDeepLinkRequest);
            if (c12972l0M36487t != null) {
                arrayList.add(c12972l0M36487t);
            }
        }
        C12972l0 c12972l0 = (C12972l0) AbstractC25265s.m74115S0(arrayList);
        C12985r0 c12985r1 = this.f44823x;
        if (c12985r1 != null && z4 && !c12985r1.equals(c12985r0)) {
            c12972l0M36487t = c12985r1.m36487t(navDeepLinkRequest, true, this);
        }
        return (C12972l0) AbstractC25265s.m74115S0(AbstractC25260n.m74077r0(new C12972l0[]{c12972l0Mo36468j, c12972l0, c12972l0M36487t}));
    }

    @Override // p114eb.C12977n0
    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(super.toString());
        String str = this.f44858O;
        C12977n0 c12977n0M36485q = (str == null || AbstractC39414r.m125890i0(str)) ? null : m36485q(str, true);
        if (c12977n0M36485q == null) {
            c12977n0M36485q = m36486r(this.f44856M, this, null, false);
        }
        sb4.append(" startDestination=");
        if (c12977n0M36485q == null) {
            String str2 = this.f44858O;
            if (str2 != null) {
                sb4.append(str2);
            } else {
                String str3 = this.f44857N;
                if (str3 != null) {
                    sb4.append(str3);
                } else {
                    sb4.append("0x" + Integer.toHexString(this.f44856M));
                }
            }
        } else {
            sb4.append("{");
            sb4.append(c12977n0M36485q.toString());
            sb4.append("}");
        }
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "sb.toString()");
        return string;
    }

    /* JADX INFO: renamed from: u */
    public final C12972l0 m36488u(String route, boolean z4, C12985r0 c12985r0) {
        C12972l0 c12972l0M36488u;
        AbstractC22676k.m65750j(route, "route");
        C12972l0 c12972l0M36469l = m36469l(route);
        ArrayList arrayList = new ArrayList();
        C12983q0 c12983q0 = new C12983q0(this);
        while (true) {
            c12972l0M36488u = null;
            if (!c12983q0.hasNext()) {
                break;
            }
            C12977n0 c12977n0 = (C12977n0) c12983q0.next();
            if (!AbstractC22676k.m65745e(c12977n0, c12985r0)) {
                c12972l0M36488u = c12977n0 instanceof C12985r0 ? ((C12985r0) c12977n0).m36488u(route, false, this) : c12977n0.m36469l(route);
            }
            if (c12972l0M36488u != null) {
                arrayList.add(c12972l0M36488u);
            }
        }
        C12972l0 c12972l0 = (C12972l0) AbstractC25265s.m74115S0(arrayList);
        C12985r0 c12985r1 = this.f44823x;
        if (c12985r1 != null && z4 && !c12985r1.equals(c12985r0)) {
            c12972l0M36488u = c12985r1.m36488u(route, true, this);
        }
        return (C12972l0) AbstractC25265s.m74115S0(AbstractC25260n.m74077r0(new C12972l0[]{c12972l0M36469l, c12972l0, c12972l0M36488u}));
    }

    /* JADX INFO: renamed from: v */
    public final void m36489v(String str) {
        int iHashCode;
        if (str == null) {
            iHashCode = 0;
        } else {
            if (str.equals(this.f44820I)) {
                throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
            }
            if (AbstractC39414r.m125890i0(str)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            iHashCode = "android-app://androidx.navigation/".concat(str).hashCode();
        }
        this.f44856M = iHashCode;
        this.f44858O = str;
    }
}
