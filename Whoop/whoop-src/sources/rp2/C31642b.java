package rp2;

import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: rp2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001b\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u0015\u0010\u001e¨\u0006 "}, m65681d2 = {"Lrp2/b;", "Lm91/u;", "", "id", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "", "isSelected", "hasDivider", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "c", "d", "Z", "()Z", "e", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31642b implements InterfaceC25312u {

    /* JADX INFO: renamed from: f */
    public static final int f130779f = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isSelected;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean hasDivider;

    public C31642b(String id4, TextResource title, TextResource subtitle, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        this.id = id4;
        this.title = title;
        this.subtitle = subtitle;
        this.isSelected = z4;
        this.hasDivider = z13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getHasDivider() {
        return this.hasDivider;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31642b)) {
            return false;
        }
        C31642b c31642b = (C31642b) other;
        return AbstractC22676k.m65745e(this.id, c31642b.id) && AbstractC22676k.m65745e(this.title, c31642b.title) && AbstractC22676k.m65745e(this.subtitle, c31642b.subtitle) && this.isSelected == c31642b.isSelected && this.hasDivider == c31642b.hasDivider;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasDivider) + AbstractC2875y.m8289b(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.id.hashCode() * 31, this.title, 31), this.subtitle, 31), 31, this.isSelected);
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        boolean z4 = this.isSelected;
        boolean z13 = this.hasDivider;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("ShippingMethodOptionViewState(id=", str, ", title=", textResource, ", subtitle=");
        AbstractC33745d.m106664w(textResource2, ", isSelected=", ", hasDivider=", sbM91847q, z4);
        return AbstractC18489d0.m53372m(sbM91847q, z13, ")");
    }
}
