package t23;

import androidx.room.C1841x;
import ch.C4588i;
import ch.C4594o;
import d33.C11602h1;
import e33.C12645n;
import e33.C12662v0;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fc3.C14380k;
import l83.C23454a0;
import p000.C36623w;
import p007a6.C0454t;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: t23.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C33361b extends AbstractC32275i implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f139213w;

    /* JADX INFO: renamed from: x */
    public int f139214x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ InterfaceC13062m f139215y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f139216z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C33361b(int i13, int i14, InterfaceC30057d interfaceC30057d) {
        super(i13, interfaceC30057d);
        this.f139213w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC13062m interfaceC13062m = (InterfaceC13062m) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj3;
        switch (this.f139213w) {
            case 0:
                C33361b c33361b = new C33361b(3, 0, interfaceC30057d);
                c33361b.f139215y = interfaceC13062m;
                c33361b.f139216z = obj2;
                return c33361b.invokeSuspend(C23454a0.f92919a);
            case 1:
                C33361b c33361b2 = new C33361b(3, 1, interfaceC30057d);
                c33361b2.f139215y = interfaceC13062m;
                c33361b2.f139216z = obj2;
                return c33361b2.invokeSuspend(C23454a0.f92919a);
            case 2:
                C33361b c33361b3 = new C33361b(3, 2, interfaceC30057d);
                c33361b3.f139215y = interfaceC13062m;
                c33361b3.f139216z = obj2;
                return c33361b3.invokeSuspend(C23454a0.f92919a);
            case 3:
                C33361b c33361b4 = new C33361b(3, 3, interfaceC30057d);
                c33361b4.f139215y = interfaceC13062m;
                c33361b4.f139216z = obj2;
                return c33361b4.invokeSuspend(C23454a0.f92919a);
            case 4:
                C33361b c33361b5 = new C33361b(3, 4, interfaceC30057d);
                c33361b5.f139215y = interfaceC13062m;
                c33361b5.f139216z = obj2;
                return c33361b5.invokeSuspend(C23454a0.f92919a);
            case 5:
                C33361b c33361b6 = new C33361b(3, 5, interfaceC30057d);
                c33361b6.f139215y = interfaceC13062m;
                c33361b6.f139216z = obj2;
                return c33361b6.invokeSuspend(C23454a0.f92919a);
            default:
                C33361b c33361b7 = new C33361b(3, 6, interfaceC30057d);
                c33361b7.f139215y = interfaceC13062m;
                c33361b7.f139216z = obj2;
                return c33361b7.invokeSuspend(C23454a0.f92919a);
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f139213w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f139214x;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13062m interfaceC13062m = this.f139215y;
                    C14380k c14380kM36590P = AbstractC13091v.m36590P(new C4588i(((C11602h1) this.f139216z).f37421A, 2), new C33361b(3, 1, null));
                    this.f139214x = 1;
                    AbstractC13091v.m36615y(interfaceC13062m);
                    Object objCollect = c14380kM36590P.collect(new C36623w(new C36623w(interfaceC13062m, 16), 15), this);
                    if (objCollect != enumC31071a) {
                        objCollect = c23454a0;
                    }
                    if (objCollect != enumC31071a) {
                        objCollect = c23454a0;
                    }
                    if (objCollect != enumC31071a) {
                        objCollect = c23454a0;
                    }
                    if (objCollect == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a0;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f139214x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13062m interfaceC13062m2 = this.f139215y;
                    C13045h2 c13045h2 = ((C12645n) this.f139216z).f43278r;
                    this.f139214x = 1;
                    if (AbstractC13091v.m36613w(interfaceC13062m2, c13045h2, this) == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            case 2:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i15 = this.f139214x;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return C23454a0.f92919a;
                }
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m3 = this.f139215y;
                C13045h2 c13045h3 = ((C11602h1) this.f139216z).f37421A;
                this.f139214x = 1;
                AbstractC13091v.m36615y(interfaceC13062m3);
                c13045h3.collect(new C0454t(interfaceC13062m3, 2), this);
                return enumC31071a3;
            case 3:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                int i16 = this.f139214x;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return C23454a0.f92919a;
                }
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m4 = this.f139215y;
                C12645n c12645n = (C12645n) this.f139216z;
                C13045h2 c13045h4 = c12645n.f43279s;
                this.f139214x = 1;
                AbstractC13091v.m36615y(interfaceC13062m4);
                c13045h4.collect(new C1841x(15, interfaceC13062m4, c12645n), this);
                return enumC31071a4;
            case 4:
                EnumC31071a enumC31071a5 = EnumC31071a.f128113w;
                int i17 = this.f139214x;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return C23454a0.f92919a;
                }
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m5 = this.f139215y;
                C13045h2 c13045h5 = ((C11602h1) this.f139216z).f37464z;
                this.f139214x = 1;
                AbstractC13091v.m36615y(interfaceC13062m5);
                c13045h5.collect(new C0454t(interfaceC13062m5, 2), this);
                return enumC31071a5;
            case 5:
                EnumC31071a enumC31071a6 = EnumC31071a.f128113w;
                int i18 = this.f139214x;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return C23454a0.f92919a;
                }
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m6 = this.f139215y;
                C12662v0 c12662v0 = (C12662v0) this.f139216z;
                C13045h2 c13045h6 = c12662v0.f43278r;
                this.f139214x = 1;
                AbstractC13091v.m36615y(interfaceC13062m6);
                c13045h6.collect(new C36623w(new C1841x(19, interfaceC13062m6, c12662v0), 20), this);
                return enumC31071a6;
            default:
                EnumC31071a enumC31071a7 = EnumC31071a.f128113w;
                int i19 = this.f139214x;
                if (i19 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13062m interfaceC13062m7 = this.f139215y;
                    C33392g2 c33392g2 = (C33392g2) this.f139216z;
                    InterfaceC13058l c0456u = c33392g2 == null ? new C0456u(null, 1) : new C4594o(c33392g2.f139437p, 8);
                    this.f139214x = 1;
                    if (AbstractC13091v.m36613w(interfaceC13062m7, c0456u, this) == enumC31071a7) {
                        return enumC31071a7;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
        }
    }
}
