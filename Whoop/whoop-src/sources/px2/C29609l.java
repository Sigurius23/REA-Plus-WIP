package px2;

import com.whoop.design.util.TextResource;
import mx2.InterfaceC26015b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: px2.l */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u0016\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, m65681d2 = {"Lpx2/l;", "", "Lcom/whoop/design/util/TextResource;", "title", "description", "positiveCta", "negativeCta", "Lmx2/b;", "action", "", "isLowSeverity", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lmx2/b;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "c", "d", "Lmx2/b;", "()Lmx2/b;", "f", "Z", "()Z", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29609l {

    /* JADX INFO: renamed from: g */
    public static final int f120944g = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource description;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource positiveCta;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource negativeCta;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC26015b action;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isLowSeverity;

    public C29609l(TextResource title, TextResource description, TextResource positiveCta, TextResource negativeCta, InterfaceC26015b action, boolean z4) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(positiveCta, "positiveCta");
        AbstractC22676k.m65750j(negativeCta, "negativeCta");
        AbstractC22676k.m65750j(action, "action");
        this.title = title;
        this.description = description;
        this.positiveCta = positiveCta;
        this.negativeCta = negativeCta;
        this.action = action;
        this.isLowSeverity = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC26015b getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getNegativeCta() {
        return this.negativeCta;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getPositiveCta() {
        return this.positiveCta;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29609l)) {
            return false;
        }
        C29609l c29609l = (C29609l) other;
        return AbstractC22676k.m65745e(this.title, c29609l.title) && AbstractC22676k.m65745e(this.description, c29609l.description) && AbstractC22676k.m65745e(this.positiveCta, c29609l.positiveCta) && AbstractC22676k.m65745e(this.negativeCta, c29609l.negativeCta) && AbstractC22676k.m65745e(this.action, c29609l.action) && this.isLowSeverity == c29609l.isLowSeverity;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsLowSeverity() {
        return this.isLowSeverity;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isLowSeverity) + ((this.action.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.description, 31), this.positiveCta, 31), this.negativeCta, 31)) * 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.description;
        TextResource textResource3 = this.positiveCta;
        TextResource textResource4 = this.negativeCta;
        InterfaceC26015b interfaceC26015b = this.action;
        boolean z4 = this.isLowSeverity;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("ModalMessage(title=", textResource, ", description=", textResource2, ", positiveCta=");
        AbstractC30007c.m91855y(sbM106658q, textResource3, ", negativeCta=", textResource4, ", action=");
        sbM106658q.append(interfaceC26015b);
        sbM106658q.append(", isLowSeverity=");
        sbM106658q.append(z4);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
