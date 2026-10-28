package tk2;

import com.whoop.navigation.C9598e;
import j02.C21166s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: tk2.k */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Ltk2/k;", "", "Lcom/whoop/navigation/e;", "destination", "Lj02/s;", "dismissEvent", "<init>", "(Lcom/whoop/navigation/e;Lj02/s;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "b", "Lj02/s;", "()Lj02/s;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33893k implements InterfaceC33892j {

    /* JADX INFO: renamed from: c */
    public static final int f141999c = C21166s.f80697d | C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C21166s dismissEvent;

    public C33893k(C9598e destination, C21166s c21166s) {
        AbstractC22676k.m65750j(destination, "destination");
        this.destination = destination;
        this.dismissEvent = c21166s;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C21166s getDismissEvent() {
        return this.dismissEvent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33893k)) {
            return false;
        }
        C33893k c33893k = (C33893k) other;
        return AbstractC22676k.m65745e(this.destination, c33893k.destination) && AbstractC22676k.m65745e(this.dismissEvent, c33893k.dismissEvent);
    }

    public int hashCode() {
        int iHashCode = this.destination.hashCode() * 31;
        C21166s c21166s = this.dismissEvent;
        return iHashCode + (c21166s == null ? 0 : c21166s.hashCode());
    }

    public String toString() {
        return "NavigateTo(destination=" + this.destination + ", dismissEvent=" + this.dismissEvent + ")";
    }

    public /* synthetic */ C33893k(C9598e c9598e, C21166s c21166s, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c9598e, (i13 & 2) != 0 ? null : c21166s);
    }
}
