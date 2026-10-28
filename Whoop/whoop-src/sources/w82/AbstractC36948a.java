package w82;

import com.google.gson.GsonBuilder;
import com.whoop.serialization.gson.JsonElementTypeAdapter;
import kotlinx.serialization.json.JsonElement;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: w82.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lcom/google/gson/GsonBuilder;", "a", "(Lcom/google/gson/GsonBuilder;)Lcom/google/gson/GsonBuilder;", "serialization_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36948a {
    /* JADX INFO: renamed from: a */
    public static final GsonBuilder m118635a(GsonBuilder gsonBuilder) {
        AbstractC22676k.m65750j(gsonBuilder, "<this>");
        gsonBuilder.registerTypeAdapter(JsonElement.class, new JsonElementTypeAdapter());
        return gsonBuilder;
    }
}
