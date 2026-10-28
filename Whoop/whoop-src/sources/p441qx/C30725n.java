package p441qx;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: qx.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C30725n extends AbstractC30727o {
    public C30725n(JsonAdapter jsonAdapter) {
        super(jsonAdapter);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            linkedHashSet.add(this.f126514a.fromJson(jsonReader));
        }
        jsonReader.endArray();
        return linkedHashSet;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(AbstractC30704c0 abstractC30704c0, Object obj) {
        abstractC30704c0.mo94367b();
        Iterator it = ((Collection) obj).iterator();
        while (it.hasNext()) {
            this.f126514a.toJson(abstractC30704c0, it.next());
        }
        abstractC30704c0.mo94369k();
    }
}
