package p363ob;

import androidx.room.AbstractC1848z0;
import androidx.room.C1835v;
import androidx.room.EnumC1840w1;
import androidx.room.InterfaceC1843x1;
import c93.InterfaceC4351m;
import l83.C23454a0;
import lb.InterfaceC23559b0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: ob.b */
/* JADX INFO: loaded from: classes.dex */
public final class C27779b extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f111986E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ boolean f111987F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ AbstractC1848z0 f111988G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Function1 f111989H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f111990w;

    /* JADX INFO: renamed from: x */
    public EnumC1840w1 f111991x;

    /* JADX INFO: renamed from: y */
    public int f111992y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f111993z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27779b(boolean z4, boolean z13, AbstractC1848z0 abstractC1848z0, InterfaceC30057d interfaceC30057d, Function1 function1, int i13) {
        super(2, interfaceC30057d);
        this.f111990w = i13;
        this.f111986E = z4;
        this.f111987F = z13;
        this.f111988G = abstractC1848z0;
        this.f111989H = function1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f111990w) {
            case 0:
                C27779b c27779b = new C27779b(this.f111986E, this.f111987F, this.f111988G, interfaceC30057d, this.f111989H, 0);
                c27779b.f111993z = obj;
                return c27779b;
            default:
                C27779b c27779b2 = new C27779b(this.f111986E, this.f111987F, this.f111988G, interfaceC30057d, this.f111989H, 1);
                c27779b2.f111993z = obj;
                return c27779b2;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC1843x1 interfaceC1843x1 = (InterfaceC1843x1) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f111990w) {
            case 0:
                break;
        }
        return ((C27779b) create(interfaceC1843x1, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:84:0x017e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0189  */
    /* JADX WARN: Code duplicated, block: B:90:0x0193  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC1840w1 enumC1840w1;
        InterfaceC1843x1 interfaceC1843x1;
        EnumC1840w1 enumC1840w2;
        InterfaceC1843x1 interfaceC1843x2;
        InterfaceC1843x1 interfaceC1843x3;
        Boolean boolMo5462a;
        Object obj2;
        EnumC1840w1 enumC1840w3;
        InterfaceC1843x1 interfaceC1843x4;
        EnumC1840w1 enumC1840w4;
        InterfaceC1843x1 interfaceC1843x5;
        InterfaceC1843x1 interfaceC1843x6;
        Boolean boolMo5462a2;
        Object obj3;
        switch (this.f111990w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f111992y;
                Function1 function1 = this.f111989H;
                AbstractC1848z0 abstractC1848z0 = this.f111988G;
                boolean z4 = this.f111987F;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC1843x1 interfaceC1843x7 = (InterfaceC1843x1) this.f111993z;
                    if (!this.f111986E) {
                        AbstractC22676k.m65748h(interfaceC1843x7, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                        return function1.invoke(((InterfaceC23559b0) interfaceC1843x7).mo68206d());
                    }
                    enumC1840w1 = z4 ? EnumC1840w1.f7203w : EnumC1840w1.f7204x;
                    if (z4) {
                        EnumC1840w1 enumC1840w5 = enumC1840w1;
                        interfaceC1843x1 = interfaceC1843x7;
                        enumC1840w2 = enumC1840w5;
                    } else {
                        this.f111993z = interfaceC1843x7;
                        this.f111991x = enumC1840w1;
                        this.f111992y = 1;
                        Boolean boolMo5462a3 = interfaceC1843x7.mo5462a(this);
                        if (boolMo5462a3 == enumC31071a) {
                            return enumC31071a;
                        }
                        interfaceC1843x2 = interfaceC1843x7;
                        obj = boolMo5462a3;
                    }
                    C27778a c27778a = new C27778a(0, function1, null);
                    this.f111993z = interfaceC1843x1;
                    this.f111991x = null;
                    this.f111992y = 3;
                    obj = interfaceC1843x1.mo5463b(enumC1840w2, c27778a, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                    if (!z4) {
                        return obj;
                    }
                    this.f111993z = obj;
                    this.f111992y = 4;
                    boolMo5462a = interfaceC1843x1.mo5462a(this);
                    if (boolMo5462a == enumC31071a) {
                        return enumC31071a;
                    }
                    obj2 = obj;
                    obj = boolMo5462a;
                    if (((Boolean) obj).booleanValue()) {
                        return obj2;
                    }
                    C1835v invalidationTracker = abstractC1848z0.getInvalidationTracker();
                    invalidationTracker.f7189c.m5423e(invalidationTracker.f7192f, invalidationTracker.f7193g);
                    return obj2;
                }
                if (i13 == 1) {
                    enumC1840w1 = this.f111991x;
                    interfaceC1843x2 = (InterfaceC1843x1) this.f111993z;
                    AbstractC34132o.m107864I(obj);
                } else if (i13 == 2) {
                    enumC1840w1 = this.f111991x;
                    interfaceC1843x3 = (InterfaceC1843x1) this.f111993z;
                    AbstractC34132o.m107864I(obj);
                    enumC1840w2 = enumC1840w1;
                    interfaceC1843x1 = interfaceC1843x3;
                    C27778a c27778a2 = new C27778a(0, function1, null);
                    this.f111993z = interfaceC1843x1;
                    this.f111991x = null;
                    this.f111992y = 3;
                    obj = interfaceC1843x1.mo5463b(enumC1840w2, c27778a2, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                    if (!z4) {
                        return obj;
                    }
                    this.f111993z = obj;
                    this.f111992y = 4;
                    boolMo5462a = interfaceC1843x1.mo5462a(this);
                    if (boolMo5462a == enumC31071a) {
                        return enumC31071a;
                    }
                    obj2 = obj;
                    obj = boolMo5462a;
                } else if (i13 == 3) {
                    interfaceC1843x1 = (InterfaceC1843x1) this.f111993z;
                    AbstractC34132o.m107864I(obj);
                    if (!z4) {
                        return obj;
                    }
                    this.f111993z = obj;
                    this.f111992y = 4;
                    boolMo5462a = interfaceC1843x1.mo5462a(this);
                    if (boolMo5462a == enumC31071a) {
                        return enumC31071a;
                    }
                    obj2 = obj;
                    obj = boolMo5462a;
                } else {
                    if (i13 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.f111993z;
                    AbstractC34132o.m107864I(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return obj2;
                }
                C1835v invalidationTracker2 = abstractC1848z0.getInvalidationTracker();
                invalidationTracker2.f7189c.m5423e(invalidationTracker2.f7192f, invalidationTracker2.f7193g);
                return obj2;
                if (((Boolean) obj).booleanValue()) {
                    enumC1840w2 = enumC1840w1;
                    interfaceC1843x1 = interfaceC1843x2;
                } else {
                    C1835v invalidationTracker3 = abstractC1848z0.getInvalidationTracker();
                    this.f111993z = interfaceC1843x2;
                    this.f111991x = enumC1840w1;
                    this.f111992y = 2;
                    if (invalidationTracker3.m5457d(this) == enumC31071a) {
                        return enumC31071a;
                    }
                    interfaceC1843x3 = interfaceC1843x2;
                    enumC1840w2 = enumC1840w1;
                    interfaceC1843x1 = interfaceC1843x3;
                }
                C27778a c27778a3 = new C27778a(0, function1, null);
                this.f111993z = interfaceC1843x1;
                this.f111991x = null;
                this.f111992y = 3;
                obj = interfaceC1843x1.mo5463b(enumC1840w2, c27778a3, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
                if (!z4) {
                    return obj;
                }
                this.f111993z = obj;
                this.f111992y = 4;
                boolMo5462a = interfaceC1843x1.mo5462a(this);
                if (boolMo5462a == enumC31071a) {
                    return enumC31071a;
                }
                obj2 = obj;
                obj = boolMo5462a;
                if (((Boolean) obj).booleanValue()) {
                    return obj2;
                }
                C1835v invalidationTracker4 = abstractC1848z0.getInvalidationTracker();
                invalidationTracker4.f7189c.m5423e(invalidationTracker4.f7192f, invalidationTracker4.f7193g);
                return obj2;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f111992y;
                Function1 function2 = this.f111989H;
                AbstractC1848z0 abstractC1848z1 = this.f111988G;
                boolean z13 = this.f111987F;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC1843x1 interfaceC1843x8 = (InterfaceC1843x1) this.f111993z;
                    if (!this.f111986E) {
                        AbstractC22676k.m65748h(interfaceC1843x8, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                        return function2.invoke(((InterfaceC23559b0) interfaceC1843x8).mo68206d());
                    }
                    enumC1840w3 = z13 ? EnumC1840w1.f7203w : EnumC1840w1.f7204x;
                    if (z13) {
                        EnumC1840w1 enumC1840w6 = enumC1840w3;
                        interfaceC1843x4 = interfaceC1843x8;
                        enumC1840w4 = enumC1840w6;
                    } else {
                        this.f111993z = interfaceC1843x8;
                        this.f111991x = enumC1840w3;
                        this.f111992y = 1;
                        Boolean boolMo5462a4 = interfaceC1843x8.mo5462a(this);
                        if (boolMo5462a4 == enumC31071a2) {
                            return enumC31071a2;
                        }
                        interfaceC1843x5 = interfaceC1843x8;
                        obj = boolMo5462a4;
                    }
                    C27778a c27778a4 = new C27778a(1, function2, null);
                    this.f111993z = interfaceC1843x4;
                    this.f111991x = null;
                    this.f111992y = 3;
                    obj = interfaceC1843x4.mo5463b(enumC1840w4, c27778a4, this);
                    if (obj == enumC31071a2) {
                        return enumC31071a2;
                    }
                    if (!z13) {
                        return obj;
                    }
                    this.f111993z = obj;
                    this.f111992y = 4;
                    boolMo5462a2 = interfaceC1843x4.mo5462a(this);
                    if (boolMo5462a2 == enumC31071a2) {
                        return enumC31071a2;
                    }
                    obj3 = obj;
                    obj = boolMo5462a2;
                    if (((Boolean) obj).booleanValue()) {
                        return obj3;
                    }
                    C1835v invalidationTracker5 = abstractC1848z1.getInvalidationTracker();
                    invalidationTracker5.f7189c.m5423e(invalidationTracker5.f7192f, invalidationTracker5.f7193g);
                    return obj3;
                }
                if (i14 == 1) {
                    enumC1840w3 = this.f111991x;
                    interfaceC1843x5 = (InterfaceC1843x1) this.f111993z;
                    AbstractC34132o.m107864I(obj);
                } else if (i14 == 2) {
                    enumC1840w3 = this.f111991x;
                    interfaceC1843x6 = (InterfaceC1843x1) this.f111993z;
                    AbstractC34132o.m107864I(obj);
                    enumC1840w4 = enumC1840w3;
                    interfaceC1843x4 = interfaceC1843x6;
                    C27778a c27778a5 = new C27778a(1, function2, null);
                    this.f111993z = interfaceC1843x4;
                    this.f111991x = null;
                    this.f111992y = 3;
                    obj = interfaceC1843x4.mo5463b(enumC1840w4, c27778a5, this);
                    if (obj == enumC31071a2) {
                        return enumC31071a2;
                    }
                    if (!z13) {
                        return obj;
                    }
                    this.f111993z = obj;
                    this.f111992y = 4;
                    boolMo5462a2 = interfaceC1843x4.mo5462a(this);
                    if (boolMo5462a2 == enumC31071a2) {
                        return enumC31071a2;
                    }
                    obj3 = obj;
                    obj = boolMo5462a2;
                } else if (i14 == 3) {
                    interfaceC1843x4 = (InterfaceC1843x1) this.f111993z;
                    AbstractC34132o.m107864I(obj);
                    if (!z13) {
                        return obj;
                    }
                    this.f111993z = obj;
                    this.f111992y = 4;
                    boolMo5462a2 = interfaceC1843x4.mo5462a(this);
                    if (boolMo5462a2 == enumC31071a2) {
                        return enumC31071a2;
                    }
                    obj3 = obj;
                    obj = boolMo5462a2;
                } else {
                    if (i14 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj3 = this.f111993z;
                    AbstractC34132o.m107864I(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return obj3;
                }
                C1835v invalidationTracker6 = abstractC1848z1.getInvalidationTracker();
                invalidationTracker6.f7189c.m5423e(invalidationTracker6.f7192f, invalidationTracker6.f7193g);
                return obj3;
                if (((Boolean) obj).booleanValue()) {
                    enumC1840w4 = enumC1840w3;
                    interfaceC1843x4 = interfaceC1843x5;
                } else {
                    C1835v invalidationTracker7 = abstractC1848z1.getInvalidationTracker();
                    this.f111993z = interfaceC1843x5;
                    this.f111991x = enumC1840w3;
                    this.f111992y = 2;
                    if (invalidationTracker7.m5457d(this) == enumC31071a2) {
                        return enumC31071a2;
                    }
                    interfaceC1843x6 = interfaceC1843x5;
                    enumC1840w4 = enumC1840w3;
                    interfaceC1843x4 = interfaceC1843x6;
                }
                C27778a c27778a6 = new C27778a(1, function2, null);
                this.f111993z = interfaceC1843x4;
                this.f111991x = null;
                this.f111992y = 3;
                obj = interfaceC1843x4.mo5463b(enumC1840w4, c27778a6, this);
                if (obj == enumC31071a2) {
                    return enumC31071a2;
                }
                if (!z13) {
                    return obj;
                }
                this.f111993z = obj;
                this.f111992y = 4;
                boolMo5462a2 = interfaceC1843x4.mo5462a(this);
                if (boolMo5462a2 == enumC31071a2) {
                    return enumC31071a2;
                }
                obj3 = obj;
                obj = boolMo5462a2;
                if (((Boolean) obj).booleanValue()) {
                    return obj3;
                }
                C1835v invalidationTracker8 = abstractC1848z1.getInvalidationTracker();
                invalidationTracker8.f7189c.m5423e(invalidationTracker8.f7192f, invalidationTracker8.f7193g);
                return obj3;
        }
    }
}
