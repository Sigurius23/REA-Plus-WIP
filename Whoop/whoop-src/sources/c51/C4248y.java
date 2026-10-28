package c51;

import l83.C23465k;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: c51.y */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lc51/y;", "", "Li2/t;", "brush", "<init>", "(Li2/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li2/t;", "()Li2/t;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4248y {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC17911t brush;

    public C4248y(AbstractC17911t brush) {
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
        return (other instanceof C4248y) && AbstractC22676k.m65745e(this.brush, ((C4248y) other).brush);
    }

    public int hashCode() {
        return this.brush.hashCode();
    }

    public String toString() {
        return "PrimitiveEdgeFadeSettings(brush=" + this.brush + ")";
    }

    public C4248y(AbstractC17911t abstractC17911t, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C17909s.m51490h(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(AbstractC17918w0.m51518f(0.0f, 0.0f, 0.0f, 0.0f, 16))), new C23465k(Float.valueOf(0.2f), new C17919x(AbstractC17918w0.m51518f(0.0f, 0.0f, 0.0f, 0.0f, 16))), new C23465k(Float.valueOf(1.0f), new C17919x(AbstractC17918w0.m51518f(0.0f, 0.0f, 0.0f, 0.7f, 16)))}, 0L, 0.0f, 14) : abstractC17911t);
    }
}
