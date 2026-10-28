package zz0;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: zz0.h */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lzz0/h;", "", "Lzz0/b;", "statusStyle", "Lcom/whoop/design/util/TextResource;", "label", "countLabel", "<init>", "(Lzz0/b;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzz0/b;", "c", "()Lzz0/b;", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C41247h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC41241b statusStyle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource label;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource countLabel;

    public C41247h(EnumC41241b statusStyle, TextResource label, TextResource countLabel) {
        AbstractC22676k.m65750j(statusStyle, "statusStyle");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(countLabel, "countLabel");
        this.statusStyle = statusStyle;
        this.label = label;
        this.countLabel = countLabel;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getCountLabel() {
        return this.countLabel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC41241b getStatusStyle() {
        return this.statusStyle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C41247h)) {
            return false;
        }
        C41247h c41247h = (C41247h) other;
        return this.statusStyle == c41247h.statusStyle && AbstractC22676k.m65745e(this.label, c41247h.label) && AbstractC22676k.m65745e(this.countLabel, c41247h.countLabel);
    }

    public int hashCode() {
        return this.countLabel.hashCode() + AbstractC31061c.m95625a(this.statusStyle.hashCode() * 31, this.label, 31);
    }

    public String toString() {
        EnumC41241b enumC41241b = this.statusStyle;
        TextResource textResource = this.label;
        TextResource textResource2 = this.countLabel;
        StringBuilder sb4 = new StringBuilder("BehaviorsCalendarLegendItemViewState(statusStyle=");
        sb4.append(enumC41241b);
        sb4.append(", label=");
        sb4.append(textResource);
        sb4.append(", countLabel=");
        return AbstractC30007c.m91841k(sb4, textResource2, ")");
    }
}
