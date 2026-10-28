package dw0;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: dw0.j */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Ldw0/j;", "", "Lcom/whoop/design/util/TextResource;", "valueDisplay", "unitDisplay", "timeDisplay", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12411j {

    /* JADX INFO: renamed from: d */
    public static final int f42210d = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource valueDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource unitDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource timeDisplay;

    public C12411j(TextResource valueDisplay, TextResource unitDisplay, TextResource timeDisplay) {
        AbstractC22676k.m65750j(valueDisplay, "valueDisplay");
        AbstractC22676k.m65750j(unitDisplay, "unitDisplay");
        AbstractC22676k.m65750j(timeDisplay, "timeDisplay");
        this.valueDisplay = valueDisplay;
        this.unitDisplay = unitDisplay;
        this.timeDisplay = timeDisplay;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getTimeDisplay() {
        return this.timeDisplay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getUnitDisplay() {
        return this.unitDisplay;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getValueDisplay() {
        return this.valueDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12411j)) {
            return false;
        }
        C12411j c12411j = (C12411j) other;
        return AbstractC22676k.m65745e(this.valueDisplay, c12411j.valueDisplay) && AbstractC22676k.m65745e(this.unitDisplay, c12411j.unitDisplay) && AbstractC22676k.m65745e(this.timeDisplay, c12411j.timeDisplay);
    }

    public int hashCode() {
        return this.timeDisplay.hashCode() + AbstractC31061c.m95625a(this.valueDisplay.hashCode() * 31, this.unitDisplay, 31);
    }

    public String toString() {
        TextResource textResource = this.valueDisplay;
        TextResource textResource2 = this.unitDisplay;
        return AbstractC30007c.m91841k(AbstractC33745d.m106658q("HeartRateState(valueDisplay=", textResource, ", unitDisplay=", textResource2, ", timeDisplay="), this.timeDisplay, ")");
    }
}
