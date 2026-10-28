package p381ot;

import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import lt.C24719b;
import lt.InterfaceC24720c;
import lt.InterfaceC24721d;
import lt.InterfaceC24722e;
import p127ev.AbstractC13673n;
import p348nt.C27108a;

/* JADX INFO: renamed from: ot.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C28320f implements InterfaceC24721d {

    /* JADX INFO: renamed from: f */
    public static final Charset f114202f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g */
    public static final C24719b f114203g = new C24719b("key", AbstractC13673n.m38569p(AbstractC13673n.m38568o(InterfaceC28319e.class, new C28315a(1))));

    /* JADX INFO: renamed from: h */
    public static final C24719b f114204h = new C24719b("value", AbstractC13673n.m38569p(AbstractC13673n.m38568o(InterfaceC28319e.class, new C28315a(2))));

    /* JADX INFO: renamed from: i */
    public static final C27108a f114205i = new C27108a(1);

    /* JADX INFO: renamed from: a */
    public OutputStream f114206a;

    /* JADX INFO: renamed from: b */
    public final HashMap f114207b;

    /* JADX INFO: renamed from: c */
    public final HashMap f114208c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC24720c f114209d;

    /* JADX INFO: renamed from: e */
    public final C28322h f114210e = new C28322h(this);

    public C28320f(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, InterfaceC24720c interfaceC24720c) {
        this.f114206a = byteArrayOutputStream;
        this.f114207b = map;
        this.f114208c = map2;
        this.f114209d = interfaceC24720c;
    }

    /* JADX INFO: renamed from: g */
    public static int m85778g(C24719b c24719b) {
        InterfaceC28319e interfaceC28319e = (InterfaceC28319e) ((Annotation) c24719b.f96699b.get(InterfaceC28319e.class));
        if (interfaceC28319e != null) {
            return ((C28315a) interfaceC28319e).f114198a;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // lt.InterfaceC24721d
    /* JADX INFO: renamed from: a */
    public final InterfaceC24721d mo72380a(C24719b c24719b, long j7) throws IOException {
        if (j7 == 0) {
            return this;
        }
        InterfaceC28319e interfaceC28319e = (InterfaceC28319e) ((Annotation) c24719b.f96699b.get(InterfaceC28319e.class));
        if (interfaceC28319e == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        m85782h(((C28315a) interfaceC28319e).f114198a << 3);
        m85783i(j7);
        return this;
    }

    @Override // lt.InterfaceC24721d
    /* JADX INFO: renamed from: b */
    public final InterfaceC24721d mo72381b(C24719b c24719b, int i13) {
        m85779c(c24719b, i13, true);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final void m85779c(C24719b c24719b, int i13, boolean z4) {
        if (z4 && i13 == 0) {
            return;
        }
        InterfaceC28319e interfaceC28319e = (InterfaceC28319e) ((Annotation) c24719b.f96699b.get(InterfaceC28319e.class));
        if (interfaceC28319e == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        m85782h(((C28315a) interfaceC28319e).f114198a << 3);
        m85782h(i13);
    }

    @Override // lt.InterfaceC24721d
    /* JADX INFO: renamed from: d */
    public final InterfaceC24721d mo72382d(C24719b c24719b, Object obj) {
        m85780e(c24719b, obj, true);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final void m85780e(C24719b c24719b, Object obj, boolean z4) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z4 && charSequence.length() == 0) {
                return;
            }
            m85782h((m85778g(c24719b) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f114202f);
            m85782h(bytes.length);
            this.f114206a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m85780e(c24719b, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it3 = ((Map) obj).entrySet().iterator();
            while (it3.hasNext()) {
                m85781f(f114205i, c24719b, (Map.Entry) it3.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z4 && dDoubleValue == 0.0d) {
                return;
            }
            m85782h((m85778g(c24719b) << 3) | 1);
            this.f114206a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z4 && fFloatValue == 0.0f) {
                return;
            }
            m85782h((m85778g(c24719b) << 3) | 5);
            this.f114206a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z4 && jLongValue == 0) {
                return;
            }
            InterfaceC28319e interfaceC28319e = (InterfaceC28319e) ((Annotation) c24719b.f96699b.get(InterfaceC28319e.class));
            if (interfaceC28319e == null) {
                throw new EncodingException("Field has no @Protobuf config");
            }
            m85782h(((C28315a) interfaceC28319e).f114198a << 3);
            m85783i(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            m85779c(c24719b, ((Boolean) obj).booleanValue() ? 1 : 0, z4);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z4 && bArr.length == 0) {
                return;
            }
            m85782h((m85778g(c24719b) << 3) | 2);
            m85782h(bArr.length);
            this.f114206a.write(bArr);
            return;
        }
        InterfaceC24720c interfaceC24720c = (InterfaceC24720c) this.f114207b.get(obj.getClass());
        if (interfaceC24720c != null) {
            m85781f(interfaceC24720c, c24719b, obj, z4);
            return;
        }
        InterfaceC24722e interfaceC24722e = (InterfaceC24722e) this.f114208c.get(obj.getClass());
        if (interfaceC24722e != null) {
            C28322h c28322h = this.f114210e;
            c28322h.f114212a = false;
            c28322h.f114214c = c24719b;
            c28322h.f114213b = z4;
            interfaceC24722e.mo41739a(obj, c28322h);
            return;
        }
        if (obj instanceof InterfaceC28317c) {
            m85779c(c24719b, ((InterfaceC28317c) obj).mo6451a(), true);
        } else if (obj instanceof Enum) {
            m85779c(c24719b, ((Enum) obj).ordinal(), true);
        } else {
            m85781f(this.f114209d, c24719b, obj, z4);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m85781f(InterfaceC24720c interfaceC24720c, C24719b c24719b, Object obj, boolean z4) throws IOException {
        C28316b c28316b = new C28316b();
        c28316b.f114199w = 0L;
        try {
            OutputStream outputStream = this.f114206a;
            this.f114206a = c28316b;
            try {
                interfaceC24720c.mo41739a(obj, this);
                this.f114206a = outputStream;
                long j7 = c28316b.f114199w;
                c28316b.close();
                if (z4 && j7 == 0) {
                    return;
                }
                m85782h((m85778g(c24719b) << 3) | 2);
                m85783i(j7);
                interfaceC24720c.mo41739a(obj, this);
            } catch (Throwable th3) {
                this.f114206a = outputStream;
                throw th3;
            }
        } catch (Throwable th4) {
            try {
                c28316b.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m85782h(int i13) throws IOException {
        while ((i13 & (-128)) != 0) {
            this.f114206a.write((i13 & 127) | 128);
            i13 >>>= 7;
        }
        this.f114206a.write(i13 & 127);
    }

    /* JADX INFO: renamed from: i */
    public final void m85783i(long j7) throws IOException {
        while (((-128) & j7) != 0) {
            this.f114206a.write((((int) j7) & 127) | 128);
            j7 >>>= 7;
        }
        this.f114206a.write(((int) j7) & 127);
    }
}
