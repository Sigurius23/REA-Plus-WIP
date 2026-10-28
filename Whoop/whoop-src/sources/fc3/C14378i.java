package fc3;

import androidx.room.C1769b2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: fc3.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C14378i extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC13062m f52491E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f52492w = 0;

    /* JADX INFO: renamed from: x */
    public int f52493x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f52494y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C14380k f52495z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14378i(C14380k c14380k, InterfaceC13062m interfaceC13062m, Object obj, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f52495z = c14380k;
        this.f52491E = interfaceC13062m;
        this.f52494y = obj;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f52492w) {
            case 0:
                return new C14378i(this.f52495z, this.f52491E, this.f52494y, interfaceC30057d);
            default:
                C14378i c14378i = new C14378i(this.f52495z, this.f52491E, interfaceC30057d);
                c14378i.f52494y = obj;
                return c14378i;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f52492w) {
            case 0:
                break;
        }
        return ((C14378i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [kotlin.jvm.functions.Function3, s83.i] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f52492w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f52493x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    ?? r10 = this.f52495z.f52502E;
                    Object obj2 = this.f52494y;
                    this.f52493x = 1;
                    if (r10.invoke(this.f52491E, obj2, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f52493x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f52494y;
                    C22669g0 c22669g0 = new C22669g0();
                    C14380k c14380k = this.f52495z;
                    InterfaceC13058l interfaceC13058l = c14380k.f52490z;
                    C1769b2 c1769b2 = new C1769b2(c22669g0, interfaceC2994c0, c14380k, this.f52491E);
                    this.f52493x = 1;
                    if (interfaceC13058l.collect(c1769b2, this) == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14378i(C14380k c14380k, InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f52495z = c14380k;
        this.f52491E = interfaceC13062m;
    }
}
