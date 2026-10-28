package p441qx;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: qx.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C30718j0 extends JsonAdapter {

    /* JADX INFO: renamed from: a */
    public final Type f126490a;

    /* JADX INFO: renamed from: b */
    public final String f126491b;

    /* JADX INFO: renamed from: c */
    public final Object f126492c;

    /* JADX INFO: renamed from: d */
    public JsonAdapter f126493d;

    public C30718j0(Type type, String str, Object obj) {
        this.f126490a = type;
        this.f126491b = str;
        this.f126492c = obj;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        JsonAdapter jsonAdapter = this.f126493d;
        if (jsonAdapter != null) {
            return jsonAdapter.fromJson(jsonReader);
        }
        throw new IllegalStateException("JsonAdapter isn't ready");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(AbstractC30704c0 abstractC30704c0, Object obj) {
        JsonAdapter jsonAdapter = this.f126493d;
        if (jsonAdapter == null) {
            throw new IllegalStateException("JsonAdapter isn't ready");
        }
        jsonAdapter.toJson(abstractC30704c0, obj);
    }

    public final String toString() {
        JsonAdapter jsonAdapter = this.f126493d;
        return jsonAdapter != null ? jsonAdapter.toString() : super.toString();
    }
}
