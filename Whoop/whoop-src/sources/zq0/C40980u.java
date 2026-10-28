package zq0;

import com.whoop.design.util.TextResource;
import java.util.List;
import jh3.AbstractC21702c;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p736sz0.C33210q;
import p745y81.EnumC39333f;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: zq0.u */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b\u001a\u0010%R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b\u001e\u0010#R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b \u0010'¨\u0006("}, m65681d2 = {"Lzq0/u;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "Ly81/f;", "subtitleColor", "Lkd1/o;", "image", "imageBackgroundColor", "", "Lsz0/q;", "stats", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Lkd1/o;Ly81/f;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "b", "d", "c", "Ly81/f;", "e", "()Ly81/f;", "Lkd1/o;", "()Lkd1/o;", "Ljava/util/List;", "()Ljava/util/List;", "community-everyday-stats_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40980u implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC39333f subtitleColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC39333f imageBackgroundColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<C33210q> stats;

    public C40980u(TextResource title, TextResource subtitle, EnumC39333f subtitleColor, AbstractC22403o image, EnumC39333f imageBackgroundColor, List<C33210q> stats) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(subtitleColor, "subtitleColor");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(imageBackgroundColor, "imageBackgroundColor");
        AbstractC22676k.m65750j(stats, "stats");
        this.title = title;
        this.subtitle = subtitle;
        this.subtitleColor = subtitleColor;
        this.image = image;
        this.imageBackgroundColor = imageBackgroundColor;
        this.stats = stats;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC39333f getImageBackgroundColor() {
        return this.imageBackgroundColor;
    }

    /* JADX INFO: renamed from: c */
    public final List<C33210q> m133064c() {
        return this.stats;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC39333f getSubtitleColor() {
        return this.subtitleColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40980u)) {
            return false;
        }
        C40980u c40980u = (C40980u) other;
        return AbstractC22676k.m65745e(this.title, c40980u.title) && AbstractC22676k.m65745e(this.subtitle, c40980u.subtitle) && this.subtitleColor == c40980u.subtitleColor && AbstractC22676k.m65745e(this.image, c40980u.image) && this.imageBackgroundColor == c40980u.imageBackgroundColor && AbstractC22676k.m65745e(this.stats, c40980u.stats);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.stats.hashCode() + AbstractC21702c.m61132c(this.imageBackgroundColor, AbstractC30007c.m91833c(this.image, AbstractC21702c.m61132c(this.subtitleColor, AbstractC31061c.m95625a(this.title.hashCode() * 31, this.subtitle, 31), 31), 31), 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        EnumC39333f enumC39333f = this.subtitleColor;
        AbstractC22403o abstractC22403o = this.image;
        EnumC39333f enumC39333f2 = this.imageBackgroundColor;
        List<C33210q> list = this.stats;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("SnapshotExerciseTileState(title=", textResource, ", subtitle=", textResource2, ", subtitleColor=");
        sbM106658q.append(enumC39333f);
        sbM106658q.append(", image=");
        sbM106658q.append(abstractC22403o);
        sbM106658q.append(", imageBackgroundColor=");
        sbM106658q.append(enumC39333f2);
        sbM106658q.append(", stats=");
        sbM106658q.append(list);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
