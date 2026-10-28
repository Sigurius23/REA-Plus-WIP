package cp1;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: cp1.r */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b$\u0010!R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010)\u001a\u0004\b'\u0010\u0019R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010)\u001a\u0004\b&\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b\u001e\u0010!R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001f\u001a\u0004\b,\u0010!R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b*\u0010/R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b,\u0010.\u001a\u0004\b-\u0010/R\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010)\u001a\u0004\b\"\u0010\u0019R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b(\u00100\u001a\u0004\b+\u00101¨\u00062"}, m65681d2 = {"Lcp1/r;", "", "Lcom/whoop/design/util/TextResource;", "navigationTitle", "navigationSubtitle", "title", "descriptionDisplay", "trailingText", "", "minValue", "maxValue", "buttonTitle", "skipTitle", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "nextId", "skipNextId", "currentValue", "Lcp1/c;", NotificationCompat.CATEGORY_PROGRESS, "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;ILcp1/c;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "b", "f", "c", "l", "d", "e", "m", "I", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "k", "j", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "Lcp1/c;", "()Lcp1/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11031r {

    /* JADX INFO: renamed from: n */
    public static final int f34630n = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource navigationTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource navigationSubtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource descriptionDisplay;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource trailingText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int minValue;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int maxValue;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final TextResource buttonTitle;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final TextResource skipTitle;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final HormonalScreenId nextId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final HormonalScreenId skipNextId;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final int currentValue;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C11016c progress;

    public C11031r(TextResource navigationTitle, TextResource navigationSubtitle, TextResource title, TextResource descriptionDisplay, TextResource trailingText, int i13, int i14, TextResource buttonTitle, TextResource skipTitle, HormonalScreenId nextId, HormonalScreenId hormonalScreenId, int i15, C11016c c11016c) {
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(navigationSubtitle, "navigationSubtitle");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(trailingText, "trailingText");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        AbstractC22676k.m65750j(skipTitle, "skipTitle");
        AbstractC22676k.m65750j(nextId, "nextId");
        this.navigationTitle = navigationTitle;
        this.navigationSubtitle = navigationSubtitle;
        this.title = title;
        this.descriptionDisplay = descriptionDisplay;
        this.trailingText = trailingText;
        this.minValue = i13;
        this.maxValue = i14;
        this.buttonTitle = buttonTitle;
        this.skipTitle = skipTitle;
        this.nextId = nextId;
        this.skipNextId = hormonalScreenId;
        this.currentValue = i15;
        this.progress = c11016c;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getButtonTitle() {
        return this.buttonTitle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCurrentValue() {
        return this.currentValue;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getMaxValue() {
        return this.maxValue;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMinValue() {
        return this.minValue;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11031r)) {
            return false;
        }
        C11031r c11031r = (C11031r) other;
        return AbstractC22676k.m65745e(this.navigationTitle, c11031r.navigationTitle) && AbstractC22676k.m65745e(this.navigationSubtitle, c11031r.navigationSubtitle) && AbstractC22676k.m65745e(this.title, c11031r.title) && AbstractC22676k.m65745e(this.descriptionDisplay, c11031r.descriptionDisplay) && AbstractC22676k.m65745e(this.trailingText, c11031r.trailingText) && this.minValue == c11031r.minValue && this.maxValue == c11031r.maxValue && AbstractC22676k.m65745e(this.buttonTitle, c11031r.buttonTitle) && AbstractC22676k.m65745e(this.skipTitle, c11031r.skipTitle) && this.nextId == c11031r.nextId && this.skipNextId == c11031r.skipNextId && this.currentValue == c11031r.currentValue && AbstractC22676k.m65745e(this.progress, c11031r.progress);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getNavigationSubtitle() {
        return this.navigationSubtitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getNavigationTitle() {
        return this.navigationTitle;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final HormonalScreenId getNextId() {
        return this.nextId;
    }

    public int hashCode() {
        int iHashCode = (this.nextId.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11266d.m30448b(this.maxValue, AbstractC11266d.m30448b(this.minValue, AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.navigationTitle.hashCode() * 31, this.navigationSubtitle, 31), this.title, 31), this.descriptionDisplay, 31), this.trailingText, 31), 31), 31), this.buttonTitle, 31), this.skipTitle, 31)) * 31;
        HormonalScreenId hormonalScreenId = this.skipNextId;
        int iM30448b = AbstractC11266d.m30448b(this.currentValue, (iHashCode + (hormonalScreenId == null ? 0 : hormonalScreenId.hashCode())) * 31, 31);
        C11016c c11016c = this.progress;
        return iM30448b + (c11016c != null ? c11016c.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C11016c getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final HormonalScreenId getSkipNextId() {
        return this.skipNextId;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final TextResource getSkipTitle() {
        return this.skipTitle;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final TextResource getTrailingText() {
        return this.trailingText;
    }

    public String toString() {
        TextResource textResource = this.navigationTitle;
        TextResource textResource2 = this.navigationSubtitle;
        TextResource textResource3 = this.title;
        TextResource textResource4 = this.descriptionDisplay;
        TextResource textResource5 = this.trailingText;
        int i13 = this.minValue;
        int i14 = this.maxValue;
        TextResource textResource6 = this.buttonTitle;
        TextResource textResource7 = this.skipTitle;
        HormonalScreenId hormonalScreenId = this.nextId;
        HormonalScreenId hormonalScreenId2 = this.skipNextId;
        int i15 = this.currentValue;
        C11016c c11016c = this.progress;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("TextNumberPickerState(navigationTitle=", textResource, ", navigationSubtitle=", textResource2, ", title=");
        AbstractC30007c.m91855y(sbM106658q, textResource3, ", descriptionDisplay=", textResource4, ", trailingText=");
        sbM106658q.append(textResource5);
        sbM106658q.append(", minValue=");
        sbM106658q.append(i13);
        sbM106658q.append(", maxValue=");
        sbM106658q.append(i14);
        sbM106658q.append(", buttonTitle=");
        sbM106658q.append(textResource6);
        sbM106658q.append(", skipTitle=");
        sbM106658q.append(textResource7);
        sbM106658q.append(", nextId=");
        sbM106658q.append(hormonalScreenId);
        sbM106658q.append(", skipNextId=");
        sbM106658q.append(hormonalScreenId2);
        sbM106658q.append(", currentValue=");
        sbM106658q.append(i15);
        sbM106658q.append(", progress=");
        sbM106658q.append(c11016c);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
