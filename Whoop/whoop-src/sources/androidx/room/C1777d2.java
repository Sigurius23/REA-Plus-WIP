package androidx.room;

import android.database.SQLException;
import c93.InterfaceC4351m;
import java.util.Set;
import l83.C23454a0;
import m83.C25235a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: androidx.room.d2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1777d2 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7001w;

    /* JADX INFO: renamed from: x */
    public int f7002x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f7003y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C1797i2 f7004z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1777d2(C1797i2 c1797i2, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f7001w = i13;
        this.f7004z = c1797i2;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f7001w) {
            case 0:
                C1777d2 c1777d2 = new C1777d2(this.f7004z, interfaceC30057d, 0);
                c1777d2.f7003y = obj;
                return c1777d2;
            default:
                C1777d2 c1777d3 = new C1777d2(this.f7004z, interfaceC30057d, 1);
                c1777d3.f7003y = obj;
                return c1777d3;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7001w) {
            case 0:
                return ((C1777d2) create((InterfaceC1837v1) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C1777d2) create((InterfaceC1843x1) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1843x1 interfaceC1843x1;
        switch (this.f7001w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f7002x;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                InterfaceC1837v1 interfaceC1837v1 = (InterfaceC1837v1) this.f7003y;
                this.f7002x = 1;
                Object objM5419a = C1797i2.m5419a(this.f7004z, interfaceC1837v1, this);
                return objM5419a == enumC31071a ? enumC31071a : objM5419a;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f7002x;
                try {
                    if (i14 != 0) {
                        if (i14 == 1) {
                            interfaceC1843x1 = (InterfaceC1843x1) this.f7003y;
                            AbstractC34132o.m107864I(obj);
                        } else {
                            if (i14 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC34132o.m107864I(obj);
                        }
                        return (Set) obj;
                    }
                    AbstractC34132o.m107864I(obj);
                    interfaceC1843x1 = (InterfaceC1843x1) this.f7003y;
                    this.f7003y = interfaceC1843x1;
                    this.f7002x = 1;
                    obj = interfaceC1843x1.mo5462a(this);
                    if (obj == enumC31071a2) {
                        return enumC31071a2;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        EnumC1840w1 enumC1840w1 = EnumC1840w1.f7204x;
                        C1777d2 c1777d2 = new C1777d2(this.f7004z, null, 0);
                        this.f7003y = null;
                        this.f7002x = 2;
                        obj = interfaceC1843x1.mo5463b(enumC1840w1, c1777d2, this);
                        if (obj == enumC31071a2) {
                            return enumC31071a2;
                        }
                        return (Set) obj;
                    }
                } catch (SQLException unused) {
                }
                return C25235a0.f99113w;
        }
    }
}
