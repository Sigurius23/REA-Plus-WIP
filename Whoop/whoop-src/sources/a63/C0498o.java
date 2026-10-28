package a63;

import c93.InterfaceC4351m;
import f63.AbstractC14155c;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import o63.C27610a;
import p505ts.AbstractC34132o;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: a63.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C0498o {

    /* JADX INFO: renamed from: d */
    public static final C0475a f1679d = new C0475a(1);

    /* JADX INFO: renamed from: e */
    public static final C27610a f1680e = new C27610a("HttpResponseValidator");

    /* JADX INFO: renamed from: a */
    public final List f1681a;

    /* JADX INFO: renamed from: b */
    public final List f1682b;

    /* JADX INFO: renamed from: c */
    public final boolean f1683c;

    public C0498o(List list, List list2, boolean z4) {
        this.f1681a = list;
        this.f1682b = list2;
        this.f1683c = z4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public static final void m1205a(C0498o c0498o, AbstractC32269c abstractC32269c) {
        C0496m c0496m;
        Iterator it;
        c0498o.getClass();
        if (abstractC32269c instanceof C0496m) {
            c0496m = (C0496m) abstractC32269c;
            int i13 = c0496m.f1673y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0496m.f1673y = i13 - Integer.MIN_VALUE;
            } else {
                c0496m = new C0496m(c0498o, abstractC32269c);
            }
        } else {
            c0496m = new C0496m(c0498o, abstractC32269c);
        }
        Object obj = c0496m.f1671w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c0496m.f1673y;
        if (i14 != 0) {
            it = null;
            if (i14 != 1 && i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        } else {
            AbstractC34132o.m107864I(obj);
            it = c0498o.f1682b.iterator();
        }
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: b */
    public static final Object m1206b(C0498o c0498o, AbstractC14155c abstractC14155c, AbstractC32269c abstractC32269c) {
        C0497n c0497n;
        Iterator it;
        c0498o.getClass();
        if (abstractC32269c instanceof C0497n) {
            c0497n = (C0497n) abstractC32269c;
            int i13 = c0497n.f1674E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0497n.f1674E = i13 - Integer.MIN_VALUE;
            } else {
                c0497n = new C0497n(c0498o, abstractC32269c);
            }
        } else {
            c0497n = new C0497n(c0498o, abstractC32269c);
        }
        Object obj = c0497n.f1677y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c0497n.f1674E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            it = c0498o.f1681a.iterator();
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = c0497n.f1676x;
            abstractC14155c = c0497n.f1675w;
            AbstractC34132o.m107864I(obj);
        }
        while (it.hasNext()) {
            InterfaceC4351m interfaceC4351m = (InterfaceC4351m) it.next();
            c0497n.f1675w = abstractC14155c;
            c0497n.f1676x = it;
            c0497n.f1674E = 1;
            if (interfaceC4351m.invoke(abstractC14155c, c0497n) == enumC31071a) {
                return enumC31071a;
            }
        }
        return C23454a0.f92919a;
    }
}
