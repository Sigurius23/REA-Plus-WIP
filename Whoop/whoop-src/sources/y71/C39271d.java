package y71;

import com.whoop.design.util.TextResource;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: y71.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u0006\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b \u0010\u001fR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b!\u0010\u001b¨\u0006\""}, m65681d2 = {"Ly71/d;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "label", "", "enabled", "isSelected", "", "onItemClick", "onMoreOptionsClickEvent", "showDotMenuIcon", "<init>", "(Lcom/whoop/design/util/TextResource;ZZLjava/lang/Object;Ljava/lang/Object;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "Z", "()Z", "c", "d", "Ljava/lang/Object;", "()Ljava/lang/Object;", "e", "f", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39271d implements InterfaceC25312u {

    /* JADX INFO: renamed from: g */
    public static final int f168920g = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource label;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isSelected;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Object onItemClick;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Object onMoreOptionsClickEvent;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean showDotMenuIcon;

    public C39271d(TextResource label, boolean z4, boolean z13, Object onItemClick, Object onMoreOptionsClickEvent, boolean z14) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(onItemClick, "onItemClick");
        AbstractC22676k.m65750j(onMoreOptionsClickEvent, "onMoreOptionsClickEvent");
        this.label = label;
        this.enabled = z4;
        this.isSelected = z13;
        this.onItemClick = onItemClick;
        this.onMoreOptionsClickEvent = onMoreOptionsClickEvent;
        this.showDotMenuIcon = z14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Object getOnItemClick() {
        return this.onItemClick;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Object getOnMoreOptionsClickEvent() {
        return this.onMoreOptionsClickEvent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39271d)) {
            return false;
        }
        C39271d c39271d = (C39271d) other;
        return AbstractC22676k.m65745e(this.label, c39271d.label) && this.enabled == c39271d.enabled && this.isSelected == c39271d.isSelected && AbstractC22676k.m65745e(this.onItemClick, c39271d.onItemClick) && AbstractC22676k.m65745e(this.onMoreOptionsClickEvent, c39271d.onMoreOptionsClickEvent) && this.showDotMenuIcon == c39271d.showDotMenuIcon;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getShowDotMenuIcon() {
        return this.showDotMenuIcon;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showDotMenuIcon) + AbstractC33745d.m106644c(AbstractC33745d.m106644c(AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.label.hashCode() * 31, 31, this.enabled), 31, this.isSelected), 31, this.onItemClick), 31, this.onMoreOptionsClickEvent);
    }

    public String toString() {
        TextResource textResource = this.label;
        boolean z4 = this.enabled;
        boolean z13 = this.isSelected;
        Object obj = this.onItemClick;
        Object obj2 = this.onMoreOptionsClickEvent;
        boolean z14 = this.showDotMenuIcon;
        StringBuilder sbM91846p = AbstractC30007c.m91846p("ActivityMenuItemState(label=", textResource, ", enabled=", z4, ", isSelected=");
        sbM91846p.append(z13);
        sbM91846p.append(", onItemClick=");
        sbM91846p.append(obj);
        sbM91846p.append(", onMoreOptionsClickEvent=");
        sbM91846p.append(obj2);
        sbM91846p.append(", showDotMenuIcon=");
        sbM91846p.append(z14);
        sbM91846p.append(")");
        return sbM91846p.toString();
    }

    public /* synthetic */ C39271d(TextResource textResource, boolean z4, boolean z13, Object obj, Object obj2, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, (i13 & 2) != 0 ? true : z4, (i13 & 4) != 0 ? false : z13, obj, obj2, (i13 & 32) != 0 ? true : z14);
    }
}
