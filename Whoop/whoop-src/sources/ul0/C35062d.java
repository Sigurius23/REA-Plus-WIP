package ul0;

import com.whoop.design.util.TextResource;
import d13.AbstractC11478a;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: ul0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\u0006\u0010\t\u001a\u00020\u0001\u0012\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010$R\u0017\u0010\t\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b\u0018\u0010$R\u0017\u0010\n\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u001e\u0010#\u001a\u0004\b\u001c\u0010$¨\u0006%"}, m65681d2 = {"Lul0/d;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "", "Lul0/e;", "sleepBounds", "predictionTitle", "hoursOfSleepStat", "consistencyStat", "editButton", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lm91/u;Lm91/u;Lm91/u;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/util/List;", "f", "()Ljava/util/List;", "c", "e", "d", "Lm91/u;", "()Lm91/u;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35062d implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C35063e> sleepBounds;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource predictionTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC25312u hoursOfSleepStat;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC25312u consistencyStat;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC25312u editButton;

    public C35062d(TextResource title, List<C35063e> sleepBounds, TextResource predictionTitle, InterfaceC25312u hoursOfSleepStat, InterfaceC25312u consistencyStat, InterfaceC25312u editButton) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(sleepBounds, "sleepBounds");
        AbstractC22676k.m65750j(predictionTitle, "predictionTitle");
        AbstractC22676k.m65750j(hoursOfSleepStat, "hoursOfSleepStat");
        AbstractC22676k.m65750j(consistencyStat, "consistencyStat");
        AbstractC22676k.m65750j(editButton, "editButton");
        this.title = title;
        this.sleepBounds = sleepBounds;
        this.predictionTitle = predictionTitle;
        this.hoursOfSleepStat = hoursOfSleepStat;
        this.consistencyStat = consistencyStat;
        this.editButton = editButton;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC25312u getConsistencyStat() {
        return this.consistencyStat;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC25312u getEditButton() {
        return this.editButton;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC25312u getHoursOfSleepStat() {
        return this.hoursOfSleepStat;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getPredictionTitle() {
        return this.predictionTitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35062d)) {
            return false;
        }
        C35062d c35062d = (C35062d) other;
        return AbstractC22676k.m65745e(this.title, c35062d.title) && AbstractC22676k.m65745e(this.sleepBounds, c35062d.sleepBounds) && AbstractC22676k.m65745e(this.predictionTitle, c35062d.predictionTitle) && AbstractC22676k.m65745e(this.hoursOfSleepStat, c35062d.hoursOfSleepStat) && AbstractC22676k.m65745e(this.consistencyStat, c35062d.consistencyStat) && AbstractC22676k.m65745e(this.editButton, c35062d.editButton);
    }

    /* JADX INFO: renamed from: f */
    public final List<C35063e> m110862f() {
        return this.sleepBounds;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.editButton.hashCode() + AbstractC11478a.m30851c(this.consistencyStat, AbstractC11478a.m30851c(this.hoursOfSleepStat, AbstractC31061c.m95625a(AbstractC11895b.m31983b(this.title.hashCode() * 31, 31, this.sleepBounds), this.predictionTitle, 31), 31), 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        List<C35063e> list = this.sleepBounds;
        TextResource textResource2 = this.predictionTitle;
        InterfaceC25312u interfaceC25312u = this.hoursOfSleepStat;
        InterfaceC25312u interfaceC25312u2 = this.consistencyStat;
        InterfaceC25312u interfaceC25312u3 = this.editButton;
        StringBuilder sbM106657p = AbstractC33745d.m106657p(textResource, "BedtimeRecommendationTileViewState(title=", ", sleepBounds=", ", predictionTitle=", list);
        sbM106657p.append(textResource2);
        sbM106657p.append(", hoursOfSleepStat=");
        sbM106657p.append(interfaceC25312u);
        sbM106657p.append(", consistencyStat=");
        sbM106657p.append(interfaceC25312u2);
        sbM106657p.append(", editButton=");
        sbM106657p.append(interfaceC25312u3);
        sbM106657p.append(")");
        return sbM106657p.toString();
    }
}
