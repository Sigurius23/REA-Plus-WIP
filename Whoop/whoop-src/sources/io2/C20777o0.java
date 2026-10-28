package io2;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import nh3.AbstractC26725a;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: io2.o0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J^\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b!\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b \u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b$\u0010-\u001a\u0004\b&\u0010\u0014¨\u0006."}, m65681d2 = {"Lio2/o0;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "placeholder", "applyCtaText", "Lio2/n0;", NotificationCompat.CATEGORY_STATUS, "", "Lio2/p0;", "tags", "", "isExpanded", "", "cartId", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lio2/n0;Ljava/util/List;ZLjava/lang/String;)V", "a", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lio2/n0;Ljava/util/List;ZLjava/lang/String;)Lio2/o0;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "i", "()Lcom/whoop/design/util/TextResource;", "b", "f", "c", "d", "Lio2/n0;", "g", "()Lio2/n0;", "e", "Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ljava/util/List;", "Z", "j", "()Z", "Ljava/lang/String;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20777o0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource placeholder;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource applyCtaText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC20775n0 status;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<C20779p0> tags;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isExpanded;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String cartId;

    public C20777o0(TextResource title, TextResource placeholder, TextResource applyCtaText, AbstractC20775n0 abstractC20775n0, List<C20779p0> tags, boolean z4, String cartId) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(placeholder, "placeholder");
        AbstractC22676k.m65750j(applyCtaText, "applyCtaText");
        AbstractC22676k.m65750j(tags, "tags");
        AbstractC22676k.m65750j(cartId, "cartId");
        this.title = title;
        this.placeholder = placeholder;
        this.applyCtaText = applyCtaText;
        this.status = abstractC20775n0;
        this.tags = tags;
        this.isExpanded = z4;
        this.cartId = cartId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C20777o0 m57244b(C20777o0 c20777o0, TextResource textResource, TextResource textResource2, TextResource textResource3, AbstractC20775n0 abstractC20775n0, List list, boolean z4, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = c20777o0.title;
        }
        if ((i13 & 2) != 0) {
            textResource2 = c20777o0.placeholder;
        }
        if ((i13 & 4) != 0) {
            textResource3 = c20777o0.applyCtaText;
        }
        if ((i13 & 8) != 0) {
            abstractC20775n0 = c20777o0.status;
        }
        if ((i13 & 16) != 0) {
            list = c20777o0.tags;
        }
        if ((i13 & 32) != 0) {
            z4 = c20777o0.isExpanded;
        }
        if ((i13 & 64) != 0) {
            str = c20777o0.cartId;
        }
        boolean z13 = z4;
        String str2 = str;
        List list2 = list;
        TextResource textResource4 = textResource3;
        return c20777o0.m57245a(textResource, textResource2, textResource4, abstractC20775n0, list2, z13, str2);
    }

    /* JADX INFO: renamed from: a */
    public final C20777o0 m57245a(TextResource title, TextResource placeholder, TextResource applyCtaText, AbstractC20775n0 status, List<C20779p0> tags, boolean isExpanded, String cartId) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(placeholder, "placeholder");
        AbstractC22676k.m65750j(applyCtaText, "applyCtaText");
        AbstractC22676k.m65750j(tags, "tags");
        AbstractC22676k.m65750j(cartId, "cartId");
        return new C20777o0(title, placeholder, applyCtaText, status, tags, isExpanded, cartId);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getApplyCtaText() {
        return this.applyCtaText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCartId() {
        return this.cartId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20777o0)) {
            return false;
        }
        C20777o0 c20777o0 = (C20777o0) other;
        return AbstractC22676k.m65745e(this.title, c20777o0.title) && AbstractC22676k.m65745e(this.placeholder, c20777o0.placeholder) && AbstractC22676k.m65745e(this.applyCtaText, c20777o0.applyCtaText) && AbstractC22676k.m65745e(this.status, c20777o0.status) && AbstractC22676k.m65745e(this.tags, c20777o0.tags) && this.isExpanded == c20777o0.isExpanded && AbstractC22676k.m65745e(this.cartId, c20777o0.cartId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getPlaceholder() {
        return this.placeholder;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final AbstractC20775n0 getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: h */
    public final List<C20779p0> m57250h() {
        return this.tags;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.placeholder, 31), this.applyCtaText, 31);
        AbstractC20775n0 abstractC20775n0 = this.status;
        return this.cartId.hashCode() + AbstractC2875y.m8289b(AbstractC11895b.m31983b((iM95625a + (abstractC20775n0 == null ? 0 : abstractC20775n0.hashCode())) * 31, 31, this.tags), 31, this.isExpanded);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.placeholder;
        TextResource textResource3 = this.applyCtaText;
        AbstractC20775n0 abstractC20775n0 = this.status;
        List<C20779p0> list = this.tags;
        boolean z4 = this.isExpanded;
        String str = this.cartId;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("PromoCodeInputViewState(title=", textResource, ", placeholder=", textResource2, ", applyCtaText=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", status=");
        sbM106658q.append(abstractC20775n0);
        sbM106658q.append(", tags=");
        AbstractC26725a.m79512p(", isExpanded=", ", cartId=", sbM106658q, list, z4);
        return AbstractC25012a.m73376i(str, ")", sbM106658q);
    }
}
