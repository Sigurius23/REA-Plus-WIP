package mc2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import java.util.List;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: mc2.m */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lmc2/m;", "", "Lcom/whoop/design/util/TextResource;", "sectionTitle", "", "Lmc2/h;", "menuItems", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "Ljava/util/List;", "()Ljava/util/List;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25434m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource sectionTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C25429h> menuItems;

    public C25434m(TextResource sectionTitle, List<C25429h> menuItems) {
        AbstractC22676k.m65750j(sectionTitle, "sectionTitle");
        AbstractC22676k.m65750j(menuItems, "menuItems");
        this.sectionTitle = sectionTitle;
        this.menuItems = menuItems;
    }

    /* JADX INFO: renamed from: a */
    public final List<C25429h> m74667a() {
        return this.menuItems;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getSectionTitle() {
        return this.sectionTitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25434m)) {
            return false;
        }
        C25434m c25434m = (C25434m) other;
        return AbstractC22676k.m65745e(this.sectionTitle, c25434m.sectionTitle) && AbstractC22676k.m65745e(this.menuItems, c25434m.menuItems);
    }

    public int hashCode() {
        return this.menuItems.hashCode() + (this.sectionTitle.hashCode() * 31);
    }

    public String toString() {
        return AbstractC30007c.m91839i(this.sectionTitle, "ReferAFriendMenuViewState(sectionTitle=", ", menuItems=", ")", this.menuItems);
    }

    public /* synthetic */ C25434m(TextResource textResource, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? C25271y.f99162w : list);
    }
}
