package n01;

import ad3.AbstractC0770m;
import com.whoop.whoopaction.domain.models.StateUpdateAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.json.JsonArray;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: n01.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Ln01/a;", "", "<init>", "()V", "", "listId", "", "orderedCellIds", "", "selectedCellIds", "stateUpdateValueKey", "a", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Set;Ljava/lang/String;)Ljava/lang/Object;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26084a {

    /* JADX INFO: renamed from: a */
    public static final C26084a f103310a = new C26084a();

    private C26084a() {
    }

    /* JADX INFO: renamed from: a */
    public final Object m77578a(String listId, List<String> orderedCellIds, Set<String> selectedCellIds, String stateUpdateValueKey) {
        AbstractC22676k.m65750j(listId, "listId");
        AbstractC22676k.m65750j(orderedCellIds, "orderedCellIds");
        AbstractC22676k.m65750j(selectedCellIds, "selectedCellIds");
        ArrayList arrayList = new ArrayList();
        for (Object obj : orderedCellIds) {
            if (selectedCellIds.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        List listM74159y0 = AbstractC25265s.m74159y0(arrayList);
        if (stateUpdateValueKey == null) {
            return new C26089f(listId, listM74159y0);
        }
        List list = listM74159y0;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(AbstractC0770m.m1841c((String) it.next()));
        }
        return new StateUpdateAction(AbstractC25247g0.m73989X(new C23465k(stateUpdateValueKey, new JsonArray(arrayList2))), false, 2, (DefaultConstructorMarker) null);
    }
}
