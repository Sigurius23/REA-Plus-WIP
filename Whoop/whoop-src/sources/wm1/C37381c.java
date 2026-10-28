package wm1;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import i91.AbstractC18247a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j81.C21419c;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: wm1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00182\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b)\u0010,R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b-\u0010,R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b+\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b0\u00102\u001a\u0004\b3\u00104R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001b\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b=\u0010;R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b>\u00109\u001a\u0004\b?\u0010;R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b&\u0010B¨\u0006C"}, m65681d2 = {"Lwm1/c;", "Lm91/u;", "", "id", "Lcom/whoop/design/util/TextResource;", "title", "scoreDisplay", "scoreDisplaySuffix", "Lgz0/m0;", "titleEndIcon", "Li91/a;", "progressFillColor", "", "gaugeFillPercentage", "scoreTarget", "lowerOptimalPercentage", "higherOptimalPercentage", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;FLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Lcom/whoop/navigation/e;)V", "Ly3/f;", "diameter", "strokeWidth", "", "shouldHideOptimalRange", "Lj81/c;", "g", "(FFZ)Lj81/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "c", "d", "Lgz0/m0;", "f", "()Lgz0/m0;", "Li91/a;", "getProgressFillColor", "()Li91/a;", "F", "getGaugeFillPercentage", "()F", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/lang/Float;", "getScoreTarget", "()Ljava/lang/Float;", "i", "getLowerOptimalPercentage", "j", "getHigherOptimalPercentage", "k", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37381c implements InterfaceC25312u {

    /* JADX INFO: renamed from: l */
    public static final int f159899l;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource scoreDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource scoreDisplaySuffix;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC16313m0 titleEndIcon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AbstractC18247a progressFillColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final float gaugeFillPercentage;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Float scoreTarget;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Float lowerOptimalPercentage;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final Float higherOptimalPercentage;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C9598e destination;

    static {
        int i13 = C9598e.f28134d | AbstractC18247a.f71043a;
        int i14 = TextResource.$stable;
        f159899l = i13 | i14 | i14 | i14;
    }

    public C37381c(String str, TextResource title, TextResource scoreDisplay, TextResource scoreDisplaySuffix, EnumC16313m0 enumC16313m0, AbstractC18247a progressFillColor, float f13, Float f14, Float f15, Float f16, C9598e destination) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(scoreDisplay, "scoreDisplay");
        AbstractC22676k.m65750j(scoreDisplaySuffix, "scoreDisplaySuffix");
        AbstractC22676k.m65750j(progressFillColor, "progressFillColor");
        AbstractC22676k.m65750j(destination, "destination");
        this.id = str;
        this.title = title;
        this.scoreDisplay = scoreDisplay;
        this.scoreDisplaySuffix = scoreDisplaySuffix;
        this.titleEndIcon = enumC16313m0;
        this.progressFillColor = progressFillColor;
        this.gaugeFillPercentage = f13;
        this.scoreTarget = f14;
        this.lowerOptimalPercentage = f15;
        this.higherOptimalPercentage = f16;
        this.destination = destination;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getScoreDisplay() {
        return this.scoreDisplay;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getScoreDisplaySuffix() {
        return this.scoreDisplaySuffix;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37381c)) {
            return false;
        }
        C37381c c37381c = (C37381c) other;
        return AbstractC22676k.m65745e(this.id, c37381c.id) && AbstractC22676k.m65745e(this.title, c37381c.title) && AbstractC22676k.m65745e(this.scoreDisplay, c37381c.scoreDisplay) && AbstractC22676k.m65745e(this.scoreDisplaySuffix, c37381c.scoreDisplaySuffix) && this.titleEndIcon == c37381c.titleEndIcon && AbstractC22676k.m65745e(this.progressFillColor, c37381c.progressFillColor) && Float.compare(this.gaugeFillPercentage, c37381c.gaugeFillPercentage) == 0 && AbstractC22676k.m65745e(this.scoreTarget, c37381c.scoreTarget) && AbstractC22676k.m65745e(this.lowerOptimalPercentage, c37381c.lowerOptimalPercentage) && AbstractC22676k.m65745e(this.higherOptimalPercentage, c37381c.higherOptimalPercentage) && AbstractC22676k.m65745e(this.destination, c37381c.destination);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC16313m0 getTitleEndIcon() {
        return this.titleEndIcon;
    }

    /* JADX INFO: renamed from: g */
    public final C21419c m119687g(float diameter, float strokeWidth, boolean shouldHideOptimalRange) {
        return new C21419c(diameter, this.gaugeFillPercentage, this.progressFillColor, this.scoreTarget, this.lowerOptimalPercentage, this.higherOptimalPercentage, shouldHideOptimalRange, strokeWidth, 0.0f, null, null, 1792, null);
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        String str = this.id;
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a((str == null ? 0 : str.hashCode()) * 31, this.title, 31), this.scoreDisplay, 31), this.scoreDisplaySuffix, 31);
        EnumC16313m0 enumC16313m0 = this.titleEndIcon;
        int iM30447a = AbstractC11266d.m30447a(this.gaugeFillPercentage, (this.progressFillColor.hashCode() + ((iM95625a + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31)) * 31, 31);
        Float f13 = this.scoreTarget;
        int iHashCode = (iM30447a + (f13 == null ? 0 : f13.hashCode())) * 31;
        Float f14 = this.lowerOptimalPercentage;
        int iHashCode2 = (iHashCode + (f14 == null ? 0 : f14.hashCode())) * 31;
        Float f15 = this.higherOptimalPercentage;
        return this.destination.hashCode() + ((iHashCode2 + (f15 != null ? f15.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.title;
        TextResource textResource2 = this.scoreDisplay;
        TextResource textResource3 = this.scoreDisplaySuffix;
        EnumC16313m0 enumC16313m0 = this.titleEndIcon;
        AbstractC18247a abstractC18247a = this.progressFillColor;
        float f13 = this.gaugeFillPercentage;
        Float f14 = this.scoreTarget;
        Float f15 = this.lowerOptimalPercentage;
        Float f16 = this.higherOptimalPercentage;
        C9598e c9598e = this.destination;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("ScoreGaugeStickyDialState(id=", str, ", title=", textResource, ", scoreDisplay=");
        AbstractC30007c.m91855y(sbM91847q, textResource2, ", scoreDisplaySuffix=", textResource3, ", titleEndIcon=");
        sbM91847q.append(enumC16313m0);
        sbM91847q.append(", progressFillColor=");
        sbM91847q.append(abstractC18247a);
        sbM91847q.append(", gaugeFillPercentage=");
        sbM91847q.append(f13);
        sbM91847q.append(", scoreTarget=");
        sbM91847q.append(f14);
        sbM91847q.append(", lowerOptimalPercentage=");
        sbM91847q.append(f15);
        sbM91847q.append(", higherOptimalPercentage=");
        sbM91847q.append(f16);
        sbM91847q.append(", destination=");
        return AbstractC33745d.m106656o(sbM91847q, c9598e, ")");
    }
}
