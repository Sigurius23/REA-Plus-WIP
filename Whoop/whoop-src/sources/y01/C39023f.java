package y01;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: y01.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b$\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b\u001b\u0010#¨\u0006%"}, m65681d2 = {"Ly01/f;", "Lm91/u;", "", "totalProgressSteps", "currentProgressSteps", "Ly81/f;", "progressBarFillColor", "progressBarBackgroundColor", "Ly01/g;", "upperLeftState", "upperRightState", "lowerLeftState", "<init>", "(IILy81/f;Ly81/f;Ly01/g;Ly01/g;Ly01/g;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "f", "b", "c", "Ly81/f;", "e", "()Ly81/f;", "d", "Ly01/g;", "g", "()Ly01/g;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39023f implements InterfaceC25312u {

    /* JADX INFO: renamed from: h */
    public static final int f167966h = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int totalProgressSteps;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int currentProgressSteps;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC39333f progressBarFillColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC39333f progressBarBackgroundColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C39024g upperLeftState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C39024g upperRightState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C39024g lowerLeftState;

    public C39023f(int i13, int i14, EnumC39333f progressBarFillColor, EnumC39333f progressBarBackgroundColor, C39024g c39024g, C39024g c39024g2, C39024g c39024g3) {
        AbstractC22676k.m65750j(progressBarFillColor, "progressBarFillColor");
        AbstractC22676k.m65750j(progressBarBackgroundColor, "progressBarBackgroundColor");
        this.totalProgressSteps = i13;
        this.currentProgressSteps = i14;
        this.progressBarFillColor = progressBarFillColor;
        this.progressBarBackgroundColor = progressBarBackgroundColor;
        this.upperLeftState = c39024g;
        this.upperRightState = c39024g2;
        this.lowerLeftState = c39024g3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCurrentProgressSteps() {
        return this.currentProgressSteps;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C39024g getLowerLeftState() {
        return this.lowerLeftState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC39333f getProgressBarBackgroundColor() {
        return this.progressBarBackgroundColor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC39333f getProgressBarFillColor() {
        return this.progressBarFillColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39023f)) {
            return false;
        }
        C39023f c39023f = (C39023f) other;
        return this.totalProgressSteps == c39023f.totalProgressSteps && this.currentProgressSteps == c39023f.currentProgressSteps && this.progressBarFillColor == c39023f.progressBarFillColor && this.progressBarBackgroundColor == c39023f.progressBarBackgroundColor && AbstractC22676k.m65745e(this.upperLeftState, c39023f.upperLeftState) && AbstractC22676k.m65745e(this.upperRightState, c39023f.upperRightState) && AbstractC22676k.m65745e(this.lowerLeftState, c39023f.lowerLeftState);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getTotalProgressSteps() {
        return this.totalProgressSteps;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C39024g getUpperLeftState() {
        return this.upperLeftState;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C39024g getUpperRightState() {
        return this.upperRightState;
    }

    public int hashCode() {
        int iM61132c = AbstractC21702c.m61132c(this.progressBarBackgroundColor, AbstractC21702c.m61132c(this.progressBarFillColor, AbstractC11266d.m30448b(this.currentProgressSteps, Integer.hashCode(this.totalProgressSteps) * 31, 31), 31), 31);
        C39024g c39024g = this.upperLeftState;
        int iHashCode = (iM61132c + (c39024g == null ? 0 : c39024g.hashCode())) * 31;
        C39024g c39024g2 = this.upperRightState;
        int iHashCode2 = (iHashCode + (c39024g2 == null ? 0 : c39024g2.hashCode())) * 31;
        C39024g c39024g3 = this.lowerLeftState;
        return iHashCode2 + (c39024g3 != null ? c39024g3.hashCode() : 0);
    }

    public String toString() {
        int i13 = this.totalProgressSteps;
        int i14 = this.currentProgressSteps;
        EnumC39333f enumC39333f = this.progressBarFillColor;
        EnumC39333f enumC39333f2 = this.progressBarBackgroundColor;
        C39024g c39024g = this.upperLeftState;
        C39024g c39024g2 = this.upperRightState;
        C39024g c39024g3 = this.lowerLeftState;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "ProgressBreakdownState(totalProgressSteps=", ", currentProgressSteps=", ", progressBarFillColor=");
        sbM30465s.append(enumC39333f);
        sbM30465s.append(", progressBarBackgroundColor=");
        sbM30465s.append(enumC39333f2);
        sbM30465s.append(", upperLeftState=");
        sbM30465s.append(c39024g);
        sbM30465s.append(", upperRightState=");
        sbM30465s.append(c39024g2);
        sbM30465s.append(", lowerLeftState=");
        sbM30465s.append(c39024g3);
        sbM30465s.append(")");
        return sbM30465s.toString();
    }

    public /* synthetic */ C39023f(int i13, int i14, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, C39024g c39024g, C39024g c39024g2, C39024g c39024g3, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, i14, enumC39333f, enumC39333f2, (i15 & 16) != 0 ? null : c39024g, (i15 & 32) != 0 ? null : c39024g2, (i15 & 64) != 0 ? null : c39024g3);
    }
}
