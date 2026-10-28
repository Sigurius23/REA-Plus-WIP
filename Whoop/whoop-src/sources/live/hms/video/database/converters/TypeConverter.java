package live.hms.video.database.converters;

import com.google.gson.reflect.TypeToken;
import java.util.HashMap;
import live.hms.video.utils.GsonUtils;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m65681d2 = {"Llive/hms/video/database/converters/TypeConverter;", "", "<init>", "()V", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class TypeConverter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0007j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001`\u00052\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\tJ1\u0010\n\u001a\u00020\u00062\"\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0007j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001`\u0005H\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m65681d2 = {"Llive/hms/video/database/converters/TypeConverter$Companion;", "", "<init>", "()V", "toHashMap", "Lkotlin/collections/HashMap;", "", "Ljava/util/HashMap;", "value", "(Ljava/lang/String;)Ljava/util/HashMap;", "mapToString", "(Ljava/util/HashMap;)Ljava/lang/String;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String mapToString(HashMap<String, Object> value) {
            AbstractC22676k.m65750j(value, "value");
            String json = GsonUtils.INSTANCE.getGson().toJson(value);
            AbstractC22676k.m65749i(json, "toJson(...)");
            return json;
        }

        public final HashMap<String, Object> toHashMap(String value) {
            AbstractC22676k.m65750j(value, "value");
            Object objFromJson = GsonUtils.INSTANCE.getGson().fromJson(value, new TypeToken<HashMap<String, Object>>() { // from class: live.hms.video.database.converters.TypeConverter$Companion$toHashMap$1
            }.getType());
            AbstractC22676k.m65749i(objFromJson, "fromJson(...)");
            return (HashMap) objFromJson;
        }

        private Companion() {
        }
    }

    public static final String mapToString(HashMap<String, Object> map) {
        return INSTANCE.mapToString(map);
    }

    public static final HashMap<String, Object> toHashMap(String str) {
        return INSTANCE.toHashMap(str);
    }
}
