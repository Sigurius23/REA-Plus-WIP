package k71;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: k71.o */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Lk71/o;", "", "Lcom/whoop/design/util/TextResource;", "titleDisplay", "durationDisplayTitle", "durationDisplay", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22258o {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource titleDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource durationDisplayTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource durationDisplay;

    public C22258o(TextResource titleDisplay, TextResource durationDisplayTitle, TextResource durationDisplay) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(durationDisplayTitle, "durationDisplayTitle");
        AbstractC22676k.m65750j(durationDisplay, "durationDisplay");
        this.titleDisplay = titleDisplay;
        this.durationDisplayTitle = durationDisplayTitle;
        this.durationDisplay = durationDisplay;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getDurationDisplay() {
        return this.durationDisplay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getDurationDisplayTitle() {
        return this.durationDisplayTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitleDisplay() {
        return this.titleDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22258o)) {
            return false;
        }
        C22258o c22258o = (C22258o) other;
        return AbstractC22676k.m65745e(this.titleDisplay, c22258o.titleDisplay) && AbstractC22676k.m65745e(this.durationDisplayTitle, c22258o.durationDisplayTitle) && AbstractC22676k.m65745e(this.durationDisplay, c22258o.durationDisplay);
    }

    public int hashCode() {
        return this.durationDisplay.hashCode() + AbstractC31061c.m95625a(this.titleDisplay.hashCode() * 31, this.durationDisplayTitle, 31);
    }

    public String toString() {
        TextResource textResource = this.titleDisplay;
        TextResource textResource2 = this.durationDisplayTitle;
        return AbstractC30007c.m91841k(AbstractC33745d.m106658q("HorizontalBarHeader(titleDisplay=", textResource, ", durationDisplayTitle=", textResource2, ", durationDisplay="), this.durationDisplay, ")");
    }
}
