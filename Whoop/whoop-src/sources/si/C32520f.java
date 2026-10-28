package si;

import android.graphics.Path;
import android.graphics.PointF;
import dj.AbstractC12062g;
import io.sentry.C20318e2;
import java.util.ArrayList;
import java.util.List;
import p078d1.C11457j;
import p426qi.C30402w;
import p426qi.InterfaceC30372a0;
import p502ti.AbstractC33821d;
import p502ti.C33826i;
import p502ti.InterfaceC33818a;
import p584wi.C37305e;
import p649yi.C39546a;
import p682zi.AbstractC40652b;

/* JADX INFO: renamed from: si.f */
/* JADX INFO: loaded from: classes.dex */
public final class C32520f implements InterfaceC32527m, InterfaceC33818a, InterfaceC32525k {

    /* JADX INFO: renamed from: b */
    public final String f134725b;

    /* JADX INFO: renamed from: c */
    public final C30402w f134726c;

    /* JADX INFO: renamed from: d */
    public final C33826i f134727d;

    /* JADX INFO: renamed from: e */
    public final AbstractC33821d f134728e;

    /* JADX INFO: renamed from: f */
    public final C39546a f134729f;

    /* JADX INFO: renamed from: h */
    public boolean f134731h;

    /* JADX INFO: renamed from: a */
    public final Path f134724a = new Path();

    /* JADX INFO: renamed from: g */
    public final C20318e2 f134730g = new C20318e2(2);

    public C32520f(C30402w c30402w, AbstractC40652b abstractC40652b, C39546a c39546a) {
        this.f134725b = c39546a.f170127a;
        this.f134726c = c30402w;
        AbstractC33821d abstractC33821dMo84473k0 = c39546a.f170129c.mo84473k0();
        this.f134727d = (C33826i) abstractC33821dMo84473k0;
        AbstractC33821d abstractC33821dMo84473k1 = c39546a.f170128b.mo84473k0();
        this.f134728e = abstractC33821dMo84473k1;
        this.f134729f = c39546a;
        abstractC40652b.m131926f(abstractC33821dMo84473k0);
        abstractC40652b.m131926f(abstractC33821dMo84473k1);
        abstractC33821dMo84473k0.m106977a(this);
        abstractC33821dMo84473k1.m106977a(this);
    }

    @Override // p502ti.InterfaceC33818a
    /* JADX INFO: renamed from: a */
    public final void mo101529a() {
        this.f134731h = false;
        this.f134726c.invalidateSelf();
    }

    @Override // si.InterfaceC32517c
    /* JADX INFO: renamed from: b */
    public final void mo101530b(List list, List list2) {
        int i13 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i13 >= arrayList.size()) {
                return;
            }
            InterfaceC32517c interfaceC32517c = (InterfaceC32517c) arrayList.get(i13);
            if (interfaceC32517c instanceof C32534t) {
                C32534t c32534t = (C32534t) interfaceC32517c;
                if (c32534t.f134836c == 1) {
                    this.f134730g.f76298a.add(c32534t);
                    c32534t.m101544d(this);
                }
            }
            i13++;
        }
    }

    @Override // p584wi.InterfaceC37306f
    /* JADX INFO: renamed from: d */
    public final void mo101532d(C37305e c37305e, int i13, ArrayList arrayList, C37305e c37305e2) {
        AbstractC12062g.m33257g(c37305e, i13, arrayList, c37305e2, this);
    }

    @Override // p584wi.InterfaceC37306f
    /* JADX INFO: renamed from: g */
    public final void mo101534g(C11457j c11457j, Object obj) {
        if (obj == InterfaceC30372a0.f124625f) {
            this.f134727d.m106986j(c11457j);
        } else if (obj == InterfaceC30372a0.f124628i) {
            this.f134728e.m106986j(c11457j);
        }
    }

    @Override // si.InterfaceC32517c
    public final String getName() {
        return this.f134725b;
    }

    @Override // si.InterfaceC32527m
    public final Path getPath() {
        boolean z4 = this.f134731h;
        Path path = this.f134724a;
        if (z4) {
            return path;
        }
        path.reset();
        C39546a c39546a = this.f134729f;
        if (c39546a.f170131e) {
            this.f134731h = true;
            return path;
        }
        PointF pointF = (PointF) this.f134727d.mo106981e();
        float f13 = pointF.x / 2.0f;
        float f14 = pointF.y / 2.0f;
        float f15 = f13 * 0.55228f;
        float f16 = f14 * 0.55228f;
        path.reset();
        if (c39546a.f170130d) {
            float f17 = -f14;
            path.moveTo(0.0f, f17);
            float f18 = 0.0f - f15;
            float f19 = -f13;
            float f24 = 0.0f - f16;
            path.cubicTo(f18, f17, f19, f24, f19, 0.0f);
            float f25 = f16 + 0.0f;
            path.cubicTo(f19, f25, f18, f14, 0.0f, f14);
            float f26 = f15 + 0.0f;
            path.cubicTo(f26, f14, f13, f25, f13, 0.0f);
            path.cubicTo(f13, f24, f26, f17, 0.0f, f17);
        } else {
            float f27 = -f14;
            path.moveTo(0.0f, f27);
            float f28 = f15 + 0.0f;
            float f29 = 0.0f - f16;
            path.cubicTo(f28, f27, f13, f29, f13, 0.0f);
            float f34 = f16 + 0.0f;
            path.cubicTo(f13, f34, f28, f14, 0.0f, f14);
            float f35 = 0.0f - f15;
            float f36 = -f13;
            path.cubicTo(f35, f14, f36, f34, f36, 0.0f);
            path.cubicTo(f36, f29, f35, f27, 0.0f, f27);
        }
        PointF pointF2 = (PointF) this.f134728e.mo106981e();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.f134730g.m56474a(path);
        this.f134731h = true;
        return path;
    }
}
