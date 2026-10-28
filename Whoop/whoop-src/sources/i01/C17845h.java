package i01;

import com.whoop.design.util.TextResource;
import com.whoop.whoopaction.domain.models.Action;
import hy0.C17750h1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: i01.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0098\u0001\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010#\u001a\u0004\b$\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b1\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b2\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b.\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b,\u0010(R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b2\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b7\u00109\u001a\u0004\b)\u0010:R\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b4\u0010;\u001a\u0004\b0\u0010<¨\u0006="}, m65681d2 = {"Li01/h;", "Lm91/u;", "", "id", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "priceLabel", "Li01/a;", "priceLabelSize", "priceSubLabel", "priceSubLabelMarkdown", "Lhy0/h1;", "tag", "description", "Li01/i;", "style", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "", "features", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Li01/a;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lhy0/h1;Lcom/whoop/design/util/TextResource;Li01/i;Lcom/whoop/whoopaction/domain/models/Action;Ljava/util/List;)V", "a", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Li01/a;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lhy0/h1;Lcom/whoop/design/util/TextResource;Li01/i;Lcom/whoop/whoopaction/domain/models/Action;Ljava/util/List;)Li01/h;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", "Lcom/whoop/design/util/TextResource;", "m", "()Lcom/whoop/design/util/TextResource;", "c", "d", "g", "e", "Li01/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Li01/a;", "f", "i", "j", "Lhy0/h1;", "l", "()Lhy0/h1;", "Li01/i;", "k", "()Li01/i;", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17845h implements InterfaceC25312u {

    /* JADX INFO: renamed from: m */
    public static final int f69378m = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource priceLabel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC17838a priceLabelSize;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource priceSubLabel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String priceSubLabelMarkdown;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C17750h1 tag;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final TextResource description;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final EnumC17846i style;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final Action action;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final List<C17750h1> features;

    public C17845h(String str, TextResource title, TextResource subtitle, TextResource priceLabel, EnumC17838a priceLabelSize, TextResource priceSubLabel, String str2, C17750h1 c17750h1, TextResource description, EnumC17846i style, Action action, List<C17750h1> list) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(priceLabel, "priceLabel");
        AbstractC22676k.m65750j(priceLabelSize, "priceLabelSize");
        AbstractC22676k.m65750j(priceSubLabel, "priceSubLabel");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(style, "style");
        this.id = str;
        this.title = title;
        this.subtitle = subtitle;
        this.priceLabel = priceLabel;
        this.priceLabelSize = priceLabelSize;
        this.priceSubLabel = priceSubLabel;
        this.priceSubLabelMarkdown = str2;
        this.tag = c17750h1;
        this.description = description;
        this.style = style;
        this.action = action;
        this.features = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C17845h m51308b(C17845h c17845h, String str, TextResource textResource, TextResource textResource2, TextResource textResource3, EnumC17838a enumC17838a, TextResource textResource4, String str2, C17750h1 c17750h1, TextResource textResource5, EnumC17846i enumC17846i, Action action, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c17845h.id;
        }
        if ((i13 & 2) != 0) {
            textResource = c17845h.title;
        }
        if ((i13 & 4) != 0) {
            textResource2 = c17845h.subtitle;
        }
        if ((i13 & 8) != 0) {
            textResource3 = c17845h.priceLabel;
        }
        if ((i13 & 16) != 0) {
            enumC17838a = c17845h.priceLabelSize;
        }
        if ((i13 & 32) != 0) {
            textResource4 = c17845h.priceSubLabel;
        }
        if ((i13 & 64) != 0) {
            str2 = c17845h.priceSubLabelMarkdown;
        }
        if ((i13 & 128) != 0) {
            c17750h1 = c17845h.tag;
        }
        if ((i13 & 256) != 0) {
            textResource5 = c17845h.description;
        }
        if ((i13 & 512) != 0) {
            enumC17846i = c17845h.style;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            action = c17845h.action;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            list = c17845h.features;
        }
        Action action2 = action;
        List list2 = list;
        TextResource textResource6 = textResource5;
        EnumC17846i enumC17846i2 = enumC17846i;
        String str3 = str2;
        C17750h1 c17750h2 = c17750h1;
        EnumC17838a enumC17838a2 = enumC17838a;
        TextResource textResource7 = textResource4;
        return c17845h.m51309a(str, textResource, textResource2, textResource3, enumC17838a2, textResource7, str3, c17750h2, textResource6, enumC17846i2, action2, list2);
    }

    /* JADX INFO: renamed from: a */
    public final C17845h m51309a(String id4, TextResource title, TextResource subtitle, TextResource priceLabel, EnumC17838a priceLabelSize, TextResource priceSubLabel, String priceSubLabelMarkdown, C17750h1 tag, TextResource description, EnumC17846i style, Action action, List<C17750h1> features) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(priceLabel, "priceLabel");
        AbstractC22676k.m65750j(priceLabelSize, "priceLabelSize");
        AbstractC22676k.m65750j(priceSubLabel, "priceSubLabel");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(style, "style");
        return new C17845h(id4, title, subtitle, priceLabel, priceLabelSize, priceSubLabel, priceSubLabelMarkdown, tag, description, style, action, features);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getDescription() {
        return this.description;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17845h)) {
            return false;
        }
        C17845h c17845h = (C17845h) other;
        return AbstractC22676k.m65745e(this.id, c17845h.id) && AbstractC22676k.m65745e(this.title, c17845h.title) && AbstractC22676k.m65745e(this.subtitle, c17845h.subtitle) && AbstractC22676k.m65745e(this.priceLabel, c17845h.priceLabel) && this.priceLabelSize == c17845h.priceLabelSize && AbstractC22676k.m65745e(this.priceSubLabel, c17845h.priceSubLabel) && AbstractC22676k.m65745e(this.priceSubLabelMarkdown, c17845h.priceSubLabelMarkdown) && AbstractC22676k.m65745e(this.tag, c17845h.tag) && AbstractC22676k.m65745e(this.description, c17845h.description) && this.style == c17845h.style && AbstractC22676k.m65745e(this.action, c17845h.action) && AbstractC22676k.m65745e(this.features, c17845h.features);
    }

    /* JADX INFO: renamed from: f */
    public final List<C17750h1> m51313f() {
        return this.features;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getPriceLabel() {
        return this.priceLabel;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC17838a getPriceLabelSize() {
        return this.priceLabelSize;
    }

    public int hashCode() {
        String str = this.id;
        int iM95625a = AbstractC31061c.m95625a((this.priceLabelSize.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a((str == null ? 0 : str.hashCode()) * 31, this.title, 31), this.subtitle, 31), this.priceLabel, 31)) * 31, this.priceSubLabel, 31);
        String str2 = this.priceSubLabelMarkdown;
        int iHashCode = (iM95625a + (str2 == null ? 0 : str2.hashCode())) * 31;
        C17750h1 c17750h1 = this.tag;
        int iHashCode2 = (this.style.hashCode() + AbstractC31061c.m95625a((iHashCode + (c17750h1 == null ? 0 : c17750h1.hashCode())) * 31, this.description, 31)) * 31;
        Action action = this.action;
        int iHashCode3 = (iHashCode2 + (action == null ? 0 : action.hashCode())) * 31;
        List<C17750h1> list = this.features;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getPriceSubLabel() {
        return this.priceSubLabel;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getPriceSubLabelMarkdown() {
        return this.priceSubLabelMarkdown;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final EnumC17846i getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final C17750h1 getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        TextResource textResource3 = this.priceLabel;
        EnumC17838a enumC17838a = this.priceLabelSize;
        TextResource textResource4 = this.priceSubLabel;
        String str2 = this.priceSubLabelMarkdown;
        C17750h1 c17750h1 = this.tag;
        TextResource textResource5 = this.description;
        EnumC17846i enumC17846i = this.style;
        Action action = this.action;
        List<C17750h1> list = this.features;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("PricingSelectionCardState(id=", str, ", title=", textResource, ", subtitle=");
        AbstractC30007c.m91855y(sbM91847q, textResource2, ", priceLabel=", textResource3, ", priceLabelSize=");
        sbM91847q.append(enumC17838a);
        sbM91847q.append(", priceSubLabel=");
        sbM91847q.append(textResource4);
        sbM91847q.append(", priceSubLabelMarkdown=");
        sbM91847q.append(str2);
        sbM91847q.append(", tag=");
        sbM91847q.append(c17750h1);
        sbM91847q.append(", description=");
        sbM91847q.append(textResource5);
        sbM91847q.append(", style=");
        sbM91847q.append(enumC17846i);
        sbM91847q.append(", action=");
        sbM91847q.append(action);
        sbM91847q.append(", features=");
        sbM91847q.append(list);
        sbM91847q.append(")");
        return sbM91847q.toString();
    }

    public /* synthetic */ C17845h(String str, TextResource textResource, TextResource textResource2, TextResource textResource3, EnumC17838a enumC17838a, TextResource textResource4, String str2, C17750h1 c17750h1, TextResource textResource5, EnumC17846i enumC17846i, Action action, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textResource, textResource2, textResource3, (i13 & 16) != 0 ? EnumC17838a.LARGE : enumC17838a, textResource4, (i13 & 64) != 0 ? null : str2, c17750h1, textResource5, enumC17846i, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : action, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : list);
    }
}
