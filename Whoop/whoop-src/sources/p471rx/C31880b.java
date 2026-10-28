package p471rx;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import p441qx.AbstractC30704c0;
import p441qx.EnumC30741w;

/* JADX INFO: renamed from: rx.b */
/* JADX INFO: loaded from: classes.dex */
public final class C31880b extends JsonAdapter {

    /* JADX INFO: renamed from: a */
    public final JsonAdapter f132378a;

    public C31880b(JsonAdapter jsonAdapter) {
        this.f132378a = jsonAdapter;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        if (jsonReader.mo16731k() != EnumC30741w.f126546I) {
            return this.f132378a.fromJson(jsonReader);
        }
        jsonReader.mo16730i();
        return null;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(AbstractC30704c0 abstractC30704c0, Object obj) {
        if (obj == null) {
            abstractC30704c0.mo94363J();
        } else {
            this.f132378a.toJson(abstractC30704c0, obj);
        }
    }

    public final String toString() {
        return this.f132378a + ".nullSafe()";
    }
}
