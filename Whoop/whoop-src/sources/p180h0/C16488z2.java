package p180h0;

import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p636y3.C39185q;
import p715kotlin.jvm.internal.C22667f0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: h0.z2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16488z2 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f63365E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C16372c3 f63366F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C22667f0 f63367G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ long f63368H;

    /* JADX INFO: renamed from: w */
    public C16372c3 f63369w;

    /* JADX INFO: renamed from: x */
    public C22667f0 f63370x;

    /* JADX INFO: renamed from: y */
    public long f63371y;

    /* JADX INFO: renamed from: z */
    public int f63372z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16488z2(C16372c3 c16372c3, C22667f0 c22667f0, long j7, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f63366F = c16372c3;
        this.f63367G = c22667f0;
        this.f63368H = j7;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C16488z2 c16488z2 = new C16488z2(this.f63366F, this.f63367G, this.f63368H, interfaceC30057d);
        c16488z2.f63365E = obj;
        return c16488z2;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C16488z2) create((C16360a3) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        C16372c3 c16372c3;
        C22667f0 c22667f0;
        long j7;
        C16372c3 c16372c4;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f63372z;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            C16360a3 c16360a3 = (C16360a3) this.f63365E;
            c16372c3 = this.f63366F;
            C16400i c16400i = new C16400i(1, c16372c3, c16360a3);
            InterfaceC16432o1 interfaceC16432o1 = c16372c3.f62938c;
            c22667f0 = this.f63367G;
            long j13 = c22667f0.f89335w;
            EnumC16377d2 enumC16377d2 = c16372c3.f62939d;
            EnumC16377d2 enumC16377d3 = EnumC16377d2.f62972x;
            long j14 = this.f63368H;
            float fM46571d = c16372c3.m46571d(enumC16377d2 == enumC16377d3 ? C39185q.m124813d(j14) : C39185q.m124814e(j14));
            this.f63365E = c16372c3;
            this.f63369w = c16372c3;
            this.f63370x = c22667f0;
            this.f63371y = j13;
            this.f63372z = 1;
            obj = interfaceC16432o1.mo46565a(c16400i, fM46571d, this);
            if (obj == enumC31071a) {
                return enumC31071a;
            }
            j7 = j13;
            c16372c4 = c16372c3;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j7 = this.f63371y;
            c22667f0 = this.f63370x;
            c16372c3 = this.f63369w;
            c16372c4 = (C16372c3) this.f63365E;
            AbstractC34132o.m107864I(obj);
        }
        float fM46571d2 = c16372c4.m46571d(((Number) obj).floatValue());
        c22667f0.f89335w = c16372c3.f62939d == EnumC16377d2.f62972x ? C39185q.m124811b(fM46571d2, 0.0f, j7, 2) : C39185q.m124811b(0.0f, fM46571d2, j7, 1);
        return C23454a0.f92919a;
    }
}
