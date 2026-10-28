package c41;

import androidx.core.app.NotificationCompat;
import c13.AbstractC3855a;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import no.nordicsemi.android.dfu.DfuBaseService;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: c41.g1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0094\u0001\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\"\u001a\u0004\b#\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010+\u001a\u0004\b2\u0010-R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b2\u0010+\u001a\u0004\b3\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b4\u0010'\u001a\u0004\b5\u0010)R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b4\u00107R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b3\u00108\u001a\u0004\b.\u00109R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b0\u0010:\u001a\u0004\b&\u0010;¨\u0006<"}, m65681d2 = {"Lc41/g1;", "Lm91/u;", "", "id", "testTag", "Lgz0/m0;", "icon", "Lcom/whoop/design/util/TextResource;", "title", "Lc41/h1;", "style", NotificationCompat.CATEGORY_STATUS, "statusSubtitle", "statusIcon", "Ly81/f;", "statusColor", "Lcom/whoop/navigation/e;", "destination", "", "barStyles", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/design/util/TextResource;Lc41/h1;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Ly81/f;Lcom/whoop/navigation/e;Ljava/util/List;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/design/util/TextResource;Lc41/h1;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Ly81/f;Lcom/whoop/navigation/e;Ljava/util/List;)Lc41/g1;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", "l", "c", "Lgz0/m0;", "f", "()Lgz0/m0;", "d", "Lcom/whoop/design/util/TextResource;", "m", "()Lcom/whoop/design/util/TextResource;", "e", "Lc41/h1;", "k", "()Lc41/h1;", "g", "j", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "Ly81/f;", "()Ly81/f;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4028g1 implements InterfaceC25312u {

    /* JADX INFO: renamed from: l */
    public static final int f16356l = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String testTag;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC4035h1 style;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource status;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource statusSubtitle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final EnumC16313m0 statusIcon;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final EnumC39333f statusColor;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final List<EnumC39333f> barStyles;

    /* JADX WARN: Multi-variable type inference failed */
    public C4028g1(String str, String str2, EnumC16313m0 enumC16313m0, TextResource title, EnumC4035h1 style, TextResource status, TextResource textResource, EnumC16313m0 enumC16313m1, EnumC39333f enumC39333f, C9598e c9598e, List<? extends EnumC39333f> list) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(status, "status");
        this.id = str;
        this.testTag = str2;
        this.icon = enumC16313m0;
        this.title = title;
        this.style = style;
        this.status = status;
        this.statusSubtitle = textResource;
        this.statusIcon = enumC16313m1;
        this.statusColor = enumC39333f;
        this.destination = c9598e;
        this.barStyles = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C4028g1 m12267b(C4028g1 c4028g1, String str, String str2, EnumC16313m0 enumC16313m0, TextResource textResource, EnumC4035h1 enumC4035h1, TextResource textResource2, TextResource textResource3, EnumC16313m0 enumC16313m1, EnumC39333f enumC39333f, C9598e c9598e, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c4028g1.id;
        }
        if ((i13 & 2) != 0) {
            str2 = c4028g1.testTag;
        }
        if ((i13 & 4) != 0) {
            enumC16313m0 = c4028g1.icon;
        }
        if ((i13 & 8) != 0) {
            textResource = c4028g1.title;
        }
        if ((i13 & 16) != 0) {
            enumC4035h1 = c4028g1.style;
        }
        if ((i13 & 32) != 0) {
            textResource2 = c4028g1.status;
        }
        if ((i13 & 64) != 0) {
            textResource3 = c4028g1.statusSubtitle;
        }
        if ((i13 & 128) != 0) {
            enumC16313m1 = c4028g1.statusIcon;
        }
        if ((i13 & 256) != 0) {
            enumC39333f = c4028g1.statusColor;
        }
        if ((i13 & 512) != 0) {
            c9598e = c4028g1.destination;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            list = c4028g1.barStyles;
        }
        C9598e c9598e2 = c9598e;
        List list2 = list;
        EnumC16313m0 enumC16313m2 = enumC16313m1;
        EnumC39333f enumC39333f2 = enumC39333f;
        TextResource textResource4 = textResource2;
        TextResource textResource5 = textResource3;
        EnumC4035h1 enumC4035h2 = enumC4035h1;
        EnumC16313m0 enumC16313m3 = enumC16313m0;
        return c4028g1.m12268a(str, str2, enumC16313m3, textResource, enumC4035h2, textResource4, textResource5, enumC16313m2, enumC39333f2, c9598e2, list2);
    }

    /* JADX INFO: renamed from: a */
    public final C4028g1 m12268a(String id4, String testTag, EnumC16313m0 icon, TextResource title, EnumC4035h1 style, TextResource status, TextResource statusSubtitle, EnumC16313m0 statusIcon, EnumC39333f statusColor, C9598e destination, List<? extends EnumC39333f> barStyles) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(status, "status");
        return new C4028g1(id4, testTag, icon, title, style, status, statusSubtitle, statusIcon, statusColor, destination, barStyles);
    }

    /* JADX INFO: renamed from: c */
    public final List<EnumC39333f> m12269c() {
        return this.barStyles;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4028g1)) {
            return false;
        }
        C4028g1 c4028g1 = (C4028g1) other;
        return AbstractC22676k.m65745e(this.id, c4028g1.id) && AbstractC22676k.m65745e(this.testTag, c4028g1.testTag) && this.icon == c4028g1.icon && AbstractC22676k.m65745e(this.title, c4028g1.title) && this.style == c4028g1.style && AbstractC22676k.m65745e(this.status, c4028g1.status) && AbstractC22676k.m65745e(this.statusSubtitle, c4028g1.statusSubtitle) && this.statusIcon == c4028g1.statusIcon && this.statusColor == c4028g1.statusColor && AbstractC22676k.m65745e(this.destination, c4028g1.destination) && AbstractC22676k.m65745e(this.barStyles, c4028g1.barStyles);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC39333f getStatusColor() {
        return this.statusColor;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.testTag;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.icon;
        int iM95625a = AbstractC31061c.m95625a((this.style.hashCode() + AbstractC31061c.m95625a((iHashCode2 + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31, this.title, 31)) * 31, this.status, 31);
        TextResource textResource = this.statusSubtitle;
        int iHashCode3 = (iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31;
        EnumC16313m0 enumC16313m1 = this.statusIcon;
        int iHashCode4 = (iHashCode3 + (enumC16313m1 == null ? 0 : enumC16313m1.hashCode())) * 31;
        EnumC39333f enumC39333f = this.statusColor;
        int iHashCode5 = (iHashCode4 + (enumC39333f == null ? 0 : enumC39333f.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode6 = (iHashCode5 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        List<EnumC39333f> list = this.barStyles;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final EnumC16313m0 getStatusIcon() {
        return this.statusIcon;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextResource getStatusSubtitle() {
        return this.statusSubtitle;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final EnumC4035h1 getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getTestTag() {
        return this.testTag;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.testTag;
        EnumC16313m0 enumC16313m0 = this.icon;
        TextResource textResource = this.title;
        EnumC4035h1 enumC4035h1 = this.style;
        TextResource textResource2 = this.status;
        TextResource textResource3 = this.statusSubtitle;
        EnumC16313m0 enumC16313m1 = this.statusIcon;
        EnumC39333f enumC39333f = this.statusColor;
        C9598e c9598e = this.destination;
        List<EnumC39333f> list = this.barStyles;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ContributorTileMetricState(id=", str, ", testTag=", str2, ", icon=");
        sbM32001t.append(enumC16313m0);
        sbM32001t.append(", title=");
        sbM32001t.append(textResource);
        sbM32001t.append(", style=");
        sbM32001t.append(enumC4035h1);
        sbM32001t.append(", status=");
        sbM32001t.append(textResource2);
        sbM32001t.append(", statusSubtitle=");
        sbM32001t.append(textResource3);
        sbM32001t.append(", statusIcon=");
        sbM32001t.append(enumC16313m1);
        sbM32001t.append(", statusColor=");
        sbM32001t.append(enumC39333f);
        sbM32001t.append(", destination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(", barStyles=");
        return AbstractC3855a.m11829m(sbM32001t, list, ")");
    }

    public /* synthetic */ C4028g1(String str, String str2, EnumC16313m0 enumC16313m0, TextResource textResource, EnumC4035h1 enumC4035h1, TextResource textResource2, TextResource textResource3, EnumC16313m0 enumC16313m1, EnumC39333f enumC39333f, C9598e c9598e, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : str2, enumC16313m0, textResource, (i13 & 16) != 0 ? EnumC4035h1.NO_DATA : enumC4035h1, textResource2, (i13 & 64) != 0 ? null : textResource3, enumC16313m1, (i13 & 256) != 0 ? EnumC39333f.WHITE_70 : enumC39333f, c9598e, list);
    }
}
