package p007a6;

import ch.AbstractC4601v;
import ch.C4587h;
import e93.AbstractC12889b;
import ec3.C13044h1;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p098dt.AbstractC12350b;
import p181h2.C16620e;
import p341nh.C26707a;
import p341nh.C26708b;
import p341nh.C26711e;
import p341nh.C26714h;
import p505ts.AbstractC34132o;
import p715kotlin.NoWhenBranchMatchedException;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: a6.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0454t implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1561w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC13062m f1562x;

    public /* synthetic */ C0454t(InterfaceC13062m interfaceC13062m, int i13) {
        this.f1561w = i13;
        this.f1562x = interfaceC13062m;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) throws Throwable {
        C0452s c0452s;
        C4587h c4587h;
        C26714h c26714h;
        C13044h1 c13044h1;
        int i13 = this.f1561w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        InterfaceC13062m interfaceC13062m = this.f1562x;
        switch (i13) {
            case 0:
                if (interfaceC30057d instanceof C0452s) {
                    c0452s = (C0452s) interfaceC30057d;
                    int i14 = c0452s.f1558x;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c0452s.f1558x = i14 - Integer.MIN_VALUE;
                    } else {
                        c0452s = new C0452s(this, interfaceC30057d);
                    }
                } else {
                    c0452s = new C0452s(this, interfaceC30057d);
                }
                Object obj2 = c0452s.f1557w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i15 = c0452s.f1558x;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj2);
                AbstractC0418e1 abstractC0418e1 = (AbstractC0418e1) obj;
                if (abstractC0418e1 instanceof C0459v0) {
                    throw ((C0459v0) abstractC0418e1).f1574b;
                }
                if (abstractC0418e1 instanceof C0407b) {
                    Object obj3 = ((C0407b) abstractC0418e1).f1394b;
                    c0452s.f1558x = 1;
                    return interfaceC13062m.emit(obj3, c0452s) == enumC31071a ? enumC31071a : c23454a0;
                }
                if ((abstractC0418e1 instanceof C0453s0) || (abstractC0418e1 instanceof C0427h1) || (abstractC0418e1 instanceof C0457u0)) {
                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                if (interfaceC30057d instanceof C4587h) {
                    c4587h = (C4587h) interfaceC30057d;
                    int i16 = c4587h.f18468x;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        c4587h.f18468x = i16 - Integer.MIN_VALUE;
                    } else {
                        c4587h = new C4587h(this, interfaceC30057d);
                    }
                } else {
                    c4587h = new C4587h(this, interfaceC30057d);
                }
                Object obj4 = c4587h.f18467w;
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i17 = c4587h.f18468x;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj4);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj4);
                long j7 = ((C16620e) obj).f63951a;
                if (j7 == 9205357640488583168L) {
                    c26714h = C26714h.f106216c;
                } else {
                    C26711e c26711e = AbstractC4601v.f18506b;
                    if (C16620e.m47213e(j7) < 0.5d || C16620e.m47211c(j7) < 0.5d) {
                        c26714h = null;
                    } else {
                        float fM47213e = C16620e.m47213e(j7);
                        boolean zIsInfinite = Float.isInfinite(fM47213e);
                        AbstractC12350b c26707a = C26708b.f106206a;
                        AbstractC12350b c26707a2 = (zIsInfinite || Float.isNaN(fM47213e)) ? c26707a : new C26707a(AbstractC12889b.m36258X(C16620e.m47213e(j7)));
                        float fM47211c = C16620e.m47211c(j7);
                        if (!Float.isInfinite(fM47211c) && !Float.isNaN(fM47211c)) {
                            c26707a = new C26707a(AbstractC12889b.m36258X(C16620e.m47211c(j7)));
                        }
                        c26714h = new C26714h(c26707a2, c26707a);
                    }
                }
                if (c26714h == null) {
                    return c23454a0;
                }
                c4587h.f18468x = 1;
                return interfaceC13062m.emit(c26714h, c4587h) == enumC31071a2 ? enumC31071a2 : c23454a0;
            default:
                if (interfaceC30057d instanceof C13044h1) {
                    c13044h1 = (C13044h1) interfaceC30057d;
                    int i18 = c13044h1.f45086x;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        c13044h1.f45086x = i18 - Integer.MIN_VALUE;
                    } else {
                        c13044h1 = new C13044h1(this, interfaceC30057d);
                    }
                } else {
                    c13044h1 = new C13044h1(this, interfaceC30057d);
                }
                Object obj5 = c13044h1.f45085w;
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i19 = c13044h1.f45086x;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj5);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj5);
                if (obj == null) {
                    return c23454a0;
                }
                c13044h1.f45086x = 1;
                return interfaceC13062m.emit(obj, c13044h1) == enumC31071a3 ? enumC31071a3 : c23454a0;
        }
    }
}
