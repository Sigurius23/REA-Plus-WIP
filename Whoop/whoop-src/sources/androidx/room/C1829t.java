package androidx.room;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: androidx.room.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1829t extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7174w;

    /* JADX INFO: renamed from: x */
    public int f7175x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C1835v f7176y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1829t(C1835v c1835v, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f7174w = i13;
        this.f7176y = c1835v;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f7174w) {
            case 0:
                return new C1829t(this.f7176y, interfaceC30057d, 0);
            default:
                return new C1829t(this.f7176y, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f7174w) {
            case 0:
                break;
        }
        return ((C1829t) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f7174w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f7175x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C1797i2 c1797i2 = this.f7176y.f7189c;
                    this.f7175x = 1;
                    if (c1797i2.m5424f(this) == enumC31071a) {
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
                int i14 = this.f7175x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f7175x = 1;
                    if (this.f7176y.m5457d(this) == enumC31071a2) {
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
}
