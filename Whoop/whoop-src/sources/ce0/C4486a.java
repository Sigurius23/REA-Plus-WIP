package ce0;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: ce0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, m65681d2 = {"Lce0/a;", "", "Lm91/u;", "headerInfoCallout", "schedulingDatePicker", "errorCard", "<init>", "(Lm91/u;Lm91/u;Lm91/u;)V", "a", "(Lm91/u;Lm91/u;Lm91/u;)Lce0/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lm91/u;", "d", "()Lm91/u;", "b", "e", "c", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4486a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC25312u headerInfoCallout;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC25312u schedulingDatePicker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC25312u errorCard;

    public C4486a(InterfaceC25312u interfaceC25312u, InterfaceC25312u interfaceC25312u2, InterfaceC25312u interfaceC25312u3) {
        this.headerInfoCallout = interfaceC25312u;
        this.schedulingDatePicker = interfaceC25312u2;
        this.errorCard = interfaceC25312u3;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C4486a m14020b(C4486a c4486a, InterfaceC25312u interfaceC25312u, InterfaceC25312u interfaceC25312u2, InterfaceC25312u interfaceC25312u3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC25312u = c4486a.headerInfoCallout;
        }
        if ((i13 & 2) != 0) {
            interfaceC25312u2 = c4486a.schedulingDatePicker;
        }
        if ((i13 & 4) != 0) {
            interfaceC25312u3 = c4486a.errorCard;
        }
        return c4486a.m14021a(interfaceC25312u, interfaceC25312u2, interfaceC25312u3);
    }

    /* JADX INFO: renamed from: a */
    public final C4486a m14021a(InterfaceC25312u headerInfoCallout, InterfaceC25312u schedulingDatePicker, InterfaceC25312u errorCard) {
        return new C4486a(headerInfoCallout, schedulingDatePicker, errorCard);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC25312u getErrorCard() {
        return this.errorCard;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC25312u getHeaderInfoCallout() {
        return this.headerInfoCallout;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC25312u getSchedulingDatePicker() {
        return this.schedulingDatePicker;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4486a)) {
            return false;
        }
        C4486a c4486a = (C4486a) other;
        return AbstractC22676k.m65745e(this.headerInfoCallout, c4486a.headerInfoCallout) && AbstractC22676k.m65745e(this.schedulingDatePicker, c4486a.schedulingDatePicker) && AbstractC22676k.m65745e(this.errorCard, c4486a.errorCard);
    }

    public int hashCode() {
        InterfaceC25312u interfaceC25312u = this.headerInfoCallout;
        int iHashCode = (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode()) * 31;
        InterfaceC25312u interfaceC25312u2 = this.schedulingDatePicker;
        int iHashCode2 = (iHashCode + (interfaceC25312u2 == null ? 0 : interfaceC25312u2.hashCode())) * 31;
        InterfaceC25312u interfaceC25312u3 = this.errorCard;
        return iHashCode2 + (interfaceC25312u3 != null ? interfaceC25312u3.hashCode() : 0);
    }

    public String toString() {
        return "FormContentViewState(headerInfoCallout=" + this.headerInfoCallout + ", schedulingDatePicker=" + this.schedulingDatePicker + ", errorCard=" + this.errorCard + ")";
    }
}
