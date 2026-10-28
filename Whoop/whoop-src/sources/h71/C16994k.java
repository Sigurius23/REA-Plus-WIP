package h71;

import g61.C15529b;
import j61.C21373g;
import p031b9.AbstractC2875y;
import p181h2.C16618c;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: h71.k */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJN\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010%\u001a\u0004\b$\u0010'R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b \u0010'¨\u0006("}, m65681d2 = {"Lh71/k;", "", "Lg61/b;", "startVerticalAxis", "Lh2/c;", "insets", "Lj61/g;", "accessibilityInfo", "", "scrubberEnabled", "initiallyScrolledToEnd", "dimContentOnScrub", "<init>", "(Lg61/b;Lh2/c;Lj61/g;ZZZ)V", "a", "(Lg61/b;Lh2/c;Lj61/g;ZZZ)Lh71/k;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lg61/b;", "g", "()Lg61/b;", "b", "Lh2/c;", "e", "()Lh2/c;", "c", "Lj61/g;", "getAccessibilityInfo", "()Lj61/g;", "d", "Z", "f", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16994k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C15529b startVerticalAxis;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C16618c insets;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C21373g accessibilityInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean scrubberEnabled;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean initiallyScrolledToEnd;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean dimContentOnScrub;

    public C16994k(C15529b c15529b, C16618c insets, C21373g accessibilityInfo, boolean z4, boolean z13, boolean z14) {
        AbstractC22676k.m65750j(insets, "insets");
        AbstractC22676k.m65750j(accessibilityInfo, "accessibilityInfo");
        this.startVerticalAxis = c15529b;
        this.insets = insets;
        this.accessibilityInfo = accessibilityInfo;
        this.scrubberEnabled = z4;
        this.initiallyScrolledToEnd = z13;
        this.dimContentOnScrub = z14;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C16994k m47859b(C16994k c16994k, C15529b c15529b, C16618c c16618c, C21373g c21373g, boolean z4, boolean z13, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c15529b = c16994k.startVerticalAxis;
        }
        if ((i13 & 2) != 0) {
            c16618c = c16994k.insets;
        }
        if ((i13 & 4) != 0) {
            c21373g = c16994k.accessibilityInfo;
        }
        if ((i13 & 8) != 0) {
            z4 = c16994k.scrubberEnabled;
        }
        if ((i13 & 16) != 0) {
            z13 = c16994k.initiallyScrolledToEnd;
        }
        if ((i13 & 32) != 0) {
            z14 = c16994k.dimContentOnScrub;
        }
        boolean z15 = z13;
        boolean z16 = z14;
        return c16994k.m47860a(c15529b, c16618c, c21373g, z4, z15, z16);
    }

    /* JADX INFO: renamed from: a */
    public final C16994k m47860a(C15529b startVerticalAxis, C16618c insets, C21373g accessibilityInfo, boolean scrubberEnabled, boolean initiallyScrolledToEnd, boolean dimContentOnScrub) {
        AbstractC22676k.m65750j(insets, "insets");
        AbstractC22676k.m65750j(accessibilityInfo, "accessibilityInfo");
        return new C16994k(startVerticalAxis, insets, accessibilityInfo, scrubberEnabled, initiallyScrolledToEnd, dimContentOnScrub);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getDimContentOnScrub() {
        return this.dimContentOnScrub;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getInitiallyScrolledToEnd() {
        return this.initiallyScrolledToEnd;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C16618c getInsets() {
        return this.insets;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16994k)) {
            return false;
        }
        C16994k c16994k = (C16994k) other;
        return AbstractC22676k.m65745e(this.startVerticalAxis, c16994k.startVerticalAxis) && AbstractC22676k.m65745e(this.insets, c16994k.insets) && AbstractC22676k.m65745e(this.accessibilityInfo, c16994k.accessibilityInfo) && this.scrubberEnabled == c16994k.scrubberEnabled && this.initiallyScrolledToEnd == c16994k.initiallyScrolledToEnd && this.dimContentOnScrub == c16994k.dimContentOnScrub;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getScrubberEnabled() {
        return this.scrubberEnabled;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C15529b getStartVerticalAxis() {
        return this.startVerticalAxis;
    }

    public int hashCode() {
        C15529b c15529b = this.startVerticalAxis;
        return Boolean.hashCode(this.dimContentOnScrub) + AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.accessibilityInfo.hashCode() + ((this.insets.hashCode() + ((c15529b == null ? 0 : c15529b.hashCode()) * 31)) * 31)) * 31, 31, this.scrubberEnabled), 31, this.initiallyScrolledToEnd);
    }

    public String toString() {
        C15529b c15529b = this.startVerticalAxis;
        C16618c c16618c = this.insets;
        C21373g c21373g = this.accessibilityInfo;
        boolean z4 = this.scrubberEnabled;
        boolean z13 = this.initiallyScrolledToEnd;
        boolean z14 = this.dimContentOnScrub;
        StringBuilder sb4 = new StringBuilder("ScrollablePlaneState(startVerticalAxis=");
        sb4.append(c15529b);
        sb4.append(", insets=");
        sb4.append(c16618c);
        sb4.append(", accessibilityInfo=");
        sb4.append(c21373g);
        sb4.append(", scrubberEnabled=");
        sb4.append(z4);
        sb4.append(", initiallyScrolledToEnd=");
        return AbstractC36095b.m114682j(sb4, z13, ", dimContentOnScrub=", z14, ")");
    }

    public /* synthetic */ C16994k(C15529b c15529b, C16618c c16618c, C21373g c21373g, boolean z4, boolean z13, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : c15529b, (i13 & 2) != 0 ? C16618c.f63938e : c16618c, (i13 & 4) != 0 ? new C21373g(null, null, null, null, 15, null) : c21373g, (i13 & 8) != 0 ? false : z4, (i13 & 16) != 0 ? false : z13, (i13 & 32) != 0 ? true : z14);
    }
}
