package p441qx;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p471rx.AbstractC31885f;

/* JADX INFO: renamed from: qx.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C30734r0 extends JsonAdapter {

    /* JADX INFO: renamed from: a */
    public final C30722l0 f126524a;

    /* JADX INFO: renamed from: b */
    public final JsonAdapter f126525b;

    /* JADX INFO: renamed from: c */
    public final JsonAdapter f126526c;

    /* JADX INFO: renamed from: d */
    public final JsonAdapter f126527d;

    /* JADX INFO: renamed from: e */
    public final JsonAdapter f126528e;

    /* JADX INFO: renamed from: f */
    public final JsonAdapter f126529f;

    public C30734r0(C30722l0 c30722l0) {
        this.f126524a = c30722l0;
        this.f126525b = c30722l0.m94398a(List.class);
        this.f126526c = c30722l0.m94398a(Map.class);
        this.f126527d = c30722l0.m94398a(String.class);
        this.f126528e = c30722l0.m94398a(Double.class);
        this.f126529f = c30722l0.m94398a(Boolean.class);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        int iOrdinal = jsonReader.mo16731k().ordinal();
        if (iOrdinal == 0) {
            return this.f126525b.fromJson(jsonReader);
        }
        if (iOrdinal == 2) {
            return this.f126526c.fromJson(jsonReader);
        }
        if (iOrdinal == 5) {
            return this.f126527d.fromJson(jsonReader);
        }
        if (iOrdinal == 6) {
            return this.f126528e.fromJson(jsonReader);
        }
        if (iOrdinal == 7) {
            return this.f126529f.fromJson(jsonReader);
        }
        if (iOrdinal == 8) {
            jsonReader.mo16730i();
            return null;
        }
        throw new IllegalStateException("Expected a value but was " + jsonReader.mo16731k() + " at path " + jsonReader.m16727b());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017 A[PHI: r1
      0x0017: PHI (r1v4 java.lang.Class<?>) = (r1v1 java.lang.Class<?>), (r1v2 java.lang.Class<?>) binds: [B:7:0x0015, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(AbstractC30704c0 abstractC30704c0, Object obj) {
        Class<?> cls = obj.getClass();
        if (cls == Object.class) {
            abstractC30704c0.mo94368h();
            abstractC30704c0.mo94370m();
            return;
        }
        Class<?> cls2 = Map.class;
        if (cls2.isAssignableFrom(cls)) {
            cls = cls2;
        } else {
            cls2 = Collection.class;
            if (cls2.isAssignableFrom(cls)) {
                cls = cls2;
            }
        }
        this.f126524a.m94400c(cls, AbstractC31885f.f132390a, null).toJson(abstractC30704c0, obj);
    }

    public final String toString() {
        return "JsonAdapter(Object)";
    }
}
