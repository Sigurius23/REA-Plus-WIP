package c41;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: c41.i3 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJj\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b(\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b)\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b+\u0010-\u001a\u0004\b$\u0010.¨\u0006/"}, m65681d2 = {"Lc41/i3;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "Lgz0/m0;", "endIcon", "metricTitle", "metricSubTitle", "metricMagnitude", "metricIcon", "Lc41/w3;", "metricStatus", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lc41/w3;Lcom/whoop/navigation/e;)V", "a", "(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lc41/w3;Lcom/whoop/navigation/e;)Lc41/i3;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "k", "()Lcom/whoop/design/util/TextResource;", "b", "Lgz0/m0;", "e", "()Lgz0/m0;", "c", "j", "d", "i", "g", "f", "Lc41/w3;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lc41/w3;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4044i3 implements InterfaceC25312u {

    /* JADX INFO: renamed from: i */
    public static final int f16407i = C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16313m0 endIcon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource metricTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource metricSubTitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource metricMagnitude;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC16313m0 metricIcon;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final EnumC4142w3 metricStatus;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C9598e destination;

    public C4044i3(TextResource title, EnumC16313m0 enumC16313m0, TextResource metricTitle, TextResource textResource, TextResource textResource2, EnumC16313m0 enumC16313m1, EnumC4142w3 metricStatus, C9598e c9598e) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(metricTitle, "metricTitle");
        AbstractC22676k.m65750j(metricStatus, "metricStatus");
        this.title = title;
        this.endIcon = enumC16313m0;
        this.metricTitle = metricTitle;
        this.metricSubTitle = textResource;
        this.metricMagnitude = textResource2;
        this.metricIcon = enumC16313m1;
        this.metricStatus = metricStatus;
        this.destination = c9598e;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C4044i3 m12333b(C4044i3 c4044i3, TextResource textResource, EnumC16313m0 enumC16313m0, TextResource textResource2, TextResource textResource3, TextResource textResource4, EnumC16313m0 enumC16313m1, EnumC4142w3 enumC4142w3, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = c4044i3.title;
        }
        if ((i13 & 2) != 0) {
            enumC16313m0 = c4044i3.endIcon;
        }
        if ((i13 & 4) != 0) {
            textResource2 = c4044i3.metricTitle;
        }
        if ((i13 & 8) != 0) {
            textResource3 = c4044i3.metricSubTitle;
        }
        if ((i13 & 16) != 0) {
            textResource4 = c4044i3.metricMagnitude;
        }
        if ((i13 & 32) != 0) {
            enumC16313m1 = c4044i3.metricIcon;
        }
        if ((i13 & 64) != 0) {
            enumC4142w3 = c4044i3.metricStatus;
        }
        if ((i13 & 128) != 0) {
            c9598e = c4044i3.destination;
        }
        EnumC4142w3 enumC4142w4 = enumC4142w3;
        C9598e c9598e2 = c9598e;
        TextResource textResource5 = textResource4;
        EnumC16313m0 enumC16313m2 = enumC16313m1;
        return c4044i3.m12334a(textResource, enumC16313m0, textResource2, textResource3, textResource5, enumC16313m2, enumC4142w4, c9598e2);
    }

    /* JADX INFO: renamed from: a */
    public final C4044i3 m12334a(TextResource title, EnumC16313m0 endIcon, TextResource metricTitle, TextResource metricSubTitle, TextResource metricMagnitude, EnumC16313m0 metricIcon, EnumC4142w3 metricStatus, C9598e destination) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(metricTitle, "metricTitle");
        AbstractC22676k.m65750j(metricStatus, "metricStatus");
        return new C4044i3(title, endIcon, metricTitle, metricSubTitle, metricMagnitude, metricIcon, metricStatus, destination);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC16313m0 getEndIcon() {
        return this.endIcon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4044i3)) {
            return false;
        }
        C4044i3 c4044i3 = (C4044i3) other;
        return AbstractC22676k.m65745e(this.title, c4044i3.title) && this.endIcon == c4044i3.endIcon && AbstractC22676k.m65745e(this.metricTitle, c4044i3.metricTitle) && AbstractC22676k.m65745e(this.metricSubTitle, c4044i3.metricSubTitle) && AbstractC22676k.m65745e(this.metricMagnitude, c4044i3.metricMagnitude) && this.metricIcon == c4044i3.metricIcon && this.metricStatus == c4044i3.metricStatus && AbstractC22676k.m65745e(this.destination, c4044i3.destination);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC16313m0 getMetricIcon() {
        return this.metricIcon;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getMetricMagnitude() {
        return this.metricMagnitude;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC4142w3 getMetricStatus() {
        return this.metricStatus;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        EnumC16313m0 enumC16313m0 = this.endIcon;
        int iM95625a = AbstractC31061c.m95625a((iHashCode + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31, this.metricTitle, 31);
        TextResource textResource = this.metricSubTitle;
        int iHashCode2 = (iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31;
        TextResource textResource2 = this.metricMagnitude;
        int iHashCode3 = (iHashCode2 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        EnumC16313m0 enumC16313m1 = this.metricIcon;
        int iHashCode4 = (this.metricStatus.hashCode() + ((iHashCode3 + (enumC16313m1 == null ? 0 : enumC16313m1.hashCode())) * 31)) * 31;
        C9598e c9598e = this.destination;
        return iHashCode4 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getMetricSubTitle() {
        return this.metricSubTitle;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextResource getMetricTitle() {
        return this.metricTitle;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public String toString() {
        TextResource textResource = this.title;
        EnumC16313m0 enumC16313m0 = this.endIcon;
        TextResource textResource2 = this.metricTitle;
        TextResource textResource3 = this.metricSubTitle;
        TextResource textResource4 = this.metricMagnitude;
        EnumC16313m0 enumC16313m1 = this.metricIcon;
        EnumC4142w3 enumC4142w3 = this.metricStatus;
        C9598e c9598e = this.destination;
        StringBuilder sbM61140k = AbstractC21702c.m61140k("MiniMonitorCardState(title=", textResource, ", endIcon=", enumC16313m0, ", metricTitle=");
        AbstractC30007c.m91855y(sbM61140k, textResource2, ", metricSubTitle=", textResource3, ", metricMagnitude=");
        sbM61140k.append(textResource4);
        sbM61140k.append(", metricIcon=");
        sbM61140k.append(enumC16313m1);
        sbM61140k.append(", metricStatus=");
        sbM61140k.append(enumC4142w3);
        sbM61140k.append(", destination=");
        sbM61140k.append(c9598e);
        sbM61140k.append(")");
        return sbM61140k.toString();
    }

    public /* synthetic */ C4044i3(TextResource textResource, EnumC16313m0 enumC16313m0, TextResource textResource2, TextResource textResource3, TextResource textResource4, EnumC16313m0 enumC16313m1, EnumC4142w3 enumC4142w3, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, (i13 & 2) != 0 ? null : enumC16313m0, textResource2, (i13 & 8) != 0 ? null : textResource3, (i13 & 16) != 0 ? null : textResource4, (i13 & 32) != 0 ? null : enumC16313m1, enumC4142w3, (i13 & 128) != 0 ? null : c9598e);
    }
}
