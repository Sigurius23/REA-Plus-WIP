package tz1;

import com.whoop.nativestore.home.domain.model.ShopProductTagType;
import com.whoop.navigation.C9598e;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: tz1.l */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b$\u0010\u000f¨\u0006%"}, m65681d2 = {"Ltz1/l;", "", "Lcom/whoop/navigation/e;", "destination", "", "analyticsValue", "", "index", "Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;", "tagType", "sku", "category", "<init>", "(Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "b", "()Lcom/whoop/navigation/e;", "Ljava/lang/String;", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "d", "Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;", "()Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;", "e", "getSku", "f", "getCategory", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34290l {

    /* JADX INFO: renamed from: g */
    public static final int f144018g = C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String analyticsValue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Integer index;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ShopProductTagType tagType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String sku;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String category;

    public C34290l(C9598e destination, String analyticsValue, Integer num, ShopProductTagType shopProductTagType, String str, String str2) {
        AbstractC22676k.m65750j(destination, "destination");
        AbstractC22676k.m65750j(analyticsValue, "analyticsValue");
        this.destination = destination;
        this.analyticsValue = analyticsValue;
        this.index = num;
        this.tagType = shopProductTagType;
        this.sku = str;
        this.category = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAnalyticsValue() {
        return this.analyticsValue;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ShopProductTagType getTagType() {
        return this.tagType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34290l)) {
            return false;
        }
        C34290l c34290l = (C34290l) other;
        return AbstractC22676k.m65745e(this.destination, c34290l.destination) && AbstractC22676k.m65745e(this.analyticsValue, c34290l.analyticsValue) && AbstractC22676k.m65745e(this.index, c34290l.index) && this.tagType == c34290l.tagType && AbstractC22676k.m65745e(this.sku, c34290l.sku) && AbstractC22676k.m65745e(this.category, c34290l.category);
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.destination.hashCode() * 31, 31, this.analyticsValue);
        Integer num = this.index;
        int iHashCode = (iM30450d + (num == null ? 0 : num.hashCode())) * 31;
        ShopProductTagType shopProductTagType = this.tagType;
        int iHashCode2 = (iHashCode + (shopProductTagType == null ? 0 : shopProductTagType.hashCode())) * 31;
        String str = this.sku;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.category;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        C9598e c9598e = this.destination;
        String str = this.analyticsValue;
        Integer num = this.index;
        ShopProductTagType shopProductTagType = this.tagType;
        String str2 = this.sku;
        String str3 = this.category;
        StringBuilder sb4 = new StringBuilder("ShopProductTileClickEvent(destination=");
        sb4.append(c9598e);
        sb4.append(", analyticsValue=");
        sb4.append(str);
        sb4.append(", index=");
        sb4.append(num);
        sb4.append(", tagType=");
        sb4.append(shopProductTagType);
        sb4.append(", sku=");
        return AbstractC11266d.m30464r(sb4, str2, ", category=", str3, ")");
    }
}
