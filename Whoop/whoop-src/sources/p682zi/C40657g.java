package p682zi;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import b30.C2570m;
import dj.C12056a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p078d1.C11457j;
import p426qi.C30387i;
import p426qi.C30402w;
import p426qi.InterfaceC30372a0;
import p502ti.C33824g;
import p508ty.C34249c;
import p584wi.C37305e;
import p649yi.C39559n;
import si.C32518d;

/* JADX INFO: renamed from: zi.g */
/* JADX INFO: loaded from: classes.dex */
public final class C40657g extends AbstractC40652b {

    /* JADX INFO: renamed from: D */
    public final C32518d f175534D;

    /* JADX INFO: renamed from: E */
    public final C40653c f175535E;

    /* JADX INFO: renamed from: F */
    public final C33824g f175536F;

    public C40657g(C30402w c30402w, C40655e c40655e, C40653c c40653c, C30387i c30387i) {
        super(c30402w, c40655e);
        this.f175535E = c40653c;
        C32518d c32518d = new C32518d(c30402w, this, new C39559n("__container", c40655e.f175509a, false), c30387i);
        this.f175534D = c32518d;
        List list = Collections.EMPTY_LIST;
        c32518d.mo101530b(list, list);
        C2570m c2570m = this.f175478p.f175532x;
        if (c2570m != null) {
            this.f175536F = new C33824g(this, this, c2570m);
        }
    }

    @Override // p682zi.AbstractC40652b, si.InterfaceC32519e
    /* JADX INFO: renamed from: e */
    public final void mo101533e(RectF rectF, Matrix matrix, boolean z4) {
        super.mo101533e(rectF, matrix, z4);
        this.f175534D.mo101533e(rectF, this.f175476n, z4);
    }

    @Override // p682zi.AbstractC40652b, p584wi.InterfaceC37306f
    /* JADX INFO: renamed from: g */
    public final void mo101534g(C11457j c11457j, Object obj) {
        super.mo101534g(c11457j, obj);
        PointF pointF = InterfaceC30372a0.f124620a;
        C33824g c33824g = this.f175536F;
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
        C33824g c33824g = this.f175536F;
        if (c33824g != null) {
            c12056a = c33824g.m106989b(matrix, i13);
        }
        this.f175534D.mo101531c(canvas, matrix, i13, c12056a);
    }

    @Override // p682zi.AbstractC40652b
    /* JADX INFO: renamed from: j */
    public final C34249c mo131929j() {
        C34249c c34249c = this.f175478p.f175531w;
        return c34249c != null ? c34249c : this.f175535E.f175478p.f175531w;
    }

    @Override // p682zi.AbstractC40652b
    /* JADX INFO: renamed from: n */
    public final void mo131933n(C37305e c37305e, int i13, ArrayList arrayList, C37305e c37305e2) {
        this.f175534D.mo101532d(c37305e, i13, arrayList, c37305e2);
    }
}
