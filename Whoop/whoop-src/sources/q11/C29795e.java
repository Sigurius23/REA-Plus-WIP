package q11;

import java.util.List;
import m83.C25271y;
import ny0.C27273p0;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: q11.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\rR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0016\u0010\u001f¨\u0006 "}, m65681d2 = {"Lq11/e;", "Lm91/u;", "", "id", "header", "", "Lq11/i;", "items", "Lny0/p0;", "cta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lny0/p0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "Lny0/p0;", "()Lny0/p0;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29795e implements InterfaceC25312u {

    /* JADX INFO: renamed from: e */
    public static final int f121818e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String header;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C29799i> items;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C27273p0 cta;

    public C29795e(String str, String str2, List<C29799i> items, C27273p0 c27273p0) {
        AbstractC22676k.m65750j(items, "items");
        this.id = str;
        this.header = str2;
        this.items = items;
        this.cta = c27273p0;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C27273p0 getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: c */
    public final List<C29799i> m91265c() {
        return this.items;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29795e)) {
            return false;
        }
        C29795e c29795e = (C29795e) other;
        return AbstractC22676k.m65745e(this.id, c29795e.id) && AbstractC22676k.m65745e(this.header, c29795e.header) && AbstractC22676k.m65745e(this.items, c29795e.items) && AbstractC22676k.m65745e(this.cta, c29795e.cta);
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.header;
        int iM31983b = AbstractC11895b.m31983b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.items);
        C27273p0 c27273p0 = this.cta;
        return iM31983b + (c27273p0 != null ? c27273p0.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.header;
        List<C29799i> list = this.items;
        C27273p0 c27273p0 = this.cta;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ExpandableListViewState(id=", str, ", header=", str2, ", items=");
        sbM32001t.append(list);
        sbM32001t.append(", cta=");
        sbM32001t.append(c27273p0);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ C29795e(String str, String str2, List list, C27273p0 c27273p0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? C25271y.f99162w : list, (i13 & 8) != 0 ? null : c27273p0);
    }
}
