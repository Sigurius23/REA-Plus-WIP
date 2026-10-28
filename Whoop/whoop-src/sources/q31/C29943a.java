package q31;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.whoopaction.domain.models.Action;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: q31.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJX\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u0012R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010$\u001a\u0004\b\u001e\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010&\u001a\u0004\b \u0010'¨\u0006("}, m65681d2 = {"Lq31/a;", "", "", "id", "segmentControlTitle", "segmentControlSubtitle", "", "Lm91/u;", "items", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;)Lq31/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "g", "d", "Ljava/util/List;", "f", "()Ljava/util/List;", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "Lcom/whoop/analytics/AnalyticEventModel;", "()Lcom/whoop/analytics/AnalyticEventModel;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29943a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String segmentControlTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String segmentControlSubtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Action action;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AnalyticEventModel analyticEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public C29943a(String id4, String segmentControlTitle, String str, List<? extends InterfaceC25312u> items, Action action, AnalyticEventModel analyticEventModel) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(segmentControlTitle, "segmentControlTitle");
        AbstractC22676k.m65750j(items, "items");
        this.id = id4;
        this.segmentControlTitle = segmentControlTitle;
        this.segmentControlSubtitle = str;
        this.items = items;
        this.action = action;
        this.analyticEvent = analyticEventModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C29943a m91577b(C29943a c29943a, String str, String str2, String str3, List list, Action action, AnalyticEventModel analyticEventModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c29943a.id;
        }
        if ((i13 & 2) != 0) {
            str2 = c29943a.segmentControlTitle;
        }
        if ((i13 & 4) != 0) {
            str3 = c29943a.segmentControlSubtitle;
        }
        if ((i13 & 8) != 0) {
            list = c29943a.items;
        }
        if ((i13 & 16) != 0) {
            action = c29943a.action;
        }
        if ((i13 & 32) != 0) {
            analyticEventModel = c29943a.analyticEvent;
        }
        Action action2 = action;
        AnalyticEventModel analyticEventModel2 = analyticEventModel;
        return c29943a.m91578a(str, str2, str3, list, action2, analyticEventModel2);
    }

    /* JADX INFO: renamed from: a */
    public final C29943a m91578a(String id4, String segmentControlTitle, String segmentControlSubtitle, List<? extends InterfaceC25312u> items, Action action, AnalyticEventModel analyticEvent) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(segmentControlTitle, "segmentControlTitle");
        AbstractC22676k.m65750j(items, "items");
        return new C29943a(id4, segmentControlTitle, segmentControlSubtitle, items, action, analyticEvent);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29943a)) {
            return false;
        }
        C29943a c29943a = (C29943a) other;
        return AbstractC22676k.m65745e(this.id, c29943a.id) && AbstractC22676k.m65745e(this.segmentControlTitle, c29943a.segmentControlTitle) && AbstractC22676k.m65745e(this.segmentControlSubtitle, c29943a.segmentControlSubtitle) && AbstractC22676k.m65745e(this.items, c29943a.items) && AbstractC22676k.m65745e(this.action, c29943a.action) && AbstractC22676k.m65745e(this.analyticEvent, c29943a.analyticEvent);
    }

    /* JADX INFO: renamed from: f */
    public final List<InterfaceC25312u> m91582f() {
        return this.items;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSegmentControlSubtitle() {
        return this.segmentControlSubtitle;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSegmentControlTitle() {
        return this.segmentControlTitle;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.segmentControlTitle);
        String str = this.segmentControlSubtitle;
        int iM31983b = AbstractC11895b.m31983b((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.items);
        Action action = this.action;
        int iHashCode = (iM31983b + (action == null ? 0 : action.hashCode())) * 31;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        return iHashCode + (analyticEventModel != null ? analyticEventModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.segmentControlTitle;
        String str3 = this.segmentControlSubtitle;
        List<InterfaceC25312u> list = this.items;
        Action action = this.action;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SegmentState(id=", str, ", segmentControlTitle=", str2, ", segmentControlSubtitle=");
        AbstractC36095b.m114694v(str3, ", items=", ", action=", sbM32001t, list);
        sbM32001t.append(action);
        sbM32001t.append(", analyticEvent=");
        sbM32001t.append(analyticEventModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ C29943a(String str, String str2, String str3, List list, Action action, AnalyticEventModel analyticEventModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, list, (i13 & 16) != 0 ? null : action, (i13 & 32) != 0 ? null : analyticEventModel);
    }
}
