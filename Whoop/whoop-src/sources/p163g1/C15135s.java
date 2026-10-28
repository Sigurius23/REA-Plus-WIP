package p163g1;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ec3.C13084s1;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: g1.s */
/* JADX INFO: loaded from: classes5.dex */
public final class C15135s extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC4351m f56742E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56743w;

    /* JADX INFO: renamed from: x */
    public int f56744x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f56745y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4339a f56746z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15135s(InterfaceC4339a interfaceC4339a, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f56743w = i13;
        this.f56746z = interfaceC4339a;
        this.f56742E = interfaceC4351m;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f56743w) {
            case 0:
                C15135s c15135s = new C15135s(this.f56746z, this.f56742E, interfaceC30057d, 0);
                c15135s.f56745y = obj;
                return c15135s;
            default:
                C15135s c15135s2 = new C15135s(this.f56746z, this.f56742E, interfaceC30057d, 1);
                c15135s2.f56745y = obj;
                return c15135s2;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f56743w) {
            case 0:
                break;
        }
        return ((C15135s) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f56743w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f56744x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f56745y;
                    C22669g0 c22669g0 = new C22669g0();
                    C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(this.f56746z);
                    C15125r c15125r = new C15125r(c22669g0, interfaceC2994c0, this.f56742E, 0);
                    this.f56744x = 1;
                    if (c13084s1M87240H.collect(c15125r, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f56744x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC2994c0 interfaceC2994c1 = (InterfaceC2994c0) this.f56745y;
                    C22669g0 c22669g1 = new C22669g0();
                    C13084s1 c13084s1M87240H2 = AbstractC28683x.m87240H(this.f56746z);
                    C15125r c15125r2 = new C15125r(c22669g1, interfaceC2994c1, this.f56742E, 1);
                    this.f56744x = 1;
                    if (c13084s1M87240H2.collect(c15125r2, this) == enumC31071a2) {
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
}
