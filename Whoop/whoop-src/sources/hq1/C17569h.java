package hq1;

import com.whoop.design.models.items.TileTagModel;
import com.whoop.design.util.TextResource;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hq1.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lhq1/h;", "", "", "Lcom/whoop/design/models/items/TileTagModel;", "subTileTags", "Lcom/whoop/design/util/TextResource;", "createdTextDisplay", "<init>", "(Ljava/util/List;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17569h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<TileTagModel> subTileTags;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource createdTextDisplay;

    public C17569h(List<TileTagModel> list, TextResource textResource) {
        this.subTileTags = list;
        this.createdTextDisplay = textResource;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getCreatedTextDisplay() {
        return this.createdTextDisplay;
    }

    /* JADX INFO: renamed from: b */
    public final List<TileTagModel> m50013b() {
        return this.subTileTags;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17569h)) {
            return false;
        }
        C17569h c17569h = (C17569h) other;
        return AbstractC22676k.m65745e(this.subTileTags, c17569h.subTileTags) && AbstractC22676k.m65745e(this.createdTextDisplay, c17569h.createdTextDisplay);
    }

    public int hashCode() {
        List<TileTagModel> list = this.subTileTags;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        TextResource textResource = this.createdTextDisplay;
        return iHashCode + (textResource != null ? textResource.hashCode() : 0);
    }

    public String toString() {
        return "ImpactDetailsSubHeader(subTileTags=" + this.subTileTags + ", createdTextDisplay=" + this.createdTextDisplay + ")";
    }
}
