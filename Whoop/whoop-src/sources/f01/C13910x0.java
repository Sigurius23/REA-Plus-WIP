package f01;

import java.util.List;
import kd1.AbstractC22403o;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import v41.InterfaceC35689r0;

/* JADX INFO: renamed from: f01.x0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b#\u0010\u000fR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b\u0018\u0010%¨\u0006&"}, m65681d2 = {"Lf01/x0;", "Lm91/u;", "", "id", "Lkd1/o;", "heroImage", "Lv41/r0;", "lottie", "title", "subtitle", "", "footerItems", "<init>", "(Ljava/lang/String;Lkd1/o;Lv41/r0;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lkd1/o;", "()Lkd1/o;", "c", "Lv41/r0;", "()Lv41/r0;", "d", "f", "e", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13910x0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC22403o heroImage;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC35689r0 lottie;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<InterfaceC25312u> footerItems;

    /* JADX WARN: Multi-variable type inference failed */
    public C13910x0(String str, AbstractC22403o abstractC22403o, InterfaceC35689r0 interfaceC35689r0, String str2, String str3, List<? extends InterfaceC25312u> footerItems) {
        AbstractC22676k.m65750j(footerItems, "footerItems");
        this.id = str;
        this.heroImage = abstractC22403o;
        this.lottie = interfaceC35689r0;
        this.title = str2;
        this.subtitle = str3;
        this.footerItems = footerItems;
    }

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC25312u> m39615a() {
        return this.footerItems;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC22403o getHeroImage() {
        return this.heroImage;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC35689r0 getLottie() {
        return this.lottie;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13910x0)) {
            return false;
        }
        C13910x0 c13910x0 = (C13910x0) other;
        return AbstractC22676k.m65745e(this.id, c13910x0.id) && AbstractC22676k.m65745e(this.heroImage, c13910x0.heroImage) && AbstractC22676k.m65745e(this.lottie, c13910x0.lottie) && AbstractC22676k.m65745e(this.title, c13910x0.title) && AbstractC22676k.m65745e(this.subtitle, c13910x0.subtitle) && AbstractC22676k.m65745e(this.footerItems, c13910x0.footerItems);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AbstractC22403o abstractC22403o = this.heroImage;
        int iHashCode2 = (iHashCode + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31;
        InterfaceC35689r0 interfaceC35689r0 = this.lottie;
        int iHashCode3 = (iHashCode2 + (interfaceC35689r0 == null ? 0 : interfaceC35689r0.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        return this.footerItems.hashCode() + ((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.id;
        AbstractC22403o abstractC22403o = this.heroImage;
        InterfaceC35689r0 interfaceC35689r0 = this.lottie;
        String str2 = this.title;
        String str3 = this.subtitle;
        List<InterfaceC25312u> list = this.footerItems;
        StringBuilder sb4 = new StringBuilder("HeroWithFooterCtaViewState(id=");
        sb4.append(str);
        sb4.append(", heroImage=");
        sb4.append(abstractC22403o);
        sb4.append(", lottie=");
        sb4.append(interfaceC35689r0);
        sb4.append(", title=");
        sb4.append(str2);
        sb4.append(", subtitle=");
        return AbstractC30007c.m91840j(str3, ", footerItems=", ")", sb4, list);
    }

    public /* synthetic */ C13910x0(String str, AbstractC22403o abstractC22403o, InterfaceC35689r0 interfaceC35689r0, String str2, String str3, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : abstractC22403o, (i13 & 4) != 0 ? null : interfaceC35689r0, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? null : str3, (i13 & 32) != 0 ? C25271y.f99162w : list);
    }
}
