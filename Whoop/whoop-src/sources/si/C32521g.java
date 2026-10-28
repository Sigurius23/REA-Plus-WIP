package si;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import dj.AbstractC12062g;
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
import p649yi.C39558m;
import p682zi.AbstractC40652b;

/* JADX INFO: renamed from: si.g */
/* JADX INFO: loaded from: classes.dex */
public final class C32521g implements InterfaceC32519e, InterfaceC33818a, InterfaceC32525k {

    /* JADX INFO: renamed from: a */
    public final Path f134732a;

    /* JADX INFO: renamed from: b */
    public final C31441a f134733b;

    /* JADX INFO: renamed from: c */
    public final AbstractC40652b f134734c;

    /* JADX INFO: renamed from: d */
    public final String f134735d;

    /* JADX INFO: renamed from: e */
    public final boolean f134736e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f134737f;

    /* JADX INFO: renamed from: g */
    public final C33822e f134738g;

    /* JADX INFO: renamed from: h */
    public final C33822e f134739h;

    /* JADX INFO: renamed from: i */
    public C33835r f134740i;

    /* JADX INFO: renamed from: j */
    public final C30402w f134741j;

    /* JADX INFO: renamed from: k */
    public AbstractC33821d f134742k;

    /* JADX INFO: renamed from: l */
    public float f134743l;

    public C32521g(C30402w c30402w, AbstractC40652b abstractC40652b, C39558m c39558m) {
        Path path = new Path();
        this.f134732a = path;
        this.f134733b = new C31441a(1);
        this.f134737f = new ArrayList();
        this.f134734c = abstractC40652b;
        String str = c39558m.f170188c;
        C38313a c38313a = c39558m.f170190e;
        C38313a c38313a2 = c39558m.f170189d;
        this.f134735d = str;
        this.f134736e = c39558m.f170191f;
        this.f134741j = c30402w;
        if (abstractC40652b.mo131929j() != null) {
            C33825h c33825hMo84473k0 = abstractC40652b.mo131929j().m108296l().mo84473k0();
            this.f134742k = c33825hMo84473k0;
            c33825hMo84473k0.m106977a(this);
            abstractC40652b.m131926f(this.f134742k);
        }
        if (c38313a2 == null) {
            this.f134738g = null;
            this.f134739h = null;
            return;
        }
        path.setFillType(c39558m.f170187b);
        AbstractC33821d abstractC33821dMo84473k0 = c38313a2.mo84473k0();
        this.f134738g = (C33822e) abstractC33821dMo84473k0;
        abstractC33821dMo84473k0.m106977a(this);
        abstractC40652b.m131926f(abstractC33821dMo84473k0);
        AbstractC33821d abstractC33821dMo84473k1 = c38313a.mo84473k0();
        this.f134739h = (C33822e) abstractC33821dMo84473k1;
        abstractC33821dMo84473k1.m106977a(this);
        abstractC40652b.m131926f(abstractC33821dMo84473k1);
    }

    @Override // p502ti.InterfaceC33818a
    /* JADX INFO: renamed from: a */
    public final void mo101529a() {
        this.f134741j.invalidateSelf();
    }

    @Override // si.InterfaceC32517c
    /* JADX INFO: renamed from: b */
    public final void mo101530b(List list, List list2) {
        for (int i13 = 0; i13 < list2.size(); i13++) {
            InterfaceC32517c interfaceC32517c = (InterfaceC32517c) list2.get(i13);
            if (interfaceC32517c instanceof InterfaceC32527m) {
                this.f134737f.add((InterfaceC32527m) interfaceC32517c);
            }
        }
    }

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
    public final void mo101531c(Canvas canvas, Matrix matrix, int i13, C12056a c12056a) {
        MaskFilter maskFilter;
        if (this.f134736e) {
            return;
        }
        C33822e c33822e = this.f134738g;
        int iM106988l = c33822e.m106988l(c33822e.f141647c.mo9719b(), c33822e.m106979c());
        float fIntValue = ((Integer) this.f134739h.mo106981e()).intValue() / 100.0f;
        int iM33253c = (AbstractC12062g.m33253c((int) (i13 * fIntValue)) << 24) | (iM106988l & 16777215);
        C31441a c31441a = this.f134733b;
        c31441a.setColor(iM33253c);
        C33835r c33835r = this.f134740i;
        if (c33835r != null) {
            c31441a.setColorFilter((ColorFilter) c33835r.mo106981e());
        }
        AbstractC33821d abstractC33821d = this.f134742k;
        if (abstractC33821d != null) {
            float fFloatValue = ((Float) abstractC33821d.mo106981e()).floatValue();
            if (fFloatValue == 0.0f) {
                c31441a.setMaskFilter(null);
            } else if (fFloatValue != this.f134743l) {
                AbstractC40652b abstractC40652b = this.f134734c;
                if (abstractC40652b.f175460A == fFloatValue) {
                    maskFilter = abstractC40652b.f175461B;
                } else {
                    BlurMaskFilter blurMaskFilter = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    abstractC40652b.f175461B = blurMaskFilter;
                    abstractC40652b.f175460A = fFloatValue;
                    maskFilter = blurMaskFilter;
                }
                c31441a.setMaskFilter(maskFilter);
            }
            this.f134743l = fFloatValue;
        }
        if (c12056a != null) {
            c12056a.m33235a((int) (fIntValue * 255.0f), c31441a);
        } else {
            c31441a.clearShadowLayer();
        }
        Path path = this.f134732a;
        path.reset();
        int i14 = 0;
        while (true) {
            ArrayList arrayList = this.f134737f;
            if (i14 >= arrayList.size()) {
                canvas.drawPath(path, c31441a);
                return;
            } else {
                path.addPath(((InterfaceC32527m) arrayList.get(i14)).getPath(), matrix);
                i14++;
            }
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
        Path path = this.f134732a;
        path.reset();
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f134737f;
            if (i13 >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((InterfaceC32527m) arrayList.get(i13)).getPath(), matrix);
                i13++;
            }
        }
    }

    @Override // p584wi.InterfaceC37306f
    /* JADX INFO: renamed from: g */
    public final void mo101534g(C11457j c11457j, Object obj) {
        PointF pointF = InterfaceC30372a0.f124620a;
        if (obj == 1) {
            this.f134738g.m106986j(c11457j);
            return;
        }
        if (obj == 4) {
            this.f134739h.m106986j(c11457j);
            return;
        }
        ColorFilter colorFilter = InterfaceC30372a0.f124614F;
        AbstractC40652b abstractC40652b = this.f134734c;
        if (obj == colorFilter) {
            C33835r c33835r = this.f134740i;
            if (c33835r != null) {
                abstractC40652b.m131932m(c33835r);
            }
            if (c11457j == null) {
                this.f134740i = null;
                return;
            }
            C33835r c33835r2 = new C33835r(c11457j, null);
            this.f134740i = c33835r2;
            c33835r2.m106977a(this);
            abstractC40652b.m131926f(this.f134740i);
            return;
        }
        if (obj == InterfaceC30372a0.f124624e) {
            AbstractC33821d abstractC33821d = this.f134742k;
            if (abstractC33821d != null) {
                abstractC33821d.m106986j(c11457j);
                return;
            }
            C33835r c33835r3 = new C33835r(c11457j, null);
            this.f134742k = c33835r3;
            c33835r3.m106977a(this);
            abstractC40652b.m131926f(this.f134742k);
        }
    }

    @Override // si.InterfaceC32517c
    public final String getName() {
        return this.f134735d;
    }
}
