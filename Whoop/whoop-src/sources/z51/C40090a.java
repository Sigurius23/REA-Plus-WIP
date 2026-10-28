package z51;

import com.whoop.design.util.TextResource;
import nh3.AbstractC26725a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: z51.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lz51/a;", "", "Lcom/whoop/design/util/TextResource;", "title", "displayValue", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40090a {

    /* JADX INFO: renamed from: c */
    public static final int f173008c = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource displayValue;

    public C40090a(TextResource title, TextResource displayValue) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(displayValue, "displayValue");
        this.title = title;
        this.displayValue = displayValue;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getDisplayValue() {
        return this.displayValue;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40090a)) {
            return false;
        }
        C40090a c40090a = (C40090a) other;
        return AbstractC22676k.m65745e(this.title, c40090a.title) && AbstractC22676k.m65745e(this.displayValue, c40090a.displayValue);
    }

    public int hashCode() {
        return this.displayValue.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        return AbstractC26725a.m79501e("CustomGaugeEntryViewState(title=", this.title, ", displayValue=", this.displayValue, ")");
    }
}
