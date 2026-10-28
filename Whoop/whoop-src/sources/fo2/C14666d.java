package fo2;

import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import kd1.AbstractC22403o;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: fo2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J¨\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b&\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\"\u001a\u0004\b/\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b0\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u001dR\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b5\u0010\u001dR\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b4\u0010\u001dR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b/\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b3\u00106\u001a\u0004\b.\u00108R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b,\u00109\u001a\u0004\b1\u0010\u001bR\u0017\u0010\u0014\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b0\u00109\u001a\u0004\b'\u0010\u001bR\u0017\u0010\u0015\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b#\u00106\u001a\u0004\b:\u00108¨\u0006;"}, m65681d2 = {"Lfo2/d;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "Lkd1/o;", "image", "", "stackedImages", "price", "strikethroughPrice", "", "quantity", "minQuantity", "maxQuantity", "", "isNotEditable", "hideQuantity", "", "lineItemId", "analyticsLabel", "isUpdating", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIIZZLjava/lang/String;Ljava/lang/String;Z)V", "a", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIIZZLjava/lang/String;Ljava/lang/String;Z)Lfo2/d;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "n", "()Lcom/whoop/design/util/TextResource;", "b", "d", "c", "Lkd1/o;", "f", "()Lkd1/o;", "Ljava/util/List;", "l", "()Ljava/util/List;", "e", "j", "m", "g", "I", "k", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "Z", "o", "()Z", "Ljava/lang/String;", "p", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14666d implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<AbstractC22403o> stackedImages;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource price;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource strikethroughPrice;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int quantity;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int minQuantity;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int maxQuantity;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean isNotEditable;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean hideQuantity;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final String lineItemId;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final String analyticsLabel;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final boolean isUpdating;

    /* JADX WARN: Multi-variable type inference failed */
    public C14666d(TextResource title, TextResource subtitle, AbstractC22403o abstractC22403o, List<? extends AbstractC22403o> list, TextResource price, TextResource textResource, int i13, int i14, int i15, boolean z4, boolean z13, String lineItemId, String analyticsLabel, boolean z14) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(price, "price");
        AbstractC22676k.m65750j(lineItemId, "lineItemId");
        AbstractC22676k.m65750j(analyticsLabel, "analyticsLabel");
        this.title = title;
        this.subtitle = subtitle;
        this.image = abstractC22403o;
        this.stackedImages = list;
        this.price = price;
        this.strikethroughPrice = textResource;
        this.quantity = i13;
        this.minQuantity = i14;
        this.maxQuantity = i15;
        this.isNotEditable = z4;
        this.hideQuantity = z13;
        this.lineItemId = lineItemId;
        this.analyticsLabel = analyticsLabel;
        this.isUpdating = z14;
    }

    /* JADX INFO: renamed from: a */
    public final C14666d m41906a(TextResource title, TextResource subtitle, AbstractC22403o image, List<? extends AbstractC22403o> stackedImages, TextResource price, TextResource strikethroughPrice, int quantity, int minQuantity, int maxQuantity, boolean isNotEditable, boolean hideQuantity, String lineItemId, String analyticsLabel, boolean isUpdating) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(price, "price");
        AbstractC22676k.m65750j(lineItemId, "lineItemId");
        AbstractC22676k.m65750j(analyticsLabel, "analyticsLabel");
        return new C14666d(title, subtitle, image, stackedImages, price, strikethroughPrice, quantity, minQuantity, maxQuantity, isNotEditable, hideQuantity, lineItemId, analyticsLabel, isUpdating);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAnalyticsLabel() {
        return this.analyticsLabel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getHideQuantity() {
        return this.hideQuantity;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14666d)) {
            return false;
        }
        C14666d c14666d = (C14666d) other;
        return AbstractC22676k.m65745e(this.title, c14666d.title) && AbstractC22676k.m65745e(this.subtitle, c14666d.subtitle) && AbstractC22676k.m65745e(this.image, c14666d.image) && AbstractC22676k.m65745e(this.stackedImages, c14666d.stackedImages) && AbstractC22676k.m65745e(this.price, c14666d.price) && AbstractC22676k.m65745e(this.strikethroughPrice, c14666d.strikethroughPrice) && this.quantity == c14666d.quantity && this.minQuantity == c14666d.minQuantity && this.maxQuantity == c14666d.maxQuantity && this.isNotEditable == c14666d.isNotEditable && this.hideQuantity == c14666d.hideQuantity && AbstractC22676k.m65745e(this.lineItemId, c14666d.lineItemId) && AbstractC22676k.m65745e(this.analyticsLabel, c14666d.analyticsLabel) && this.isUpdating == c14666d.isUpdating;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getLineItemId() {
        return this.lineItemId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getMaxQuantity() {
        return this.maxQuantity;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.title.hashCode() * 31, this.subtitle, 31);
        AbstractC22403o abstractC22403o = this.image;
        int iHashCode = (iM95625a + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31;
        List<AbstractC22403o> list = this.stackedImages;
        int iM95625a2 = AbstractC31061c.m95625a((iHashCode + (list == null ? 0 : list.hashCode())) * 31, this.price, 31);
        TextResource textResource = this.strikethroughPrice;
        return Boolean.hashCode(this.isUpdating) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.maxQuantity, AbstractC11266d.m30448b(this.minQuantity, AbstractC11266d.m30448b(this.quantity, (iM95625a2 + (textResource != null ? textResource.hashCode() : 0)) * 31, 31), 31), 31), 31, this.isNotEditable), 31, this.hideQuantity), 31, this.lineItemId), 31, this.analyticsLabel);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getMinQuantity() {
        return this.minQuantity;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextResource getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    /* JADX INFO: renamed from: l */
    public final List<AbstractC22403o> m41916l() {
        return this.stackedImages;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final TextResource getStrikethroughPrice() {
        return this.strikethroughPrice;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getIsNotEditable() {
        return this.isNotEditable;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getIsUpdating() {
        return this.isUpdating;
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        AbstractC22403o abstractC22403o = this.image;
        List<AbstractC22403o> list = this.stackedImages;
        TextResource textResource3 = this.price;
        TextResource textResource4 = this.strikethroughPrice;
        int i13 = this.quantity;
        int i14 = this.minQuantity;
        int i15 = this.maxQuantity;
        boolean z4 = this.isNotEditable;
        boolean z13 = this.hideQuantity;
        String str = this.lineItemId;
        String str2 = this.analyticsLabel;
        boolean z14 = this.isUpdating;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("CartItemViewState(title=", textResource, ", subtitle=", textResource2, ", image=");
        sbM106658q.append(abstractC22403o);
        sbM106658q.append(", stackedImages=");
        sbM106658q.append(list);
        sbM106658q.append(", price=");
        AbstractC30007c.m91855y(sbM106658q, textResource3, ", strikethroughPrice=", textResource4, ", quantity=");
        AbstractC30802r.m94773v(sbM106658q, i13, ", minQuantity=", i14, ", maxQuantity=");
        AbstractC13673n.m38573t(i15, ", isNotEditable=", ", hideQuantity=", sbM106658q, z4);
        AbstractC38963t7.m124391u(sbM106658q, z13, ", lineItemId=", str, ", analyticsLabel=");
        return AbstractC21702c.m61137h(sbM106658q, str2, ", isUpdating=", z14, ")");
    }

    public /* synthetic */ C14666d(TextResource textResource, TextResource textResource2, AbstractC22403o abstractC22403o, List list, TextResource textResource3, TextResource textResource4, int i13, int i14, int i15, boolean z4, boolean z13, String str, String str2, boolean z14, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, textResource2, abstractC22403o, (i16 & 8) != 0 ? null : list, textResource3, (i16 & 32) != 0 ? null : textResource4, i13, (i16 & 128) != 0 ? 0 : i14, i15, (i16 & 512) != 0 ? false : z4, (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? false : z13, str, (i16 & 4096) != 0 ? "" : str2, (i16 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? false : z14);
    }
}
