package bm2;

import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: bm2.k0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0012\u0010\r¨\u0006\u0018"}, m65681d2 = {"Lbm2/k0;", "", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "", "icon", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "I", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3454k0 {

    /* JADX INFO: renamed from: d */
    public static final int f13545d = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int icon;

    public C3454k0(TextResource title, TextResource textResource, int i13) {
        AbstractC22676k.m65750j(title, "title");
        this.title = title;
        this.subtitle = textResource;
        this.icon = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3454k0)) {
            return false;
        }
        C3454k0 c3454k0 = (C3454k0) other;
        return AbstractC22676k.m65745e(this.title, c3454k0.title) && AbstractC22676k.m65745e(this.subtitle, c3454k0.subtitle) && this.icon == c3454k0.icon;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        TextResource textResource = this.subtitle;
        return Integer.hashCode(this.icon) + ((iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        return AbstractC18489d0.m53371l(AbstractC33745d.m106658q("SegmentalAnalysisHeaderViewState(title=", textResource, ", subtitle=", textResource2, ", icon="), this.icon, ")");
    }
}
