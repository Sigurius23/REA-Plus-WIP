package p163g1;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p077d0.C11344e;
import p077d0.C11347e2;
import p238j0.C21076b;
import p238j0.C21078d;
import p238j0.C21080f;
import p238j0.C21086l;
import p238j0.InterfaceC21082h;
import p292l1.C23102h;
import p316m1.AbstractC24925w;
import p505ts.AbstractC34132o;
import p636y3.C39174f;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: g1.p1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15107p1 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f56595E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC21082h f56596F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f56597G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56598w;

    /* JADX INFO: renamed from: x */
    public int f56599x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C11344e f56600y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f56601z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15107p1(C11344e c11344e, float f13, boolean z4, Object obj, InterfaceC21082h interfaceC21082h, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f56598w = i13;
        this.f56600y = c11344e;
        this.f56601z = f13;
        this.f56595E = z4;
        this.f56597G = obj;
        this.f56596F = interfaceC21082h;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f56598w) {
            case 0:
                return new C15107p1(this.f56600y, this.f56601z, this.f56595E, (C15117q1) this.f56597G, this.f56596F, interfaceC30057d, 0);
            default:
                return new C15107p1(this.f56600y, this.f56601z, this.f56595E, (C23102h) this.f56597G, this.f56596F, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f56598w) {
            case 0:
                break;
        }
        return ((C15107p1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00af  */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        InterfaceC21082h c21078d;
        InterfaceC21082h c21078d2;
        Object objM30551g;
        switch (this.f56598w) {
            case 0:
                C15117q1 c15117q1 = (C15117q1) this.f56597G;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f56599x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C11344e c11344e = this.f56600y;
                    float f13 = ((C39174f) c11344e.f36345e.getValue()).f168413w;
                    float f14 = this.f56601z;
                    if (!C39174f.m124782b(f13, f14)) {
                        if (this.f56595E) {
                            float f15 = ((C39174f) c11344e.f36345e.getValue()).f168413w;
                            if (C39174f.m124782b(f15, c15117q1.f56634b)) {
                                c21078d = new C21086l(0L);
                            } else if (C39174f.m124782b(f15, c15117q1.f56636d)) {
                                c21078d = new C21080f();
                            } else {
                                c21078d = C39174f.m124782b(f15, c15117q1.f56637e) ? new C21078d() : null;
                            }
                            this.f56599x = 2;
                            if (AbstractC15148t2.m43191a(c11344e, f14, c21078d, this.f56596F, this) == enumC31071a) {
                                return enumC31071a;
                            }
                        } else {
                            C39174f c39174f = new C39174f(f14);
                            this.f56599x = 1;
                            if (c11344e.m30551g(c39174f, this) == enumC31071a) {
                                return enumC31071a;
                            }
                        }
                    }
                } else {
                    if (i13 != 1 && i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            default:
                C23102h c23102h = (C23102h) this.f56597G;
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f56599x;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C11344e c11344e2 = this.f56600y;
                    float f16 = ((C39174f) c11344e2.f36345e.getValue()).f168413w;
                    float f17 = this.f56601z;
                    if (!C39174f.m124782b(f16, f17)) {
                        if (this.f56595E) {
                            float f18 = ((C39174f) c11344e2.f36345e.getValue()).f168413w;
                            C11347e2 c11347e2 = null;
                            if (C39174f.m124782b(f18, c23102h.f91225b)) {
                                c21078d2 = new C21086l(0L);
                            } else if (C39174f.m124782b(f18, c23102h.f91227d)) {
                                c21078d2 = new C21080f();
                            } else {
                                c21078d2 = C39174f.m124782b(f18, c23102h.f91226c) ? new C21078d() : null;
                            }
                            this.f56599x = 2;
                            C11347e2 c11347e3 = AbstractC24925w.f97614b;
                            C11347e2 c11347e4 = AbstractC24925w.f97613a;
                            InterfaceC21082h interfaceC21082h = this.f56596F;
                            if (interfaceC21082h != null) {
                                if ((interfaceC21082h instanceof C21086l) || (interfaceC21082h instanceof C21076b) || (interfaceC21082h instanceof C21080f) || (interfaceC21082h instanceof C21078d)) {
                                    c11347e2 = c11347e4;
                                }
                            } else if (c21078d2 != null) {
                                if ((c21078d2 instanceof C21086l) || (c21078d2 instanceof C21076b)) {
                                    c11347e2 = c11347e3;
                                } else if (c21078d2 instanceof C21080f) {
                                    c11347e2 = AbstractC24925w.f97615c;
                                } else if (c21078d2 instanceof C21078d) {
                                    c11347e2 = c11347e3;
                                }
                            }
                            if (c11347e2 == null ? (objM30551g = c11344e2.m30551g(new C39174f(f17), this)) != enumC31071a2 : (objM30551g = C11344e.m30547d(c11344e2, new C39174f(f17), c11347e2, null, this, 12)) != enumC31071a2) {
                                objM30551g = c23454a0;
                            }
                            if (objM30551g == enumC31071a2) {
                                return enumC31071a2;
                            }
                        } else {
                            C39174f c39174f2 = new C39174f(f17);
                            this.f56599x = 1;
                            if (c11344e2.m30551g(c39174f2, this) == enumC31071a2) {
                                return enumC31071a2;
                            }
                        }
                    }
                    return c23454a0;
                }
                if (i14 != 1 && i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return c23454a0;
        }
    }
}
