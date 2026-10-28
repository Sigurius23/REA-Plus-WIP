package wm1;

import c13.AbstractC3855a;
import java.util.List;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: wm1.l */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Lwm1/l;", "Lm91/u;", "", "id", "", "Lwm1/c;", "gauges", "headerItems", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37390l implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C37381c> gauges;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<InterfaceC25312u> headerItems;

    /* JADX WARN: Multi-variable type inference failed */
    public C37390l(String str, List<C37381c> gauges, List<? extends InterfaceC25312u> headerItems) {
        AbstractC22676k.m65750j(gauges, "gauges");
        AbstractC22676k.m65750j(headerItems, "headerItems");
        this.id = str;
        this.gauges = gauges;
        this.headerItems = headerItems;
    }

    /* JADX INFO: renamed from: a */
    public final List<C37381c> m119738a() {
        return this.gauges;
    }

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC25312u> m119739b() {
        return this.headerItems;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37390l)) {
            return false;
        }
        C37390l c37390l = (C37390l) other;
        return AbstractC22676k.m65745e(this.id, c37390l.id) && AbstractC22676k.m65745e(this.gauges, c37390l.gauges) && AbstractC22676k.m65745e(this.headerItems, c37390l.headerItems);
    }

    public int hashCode() {
        String str = this.id;
        return this.headerItems.hashCode() + AbstractC11895b.m31983b((str == null ? 0 : str.hashCode()) * 31, 31, this.gauges);
    }

    public String toString() {
        String str = this.id;
        List<C37381c> list = this.gauges;
        return AbstractC3855a.m11829m(AbstractC30802r.m94766o("ScoreGaugeStickyState(id=", str, ", gauges=", ", headerItems=", list), this.headerItems, ")");
    }
}
