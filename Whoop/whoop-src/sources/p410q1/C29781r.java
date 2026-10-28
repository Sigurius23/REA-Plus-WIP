package p410q1;

import b83.C2813i;
import c93.InterfaceC4339a;
import p390p1.C28591a;
import p390p1.C28594a2;
import p390p1.C28626i2;
import p390p1.C28677v1;
import p390p1.InterfaceC28599c;
import p602x1.C37822h;

/* JADX INFO: renamed from: q1.r */
/* JADX INFO: loaded from: classes.dex */
public final class C29781r extends AbstractC29771j0 {

    /* JADX INFO: renamed from: e */
    public static final C29781r f121791e;

    /* JADX INFO: renamed from: f */
    public static final C29781r f121792f;

    /* JADX INFO: renamed from: g */
    public static final C29781r f121793g;

    /* JADX INFO: renamed from: h */
    public static final C29781r f121794h;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f121795d;

    static {
        int i13 = 1;
        f121791e = new C29781r(i13, 2, 0);
        int i14 = 1;
        f121792f = new C29781r(i14, i14, 1);
        f121793g = new C29781r(i13, 2, 2);
        int i15 = 1;
        f121794h = new C29781r(i15, i15, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29781r(int i13, int i14, int i15) {
        super(i13, i14, 0, (byte) 0);
        this.f121795d = i15;
    }

    @Override // p410q1.AbstractC29771j0
    /* JADX INFO: renamed from: d */
    public final void mo91224d(C2813i c2813i, InterfaceC28599c interfaceC28599c, C28626i2 c28626i2, C37822h c37822h, InterfaceC29773k0 interfaceC29773k0) {
        switch (this.f121795d) {
            case 0:
                Object objInvoke = ((InterfaceC4339a) c2813i.m7996c(0)).invoke();
                C28591a c28591a = (C28591a) c2813i.m7996c(1);
                int iM7995b = c2813i.m7995b(0);
                c28591a.getClass();
                c28626i2.m87055T(c28626i2.m87058c(c28591a), objInvoke);
                interfaceC28599c.mo702g(iM7995b, objInvoke);
                interfaceC28599c.mo706l(objInvoke);
                break;
            case 1:
                C28591a c28591a2 = (C28591a) c2813i.m7996c(0);
                int iM7995b2 = c2813i.m7995b(0);
                interfaceC28599c.mo710p();
                c28591a2.getClass();
                interfaceC28599c.mo705k(iM7995b2, c28626i2.m87038C(c28626i2.m87058c(c28591a2)));
                break;
            case 2:
                Object objM7996c = c2813i.m7996c(0);
                C28591a c28591a3 = (C28591a) c2813i.m7996c(1);
                int iM7995b3 = c2813i.m7995b(0);
                if (objM7996c instanceof C28594a2) {
                    C28594a2 c28594a2 = (C28594a2) objM7996c;
                    c37822h.f161972e.m94885b(c28594a2);
                    c37822h.f161971d.m136a(c28594a2);
                }
                Object objM87045J = c28626i2.m87045J(c28626i2.m87058c(c28591a3), iM7995b3, objM7996c);
                if (objM87045J instanceof C28594a2) {
                    c37822h.m121354e((C28594a2) objM87045J);
                } else if (objM87045J instanceof C28677v1) {
                    ((C28677v1) objM87045J).m87203d();
                }
                break;
            default:
                Object objM7996c2 = c2813i.m7996c(0);
                int iM7995b4 = c2813i.m7995b(0);
                if (objM7996c2 instanceof C28594a2) {
                    C28594a2 c28594a3 = (C28594a2) objM7996c2;
                    c37822h.f161972e.m94885b(c28594a3);
                    c37822h.f161971d.m136a(c28594a3);
                }
                Object objM87045J2 = c28626i2.m87045J(c28626i2.f115800t, iM7995b4, objM7996c2);
                if (objM87045J2 instanceof C28594a2) {
                    c37822h.m121354e((C28594a2) objM87045J2);
                } else if (objM87045J2 instanceof C28677v1) {
                    ((C28677v1) objM87045J2).m87203d();
                }
                break;
        }
    }

    @Override // p410q1.AbstractC29771j0
    /* JADX INFO: renamed from: f */
    public C28591a mo91234f(C2813i c2813i) {
        switch (this.f121795d) {
            case 0:
                return (C28591a) c2813i.m7996c(1);
            case 1:
                return (C28591a) c2813i.m7996c(0);
            default:
                return super.mo91234f(c2813i);
        }
    }
}
