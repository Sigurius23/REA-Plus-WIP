package c41;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: c41.r4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0098\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010$\u001a\u0004\b%\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b2\u00108R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b.\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u0010$\u001a\u0004\b6\u0010\u001bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b:\u0010$\u001a\u0004\b;\u0010\u001bR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b(\u0010<\u001a\u0004\b*\u0010=R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b,\u0010>\u001a\u0004\b:\u0010?R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b4\u0010@\u001a\u0004\b9\u0010A¨\u0006B"}, m65681d2 = {"Lc41/r4;", "Lm91/u;", "", "id", "Lc41/m4;", "layoutStyle", "Lcom/whoop/design/util/TextResource;", "title", "Lkd1/o;", "image", "topItem", "Lgz0/m0;", "endIcon", "subtitle", "familyPlanId", "userId", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "Lc41/h4;", "imageStyle", "<init>", "(Ljava/lang/String;Lc41/m4;Lcom/whoop/design/util/TextResource;Lkd1/o;Lm91/u;Lgz0/m0;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Lc41/h4;)V", "a", "(Ljava/lang/String;Lc41/m4;Lcom/whoop/design/util/TextResource;Lkd1/o;Lm91/u;Lgz0/m0;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Lc41/h4;)Lc41/r4;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", "Lc41/m4;", "j", "()Lc41/m4;", "c", "Lcom/whoop/design/util/TextResource;", "k", "()Lcom/whoop/design/util/TextResource;", "d", "Lkd1/o;", "g", "()Lkd1/o;", "e", "Lm91/u;", "l", "()Lm91/u;", "f", "Lgz0/m0;", "()Lgz0/m0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "m", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "Lc41/h4;", "()Lc41/h4;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4108r4 implements InterfaceC25312u {

    /* JADX INFO: renamed from: m */
    public static final int f16668m = GenericInteraction.$stable | C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC4073m4 layoutStyle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC25312u topItem;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC16313m0 endIcon;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String familyPlanId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String userId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final GenericInteraction interaction;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final EnumC4038h4 imageStyle;

    public C4108r4(String id4, EnumC4073m4 layoutStyle, TextResource textResource, AbstractC22403o abstractC22403o, InterfaceC25312u interfaceC25312u, EnumC16313m0 enumC16313m0, TextResource subtitle, String str, String str2, C9598e c9598e, GenericInteraction genericInteraction, EnumC4038h4 imageStyle) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(layoutStyle, "layoutStyle");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(imageStyle, "imageStyle");
        this.id = id4;
        this.layoutStyle = layoutStyle;
        this.title = textResource;
        this.image = abstractC22403o;
        this.topItem = interfaceC25312u;
        this.endIcon = enumC16313m0;
        this.subtitle = subtitle;
        this.familyPlanId = str;
        this.userId = str2;
        this.destination = c9598e;
        this.interaction = genericInteraction;
        this.imageStyle = imageStyle;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C4108r4 m12654b(C4108r4 c4108r4, String str, EnumC4073m4 enumC4073m4, TextResource textResource, AbstractC22403o abstractC22403o, InterfaceC25312u interfaceC25312u, EnumC16313m0 enumC16313m0, TextResource textResource2, String str2, String str3, C9598e c9598e, GenericInteraction genericInteraction, EnumC4038h4 enumC4038h4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c4108r4.id;
        }
        if ((i13 & 2) != 0) {
            enumC4073m4 = c4108r4.layoutStyle;
        }
        if ((i13 & 4) != 0) {
            textResource = c4108r4.title;
        }
        if ((i13 & 8) != 0) {
            abstractC22403o = c4108r4.image;
        }
        if ((i13 & 16) != 0) {
            interfaceC25312u = c4108r4.topItem;
        }
        if ((i13 & 32) != 0) {
            enumC16313m0 = c4108r4.endIcon;
        }
        if ((i13 & 64) != 0) {
            textResource2 = c4108r4.subtitle;
        }
        if ((i13 & 128) != 0) {
            str2 = c4108r4.familyPlanId;
        }
        if ((i13 & 256) != 0) {
            str3 = c4108r4.userId;
        }
        if ((i13 & 512) != 0) {
            c9598e = c4108r4.destination;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            genericInteraction = c4108r4.interaction;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            enumC4038h4 = c4108r4.imageStyle;
        }
        GenericInteraction genericInteraction2 = genericInteraction;
        EnumC4038h4 enumC4038h5 = enumC4038h4;
        String str4 = str3;
        C9598e c9598e2 = c9598e;
        TextResource textResource3 = textResource2;
        String str5 = str2;
        InterfaceC25312u interfaceC25312u2 = interfaceC25312u;
        EnumC16313m0 enumC16313m1 = enumC16313m0;
        return c4108r4.m12655a(str, enumC4073m4, textResource, abstractC22403o, interfaceC25312u2, enumC16313m1, textResource3, str5, str4, c9598e2, genericInteraction2, enumC4038h5);
    }

    /* JADX INFO: renamed from: a */
    public final C4108r4 m12655a(String id4, EnumC4073m4 layoutStyle, TextResource title, AbstractC22403o image, InterfaceC25312u topItem, EnumC16313m0 endIcon, TextResource subtitle, String familyPlanId, String userId, C9598e destination, GenericInteraction interaction, EnumC4038h4 imageStyle) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(layoutStyle, "layoutStyle");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(imageStyle, "imageStyle");
        return new C4108r4(id4, layoutStyle, title, image, topItem, endIcon, subtitle, familyPlanId, userId, destination, interaction, imageStyle);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC16313m0 getEndIcon() {
        return this.endIcon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4108r4)) {
            return false;
        }
        C4108r4 c4108r4 = (C4108r4) other;
        return AbstractC22676k.m65745e(this.id, c4108r4.id) && this.layoutStyle == c4108r4.layoutStyle && AbstractC22676k.m65745e(this.title, c4108r4.title) && AbstractC22676k.m65745e(this.image, c4108r4.image) && AbstractC22676k.m65745e(this.topItem, c4108r4.topItem) && this.endIcon == c4108r4.endIcon && AbstractC22676k.m65745e(this.subtitle, c4108r4.subtitle) && AbstractC22676k.m65745e(this.familyPlanId, c4108r4.familyPlanId) && AbstractC22676k.m65745e(this.userId, c4108r4.userId) && AbstractC22676k.m65745e(this.destination, c4108r4.destination) && AbstractC22676k.m65745e(this.interaction, c4108r4.interaction) && this.imageStyle == c4108r4.imageStyle;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getFamilyPlanId() {
        return this.familyPlanId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC4038h4 getImageStyle() {
        return this.imageStyle;
    }

    public int hashCode() {
        int iHashCode = (this.layoutStyle.hashCode() + (this.id.hashCode() * 31)) * 31;
        TextResource textResource = this.title;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        AbstractC22403o abstractC22403o = this.image;
        int iHashCode3 = (iHashCode2 + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31;
        InterfaceC25312u interfaceC25312u = this.topItem;
        int iHashCode4 = (iHashCode3 + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.endIcon;
        int iM95625a = AbstractC31061c.m95625a((iHashCode4 + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31, this.subtitle, 31);
        String str = this.familyPlanId;
        int iHashCode5 = (iM95625a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.userId;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode7 = (iHashCode6 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        GenericInteraction genericInteraction = this.interaction;
        return this.imageStyle.hashCode() + ((iHashCode7 + (genericInteraction != null ? genericInteraction.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final EnumC4073m4 getLayoutStyle() {
        return this.layoutStyle;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final InterfaceC25312u getTopItem() {
        return this.topItem;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    public String toString() {
        String str = this.id;
        EnumC4073m4 enumC4073m4 = this.layoutStyle;
        TextResource textResource = this.title;
        AbstractC22403o abstractC22403o = this.image;
        InterfaceC25312u interfaceC25312u = this.topItem;
        EnumC16313m0 enumC16313m0 = this.endIcon;
        TextResource textResource2 = this.subtitle;
        String str2 = this.familyPlanId;
        String str3 = this.userId;
        C9598e c9598e = this.destination;
        GenericInteraction genericInteraction = this.interaction;
        EnumC4038h4 enumC4038h4 = this.imageStyle;
        StringBuilder sb4 = new StringBuilder("ProfileInfoTileViewState(id=");
        sb4.append(str);
        sb4.append(", layoutStyle=");
        sb4.append(enumC4073m4);
        sb4.append(", title=");
        sb4.append(textResource);
        sb4.append(", image=");
        sb4.append(abstractC22403o);
        sb4.append(", topItem=");
        sb4.append(interfaceC25312u);
        sb4.append(", endIcon=");
        sb4.append(enumC16313m0);
        sb4.append(", subtitle=");
        AbstractC30007c.m91856z(sb4, textResource2, ", familyPlanId=", str2, ", userId=");
        AbstractC30007c.m91827B(sb4, str3, ", destination=", c9598e, ", interaction=");
        sb4.append(genericInteraction);
        sb4.append(", imageStyle=");
        sb4.append(enumC4038h4);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C4108r4(String str, EnumC4073m4 enumC4073m4, TextResource textResource, AbstractC22403o abstractC22403o, InterfaceC25312u interfaceC25312u, EnumC16313m0 enumC16313m0, TextResource textResource2, String str2, String str3, C9598e c9598e, GenericInteraction genericInteraction, EnumC4038h4 enumC4038h4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? EnumC4073m4.SINGLE : enumC4073m4, textResource, abstractC22403o, interfaceC25312u, enumC16313m0, (i13 & 64) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 128) != 0 ? null : str2, (i13 & 256) != 0 ? null : str3, c9598e, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : genericInteraction, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? EnumC4038h4.SQUARE : enumC4038h4);
    }
}
