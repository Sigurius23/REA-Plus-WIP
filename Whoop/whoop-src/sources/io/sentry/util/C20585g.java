package io.sentry.util;

import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20392j3;
import io.sentry.InterfaceC20602v0;
import io.sentry.InterfaceC20603v1;
import io.sentry.vendor.gson.stream.EnumC20612b;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import p249jc.AbstractC21598x;

/* JADX INFO: renamed from: io.sentry.util.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C20585g implements InterfaceC20392j3 {

    /* JADX INFO: renamed from: w */
    public final ArrayDeque f77087w;

    public C20585g(Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f77087w = arrayDeque;
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, map));
    }

    @Override // io.sentry.InterfaceC20392j3
    /* JADX INFO: renamed from: I */
    public final void mo56494I(InterfaceC20602v0 interfaceC20602v0, AbstractMap abstractMap, String str) {
        int size = this.f77087w.size();
        try {
            abstractMap.put(str, m56717b());
        } catch (Exception e5) {
            interfaceC20602v0.mo16058i(EnumC20436n5.ERROR, e5, "Error deserializing unknown key: %s", str);
            m56718h(size);
        }
    }

    @Override // io.sentry.InterfaceC20392j3
    /* JADX INFO: renamed from: K */
    public final TimeZone mo56495K(InterfaceC20602v0 interfaceC20602v0) {
        String str = (String) m56717b();
        if (str != null) {
            return TimeZone.getTimeZone(str);
        }
        return null;
    }

    @Override // io.sentry.InterfaceC20392j3
    /* JADX INFO: renamed from: O0 */
    public final Float mo56496O0() throws IOException {
        Object objM56717b = m56717b();
        if (objM56717b instanceof Number) {
            return Float.valueOf(((Number) objM56717b).floatValue());
        }
        return null;
    }

    @Override // io.sentry.InterfaceC20392j3
    /* JADX INFO: renamed from: R */
    public final Double mo56497R() throws IOException {
        Object objM56717b = m56717b();
        if (objM56717b instanceof Number) {
            return Double.valueOf(((Number) objM56717b).doubleValue());
        }
        return null;
    }

    @Override // io.sentry.InterfaceC20392j3
    /* JADX INFO: renamed from: U */
    public final Date mo56498U(InterfaceC20602v0 interfaceC20602v0) {
        String str = (String) m56717b();
        if (str == null) {
            return null;
        }
        try {
            try {
                return AbstractC21598x.m60661Q(str);
            } catch (Exception unused) {
                return AbstractC21598x.m60662R(str);
            }
        } catch (Exception e5) {
            interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Error when deserializing millis timestamp format.", e5);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC20392j3
    /* JADX INFO: renamed from: U0 */
    public final Object mo56499U0() {
        return m56717b();
    }

    @Override // io.sentry.InterfaceC20392j3
    /* JADX INFO: renamed from: W */
    public final Boolean mo56500W() {
        return (Boolean) m56717b();
    }

    @Override // io.sentry.InterfaceC20392j3
    /* JADX INFO: renamed from: Z */
    public final Object mo56501Z(InterfaceC20602v0 interfaceC20602v0, InterfaceC20603v1 interfaceC20603v1) {
        ArrayDeque arrayDeque = this.f77087w;
        Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
        if (entry == null) {
            return null;
        }
        Object value = entry.getValue();
        if (interfaceC20602v0 != null) {
            return interfaceC20603v1.mo56294a(this, interfaceC20602v0);
        }
        arrayDeque.removeLast();
        return value;
    }

    /* JADX INFO: renamed from: b */
    public final Object m56717b() throws IOException {
        try {
            ArrayDeque arrayDeque = this.f77087w;
            Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
            if (entry == null) {
                return null;
            }
            Object value = entry.getValue();
            arrayDeque.removeLast();
            return value;
        } catch (Exception e5) {
            throw new IOException(e5);
        }
    }

    @Override // io.sentry.InterfaceC20392j3
    public final void beginArray() throws IOException {
        ArrayDeque arrayDeque = this.f77087w;
        Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
        if (entry == null) {
            throw new IOException("No more entries");
        }
        Object value = entry.getValue();
        if (!(value instanceof List)) {
            throw new IOException("Current token is not an object");
        }
        arrayDeque.removeLast();
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, EnumC20612b.END_ARRAY));
        List list = (List) value;
        for (int size = list.size() - 1; size >= 0; size--) {
            arrayDeque.addLast(new AbstractMap.SimpleEntry(null, list.get(size)));
        }
    }

    @Override // io.sentry.InterfaceC20392j3
    public final void beginObject() throws IOException {
        ArrayDeque arrayDeque = this.f77087w;
        Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
        if (entry == null) {
            throw new IOException("No more entries");
        }
        Object value = entry.getValue();
        if (!(value instanceof Map)) {
            throw new IOException("Current token is not an object");
        }
        arrayDeque.removeLast();
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, EnumC20612b.END_OBJECT));
        Iterator it = ((Map) value).entrySet().iterator();
        while (it.hasNext()) {
            arrayDeque.addLast((Map.Entry) it.next());
        }
    }

    @Override // io.sentry.InterfaceC20392j3
    /* JADX INFO: renamed from: c1 */
    public final ArrayList mo56503c1(InterfaceC20602v0 interfaceC20602v0, InterfaceC20603v1 interfaceC20603v1) throws IOException {
        if (peek() == EnumC20612b.NULL) {
            if (m56717b() == null) {
                return null;
            }
            throw new IOException("Expected null but was " + peek());
        }
        try {
            beginArray();
            ArrayList arrayList = new ArrayList();
            while (peek() != EnumC20612b.END_ARRAY) {
                int size = this.f77087w.size();
                try {
                    arrayList.add(interfaceC20603v1.mo56294a(this, interfaceC20602v0));
                } catch (Exception e5) {
                    interfaceC20602v0.mo16060j(EnumC20436n5.WARNING, "Failed to deserialize object in list.", e5);
                    m56718h(size);
                }
            }
            endArray();
            return arrayList;
        } catch (Exception e13) {
            throw new IOException(e13);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f77087w.clear();
    }

    @Override // io.sentry.InterfaceC20392j3
    public final void endArray() {
        ArrayDeque arrayDeque = this.f77087w;
        if (arrayDeque.size() > 1) {
            arrayDeque.removeLast();
        }
    }

    @Override // io.sentry.InterfaceC20392j3
    public final void endObject() {
        ArrayDeque arrayDeque = this.f77087w;
        if (arrayDeque.size() > 1) {
            arrayDeque.removeLast();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m56718h(int i13) {
        while (true) {
            ArrayDeque arrayDeque = this.f77087w;
            if (arrayDeque.isEmpty() || arrayDeque.size() < i13) {
                return;
            } else {
                arrayDeque.removeLast();
            }
        }
    }

    @Override // io.sentry.InterfaceC20392j3
    public final boolean hasNext() {
        return !this.f77087w.isEmpty();
    }

    @Override // io.sentry.InterfaceC20392j3
    public final double nextDouble() throws IOException {
        Object objM56717b = m56717b();
        if (objM56717b instanceof Number) {
            return ((Number) objM56717b).doubleValue();
        }
        throw new IOException("Expected double");
    }

    @Override // io.sentry.InterfaceC20392j3
    public final float nextFloat() throws IOException {
        Object objM56717b = m56717b();
        if (objM56717b instanceof Number) {
            return ((Number) objM56717b).floatValue();
        }
        throw new IOException("Expected float");
    }

    @Override // io.sentry.InterfaceC20392j3
    public final int nextInt() throws IOException {
        Object objM56717b = m56717b();
        if (objM56717b instanceof Number) {
            return ((Number) objM56717b).intValue();
        }
        throw new IOException("Expected int");
    }

    @Override // io.sentry.InterfaceC20392j3
    public final long nextLong() throws IOException {
        Object objM56717b = m56717b();
        if (objM56717b instanceof Number) {
            return ((Number) objM56717b).longValue();
        }
        throw new IOException("Expected long");
    }

    @Override // io.sentry.InterfaceC20392j3
    public final String nextName() throws IOException {
        Map.Entry entry = (Map.Entry) this.f77087w.peekLast();
        if (entry != null && entry.getKey() != null) {
            return (String) entry.getKey();
        }
        throw new IOException("Expected a name but was " + peek());
    }

    @Override // io.sentry.InterfaceC20392j3
    public final String nextString() throws IOException {
        String str = (String) m56717b();
        if (str != null) {
            return str;
        }
        throw new IOException("Expected string");
    }

    @Override // io.sentry.InterfaceC20392j3
    public final EnumC20612b peek() {
        Map.Entry entry;
        ArrayDeque arrayDeque = this.f77087w;
        if (!arrayDeque.isEmpty() && (entry = (Map.Entry) arrayDeque.peekLast()) != null) {
            if (entry.getKey() != null) {
                return EnumC20612b.NAME;
            }
            Object value = entry.getValue();
            if (value instanceof Map) {
                return EnumC20612b.BEGIN_OBJECT;
            }
            if (value instanceof List) {
                return EnumC20612b.BEGIN_ARRAY;
            }
            if (value instanceof String) {
                return EnumC20612b.STRING;
            }
            if (value instanceof Number) {
                return EnumC20612b.NUMBER;
            }
            if (value instanceof Boolean) {
                return EnumC20612b.BOOLEAN;
            }
            return value instanceof EnumC20612b ? (EnumC20612b) value : EnumC20612b.END_DOCUMENT;
        }
        return EnumC20612b.END_DOCUMENT;
    }

    @Override // io.sentry.InterfaceC20392j3
    /* JADX INFO: renamed from: q0 */
    public final Integer mo56507q0() throws IOException {
        Object objM56717b = m56717b();
        if (objM56717b instanceof Number) {
            return Integer.valueOf(((Number) objM56717b).intValue());
        }
        return null;
    }

    @Override // io.sentry.InterfaceC20392j3
    /* JADX INFO: renamed from: s0 */
    public final Long mo56508s0() throws IOException {
        Object objM56717b = m56717b();
        if (objM56717b instanceof Number) {
            return Long.valueOf(((Number) objM56717b).longValue());
        }
        return null;
    }

    @Override // io.sentry.InterfaceC20392j3
    public final void setLenient(boolean z4) {
    }

    @Override // io.sentry.InterfaceC20392j3
    public final void skipValue() {
        ArrayDeque arrayDeque = this.f77087w;
        if (arrayDeque.isEmpty()) {
            return;
        }
        arrayDeque.removeLast();
    }

    @Override // io.sentry.InterfaceC20392j3
    /* JADX INFO: renamed from: w0 */
    public final String mo56509w0() {
        return (String) m56717b();
    }

    @Override // io.sentry.InterfaceC20392j3
    /* JADX INFO: renamed from: y0 */
    public final HashMap mo56510y0(InterfaceC20602v0 interfaceC20602v0, InterfaceC20603v1 interfaceC20603v1) throws IOException {
        if (peek() == EnumC20612b.NULL) {
            if (m56717b() == null) {
                return null;
            }
            throw new IOException("Expected null but was " + peek());
        }
        try {
            beginObject();
            HashMap map = new HashMap();
            if (peek() == EnumC20612b.NAME) {
                while (true) {
                    String strNextName = nextName();
                    int size = this.f77087w.size();
                    try {
                        map.put(strNextName, interfaceC20603v1.mo56294a(this, interfaceC20602v0));
                    } catch (Exception e5) {
                        interfaceC20602v0.mo16060j(EnumC20436n5.WARNING, "Failed to deserialize object in map.", e5);
                        m56718h(size);
                    }
                    if (peek() != EnumC20612b.BEGIN_OBJECT && peek() != EnumC20612b.NAME) {
                        break;
                    }
                }
            }
            endObject();
            return map;
        } catch (Exception e13) {
            throw new IOException(e13);
        }
    }
}
