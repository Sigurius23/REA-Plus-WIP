package fm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;
import p000.AbstractC11266d;

/* JADX INFO: renamed from: fm.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C14583m {

    /* JADX INFO: renamed from: a */
    public final long f53658a;

    public C14583m(long j7) {
        this.f53658a = j7;
    }

    /* JADX INFO: renamed from: a */
    public static C14583m m41740a(BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        C14583m c14583m = new C14583m(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return c14583m;
                    }
                    C14583m c14583m2 = new C14583m(jsonReader.nextLong());
                    jsonReader.close();
                    return c14583m2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th3) {
            jsonReader.close();
            throw th3;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C14583m) && this.f53658a == ((C14583m) obj).f53658a;
    }

    public final int hashCode() {
        long j7 = this.f53658a;
        return ((int) ((j7 >>> 32) ^ j7)) ^ 1000003;
    }

    public final String toString() {
        return AbstractC11266d.m30457k(this.f53658a, "}", new StringBuilder("LogResponse{nextRequestWaitMillis="));
    }
}
