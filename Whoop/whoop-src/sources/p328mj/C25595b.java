package p328mj;

import android.content.Context;
import android.content.Intent;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.C13096w1;
import l83.C23454a0;
import p390p1.C28621h1;
import p390p1.InterfaceC28593a1;
import p395p6.AbstractC28880g0;
import p395p6.AbstractC28916s0;
import p409q0.AbstractC29701y;
import p409q0.C29674b;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import sz.AbstractC33147o;
import sz.C33161z;

/* JADX INFO: renamed from: mj.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C25595b extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f100415E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f100416w;

    /* JADX INFO: renamed from: x */
    public int f100417x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f100418y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f100419z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25595b(Object obj, int i13, Object obj2, InterfaceC30057d interfaceC30057d, int i14) {
        super(2, interfaceC30057d);
        this.f100416w = i14;
        this.f100419z = obj;
        this.f100418y = i13;
        this.f100415E = obj2;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f100416w) {
            case 0:
                return new C25595b((C29674b) this.f100419z, this.f100418y, (InterfaceC28593a1) this.f100415E, interfaceC30057d, 0);
            case 1:
                return new C25595b((AbstractC28916s0) this.f100419z, (Context) this.f100415E, this.f100418y, interfaceC30057d);
            default:
                return new C25595b((C33161z) this.f100419z, this.f100418y, (Intent) this.f100415E, interfaceC30057d, 2);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f100416w) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C25595b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f100416w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f100417x;
                int i14 = this.f100418y;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C29674b c29674b = (C29674b) this.f100419z;
                    this.f100417x = 1;
                    if (AbstractC29701y.m91155g(c29674b, i14, null, this, 6) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                ((C28621h1) ((InterfaceC28593a1) this.f100415E)).m87025y(i14);
                return C23454a0.f92919a;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i15 = this.f100417x;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    AbstractC28880g0 abstractC28880g0Mo28930f = ((AbstractC28916s0) this.f100419z).mo28930f();
                    Context context = (Context) this.f100415E;
                    this.f100417x = 1;
                    if (AbstractC28880g0.m87798r(abstractC28880g0Mo28930f, context, this.f100418y, null, this, 4, null) == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            default:
                C33161z c33161z = (C33161z) this.f100419z;
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i16 = this.f100417x;
                if (i16 != 0) {
                    if (i16 == 1) {
                        AbstractC34132o.m107864I(obj);
                    } else {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                    return C23454a0.f92919a;
                }
                AbstractC34132o.m107864I(obj);
                Intent intent = (Intent) this.f100415E;
                this.f100417x = 1;
                obj = c33161z.m105023n(this.f100418y, intent, this);
                if (obj == enumC31071a3) {
                    return enumC31071a3;
                }
                C13096w1 c13096w1 = c33161z.f138286K;
                this.f100417x = 2;
                if (c13096w1.emit((AbstractC33147o) obj, this) == enumC31071a3) {
                    return enumC31071a3;
                }
                return C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25595b(AbstractC28916s0 abstractC28916s0, Context context, int i13, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f100416w = 1;
        this.f100419z = abstractC28916s0;
        this.f100415E = context;
        this.f100418y = i13;
    }
}
