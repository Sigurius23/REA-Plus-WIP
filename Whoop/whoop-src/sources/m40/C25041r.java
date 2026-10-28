package m40;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p180h0.InterfaceC16413k2;
import p329n0.C26061n;
import p329n0.C26065r;
import p329n0.C26068u;
import p389p0.AbstractC28547r0;
import p505ts.AbstractC34132o;
import p636y3.InterfaceC39171c;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: m40.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C25041r extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f98106E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f98107F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f98108w = 0;

    /* JADX INFO: renamed from: x */
    public int f98109x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f98110y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f98111z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25041r(C25046w c25046w, String str, int i13, int i14, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f98106E = c25046w;
        this.f98107F = str;
        this.f98110y = i13;
        this.f98111z = i14;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f98108w) {
            case 0:
                return new C25041r((C25046w) this.f98106E, (String) this.f98107F, this.f98110y, this.f98111z, interfaceC30057d);
            default:
                C25041r c25041r = new C25041r((C26068u) this.f98107F, this.f98110y, this.f98111z, interfaceC30057d);
                c25041r.f98106E = obj;
                return c25041r;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f98108w) {
            case 0:
                return ((C25041r) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C25041r) create((InterfaceC16413k2) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f98108w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f98109x;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                C25046w c25046w = (C25046w) this.f98106E;
                String str = (String) this.f98107F;
                C25040q c25040q = new C25040q(c25046w, str, this.f98110y, this.f98111z, null);
                this.f98109x = 1;
                Object objM73485e = C25046w.m73485e(c25046w, str, c25040q, this);
                return objM73485e == enumC31071a ? enumC31071a : objM73485e;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f98109x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC16413k2 interfaceC16413k2 = (InterfaceC16413k2) this.f98106E;
                    C26068u c26068u = (C26068u) this.f98107F;
                    C26065r c26065r = new C26065r(interfaceC16413k2, c26068u, 0);
                    InterfaceC39171c interfaceC39171c = ((C26061n) c26068u.f103223f.getValue()).f103175i;
                    this.f98109x = 1;
                    if (AbstractC28547r0.m86844a(c26065r, this.f98110y, this.f98111z, 100, interfaceC39171c, this) == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25041r(C26068u c26068u, int i13, int i14, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f98107F = c26068u;
        this.f98110y = i13;
        this.f98111z = i14;
    }
}
