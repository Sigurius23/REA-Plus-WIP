package p007a6;

import c93.InterfaceC4351m;
import l83.C23454a0;
import l83.C23465k;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: a6.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0411c0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f1410E;

    /* JADX INFO: renamed from: F */
    public Object f1411F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1412w;

    /* JADX INFO: renamed from: x */
    public int f1413x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ boolean f1414y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C0429i0 f1415z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0411c0(C0429i0 c0429i0, int i13, InterfaceC30057d interfaceC30057d, int i14) {
        super(2, interfaceC30057d);
        this.f1412w = i14;
        this.f1415z = c0429i0;
        this.f1410E = i13;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f1412w) {
            case 0:
                C0411c0 c0411c0 = new C0411c0(this.f1415z, this.f1410E, interfaceC30057d, 0);
                c0411c0.f1414y = ((Boolean) obj).booleanValue();
                return c0411c0;
            default:
                C0411c0 c0411c1 = new C0411c0(this.f1415z, this.f1410E, interfaceC30057d, 1);
                c0411c1.f1414y = ((Boolean) obj).booleanValue();
                return c0411c1;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f1412w;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (i13) {
            case 0:
                break;
        }
        return ((C0411c0) create(bool, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r5v0 */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Throwable th3;
        int iIntValue;
        ?? r10;
        ?? r14;
        AbstractC0418e1 abstractC0418e1;
        ?? r15;
        boolean z4;
        Object obj2;
        int iIntValue2;
        int iHashCode;
        switch (this.f1412w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                ?? r16 = this.f1413x;
                C0429i0 c0429i0 = this.f1415z;
                try {
                    if (r16 == 0) {
                        AbstractC34132o.m107864I(obj);
                        boolean z13 = this.f1414y;
                        this.f1414y = z13;
                        this.f1413x = 1;
                        obj = C0429i0.m1111g(c0429i0, z13, this);
                        r16 = z13;
                        if (obj == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (r16 != 1) {
                            if (r16 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            boolean z14 = this.f1414y;
                            th3 = (Throwable) this.f1411F;
                            AbstractC34132o.m107864I(obj);
                            r14 = z14;
                            iIntValue = ((Number) obj).intValue();
                            r10 = r14;
                            C0459v0 c0459v0 = new C0459v0(iIntValue, th3);
                            r15 = r10;
                            abstractC0418e1 = c0459v0;
                            return new C23465k(abstractC0418e1, Boolean.valueOf((boolean) r15));
                        }
                        boolean z15 = this.f1414y;
                        AbstractC34132o.m107864I(obj);
                        r16 = z15;
                    }
                    abstractC0418e1 = (AbstractC0418e1) obj;
                    r15 = r16;
                    break;
                } catch (Throwable th4) {
                    if (r16 != 0) {
                        C0415d1 c0415d1M1112h = c0429i0.m1112h();
                        this.f1411F = th4;
                        this.f1414y = r16;
                        this.f1413x = 2;
                        Integer numM1098a = c0415d1M1112h.m1098a();
                        if (numM1098a == enumC31071a) {
                            return enumC31071a;
                        }
                        r14 = r16;
                        th3 = th4;
                        obj = numM1098a;
                    } else {
                        ?? r17 = r16;
                        th3 = th4;
                        iIntValue = this.f1410E;
                        r10 = r17 == true ? 1 : 0;
                    }
                    C0459v0 c0459v1 = new C0459v0(iIntValue, th3);
                    r15 = r10;
                    abstractC0418e1 = c0459v1;
                    return new C23465k(abstractC0418e1, Boolean.valueOf((boolean) r15));
                }
                return new C23465k(abstractC0418e1, Boolean.valueOf((boolean) r15));
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i13 = this.f1413x;
                C0429i0 c0429i1 = this.f1415z;
                if (i13 != 0) {
                    if (i13 == 1) {
                        z4 = this.f1414y;
                        AbstractC34132o.m107864I(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj2 = this.f1411F;
                        AbstractC34132o.m107864I(obj);
                    }
                    iIntValue2 = ((Number) obj).intValue();
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    return new C0407b(obj2, iHashCode, iIntValue2);
                }
                AbstractC34132o.m107864I(obj);
                z4 = this.f1414y;
                this.f1414y = z4;
                this.f1413x = 1;
                obj = c0429i1.m1113i(this);
                if (obj == enumC31071a2) {
                    return enumC31071a2;
                }
                if (z4) {
                    C0415d1 c0415d1M1112h2 = c0429i1.m1112h();
                    this.f1411F = obj;
                    this.f1413x = 2;
                    Integer numM1098a2 = c0415d1M1112h2.m1098a();
                    if (numM1098a2 == enumC31071a2) {
                        return enumC31071a2;
                    }
                    obj2 = obj;
                    obj = numM1098a2;
                    iIntValue2 = ((Number) obj).intValue();
                } else {
                    obj2 = obj;
                    iIntValue2 = this.f1410E;
                }
                if (obj2 != null) {
                    iHashCode = obj2.hashCode();
                } else {
                    iHashCode = 0;
                }
                return new C0407b(obj2, iHashCode, iIntValue2);
        }
    }
}
