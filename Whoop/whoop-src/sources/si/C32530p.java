package si;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import dj.AbstractC12062g;
import dj.C12056a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import p078d1.C11457j;
import p426qi.C30402w;
import p426qi.InterfaceC30372a0;
import p502ti.C33825h;
import p502ti.C33834q;
import p502ti.InterfaceC33818a;
import p584wi.C37305e;
import p616xi.C38317e;
import p649yi.C39555j;
import p682zi.AbstractC40652b;

/* JADX INFO: renamed from: si.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C32530p implements InterfaceC32519e, InterfaceC32527m, InterfaceC32524j, InterfaceC33818a, InterfaceC32525k {

    /* JADX INFO: renamed from: a */
    public final Matrix f134809a = new Matrix();

    /* JADX INFO: renamed from: b */
    public final Path f134810b = new Path();

    /* JADX INFO: renamed from: c */
    public final C30402w f134811c;

    /* JADX INFO: renamed from: d */
    public final AbstractC40652b f134812d;

    /* JADX INFO: renamed from: e */
    public final String f134813e;

    /* JADX INFO: renamed from: f */
    public final boolean f134814f;

    /* JADX INFO: renamed from: g */
    public final C33825h f134815g;

    /* JADX INFO: renamed from: h */
    public final C33825h f134816h;

    /* JADX INFO: renamed from: i */
    public final C33834q f134817i;

    /* JADX INFO: renamed from: j */
    public C32518d f134818j;

    public C32530p(C30402w c30402w, AbstractC40652b abstractC40652b, C39555j c39555j) {
        this.f134811c = c30402w;
        this.f134812d = abstractC40652b;
        this.f134813e = c39555j.f170177a;
        this.f134814f = c39555j.f170181e;
        C33825h c33825hMo84473k0 = c39555j.f170178b.mo84473k0();
        this.f134815g = c33825hMo84473k0;
        abstractC40652b.m131926f(c33825hMo84473k0);
        c33825hMo84473k0.m106977a(this);
        C33825h c33825hMo84473k1 = c39555j.f170179c.mo84473k0();
        this.f134816h = c33825hMo84473k1;
        abstractC40652b.m131926f(c33825hMo84473k1);
        c33825hMo84473k1.m106977a(this);
        C38317e c38317e = c39555j.f170180d;
        c38317e.getClass();
        C33834q c33834q = new C33834q(c38317e);
        this.f134817i = c33834q;
        c33834q.m106998a(abstractC40652b);
        c33834q.m106999b(this);
    }

    @Override // p502ti.InterfaceC33818a
    /* JADX INFO: renamed from: a */
    public final void mo101529a() {
        this.f134811c.invalidateSelf();
    }

    @Override // si.InterfaceC32517c
    /* JADX INFO: renamed from: b */
    public final void mo101530b(List list, List list2) {
        this.f134818j.mo101530b(list, list2);
    }

    @Override // si.InterfaceC32519e
    /* JADX INFO: renamed from: c */
    public final void mo101531c(Canvas canvas, Matrix matrix, int i13, C12056a c12056a) {
        float fFloatValue = ((Float) this.f134815g.mo106981e()).floatValue();
        float fFloatValue2 = ((Float) this.f134816h.mo106981e()).floatValue();
        C33834q c33834q = this.f134817i;
        float fFloatValue3 = ((Float) c33834q.f141699m.mo106981e()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) c33834q.f141700n.mo106981e()).floatValue() / 100.0f;
        for (int i14 = ((int) fFloatValue) - 1; i14 >= 0; i14--) {
            Matrix matrix2 = this.f134809a;
            matrix2.set(matrix);
            float f13 = i14;
            matrix2.preConcat(c33834q.m107003f(f13 + fFloatValue2));
            this.f134818j.mo101531c(canvas, matrix2, (int) (AbstractC12062g.m33256f(fFloatValue3, fFloatValue4, f13 / fFloatValue) * i13), c12056a);
        }
    }

    @Override // p584wi.InterfaceC37306f
    /* JADX INFO: renamed from: d */
    public final void mo101532d(C37305e c37305e, int i13, ArrayList arrayList, C37305e c37305e2) {
        AbstractC12062g.m33257g(c37305e, i13, arrayList, c37305e2, this);
        for (int i14 = 0; i14 < this.f134818j.f134720i.size(); i14++) {
            InterfaceC32517c interfaceC32517c = (InterfaceC32517c) this.f134818j.f134720i.get(i14);
            if (interfaceC32517c instanceof InterfaceC32525k) {
                AbstractC12062g.m33257g(c37305e, i13, arrayList, c37305e2, (InterfaceC32525k) interfaceC32517c);
            }
        }
    }

    @Override // si.InterfaceC32519e
    /* JADX INFO: renamed from: e */
    public final void mo101533e(RectF rectF, Matrix matrix, boolean z4) {
        this.f134818j.mo101533e(rectF, matrix, z4);
    }

    @Override // si.InterfaceC32524j
    /* JADX INFO: renamed from: f */
    public final void mo101541f(ListIterator listIterator) {
        if (this.f134818j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((InterfaceC32517c) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f134818j = new C32518d(this.f134811c, this.f134812d, "Repeater", this.f134814f, arrayList, null);
    }

    @Override // p584wi.InterfaceC37306f
    /* JADX INFO: renamed from: g */
    public final void mo101534g(C11457j c11457j, Object obj) {
        if (this.f134817i.m107000c(c11457j, obj)) {
            return;
        }
        if (obj == InterfaceC30372a0.f124635p) {
            this.f134815g.m106986j(c11457j);
        } else if (obj == InterfaceC30372a0.f124636q) {
            this.f134816h.m106986j(c11457j);
        }
    }

    @Override // si.InterfaceC32517c
    public final String getName() {
        return this.f134813e;
    }

    @Override // si.InterfaceC32527m
    public final Path getPath() {
        Path path = this.f134818j.getPath();
        Path path2 = this.f134810b;
        path2.reset();
        float fFloatValue = ((Float) this.f134815g.mo106981e()).floatValue();
        float fFloatValue2 = ((Float) this.f134816h.mo106981e()).floatValue();
        for (int i13 = ((int) fFloatValue) - 1; i13 >= 0; i13--) {
            Matrix matrixM107003f = this.f134817i.m107003f(i13 + fFloatValue2);
            Matrix matrix = this.f134809a;
            matrix.set(matrixM107003f);
            path2.addPath(path, matrix);
        }
        return path2;
    }
}
