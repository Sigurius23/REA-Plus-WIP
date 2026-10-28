package si;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import bd3.C3143v;
import dj.C12056a;
import dj.C12063h;
import java.util.ArrayList;
import java.util.List;
import p078d1.C11457j;
import p426qi.C30387i;
import p426qi.C30402w;
import p502ti.AbstractC33821d;
import p502ti.C33834q;
import p502ti.InterfaceC33818a;
import p584wi.C37305e;
import p584wi.InterfaceC37306f;
import p616xi.C38317e;
import p649yi.C39559n;
import p649yi.InterfaceC39547b;
import p682zi.AbstractC40652b;

/* JADX INFO: renamed from: si.d */
/* JADX INFO: loaded from: classes.dex */
public final class C32518d implements InterfaceC32519e, InterfaceC32527m, InterfaceC33818a, InterfaceC37306f {

    /* JADX INFO: renamed from: a */
    public final C3143v f134712a;

    /* JADX INFO: renamed from: b */
    public final RectF f134713b;

    /* JADX INFO: renamed from: c */
    public final C12063h f134714c;

    /* JADX INFO: renamed from: d */
    public final Matrix f134715d;

    /* JADX INFO: renamed from: e */
    public final Path f134716e;

    /* JADX INFO: renamed from: f */
    public final RectF f134717f;

    /* JADX INFO: renamed from: g */
    public final String f134718g;

    /* JADX INFO: renamed from: h */
    public final boolean f134719h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f134720i;

    /* JADX INFO: renamed from: j */
    public final C30402w f134721j;

    /* JADX INFO: renamed from: k */
    public ArrayList f134722k;

    /* JADX INFO: renamed from: l */
    public final C33834q f134723l;

