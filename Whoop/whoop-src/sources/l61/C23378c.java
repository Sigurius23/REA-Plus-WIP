package l61;

import a71.C0520a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: l61.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0016\u0010!¨\u0006\""}, m65681d2 = {"Ll61/c;", "", "Lcom/whoop/design/util/TextResource;", "contentDescription", "", "xPercent", "yPercentTop", "yPercentBot", "La71/a;", "dataScrubberDetails", "<init>", "(Lcom/whoop/design/util/TextResource;FFFLa71/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "getContentDescription", "()Lcom/whoop/design/util/TextResource;", "b", "F", "()F", "c", "d", "e", "La71/a;", "()La71/a;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23378c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource contentDescription;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float xPercent;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float yPercentTop;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float yPercentBot;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C0520a dataScrubberDetails;

    public C23378c(TextResource contentDescription, float f13, float f14, float f15, C0520a dataScrubberDetails) {
        AbstractC22676k.m65750j(contentDescription, "contentDescription");
        AbstractC22676k.m65750j(dataScrubberDetails, "dataScrubberDetails");
        this.contentDescription = contentDescription;
        this.xPercent = f13;
        this.yPercentTop = f14;
        this.yPercentBot = f15;
        this.dataScrubberDetails = dataScrubberDetails;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C0520a getDataScrubberDetails() {
        return this.dataScrubberDetails;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getXPercent() {
        return this.xPercent;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getYPercentBot() {
        return this.yPercentBot;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getYPercentTop() {
        return this.yPercentTop;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23378c)) {
            return false;
        }
        C23378c c23378c = (C23378c) other;
        return AbstractC22676k.m65745e(this.contentDescription, c23378c.contentDescription) && Float.compare(this.xPercent, c23378c.xPercent) == 0 && Float.compare(this.yPercentTop, c23378c.yPercentTop) == 0 && Float.compare(this.yPercentBot, c23378c.yPercentBot) == 0 && AbstractC22676k.m65745e(this.dataScrubberDetails, c23378c.dataScrubberDetails);
    }

    public int hashCode() {
        return this.dataScrubberDetails.hashCode() + AbstractC11266d.m30447a(this.yPercentBot, AbstractC11266d.m30447a(this.yPercentTop, AbstractC11266d.m30447a(this.xPercent, this.contentDescription.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        TextResource textResource = this.contentDescription;
        float f13 = this.xPercent;
        float f14 = this.yPercentTop;
        float f15 = this.yPercentBot;
        C0520a c0520a = this.dataScrubberDetails;
        StringBuilder sb4 = new StringBuilder("BandPlotPointState(contentDescription=");
        sb4.append(textResource);
        sb4.append(", xPercent=");
        sb4.append(f13);
        sb4.append(", yPercentTop=");
        AbstractC30802r.m94772u(sb4, f14, ", yPercentBot=", f15, ", dataScrubberDetails=");
        sb4.append(c0520a);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C23378c(TextResource textResource, float f13, float f14, float f15, C0520a c0520a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? 0.0f : f13, (i13 & 4) != 0 ? 0.0f : f14, (i13 & 8) == 0 ? f15 : 0.0f, (i13 & 16) != 0 ? new C0520a(null, null, null, null, null, null, null, false, null, null, null, null, 4095, null) : c0520a);
    }
}
