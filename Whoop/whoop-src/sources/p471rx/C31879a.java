package p471rx;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import p441qx.AbstractC30704c0;
import p441qx.EnumC30741w;

/* JADX INFO: renamed from: rx.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C31879a extends JsonAdapter {

    /* JADX INFO: renamed from: a */
    public final JsonAdapter f132377a;

    public C31879a(JsonAdapter jsonAdapter) {
        this.f132377a = jsonAdapter;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        if (jsonReader.mo16731k() != EnumC30741w.f126546I) {
            return this.f132377a.fromJson(jsonReader);
        }
        throw new JsonDataException("Unexpected null at " + jsonReader.m16727b());
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(AbstractC30704c0 abstractC30704c0, Object obj) {
        if (obj != null) {
            this.f132377a.toJson(abstractC30704c0, obj);
        } else {
            throw new JsonDataException("Unexpected null at " + abstractC30704c0.m94380s());
        }
    }

    public final String toString() {
        return this.f132377a + ".nonNull()";
    }
}
