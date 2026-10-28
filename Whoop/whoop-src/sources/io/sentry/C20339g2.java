package io.sentry;

import io.sentry.vendor.gson.stream.C20611a;
import io.sentry.vendor.gson.stream.EnumC20612b;
import java.io.IOException;
import java.io.Reader;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;
import p037bu.C3633d;
import p211i5.C18090c;
import p249jc.AbstractC21598x;

/* JADX INFO: renamed from: io.sentry.g2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20339g2 implements InterfaceC20392j3 {

    /* JADX INFO: renamed from: w */
    public final C20611a f76355w;

    /* JADX INFO: renamed from: x */
    public final ArrayDeque f76356x = new ArrayDeque();

    /* JADX INFO: renamed from: y */
    public int f76357y = 0;

    public C20339g2(Reader reader) {
        this.f76355w = new C20611a(reader);
    }

    @Override // io.sentry.InterfaceC20392j3
    /* JADX INFO: renamed from: I */
    public final void mo56494I(InterfaceC20602v0 interfaceC20602v0, AbstractMap abstractMap, String str) throws Throwable {
        C20327f2 c20327f2 = null;
        try {
            try {
                C20327f2 c20327f3 = new C20327f2(this.f76357y, this.f76355w.peek());
                this.f76356x.addLast(c20327f3);
                try {
                    abstractMap.put(str, mo56499U0());
                    m56502b(c20327f3);
                } catch (Exception e5) {
                    e = e5;
                    c20327f2 = c20327f3;
                    interfaceC20602v0.mo16058i(EnumC20436n5.ERROR, e, "Error deserializing unknown key: %s", str);
                    if (c20327f2 != null) {
                        try {
                            m56506k(c20327f2);
                        } catch (Exception e13) {
                            interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Stream unrecoverable after unknown key deserialization failure.", e13);
                        }
                    }
                    m56502b(c20327f2);
                } catch (Throwable th3) {
                    th = th3;
                    c20327f2 = c20327f3;
                    m56502b(c20327f2);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e14) {
            e = e14;
        }
    }

    @Override // io.sentry.InterfaceC20392j3
    /* JADX INFO: renamed from: K */
    public final TimeZone mo56495K(InterfaceC20602v0 interfaceC20602v0) {
        if (this.f76355w.peek() == EnumC20612b.NULL) {
            m56505i();
            return null;
        }
        try {
            return TimeZone.getTimeZone(nextString());
        } catch (Exception e5) {
            interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Error when deserializing TimeZone", e5);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC20392j3
    /* JADX INFO: renamed from: O0 */
    public final Float mo56496O0() {
        if (this.f76355w.peek() != EnumC20612b.NULL) {
            return Float.valueOf(nextFloat());
        }
        m56505i();
        return null;
    }

    @Override // io.sentry.InterfaceC20392j3
    /* JADX INFO: renamed from: R */
    public final Double mo56497R() {
        if (this.f76355w.peek() != EnumC20612b.NULL) {
            return Double.valueOf(nextDouble());
        }
        m56505i();
        return null;
    }

    @Override // io.sentry.InterfaceC20392j3
    /* JADX INFO: renamed from: U */
    public final Date mo56498U(InterfaceC20602v0 interfaceC20602v0) throws IOException {
        if (this.f76355w.peek() == EnumC20612b.NULL) {
            m56505i();
            return null;
        }
        String strNextString = nextString();
        if (strNextString == null) {
            return null;
        }
        try {
            try {
                return AbstractC21598x.m60661Q(strNextString);
            } catch (Exception e5) {
                interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Error when deserializing millis timestamp format.", e5);
                return null;
            }
        } catch (Exception unused) {
            return AbstractC21598x.m60662R(strNextString);
        }
    }

    @Override // io.sentry.InterfaceC20392j3
    /* JADX INFO: renamed from: U0 */
    public final Object mo56499U0() {
        boolean zM56477d = false;
        C20318e2 c20318e2 = new C20318e2(0);
        while (!zM56477d) {
            int[] iArr = AbstractC20624x1.f77168a;
            C20611a c20611a = this.f76355w;
            int i13 = iArr[c20611a.peek().ordinal()];
            ArrayList arrayList = c20318e2.f76298a;
            switch (i13) {
                case 1:
                    beginArray();
                    arrayList.add(new C20043a2());
                    break;
                case 2:
                    endArray();
                    zM56477d = c20318e2.m56477d();
                    break;
                case 3:
                    beginObject();
                    arrayList.add(new C20260b2());
                    break;
                case 4:
                    endObject();
                    zM56477d = c20318e2.m56477d();
                    break;
                case 5:
                    arrayList.add(new C20272c2(c20611a.nextName()));
                    break;
                case 6:
                    final int i14 = 0;
                    zM56477d = c20318e2.m56478e(new InterfaceC20632y1(this) { // from class: io.sentry.w1

                        /* JADX INFO: renamed from: x */
                        public final /* synthetic */ C20339g2 f77153x;

                        {
                            this.f77153x = this;
                        }

                        @Override // io.sentry.InterfaceC20632y1
                        /* JADX INFO: renamed from: d */
                        public final Object mo11181d() throws IOException {
                            switch (i14) {
                                case 0:
                                    return this.f77153x.nextString();
                                default:
                                    C20339g2 c20339g2 = this.f77153x;
                                    boolean zM56748s = c20339g2.f76355w.m56748s();
                                    c20339g2.m56504h();
                                    return Boolean.valueOf(zM56748s);
                            }
                        }
                    });
                    break;
                case 7:
                    zM56477d = c20318e2.m56478e(new C3633d(2, c20318e2, this));
                    break;
                case 8:
                    final int i15 = 1;
                    zM56477d = c20318e2.m56478e(new InterfaceC20632y1(this) { // from class: io.sentry.w1

                        /* JADX INFO: renamed from: x */
                        public final /* synthetic */ C20339g2 f77153x;

                        {
                            this.f77153x = this;
                        }

                        @Override // io.sentry.InterfaceC20632y1
                        /* JADX INFO: renamed from: d */
                        public final Object mo11181d() throws IOException {
                            switch (i15) {
                                case 0:
                                    return this.f77153x.nextString();
                                default:
                                    C20339g2 c20339g2 = this.f77153x;
                                    boolean zM56748s = c20339g2.f76355w.m56748s();
                                    c20339g2.m56504h();
                                    return Boolean.valueOf(zM56748s);
                            }
                        }
                    });
                    break;
                case 9:
                    m56505i();
                    zM56477d = c20318e2.m56478e(new C18090c(11));
                    break;
                case 10:
                    zM56477d = true;
                    break;
            }
        }
        InterfaceC20640z1 interfaceC20640z1M56476c = c20318e2.m56476c();
        if (interfaceC20640z1M56476c != null) {
            return interfaceC20640z1M56476c.getValue();
        }
        return null;
    }

    @Override // io.sentry.InterfaceC20392j3
    /* JADX INFO: renamed from: W */
    public final Boolean mo56500W() throws IOException {
        C20611a c20611a = this.f76355w;
        if (c20611a.peek() == EnumC20612b.NULL) {
            m56505i();
            return null;
        }
        boolean zM56748s = c20611a.m56748s();
        m56504h();
        return Boolean.valueOf(zM56748s);
    }

    @Override // io.sentry.InterfaceC20392j3
    /* JADX INFO: renamed from: Z */
    public final Object mo56501Z(InterfaceC20602v0 interfaceC20602v0, InterfaceC20603v1 interfaceC20603v1) {
        if (this.f76355w.peek() != EnumC20612b.NULL) {
            return interfaceC20603v1.mo56294a(this, interfaceC20602v0);
        }
        m56505i();
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m56502b(C20327f2 c20327f2) {
        if (c20327f2 == null) {
            return;
        }
        ArrayDeque arrayDeque = this.f76356x;
        if (arrayDeque.isEmpty() || arrayDeque.peekLast() != c20327f2) {
            arrayDeque.remove(c20327f2);
        } else {
            arrayDeque.removeLast();
        }
    }

    @Override // io.sentry.InterfaceC20392j3
    public final void beginArray() {
        this.f76355w.beginArray();
        m56504h();
        this.f76357y++;
    }

    @Override // io.sentry.InterfaceC20392j3
    public final void beginObject() {
        this.f76355w.beginObject();
        m56504h();
        this.f76357y++;
    }

    @Override // io.sentry.InterfaceC20392j3
    /* JADX INFO: renamed from: c1 */
    public final ArrayList mo56503c1(InterfaceC20602v0 interfaceC20602v0, InterfaceC20603v1 interfaceC20603v1) throws IOException {
        boolean z4;
        C20611a c20611a = this.f76355w;
        if (c20611a.peek() == EnumC20612b.NULL) {
            m56505i();
            return null;
        }
        beginArray();
        ArrayList arrayList = new ArrayList();
        while (c20611a.hasNext()) {
            C20327f2 c20327f2 = new C20327f2(this.f76357y, c20611a.peek());
            this.f76356x.addLast(c20327f2);
            try {
                try {
                    arrayList.add(interfaceC20603v1.mo56294a(this, interfaceC20602v0));
                } catch (Exception e5) {
                    interfaceC20602v0.mo16060j(EnumC20436n5.WARNING, "Failed to deserialize object in list.", e5);
                    try {
                        m56506k(c20327f2);
                        z4 = true;
                    } catch (Exception e13) {
                        interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Stream unrecoverable, aborting list deserialization.", e13);
                        z4 = false;
                    }
                    if (!z4) {
                        m56502b(c20327f2);
                        endArray();
                        return arrayList;
                    }
                }
                m56502b(c20327f2);
            } catch (Throwable th3) {
                m56502b(c20327f2);
                throw th3;
            }
        }
        endArray();
        return arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f76355w.close();
    }

    @Override // io.sentry.InterfaceC20392j3
    public final void endArray() {
        this.f76355w.endArray();
        this.f76357y--;
    }

    @Override // io.sentry.InterfaceC20392j3
    public final void endObject() {
        this.f76355w.endObject();
        this.f76357y--;
    }

    /* JADX INFO: renamed from: h */
    public final void m56504h() {
        C20327f2 c20327f2 = (C20327f2) this.f76356x.peekLast();
        if (c20327f2 != null) {
            c20327f2.f76337c = true;
        }
    }

    @Override // io.sentry.InterfaceC20392j3
    public final boolean hasNext() {
        return this.f76355w.hasNext();
    }

    /* JADX INFO: renamed from: i */
    public final void m56505i() {
        this.f76355w.m56737J();
        m56504h();
    }

    /* JADX INFO: renamed from: k */
    public final void m56506k(C20327f2 c20327f2) throws IOException {
        C20611a c20611a;
        while (true) {
            int i13 = this.f76357y;
            int i14 = c20327f2.f76335a;
            c20611a = this.f76355w;
            if (i13 <= i14) {
                break;
            }
            EnumC20612b enumC20612bPeek = c20611a.peek();
            if (enumC20612bPeek == EnumC20612b.END_OBJECT) {
                endObject();
            } else if (enumC20612bPeek == EnumC20612b.END_ARRAY) {
                endArray();
            } else {
                skipValue();
            }
        }
        if (c20327f2.f76337c || c20611a.peek() != c20327f2.f76336b) {
            return;
        }
        skipValue();
    }

    @Override // io.sentry.InterfaceC20392j3
    public final double nextDouble() throws IOException {
        double dNextDouble = this.f76355w.nextDouble();
        m56504h();
        return dNextDouble;
    }

    @Override // io.sentry.InterfaceC20392j3
    public final float nextFloat() throws IOException {
        double dNextDouble = this.f76355w.nextDouble();
        m56504h();
        return (float) dNextDouble;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d7  */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x00d7, please report this as an issue */
    @Override // io.sentry.InterfaceC20392j3
    public final int nextInt() throws IOException {
        int i13;
        double d3;
        C20611a c20611a = this.f76355w;
        int iM56742h = c20611a.f77131H;
        if (iM56742h == 0) {
            iM56742h = c20611a.m56742h();
        }
        if (iM56742h == 15) {
            long j7 = c20611a.f77132I;
            i13 = (int) j7;
            if (j7 != i13) {
                throw new NumberFormatException("Expected an int but was " + c20611a.f77132I + c20611a.m56745m());
            }
            c20611a.f77131H = 0;
            int[] iArr = c20611a.f77138O;
            int i14 = c20611a.f77136M - 1;
            iArr[i14] = iArr[i14] + 1;
        } else {
            if (iM56742h == 16) {
                c20611a.f77134K = new String(c20611a.f77141y, c20611a.f77142z, c20611a.f77133J);
                c20611a.f77142z += c20611a.f77133J;
            } else {
                if (iM56742h != 8 && iM56742h != 9 && iM56742h != 10) {
                    throw new IllegalStateException("Expected an int but was " + c20611a.peek() + c20611a.m56745m());
                }
                if (iM56742h == 10) {
                    c20611a.f77134K = c20611a.m56739a0();
                } else {
                    c20611a.f77134K = c20611a.m56738T(iM56742h == 8 ? '\'' : '\"');
                }
                try {
                    i13 = Integer.parseInt(c20611a.f77134K);
                    c20611a.f77131H = 0;
                    int[] iArr2 = c20611a.f77138O;
                    int i15 = c20611a.f77136M - 1;
                    iArr2[i15] = iArr2[i15] + 1;
                } catch (NumberFormatException unused) {
                    c20611a.f77131H = 11;
                    d3 = Double.parseDouble(c20611a.f77134K);
                    i13 = (int) d3;
                    if (i13 == d3) {
                        throw new NumberFormatException("Expected an int but was " + c20611a.f77134K + c20611a.m56745m());
                    }
                    c20611a.f77134K = null;
                    c20611a.f77131H = 0;
                    int[] iArr3 = c20611a.f77138O;
                    int i16 = c20611a.f77136M - 1;
                    iArr3[i16] = iArr3[i16] + 1;
                }
            }
            c20611a.f77131H = 11;
            d3 = Double.parseDouble(c20611a.f77134K);
            i13 = (int) d3;
            if (i13 == d3) {
                throw new NumberFormatException("Expected an int but was " + c20611a.f77134K + c20611a.m56745m());
            }
            c20611a.f77134K = null;
            c20611a.f77131H = 0;
            int[] iArr4 = c20611a.f77138O;
            int i17 = c20611a.f77136M - 1;
            iArr4[i17] = iArr4[i17] + 1;
        }
        m56504h();
        return i13;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b8  */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x00b8, please report this as an issue */
    @Override // io.sentry.InterfaceC20392j3
    public final long nextLong() throws IOException {
        long j7;
        double d3;
        long j13;
        C20611a c20611a = this.f76355w;
        int iM56742h = c20611a.f77131H;
        if (iM56742h == 0) {
            iM56742h = c20611a.m56742h();
        }
        if (iM56742h == 15) {
            c20611a.f77131H = 0;
            int[] iArr = c20611a.f77138O;
            int i13 = c20611a.f77136M - 1;
            iArr[i13] = iArr[i13] + 1;
            j7 = c20611a.f77132I;
        } else {
            if (iM56742h == 16) {
                c20611a.f77134K = new String(c20611a.f77141y, c20611a.f77142z, c20611a.f77133J);
                c20611a.f77142z += c20611a.f77133J;
            } else {
                if (iM56742h != 8 && iM56742h != 9 && iM56742h != 10) {
                    throw new IllegalStateException("Expected a long but was " + c20611a.peek() + c20611a.m56745m());
                }
                if (iM56742h == 10) {
                    c20611a.f77134K = c20611a.m56739a0();
                } else {
                    c20611a.f77134K = c20611a.m56738T(iM56742h == 8 ? '\'' : '\"');
                }
                try {
                    long j14 = Long.parseLong(c20611a.f77134K);
                    c20611a.f77131H = 0;
                    int[] iArr2 = c20611a.f77138O;
                    int i14 = c20611a.f77136M - 1;
                    iArr2[i14] = iArr2[i14] + 1;
                    j7 = j14;
                } catch (NumberFormatException unused) {
                    c20611a.f77131H = 11;
                    d3 = Double.parseDouble(c20611a.f77134K);
                    j13 = (long) d3;
                    if (j13 == d3) {
                        throw new NumberFormatException("Expected a long but was " + c20611a.f77134K + c20611a.m56745m());
                    }
                    c20611a.f77134K = null;
                    c20611a.f77131H = 0;
                    int[] iArr3 = c20611a.f77138O;
                    int i15 = c20611a.f77136M - 1;
                    iArr3[i15] = iArr3[i15] + 1;
                    j7 = j13;
                }
            }
            c20611a.f77131H = 11;
            d3 = Double.parseDouble(c20611a.f77134K);
            j13 = (long) d3;
            if (j13 == d3) {
                throw new NumberFormatException("Expected a long but was " + c20611a.f77134K + c20611a.m56745m());
            }
            c20611a.f77134K = null;
            c20611a.f77131H = 0;
            int[] iArr4 = c20611a.f77138O;
            int i16 = c20611a.f77136M - 1;
            iArr4[i16] = iArr4[i16] + 1;
            j7 = j13;
        }
        m56504h();
        return j7;
    }

    @Override // io.sentry.InterfaceC20392j3
    public final String nextName() {
        return this.f76355w.nextName();
    }

    @Override // io.sentry.InterfaceC20392j3
    public final String nextString() throws IOException {
        String strNextString = this.f76355w.nextString();
        m56504h();
        return strNextString;
    }

    @Override // io.sentry.InterfaceC20392j3
    public final EnumC20612b peek() {
        return this.f76355w.peek();
    }

    @Override // io.sentry.InterfaceC20392j3
    /* JADX INFO: renamed from: q0 */
    public final Integer mo56507q0() {
        if (this.f76355w.peek() != EnumC20612b.NULL) {
            return Integer.valueOf(nextInt());
        }
        m56505i();
        return null;
    }

    @Override // io.sentry.InterfaceC20392j3
    /* JADX INFO: renamed from: s0 */
    public final Long mo56508s0() {
        if (this.f76355w.peek() != EnumC20612b.NULL) {
            return Long.valueOf(nextLong());
        }
        m56505i();
        return null;
    }

    @Override // io.sentry.InterfaceC20392j3
    public final void setLenient(boolean z4) {
        this.f76355w.f77140x = z4;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:61:0x009d. Please report as an issue. */
    @Override // io.sentry.InterfaceC20392j3
    public final void skipValue() throws IOException {
        C20611a c20611a;
        int i13 = 0;
        do {
            c20611a = this.f76355w;
            int iM56742h = c20611a.f77131H;
            if (iM56742h == 0) {
                iM56742h = c20611a.m56742h();
            }
            if (iM56742h == 3) {
                c20611a.m56741b0(1);
            } else {
                if (iM56742h == 1) {
                    c20611a.m56741b0(3);
                } else if (iM56742h == 4 || iM56742h == 2) {
                    c20611a.f77136M--;
                    i13--;
                } else if (iM56742h == 14 || iM56742h == 10) {
                    while (true) {
                        int i14 = 0;
                        while (true) {
                            int i15 = c20611a.f77142z + i14;
                            if (i15 < c20611a.f77128E) {
                                char c3 = c20611a.f77141y[i15];
                                if (c3 != '\t' && c3 != '\n' && c3 != '\f' && c3 != '\r' && c3 != ' ') {
                                    if (c3 != '#') {
                                        if (c3 != ',') {
                                            if (c3 != '/' && c3 != '=') {
                                                if (c3 != '{' && c3 != '}' && c3 != ':') {
                                                    if (c3 != ';') {
                                                        switch (c3) {
                                                            case '[':
                                                            case ']':
                                                                break;
                                                            case '\\':
                                                                break;
                                                            default:
                                                                i14++;
                                                                break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    c20611a.m56740b();
                                }
                                c20611a.f77142z += i14;
                            } else {
                                c20611a.f77142z = i15;
                                if (!c20611a.m56743i(1)) {
                                }
                            }
                        }
                    }
                } else if (iM56742h == 8 || iM56742h == 12) {
                    c20611a.m56747p0('\'');
                } else if (iM56742h == 9 || iM56742h == 13) {
                    c20611a.m56747p0('\"');
                } else if (iM56742h == 16) {
                    c20611a.f77142z += c20611a.f77133J;
                }
                c20611a.f77131H = 0;
            }
            i13++;
            c20611a.f77131H = 0;
        } while (i13 != 0);
        int[] iArr = c20611a.f77138O;
        int i16 = c20611a.f77136M - 1;
        iArr[i16] = iArr[i16] + 1;
        c20611a.f77137N[i16] = "null";
        m56504h();
    }

    @Override // io.sentry.InterfaceC20392j3
    /* JADX INFO: renamed from: w0 */
    public final String mo56509w0() {
        if (this.f76355w.peek() != EnumC20612b.NULL) {
            return nextString();
        }
        m56505i();
        return null;
    }

    @Override // io.sentry.InterfaceC20392j3
    /* JADX INFO: renamed from: y0 */
    public final HashMap mo56510y0(InterfaceC20602v0 interfaceC20602v0, InterfaceC20603v1 interfaceC20603v1) throws IOException {
        boolean z4;
        C20611a c20611a = this.f76355w;
        if (c20611a.peek() == EnumC20612b.NULL) {
            m56505i();
            return null;
        }
        beginObject();
        HashMap map = new HashMap();
        if (c20611a.hasNext()) {
            while (true) {
                String strNextName = c20611a.nextName();
                C20327f2 c20327f2 = new C20327f2(this.f76357y, c20611a.peek());
                this.f76356x.addLast(c20327f2);
                try {
                    try {
                        map.put(strNextName, interfaceC20603v1.mo56294a(this, interfaceC20602v0));
                    } catch (Exception e5) {
                        interfaceC20602v0.mo16060j(EnumC20436n5.WARNING, "Failed to deserialize object in map.", e5);
                        try {
                            m56506k(c20327f2);
                            z4 = true;
                        } catch (Exception e13) {
                            interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Stream unrecoverable, aborting map deserialization.", e13);
                            z4 = false;
                        }
                        if (!z4) {
                            m56502b(c20327f2);
                            break;
                        }
                        endObject();
                        return map;
                    }
                    m56502b(c20327f2);
                    if (c20611a.peek() != EnumC20612b.BEGIN_OBJECT && c20611a.peek() != EnumC20612b.NAME) {
                        break;
                    }
                } catch (Throwable th3) {
                    m56502b(c20327f2);
                    throw th3;
                }
            }
        }
        endObject();
        return map;
    }
}
