package qy0;

import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p208i2.C17919x;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: qy0.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BÕ\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00102\b\u0010%\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u0010/R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b,\u00103R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b;\u00101\u001a\u0004\b<\u00103R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b2\u00101\u001a\u0004\b=\u00103R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b>\u00101\u001a\u0004\b>\u00103R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b<\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b=\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bC\u00101\u001a\u0004\b6\u00103R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b@\u00101\u001a\u0004\b7\u00103R\u0017\u0010\u0016\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b.\u0010?\u001a\u0004\bE\u0010AR\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\b;\u0010GR\u0017\u0010\u0019\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bH\u0010F\u001a\u0004\b0\u0010GR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b9\u0010I\u001a\u0004\b(\u0010JR\u0017\u0010\u001b\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bK\u0010?\u001a\u0004\bK\u0010AR\u0017\u0010\u001c\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bL\u0010?\u001a\u0004\bH\u0010A¨\u0006M"}, m65681d2 = {"Lqy0/h;", "Lm91/u;", "Lqy0/a;", "", NotificationCompat.CATEGORY_EVENT, "Lcom/whoop/design/util/TextResource;", "label", "Ly81/e;", "dateTextColor", "contentDescription", "backgroundColor", "Lqy0/g;", "viewCorners", "dotColor", "dotShadowColor", "dotBorderColor", "", "increaseDotOffset", "", "dotSizeMultiplier", "dateBackgroundColor", "dateBorderColor", "showDashedBorder", "Ly3/f;", "dateBorderWidth", "circleSize", "backgroundCircleSize", "isEnabled", "showSelectedDateCircle", "<init>", "(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Lqy0/g;Ly81/e;Ly81/e;Ly81/e;ZLjava/lang/Float;Ly81/e;Ly81/e;ZFFLy3/f;ZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getEvent", "()Ljava/lang/Object;", "b", "Lcom/whoop/design/util/TextResource;", "n", "()Lcom/whoop/design/util/TextResource;", "c", "Ly81/e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ly81/e;", "d", "getContentDescription", "e", "f", "Lqy0/g;", "q", "()Lqy0/g;", "g", "j", "k", "i", "Z", "m", "()Z", "Ljava/lang/Float;", "l", "()Ljava/lang/Float;", "o", "F", "()F", "p", "Ly3/f;", "()Ly3/f;", "r", "s", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30775h implements InterfaceC25312u, InterfaceC30768a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object event;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource label;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC39332e dateTextColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource contentDescription;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC39332e backgroundColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC30774g viewCorners;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC39332e dotColor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC39332e dotShadowColor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC39332e dotBorderColor;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean increaseDotOffset;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final Float dotSizeMultiplier;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final InterfaceC39332e dateBackgroundColor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final InterfaceC39332e dateBorderColor;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final boolean showDashedBorder;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final float dateBorderWidth;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final float circleSize;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final C39174f backgroundCircleSize;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final boolean isEnabled;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final boolean showSelectedDateCircle;

    /* JADX INFO: renamed from: qy0.h$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f126753w = new a();

        /* JADX INFO: renamed from: a */
        public final long m94573a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getTransparent();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m94573a((C39336i) obj));
        }
    }

    public /* synthetic */ C30775h(Object obj, TextResource textResource, InterfaceC39332e interfaceC39332e, TextResource textResource2, InterfaceC39332e interfaceC39332e2, EnumC30774g enumC30774g, InterfaceC39332e interfaceC39332e3, InterfaceC39332e interfaceC39332e4, InterfaceC39332e interfaceC39332e5, boolean z4, Float f13, InterfaceC39332e interfaceC39332e6, InterfaceC39332e interfaceC39332e7, boolean z13, float f14, float f15, C39174f c39174f, boolean z14, boolean z15, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, textResource, interfaceC39332e, textResource2, interfaceC39332e2, enumC30774g, interfaceC39332e3, interfaceC39332e4, interfaceC39332e5, z4, f13, interfaceC39332e6, interfaceC39332e7, z13, f14, f15, c39174f, z14, z15);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C39174f getBackgroundCircleSize() {
        return this.backgroundCircleSize;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC39332e getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getCircleSize() {
        return this.circleSize;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC39332e getDateBackgroundColor() {
        return this.dateBackgroundColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30775h)) {
            return false;
        }
        C30775h c30775h = (C30775h) other;
        return AbstractC22676k.m65745e(this.event, c30775h.event) && AbstractC22676k.m65745e(this.label, c30775h.label) && AbstractC22676k.m65745e(this.dateTextColor, c30775h.dateTextColor) && AbstractC22676k.m65745e(this.contentDescription, c30775h.contentDescription) && AbstractC22676k.m65745e(this.backgroundColor, c30775h.backgroundColor) && this.viewCorners == c30775h.viewCorners && AbstractC22676k.m65745e(this.dotColor, c30775h.dotColor) && AbstractC22676k.m65745e(this.dotShadowColor, c30775h.dotShadowColor) && AbstractC22676k.m65745e(this.dotBorderColor, c30775h.dotBorderColor) && this.increaseDotOffset == c30775h.increaseDotOffset && AbstractC22676k.m65745e(this.dotSizeMultiplier, c30775h.dotSizeMultiplier) && AbstractC22676k.m65745e(this.dateBackgroundColor, c30775h.dateBackgroundColor) && AbstractC22676k.m65745e(this.dateBorderColor, c30775h.dateBorderColor) && this.showDashedBorder == c30775h.showDashedBorder && C39174f.m124782b(this.dateBorderWidth, c30775h.dateBorderWidth) && C39174f.m124782b(this.circleSize, c30775h.circleSize) && AbstractC22676k.m65745e(this.backgroundCircleSize, c30775h.backgroundCircleSize) && this.isEnabled == c30775h.isEnabled && this.showSelectedDateCircle == c30775h.showSelectedDateCircle;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final InterfaceC39332e getDateBorderColor() {
        return this.dateBorderColor;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getDateBorderWidth() {
        return this.dateBorderWidth;
    }

    @Override // p720m91.InterfaceC25312u
    public Object getEvent() {
        return this.event;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final InterfaceC39332e getDateTextColor() {
        return this.dateTextColor;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC33745d.m106648g(this.dateTextColor, AbstractC31061c.m95625a(this.event.hashCode() * 31, this.label, 31), 31), this.contentDescription, 31);
        InterfaceC39332e interfaceC39332e = this.backgroundColor;
        int iHashCode = (this.viewCorners.hashCode() + ((iM95625a + (interfaceC39332e == null ? 0 : interfaceC39332e.hashCode())) * 31)) * 31;
        InterfaceC39332e interfaceC39332e2 = this.dotColor;
        int iHashCode2 = (iHashCode + (interfaceC39332e2 == null ? 0 : interfaceC39332e2.hashCode())) * 31;
        InterfaceC39332e interfaceC39332e3 = this.dotShadowColor;
        int iHashCode3 = (iHashCode2 + (interfaceC39332e3 == null ? 0 : interfaceC39332e3.hashCode())) * 31;
        InterfaceC39332e interfaceC39332e4 = this.dotBorderColor;
        int iM8289b = AbstractC2875y.m8289b((iHashCode3 + (interfaceC39332e4 == null ? 0 : interfaceC39332e4.hashCode())) * 31, 31, this.increaseDotOffset);
        Float f13 = this.dotSizeMultiplier;
        int iHashCode4 = (iM8289b + (f13 == null ? 0 : f13.hashCode())) * 31;
        InterfaceC39332e interfaceC39332e5 = this.dateBackgroundColor;
        int iHashCode5 = (iHashCode4 + (interfaceC39332e5 == null ? 0 : interfaceC39332e5.hashCode())) * 31;
        InterfaceC39332e interfaceC39332e6 = this.dateBorderColor;
        int iM30447a = AbstractC11266d.m30447a(this.circleSize, AbstractC11266d.m30447a(this.dateBorderWidth, AbstractC2875y.m8289b((iHashCode5 + (interfaceC39332e6 == null ? 0 : interfaceC39332e6.hashCode())) * 31, 31, this.showDashedBorder), 31), 31);
        C39174f c39174f = this.backgroundCircleSize;
        return Boolean.hashCode(this.showSelectedDateCircle) + AbstractC2875y.m8289b((iM30447a + (c39174f != null ? Float.hashCode(c39174f.f168413w) : 0)) * 31, 31, this.isEnabled);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final InterfaceC39332e getDotBorderColor() {
        return this.dotBorderColor;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final InterfaceC39332e getDotColor() {
        return this.dotColor;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final InterfaceC39332e getDotShadowColor() {
        return this.dotShadowColor;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Float getDotSizeMultiplier() {
        return this.dotSizeMultiplier;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIncreaseDotOffset() {
        return this.increaseDotOffset;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final TextResource getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getShowDashedBorder() {
        return this.showDashedBorder;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getShowSelectedDateCircle() {
        return this.showSelectedDateCircle;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final EnumC30774g getViewCorners() {
        return this.viewCorners;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        Object obj = this.event;
        TextResource textResource = this.label;
        InterfaceC39332e interfaceC39332e = this.dateTextColor;
        TextResource textResource2 = this.contentDescription;
        InterfaceC39332e interfaceC39332e2 = this.backgroundColor;
        EnumC30774g enumC30774g = this.viewCorners;
        InterfaceC39332e interfaceC39332e3 = this.dotColor;
        InterfaceC39332e interfaceC39332e4 = this.dotShadowColor;
        InterfaceC39332e interfaceC39332e5 = this.dotBorderColor;
        boolean z4 = this.increaseDotOffset;
        Float f13 = this.dotSizeMultiplier;
        InterfaceC39332e interfaceC39332e6 = this.dateBackgroundColor;
        InterfaceC39332e interfaceC39332e7 = this.dateBorderColor;
        boolean z13 = this.showDashedBorder;
        String strM124783c = C39174f.m124783c(this.dateBorderWidth);
        String strM124783c2 = C39174f.m124783c(this.circleSize);
        C39174f c39174f = this.backgroundCircleSize;
        boolean z14 = this.isEnabled;
        boolean z15 = this.showSelectedDateCircle;
        StringBuilder sb4 = new StringBuilder("HomeCalendarDateState(event=");
        sb4.append(obj);
        sb4.append(", label=");
        sb4.append(textResource);
        sb4.append(", dateTextColor=");
        AbstractC33745d.m106665x(sb4, interfaceC39332e, ", contentDescription=", textResource2, ", backgroundColor=");
        sb4.append(interfaceC39332e2);
        sb4.append(", viewCorners=");
        sb4.append(enumC30774g);
        sb4.append(", dotColor=");
        sb4.append(interfaceC39332e3);
        sb4.append(", dotShadowColor=");
        sb4.append(interfaceC39332e4);
        sb4.append(", dotBorderColor=");
        sb4.append(interfaceC39332e5);
        sb4.append(", increaseDotOffset=");
        sb4.append(z4);
        sb4.append(", dotSizeMultiplier=");
        sb4.append(f13);
        sb4.append(", dateBackgroundColor=");
        sb4.append(interfaceC39332e6);
        sb4.append(", dateBorderColor=");
        sb4.append(interfaceC39332e7);
        sb4.append(", showDashedBorder=");
        sb4.append(z13);
        sb4.append(", dateBorderWidth=");
        AbstractC11266d.m30444B(sb4, strM124783c, ", circleSize=", strM124783c2, ", backgroundCircleSize=");
        sb4.append(c39174f);
        sb4.append(", isEnabled=");
        sb4.append(z14);
        sb4.append(", showSelectedDateCircle=");
        return AbstractC18489d0.m53372m(sb4, z15, ")");
    }

    private C30775h(Object event, TextResource label, InterfaceC39332e dateTextColor, TextResource contentDescription, InterfaceC39332e interfaceC39332e, EnumC30774g viewCorners, InterfaceC39332e interfaceC39332e2, InterfaceC39332e interfaceC39332e3, InterfaceC39332e interfaceC39332e4, boolean z4, Float f13, InterfaceC39332e interfaceC39332e5, InterfaceC39332e interfaceC39332e6, boolean z13, float f14, float f15, C39174f c39174f, boolean z14, boolean z15) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(dateTextColor, "dateTextColor");
        AbstractC22676k.m65750j(contentDescription, "contentDescription");
        AbstractC22676k.m65750j(viewCorners, "viewCorners");
        this.event = event;
        this.label = label;
        this.dateTextColor = dateTextColor;
        this.contentDescription = contentDescription;
        this.backgroundColor = interfaceC39332e;
        this.viewCorners = viewCorners;
        this.dotColor = interfaceC39332e2;
        this.dotShadowColor = interfaceC39332e3;
        this.dotBorderColor = interfaceC39332e4;
        this.increaseDotOffset = z4;
        this.dotSizeMultiplier = f13;
        this.dateBackgroundColor = interfaceC39332e5;
        this.dateBorderColor = interfaceC39332e6;
        this.showDashedBorder = z13;
        this.dateBorderWidth = f14;
        this.circleSize = f15;
        this.backgroundCircleSize = c39174f;
        this.isEnabled = z14;
        this.showSelectedDateCircle = z15;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C30775h(Object obj, TextResource textResource, InterfaceC39332e interfaceC39332e, TextResource textResource2, InterfaceC39332e interfaceC39332e2, EnumC30774g enumC30774g, InterfaceC39332e interfaceC39332e3, InterfaceC39332e interfaceC39332e4, InterfaceC39332e interfaceC39332e5, boolean z4, Float f13, InterfaceC39332e interfaceC39332e6, InterfaceC39332e interfaceC39332e7, boolean z13, float f14, float f15, C39174f c39174f, boolean z14, boolean z15, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj2 = (i13 & 1) != 0 ? C23454a0.f92919a : obj;
        TextResource textResourceM21267a = (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource;
        InterfaceC39332e interfaceC39332eM125323a = (i13 & 4) != 0 ? p745y81.Function1.m125323a(a.f126753w) : interfaceC39332e;
        TextResource textResourceM21267a2 = (i13 & 8) != 0 ? AbstractC8693b.m21267a() : textResource2;
        InterfaceC39332e interfaceC39332e8 = (i13 & 16) != 0 ? null : interfaceC39332e2;
        EnumC30774g enumC30774g2 = (i13 & 32) != 0 ? EnumC30774g.NONE : enumC30774g;
        InterfaceC39332e interfaceC39332e9 = (i13 & 64) != 0 ? null : interfaceC39332e3;
        InterfaceC39332e interfaceC39332e10 = (i13 & 128) != 0 ? null : interfaceC39332e4;
        InterfaceC39332e interfaceC39332e11 = (i13 & 256) != 0 ? null : interfaceC39332e5;
        boolean z16 = (i13 & 512) != 0 ? false : z4;
        Float f16 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : f13;
        InterfaceC39332e interfaceC39332e12 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : interfaceC39332e6;
        InterfaceC39332e interfaceC39332e13 = (i13 & 4096) != 0 ? null : interfaceC39332e7;
        boolean z17 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? false : z13;
        this(obj2, textResourceM21267a, interfaceC39332eM125323a, textResourceM21267a2, interfaceC39332e8, enumC30774g2, interfaceC39332e9, interfaceC39332e10, interfaceC39332e11, z16, f16, interfaceC39332e12, interfaceC39332e13, z17, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? (float) 1.5d : f14, (i13 & 32768) != 0 ? 8 * 4 : f15, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? null : c39174f, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? true : z14, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? false : z15, null);
    }
}
