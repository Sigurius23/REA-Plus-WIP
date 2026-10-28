package cp1;

import androidx.core.app.NotificationCompat;
import c13.AbstractC3855a;
import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: cp1.g */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b#\u0010\"R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b!\u0010'\u001a\u0004\b%\u0010(R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b\u001f\u0010\"R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\"R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b)\u0010.R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b/\u0010.R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b+\u00100\u001a\u0004\b,\u00101R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b&\u00102\u001a\u0004\b*\u00103¨\u00064"}, m65681d2 = {"Lcp1/g;", "", "Lcom/whoop/design/util/TextResource;", "navigationTitle", "navigationSubtitle", "title", "descriptionDisplay", "", "", "Lcp1/p;", "months", "buttonTitle", "skipTitle", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "nextId", "skipNextId", "", "", "selectedDays", "Lcp1/c;", NotificationCompat.CATEGORY_PROGRESS, "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/Map;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Ljava/util/List;Lcp1/c;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "d", "c", "k", "Ljava/util/Map;", "()Ljava/util/Map;", "f", "g", "j", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "i", "Ljava/util/List;", "()Ljava/util/List;", "Lcp1/c;", "()Lcp1/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11020g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource navigationTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource navigationSubtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource descriptionDisplay;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Map<Integer, C11029p> months;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource buttonTitle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource skipTitle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final HormonalScreenId nextId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final HormonalScreenId skipNextId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final List<String> selectedDays;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C11016c progress;

    public C11020g(TextResource navigationTitle, TextResource navigationSubtitle, TextResource title, TextResource descriptionDisplay, Map<Integer, C11029p> months, TextResource buttonTitle, TextResource skipTitle, HormonalScreenId nextId, HormonalScreenId skipNextId, List<String> list, C11016c c11016c) {
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(navigationSubtitle, "navigationSubtitle");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(months, "months");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        AbstractC22676k.m65750j(skipTitle, "skipTitle");
        AbstractC22676k.m65750j(nextId, "nextId");
        AbstractC22676k.m65750j(skipNextId, "skipNextId");
        this.navigationTitle = navigationTitle;
        this.navigationSubtitle = navigationSubtitle;
        this.title = title;
        this.descriptionDisplay = descriptionDisplay;
        this.months = months;
        this.buttonTitle = buttonTitle;
        this.skipTitle = skipTitle;
        this.nextId = nextId;
        this.skipNextId = skipNextId;
        this.selectedDays = list;
        this.progress = c11016c;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getButtonTitle() {
        return this.buttonTitle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    /* JADX INFO: renamed from: c */
    public final Map<Integer, C11029p> m29597c() {
        return this.months;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getNavigationSubtitle() {
        return this.navigationSubtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getNavigationTitle() {
        return this.navigationTitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11020g)) {
            return false;
        }
        C11020g c11020g = (C11020g) other;
        return AbstractC22676k.m65745e(this.navigationTitle, c11020g.navigationTitle) && AbstractC22676k.m65745e(this.navigationSubtitle, c11020g.navigationSubtitle) && AbstractC22676k.m65745e(this.title, c11020g.title) && AbstractC22676k.m65745e(this.descriptionDisplay, c11020g.descriptionDisplay) && AbstractC22676k.m65745e(this.months, c11020g.months) && AbstractC22676k.m65745e(this.buttonTitle, c11020g.buttonTitle) && AbstractC22676k.m65745e(this.skipTitle, c11020g.skipTitle) && this.nextId == c11020g.nextId && this.skipNextId == c11020g.skipNextId && AbstractC22676k.m65745e(this.selectedDays, c11020g.selectedDays) && AbstractC22676k.m65745e(this.progress, c11020g.progress);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final HormonalScreenId getNextId() {
        return this.nextId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C11016c getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: h */
    public final List<String> m29602h() {
        return this.selectedDays;
    }

    public int hashCode() {
        int iHashCode = (this.skipNextId.hashCode() + ((this.nextId.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC3855a.m11821e(this.months, AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.navigationTitle.hashCode() * 31, this.navigationSubtitle, 31), this.title, 31), this.descriptionDisplay, 31), 31), this.buttonTitle, 31), this.skipTitle, 31)) * 31)) * 31;
        List<String> list = this.selectedDays;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        C11016c c11016c = this.progress;
        return iHashCode2 + (c11016c != null ? c11016c.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final HormonalScreenId getSkipNextId() {
        return this.skipNextId;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextResource getSkipTitle() {
        return this.skipTitle;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public String toString() {
        TextResource textResource = this.navigationTitle;
        TextResource textResource2 = this.navigationSubtitle;
        TextResource textResource3 = this.title;
        TextResource textResource4 = this.descriptionDisplay;
        Map<Integer, C11029p> map = this.months;
        TextResource textResource5 = this.buttonTitle;
        TextResource textResource6 = this.skipTitle;
        HormonalScreenId hormonalScreenId = this.nextId;
        HormonalScreenId hormonalScreenId2 = this.skipNextId;
        List<String> list = this.selectedDays;
        C11016c c11016c = this.progress;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("MciDateInputState(navigationTitle=", textResource, ", navigationSubtitle=", textResource2, ", title=");
        AbstractC30007c.m91855y(sbM106658q, textResource3, ", descriptionDisplay=", textResource4, ", months=");
        sbM106658q.append(map);
        sbM106658q.append(", buttonTitle=");
        sbM106658q.append(textResource5);
        sbM106658q.append(", skipTitle=");
        sbM106658q.append(textResource6);
        sbM106658q.append(", nextId=");
        sbM106658q.append(hormonalScreenId);
        sbM106658q.append(", skipNextId=");
        sbM106658q.append(hormonalScreenId2);
        sbM106658q.append(", selectedDays=");
        sbM106658q.append(list);
        sbM106658q.append(", progress=");
        sbM106658q.append(c11016c);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
