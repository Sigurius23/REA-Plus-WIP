package p195hh;

import android.content.Context;
import bh.C3240c;
import java.util.List;
import mh.AbstractC25543k;
import mh.C25542j;
import mh.C25544l;
import p341nh.C26714h;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: hh.k */
/* JADX INFO: loaded from: classes.dex */
public final class C17280k implements InterfaceC17277h {

    /* JADX INFO: renamed from: a */
    public final C25542j f66430a;

    /* JADX INFO: renamed from: b */
    public final List f66431b;

    /* JADX INFO: renamed from: c */
    public final int f66432c;

    /* JADX INFO: renamed from: d */
    public final C25542j f66433d;

    /* JADX INFO: renamed from: e */
    public final C26714h f66434e;

    /* JADX INFO: renamed from: f */
    public final C3240c f66435f;

    /* JADX INFO: renamed from: g */
    public final boolean f66436g;

    public C17280k(C25542j c25542j, List list, int i13, C25542j c25542j2, C26714h c26714h, C3240c c3240c, boolean z4) {
        this.f66430a = c25542j;
        this.f66431b = list;
        this.f66432c = i13;
        this.f66433d = c25542j2;
        this.f66434e = c26714h;
        this.f66435f = c3240c;
        this.f66436g = z4;
    }

    /* JADX INFO: renamed from: a */
    public final void m48924a(C25542j c25542j, InterfaceC17278i interfaceC17278i) {
        Context context = c25542j.f100108a;
        C25542j c25542j2 = this.f66430a;
        if (context != c25542j2.f100108a) {
            throw new IllegalStateException(("Interceptor '" + interfaceC17278i + "' cannot modify the request's context.").toString());
        }
        if (c25542j.f100109b == C25544l.f100134a) {
            throw new IllegalStateException(("Interceptor '" + interfaceC17278i + "' cannot set the request's data to null.").toString());
        }
        if (c25542j.f100110c != c25542j2.f100110c) {
            throw new IllegalStateException(("Interceptor '" + interfaceC17278i + "' cannot modify the request's target.").toString());
        }
        if (c25542j.f100131x != c25542j2.f100131x) {
            throw new IllegalStateException(("Interceptor '" + interfaceC17278i + "' cannot modify the request's lifecycle.").toString());
        }
        if (c25542j.f100132y == c25542j2.f100132y) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + interfaceC17278i + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m48925b(C25542j c25542j, InterfaceC30057d interfaceC30057d) {
        C17279j c17279j;
        InterfaceC17278i interfaceC17278i;
        C17280k c17280k;
        if (interfaceC30057d instanceof C17279j) {
            c17279j = (C17279j) interfaceC30057d;
            int i13 = c17279j.f66425E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c17279j.f66425E = i13 - Integer.MIN_VALUE;
            } else {
                c17279j = new C17279j(this, interfaceC30057d);
            }
        } else {
            c17279j = new C17279j(this, interfaceC30057d);
        }
        Object obj = c17279j.f66428y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c17279j.f66425E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            List list = this.f66431b;
            int i15 = this.f66432c;
            if (i15 > 0) {
                m48924a(c25542j, (InterfaceC17278i) list.get(i15 - 1));
            }
            InterfaceC17278i interfaceC17278i2 = (InterfaceC17278i) list.get(i15);
            C17280k c17280k2 = new C17280k(this.f66430a, this.f66431b, i15 + 1, c25542j, this.f66434e, this.f66435f, this.f66436g);
            c17279j.f66426w = this;
            c17279j.f66427x = interfaceC17278i2;
            c17279j.f66425E = 1;
            Object objMo48922a = interfaceC17278i2.mo48922a(c17280k2, c17279j);
            if (objMo48922a == enumC31071a) {
                return enumC31071a;
            }
            obj = objMo48922a;
            interfaceC17278i = interfaceC17278i2;
            c17280k = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC17278i = c17279j.f66427x;
            c17280k = c17279j.f66426w;
            AbstractC34132o.m107864I(obj);
        }
        AbstractC25543k abstractC25543k = (AbstractC25543k) obj;
        c17280k.m48924a(abstractC25543k.mo75115b(), interfaceC17278i);
        return abstractC25543k;
    }
}
