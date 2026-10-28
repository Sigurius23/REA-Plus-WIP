package xq2;

import c51.C4242s;
import com.whoop.design.util.TextResource;
import java.util.List;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: xq2.g1 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0019\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010%\u001a\u0004\b!\u0010\u0014R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001d\u0010(¨\u0006)"}, m65681d2 = {"Lxq2/g1;", "Lm91/u;", "", "amoebaHighlighted", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "Lc51/s;", "amoeba", "", "ticksPerStep", "", "Lxq2/g0;", "generatedTicks", "<init>", "(ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc51/s;ILjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getAmoebaHighlighted", "()Z", "b", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "c", "d", "Lc51/s;", "()Lc51/s;", "I", "f", "Ljava/util/List;", "()Ljava/util/List;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38566g1 implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean amoebaHighlighted;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C4242s amoeba;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int ticksPerStep;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<C38565g0> generatedTicks;

    public C38566g1(boolean z4, TextResource title, TextResource subtitle, C4242s c4242s, int i13, List<C38565g0> generatedTicks) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(generatedTicks, "generatedTicks");
        this.amoebaHighlighted = z4;
        this.title = title;
        this.subtitle = subtitle;
        this.amoeba = c4242s;
        this.ticksPerStep = i13;
        this.generatedTicks = generatedTicks;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C4242s getAmoeba() {
        return this.amoeba;
    }

    /* JADX INFO: renamed from: b */
    public final List<C38565g0> m123647b() {
        return this.generatedTicks;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getTicksPerStep() {
        return this.ticksPerStep;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38566g1)) {
            return false;
        }
        C38566g1 c38566g1 = (C38566g1) other;
        return this.amoebaHighlighted == c38566g1.amoebaHighlighted && AbstractC22676k.m65745e(this.title, c38566g1.title) && AbstractC22676k.m65745e(this.subtitle, c38566g1.subtitle) && AbstractC22676k.m65745e(this.amoeba, c38566g1.amoeba) && this.ticksPerStep == c38566g1.ticksPerStep && AbstractC22676k.m65745e(this.generatedTicks, c38566g1.generatedTicks);
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(Boolean.hashCode(this.amoebaHighlighted) * 31, this.title, 31), this.subtitle, 31);
        C4242s c4242s = this.amoeba;
        return this.generatedTicks.hashCode() + AbstractC11266d.m30448b(this.ticksPerStep, (iM95625a + (c4242s == null ? 0 : c4242s.hashCode())) * 31, 31);
    }

    public String toString() {
        return "YearInReviewTimelineState(amoebaHighlighted=" + this.amoebaHighlighted + ", title=" + this.title + ", subtitle=" + this.subtitle + ", amoeba=" + this.amoeba + ", ticksPerStep=" + this.ticksPerStep + ", generatedTicks=" + this.generatedTicks + ")";
    }
}
