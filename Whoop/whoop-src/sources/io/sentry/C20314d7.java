package io.sentry;

import aa3.C0627i1;
import com.whoop.data.repositories.C6656c;
import hc3.C17191x;
import io.sentry.protocol.C20489m;
import io.sentry.protocol.C20501v;
import io.sentry.util.C20579a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p117eh.C13184a;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.d7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20314d7 implements InterfaceC20408l1 {

    /* JADX INFO: renamed from: a */
    public final AbstractC20576u4 f76274a;

    /* JADX INFO: renamed from: b */
    public AbstractC20576u4 f76275b;

    /* JADX INFO: renamed from: c */
    public final C20323e7 f76276c;

    /* JADX INFO: renamed from: d */
    public final C20645z6 f76277d;

    /* JADX INFO: renamed from: e */
    public IOException f76278e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC20308d1 f76279f;

    /* JADX INFO: renamed from: i */
    public final C13184a f76282i;

    /* JADX INFO: renamed from: j */
    public InterfaceC20332f7 f76283j;

    /* JADX INFO: renamed from: g */
    public boolean f76280g = false;

    /* JADX INFO: renamed from: h */
    public final AtomicBoolean f76281h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k */
    public final ConcurrentHashMap f76284k = new ConcurrentHashMap();

    /* JADX INFO: renamed from: l */
    public final ConcurrentHashMap f76285l = new ConcurrentHashMap();

    public C20314d7(C20645z6 c20645z6, C20350h4 c20350h4, C20323e7 c20323e7, C13184a c13184a, C6656c c6656c) {
        new ConcurrentHashMap();
        new C20579a();
        this.f76276c = c20323e7;
        c20323e7.f76314I = (String) c13184a.f45699d;
        this.f76277d = c20645z6;
        AbstractC29125c.m88510S(c20350h4, "Scopes are required");
        this.f76279f = c20350h4;
        this.f76282i = c13184a;
        this.f76283j = c6656c;
        AbstractC20576u4 abstractC20576u4 = (AbstractC20576u4) c13184a.f45697b;
        if (abstractC20576u4 != null) {
            this.f76274a = abstractC20576u4;
        } else {
            this.f76274a = c20350h4.mo56432l().getDateProvider().now();
        }
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: a */
    public final void mo56448a(EnumC20374i7 enumC20374i7) {
        this.f76276c.f76312G = enumC20374i7;
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: b */
    public final C20621w6 mo56449b() {
        C20323e7 c20323e7 = this.f76276c;
        C20501v c20501v = c20323e7.f76321w;
        C20353h7 c20353h7 = c20323e7.f76322x;
        C0627i1 c0627i1 = c20323e7.f76324z;
        return new C20621w6(c20501v, c20353h7, c0627i1 == null ? null : (Boolean) c0627i1.f2195b);
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: c */
    public final EnumC20374i7 mo56450c() {
        return this.f76276c.f76312G;
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: d */
    public final InterfaceC20408l1 mo56451d(String str, AbstractC20576u4 abstractC20576u4, EnumC20537s1 enumC20537s1) {
        return mo56460q("activity.load", str, abstractC20576u4, enumC20537s1, new C13184a(1));
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: e */
    public final boolean mo56452e() {
        return this.f76280g;
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: g */
    public final void mo56453g() {
        mo56456l(this.f76276c.f76312G);
    }

    @Override // io.sentry.InterfaceC20408l1
    public final String getDescription() {
        return this.f76276c.f76311F;
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: i */
    public final void mo56454i(String str, Number number) {
        if (this.f76280g) {
            this.f76279f.mo56432l().getLogger().mo16066m(EnumC20436n5.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.f76285l.put(str, new C20489m(null, number));
        C20645z6 c20645z6 = this.f76277d;
        C20314d7 c20314d7 = c20645z6.f77202b;
        if (c20314d7 == this || c20314d7.f76285l.containsKey(str)) {
            return;
        }
        c20645z6.mo56454i(str, number);
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: k */
    public final boolean mo56455k() {
        return false;
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: l */
    public final void mo56456l(EnumC20374i7 enumC20374i7) {
        mo56464v(enumC20374i7, this.f76279f.mo56432l().getDateProvider().now());
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: m */
    public final void mo56457m(IOException iOException) {
        this.f76278e = iOException;
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: n */
    public final C17191x mo56458n(List list) {
        return this.f76277d.mo56458n(list);
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: o */
    public final void mo56459o(Object obj, String str) {
        ConcurrentHashMap concurrentHashMap = this.f76284k;
        if (obj == null) {
            concurrentHashMap.remove(str);
        } else {
            concurrentHashMap.put(str, obj);
        }
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: q */
    public final InterfaceC20408l1 mo56460q(String str, String str2, AbstractC20576u4 abstractC20576u4, EnumC20537s1 enumC20537s1, C13184a c13184a) {
        if (this.f76280g) {
            return C20319e3.f76299a;
        }
        C20353h7 c20353h7 = this.f76276c.f76322x;
        C20645z6 c20645z6 = this.f76277d;
        C20323e7 c20323e7 = c20645z6.f77202b.f76276c;
        C20323e7 c20323e8 = new C20323e7(c20323e7.f76321w, new C20353h7(), c20353h7, str, null, c20323e7.f76324z, null, "manual");
        c20323e8.f76311F = str2;
        c20323e8.f76317L = enumC20537s1;
        c13184a.f45697b = abstractC20576u4;
        return c20645z6.m56760A(c20323e8, c13184a);
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: s */
    public final void mo56461s(String str, Long l7, InterfaceC20409l2 interfaceC20409l2) {
        if (this.f76280g) {
            this.f76279f.mo56432l().getLogger().mo16066m(EnumC20436n5.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.f76285l.put(str, new C20489m(interfaceC20409l2.apiName(), l7));
        C20645z6 c20645z6 = this.f76277d;
        C20314d7 c20314d7 = c20645z6.f77202b;
        if (c20314d7 == this || c20314d7.f76285l.containsKey(str)) {
            return;
        }
        c20645z6.mo56461s(str, l7, interfaceC20409l2);
    }

    @Override // io.sentry.InterfaceC20408l1
    public final void setDescription(String str) {
        this.f76276c.f76311F = str;
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: t */
    public final C20323e7 mo56462t() {
        return this.f76276c;
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: u */
    public final AbstractC20576u4 mo56463u() {
        return this.f76275b;
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: v */
    public final void mo56464v(EnumC20374i7 enumC20374i7, AbstractC20576u4 abstractC20576u4) {
        List<C20314d7> list;
        AbstractC20576u4 abstractC20576u5;
        AbstractC20576u4 abstractC20576u6;
        if (this.f76280g || !this.f76281h.compareAndSet(false, true)) {
            return;
        }
        C20323e7 c20323e7 = this.f76276c;
        c20323e7.f76312G = enumC20374i7;
        C20353h7 c20353h7 = c20323e7.f76322x;
        InterfaceC20308d1 interfaceC20308d1 = this.f76279f;
        if (abstractC20576u4 == null) {
            abstractC20576u4 = interfaceC20308d1.mo56432l().getDateProvider().now();
        }
        this.f76275b = abstractC20576u4;
        C13184a c13184a = this.f76282i;
        c13184a.getClass();
        boolean z4 = c13184a.f45696a;
        C20645z6 c20645z6 = this.f76277d;
        if (z4) {
            C20314d7 c20314d7 = c20645z6.f77202b;
            CopyOnWriteArrayList<C20314d7> copyOnWriteArrayList = c20645z6.f77203c;
            if (!c20314d7.f76276c.f76322x.equals(c20353h7)) {
                list = copyOnWriteArrayList;
                ArrayList arrayList = new ArrayList();
                for (C20314d7 c20314d8 : copyOnWriteArrayList) {
                    C20353h7 c20353h8 = c20314d8.f76276c.f76323y;
                    if (c20353h8 != null && c20353h8.equals(c20353h7)) {
                        arrayList.add(c20314d8);
                    }
                }
                list = arrayList;
            }
            list = copyOnWriteArrayList;
            AbstractC20576u4 abstractC20576u7 = null;
            AbstractC20576u4 abstractC20576u8 = null;
            for (C20314d7 c20314d9 : list) {
                if (abstractC20576u7 == null || c20314d9.f76274a.mo56692b(abstractC20576u7) < 0) {
                    abstractC20576u7 = c20314d9.f76274a;
                }
                if (abstractC20576u8 == null || ((abstractC20576u6 = c20314d9.f76275b) != null && abstractC20576u6.mo56692b(abstractC20576u8) > 0)) {
                    abstractC20576u8 = c20314d9.f76275b;
                }
            }
            if (c13184a.f45696a && abstractC20576u8 != null && (((abstractC20576u5 = this.f76275b) == null || abstractC20576u5.mo56692b(abstractC20576u8) > 0) && this.f76275b != null)) {
                this.f76275b = abstractC20576u8;
            }
        }
        IOException iOException = this.f76278e;
        if (iOException != null) {
            interfaceC20308d1.mo56436p(iOException, this, c20645z6.f77205e);
        }
        InterfaceC20332f7 interfaceC20332f7 = this.f76283j;
        if (interfaceC20332f7 != null) {
            interfaceC20332f7.mo19988c(this);
        }
        this.f76280g = true;
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: w */
    public final InterfaceC20408l1 mo56465w(String str, String str2) {
        if (this.f76280g) {
            return C20319e3.f76299a;
        }
        C20353h7 c20353h7 = this.f76276c.f76322x;
        C20645z6 c20645z6 = this.f76277d;
        c20645z6.getClass();
        C13184a c13184a = new C13184a(1);
        C20323e7 c20323e7 = c20645z6.f77202b.f76276c;
        C20323e7 c20323e8 = new C20323e7(c20323e7.f76321w, new C20353h7(), c20353h7, str, null, c20323e7.f76324z, null, "manual");
        c20323e8.f76311F = str2;
        c20323e8.f76317L = EnumC20537s1.SENTRY;
        return c20645z6.m56760A(c20323e8, c13184a);
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: x */
    public final AbstractC20576u4 mo56466x() {
        return this.f76274a;
    }

    public C20314d7(C20426m7 c20426m7, C20645z6 c20645z6, C20350h4 c20350h4, C20438n7 c20438n7) {
        new ConcurrentHashMap();
        new C20579a();
        this.f76276c = c20426m7;
        c20426m7.f76314I = (String) c20438n7.f45699d;
        this.f76277d = c20645z6;
        this.f76279f = c20350h4;
        this.f76283j = null;
        AbstractC20576u4 abstractC20576u4 = (AbstractC20576u4) c20438n7.f45697b;
        if (abstractC20576u4 != null) {
            this.f76274a = abstractC20576u4;
        } else {
            this.f76274a = c20350h4.mo56432l().getDateProvider().now();
        }
        this.f76282i = c20438n7;
    }
}
