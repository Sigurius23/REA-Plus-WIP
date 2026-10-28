package f53;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import x43.AbstractC37979k;

/* JADX INFO: renamed from: f53.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C14114b extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f50722w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC22680m f50723x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC37979k f50724y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C14114b(Function1 function1, AbstractC37979k abstractC37979k, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f50722w = i13;
        switch (i13) {
            case 1:
                this.f50723x = (AbstractC22680m) function1;
                this.f50724y = abstractC37979k;
                super(2, interfaceC30057d);
                break;
            default:
                this.f50723x = (AbstractC22680m) function1;
                this.f50724y = abstractC37979k;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f50722w) {
            case 0:
                return new C14114b(this.f50723x, this.f50724y, interfaceC30057d, 0);
            default:
                return new C14114b(this.f50723x, this.f50724y, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f50722w) {
            case 0:
                C14114b c14114b = (C14114b) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c14114b.invokeSuspend(c23454a0);
                return c23454a0;
            default:
                C14114b c14114b2 = (C14114b) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a1 = C23454a0.f92919a;
                c14114b2.invokeSuspend(c23454a1);
                return c23454a1;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f50722w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        AbstractC37979k abstractC37979k = this.f50724y;
        ?? r10 = this.f50723x;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                r10.invoke(abstractC37979k);
                break;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                r10.invoke(abstractC37979k);
                break;
        }
        return c23454a0;
    }
}
