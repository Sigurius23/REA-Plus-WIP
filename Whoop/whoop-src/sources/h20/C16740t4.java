package h20;

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

/* JADX INFO: renamed from: h20.t4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16740t4 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f64298w;

    /* JADX INFO: renamed from: x */
    public int f64299x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C16776z4 f64300y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16740t4(C16776z4 c16776z4, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f64298w = i13;
        this.f64300y = c16776z4;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f64298w) {
            case 0:
                return new C16740t4(this.f64300y, interfaceC30057d, 0);
            case 1:
                return new C16740t4(this.f64300y, interfaceC30057d, 1);
            default:
                return new C16740t4(this.f64300y, interfaceC30057d, 2);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f64298w) {
            case 0:
                ((C16740t4) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                break;
            case 1:
                ((C16740t4) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                break;
            default:
                ((C16740t4) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                break;
        }
        return EnumC31071a.f128113w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f64298w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f64299x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C16776z4 c16776z4 = this.f64300y;
                    InterfaceC13037f2 interfaceC13037f2 = c16776z4.f64488g;
                    C16734s4 c16734s4 = new C16734s4(c16776z4, 0);
                    this.f64299x = 1;
                    if (interfaceC13037f2.collect(c16734s4, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                throw new KotlinNothingValueException();
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f64299x;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw AbstractC2875y.m8309v(obj);
                }
                AbstractC34132o.m107864I(obj);
                C16776z4 c16776z5 = this.f64300y;
                C26318e c26318e = c16776z5.f64496o;
                C16734s4 c16734s5 = new C16734s4(c16776z5, 1);
                this.f64299x = 1;
                c26318e.collect(c16734s5, this);
                return enumC31071a2;
            default:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i15 = this.f64299x;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw AbstractC2875y.m8309v(obj);
                }
                AbstractC34132o.m107864I(obj);
                C16776z4 c16776z6 = this.f64300y;
                C26318e c26318e2 = c16776z6.f64490i.f64022c;
                C16734s4 c16734s6 = new C16734s4(c16776z6, 2);
                this.f64299x = 1;
                c26318e2.collect(c16734s6, this);
                return enumC31071a3;
        }
    }
}
