package qt1;

import java.util.Arrays;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: qt1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b!\u0010\u0014R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001d\u0010%\u001a\u0004\b\u001b\u0010&¨\u0006'"}, m65681d2 = {"Lqt1/b;", "", "Ly81/f;", "color", "", "strokeWidth", "", "fadePercent", "fadeStartIndex", "", "Lqt1/a;", "graphPoints", "", "drawCircles", "<init>", "(Ly81/f;FII[Lqt1/a;Z)V", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ly81/f;", "()Ly81/f;", "b", "F", "f", "()F", "c", "I", "d", "e", "[Lqt1/a;", "()[Lqt1/a;", "Z", "()Z", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30588b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC39333f color;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float strokeWidth;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int fadePercent;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int fadeStartIndex;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C30587a[] graphPoints;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean drawCircles;

    public C30588b(EnumC39333f color, float f13, int i13, int i14, C30587a[] graphPoints, boolean z4) {
        AbstractC22676k.m65750j(color, "color");
        AbstractC22676k.m65750j(graphPoints, "graphPoints");
        this.color = color;
        this.strokeWidth = f13;
        this.fadePercent = i13;
        this.fadeStartIndex = i14;
        this.graphPoints = graphPoints;
        this.drawCircles = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC39333f getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getDrawCircles() {
        return this.drawCircles;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getFadePercent() {
        return this.fadePercent;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getFadeStartIndex() {
        return this.fadeStartIndex;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C30587a[] getGraphPoints() {
        return this.graphPoints;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!C30588b.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(other, "null cannot be cast to non-null type com.whoop.labrador.feature.reading.domain.models.LabradorReadingLineGraph");
        C30588b c30588b = (C30588b) other;
        return this.color == c30588b.color && this.strokeWidth == c30588b.strokeWidth && this.fadePercent == c30588b.fadePercent && this.fadeStartIndex == c30588b.fadeStartIndex && Arrays.equals(this.graphPoints, c30588b.graphPoints) && this.drawCircles == c30588b.drawCircles;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getStrokeWidth() {
        return this.strokeWidth;
    }

    public int hashCode() {
        return Boolean.hashCode(this.drawCircles) + ((Arrays.hashCode(this.graphPoints) + ((((AbstractC11266d.m30447a(this.strokeWidth, this.color.hashCode() * 31, 31) + this.fadePercent) * 31) + this.fadeStartIndex) * 31)) * 31);
    }

    public String toString() {
        EnumC39333f enumC39333f = this.color;
        float f13 = this.strokeWidth;
        int i13 = this.fadePercent;
        int i14 = this.fadeStartIndex;
        String string = Arrays.toString(this.graphPoints);
        boolean z4 = this.drawCircles;
        StringBuilder sb4 = new StringBuilder("LabradorReadingLineGraph(color=");
        sb4.append(enumC39333f);
        sb4.append(", strokeWidth=");
        sb4.append(f13);
        sb4.append(", fadePercent=");
        AbstractC30802r.m94773v(sb4, i13, ", fadeStartIndex=", i14, ", graphPoints=");
        return AbstractC21702c.m61137h(sb4, string, ", drawCircles=", z4, ")");
    }

    public /* synthetic */ C30588b(EnumC39333f enumC39333f, float f13, int i13, int i14, C30587a[] c30587aArr, boolean z4, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC39333f, f13, (i15 & 4) != 0 ? 0 : i13, (i15 & 8) != 0 ? 0 : i14, c30587aArr, z4);
    }
}
