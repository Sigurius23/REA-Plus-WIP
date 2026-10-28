package j51;

import androidx.profileinstaller.ProfileVerifier;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import live.hms.video.error.ErrorCodes;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: j51.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001Bý\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\f\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\f\u0012\b\b\u0002\u0010\u001d\u001a\u00020\f\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u0002\u0012\b\b\u0002\u0010!\u001a\u00020\u0015\u0012\b\b\u0002\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\"2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b5\u00107R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b:\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b4\u0010?\u001a\u0004\b@\u0010)R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010/\u001a\u0004\b2\u00101R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010/\u001a\u0004\bB\u00101R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bG\u0010D\u001a\u0004\bH\u0010FR\u0017\u0010\u0013\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bE\u0010D\u001a\u0004\bI\u0010FR\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bJ\u0010D\u001a\u0004\bK\u0010FR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bL\u0010/\u001a\u0004\bM\u00101R\u0017\u0010\u0017\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b0\u0010/\u001a\u0004\bN\u00101R\u0017\u0010\u0018\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bK\u0010/\u001a\u0004\bO\u00101R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u0010/\u001a\u0004\bP\u00101R\u0017\u0010\u001a\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bH\u0010?\u001a\u0004\bJ\u0010)R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bN\u0010/\u001a\u0004\bL\u00101R\u0017\u0010\u001c\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bM\u0010?\u001a\u0004\b.\u0010)R\u0017\u0010\u001d\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bO\u0010?\u001a\u0004\bA\u0010)R\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bQ\u0010D\u001a\u0004\bC\u0010FR\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010/\u001a\u0004\bG\u00101R\u0017\u0010!\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bP\u0010/\u001a\u0004\bQ\u00101R\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b@\u0010R\u001a\u0004\bS\u0010T¨\u0006U"}, m65681d2 = {"Lj51/g;", "Lm91/u;", "", "percentValue", "", "centerSubtitle", "Lj51/a;", "center", "Lkd1/o;", "centerImage", "Lj51/b;", "footer", "", "totalSegments", "arcSweepAngle", "startAngle", "Li2/x;", "inactiveColor", "progressGradientStart", "progressGradientMid", "progressGradientEnd", "Ly3/f;", "segmentWidth", "segmentHeight", "shadowHeight", "taperFactor", "largeGapEvery", "largeGapExtraDeg", "animationDuration", "highlightDuration", "", "highlightPauseMillis", "highlightTailLengthPercent", "size", "", "isPreview", "<init>", "(FLjava/lang/String;Lj51/a;Lkd1/o;Lj51/b;IFFJJJJFFFFIFIIJFFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "F", "n", "()F", "b", "Ljava/lang/String;", "f", "c", "Lj51/a;", "()Lj51/a;", "d", "Lkd1/o;", "e", "()Lkd1/o;", "Lj51/b;", "g", "()Lj51/b;", "I", "x", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "v", "i", "J", "k", "()J", "j", "q", "p", "l", "o", "m", "s", "r", "t", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "u", "Z", "y", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21339g implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float percentValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String centerSubtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C21333a center;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC22403o centerImage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C21334b footer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int totalSegments;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final float arcSweepAngle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final float startAngle;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final long inactiveColor;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final long progressGradientStart;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final long progressGradientMid;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final long progressGradientEnd;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final float segmentWidth;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final float segmentHeight;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final float shadowHeight;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final float taperFactor;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final int largeGapEvery;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final float largeGapExtraDeg;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final int animationDuration;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final int highlightDuration;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final long highlightPauseMillis;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final float highlightTailLengthPercent;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final float size;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final boolean isPreview;

    public /* synthetic */ C21339g(float f13, String str, C21333a c21333a, AbstractC22403o abstractC22403o, C21334b c21334b, int i13, float f14, float f15, long j7, long j13, long j14, long j15, float f16, float f17, float f18, float f19, int i14, float f24, int i15, int i16, long j16, float f25, float f26, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, str, c21333a, abstractC22403o, c21334b, i13, f14, f15, j7, j13, j14, j15, f16, f17, f18, f19, i14, f24, i15, i16, j16, f25, f26, z4);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAnimationDuration() {
        return this.animationDuration;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getArcSweepAngle() {
        return this.arcSweepAngle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C21333a getCenter() {
        return this.center;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final AbstractC22403o getCenterImage() {
        return this.centerImage;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21339g)) {
            return false;
        }
        C21339g c21339g = (C21339g) other;
        return Float.compare(this.percentValue, c21339g.percentValue) == 0 && AbstractC22676k.m65745e(this.centerSubtitle, c21339g.centerSubtitle) && AbstractC22676k.m65745e(this.center, c21339g.center) && AbstractC22676k.m65745e(this.centerImage, c21339g.centerImage) && AbstractC22676k.m65745e(this.footer, c21339g.footer) && this.totalSegments == c21339g.totalSegments && Float.compare(this.arcSweepAngle, c21339g.arcSweepAngle) == 0 && Float.compare(this.startAngle, c21339g.startAngle) == 0 && C17919x.m51542d(this.inactiveColor, c21339g.inactiveColor) && C17919x.m51542d(this.progressGradientStart, c21339g.progressGradientStart) && C17919x.m51542d(this.progressGradientMid, c21339g.progressGradientMid) && C17919x.m51542d(this.progressGradientEnd, c21339g.progressGradientEnd) && C39174f.m124782b(this.segmentWidth, c21339g.segmentWidth) && C39174f.m124782b(this.segmentHeight, c21339g.segmentHeight) && C39174f.m124782b(this.shadowHeight, c21339g.shadowHeight) && Float.compare(this.taperFactor, c21339g.taperFactor) == 0 && this.largeGapEvery == c21339g.largeGapEvery && Float.compare(this.largeGapExtraDeg, c21339g.largeGapExtraDeg) == 0 && this.animationDuration == c21339g.animationDuration && this.highlightDuration == c21339g.highlightDuration && this.highlightPauseMillis == c21339g.highlightPauseMillis && Float.compare(this.highlightTailLengthPercent, c21339g.highlightTailLengthPercent) == 0 && C39174f.m124782b(this.size, c21339g.size) && this.isPreview == c21339g.isPreview;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCenterSubtitle() {
        return this.centerSubtitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C21334b getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getHighlightDuration() {
        return this.highlightDuration;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(Float.hashCode(this.percentValue) * 31, 31, this.centerSubtitle);
        C21333a c21333a = this.center;
        int iHashCode = (iM30450d + (c21333a == null ? 0 : c21333a.hashCode())) * 31;
        AbstractC22403o abstractC22403o = this.centerImage;
        int iHashCode2 = (iHashCode + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31;
        C21334b c21334b = this.footer;
        int iM30447a = AbstractC11266d.m30447a(this.startAngle, AbstractC11266d.m30447a(this.arcSweepAngle, AbstractC11266d.m30448b(this.totalSegments, (iHashCode2 + (c21334b != null ? c21334b.hashCode() : 0)) * 31, 31), 31), 31);
        long j7 = this.inactiveColor;
        int i13 = C17919x.f69638o;
        return Boolean.hashCode(this.isPreview) + AbstractC11266d.m30447a(this.size, AbstractC11266d.m30447a(this.highlightTailLengthPercent, AbstractC11266d.m30451e(AbstractC11266d.m30448b(this.highlightDuration, AbstractC11266d.m30448b(this.animationDuration, AbstractC11266d.m30447a(this.largeGapExtraDeg, AbstractC11266d.m30448b(this.largeGapEvery, AbstractC11266d.m30447a(this.taperFactor, AbstractC11266d.m30447a(this.shadowHeight, AbstractC11266d.m30447a(this.segmentHeight, AbstractC11266d.m30447a(this.segmentWidth, AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(iM30447a, j7, 31), this.progressGradientStart, 31), this.progressGradientMid, 31), this.progressGradientEnd, 31), 31), 31), 31), 31), 31), 31), 31), 31), this.highlightPauseMillis, 31), 31), 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getHighlightPauseMillis() {
        return this.highlightPauseMillis;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final float getHighlightTailLengthPercent() {
        return this.highlightTailLengthPercent;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getInactiveColor() {
        return this.inactiveColor;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getLargeGapEvery() {
        return this.largeGapEvery;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final float getLargeGapExtraDeg() {
        return this.largeGapExtraDeg;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final float getPercentValue() {
        return this.percentValue;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final long getProgressGradientEnd() {
        return this.progressGradientEnd;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final long getProgressGradientMid() {
        return this.progressGradientMid;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final long getProgressGradientStart() {
        return this.progressGradientStart;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final float getSegmentHeight() {
        return this.segmentHeight;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final float getSegmentWidth() {
        return this.segmentWidth;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final float getShadowHeight() {
        return this.shadowHeight;
    }

    public String toString() {
        float f13 = this.percentValue;
        String str = this.centerSubtitle;
        C21333a c21333a = this.center;
        AbstractC22403o abstractC22403o = this.centerImage;
        C21334b c21334b = this.footer;
        int i13 = this.totalSegments;
        float f14 = this.arcSweepAngle;
        float f15 = this.startAngle;
        String strM51548j = C17919x.m51548j(this.inactiveColor);
        String strM51548j2 = C17919x.m51548j(this.progressGradientStart);
        String strM51548j3 = C17919x.m51548j(this.progressGradientMid);
        String strM51548j4 = C17919x.m51548j(this.progressGradientEnd);
        String strM124783c = C39174f.m124783c(this.segmentWidth);
        String strM124783c2 = C39174f.m124783c(this.segmentHeight);
        String strM124783c3 = C39174f.m124783c(this.shadowHeight);
        float f16 = this.taperFactor;
        int i14 = this.largeGapEvery;
        float f17 = this.largeGapExtraDeg;
        int i15 = this.animationDuration;
        int i16 = this.highlightDuration;
        long j7 = this.highlightPauseMillis;
        float f18 = this.highlightTailLengthPercent;
        String strM124783c4 = C39174f.m124783c(this.size);
        boolean z4 = this.isPreview;
        StringBuilder sb4 = new StringBuilder("ChallengeProgressGaugeViewState(percentValue=");
        sb4.append(f13);
        sb4.append(", centerSubtitle=");
        sb4.append(str);
        sb4.append(", center=");
        sb4.append(c21333a);
        sb4.append(", centerImage=");
        sb4.append(abstractC22403o);
        sb4.append(", footer=");
        sb4.append(c21334b);
        sb4.append(", totalSegments=");
        sb4.append(i13);
        sb4.append(", arcSweepAngle=");
        AbstractC30802r.m94772u(sb4, f14, ", startAngle=", f15, ", inactiveColor=");
        AbstractC11266d.m30444B(sb4, strM51548j, ", progressGradientStart=", strM51548j2, ", progressGradientMid=");
        AbstractC11266d.m30444B(sb4, strM51548j3, ", progressGradientEnd=", strM51548j4, ", segmentWidth=");
        AbstractC11266d.m30444B(sb4, strM124783c, ", segmentHeight=", strM124783c2, ", shadowHeight=");
        sb4.append(strM124783c3);
        sb4.append(", taperFactor=");
        sb4.append(f16);
        sb4.append(", largeGapEvery=");
        sb4.append(i14);
        sb4.append(", largeGapExtraDeg=");
        sb4.append(f17);
        sb4.append(", animationDuration=");
        AbstractC30802r.m94773v(sb4, i15, ", highlightDuration=", i16, ", highlightPauseMillis=");
        sb4.append(j7);
        sb4.append(", highlightTailLengthPercent=");
        sb4.append(f18);
        sb4.append(", size=");
        sb4.append(strM124783c4);
        sb4.append(", isPreview=");
        sb4.append(z4);
        sb4.append(")");
        return sb4.toString();
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final float getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final float getStartAngle() {
        return this.startAngle;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final float getTaperFactor() {
        return this.taperFactor;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final int getTotalSegments() {
        return this.totalSegments;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final boolean getIsPreview() {
        return this.isPreview;
    }

    private C21339g(float f13, String centerSubtitle, C21333a c21333a, AbstractC22403o abstractC22403o, C21334b c21334b, int i13, float f14, float f15, long j7, long j13, long j14, long j15, float f16, float f17, float f18, float f19, int i14, float f24, int i15, int i16, long j16, float f25, float f26, boolean z4) {
        AbstractC22676k.m65750j(centerSubtitle, "centerSubtitle");
        this.percentValue = f13;
        this.centerSubtitle = centerSubtitle;
        this.center = c21333a;
        this.centerImage = abstractC22403o;
        this.footer = c21334b;
        this.totalSegments = i13;
        this.arcSweepAngle = f14;
        this.startAngle = f15;
        this.inactiveColor = j7;
        this.progressGradientStart = j13;
        this.progressGradientMid = j14;
        this.progressGradientEnd = j15;
        this.segmentWidth = f16;
        this.segmentHeight = f17;
        this.shadowHeight = f18;
        this.taperFactor = f19;
        this.largeGapEvery = i14;
        this.largeGapExtraDeg = f24;
        this.animationDuration = i15;
        this.highlightDuration = i16;
        this.highlightPauseMillis = j16;
        this.highlightTailLengthPercent = f25;
        this.size = f26;
        this.isPreview = z4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C21339g(float f13, String str, C21333a c21333a, AbstractC22403o abstractC22403o, C21334b c21334b, int i13, float f14, float f15, long j7, long j13, long j14, long j15, float f16, float f17, float f18, float f19, int i14, float f24, int i15, int i16, long j16, float f25, float f26, boolean z4, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        float f27 = (i17 & 1) != 0 ? 0.0f : f13;
        String str2 = (i17 & 2) != 0 ? "" : str;
        C21333a c21333a2 = (i17 & 4) != 0 ? null : c21333a;
        AbstractC22403o abstractC22403o2 = (i17 & 8) != 0 ? null : abstractC22403o;
        C21334b c21334b2 = (i17 & 16) == 0 ? c21334b : null;
        int i18 = (i17 & 32) != 0 ? 100 : i13;
        float f28 = (i17 & 64) != 0 ? 240.0f : f14;
        float f29 = (i17 & 128) != 0 ? 238.0f : f15;
        long jM51517e = (i17 & 256) != 0 ? AbstractC17918w0.m51517e(4282007623L) : j7;
        long jM51517e2 = (i17 & 512) != 0 ? AbstractC17918w0.m51517e(4282334443L) : j13;
        long jM51517e3 = (i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? AbstractC17918w0.m51517e(4294967295L) : j14;
        long jM51517e4 = (i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? AbstractC17918w0.m51517e(4289864244L) : j15;
        AbstractC22403o abstractC22403o3 = abstractC22403o2;
        this(f27, str2, c21333a2, abstractC22403o3, c21334b2, i18, f28, f29, jM51517e, jM51517e2, jM51517e3, jM51517e4, (i17 & 4096) != 0 ? 5 : f16, (i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? 10 : f17, (i17 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? 30 : f18, (i17 & 32768) != 0 ? 0.3f : f19, (i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? 10 : i14, (i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? 0.8f : f24, (i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? 1600 : i15, (i17 & 524288) != 0 ? ErrorCodes.InitAPIErrors.cHTTPError : i16, (i17 & 1048576) != 0 ? 1500L : j16, (i17 & 2097152) != 0 ? 15.0f : f25, (i17 & 4194304) != 0 ? 320 : f26, (i17 & 8388608) != 0 ? false : z4, null);
    }
}
