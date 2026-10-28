package fi0;

import ad3.AbstractC0770m;
import androidx.core.app.NotificationCompat;
import com.whoop.analytics.AnalyticEventModel;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
import n83.C26463f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fi0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lfi0/a;", "Lcom/whoop/analytics/AnalyticEventModel;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Lfi0/a;Lcom/whoop/analytics/AnalyticEventModel;)V", "Lkotlinx/serialization/json/JsonElement;", "", "b", "(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;", "analytics_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14516b {
    /* JADX INFO: renamed from: a */
    public static final void m41429a(InterfaceC14515a interfaceC14515a, AnalyticEventModel event) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(event, "event");
        String name = event.getName();
        String category = event.getCategory();
        String action = event.getAction();
        String label = event.getLabel();
        String value = event.getValue();
        C26463f c26463f = new C26463f();
        for (Map.Entry<String, JsonElement> entry : event.getProperties().entrySet()) {
            String key = entry.getKey();
            JsonElement value2 = entry.getValue();
            c26463f.put(key, value2 != null ? m41430b(value2) : null);
        }
        String source = event.getSource();
        if (source != null) {
            c26463f.put("source", source);
        }
        interfaceC14515a.mo41422d(category, action, label, name, value, c26463f.m78380b());
    }

    /* JADX INFO: renamed from: b */
    private static final Object m41430b(JsonElement jsonElement) {
        if (!(jsonElement instanceof JsonPrimitive)) {
            return jsonElement.toString();
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
        Object objM1843e = AbstractC0770m.m1843e(jsonPrimitive);
        return (objM1843e == null && (objM1843e = AbstractC0770m.m1849k(jsonPrimitive)) == null && (objM1843e = AbstractC0770m.m1845g(jsonPrimitive)) == null) ? jsonPrimitive.getContent() : objM1843e;
    }
}
