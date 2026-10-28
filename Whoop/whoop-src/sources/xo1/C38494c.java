package xo1;

import androidx.core.app.NotificationCompat;
import co1.C4859a;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.InterfaceC39332e;
import qy0.EnumC30774g;
import qy0.InterfaceC30768a;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: xo1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BË\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00112\b\u0010%\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b,\u0010/R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b6\u00103R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b2\u00101\u001a\u0004\b0\u00103R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b.\u00101\u001a\u0004\b5\u00103R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b6\u0010;\u001a\u0004\b7\u0010<R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b9\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b>\u0010=\u001a\u0004\b@\u0010?R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b@\u00101\u001a\u0004\bA\u00103R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bB\u00101\u001a\u0004\bC\u00103R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bA\u00101\u001a\u0004\bB\u00103R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u0019\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bE\u0010;\u001a\u0004\b(\u0010<R\u0017\u0010\u001a\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bG\u0010=\u001a\u0004\bG\u0010?R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K¨\u0006L"}, m65681d2 = {"Lxo1/c;", "Lm91/u;", "Lqy0/a;", "", NotificationCompat.CATEGORY_EVENT, "Lcom/whoop/design/util/TextResource;", "label", "Ly81/e;", "dateTextColor", "contentDescription", "phaseBackgroundColor", "Lqy0/g;", "phaseBackgroundCorners", "dateCircleBackgroundColor", "dateCircleBorderColor", "Ly3/f;", "dateCircleBorderWidth", "", "showDashedBorder", "showSelectedDateCircle", "symptomDotColor", "symptomDotShadowColor", "symptomDotBorderColor", "", "symptomDotSizeMultiplier", "circleSize", "isEnabled", "Lco1/a;", "fertilityCalendarDateState", "<init>", "(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Lqy0/g;Ly81/e;Ly81/e;FZZLy81/e;Ly81/e;Ly81/e;Ljava/lang/Float;FZLco1/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getEvent", "()Ljava/lang/Object;", "b", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/util/TextResource;", "c", "Ly81/e;", "g", "()Ly81/e;", "d", "e", "i", "f", "Lqy0/g;", "j", "()Lqy0/g;", "F", "()F", "Z", "k", "()Z", "l", "n", "m", "o", "Ljava/lang/Float;", "p", "()Ljava/lang/Float;", "q", "r", "Lco1/a;", "getFertilityCalendarDateState", "()Lco1/a;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38494c implements InterfaceC25312u, InterfaceC30768a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object event;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource label;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC39332e dateTextColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource contentDescription;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC39332e phaseBackgroundColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC30774g phaseBackgroundCorners;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC39332e dateCircleBackgroundColor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC39332e dateCircleBorderColor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final float dateCircleBorderWidth;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean showDashedBorder;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean showSelectedDateCircle;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final InterfaceC39332e symptomDotColor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final InterfaceC39332e symptomDotShadowColor;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final InterfaceC39332e symptomDotBorderColor;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final Float symptomDotSizeMultiplier;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final float circleSize;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final boolean isEnabled;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final C4859a fertilityCalendarDateState;

    public /* synthetic */ C38494c(Object obj, TextResource textResource, InterfaceC39332e interfaceC39332e, TextResource textResource2, InterfaceC39332e interfaceC39332e2, EnumC30774g enumC30774g, InterfaceC39332e interfaceC39332e3, InterfaceC39332e interfaceC39332e4, float f13, boolean z4, boolean z13, InterfaceC39332e interfaceC39332e5, InterfaceC39332e interfaceC39332e6, InterfaceC39332e interfaceC39332e7, Float f14, float f15, boolean z14, C4859a c4859a, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, textResource, interfaceC39332e, textResource2, interfaceC39332e2, enumC30774g, interfaceC39332e3, interfaceC39332e4, f13, z4, z13, interfaceC39332e5, interfaceC39332e6, interfaceC39332e7, f14, f15, z14, c4859a);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getCircleSize() {
        return this.circleSize;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getContentDescription() {
        return this.contentDescription;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC39332e getDateCircleBackgroundColor() {
        return this.dateCircleBackgroundColor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC39332e getDateCircleBorderColor() {
        return this.dateCircleBorderColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38494c)) {
            return false;
        }
        C38494c c38494c = (C38494c) other;
        return AbstractC22676k.m65745e(this.event, c38494c.event) && AbstractC22676k.m65745e(this.label, c38494c.label) && AbstractC22676k.m65745e(this.dateTextColor, c38494c.dateTextColor) && AbstractC22676k.m65745e(this.contentDescription, c38494c.contentDescription) && AbstractC22676k.m65745e(this.phaseBackgroundColor, c38494c.phaseBackgroundColor) && this.phaseBackgroundCorners == c38494c.phaseBackgroundCorners && AbstractC22676k.m65745e(this.dateCircleBackgroundColor, c38494c.dateCircleBackgroundColor) && AbstractC22676k.m65745e(this.dateCircleBorderColor, c38494c.dateCircleBorderColor) && C39174f.m124782b(this.dateCircleBorderWidth, c38494c.dateCircleBorderWidth) && this.showDashedBorder == c38494c.showDashedBorder && this.showSelectedDateCircle == c38494c.showSelectedDateCircle && AbstractC22676k.m65745e(this.symptomDotColor, c38494c.symptomDotColor) && AbstractC22676k.m65745e(this.symptomDotShadowColor, c38494c.symptomDotShadowColor) && AbstractC22676k.m65745e(this.symptomDotBorderColor, c38494c.symptomDotBorderColor) && AbstractC22676k.m65745e(this.symptomDotSizeMultiplier, c38494c.symptomDotSizeMultiplier) && C39174f.m124782b(this.circleSize, c38494c.circleSize) && this.isEnabled == c38494c.isEnabled && AbstractC22676k.m65745e(this.fertilityCalendarDateState, c38494c.fertilityCalendarDateState);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getDateCircleBorderWidth() {
        return this.dateCircleBorderWidth;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final InterfaceC39332e getDateTextColor() {
        return this.dateTextColor;
    }

    @Override // p720m91.InterfaceC25312u
    public Object getEvent() {
        return this.event;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getLabel() {
        return this.label;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC33745d.m106648g(this.dateTextColor, AbstractC31061c.m95625a(this.event.hashCode() * 31, this.label, 31), 31), this.contentDescription, 31);
        InterfaceC39332e interfaceC39332e = this.phaseBackgroundColor;
        int iHashCode = (this.phaseBackgroundCorners.hashCode() + ((iM95625a + (interfaceC39332e == null ? 0 : interfaceC39332e.hashCode())) * 31)) * 31;
        InterfaceC39332e interfaceC39332e2 = this.dateCircleBackgroundColor;
        int iHashCode2 = (iHashCode + (interfaceC39332e2 == null ? 0 : interfaceC39332e2.hashCode())) * 31;
        InterfaceC39332e interfaceC39332e3 = this.dateCircleBorderColor;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30447a(this.dateCircleBorderWidth, (iHashCode2 + (interfaceC39332e3 == null ? 0 : interfaceC39332e3.hashCode())) * 31, 31), 31, this.showDashedBorder), 31, this.showSelectedDateCircle);
        InterfaceC39332e interfaceC39332e4 = this.symptomDotColor;
        int iHashCode3 = (iM8289b + (interfaceC39332e4 == null ? 0 : interfaceC39332e4.hashCode())) * 31;
        InterfaceC39332e interfaceC39332e5 = this.symptomDotShadowColor;
        int iHashCode4 = (iHashCode3 + (interfaceC39332e5 == null ? 0 : interfaceC39332e5.hashCode())) * 31;
        InterfaceC39332e interfaceC39332e6 = this.symptomDotBorderColor;
        int iHashCode5 = (iHashCode4 + (interfaceC39332e6 == null ? 0 : interfaceC39332e6.hashCode())) * 31;
        Float f13 = this.symptomDotSizeMultiplier;
        int iM8289b2 = AbstractC2875y.m8289b(AbstractC11266d.m30447a(this.circleSize, (iHashCode5 + (f13 == null ? 0 : f13.hashCode())) * 31, 31), 31, this.isEnabled);
        C4859a c4859a = this.fertilityCalendarDateState;
        return iM8289b2 + (c4859a != null ? c4859a.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final InterfaceC39332e getPhaseBackgroundColor() {
        return this.phaseBackgroundColor;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final EnumC30774g getPhaseBackgroundCorners() {
        return this.phaseBackgroundCorners;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getShowDashedBorder() {
        return this.showDashedBorder;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getShowSelectedDateCircle() {
        return this.showSelectedDateCircle;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final InterfaceC39332e getSymptomDotBorderColor() {
        return this.symptomDotBorderColor;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final InterfaceC39332e getSymptomDotColor() {
        return this.symptomDotColor;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final InterfaceC39332e getSymptomDotShadowColor() {
        return this.symptomDotShadowColor;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final Float getSymptomDotSizeMultiplier() {
        return this.symptomDotSizeMultiplier;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        Object obj = this.event;
        TextResource textResource = this.label;
        InterfaceC39332e interfaceC39332e = this.dateTextColor;
        TextResource textResource2 = this.contentDescription;
        InterfaceC39332e interfaceC39332e2 = this.phaseBackgroundColor;
        EnumC30774g enumC30774g = this.phaseBackgroundCorners;
        InterfaceC39332e interfaceC39332e3 = this.dateCircleBackgroundColor;
        InterfaceC39332e interfaceC39332e4 = this.dateCircleBorderColor;
        String strM124783c = C39174f.m124783c(this.dateCircleBorderWidth);
        boolean z4 = this.showDashedBorder;
        boolean z13 = this.showSelectedDateCircle;
        InterfaceC39332e interfaceC39332e5 = this.symptomDotColor;
        InterfaceC39332e interfaceC39332e6 = this.symptomDotShadowColor;
        InterfaceC39332e interfaceC39332e7 = this.symptomDotBorderColor;
        Float f13 = this.symptomDotSizeMultiplier;
        String strM124783c2 = C39174f.m124783c(this.circleSize);
        boolean z14 = this.isEnabled;
        C4859a c4859a = this.fertilityCalendarDateState;
        StringBuilder sb4 = new StringBuilder("MciCalendarDateState(event=");
        sb4.append(obj);
        sb4.append(", label=");
        sb4.append(textResource);
        sb4.append(", dateTextColor=");
        AbstractC33745d.m106665x(sb4, interfaceC39332e, ", contentDescription=", textResource2, ", phaseBackgroundColor=");
        sb4.append(interfaceC39332e2);
        sb4.append(", phaseBackgroundCorners=");
        sb4.append(enumC30774g);
        sb4.append(", dateCircleBackgroundColor=");
        sb4.append(interfaceC39332e3);
        sb4.append(", dateCircleBorderColor=");
        sb4.append(interfaceC39332e4);
        sb4.append(", dateCircleBorderWidth=");
        AbstractC38963t7.m124390t(sb4, strM124783c, ", showDashedBorder=", z4, ", showSelectedDateCircle=");
        sb4.append(z13);
        sb4.append(", symptomDotColor=");
        sb4.append(interfaceC39332e5);
        sb4.append(", symptomDotShadowColor=");
        sb4.append(interfaceC39332e6);
        sb4.append(", symptomDotBorderColor=");
        sb4.append(interfaceC39332e7);
        sb4.append(", symptomDotSizeMultiplier=");
        sb4.append(f13);
        sb4.append(", circleSize=");
        sb4.append(strM124783c2);
        sb4.append(", isEnabled=");
        sb4.append(z14);
        sb4.append(", fertilityCalendarDateState=");
        sb4.append(c4859a);
        sb4.append(")");
        return sb4.toString();
    }

    private C38494c(Object event, TextResource label, InterfaceC39332e dateTextColor, TextResource contentDescription, InterfaceC39332e interfaceC39332e, EnumC30774g phaseBackgroundCorners, InterfaceC39332e interfaceC39332e2, InterfaceC39332e interfaceC39332e3, float f13, boolean z4, boolean z13, InterfaceC39332e interfaceC39332e4, InterfaceC39332e interfaceC39332e5, InterfaceC39332e interfaceC39332e6, Float f14, float f15, boolean z14, C4859a c4859a) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(dateTextColor, "dateTextColor");
        AbstractC22676k.m65750j(contentDescription, "contentDescription");
        AbstractC22676k.m65750j(phaseBackgroundCorners, "phaseBackgroundCorners");
        this.event = event;
        this.label = label;
        this.dateTextColor = dateTextColor;
        this.contentDescription = contentDescription;
        this.phaseBackgroundColor = interfaceC39332e;
        this.phaseBackgroundCorners = phaseBackgroundCorners;
        this.dateCircleBackgroundColor = interfaceC39332e2;
        this.dateCircleBorderColor = interfaceC39332e3;
        this.dateCircleBorderWidth = f13;
        this.showDashedBorder = z4;
        this.showSelectedDateCircle = z13;
        this.symptomDotColor = interfaceC39332e4;
        this.symptomDotShadowColor = interfaceC39332e5;
        this.symptomDotBorderColor = interfaceC39332e6;
        this.symptomDotSizeMultiplier = f14;
        this.circleSize = f15;
        this.isEnabled = z14;
        this.fertilityCalendarDateState = c4859a;
    }
}
