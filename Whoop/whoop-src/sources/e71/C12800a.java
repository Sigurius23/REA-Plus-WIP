package e71;

import a71.C0520a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import m83.C25271y;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;
import u61.C34555d;

/* JADX INFO: renamed from: e71.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013Jv\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b \u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b)\u00100R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b1\u0010/\u001a\u0004\b1\u00100R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b.\u00104R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b*\u00105\u001a\u0004\b2\u00106¨\u00067"}, m65681d2 = {"Le71/a;", "", "Lcom/whoop/design/util/TextResource;", "contentDescription", "", "Le71/b;", "bars", "", "xPercent", "widthPercent", "widthPercentOverride", "Lu61/d;", "bottomText", "topText", "La71/a;", "dataScrubberDetails", "", "useSolidBackground", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;FFLjava/lang/Float;Lu61/d;Lu61/d;La71/a;Z)V", "a", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;FFLjava/lang/Float;Lu61/d;Lu61/d;La71/a;Z)Le71/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "F", "k", "()F", "d", "i", "Ljava/lang/Float;", "j", "()Ljava/lang/Float;", "f", "Lu61/d;", "()Lu61/d;", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "La71/a;", "()La71/a;", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12800a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource contentDescription;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C12801b> bars;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float xPercent;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float widthPercent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Float widthPercentOverride;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C34555d bottomText;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C34555d topText;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C0520a dataScrubberDetails;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean useSolidBackground;

    public C12800a(TextResource contentDescription, List<C12801b> bars, float f13, float f14, Float f15, C34555d c34555d, C34555d c34555d2, C0520a dataScrubberDetails, boolean z4) {
        AbstractC22676k.m65750j(contentDescription, "contentDescription");
        AbstractC22676k.m65750j(bars, "bars");
        AbstractC22676k.m65750j(dataScrubberDetails, "dataScrubberDetails");
        this.contentDescription = contentDescription;
        this.bars = bars;
        this.xPercent = f13;
        this.widthPercent = f14;
        this.widthPercentOverride = f15;
        this.bottomText = c34555d;
        this.topText = c34555d2;
        this.dataScrubberDetails = dataScrubberDetails;
        this.useSolidBackground = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C12800a m35840b(C12800a c12800a, TextResource textResource, List list, float f13, float f14, Float f15, C34555d c34555d, C34555d c34555d2, C0520a c0520a, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = c12800a.contentDescription;
        }
        if ((i13 & 2) != 0) {
            list = c12800a.bars;
        }
        if ((i13 & 4) != 0) {
            f13 = c12800a.xPercent;
        }
        if ((i13 & 8) != 0) {
            f14 = c12800a.widthPercent;
        }
        if ((i13 & 16) != 0) {
            f15 = c12800a.widthPercentOverride;
        }
        if ((i13 & 32) != 0) {
            c34555d = c12800a.bottomText;
        }
        if ((i13 & 64) != 0) {
            c34555d2 = c12800a.topText;
        }
        if ((i13 & 128) != 0) {
            c0520a = c12800a.dataScrubberDetails;
        }
        if ((i13 & 256) != 0) {
            z4 = c12800a.useSolidBackground;
        }
        C0520a c0520a2 = c0520a;
        boolean z13 = z4;
        C34555d c34555d3 = c34555d;
        C34555d c34555d4 = c34555d2;
        Float f16 = f15;
        float f17 = f13;
        return c12800a.m35841a(textResource, list, f17, f14, f16, c34555d3, c34555d4, c0520a2, z13);
    }

    /* JADX INFO: renamed from: a */
    public final C12800a m35841a(TextResource contentDescription, List<C12801b> bars, float xPercent, float widthPercent, Float widthPercentOverride, C34555d bottomText, C34555d topText, C0520a dataScrubberDetails, boolean useSolidBackground) {
        AbstractC22676k.m65750j(contentDescription, "contentDescription");
        AbstractC22676k.m65750j(bars, "bars");
        AbstractC22676k.m65750j(dataScrubberDetails, "dataScrubberDetails");
        return new C12800a(contentDescription, bars, xPercent, widthPercent, widthPercentOverride, bottomText, topText, dataScrubberDetails, useSolidBackground);
    }

    /* JADX INFO: renamed from: c */
    public final List<C12801b> m35842c() {
        return this.bars;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C34555d getBottomText() {
        return this.bottomText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getContentDescription() {
        return this.contentDescription;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12800a)) {
            return false;
        }
        C12800a c12800a = (C12800a) other;
        return AbstractC22676k.m65745e(this.contentDescription, c12800a.contentDescription) && AbstractC22676k.m65745e(this.bars, c12800a.bars) && Float.compare(this.xPercent, c12800a.xPercent) == 0 && Float.compare(this.widthPercent, c12800a.widthPercent) == 0 && AbstractC22676k.m65745e(this.widthPercentOverride, c12800a.widthPercentOverride) && AbstractC22676k.m65745e(this.bottomText, c12800a.bottomText) && AbstractC22676k.m65745e(this.topText, c12800a.topText) && AbstractC22676k.m65745e(this.dataScrubberDetails, c12800a.dataScrubberDetails) && this.useSolidBackground == c12800a.useSolidBackground;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C0520a getDataScrubberDetails() {
        return this.dataScrubberDetails;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C34555d getTopText() {
        return this.topText;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getUseSolidBackground() {
        return this.useSolidBackground;
    }

    public int hashCode() {
        int iM30447a = AbstractC11266d.m30447a(this.widthPercent, AbstractC11266d.m30447a(this.xPercent, AbstractC11895b.m31983b(this.contentDescription.hashCode() * 31, 31, this.bars), 31), 31);
        Float f13 = this.widthPercentOverride;
        int iHashCode = (iM30447a + (f13 == null ? 0 : f13.hashCode())) * 31;
        C34555d c34555d = this.bottomText;
        int iHashCode2 = (iHashCode + (c34555d == null ? 0 : c34555d.hashCode())) * 31;
        C34555d c34555d2 = this.topText;
        return Boolean.hashCode(this.useSolidBackground) + ((this.dataScrubberDetails.hashCode() + ((iHashCode2 + (c34555d2 != null ? c34555d2.hashCode() : 0)) * 31)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final float getWidthPercent() {
        return this.widthPercent;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Float getWidthPercentOverride() {
        return this.widthPercentOverride;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final float getXPercent() {
        return this.xPercent;
    }

    public String toString() {
        TextResource textResource = this.contentDescription;
        List<C12801b> list = this.bars;
        float f13 = this.xPercent;
        float f14 = this.widthPercent;
        Float f15 = this.widthPercentOverride;
        C34555d c34555d = this.bottomText;
        C34555d c34555d2 = this.topText;
        C0520a c0520a = this.dataScrubberDetails;
        boolean z4 = this.useSolidBackground;
        StringBuilder sbM106657p = AbstractC33745d.m106657p(textResource, "VerticalBarGroupState(contentDescription=", ", bars=", ", xPercent=", list);
        AbstractC30802r.m94772u(sbM106657p, f13, ", widthPercent=", f14, ", widthPercentOverride=");
        sbM106657p.append(f15);
        sbM106657p.append(", bottomText=");
        sbM106657p.append(c34555d);
        sbM106657p.append(", topText=");
        sbM106657p.append(c34555d2);
        sbM106657p.append(", dataScrubberDetails=");
        sbM106657p.append(c0520a);
        sbM106657p.append(", useSolidBackground=");
        return AbstractC18489d0.m53372m(sbM106657p, z4, ")");
    }

    public /* synthetic */ C12800a(TextResource textResource, List list, float f13, float f14, Float f15, C34555d c34555d, C34555d c34555d2, C0520a c0520a, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? 0.0f : f13, (i13 & 8) == 0 ? f14 : 0.0f, (i13 & 16) != 0 ? null : f15, (i13 & 32) != 0 ? null : c34555d, (i13 & 64) == 0 ? c34555d2 : null, (i13 & 128) != 0 ? new C0520a(null, null, null, null, null, null, null, false, null, null, null, null, 4095, null) : c0520a, (i13 & 256) != 0 ? false : z4);
    }
}
