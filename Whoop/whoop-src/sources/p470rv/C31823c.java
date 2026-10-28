package p470rv;

import androidx.room.C1841x;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13058l;
import fc3.C14380k;
import l83.C23454a0;
import m63.C25126d;
import p000.C36623w;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: rv.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C31823c extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C31833m f131845E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f131846w = 0;

    /* JADX INFO: renamed from: x */
    public int f131847x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C25126d f131848y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC13058l f131849z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31823c(InterfaceC13058l interfaceC13058l, C31833m c31833m, C25126d c25126d, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f131849z = interfaceC13058l;
        this.f131845E = c31833m;
        this.f131848y = c25126d;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f131846w) {
            case 0:
                return new C31823c(this.f131849z, this.f131845E, this.f131848y, interfaceC30057d);
            default:
                return new C31823c(this.f131848y, this.f131849z, this.f131845E, interfaceC30057d);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f131846w) {
            case 0:
                break;
        }
        return ((C31823c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f131846w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f131847x;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C1841x c1841x = new C1841x(13, this.f131845E, this.f131848y);
                    this.f131847x = 1;
                    Object objCollect = this.f131849z.collect(new C36623w(c1841x, 13), this);
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
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f131847x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C25126d c25126d = this.f131848y;
                    C14380k c14380kM36590P = AbstractC13091v.m36590P((C13045h2) c25126d.f98479E, new C31826f((InterfaceC30057d) null, c25126d, this.f131849z));
                    C31824d c31824d = new C31824d(this.f131845E, 0);
                    this.f131847x = 1;
                    if (c14380kM36590P.collect(c31824d, this) == enumC31071a2) {
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
    public C31823c(C25126d c25126d, InterfaceC13058l interfaceC13058l, C31833m c31833m, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f131848y = c25126d;
        this.f131849z = interfaceC13058l;
        this.f131845E = c31833m;
    }
}
