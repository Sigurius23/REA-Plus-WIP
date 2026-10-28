package sw2;

import ad3.AbstractC0757c;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.Action;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import uw2.C35317b;
import wc3.InterfaceC37138c;

/* JADX INFO: renamed from: sw2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010¨\u0006\u0012"}, m65681d2 = {"T", "Lkotlinx/serialization/json/JsonElement;", "Lad3/c;", "json", "Lwc3/c;", "serializer", "c", "(Lkotlinx/serialization/json/JsonElement;Lad3/c;Lwc3/c;)Ljava/lang/Object;", "Lcom/whoop/navigation/models/GenericInteraction;", "Lcom/whoop/whoopaction/domain/models/Action;", "a", "(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/whoopaction/domain/models/Action;", "Lcom/whoop/analytics/AnalyticEventModel;", "b", "(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/analytics/AnalyticEventModel;", "Ltr2/n;", "Ltr2/n;", "logger", "whoop-action_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33054a {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC34116n f137843a = InterfaceC34116n.INSTANCE.m107848a("GenericInteractionDecoding");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final Action m104670a(GenericInteraction genericInteraction, AbstractC0757c json) {
        AbstractC22676k.m65750j(genericInteraction, "<this>");
        AbstractC22676k.m65750j(json, "json");
        JsonElement action = genericInteraction.getAction();
        Map map = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (action == null) {
            return null;
        }
        return (Action) m104672c(action, json, new C35317b(map, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0));
    }

    /* JADX INFO: renamed from: b */
    public static final AnalyticEventModel m104671b(GenericInteraction genericInteraction, AbstractC0757c json) {
        AbstractC22676k.m65750j(genericInteraction, "<this>");
        AbstractC22676k.m65750j(json, "json");
        JsonElement analyticEvent = genericInteraction.getAnalyticEvent();
        if (analyticEvent != null) {
            return (AnalyticEventModel) m104672c(analyticEvent, json, AnalyticEventModel.INSTANCE.serializer());
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final <T> T m104672c(JsonElement jsonElement, AbstractC0757c json, InterfaceC37138c serializer) {
        AbstractC22676k.m65750j(jsonElement, "<this>");
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(serializer, "serializer");
        try {
            return (T) json.m1830a(serializer, jsonElement);
        } catch (Exception e5) {
            f137843a.mo85230v(AbstractC11895b.m31996o("Failed to decode ", serializer.getDescriptor().getSerialName(), " from GenericInteraction field"), e5, new AbstractC30556a.a[0]);
            return null;
        }
    }
}
