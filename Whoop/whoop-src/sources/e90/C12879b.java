package e90;

import c13.AbstractC3855a;
import com.whoop.design.util.TextResource;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: e90.b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Le90/b;", "", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "cta", "cancelCta", "", "Le90/a;", "baseline", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "d", "c", "Ljava/util/List;", "()Ljava/util/List;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12879b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource cta;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource cancelCta;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<C12878a> baseline;

    public C12879b(TextResource title, TextResource subtitle, TextResource cta, TextResource cancelCta, List<C12878a> baseline) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(cta, "cta");
        AbstractC22676k.m65750j(cancelCta, "cancelCta");
        AbstractC22676k.m65750j(baseline, "baseline");
        this.title = title;
        this.subtitle = subtitle;
        this.cta = cta;
        this.cancelCta = cancelCta;
        this.baseline = baseline;
    }

    /* JADX INFO: renamed from: a */
    public final List<C12878a> m36179a() {
        return this.baseline;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getCancelCta() {
        return this.cancelCta;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12879b)) {
            return false;
        }
        C12879b c12879b = (C12879b) other;
        return AbstractC22676k.m65745e(this.title, c12879b.title) && AbstractC22676k.m65745e(this.subtitle, c12879b.subtitle) && AbstractC22676k.m65745e(this.cta, c12879b.cta) && AbstractC22676k.m65745e(this.cancelCta, c12879b.cancelCta) && AbstractC22676k.m65745e(this.baseline, c12879b.baseline);
    }

    public int hashCode() {
        return this.baseline.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.subtitle, 31), this.cta, 31), this.cancelCta, 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        TextResource textResource3 = this.cta;
        TextResource textResource4 = this.cancelCta;
        List<C12878a> list = this.baseline;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("GenderDialogData(title=", textResource, ", subtitle=", textResource2, ", cta=");
        AbstractC30007c.m91855y(sbM106658q, textResource3, ", cancelCta=", textResource4, ", baseline=");
        return AbstractC3855a.m11829m(sbM106658q, list, ")");
    }
}
