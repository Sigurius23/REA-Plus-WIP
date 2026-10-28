package so1;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import java.util.List;
import kd1.AbstractC22403o;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: so1.e0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\"\u0010(\u001a\u0004\b \u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b&\u0010*\u001a\u0004\b\u001b\u0010+¨\u0006,"}, m65681d2 = {"Lso1/e0;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "titleDisplay", "descriptionDisplay", "Lkd1/o;", "imageUrl", "", "Lso1/j0;", "phaseStats", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/analytics/AnalyticEventModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "b", "c", "Lkd1/o;", "e", "()Lkd1/o;", "d", "Ljava/util/List;", "f", "()Ljava/util/List;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "Lcom/whoop/analytics/AnalyticEventModel;", "()Lcom/whoop/analytics/AnalyticEventModel;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32811e0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource titleDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource descriptionDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC22403o imageUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C32821j0> phaseStats;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AnalyticEventModel analyticEvent;

    public C32811e0(TextResource titleDisplay, TextResource descriptionDisplay, AbstractC22403o abstractC22403o, List<C32821j0> phaseStats, C9598e c9598e, AnalyticEventModel analyticEventModel) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(phaseStats, "phaseStats");
        this.titleDisplay = titleDisplay;
        this.descriptionDisplay = descriptionDisplay;
        this.imageUrl = abstractC22403o;
        this.phaseStats = phaseStats;
        this.destination = c9598e;
        this.analyticEvent = analyticEventModel;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final AbstractC22403o getImageUrl() {
        return this.imageUrl;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32811e0)) {
            return false;
        }
        C32811e0 c32811e0 = (C32811e0) other;
        return AbstractC22676k.m65745e(this.titleDisplay, c32811e0.titleDisplay) && AbstractC22676k.m65745e(this.descriptionDisplay, c32811e0.descriptionDisplay) && AbstractC22676k.m65745e(this.imageUrl, c32811e0.imageUrl) && AbstractC22676k.m65745e(this.phaseStats, c32811e0.phaseStats) && AbstractC22676k.m65745e(this.destination, c32811e0.destination) && AbstractC22676k.m65745e(this.analyticEvent, c32811e0.analyticEvent);
    }

    /* JADX INFO: renamed from: f */
    public final List<C32821j0> m102958f() {
        return this.phaseStats;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.titleDisplay.hashCode() * 31, this.descriptionDisplay, 31);
        AbstractC22403o abstractC22403o = this.imageUrl;
        int iM31983b = AbstractC11895b.m31983b((iM95625a + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31, 31, this.phaseStats);
        C9598e c9598e = this.destination;
        int iHashCode = (iM31983b + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        return iHashCode + (analyticEventModel != null ? analyticEventModel.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.titleDisplay;
        TextResource textResource2 = this.descriptionDisplay;
        AbstractC22403o abstractC22403o = this.imageUrl;
        List<C32821j0> list = this.phaseStats;
        C9598e c9598e = this.destination;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("PhaseCoachingTileViewState(titleDisplay=", textResource, ", descriptionDisplay=", textResource2, ", imageUrl=");
        sbM106658q.append(abstractC22403o);
        sbM106658q.append(", phaseStats=");
        sbM106658q.append(list);
        sbM106658q.append(", destination=");
        sbM106658q.append(c9598e);
        sbM106658q.append(", analyticEvent=");
        sbM106658q.append(analyticEventModel);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
