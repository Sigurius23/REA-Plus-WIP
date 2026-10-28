package p00;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.DisplayablePaymentDetails;
import d00.C11433l;
import d00.C11434m;
import ec3.AbstractC13091v;
import ec3.C13081r1;
import ec3.C13096w1;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import n20.C26175j;
import p000.C34292u;
import p478s3.AbstractC32098d;
import p505ts.AbstractC34132o;
import p599wz.C37702b;
import p599wz.C37708d;
import p599wz.C37735m;
import p599wz.C37741o;
import p631xz.C38721f0;
import p631xz.C38747x;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: p00.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C28575l extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f115614w;

    /* JADX INFO: renamed from: x */
    public int f115615x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C28578o f115616y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C28575l(C28578o c28578o, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f115614w = i13;
        this.f115616y = c28578o;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f115614w) {
            case 0:
                return new C28575l(this.f115616y, interfaceC30057d, 0);
            case 1:
                return new C28575l(this.f115616y, interfaceC30057d, 1);
            case 2:
                return new C28575l(this.f115616y, interfaceC30057d, 2);
            default:
                return new C28575l(this.f115616y, interfaceC30057d, 3);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f115614w) {
            case 0:
                return ((C28575l) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 1:
                ((C28575l) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 2:
                return ((C28575l) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C28575l) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0070  */
    /* JADX WARN: Code duplicated, block: B:34:0x0076  */
    /* JADX WARN: Code duplicated, block: B:35:0x0083  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object objM107888l;
        Throwable thM68037a;
        C11433l c11433l;
        String str;
        C13096w1 c13096w1;
        switch (this.f115614w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f115615x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C38747x c38747x = this.f115616y.f115638y;
                    this.f115615x = 1;
                    if (c38747x.m124158i(this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    ((C23468n) obj).getClass();
                }
                return C23454a0.f92919a;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f115615x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C28578o c28578o = this.f115616y;
                    C13081r1 c13081r1 = c28578o.f115634O;
                    C34292u c34292u = new C34292u(c28578o, 20);
                    this.f115615x = 1;
                    if (c13081r1.f45200w.collect(c34292u, this) == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                throw new KotlinNothingValueException();
            case 2:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i15 = this.f115615x;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f115615x = 1;
                    C28578o c28578o2 = this.f115616y;
                    Object objM36604n = AbstractC13091v.m36604n(c28578o2.f115626G.f161725b, new C26175j(c28578o2, (InterfaceC30057d) null, 11), this);
                    if (objM36604n != enumC31071a3) {
                        objM36604n = c23454a0;
                    }
                    if (objM36604n == enumC31071a3) {
                        return enumC31071a3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a0;
            default:
                C28578o c28578o3 = this.f115616y;
                Function1 function1 = c28578o3.f115630K;
                C38747x c38747x2 = c28578o3.f115638y;
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                int i16 = this.f115615x;
                if (i16 != 0) {
                    if (i16 == 1) {
                        AbstractC34132o.m107864I(obj);
                        objM107888l = ((C23468n) obj).f92940w;
                    } else {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                    return C23454a0.f92919a;
                }
                AbstractC34132o.m107864I(obj);
                C11433l c11433l2 = c28578o3.f115636w;
                if (c11433l2.f36650E) {
                    objM107888l = c11433l2;
                    objM107888l = null;
                }
                if (objM107888l != null) {
                    thM68037a = C23468n.m68037a(objM107888l);
                    if (thM68037a == null) {
                        c11433l = (C11433l) objM107888l;
                        str = c11433l.f36658M;
                        if (str == null) {
                            function1.invoke(new C37735m(AbstractC32098d.m99844j(c38747x2)));
                        } else {
                            C38721f0 c38721f0 = c28578o3.f115637x;
                            ConsumerSession consumerSession = c11433l.f36659w;
                            String str2 = c11433l.f36660x;
                            DisplayablePaymentDetails displayablePaymentDetails = c11433l.f36661y;
                            C11434m c11434m = c11433l.f36662z;
                            AbstractC22676k.m65750j(consumerSession, "consumerSession");
                            c38721f0.m124147a(new C37708d(new C11433l(consumerSession, str2, displayablePaymentDetails, c11434m, true), null));
                            c13096w1 = c28578o3.f115626G.f161724a;
                            this.f115615x = 2;
                            if (c13096w1.emit(str, this) == enumC31071a4) {
                                return enumC31071a4;
                            }
                        }
                    } else {
                        function1.invoke(new C37741o(thM68037a, C37702b.f161559w));
                    }
                } else {
                    this.f115615x = 1;
                    Object objM124163n = c38747x2.m124163n(this);
                    objM107888l = objM124163n;
                    if (objM124163n == enumC31071a4) {
                        return enumC31071a4;
                    }
                }
                return C23454a0.f92919a;
                if (!(objM107888l instanceof C23467m)) {
                    try {
                        objM107888l = ((C37708d) c38747x2.f166746a.f166664b.f45200w.getValue()).f161571w;
                        if (objM107888l == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } catch (Throwable th3) {
                        objM107888l = AbstractC34132o.m107888l(th3);
                    }
                }
                thM68037a = C23468n.m68037a(objM107888l);
                if (thM68037a == null) {
                    c11433l = (C11433l) objM107888l;
                    str = c11433l.f36658M;
                    if (str == null) {
                        function1.invoke(new C37735m(AbstractC32098d.m99844j(c38747x2)));
                    } else {
                        C38721f0 c38721f1 = c28578o3.f115637x;
                        ConsumerSession consumerSession2 = c11433l.f36659w;
                        String str3 = c11433l.f36660x;
                        DisplayablePaymentDetails displayablePaymentDetails2 = c11433l.f36661y;
                        C11434m c11434m2 = c11433l.f36662z;
                        AbstractC22676k.m65750j(consumerSession2, "consumerSession");
                        c38721f1.m124147a(new C37708d(new C11433l(consumerSession2, str3, displayablePaymentDetails2, c11434m2, true), null));
                        c13096w1 = c28578o3.f115626G.f161724a;
                        this.f115615x = 2;
                        if (c13096w1.emit(str, this) == enumC31071a4) {
                            return enumC31071a4;
                        }
                    }
                } else {
                    function1.invoke(new C37741o(thM68037a, C37702b.f161559w));
                }
                return C23454a0.f92919a;
        }
    }
}
