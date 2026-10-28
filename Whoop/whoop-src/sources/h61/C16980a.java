package h61;

import g61.C15529b;
import h71.C16994k;
import l91.AbstractC23542a;
import p181h2.C16618c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: h61.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u001f\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001eR\u0011\u0010 \u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u001eR\u0011\u0010!\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001eR\u0011\u0010#\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001eR\u0011\u0010%\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b$\u0010\u001e¨\u0006&"}, m65681d2 = {"Lh61/a;", "", "Lh71/k;", "state", "", "axisScale", "<init>", "(Lh71/k;F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lh71/k;", "getState", "()Lh71/k;", "b", "F", "getAxisScale", "()F", "c", "f", "startVerticalAxisSize", "Lh2/c;", "()Lh2/c;", "scaledInsets", "bottomHorizontalAxisRect", "contentRect", "e", "startVerticalAxisRect", "d", "scrubberRect", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16980a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C16994k state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float axisScale;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float startVerticalAxisSize;

    public C16980a(C16994k state, float f13) {
        AbstractC22676k.m65750j(state, "state");
        this.state = state;
        this.axisScale = f13;
        C15529b startVerticalAxis = state.getStartVerticalAxis();
        this.startVerticalAxisSize = startVerticalAxis != null ? startVerticalAxis.getSize() : 0.0f;
    }

    /* JADX INFO: renamed from: a */
    public final C16618c m47798a() {
        return new C16618c(m47800c().f63939a, 0.1f, 1.0f - m47800c().f63941c, 1.0f - m47800c().f63942d);
    }

    /* JADX INFO: renamed from: b */
    public final C16618c m47799b() {
        return new C16618c(m47800c().f63939a, m47800c().f63940b, 1.0f - m47800c().f63941c, m47798a().f63942d - 0.1f);
    }

    /* JADX INFO: renamed from: c */
    public final C16618c m47800c() {
        return AbstractC23542a.m68149a(this.state.getInsets(), this.axisScale);
    }

    /* JADX INFO: renamed from: d */
    public final C16618c m47801d() {
        return new C16618c(m47799b().f63939a, m47800c().f63940b, m47799b().f63941c, m47799b().f63942d);
    }

    /* JADX INFO: renamed from: e */
    public final C16618c m47802e() {
        return this.state.getStartVerticalAxis() != null ? new C16618c(0.0f, m47800c().f63940b, this.startVerticalAxisSize, m47799b().f63942d) : C16618c.f63938e;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16980a)) {
            return false;
        }
        C16980a c16980a = (C16980a) other;
        return AbstractC22676k.m65745e(this.state, c16980a.state) && Float.compare(this.axisScale, c16980a.axisScale) == 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getStartVerticalAxisSize() {
        return this.startVerticalAxisSize;
    }

    public int hashCode() {
        return Float.hashCode(this.axisScale) + (this.state.hashCode() * 31);
    }

    public String toString() {
        return "ScrollableGraphPlaneGeometry(state=" + this.state + ", axisScale=" + this.axisScale + ")";
    }

    public /* synthetic */ C16980a(C16994k c16994k, float f13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c16994k, (i13 & 2) != 0 ? 1.0f : f13);
    }
}
