package h41;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import l83.C23454a0;
import p031b9.AbstractC2875y;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: h41.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b\u001e\u0010(R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010&\u001a\u0004\b\u001a\u0010(R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010\u001f\u001a\u0004\b,\u0010!¨\u0006-"}, m65681d2 = {"Lh41/c;", "Lm91/u;", "", NotificationCompat.CATEGORY_EVENT, "", "isDiscovery", "Lkd1/o;", "productImage", "Lcom/whoop/design/util/TextResource;", "title", "Lh41/e;", "shoppingTileTagType", "priceWithoutDiscount", "finalPrice", "isWhoopProPrice", "<init>", "(Ljava/lang/Object;ZLkd1/o;Lcom/whoop/design/util/TextResource;Lh41/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getEvent", "()Ljava/lang/Object;", "b", "Z", "g", "()Z", "c", "Lkd1/o;", "()Lkd1/o;", "d", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "e", "Lh41/e;", "()Lh41/e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16849c implements InterfaceC25312u {

    /* JADX INFO: renamed from: i */
    public static final int f64737i = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object event;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isDiscovery;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC22403o productImage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC16851e shoppingTileTagType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource priceWithoutDiscount;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource finalPrice;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean isWhoopProPrice;

    public C16849c(Object event, boolean z4, AbstractC22403o abstractC22403o, TextResource title, AbstractC16851e abstractC16851e, TextResource priceWithoutDiscount, TextResource finalPrice, boolean z13) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(priceWithoutDiscount, "priceWithoutDiscount");
        AbstractC22676k.m65750j(finalPrice, "finalPrice");
        this.event = event;
        this.isDiscovery = z4;
        this.productImage = abstractC22403o;
        this.title = title;
        this.shoppingTileTagType = abstractC16851e;
        this.priceWithoutDiscount = priceWithoutDiscount;
        this.finalPrice = finalPrice;
        this.isWhoopProPrice = z13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getFinalPrice() {
        return this.finalPrice;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getPriceWithoutDiscount() {
        return this.priceWithoutDiscount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC22403o getProductImage() {
        return this.productImage;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final AbstractC16851e getShoppingTileTagType() {
        return this.shoppingTileTagType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16849c)) {
            return false;
        }
        C16849c c16849c = (C16849c) other;
        return AbstractC22676k.m65745e(this.event, c16849c.event) && this.isDiscovery == c16849c.isDiscovery && AbstractC22676k.m65745e(this.productImage, c16849c.productImage) && AbstractC22676k.m65745e(this.title, c16849c.title) && AbstractC22676k.m65745e(this.shoppingTileTagType, c16849c.shoppingTileTagType) && AbstractC22676k.m65745e(this.priceWithoutDiscount, c16849c.priceWithoutDiscount) && AbstractC22676k.m65745e(this.finalPrice, c16849c.finalPrice) && this.isWhoopProPrice == c16849c.isWhoopProPrice;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsDiscovery() {
        return this.isDiscovery;
    }

    @Override // p720m91.InterfaceC25312u
    public Object getEvent() {
        return this.event;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsWhoopProPrice() {
        return this.isWhoopProPrice;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(this.event.hashCode() * 31, 31, this.isDiscovery);
        AbstractC22403o abstractC22403o = this.productImage;
        int iM95625a = AbstractC31061c.m95625a((iM8289b + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31, this.title, 31);
        AbstractC16851e abstractC16851e = this.shoppingTileTagType;
        return Boolean.hashCode(this.isWhoopProPrice) + AbstractC31061c.m95625a(AbstractC31061c.m95625a((iM95625a + (abstractC16851e != null ? abstractC16851e.hashCode() : 0)) * 31, this.priceWithoutDiscount, 31), this.finalPrice, 31);
    }

    public String toString() {
        Object obj = this.event;
        boolean z4 = this.isDiscovery;
        AbstractC22403o abstractC22403o = this.productImage;
        TextResource textResource = this.title;
        AbstractC16851e abstractC16851e = this.shoppingTileTagType;
        TextResource textResource2 = this.priceWithoutDiscount;
        TextResource textResource3 = this.finalPrice;
        boolean z13 = this.isWhoopProPrice;
        StringBuilder sb4 = new StringBuilder("ShoppingTileState(event=");
        sb4.append(obj);
        sb4.append(", isDiscovery=");
        sb4.append(z4);
        sb4.append(", productImage=");
        AbstractC13673n.m38549A(sb4, abstractC22403o, ", title=", textResource, ", shoppingTileTagType=");
        sb4.append(abstractC16851e);
        sb4.append(", priceWithoutDiscount=");
        sb4.append(textResource2);
        sb4.append(", finalPrice=");
        sb4.append(textResource3);
        sb4.append(", isWhoopProPrice=");
        sb4.append(z13);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C16849c(Object obj, boolean z4, AbstractC22403o abstractC22403o, TextResource textResource, AbstractC16851e abstractC16851e, TextResource textResource2, TextResource textResource3, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C23454a0.f92919a : obj, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? null : abstractC22403o, (i13 & 8) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 16) != 0 ? null : abstractC16851e, (i13 & 32) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 64) != 0 ? AbstractC8693b.m21267a() : textResource3, (i13 & 128) != 0 ? false : z13);
    }
}
