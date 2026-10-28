package q71;

import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: q71.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b%\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b!\u0010+R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b)\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b#\u00100\u001a\u0004\b,\u00101R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b\u001e\u00104¨\u00065"}, m65681d2 = {"Lq71/c;", "Lm91/u;", "", "id", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "Lkd1/o;", "imageUrl", "Lgz0/m0;", "icon", "mainImage", "Lq71/h;", "mainImageStyle", "Lq71/g;", "mainImagePosition", "Lq71/b;", "dialogInfo", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lgz0/m0;Lkd1/o;Lq71/h;Lq71/g;Lq71/b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/util/TextResource;", "c", "d", "Lkd1/o;", "()Lkd1/o;", "e", "Lgz0/m0;", "()Lgz0/m0;", "f", "g", "Lq71/h;", "()Lq71/h;", "Lq71/g;", "()Lq71/g;", "i", "Lq71/b;", "()Lq71/b;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30012c implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC22403o imageUrl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AbstractC22403o mainImage;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final EnumC30017h mainImageStyle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final EnumC30016g mainImagePosition;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C30011b dialogInfo;

    public C30012c(String id4, TextResource title, TextResource textResource, AbstractC22403o abstractC22403o, EnumC16313m0 enumC16313m0, AbstractC22403o abstractC22403o2, EnumC30017h enumC30017h, EnumC30016g enumC30016g, C30011b c30011b) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        this.id = id4;
        this.title = title;
        this.subtitle = textResource;
        this.imageUrl = abstractC22403o;
        this.icon = enumC16313m0;
        this.mainImage = abstractC22403o2;
        this.mainImageStyle = enumC30017h;
        this.mainImagePosition = enumC30016g;
        this.dialogInfo = c30011b;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C30011b getDialogInfo() {
        return this.dialogInfo;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC22403o getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final AbstractC22403o getMainImage() {
        return this.mainImage;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30012c)) {
            return false;
        }
        C30012c c30012c = (C30012c) other;
        return AbstractC22676k.m65745e(this.id, c30012c.id) && AbstractC22676k.m65745e(this.title, c30012c.title) && AbstractC22676k.m65745e(this.subtitle, c30012c.subtitle) && AbstractC22676k.m65745e(this.imageUrl, c30012c.imageUrl) && this.icon == c30012c.icon && AbstractC22676k.m65745e(this.mainImage, c30012c.mainImage) && this.mainImageStyle == c30012c.mainImageStyle && this.mainImagePosition == c30012c.mainImagePosition && AbstractC22676k.m65745e(this.dialogInfo, c30012c.dialogInfo);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC30016g getMainImagePosition() {
        return this.mainImagePosition;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final EnumC30017h getMainImageStyle() {
        return this.mainImageStyle;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.id.hashCode() * 31, this.title, 31);
        TextResource textResource = this.subtitle;
        int iHashCode = (iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31;
        AbstractC22403o abstractC22403o = this.imageUrl;
        int iHashCode2 = (iHashCode + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.icon;
        int iHashCode3 = (iHashCode2 + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        AbstractC22403o abstractC22403o2 = this.mainImage;
        int iHashCode4 = (iHashCode3 + (abstractC22403o2 == null ? 0 : abstractC22403o2.hashCode())) * 31;
        EnumC30017h enumC30017h = this.mainImageStyle;
        int iHashCode5 = (iHashCode4 + (enumC30017h == null ? 0 : enumC30017h.hashCode())) * 31;
        EnumC30016g enumC30016g = this.mainImagePosition;
        int iHashCode6 = (iHashCode5 + (enumC30016g == null ? 0 : enumC30016g.hashCode())) * 31;
        C30011b c30011b = this.dialogInfo;
        return iHashCode6 + (c30011b != null ? c30011b.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        AbstractC22403o abstractC22403o = this.imageUrl;
        EnumC16313m0 enumC16313m0 = this.icon;
        AbstractC22403o abstractC22403o2 = this.mainImage;
        EnumC30017h enumC30017h = this.mainImageStyle;
        EnumC30016g enumC30016g = this.mainImagePosition;
        C30011b c30011b = this.dialogInfo;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("HorizontalDividedListItemState(id=", str, ", title=", textResource, ", subtitle=");
        sbM91847q.append(textResource2);
        sbM91847q.append(", imageUrl=");
        sbM91847q.append(abstractC22403o);
        sbM91847q.append(", icon=");
        sbM91847q.append(enumC16313m0);
        sbM91847q.append(", mainImage=");
        sbM91847q.append(abstractC22403o2);
        sbM91847q.append(", mainImageStyle=");
        sbM91847q.append(enumC30017h);
        sbM91847q.append(", mainImagePosition=");
        sbM91847q.append(enumC30016g);
        sbM91847q.append(", dialogInfo=");
        sbM91847q.append(c30011b);
        sbM91847q.append(")");
        return sbM91847q.toString();
    }

    public /* synthetic */ C30012c(String str, TextResource textResource, TextResource textResource2, AbstractC22403o abstractC22403o, EnumC16313m0 enumC16313m0, AbstractC22403o abstractC22403o2, EnumC30017h enumC30017h, EnumC30016g enumC30016g, C30011b c30011b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textResource, (i13 & 4) != 0 ? null : textResource2, (i13 & 8) != 0 ? null : abstractC22403o, (i13 & 16) != 0 ? null : enumC16313m0, (i13 & 32) != 0 ? null : abstractC22403o2, (i13 & 64) != 0 ? null : enumC30017h, (i13 & 128) != 0 ? null : enumC30016g, (i13 & 256) != 0 ? null : c30011b);
    }
}
