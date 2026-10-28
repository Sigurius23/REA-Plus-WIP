package so1;

import com.whoop.design.util.TextResource;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: so1.k */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lso1/k;", "", "Lcom/whoop/design/util/TextResource;", "display", "", "", "dateRange", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "Ljava/util/List;", "()Ljava/util/List;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32822k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource display;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<String> dateRange;

    public C32822k(TextResource display, List<String> dateRange) {
        AbstractC22676k.m65750j(display, "display");
        AbstractC22676k.m65750j(dateRange, "dateRange");
        this.display = display;
        this.dateRange = dateRange;
    }

    /* JADX INFO: renamed from: a */
    public final List<String> m102992a() {
        return this.dateRange;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getDisplay() {
        return this.display;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32822k)) {
            return false;
        }
        C32822k c32822k = (C32822k) other;
        return AbstractC22676k.m65745e(this.display, c32822k.display) && AbstractC22676k.m65745e(this.dateRange, c32822k.dateRange);
    }

    public int hashCode() {
        return this.dateRange.hashCode() + (this.display.hashCode() * 31);
    }

    public String toString() {
        return AbstractC30007c.m91839i(this.display, "HideOptionState(display=", ", dateRange=", ")", this.dateRange);
    }
}
