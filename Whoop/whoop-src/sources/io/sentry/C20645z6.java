package io.sentry;

import aa3.C0627i1;
import com.whoop.data.repositories.C6656c;
import hc3.C17191x;
import io.sentry.protocol.C20470c;
import io.sentry.protocol.C20473d0;
import io.sentry.protocol.C20501v;
import io.sentry.protocol.EnumC20479g0;
import io.sentry.util.AbstractC20590l;
import io.sentry.util.C20579a;
import io.sentry.util.thread.InterfaceC20598a;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Timer;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p047c9.C4312c;
import p117eh.C13184a;
import p218ic.C18374o;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.z6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20645z6 implements InterfaceC20432n1 {

    /* JADX INFO: renamed from: b */
    public final C20314d7 f77202b;

    /* JADX INFO: renamed from: d */
    public final C20350h4 f77204d;

    /* JADX INFO: renamed from: e */
    public final String f77205e;

    /* JADX INFO: renamed from: g */
    public volatile C20629x6 f77207g;

    /* JADX INFO: renamed from: h */
    public volatile C20629x6 f77208h;

    /* JADX INFO: renamed from: i */
    public volatile Timer f77209i;

    /* JADX INFO: renamed from: j */
    public final C20579a f77210j;

    /* JADX INFO: renamed from: k */
    public final C20579a f77211k;

    /* JADX INFO: renamed from: l */
    public final AtomicBoolean f77212l;

    /* JADX INFO: renamed from: m */
    public final AtomicBoolean f77213m;

    /* JADX INFO: renamed from: n */
    public final EnumC20479g0 f77214n;

    /* JADX INFO: renamed from: o */
    public final EnumC20537s1 f77215o;

    /* JADX INFO: renamed from: p */
    public final C20470c f77216p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC20406l f77217q;

    /* JADX INFO: renamed from: r */
    public final C20438n7 f77218r;

    /* JADX INFO: renamed from: a */
    public final C20501v f77201a = new C20501v();

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArrayList f77203c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f */
    public C20637y6 f77206f = C20637y6.f77193c;

    public C20645z6(C20426m7 c20426m7, C20350h4 c20350h4, C20438n7 c20438n7, InterfaceC20406l interfaceC20406l) {
        this.f77209i = null;
        C20579a c20579a = new C20579a();
        this.f77210j = c20579a;
        this.f77211k = new C20579a();
        this.f77212l = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f77213m = atomicBoolean;
        C20470c c20470c = new C20470c();
        this.f77216p = c20470c;
        C20314d7 c20314d7 = new C20314d7(c20426m7, this, c20350h4, c20438n7);
        this.f77202b = c20314d7;
        this.f77205e = c20426m7.f76505P;
        this.f77215o = c20426m7.f76317L;
        this.f77204d = c20350h4;
        Boolean bool = Boolean.TRUE;
        interfaceC20406l = bool.equals(m56763D()) ? interfaceC20406l : null;
        this.f77217q = interfaceC20406l;
        this.f77214n = c20426m7.f76506Q;
        this.f77218r = c20438n7;
        m56764E(c20314d7);
        C20501v c20501vM56762C = m56762C();
        if (!c20501vM56762C.equals(C20501v.f76802x) && bool.equals(m56763D())) {
            c20470c.mo56545k(new C20510q3(c20501vM56762C), "profile");
        }
        if (interfaceC20406l != null) {
            interfaceC20406l.mo56618d(this);
        }
        if (c20438n7.f76520g == null && c20438n7.f76521h == null) {
            return;
        }
        boolean z4 = true;
        this.f77209i = new Timer(true);
        Long l7 = c20438n7.f76521h;
        if (l7 != null) {
            C20535s c20535sM56711a = c20579a.m56711a();
            try {
                if (this.f77209i != null) {
                    m56766y();
                    atomicBoolean.set(true);
                    this.f77208h = new C20629x6(this, 1);
                    try {
                        this.f77209i.schedule(this.f77208h, l7.longValue());
                    } catch (Throwable th3) {
                        this.f77204d.mo56432l().getLogger().mo16060j(EnumC20436n5.WARNING, "Failed to schedule finish timer", th3);
                        EnumC20374i7 enumC20374i7Mo56450c = mo56450c();
                        if (enumC20374i7Mo56450c == null) {
                            enumC20374i7Mo56450c = EnumC20374i7.DEADLINE_EXCEEDED;
                        }
                        if (this.f77218r.f76520g == null) {
                            z4 = false;
                        }
                        mo56511f(enumC20374i7Mo56450c, z4, null);
                        this.f77213m.set(false);
                    }
                }
                c20535sM56711a.close();
            } catch (Throwable th4) {
                try {
                    c20535sM56711a.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        }
        mo56515r();
    }

    /* JADX INFO: renamed from: A */
    public final InterfaceC20408l1 m56760A(C20323e7 c20323e7, C13184a c13184a) {
        boolean z4 = this.f77202b.f76280g;
        C20319e3 c20319e3 = C20319e3.f76299a;
        if (!z4 && this.f77215o.equals(c20323e7.f76317L)) {
            C20350h4 c20350h4 = this.f77204d;
            if (!AbstractC20590l.m56723a((String) c13184a.f45699d, c20350h4.mo56432l().getIgnoredSpanOrigins())) {
                C20353h7 c20353h7 = c20323e7.f76323y;
                String str = c20323e7.f76310E;
                String str2 = c20323e7.f76311F;
                CopyOnWriteArrayList copyOnWriteArrayList = this.f77203c;
                if (copyOnWriteArrayList.size() >= c20350h4.mo56432l().getMaxSpans()) {
                    c20350h4.mo56432l().getLogger().mo16066m(EnumC20436n5.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
                    return c20319e3;
                }
                AbstractC29125c.m88510S(c20353h7, "parentSpanId is required");
                AbstractC29125c.m88510S(str, "operation is required");
                m56767z();
                C20314d7 c20314d7 = new C20314d7(this, this.f77204d, c20323e7, c13184a, new C6656c(this, 5));
                m56764E(c20314d7);
                copyOnWriteArrayList.add(c20314d7);
                InterfaceC20406l interfaceC20406l = this.f77217q;
                if (interfaceC20406l != null) {
                    interfaceC20406l.mo56617c(c20314d7);
                }
                return c20314d7;
            }
        }
        return c20319e3;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b2  */
    /* JADX INFO: renamed from: B */
    public final void m56761B(EnumC20374i7 enumC20374i7, AbstractC20576u4 abstractC20576u4, boolean z4, C20337g0 c20337g0) {
        C20539s3 c20539s3Mo56067c;
        AbstractC20576u4 abstractC20576u5 = this.f77202b.f76275b;
        if (abstractC20576u4 == null) {
            abstractC20576u4 = abstractC20576u5;
        }
        if (abstractC20576u4 == null) {
            abstractC20576u4 = this.f77204d.mo56432l().getDateProvider().now();
        }
        Iterator it = this.f77203c.iterator();
        while (it.hasNext()) {
            ((C20314d7) it.next()).f76282i.getClass();
        }
        this.f77206f = new C20637y6(true, enumC20374i7);
        if (this.f77202b.f76280g) {
            return;
        }
        if (this.f77218r.f76519f) {
            ListIterator listIterator = this.f77203c.listIterator();
            while (listIterator.hasNext()) {
                C20314d7 c20314d7 = (C20314d7) listIterator.next();
                if (!c20314d7.f76280g && c20314d7.f76275b == null) {
                    return;
                }
            }
        }
        AtomicReference atomicReference = new AtomicReference();
        C20314d7 c20314d8 = this.f77202b;
        c20314d8.f76283j = new C18374o(this, c20314d8.f76283j, atomicReference);
        c20314d8.mo56464v(this.f77206f.f77195b, abstractC20576u4);
        Boolean bool = Boolean.TRUE;
        if (bool.equals(m56763D())) {
            C0627i1 c0627i1 = this.f77202b.f76276c.f76324z;
            if (bool.equals(c0627i1 == null ? null : (Boolean) c0627i1.f2198e)) {
                c20539s3Mo56067c = this.f77204d.mo56432l().getTransactionProfiler().mo56067c(this, (List) atomicReference.get(), this.f77204d.mo56432l());
            } else {
                c20539s3Mo56067c = null;
            }
        } else {
            c20539s3Mo56067c = null;
        }
        if (this.f77204d.mo56432l().isContinuousProfilingEnabled()) {
            EnumC20518r3 profileLifecycle = this.f77204d.mo56432l().getProfileLifecycle();
            EnumC20518r3 enumC20518r3 = EnumC20518r3.TRACE;
            if (profileLifecycle == enumC20518r3 && this.f77202b.f76276c.f76320O.equals(C20501v.f76802x)) {
                this.f77204d.mo56432l().getContinuousProfiler().mo55950d(enumC20518r3);
            }
        }
        if (atomicReference.get() != null) {
            ((List) atomicReference.get()).clear();
        }
        C20350h4 c20350h4 = this.f77204d;
        if (c20350h4.isEnabled()) {
            try {
                InterfaceC20259b1 interfaceC20259b1M56609g = c20350h4.f76375e.m56609g(null);
                interfaceC20259b1M56609g.mo56192N(new C4312c(14, this, interfaceC20259b1M56609g));
            } catch (Throwable th3) {
                c20350h4.mo56432l().getLogger().mo16060j(EnumC20436n5.ERROR, "Error in the 'configureScope' callback.", th3);
            }
        } else {
            c20350h4.mo56432l().getLogger().mo16066m(EnumC20436n5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
        }
        C20473d0 c20473d0 = new C20473d0(this);
        if (this.f77209i != null) {
            C20535s c20535sM56711a = this.f77210j.m56711a();
            try {
                if (this.f77209i != null) {
                    m56767z();
                    m56766y();
                    this.f77209i.cancel();
                    this.f77209i = null;
                }
                c20535sM56711a.close();
            } catch (Throwable th4) {
                try {
                    c20535sM56711a.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        }
        if (z4 && this.f77203c.isEmpty() && this.f77218r.f76520g != null) {
            this.f77204d.mo56432l().getLogger().mo16066m(EnumC20436n5.DEBUG, "Dropping idle transaction %s because it has no child spans", this.f77205e);
        } else {
            c20473d0.f76638T.putAll(this.f77202b.f76285l);
            this.f77204d.mo56418C(c20473d0, mo56513j(), c20337g0, c20539s3Mo56067c);
        }
    }

    /* JADX INFO: renamed from: C */
    public final C20501v m56762C() {
        C20314d7 c20314d7 = this.f77202b;
        return !c20314d7.f76276c.f76320O.equals(C20501v.f76802x) ? c20314d7.f76276c.f76320O : this.f77204d.mo56432l().getContinuousProfiler().mo55951e();
    }

    /* JADX INFO: renamed from: D */
    public final Boolean m56763D() {
        C0627i1 c0627i1 = this.f77202b.f76276c.f76324z;
        if (c0627i1 == null) {
            return null;
        }
        return (Boolean) c0627i1.f2195b;
    }

    /* JADX INFO: renamed from: E */
    public final void m56764E(C20314d7 c20314d7) {
        InterfaceC20598a threadChecker = this.f77204d.mo56432l().getThreadChecker();
        C20501v c20501vM56762C = m56762C();
        if (!c20501vM56762C.equals(C20501v.f76802x)) {
            Boolean bool = Boolean.TRUE;
            C0627i1 c0627i1 = c20314d7.f76276c.f76324z;
            if (bool.equals(c0627i1 == null ? null : (Boolean) c0627i1.f2195b)) {
                c20314d7.mo56459o(c20501vM56762C.toString(), "profiler_id");
            }
        }
        c20314d7.mo56459o(String.valueOf(threadChecker.mo55998c()), "thread.id");
        c20314d7.mo56459o(threadChecker.mo55997b(), "thread.name");
    }

    /* JADX INFO: renamed from: F */
    public final void m56765F(C20269c c20269c) {
        C20314d7 c20314d7 = this.f77202b;
        C20350h4 c20350h4 = this.f77204d;
        C20535s c20535sM56711a = this.f77211k.m56711a();
        try {
            if (c20269c.f76118f) {
                AtomicReference atomicReference = new AtomicReference();
                if (c20350h4.isEnabled()) {
                    try {
                        atomicReference.set(c20350h4.f76375e.m56609g(null).mo56208s());
                    } catch (Throwable th3) {
                        c20350h4.mo56432l().getLogger().mo16060j(EnumC20436n5.ERROR, "Error in the 'configureScope' callback.", th3);
                    }
                } else {
                    c20350h4.mo56432l().getLogger().mo16066m(EnumC20436n5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
                }
                c20269c.m56228d(c20314d7.f76276c.f76321w, (C20501v) atomicReference.get(), c20350h4.mo56432l(), c20314d7.f76276c.f76324z, this.f77205e, this.f77214n);
                c20269c.f76118f = false;
            }
            c20535sM56711a.close();
        } catch (Throwable th4) {
            try {
                c20535sM56711a.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: a */
    public final void mo56448a(EnumC20374i7 enumC20374i7) {
        C20314d7 c20314d7 = this.f77202b;
        if (c20314d7.f76280g) {
            this.f77204d.mo56432l().getLogger().mo16066m(EnumC20436n5.DEBUG, "The transaction is already finished. Status %s cannot be set", enumC20374i7 == null ? "null" : enumC20374i7.name());
        } else {
            c20314d7.f76276c.f76312G = enumC20374i7;
        }
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: b */
    public final C20621w6 mo56449b() {
        return this.f77202b.mo56449b();
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: c */
    public final EnumC20374i7 mo56450c() {
        return this.f77202b.f76276c.f76312G;
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: d */
    public final InterfaceC20408l1 mo56451d(String str, AbstractC20576u4 abstractC20576u4, EnumC20537s1 enumC20537s1) {
        return mo56460q("activity.load", str, abstractC20576u4, enumC20537s1, new C13184a(1));
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: e */
    public final boolean mo56452e() {
        return this.f77202b.f76280g;
    }

    @Override // io.sentry.InterfaceC20432n1
    /* JADX INFO: renamed from: f */
    public final void mo56511f(EnumC20374i7 enumC20374i7, boolean z4, C20337g0 c20337g0) {
        if (this.f77202b.f76280g) {
            return;
        }
        AbstractC20576u4 abstractC20576u4Now = this.f77204d.mo56432l().getDateProvider().now();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.f77203c);
        ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
        while (listIterator.hasPrevious()) {
            C20314d7 c20314d7 = (C20314d7) listIterator.previous();
            c20314d7.f76283j = null;
            c20314d7.mo56464v(enumC20374i7, abstractC20576u4Now);
        }
        m56761B(enumC20374i7, abstractC20576u4Now, z4, c20337g0);
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: g */
    public final void mo56453g() {
        mo56464v(mo56450c(), null);
    }

    @Override // io.sentry.InterfaceC20408l1
    public final String getDescription() {
        return this.f77202b.f76276c.f76311F;
    }

    @Override // io.sentry.InterfaceC20432n1
    public final String getName() {
        return this.f77205e;
    }

    @Override // io.sentry.InterfaceC20432n1
    /* JADX INFO: renamed from: h */
    public final C20501v mo56512h() {
        return this.f77201a;
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: i */
    public final void mo56454i(String str, Number number) {
        this.f77202b.mo56454i(str, number);
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: j */
    public final C20405k7 mo56513j() {
        C20269c c20269c;
        if (!this.f77204d.mo56432l().isTraceSampling() || (c20269c = this.f77202b.f76276c.f76318M) == null) {
            return null;
        }
        m56765F(c20269c);
        return c20269c.m56229e();
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: k */
    public final boolean mo56455k() {
        return false;
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: l */
    public final void mo56456l(EnumC20374i7 enumC20374i7) {
        mo56464v(enumC20374i7, null);
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: m */
    public final void mo56457m(IOException iOException) {
        C20314d7 c20314d7 = this.f77202b;
        if (c20314d7.f76280g) {
            this.f77204d.mo56432l().getLogger().mo16066m(EnumC20436n5.DEBUG, "The transaction is already finished. Throwable cannot be set", new Object[0]);
        } else {
            c20314d7.f76278e = iOException;
        }
    }

    @Override // io.sentry.InterfaceC20408l1
    public final void makeCurrent() {
        C20350h4 c20350h4 = this.f77204d;
        if (!c20350h4.isEnabled()) {
            c20350h4.mo56432l().getLogger().mo16066m(EnumC20436n5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            c20350h4.f76375e.m56609g(null).mo56180B(this);
        } catch (Throwable th3) {
            c20350h4.mo56432l().getLogger().mo16060j(EnumC20436n5.ERROR, "Error in the 'configureScope' callback.", th3);
        }
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: n */
    public final C17191x mo56458n(List list) {
        C20269c c20269c;
        if (!this.f77204d.mo56432l().isTraceSampling() || (c20269c = this.f77202b.f76276c.f76318M) == null) {
            return null;
        }
        m56765F(c20269c);
        return C17191x.m48545a(c20269c, list);
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: o */
    public final void mo56459o(Object obj, String str) {
        C20314d7 c20314d7 = this.f77202b;
        if (c20314d7.f76280g) {
            this.f77204d.mo56432l().getLogger().mo16066m(EnumC20436n5.DEBUG, "The transaction is already finished. Data %s cannot be set", str);
        } else {
            c20314d7.mo56459o(obj, str);
        }
    }

    @Override // io.sentry.InterfaceC20432n1
    /* JADX INFO: renamed from: p */
    public final InterfaceC20408l1 mo56514p() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.f77203c);
        ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
        while (listIterator.hasPrevious()) {
            C20314d7 c20314d7 = (C20314d7) listIterator.previous();
            if (!c20314d7.f76280g) {
                return c20314d7;
            }
        }
        return null;
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: q */
    public final InterfaceC20408l1 mo56460q(String str, String str2, AbstractC20576u4 abstractC20576u4, EnumC20537s1 enumC20537s1, C13184a c13184a) {
        boolean z4 = this.f77202b.f76280g;
        C20319e3 c20319e3 = C20319e3.f76299a;
        if (z4 || !this.f77215o.equals(enumC20537s1)) {
            return c20319e3;
        }
        int size = this.f77203c.size();
        C20350h4 c20350h4 = this.f77204d;
        if (size < c20350h4.mo56432l().getMaxSpans()) {
            return this.f77202b.mo56460q(str, str2, abstractC20576u4, enumC20537s1, c13184a);
        }
        c20350h4.mo56432l().getLogger().mo16066m(EnumC20436n5.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
        return c20319e3;
    }

    @Override // io.sentry.InterfaceC20432n1
    /* JADX INFO: renamed from: r */
    public final void mo56515r() {
        Long l7;
        C20535s c20535sM56711a = this.f77210j.m56711a();
        try {
            if (this.f77209i != null && (l7 = this.f77218r.f76520g) != null) {
                m56767z();
                this.f77212l.set(true);
                this.f77207g = new C20629x6(this, 0);
                try {
                    this.f77209i.schedule(this.f77207g, l7.longValue());
                } catch (Throwable th3) {
                    this.f77204d.mo56432l().getLogger().mo16060j(EnumC20436n5.WARNING, "Failed to schedule finish timer", th3);
                    EnumC20374i7 enumC20374i7Mo56450c = mo56450c();
                    if (enumC20374i7Mo56450c == null) {
                        enumC20374i7Mo56450c = EnumC20374i7.OK;
                    }
                    mo56464v(enumC20374i7Mo56450c, null);
                    this.f77212l.set(false);
                }
            }
            c20535sM56711a.close();
        } catch (Throwable th4) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: s */
    public final void mo56461s(String str, Long l7, InterfaceC20409l2 interfaceC20409l2) {
        this.f77202b.mo56461s(str, l7, interfaceC20409l2);
    }

    @Override // io.sentry.InterfaceC20408l1
    public final void setDescription(String str) {
        C20314d7 c20314d7 = this.f77202b;
        if (c20314d7.f76280g) {
            this.f77204d.mo56432l().getLogger().mo16066m(EnumC20436n5.DEBUG, "The transaction is already finished. Description %s cannot be set", str);
        } else {
            c20314d7.f76276c.f76311F = str;
        }
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: t */
    public final C20323e7 mo56462t() {
        return this.f77202b.f76276c;
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: u */
    public final AbstractC20576u4 mo56463u() {
        return this.f77202b.f76275b;
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: v */
    public final void mo56464v(EnumC20374i7 enumC20374i7, AbstractC20576u4 abstractC20576u4) {
        m56761B(enumC20374i7, abstractC20576u4, true, null);
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: w */
    public final InterfaceC20408l1 mo56465w(String str, String str2) {
        return mo56460q(str, str2, null, EnumC20537s1.SENTRY, new C13184a(1));
    }

    @Override // io.sentry.InterfaceC20408l1
    /* JADX INFO: renamed from: x */
    public final AbstractC20576u4 mo56466x() {
        return this.f77202b.f76274a;
    }

    /* JADX INFO: renamed from: y */
    public final void m56766y() {
        C20535s c20535sM56711a = this.f77210j.m56711a();
        try {
            if (this.f77208h != null) {
                this.f77208h.cancel();
                this.f77213m.set(false);
                this.f77208h = null;
            }
            c20535sM56711a.close();
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m56767z() {
        C20535s c20535sM56711a = this.f77210j.m56711a();
        try {
            if (this.f77207g != null) {
                this.f77207g.cancel();
                this.f77212l.set(false);
                this.f77207g = null;
            }
            c20535sM56711a.close();
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
