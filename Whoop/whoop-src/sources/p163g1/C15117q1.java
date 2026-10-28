package p163g1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import m83.AbstractC25265s;
import p077d0.AbstractC11348f;
import p077d0.C11344e;
import p077d0.C11376m;
import p238j0.C21078d;
import p238j0.C21080f;
import p238j0.C21086l;
import p238j0.InterfaceC21082h;
import p238j0.InterfaceC21083i;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p636y3.C39174f;
import p668z1.C39967p;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: g1.q1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15117q1 {

    /* JADX INFO: renamed from: a */
    public final float f56633a;

    /* JADX INFO: renamed from: b */
    public final float f56634b;

    /* JADX INFO: renamed from: c */
    public final float f56635c;

    /* JADX INFO: renamed from: d */
    public final float f56636d;

    /* JADX INFO: renamed from: e */
    public final float f56637e;

    public C15117q1(float f13, float f14, float f15, float f16, float f17) {
        this.f56633a = f13;
        this.f56634b = f14;
        this.f56635c = f15;
        this.f56636d = f16;
        this.f56637e = f17;
    }

    /* JADX INFO: renamed from: a */
    public final C11376m m43178a(boolean z4, InterfaceC21083i interfaceC21083i, Composer composer, int i13) {
        float f13;
        C11344e c11344e;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1588756907);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = new C39967p();
            c28655q.m87172p0(objM87133R);
        }
        C39967p c39967p = (C39967p) objM87133R;
        boolean z13 = true;
        boolean z14 = (((i13 & 112) ^ 48) > 32 && c28655q.m87153g(interfaceC21083i)) || (i13 & 48) == 32;
        Object objM87133R2 = c28655q.m87133R();
        InterfaceC30057d interfaceC30057d = null;
        if (z14 || objM87133R2 == c28676v0) {
            objM87133R2 = new C15097o1(interfaceC21083i, c39967p, interfaceC30057d, 0);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, interfaceC21083i);
        InterfaceC21082h interfaceC21082h = (InterfaceC21082h) AbstractC25265s.m74114R0(c39967p);
        if (!z4) {
            f13 = this.f56635c;
        } else if (interfaceC21082h instanceof C21086l) {
            f13 = this.f56634b;
        } else if (interfaceC21082h instanceof C21080f) {
            f13 = this.f56636d;
        } else {
            f13 = interfaceC21082h instanceof C21078d ? this.f56637e : this.f56633a;
        }
        Object objM87133R3 = c28655q.m87133R();
        if (objM87133R3 == c28676v0) {
            objM87133R3 = new C11344e(new C39174f(f13), AbstractC11348f.f36369k, null, 12);
            c28655q.m87172p0(objM87133R3);
        }
        C11344e c11344e2 = (C11344e) objM87133R3;
        C39174f c39174f = new C39174f(f13);
        boolean zM87157i = c28655q.m87157i(c11344e2) | c28655q.m87147d(f13) | ((((i13 & 14) ^ 6) > 4 && c28655q.m87155h(z4)) || (i13 & 6) == 4);
        if ((((i13 & 896) ^ 384) <= 256 || !c28655q.m87153g(this)) && (i13 & 384) != 256) {
            z13 = false;
        }
        boolean zM87157i2 = zM87157i | z13 | c28655q.m87157i(interfaceC21082h);
        Object objM87133R4 = c28655q.m87133R();
        if (zM87157i2 || objM87133R4 == c28676v0) {
            c11344e = c11344e2;
            C15107p1 c15107p1 = new C15107p1(c11344e, f13, z4, this, interfaceC21082h, null, 0);
            c28655q.m87172p0(c15107p1);
            objM87133R4 = c15107p1;
        } else {
            c11344e = c11344e2;
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, c39174f);
        C11376m c11376m = c11344e.f36343c;
        c28655q.m87173q(false);
        return c11376m;
    }
}
