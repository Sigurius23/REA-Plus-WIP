package d30;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.InterfaceC13037f2;
import l83.C23454a0;
import n53.C26318e;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: d30.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C11526e extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37135w;

    /* JADX INFO: renamed from: x */
    public int f37136x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C11535h f37137y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11526e(C11535h c11535h, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f37135w = i13;
        this.f37137y = c11535h;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f37135w) {
            case 0:
                return new C11526e(this.f37137y, interfaceC30057d, 0);
            default:
                return new C11526e(this.f37137y, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f37135w) {
            case 0:
                ((C11526e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                break;
            default:
                ((C11526e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                break;
        }
        return EnumC31071a.f128113w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f37135w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f37136x;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw AbstractC2875y.m8309v(obj);
                }
                AbstractC34132o.m107864I(obj);
                C11535h c11535h = this.f37137y;
                C26318e c26318e = (C26318e) c11535h.f37193j;
                C11523d c11523d = new C11523d(c11535h, 0);
                this.f37136x = 1;
                c26318e.collect(c11523d, this);
                return enumC31071a;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f37136x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C11535h c11535h2 = this.f37137y;
                    InterfaceC13037f2 interfaceC13037f2 = (InterfaceC13037f2) c11535h2.f37185b;
                    C11523d c11523d2 = new C11523d(c11535h2, 1);
                    this.f37136x = 1;
                    if (interfaceC13037f2.collect(c11523d2, this) == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                throw new KotlinNothingValueException();
        }
    }
}
