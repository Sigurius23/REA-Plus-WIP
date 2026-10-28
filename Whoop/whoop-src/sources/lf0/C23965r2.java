package lf0;

import java.util.List;
import ny0.C27273p0;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lf0.r2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0018\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Llf0/r2;", "Lm91/u;", "", "title", "", "Llf0/s2;", "items", "Lny0/p0;", "secondaryButton", "<init>", "(Ljava/lang/String;Ljava/util/List;Lny0/p0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/util/List;", "()Ljava/util/List;", "Lny0/p0;", "()Lny0/p0;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23965r2 implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C23969s2> items;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C27273p0 secondaryButton;

    public C23965r2(String title, List<C23969s2> items, C27273p0 secondaryButton) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(secondaryButton, "secondaryButton");
        this.title = title;
        this.items = items;
        this.secondaryButton = secondaryButton;
    }

    /* JADX INFO: renamed from: a */
    public final List<C23969s2> m70623a() {
        return this.items;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C27273p0 getSecondaryButton() {
        return this.secondaryButton;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23965r2)) {
            return false;
        }
        C23965r2 c23965r2 = (C23965r2) other;
        return AbstractC22676k.m65745e(this.title, c23965r2.title) && AbstractC22676k.m65745e(this.items, c23965r2.items) && AbstractC22676k.m65745e(this.secondaryButton, c23965r2.secondaryButton);
    }

    public int hashCode() {
        return this.secondaryButton.hashCode() + AbstractC11895b.m31983b(this.title.hashCode() * 31, 31, this.items);
    }

    public String toString() {
        String str = this.title;
        List<C23969s2> list = this.items;
        C27273p0 c27273p0 = this.secondaryButton;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("WhatsIncludedCardViewState(title=", str, ", items=", ", secondaryButton=", list);
        sbM94766o.append(c27273p0);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }
}
