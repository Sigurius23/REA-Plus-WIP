package p682zi;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.RectF;
import b30.C2570m;
import bd3.C3143v;
import com.whoop.universalcheckout.features.shippingaddress.domain.models.ShippingAddressField;
import dj.AbstractC12058c;
import dj.C12056a;
import dj.C12063h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p002a0.C0062y;
import p078d1.C11457j;
import p108e4.AbstractC12682p;
import p426qi.C30387i;
import p426qi.C30402w;
import p426qi.InterfaceC30372a0;
import p502ti.AbstractC33821d;
import p502ti.C33824g;
import p502ti.C33825h;
import p502ti.C33835r;
import p584wi.C37305e;
import p616xi.C38314b;

/* JADX INFO: renamed from: zi.c */
/* JADX INFO: loaded from: classes.dex */
public final class C40653c extends AbstractC40652b {

    /* JADX INFO: renamed from: D */
    public AbstractC33821d f175489D;

    /* JADX INFO: renamed from: E */
    public final ArrayList f175490E;

    /* JADX INFO: renamed from: F */
    public final RectF f175491F;

    /* JADX INFO: renamed from: G */
    public final RectF f175492G;

    /* JADX INFO: renamed from: H */
    public final RectF f175493H;

    /* JADX INFO: renamed from: I */
    public final C12063h f175494I;

    /* JADX INFO: renamed from: J */
    public final C3143v f175495J;

    /* JADX INFO: renamed from: K */
    public float f175496K;

    /* JADX INFO: renamed from: L */
    public boolean f175497L;

    /* JADX INFO: renamed from: M */
    public final C33824g f175498M;

    public C40653c(C30402w c30402w, C40655e c40655e, List list, C30387i c30387i) {
        AbstractC40652b abstractC40652b;
        AbstractC40652b c40653c;
        String str;
        super(c30402w, c40655e);
        this.f175490E = new ArrayList();
        this.f175491F = new RectF();
        this.f175492G = new RectF();
        this.f175493H = new RectF();
        this.f175494I = new C12063h();
        this.f175495J = new C3143v(2, (byte) 0);
        this.f175497L = true;
        C38314b c38314b = c40655e.f175527s;
        if (c38314b != null) {
            C33825h c33825hMo84473k0 = c38314b.mo84473k0();
            this.f175489D = c33825hMo84473k0;
            m131926f(c33825hMo84473k0);
            this.f175489D.m106977a(this);
        } else {
            this.f175489D = null;
        }
        C0062y c0062y = new C0062y(c30387i.f124690j.size());
        int size = list.size() - 1;
        AbstractC40652b abstractC40652b2 = null;
        while (true) {
            if (size < 0) {
                for (int i13 = 0; i13 < c0062y.m157i(); i13++) {
                    AbstractC40652b abstractC40652b3 = (AbstractC40652b) c0062y.m151c(c0062y.m154f(i13));
                    if (abstractC40652b3 != null && (abstractC40652b = (AbstractC40652b) c0062y.m151c(abstractC40652b3.f175478p.f175514f)) != null) {
                        abstractC40652b3.f175482t = abstractC40652b;
                    }
                }
                C2570m c2570m = this.f175478p.f175532x;
                if (c2570m != null) {
                    this.f175498M = new C33824g(this, this, c2570m);
                    return;
                }
                return;
            }
            C40655e c40655e2 = (C40655e) list.get(size);
            int iM35485e = AbstractC12682p.m35485e(c40655e2.f175513e);
            if (iM35485e == 0) {
                c40653c = new C40653c(c30402w, c40655e2, (List) c30387i.f124683c.get(c40655e2.f175515g), c30387i);
            } else if (iM35485e == 1) {
                c40653c = new C40658h(c30402w, c40655e2);
            } else if (iM35485e == 2) {
                c40653c = new C40654d(c30402w, c40655e2);
            } else if (iM35485e == 3) {
                c40653c = new C40656f(c30402w, c40655e2);
            } else if (iM35485e == 4) {
                c40653c = new C40657g(c30402w, c40655e2, this, c30387i);
            } else if (iM35485e != 5) {
                switch (c40655e2.f175513e) {
                    case 1:
                        str = "PRE_COMP";
                        break;
                    case 2:
                        str = "SOLID";
                        break;
                    case 3:
                        str = "IMAGE";
                        break;
                    case 4:
                        str = "NULL";
                        break;
                    case 5:
                        str = "SHAPE";
                        break;
                    case 6:
                        str = ShippingAddressField.TEXT_FIELD_TYPE;
                        break;
                    case 7:
                        str = "UNKNOWN";
                        break;
                    default:
                        str = "null";
                        break;
                }
                AbstractC12058c.m33239b("Unknown layer type ".concat(str));
                c40653c = null;
            } else {
                c40653c = new C40661k(c30402w, c40655e2);
            }
            if (c40653c != null) {
                c0062y.m155g(c40653c.f175478p.f175512d, c40653c);
                if (abstractC40652b2 != null) {
                    abstractC40652b2.f175481s = c40653c;
                    abstractC40652b2 = null;
                } else {
                    this.f175490E.add(0, c40653c);
                    int iM35485e2 = AbstractC12682p.m35485e(c40655e2.f175529u);
                    if (iM35485e2 == 1 || iM35485e2 == 2) {
                        abstractC40652b2 = c40653c;
                    }
                }
            }
            size--;
        }
    }

