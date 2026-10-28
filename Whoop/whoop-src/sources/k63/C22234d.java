package k63;

import ec3.InterfaceC13062m;
import i93.C18284j;
import io.ktor.utils.p228io.InterfaceC20024q;
import java.nio.charset.Charset;
import java.time.LocalDate;
import l83.C23454a0;
import p133f1.C13977s1;
import p293l2.C23224a;
import p316m1.AbstractC24917o;
import p316m1.C24919q;
import p329n0.C26068u;
import p390p1.C28621h1;
import p412q3.C29878l;
import p412q3.C29892z;
import p505ts.AbstractC34132o;
import p510u0.AbstractC34339n0;
import p510u0.C34354s0;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s63.C32236a;

/* JADX INFO: renamed from: k63.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C22234d implements InterfaceC13062m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f86643E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f86644w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f86645x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f86646y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f86647z;

    public /* synthetic */ C22234d(Object obj, Object obj2, Object obj3, Object obj4, int i13) {
        this.f86644w = i13;
        this.f86645x = obj;
        this.f86646y = obj2;
        this.f86647z = obj3;
        this.f86643E = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0090  */
    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        C22233c c22233c;
        InterfaceC13062m interfaceC13062m;
        switch (this.f86644w) {
            case 0:
                if (interfaceC30057d instanceof C22233c) {
                    c22233c = (C22233c) interfaceC30057d;
                    int i13 = c22233c.f86640x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c22233c.f86640x = i13 - Integer.MIN_VALUE;
                    } else {
                        c22233c = new C22233c(this, interfaceC30057d);
                    }
                } else {
                    c22233c = new C22233c(this, interfaceC30057d);
                }
                Object obj2 = c22233c.f86639w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c22233c.f86640x;
                if (i14 != 0) {
                    if (i14 == 1) {
                        interfaceC13062m = c22233c.f86641y;
                        AbstractC34132o.m107864I(obj2);
                    } else {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj2);
                    }
                    return C23454a0.f92919a;
                }
                AbstractC34132o.m107864I(obj2);
                InterfaceC13062m interfaceC13062m2 = (InterfaceC13062m) this.f86645x;
                Charset charset = (Charset) this.f86646y;
                C32236a c32236a = (C32236a) this.f86647z;
                InterfaceC20024q interfaceC20024q = (InterfaceC20024q) this.f86643E;
                c22233c.f86641y = interfaceC13062m2;
                c22233c.f86640x = 1;
                Object objMo63740b = ((InterfaceC22232b) obj).mo63740b(charset, c32236a, interfaceC20024q, c22233c);
                if (objMo63740b == enumC31071a) {
                    return enumC31071a;
                }
                obj2 = objMo63740b;
                interfaceC13062m = interfaceC13062m2;
                c22233c.f86641y = null;
                c22233c.f86640x = 2;
                if (interfaceC13062m.emit(obj2, c22233c) == enumC31071a) {
                    return enumC31071a;
                }
                return C23454a0.f92919a;
            case 1:
                ((Number) obj).intValue();
                C23224a c23224a = ((C26068u) this.f86645x).f103222e;
                int iM87024x = ((C28621h1) c23224a.f91958b).m87024x() / 12;
                int iM87024x2 = (((C28621h1) c23224a.f91958b).m87024x() % 12) + 1;
                Function1 function1 = (Function1) this.f86646y;
                AbstractC24917o abstractC24917o = (AbstractC24917o) this.f86647z;
                int i15 = ((C18284j) this.f86643E).f71133w + iM87024x;
                C24919q c24919q = (C24919q) abstractC24917o;
                c24919q.getClass();
                function1.invoke(new Long(c24919q.m73022e(LocalDate.of(i15, iM87024x2, 1)).f97603e));
                return C23454a0.f92919a;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C13977s1 c13977s1 = (C13977s1) this.f86647z;
                C34354s0 c34354s0 = (C34354s0) this.f86645x;
                if (zBooleanValue && c34354s0.m108660b()) {
                    AbstractC34339n0.m108643u((C29892z) this.f86646y, c34354s0, c13977s1.m39783m(), (C29878l) this.f86643E, c13977s1.f49846b);
                } else {
                    AbstractC34339n0.m108634l(c34354s0);
                }
                return C23454a0.f92919a;
        }
    }
}
