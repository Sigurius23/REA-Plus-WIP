package uz1;

import com.whoop.navigation.C9598e;
import kd1.AbstractC22403o;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: uz1.u */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001d\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u0016\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b\u001a\u0010 ¨\u0006!"}, m65681d2 = {"Luz1/u;", "Lm91/u;", "Lkd1/o;", "image", "", "title", "internalName", "analyticsValue", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Lkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/o;", "c", "()Lkd1/o;", "b", "Ljava/lang/String;", "e", "getInternalName", "d", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35443u implements InterfaceC25312u {

    /* JADX INFO: renamed from: f */
    public static final int f150940f = C9598e.f28134d | AbstractC22403o.f87638a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String internalName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String analyticsValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C9598e destination;

    public C35443u(AbstractC22403o image, String title, String str, String str2, C9598e c9598e) {
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(title, "title");
        this.image = image;
        this.title = title;
        this.internalName = str;
        this.analyticsValue = str2;
        this.destination = c9598e;
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
    public final AbstractC22403o getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35443u)) {
            return false;
        }
        C35443u c35443u = (C35443u) other;
        return AbstractC22676k.m65745e(this.image, c35443u.image) && AbstractC22676k.m65745e(this.title, c35443u.title) && AbstractC22676k.m65745e(this.internalName, c35443u.internalName) && AbstractC22676k.m65745e(this.analyticsValue, c35443u.analyticsValue) && AbstractC22676k.m65745e(this.destination, c35443u.destination);
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.image.hashCode() * 31, 31, this.title);
        String str = this.internalName;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.analyticsValue;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        C9598e c9598e = this.destination;
        return iHashCode2 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        AbstractC22403o abstractC22403o = this.image;
        String str = this.title;
        String str2 = this.internalName;
        String str3 = this.analyticsValue;
        C9598e c9598e = this.destination;
        StringBuilder sb4 = new StringBuilder("ShopCategoryTileState(image=");
        sb4.append(abstractC22403o);
        sb4.append(", title=");
        sb4.append(str);
        sb4.append(", internalName=");
        AbstractC11266d.m30444B(sb4, str2, ", analyticsValue=", str3, ", destination=");
        return AbstractC33745d.m106656o(sb4, c9598e, ")");
    }
}
