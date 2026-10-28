package io.sentry;

import com.google.crypto.tink.internal.C5101l0;
import io.sentry.clientreport.C20293a;
import io.sentry.clientreport.C20294b;
import io.sentry.profilemeasurements.C20462a;
import io.sentry.profilemeasurements.C20463b;
import io.sentry.protocol.C20466a;
import io.sentry.protocol.C20468b;
import io.sentry.protocol.C20469b0;
import io.sentry.protocol.C20470c;
import io.sentry.protocol.C20471c0;
import io.sentry.protocol.C20472d;
import io.sentry.protocol.C20473d0;
import io.sentry.protocol.C20476f;
import io.sentry.protocol.C20481h0;
import io.sentry.protocol.C20483i0;
import io.sentry.protocol.C20484j;
import io.sentry.protocol.C20485j0;
import io.sentry.protocol.C20486k;
import io.sentry.protocol.C20487k0;
import io.sentry.protocol.C20488l;
import io.sentry.protocol.C20489m;
import io.sentry.protocol.C20490n;
import io.sentry.protocol.C20491o;
import io.sentry.protocol.C20492p;
import io.sentry.protocol.C20496q;
import io.sentry.protocol.C20498s;
import io.sentry.protocol.C20499t;
import io.sentry.protocol.C20500u;
import io.sentry.protocol.C20502w;
import io.sentry.protocol.C20503x;
import io.sentry.protocol.C20504y;
import io.sentry.protocol.C20505z;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.EnumC20467a0;
import io.sentry.protocol.EnumC20474e;
import io.sentry.rrweb.C20522a;
import io.sentry.rrweb.C20528g;
import io.sentry.rrweb.C20530i;
import io.sentry.rrweb.C20531j;
import io.sentry.rrweb.C20533l;
import io.sentry.rrweb.C20534m;
import io.sentry.rrweb.EnumC20524c;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p014aj.C0929d;
import p581we.C37199o;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.i2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20369i2 implements InterfaceC20390j1 {

    /* JADX INFO: renamed from: c */
    public static final Charset f76398c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final C20513q6 f76399a;

    /* JADX INFO: renamed from: b */
    public final HashMap f76400b;

    public C20369i2(C20513q6 c20513q6) {
        this.f76399a = c20513q6;
        HashMap map = new HashMap();
        this.f76400b = map;
        map.put(C20466a.class, new C20293a(3));
        map.put(C20315e.class, new C20306d(0));
        map.put(C20468b.class, new C20293a(4));
        map.put(C20470c.class, new C20293a(5));
        map.put(DebugImage.class, new C20293a(6));
        map.put(C20472d.class, new C20293a(7));
        map.put(C20476f.class, new C20293a(8));
        map.put(EnumC20474e.class, new C20293a(9));
        map.put(C20484j.class, new C20293a(10));
        map.put(C20488l.class, new C20293a(12));
        map.put(EnumC20467a0.class, new C20293a(26));
        map.put(C20489m.class, new C20293a(13));
        map.put(C20490n.class, new C20293a(14));
        map.put(C20491o.class, new C20293a(15));
        map.put(C20492p.class, new C20293a(16));
        map.put(C20457p3.class, new C20306d(1));
        map.put(C20510q3.class, new C20306d(2));
        map.put(C20539s3.class, new C20306d(3));
        map.put(C20547t3.class, new C20306d(4));
        map.put(C20462a.class, new C20293a(1));
        map.put(C20463b.class, new C20293a(2));
        map.put(C20496q.class, new C20293a(17));
        map.put(C20626x3.class, new C20306d(5));
        map.put(C20522a.class, new C20483i0(2));
        map.put(EnumC20524c.class, new C20483i0(3));
        map.put(C20528g.class, new C20483i0(4));
        map.put(C20530i.class, new C20483i0(5));
        map.put(C20531j.class, new C20483i0(6));
        map.put(C20533l.class, new C20483i0(7));
        map.put(C20534m.class, new C20483i0(8));
        map.put(C20498s.class, new C20293a(18));
        map.put(C20499t.class, new C20293a(19));
        map.put(C20619w4.class, new C20306d(7));
        map.put(C20312d5.class, new C20306d(8));
        map.put(C20321e5.class, new C20306d(9));
        map.put(C20500u.class, new C20293a(20));
        map.put(EnumC20424m5.class, new C20306d(10));
        map.put(EnumC20436n5.class, new C20306d(11));
        map.put(C20446o5.class, new C20306d(12));
        map.put(C20541s5.class, new C20306d(13));
        map.put(C20620w5.class, new C20306d(14));
        map.put(C20502w.class, new C20293a(21));
        map.put(C20503x.class, new C20293a(22));
        map.put(C20542s6.class, new C20306d(15));
        map.put(C20504y.class, new C20293a(23));
        map.put(C20505z.class, new C20293a(24));
        map.put(C20469b0.class, new C20293a(25));
        map.put(C20458p4.class, new C20306d(6));
        map.put(C20471c0.class, new C20293a(27));
        map.put(C20473d0.class, new C20293a(28));
        map.put(C20265b7.class, new C20306d(16));
        map.put(C20323e7.class, new C20306d(17));
        map.put(C20353h7.class, new C20306d(18));
        map.put(EnumC20374i7.class, new C20306d(19));
        map.put(C20481h0.class, new C20293a(29));
        map.put(C20486k.class, new C20293a(11));
        map.put(C20461p7.class, new C20306d(20));
        map.put(C20294b.class, new C20293a(0));
        map.put(C20487k0.class, new C20483i0(1));
        map.put(C20485j0.class, new C20483i0(0));
    }

    @Override // io.sentry.InterfaceC20390j1
    /* JADX INFO: renamed from: a */
    public final void mo56235a(Writer writer, Object obj) throws IOException {
        AbstractC29125c.m88510S(obj, "The entity is required.");
        C20513q6 c20513q6 = this.f76399a;
        InterfaceC20602v0 logger = c20513q6.getLogger();
        EnumC20436n5 enumC20436n5 = EnumC20436n5.DEBUG;
        if (logger.mo16069o(enumC20436n5)) {
            c20513q6.getLogger().mo16066m(enumC20436n5, "Serializing object: %s", m56559f(obj, c20513q6.isEnablePrettySerializationOutput()));
        }
        C37199o c37199o = new C37199o(writer, c20513q6.getMaxDepth());
        ((C0929d) c37199o.f159041x).m2360x(c37199o, c20513q6.getLogger(), obj);
        writer.flush();
    }

    @Override // io.sentry.InterfaceC20390j1
    /* JADX INFO: renamed from: b */
    public final String mo56236b(ConcurrentHashMap concurrentHashMap) {
        return m56559f(concurrentHashMap, false);
    }

    @Override // io.sentry.InterfaceC20390j1
    /* JADX INFO: renamed from: c */
    public final C5101l0 mo56237c(BufferedInputStream bufferedInputStream) {
        C20513q6 c20513q6 = this.f76399a;
        try {
            return c20513q6.getEnvelopeReader().mo56667a(bufferedInputStream);
        } catch (IOException e5) {
            c20513q6.getLogger().mo16060j(EnumC20436n5.ERROR, "Error deserializing envelope.", e5);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC20390j1
    /* JADX INFO: renamed from: d */
    public final void mo56238d(C5101l0 c5101l0, OutputStream outputStream) throws IOException {
        C20513q6 c20513q6 = this.f76399a;
        AbstractC29125c.m88510S(c5101l0, "The SentryEnvelope object is required.");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), f76398c));
        try {
            ((C20619w4) c5101l0.f21443x).serialize(new C37199o(bufferedWriter, c20513q6.getMaxDepth()), c20513q6.getLogger());
            bufferedWriter.write("\n");
            for (C20275c5 c20275c5 : (Iterable) c5101l0.f21444y) {
                try {
                    byte[] bArrM56247f = c20275c5.m56247f();
                    c20275c5.f76147a.serialize(new C37199o(bufferedWriter, c20513q6.getMaxDepth()), c20513q6.getLogger());
                    bufferedWriter.write("\n");
                    bufferedWriter.flush();
                    outputStream.write(bArrM56247f);
                    bufferedWriter.write("\n");
                } catch (Exception e5) {
                    c20513q6.getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to create envelope item. Dropping it.", e5);
                }
            }
            bufferedWriter.flush();
        } catch (Throwable th3) {
            bufferedWriter.flush();
            throw th3;
        }
    }

    @Override // io.sentry.InterfaceC20390j1
    /* JADX INFO: renamed from: e */
    public final Object mo56239e(Reader reader, Class cls) {
        Object objMo56499U0;
        C20513q6 c20513q6 = this.f76399a;
        try {
            C20339g2 c20339g2 = new C20339g2(reader);
            try {
                InterfaceC20603v1 interfaceC20603v1 = (InterfaceC20603v1) this.f76400b.get(cls);
                if (interfaceC20603v1 != null) {
                    objMo56499U0 = cls.cast(interfaceC20603v1.mo56294a(c20339g2, c20513q6.getLogger()));
                } else {
                    if (!cls.isArray() && !Collection.class.isAssignableFrom(cls) && !String.class.isAssignableFrom(cls) && !Map.class.isAssignableFrom(cls)) {
                        c20339g2.close();
                        return null;
                    }
                    objMo56499U0 = c20339g2.mo56499U0();
                }
                c20339g2.close();
                return objMo56499U0;
            } catch (Throwable th3) {
                try {
                    c20339g2.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Exception e5) {
            c20513q6.getLogger().mo16060j(EnumC20436n5.ERROR, "Error when deserializing", e5);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final String m56559f(Object obj, boolean z4) throws IOException {
        StringWriter stringWriter = new StringWriter();
        C20513q6 c20513q6 = this.f76399a;
        C37199o c37199o = new C37199o(stringWriter, c20513q6.getMaxDepth());
        if (z4) {
            c37199o.m119213S("\t");
        }
        ((C0929d) c37199o.f159041x).m2360x(c37199o, c20513q6.getLogger(), obj);
        return stringWriter.toString();
    }
}
