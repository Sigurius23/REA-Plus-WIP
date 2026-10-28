package m71;

import com.whoop.design.util.TextResource;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: m71.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0016\u0010\"¨\u0006#"}, m65681d2 = {"Lm71/d;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "", "titleIcon", "Lm71/c;", "style", "", "items", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lm71/c;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "Lm71/c;", "()Lm71/c;", "d", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25201d implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Integer titleIcon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC25200c style;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX WARN: Multi-variable type inference failed */
    public C25201d(TextResource textResource, Integer num, EnumC25200c style, List<? extends InterfaceC25312u> items) {
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(items, "items");
        this.title = textResource;
        this.titleIcon = num;
        this.style = style;
        this.items = items;
    }

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC25312u> m73789a() {
        return this.items;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC25200c getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getTitleIcon() {
        return this.titleIcon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25201d)) {
            return false;
        }
        C25201d c25201d = (C25201d) other;
        return AbstractC22676k.m65745e(this.title, c25201d.title) && AbstractC22676k.m65745e(this.titleIcon, c25201d.titleIcon) && this.style == c25201d.style && AbstractC22676k.m65745e(this.items, c25201d.items);
    }

    public int hashCode() {
        TextResource textResource = this.title;
        int iHashCode = (textResource == null ? 0 : textResource.hashCode()) * 31;
        Integer num = this.titleIcon;
        return this.items.hashCode() + ((this.style.hashCode() + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31)) * 31);
    }

    public String toString() {
        return "HeaderItemsCardViewState(title=" + this.title + ", titleIcon=" + this.titleIcon + ", style=" + this.style + ", items=" + this.items + ")";
    }
}
