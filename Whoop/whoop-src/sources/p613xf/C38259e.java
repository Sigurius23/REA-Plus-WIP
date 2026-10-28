package p613xf;

import bc3.InterfaceC2994c0;
import bg.C3215j;
import c93.InterfaceC4351m;
import gf.InterfaceC15761b;
import gm.C15990r;
import l83.C23454a0;
import l83.C23470p;
import l83.InterfaceC23462h;
import p048ce.C4463d;
import p368og.InterfaceC27910g;
import p460rg.C31371f;
import p505ts.AbstractC34132o;
import p550vd.AbstractC35903f;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import ve.C35922g;

/* JADX INFO: renamed from: xf.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C38259e extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC15761b f164029E;

    /* JADX INFO: renamed from: F */
    public InterfaceC23462h f164030F;

    /* JADX INFO: renamed from: G */
    public Object[] f164031G;

    /* JADX INFO: renamed from: H */
    public InterfaceC27910g f164032H;

    /* JADX INFO: renamed from: I */
    public InterfaceC38257c f164033I;

    /* JADX INFO: renamed from: J */
    public int f164034J;

    /* JADX INFO: renamed from: K */
    public int f164035K;

    /* JADX INFO: renamed from: L */
    public int f164036L;

    /* JADX INFO: renamed from: w */
    public int f164037w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f164038x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C31371f f164039y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C35922g f164040z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38259e(C31371f c31371f, InterfaceC30057d interfaceC30057d, C35922g c35922g, InterfaceC15761b interfaceC15761b) {
        super(2, interfaceC30057d);
        this.f164039y = c31371f;
        this.f164040z = c35922g;
        this.f164029E = interfaceC15761b;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C38259e c38259e = new C38259e(this.f164039y, interfaceC30057d, this.f164040z, this.f164029E);
        c38259e.f164038x = obj;
        return c38259e;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C38259e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [bc3.c0] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0082 -> B:20:0x0085). Please report as a decompilation issue!!! */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC23462h interfaceC23462h;
        InterfaceC38257c[] interfaceC38257cArr;
        InterfaceC27910g interfaceC27910g;
        int i13;
        ?? length;
        InterfaceC38257c interfaceC38257c;
        ?? r10 = (InterfaceC2994c0) this.f164038x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = this.f164037w;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC30063j coroutineContext = r10.getCoroutineContext();
                String qualifiedName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35922g.class).getQualifiedName();
                if (qualifiedName == null) {
                    throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object");
                }
                C15990r c15990rM113984B = AbstractC35903f.m113984B(coroutineContext, qualifiedName);
                C35922g c35922g = this.f164040z;
                C23470p c23470pM92088H = AbstractC30060g.m92088H(new C3215j(c35922g, 20));
                InterfaceC38257c[] interfaceC38257cArr2 = c35922g.f152987w;
                interfaceC27910g = c15990rM113984B;
                interfaceC23462h = c23470pM92088H;
                interfaceC38257cArr = interfaceC38257cArr2;
                length = interfaceC38257cArr2.length;
                i14 = 0;
                i13 = 0;
                if (i14 >= length) {
                    throw ((Throwable) interfaceC23462h.getValue());
                }
                interfaceC38257c = interfaceC38257cArr[i14];
                interfaceC27910g.mo394s(null, new C3215j(interfaceC38257c, 19));
                InterfaceC15761b interfaceC15761b = this.f164029E;
                this.f164038x = null;
                this.f164030F = interfaceC23462h;
                this.f164031G = interfaceC38257cArr;
                this.f164032H = interfaceC27910g;
                this.f164033I = interfaceC38257c;
                this.f164034J = i13;
                this.f164035K = i14;
                this.f164036L = length;
                this.f164037w = 1;
                obj = interfaceC38257c.mo79294b(interfaceC15761b, this);
                r10 = length;
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i15 = this.f164036L;
                i14 = this.f164035K;
                i13 = this.f164034J;
                interfaceC38257c = this.f164033I;
                interfaceC27910g = this.f164032H;
                interfaceC38257cArr = (InterfaceC38257c[]) this.f164031G;
                interfaceC23462h = this.f164030F;
                AbstractC34132o.m107864I(obj);
                r10 = i15;
            }
        } catch (Exception e5) {
            interfaceC27910g.mo396u(null, new C4463d(16, interfaceC38257c, e5));
            AbstractC29125c.m88530g((Throwable) interfaceC23462h.getValue(), e5);
            i14++;
            length = r10;
        }
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type I of aws.smithy.kotlin.runtime.identity.IdentityProviderChain");
        return (InterfaceC38255a) obj;
    }
}
