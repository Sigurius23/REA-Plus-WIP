package cd3;

import android.content.Context;
import com.google.android.gms.common.C4969a;
import com.google.android.gms.common.api.InterfaceC4973d;
import com.google.crypto.tink.internal.C5101l0;
import com.iterable.iterableapi.CallableC5351m1;
import com.iterable.iterableapi.CallableC5355n1;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import io.sentry.AbstractC20519r4;
import io.sentry.C20040a;
import io.sentry.C20265b7;
import io.sentry.C20269c;
import io.sentry.C20275c5;
import io.sentry.C20312d5;
import io.sentry.C20316e0;
import io.sentry.C20321e5;
import io.sentry.C20323e7;
import io.sentry.C20337g0;
import io.sentry.C20349h3;
import io.sentry.C20405k7;
import io.sentry.C20412l5;
import io.sentry.C20426m7;
import io.sentry.C20456p2;
import io.sentry.C20457p3;
import io.sentry.C20513q6;
import io.sentry.C20539s3;
import io.sentry.C20540s4;
import io.sentry.C20541s5;
import io.sentry.C20542s6;
import io.sentry.C20619w4;
import io.sentry.C20620w5;
import io.sentry.C20626x3;
import io.sentry.C20630y;
import io.sentry.CallableC20627x4;
import io.sentry.CallableC20635y4;
import io.sentry.CallableC20643z4;
import io.sentry.EnumC20048a7;
import io.sentry.EnumC20374i7;
import io.sentry.EnumC20418m;
import io.sentry.EnumC20424m5;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20258b0;
import io.sentry.InterfaceC20259b1;
import io.sentry.InterfaceC20313d6;
import io.sentry.InterfaceC20338g1;
import io.sentry.InterfaceC20390j1;
import io.sentry.InterfaceC20408l1;
import io.sentry.InterfaceC20432n1;
import io.sentry.InterfaceC20455p1;
import io.sentry.InterfaceC20602v0;
import io.sentry.android.core.C20077g0;
import io.sentry.android.core.C20136p0;
import io.sentry.clientreport.EnumC20296d;
import io.sentry.clientreport.InterfaceC20299g;
import io.sentry.config.AbstractC20301a;
import io.sentry.exception.SentryEnvelopeException;
import io.sentry.hints.AbstractC20356c;
import io.sentry.hints.InterfaceC20355b;
import io.sentry.hints.InterfaceC20357d;
import io.sentry.hints.InterfaceC20365l;
import io.sentry.logger.C20417c;
import io.sentry.logger.InterfaceC20415a;
import io.sentry.metrics.C20429c;
import io.sentry.metrics.InterfaceC20427a;
import io.sentry.protocol.C20470c;
import io.sentry.protocol.C20472d;
import io.sentry.protocol.C20473d0;
import io.sentry.protocol.C20482i;
import io.sentry.protocol.C20484j;
import io.sentry.protocol.C20496q;
import io.sentry.protocol.C20499t;
import io.sentry.protocol.C20501v;
import io.sentry.transport.C20567q;
import io.sentry.transport.InterfaceC20557g;
import io.sentry.util.AbstractC20589k;
import io.sentry.util.C20588j;
import j93.InterfaceC21461d;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlinx.serialization.internal.PlatformKt;
import m83.AbstractC25265s;
import np.BinderC27001f;
import np.C27004i;
import np.C27005j;
import np.C27006k;
import p005a3.C0237p;
import p014aj.C0928c;
import p032bc.C2953i;
import p037bu.C3633d;
import p073cq.RunnableC11044m;
import p108e4.AbstractC12667a;
import p213i7.C18194g;
import p343nk.C26780a;
import p389p0.C28539n0;
import p428qk.C30438a;
import p503tp.BinderC34049t;
import p529uo.InterfaceC35105b;
import p581we.C37199o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import to.C33961a;
import to.C33971f;
import to.C33979j;
import to.C33981k;
import to.C34003v;
import vd1.C35909c;
import wc3.InterfaceC37138c;
import yq1.C39711a;

