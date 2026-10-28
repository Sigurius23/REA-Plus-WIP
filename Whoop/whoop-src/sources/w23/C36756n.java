package w23;

import b33.EnumC2688i;
import bc3.InterfaceC2994c0;
import be.C3151d;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ch.C4588i;
import ec3.AbstractC13091v;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import fc3.C14380k;
import l83.C23454a0;
import p470rv.C31826f;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22672i;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: w23.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C36756n extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ AbstractC22680m f157299E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C22672i f157300F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ EnumC2688i f157301G;

    /* JADX INFO: renamed from: w */
    public int f157302w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC13037f2 f157303x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC22680m f157304y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C36758p f157305z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C36756n(InterfaceC13037f2 interfaceC13037f2, Function1 function1, C36758p c36758p, InterfaceC4339a interfaceC4339a, Function1 function2, EnumC2688i enumC2688i, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f157303x = interfaceC13037f2;
        this.f157304y = (AbstractC22680m) function1;
        this.f157305z = c36758p;
        this.f157299E = (AbstractC22680m) interfaceC4339a;
        this.f157300F = (C22672i) function2;
        this.f157301G = enumC2688i;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r4v0, types: [c93.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        return new C36756n(this.f157303x, this.f157304y, this.f157305z, this.f157299E, this.f157300F, this.f157301G, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C36756n) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r5v0, types: [c93.a, kotlin.jvm.internal.m] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f157302w;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            C14380k c14380kM36590P = AbstractC13091v.m36590P(new C4588i(this.f157303x, 2), new C3151d(null, this.f157304y));
            C36758p c36758p = this.f157305z;
            InterfaceC13058l interfaceC13058lM36610t = AbstractC13091v.m36610t(AbstractC13091v.m36590P(c14380kM36590P, new C31826f((InterfaceC30057d) null, c36758p, (InterfaceC4339a) this.f157299E)));
            C36752j c36752j = new C36752j(c36758p, this.f157300F, this.f157301G);
            this.f157302w = 1;
            if (interfaceC13058lM36610t.collect(c36752j, this) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return C23454a0.f92919a;
    }
}
