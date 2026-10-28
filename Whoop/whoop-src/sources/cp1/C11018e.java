package cp1;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import p031b9.AbstractC2875y;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: cp1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b(\u0010!R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u001f\u001a\u0004\b\u001e\u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b,\u0010/R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b0\u0010!R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b*\u0010.\u001a\u0004\b1\u0010/R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b\"\u0010/R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b-\u00105¨\u00066"}, m65681d2 = {"Lcp1/e;", "", "Lcom/whoop/design/util/TextResource;", "navigationTitle", "navigationSubtitle", "Lkd1/o;", "imageUrl", "titleDisplay", "descriptionDisplay", "", "isFullImage", "buttonTitle", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "nextId", "skipTitle", "skipNextId", "currentScreenId", "Lcp1/c;", NotificationCompat.CATEGORY_PROGRESS, "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/design/util/TextResource;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcp1/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "b", "e", "c", "Lkd1/o;", "d", "()Lkd1/o;", "i", "Z", "j", "()Z", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "getSkipTitle", "getSkipNextId", "k", "l", "Lcp1/c;", "()Lcp1/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11018e {

    /* JADX INFO: renamed from: m */
    public static final int f34496m;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource navigationTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource navigationSubtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC22403o imageUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource titleDisplay;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource descriptionDisplay;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isFullImage;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource buttonTitle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final HormonalScreenId nextId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final TextResource skipTitle;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final HormonalScreenId skipNextId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final HormonalScreenId currentScreenId;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C11016c progress;

    static {
        int i13 = TextResource.$stable;
        f34496m = i13 | AbstractC22403o.f87638a | i13 | i13;
    }

    public C11018e(TextResource navigationTitle, TextResource navigationSubtitle, AbstractC22403o abstractC22403o, TextResource titleDisplay, TextResource descriptionDisplay, boolean z4, TextResource buttonTitle, HormonalScreenId hormonalScreenId, TextResource textResource, HormonalScreenId hormonalScreenId2, HormonalScreenId currentScreenId, C11016c c11016c) {
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(navigationSubtitle, "navigationSubtitle");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        AbstractC22676k.m65750j(currentScreenId, "currentScreenId");
        this.navigationTitle = navigationTitle;
        this.navigationSubtitle = navigationSubtitle;
        this.imageUrl = abstractC22403o;
        this.titleDisplay = titleDisplay;
        this.descriptionDisplay = descriptionDisplay;
        this.isFullImage = z4;
        this.buttonTitle = buttonTitle;
        this.nextId = hormonalScreenId;
        this.skipTitle = textResource;
        this.skipNextId = hormonalScreenId2;
        this.currentScreenId = currentScreenId;
        this.progress = c11016c;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getButtonTitle() {
        return this.buttonTitle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final HormonalScreenId getCurrentScreenId() {
        return this.currentScreenId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AbstractC22403o getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getNavigationSubtitle() {
        return this.navigationSubtitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11018e)) {
            return false;
        }
        C11018e c11018e = (C11018e) other;
        return AbstractC22676k.m65745e(this.navigationTitle, c11018e.navigationTitle) && AbstractC22676k.m65745e(this.navigationSubtitle, c11018e.navigationSubtitle) && AbstractC22676k.m65745e(this.imageUrl, c11018e.imageUrl) && AbstractC22676k.m65745e(this.titleDisplay, c11018e.titleDisplay) && AbstractC22676k.m65745e(this.descriptionDisplay, c11018e.descriptionDisplay) && this.isFullImage == c11018e.isFullImage && AbstractC22676k.m65745e(this.buttonTitle, c11018e.buttonTitle) && this.nextId == c11018e.nextId && AbstractC22676k.m65745e(this.skipTitle, c11018e.skipTitle) && this.skipNextId == c11018e.skipNextId && this.currentScreenId == c11018e.currentScreenId && AbstractC22676k.m65745e(this.progress, c11018e.progress);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getNavigationTitle() {
        return this.navigationTitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final HormonalScreenId getNextId() {
        return this.nextId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C11016c getProgress() {
        return this.progress;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.navigationTitle.hashCode() * 31, this.navigationSubtitle, 31);
        AbstractC22403o abstractC22403o = this.imageUrl;
        int iM95625a2 = AbstractC31061c.m95625a(AbstractC2875y.m8289b(AbstractC31061c.m95625a(AbstractC31061c.m95625a((iM95625a + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31, this.titleDisplay, 31), this.descriptionDisplay, 31), 31, this.isFullImage), this.buttonTitle, 31);
        HormonalScreenId hormonalScreenId = this.nextId;
        int iHashCode = (iM95625a2 + (hormonalScreenId == null ? 0 : hormonalScreenId.hashCode())) * 31;
        TextResource textResource = this.skipTitle;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        HormonalScreenId hormonalScreenId2 = this.skipNextId;
        int iHashCode3 = (this.currentScreenId.hashCode() + ((iHashCode2 + (hormonalScreenId2 == null ? 0 : hormonalScreenId2.hashCode())) * 31)) * 31;
        C11016c c11016c = this.progress;
        return iHashCode3 + (c11016c != null ? c11016c.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsFullImage() {
        return this.isFullImage;
    }

    public String toString() {
        TextResource textResource = this.navigationTitle;
        TextResource textResource2 = this.navigationSubtitle;
        AbstractC22403o abstractC22403o = this.imageUrl;
        TextResource textResource3 = this.titleDisplay;
        TextResource textResource4 = this.descriptionDisplay;
        boolean z4 = this.isFullImage;
        TextResource textResource5 = this.buttonTitle;
        HormonalScreenId hormonalScreenId = this.nextId;
        TextResource textResource6 = this.skipTitle;
        HormonalScreenId hormonalScreenId2 = this.skipNextId;
        HormonalScreenId hormonalScreenId3 = this.currentScreenId;
        C11016c c11016c = this.progress;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("InformationState(navigationTitle=", textResource, ", navigationSubtitle=", textResource2, ", imageUrl=");
        AbstractC13673n.m38549A(sbM106658q, abstractC22403o, ", titleDisplay=", textResource3, ", descriptionDisplay=");
        AbstractC33745d.m106664w(textResource4, ", isFullImage=", ", buttonTitle=", sbM106658q, z4);
        sbM106658q.append(textResource5);
        sbM106658q.append(", nextId=");
        sbM106658q.append(hormonalScreenId);
        sbM106658q.append(", skipTitle=");
        sbM106658q.append(textResource6);
        sbM106658q.append(", skipNextId=");
        sbM106658q.append(hormonalScreenId2);
        sbM106658q.append(", currentScreenId=");
        sbM106658q.append(hormonalScreenId3);
        sbM106658q.append(", progress=");
        sbM106658q.append(c11016c);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
