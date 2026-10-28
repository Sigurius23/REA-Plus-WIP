package p615xh;

import android.content.Context;
import fi.C14503i;
import fi.C14508n;
import fi.InterfaceC14506l;
import gi.C15878i;
import java.util.List;
import p461rh.C31417f;
import p505ts.AbstractC34132o;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: xh.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C38304k implements InterfaceC38301h {

    /* JADX INFO: renamed from: a */
    public final C14503i f164153a;

    /* JADX INFO: renamed from: b */
    public final List f164154b;

    /* JADX INFO: renamed from: c */
    public final int f164155c;

    /* JADX INFO: renamed from: d */
    public final C14503i f164156d;

    /* JADX INFO: renamed from: e */
    public final C15878i f164157e;

    /* JADX INFO: renamed from: f */
    public final C31417f f164158f;

    /* JADX INFO: renamed from: g */
    public final boolean f164159g;

    public C38304k(C14503i c14503i, List list, int i13, C14503i c14503i2, C15878i c15878i, C31417f c31417f, boolean z4) {
        this.f164153a = c14503i;
        this.f164154b = list;
        this.f164155c = i13;
        this.f164156d = c14503i2;
        this.f164157e = c15878i;
        this.f164158f = c31417f;
        this.f164159g = z4;
    }

    /* JADX INFO: renamed from: b */
    public static C38304k m122693b(C38304k c38304k, int i13, C14503i c14503i, int i14) {
        if ((i14 & 1) != 0) {
            i13 = c38304k.f164155c;
        }
        int i15 = i13;
        if ((i14 & 2) != 0) {
            c14503i = c38304k.f164156d;
        }
        C15878i c15878i = c38304k.f164157e;
        return new C38304k(c38304k.f164153a, c38304k.f164154b, i15, c14503i, c15878i, c38304k.f164158f, c38304k.f164159g);
    }

    /* JADX INFO: renamed from: a */
    public final void m122694a(C14503i c14503i, InterfaceC38302i interfaceC38302i) {
        Context context = c14503i.f52968a;
        C14503i c14503i2 = this.f164153a;
        if (context != c14503i2.f52968a) {
            throw new IllegalStateException(("Interceptor '" + interfaceC38302i + "' cannot modify the request's context.").toString());
        }
        if (c14503i.f52969b == C14508n.f53002a) {
            throw new IllegalStateException(("Interceptor '" + interfaceC38302i + "' cannot set the request's data to null.").toString());
        }
        if (c14503i.f52970c != c14503i2.f52970c) {
            throw new IllegalStateException(("Interceptor '" + interfaceC38302i + "' cannot modify the request's target.").toString());
        }
        if (c14503i.f52983p == c14503i2.f52983p) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + interfaceC38302i + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m122695c(AbstractC32269c abstractC32269c) {
        C38303j c38303j;
        InterfaceC38302i interfaceC38302i;
        C38304k c38304k;
        if (abstractC32269c instanceof C38303j) {
            c38303j = (C38303j) abstractC32269c;
            int i13 = c38303j.f164148E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c38303j.f164148E = i13 - Integer.MIN_VALUE;
            } else {
                c38303j = new C38303j(this, abstractC32269c);
            }
        } else {
            c38303j = new C38303j(this, abstractC32269c);
        }
        Object obj = c38303j.f164151y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c38303j.f164148E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            List list = this.f164154b;
            int i15 = this.f164155c;
            InterfaceC38302i interfaceC38302i2 = (InterfaceC38302i) list.get(i15);
            C38304k c38304kM122693b = m122693b(this, i15 + 1, null, 6);
            c38303j.f164149w = this;
            c38303j.f164150x = interfaceC38302i2;
            c38303j.f164148E = 1;
            Object objIntercept = interfaceC38302i2.intercept(c38304kM122693b, c38303j);
            if (objIntercept == enumC31071a) {
                return enumC31071a;
            }
            interfaceC38302i = interfaceC38302i2;
            obj = objIntercept;
            c38304k = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC38302i = c38303j.f164150x;
            c38304k = c38303j.f164149w;
            AbstractC34132o.m107864I(obj);
        }
        InterfaceC14506l interfaceC14506l = (InterfaceC14506l) obj;
        c38304k.m122694a(interfaceC14506l.mo41406d(), interfaceC38302i);
        return interfaceC14506l;
    }
}
