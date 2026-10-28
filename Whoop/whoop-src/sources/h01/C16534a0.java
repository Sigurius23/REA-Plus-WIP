package h01;

import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p291l0.InterfaceC22973k1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: h01.a0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b(\u0010\u0017R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b\"\u0010/R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b)\u00102R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b-\u0010%R\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b3\u0010*\u001a\u0004\b&\u0010,R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b\u001f\u00106R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b0\u00109¨\u0006:"}, m65681d2 = {"Lh01/a0;", "Lh01/w;", "", "id", "Lcom/whoop/design/util/TextResource;", "subtitle", "appNotificationType", "templateName", "", "isCardExpandable", "Ll0/k1;", "padding", "Lh01/a;", "style", "title", "showBorder", "Lgz0/m0;", "endIcon", "Lkd1/o;", "titleIconUrl", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZLl0/k1;Lh01/a;Lcom/whoop/design/util/TextResource;ZLgz0/m0;Lkd1/o;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "c", "getAppNotificationType", "getTemplateName", "e", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "f", "Ll0/k1;", "()Ll0/k1;", "g", "Lh01/a;", "()Lh01/a;", "i", "j", "Lgz0/m0;", "()Lgz0/m0;", "k", "Lkd1/o;", "()Lkd1/o;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16534a0 implements InterfaceC16556w {

    /* JADX INFO: renamed from: l */
    public static final int f63614l = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String appNotificationType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String templateName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isCardExpandable;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC22973k1 padding;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final EnumC16533a style;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean showBorder;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final EnumC16313m0 endIcon;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final AbstractC22403o titleIconUrl;

    public C16534a0(String id4, TextResource subtitle, String str, String str2, boolean z4, InterfaceC22973k1 padding, EnumC16533a style, TextResource title, boolean z13, EnumC16313m0 enumC16313m0, AbstractC22403o abstractC22403o) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(padding, "padding");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(title, "title");
        this.id = id4;
        this.subtitle = subtitle;
        this.appNotificationType = str;
        this.templateName = str2;
        this.isCardExpandable = z4;
        this.padding = padding;
        this.style = style;
        this.title = title;
        this.showBorder = z13;
        this.endIcon = enumC16313m0;
        this.titleIconUrl = abstractC22403o;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC16313m0 getEndIcon() {
        return this.endIcon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public InterfaceC22973k1 getPadding() {
        return this.padding;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getShowBorder() {
        return this.showBorder;
    }

    @Override // h01.InterfaceC16556w
    /* JADX INFO: renamed from: d, reason: from getter */
    public TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public EnumC16533a getStyle() {
        return this.style;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16534a0)) {
            return false;
        }
        C16534a0 c16534a0 = (C16534a0) other;
        return AbstractC22676k.m65745e(this.id, c16534a0.id) && AbstractC22676k.m65745e(this.subtitle, c16534a0.subtitle) && AbstractC22676k.m65745e(this.appNotificationType, c16534a0.appNotificationType) && AbstractC22676k.m65745e(this.templateName, c16534a0.templateName) && this.isCardExpandable == c16534a0.isCardExpandable && AbstractC22676k.m65745e(this.padding, c16534a0.padding) && this.style == c16534a0.style && AbstractC22676k.m65745e(this.title, c16534a0.title) && this.showBorder == c16534a0.showBorder && this.endIcon == c16534a0.endIcon && AbstractC22676k.m65745e(this.titleIconUrl, c16534a0.titleIconUrl);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final AbstractC22403o getTitleIconUrl() {
        return this.titleIconUrl;
    }

    @Override // h01.InterfaceC16556w
    public String getAppNotificationType() {
        return this.appNotificationType;
    }

    @Override // h01.InterfaceC16556w
    public String getTemplateName() {
        return this.templateName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public boolean getIsCardExpandable() {
        return this.isCardExpandable;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.id.hashCode() * 31, this.subtitle, 31);
        String str = this.appNotificationType;
        int iHashCode = (iM95625a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.templateName;
        int iM8289b = AbstractC2875y.m8289b(AbstractC31061c.m95625a((this.style.hashCode() + ((this.padding.hashCode() + AbstractC2875y.m8289b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isCardExpandable)) * 31)) * 31, this.title, 31), 31, this.showBorder);
        EnumC16313m0 enumC16313m0 = this.endIcon;
        int iHashCode2 = (iM8289b + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        AbstractC22403o abstractC22403o = this.titleIconUrl;
        return iHashCode2 + (abstractC22403o != null ? abstractC22403o.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.subtitle;
        String str2 = this.appNotificationType;
        String str3 = this.templateName;
        boolean z4 = this.isCardExpandable;
        InterfaceC22973k1 interfaceC22973k1 = this.padding;
        EnumC16533a enumC16533a = this.style;
        TextResource textResource2 = this.title;
        boolean z13 = this.showBorder;
        EnumC16313m0 enumC16313m0 = this.endIcon;
        AbstractC22403o abstractC22403o = this.titleIconUrl;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("NotificationCardVowState(id=", str, ", subtitle=", textResource, ", appNotificationType=");
        AbstractC11266d.m30444B(sbM91847q, str2, ", templateName=", str3, ", isCardExpandable=");
        sbM91847q.append(z4);
        sbM91847q.append(", padding=");
        sbM91847q.append(interfaceC22973k1);
        sbM91847q.append(", style=");
        sbM91847q.append(enumC16533a);
        sbM91847q.append(", title=");
        sbM91847q.append(textResource2);
        sbM91847q.append(", showBorder=");
        sbM91847q.append(z13);
        sbM91847q.append(", endIcon=");
        sbM91847q.append(enumC16313m0);
        sbM91847q.append(", titleIconUrl=");
        sbM91847q.append(abstractC22403o);
        sbM91847q.append(")");
        return sbM91847q.toString();
    }

    @Override // p720m91.InterfaceC25305n
    public String getId() {
        return this.id;
    }

    public /* synthetic */ C16534a0(String str, TextResource textResource, String str2, String str3, boolean z4, InterfaceC22973k1 interfaceC22973k1, EnumC16533a enumC16533a, TextResource textResource2, boolean z13, EnumC16313m0 enumC16313m0, AbstractC22403o abstractC22403o, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textResource, str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? true : z4, (i13 & 32) != 0 ? AbstractC16537d.m46721a() : interfaceC22973k1, (i13 & 64) != 0 ? EnumC16533a.DEFAULT : enumC16533a, textResource2, (i13 & 256) != 0 ? false : z13, (i13 & 512) != 0 ? null : enumC16313m0, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : abstractC22403o);
    }
}