/* JADX INFO: renamed from: cd3.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C4455g implements InterfaceC4456h, InterfaceC20338g1, InterfaceC35105b {

    /* JADX INFO: renamed from: E */
    public Object f17959E;

    /* JADX INFO: renamed from: F */
    public final Object f17960F;

    /* JADX INFO: renamed from: w */
    public boolean f17961w;

    /* JADX INFO: renamed from: x */
    public final Object f17962x;

    /* JADX INFO: renamed from: y */
    public final Object f17963y;

    /* JADX INFO: renamed from: z */
    public Object f17964z;

    public C4455g(Context context, C0928c c0928c) {
        this.f17961w = false;
        this.f17962x = new HashMap();
        this.f17963y = new HashMap();
        this.f17964z = new HashMap();
        this.f17960F = context;
        this.f17959E = c0928c;
    }

    /* JADX INFO: renamed from: x */
    public static ArrayList m13926x(C20337g0 c20337g0) {
        ArrayList arrayList = new ArrayList(c20337g0.f76349b);
        C20040a c20040a = c20337g0.f76351d;
        if (c20040a != null) {
            arrayList.add(c20040a);
        }
        C20040a c20040a2 = c20337g0.f76352e;
        if (c20040a2 != null) {
            arrayList.add(c20040a2);
        }
        C20040a c20040a3 = c20337g0.f76353f;
        if (c20040a3 != null) {
            arrayList.add(c20040a3);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: A */
    public C20321e5 m13927A(C20321e5 c20321e5, C20337g0 c20337g0, List list) {
        C20513q6 c20513q6 = (C20513q6) this.f17962x;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC20258b0 interfaceC20258b0 = (InterfaceC20258b0) it.next();
            try {
                boolean z4 = interfaceC20258b0 instanceof C20077g0;
                boolean zIsInstance = InterfaceC20355b.class.isInstance(c20337g0.m56491b("sentry:typeCheckHint"));
                if (zIsInstance && z4) {
                    c20321e5 = ((C20077g0) interfaceC20258b0).mo55901h(c20321e5, c20337g0);
                } else if (!zIsInstance && !z4) {
                    c20321e5 = interfaceC20258b0.mo55901h(c20321e5, c20337g0);
                }
            } catch (Throwable th3) {
                c20513q6.getLogger().mo16058i(EnumC20436n5.ERROR, th3, "An exception occurred while processing event by processor: %s", interfaceC20258b0.getClass().getName());
            }
            if (c20321e5 == null) {
                c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Event was dropped by a processor: %s", interfaceC20258b0.getClass().getName());
                c20513q6.getClientReportRecorder().mo16051d(EnumC20296d.EVENT_PROCESSOR, EnumC20418m.Error);
                break;
            }
        }
        return c20321e5;
    }

    /* JADX INFO: renamed from: B */
    public C20321e5 m13928B(C20321e5 c20321e5, C20337g0 c20337g0, List list) {
        C20513q6 c20513q6 = (C20513q6) this.f17962x;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC20258b0 interfaceC20258b0 = (InterfaceC20258b0) it.next();
            try {
                c20321e5 = interfaceC20258b0.mo55901h(c20321e5, c20337g0);
            } catch (Throwable th3) {
                c20513q6.getLogger().mo16058i(EnumC20436n5.ERROR, th3, "An exception occurred while processing feedback event by processor: %s", interfaceC20258b0.getClass().getName());
            }
            if (c20321e5 == null) {
                c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Feedback event was dropped by a processor: %s", interfaceC20258b0.getClass().getName());
                c20513q6.getClientReportRecorder().mo16051d(EnumC20296d.EVENT_PROCESSOR, EnumC20418m.Feedback);
                break;
            }
        }
        return c20321e5;
    }

    /* JADX INFO: renamed from: C */
    public C20473d0 m13929C(C20473d0 c20473d0, C20337g0 c20337g0, List list) {
        C20513q6 c20513q6 = (C20513q6) this.f17962x;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC20258b0 interfaceC20258b0 = (InterfaceC20258b0) it.next();
            int size = c20473d0.f76637S.size();
            try {
                c20473d0 = interfaceC20258b0.mo55902i(c20473d0, c20337g0);
            } catch (Throwable th3) {
                c20513q6.getLogger().mo16058i(EnumC20436n5.ERROR, th3, "An exception occurred while processing transaction by processor: %s", interfaceC20258b0.getClass().getName());
            }
            int size2 = c20473d0 == null ? 0 : c20473d0.f76637S.size();
            if (c20473d0 == null) {
                c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Transaction was dropped by a processor: %s", interfaceC20258b0.getClass().getName());
                InterfaceC20299g clientReportRecorder = c20513q6.getClientReportRecorder();
                EnumC20296d enumC20296d = EnumC20296d.EVENT_PROCESSOR;
                clientReportRecorder.mo16051d(enumC20296d, EnumC20418m.Transaction);
                c20513q6.getClientReportRecorder().mo16062k(enumC20296d, EnumC20418m.Span, size + 1);
                break;
            }
            if (size2 < size) {
                int i13 = size - size2;
                c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "%d spans were dropped by a processor: %s", Integer.valueOf(i13), interfaceC20258b0.getClass().getName());
                c20513q6.getClientReportRecorder().mo16062k(EnumC20296d.EVENT_PROCESSOR, EnumC20418m.Span, i13);
            }
        }
        return c20473d0;
    }

    /* JADX INFO: renamed from: D */
    public void m13930D(InterfaceC21461d interfaceC21461d, Function1 function1, boolean z4) {
        HashMap map = (HashMap) this.f17960F;
        Function1 function2 = (Function1) map.get(interfaceC21461d);
        if (function2 == null || function2.equals(function1) || z4) {
            map.put(interfaceC21461d, function1);
            return;
        }
        throw new IllegalArgumentException("Default deserializers provider for " + interfaceC21461d + " is already registered: " + function2);
    }

    /* JADX INFO: renamed from: E */
    public void m13931E(InterfaceC21461d interfaceC21461d, Function1 function1, boolean z4) {
        HashMap map = (HashMap) this.f17964z;
        Function1 function2 = (Function1) map.get(interfaceC21461d);
        if (function2 == null || function2.equals(function1) || z4) {
            map.put(interfaceC21461d, function1);
            return;
        }
        throw new IllegalArgumentException("Default serializers provider for " + interfaceC21461d + " is already registered: " + function2);
    }

    /* JADX INFO: renamed from: F */
    public void m13932F(InterfaceC21461d interfaceC21461d, InterfaceC21461d interfaceC21461d2, InterfaceC37138c interfaceC37138c, boolean z4) {
        Object next;
        InterfaceC21461d interfaceC21461d3;
        String serialName = interfaceC37138c.getDescriptor().getSerialName();
        HashMap map = (HashMap) this.f17963y;
        Object map2 = map.get(interfaceC21461d);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(interfaceC21461d, map2);
        }
        Map map3 = (Map) map2;
        HashMap map4 = (HashMap) this.f17959E;
        Object map5 = map4.get(interfaceC21461d);
        if (map5 == null) {
            map5 = new HashMap();
            map4.put(interfaceC21461d, map5);
        }
        Map map6 = (Map) map5;
        InterfaceC37138c interfaceC37138c2 = (InterfaceC37138c) map3.get(interfaceC21461d2);
        if (interfaceC37138c2 != null && !interfaceC37138c2.equals(interfaceC37138c)) {
            if (!z4) {
                throw new C4453e(interfaceC21461d, interfaceC21461d2);
            }
        }
        InterfaceC37138c interfaceC37138c3 = (InterfaceC37138c) map6.get(serialName);
        if (interfaceC37138c3 != null && !interfaceC37138c3.equals(interfaceC37138c)) {
            Iterator it = ((Iterable) AbstractC25265s.m74145r0(map3.entrySet()).f99158b).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((Map.Entry) next).getValue() != interfaceC37138c3);
            Map.Entry entry = (Map.Entry) next;
            if (entry == null || (interfaceC21461d3 = (InterfaceC21461d) entry.getKey()) == null) {
                throw new IllegalStateException(("Name " + serialName + " is registered in the module but no Kotlin class is associated with it.").toString());
            }
            if (!z4) {
                throw new IllegalArgumentException("Multiple polymorphic serializers in a scope of '" + interfaceC21461d + "' have the same serial name '" + serialName + "': " + interfaceC37138c + " for '" + interfaceC21461d2 + "' and " + interfaceC37138c3 + " for '" + interfaceC21461d3 + '\'');
            }
        }
        map3.put(interfaceC21461d2, interfaceC37138c);
        map6.put(serialName, interfaceC37138c);
    }

    /* JADX INFO: renamed from: G */
    public void m13933G(InterfaceC21461d forClass, AbstractC4451c abstractC4451c, boolean z4) {
        AbstractC4451c abstractC4451c2;
        HashMap map = (HashMap) this.f17962x;
        AbstractC22676k.m65750j(forClass, "forClass");
        if (!z4 && (abstractC4451c2 = (AbstractC4451c) map.get(forClass)) != null && !abstractC4451c2.equals(abstractC4451c)) {
            throw new C4453e("Contextual serializer or serializer provider for " + forClass + " already registered in this module");
        }
        map.put(forClass, abstractC4451c);
        if (PlatformKt.isInterface(forClass)) {
            this.f17961w = true;
        }
    }

    /* JADX INFO: renamed from: H */
    public C20501v m13934H(C5101l0 c5101l0, C20337g0 c20337g0) {
        InterfaceC20557g interfaceC20557g = (InterfaceC20557g) this.f17963y;
        C20513q6 c20513q6 = (C20513q6) this.f17962x;
        c20513q6.getBeforeEnvelopeCallback();
        C20412l5.m56626d().m56629c(c20513q6.getLogger());
        if (c20337g0 == null) {
            interfaceC20557g.getClass();
            interfaceC20557g.mo56677A(c5101l0, new C20337g0());
        } else {
            interfaceC20557g.mo56677A(c5101l0, c20337g0);
        }
        C20501v c20501v = ((C20619w4) c5101l0.f21443x).f77159w;
        return c20501v != null ? c20501v : C20501v.f76802x;
    }

    /* JADX INFO: renamed from: I */
    public void m13935I(C30438a identity, int i13) {
        Set<C26780a> setM74103I1;
        AbstractC22676k.m65750j(identity, "identity");
        AbstractC18489d0.m53382w(i13, "updateType");
        C30438a c30438aM13958y = m13958y();
        ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) this.f17963y;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i14 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i15 = 0; i15 < readHoldCount; i15++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.f17964z = identity;
            if (i13 == 1) {
                this.f17961w = true;
            }
            while (i14 < readHoldCount) {
                lock.lock();
                i14++;
            }
            writeLock.unlock();
            if (identity.equals(c30438aM13958y)) {
                return;
            }
            synchronized (this.f17959E) {
                setM74103I1 = AbstractC25265s.m74103I1((LinkedHashSet) this.f17960F);
            }
            if (i13 != 1) {
                if (!AbstractC22676k.m65745e(identity.f125060a, c30438aM13958y.f125060a)) {
                    ((C28539n0) this.f17962x).m86839k(identity.f125060a);
                }
                if (!AbstractC22676k.m65745e(identity.f125061b, c30438aM13958y.f125061b)) {
                    ((C28539n0) this.f17962x).m86838j(identity.f125061b);
                }
            }
            for (C26780a c26780a : setM74103I1) {
                if (!AbstractC22676k.m65745e(identity.f125060a, c30438aM13958y.f125060a)) {
                    c26780a.f106664a.m692W(identity.f125060a);
                }
                if (!AbstractC22676k.m65745e(identity.f125061b, c30438aM13958y.f125061b)) {
                    c26780a.f106664a.m687R(identity.f125061b);
                }
                C0237p c0237p = c26780a.f106664a;
                AbstractC18489d0.m53382w(i13, "updateType");
                if (i13 == 1) {
                    c0237p.m692W(identity.f125060a);
                    c0237p.m687R(identity.f125061b);
                }
            }
        } catch (Throwable th3) {
            while (i14 < readHoldCount) {
                lock.lock();
                i14++;
            }
            writeLock.unlock();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: J */
    public boolean m13936J(AbstractC20519r4 abstractC20519r4, C20337g0 c20337g0) {
        if (AbstractC17269i.m48899k0(c20337g0)) {
            return true;
        }
        ((C20513q6) this.f17962x).getLogger().mo16066m(EnumC20436n5.DEBUG, "Event was cached so not applying scope: %s", abstractC20519r4.f76883w);
        return false;
    }

    /* JADX INFO: renamed from: K */
    public void m13937K(C4969a c4969a) {
        C34003v c34003v = (C34003v) ((C33971f) this.f17960F).f142423J.get((C33961a) this.f17963y);
        if (c34003v != null) {
            c34003v.m107485k(c4969a);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m13938L(C27005j c27005j, C33981k c33981k, BinderC34049t binderC34049t) {
        BinderC27001f binderC27001f;
        ((C27004i) ((C0928c) this.f17959E).f3421x).m111058c();
        C33979j c33979jM107450a = c33981k.m107450a();
        if (c33979jM107450a == null) {
            binderC27001f = null;
        } else {
            synchronized (((HashMap) this.f17964z)) {
                try {
                    BinderC27001f binderC27001f2 = (BinderC27001f) ((HashMap) this.f17964z).get(c33979jM107450a);
                    if (binderC27001f2 == null) {
                        binderC27001f2 = new BinderC27001f(c33981k);
                    }
                    binderC27001f = binderC27001f2;
                    ((HashMap) this.f17964z).put(c33979jM107450a, binderC27001f);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        BinderC27001f binderC27001f3 = binderC27001f;
        if (binderC27001f3 == null) {
            return;
        }
        ((C0928c) this.f17959E).m2318a0().m80984j0(new C27006k(1, c27005j, null, null, binderC27001f3, binderC34049t));
    }

    /* JADX INFO: renamed from: M */
    public void m13939M() {
        synchronized (((HashMap) this.f17962x)) {
            try {
                Iterator it = ((HashMap) this.f17962x).values().iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                }
                ((HashMap) this.f17962x).clear();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        synchronized (((HashMap) this.f17964z)) {
            try {
                for (BinderC27001f binderC27001f : ((HashMap) this.f17964z).values()) {
                    if (binderC27001f != null) {
                        ((C0928c) this.f17959E).m2318a0().m80984j0(C27006k.m80993f(binderC27001f, null));
                    }
                }
                ((HashMap) this.f17964z).clear();
            } catch (Throwable th4) {
                throw th4;
            }
        }
        synchronized (((HashMap) this.f17963y)) {
            try {
                Iterator it3 = ((HashMap) this.f17963y).values().iterator();
                while (it3.hasNext()) {
                    if (it3.next() != null) {
                        throw new ClassCastException();
                    }
                }
                ((HashMap) this.f17963y).clear();
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    @Override // io.sentry.InterfaceC20338g1
    /* JADX INFO: renamed from: a */
    public void mo13940a(boolean z4) {
        long shutdownTimeoutMillis;
        C20513q6 c20513q6 = (C20513q6) this.f17962x;
        c20513q6.getLogger().mo16066m(EnumC20436n5.INFO, "Closing SentryClient.", new Object[0]);
        if (z4) {
            shutdownTimeoutMillis = 0;
        } else {
            try {
                shutdownTimeoutMillis = c20513q6.getShutdownTimeoutMillis();
            } catch (IOException e5) {
                c20513q6.getLogger().mo16060j(EnumC20436n5.WARNING, "Failed to close the connection to the Sentry Server.", e5);
            }
        }
        mo13943d(shutdownTimeoutMillis);
        ((InterfaceC20415a) this.f17959E).mo852a(z4);
        ((InterfaceC20427a) this.f17960F).mo16002a(z4);
        ((InterfaceC20557g) this.f17963y).mo56678a(z4);
        for (InterfaceC20258b0 interfaceC20258b0 : c20513q6.getEventProcessors()) {
            if (interfaceC20258b0 instanceof Closeable) {
                try {
                    ((Closeable) interfaceC20258b0).close();
                } catch (IOException e13) {
                    c20513q6.getLogger().mo16066m(EnumC20436n5.WARNING, "Failed to close the event processor {}.", interfaceC20258b0, e13);
                }
            }
        }
        this.f17961w = false;
    }

    @Override // p529uo.InterfaceC35105b
    /* JADX INFO: renamed from: b */
    public void mo13941b(C4969a c4969a) {
        ((C33971f) this.f17960F).f142427N.post(new RunnableC11044m(14, this, c4969a));
    }

    @Override // io.sentry.InterfaceC20338g1
    /* JADX INFO: renamed from: c */
    public C20501v mo13942c(C20542s6 c20542s6, InterfaceC20259b1 interfaceC20259b1, C20337g0 c20337g0) {
        C20513q6 c20513q6 = (C20513q6) this.f17962x;
        if (m13936J(c20542s6, c20337g0)) {
            C20496q c20496q = c20542s6.f76886z;
            C20470c c20470c = c20542s6.f76884x;
            if (c20496q == null) {
                c20542s6.f76886z = interfaceC20259b1.mo56198d();
            }
            if (c20542s6.f76876I == null) {
                c20542s6.f76876I = interfaceC20259b1.getUser();
            }
            if (c20542s6.f76872E == null) {
                c20542s6.m56672c(new HashMap(interfaceC20259b1.mo56195a()));
            } else {
                for (Map.Entry entry : interfaceC20259b1.mo56195a().entrySet()) {
                    if (!c20542s6.f76872E.containsKey(entry.getKey())) {
                        c20542s6.f76872E.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            for (Map.Entry entry2 : new C20470c(interfaceC20259b1.mo56215z()).f76618w.entrySet()) {
                if (!c20470c.mo56535a(entry2.getKey())) {
                    c20470c.mo56545k(entry2.getValue(), (String) entry2.getKey());
                }
            }
            InterfaceC20408l1 interfaceC20408l1Mo56200f = interfaceC20259b1.mo56200f();
            if (c20470c.mo56543i() == null) {
                if (interfaceC20408l1Mo56200f == null) {
                    c20470c.mo56556v(C20426m7.m56631b(interfaceC20259b1.mo56185G()));
                } else {
                    c20470c.mo56556v(interfaceC20408l1Mo56200f.mo56462t());
                }
            }
        }
        c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Capturing session replay: %s", c20542s6.f76883w);
        C20501v c20501v = C20501v.f76802x;
        C20501v c20501v2 = c20542s6.f76883w;
        if (c20501v2 != null) {
            c20501v = c20501v2;
        }
        for (InterfaceC20258b0 interfaceC20258b0 : c20513q6.getEventProcessors()) {
            try {
                c20542s6 = interfaceC20258b0.mo56027b(c20542s6, c20337g0);
            } catch (Throwable th3) {
                c20513q6.getLogger().mo16058i(EnumC20436n5.ERROR, th3, "An exception occurred while processing replay event by processor: %s", interfaceC20258b0.getClass().getName());
            }
            if (c20542s6 == null) {
                c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Replay event was dropped by a processor: %s", interfaceC20258b0.getClass().getName());
                c20513q6.getClientReportRecorder().mo16051d(EnumC20296d.EVENT_PROCESSOR, EnumC20418m.Replay);
                break;
            }
        }
        if (c20542s6 != null) {
            c20513q6.getBeforeSendReplay();
        }
        if (c20542s6 == null) {
            return C20501v.f76802x;
        }
        try {
            C5101l0 c5101l0M13957w = m13957w(c20542s6, c20337g0.f76354g, m13959z(interfaceC20259b1, c20337g0, c20542s6, null), InterfaceC20355b.class.isInstance(c20337g0.m56491b("sentry:typeCheckHint")));
            c20337g0.m56490a();
            ((InterfaceC20557g) this.f17963y).mo56677A(c5101l0M13957w, c20337g0);
            return c20501v;
        } catch (IOException e5) {
            c20513q6.getLogger().mo16058i(EnumC20436n5.WARNING, e5, "Capturing event %s failed.", c20501v);
            return C20501v.f76802x;
        }
    }

    @Override // io.sentry.InterfaceC20338g1
    /* JADX INFO: renamed from: d */
    public void mo13943d(long j7) {
        ((InterfaceC20415a) this.f17959E).mo854d(j7);
        ((InterfaceC20427a) this.f17960F).mo16004d(j7);
        ((InterfaceC20557g) this.f17963y).mo56679d(j7);
    }

    @Override // cd3.InterfaceC4456h
    /* JADX INFO: renamed from: e */
    public void mo2321e(InterfaceC21461d interfaceC21461d, Function1 function1) {
        m13931E(interfaceC21461d, function1, false);
    }

    @Override // io.sentry.InterfaceC20338g1
    /* JADX INFO: renamed from: f */
    public C20501v mo13944f(C20473d0 c20473d0, C20405k7 c20405k7, InterfaceC20259b1 interfaceC20259b1, C20337g0 c20337g0, C20539s3 c20539s3) {
        C20513q6 c20513q6 = (C20513q6) this.f17962x;
        C20337g0 c20337g1 = c20337g0 == null ? new C20337g0() : c20337g0;
        if (m13936J(c20473d0, c20337g1)) {
            c20337g1.f76349b.addAll(interfaceC20259b1.mo56189K());
        }
        c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Capturing transaction: %s", c20473d0.f76883w);
        List<C20316e0> ignoredTransactions = c20513q6.getIgnoredTransactions();
        String str = c20473d0.f76634P;
        if (str != null && ignoredTransactions != null && !ignoredTransactions.isEmpty()) {
            Iterator<C20316e0> it = ignoredTransactions.iterator();
            while (it.hasNext()) {
                if (it.next().m56471a().equalsIgnoreCase(str)) {
                    c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Transaction was dropped as transaction name %s is ignored", c20473d0.f76634P);
                    InterfaceC20299g clientReportRecorder = c20513q6.getClientReportRecorder();
                    EnumC20296d enumC20296d = EnumC20296d.EVENT_PROCESSOR;
                    clientReportRecorder.mo16051d(enumC20296d, EnumC20418m.Transaction);
                    c20513q6.getClientReportRecorder().mo16062k(enumC20296d, EnumC20418m.Span, c20473d0.f76637S.size() + 1);
                    return C20501v.f76802x;
                }
            }
            Iterator<C20316e0> it3 = ignoredTransactions.iterator();
            while (it3.hasNext()) {
                if (it3.next().m56472b(str)) {
                    c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Transaction was dropped as transaction name %s is ignored", c20473d0.f76634P);
                    InterfaceC20299g clientReportRecorder2 = c20513q6.getClientReportRecorder();
                    EnumC20296d enumC20296d2 = EnumC20296d.EVENT_PROCESSOR;
                    clientReportRecorder2.mo16051d(enumC20296d2, EnumC20418m.Transaction);
                    c20513q6.getClientReportRecorder().mo16062k(enumC20296d2, EnumC20418m.Span, c20473d0.f76637S.size() + 1);
                    return C20501v.f76802x;
                }
            }
        }
        C20501v c20501v = C20501v.f76802x;
        C20501v c20501v2 = c20473d0.f76883w;
        if (c20501v2 == null) {
            c20501v2 = c20501v;
        }
        if (m13936J(c20473d0, c20337g1)) {
            m13950m(c20473d0, interfaceC20259b1);
            c20473d0 = m13929C(c20473d0, c20337g1, interfaceC20259b1.mo56194P());
            if (c20473d0 == null) {
                c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Transaction was dropped by applyScope", new Object[0]);
            }
        }
        if (c20473d0 != null) {
            c20473d0 = m13929C(c20473d0, c20337g1, c20513q6.getEventProcessors());
        }
        C20473d0 c20473d1 = c20473d0;
        if (c20473d1 == null) {
            c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Transaction was dropped by Event processors.", new Object[0]);
            return c20501v;
        }
        ArrayList arrayList = c20473d1.f76637S;
        int size = arrayList.size();
        c20513q6.getBeforeSendTransaction();
        int size2 = arrayList.size();
        if (size2 < size) {
            int i13 = size - size2;
            c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "%d spans were dropped by beforeSendTransaction.", Integer.valueOf(i13));
            c20513q6.getClientReportRecorder().mo16062k(EnumC20296d.BEFORE_SEND, EnumC20418m.Span, i13);
        }
        try {
            ArrayList arrayListM13926x = m13926x(c20337g1);
            ArrayList arrayList2 = new ArrayList();
            Iterator it4 = arrayListM13926x.iterator();
            while (it4.hasNext()) {
                ((C20040a) it4.next()).getClass();
            }
            C5101l0 c5101l0M13954t = m13954t(c20473d1, arrayList2, null, c20405k7, c20539s3);
            c20337g1.m56490a();
            return c5101l0M13954t != null ? m13934H(c5101l0M13954t, c20337g1) : c20501v2;
        } catch (SentryEnvelopeException | IOException e5) {
            c20513q6.getLogger().mo16058i(EnumC20436n5.WARNING, e5, "Capturing transaction %s failed.", c20501v2);
            return C20501v.f76802x;
        }
    }

    @Override // io.sentry.InterfaceC20338g1
    /* JADX INFO: renamed from: g */
    public boolean mo13945g() {
        return ((InterfaceC20557g) this.f17963y).mo56680g();
    }

    @Override // io.sentry.InterfaceC20338g1
    /* JADX INFO: renamed from: h */
    public C20501v mo13946h(C20484j c20484j, InterfaceC20259b1 interfaceC20259b1) {
        C20513q6 c20513q6 = (C20513q6) this.f17962x;
        C20321e5 c20321e5 = new C20321e5();
        C20470c c20470c = c20321e5.f76884x;
        c20470c.mo56545k(c20484j, "feedback");
        C20337g0 c20337g0 = new C20337g0();
        if (c20484j.f76695F == null) {
            c20484j.f76695F = interfaceC20259b1.mo56179A();
        }
        c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Capturing feedback: %s", c20321e5.f76883w);
        if (m13936J(c20321e5, c20337g0)) {
            if (c20321e5.f76876I == null) {
                c20321e5.f76876I = interfaceC20259b1.getUser();
            }
            if (c20321e5.f76872E == null) {
                c20321e5.m56672c(new HashMap(interfaceC20259b1.mo56195a()));
            } else {
                for (Map.Entry entry : interfaceC20259b1.mo56195a().entrySet()) {
                    if (!c20321e5.f76872E.containsKey(entry.getKey())) {
                        c20321e5.f76872E.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            for (Map.Entry entry2 : new C20470c(interfaceC20259b1.mo56215z()).f76618w.entrySet()) {
                if (!c20470c.mo56535a(entry2.getKey())) {
                    c20470c.mo56545k(entry2.getValue(), (String) entry2.getKey());
                }
            }
            InterfaceC20408l1 interfaceC20408l1Mo56200f = interfaceC20259b1.mo56200f();
            if (c20470c.mo56543i() == null) {
                if (interfaceC20408l1Mo56200f == null) {
                    c20470c.mo56556v(C20426m7.m56631b(interfaceC20259b1.mo56185G()));
                } else {
                    c20470c.mo56556v(interfaceC20408l1Mo56200f.mo56462t());
                }
            }
            c20321e5 = m13928B(c20321e5, c20337g0, interfaceC20259b1.mo56194P());
            if (c20321e5 == null) {
                c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Feedback was dropped by applyScope", new Object[0]);
                return C20501v.f76802x;
            }
        }
        C20321e5 c20321e5M13928B = m13928B(c20321e5, c20337g0, c20513q6.getEventProcessors());
        if (c20321e5M13928B != null) {
            InterfaceC20313d6 beforeSendFeedback = c20513q6.getBeforeSendFeedback();
            if (beforeSendFeedback != null) {
                try {
                    c20321e5M13928B = C39711a.m127085g((C39711a) ((C35909c) beforeSendFeedback).f152881x, c20321e5M13928B, c20337g0);
                } catch (Throwable th3) {
                    c20513q6.getLogger().mo16060j(EnumC20436n5.ERROR, "The BeforeSendFeedback callback threw an exception.", th3);
                    c20321e5M13928B = null;
                }
            }
            if (c20321e5M13928B == null) {
                c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Event was dropped by beforeSend", new Object[0]);
                c20513q6.getClientReportRecorder().mo16051d(EnumC20296d.BEFORE_SEND, EnumC20418m.Feedback);
            }
        }
        C20321e5 c20321e6 = c20321e5M13928B;
        if (c20321e6 == null) {
            return C20501v.f76802x;
        }
        C20501v c20501v = C20501v.f76802x;
        C20501v c20501v2 = c20321e6.f76883w;
        if (c20501v2 == null) {
            c20501v2 = c20501v;
        }
        if (c20484j.f76694E == null) {
            c20513q6.getReplayController().mo56098i(Boolean.FALSE);
            C20501v c20501vMo56208s = interfaceC20259b1.mo56208s();
            if (!c20501vMo56208s.equals(c20501v)) {
                c20484j.f76694E = c20501vMo56208s;
            }
        }
        try {
            try {
                C5101l0 c5101l0M13954t = m13954t(c20321e6, m13926x(c20337g0), null, m13959z(interfaceC20259b1, c20337g0, c20321e6, c20321e6.f76306V), null);
                c20337g0.m56490a();
                return c5101l0M13954t != null ? m13934H(c5101l0M13954t, c20337g0) : c20501v2;
            } catch (SentryEnvelopeException e5) {
                e = e5;
                c20513q6.getLogger().mo16058i(EnumC20436n5.WARNING, e, "Capturing feedback %s failed.", c20501v2);
                return C20501v.f76802x;
            } catch (IOException e13) {
                e = e13;
                c20513q6.getLogger().mo16058i(EnumC20436n5.WARNING, e, "Capturing feedback %s failed.", c20501v2);
                return C20501v.f76802x;
            }
        } catch (SentryEnvelopeException | IOException e14) {
            e = e14;
        }
    }

    @Override // io.sentry.InterfaceC20338g1
    /* JADX INFO: renamed from: i */
    public void mo13947i(C20265b7 c20265b7, C20337g0 c20337g0) {
        C20513q6 c20513q6 = (C20513q6) this.f17962x;
        AbstractC29125c.m88510S(c20265b7, "Session is required.");
        String str = c20265b7.f76098M;
        if (str == null || str.isEmpty()) {
            c20513q6.getLogger().mo16066m(EnumC20436n5.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
            return;
        }
        try {
            InterfaceC20390j1 serializer = c20513q6.getSerializer();
            C20499t sdkVersion = c20513q6.getSdkVersion();
            AbstractC29125c.m88510S(serializer, "Serializer is required.");
            mo13952q(new C5101l0((C20501v) null, sdkVersion, C20275c5.m56244d(serializer, c20265b7)), c20337g0);
        } catch (IOException e5) {
            c20513q6.getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to capture session.", e5);
        }
    }

    @Override // io.sentry.InterfaceC20338g1
    public boolean isEnabled() {
        return this.f17961w;
    }

    @Override // io.sentry.InterfaceC20338g1
    /* JADX INFO: renamed from: j */
    public C20567q mo13948j() {
        return ((InterfaceC20557g) this.f17963y).mo56681j();
    }

    @Override // cd3.InterfaceC4456h
    /* JADX INFO: renamed from: k */
    public void mo2325k(InterfaceC21461d kClass, InterfaceC37138c serializer) {
        AbstractC22676k.m65750j(kClass, "kClass");
        AbstractC22676k.m65750j(serializer, "serializer");
        m13933G(kClass, new C4449a(serializer), false);
    }

    /* JADX WARN: Code duplicated, block: B:167:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:168:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:92:0x01da  */
    @Override // io.sentry.InterfaceC20338g1
    /* JADX INFO: renamed from: l */
    public C20501v mo13949l(C20321e5 c20321e5, InterfaceC20259b1 interfaceC20259b1, C20337g0 c20337g0) {
        C20265b7 c20265b7Mo56212w;
        C20265b7 c20265b7;
        C20321e5 c20321e6;
        boolean z4;
        C20501v c20501vM13934H;
        String str;
        Throwable th3;
        InterfaceC20432n1 interfaceC20432n1Mo56203m;
        Object objM56491b;
        C20482i c20482iMo56207r;
        C20513q6 c20513q6 = (C20513q6) this.f17962x;
        AbstractC29125c.m88510S(c20321e5, "SentryEvent is required.");
        if (c20337g0 == null) {
            c20337g0 = new C20337g0();
        }
        if (m13936J(c20321e5, c20337g0) && interfaceC20259b1 != null) {
            c20337g0.f76349b.addAll(interfaceC20259b1.mo56189K());
        }
        InterfaceC20602v0 logger = c20513q6.getLogger();
        EnumC20436n5 enumC20436n5 = EnumC20436n5.DEBUG;
        logger.mo16066m(enumC20436n5, "Capturing event: %s", c20321e5.f76883w);
        Throwable thM56670a = c20321e5.m56670a();
        if (thM56670a != null && c20513q6.getIgnoredExceptionsForType().contains(thM56670a.getClass())) {
            c20513q6.getLogger().mo16066m(enumC20436n5, "Event was dropped as the exception %s is ignored", thM56670a.getClass());
            c20513q6.getClientReportRecorder().mo16051d(EnumC20296d.EVENT_PROCESSOR, EnumC20418m.Error);
            return C20501v.f76802x;
        }
        if (AbstractC12667a.m35433D(c20513q6.getIgnoredErrors(), c20321e5)) {
            c20513q6.getLogger().mo16066m(enumC20436n5, "Event was dropped as it matched a string/pattern in ignoredErrors", c20321e5.f76301Q);
            c20513q6.getClientReportRecorder().mo16051d(EnumC20296d.EVENT_PROCESSOR, EnumC20418m.Error);
            return C20501v.f76802x;
        }
        if (m13936J(c20321e5, c20337g0)) {
            if (interfaceC20259b1 != null) {
                m13950m(c20321e5, interfaceC20259b1);
                String str2 = c20321e5.f76306V;
                C20470c c20470c = c20321e5.f76884x;
                if (str2 == null) {
                    c20321e5.f76306V = interfaceC20259b1.mo56182D();
                }
                if (c20321e5.f76307W == null) {
                    List listMo56181C = interfaceC20259b1.mo56181C();
                    c20321e5.f76307W = listMo56181C != null ? new ArrayList(listMo56181C) : null;
                }
                if (interfaceC20259b1.getLevel() != null) {
                    c20321e5.f76305U = interfaceC20259b1.getLevel();
                }
                InterfaceC20408l1 interfaceC20408l1Mo56200f = interfaceC20259b1.mo56200f();
                if (c20470c.mo56543i() == null) {
                    if (interfaceC20408l1Mo56200f == null) {
                        c20470c.mo56556v(C20426m7.m56631b(interfaceC20259b1.mo56185G()));
                    } else {
                        c20470c.mo56556v(interfaceC20408l1Mo56200f.mo56462t());
                    }
                }
                if (c20470c.mo56540f() == null && (c20482iMo56207r = interfaceC20259b1.mo56207r()) != null) {
                    c20470c.mo56550p(c20482iMo56207r);
                }
                c20321e5 = m13927A(c20321e5, c20337g0, interfaceC20259b1.mo56194P());
            }
            if (c20321e5 == null) {
                c20513q6.getLogger().mo16066m(enumC20436n5, "Event was dropped by applyScope", new Object[0]);
                return C20501v.f76802x;
            }
        }
        C20321e5 c20321e5M13927A = m13927A(c20321e5, c20337g0, c20513q6.getEventProcessors());
        if (c20321e5M13927A != null) {
            InterfaceC20313d6 beforeSend = c20513q6.getBeforeSend();
            if (beforeSend != null) {
                try {
                    c20321e5M13927A = C39711a.m127085g((C39711a) ((C35909c) beforeSend).f152881x, c20321e5M13927A, c20337g0);
                } catch (Throwable th4) {
                    c20513q6.getLogger().mo16060j(EnumC20436n5.ERROR, "The BeforeSend callback threw an exception. It will be added as breadcrumb and continue.", th4);
                    c20321e5M13927A = null;
                }
            }
            if (c20321e5M13927A == null) {
                c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Event was dropped by beforeSend", new Object[0]);
                c20513q6.getClientReportRecorder().mo16051d(EnumC20296d.BEFORE_SEND, EnumC20418m.Error);
            }
        }
        if (c20321e5M13927A != null) {
            AbstractC20301a.m56316O(c20321e5M13927A, c20513q6);
        }
        if (c20321e5M13927A == null) {
            return C20501v.f76802x;
        }
        C20265b7 c20265b7Mo56212w2 = interfaceC20259b1 != null ? interfaceC20259b1.mo56212w(new C18194g(15)) : null;
        if (c20265b7Mo56212w2 == null || c20265b7Mo56212w2.f76092G == EnumC20048a7.Ok) {
            if (!AbstractC17269i.m48899k0(c20337g0)) {
                c20265b7Mo56212w = null;
            } else if (interfaceC20259b1 != null) {
                c20265b7Mo56212w = interfaceC20259b1.mo56212w(new C2953i(this, c20321e5M13927A, c20337g0, 6));
            } else {
                c20513q6.getLogger().mo16066m(EnumC20436n5.INFO, "Scope is null on client.captureEvent", new Object[0]);
                c20265b7Mo56212w = null;
            }
            c20265b7 = c20265b7Mo56212w;
        } else {
            c20265b7 = null;
        }
        C20588j c20588jM56722a = c20513q6.getSampleRate() == null ? null : AbstractC20589k.m56722a();
        if (c20513q6.getSampleRate() == null || c20588jM56722a == null || c20513q6.getSampleRate().doubleValue() >= c20588jM56722a.m56721c()) {
            c20321e6 = c20321e5M13927A;
        } else {
            c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Event %s was dropped due to sampling decision.", c20321e5M13927A.f76883w);
            c20513q6.getClientReportRecorder().mo16051d(EnumC20296d.SAMPLE_RATE, EnumC20418m.Error);
            c20321e6 = null;
        }
        if (c20265b7 != null) {
            if (c20265b7Mo56212w2 != null) {
                EnumC20048a7 enumC20048a7 = c20265b7.f76092G;
                EnumC20048a7 enumC20048a8 = EnumC20048a7.Crashed;
                if ((enumC20048a7 != enumC20048a8 || c20265b7Mo56212w2.f76092G == enumC20048a8) && (c20265b7.f76104y.get() <= 0 || c20265b7Mo56212w2.f76104y.get() > 0)) {
                    z4 = false;
                }
            }
            z4 = true;
        } else {
            z4 = false;
        }
        if (c20321e6 == null && !z4) {
            c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Not sending session update for dropped event as it did not cause the session health to change.", new Object[0]);
            return C20501v.f76802x;
        }
        C20501v c20501v = C20501v.f76802x;
        if (c20321e6 == null || (c20501vM13934H = c20321e6.f76883w) == null) {
            c20501vM13934H = c20501v;
        }
        boolean zIsInstance = InterfaceC20355b.class.isInstance(c20337g0.m56491b("sentry:typeCheckHint"));
        boolean z13 = InterfaceC20357d.class.isInstance(c20337g0.m56491b("sentry:typeCheckHint")) && !C20136p0.class.isInstance(c20337g0.m56491b("sentry:typeCheckHint"));
        if (c20321e6 != null && !zIsInstance && !z13 && (c20321e6.m56483g() || c20321e6.m56482f() != null)) {
            c20513q6.getSessionReplay().getClass();
            c20513q6.getReplayController().mo56098i(Boolean.valueOf(c20321e6.m56482f() != null));
        }
        if (c20321e6 != null) {
            try {
                str = c20321e6.f76306V;
            } catch (SentryEnvelopeException | IOException e5) {
                th3 = e5;
                c20513q6.getLogger().mo16058i(EnumC20436n5.WARNING, th3, "Capturing event %s failed.", c20501vM13934H);
                c20501vM13934H = C20501v.f76802x;
                if (interfaceC20259b1 != null) {
                    objM56491b = c20337g0.m56491b("sentry:typeCheckHint");
                    if (objM56491b instanceof AbstractC20356c) {
                        ((AbstractC20356c) objM56491b).mo56064g(interfaceC20432n1Mo56203m.mo56512h());
                        interfaceC20432n1Mo56203m.mo56511f(EnumC20374i7.ABORTED, false, c20337g0);
                    } else {
                        interfaceC20432n1Mo56203m.mo56511f(EnumC20374i7.ABORTED, false, null);
                    }
                }
                return c20501vM13934H;
            }
        } else {
            str = null;
        }
        try {
            try {
                C5101l0 c5101l0M13954t = m13954t(c20321e6, c20321e6 != null ? m13926x(c20337g0) : null, c20265b7, m13959z(interfaceC20259b1, c20337g0, c20321e6, str), null);
                c20337g0.m56490a();
                if (c5101l0M13954t != null) {
                    c20501vM13934H = m13934H(c5101l0M13954t, c20337g0);
                }
            } catch (SentryEnvelopeException e13) {
                e = e13;
                th3 = e;
                c20513q6.getLogger().mo16058i(EnumC20436n5.WARNING, th3, "Capturing event %s failed.", c20501vM13934H);
                c20501vM13934H = C20501v.f76802x;
            } catch (IOException e14) {
                e = e14;
                th3 = e;
                c20513q6.getLogger().mo16058i(EnumC20436n5.WARNING, th3, "Capturing event %s failed.", c20501vM13934H);
                c20501vM13934H = C20501v.f76802x;
            }
        } catch (SentryEnvelopeException | IOException e15) {
            e = e15;
        }
        if (interfaceC20259b1 != null && (interfaceC20432n1Mo56203m = interfaceC20259b1.mo56203m()) != null && InterfaceC20365l.class.isInstance(c20337g0.m56491b("sentry:typeCheckHint"))) {
            objM56491b = c20337g0.m56491b("sentry:typeCheckHint");
            if (objM56491b instanceof AbstractC20356c) {
                ((AbstractC20356c) objM56491b).mo56064g(interfaceC20432n1Mo56203m.mo56512h());
                interfaceC20432n1Mo56203m.mo56511f(EnumC20374i7.ABORTED, false, c20337g0);
            } else {
                interfaceC20432n1Mo56203m.mo56511f(EnumC20374i7.ABORTED, false, null);
            }
        }
        return c20501vM13934H;
    }

    /* JADX INFO: renamed from: m */
    public void m13950m(AbstractC20519r4 abstractC20519r4, InterfaceC20259b1 interfaceC20259b1) {
        if (interfaceC20259b1 != null) {
            if (abstractC20519r4.f76886z == null) {
                abstractC20519r4.f76886z = interfaceC20259b1.mo56198d();
            }
            if (abstractC20519r4.f76876I == null) {
                abstractC20519r4.f76876I = interfaceC20259b1.getUser();
            }
            if (abstractC20519r4.f76872E == null) {
                abstractC20519r4.m56672c(new HashMap(interfaceC20259b1.mo56195a()));
            } else {
                for (Map.Entry entry : interfaceC20259b1.mo56195a().entrySet()) {
                    if (!abstractC20519r4.f76872E.containsKey(entry.getKey())) {
                        abstractC20519r4.f76872E.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            if (abstractC20519r4.f76880M == null) {
                abstractC20519r4.f76880M = new ArrayList(new ArrayList(interfaceC20259b1.mo56211v()));
            } else {
                Queue queueMo56211v = interfaceC20259b1.mo56211v();
                List list = abstractC20519r4.f76880M;
                if (list != null && !queueMo56211v.isEmpty()) {
                    list.addAll(queueMo56211v);
                    Collections.sort(list, (C20540s4) this.f17964z);
                }
            }
            if (abstractC20519r4.f76882O == null) {
                abstractC20519r4.f76882O = new HashMap(new HashMap(interfaceC20259b1.getExtras()));
            } else {
                for (Map.Entry entry2 : interfaceC20259b1.getExtras().entrySet()) {
                    if (!abstractC20519r4.f76882O.containsKey(entry2.getKey())) {
                        abstractC20519r4.f76882O.put((String) entry2.getKey(), entry2.getValue());
                    }
                }
            }
            C20470c c20470c = abstractC20519r4.f76884x;
            for (Map.Entry entry3 : new C20470c(interfaceC20259b1.mo56215z()).f76618w.entrySet()) {
                if (!c20470c.mo56535a(entry3.getKey())) {
                    c20470c.mo56545k(entry3.getValue(), (String) entry3.getKey());
                }
            }
        }
    }

    @Override // io.sentry.InterfaceC20338g1
    /* JADX INFO: renamed from: n */
    public C20501v mo13951n(C20457p3 c20457p3) {
        AbstractC29125c.m88510S(c20457p3, "profileChunk is required.");
        C20513q6 c20513q6 = (C20513q6) this.f17962x;
        c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Capturing profile chunk: %s", c20457p3.f76568y);
        C20501v c20501v = c20457p3.f76568y;
        C20472d c20472dM56654a = C20472d.m56654a(c20457p3.f76566w, c20513q6);
        if (c20472dM56654a != null) {
            c20457p3.f76566w = c20472dM56654a;
        }
        try {
            return m13934H(new C5101l0(new C20619w4(c20501v, c20513q6.getSdkVersion(), null), Collections.singletonList(C20275c5.m56243c(c20457p3, c20513q6.getSerializer(), c20513q6.getProfilerConverter()))), null);
        } catch (SentryEnvelopeException | IOException e5) {
            c20513q6.getLogger().mo16058i(EnumC20436n5.WARNING, e5, "Capturing profile chunk %s failed.", c20501v);
            return C20501v.f76802x;
        }
    }

    @Override // cd3.InterfaceC4456h
    /* JADX INFO: renamed from: o */
    public void mo2326o(InterfaceC21461d kClass, Function1 function1) {
        AbstractC22676k.m65750j(kClass, "kClass");
        m13933G(kClass, new C4450b(function1), false);
    }

    @Override // cd3.InterfaceC4456h
    /* JADX INFO: renamed from: p */
    public void mo2327p(InterfaceC21461d interfaceC21461d, Function1 function1) {
        m13930D(interfaceC21461d, function1, false);
    }

    @Override // io.sentry.InterfaceC20338g1
    /* JADX INFO: renamed from: q */
    public C20501v mo13952q(C5101l0 c5101l0, C20337g0 c20337g0) {
        try {
            c20337g0.m56490a();
            return m13934H(c5101l0, c20337g0);
        } catch (IOException e5) {
            ((C20513q6) this.f17962x).getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to capture envelope.", e5);
            return C20501v.f76802x;
        }
    }

    /* JADX INFO: renamed from: r */
    public C4452d m13953r() {
        return new C4452d((HashMap) this.f17962x, (HashMap) this.f17963y, (HashMap) this.f17964z, (HashMap) this.f17959E, (HashMap) this.f17960F, this.f17961w);
    }

    @Override // cd3.InterfaceC4456h
    /* JADX INFO: renamed from: s */
    public void mo2330s(InterfaceC21461d interfaceC21461d, InterfaceC21461d interfaceC21461d2, InterfaceC37138c interfaceC37138c) {
        m13932F(interfaceC21461d, interfaceC21461d2, interfaceC37138c, false);
    }

    /* JADX INFO: renamed from: t */
    public C5101l0 m13954t(AbstractC20519r4 abstractC20519r4, ArrayList arrayList, C20265b7 c20265b7, C20405k7 c20405k7, C20539s3 c20539s3) {
        C20501v c20501v;
        C20513q6 c20513q6 = (C20513q6) this.f17962x;
        ArrayList arrayList2 = new ArrayList();
        if (abstractC20519r4 != null) {
            InterfaceC20390j1 serializer = c20513q6.getSerializer();
            Charset charset = C20275c5.f76146d;
            AbstractC29125c.m88510S(serializer, "ISerializer is required.");
            int i13 = 1;
            C37199o c37199o = new C37199o(new CallableC5351m1(i13, serializer, abstractC20519r4));
            arrayList2.add(new C20275c5(new C20312d5(EnumC20424m5.resolve(abstractC20519r4), new CallableC20643z4(c37199o, 0), "application/json", null, null), new CallableC20643z4(c37199o, i13)));
            c20501v = abstractC20519r4.f76883w;
        } else {
            c20501v = null;
        }
        if (c20265b7 != null) {
            arrayList2.add(C20275c5.m56244d(c20513q6.getSerializer(), c20265b7));
        }
        if (c20539s3 != null) {
            long maxTraceFileSize = c20513q6.getMaxTraceFileSize();
            InterfaceC20390j1 serializer2 = c20513q6.getSerializer();
            Charset charset2 = C20275c5.f76146d;
            File file = c20539s3.f76980w;
            C37199o c37199o2 = new C37199o(new CallableC20635y4(file, maxTraceFileSize, c20539s3, serializer2));
            arrayList2.add(new C20275c5(new C20312d5(EnumC20424m5.Profile, new CallableC20627x4(c37199o2, 4), "application-json", file.getName(), null), new CallableC20627x4(c37199o2, 5)));
            if (c20501v == null) {
                c20501v = new C20501v(c20539s3.f76973W);
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C20040a c20040a = (C20040a) it.next();
                InterfaceC20390j1 serializer3 = c20513q6.getSerializer();
                InterfaceC20602v0 logger = c20513q6.getLogger();
                long maxAttachmentSize = c20513q6.getMaxAttachmentSize();
                Charset charset3 = C20275c5.f76146d;
                C37199o c37199o3 = new C37199o(new CallableC20635y4(c20040a, maxAttachmentSize, serializer3, logger));
                arrayList2.add(new C20275c5(new C20312d5(EnumC20424m5.Attachment, new CallableC20627x4(c37199o3, 2), c20040a.m55884e(), c20040a.m55885f(), c20040a.m55883d()), new CallableC20627x4(c37199o3, 3)));
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new C5101l0(new C20619w4(c20501v, c20513q6.getSdkVersion(), c20405k7), arrayList2);
    }

    /* JADX INFO: renamed from: u */
    public C5101l0 m13955u(C20541s5 c20541s5) {
        ArrayList arrayList = new ArrayList();
        C20513q6 c20513q6 = (C20513q6) this.f17962x;
        InterfaceC20390j1 serializer = c20513q6.getSerializer();
        Charset charset = C20275c5.f76146d;
        AbstractC29125c.m88510S(serializer, "ISerializer is required.");
        C37199o c37199o = new C37199o(new CallableC5355n1(4, serializer, c20541s5));
        arrayList.add(new C20275c5(new C20312d5(EnumC20424m5.Log, new CallableC20627x4(c37199o, 0), "application/vnd.sentry.items.log+json", (String) null, (String) null, (String) null, Integer.valueOf(c20541s5.f76984w.size())), new CallableC20627x4(c37199o, 1)));
        return new C5101l0(new C20619w4(null, c20513q6.getSdkVersion(), null), arrayList);
    }

    /* JADX INFO: renamed from: v */
    public C5101l0 m13956v(C20620w5 c20620w5) {
        ArrayList arrayList = new ArrayList();
        C20513q6 c20513q6 = (C20513q6) this.f17962x;
        InterfaceC20390j1 serializer = c20513q6.getSerializer();
        Charset charset = C20275c5.f76146d;
        AbstractC29125c.m88510S(serializer, "ISerializer is required.");
        C37199o c37199o = new C37199o(new CallableC5355n1(2, serializer, c20620w5));
        arrayList.add(new C20275c5(new C20312d5(EnumC20424m5.TraceMetric, new CallableC20627x4(c37199o, 6), "application/vnd.sentry.items.trace-metric+json", (String) null, (String) null, (String) null, Integer.valueOf(c20620w5.f77163w.size())), new CallableC20627x4(c37199o, 11)));
        return new C5101l0(new C20619w4(null, c20513q6.getSdkVersion(), null), arrayList);
    }

    /* JADX INFO: renamed from: w */
    public C5101l0 m13957w(final C20542s6 c20542s6, final C20626x3 c20626x3, C20405k7 c20405k7, final boolean z4) {
        ArrayList arrayList = new ArrayList();
        C20513q6 c20513q6 = (C20513q6) this.f17962x;
        final InterfaceC20390j1 serializer = c20513q6.getSerializer();
        final InterfaceC20602v0 logger = c20513q6.getLogger();
        Charset charset = C20275c5.f76146d;
        final File file = c20542s6.f76986P;
        C37199o c37199o = new C37199o(new Callable() { // from class: io.sentry.a5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC20390j1 interfaceC20390j1 = serializer;
                C20542s6 c20542s7 = c20542s6;
                File file2 = file;
                InterfaceC20602v0 interfaceC20602v0 = logger;
                boolean z13 = z4;
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, C20275c5.f76146d));
                        try {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            interfaceC20390j1.mo56235a(bufferedWriter, c20542s7);
                            linkedHashMap.put(EnumC20424m5.ReplayEvent.getItemType(), byteArrayOutputStream.toByteArray());
                            byteArrayOutputStream.reset();
                            C20626x3 c20626x4 = c20626x3;
                            if (c20626x4 != null) {
                                interfaceC20390j1.mo56235a(bufferedWriter, c20626x4);
                                linkedHashMap.put(EnumC20424m5.ReplayRecording.getItemType(), byteArrayOutputStream.toByteArray());
                                byteArrayOutputStream.reset();
                            }
                            if (file2 != null && file2.exists()) {
                                byte[] bArrM44435O = AbstractC15751g.m44435O(AttachmentConstants.MAX_SIZE_BEFORE_DOWNLOAD_WARNING_IN_BYTES, file2.getPath());
                                if (bArrM44435O.length > 0) {
                                    linkedHashMap.put(EnumC20424m5.ReplayVideo.getItemType(), bArrM44435O);
                                }
                            }
                            byte[] bArrM56245j = C20275c5.m56245j(linkedHashMap);
                            bufferedWriter.close();
                            byteArrayOutputStream.close();
                            if (file2 != null) {
                                if (z13) {
                                    AbstractC15751g.m44465r(file2.getParentFile());
                                    return bArrM56245j;
                                }
                                file2.delete();
                            }
                            return bArrM56245j;
                        } catch (Throwable th3) {
                            try {
                                bufferedWriter.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                } catch (Throwable th7) {
                    try {
                        interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Could not serialize replay recording", th7);
                        return null;
                    } finally {
                        if (file2 != null) {
                            if (z13) {
                                AbstractC15751g.m44465r(file2.getParentFile());
                            } else {
                                file2.delete();
                            }
                        }
                    }
                }
            }
        });
        arrayList.add(new C20275c5(new C20312d5(EnumC20424m5.ReplayVideo, new CallableC20627x4(c37199o, 9), null, null, null), new CallableC20627x4(c37199o, 10)));
        return new C5101l0(new C20619w4(c20542s6.f76883w, c20513q6.getSessionReplay().f77071m, c20405k7), arrayList);
    }

    /* JADX INFO: renamed from: y */
    public C30438a m13958y() {
        ReentrantReadWriteLock.ReadLock lock = ((ReentrantReadWriteLock) this.f17963y).readLock();
        lock.lock();
        try {
            return (C30438a) this.f17964z;
        } finally {
            lock.unlock();
        }
    }

    /* JADX INFO: renamed from: z */
    public C20405k7 m13959z(InterfaceC20259b1 interfaceC20259b1, C20337g0 c20337g0, AbstractC20519r4 abstractC20519r4, String str) {
        C20513q6 c20513q6 = (C20513q6) this.f17962x;
        if (InterfaceC20355b.class.isInstance(c20337g0.m56491b("sentry:typeCheckHint"))) {
            if (abstractC20519r4 != null) {
                C20269c c20269c = new C20269c(c20513q6.getLogger());
                C20470c c20470c = abstractC20519r4.f76884x;
                C20323e7 c20323e7Mo56543i = c20470c.mo56543i();
                c20269c.m56227c("sentry-trace_id", c20323e7Mo56543i != null ? c20323e7Mo56543i.f76321w.toString() : null);
                c20269c.m56227c("sentry-public_key", c20513q6.retrieveParsedDsn().f77182b);
                c20269c.m56227c("sentry-release", abstractC20519r4.f76873F);
                c20269c.m56227c("sentry-environment", abstractC20519r4.f76874G);
                c20269c.m56227c("sentry-org_id", c20513q6.getEffectiveOrgId());
                c20269c.m56227c("sentry-transaction", str);
                if (c20269c.f76118f) {
                    c20269c.f76115c = null;
                }
                c20269c.m56227c("sentry-sampled", null);
                if (c20269c.f76118f) {
                    c20269c.f76116d = null;
                }
                Object objMo56537c = c20470c.mo56537c("replay_id");
                if (objMo56537c != null && !objMo56537c.toString().equals(C20501v.f76802x.toString())) {
                    c20269c.m56227c("sentry-replay_id", objMo56537c.toString());
                    c20470c.f76618w.remove("replay_id");
                }
                c20269c.f76118f = false;
                return c20269c.m56229e();
            }
        } else if (interfaceC20259b1 != null) {
            InterfaceC20432n1 interfaceC20432n1Mo56203m = interfaceC20259b1.mo56203m();
            return interfaceC20432n1Mo56203m != null ? interfaceC20432n1Mo56203m.mo56513j() : ((C20269c) interfaceC20259b1.mo56191M(new C3633d(6, interfaceC20259b1, c20513q6)).f814z).m56229e();
        }
        return null;
    }

    public C4455g(C33971f c33971f, InterfaceC4973d interfaceC4973d, C33961a c33961a) {
        Objects.requireNonNull(c33971f);
        this.f17960F = c33971f;
        this.f17964z = null;
        this.f17959E = null;
        this.f17961w = false;
        this.f17962x = interfaceC4973d;
        this.f17963y = c33961a;
    }

    public C4455g() {
        this.f17962x = new HashMap();
        this.f17963y = new HashMap();
        this.f17964z = new HashMap();
        this.f17959E = new HashMap();
        this.f17960F = new HashMap();
    }

    public C4455g(C28539n0 identityStorage) {
        AbstractC22676k.m65750j(identityStorage, "identityStorage");
        this.f17962x = identityStorage;
        this.f17963y = new ReentrantReadWriteLock(true);
        this.f17964z = new C30438a(null, null);
        this.f17959E = new Object();
        this.f17960F = new LinkedHashSet();
        m13935I(identityStorage.m86837g(), 1);
    }

    public C4455g(C20513q6 c20513q6) {
        this.f17964z = new C20540s4();
        this.f17962x = c20513q6;
        this.f17961w = true;
        InterfaceC20455p1 transportFactory = c20513q6.getTransportFactory();
        if (transportFactory instanceof C20349h3) {
            transportFactory = new C20456p2();
            c20513q6.setTransportFactory(transportFactory);
        }
        C20630y c20630yRetrieveParsedDsn = c20513q6.retrieveParsedDsn();
        String sentryClientName = c20513q6.getSentryClientName();
        URI uri = c20630yRetrieveParsedDsn.f77183c;
        String string = uri.resolve(uri.getPath() + "/envelope/").toString();
        String str = c20630yRetrieveParsedDsn.f77182b;
        String str2 = c20630yRetrieveParsedDsn.f77181a;
        StringBuilder sb4 = new StringBuilder("Sentry sentry_version=7,sentry_client=");
        sb4.append(sentryClientName);
        sb4.append(",sentry_key=");
        sb4.append(str);
        sb4.append((str2 == null || str2.length() <= 0) ? "" : ",sentry_secret=".concat(str2));
        String string2 = sb4.toString();
        HashMap map = new HashMap();
        map.put("User-Agent", sentryClientName);
        map.put("X-Sentry-Auth", string2);
        this.f17963y = transportFactory.mo56526b(c20513q6, new C5101l0(string, map));
        if (c20513q6.getLogs().f76411a) {
            this.f17959E = c20513q6.getLogs().f76412b.mo56058b(c20513q6, this);
        } else {
            this.f17959E = C20417c.f76495w;
        }
        if (c20513q6.getMetrics().f76449a) {
            this.f17960F = c20513q6.getMetrics().f76450b.mo56059b(c20513q6, this);
        } else {
            this.f17960F = C20429c.f76508w;
        }
    }
}
