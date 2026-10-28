package j61;

import g61.C15529b;
import g61.C15534g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p181h2.C16618c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: j61.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b$\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001\u001bB\u009f\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ¨\u0001\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0006¢\u0006\f\n\u0004\b*\u00103\u001a\u0004\b6\u00105R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b+\u00108R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b0\u0010:\u001a\u0004\b2\u0010<R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b4\u0010=\u001a\u0004\b.\u0010>R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b?\u0010AR\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b;\u0010B\u001a\u0004\b9\u0010C¨\u0006D"}, m65681d2 = {"Lj61/h;", "", "Lg61/b;", "startVerticalAxis", "endVerticalAxis", "bottomHorizontalAxis", "topHorizontalAxis", "Lh2/c;", "insets", "", "Lj61/f;", "lines", "Lj61/c;", "graphAnnotations", "Lj61/g;", "accessibilityState", "", "scrubberEnabled", "clickable", "Lg61/g;", "buttons", "", "longPressTimeoutMillis", "", "horizontalGridLinePadding", "<init>", "(Lg61/b;Lg61/b;Lg61/b;Lg61/b;Lh2/c;Ljava/util/List;Ljava/util/List;Lj61/g;ZZLg61/g;JF)V", "a", "(Lg61/b;Lg61/b;Lg61/b;Lg61/b;Lh2/c;Ljava/util/List;Ljava/util/List;Lj61/g;ZZLg61/g;JF)Lj61/h;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lg61/b;", "n", "()Lg61/b;", "b", "g", "c", "d", "o", "e", "Lh2/c;", "j", "()Lh2/c;", "f", "Ljava/util/List;", "k", "()Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lj61/g;", "()Lj61/g;", "i", "Z", "m", "()Z", "Lg61/g;", "()Lg61/g;", "l", "J", "()J", "F", "()F", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21374h {

    /* JADX INFO: renamed from: o */
    public static final int f81745o = 8;

    /* JADX INFO: renamed from: p */
    private static final C16618c f81746p = new C16618c(0.0f, 0.025f, 0.0f, 0.04f);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C15529b startVerticalAxis;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C15529b endVerticalAxis;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C15529b bottomHorizontalAxis;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C15529b topHorizontalAxis;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C16618c insets;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<C21372f> lines;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<C21369c> graphAnnotations;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C21373g accessibilityState;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean scrubberEnabled;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean clickable;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C15534g buttons;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final long longPressTimeoutMillis;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final float horizontalGridLinePadding;

    public C21374h(C15529b c15529b, C15529b c15529b2, C15529b c15529b3, C15529b c15529b4, C16618c insets, List<C21372f> lines, List<C21369c> graphAnnotations, C21373g accessibilityState, boolean z4, boolean z13, C15534g c15534g, long j7, float f13) {
        AbstractC22676k.m65750j(insets, "insets");
        AbstractC22676k.m65750j(lines, "lines");
        AbstractC22676k.m65750j(graphAnnotations, "graphAnnotations");
        AbstractC22676k.m65750j(accessibilityState, "accessibilityState");
        this.startVerticalAxis = c15529b;
        this.endVerticalAxis = c15529b2;
        this.bottomHorizontalAxis = c15529b3;
        this.topHorizontalAxis = c15529b4;
        this.insets = insets;
        this.lines = lines;
        this.graphAnnotations = graphAnnotations;
        this.accessibilityState = accessibilityState;
        this.scrubberEnabled = z4;
        this.clickable = z13;
        this.buttons = c15534g;
        this.longPressTimeoutMillis = j7;
        this.horizontalGridLinePadding = f13;
    }

    /* JADX INFO: renamed from: a */
    public final C21374h m59985a(C15529b startVerticalAxis, C15529b endVerticalAxis, C15529b bottomHorizontalAxis, C15529b topHorizontalAxis, C16618c insets, List<C21372f> lines, List<C21369c> graphAnnotations, C21373g accessibilityState, boolean scrubberEnabled, boolean clickable, C15534g buttons, long longPressTimeoutMillis, float horizontalGridLinePadding) {
        AbstractC22676k.m65750j(insets, "insets");
        AbstractC22676k.m65750j(lines, "lines");
        AbstractC22676k.m65750j(graphAnnotations, "graphAnnotations");
        AbstractC22676k.m65750j(accessibilityState, "accessibilityState");
        return new C21374h(startVerticalAxis, endVerticalAxis, bottomHorizontalAxis, topHorizontalAxis, insets, lines, graphAnnotations, accessibilityState, scrubberEnabled, clickable, buttons, longPressTimeoutMillis, horizontalGridLinePadding);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C21373g getAccessibilityState() {
        return this.accessibilityState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C15529b getBottomHorizontalAxis() {
        return this.bottomHorizontalAxis;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C15534g getButtons() {
        return this.buttons;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21374h)) {
            return false;
        }
        C21374h c21374h = (C21374h) other;
        return AbstractC22676k.m65745e(this.startVerticalAxis, c21374h.startVerticalAxis) && AbstractC22676k.m65745e(this.endVerticalAxis, c21374h.endVerticalAxis) && AbstractC22676k.m65745e(this.bottomHorizontalAxis, c21374h.bottomHorizontalAxis) && AbstractC22676k.m65745e(this.topHorizontalAxis, c21374h.topHorizontalAxis) && AbstractC22676k.m65745e(this.insets, c21374h.insets) && AbstractC22676k.m65745e(this.lines, c21374h.lines) && AbstractC22676k.m65745e(this.graphAnnotations, c21374h.graphAnnotations) && AbstractC22676k.m65745e(this.accessibilityState, c21374h.accessibilityState) && this.scrubberEnabled == c21374h.scrubberEnabled && this.clickable == c21374h.clickable && AbstractC22676k.m65745e(this.buttons, c21374h.buttons) && this.longPressTimeoutMillis == c21374h.longPressTimeoutMillis && Float.compare(this.horizontalGridLinePadding, c21374h.horizontalGridLinePadding) == 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getClickable() {
        return this.clickable;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C15529b getEndVerticalAxis() {
        return this.endVerticalAxis;
    }

    /* JADX INFO: renamed from: h */
    public final List<C21369c> m59991h() {
        return this.graphAnnotations;
    }

    public int hashCode() {
        C15529b c15529b = this.startVerticalAxis;
        int iHashCode = (c15529b == null ? 0 : c15529b.hashCode()) * 31;
        C15529b c15529b2 = this.endVerticalAxis;
        int iHashCode2 = (iHashCode + (c15529b2 == null ? 0 : c15529b2.hashCode())) * 31;
        C15529b c15529b3 = this.bottomHorizontalAxis;
        int iHashCode3 = (iHashCode2 + (c15529b3 == null ? 0 : c15529b3.hashCode())) * 31;
        C15529b c15529b4 = this.topHorizontalAxis;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.accessibilityState.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b((this.insets.hashCode() + ((iHashCode3 + (c15529b4 == null ? 0 : c15529b4.hashCode())) * 31)) * 31, 31, this.lines), 31, this.graphAnnotations)) * 31, 31, this.scrubberEnabled), 31, this.clickable);
        C15534g c15534g = this.buttons;
        return Float.hashCode(this.horizontalGridLinePadding) + AbstractC11266d.m30451e((iM8289b + (c15534g != null ? c15534g.hashCode() : 0)) * 31, this.longPressTimeoutMillis, 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final float getHorizontalGridLinePadding() {
        return this.horizontalGridLinePadding;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C16618c getInsets() {
        return this.insets;
    }

    /* JADX INFO: renamed from: k */
    public final List<C21372f> m59994k() {
        return this.lines;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getLongPressTimeoutMillis() {
        return this.longPressTimeoutMillis;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getScrubberEnabled() {
        return this.scrubberEnabled;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final C15529b getStartVerticalAxis() {
        return this.startVerticalAxis;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final C15529b getTopHorizontalAxis() {
        return this.topHorizontalAxis;
    }

    public String toString() {
        C15529b c15529b = this.startVerticalAxis;
        C15529b c15529b2 = this.endVerticalAxis;
        C15529b c15529b3 = this.bottomHorizontalAxis;
        C15529b c15529b4 = this.topHorizontalAxis;
        C16618c c16618c = this.insets;
        List<C21372f> list = this.lines;
        List<C21369c> list2 = this.graphAnnotations;
        C21373g c21373g = this.accessibilityState;
        boolean z4 = this.scrubberEnabled;
        boolean z13 = this.clickable;
        C15534g c15534g = this.buttons;
        long j7 = this.longPressTimeoutMillis;
        float f13 = this.horizontalGridLinePadding;
        StringBuilder sb4 = new StringBuilder("GraphPlaneState(startVerticalAxis=");
        sb4.append(c15529b);
        sb4.append(", endVerticalAxis=");
        sb4.append(c15529b2);
        sb4.append(", bottomHorizontalAxis=");
        sb4.append(c15529b3);
        sb4.append(", topHorizontalAxis=");
        sb4.append(c15529b4);
        sb4.append(", insets=");
        sb4.append(c16618c);
        sb4.append(", lines=");
        sb4.append(list);
        sb4.append(", graphAnnotations=");
        sb4.append(list2);
        sb4.append(", accessibilityState=");
        sb4.append(c21373g);
        sb4.append(", scrubberEnabled=");
        AbstractC38963t7.m124392v(sb4, z4, ", clickable=", z13, ", buttons=");
        sb4.append(c15534g);
        sb4.append(", longPressTimeoutMillis=");
        sb4.append(j7);
        sb4.append(", horizontalGridLinePadding=");
        sb4.append(f13);
        sb4.append(")");
        return sb4.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C21374h(C15529b c15529b, C15529b c15529b2, C15529b c15529b3, C15529b c15529b4, C16618c c16618c, List list, List list2, C21373g c21373g, boolean z4, boolean z13, C15534g c15534g, long j7, float f13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        C15529b c15529b5 = (i13 & 1) != 0 ? null : c15529b;
        C15529b c15529b6 = (i13 & 2) != 0 ? null : c15529b2;
        C15529b c15529b7 = (i13 & 4) != 0 ? null : c15529b3;
        C15529b c15529b8 = (i13 & 8) != 0 ? null : c15529b4;
        C16618c c16618c2 = (i13 & 16) != 0 ? f81746p : c16618c;
        int i14 = i13 & 32;
        List list3 = C25271y.f99162w;
        this(c15529b5, c15529b6, c15529b7, c15529b8, c16618c2, i14 != 0 ? list3 : list, (i13 & 64) == 0 ? list2 : list3, (i13 & 128) != 0 ? new C21373g(null, null, null, null, 15, null) : c21373g, (i13 & 256) != 0 ? false : z4, (i13 & 512) != 0 ? true : z13, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 ? c15534g : null, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? 0L : j7, (i13 & 4096) != 0 ? 1.0f : f13);
    }
}
