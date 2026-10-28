package ri1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.EntryPointModel;
import com.whoop.design.models.items.UpsellCardFeaturesModel;
import com.whoop.health.domain.models.HealthTabResponse;
import com.whoop.health.domain.models.HealthTabSectionModel;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ri1.i */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lri1/i;", "", "<init>", "()V", "item", "", "id", "", "b", "(Ljava/lang/Object;Ljava/lang/String;)Z", "Lcom/whoop/health/domain/models/HealthTabResponse;", "response", "a", "(Lcom/whoop/health/domain/models/HealthTabResponse;Ljava/lang/String;)Lcom/whoop/health/domain/models/HealthTabResponse;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31460i {

    /* JADX INFO: renamed from: a */
    public static final C31460i f129519a = new C31460i();

    private C31460i() {
    }

    /* JADX INFO: renamed from: b */
    private final boolean m96869b(Object item, String id4) {
        if ((item instanceof UpsellCardFeaturesModel) && AbstractC22676k.m65745e(((UpsellCardFeaturesModel) item).getId(), id4)) {
            return true;
        }
        return (item instanceof EntryPointModel) && AbstractC22676k.m65745e(((EntryPointModel) item).getId(), id4);
    }

    /* JADX INFO: renamed from: a */
    public final HealthTabResponse m96870a(HealthTabResponse response, String id4) {
        AbstractC22676k.m65750j(response, "response");
        AbstractC22676k.m65750j(id4, "id");
        List<HealthTabSectionModel> sections = response.getSections();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sections, 10));
        for (HealthTabSectionModel healthTabSectionModel : sections) {
            List<DesignSystemModel> items = healthTabSectionModel.getItems();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : items) {
                if (!f129519a.m96869b((DesignSystemModel) obj, id4)) {
                    arrayList2.add(obj);
                }
            }
            arrayList.add(HealthTabSectionModel.copy$default(healthTabSectionModel, arrayList2, null, 2, null));
        }
        return HealthTabResponse.copy$default(response, arrayList, null, null, null, 14, null);
    }
}
