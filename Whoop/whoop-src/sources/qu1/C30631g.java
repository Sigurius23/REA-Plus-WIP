package qu1;

import e31.C12611c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: qu1.g */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lqu1/g;", "Lm91/u;", "Le31/c;", "state", "Lqu1/c;", "primaryClickEvent", "secondaryClickEvent", "<init>", "(Le31/c;Lqu1/c;Lqu1/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Le31/c;", "c", "()Le31/c;", "b", "Lqu1/c;", "()Lqu1/c;", "last-night-sleep_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30631g implements InterfaceC25312u {

    /* JADX INFO: renamed from: d */
    public static final int f125976d = C12611c.f43049g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C12611c state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC30627c primaryClickEvent;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC30627c secondaryClickEvent;

    public C30631g(C12611c state, InterfaceC30627c interfaceC30627c, InterfaceC30627c interfaceC30627c2) {
        AbstractC22676k.m65750j(state, "state");
        this.state = state;
        this.primaryClickEvent = interfaceC30627c;
        this.secondaryClickEvent = interfaceC30627c2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC30627c getPrimaryClickEvent() {
        return this.primaryClickEvent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC30627c getSecondaryClickEvent() {
        return this.secondaryClickEvent;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C12611c getState() {
        return this.state;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30631g)) {
            return false;
        }
        C30631g c30631g = (C30631g) other;
        return AbstractC22676k.m65745e(this.state, c30631g.state) && AbstractC22676k.m65745e(this.primaryClickEvent, c30631g.primaryClickEvent) && AbstractC22676k.m65745e(this.secondaryClickEvent, c30631g.secondaryClickEvent);
    }

    public int hashCode() {
        int iHashCode = this.state.hashCode() * 31;
        InterfaceC30627c interfaceC30627c = this.primaryClickEvent;
        int iHashCode2 = (iHashCode + (interfaceC30627c == null ? 0 : interfaceC30627c.hashCode())) * 31;
        InterfaceC30627c interfaceC30627c2 = this.secondaryClickEvent;
        return iHashCode2 + (interfaceC30627c2 != null ? interfaceC30627c2.hashCode() : 0);
    }

    public String toString() {
        return "MiniArchModal(state=" + this.state + ", primaryClickEvent=" + this.primaryClickEvent + ", secondaryClickEvent=" + this.secondaryClickEvent + ")";
    }

    public /* synthetic */ C30631g(C12611c c12611c, InterfaceC30627c interfaceC30627c, InterfaceC30627c interfaceC30627c2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12611c, (i13 & 2) != 0 ? null : interfaceC30627c, (i13 & 4) != 0 ? null : interfaceC30627c2);
    }
}
