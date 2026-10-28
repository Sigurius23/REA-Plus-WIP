package nt1;

import com.whoop.design.util.TextResource;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: nt1.i */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019¨\u0006!"}, m65681d2 = {"Lnt1/i;", "", "Lcom/whoop/design/util/TextResource;", "label", "title", "", "regions", "availabilityAlert", "", "availabilityIcon", "buttonLabel", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "b", "f", "c", "Ljava/util/List;", "e", "()Ljava/util/List;", "I", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27130i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource label;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<TextResource> regions;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource availabilityAlert;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int availabilityIcon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource buttonLabel;

    /* JADX WARN: Multi-variable type inference failed */
    public C27130i(TextResource label, TextResource title, List<? extends TextResource> regions, TextResource availabilityAlert, int i13, TextResource buttonLabel) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(regions, "regions");
        AbstractC22676k.m65750j(availabilityAlert, "availabilityAlert");
        AbstractC22676k.m65750j(buttonLabel, "buttonLabel");
        this.label = label;
        this.title = title;
        this.regions = regions;
        this.availabilityAlert = availabilityAlert;
        this.availabilityIcon = i13;
        this.buttonLabel = buttonLabel;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getAvailabilityAlert() {
        return this.availabilityAlert;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getAvailabilityIcon() {
        return this.availabilityIcon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getButtonLabel() {
        return this.buttonLabel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: e */
    public final List<TextResource> m81556e() {
        return this.regions;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27130i)) {
            return false;
        }
        C27130i c27130i = (C27130i) other;
        return AbstractC22676k.m65745e(this.label, c27130i.label) && AbstractC22676k.m65745e(this.title, c27130i.title) && AbstractC22676k.m65745e(this.regions, c27130i.regions) && AbstractC22676k.m65745e(this.availabilityAlert, c27130i.availabilityAlert) && this.availabilityIcon == c27130i.availabilityIcon && AbstractC22676k.m65745e(this.buttonLabel, c27130i.buttonLabel);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.buttonLabel.hashCode() + AbstractC11266d.m30448b(this.availabilityIcon, AbstractC31061c.m95625a(AbstractC11895b.m31983b(AbstractC31061c.m95625a(this.label.hashCode() * 31, this.title, 31), 31, this.regions), this.availabilityAlert, 31), 31);
    }

    public String toString() {
        TextResource textResource = this.label;
        TextResource textResource2 = this.title;
        List<TextResource> list = this.regions;
        TextResource textResource3 = this.availabilityAlert;
        int i13 = this.availabilityIcon;
        TextResource textResource4 = this.buttonLabel;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("SupportedRegionPickerViewState(label=", textResource, ", title=", textResource2, ", regions=");
        AbstractC30007c.m91852v(textResource3, ", availabilityAlert=", ", availabilityIcon=", sbM106658q, list);
        sbM106658q.append(i13);
        sbM106658q.append(", buttonLabel=");
        sbM106658q.append(textResource4);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