    @Override // p682zi.AbstractC40652b, si.InterfaceC32519e
    /* JADX INFO: renamed from: e */
    public final void mo101533e(RectF rectF, Matrix matrix, boolean z4) {
        super.mo101533e(rectF, matrix, z4);
        ArrayList arrayList = this.f175490E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.f175491F;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((AbstractC40652b) arrayList.get(size)).mo101533e(rectF2, this.f175476n, true);
            rectF.union(rectF2);
        }
    }

    @Override // p682zi.AbstractC40652b, p584wi.InterfaceC37306f
    /* JADX INFO: renamed from: g */
    public final void mo101534g(C11457j c11457j, Object obj) {
        super.mo101534g(c11457j, obj);
        if (obj == InterfaceC30372a0.f124645z) {
            if (c11457j == null) {
                AbstractC33821d abstractC33821d = this.f175489D;
                if (abstractC33821d != null) {
                    abstractC33821d.m106986j(null);
                    return;
                }
                return;
            }
            C33835r c33835r = new C33835r(c11457j, null);
            this.f175489D = c33835r;
            c33835r.m106977a(this);
            m131926f(this.f175489D);
            return;
        }
        C33824g c33824g = this.f175498M;
        if (obj == 5 && c33824g != null) {
            c33824g.f141658c.m106986j(c11457j);
            return;
        }
        if (obj == InterfaceC30372a0.f124610B && c33824g != null) {
            c33824g.m106990c(c11457j);
            return;
        }
        if (obj == InterfaceC30372a0.f124611C && c33824g != null) {
            c33824g.f141660e.m106986j(c11457j);
            return;
        }
        if (obj == InterfaceC30372a0.f124612D && c33824g != null) {
            c33824g.f141661f.m106986j(c11457j);
        } else {
            if (obj != InterfaceC30372a0.f124613E || c33824g == null) {
                return;
            }
            c33824g.f141662g.m106986j(c11457j);
        }
    }

    @Override // p682zi.AbstractC40652b
    /* JADX INFO: renamed from: i */
    public final void mo131928i(Canvas canvas, Matrix matrix, int i13, C12056a c12056a) {
        Canvas canvasM33262e;
        boolean z4 = false;
        C33824g c33824g = this.f175498M;
        boolean z13 = (c12056a == null && c33824g == null) ? false : true;
        C30402w c30402w = this.f175477o;
        boolean z14 = c30402w.f124745S;
        ArrayList<AbstractC40652b> arrayList = this.f175490E;
        if ((z14 && arrayList.size() > 1 && i13 != 255) || (z13 && c30402w.f124746T)) {
            z4 = true;
        }
        int i14 = z4 ? 255 : i13;
        if (c33824g != null) {
            c12056a = c33824g.m106989b(matrix, i14);
        }
        boolean z15 = this.f175497L;
        C40655e c40655e = this.f175478p;
        RectF rectF = this.f175492G;
        if (z15 || !"__container".equals(c40655e.f175511c)) {
            rectF.set(0.0f, 0.0f, c40655e.f175523o, c40655e.f175524p);
            matrix.mapRect(rectF);
        } else {
            rectF.setEmpty();
            for (AbstractC40652b abstractC40652b : arrayList) {
                RectF rectF2 = this.f175493H;
                abstractC40652b.mo101533e(rectF2, matrix, true);
                rectF.union(rectF2);
            }
        }
        C12063h c12063h = this.f175494I;
        if (z4) {
            C3143v c3143v = this.f175495J;
            c3143v.f12311y = null;
            c3143v.f12310x = i13;
            if (c12056a != null) {
                if (Color.alpha(c12056a.f39979d) > 0) {
                    c3143v.f12311y = c12056a;
                } else {
                    c3143v.f12311y = null;
                }
                c12056a = null;
            }
            canvasM33262e = c12063h.m33262e(canvas, rectF, c3143v);
        } else {
            canvasM33262e = canvas;
        }
        canvas.save();
        if (canvas.clipRect(rectF)) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC40652b) arrayList.get(size)).mo101531c(canvasM33262e, matrix, i14, c12056a);
            }
        }
        if (z4) {
            c12063h.m33261c();
        }
        canvas.restore();
    }

    @Override // p682zi.AbstractC40652b
    /* JADX INFO: renamed from: n */
    public final void mo131933n(C37305e c37305e, int i13, ArrayList arrayList, C37305e c37305e2) {
        int i14 = 0;
        while (true) {
            ArrayList arrayList2 = this.f175490E;
            if (i14 >= arrayList2.size()) {
                return;
            }
            ((AbstractC40652b) arrayList2.get(i14)).mo101532d(c37305e, i13, arrayList, c37305e2);
            i14++;
        }
    }

    @Override // p682zi.AbstractC40652b
    /* JADX INFO: renamed from: o */
    public final void mo131934o(boolean z4) {
        super.mo131934o(z4);
        Iterator it = this.f175490E.iterator();
        while (it.hasNext()) {
            ((AbstractC40652b) it.next()).mo131934o(z4);
        }
    }

    @Override // p682zi.AbstractC40652b
    /* JADX INFO: renamed from: p */
    public final void mo131935p(float f13) {
        this.f175496K = f13;
        super.mo131935p(f13);
        AbstractC33821d abstractC33821d = this.f175489D;
        C40655e c40655e = this.f175478p;
        if (abstractC33821d != null) {
            C30387i c30387i = this.f175477o.f124769w;
            f13 = ((((Float) abstractC33821d.mo106981e()).floatValue() * c40655e.f175510b.f124694n) - c40655e.f175510b.f124692l) / ((c30387i.f124693m - c30387i.f124692l) + 0.01f);
        }
        if (this.f175489D == null) {
            float f14 = c40655e.f175522n;
            C30387i c30387i2 = c40655e.f175510b;
            f13 -= f14 / (c30387i2.f124693m - c30387i2.f124692l);
        }
        if (c40655e.f175521m != 0.0f && !"__container".equals(c40655e.f175511c)) {
            f13 /= c40655e.f175521m;
        }
        ArrayList arrayList = this.f175490E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((AbstractC40652b) arrayList.get(size)).mo131935p(f13);
        }
    }
}
