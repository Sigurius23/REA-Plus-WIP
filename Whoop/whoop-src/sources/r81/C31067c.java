package r81;

import com.whoop.design.util.TextResource;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: r81.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001b\u0010#¨\u0006$"}, m65681d2 = {"Lr81/c;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "ctaTile", "Lr81/d;", "whoopProCta", "", "Lr81/e;", "perks", "<init>", "(Lcom/whoop/design/util/TextResource;Lm91/u;Lr81/d;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Lm91/u;", "()Lm91/u;", "Lr81/d;", "e", "()Lr81/d;", "d", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31067c implements InterfaceC25312u {

    /* JADX INFO: renamed from: e */
    public static final int f128084e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC25312u ctaTile;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C31068d whoopProCta;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C31069e> perks;

    public C31067c(TextResource title, InterfaceC25312u interfaceC25312u, C31068d c31068d, List<C31069e> perks) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(perks, "perks");
        this.title = title;
        this.ctaTile = interfaceC25312u;
        this.whoopProCta = c31068d;
        this.perks = perks;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC25312u getCtaTile() {
        return this.ctaTile;
    }

    /* JADX INFO: renamed from: b */
    public final List<C31069e> m95702b() {
        return this.perks;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C31068d getWhoopProCta() {
        return this.whoopProCta;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31067c)) {
            return false;
        }
        C31067c c31067c = (C31067c) other;
        return AbstractC22676k.m65745e(this.title, c31067c.title) && AbstractC22676k.m65745e(this.ctaTile, c31067c.ctaTile) && AbstractC22676k.m65745e(this.whoopProCta, c31067c.whoopProCta) && AbstractC22676k.m65745e(this.perks, c31067c.perks);
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        InterfaceC25312u interfaceC25312u = this.ctaTile;
        int iHashCode2 = (iHashCode + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode())) * 31;
        C31068d c31068d = this.whoopProCta;
        return this.perks.hashCode() + ((iHashCode2 + (c31068d != null ? c31068d.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "WhoopProBannerState(title=" + this.title + ", ctaTile=" + this.ctaTile + ", whoopProCta=" + this.whoopProCta + ", perks=" + this.perks + ")";
    }
}
