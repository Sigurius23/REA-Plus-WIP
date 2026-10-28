package nh0;

import com.whoop.analytics.AnalyticEventModel;
import java.util.List;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: nh0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0019\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\u0016\u0010\"¨\u0006#"}, m65681d2 = {"Lnh0/c;", "Lm91/u;", "", "id", "title", "summary", "", "footerItems", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "<init>", "(Ljava/lang/String;Lm91/u;Lm91/u;Ljava/util/List;Lcom/whoop/analytics/AnalyticEventModel;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lm91/u;", "e", "()Lm91/u;", "c", "d", "Ljava/util/List;", "()Ljava/util/List;", "Lcom/whoop/analytics/AnalyticEventModel;", "()Lcom/whoop/analytics/AnalyticEventModel;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26719c implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC25312u title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC25312u summary;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<InterfaceC25312u> footerItems;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AnalyticEventModel analyticEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public C26719c(String id4, InterfaceC25312u interfaceC25312u, InterfaceC25312u interfaceC25312u2, List<? extends InterfaceC25312u> footerItems, AnalyticEventModel analyticEventModel) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(footerItems, "footerItems");
        this.id = id4;
        this.title = interfaceC25312u;
        this.summary = interfaceC25312u2;
        this.footerItems = footerItems;
        this.analyticEvent = analyticEventModel;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC25312u> m79443b() {
        return this.footerItems;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC25312u getSummary() {
        return this.summary;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC25312u getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26719c)) {
            return false;
        }
        C26719c c26719c = (C26719c) other;
        return AbstractC22676k.m65745e(this.id, c26719c.id) && AbstractC22676k.m65745e(this.title, c26719c.title) && AbstractC22676k.m65745e(this.summary, c26719c.summary) && AbstractC22676k.m65745e(this.footerItems, c26719c.footerItems) && AbstractC22676k.m65745e(this.analyticEvent, c26719c.analyticEvent);
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        InterfaceC25312u interfaceC25312u = this.title;
        int iHashCode2 = (iHashCode + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode())) * 31;
        InterfaceC25312u interfaceC25312u2 = this.summary;
        int iM31983b = AbstractC11895b.m31983b((iHashCode2 + (interfaceC25312u2 == null ? 0 : interfaceC25312u2.hashCode())) * 31, 31, this.footerItems);
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        return iM31983b + (analyticEventModel != null ? analyticEventModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        InterfaceC25312u interfaceC25312u = this.title;
        InterfaceC25312u interfaceC25312u2 = this.summary;
        List<InterfaceC25312u> list = this.footerItems;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        StringBuilder sb4 = new StringBuilder("SummaryConfirmationWidgetViewState(id=");
        sb4.append(str);
        sb4.append(", title=");
        sb4.append(interfaceC25312u);
        sb4.append(", summary=");
        sb4.append(interfaceC25312u2);
        sb4.append(", footerItems=");
        sb4.append(list);
        sb4.append(", analyticEvent=");
        return AbstractC38963t7.m124378h(sb4, analyticEventModel, ")");
    }

    public /* synthetic */ C26719c(String str, InterfaceC25312u interfaceC25312u, InterfaceC25312u interfaceC25312u2, List list, AnalyticEventModel analyticEventModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : interfaceC25312u, (i13 & 4) != 0 ? null : interfaceC25312u2, (i13 & 8) != 0 ? C25271y.f99162w : list, (i13 & 16) != 0 ? null : analyticEventModel);
    }
}
