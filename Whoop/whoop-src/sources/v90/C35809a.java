package v90;

import com.whoop.design.util.TextResource;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: v90.a */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017¨\u0006\u001e"}, m65681d2 = {"Lv90/a;", "", "Lcom/whoop/design/util/TextResource;", "label", "", "isHighlightText", "subtitle", "amount", "strikethroughAmount", "<init>", "(Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "Z", "d", "()Z", "c", "e", "getStrikethroughAmount", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35809a {

    /* JADX INFO: renamed from: f */
    public static final int f152328f = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource label;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isHighlightText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource amount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource strikethroughAmount;

    public C35809a(TextResource label, boolean z4, TextResource textResource, TextResource amount, TextResource textResource2) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(amount, "amount");
        this.label = label;
        this.isHighlightText = z4;
        this.subtitle = textResource;
        this.amount = amount;
        this.strikethroughAmount = textResource2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsHighlightText() {
        return this.isHighlightText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35809a)) {
            return false;
        }
        C35809a c35809a = (C35809a) other;
        return AbstractC22676k.m65745e(this.label, c35809a.label) && this.isHighlightText == c35809a.isHighlightText && AbstractC22676k.m65745e(this.subtitle, c35809a.subtitle) && AbstractC22676k.m65745e(this.amount, c35809a.amount) && AbstractC22676k.m65745e(this.strikethroughAmount, c35809a.strikethroughAmount);
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(this.label.hashCode() * 31, 31, this.isHighlightText);
        TextResource textResource = this.subtitle;
        int iM95625a = AbstractC31061c.m95625a((iM8289b + (textResource == null ? 0 : textResource.hashCode())) * 31, this.amount, 31);
        TextResource textResource2 = this.strikethroughAmount;
        return iM95625a + (textResource2 != null ? textResource2.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.label;
        boolean z4 = this.isHighlightText;
        TextResource textResource2 = this.subtitle;
        TextResource textResource3 = this.amount;
        TextResource textResource4 = this.strikethroughAmount;
        StringBuilder sbM91846p = AbstractC30007c.m91846p("LineItemsViewState(label=", textResource, ", isHighlightText=", z4, ", subtitle=");
        AbstractC30007c.m91855y(sbM91846p, textResource2, ", amount=", textResource3, ", strikethroughAmount=");
        return AbstractC30007c.m91841k(sbM91846p, textResource4, ")");
    }

    public /* synthetic */ C35809a(TextResource textResource, boolean z4, TextResource textResource2, TextResource textResource3, TextResource textResource4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? null : textResource2, textResource3, (i13 & 16) != 0 ? null : textResource4);
    }
}
