package p441qx;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import p471rx.AbstractC31885f;

/* JADX INFO: renamed from: qx.g */
/* JADX INFO: loaded from: classes.dex */
public final class C30711g extends JsonAdapter {

    /* JADX INFO: renamed from: d */
    public static final C30709f f126456d = new C30709f(0);

    /* JADX INFO: renamed from: e */
    public static final C30709f f126457e = new C30709f(3);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f126458a = 0;

    /* JADX INFO: renamed from: b */
    public final JsonAdapter f126459b;

    /* JADX INFO: renamed from: c */
    public final Object f126460c;

    public C30711g(C30722l0 c30722l0, Type type, Type type2) {
        Set set = AbstractC31885f.f132390a;
        this.f126459b = c30722l0.m94400c(type, set, null);
        this.f126460c = c30722l0.m94400c(type2, set, null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        switch (this.f126458a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(this.f126459b.fromJson(jsonReader));
                }
                jsonReader.endArray();
                Object objNewInstance = Array.newInstance((Class<?>) this.f126460c, arrayList.size());
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    Array.set(objNewInstance, i13, arrayList.get(i13));
                }
                return objNewInstance;
            default:
                C30714h0 c30714h0 = new C30714h0();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    jsonReader.mo16735s();
                    Object objFromJson = this.f126459b.fromJson(jsonReader);
                    Object objFromJson2 = ((JsonAdapter) this.f126460c).fromJson(jsonReader);
                    Object objPut = c30714h0.put(objFromJson, objFromJson2);
                    if (objPut != null) {
                        throw new JsonDataException("Map key '" + objFromJson + "' has multiple values at path " + jsonReader.m16727b() + ": " + objPut + " and " + objFromJson2);
                    }
                }
                jsonReader.endObject();
                return c30714h0;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(AbstractC30704c0 abstractC30704c0, Object obj) {
        switch (this.f126458a) {
            case 0:
                abstractC30704c0.mo94367b();
                int length = Array.getLength(obj);
                for (int i13 = 0; i13 < length; i13++) {
                    this.f126459b.toJson(abstractC30704c0, Array.get(obj, i13));
                }
                abstractC30704c0.mo94369k();
                return;
            default:
                abstractC30704c0.mo94368h();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    if (entry.getKey() == null) {
                        throw new JsonDataException("Map key is null at " + abstractC30704c0.m94380s());
                    }
                    int iM94376T = abstractC30704c0.m94376T();
                    if (iM94376T != 5 && iM94376T != 3) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    abstractC30704c0.f126435H = true;
                    this.f126459b.toJson(abstractC30704c0, entry.getKey());
                    ((JsonAdapter) this.f126460c).toJson(abstractC30704c0, entry.getValue());
                }
                abstractC30704c0.mo94370m();
                return;
        }
    }

    public final String toString() {
        switch (this.f126458a) {
            case 0:
                return this.f126459b + ".array()";
            default:
                return "JsonAdapter(" + this.f126459b + "=" + ((JsonAdapter) this.f126460c) + ")";
        }
    }

    public C30711g(Class cls, JsonAdapter jsonAdapter) {
        this.f126460c = cls;
        this.f126459b = jsonAdapter;
    }
}
