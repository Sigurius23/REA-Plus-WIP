package cp1;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId;
import hp1.C17543c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: cp1.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b'\u0010&R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b(\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b#\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b\u001f\u0010&R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b,\u0010/R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010$\u001a\u0004\b0\u0010&R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010 \u001a\u0004\b)\u0010\"R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010 \u001a\u0004\b1\u0010\"R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b(\u00102\u001a\u0004\b-\u00103¨\u00064"}, m65681d2 = {"Lcp1/h;", "", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "screenId", "Lcom/whoop/design/util/TextResource;", "navigationTitle", "navigationSubtitle", "title", "description", "", "optionLimit", "buttonTitle", "", "Lhp1/c;", "options", "skipTitle", "nextId", "skipNextId", "Lcp1/c;", NotificationCompat.CATEGORY_PROGRESS, "<init>", "(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcp1/c;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "i", "()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "b", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "c", "l", "e", "f", "I", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/util/List;", "()Ljava/util/List;", "k", "j", "Lcp1/c;", "()Lcp1/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11021h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final HormonalScreenId screenId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource navigationTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource navigationSubtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource description;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int optionLimit;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource buttonTitle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final List<C17543c> options;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final TextResource skipTitle;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final HormonalScreenId nextId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final HormonalScreenId skipNextId;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C11016c progress;

    public C11021h(HormonalScreenId screenId, TextResource navigationTitle, TextResource navigationSubtitle, TextResource title, TextResource textResource, int i13, TextResource buttonTitle, List<C17543c> options, TextResource textResource2, HormonalScreenId hormonalScreenId, HormonalScreenId hormonalScreenId2, C11016c c11016c) {
        AbstractC22676k.m65750j(screenId, "screenId");
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(navigationSubtitle, "navigationSubtitle");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        AbstractC22676k.m65750j(options, "options");
        this.screenId = screenId;
        this.navigationTitle = navigationTitle;
        this.navigationSubtitle = navigationSubtitle;
        this.title = title;
        this.description = textResource;
        this.optionLimit = i13;
        this.buttonTitle = buttonTitle;
        this.options = options;
        this.skipTitle = textResource2;
        this.nextId = hormonalScreenId;
        this.skipNextId = hormonalScreenId2;
        this.progress = c11016c;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getButtonTitle() {
        return this.buttonTitle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getNavigationSubtitle() {
        return this.navigationSubtitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getNavigationTitle() {
        return this.navigationTitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final HormonalScreenId getNextId() {
        return this.nextId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11021h)) {
            return false;
        }
        C11021h c11021h = (C11021h) other;
        return this.screenId == c11021h.screenId && AbstractC22676k.m65745e(this.navigationTitle, c11021h.navigationTitle) && AbstractC22676k.m65745e(this.navigationSubtitle, c11021h.navigationSubtitle) && AbstractC22676k.m65745e(this.title, c11021h.title) && AbstractC22676k.m65745e(this.description, c11021h.description) && this.optionLimit == c11021h.optionLimit && AbstractC22676k.m65745e(this.buttonTitle, c11021h.buttonTitle) && AbstractC22676k.m65745e(this.options, c11021h.options) && AbstractC22676k.m65745e(this.skipTitle, c11021h.skipTitle) && this.nextId == c11021h.nextId && this.skipNextId == c11021h.skipNextId && AbstractC22676k.m65745e(this.progress, c11021h.progress);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getOptionLimit() {
        return this.optionLimit;
    }

    /* JADX INFO: renamed from: g */
    public final List<C17543c> m29612g() {
        return this.options;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C11016c getProgress() {
        return this.progress;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.screenId.hashCode() * 31, this.navigationTitle, 31), this.navigationSubtitle, 31), this.title, 31);
        TextResource textResource = this.description;
        int iM31983b = AbstractC11895b.m31983b(AbstractC31061c.m95625a(AbstractC11266d.m30448b(this.optionLimit, (iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31, 31), this.buttonTitle, 31), 31, this.options);
        TextResource textResource2 = this.skipTitle;
        int iHashCode = (iM31983b + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        HormonalScreenId hormonalScreenId = this.nextId;
        int iHashCode2 = (iHashCode + (hormonalScreenId == null ? 0 : hormonalScreenId.hashCode())) * 31;
        HormonalScreenId hormonalScreenId2 = this.skipNextId;
        int iHashCode3 = (iHashCode2 + (hormonalScreenId2 == null ? 0 : hormonalScreenId2.hashCode())) * 31;
        C11016c c11016c = this.progress;
        return iHashCode3 + (c11016c != null ? c11016c.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final HormonalScreenId getScreenId() {
        return this.screenId;
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

    public String toString() {
        HormonalScreenId hormonalScreenId = this.screenId;
        TextResource textResource = this.navigationTitle;
        TextResource textResource2 = this.navigationSubtitle;
        TextResource textResource3 = this.title;
        TextResource textResource4 = this.description;
        int i13 = this.optionLimit;
        TextResource textResource5 = this.buttonTitle;
        List<C17543c> list = this.options;
        TextResource textResource6 = this.skipTitle;
        HormonalScreenId hormonalScreenId2 = this.nextId;
        HormonalScreenId hormonalScreenId3 = this.skipNextId;
        C11016c c11016c = this.progress;
        StringBuilder sb4 = new StringBuilder("MciMultiSelectState(screenId=");
        sb4.append(hormonalScreenId);
        sb4.append(", navigationTitle=");
        sb4.append(textResource);
        sb4.append(", navigationSubtitle=");
        AbstractC30007c.m91855y(sb4, textResource2, ", title=", textResource3, ", description=");
        sb4.append(textResource4);
        sb4.append(", optionLimit=");
        sb4.append(i13);
        sb4.append(", buttonTitle=");
        AbstractC21702c.m61143n(textResource5, ", options=", ", skipTitle=", sb4, list);
        sb4.append(textResource6);
        sb4.append(", nextId=");
        sb4.append(hormonalScreenId2);
        sb4.append(", skipNextId=");
        sb4.append(hormonalScreenId3);
        sb4.append(", progress=");
        sb4.append(c11016c);
        sb4.append(")");
        return sb4.toString();
    }
}
