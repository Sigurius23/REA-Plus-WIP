package com.squareup.moshi;

import ih0.AbstractC18489d0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import p108e4.AbstractC12682p;
import p441qx.C30714h0;
import p441qx.C30740v;
import p441qx.EnumC30741w;
import p522uf.AbstractC34870c0;

/* JADX INFO: loaded from: classes.dex */
public abstract class JsonReader implements Closeable {

    /* JADX INFO: renamed from: E */
    public boolean f22075E;

    /* JADX INFO: renamed from: F */
    public boolean f22076F;

    /* JADX INFO: renamed from: w */
    public int f22077w;

    /* JADX INFO: renamed from: x */
    public int[] f22078x;

    /* JADX INFO: renamed from: y */
    public String[] f22079y;

    /* JADX INFO: renamed from: z */
    public int[] f22080z;

    public JsonReader() {
        this.f22078x = new int[32];
        this.f22079y = new String[32];
        this.f22080z = new int[32];
    }

    /* JADX INFO: renamed from: J */
    public final Object m16724J() {
        int iOrdinal = mo16731k().ordinal();
        if (iOrdinal == 0) {
            ArrayList arrayList = new ArrayList();
            beginArray();
            while (hasNext()) {
                arrayList.add(m16724J());
            }
            endArray();
            return arrayList;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 5) {
                return nextString();
            }
            if (iOrdinal == 6) {
                return Double.valueOf(nextDouble());
            }
            if (iOrdinal == 7) {
                return Boolean.valueOf(mo16729h());
            }
            if (iOrdinal == 8) {
                mo16730i();
                return null;
            }
            throw new IllegalStateException("Expected a value but was " + mo16731k() + " at path " + m16727b());
        }
        C30714h0 c30714h0 = new C30714h0();
        beginObject();
        while (hasNext()) {
            String strNextName = nextName();
            Object objM16724J = m16724J();
            Object objPut = c30714h0.put(strNextName, objM16724J);
            if (objPut != null) {
                StringBuilder sbM53375p = AbstractC18489d0.m53375p("Map key '", strNextName, "' has multiple values at path ");
                sbM53375p.append(m16727b());
                sbM53375p.append(": ");
                sbM53375p.append(objPut);
                sbM53375p.append(" and ");
                sbM53375p.append(objM16724J);
                throw new JsonDataException(sbM53375p.toString());
            }
        }
        endObject();
        return c30714h0;
    }

    /* JADX INFO: renamed from: T */
    public abstract int mo16725T(C30740v c30740v);

    /* JADX INFO: renamed from: a0 */
    public abstract int mo16726a0(C30740v c30740v);

    /* JADX INFO: renamed from: b */
    public final String m16727b() {
        return AbstractC34870c0.m109984T(this.f22077w, this.f22078x, this.f22080z, this.f22079y);
    }

    /* JADX INFO: renamed from: b0 */
    public abstract void mo16728b0();

    public abstract void beginArray();

    public abstract void beginObject();

    public abstract void endArray();

    public abstract void endObject();

    /* JADX INFO: renamed from: h */
    public abstract boolean mo16729h();

    public abstract boolean hasNext();

    /* JADX INFO: renamed from: i */
    public abstract void mo16730i();

    /* JADX INFO: renamed from: k */
    public abstract EnumC30741w mo16731k();

    /* JADX INFO: renamed from: m */
    public abstract JsonReader mo16732m();

    public abstract double nextDouble();

    public abstract int nextInt();

    public abstract long nextLong();

    public abstract String nextName();

    public abstract String nextString();

    /* JADX INFO: renamed from: o0 */
    public final void m16733o0(String str) throws JsonEncodingException {
        StringBuilder sbM35484d = AbstractC12682p.m35484d(str, " at path ");
        sbM35484d.append(m16727b());
        throw new JsonEncodingException(sbM35484d.toString());
    }

    /* JADX INFO: renamed from: p0 */
    public final JsonDataException m16734p0(Object obj, Object obj2) {
        if (obj == null) {
            return new JsonDataException("Expected " + obj2 + " but was null at path " + m16727b());
        }
        return new JsonDataException("Expected " + obj2 + " but was " + obj + ", a " + obj.getClass().getName() + ", at path " + m16727b());
    }

    /* JADX INFO: renamed from: s */
    public abstract void mo16735s();

    public abstract void skipValue();

    /* JADX INFO: renamed from: x */
    public final void m16736x(int i13) {
        int i14 = this.f22077w;
        int[] iArr = this.f22078x;
        if (i14 == iArr.length) {
            if (i14 == 256) {
                throw new JsonDataException("Nesting too deep at " + m16727b());
            }
            this.f22078x = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f22079y;
            this.f22079y = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f22080z;
            this.f22080z = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f22078x;
        int i15 = this.f22077w;
        this.f22077w = i15 + 1;
        iArr3[i15] = i13;
    }

    public JsonReader(JsonReader jsonReader) {
        this.f22077w = jsonReader.f22077w;
        this.f22078x = (int[]) jsonReader.f22078x.clone();
        this.f22079y = (String[]) jsonReader.f22079y.clone();
        this.f22080z = (int[]) jsonReader.f22080z.clone();
        this.f22075E = jsonReader.f22075E;
        this.f22076F = jsonReader.f22076F;
    }
}
