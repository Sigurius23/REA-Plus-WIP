package y11;

import com.whoop.design.util.TextResource;
import java.util.List;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: y11.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0016\u0010 ¨\u0006!"}, m65681d2 = {"Ly11/f;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "titleDisplay", "", "isTitleOnTop", "valueDisplay", "", "Ly11/e;", "segments", "<init>", "(Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "Z", "e", "()Z", "c", "d", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39053f implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource titleDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isTitleOnTop;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource valueDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<InterfaceC39052e> segments;

    /* JADX WARN: Multi-variable type inference failed */
    public C39053f(TextResource titleDisplay, boolean z4, TextResource valueDisplay, List<? extends InterfaceC39052e> segments) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(valueDisplay, "valueDisplay");
        AbstractC22676k.m65750j(segments, "segments");
        this.titleDisplay = titleDisplay;
        this.isTitleOnTop = z4;
        this.valueDisplay = valueDisplay;
        this.segments = segments;
    }

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC39052e> m124496a() {
        return this.segments;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getValueDisplay() {
        return this.valueDisplay;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsTitleOnTop() {
        return this.isTitleOnTop;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39053f)) {
            return false;
        }
        C39053f c39053f = (C39053f) other;
        return AbstractC22676k.m65745e(this.titleDisplay, c39053f.titleDisplay) && this.isTitleOnTop == c39053f.isTitleOnTop && AbstractC22676k.m65745e(this.valueDisplay, c39053f.valueDisplay) && AbstractC22676k.m65745e(this.segments, c39053f.segments);
    }

    public int hashCode() {
        return this.segments.hashCode() + AbstractC31061c.m95625a(AbstractC2875y.m8289b(this.titleDisplay.hashCode() * 31, 31, this.isTitleOnTop), this.valueDisplay, 31);
    }

    public String toString() {
        TextResource textResource = this.titleDisplay;
        boolean z4 = this.isTitleOnTop;
        TextResource textResource2 = this.valueDisplay;
        List<InterfaceC39052e> list = this.segments;
        StringBuilder sbM91846p = AbstractC30007c.m91846p("ComparisonBarState(titleDisplay=", textResource, ", isTitleOnTop=", z4, ", valueDisplay=");
        sbM91846p.append(textResource2);
        sbM91846p.append(", segments=");
        sbM91846p.append(list);
        sbM91846p.append(")");
        return sbM91846p.toString();
    }
}
