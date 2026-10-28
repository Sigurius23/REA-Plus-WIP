package p605x6;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import l83.C23454a0;
import m83.AbstractC25265s;
import p218ic.C18347a0;
import p218ic.C18354e;
import p218ic.C18357f0;
import p218ic.C18358g;
import p218ic.C18392z;
import p218ic.EnumC18368l;
import p218ic.EnumC18390x;
import p249jc.C21596v;
import p395p6.C28894l;
import p457rc.C31222e;
import p505ts.AbstractC34132o;
import p507tx.AbstractC34235f;
import p715kotlin.jvm.internal.AbstractC22676k;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: x6.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C38006k {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f162805a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C38007l f162806b;

    public C38006k(C38007l c38007l) {
        this.f162806b = c38007l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m121739a(Context context, String str, AbstractC32269c abstractC32269c) {
        C38003h c38003h;
        if (abstractC32269c instanceof C38003h) {
            c38003h = (C38003h) abstractC32269c;
            int i13 = c38003h.f162797z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c38003h.f162797z = i13 - Integer.MIN_VALUE;
            } else {
                c38003h = new C38003h(this, abstractC32269c);
            }
        } else {
            c38003h = new C38003h(this, abstractC32269c);
        }
        Object objM121745a = c38003h.f162795x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c38003h.f162797z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM121745a);
            C38014s c38014s = this.f162806b.f162809c;
            c38003h.f162794w = str;
            c38003h.f162797z = 1;
            objM121745a = c38014s.m121745a(context, str, c38003h);
            if (objM121745a == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c38003h.f162794w;
            AbstractC34132o.m107864I(objM121745a);
        }
        boolean zBooleanValue = ((Boolean) objM121745a).booleanValue();
        C28894l c28894l = (C28894l) this.f162805a.get(str);
        return Boolean.valueOf((c28894l != null ? c28894l.f116952b.get() : false) && zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        if (r15 == r1) goto L41;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m121740b(p395p6.C28894l r14, s83.AbstractC32269c r15) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p605x6.C38006k.m121740b(p6.l, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX INFO: renamed from: c */
    public final Object m121741c(Context context, C28894l c28894l, AbstractC32269c abstractC32269c) throws Throwable {
        C38005j c38005j;
        Context context2 = context;
        C38007l c38007l = this.f162806b;
        C38014s c38014s = c38007l.f162809c;
        Class cls = c38007l.f162807a;
        if (abstractC32269c instanceof C38005j) {
            c38005j = (C38005j) abstractC32269c;
            int i13 = c38005j.f162804z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c38005j.f162804z = i13 - Integer.MIN_VALUE;
            } else {
                c38005j = new C38005j(this, abstractC32269c);
            }
        } else {
            c38005j = new C38005j(this, abstractC32269c);
        }
        Object obj = c38005j.f162802x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c38005j.f162804z;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C28894l c28894l2 = (C28894l) this.f162805a.put(c28894l.f116951a, c28894l);
            if (c28894l2 != null) {
                c28894l2.f116954d.mo32217r(null);
                c28894l2.f116952b.set(false);
                c28894l2.f116963m.cancel((CancellationException) null);
            }
            C18347a0 c18347a0 = (C18347a0) ((C18392z) new C18392z(cls).m52882h((C18358g) c38007l.f162808b.invoke(c38007l, c28894l))).m52878b();
            String str = c28894l.f116951a;
            EnumC18368l enumC18368l = EnumC18368l.f71503w;
            c38005j.f162801w = context2;
            c38005j.f162804z = 1;
            c38014s.getClass();
            AbstractC22676k.m65750j(context2, "context");
            Object objM108238x = AbstractC34235f.m108238x(((C18357f0) C21596v.m60637g(context2).m52876e(str, enumC18368l, c18347a0)).f71478c, c38005j);
            if (objM108238x != enumC31071a) {
                objM108238x = c23454a0;
            }
            if (objM108238x != enumC31071a) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return c23454a0;
        }
        context2 = c38005j.f162801w;
        AbstractC34132o.m107864I(obj);
        c38005j.f162801w = null;
        c38005j.f162804z = 2;
        EnumC18368l enumC18368l2 = EnumC18368l.f71504x;
        C18347a0 c18347a1 = (C18347a0) ((C18392z) ((C18392z) new C18392z(cls).m52881g(3650L, TimeUnit.DAYS)).m52880f(new C18354e(new C31222e(null), EnumC18390x.f71560w, true, false, false, false, -1L, -1L, AbstractC25265s.m74103I1(new LinkedHashSet())))).m52878b();
        c38014s.getClass();
        AbstractC22676k.m65750j(context2, "context");
        Object objM108238x2 = AbstractC34235f.m108238x(((C18357f0) C21596v.m60637g(context2).m52876e("sessionWorkerKeepEnabled", enumC18368l2, c18347a1)).f71478c, c38005j);
        if (objM108238x2 != enumC31071a) {
            objM108238x2 = c23454a0;
        }
        if (objM108238x2 != enumC31071a) {
            objM108238x2 = c23454a0;
        }
        return objM108238x2 == enumC31071a ? enumC31071a : c23454a0;
    }
}
