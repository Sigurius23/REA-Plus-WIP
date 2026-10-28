package l01;

import com.whoop.design.util.TextResource;
import java.util.List;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: l01.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ@\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b \u0010&¨\u0006'"}, m65681d2 = {"Ll01/d;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "", "showDivider", "Ll01/e;", "style", "", "Ll01/c;", "items", "<init>", "(Lcom/whoop/design/util/TextResource;ZLl01/e;Ljava/util/List;)V", "a", "(Lcom/whoop/design/util/TextResource;ZLl01/e;Ljava/util/List;)Ll01/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "b", "Z", "e", "()Z", "c", "Ll01/e;", "f", "()Ll01/e;", "d", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23032d implements InterfaceC25312u {

    /* JADX INFO: renamed from: e */
    public static final int f90800e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean showDivider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC23033e style;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C23031c> items;

    public C23032d(TextResource textResource, boolean z4, EnumC23033e style, List<C23031c> items) {
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(items, "items");
        this.title = textResource;
        this.showDivider = z4;
        this.style = style;
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C23032d m66806b(C23032d c23032d, TextResource textResource, boolean z4, EnumC23033e enumC23033e, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = c23032d.title;
        }
        if ((i13 & 2) != 0) {
            z4 = c23032d.showDivider;
        }
        if ((i13 & 4) != 0) {
            enumC23033e = c23032d.style;
        }
        if ((i13 & 8) != 0) {
            list = c23032d.items;
        }
        return c23032d.m66807a(textResource, z4, enumC23033e, list);
    }

    /* JADX INFO: renamed from: a */
    public final C23032d m66807a(TextResource title, boolean showDivider, EnumC23033e style, List<C23031c> items) {
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(items, "items");
        return new C23032d(title, showDivider, style, items);
    }

    /* JADX INFO: renamed from: c */
    public final List<C23031c> m66808c() {
        return this.items;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getShowDivider() {
        return this.showDivider;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23032d)) {
            return false;
        }
        C23032d c23032d = (C23032d) other;
        return AbstractC22676k.m65745e(this.title, c23032d.title) && this.showDivider == c23032d.showDivider && this.style == c23032d.style && AbstractC22676k.m65745e(this.items, c23032d.items);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC23033e getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        TextResource textResource = this.title;
        return this.items.hashCode() + ((this.style.hashCode() + AbstractC2875y.m8289b((textResource == null ? 0 : textResource.hashCode()) * 31, 31, this.showDivider)) * 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        boolean z4 = this.showDivider;
        EnumC23033e enumC23033e = this.style;
        List<C23031c> list = this.items;
        StringBuilder sbM91846p = AbstractC30007c.m91846p("FeatureListState(title=", textResource, ", showDivider=", z4, ", style=");
        sbM91846p.append(enumC23033e);
        sbM91846p.append(", items=");
        sbM91846p.append(list);
        sbM91846p.append(")");
        return sbM91846p.toString();
    }

    public /* synthetic */ C23032d(TextResource textResource, boolean z4, EnumC23033e enumC23033e, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, (i13 & 2) != 0 ? false : z4, enumC23033e, list);
    }
}
