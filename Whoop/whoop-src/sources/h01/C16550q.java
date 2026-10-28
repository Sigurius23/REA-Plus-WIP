package h01;

import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import b91.AbstractC2890e;
import b91.C2886a;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import kd1.EnumC22400l;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p291l0.InterfaceC22973k1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: h01.q */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b1\b\u0087\b\u0018\u00002\u00020\u0001BÙ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#Jð\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020\b2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010/\u001a\u0004\b0\u0010'R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u0010/\u001a\u0004\b6\u0010'R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b7\u0010'R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\b8\u0010FR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bG\u00102\u001a\u0004\b<\u00104R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b>\u0010H\u001a\u0004\bD\u0010IR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bJ\u00102\u001a\u0004\bK\u00104R\u0017\u0010\u0014\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bL\u00109\u001a\u0004\bM\u0010;R\u0017\u0010\u0015\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bN\u00109\u001a\u0004\bL\u0010;R\u0017\u0010\u0016\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bB\u00109\u001a\u0004\bN\u0010;R\u0017\u0010\u0017\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bK\u00109\u001a\u0004\b\u0017\u0010;R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bG\u0010QR\u0017\u0010\u001a\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bM\u00109\u001a\u0004\bR\u0010;R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b:\u0010S\u001a\u0004\b@\u0010TR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bU\u0010H\u001a\u0004\bO\u0010IR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\b5\u0010XR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\bJ\u0010[¨\u0006\\"}, m65681d2 = {"Lh01/q;", "Lh01/w;", "", "id", "Lcom/whoop/design/util/TextResource;", "subtitle", "appNotificationType", "templateName", "", "isCardExpandable", "Ll0/k1;", "padding", "Lh01/a;", "style", "Lkd1/l;", "cta", "ctaText", "Lkd1/o;", "image", "title", "isAlwaysExpanded", "showBorder", "showButton", "isUpdating", "Lcom/whoop/navigation/e;", NotificationCompat.CATEGORY_NAVIGATION, "overflowButton", "Lgz0/m0;", "endIcon", "titleIconUrl", "Lb91/a;", "bodyTextStyle", "Lm91/u;", "rightItem", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZLl0/k1;Lh01/a;Lkd1/l;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;ZZZZLcom/whoop/navigation/e;ZLgz0/m0;Lkd1/o;Lb91/a;Lm91/u;)V", "a", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZLl0/k1;Lh01/a;Lkd1/l;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;ZZZZLcom/whoop/navigation/e;ZLgz0/m0;Lkd1/o;Lb91/a;Lm91/u;)Lh01/q;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "c", "getAppNotificationType", "getTemplateName", "e", "Z", "r", "()Z", "f", "Ll0/k1;", "j", "()Ll0/k1;", "g", "Lh01/a;", "n", "()Lh01/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lkd1/l;", "()Lkd1/l;", "i", "Lkd1/o;", "()Lkd1/o;", "k", "o", "l", "q", "m", "p", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "getOverflowButton", "Lgz0/m0;", "()Lgz0/m0;", "s", "t", "Lb91/a;", "()Lb91/a;", "u", "Lm91/u;", "()Lm91/u;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16550q implements InterfaceC16556w {

    /* JADX INFO: renamed from: v */
    public static final int f63696v = C9598e.f28134d;

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
    private final EnumC22400l cta;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final TextResource ctaText;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean isAlwaysExpanded;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final boolean showBorder;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final boolean showButton;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final boolean isUpdating;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final C9598e navigation;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final boolean overflowButton;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final EnumC16313m0 endIcon;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final AbstractC22403o titleIconUrl;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final C2886a bodyTextStyle;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final InterfaceC25312u rightItem;

    public C16550q(String id4, TextResource subtitle, String str, String str2, boolean z4, InterfaceC22973k1 padding, EnumC16533a style, EnumC22400l cta, TextResource ctaText, AbstractC22403o abstractC22403o, TextResource title, boolean z13, boolean z14, boolean z15, boolean z16, C9598e c9598e, boolean z17, EnumC16313m0 enumC16313m0, AbstractC22403o abstractC22403o2, C2886a bodyTextStyle, InterfaceC25312u interfaceC25312u) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(padding, "padding");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(cta, "cta");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(bodyTextStyle, "bodyTextStyle");
        this.id = id4;
        this.subtitle = subtitle;
        this.appNotificationType = str;
        this.templateName = str2;
        this.isCardExpandable = z4;
        this.padding = padding;
        this.style = style;
        this.cta = cta;
        this.ctaText = ctaText;
        this.image = abstractC22403o;
        this.title = title;
        this.isAlwaysExpanded = z13;
        this.showBorder = z14;
        this.showButton = z15;
        this.isUpdating = z16;
        this.navigation = c9598e;
        this.overflowButton = z17;
        this.endIcon = enumC16313m0;
        this.titleIconUrl = abstractC22403o2;
        this.bodyTextStyle = bodyTextStyle;
        this.rightItem = interfaceC25312u;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C16550q m46793b(C16550q c16550q, String str, TextResource textResource, String str2, String str3, boolean z4, InterfaceC22973k1 interfaceC22973k1, EnumC16533a enumC16533a, EnumC22400l enumC22400l, TextResource textResource2, AbstractC22403o abstractC22403o, TextResource textResource3, boolean z13, boolean z14, boolean z15, boolean z16, C9598e c9598e, boolean z17, EnumC16313m0 enumC16313m0, AbstractC22403o abstractC22403o2, C2886a c2886a, InterfaceC25312u interfaceC25312u, int i13, Object obj) {
        InterfaceC25312u interfaceC25312u2;
        C2886a c2886a2;
        String str4 = (i13 & 1) != 0 ? c16550q.id : str;
        TextResource textResource4 = (i13 & 2) != 0 ? c16550q.subtitle : textResource;
        String str5 = (i13 & 4) != 0 ? c16550q.appNotificationType : str2;
        String str6 = (i13 & 8) != 0 ? c16550q.templateName : str3;
        boolean z18 = (i13 & 16) != 0 ? c16550q.isCardExpandable : z4;
        InterfaceC22973k1 interfaceC22973k2 = (i13 & 32) != 0 ? c16550q.padding : interfaceC22973k1;
        EnumC16533a enumC16533a2 = (i13 & 64) != 0 ? c16550q.style : enumC16533a;
        EnumC22400l enumC22400l2 = (i13 & 128) != 0 ? c16550q.cta : enumC22400l;
        TextResource textResource5 = (i13 & 256) != 0 ? c16550q.ctaText : textResource2;
        AbstractC22403o abstractC22403o3 = (i13 & 512) != 0 ? c16550q.image : abstractC22403o;
        TextResource textResource6 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c16550q.title : textResource3;
        boolean z19 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c16550q.isAlwaysExpanded : z13;
        boolean z24 = (i13 & 4096) != 0 ? c16550q.showBorder : z14;
        boolean z25 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c16550q.showButton : z15;
        String str7 = str4;
        boolean z26 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c16550q.isUpdating : z16;
        C9598e c9598e2 = (i13 & 32768) != 0 ? c16550q.navigation : c9598e;
        boolean z27 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? c16550q.overflowButton : z17;
        EnumC16313m0 enumC16313m1 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? c16550q.endIcon : enumC16313m0;
        AbstractC22403o abstractC22403o4 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? c16550q.titleIconUrl : abstractC22403o2;
        C2886a c2886a3 = (i13 & 524288) != 0 ? c16550q.bodyTextStyle : c2886a;
        if ((i13 & 1048576) != 0) {
            c2886a2 = c2886a3;
            interfaceC25312u2 = c16550q.rightItem;
        } else {
            interfaceC25312u2 = interfaceC25312u;
            c2886a2 = c2886a3;
        }
        return c16550q.m46794a(str7, textResource4, str5, str6, z18, interfaceC22973k2, enumC16533a2, enumC22400l2, textResource5, abstractC22403o3, textResource6, z19, z24, z25, z26, c9598e2, z27, enumC16313m1, abstractC22403o4, c2886a2, interfaceC25312u2);
    }

    /* JADX INFO: renamed from: a */
    public final C16550q m46794a(String id4, TextResource subtitle, String appNotificationType, String templateName, boolean isCardExpandable, InterfaceC22973k1 padding, EnumC16533a style, EnumC22400l cta, TextResource ctaText, AbstractC22403o image, TextResource title, boolean isAlwaysExpanded, boolean showBorder, boolean showButton, boolean isUpdating, C9598e navigation, boolean overflowButton, EnumC16313m0 endIcon, AbstractC22403o titleIconUrl, C2886a bodyTextStyle, InterfaceC25312u rightItem) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(padding, "padding");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(cta, "cta");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(bodyTextStyle, "bodyTextStyle");
        return new C16550q(id4, subtitle, appNotificationType, templateName, isCardExpandable, padding, style, cta, ctaText, image, title, isAlwaysExpanded, showBorder, showButton, isUpdating, navigation, overflowButton, endIcon, titleIconUrl, bodyTextStyle, rightItem);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C2886a getBodyTextStyle() {
        return this.bodyTextStyle;
    }

    @Override // h01.InterfaceC16556w
    /* JADX INFO: renamed from: d, reason: from getter */
    public TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC22400l getCta() {
        return this.cta;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16550q)) {
            return false;
        }
        C16550q c16550q = (C16550q) other;
        return AbstractC22676k.m65745e(this.id, c16550q.id) && AbstractC22676k.m65745e(this.subtitle, c16550q.subtitle) && AbstractC22676k.m65745e(this.appNotificationType, c16550q.appNotificationType) && AbstractC22676k.m65745e(this.templateName, c16550q.templateName) && this.isCardExpandable == c16550q.isCardExpandable && AbstractC22676k.m65745e(this.padding, c16550q.padding) && this.style == c16550q.style && this.cta == c16550q.cta && AbstractC22676k.m65745e(this.ctaText, c16550q.ctaText) && AbstractC22676k.m65745e(this.image, c16550q.image) && AbstractC22676k.m65745e(this.title, c16550q.title) && this.isAlwaysExpanded == c16550q.isAlwaysExpanded && this.showBorder == c16550q.showBorder && this.showButton == c16550q.showButton && this.isUpdating == c16550q.isUpdating && AbstractC22676k.m65745e(this.navigation, c16550q.navigation) && this.overflowButton == c16550q.overflowButton && this.endIcon == c16550q.endIcon && AbstractC22676k.m65745e(this.titleIconUrl, c16550q.titleIconUrl) && AbstractC22676k.m65745e(this.bodyTextStyle, c16550q.bodyTextStyle) && AbstractC22676k.m65745e(this.rightItem, c16550q.rightItem);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final EnumC16313m0 getEndIcon() {
        return this.endIcon;
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
    public final AbstractC22403o getImage() {
        return this.image;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.id.hashCode() * 31, this.subtitle, 31);
        String str = this.appNotificationType;
        int iHashCode = (iM95625a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.templateName;
        int iM95625a2 = AbstractC31061c.m95625a((this.cta.hashCode() + ((this.style.hashCode() + ((this.padding.hashCode() + AbstractC2875y.m8289b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isCardExpandable)) * 31)) * 31)) * 31, this.ctaText, 31);
        AbstractC22403o abstractC22403o = this.image;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC31061c.m95625a((iM95625a2 + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31, this.title, 31), 31, this.isAlwaysExpanded), 31, this.showBorder), 31, this.showButton), 31, this.isUpdating);
        C9598e c9598e = this.navigation;
        int iM8289b2 = AbstractC2875y.m8289b((iM8289b + (c9598e == null ? 0 : c9598e.hashCode())) * 31, 31, this.overflowButton);
        EnumC16313m0 enumC16313m0 = this.endIcon;
        int iHashCode2 = (iM8289b2 + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        AbstractC22403o abstractC22403o2 = this.titleIconUrl;
        int iM31984c = AbstractC11895b.m31984c(this.bodyTextStyle, (iHashCode2 + (abstractC22403o2 == null ? 0 : abstractC22403o2.hashCode())) * 31, 31);
        InterfaceC25312u interfaceC25312u = this.rightItem;
        return iM31984c + (interfaceC25312u != null ? interfaceC25312u.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C9598e getNavigation() {
        return this.navigation;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public InterfaceC22973k1 getPadding() {
        return this.padding;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final InterfaceC25312u getRightItem() {
        return this.rightItem;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getShowBorder() {
        return this.showBorder;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getShowButton() {
        return this.showButton;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public EnumC16533a getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final AbstractC22403o getTitleIconUrl() {
        return this.titleIconUrl;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getIsAlwaysExpanded() {
        return this.isAlwaysExpanded;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public boolean getIsCardExpandable() {
        return this.isCardExpandable;
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.subtitle;
        String str2 = this.appNotificationType;
        String str3 = this.templateName;
        boolean z4 = this.isCardExpandable;
        InterfaceC22973k1 interfaceC22973k1 = this.padding;
        EnumC16533a enumC16533a = this.style;
        EnumC22400l enumC22400l = this.cta;
        TextResource textResource2 = this.ctaText;
        AbstractC22403o abstractC22403o = this.image;
        TextResource textResource3 = this.title;
        boolean z13 = this.isAlwaysExpanded;
        boolean z14 = this.showBorder;
        boolean z15 = this.showButton;
        boolean z16 = this.isUpdating;
        C9598e c9598e = this.navigation;
        boolean z17 = this.overflowButton;
        EnumC16313m0 enumC16313m0 = this.endIcon;
        AbstractC22403o abstractC22403o2 = this.titleIconUrl;
        C2886a c2886a = this.bodyTextStyle;
        InterfaceC25312u interfaceC25312u = this.rightItem;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("NotificationCardCtaState(id=", str, ", subtitle=", textResource, ", appNotificationType=");
        AbstractC11266d.m30444B(sbM91847q, str2, ", templateName=", str3, ", isCardExpandable=");
        sbM91847q.append(z4);
        sbM91847q.append(", padding=");
        sbM91847q.append(interfaceC22973k1);
        sbM91847q.append(", style=");
        sbM91847q.append(enumC16533a);
        sbM91847q.append(", cta=");
        sbM91847q.append(enumC22400l);
        sbM91847q.append(", ctaText=");
        sbM91847q.append(textResource2);
        sbM91847q.append(", image=");
        sbM91847q.append(abstractC22403o);
        sbM91847q.append(", title=");
        AbstractC33745d.m106664w(textResource3, ", isAlwaysExpanded=", ", showBorder=", sbM91847q, z13);
        AbstractC38963t7.m124392v(sbM91847q, z14, ", showButton=", z15, ", isUpdating=");
        sbM91847q.append(z16);
        sbM91847q.append(", navigation=");
        sbM91847q.append(c9598e);
        sbM91847q.append(", overflowButton=");
        sbM91847q.append(z17);
        sbM91847q.append(", endIcon=");
        sbM91847q.append(enumC16313m0);
        sbM91847q.append(", titleIconUrl=");
        sbM91847q.append(abstractC22403o2);
        sbM91847q.append(", bodyTextStyle=");
        sbM91847q.append(c2886a);
        sbM91847q.append(", rightItem=");
        sbM91847q.append(interfaceC25312u);
        sbM91847q.append(")");
        return sbM91847q.toString();
    }

    @Override // p720m91.InterfaceC25305n
    public String getId() {
        return this.id;
    }

    public /* synthetic */ C16550q(String str, TextResource textResource, String str2, String str3, boolean z4, InterfaceC22973k1 interfaceC22973k1, EnumC16533a enumC16533a, EnumC22400l enumC22400l, TextResource textResource2, AbstractC22403o abstractC22403o, TextResource textResource3, boolean z13, boolean z14, boolean z15, boolean z16, C9598e c9598e, boolean z17, EnumC16313m0 enumC16313m0, AbstractC22403o abstractC22403o2, C2886a c2886a, InterfaceC25312u interfaceC25312u, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textResource, str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? true : z4, (i13 & 32) != 0 ? AbstractC16537d.m46721a() : interfaceC22973k1, (i13 & 64) != 0 ? EnumC16533a.DEFAULT : enumC16533a, enumC22400l, textResource2, abstractC22403o, textResource3, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? false : z13, (i13 & 4096) != 0 ? true : z14, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? true : z15, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? false : z16, (32768 & i13) != 0 ? null : c9598e, (65536 & i13) != 0 ? false : z17, (131072 & i13) != 0 ? null : enumC16313m0, (262144 & i13) != 0 ? null : abstractC22403o2, (524288 & i13) != 0 ? AbstractC2890e.m8450e().getB2() : c2886a, (i13 & 1048576) != 0 ? null : interfaceC25312u);
    }
}
