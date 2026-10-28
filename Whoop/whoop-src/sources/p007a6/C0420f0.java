package p007a6;

import bc3.AbstractC3006f0;
import c93.InterfaceC4351m;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import se.AbstractC32417h;
import va3.AbstractC35854l;

/* JADX INFO: renamed from: a6.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0420f0 extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: E */
    public Object f1449E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f1450F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1451w = 0;

    /* JADX INFO: renamed from: x */
    public int f1452x;

    /* JADX INFO: renamed from: y */
    public Object f1453y;

    /* JADX INFO: renamed from: z */
    public Object f1454z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0420f0(C0429i0 c0429i0, InterfaceC30063j interfaceC30063j, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        super(1, interfaceC30057d);
        this.f1454z = c0429i0;
        this.f1449E = interfaceC30063j;
        this.f1450F = interfaceC4351m;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        switch (this.f1451w) {
            case 0:
                return new C0420f0((C0429i0) this.f1454z, (InterfaceC30063j) this.f1449E, (InterfaceC4351m) this.f1450F, interfaceC30057d);
            default:
                return new C0420f0((C0451r0) this.f1450F, this.f1453y, interfaceC30057d);
        }
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj;
        switch (this.f1451w) {
            case 0:
                break;
        }
        return ((C0420f0) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00de  */
    /* JADX WARN: Code duplicated, block: B:66:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Exception {
        C0407b c0407b;
        Object obj2;
        int iHashCode;
        FileOutputStream fileOutputStream;
        Throwable th3;
        FileOutputStream fileOutputStream2;
        switch (this.f1451w) {
            case 0:
                C0429i0 c0429i0 = (C0429i0) this.f1454z;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f1452x;
                if (i13 != 0) {
                    if (i13 == 1) {
                        AbstractC34132o.m107864I(obj);
                    } else {
                        if (i13 != 2) {
                            if (i13 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Object obj3 = this.f1453y;
                            AbstractC34132o.m107864I(obj);
                            return obj3;
                        }
                        c0407b = (C0407b) this.f1453y;
                        AbstractC34132o.m107864I(obj);
                    }
                    obj2 = c0407b.f1394b;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    if (iHashCode == c0407b.f1395c) {
                        throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                    }
                    if (!AbstractC22676k.m65745e(c0407b.f1394b, obj)) {
                        this.f1453y = obj;
                        this.f1452x = 3;
                        if (c0429i0.m1114j(obj, true, this) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                this.f1452x = 1;
                obj = C0429i0.m1111g(c0429i0, true, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
                c0407b = (C0407b) obj;
                InterfaceC30063j interfaceC30063j = (InterfaceC30063j) this.f1449E;
                C0410c c0410c = new C0410c((InterfaceC4351m) this.f1450F, c0407b, null, 2);
                this.f1453y = c0407b;
                this.f1452x = 2;
                obj = AbstractC3006f0.m8705K(interfaceC30063j, c0410c, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
                obj2 = c0407b.f1394b;
                if (obj2 != null) {
                    iHashCode = obj2.hashCode();
                } else {
                    iHashCode = 0;
                }
                if (iHashCode == c0407b.f1395c) {
                    throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                }
                if (!AbstractC22676k.m65745e(c0407b.f1394b, obj)) {
                    this.f1453y = obj;
                    this.f1452x = 3;
                    if (c0429i0.m1114j(obj, true, this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
                return obj;
            default:
                C0451r0 c0451r0 = (C0451r0) this.f1450F;
                File file = c0451r0.f1493a;
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f1452x;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    try {
                        FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                        Object obj4 = this.f1453y;
                        try {
                            InterfaceC0465y0 interfaceC0465y0 = c0451r0.f1494b;
                            C0430i1 c0430i1 = new C0430i1(fileOutputStream3);
                            this.f1454z = fileOutputStream3;
                            this.f1449E = fileOutputStream3;
                            this.f1452x = 1;
                            interfaceC0465y0.mo1124c(c0430i1, obj4);
                            if (c23454a0 == enumC31071a2) {
                                return enumC31071a2;
                            }
                            fileOutputStream2 = fileOutputStream3;
                            fileOutputStream = fileOutputStream2;
                        } catch (Throwable th4) {
                            fileOutputStream = fileOutputStream3;
                            th3 = th4;
                            throw th3;
                        }
                    } catch (Exception e5) {
                        if (e5 instanceof FileNotFoundException) {
                            throw AbstractC32417h.m101191V(file.getParent(), (FileNotFoundException) e5);
                        }
                        throw e5;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fileOutputStream2 = (FileOutputStream) this.f1449E;
                    fileOutputStream = (FileOutputStream) this.f1454z;
                    try {
                        AbstractC34132o.m107864I(obj);
                    } catch (Throwable th5) {
                        th3 = th5;
                        try {
                            throw th3;
                        } catch (Throwable th6) {
                            AbstractC35854l.m113829i(fileOutputStream, th3);
                            throw th6;
                        }
                    }
                }
                fileOutputStream2.getFD().sync();
                AbstractC35854l.m113829i(fileOutputStream, null);
                return c23454a0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0420f0(C0451r0 c0451r0, Object obj, InterfaceC30057d interfaceC30057d) {
        super(1, interfaceC30057d);
        this.f1450F = c0451r0;
        this.f1453y = obj;
    }
}
