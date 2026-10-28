package eh0;

import com.whoop.design.util.TextResource;
import hy0.C17750h1;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p736sz0.C33169c0;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: eh0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u0017\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b\u001b\u0010 ¨\u0006!"}, m65681d2 = {"Leh0/d;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "Lsz0/c0;", "subtitleMarkdown", "", "Lhy0/h1;", "tags", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lsz0/c0;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "d", "Lsz0/c0;", "()Lsz0/c0;", "Ljava/util/List;", "()Ljava/util/List;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13195d implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C33169c0 subtitleMarkdown;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C17750h1> tags;

    public C13195d(TextResource title, TextResource subtitle, C33169c0 c33169c0, List<C17750h1> tags) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(tags, "tags");
        this.title = title;
        this.subtitle = subtitle;
        this.subtitleMarkdown = c33169c0;
        this.tags = tags;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C33169c0 getSubtitleMarkdown() {
        return this.subtitleMarkdown;
    }

    /* JADX INFO: renamed from: b */
    public final List<C17750h1> m37102b() {
        return this.tags;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13195d)) {
            return false;
        }
        C13195d c13195d = (C13195d) other;
        return AbstractC22676k.m65745e(this.title, c13195d.title) && AbstractC22676k.m65745e(this.subtitle, c13195d.subtitle) && AbstractC22676k.m65745e(this.subtitleMarkdown, c13195d.subtitleMarkdown) && AbstractC22676k.m65745e(this.tags, c13195d.tags);
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.title.hashCode() * 31, this.subtitle, 31);
        C33169c0 c33169c0 = this.subtitleMarkdown;
        return this.tags.hashCode() + ((iM95625a + (c33169c0 == null ? 0 : c33169c0.hashCode())) * 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        C33169c0 c33169c0 = this.subtitleMarkdown;
        List<C17750h1> list = this.tags;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("ContextDetailsHeaderViewState(title=", textResource, ", subtitle=", textResource2, ", subtitleMarkdown=");
        sbM106658q.append(c33169c0);
        sbM106658q.append(", tags=");
        sbM106658q.append(list);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
