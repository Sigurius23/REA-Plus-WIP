package nt1;

import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: nt1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lnt1/b;", "", "", "setupRequirement", "Lcom/whoop/design/util/TextResource;", "label", "", "selected", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "Z", "()Z", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27123b {

    /* JADX INFO: renamed from: d */
    public static final int f108405d = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String setupRequirement;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource label;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean selected;

    public C27123b(String setupRequirement, TextResource label, boolean z4) {
        AbstractC22676k.m65750j(setupRequirement, "setupRequirement");
        AbstractC22676k.m65750j(label, "label");
        this.setupRequirement = setupRequirement;
        this.label = label;
        this.selected = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSetupRequirement() {
        return this.setupRequirement;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27123b)) {
            return false;
        }
        C27123b c27123b = (C27123b) other;
        return AbstractC22676k.m65745e(this.setupRequirement, c27123b.setupRequirement) && AbstractC22676k.m65745e(this.label, c27123b.label) && this.selected == c27123b.selected;
    }

    public int hashCode() {
        return Boolean.hashCode(this.selected) + AbstractC31061c.m95625a(this.setupRequirement.hashCode() * 31, this.label, 31);
    }

    public String toString() {
        String str = this.setupRequirement;
        TextResource textResource = this.label;
        return AbstractC18489d0.m53372m(AbstractC30007c.m91847q("LabradorEligibilityToggleItemViewState(setupRequirement=", str, ", label=", textResource, ", selected="), this.selected, ")");
    }
}
