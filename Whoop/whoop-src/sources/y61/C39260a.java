package y61;

import a71.C0520a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import kd1.AbstractC22403o;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import te0.AbstractC33745d;
import u61.C34555d;

/* JADX INFO: renamed from: y61.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0096\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b*\u00100\u001a\u0004\b1\u00102R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b&\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b6\u0010\u001dR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b4\u0010?\u001a\u0004\b,\u0010\u001dR\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b8\u0010)\u001a\u0004\b:\u0010+R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b1\u0010@\u001a\u0004\b>\u0010A¨\u0006B"}, m65681d2 = {"Ly61/a;", "", "Lcom/whoop/design/util/TextResource;", "contentDescription", "", "Ly61/b;", "bars", "", "topXPercent", "Lu61/d;", "topText", "Lkd1/o;", "topIcon", "Ly81/f;", "topIconColor", "La71/a;", "dataScrubberDetails", "", "cta", "activityId", "Lm91/u;", "overlayLabelMap", "Lgz0/m0;", "secondaryIcon", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;FLu61/d;Lkd1/o;Ly81/f;La71/a;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lgz0/m0;)V", "a", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;FLu61/d;Lkd1/o;Ly81/f;La71/a;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lgz0/m0;)Ly61/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "F", "l", "()F", "Lu61/d;", "k", "()Lu61/d;", "Lkd1/o;", "i", "()Lkd1/o;", "f", "Ly81/f;", "j", "()Ly81/f;", "g", "La71/a;", "getDataScrubberDetails", "()La71/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/lang/String;", "Lgz0/m0;", "()Lgz0/m0;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39260a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource contentDescription;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C39261b> bars;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float topXPercent;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C34555d topText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC22403o topIcon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC39333f topIconColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C0520a dataScrubberDetails;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String cta;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String activityId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final List<InterfaceC25312u> overlayLabelMap;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final EnumC16313m0 secondaryIcon;

    /* JADX WARN: Multi-variable type inference failed */
    public C39260a(TextResource contentDescription, List<C39261b> bars, float f13, C34555d c34555d, AbstractC22403o abstractC22403o, EnumC39333f topIconColor, C0520a dataScrubberDetails, String str, String str2, List<? extends InterfaceC25312u> list, EnumC16313m0 enumC16313m0) {
        AbstractC22676k.m65750j(contentDescription, "contentDescription");
        AbstractC22676k.m65750j(bars, "bars");
        AbstractC22676k.m65750j(topIconColor, "topIconColor");
        AbstractC22676k.m65750j(dataScrubberDetails, "dataScrubberDetails");
        this.contentDescription = contentDescription;
        this.bars = bars;
        this.topXPercent = f13;
        this.topText = c34555d;
        this.topIcon = abstractC22403o;
        this.topIconColor = topIconColor;
        this.dataScrubberDetails = dataScrubberDetails;
        this.cta = str;
        this.activityId = str2;
        this.overlayLabelMap = list;
        this.secondaryIcon = enumC16313m0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C39260a m125036b(C39260a c39260a, TextResource textResource, List list, float f13, C34555d c34555d, AbstractC22403o abstractC22403o, EnumC39333f enumC39333f, C0520a c0520a, String str, String str2, List list2, EnumC16313m0 enumC16313m0, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = c39260a.contentDescription;
        }
        if ((i13 & 2) != 0) {
            list = c39260a.bars;
        }
        if ((i13 & 4) != 0) {
            f13 = c39260a.topXPercent;
        }
        if ((i13 & 8) != 0) {
            c34555d = c39260a.topText;
        }
        if ((i13 & 16) != 0) {
            abstractC22403o = c39260a.topIcon;
        }
        if ((i13 & 32) != 0) {
            enumC39333f = c39260a.topIconColor;
        }
        if ((i13 & 64) != 0) {
            c0520a = c39260a.dataScrubberDetails;
        }
        if ((i13 & 128) != 0) {
            str = c39260a.cta;
        }
        if ((i13 & 256) != 0) {
            str2 = c39260a.activityId;
        }
        if ((i13 & 512) != 0) {
            list2 = c39260a.overlayLabelMap;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            enumC16313m0 = c39260a.secondaryIcon;
        }
        List list3 = list2;
        EnumC16313m0 enumC16313m1 = enumC16313m0;
        String str3 = str;
        String str4 = str2;
        EnumC39333f enumC39333f2 = enumC39333f;
        C0520a c0520a2 = c0520a;
        AbstractC22403o abstractC22403o2 = abstractC22403o;
        float f14 = f13;
        return c39260a.m125037a(textResource, list, f14, c34555d, abstractC22403o2, enumC39333f2, c0520a2, str3, str4, list3, enumC16313m1);
    }

    /* JADX INFO: renamed from: a */
    public final C39260a m125037a(TextResource contentDescription, List<C39261b> bars, float topXPercent, C34555d topText, AbstractC22403o topIcon, EnumC39333f topIconColor, C0520a dataScrubberDetails, String cta, String activityId, List<? extends InterfaceC25312u> overlayLabelMap, EnumC16313m0 secondaryIcon) {
        AbstractC22676k.m65750j(contentDescription, "contentDescription");
        AbstractC22676k.m65750j(bars, "bars");
        AbstractC22676k.m65750j(topIconColor, "topIconColor");
        AbstractC22676k.m65750j(dataScrubberDetails, "dataScrubberDetails");
        return new C39260a(contentDescription, bars, topXPercent, topText, topIcon, topIconColor, dataScrubberDetails, cta, activityId, overlayLabelMap, secondaryIcon);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getActivityId() {
        return this.activityId;
    }

    /* JADX INFO: renamed from: d */
    public final List<C39261b> m125039d() {
        return this.bars;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getContentDescription() {
        return this.contentDescription;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39260a)) {
            return false;
        }
        C39260a c39260a = (C39260a) other;
        return AbstractC22676k.m65745e(this.contentDescription, c39260a.contentDescription) && AbstractC22676k.m65745e(this.bars, c39260a.bars) && Float.compare(this.topXPercent, c39260a.topXPercent) == 0 && AbstractC22676k.m65745e(this.topText, c39260a.topText) && AbstractC22676k.m65745e(this.topIcon, c39260a.topIcon) && this.topIconColor == c39260a.topIconColor && AbstractC22676k.m65745e(this.dataScrubberDetails, c39260a.dataScrubberDetails) && AbstractC22676k.m65745e(this.cta, c39260a.cta) && AbstractC22676k.m65745e(this.activityId, c39260a.activityId) && AbstractC22676k.m65745e(this.overlayLabelMap, c39260a.overlayLabelMap) && this.secondaryIcon == c39260a.secondaryIcon;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: g */
    public final List<InterfaceC25312u> m125042g() {
        return this.overlayLabelMap;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC16313m0 getSecondaryIcon() {
        return this.secondaryIcon;
    }

    public int hashCode() {
        int iM30447a = AbstractC11266d.m30447a(this.topXPercent, AbstractC11895b.m31983b(this.contentDescription.hashCode() * 31, 31, this.bars), 31);
        C34555d c34555d = this.topText;
        int iHashCode = (iM30447a + (c34555d == null ? 0 : c34555d.hashCode())) * 31;
        AbstractC22403o abstractC22403o = this.topIcon;
        int iHashCode2 = (this.dataScrubberDetails.hashCode() + AbstractC21702c.m61132c(this.topIconColor, (iHashCode + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31, 31)) * 31;
        String str = this.cta;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.activityId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<InterfaceC25312u> list = this.overlayLabelMap;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.secondaryIcon;
        return iHashCode5 + (enumC16313m0 != null ? enumC16313m0.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final AbstractC22403o getTopIcon() {
        return this.topIcon;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final EnumC39333f getTopIconColor() {
        return this.topIconColor;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final C34555d getTopText() {
        return this.topText;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final float getTopXPercent() {
        return this.topXPercent;
    }

    public String toString() {
        TextResource textResource = this.contentDescription;
        List<C39261b> list = this.bars;
        float f13 = this.topXPercent;
        C34555d c34555d = this.topText;
        AbstractC22403o abstractC22403o = this.topIcon;
        EnumC39333f enumC39333f = this.topIconColor;
        C0520a c0520a = this.dataScrubberDetails;
        String str = this.cta;
        String str2 = this.activityId;
        List<InterfaceC25312u> list2 = this.overlayLabelMap;
        EnumC16313m0 enumC16313m0 = this.secondaryIcon;
        StringBuilder sbM106657p = AbstractC33745d.m106657p(textResource, "OverlayBarGroupState(contentDescription=", ", bars=", ", topXPercent=", list);
        sbM106657p.append(f13);
        sbM106657p.append(", topText=");
        sbM106657p.append(c34555d);
        sbM106657p.append(", topIcon=");
        sbM106657p.append(abstractC22403o);
        sbM106657p.append(", topIconColor=");
        sbM106657p.append(enumC39333f);
        sbM106657p.append(", dataScrubberDetails=");
        sbM106657p.append(c0520a);
        sbM106657p.append(", cta=");
        sbM106657p.append(str);
        sbM106657p.append(", activityId=");
        AbstractC36095b.m114694v(str2, ", overlayLabelMap=", ", secondaryIcon=", sbM106657p, list2);
        sbM106657p.append(enumC16313m0);
        sbM106657p.append(")");
        return sbM106657p.toString();
    }

    public /* synthetic */ C39260a(TextResource textResource, List list, float f13, C34555d c34555d, AbstractC22403o abstractC22403o, EnumC39333f enumC39333f, C0520a c0520a, String str, String str2, List list2, EnumC16313m0 enumC16313m0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? 0.0f : f13, (i13 & 8) != 0 ? null : c34555d, (i13 & 16) != 0 ? null : abstractC22403o, (i13 & 32) != 0 ? EnumC39333f.BRAND_WHITE : enumC39333f, (i13 & 64) != 0 ? new C0520a(null, null, null, null, null, null, null, false, null, null, null, null, 4095, null) : c0520a, (i13 & 128) != 0 ? null : str, (i13 & 256) != 0 ? null : str2, (i13 & 512) != 0 ? null : list2, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : enumC16313m0);
    }
}
