package tu1;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: tu1.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Ltu1/h;", "", "Lcom/whoop/design/util/TextResource;", "valueDisplay", "unitDisplay", "timeDisplay", "Ly81/e;", "scrubColor", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "b", "c", "Ly81/e;", "()Ly81/e;", "last-night-sleep_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34195h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource valueDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource unitDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource timeDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC39332e scrubColor;

    public C34195h(TextResource valueDisplay, TextResource unitDisplay, TextResource timeDisplay, InterfaceC39332e scrubColor) {
        AbstractC22676k.m65750j(valueDisplay, "valueDisplay");
        AbstractC22676k.m65750j(unitDisplay, "unitDisplay");
        AbstractC22676k.m65750j(timeDisplay, "timeDisplay");
        AbstractC22676k.m65750j(scrubColor, "scrubColor");
        this.valueDisplay = valueDisplay;
        this.unitDisplay = unitDisplay;
        this.timeDisplay = timeDisplay;
        this.scrubColor = scrubColor;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC39332e getScrubColor() {
        return this.scrubColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getTimeDisplay() {
        return this.timeDisplay;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getUnitDisplay() {
        return this.unitDisplay;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getValueDisplay() {
        return this.valueDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34195h)) {
            return false;
        }
        C34195h c34195h = (C34195h) other;
        return AbstractC22676k.m65745e(this.valueDisplay, c34195h.valueDisplay) && AbstractC22676k.m65745e(this.unitDisplay, c34195h.unitDisplay) && AbstractC22676k.m65745e(this.timeDisplay, c34195h.timeDisplay) && AbstractC22676k.m65745e(this.scrubColor, c34195h.scrubColor);
    }

    public int hashCode() {
        return this.scrubColor.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.valueDisplay.hashCode() * 31, this.unitDisplay, 31), this.timeDisplay, 31);
    }

    public String toString() {
        TextResource textResource = this.valueDisplay;
        TextResource textResource2 = this.unitDisplay;
        TextResource textResource3 = this.timeDisplay;
        InterfaceC39332e interfaceC39332e = this.scrubColor;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("DetailsScrubbingState(valueDisplay=", textResource, ", unitDisplay=", textResource2, ", timeDisplay=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", scrubColor=");
        sbM106658q.append(interfaceC39332e);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
