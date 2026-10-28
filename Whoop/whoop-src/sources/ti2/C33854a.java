package ti2;

import com.whoop.design.util.TextResource;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: ti2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lti2/a;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "", "Lti2/h;", "trackedItems", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/util/List;", "()Ljava/util/List;", "streaks_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33854a implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C33861h> trackedItems;

    public C33854a(TextResource title, List<C33861h> trackedItems) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(trackedItems, "trackedItems");
        this.title = title;
        this.trackedItems = trackedItems;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: b */
    public final List<C33861h> m107053b() {
        return this.trackedItems;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33854a)) {
            return false;
        }
        C33854a c33854a = (C33854a) other;
        return AbstractC22676k.m65745e(this.title, c33854a.title) && AbstractC22676k.m65745e(this.trackedItems, c33854a.trackedItems);
    }

    public int hashCode() {
        return this.trackedItems.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        return AbstractC30007c.m91839i(this.title, "HorizontalTrackerState(title=", ", trackedItems=", ")", this.trackedItems);
    }
}
