package p730qt2;

import com.whoop.design.util.TextResource;
import mt2.AbstractC25946g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: qt2.d */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lqt2/d;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "buttonTitle", "Lmt2/g;", "navigationEvent", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lmt2/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Lmt2/g;", "()Lmt2/g;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30597d implements InterfaceC25312u {

    /* JADX INFO: renamed from: d */
    public static final int f125857d = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource buttonTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC25946g navigationEvent;

    public C30597d(TextResource title, TextResource buttonTitle, AbstractC25946g abstractC25946g) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        this.title = title;
        this.buttonTitle = buttonTitle;
        this.navigationEvent = abstractC25946g;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getButtonTitle() {
        return this.buttonTitle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC25946g getNavigationEvent() {
        return this.navigationEvent;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30597d)) {
            return false;
        }
        C30597d c30597d = (C30597d) other;
        return AbstractC22676k.m65745e(this.title, c30597d.title) && AbstractC22676k.m65745e(this.buttonTitle, c30597d.buttonTitle) && AbstractC22676k.m65745e(this.navigationEvent, c30597d.navigationEvent);
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.title.hashCode() * 31, this.buttonTitle, 31);
        AbstractC25946g abstractC25946g = this.navigationEvent;
        return iM95625a + (abstractC25946g == null ? 0 : abstractC25946g.hashCode());
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.buttonTitle;
        AbstractC25946g abstractC25946g = this.navigationEvent;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("EmptyMetricPlanTileItemState(title=", textResource, ", buttonTitle=", textResource2, ", navigationEvent=");
        sbM106658q.append(abstractC25946g);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
