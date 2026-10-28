package p716lb1;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.calendar.archmini.ArchMiniCalendarModel;
import com.whoop.design.models.items.AnnotatedTextModel;
import com.whoop.design.models.items.DatePillModel;
import com.whoop.design.models.items.DynamicInformationalImageCardModel;
import com.whoop.design.models.items.HistoryListItemModel;
import com.whoop.design.models.items.JournalEntryWidgetModel;
import jb1.C21536b;
import p715kotlin.jvm.functions.Function1;
import p745y81.C39336i;

/* JADX INFO: renamed from: lb1.m */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C23670m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f93859w;

    public /* synthetic */ C23670m(int i13) {
        this.f93859w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f93859w) {
            case 0:
                return AbstractC23676n.m69100c((C23749z0) obj);
            case 1:
                return AbstractC23676n.m69101d((ArchMiniCalendarModel) obj);
            case 2:
                return AbstractC23688p.m69210e((String) obj);
            case 3:
                return AbstractC23688p.m69211f((String) obj);
            case 4:
                return AbstractC23742y.m69686g((C21536b) obj);
            case 5:
                return AbstractC23748z.m69725H((C21536b) obj);
            case 6:
                return AbstractC23748z.m69722E((C21536b) obj);
            case 7:
                return AbstractC23748z.m69754y((C21536b) obj);
            case 8:
                return AbstractC23748z.m69718A((C21536b) obj);
            case 9:
                return AbstractC23677n0.m69112i((C21536b) obj);
            case 10:
                return AbstractC23725v0.m69568c((C23749z0) obj);
            case 11:
                return AbstractC23725v0.m69569d((DatePillModel) obj);
            case 12:
                return AbstractC23737x0.m69640g((C21536b) obj);
            case 13:
                return AbstractC23610d1.m68636j((C21536b) obj);
            case 14:
                return AbstractC23631g1.m68782d((C23749z0) obj);
            case 15:
                return AbstractC23631g1.m68783e((DynamicInformationalImageCardModel) obj);
            case 16:
                return AbstractC23696q1.m69279l((C21536b) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC23696q1.m69280m((C23749z0) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC23696q1.m69281n((AnnotatedTextModel) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC23750z1.m69781o((C21536b) obj);
            case 20:
                return AbstractC23750z1.m69782p((C39336i) obj);
            case 21:
                return AbstractC23590a2.m68255d((C23749z0) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC23590a2.m68256e((HistoryListItemModel) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC23597b2.m68531h((C21536b) obj);
            case 24:
                return AbstractC23679n2.m69141d((C23749z0) obj);
            case 25:
                return AbstractC23679n2.m69142e((JournalEntryWidgetModel) obj);
            case 26:
                return AbstractC23697q2.m69292f((C39336i) obj);
            case 27:
                return AbstractC23697q2.m69293g((C39336i) obj);
            case 28:
                return AbstractC23697q2.m69294h((C39336i) obj);
            default:
                return AbstractC23709s2.m69393k((C21536b) obj);
        }
    }
}
