package h02;

import com.whoop.navigation.C9598e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: h02.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJb\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001e\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b$\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b\"\u0010&¨\u0006'"}, m65681d2 = {"Lh02/c;", "Lm91/u;", "", "packItemId", "productKey", "imageUrl", "title", "subtitle", "ctaText", "trailingIcon", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)Lh02/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "g", "b", "getProductKey", "c", "f", "d", "i", "e", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "j", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16564c implements InterfaceC25312u {

    /* JADX INFO: renamed from: i */
    public static final int f63767i = C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String packItemId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String productKey;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String imageUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String ctaText;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String trailingIcon;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C9598e destination;

    public C16564c(String packItemId, String productKey, String imageUrl, String title, String subtitle, String ctaText, String str, C9598e destination) {
        AbstractC22676k.m65750j(packItemId, "packItemId");
        AbstractC22676k.m65750j(productKey, "productKey");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        AbstractC22676k.m65750j(destination, "destination");
        this.packItemId = packItemId;
        this.productKey = productKey;
        this.imageUrl = imageUrl;
        this.title = title;
        this.subtitle = subtitle;
        this.ctaText = ctaText;
        this.trailingIcon = str;
        this.destination = destination;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C16564c m46923b(C16564c c16564c, String str, String str2, String str3, String str4, String str5, String str6, String str7, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c16564c.packItemId;
        }
        if ((i13 & 2) != 0) {
            str2 = c16564c.productKey;
        }
        if ((i13 & 4) != 0) {
            str3 = c16564c.imageUrl;
        }
        if ((i13 & 8) != 0) {
            str4 = c16564c.title;
        }
        if ((i13 & 16) != 0) {
            str5 = c16564c.subtitle;
        }
        if ((i13 & 32) != 0) {
            str6 = c16564c.ctaText;
        }
        if ((i13 & 64) != 0) {
            str7 = c16564c.trailingIcon;
        }
        if ((i13 & 128) != 0) {
            c9598e = c16564c.destination;
        }
        String str8 = str7;
        C9598e c9598e2 = c9598e;
        String str9 = str5;
        String str10 = str6;
        return c16564c.m46924a(str, str2, str3, str4, str9, str10, str8, c9598e2);
    }

    /* JADX INFO: renamed from: a */
    public final C16564c m46924a(String packItemId, String productKey, String imageUrl, String title, String subtitle, String ctaText, String trailingIcon, C9598e destination) {
        AbstractC22676k.m65750j(packItemId, "packItemId");
        AbstractC22676k.m65750j(productKey, "productKey");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        AbstractC22676k.m65750j(destination, "destination");
        return new C16564c(packItemId, productKey, imageUrl, title, subtitle, ctaText, trailingIcon, destination);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16564c)) {
            return false;
        }
        C16564c c16564c = (C16564c) other;
        return AbstractC22676k.m65745e(this.packItemId, c16564c.packItemId) && AbstractC22676k.m65745e(this.productKey, c16564c.productKey) && AbstractC22676k.m65745e(this.imageUrl, c16564c.imageUrl) && AbstractC22676k.m65745e(this.title, c16564c.title) && AbstractC22676k.m65745e(this.subtitle, c16564c.subtitle) && AbstractC22676k.m65745e(this.ctaText, c16564c.ctaText) && AbstractC22676k.m65745e(this.trailingIcon, c16564c.trailingIcon) && AbstractC22676k.m65745e(this.destination, c16564c.destination);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPackItemId() {
        return this.packItemId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.packItemId.hashCode() * 31, 31, this.productKey), 31, this.imageUrl), 31, this.title), 31, this.subtitle), 31, this.ctaText);
        String str = this.trailingIcon;
        return this.destination.hashCode() + ((iM30450d + (str == null ? 0 : str.hashCode())) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTrailingIcon() {
        return this.trailingIcon;
    }

    public String toString() {
        String str = this.packItemId;
        String str2 = this.productKey;
        String str3 = this.imageUrl;
        String str4 = this.title;
        String str5 = this.subtitle;
        String str6 = this.ctaText;
        String str7 = this.trailingIcon;
        C9598e c9598e = this.destination;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PackItemState(packItemId=", str, ", productKey=", str2, ", imageUrl=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", title=", str4, ", subtitle=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", ctaText=", str6, ", trailingIcon=");
        return AbstractC13673n.m38563j(sbM32001t, str7, ", destination=", c9598e, ")");
    }
}
