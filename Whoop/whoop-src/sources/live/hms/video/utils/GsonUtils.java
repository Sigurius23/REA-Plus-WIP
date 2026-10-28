package live.hms.video.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Llive/hms/video/utils/GsonUtils;", "", "<init>", "()V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class GsonUtils {
    public static final GsonUtils INSTANCE = new GsonUtils();
    private static final Gson gson;

    static {
        Gson gsonCreate = new GsonBuilder().create();
        AbstractC22676k.m65749i(gsonCreate, "create(...)");
        gson = gsonCreate;
    }

    private GsonUtils() {
    }

    public final Gson getGson() {
        return gson;
    }
}
