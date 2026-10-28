package p682zi;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import dj.AbstractC12064i;
import dj.C12056a;
import dj.C12061f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p002a0.C0007b;
import p002a0.C0025h;
import p078d1.C11457j;
import p108e4.AbstractC12682p;
import p426qi.C30380e0;
import p426qi.C30402w;
import p462ri.C31441a;
import p474s.C31983m2;
import p502ti.AbstractC33821d;
import p502ti.C33825h;
import p502ti.C33830m;
import p502ti.C33834q;
import p502ti.InterfaceC33818a;
import p508ty.C34249c;
import p543v4.AbstractC35644c;
import p584wi.C37305e;
import p584wi.InterfaceC37306f;
import p616xi.C38317e;
import p649yi.C39551f;
import si.InterfaceC32519e;

/* JADX INFO: renamed from: zi.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC40652b implements InterfaceC32519e, InterfaceC33818a, InterfaceC37306f {

    /* JADX INFO: renamed from: A */
    public float f175460A;

    /* JADX INFO: renamed from: B */
    public BlurMaskFilter f175461B;

    /* JADX INFO: renamed from: C */
    public C31441a f175462C;

    /* JADX INFO: renamed from: a */
    public final Path f175463a = new Path();

    /* JADX INFO: renamed from: b */
    public final Matrix f175464b = new Matrix();

    /* JADX INFO: renamed from: c */
    public final Matrix f175465c = new Matrix();

    /* JADX INFO: renamed from: d */
    public final C31441a f175466d = new C31441a(1);

    /* JADX INFO: renamed from: e */
    public final C31441a f175467e;

    /* JADX INFO: renamed from: f */
    public final C31441a f175468f;

    /* JADX INFO: renamed from: g */
    public final C31441a f175469g;

    /* JADX INFO: renamed from: h */
    public final C31441a f175470h;

    /* JADX INFO: renamed from: i */
    public final RectF f175471i;

    /* JADX INFO: renamed from: j */
    public final RectF f175472j;

    /* JADX INFO: renamed from: k */
    public final RectF f175473k;

    /* JADX INFO: renamed from: l */
    public final RectF f175474l;

    /* JADX INFO: renamed from: m */
    public final RectF f175475m;

    /* JADX INFO: renamed from: n */
    public final Matrix f175476n;

    /* JADX INFO: renamed from: o */
    public final C30402w f175477o;

    /* JADX INFO: renamed from: p */
    public final C40655e f175478p;

    /* JADX INFO: renamed from: q */
    public final C31983m2 f175479q;

    /* JADX INFO: renamed from: r */
    public final C33825h f175480r;

    /* JADX INFO: renamed from: s */
    public AbstractC40652b f175481s;

    /* JADX INFO: renamed from: t */
    public AbstractC40652b f175482t;

    /* JADX INFO: renamed from: u */
    public List f175483u;

    /* JADX INFO: renamed from: v */
    public final ArrayList f175484v;

    /* JADX INFO: renamed from: w */
    public final C33834q f175485w;

    /* JADX INFO: renamed from: x */
    public boolean f175486x;

    /* JADX INFO: renamed from: y */
    public boolean f175487y;

    /* JADX INFO: renamed from: z */
    public C31441a f175488z;

    public AbstractC40652b(C30402w c30402w, C40655e c40655e) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f175467e = new C31441a(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f175468f = new C31441a(mode2);
        C31441a c31441a = new C31441a(1);
        this.f175469g = c31441a;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        C31441a c31441a2 = new C31441a();
        c31441a2.setXfermode(new PorterDuffXfermode(mode3));
        this.f175470h = c31441a2;
        this.f175471i = new RectF();
        this.f175472j = new RectF();
        this.f175473k = new RectF();
        this.f175474l = new RectF();
        this.f175475m = new RectF();
        this.f175476n = new Matrix();
        this.f175484v = new ArrayList();
        this.f175486x = true;
        this.f175460A = 0.0f;
        this.f175477o = c30402w;
        this.f175478p = c40655e;
        List list = c40655e.f175516h;
        if (c40655e.f175529u == 3) {
            c31441a.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            c31441a.setXfermode(new PorterDuffXfermode(mode));
        }
        C38317e c38317e = c40655e.f175517i;
        c38317e.getClass();
        C33834q c33834q = new C33834q(c38317e);
        this.f175485w = c33834q;
        c33834q.m106999b(this);
        if (list != null && !list.isEmpty()) {
            C31983m2 c31983m2 = new C31983m2();
            c31983m2.f132770y = list;
            c31983m2.f132768w = new ArrayList(list.size());
            c31983m2.f132769x = new ArrayList(list.size());
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((ArrayList) c31983m2.f132768w).add(new C33830m((List) ((C39551f) list.get(i13)).f170156b.f3536x));
                ((ArrayList) c31983m2.f132769x).add(((C39551f) list.get(i13)).f170157c.mo84473k0());
            }
            this.f175479q = c31983m2;
            Iterator it = ((ArrayList) c31983m2.f132768w).iterator();
            while (it.hasNext()) {
                ((AbstractC33821d) it.next()).m106977a(this);
            }
            for (AbstractC33821d abstractC33821d : (ArrayList) this.f175479q.f132769x) {
                m131926f(abstractC33821d);
                abstractC33821d.m106977a(this);
            }
        }
        C40655e c40655e2 = this.f175478p;
        if (c40655e2.f175528t.isEmpty()) {
            if (true != this.f175486x) {
                this.f175486x = true;
                this.f175477o.invalidateSelf();
                return;
            }
            return;
        }
        C33825h c33825h = new C33825h(c40655e2.f175528t);
        this.f175480r = c33825h;
        c33825h.f141646b = true;
        c33825h.m106977a(new InterfaceC33818a() { // from class: zi.a
            @Override // p502ti.InterfaceC33818a
            /* JADX INFO: renamed from: a */
            public final void mo101529a() {
                AbstractC40652b abstractC40652b = this.f175459a;
                boolean z4 = abstractC40652b.f175480r.m106991l() == 1.0f;
                if (z4 != abstractC40652b.f175486x) {
                    abstractC40652b.f175486x = z4;
                    abstractC40652b.f175477o.invalidateSelf();
                }
            }
        });
        boolean z4 = ((Float) this.f175480r.mo106981e()).floatValue() == 1.0f;
        if (z4 != this.f175486x) {
            this.f175486x = z4;
            this.f175477o.invalidateSelf();
        }
        m131926f(this.f175480r);
    }

    @Override // p502ti.InterfaceC33818a
    /* JADX INFO: renamed from: a */
    public final void mo101529a() {
        this.f175477o.invalidateSelf();
    }

    @Override // si.InterfaceC32517c
    /* JADX INFO: renamed from: b */
    public final void mo101530b(List list, List list2) {
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0112  */
    /* JADX WARN: Code duplicated, block: B:57:0x0116  */
    @Override // si.InterfaceC32519e
    /* JADX INFO: renamed from: c */
    public final void mo101531c(Canvas canvas, Matrix matrix, int i13, C12056a c12056a) {
        C31983m2 c31983m2;
        Path path;
        float f13;
        int i14;
        RectF rectF;
        C31441a c31441a;
        int i15;
        float f14;
        Path path2;
        Path path3;
        Integer num;
        Canvas canvas2 = canvas;
        if (this.f175486x) {
            C40655e c40655e = this.f175478p;
            boolean z4 = c40655e.f175530v;
            int i16 = c40655e.f175533y;
            if (z4) {
                return;
            }
            m131927h();
            Matrix matrix2 = this.f175464b;
            matrix2.reset();
            matrix2.set(matrix);
            for (int size = this.f175483u.size() - 1; size >= 0; size--) {
                matrix2.preConcat(((AbstractC40652b) this.f175483u.get(size)).f175485w.m107002e());
            }
            C33834q c33834q = this.f175485w;
            AbstractC33821d abstractC33821d = c33834q.f141696j;
            int iIntValue = (int) ((((i13 / 255.0f) * ((abstractC33821d == null || (num = (Integer) abstractC33821d.mo106981e()) == null) ? 100 : num.intValue())) / 100.0f) * 255.0f);
            if (this.f175481s == null && !m131930k() && i16 == 1) {
                matrix2.preConcat(c33834q.m107002e());
                mo131928i(canvas2, matrix2, iIntValue, c12056a);
                m131931l();
                return;
            }
            RectF rectF2 = this.f175471i;
            mo101533e(rectF2, matrix2, false);
            if (this.f175481s != null && c40655e.f175529u != 3) {
                RectF rectF3 = this.f175474l;
                rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.f175481s.mo101533e(rectF3, matrix, true);
                if (!rectF2.intersect(rectF3)) {
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            matrix2.preConcat(c33834q.m107002e());
            RectF rectF4 = this.f175473k;
            rectF4.set(0.0f, 0.0f, 0.0f, 0.0f);
            boolean zM131930k = m131930k();
            C31983m2 c31983m3 = this.f175479q;
            Path path4 = this.f175463a;
            if (zM131930k) {
                int size2 = ((List) c31983m3.f132770y).size();
                int i17 = 0;
                while (true) {
                    if (i17 < size2) {
                        C39551f c39551f = (C39551f) ((List) c31983m3.f132770y).get(i17);
                        Path path5 = (Path) ((AbstractC33821d) ((ArrayList) c31983m3.f132768w).get(i17)).mo106981e();
                        if (path5 == null) {
                            i14 = size2;
                        } else {
                            path4.set(path5);
                            path4.transform(matrix2);
                            int iM35485e = AbstractC12682p.m35485e(c39551f.f170155a);
                            i14 = size2;
                            if (iM35485e != 0) {
                                if (iM35485e != 1) {
                                    if (iM35485e != 2) {
                                        if (iM35485e == 3) {
                                        }
                                        rectF = this.f175475m;
                                        path4.computeBounds(rectF, false);
                                        if (i17 == 0) {
                                            rectF4.set(rectF);
                                        } else {
                                            rectF4.set(Math.min(rectF4.left, rectF.left), Math.min(rectF4.top, rectF.top), Math.max(rectF4.right, rectF.right), Math.max(rectF4.bottom, rectF.bottom));
                                        }
                                        i17++;
                                        size2 = i14;
                                        c31983m3 = c31983m3;
                                        path4 = path4;
                                    }
                                }
                                c31983m2 = c31983m3;
                                path = path4;
                                f13 = 0.0f;
                            }
                            if (c39551f.f170158d) {
                                c31983m2 = c31983m3;
                                path = path4;
                                f13 = 0.0f;
                            }
                            rectF = this.f175475m;
                            path4.computeBounds(rectF, false);
                            if (i17 == 0) {
                                rectF4.set(rectF);
                            } else {
                                rectF4.set(Math.min(rectF4.left, rectF.left), Math.min(rectF4.top, rectF.top), Math.max(rectF4.right, rectF.right), Math.max(rectF4.bottom, rectF.bottom));
                            }
                            i17++;
                            size2 = i14;
                            c31983m3 = c31983m3;
                            path4 = path4;
                        }
                        i17++;
                        size2 = i14;
                        c31983m3 = c31983m3;
                        path4 = path4;
                    } else {
                        c31983m2 = c31983m3;
                        path = path4;
                        if (rectF2.intersect(rectF4)) {
                            f13 = 0.0f;
                        } else {
                            f13 = 0.0f;
                            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                    }
                }
            } else {
                c31983m2 = c31983m3;
                path = path4;
                f13 = 0.0f;
            }
            float width = canvas2.getWidth();
            float height = canvas2.getHeight();
            RectF rectF5 = this.f175472j;
            rectF5.set(f13, f13, width, height);
            Matrix matrix3 = this.f175465c;
            canvas2.getMatrix(matrix3);
            if (!matrix3.isIdentity()) {
                matrix3.invert(matrix3);
                matrix3.mapRect(rectF5);
            }
            if (!rectF2.intersect(rectF5)) {
                rectF2.set(f13, f13, f13, f13);
            }
            if (rectF2.width() >= 1.0f && rectF2.height() >= 1.0f) {
                C31441a c31441a2 = this.f175466d;
                c31441a2.setAlpha(255);
                int iM35485e2 = AbstractC12682p.m35485e(i16);
                if (iM35485e2 == 1) {
                    i15 = 14;
                } else if (iM35485e2 != 2) {
                    i15 = 16;
                    if (iM35485e2 != 3) {
                        if (iM35485e2 == 4) {
                            i15 = 17;
                        } else if (iM35485e2 != 5) {
                            i15 = iM35485e2 != 16 ? 0 : 13;
                        } else {
                            i15 = 18;
                        }
                    }
                } else {
                    i15 = 15;
                }
                AbstractC35644c.m112843a(i15, c31441a2);
                Matrix matrix4 = AbstractC12064i.f40031a;
                canvas2.saveLayer(rectF2, c31441a2);
                if (i16 != 2) {
                    f14 = 1.0f;
                    canvas2.drawRect(rectF2.left - 1.0f, rectF2.top - 1.0f, rectF2.right + 1.0f, rectF2.bottom + 1.0f, this.f175470h);
                    canvas2 = canvas;
                } else {
                    f14 = 1.0f;
                    if (this.f175462C == null) {
                        C31441a c31441a3 = new C31441a();
                        this.f175462C = c31441a3;
                        c31441a3.setColor(-1);
                    }
                    canvas2 = canvas;
                    canvas2.drawRect(rectF2.left - 1.0f, rectF2.top - 1.0f, rectF2.right + 1.0f, rectF2.bottom + 1.0f, this.f175462C);
                }
                mo131928i(canvas2, matrix2, iIntValue, c12056a);
                if (m131930k()) {
                    Paint paint = this.f175467e;
                    canvas2.saveLayer(rectF2, paint);
                    int i18 = 0;
                    while (true) {
                        List list = (List) c31983m2.f132770y;
                        ArrayList arrayList = (ArrayList) c31983m2.f132768w;
                        if (i18 >= list.size()) {
                            break;
                        }
                        C39551f c39551f2 = (C39551f) list.get(i18);
                        AbstractC33821d abstractC33821d2 = (AbstractC33821d) arrayList.get(i18);
                        AbstractC33821d abstractC33821d3 = (AbstractC33821d) ((ArrayList) c31983m2.f132769x).get(i18);
                        int i19 = c39551f2.f170155a;
                        boolean z13 = c39551f2.f170158d;
                        int iM35485e3 = AbstractC12682p.m35485e(i19);
                        int i24 = i18;
                        Paint paint2 = this.f175468f;
                        if (iM35485e3 == 0) {
                            path2 = path;
                            if (z13) {
                                Matrix matrix5 = AbstractC12064i.f40031a;
                                canvas2.saveLayer(rectF2, c31441a2);
                                canvas2.drawRect(rectF2, c31441a2);
                                path2.set((Path) abstractC33821d2.mo106981e());
                                path2.transform(matrix2);
                                c31441a2.setAlpha((int) (((Integer) abstractC33821d3.mo106981e()).intValue() * 2.55f));
                                canvas2.drawPath(path2, paint2);
                                canvas2.restore();
                            } else {
                                path2.set((Path) abstractC33821d2.mo106981e());
                                path2.transform(matrix2);
                                c31441a2.setAlpha((int) (((Integer) abstractC33821d3.mo106981e()).intValue() * 2.55f));
                                canvas2.drawPath(path2, c31441a2);
                            }
                        } else if (iM35485e3 == 1) {
                            path2 = path;
                            if (i24 == 0) {
                                c31441a2.setColor(-16777216);
                                c31441a2.setAlpha(255);
                                canvas2.drawRect(rectF2, c31441a2);
                            }
                            if (z13) {
                                Matrix matrix6 = AbstractC12064i.f40031a;
                                canvas2.saveLayer(rectF2, paint2);
                                canvas2.drawRect(rectF2, c31441a2);
                                paint2.setAlpha((int) (((Integer) abstractC33821d3.mo106981e()).intValue() * 2.55f));
                                path2.set((Path) abstractC33821d2.mo106981e());
                                path2.transform(matrix2);
                                canvas2.drawPath(path2, paint2);
                                canvas2.restore();
                            } else {
                                path2.set((Path) abstractC33821d2.mo106981e());
                                path2.transform(matrix2);
                                canvas2.drawPath(path2, paint2);
                            }
                        } else if (iM35485e3 == 2) {
                            if (z13) {
                                Matrix matrix7 = AbstractC12064i.f40031a;
                                canvas2.saveLayer(rectF2, paint);
                                canvas2.drawRect(rectF2, c31441a2);
                                paint2.setAlpha((int) (((Integer) abstractC33821d3.mo106981e()).intValue() * 2.55f));
                                path3 = path;
                                path3.set((Path) abstractC33821d2.mo106981e());
                                path3.transform(matrix2);
                                canvas2.drawPath(path3, paint2);
                                canvas2.restore();
                            } else {
                                path3 = path;
                                Matrix matrix8 = AbstractC12064i.f40031a;
                                canvas2.saveLayer(rectF2, paint);
                                path3.set((Path) abstractC33821d2.mo106981e());
                                path3.transform(matrix2);
                                c31441a2.setAlpha((int) (((Integer) abstractC33821d3.mo106981e()).intValue() * 2.55f));
                                canvas2.drawPath(path3, c31441a2);
                                canvas2.restore();
                            }
                            path2 = path3;
                        } else if (iM35485e3 != 3) {
                            path2 = path;
                        } else {
                            if (!arrayList.isEmpty()) {
                                int i25 = 0;
                                while (true) {
                                    if (i25 >= list.size()) {
                                        c31441a2.setAlpha(255);
                                        canvas2.drawRect(rectF2, c31441a2);
                                        break;
                                    } else if (((C39551f) list.get(i25)).f170155a != 4) {
                                        break;
                                    } else {
                                        i25++;
                                    }
                                }
                            }
                            path2 = path;
                        }
                        i18 = i24 + 1;
                        path = path2;
                    }
                    canvas2.restore();
                }
                if (this.f175481s != null) {
                    canvas2.saveLayer(rectF2, this.f175469g);
                    canvas2.drawRect(rectF2.left - f14, rectF2.top - f14, rectF2.right + f14, rectF2.bottom + f14, this.f175470h);
                    this.f175481s.mo101531c(canvas2, matrix, i13, null);
                    canvas2.restore();
                }
                canvas2.restore();
            }
            if (this.f175487y && (c31441a = this.f175488z) != null) {
                c31441a.setStyle(Paint.Style.STROKE);
                this.f175488z.setColor(-251901);
                this.f175488z.setStrokeWidth(4.0f);
                canvas2.drawRect(rectF2, this.f175488z);
                this.f175488z.setStyle(Paint.Style.FILL);
                this.f175488z.setColor(1357638635);
                canvas2.drawRect(rectF2, this.f175488z);
            }
            m131931l();
        }
    }

    @Override // p584wi.InterfaceC37306f
    /* JADX INFO: renamed from: d */
    public final void mo101532d(C37305e c37305e, int i13, ArrayList arrayList, C37305e c37305e2) {
        AbstractC40652b abstractC40652b = this.f175481s;
        C40655e c40655e = this.f175478p;
        if (abstractC40652b != null) {
            C37305e c37305eM119477a = c37305e2.m119477a(abstractC40652b.f175478p.f175511c);
            if (c37305e.m119478b(i13, this.f175481s.f175478p.f175511c)) {
                arrayList.add(c37305eM119477a.m119483g(this.f175481s));
            }
            if (c37305e.m119481e(i13, this.f175481s.f175478p.f175511c) && c37305e.m119482f(i13, c40655e.f175511c)) {
                this.f175481s.mo131933n(c37305e, c37305e.m119480d(i13, this.f175481s.f175478p.f175511c) + i13, arrayList, c37305eM119477a);
            }
        }
        String str = c40655e.f175511c;
        String str2 = c40655e.f175511c;
        if (c37305e.m119481e(i13, str)) {
            if (!"__container".equals(str2)) {
                c37305e2 = c37305e2.m119477a(str2);
                if (c37305e.m119478b(i13, str2)) {
                    arrayList.add(c37305e2.m119483g(this));
                }
            }
            if (c37305e.m119482f(i13, str2)) {
                mo131933n(c37305e, c37305e.m119480d(i13, str2) + i13, arrayList, c37305e2);
            }
        }
    }

    @Override // si.InterfaceC32519e
    /* JADX INFO: renamed from: e */
    public void mo101533e(RectF rectF, Matrix matrix, boolean z4) {
        this.f175471i.set(0.0f, 0.0f, 0.0f, 0.0f);
        m131927h();
        Matrix matrix2 = this.f175476n;
        matrix2.set(matrix);
        if (z4) {
            List list = this.f175483u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((AbstractC40652b) this.f175483u.get(size)).f175485w.m107002e());
                }
            } else {
                AbstractC40652b abstractC40652b = this.f175482t;
                if (abstractC40652b != null) {
                    matrix2.preConcat(abstractC40652b.f175485w.m107002e());
                }
            }
        }
        matrix2.preConcat(this.f175485w.m107002e());
    }

    /* JADX INFO: renamed from: f */
    public final void m131926f(AbstractC33821d abstractC33821d) {
        if (abstractC33821d == null) {
            return;
        }
        this.f175484v.add(abstractC33821d);
    }

    @Override // p584wi.InterfaceC37306f
    /* JADX INFO: renamed from: g */
    public void mo101534g(C11457j c11457j, Object obj) {
        this.f175485w.m107000c(c11457j, obj);
    }

    /* JADX INFO: renamed from: h */
    public final void m131927h() {
        if (this.f175483u != null) {
            return;
        }
        if (this.f175482t == null) {
            this.f175483u = Collections.EMPTY_LIST;
            return;
        }
        this.f175483u = new ArrayList();
        for (AbstractC40652b abstractC40652b = this.f175482t; abstractC40652b != null; abstractC40652b = abstractC40652b.f175482t) {
            this.f175483u.add(abstractC40652b);
        }
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo131928i(Canvas canvas, Matrix matrix, int i13, C12056a c12056a);

    /* JADX INFO: renamed from: j */
    public C34249c mo131929j() {
        return this.f175478p.f175531w;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m131930k() {
        C31983m2 c31983m2 = this.f175479q;
        return (c31983m2 == null || ((ArrayList) c31983m2.f132768w).isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: l */
    public final void m131931l() {
        C30380e0 c30380e0 = this.f175477o.f124769w.f124681a;
        String str = this.f175478p.f175511c;
        HashMap map = c30380e0.f124659c;
        if (c30380e0.f124657a) {
            C12061f c12061f = (C12061f) map.get(str);
            if (c12061f == null) {
                c12061f = new C12061f();
                map.put(str, c12061f);
            }
            c12061f.m33250a();
            if (str.equals("__container")) {
                C0025h c0025h = c30380e0.f124658b;
                c0025h.getClass();
                C0007b c0007b = new C0007b(c0025h);
                if (c0007b.hasNext()) {
                    c0007b.next().getClass();
                    throw new ClassCastException();
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m131932m(AbstractC33821d abstractC33821d) {
        this.f175484v.remove(abstractC33821d);
    }

    /* JADX INFO: renamed from: n */
    public void mo131933n(C37305e c37305e, int i13, ArrayList arrayList, C37305e c37305e2) {
    }

    /* JADX INFO: renamed from: o */
    public void mo131934o(boolean z4) {
        if (z4 && this.f175488z == null) {
            this.f175488z = new C31441a();
        }
        this.f175487y = z4;
    }

    /* JADX INFO: renamed from: p */
    public void mo131935p(float f13) {
        C33834q c33834q = this.f175485w;
        AbstractC33821d abstractC33821d = c33834q.f141696j;
        if (abstractC33821d != null) {
            abstractC33821d.mo106985i(f13);
        }
        AbstractC33821d abstractC33821d2 = c33834q.f141699m;
        if (abstractC33821d2 != null) {
            abstractC33821d2.mo106985i(f13);
        }
        AbstractC33821d abstractC33821d3 = c33834q.f141700n;
        if (abstractC33821d3 != null) {
            abstractC33821d3.mo106985i(f13);
        }
        AbstractC33821d abstractC33821d4 = c33834q.f141692f;
        if (abstractC33821d4 != null) {
            abstractC33821d4.mo106985i(f13);
        }
        AbstractC33821d abstractC33821d5 = c33834q.f141693g;
        if (abstractC33821d5 != null) {
            abstractC33821d5.mo106985i(f13);
        }
        AbstractC33821d abstractC33821d6 = c33834q.f141694h;
        if (abstractC33821d6 != null) {
            abstractC33821d6.mo106985i(f13);
        }
        AbstractC33821d abstractC33821d7 = c33834q.f141695i;
        if (abstractC33821d7 != null) {
            abstractC33821d7.mo106985i(f13);
        }
        C33825h c33825h = c33834q.f141697k;
        if (c33825h != null) {
            c33825h.mo106985i(f13);
        }
        C33825h c33825h2 = c33834q.f141698l;
        if (c33825h2 != null) {
            c33825h2.mo106985i(f13);
        }
        int i13 = 0;
        C31983m2 c31983m2 = this.f175479q;
        if (c31983m2 != null) {
            ArrayList arrayList = (ArrayList) c31983m2.f132768w;
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                ((AbstractC33821d) arrayList.get(i14)).mo106985i(f13);
            }
        }
        C33825h c33825h3 = this.f175480r;
        if (c33825h3 != null) {
            c33825h3.mo106985i(f13);
        }
        AbstractC40652b abstractC40652b = this.f175481s;
        if (abstractC40652b != null) {
            abstractC40652b.mo131935p(f13);
        }
        while (true) {
            ArrayList arrayList2 = this.f175484v;
            if (i13 >= arrayList2.size()) {
                return;
            }
            ((AbstractC33821d) arrayList2.get(i13)).mo106985i(f13);
            i13++;
        }
    }
}
