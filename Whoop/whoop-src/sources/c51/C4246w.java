package c51;

import d51.C11716d;
import hc3.AbstractC17176i;
import i93.C18279e;
import i93.C18284j;
import i93.InterfaceC18280f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p077d0.C11407v;
import p077d0.InterfaceC11419z;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: c51.w */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b)\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b#\u00100\u001a\u0004\b!\u00101R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b2\u00104R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b.\u00105\u001a\u0004\b%\u0010\u001c¨\u00066"}, m65681d2 = {"Lc51/w;", "", "Li93/j;", "segmentCountRange", "Ld51/d;", "minTransformValue", "maxTransformValue", "Lkotlin/time/Duration;", "animationIntervalPerGroup", "", "transformUpdatesPerInterval", "Ld0/z;", "animationEasing", "Ly3/f;", "strokeWidth", "", "animationGroups", "<init>", "(Li93/j;Ld51/d;Ld51/d;JDLd0/z;FILkotlin/jvm/internal/DefaultConstructorMarker;)V", "paceOfAgingScore", "Li93/f;", "", "i", "(D)Li93/f;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li93/j;", "f", "()Li93/j;", "b", "Ld51/d;", "e", "()Ld51/d;", "c", "d", "J", "()J", "D", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()D", "Ld0/z;", "()Ld0/z;", "g", "F", "()F", "I", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4246w {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C18284j segmentCountRange;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C11716d minTransformValue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C11716d maxTransformValue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long animationIntervalPerGroup;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final double transformUpdatesPerInterval;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC11419z animationEasing;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final float strokeWidth;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int animationGroups;

    public /* synthetic */ C4246w(C18284j c18284j, C11716d c11716d, C11716d c11716d2, long j7, double d3, InterfaceC11419z interfaceC11419z, float f13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c18284j, c11716d, c11716d2, j7, d3, interfaceC11419z, f13, i13);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC11419z getAnimationEasing() {
        return this.animationEasing;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getAnimationGroups() {
        return this.animationGroups;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getAnimationIntervalPerGroup() {
        return this.animationIntervalPerGroup;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C11716d getMaxTransformValue() {
        return this.maxTransformValue;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C11716d getMinTransformValue() {
        return this.minTransformValue;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4246w)) {
            return false;
        }
        C4246w c4246w = (C4246w) other;
        return AbstractC22676k.m65745e(this.segmentCountRange, c4246w.segmentCountRange) && AbstractC22676k.m65745e(this.minTransformValue, c4246w.minTransformValue) && AbstractC22676k.m65745e(this.maxTransformValue, c4246w.maxTransformValue) && Duration.m134267equalsimpl0(this.animationIntervalPerGroup, c4246w.animationIntervalPerGroup) && Double.compare(this.transformUpdatesPerInterval, c4246w.transformUpdatesPerInterval) == 0 && AbstractC22676k.m65745e(this.animationEasing, c4246w.animationEasing) && C39174f.m124782b(this.strokeWidth, c4246w.strokeWidth) && this.animationGroups == c4246w.animationGroups;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C18284j getSegmentCountRange() {
        return this.segmentCountRange;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getStrokeWidth() {
        return this.strokeWidth;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final double getTransformUpdatesPerInterval() {
        return this.transformUpdatesPerInterval;
    }

    public int hashCode() {
        return Integer.hashCode(this.animationGroups) + AbstractC11266d.m30447a(this.strokeWidth, (this.animationEasing.hashCode() + AbstractC17176i.m48499a((Duration.m134283hashCodeimpl(this.animationIntervalPerGroup) + ((this.maxTransformValue.hashCode() + ((this.minTransformValue.hashCode() + (this.segmentCountRange.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.transformUpdatesPerInterval)) * 31, 31);
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC18280f m13266i(double paceOfAgingScore) {
        return new C18279e((float) this.minTransformValue.m31308c(paceOfAgingScore), (float) this.maxTransformValue.m31308c(paceOfAgingScore));
    }

    public String toString() {
        return "OutlineSettings(segmentCountRange=" + this.segmentCountRange + ", minTransformValue=" + this.minTransformValue + ", maxTransformValue=" + this.maxTransformValue + ", animationIntervalPerGroup=" + Duration.m134302toStringimpl(this.animationIntervalPerGroup) + ", transformUpdatesPerInterval=" + this.transformUpdatesPerInterval + ", animationEasing=" + this.animationEasing + ", strokeWidth=" + C39174f.m124783c(this.strokeWidth) + ", animationGroups=" + this.animationGroups + ")";
    }

    private C4246w(C18284j segmentCountRange, C11716d minTransformValue, C11716d maxTransformValue, long j7, double d3, InterfaceC11419z animationEasing, float f13, int i13) {
        AbstractC22676k.m65750j(segmentCountRange, "segmentCountRange");
        AbstractC22676k.m65750j(minTransformValue, "minTransformValue");
        AbstractC22676k.m65750j(maxTransformValue, "maxTransformValue");
        AbstractC22676k.m65750j(animationEasing, "animationEasing");
        this.segmentCountRange = segmentCountRange;
        this.minTransformValue = minTransformValue;
        this.maxTransformValue = maxTransformValue;
        this.animationIntervalPerGroup = j7;
        this.transformUpdatesPerInterval = d3;
        this.animationEasing = animationEasing;
        this.strokeWidth = f13;
        this.animationGroups = i13;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4246w(C18284j c18284j, C11716d c11716d, C11716d c11716d2, long j7, double d3, InterfaceC11419z interfaceC11419z, float f13, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        long duration;
        C18284j c18284j2 = (i14 & 1) != 0 ? new C18284j(4, 24, 1) : c18284j;
        C11716d c11716d3 = (i14 & 2) != 0 ? new C11716d(-16.0f, AbstractC37056f.m118958J(Float.valueOf(-22.0f)), -48.0f, null, 8, null) : c11716d;
        C11716d c11716d4 = (i14 & 4) != 0 ? new C11716d(12.0f, AbstractC37056f.m118958J(Float.valueOf(10.0f)), 0.0f, null, 8, null) : c11716d2;
        if ((i14 & 8) != 0) {
            Duration.Companion companion = Duration.INSTANCE;
            duration = DurationKt.toDuration(2, DurationUnit.SECONDS);
        } else {
            duration = j7;
        }
        double d14 = (i14 & 16) != 0 ? 1.0d : d3;
        C11716d c11716d5 = c11716d3;
        C11716d c11716d6 = c11716d4;
        long j13 = duration;
        double d15 = d14;
        this(c18284j2, c11716d5, c11716d6, j13, d15, (i14 & 32) != 0 ? new C11407v(0.1f, 0.0f, 0.9f, 1.0f) : interfaceC11419z, (i14 & 64) != 0 ? 1 : f13, (i14 & 128) == 0 ? i13 : 4, null);
    }
}
