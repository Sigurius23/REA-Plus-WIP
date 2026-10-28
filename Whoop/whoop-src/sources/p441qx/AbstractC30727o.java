package p441qx;

import com.squareup.moshi.JsonAdapter;

/* JADX INFO: renamed from: qx.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC30727o extends JsonAdapter {

    /* JADX INFO: renamed from: b */
    public static final C30709f f126513b = new C30709f(2);

    /* JADX INFO: renamed from: a */
    public final JsonAdapter f126514a;

    public AbstractC30727o(JsonAdapter jsonAdapter) {
        this.f126514a = jsonAdapter;
    }

    public final String toString() {
        return this.f126514a + ".collection()";
    }
}
