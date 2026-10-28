package v90;

import c13.AbstractC3855a;
import java.util.List;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v90.i */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lv90/i;", "", "", "title", "", "Lv90/h;", "orderLineItems", "additionalLineItems", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/util/List;", "()Ljava/util/List;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35817i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C35816h> orderLineItems;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C35816h> additionalLineItems;

    public C35817i(String title, List<C35816h> orderLineItems, List<C35816h> additionalLineItems) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(orderLineItems, "orderLineItems");
        AbstractC22676k.m65750j(additionalLineItems, "additionalLineItems");
        this.title = title;
        this.orderLineItems = orderLineItems;
        this.additionalLineItems = additionalLineItems;
    }

    /* JADX INFO: renamed from: a */
    public final List<C35816h> m113592a() {
        return this.additionalLineItems;
    }

    /* JADX INFO: renamed from: b */
    public final List<C35816h> m113593b() {
        return this.orderLineItems;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35817i)) {
            return false;
        }
        C35817i c35817i = (C35817i) other;
        return AbstractC22676k.m65745e(this.title, c35817i.title) && AbstractC22676k.m65745e(this.orderLineItems, c35817i.orderLineItems) && AbstractC22676k.m65745e(this.additionalLineItems, c35817i.additionalLineItems);
    }

    public int hashCode() {
        return this.additionalLineItems.hashCode() + AbstractC11895b.m31983b(this.title.hashCode() * 31, 31, this.orderLineItems);
    }

    public String toString() {
        String str = this.title;
        List<C35816h> list = this.orderLineItems;
        return AbstractC3855a.m11829m(AbstractC30802r.m94766o("TrialOfferOrderDetailsViewState(title=", str, ", orderLineItems=", ", additionalLineItems=", list), this.additionalLineItems, ")");
    }
}
