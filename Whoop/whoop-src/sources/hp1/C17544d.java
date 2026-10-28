package hp1;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId;
import cp1.C11016c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: hp1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b&\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b\u001d\u0010 R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b$\u0010)\u001a\u0004\b'\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001e\u001a\u0004\b,\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b+\u0010%R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b&\u0010-\u001a\u0004\b(\u0010.¨\u0006/"}, m65681d2 = {"Lhp1/d;", "", "Lcom/whoop/design/util/TextResource;", "navigationTitle", "navigationSubtitle", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "screenId", "title", "description", "buttonTitle", "", "Lhp1/c;", "options", "skipTitle", "skipNextId", "Lcp1/c;", NotificationCompat.CATEGORY_PROGRESS, "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcp1/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "b", "c", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "g", "()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "j", "e", "f", "Ljava/util/List;", "()Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "Lcp1/c;", "()Lcp1/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17544d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource navigationTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource navigationSubtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final HormonalScreenId screenId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource description;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource buttonTitle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<C17543c> options;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final TextResource skipTitle;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final HormonalScreenId skipNextId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C11016c progress;

    public C17544d(TextResource navigationTitle, TextResource navigationSubtitle, HormonalScreenId screenId, TextResource title, TextResource textResource, TextResource buttonTitle, List<C17543c> options, TextResource textResource2, HormonalScreenId hormonalScreenId, C11016c c11016c) {
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(navigationSubtitle, "navigationSubtitle");
        AbstractC22676k.m65750j(screenId, "screenId");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        AbstractC22676k.m65750j(options, "options");
        this.navigationTitle = navigationTitle;
        this.navigationSubtitle = navigationSubtitle;
        this.screenId = screenId;
        this.title = title;
        this.description = textResource;
        this.buttonTitle = buttonTitle;
        this.options = options;
        this.skipTitle = textResource2;
        this.skipNextId = hormonalScreenId;
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

    /* JADX INFO: renamed from: e */
    public final List<C17543c> m49886e() {
        return this.options;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17544d)) {
            return false;
        }
        C17544d c17544d = (C17544d) other;
        return AbstractC22676k.m65745e(this.navigationTitle, c17544d.navigationTitle) && AbstractC22676k.m65745e(this.navigationSubtitle, c17544d.navigationSubtitle) && this.screenId == c17544d.screenId && AbstractC22676k.m65745e(this.title, c17544d.title) && AbstractC22676k.m65745e(this.description, c17544d.description) && AbstractC22676k.m65745e(this.buttonTitle, c17544d.buttonTitle) && AbstractC22676k.m65745e(this.options, c17544d.options) && AbstractC22676k.m65745e(this.skipTitle, c17544d.skipTitle) && this.skipNextId == c17544d.skipNextId && AbstractC22676k.m65745e(this.progress, c17544d.progress);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C11016c getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final HormonalScreenId getScreenId() {
        return this.screenId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final HormonalScreenId getSkipNextId() {
        return this.skipNextId;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a((this.screenId.hashCode() + AbstractC31061c.m95625a(this.navigationTitle.hashCode() * 31, this.navigationSubtitle, 31)) * 31, this.title, 31);
        TextResource textResource = this.description;
        int iM31983b = AbstractC11895b.m31983b(AbstractC31061c.m95625a((iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31, this.buttonTitle, 31), 31, this.options);
        TextResource textResource2 = this.skipTitle;
        int iHashCode = (iM31983b + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        HormonalScreenId hormonalScreenId = this.skipNextId;
        int iHashCode2 = (iHashCode + (hormonalScreenId == null ? 0 : hormonalScreenId.hashCode())) * 31;
        C11016c c11016c = this.progress;
        return iHashCode2 + (c11016c != null ? c11016c.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getSkipTitle() {
        return this.skipTitle;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public String toString() {
        TextResource textResource = this.navigationTitle;
        TextResource textResource2 = this.navigationSubtitle;
        HormonalScreenId hormonalScreenId = this.screenId;
        TextResource textResource3 = this.title;
        TextResource textResource4 = this.description;
        TextResource textResource5 = this.buttonTitle;
        List<C17543c> list = this.options;
        TextResource textResource6 = this.skipTitle;
        HormonalScreenId hormonalScreenId2 = this.skipNextId;
        C11016c c11016c = this.progress;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("MultiSelectState(navigationTitle=", textResource, ", navigationSubtitle=", textResource2, ", screenId=");
        sbM106658q.append(hormonalScreenId);
        sbM106658q.append(", title=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", description=");
        AbstractC30007c.m91855y(sbM106658q, textResource4, ", buttonTitle=", textResource5, ", options=");
        AbstractC30007c.m91852v(textResource6, ", skipTitle=", ", skipNextId=", sbM106658q, list);
        sbM106658q.append(hormonalScreenId2);
        sbM106658q.append(", progress=");
        sbM106658q.append(c11016c);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
