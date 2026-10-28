package i61;

import g61.C15529b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j61.C21369c;
import j61.C21374h;
import l91.AbstractC23542a;
import p181h2.C16618c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i61.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001aR\u0014\u0010 \u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001aR\u0014\u0010\"\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001aR\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010%R\u0014\u0010*\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010%R\u0014\u0010,\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010%R\u0014\u0010.\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010%R\u0014\u00100\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010%R\u0014\u00102\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010%R\u0014\u00103\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010%R\u0014\u00105\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010%¨\u00066"}, m65681d2 = {"Li61/c;", "Li61/b;", "Lj61/h;", "state", "", "axisScale", "<init>", "(Lj61/h;F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lj61/h;", "getState", "()Lj61/h;", "b", "F", "getAxisScale", "()F", "d", "startVerticalAxisSize", "l", "endVerticalAxisSize", "n", "bottomHorizontalAxisSize", "i", "topHorizontalAxisSize", "Lh2/c;", "j", "()Lh2/c;", "scaledInsets", "k", "bottomHorizontalAxisRect", "g", "topHorizontalAxisRect", "f", "startVerticalAxisRect", "c", "gridLineRect", "m", "endVerticalAxisRect", "e", "axisDescriptionRect", "contentRect", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "scrubberRect", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18154c implements InterfaceC18153b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21374h state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float axisScale;

    public C18154c(C21374h state, float f13) {
        AbstractC22676k.m65750j(state, "state");
        this.state = state;
        this.axisScale = f13;
    }

    @Override // i61.InterfaceC18153b
    /* JADX INFO: renamed from: a */
    public C16618c mo52120a() {
        return new C16618c(mo52123d() + mo52129j().f63939a, mo52126g().f63942d, (1.0f - mo52129j().f63941c) - mo52131l(), mo52130k().f63940b - mo52129j().f63942d);
    }

    @Override // i61.InterfaceC18153b
    /* JADX INFO: renamed from: b */
    public /* bridge */ C16618c mo52121b(C21369c c21369c) {
        return super.mo52121b(c21369c);
    }

    @Override // i61.InterfaceC18153b
    /* JADX INFO: renamed from: c */
    public C16618c mo52122c() {
        return new C16618c(mo52123d(), mo52126g().f63942d, 1.0f - mo52131l(), mo52130k().f63940b - mo52129j().f63942d);
    }

    @Override // i61.InterfaceC18153b
    /* JADX INFO: renamed from: d */
    public float mo52123d() {
        C15529b startVerticalAxis = this.state.getStartVerticalAxis();
        return (startVerticalAxis != null ? startVerticalAxis.getSize() : 0.0f) * this.axisScale;
    }

    @Override // i61.InterfaceC18153b
    /* JADX INFO: renamed from: e */
    public C16618c mo52124e() {
        return new C16618c(mo52123d() + mo52129j().f63939a, 1.0f - mo52133n(), (1.0f - mo52131l()) - mo52129j().f63941c, 1.0f);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18154c)) {
            return false;
        }
        C18154c c18154c = (C18154c) other;
        return AbstractC22676k.m65745e(this.state, c18154c.state) && Float.compare(this.axisScale, c18154c.axisScale) == 0;
    }

    @Override // i61.InterfaceC18153b
    /* JADX INFO: renamed from: f */
    public C16618c mo52125f() {
        return this.state.getStartVerticalAxis() != null ? new C16618c(0.0f, mo52129j().f63940b, mo52123d(), mo52130k().f63940b - mo52129j().f63942d) : C16618c.f63938e;
    }

    @Override // i61.InterfaceC18153b
    /* JADX INFO: renamed from: g */
    public C16618c mo52126g() {
        return new C16618c(mo52123d() + mo52129j().f63939a, mo52129j().f63940b, (1.0f - mo52131l()) - mo52129j().f63941c, mo52128i() + mo52129j().f63940b);
    }

    @Override // i61.InterfaceC18153b
    /* JADX INFO: renamed from: h */
    public C16618c mo52127h() {
        return new C16618c(mo52120a().f63939a, 0.0f, mo52120a().f63941c, (mo52133n() / 4.0f) + mo52130k().f63940b);
    }

    public int hashCode() {
        return Float.hashCode(this.axisScale) + (this.state.hashCode() * 31);
    }

    @Override // i61.InterfaceC18153b
    /* JADX INFO: renamed from: i */
    public float mo52128i() {
        C15529b topHorizontalAxis = this.state.getTopHorizontalAxis();
        return (topHorizontalAxis != null ? topHorizontalAxis.getSize() : 0.0f) * this.axisScale;
    }

    @Override // i61.InterfaceC18153b
    /* JADX INFO: renamed from: j */
    public C16618c mo52129j() {
        return AbstractC23542a.m68149a(this.state.getInsets(), this.axisScale);
    }

    @Override // i61.InterfaceC18153b
    /* JADX INFO: renamed from: k */
    public C16618c mo52130k() {
        return new C16618c(mo52123d() + mo52129j().f63939a, 1.0f - mo52133n(), (1.0f - mo52131l()) - mo52129j().f63941c, 1.0f);
    }

    @Override // i61.InterfaceC18153b
    /* JADX INFO: renamed from: l */
    public float mo52131l() {
        C15529b endVerticalAxis = this.state.getEndVerticalAxis();
        return (endVerticalAxis != null ? endVerticalAxis.getSize() : 0.0f) * this.axisScale;
    }

    @Override // i61.InterfaceC18153b
    /* JADX INFO: renamed from: m */
    public C16618c mo52132m() {
        return this.state.getEndVerticalAxis() != null ? new C16618c(1.0f - mo52131l(), mo52129j().f63940b, 1.0f, mo52130k().f63940b - mo52129j().f63942d) : C16618c.f63938e;
    }

    @Override // i61.InterfaceC18153b
    /* JADX INFO: renamed from: n */
    public float mo52133n() {
        C15529b bottomHorizontalAxis = this.state.getBottomHorizontalAxis();
        return (bottomHorizontalAxis != null ? bottomHorizontalAxis.getSize() : 0.0f) * this.axisScale;
    }

    public String toString() {
        return "StandardGraphPlaneGeometry(state=" + this.state + ", axisScale=" + this.axisScale + ")";
    }
}
