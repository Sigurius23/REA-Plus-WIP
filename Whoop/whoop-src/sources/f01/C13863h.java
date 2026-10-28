package f01;

import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: f01.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ6\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, m65681d2 = {"Lf01/h;", "Lm91/u;", "Lf01/r0;", "header", "", "Lf01/e1;", "lineItems", "Lf01/j0;", "footer", "<init>", "(Lf01/r0;Ljava/util/List;Lf01/j0;)V", "a", "(Lf01/r0;Ljava/util/List;Lf01/j0;)Lf01/h;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lf01/r0;", "e", "()Lf01/r0;", "b", "Ljava/util/List;", "f", "()Ljava/util/List;", "c", "Lf01/j0;", "()Lf01/j0;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13863h implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C13894r0 header;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C13856e1> lineItems;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C13870j0 footer;

    public C13863h(C13894r0 header, List<C13856e1> lineItems, C13870j0 c13870j0) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(lineItems, "lineItems");
        this.header = header;
        this.lineItems = lineItems;
        this.footer = c13870j0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C13863h m39302b(C13863h c13863h, C13894r0 c13894r0, List list, C13870j0 c13870j0, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c13894r0 = c13863h.header;
        }
        if ((i13 & 2) != 0) {
            list = c13863h.lineItems;
        }
        if ((i13 & 4) != 0) {
            c13870j0 = c13863h.footer;
        }
        return c13863h.m39303a(c13894r0, list, c13870j0);
    }

    /* JADX INFO: renamed from: a */
    public final C13863h m39303a(C13894r0 header, List<C13856e1> lineItems, C13870j0 footer) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(lineItems, "lineItems");
        return new C13863h(header, lineItems, footer);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C13870j0 getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C13894r0 getHeader() {
        return this.header;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13863h)) {
            return false;
        }
        C13863h c13863h = (C13863h) other;
        return AbstractC22676k.m65745e(this.header, c13863h.header) && AbstractC22676k.m65745e(this.lineItems, c13863h.lineItems) && AbstractC22676k.m65745e(this.footer, c13863h.footer);
    }

    /* JADX INFO: renamed from: f */
    public final List<C13856e1> m39306f() {
        return this.lineItems;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.header.hashCode() * 31, 31, this.lineItems);
        C13870j0 c13870j0 = this.footer;
        return iM31983b + (c13870j0 == null ? 0 : c13870j0.hashCode());
    }

    public String toString() {
        return "AdvancedLabsSubscriptionCardState(header=" + this.header + ", lineItems=" + this.lineItems + ", footer=" + this.footer + ")";
    }
}
