package p441qx;

import com.squareup.moshi.JsonReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: qx.m */
/* JADX INFO: loaded from: classes.dex */
public final class C30723m extends AbstractC30727o {
    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(this.f126514a.fromJson(jsonReader));
        }
        jsonReader.endArray();
        return arrayList;
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
