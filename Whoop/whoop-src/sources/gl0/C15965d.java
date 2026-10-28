package gl0;

import com.whoop.design.models.items.ArticleTileCarouselModel;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: gl0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lgl0/d;", "", "Lcom/whoop/design/models/items/ArticleTileCarouselModel;", "educationHub", "", "show", "<init>", "(Lcom/whoop/design/models/items/ArticleTileCarouselModel;Z)V", "a", "(Lcom/whoop/design/models/items/ArticleTileCarouselModel;Z)Lgl0/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/ArticleTileCarouselModel;", "c", "()Lcom/whoop/design/models/items/ArticleTileCarouselModel;", "b", "Z", "d", "()Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C15965d {

    /* JADX INFO: renamed from: c */
    public static final int f60434c = ArticleTileCarouselModel.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ArticleTileCarouselModel educationHub;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean show;

    public C15965d(ArticleTileCarouselModel articleTileCarouselModel, boolean z4) {
        this.educationHub = articleTileCarouselModel;
        this.show = z4;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C15965d m45039b(C15965d c15965d, ArticleTileCarouselModel articleTileCarouselModel, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            articleTileCarouselModel = c15965d.educationHub;
        }
        if ((i13 & 2) != 0) {
            z4 = c15965d.show;
        }
        return c15965d.m45040a(articleTileCarouselModel, z4);
    }

    /* JADX INFO: renamed from: a */
    public final C15965d m45040a(ArticleTileCarouselModel educationHub, boolean show) {
        return new C15965d(educationHub, show);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ArticleTileCarouselModel getEducationHub() {
        return this.educationHub;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getShow() {
        return this.show;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15965d)) {
            return false;
        }
        C15965d c15965d = (C15965d) other;
        return AbstractC22676k.m65745e(this.educationHub, c15965d.educationHub) && this.show == c15965d.show;
    }

    public int hashCode() {
        ArticleTileCarouselModel articleTileCarouselModel = this.educationHub;
        return Boolean.hashCode(this.show) + ((articleTileCarouselModel == null ? 0 : articleTileCarouselModel.hashCode()) * 31);
    }

    public String toString() {
        return "EducationHubResult(educationHub=" + this.educationHub + ", show=" + this.show + ")";
    }

    public /* synthetic */ C15965d(ArticleTileCarouselModel articleTileCarouselModel, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : articleTileCarouselModel, (i13 & 2) != 0 ? false : z4);
    }
}
