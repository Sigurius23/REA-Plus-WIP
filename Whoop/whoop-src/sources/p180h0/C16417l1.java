package p180h0;

import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p181h2.C16617b;
import p505ts.AbstractC34132o;
import p636y3.C39185q;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: h0.l1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16417l1 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ long f63085E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63086w;

    /* JADX INFO: renamed from: x */
    public int f63087x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f63088y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f63089z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C16417l1(long j7, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f63086w = 2;
        this.f63085E = j7;
        this.f63089z = (AbstractC32275i) interfaceC4351m;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [c93.m, s83.i] */
    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f63086w) {
            case 0:
                C16417l1 c16417l1 = new C16417l1((C16422m1) this.f63089z, this.f63085E, interfaceC30057d, 0);
                c16417l1.f63088y = obj;
                return c16417l1;
            case 1:
                C16417l1 c16417l2 = new C16417l1((C16422m1) this.f63089z, this.f63085E, interfaceC30057d, 1);
                c16417l2.f63088y = obj;
                return c16417l2;
            default:
                C16417l1 c16417l3 = new C16417l1(this.f63085E, (AbstractC32275i) this.f63089z, interfaceC30057d);
                c16417l3.f63088y = obj;
                return c16417l3;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f63086w) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C16417l1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [c93.m, s83.i] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        InterfaceC2994c0 interfaceC2994c0;
        int i13 = this.f63086w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj2 = this.f63089z;
        long j7 = this.f63085E;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = this.f63087x;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                InterfaceC2994c0 interfaceC2994c1 = (InterfaceC2994c0) this.f63088y;
                Function3 function3 = ((C16422m1) obj2).f63117c0;
                C16617b c16617b = new C16617b(j7);
                this.f63087x = 1;
                return function3.invoke(interfaceC2994c1, c16617b, this) == enumC31071a ? enumC31071a : c23454a0;
            case 1:
                C16422m1 c16422m1 = (C16422m1) obj2;
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i15 = this.f63087x;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                InterfaceC2994c0 interfaceC2994c2 = (InterfaceC2994c0) this.f63088y;
                Function3 function4 = c16422m1.f63118d0;
                long jM124817h = C39185q.m124817h(c16422m1.f63119e0 ? -1.0f : 1.0f, j7);
                EnumC16377d2 enumC16377d2 = c16422m1.f63115a0;
                C16407j1 c16407j1 = AbstractC16412k1.f63074a;
                Float f13 = new Float(enumC16377d2 == EnumC16377d2.f62971w ? C39185q.m124814e(jM124817h) : C39185q.m124813d(jM124817h));
                this.f63087x = 1;
                return function4.invoke(interfaceC2994c2, f13, this) == enumC31071a2 ? enumC31071a2 : c23454a0;
            default:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i16 = this.f63087x;
                if (i16 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC2994c0 interfaceC2994c3 = (InterfaceC2994c0) this.f63088y;
                    this.f63088y = interfaceC2994c3;
                    this.f63087x = 1;
                    if (AbstractC3034m0.m8782b(j7, this) != enumC31071a3) {
                        interfaceC2994c0 = interfaceC2994c3;
                    }
                    return enumC31071a3;
                }
                if (i16 != 1) {
                    if (i16 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                interfaceC2994c0 = (InterfaceC2994c0) this.f63088y;
                AbstractC34132o.m107864I(obj);
                this.f63088y = null;
                this.f63087x = 2;
                if (((AbstractC32275i) obj2).invoke(interfaceC2994c0, this) != enumC31071a3) {
                    return c23454a0;
                }
                return enumC31071a3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16417l1(C16422m1 c16422m1, long j7, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f63086w = i13;
        this.f63089z = c16422m1;
        this.f63085E = j7;
    }
}
