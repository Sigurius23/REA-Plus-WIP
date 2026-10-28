package p249jc;

import androidx.work.impl.WorkerStoppedException;
import bc3.AbstractC3006f0;
import bc3.C3031l1;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.iterable.iterableapi.CallableC5351m1;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import p218ic.C18389w;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: jc.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C21578g0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f82750w;

    /* JADX INFO: renamed from: x */
    public int f82751x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C21582i0 f82752y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21578g0(C21582i0 c21582i0, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f82750w = i13;
        this.f82752y = c21582i0;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f82750w) {
            case 0:
                return new C21578g0(this.f82752y, interfaceC30057d, 0);
            default:
                return new C21578g0(this.f82752y, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f82750w) {
            case 0:
                break;
        }
        return ((C21578g0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object c21570c0;
        switch (this.f82750w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f82751x;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                this.f82751x = 1;
                Object objM60626a = C21582i0.m60626a(this.f82752y, this);
                return objM60626a == enumC31071a ? enumC31071a : objM60626a;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f82751x;
                C21582i0 c21582i0 = this.f82752y;
                try {
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj);
                        C3031l1 c3031l1 = c21582i0.f82771n;
                        C21578g0 c21578g0 = new C21578g0(c21582i0, null, 0);
                        this.f82751x = 1;
                        obj = AbstractC3006f0.m8705K(c3031l1, c21578g0, this);
                        if (obj == enumC31071a2) {
                            return enumC31071a2;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                    c21570c0 = (AbstractC21576f0) obj;
                    break;
                } catch (WorkerStoppedException e5) {
                    c21570c0 = new C21574e0(e5.f7351w);
                } catch (CancellationException unused) {
                    c21570c0 = new C21570c0();
                } catch (Throwable th3) {
                    C18389w.m52886d().m52890c(AbstractC21584j0.f82776a, "Unexpected error in WorkerWrapper", th3);
                    c21570c0 = new C21570c0();
                }
                Object objRunInTransaction = c21582i0.f82766i.runInTransaction(new CallableC5351m1(4, c21570c0, c21582i0));
                AbstractC22676k.m65749i(objRunInTransaction, "runInTransaction(...)");
                return objRunInTransaction;
        }
    }
}
