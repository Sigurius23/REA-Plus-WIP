package u61;

import a71.C0520a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import k61.InterfaceC22229b;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: u61.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJP\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\"\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,¨\u0006-"}, m65681d2 = {"Lu61/e;", "Lk61/b;", "", "xPercent", "yPercent", "Lcom/whoop/design/util/TextResource;", "contentDescription", "Lu61/c;", "circle", "Lu61/d;", "label", "La71/a;", "dataScrubberDetails", "<init>", "(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;)V", "b", "(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;)Lu61/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "d", "Lu61/c;", "()Lu61/c;", "Lu61/d;", "g", "()Lu61/d;", "f", "La71/a;", "()La71/a;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34556e implements InterfaceC22229b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float xPercent;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float yPercent;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource contentDescription;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C34554c circle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C34555d label;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C0520a dataScrubberDetails;

    public C34556e(float f13, float f14, TextResource contentDescription, C34554c c34554c, C34555d c34555d, C0520a dataScrubberDetails) {
        AbstractC22676k.m65750j(contentDescription, "contentDescription");
        AbstractC22676k.m65750j(dataScrubberDetails, "dataScrubberDetails");
        this.xPercent = f13;
        this.yPercent = f14;
        this.contentDescription = contentDescription;
        this.circle = c34554c;
        this.label = c34555d;
        this.dataScrubberDetails = dataScrubberDetails;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C34556e m109246c(C34556e c34556e, float f13, float f14, TextResource textResource, C34554c c34554c, C34555d c34555d, C0520a c0520a, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = c34556e.xPercent;
        }
        if ((i13 & 2) != 0) {
            f14 = c34556e.yPercent;
        }
        if ((i13 & 4) != 0) {
            textResource = c34556e.contentDescription;
        }
        if ((i13 & 8) != 0) {
            c34554c = c34556e.circle;
        }
        if ((i13 & 16) != 0) {
            c34555d = c34556e.label;
        }
        if ((i13 & 32) != 0) {
            c0520a = c34556e.dataScrubberDetails;
        }
        C34555d c34555d2 = c34555d;
        C0520a c0520a2 = c0520a;
        return c34556e.m109247b(f13, f14, textResource, c34554c, c34555d2, c0520a2);
    }

    @Override // k61.InterfaceC22229b
    /* JADX INFO: renamed from: a, reason: from getter */
    public float getXPercent() {
        return this.xPercent;
    }

    /* JADX INFO: renamed from: b */
    public final C34556e m109247b(float xPercent, float yPercent, TextResource contentDescription, C34554c circle, C34555d label, C0520a dataScrubberDetails) {
        AbstractC22676k.m65750j(contentDescription, "contentDescription");
        AbstractC22676k.m65750j(dataScrubberDetails, "dataScrubberDetails");
        return new C34556e(xPercent, yPercent, contentDescription, circle, label, dataScrubberDetails);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C34554c getCircle() {
        return this.circle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getContentDescription() {
        return this.contentDescription;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34556e)) {
            return false;
        }
        C34556e c34556e = (C34556e) other;
        return Float.compare(this.xPercent, c34556e.xPercent) == 0 && Float.compare(this.yPercent, c34556e.yPercent) == 0 && AbstractC22676k.m65745e(this.contentDescription, c34556e.contentDescription) && AbstractC22676k.m65745e(this.circle, c34556e.circle) && AbstractC22676k.m65745e(this.label, c34556e.label) && AbstractC22676k.m65745e(this.dataScrubberDetails, c34556e.dataScrubberDetails);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C0520a getDataScrubberDetails() {
        return this.dataScrubberDetails;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C34555d getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public float getYPercent() {
        return this.yPercent;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC11266d.m30447a(this.yPercent, Float.hashCode(this.xPercent) * 31, 31), this.contentDescription, 31);
        C34554c c34554c = this.circle;
        int iHashCode = (iM95625a + (c34554c == null ? 0 : c34554c.hashCode())) * 31;
        C34555d c34555d = this.label;
        return this.dataScrubberDetails.hashCode() + ((iHashCode + (c34555d != null ? c34555d.hashCode() : 0)) * 31);
    }

    public String toString() {
        float f13 = this.xPercent;
        float f14 = this.yPercent;
        TextResource textResource = this.contentDescription;
        C34554c c34554c = this.circle;
        C34555d c34555d = this.label;
        C0520a c0520a = this.dataScrubberDetails;
        StringBuilder sbM8307t = AbstractC2875y.m8307t("PointState(xPercent=", f13, ", yPercent=", f14, ", contentDescription=");
        sbM8307t.append(textResource);
        sbM8307t.append(", circle=");
        sbM8307t.append(c34554c);
        sbM8307t.append(", label=");
        sbM8307t.append(c34555d);
        sbM8307t.append(", dataScrubberDetails=");
        sbM8307t.append(c0520a);
        sbM8307t.append(")");
        return sbM8307t.toString();
    }

    public /* synthetic */ C34556e(float f13, float f14, TextResource textResource, C34554c c34554c, C34555d c34555d, C0520a c0520a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0.0f : f13, (i13 & 2) == 0 ? f14 : 0.0f, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 8) != 0 ? null : c34554c, (i13 & 16) == 0 ? c34555d : null, (i13 & 32) != 0 ? new C0520a(null, null, null, null, null, null, null, false, null, null, null, null, 4095, null) : c0520a);
    }
}
