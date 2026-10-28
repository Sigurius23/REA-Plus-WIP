package wo1;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.navigation.C9598e;
import com.whoop.whoopaction.domain.models.Action;
import gz0.EnumC16313m0;
import hy0.C17750h1;
import java.util.List;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: wo1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b \u0010)\u001a\u0004\b\"\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u001d\u0010+\u001a\u0004\b\u001b\u0010,R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b'\u0010-\u001a\u0004\b\u001e\u0010.¨\u0006/"}, m65681d2 = {"Lwo1/c;", "", "", "title", "", "Lhy0/h1;", "tags", "Lgz0/m0;", "rightIcon", "", "isEnabled", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "<init>", "(Ljava/lang/String;Ljava/util/List;Lgz0/m0;ZLcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "Ljava/util/List;", "e", "()Ljava/util/List;", "c", "Lgz0/m0;", "d", "()Lgz0/m0;", "Z", "g", "()Z", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "Lcom/whoop/analytics/AnalyticEventModel;", "()Lcom/whoop/analytics/AnalyticEventModel;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37440c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C17750h1> tags;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC16313m0 rightIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isEnabled;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Action action;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final AnalyticEventModel analyticEvent;

    public C37440c(String title, List<C17750h1> list, EnumC16313m0 enumC16313m0, boolean z4, C9598e c9598e, Action action, AnalyticEventModel analyticEventModel) {
        AbstractC22676k.m65750j(title, "title");
        this.title = title;
        this.tags = list;
        this.rightIcon = enumC16313m0;
        this.isEnabled = z4;
        this.destination = c9598e;
        this.action = action;
        this.analyticEvent = analyticEventModel;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC16313m0 getRightIcon() {
        return this.rightIcon;
    }

    /* JADX INFO: renamed from: e */
    public final List<C17750h1> m119863e() {
        return this.tags;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37440c)) {
            return false;
        }
        C37440c c37440c = (C37440c) other;
        return AbstractC22676k.m65745e(this.title, c37440c.title) && AbstractC22676k.m65745e(this.tags, c37440c.tags) && this.rightIcon == c37440c.rightIcon && this.isEnabled == c37440c.isEnabled && AbstractC22676k.m65745e(this.destination, c37440c.destination) && AbstractC22676k.m65745e(this.action, c37440c.action) && AbstractC22676k.m65745e(this.analyticEvent, c37440c.analyticEvent);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        List<C17750h1> list = this.tags;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.rightIcon;
        int iM8289b = AbstractC2875y.m8289b((iHashCode2 + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31, 31, this.isEnabled);
        C9598e c9598e = this.destination;
        int iHashCode3 = (iM8289b + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        Action action = this.action;
        int iHashCode4 = (iHashCode3 + (action == null ? 0 : action.hashCode())) * 31;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        return iHashCode4 + (analyticEventModel != null ? analyticEventModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        List<C17750h1> list = this.tags;
        EnumC16313m0 enumC16313m0 = this.rightIcon;
        boolean z4 = this.isEnabled;
        C9598e c9598e = this.destination;
        Action action = this.action;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("CycleJournalItemState(title=", str, ", tags=", ", rightIcon=", list);
        sbM94766o.append(enumC16313m0);
        sbM94766o.append(", isEnabled=");
        sbM94766o.append(z4);
        sbM94766o.append(", destination=");
        sbM94766o.append(c9598e);
        sbM94766o.append(", action=");
        sbM94766o.append(action);
        sbM94766o.append(", analyticEvent=");
        return AbstractC38963t7.m124378h(sbM94766o, analyticEventModel, ")");
    }
}
