package bm;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p180h0.InterfaceC16413k2;
import p505ts.AbstractC34132o;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.internal.C22663d0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: bm.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C3384h extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f13211w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f13212x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f13213y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f13214z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3384h(C22663d0 c22663d0, float f13, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f13214z = c22663d0;
        this.f13212x = f13;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f13211w) {
            case 0:
                return new C3384h((InterfaceC39171c) this.f13213y, (C3396t) this.f13214z, this.f13212x, interfaceC30057d);
            default:
                C3384h c3384h = new C3384h((C22663d0) this.f13214z, this.f13212x, interfaceC30057d);
                c3384h.f13213y = obj;
                return c3384h;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13211w) {
            case 0:
                C3384h c3384h = (C3384h) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c3384h.invokeSuspend(c23454a0);
                return c23454a0;
            default:
                C3384h c3384h2 = (C3384h) create((InterfaceC16413k2) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a1 = C23454a0.f92919a;
                c3384h2.invokeSuspend(c23454a1);
                return c23454a1;
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f13211w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        float f13 = this.f13212x;
        Object obj2 = this.f13214z;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                ((C3396t) obj2).f13254c.setValue(Integer.valueOf(((InterfaceC39171c) this.f13213y).mo724F(f13)));
                break;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                ((C22663d0) obj2).f89331w = ((InterfaceC16413k2) this.f13213y).mo29373a(f13);
                break;
        }
        return c23454a0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3384h(InterfaceC39171c interfaceC39171c, C3396t c3396t, float f13, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f13213y = interfaceC39171c;
        this.f13214z = c3396t;
        this.f13212x = f13;
    }
}
