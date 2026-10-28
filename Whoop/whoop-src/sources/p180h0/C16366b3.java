package p180h0;

import c93.InterfaceC4351m;
import l83.C23454a0;
import p492t2.C33316d;
import p505ts.AbstractC34132o;
import p636y3.C39185q;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: h0.b3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16366b3 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public long f62915w;

    /* JADX INFO: renamed from: x */
    public int f62916x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ long f62917y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C16372c3 f62918z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16366b3(C16372c3 c16372c3, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f62918z = c16372c3;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C16366b3 c16366b3 = new C16366b3(this.f62918z, interfaceC30057d);
        c16366b3.f62917y = ((C39185q) obj).f168431a;
        return c16366b3;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        long j7 = ((C39185q) obj).f168431a;
        C16366b3 c16366b3 = new C16366b3(this.f62918z, (InterfaceC30057d) obj2);
        c16366b3.f62917y = j7;
        return c16366b3.invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        long j7;
        long j13;
        long j14;
        long j15;
        long j16;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f62916x;
        C16372c3 c16372c3 = this.f62918z;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            j7 = this.f62917y;
            C33316d c33316d = c16372c3.f62941f;
            this.f62917y = j7;
            this.f62916x = 1;
            obj = c33316d.m105691b(j7, this);
            if (obj != enumC31071a) {
            }
            return enumC31071a;
        }
        if (i13 == 1) {
            j7 = this.f62917y;
            AbstractC34132o.m107864I(obj);
        } else {
            if (i13 == 2) {
                j13 = this.f62915w;
                j7 = this.f62917y;
                AbstractC34132o.m107864I(obj);
                j14 = ((C39185q) obj).f168431a;
                C33316d c33316d2 = c16372c3.f62941f;
                long jM124815f = C39185q.m124815f(j13, j14);
                this.f62917y = j7;
                this.f62915w = j14;
                this.f62916x = 3;
                obj = c33316d2.m105690a(jM124815f, j14, this);
                if (obj != enumC31071a) {
                    j15 = j7;
                    j16 = j14;
                }
                return enumC31071a;
            }
            if (i13 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j16 = this.f62915w;
            j15 = this.f62917y;
            AbstractC34132o.m107864I(obj);
        }
        return new C39185q(C39185q.m124815f(j15, C39185q.m124815f(j16, ((C39185q) obj).f168431a)));
        long jM124815f2 = C39185q.m124815f(j7, ((C39185q) obj).f168431a);
        this.f62917y = j7;
        this.f62915w = jM124815f2;
        this.f62916x = 2;
        obj = c16372c3.m46568a(jM124815f2, this);
        if (obj != enumC31071a) {
            j13 = jM124815f2;
            j14 = ((C39185q) obj).f168431a;
            C33316d c33316d3 = c16372c3.f62941f;
            long jM124815f3 = C39185q.m124815f(j13, j14);
            this.f62917y = j7;
            this.f62915w = j14;
            this.f62916x = 3;
            obj = c33316d3.m105690a(jM124815f3, j14, this);
            if (obj != enumC31071a) {
                j15 = j7;
                j16 = j14;
                return new C39185q(C39185q.m124815f(j15, C39185q.m124815f(j16, ((C39185q) obj).f168431a)));
            }
        }
        return enumC31071a;
    }
}
