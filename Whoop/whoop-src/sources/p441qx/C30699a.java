package p441qx;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.Set;

/* JADX INFO: renamed from: qx.a */
/* JADX INFO: loaded from: classes.dex */
public final class C30699a extends JsonAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC30705d f126416a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ JsonAdapter f126417b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC30705d f126418c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Set f126419d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Type f126420e;

    public C30699a(AbstractC30705d abstractC30705d, JsonAdapter jsonAdapter, C30722l0 c30722l0, AbstractC30705d abstractC30705d2, Set set, Type type) {
        this.f126416a = abstractC30705d;
        this.f126417b = jsonAdapter;
        this.f126418c = abstractC30705d2;
        this.f126419d = set;
        this.f126420e = type;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) throws IOException {
        AbstractC30705d abstractC30705d = this.f126418c;
        if (abstractC30705d == null) {
            return this.f126417b.fromJson(jsonReader);
        }
        if (!abstractC30705d.f126447g && jsonReader.mo16731k() == EnumC30741w.f126546I) {
            jsonReader.mo16730i();
            return null;
        }
        try {
            return abstractC30705d.mo94360b(jsonReader);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            throw new JsonDataException(cause + " at " + jsonReader.m16727b(), cause);
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(AbstractC30704c0 abstractC30704c0, Object obj) throws IOException {
        AbstractC30705d abstractC30705d = this.f126416a;
        if (abstractC30705d == null) {
            this.f126417b.toJson(abstractC30704c0, obj);
            return;
        }
        if (!abstractC30705d.f126447g && obj == null) {
            abstractC30704c0.mo94363J();
            return;
        }
        try {
            abstractC30705d.mo94361d(abstractC30704c0, obj);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            throw new JsonDataException(cause + " at " + abstractC30704c0.m94380s(), cause);
        }
    }

    public final String toString() {
        return "JsonAdapter" + this.f126419d + "(" + this.f126420e + ")";
    }
}
