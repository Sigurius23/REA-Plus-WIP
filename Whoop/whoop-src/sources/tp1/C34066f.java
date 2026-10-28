package tp1;

import com.whoop.design.util.TextResource;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: tp1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018¨\u0006\u001d"}, m65681d2 = {"Ltp1/f;", "", "Lcom/whoop/design/util/TextResource;", "titleDisplay", "descriptionDisplay", "", "Ltp1/e;", "options", "buttonText", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34066f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource titleDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource descriptionDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C34065e> options;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource buttonText;

    public C34066f(TextResource titleDisplay, TextResource descriptionDisplay, List<C34065e> options, TextResource buttonText) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(buttonText, "buttonText");
        this.titleDisplay = titleDisplay;
        this.descriptionDisplay = descriptionDisplay;
        this.options = options;
        this.buttonText = buttonText;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    /* JADX INFO: renamed from: c */
    public final List<C34065e> m107677c() {
        return this.options;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getTitleDisplay() {
        return this.titleDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34066f)) {
            return false;
        }
        C34066f c34066f = (C34066f) other;
        return AbstractC22676k.m65745e(this.titleDisplay, c34066f.titleDisplay) && AbstractC22676k.m65745e(this.descriptionDisplay, c34066f.descriptionDisplay) && AbstractC22676k.m65745e(this.options, c34066f.options) && AbstractC22676k.m65745e(this.buttonText, c34066f.buttonText);
    }

    public int hashCode() {
        return this.buttonText.hashCode() + AbstractC11895b.m31983b(AbstractC31061c.m95625a(this.titleDisplay.hashCode() * 31, this.descriptionDisplay, 31), 31, this.options);
    }

    public String toString() {
        TextResource textResource = this.titleDisplay;
        TextResource textResource2 = this.descriptionDisplay;
        List<C34065e> list = this.options;
        TextResource textResource3 = this.buttonText;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("HormonalInsightsGoalsDrawerState(titleDisplay=", textResource, ", descriptionDisplay=", textResource2, ", options=");
        sbM106658q.append(list);
        sbM106658q.append(", buttonText=");
        sbM106658q.append(textResource3);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
