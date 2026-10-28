package cz;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.C13045h2;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import l83.C23468n;
import m83.AbstractC25267u;
import nh3.AbstractC26725a;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: cz.d0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11195d0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f35905w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f35906x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C11215n0 f35907y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11195d0(C11215n0 c11215n0, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f35905w = i13;
        this.f35907y = c11215n0;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f35905w) {
            case 0:
                C11195d0 c11195d0 = new C11195d0(this.f35907y, interfaceC30057d, 0);
                c11195d0.f35906x = obj;
                return c11195d0;
            case 1:
                C11195d0 c11195d1 = new C11195d0(this.f35907y, interfaceC30057d, 1);
                c11195d1.f35906x = obj;
                return c11195d1;
            default:
                return new C11195d0(this.f35906x, this.f35907y, interfaceC30057d);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f35905w) {
            case 0:
                C11195d0 c11195d0 = (C11195d0) create((C11223r0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c11195d0.invokeSuspend(c23454a0);
                return c23454a0;
            case 1:
                C11195d0 c11195d1 = (C11195d0) create((C11197e0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a1 = C23454a0.f92919a;
                c11195d1.invokeSuspend(c23454a1);
                return c23454a1;
            default:
                C11195d0 c11195d2 = (C11195d0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a2 = C23454a0.f92919a;
                c11195d2.invokeSuspend(c23454a2);
                return c23454a2;
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object value;
        ArrayList arrayList;
        Object value2;
        int i13 = this.f35905w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        C11215n0 c11215n0 = this.f35907y;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C11223r0 c11223r0 = (C11223r0) this.f35906x;
                C13045h2 c13045h2 = c11215n0.f35963L;
                do {
                    value = c13045h2.getValue();
                    List<AbstractC11227t0> list = (List) value;
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                    for (AbstractC11227t0 abstractC11227t0 : list) {
                        if (abstractC11227t0 instanceof C11223r0) {
                            abstractC11227t0 = c11223r0;
                        }
                        arrayList.add(abstractC11227t0);
                    }
                } while (!c13045h2.m36569i(value, arrayList));
                return c23454a0;
            case 1:
                C13045h2 c13045h3 = c11215n0.f35968Q;
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                if (!((C11197e0) this.f35906x).f35916g && ((Boolean) c13045h3.getValue()).booleanValue()) {
                    Boolean bool = Boolean.FALSE;
                    c13045h3.getClass();
                    c13045h3.m36571k(null, bool);
                }
                return c23454a0;
            default:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                Object obj2 = this.f35906x;
                Throwable thM68037a = C23468n.m68037a(obj2);
                if (thM68037a == null) {
                    throw AbstractC26725a.m79500d(obj2);
                }
                C13045h2 c13045h4 = c11215n0.f35965N;
                do {
                    value2 = c13045h4.getValue();
                } while (!c13045h4.m36569i(value2, new C11237y0(thM68037a)));
                return c23454a0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11195d0(Object obj, C11215n0 c11215n0, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f35905w = 2;
        this.f35906x = obj;
        this.f35907y = c11215n0;
    }
}
