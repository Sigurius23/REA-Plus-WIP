package p007a6;

import c93.InterfaceC4351m;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import p505ts.AbstractC34132o;
import p692zt.C41113q;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22659b0;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: a6.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0442n extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: E */
    public Iterator f1517E;

    /* JADX INFO: renamed from: F */
    public int f1518F;

    /* JADX INFO: renamed from: G */
    public int f1519G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ C0429i0 f1520H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ C41113q f1521I;

    /* JADX INFO: renamed from: w */
    public Object f1522w;

    /* JADX INFO: renamed from: x */
    public Serializable f1523x;

    /* JADX INFO: renamed from: y */
    public Object f1524y;

    /* JADX INFO: renamed from: z */
    public Object f1525z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0442n(C0429i0 c0429i0, C41113q c41113q, InterfaceC30057d interfaceC30057d) {
        super(1, interfaceC30057d);
        this.f1520H = c0429i0;
        this.f1521I = c41113q;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        return new C0442n(this.f1520H, this.f1521I, interfaceC30057d);
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0442n) create((InterfaceC30057d) obj)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00db  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:40:0x0101  */
    /* JADX WARN: Code duplicated, block: B:49:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[LOOP:0: B:21:0x00a2->B:51:?, LOOP_END, SYNTHETIC] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        InterfaceC25435a interfaceC25435aM74669a;
        C22659b0 c22659b0;
        C22669g0 c22669g0;
        C22669g0 c22669g1;
        InterfaceC25435a interfaceC25435a;
        Iterator it;
        InterfaceC25435a interfaceC25435a2;
        C22659b0 c22659b1;
        C22669g0 c22669g2;
        C0440m c0440m;
        C22669g0 c22669g3;
        C22659b0 c22659b2;
        InterfaceC4351m interfaceC4351m;
        Object obj2;
        int iHashCode;
        Integer numM1098a;
        int i13;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = this.f1519G;
        C41113q c41113q = this.f1521I;
        C0429i0 c0429i0 = this.f1520H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            interfaceC25435aM74669a = AbstractC25438d.m74669a();
            c22659b0 = new C22659b0();
            c22669g0 = new C22669g0();
            this.f1522w = interfaceC25435aM74669a;
            this.f1523x = c22659b0;
            this.f1524y = c22669g0;
            this.f1525z = c22669g0;
            this.f1519G = 1;
            obj = C0429i0.m1111g(c0429i0, true, this);
            if (obj != enumC31071a) {
                c22669g1 = c22669g0;
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            c22669g0 = (C22669g0) this.f1525z;
            c22669g1 = (C22669g0) this.f1524y;
            c22659b0 = (C22659b0) this.f1523x;
            interfaceC25435aM74669a = (InterfaceC25435a) this.f1522w;
            AbstractC34132o.m107864I(obj);
        } else {
            if (i14 == 2) {
                it = this.f1517E;
                c0440m = (C0440m) this.f1525z;
                c22669g2 = (C22669g0) this.f1524y;
                c22659b1 = (C22659b0) this.f1523x;
                interfaceC25435a2 = (InterfaceC25435a) this.f1522w;
                AbstractC34132o.m107864I(obj);
                while (it.hasNext()) {
                    interfaceC4351m = (InterfaceC4351m) it.next();
                    this.f1522w = interfaceC25435a2;
                    this.f1523x = c22659b1;
                    this.f1524y = c22669g2;
                    this.f1525z = c0440m;
                    this.f1517E = it;
                    this.f1519G = 2;
                    if (interfaceC4351m.invoke(c0440m, this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
                c22669g1 = c22669g2;
                c22659b0 = c22659b1;
                interfaceC25435a = interfaceC25435a2;
                c41113q.f177226z = null;
                this.f1522w = c22659b0;
                this.f1523x = c22669g1;
                this.f1524y = interfaceC25435a;
                this.f1525z = null;
                this.f1517E = null;
                this.f1519G = 3;
                if (interfaceC25435a.mo68211b(this) != enumC31071a) {
                    c22669g3 = c22669g1;
                    c22659b2 = c22659b0;
                    c22659b2.f89329w = true;
                    interfaceC25435a.mo68214i(null);
                    obj2 = c22669g3.f89336w;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    C0415d1 c0415d1M1112h = c0429i0.m1112h();
                    this.f1522w = obj2;
                    this.f1523x = null;
                    this.f1524y = null;
                    this.f1518F = iHashCode;
                    this.f1519G = 4;
                    numM1098a = c0415d1M1112h.m1098a();
                    if (numM1098a != enumC31071a) {
                        i13 = iHashCode;
                        obj = numM1098a;
                    }
                }
                return enumC31071a;
            }
            if (i14 == 3) {
                interfaceC25435a = (InterfaceC25435a) this.f1524y;
                c22669g3 = (C22669g0) this.f1523x;
                c22659b2 = (C22659b0) this.f1522w;
                AbstractC34132o.m107864I(obj);
                try {
                    c22659b2.f89329w = true;
                    interfaceC25435a.mo68214i(null);
                    obj2 = c22669g3.f89336w;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    C0415d1 c0415d1M1112h2 = c0429i0.m1112h();
                    this.f1522w = obj2;
                    this.f1523x = null;
                    this.f1524y = null;
                    this.f1518F = iHashCode;
                    this.f1519G = 4;
                    numM1098a = c0415d1M1112h2.m1098a();
                    if (numM1098a != enumC31071a) {
                        i13 = iHashCode;
                        obj = numM1098a;
                    }
                    return enumC31071a;
                } catch (Throwable th3) {
                    interfaceC25435a.mo68214i(null);
                    throw th3;
                }
            }
            if (i14 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = this.f1518F;
            obj2 = this.f1522w;
            AbstractC34132o.m107864I(obj);
        }
        return new C0407b(obj2, i13, ((Number) obj).intValue());
        c22669g0.f89336w = ((C0407b) obj).f1394b;
        C0440m c0440m2 = new C0440m(interfaceC25435aM74669a, c22659b0, c22669g1, c0429i0);
        List list = (List) c41113q.f177226z;
        if (list != null) {
            it = list.iterator();
            interfaceC25435a2 = interfaceC25435aM74669a;
            c22659b1 = c22659b0;
            c22669g2 = c22669g1;
            c0440m = c0440m2;
            while (it.hasNext()) {
                interfaceC4351m = (InterfaceC4351m) it.next();
                this.f1522w = interfaceC25435a2;
                this.f1523x = c22659b1;
                this.f1524y = c22669g2;
                this.f1525z = c0440m;
                this.f1517E = it;
                this.f1519G = 2;
                if (interfaceC4351m.invoke(c0440m, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            c22669g1 = c22669g2;
            c22659b0 = c22659b1;
            interfaceC25435a = interfaceC25435a2;
        } else {
            interfaceC25435a = interfaceC25435aM74669a;
        }
        c41113q.f177226z = null;
        this.f1522w = c22659b0;
        this.f1523x = c22669g1;
        this.f1524y = interfaceC25435a;
        this.f1525z = null;
        this.f1517E = null;
        this.f1519G = 3;
        if (interfaceC25435a.mo68211b(this) != enumC31071a) {
            c22669g3 = c22669g1;
            c22659b2 = c22659b0;
            c22659b2.f89329w = true;
            interfaceC25435a.mo68214i(null);
            obj2 = c22669g3.f89336w;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            C0415d1 c0415d1M1112h3 = c0429i0.m1112h();
            this.f1522w = obj2;
            this.f1523x = null;
            this.f1524y = null;
            this.f1518F = iHashCode;
            this.f1519G = 4;
            numM1098a = c0415d1M1112h3.m1098a();
            if (numM1098a != enumC31071a) {
                i13 = iHashCode;
                obj = numM1098a;
                return new C0407b(obj2, i13, ((Number) obj).intValue());
            }
        }
        return enumC31071a;
    }
}
