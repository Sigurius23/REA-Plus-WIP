package h02;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: h02.s */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ<\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u0019\u0010\f¨\u0006\u001c"}, m65681d2 = {"Lh02/s;", "Lm91/u;", "", "title", "price", "salePrice", "color", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lh02/s;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "g", "b", "e", "c", "f", "d", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16595s implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String price;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String salePrice;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String color;

    public C16595s(String title, String price, String str, String str2) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(price, "price");
        this.title = title;
        this.price = price;
        this.salePrice = str;
        this.color = str2;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C16595s m47096b(C16595s c16595s, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c16595s.title;
        }
        if ((i13 & 2) != 0) {
            str2 = c16595s.price;
        }
        if ((i13 & 4) != 0) {
            str3 = c16595s.salePrice;
        }
        if ((i13 & 8) != 0) {
            str4 = c16595s.color;
        }
        return c16595s.m47097a(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: a */
    public final C16595s m47097a(String title, String price, String salePrice, String color) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(price, "price");
        return new C16595s(title, price, salePrice, color);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16595s)) {
            return false;
        }
        C16595s c16595s = (C16595s) other;
        return AbstractC22676k.m65745e(this.title, c16595s.title) && AbstractC22676k.m65745e(this.price, c16595s.price) && AbstractC22676k.m65745e(this.salePrice, c16595s.salePrice) && AbstractC22676k.m65745e(this.color, c16595s.color);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSalePrice() {
        return this.salePrice;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.price);
        String str = this.salePrice;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.color;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.price;
        return AbstractC11266d.m30464r(AbstractC11895b.m32001t("ProductDescriptionHeaderState(title=", str, ", price=", str2, ", salePrice="), this.salePrice, ", color=", this.color, ")");
    }
}
