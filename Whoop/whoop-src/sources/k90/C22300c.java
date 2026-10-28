package k90;

import com.whoop.design.util.TextResource;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: k90.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b\u0017\u0010!¨\u0006\""}, m65681d2 = {"Lk90/c;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "Lk90/d;", "titleSize", "subtitle", "subtitleSize", "Lkd1/o;", "avatarUrl", "<init>", "(Lcom/whoop/design/util/TextResource;Lk90/d;Lcom/whoop/design/util/TextResource;Lk90/d;Lkd1/o;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Lk90/d;", "e", "()Lk90/d;", "d", "Lkd1/o;", "()Lkd1/o;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22300c implements InterfaceC25312u {

    /* JADX INFO: renamed from: f */
    public static final int f87014f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC22301d titleSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC22301d subtitleSize;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC22403o avatarUrl;

    static {
        int i13 = AbstractC22403o.f87638a;
        int i14 = TextResource.$stable;
        f87014f = i13 | i14 | i14;
    }

    public C22300c(TextResource title, EnumC22301d titleSize, TextResource subtitle, EnumC22301d subtitleSize, AbstractC22403o abstractC22403o) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(titleSize, "titleSize");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(subtitleSize, "subtitleSize");
        this.title = title;
        this.titleSize = titleSize;
        this.subtitle = subtitle;
        this.subtitleSize = subtitleSize;
        this.avatarUrl = abstractC22403o;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC22403o getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC22301d getSubtitleSize() {
        return this.subtitleSize;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC22301d getTitleSize() {
        return this.titleSize;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22300c)) {
            return false;
        }
        C22300c c22300c = (C22300c) other;
        return AbstractC22676k.m65745e(this.title, c22300c.title) && this.titleSize == c22300c.titleSize && AbstractC22676k.m65745e(this.subtitle, c22300c.subtitle) && this.subtitleSize == c22300c.subtitleSize && AbstractC22676k.m65745e(this.avatarUrl, c22300c.avatarUrl);
    }

    public int hashCode() {
        int iHashCode = (this.subtitleSize.hashCode() + AbstractC31061c.m95625a((this.titleSize.hashCode() + (this.title.hashCode() * 31)) * 31, this.subtitle, 31)) * 31;
        AbstractC22403o abstractC22403o = this.avatarUrl;
        return iHashCode + (abstractC22403o == null ? 0 : abstractC22403o.hashCode());
    }

    public String toString() {
        return "JoinTeamState(title=" + this.title + ", titleSize=" + this.titleSize + ", subtitle=" + this.subtitle + ", subtitleSize=" + this.subtitleSize + ", avatarUrl=" + this.avatarUrl + ")";
    }
}
