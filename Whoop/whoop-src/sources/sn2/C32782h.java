package sn2;

import hc3.AbstractC17176i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: sn2.h */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u000fR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u000fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b!\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b\u001f\u0010\u000f¨\u0006\""}, m65681d2 = {"Lsn2/h;", "", "", "sku", "packSku", "", "childItemSkus", "wywSku", "bandSku", "claspSku", "hookSku", "fastLinkSku", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "g", "b", "f", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "e", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32782h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String sku;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String packSku;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<String> childItemSkus;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String wywSku;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String bandSku;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String claspSku;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String hookSku;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String fastLinkSku;

    public C32782h(String str, String str2, List<String> list, String str3, String str4, String str5, String str6, String str7) {
        this.sku = str;
        this.packSku = str2;
        this.childItemSkus = list;
        this.wywSku = str3;
        this.bandSku = str4;
        this.claspSku = str5;
        this.hookSku = str6;
        this.fastLinkSku = str7;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBandSku() {
        return this.bandSku;
    }

    /* JADX INFO: renamed from: b */
    public final List<String> m102830b() {
        return this.childItemSkus;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getClaspSku() {
        return this.claspSku;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getFastLinkSku() {
        return this.fastLinkSku;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getHookSku() {
        return this.hookSku;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32782h)) {
            return false;
        }
        C32782h c32782h = (C32782h) other;
        return AbstractC22676k.m65745e(this.sku, c32782h.sku) && AbstractC22676k.m65745e(this.packSku, c32782h.packSku) && AbstractC22676k.m65745e(this.childItemSkus, c32782h.childItemSkus) && AbstractC22676k.m65745e(this.wywSku, c32782h.wywSku) && AbstractC22676k.m65745e(this.bandSku, c32782h.bandSku) && AbstractC22676k.m65745e(this.claspSku, c32782h.claspSku) && AbstractC22676k.m65745e(this.hookSku, c32782h.hookSku) && AbstractC22676k.m65745e(this.fastLinkSku, c32782h.fastLinkSku);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPackSku() {
        return this.packSku;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getWywSku() {
        return this.wywSku;
    }

    public int hashCode() {
        String str = this.sku;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.packSku;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.childItemSkus;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.wywSku;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bandSku;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.claspSku;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.hookSku;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.fastLinkSku;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        String str = this.sku;
        String str2 = this.packSku;
        List<String> list = this.childItemSkus;
        String str3 = this.wywSku;
        String str4 = this.bandSku;
        String str5 = this.claspSku;
        String str6 = this.hookSku;
        String str7 = this.fastLinkSku;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("BuyNowSelection(sku=", str, ", packSku=", str2, ", childItemSkus=");
        AbstractC17176i.m48511m(", wywSku=", str3, ", bandSku=", sbM32001t, list);
        AbstractC11266d.m30444B(sbM32001t, str4, ", claspSku=", str5, ", hookSku=");
        return AbstractC11266d.m30464r(sbM32001t, str6, ", fastLinkSku=", str7, ")");
    }

    public /* synthetic */ C32782h(String str, String str2, List list, String str3, String str4, String str5, String str6, String str7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : list, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : str4, (i13 & 32) != 0 ? null : str5, (i13 & 64) != 0 ? null : str6, (i13 & 128) != 0 ? null : str7);
    }
}
