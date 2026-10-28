package io.sentry;

import aa3.C0627i1;
import com.google.crypto.tink.internal.C5101l0;
import io.sentry.android.core.C20136p0;
import io.sentry.hints.InterfaceC20359f;
import io.sentry.hints.InterfaceC20361h;
import io.sentry.hints.InterfaceC20364k;
import io.sentry.protocol.C20473d0;
import io.sentry.protocol.C20499t;
import io.sentry.protocol.C20501v;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22674j;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.l3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20410l3 extends AbstractC20601v {

    /* JADX INFO: renamed from: i */
    public static final Charset f76483i = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: e */
    public final InterfaceC20308d1 f76484e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC20536s0 f76485f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC20390j1 f76486g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC20602v0 f76487h;

    public C20410l3(InterfaceC20308d1 interfaceC20308d1, InterfaceC20536s0 interfaceC20536s0, InterfaceC20390j1 interfaceC20390j1, InterfaceC20602v0 interfaceC20602v0, long j7, int i13) {
        super(interfaceC20308d1, interfaceC20602v0, j7, i13);
        AbstractC29125c.m88510S(interfaceC20308d1, "Scopes are required.");
        this.f76484e = interfaceC20308d1;
        AbstractC29125c.m88510S(interfaceC20536s0, "Envelope reader is required.");
        this.f76485f = interfaceC20536s0;
        AbstractC29125c.m88510S(interfaceC20390j1, "Serializer is required.");
        this.f76486g = interfaceC20390j1;
        AbstractC29125c.m88510S(interfaceC20602v0, "Logger is required.");
        this.f76487h = interfaceC20602v0;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m56621c(C20410l3 c20410l3, File file, InterfaceC20361h interfaceC20361h) {
        InterfaceC20602v0 interfaceC20602v0 = c20410l3.f76487h;
        if (interfaceC20361h.mo56034a()) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            interfaceC20602v0.mo16066m(EnumC20436n5.ERROR, "Failed to delete: %s", file.getAbsolutePath());
        } catch (RuntimeException e5) {
            interfaceC20602v0.mo16058i(EnumC20436n5.ERROR, e5, "Failed to delete: %s", file.getAbsolutePath());
        }
    }

    @Override // io.sentry.AbstractC20601v
    /* JADX INFO: renamed from: a */
    public final boolean mo55887a(String str) {
        return (str == null || str.startsWith("session") || str.startsWith("previous_session") || str.startsWith("startup_crash")) ? false : true;
    }

    @Override // io.sentry.AbstractC20601v
    /* JADX INFO: renamed from: b */
    public final void mo55888b(File file, C20337g0 c20337g0) {
        boolean zMo55887a = mo55887a(file.getName());
        InterfaceC20602v0 interfaceC20602v0 = this.f76487h;
        try {
            if (!zMo55887a) {
                interfaceC20602v0.mo16066m(EnumC20436n5.DEBUG, "File '%s' should be ignored.", file.getAbsolutePath());
                return;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    C5101l0 c5101l0Mo56667a = this.f76485f.mo56667a(bufferedInputStream);
                    if (c5101l0Mo56667a == null) {
                        interfaceC20602v0.mo16066m(EnumC20436n5.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        m56623e(c5101l0Mo56667a, c20337g0);
                        interfaceC20602v0.mo16066m(EnumC20436n5.DEBUG, "File '%s' is done.", file.getAbsolutePath());
                    }
                    bufferedInputStream.close();
                    Object objM56491b = c20337g0.m56491b("sentry:typeCheckHint");
                    if (!InterfaceC20361h.class.isInstance(c20337g0.m56491b("sentry:typeCheckHint")) || objM56491b == null) {
                        AbstractC22674j.m65706N(InterfaceC20361h.class, objM56491b, interfaceC20602v0);
                    } else {
                        m56621c(this, file, (InterfaceC20361h) objM56491b);
                    }
                } catch (Throwable th3) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (IOException e5) {
                interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Error processing envelope.", e5);
                Object objM56491b2 = c20337g0.m56491b("sentry:typeCheckHint");
                if (!InterfaceC20361h.class.isInstance(c20337g0.m56491b("sentry:typeCheckHint")) || objM56491b2 == null) {
                    AbstractC22674j.m65706N(InterfaceC20361h.class, objM56491b2, interfaceC20602v0);
                } else {
                    m56621c(this, file, (InterfaceC20361h) objM56491b2);
                }
            }
        } catch (Throwable th5) {
            Object objM56491b3 = c20337g0.m56491b("sentry:typeCheckHint");
            if (!InterfaceC20361h.class.isInstance(c20337g0.m56491b("sentry:typeCheckHint")) || objM56491b3 == null) {
                AbstractC22674j.m65706N(InterfaceC20361h.class, objM56491b3, interfaceC20602v0);
            } else {
                m56621c(this, file, (InterfaceC20361h) objM56491b3);
            }
            throw th5;
        }
    }

    /* JADX INFO: renamed from: d */
    public final C0627i1 m56622d(C20405k7 c20405k7) {
        String str;
        InterfaceC20602v0 interfaceC20602v0 = this.f76487h;
        if (c20405k7 != null && (str = c20405k7.f76472G) != null) {
            try {
                Double dValueOf = Double.valueOf(Double.parseDouble(str));
                if (AbstractC34132o.m107858C(dValueOf, false)) {
                    String str2 = c20405k7.f76473H;
                    if (str2 != null) {
                        Double dValueOf2 = Double.valueOf(Double.parseDouble(str2));
                        if (AbstractC34132o.m107858C(dValueOf2, false)) {
                            return new C0627i1(Boolean.TRUE, dValueOf, dValueOf2);
                        }
                    }
                    return AbstractC34132o.m107880d(new C0627i1(Boolean.TRUE, dValueOf));
                }
                interfaceC20602v0.mo16066m(EnumC20436n5.ERROR, "Invalid sample rate parsed from TraceContext: %s", str);
            } catch (Exception unused) {
                interfaceC20602v0.mo16066m(EnumC20436n5.ERROR, "Unable to parse sample rate from TraceContext: %s", str);
            }
        }
        return new C0627i1(Boolean.TRUE, (Double) null);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0248  */
    /* JADX WARN: Code duplicated, block: B:106:0x0270 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:133:0x0277 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public final void m56623e(C5101l0 c5101l0, C20337g0 c20337g0) {
        int size;
        Iterator it;
        int i13;
        Object objM56491b;
        EnumC20436n5 enumC20436n5 = EnumC20436n5.DEBUG;
        Iterable iterable = (Iterable) c5101l0.f21444y;
        C20619w4 c20619w4 = (C20619w4) c5101l0.f21443x;
        int i14 = 0;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it3 = iterable.iterator();
            int i15 = 0;
            while (it3.hasNext()) {
                it3.next();
                i15++;
            }
            size = i15;
        }
        Object[] objArr = {Integer.valueOf(size)};
        InterfaceC20602v0 interfaceC20602v0 = this.f76487h;
        interfaceC20602v0.mo16066m(enumC20436n5, "Processing Envelope with %d item(s)", objArr);
        Iterator it4 = iterable.iterator();
        while (it4.hasNext()) {
            C20275c5 c20275c5 = (C20275c5) it4.next();
            int i16 = i14 + 1;
            C20312d5 c20312d5 = c20275c5.f76147a;
            C20312d5 c20312d6 = c20275c5.f76147a;
            if (c20312d5 == null) {
                interfaceC20602v0.mo16066m(EnumC20436n5.ERROR, "Item %d has no header", Integer.valueOf(i16));
                it = it4;
                i13 = i16;
            } else {
                boolean zEquals = EnumC20424m5.Event.equals(c20312d5.f76265E);
                InterfaceC20390j1 interfaceC20390j1 = this.f76486g;
                it = it4;
                Charset charset = f76483i;
                i13 = i16;
                InterfaceC20308d1 interfaceC20308d1 = this.f76484e;
                if (zEquals) {
                    try {
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c20275c5.m56247f()), charset));
                            try {
                                C20321e5 c20321e5 = (C20321e5) interfaceC20390j1.mo56239e(bufferedReader, C20321e5.class);
                                if (c20321e5 == null) {
                                    interfaceC20602v0.mo16066m(EnumC20436n5.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i13), c20312d6.f76265E);
                                } else {
                                    C20499t c20499t = c20321e5.f76885y;
                                    if (c20499t != null) {
                                        String str = c20499t.f76791w;
                                        if (str.startsWith("sentry.javascript") || str.startsWith("sentry.dart") || str.startsWith("sentry.dotnet")) {
                                            c20337g0.m56493d(Boolean.TRUE, "sentry:isFromHybridSdk");
                                        }
                                    }
                                    C20501v c20501v = c20619w4.f77159w;
                                    if (c20501v == null || c20501v.equals(c20321e5.f76883w)) {
                                        interfaceC20308d1.mo56442v(c20321e5, c20337g0);
                                        interfaceC20602v0.mo16066m(EnumC20436n5.DEBUG, "Item %d is being captured.", Integer.valueOf(i13));
                                        if (!m56624f(c20337g0)) {
                                            interfaceC20602v0.mo16066m(EnumC20436n5.WARNING, "Timed out waiting for event id submission: %s", c20321e5.f76883w);
                                            bufferedReader.close();
                                            return;
                                        }
                                    } else {
                                        interfaceC20602v0.mo16066m(EnumC20436n5.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i13), c20619w4.f77159w, c20321e5.f76883w);
                                        bufferedReader.close();
                                    }
                                }
                                bufferedReader.close();
                            } catch (Throwable th3) {
                                try {
                                    bufferedReader.close();
                                    throw th3;
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Item failed to process.", th);
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                    objM56491b = c20337g0.m56491b("sentry:typeCheckHint");
                    if (!(objM56491b instanceof InterfaceC20364k) && !((InterfaceC20364k) objM56491b).mo56035b()) {
                        interfaceC20602v0.mo16066m(EnumC20436n5.WARNING, "Envelope had a failed capture at item %d. No more items will be sent.", Integer.valueOf(i13));
                        return;
                    }
                    Object objM56491b2 = c20337g0.m56491b("sentry:typeCheckHint");
                    if (!C20136p0.class.isInstance(c20337g0.m56491b("sentry:typeCheckHint")) && objM56491b2 != null) {
                        ((C20136p0) objM56491b2).m56039f();
                    }
                } else {
                    EnumC20424m5 enumC20424m5 = EnumC20424m5.Transaction;
                    EnumC20424m5 enumC20424m6 = c20312d5.f76265E;
                    EnumC20424m5 enumC20424m7 = c20312d5.f76265E;
                    if (enumC20424m5.equals(enumC20424m6)) {
                        try {
                            try {
                                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c20275c5.m56247f()), charset));
                                try {
                                    C20473d0 c20473d0 = (C20473d0) interfaceC20390j1.mo56239e(bufferedReader2, C20473d0.class);
                                    if (c20473d0 == null) {
                                        interfaceC20602v0.mo16066m(EnumC20436n5.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i13), c20312d6.f76265E);
                                    } else {
                                        C20501v c20501v2 = c20619w4.f77159w;
                                        if (c20501v2 == null || c20501v2.equals(c20473d0.f76883w)) {
                                            C20405k7 c20405k7 = c20619w4.f77161y;
                                            if (c20473d0.f76884x.mo56543i() != null) {
                                                c20473d0.f76884x.mo56543i().m56484a(m56622d(c20405k7));
                                            }
                                            interfaceC20308d1.mo56418C(c20473d0, c20405k7, c20337g0, null);
                                            interfaceC20602v0.mo16066m(EnumC20436n5.DEBUG, "Item %d is being captured.", Integer.valueOf(i13));
                                            if (!m56624f(c20337g0)) {
                                                interfaceC20602v0.mo16066m(EnumC20436n5.WARNING, "Timed out waiting for event id submission: %s", c20473d0.f76883w);
                                                bufferedReader2.close();
                                                return;
                                            }
                                        } else {
                                            interfaceC20602v0.mo16066m(EnumC20436n5.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i13), c20619w4.f77159w, c20473d0.f76883w);
                                            bufferedReader2.close();
                                        }
                                    }
                                    bufferedReader2.close();
                                } catch (Throwable th7) {
                                    try {
                                        bufferedReader2.close();
                                        throw th7;
                                    } catch (Throwable th8) {
                                        th7.addSuppressed(th8);
                                        throw th7;
                                    }
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Item failed to process.", th);
                                objM56491b = c20337g0.m56491b("sentry:typeCheckHint");
                                if (!(objM56491b instanceof InterfaceC20364k)) {
                                }
                                Object objM56491b3 = c20337g0.m56491b("sentry:typeCheckHint");
                                if (!C20136p0.class.isInstance(c20337g0.m56491b("sentry:typeCheckHint"))) {
                                }
                                it4 = it;
                                i14 = i13;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                        }
                    } else {
                        interfaceC20308d1.mo56437q(new C5101l0(c20619w4.f77159w, c20619w4.f77160x, c20275c5), c20337g0);
                        interfaceC20602v0.mo16066m(EnumC20436n5.DEBUG, "%s item %d is being captured.", enumC20424m7.getItemType(), Integer.valueOf(i13));
                        if (!m56624f(c20337g0)) {
                            interfaceC20602v0.mo16066m(EnumC20436n5.WARNING, "Timed out waiting for item type submission: %s", enumC20424m7.getItemType());
                            return;
                        }
                    }
                    objM56491b = c20337g0.m56491b("sentry:typeCheckHint");
                    if (!(objM56491b instanceof InterfaceC20364k)) {
                    }
                    Object objM56491b4 = c20337g0.m56491b("sentry:typeCheckHint");
                    if (!C20136p0.class.isInstance(c20337g0.m56491b("sentry:typeCheckHint"))) {
                    }
                }
            }
            it4 = it;
            i14 = i13;
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m56624f(C20337g0 c20337g0) {
        Object objM56491b = c20337g0.m56491b("sentry:typeCheckHint");
        if (objM56491b instanceof InterfaceC20359f) {
            return ((InterfaceC20359f) objM56491b).mo56038e();
        }
        AbstractC22674j.m65706N(InterfaceC20359f.class, objM56491b, this.f76487h);
        return true;
    }
}
