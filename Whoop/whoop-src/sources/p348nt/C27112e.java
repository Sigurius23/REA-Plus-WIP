package p348nt;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import lt.C24719b;
import lt.InterfaceC24720c;
import lt.InterfaceC24721d;
import lt.InterfaceC24722e;
import lt.InterfaceC24723f;

/* JADX INFO: renamed from: nt.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C27112e implements InterfaceC24721d, InterfaceC24723f {

    /* JADX INFO: renamed from: a */
    public final boolean f108361a = true;

    /* JADX INFO: renamed from: b */
    public final JsonWriter f108362b;

    /* JADX INFO: renamed from: c */
    public final Map f108363c;

    /* JADX INFO: renamed from: d */
    public final Map f108364d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC24720c f108365e;

    /* JADX INFO: renamed from: f */
    public final boolean f108366f;

    public C27112e(BufferedWriter bufferedWriter, HashMap map, HashMap map2, C27108a c27108a, boolean z4) {
        this.f108362b = new JsonWriter(bufferedWriter);
        this.f108363c = map;
        this.f108364d = map2;
        this.f108365e = c27108a;
        this.f108366f = z4;
    }

    @Override // lt.InterfaceC24721d
    /* JADX INFO: renamed from: a */
    public final InterfaceC24721d mo72380a(C24719b c24719b, long j7) throws IOException {
        String str = c24719b.f96698a;
        m81484h();
        JsonWriter jsonWriter = this.f108362b;
        jsonWriter.name(str);
        m81484h();
        jsonWriter.value(j7);
        return this;
    }

    @Override // lt.InterfaceC24721d
    /* JADX INFO: renamed from: b */
    public final InterfaceC24721d mo72381b(C24719b c24719b, int i13) throws IOException {
        String str = c24719b.f96698a;
        m81484h();
        JsonWriter jsonWriter = this.f108362b;
        jsonWriter.name(str);
        m81484h();
        jsonWriter.value(i13);
        return this;
    }

    @Override // lt.InterfaceC24723f
    /* JADX INFO: renamed from: c */
    public final InterfaceC24723f mo72383c(String str) throws IOException {
        m81484h();
        this.f108362b.value(str);
        return this;
    }

    @Override // lt.InterfaceC24721d
    /* JADX INFO: renamed from: d */
    public final InterfaceC24721d mo72382d(C24719b c24719b, Object obj) throws IOException {
        m81483g(obj, c24719b.f96698a);
        return this;
    }

    @Override // lt.InterfaceC24723f
    /* JADX INFO: renamed from: e */
    public final InterfaceC24723f mo72384e(boolean z4) throws IOException {
        m81484h();
        this.f108362b.value(z4);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final C27112e m81482f(Object obj) throws IOException {
        JsonWriter jsonWriter = this.f108362b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    m81482f(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        m81483g(entry.getValue(), (String) key);
                    } catch (ClassCastException e5) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e5);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            InterfaceC24720c interfaceC24720c = (InterfaceC24720c) this.f108363c.get(obj.getClass());
            if (interfaceC24720c != null) {
                jsonWriter.beginObject();
                interfaceC24720c.mo41739a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            InterfaceC24722e interfaceC24722e = (InterfaceC24722e) this.f108364d.get(obj.getClass());
            if (interfaceC24722e != null) {
                interfaceC24722e.mo41739a(obj, this);
                return this;
            }
            if (obj instanceof Enum) {
                String strName = ((Enum) obj).name();
                m81484h();
                jsonWriter.value(strName);
                return this;
            }
            jsonWriter.beginObject();
            this.f108365e.mo41739a(obj, this);
            jsonWriter.endObject();
            return this;
        }
        if (obj instanceof byte[]) {
            m81484h();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i13 = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i13 < length) {
                jsonWriter.value(iArr[i13]);
                i13++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i13 < length2) {
                long j7 = jArr[i13];
                m81484h();
                jsonWriter.value(j7);
                i13++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i13 < length3) {
                jsonWriter.value(dArr[i13]);
                i13++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i13 < length4) {
                jsonWriter.value(zArr[i13]);
                i13++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i13 < length5) {
                m81482f(numberArr[i13]);
                i13++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i13 < length6) {
                m81482f(objArr[i13]);
                i13++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final C27112e m81483g(Object obj, String str) throws IOException {
        boolean z4 = this.f108366f;
        JsonWriter jsonWriter = this.f108362b;
        if (z4) {
            if (obj == null) {
                return this;
            }
            m81484h();
            jsonWriter.name(str);
            m81482f(obj);
            return this;
        }
        m81484h();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        m81482f(obj);
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final void m81484h() {
        if (!this.f108361a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
