package nu1;

import com.whoop.design.util.TextResource;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: nu1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0015\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lnu1/f;", "", "Lcom/whoop/design/util/TextResource;", "valueDisplay", "unitDisplay", "timeDisplay", "", "componentId", "Ly81/e;", "scrubColor", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ly81/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "d", "c", "Ljava/lang/String;", "Ly81/e;", "()Ly81/e;", "last-night-sleep_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27142f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource valueDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource unitDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource timeDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String componentId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC39332e scrubColor;

    public C27142f(TextResource valueDisplay, TextResource unitDisplay, TextResource timeDisplay, String componentId, InterfaceC39332e interfaceC39332e) {
        AbstractC22676k.m65750j(valueDisplay, "valueDisplay");
        AbstractC22676k.m65750j(unitDisplay, "unitDisplay");
        AbstractC22676k.m65750j(timeDisplay, "timeDisplay");
        AbstractC22676k.m65750j(componentId, "componentId");
        this.valueDisplay = valueDisplay;
        this.unitDisplay = unitDisplay;
        this.timeDisplay = timeDisplay;
        this.componentId = componentId;
        this.scrubColor = interfaceC39332e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getComponentId() {
        return this.componentId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC39332e getScrubColor() {
        return this.scrubColor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTimeDisplay() {
        return this.timeDisplay;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getUnitDisplay() {
        return this.unitDisplay;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getValueDisplay() {
        return this.valueDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27142f)) {
            return false;
        }
        C27142f c27142f = (C27142f) other;
        return AbstractC22676k.m65745e(this.valueDisplay, c27142f.valueDisplay) && AbstractC22676k.m65745e(this.unitDisplay, c27142f.unitDisplay) && AbstractC22676k.m65745e(this.timeDisplay, c27142f.timeDisplay) && AbstractC22676k.m65745e(this.componentId, c27142f.componentId) && AbstractC22676k.m65745e(this.scrubColor, c27142f.scrubColor);
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.valueDisplay.hashCode() * 31, this.unitDisplay, 31), this.timeDisplay, 31), 31, this.componentId);
        InterfaceC39332e interfaceC39332e = this.scrubColor;
        return iM30450d + (interfaceC39332e == null ? 0 : interfaceC39332e.hashCode());
    }

    public String toString() {
        TextResource textResource = this.valueDisplay;
        TextResource textResource2 = this.unitDisplay;
        TextResource textResource3 = this.timeDisplay;
        String str = this.componentId;
        InterfaceC39332e interfaceC39332e = this.scrubColor;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("ScrubbingHorizontalStatState(valueDisplay=", textResource, ", unitDisplay=", textResource2, ", timeDisplay=");
        AbstractC30007c.m91856z(sbM106658q, textResource3, ", componentId=", str, ", scrubColor=");
        sbM106658q.append(interfaceC39332e);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
