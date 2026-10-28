package f41;

import com.whoop.design.util.TextResource;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: f41.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lf41/b;", "", "", "Lf41/q;", "values", "Lcom/whoop/design/util/TextResource;", "leadingTitleDisplay", "<init>", "(Ljava/util/List;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14064b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C14079q> values;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource leadingTitleDisplay;

    public C14064b(List<C14079q> values, TextResource leadingTitleDisplay) {
        AbstractC22676k.m65750j(values, "values");
        AbstractC22676k.m65750j(leadingTitleDisplay, "leadingTitleDisplay");
        this.values = values;
        this.leadingTitleDisplay = leadingTitleDisplay;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getLeadingTitleDisplay() {
        return this.leadingTitleDisplay;
    }

    /* JADX INFO: renamed from: b */
    public final List<C14079q> m40027b() {
        return this.values;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14064b)) {
            return false;
        }
        C14064b c14064b = (C14064b) other;
        return AbstractC22676k.m65745e(this.values, c14064b.values) && AbstractC22676k.m65745e(this.leadingTitleDisplay, c14064b.leadingTitleDisplay);
    }

    public int hashCode() {
        return this.leadingTitleDisplay.hashCode() + (this.values.hashCode() * 31);
    }

    public String toString() {
        return "DayOptions(values=" + this.values + ", leadingTitleDisplay=" + this.leadingTitleDisplay + ")";
    }
}
