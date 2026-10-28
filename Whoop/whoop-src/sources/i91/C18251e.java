package i91;

import p208i2.AbstractC17911t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i91.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Li91/e;", "Li91/h;", "Li2/t;", "brush", "<init>", "(Li2/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li2/t;", "()Li2/t;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18251e extends AbstractC18254h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC17911t brush;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18251e(AbstractC17911t brush) {
        super(null);
        AbstractC22676k.m65750j(brush, "brush");
        this.brush = brush;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC17911t getBrush() {
        return this.brush;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C18251e) && AbstractC22676k.m65745e(this.brush, ((C18251e) other).brush);
    }

    public int hashCode() {
        return this.brush.hashCode();
    }

    public String toString() {
        return "BrushComposedBackground(brush=" + this.brush + ")";
    }
}
