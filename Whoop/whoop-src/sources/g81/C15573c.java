package g81;

import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25305n;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: g81.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001f"}, m65681d2 = {"Lg81/c;", "Lm91/n;", "", "id", "Lm91/u;", "header", "", "items", "footer", "<init>", "(Ljava/lang/String;Lm91/u;Ljava/util/List;Lm91/u;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lm91/u;", "()Lm91/u;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C15573c implements InterfaceC25305n<String> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC25312u header;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC25312u footer;

    /* JADX WARN: Multi-variable type inference failed */
    public C15573c(String id4, InterfaceC25312u interfaceC25312u, List<? extends InterfaceC25312u> items, InterfaceC25312u interfaceC25312u2) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(items, "items");
        this.id = id4;
        this.header = interfaceC25312u;
        this.items = items;
        this.footer = interfaceC25312u2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC25312u getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC25312u getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: c */
    public final List<InterfaceC25312u> m43869c() {
        return this.items;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15573c)) {
            return false;
        }
        C15573c c15573c = (C15573c) other;
        return AbstractC22676k.m65745e(this.id, c15573c.id) && AbstractC22676k.m65745e(this.header, c15573c.header) && AbstractC22676k.m65745e(this.items, c15573c.items) && AbstractC22676k.m65745e(this.footer, c15573c.footer);
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        InterfaceC25312u interfaceC25312u = this.header;
        int iM31983b = AbstractC11895b.m31983b((iHashCode + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode())) * 31, 31, this.items);
        InterfaceC25312u interfaceC25312u2 = this.footer;
        return iM31983b + (interfaceC25312u2 != null ? interfaceC25312u2.hashCode() : 0);
    }

    public String toString() {
        return "RecommendationTileGroupViewState(id=" + this.id + ", header=" + this.header + ", items=" + this.items + ", footer=" + this.footer + ")";
    }

    @Override // p720m91.InterfaceC25305n
    public String getId() {
        return this.id;
    }
}
