package p31;

import com.whoop.design.util.TextResource;
import kd1.EnumC22400l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: p31.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lp31/b;", "", "", "icon", "Lcom/whoop/design/util/TextResource;", "title", "Lkd1/l;", "ctaType", "<init>", "(ILcom/whoop/design/util/TextResource;Lkd1/l;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "Lkd1/l;", "()Lkd1/l;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28791b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC22400l ctaType;

    public C28791b(int i13, TextResource title, EnumC22400l ctaType) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(ctaType, "ctaType");
        this.icon = i13;
        this.title = title;
        this.ctaType = ctaType;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC22400l getCtaType() {
        return this.ctaType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28791b)) {
            return false;
        }
        C28791b c28791b = (C28791b) other;
        return this.icon == c28791b.icon && AbstractC22676k.m65745e(this.title, c28791b.title) && this.ctaType == c28791b.ctaType;
    }

    public int hashCode() {
        return this.ctaType.hashCode() + AbstractC31061c.m95625a(Integer.hashCode(this.icon) * 31, this.title, 31);
    }

    public String toString() {
        int i13 = this.icon;
        TextResource textResource = this.title;
        EnumC22400l enumC22400l = this.ctaType;
        StringBuilder sbM91844n = AbstractC30007c.m91844n("FabToolTipItemState(icon=", i13, ", title=", textResource, ", ctaType=");
        sbM91844n.append(enumC22400l);
        sbM91844n.append(")");
        return sbM91844n.toString();
    }
}
