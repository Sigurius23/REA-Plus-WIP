package nq2;

import com.whoop.design.util.TextResource;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: nq2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lnq2/f;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "", "Lnq2/a;", "items", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "Ljava/util/List;", "()Ljava/util/List;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27063f implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C27058a> items;

    public C27063f(TextResource title, List<C27058a> items) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(items, "items");
        this.title = title;
        this.items = items;
    }

    /* JADX INFO: renamed from: a */
    public final List<C27058a> m81341a() {
        return this.items;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27063f)) {
            return false;
        }
        C27063f c27063f = (C27063f) other;
        return AbstractC22676k.m65745e(this.title, c27063f.title) && AbstractC22676k.m65745e(this.items, c27063f.items);
    }

    public int hashCode() {
        return this.items.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        return AbstractC30007c.m91839i(this.title, "YearInReviewHighlightsListState(title=", ", items=", ")", this.items);
    }
}
