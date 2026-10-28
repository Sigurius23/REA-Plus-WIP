package q81;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: q81.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u0016\u0010\u001f¨\u0006 "}, m65681d2 = {"Lq81/c;", "Lq81/j;", "Lq81/i;", "style", "Lcom/whoop/design/util/TextResource;", "title", "timerText", "", "borderFillPercent", "<init>", "(Lq81/i;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lq81/i;", "b", "()Lq81/i;", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "c", "F", "()F", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30045c implements InterfaceC30052j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC30051i style;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource timerText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float borderFillPercent;

    public C30045c(EnumC30051i style, TextResource title, TextResource timerText, float f13) {
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(timerText, "timerText");
        this.style = style;
        this.title = title;
        this.timerText = timerText;
        this.borderFillPercent = f13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getBorderFillPercent() {
        return this.borderFillPercent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC30051i getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTimerText() {
        return this.timerText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30045c)) {
            return false;
        }
        C30045c c30045c = (C30045c) other;
        return this.style == c30045c.style && AbstractC22676k.m65745e(this.title, c30045c.title) && AbstractC22676k.m65745e(this.timerText, c30045c.timerText) && Float.compare(this.borderFillPercent, c30045c.borderFillPercent) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.borderFillPercent) + AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.style.hashCode() * 31, this.title, 31), this.timerText, 31);
    }

    public String toString() {
        return "DeclarativeWeightliftingTimerState(style=" + this.style + ", title=" + this.title + ", timerText=" + this.timerText + ", borderFillPercent=" + this.borderFillPercent + ")";
    }
}
