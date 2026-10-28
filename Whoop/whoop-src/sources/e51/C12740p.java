package e51;

import com.whoop.analytics.AnalyticEventModel;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: e51.p */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Le51/p;", "", "", "nameDisplay", "id", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lcom/whoop/analytics/AnalyticEventModel;", "()Lcom/whoop/analytics/AnalyticEventModel;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12740p {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String nameDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AnalyticEventModel analyticEvent;

    public C12740p(String nameDisplay, String id4, AnalyticEventModel analyticEventModel) {
        AbstractC22676k.m65750j(nameDisplay, "nameDisplay");
        AbstractC22676k.m65750j(id4, "id");
        this.nameDisplay = nameDisplay;
        this.id = id4;
        this.analyticEvent = analyticEventModel;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getNameDisplay() {
        return this.nameDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12740p)) {
            return false;
        }
        C12740p c12740p = (C12740p) other;
        return AbstractC22676k.m65745e(this.nameDisplay, c12740p.nameDisplay) && AbstractC22676k.m65745e(this.id, c12740p.id) && AbstractC22676k.m65745e(this.analyticEvent, c12740p.analyticEvent);
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.nameDisplay.hashCode() * 31, 31, this.id);
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        return iM30450d + (analyticEventModel == null ? 0 : analyticEventModel.hashCode());
    }

    public String toString() {
        String str = this.nameDisplay;
        String str2 = this.id;
        return AbstractC38963t7.m124378h(AbstractC11895b.m32001t("SegmentedControlDisplayState(nameDisplay=", str, ", id=", str2, ", analyticEvent="), this.analyticEvent, ")");
    }

    public /* synthetic */ C12740p(String str, String str2, AnalyticEventModel analyticEventModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? null : analyticEventModel);
    }
}
