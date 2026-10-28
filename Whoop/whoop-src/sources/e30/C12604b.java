package e30;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import d30.C11560s;
import ec3.AbstractC13091v;
import ec3.C13043h0;
import l83.C23454a0;
import n53.C26318e;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import x30.C37884e0;

/* JADX INFO: renamed from: e30.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C12604b extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f42998w;

    /* JADX INFO: renamed from: x */
    public int f42999x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC12605c f43000y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12604b(AbstractC12605c abstractC12605c, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f42998w = i13;
        this.f43000y = abstractC12605c;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f42998w) {
            case 0:
                return new C12604b(this.f43000y, interfaceC30057d, 0);
            default:
                return new C12604b(this.f43000y, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f42998w) {
            case 0:
                return ((C12604b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            default:
                ((C12604b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f42998w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f42999x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    AbstractC12605c abstractC12605c = this.f43000y;
                    C13043h0 c13043h0M36612v = AbstractC13091v.m36612v(abstractC12605c.f43009M.f127270g, 1);
                    C11560s c11560s = new C11560s(abstractC12605c, 1);
                    this.f42999x = 1;
                    if (c13043h0M36612v.collect(c11560s, this) == enumC31071a) {
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
                int i14 = this.f42999x;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw AbstractC2875y.m8309v(obj);
                }
                AbstractC34132o.m107864I(obj);
                AbstractC12605c abstractC12605c2 = this.f43000y;
                C26318e c26318e = ((C37884e0) abstractC12605c2.f43018V.getValue()).f162223p;
                C11560s c11560s2 = new C11560s(abstractC12605c2, 2);
                this.f42999x = 1;
                c26318e.collect(c11560s2, this);
                return enumC31071a2;
        }
    }
}
