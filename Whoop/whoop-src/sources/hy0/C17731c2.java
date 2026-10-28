package hy0;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p291l0.C22976l1;
import p291l0.InterfaceC22973k1;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import v63.AbstractC35745c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: hy0.c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ®\u0001\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00132\b\b\u0002\u0010\u001b\u001a\u00020\u001aHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u0010/R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b8\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u0010-\u001a\u0004\b>\u0010/R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010-\u001a\u0004\b?\u0010/R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010$R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bC\u0010A\u001a\u0004\bC\u0010$R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bB\u0010D\u001a\u0004\b=\u0010ER\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b6\u0010HR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b;\u0010I\u001a\u0004\b@\u0010JR\u0017\u0010\u0019\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b?\u0010D\u001a\u0004\bF\u0010ER\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b*\u0010K\u001a\u0004\b0\u0010L¨\u0006M"}, m65681d2 = {"Lhy0/c2;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "text", "", "includeBackground", "Lhy0/b2;", "trendTypeState", "isPressed", "Lgz0/m0;", "icon", "Lhy0/s0;", "removeSideRadius", "withIcon", "showBorder", "Lv63/c;", "overflow", "", "maxLines", "Ly3/f;", "iconSize", "Lcom/whoop/navigation/e;", "destination", "", "maxFontScaling", "radius", "Ll0/k1;", "backgroundPaddingValues", "<init>", "(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;Lhy0/s0;ZZIIFLcom/whoop/navigation/e;Ljava/lang/Float;FLl0/k1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;Lhy0/s0;ZZIIFLcom/whoop/navigation/e;Ljava/lang/Float;FLl0/k1;)Lhy0/c2;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "o", "()Lcom/whoop/design/util/TextResource;", "b", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "c", "Lhy0/b2;", "p", "()Lhy0/b2;", "d", "r", "e", "Lgz0/m0;", "f", "()Lgz0/m0;", "Lhy0/s0;", "m", "()Lhy0/s0;", "g", "q", "n", "i", "I", "k", "j", "F", "()F", "l", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "Ljava/lang/Float;", "()Ljava/lang/Float;", "Ll0/k1;", "()Ll0/k1;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17731c2 implements InterfaceC25312u {

    /* JADX INFO: renamed from: p */
    public static final int f68917p = C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean includeBackground;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC17727b2 trendTypeState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isPressed;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC17786s0 removeSideRadius;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean withIcon;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean showBorder;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int overflow;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int maxLines;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final float iconSize;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Float maxFontScaling;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final float radius;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final InterfaceC22973k1 backgroundPaddingValues;

    public /* synthetic */ C17731c2(TextResource textResource, boolean z4, EnumC17727b2 enumC17727b2, boolean z13, EnumC16313m0 enumC16313m0, EnumC17786s0 enumC17786s0, boolean z14, boolean z15, int i13, int i14, float f13, C9598e c9598e, Float f14, float f15, InterfaceC22973k1 interfaceC22973k1, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, z4, enumC17727b2, z13, enumC16313m0, enumC17786s0, z14, z15, i13, i14, f13, c9598e, f14, f15, interfaceC22973k1);
    }

    /* JADX INFO: renamed from: a */
    public final C17731c2 m50800a(TextResource text, boolean includeBackground, EnumC17727b2 trendTypeState, boolean isPressed, EnumC16313m0 icon, EnumC17786s0 removeSideRadius, boolean withIcon, boolean showBorder, int overflow, int maxLines, float iconSize, C9598e destination, Float maxFontScaling, float radius, InterfaceC22973k1 backgroundPaddingValues) {
        AbstractC22676k.m65750j(trendTypeState, "trendTypeState");
        AbstractC22676k.m65750j(removeSideRadius, "removeSideRadius");
        AbstractC22676k.m65750j(backgroundPaddingValues, "backgroundPaddingValues");
        return new C17731c2(text, includeBackground, trendTypeState, isPressed, icon, removeSideRadius, withIcon, showBorder, overflow, maxLines, iconSize, destination, maxFontScaling, radius, backgroundPaddingValues, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC22973k1 getBackgroundPaddingValues() {
        return this.backgroundPaddingValues;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17731c2)) {
            return false;
        }
        C17731c2 c17731c2 = (C17731c2) other;
        return AbstractC22676k.m65745e(this.text, c17731c2.text) && this.includeBackground == c17731c2.includeBackground && this.trendTypeState == c17731c2.trendTypeState && this.isPressed == c17731c2.isPressed && this.icon == c17731c2.icon && this.removeSideRadius == c17731c2.removeSideRadius && this.withIcon == c17731c2.withIcon && this.showBorder == c17731c2.showBorder && this.overflow == c17731c2.overflow && this.maxLines == c17731c2.maxLines && C39174f.m124782b(this.iconSize, c17731c2.iconSize) && AbstractC22676k.m65745e(this.destination, c17731c2.destination) && AbstractC22676k.m65745e(this.maxFontScaling, c17731c2.maxFontScaling) && C39174f.m124782b(this.radius, c17731c2.radius) && AbstractC22676k.m65745e(this.backgroundPaddingValues, c17731c2.backgroundPaddingValues);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getIconSize() {
        return this.iconSize;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIncludeBackground() {
        return this.includeBackground;
    }

    public int hashCode() {
        TextResource textResource = this.text;
        int iM8289b = AbstractC2875y.m8289b((this.trendTypeState.hashCode() + AbstractC2875y.m8289b((textResource == null ? 0 : textResource.hashCode()) * 31, 31, this.includeBackground)) * 31, 31, this.isPressed);
        EnumC16313m0 enumC16313m0 = this.icon;
        int iM30447a = AbstractC11266d.m30447a(this.iconSize, AbstractC11266d.m30448b(this.maxLines, AbstractC11266d.m30448b(this.overflow, AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.removeSideRadius.hashCode() + ((iM8289b + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31)) * 31, 31, this.withIcon), 31, this.showBorder), 31), 31), 31);
        C9598e c9598e = this.destination;
        int iHashCode = (iM30447a + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        Float f13 = this.maxFontScaling;
        return this.backgroundPaddingValues.hashCode() + AbstractC11266d.m30447a(this.radius, (iHashCode + (f13 != null ? f13.hashCode() : 0)) * 31, 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Float getMaxFontScaling() {
        return this.maxFontScaling;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getOverflow() {
        return this.overflow;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final float getRadius() {
        return this.radius;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final EnumC17786s0 getRemoveSideRadius() {
        return this.removeSideRadius;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getShowBorder() {
        return this.showBorder;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final EnumC17727b2 getTrendTypeState() {
        return this.trendTypeState;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getWithIcon() {
        return this.withIcon;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getIsPressed() {
        return this.isPressed;
    }

    public String toString() {
        TextResource textResource = this.text;
        boolean z4 = this.includeBackground;
        EnumC17727b2 enumC17727b2 = this.trendTypeState;
        boolean z13 = this.isPressed;
        EnumC16313m0 enumC16313m0 = this.icon;
        EnumC17786s0 enumC17786s0 = this.removeSideRadius;
        boolean z14 = this.withIcon;
        boolean z15 = this.showBorder;
        String strM113250m = AbstractC35745c.m113250m(this.overflow);
        int i13 = this.maxLines;
        String strM124783c = C39174f.m124783c(this.iconSize);
        C9598e c9598e = this.destination;
        Float f13 = this.maxFontScaling;
        String strM124783c2 = C39174f.m124783c(this.radius);
        InterfaceC22973k1 interfaceC22973k1 = this.backgroundPaddingValues;
        StringBuilder sbM91846p = AbstractC30007c.m91846p("TrendViewState(text=", textResource, ", includeBackground=", z4, ", trendTypeState=");
        sbM91846p.append(enumC17727b2);
        sbM91846p.append(", isPressed=");
        sbM91846p.append(z13);
        sbM91846p.append(", icon=");
        sbM91846p.append(enumC16313m0);
        sbM91846p.append(", removeSideRadius=");
        sbM91846p.append(enumC17786s0);
        sbM91846p.append(", withIcon=");
        AbstractC38963t7.m124392v(sbM91846p, z14, ", showBorder=", z15, ", overflow=");
        AbstractC11266d.m30470x(i13, strM113250m, ", maxLines=", ", iconSize=", sbM91846p);
        AbstractC30007c.m91827B(sbM91846p, strM124783c, ", destination=", c9598e, ", maxFontScaling=");
        sbM91846p.append(f13);
        sbM91846p.append(", radius=");
        sbM91846p.append(strM124783c2);
        sbM91846p.append(", backgroundPaddingValues=");
        sbM91846p.append(interfaceC22973k1);
        sbM91846p.append(")");
        return sbM91846p.toString();
    }

    private C17731c2(TextResource textResource, boolean z4, EnumC17727b2 trendTypeState, boolean z13, EnumC16313m0 enumC16313m0, EnumC17786s0 removeSideRadius, boolean z14, boolean z15, int i13, int i14, float f13, C9598e c9598e, Float f14, float f15, InterfaceC22973k1 backgroundPaddingValues) {
        AbstractC22676k.m65750j(trendTypeState, "trendTypeState");
        AbstractC22676k.m65750j(removeSideRadius, "removeSideRadius");
        AbstractC22676k.m65750j(backgroundPaddingValues, "backgroundPaddingValues");
        this.text = textResource;
        this.includeBackground = z4;
        this.trendTypeState = trendTypeState;
        this.isPressed = z13;
        this.icon = enumC16313m0;
        this.removeSideRadius = removeSideRadius;
        this.withIcon = z14;
        this.showBorder = z15;
        this.overflow = i13;
        this.maxLines = i14;
        this.iconSize = f13;
        this.destination = c9598e;
        this.maxFontScaling = f14;
        this.radius = f15;
        this.backgroundPaddingValues = backgroundPaddingValues;
    }

    public C17731c2(TextResource textResource, boolean z4, EnumC17727b2 enumC17727b2, boolean z13, EnumC16313m0 enumC16313m0, EnumC17786s0 enumC17786s0, boolean z14, boolean z15, int i13, int i14, float f13, C9598e c9598e, Float f14, float f15, InterfaceC22973k1 interfaceC22973k1, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        InterfaceC22973k1 c22976l1;
        boolean z16 = (i15 & 8) != 0 ? false : z13;
        EnumC16313m0 enumC16313m1 = (i15 & 16) != 0 ? null : enumC16313m0;
        EnumC17786s0 enumC17786s1 = (i15 & 32) != 0 ? EnumC17786s0.NONE : enumC17786s0;
        boolean z17 = (i15 & 64) != 0 ? true : z14;
        boolean z18 = (i15 & 128) != 0 ? false : z15;
        int i16 = (i15 & 256) != 0 ? 1 : i13;
        int i17 = (i15 & 512) != 0 ? Integer.MAX_VALUE : i14;
        float f16 = (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? 8 : f13;
        C9598e c9598e2 = (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : c9598e;
        Float f17 = (i15 & 4096) != 0 ? null : f14;
        float f18 = (i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? 1 * 4 : f15;
        if ((i15 & DfuBaseService.ERROR_CONNECTION_MASK) != 0) {
            float f19 = 8;
            float f24 = 0.5f * f19;
            float f25 = f19 * 0.25f;
            c22976l1 = new C22976l1(f24, f25, f24, f25);
        } else {
            c22976l1 = interfaceC22973k1;
        }
        this(textResource, z4, enumC17727b2, z16, enumC16313m1, enumC17786s1, z17, z18, i16, i17, f16, c9598e2, f17, f18, c22976l1, null);
    }
}
