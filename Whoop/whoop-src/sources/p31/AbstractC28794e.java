package p31;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gy0.AbstractC16277f;
import gz0.AbstractC16319p0;
import java.util.List;
import kd1.EnumC22400l;
import n83.C26460c;
import p715kotlin.Metadata;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: p31.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"", "showAddToJournal", "includeStartActivityRevamp", "", "Lp31/b;", "a", "(ZZ)Ljava/util/List;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28794e {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final List<C28791b> m87543a(boolean z4, boolean z13) {
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        int i13 = 2;
        c26460cM119000x.add(new C28791b(AbstractC16319p0.m46430a().getAction().getStartActivity(), new TextResource.C8688b(AbstractC16277f.f62391w0, null, i13, 0 == true ? 1 : 0), EnumC22400l.START_ACTIVITY));
        c26460cM119000x.add(new C28791b(AbstractC16319p0.m46430a().getAction().getAdd(), new TextResource.C8688b(AbstractC16277f.f62375s0, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0), EnumC22400l.ADD_ACTIVITY));
        c26460cM119000x.add(new C28791b(AbstractC16319p0.m46430a().getActivities().getWeightlifting(), new TextResource.C8688b(AbstractC16277f.f62395x0, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0), EnumC22400l.STRENGTH_BUILDER));
        if (z4) {
            c26460cM119000x.add(new C28791b(AbstractC16319p0.m46430a().getAction().getJournal(), new TextResource.C8688b(AbstractC16277f.f62379t0, objArr4 == true ? 1 : 0, i13, objArr3 == true ? 1 : 0), EnumC22400l.JOURNAL));
        }
        c26460cM119000x.add(new C28791b(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getCamera(), new TextResource.C8688b(AbstractC16277f.f62383u0, objArr2 == true ? 1 : 0, i13, objArr == true ? 1 : 0), EnumC22400l.WHOOP_LIVE));
        if (z13) {
            c26460cM119000x.add(new C28791b(AbstractC16319p0.m46430a().getAction().getStartActivity(), AbstractC8693b.m21278l("START ACTIVITY REVAMP"), EnumC22400l.START_ACTIVITY_REVAMP));
        }
        return AbstractC37056f.m118988k(c26460cM119000x);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ List m87544b(boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        return m87543a(z4, z13);
    }
}
