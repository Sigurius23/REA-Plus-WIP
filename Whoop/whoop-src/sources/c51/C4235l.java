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

/* JADX INFO: renamed from: c51.l */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\t\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010,\u001a\u0004\b/\u0010.R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\"\u00100\u001a\u0004\b+\u00101R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b)\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b \u00107R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b5\u0010:R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010!\u001a\u0004\b#\u0010\u001bR\u0011\u0010=\u001a\u00020<8F¢\u0006\u0006\u001a\u0004\b'\u00101¨\u0006>"}, m65681d2 = {"Lc51/l;", "", "", "segmentCount", "Li93/f;", "", "pointScalarRange", "Li93/j;", "segmentCountRange", "Ld51/d;", "minTransformValue", "maxTransformValue", "Lkotlin/time/Duration;", "animationIntervalPerGroup", "", "transformUpdatesPerInterval", "Ld0/z;", "animationEasing", "Ly3/f;", "strokeWidth", "animationGroups", "<init>", "(ILi93/f;Li93/j;Ld51/d;Ld51/d;JDLd0/z;FILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "f", "b", "Li93/f;", "e", "()Li93/f;", "c", "Li93/j;", "g", "()Li93/j;", "d", "Ld51/d;", "getMinTransformValue", "()Ld51/d;", "getMaxTransformValue", "J", "()J", "D", "getTransformUpdatesPerInterval", "()D", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ld0/z;", "()Ld0/z;", "i", "F", "()F", "j", "", "animationInterval", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4235l {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int segmentCount;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC18280f pointScalarRange;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C18284j segmentCountRange;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C11716d minTransformValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C11716d maxTransformValue;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final long animationIntervalPerGroup;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final double transformUpdatesPerInterval;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC11419z animationEasing;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final float strokeWidth;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int animationGroups;

    public /* synthetic */ C4235l(int i13, InterfaceC18280f interfaceC18280f, C18284j c18284j, C11716d c11716d, C11716d c11716d2, long j7, double d3, InterfaceC11419z interfaceC11419z, float f13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, interfaceC18280f, c18284j, c11716d, c11716d2, j7, d3, interfaceC11419z, f13, i14);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC11419z getAnimationEasing() {
        return this.animationEasing;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getAnimationGroups() {
        return this.animationGroups;
    }

    /* JADX INFO: renamed from: c */
    public final long m13190c() {
        return (long) (Duration.m134273getInWholeMillisecondsimpl(this.animationIntervalPerGroup) / (this.transformUpdatesPerInterval * ((double) this.animationGroups)));
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getAnimationIntervalPerGroup() {
        return this.animationIntervalPerGroup;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC18280f getPointScalarRange() {
        return this.pointScalarRange;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4235l)) {
            return false;
        }
        C4235l c4235l = (C4235l) other;
        return this.segmentCount == c4235l.segmentCount && AbstractC22676k.m65745e(this.pointScalarRange, c4235l.pointScalarRange) && AbstractC22676k.m65745e(this.segmentCountRange, c4235l.segmentCountRange) && AbstractC22676k.m65745e(this.minTransformValue, c4235l.minTransformValue) && AbstractC22676k.m65745e(this.maxTransformValue, c4235l.maxTransformValue) && Duration.m134267equalsimpl0(this.animationIntervalPerGroup, c4235l.animationIntervalPerGroup) && Double.compare(this.transformUpdatesPerInterval, c4235l.transformUpdatesPerInterval) == 0 && AbstractC22676k.m65745e(this.animationEasing, c4235l.animationEasing) && C39174f.m124782b(this.strokeWidth, c4235l.strokeWidth) && this.animationGroups == c4235l.animationGroups;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getSegmentCount() {
        return this.segmentCount;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C18284j getSegmentCountRange() {
        return this.segmentCountRange;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getStrokeWidth() {
        return this.strokeWidth;
    }

    public int hashCode() {
        return Integer.hashCode(this.animationGroups) + AbstractC11266d.m30447a(this.strokeWidth, (this.animationEasing.hashCode() + AbstractC17176i.m48499a((Duration.m134283hashCodeimpl(this.animationIntervalPerGroup) + ((this.maxTransformValue.hashCode() + ((this.minTransformValue.hashCode() + ((this.segmentCountRange.hashCode() + ((this.pointScalarRange.hashCode() + (Integer.hashCode(this.segmentCount) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.transformUpdatesPerInterval)) * 31, 31);
    }

    public String toString() {
        return "AmoebaOutlineViewState(segmentCount=" + this.segmentCount + ", pointScalarRange=" + this.pointScalarRange + ", segmentCountRange=" + this.segmentCountRange + ", minTransformValue=" + this.minTransformValue + ", maxTransformValue=" + this.maxTransformValue + ", animationIntervalPerGroup=" + Duration.m134302toStringimpl(this.animationIntervalPerGroup) + ", transformUpdatesPerInterval=" + this.transformUpdatesPerInterval + ", animationEasing=" + this.animationEasing + ", strokeWidth=" + C39174f.m124783c(this.strokeWidth) + ", animationGroups=" + this.animationGroups + ")";
    }

    private C4235l(int i13, InterfaceC18280f pointScalarRange, C18284j segmentCountRange, C11716d minTransformValue, C11716d maxTransformValue, long j7, double d3, InterfaceC11419z animationEasing, float f13, int i14) {
        AbstractC22676k.m65750j(pointScalarRange, "pointScalarRange");
        AbstractC22676k.m65750j(segmentCountRange, "segmentCountRange");
        AbstractC22676k.m65750j(minTransformValue, "minTransformValue");
        AbstractC22676k.m65750j(maxTransformValue, "maxTransformValue");
        AbstractC22676k.m65750j(animationEasing, "animationEasing");
        this.segmentCount = i13;
        this.pointScalarRange = pointScalarRange;
        this.segmentCountRange = segmentCountRange;
        this.minTransformValue = minTransformValue;
        this.maxTransformValue = maxTransformValue;
        this.animationIntervalPerGroup = j7;
        this.transformUpdatesPerInterval = d3;
        this.animationEasing = animationEasing;
        this.strokeWidth = f13;
        this.animationGroups = i14;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4235l(int i13, InterfaceC18280f interfaceC18280f, C18284j c18284j, C11716d c11716d, C11716d c11716d2, long j7, double d3, InterfaceC11419z interfaceC11419z, float f13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        long duration;
        int i16 = (i15 & 1) != 0 ? 4 : i13;
        InterfaceC18280f c18279e = (i15 & 2) != 0 ? new C18279e(-30.0f, 30.0f) : interfaceC18280f;
        C18284j c18284j2 = (i15 & 4) != 0 ? new C18284j(4, 24, 1) : c18284j;
        C11716d c11716d3 = (i15 & 8) != 0 ? new C11716d(-40.0f, AbstractC37056f.m118958J(Float.valueOf(-55.0f)), -120.0f, null, 8, null) : c11716d;
        C11716d c11716d4 = (i15 & 16) != 0 ? new C11716d(30.0f, AbstractC37056f.m118958J(Float.valueOf(25.0f)), 0.0f, null, 8, null) : c11716d2;
        if ((i15 & 32) != 0) {
            Duration.Companion companion = Duration.INSTANCE;
            duration = DurationKt.toDuration(2, DurationUnit.SECONDS);
        } else {
            duration = j7;
        }
        double d14 = (i15 & 64) != 0 ? 1.0d : d3;
        C11716d c11716d5 = c11716d3;
        C11716d c11716d6 = c11716d4;
        long j13 = duration;
        double d15 = d14;
        this(i16, c18279e, c18284j2, c11716d5, c11716d6, j13, d15, (i15 & 128) != 0 ? new C11407v(0.1f, 0.0f, 0.9f, 1.0f) : interfaceC11419z, (i15 & 256) != 0 ? 1 : f13, (i15 & 512) != 0 ? 4 : i14, null);
    }
}
