package f41;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: f41.q */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lf41/q;", "", "", "value", "Lcom/whoop/design/util/TextResource;", "trailingDisplay", "avoidTrailingDisplay", "<init>", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14079q {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource trailingDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource avoidTrailingDisplay;

    public C14079q(int i13, TextResource trailingDisplay, TextResource avoidTrailingDisplay) {
        AbstractC22676k.m65750j(trailingDisplay, "trailingDisplay");
        AbstractC22676k.m65750j(avoidTrailingDisplay, "avoidTrailingDisplay");
        this.value = i13;
        this.trailingDisplay = trailingDisplay;
        this.avoidTrailingDisplay = avoidTrailingDisplay;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getAvoidTrailingDisplay() {
        return this.avoidTrailingDisplay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getTrailingDisplay() {
        return this.trailingDisplay;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14079q)) {
            return false;
        }
        C14079q c14079q = (C14079q) other;
        return this.value == c14079q.value && AbstractC22676k.m65745e(this.trailingDisplay, c14079q.trailingDisplay) && AbstractC22676k.m65745e(this.avoidTrailingDisplay, c14079q.avoidTrailingDisplay);
    }

    public int hashCode() {
        return this.avoidTrailingDisplay.hashCode() + AbstractC31061c.m95625a(Integer.hashCode(this.value) * 31, this.trailingDisplay, 31);
    }

    public String toString() {
        int i13 = this.value;
        TextResource textResource = this.trailingDisplay;
        return AbstractC30007c.m91841k(AbstractC30007c.m91844n("ScaleValueAndText(value=", i13, ", trailingDisplay=", textResource, ", avoidTrailingDisplay="), this.avoidTrailingDisplay, ")");
    }
}
