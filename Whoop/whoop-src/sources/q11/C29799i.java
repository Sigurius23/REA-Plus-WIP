package q11;

import com.whoop.analytics.AnalyticEventModel;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: q11.i */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u0015\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lq11/i;", "", "", "id", "titleDisplay", "descriptionDisplay", "Lm91/u;", "rightItem", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm91/u;Lcom/whoop/analytics/AnalyticEventModel;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "e", "d", "Lm91/u;", "()Lm91/u;", "Lcom/whoop/analytics/AnalyticEventModel;", "()Lcom/whoop/analytics/AnalyticEventModel;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29799i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String titleDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String descriptionDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC25312u rightItem;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AnalyticEventModel analyticEvent;

    public C29799i(String str, String titleDisplay, String descriptionDisplay, InterfaceC25312u interfaceC25312u, AnalyticEventModel analyticEventModel) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        this.id = str;
        this.titleDisplay = titleDisplay;
        this.descriptionDisplay = descriptionDisplay;
        this.rightItem = interfaceC25312u;
        this.analyticEvent = analyticEventModel;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC25312u getRightItem() {
        return this.rightItem;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29799i)) {
            return false;
        }
        C29799i c29799i = (C29799i) other;
        return AbstractC22676k.m65745e(this.id, c29799i.id) && AbstractC22676k.m65745e(this.titleDisplay, c29799i.titleDisplay) && AbstractC22676k.m65745e(this.descriptionDisplay, c29799i.descriptionDisplay) && AbstractC22676k.m65745e(this.rightItem, c29799i.rightItem) && AbstractC22676k.m65745e(this.analyticEvent, c29799i.analyticEvent);
    }

    public int hashCode() {
        String str = this.id;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.titleDisplay), 31, this.descriptionDisplay);
        InterfaceC25312u interfaceC25312u = this.rightItem;
        int iHashCode = (iM30450d + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode())) * 31;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        return iHashCode + (analyticEventModel != null ? analyticEventModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.titleDisplay;
        String str3 = this.descriptionDisplay;
        InterfaceC25312u interfaceC25312u = this.rightItem;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ExpandableRowItemViewState(id=", str, ", titleDisplay=", str2, ", descriptionDisplay=");
        sbM32001t.append(str3);
        sbM32001t.append(", rightItem=");
        sbM32001t.append(interfaceC25312u);
        sbM32001t.append(", analyticEvent=");
        return AbstractC38963t7.m124378h(sbM32001t, analyticEventModel, ")");
    }

    public /* synthetic */ C29799i(String str, String str2, String str3, InterfaceC25312u interfaceC25312u, AnalyticEventModel analyticEventModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, interfaceC25312u, (i13 & 16) != 0 ? null : analyticEventModel);
    }
}