    public C32518d(C30402w c30402w, AbstractC40652b abstractC40652b, C39559n c39559n, C30387i c30387i) {
        C38317e c38317e;
        String str = c39559n.f170192a;
        boolean z4 = c39559n.f170194c;
        List list = c39559n.f170193b;
        ArrayList arrayList = new ArrayList(list.size());
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            InterfaceC32517c interfaceC32517cMo122786a = ((InterfaceC39547b) list.get(i14)).mo122786a(c30402w, c30387i, abstractC40652b);
            if (interfaceC32517cMo122786a != null) {
                arrayList.add(interfaceC32517cMo122786a);
            }
        }
        while (true) {
            if (i13 >= list.size()) {
                c38317e = null;
                break;
            }
            InterfaceC39547b interfaceC39547b = (InterfaceC39547b) list.get(i13);
            if (interfaceC39547b instanceof C38317e) {
                c38317e = (C38317e) interfaceC39547b;
                break;
            }
            i13++;
        }
        this(c30402w, abstractC40652b, str, z4, arrayList, c38317e);
    }

    @Override // p502ti.InterfaceC33818a
    /* JADX INFO: renamed from: a */
    public final void mo101529a() {
        this.f134721j.invalidateSelf();
    }

    @Override // si.InterfaceC32517c
    /* JADX INFO: renamed from: b */
    public final void mo101530b(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.f134720i;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            InterfaceC32517c interfaceC32517c = (InterfaceC32517c) arrayList.get(size2);
            interfaceC32517c.mo101530b(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(interfaceC32517c);
        }
    }

    @Override // si.InterfaceC32519e
    /* JADX INFO: renamed from: c */
    public final void mo101531c(Canvas canvas, Matrix matrix, int i13, C12056a c12056a) {
        if (this.f134719h) {
            return;
        }
        Matrix matrix2 = this.f134715d;
        matrix2.set(matrix);
        C33834q c33834q = this.f134723l;
        if (c33834q != null) {
            matrix2.preConcat(c33834q.m107002e());
            AbstractC33821d abstractC33821d = c33834q.f141696j;
            i13 = (int) (((((abstractC33821d == null ? 100 : ((Integer) abstractC33821d.mo106981e()).intValue()) / 100.0f) * i13) / 255.0f) * 255.0f);
        }
        C30402w c30402w = this.f134721j;
        boolean z4 = (c30402w.f124745S && m101536h() && i13 != 255) || (c12056a != null && c30402w.f124746T && m101536h());
        int i14 = z4 ? 255 : i13;
        C12063h c12063h = this.f134714c;
        if (z4) {
            RectF rectF = this.f134713b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            mo101533e(rectF, matrix, true);
            C3143v c3143v = this.f134712a;
            c3143v.f12310x = i13;
            if (c12056a != null) {
                if (Color.alpha(c12056a.f39979d) > 0) {
                    c3143v.f12311y = c12056a;
                } else {
                    c3143v.f12311y = null;
                }
                c12056a = null;
            } else {
                c3143v.f12311y = null;
            }
            canvas = c12063h.m33262e(canvas, rectF, c3143v);
        } else if (c12056a != null) {
            C12056a c12056a2 = new C12056a(c12056a);
            c12056a2.m33236b(i14);
            c12056a = c12056a2;
        }
        ArrayList arrayList = this.f134720i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof InterfaceC32519e) {
                ((InterfaceC32519e) obj).mo101531c(canvas, matrix2, i14, c12056a);
            }
        }
        if (z4) {
            c12063h.m33261c();
        }
    }

    @Override // p584wi.InterfaceC37306f
    /* JADX INFO: renamed from: d */
    public final void mo101532d(C37305e c37305e, int i13, ArrayList arrayList, C37305e c37305e2) {
        String str = this.f134718g;
        if (!c37305e.m119481e(i13, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            c37305e2 = c37305e2.m119477a(str);
            if (c37305e.m119478b(i13, str)) {
                arrayList.add(c37305e2.m119483g(this));
            }
        }
        if (!c37305e.m119482f(i13, str)) {
            return;
        }
        int iM119480d = c37305e.m119480d(i13, str) + i13;
        int i14 = 0;
        while (true) {
            ArrayList arrayList2 = this.f134720i;
            if (i14 >= arrayList2.size()) {
                return;
            }
            InterfaceC32517c interfaceC32517c = (InterfaceC32517c) arrayList2.get(i14);
            if (interfaceC32517c instanceof InterfaceC37306f) {
                ((InterfaceC37306f) interfaceC32517c).mo101532d(c37305e, iM119480d, arrayList, c37305e2);
            }
            i14++;
        }
    }

    @Override // si.InterfaceC32519e
    /* JADX INFO: renamed from: e */
    public final void mo101533e(RectF rectF, Matrix matrix, boolean z4) {
        Matrix matrix2 = this.f134715d;
        matrix2.set(matrix);
        C33834q c33834q = this.f134723l;
        if (c33834q != null) {
            matrix2.preConcat(c33834q.m107002e());
        }
        RectF rectF2 = this.f134717f;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.f134720i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            InterfaceC32517c interfaceC32517c = (InterfaceC32517c) arrayList.get(size);
            if (interfaceC32517c instanceof InterfaceC32519e) {
                ((InterfaceC32519e) interfaceC32517c).mo101533e(rectF2, matrix2, z4);
                rectF.union(rectF2);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final List m101535f() {
        if (this.f134722k == null) {
            this.f134722k = new ArrayList();
            int i13 = 0;
            while (true) {
                ArrayList arrayList = this.f134720i;
                if (i13 >= arrayList.size()) {
                    break;
                }
                InterfaceC32517c interfaceC32517c = (InterfaceC32517c) arrayList.get(i13);
                if (interfaceC32517c instanceof InterfaceC32527m) {
                    this.f134722k.add((InterfaceC32527m) interfaceC32517c);
                }
                i13++;
            }
        }
        return this.f134722k;
    }

    @Override // p584wi.InterfaceC37306f
    /* JADX INFO: renamed from: g */
    public final void mo101534g(C11457j c11457j, Object obj) {
        C33834q c33834q = this.f134723l;
        if (c33834q != null) {
            c33834q.m107000c(c11457j, obj);
        }
    }

    @Override // si.InterfaceC32517c
    public final String getName() {
        throw null;
    }

    @Override // si.InterfaceC32527m
    public final Path getPath() {
        Matrix matrix = this.f134715d;
        matrix.reset();
        C33834q c33834q = this.f134723l;
        if (c33834q != null) {
            matrix.set(c33834q.m107002e());
        }
        Path path = this.f134716e;
        path.reset();
        if (!this.f134719h) {
            ArrayList arrayList = this.f134720i;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                InterfaceC32517c interfaceC32517c = (InterfaceC32517c) arrayList.get(size);
                if (interfaceC32517c instanceof InterfaceC32527m) {
                    path.addPath(((InterfaceC32527m) interfaceC32517c).getPath(), matrix);
                }
            }
        }
        return path;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m101536h() {
        int i13 = 0;
        int i14 = 0;
        while (true) {
            ArrayList arrayList = this.f134720i;
            if (i13 >= arrayList.size()) {
                return false;
            }
            if ((arrayList.get(i13) instanceof InterfaceC32519e) && (i14 = i14 + 1) >= 2) {
                return true;
            }
            i13++;
        }
    }

    public C32518d(C30402w c30402w, AbstractC40652b abstractC40652b, String str, boolean z4, ArrayList arrayList, C38317e c38317e) {
        this.f134712a = new C3143v(2, (byte) 0);
        this.f134713b = new RectF();
        this.f134714c = new C12063h();
        this.f134715d = new Matrix();
        this.f134716e = new Path();
        this.f134717f = new RectF();
        this.f134718g = str;
        this.f134721j = c30402w;
        this.f134719h = z4;
        this.f134720i = arrayList;
        if (c38317e != null) {
            C33834q c33834q = new C33834q(c38317e);
            this.f134723l = c33834q;
            c33834q.m106998a(abstractC40652b);
            c33834q.m106999b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            InterfaceC32517c interfaceC32517c = (InterfaceC32517c) arrayList.get(size);
            if (interfaceC32517c instanceof InterfaceC32524j) {
                arrayList2.add((InterfaceC32524j) interfaceC32517c);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((InterfaceC32524j) arrayList2.get(size2)).mo101541f(arrayList.listIterator(arrayList.size()));
        }
    }
}
