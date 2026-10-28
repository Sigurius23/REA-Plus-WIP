package si;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import dj.AbstractC12062g;
import dj.AbstractC12064i;
import dj.C12056a;
import java.util.ArrayList;
import java.util.List;
import p078d1.C11457j;
import p426qi.C30402w;
import p426qi.InterfaceC30372a0;
import p462ri.C31441a;
import p502ti.AbstractC33821d;
import p502ti.C33822e;
import p502ti.C33825h;
import p502ti.C33835r;
import p502ti.InterfaceC33818a;
import p584wi.C37305e;
import p616xi.C38313a;
import p616xi.C38314b;
import p682zi.AbstractC40652b;

/* JADX INFO: renamed from: si.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC32516b implements InterfaceC33818a, InterfaceC32525k, InterfaceC32519e {

    /* JADX INFO: renamed from: e */
    public final C30402w f134700e;

    /* JADX INFO: renamed from: f */
    public final AbstractC40652b f134701f;

    /* JADX INFO: renamed from: h */
    public final float[] f134703h;

    /* JADX INFO: renamed from: i */
    public final C31441a f134704i;

    /* JADX INFO: renamed from: j */
    public final C33825h f134705j;

    /* JADX INFO: renamed from: k */
    public final C33822e f134706k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f134707l;

    /* JADX INFO: renamed from: m */
    public final C33825h f134708m;

    /* JADX INFO: renamed from: n */
    public C33835r f134709n;

    /* JADX INFO: renamed from: o */
    public AbstractC33821d f134710o;

    /* JADX INFO: renamed from: p */
    public float f134711p;

    /* JADX INFO: renamed from: a */
    public final PathMeasure f134696a = new PathMeasure();

    /* JADX INFO: renamed from: b */
    public final Path f134697b = new Path();

    /* JADX INFO: renamed from: c */
    public final Path f134698c = new Path();

    /* JADX INFO: renamed from: d */
    public final RectF f134699d = new RectF();

    /* JADX INFO: renamed from: g */
    public final ArrayList f134702g = new ArrayList();

    public AbstractC32516b(C30402w c30402w, AbstractC40652b abstractC40652b, Paint.Cap cap, Paint.Join join, float f13, C38313a c38313a, C38314b c38314b, ArrayList arrayList, C38314b c38314b2) {
        C31441a c31441a = new C31441a(1);
        this.f134704i = c31441a;
        this.f134711p = 0.0f;
        this.f134700e = c30402w;
        this.f134701f = abstractC40652b;
        c31441a.setStyle(Paint.Style.STROKE);
        c31441a.setStrokeCap(cap);
        c31441a.setStrokeJoin(join);
        c31441a.setStrokeMiter(f13);
        this.f134706k = (C33822e) c38313a.mo84473k0();
        this.f134705j = c38314b.mo84473k0();
        if (c38314b2 == null) {
            this.f134708m = null;
        } else {
            this.f134708m = c38314b2.mo84473k0();
        }
        this.f134707l = new ArrayList(arrayList.size());
        this.f134703h = new float[arrayList.size()];
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            this.f134707l.add(((C38314b) arrayList.get(i13)).mo84473k0());
        }
        abstractC40652b.m131926f(this.f134706k);
        abstractC40652b.m131926f(this.f134705j);
        for (int i14 = 0; i14 < this.f134707l.size(); i14++) {
            abstractC40652b.m131926f((AbstractC33821d) this.f134707l.get(i14));
        }
        C33825h c33825h = this.f134708m;
        if (c33825h != null) {
            abstractC40652b.m131926f(c33825h);
        }
        this.f134706k.m106977a(this);
        this.f134705j.m106977a(this);
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            ((AbstractC33821d) this.f134707l.get(i15)).m106977a(this);
        }
        C33825h c33825h2 = this.f134708m;
        if (c33825h2 != null) {
            c33825h2.m106977a(this);
        }
        if (abstractC40652b.mo131929j() != null) {
            C33825h c33825hMo84473k0 = abstractC40652b.mo131929j().m108296l().mo84473k0();
            this.f134710o = c33825hMo84473k0;
            c33825hMo84473k0.m106977a(this);
            abstractC40652b.m131926f(this.f134710o);
        }
    }

    @Override // p502ti.InterfaceC33818a
    /* JADX INFO: renamed from: a */
    public final void mo101529a() {
        this.f134700e.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:39:0x0062 A[SYNTHETIC] */
    @Override // si.InterfaceC32517c
    /* JADX INFO: renamed from: b */
    public final void mo101530b(List list, List list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        C32515a c32515a = null;
        C32534t c32534t = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            InterfaceC32517c interfaceC32517c = (InterfaceC32517c) arrayList2.get(size);
            if (interfaceC32517c instanceof C32534t) {
                C32534t c32534t2 = (C32534t) interfaceC32517c;
                if (c32534t2.f134836c == 2) {
                    c32534t = c32534t2;
                }
            }
        }
        if (c32534t != null) {
            c32534t.m101544d(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.f134702g;
            if (size2 < 0) {
                break;
            }
            InterfaceC32517c interfaceC32517c2 = (InterfaceC32517c) list2.get(size2);
            if (interfaceC32517c2 instanceof C32534t) {
                C32534t c32534t3 = (C32534t) interfaceC32517c2;
                if (c32534t3.f134836c == 2) {
                    if (c32515a != null) {
                        arrayList.add(c32515a);
                    }
                    C32515a c32515a2 = new C32515a(c32534t3);
                    c32534t3.m101544d(this);
                    c32515a = c32515a2;
                } else if (!(interfaceC32517c2 instanceof InterfaceC32527m)) {
                    if (c32515a == null) {
                        c32515a = new C32515a(c32534t);
                    }
                    c32515a.f134694a.add((InterfaceC32527m) interfaceC32517c2);
                }
            } else if (!(interfaceC32517c2 instanceof InterfaceC32527m)) {
                if (c32515a == null) {
                    c32515a = new C32515a(c32534t);
                }
                c32515a.f134694a.add((InterfaceC32527m) interfaceC32517c2);
            }
        }
        if (c32515a != null) {
            arrayList.add(c32515a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x01f0  */
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
    @Override // si.InterfaceC32519e
    /* JADX INFO: renamed from: c */
    public void mo101531c(Canvas canvas, Matrix matrix, int i13, C12056a c12056a) {
        int i14;
        float f13;
        MaskFilter maskFilter;
        float[] fArr;
        AbstractC32516b abstractC32516b = this;
        float[] fArr2 = (float[]) AbstractC12064i.f40035e.get();
        boolean z4 = false;
        fArr2[0] = 0.0f;
        int i15 = 1;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (fArr2[0] == fArr2[2] || fArr2[1] == fArr2[3]) {
            return;
        }
        float f14 = 100.0f;
        float fIntValue = ((Integer) abstractC32516b.f134706k.mo106981e()).intValue() / 100.0f;
        int iM33253c = AbstractC12062g.m33253c((int) (i13 * fIntValue));
        C31441a c31441a = abstractC32516b.f134704i;
        c31441a.setAlpha(iM33253c);
        c31441a.setStrokeWidth(abstractC32516b.f134705j.m106991l());
        if (c31441a.getStrokeWidth() <= 0.0f) {
            return;
        }
        ArrayList arrayList = abstractC32516b.f134707l;
        if (!arrayList.isEmpty()) {
            int i16 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = abstractC32516b.f134703h;
                if (i16 >= size) {
                    break;
                }
                float fFloatValue = ((Float) ((AbstractC33821d) arrayList.get(i16)).mo106981e()).floatValue();
                fArr[i16] = fFloatValue;
                if (i16 % 2 == 0) {
                    if (fFloatValue < 1.0f) {
                        fArr[i16] = 1.0f;
                    }
                } else if (fFloatValue < 0.1f) {
                    fArr[i16] = 0.1f;
                }
                i16++;
            }
            C33825h c33825h = abstractC32516b.f134708m;
            c31441a.setPathEffect(new DashPathEffect(fArr, c33825h == null ? 0.0f : ((Float) c33825h.mo106981e()).floatValue()));
        }
        C33835r c33835r = abstractC32516b.f134709n;
        if (c33835r != null) {
            c31441a.setColorFilter((ColorFilter) c33835r.mo106981e());
        }
        AbstractC33821d abstractC33821d = abstractC32516b.f134710o;
        if (abstractC33821d != null) {
            float fFloatValue2 = ((Float) abstractC33821d.mo106981e()).floatValue();
            if (fFloatValue2 == 0.0f) {
                c31441a.setMaskFilter(null);
            } else if (fFloatValue2 != abstractC32516b.f134711p) {
                AbstractC40652b abstractC40652b = abstractC32516b.f134701f;
                if (abstractC40652b.f175460A == fFloatValue2) {
                    maskFilter = abstractC40652b.f175461B;
                } else {
                    BlurMaskFilter blurMaskFilter = new BlurMaskFilter(fFloatValue2 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    abstractC40652b.f175461B = blurMaskFilter;
                    abstractC40652b.f175460A = fFloatValue2;
                    maskFilter = blurMaskFilter;
                }
                c31441a.setMaskFilter(maskFilter);
            }
            abstractC32516b.f134711p = fFloatValue2;
        }
        if (c12056a != null) {
            c12056a.m33235a((int) (fIntValue * 255.0f), c31441a);
        }
        canvas.save();
        canvas.concat(matrix);
        int i17 = 0;
        while (true) {
            ArrayList arrayList2 = abstractC32516b.f134702g;
            if (i17 >= arrayList2.size()) {
                canvas.restore();
                return;
            }
            C32515a c32515a = (C32515a) arrayList2.get(i17);
            C32534t c32534t = c32515a.f134695b;
            ArrayList arrayList3 = c32515a.f134694a;
            Path path = abstractC32516b.f134697b;
            if (c32534t != null) {
                path.reset();
                for (int size2 = arrayList3.size() - i15; size2 >= 0; size2--) {
                    path.addPath(((InterfaceC32527m) arrayList3.get(size2)).getPath());
                }
                float fFloatValue3 = ((Float) c32534t.f134837d.mo106981e()).floatValue() / f14;
                float fFloatValue4 = ((Float) c32534t.f134838e.mo106981e()).floatValue() / f14;
                float fFloatValue5 = ((Float) c32534t.f134839f.mo106981e()).floatValue() / 360.0f;
                if (fFloatValue3 >= 0.01f || fFloatValue4 <= 0.99f) {
                    PathMeasure pathMeasure = abstractC32516b.f134696a;
                    pathMeasure.setPath(path, z4);
                    float length = pathMeasure.getLength();
                    while (pathMeasure.nextContour()) {
                        length += pathMeasure.getLength();
                    }
                    float f15 = fFloatValue5 * length;
                    float f16 = (fFloatValue3 * length) + f15;
                    float fMin = Math.min((fFloatValue4 * length) + f15, (f16 + length) - 1.0f);
                    int size3 = arrayList3.size() - i15;
                    float f17 = 0.0f;
                    while (size3 >= 0) {
                        int i18 = i15;
                        Path path2 = ((InterfaceC32527m) arrayList3.get(size3)).getPath();
                        Path path3 = abstractC32516b.f134698c;
                        path3.set(path2);
                        pathMeasure.setPath(path3, z4);
                        float length2 = pathMeasure.getLength();
                        if (fMin > length) {
                            float f18 = fMin - length;
                            if (f18 >= f17 + length2 || f17 >= f18) {
                                f13 = f17 + length2;
                                if (f13 < f16 && f17 <= fMin) {
                                    if (f13 > fMin || f16 >= f17) {
                                        AbstractC12064i.m33263a(path3, f16 < f17 ? 0.0f : (f16 - f17) / length2, fMin > f13 ? 1.0f : (fMin - f17) / length2, 0.0f);
                                        canvas.drawPath(path3, c31441a);
                                    } else {
                                        canvas.drawPath(path3, c31441a);
                                    }
                                }
                            } else {
                                AbstractC12064i.m33263a(path3, f16 > length ? (f16 - length) / length2 : 0.0f, Math.min(f18 / length2, 1.0f), 0.0f);
                                canvas.drawPath(path3, c31441a);
                            }
                        } else {
                            f13 = f17 + length2;
                            if (f13 < f16) {
                            }
                        }
                        f17 += length2;
                        size3--;
                        abstractC32516b = this;
                        i15 = i18;
                        z4 = false;
                    }
                } else {
                    canvas.drawPath(path, c31441a);
                }
                i14 = i15;
            } else {
                i14 = i15;
                path.reset();
                for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                    path.addPath(((InterfaceC32527m) arrayList3.get(size4)).getPath());
                }
                canvas.drawPath(path, c31441a);
            }
            i17++;
            abstractC32516b = this;
            i15 = i14;
            z4 = false;
            f14 = 100.0f;
        }
    }

    @Override // p584wi.InterfaceC37306f
    /* JADX INFO: renamed from: d */
    public final void mo101532d(C37305e c37305e, int i13, ArrayList arrayList, C37305e c37305e2) {
        AbstractC12062g.m33257g(c37305e, i13, arrayList, c37305e2, this);
    }

    @Override // si.InterfaceC32519e
    /* JADX INFO: renamed from: e */
    public final void mo101533e(RectF rectF, Matrix matrix, boolean z4) {
        Path path = this.f134697b;
        path.reset();
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f134702g;
            if (i13 >= arrayList.size()) {
                RectF rectF2 = this.f134699d;
                path.computeBounds(rectF2, false);
                float fM106991l = this.f134705j.m106991l() / 2.0f;
                rectF2.set(rectF2.left - fM106991l, rectF2.top - fM106991l, rectF2.right + fM106991l, rectF2.bottom + fM106991l);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
            C32515a c32515a = (C32515a) arrayList.get(i13);
            for (int i14 = 0; i14 < c32515a.f134694a.size(); i14++) {
                path.addPath(((InterfaceC32527m) c32515a.f134694a.get(i14)).getPath(), matrix);
            }
            i13++;
        }
    }

    @Override // p584wi.InterfaceC37306f
    /* JADX INFO: renamed from: g */
    public void mo101534g(C11457j c11457j, Object obj) {
        PointF pointF = InterfaceC30372a0.f124620a;
        if (obj == 4) {
            this.f134706k.m106986j(c11457j);
            return;
        }
        if (obj == InterfaceC30372a0.f124633n) {
            this.f134705j.m106986j(c11457j);
            return;
        }
        ColorFilter colorFilter = InterfaceC30372a0.f124614F;
        AbstractC40652b abstractC40652b = this.f134701f;
        if (obj == colorFilter) {
            C33835r c33835r = this.f134709n;
            if (c33835r != null) {
                abstractC40652b.m131932m(c33835r);
            }
            if (c11457j == null) {
                this.f134709n = null;
                return;
            }
            C33835r c33835r2 = new C33835r(c11457j, null);
            this.f134709n = c33835r2;
            c33835r2.m106977a(this);
            abstractC40652b.m131926f(this.f134709n);
            return;
        }
        if (obj == InterfaceC30372a0.f124624e) {
            AbstractC33821d abstractC33821d = this.f134710o;
            if (abstractC33821d != null) {
                abstractC33821d.m106986j(c11457j);
                return;
            }
            C33835r c33835r3 = new C33835r(c11457j, null);
            this.f134710o = c33835r3;
            c33835r3.m106977a(this);
            abstractC40652b.m131926f(this.f134710o);
        }
    }
}
