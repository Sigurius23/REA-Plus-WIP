package p441qx;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: qx.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C30719k {

    /* JADX INFO: renamed from: a */
    public final String f126494a;

    /* JADX INFO: renamed from: b */
    public final Field f126495b;

    /* JADX INFO: renamed from: c */
    public final JsonAdapter f126496c;

    public C30719k(String str, Field field, JsonAdapter jsonAdapter) {
        this.f126494a = str;
        this.f126495b = field;
        this.f126496c = jsonAdapter;
    }

    /* JADX INFO: renamed from: a */
    public final void m94394a(JsonReader jsonReader, Object obj) throws IllegalAccessException {
        this.f126495b.set(obj, this.f126496c.fromJson(jsonReader));
    }

    /* JADX INFO: renamed from: b */
    public final void m94395b(AbstractC30704c0 abstractC30704c0, Object obj) throws IllegalAccessException {
        this.f126496c.toJson(abstractC30704c0, this.f126495b.get(obj));
    }
}
