package ti0;

import com.whoop.navigation.C9598e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import ri0.C31447f;

/* JADX INFO: renamed from: ti0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lti0/f;", "Lti0/m;", "Lri0/f;", "navigationBarState", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Lri0/f;Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lri0/f;", "getNavigationBarState", "()Lri0/f;", "b", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33841f implements InterfaceC33848m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C31447f navigationBarState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C9598e destination;

    public C33841f(C31447f c31447f, C9598e destination) {
        AbstractC22676k.m65750j(destination, "destination");
        this.navigationBarState = c31447f;
        this.destination = destination;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33841f)) {
            return false;
        }
        C33841f c33841f = (C33841f) other;
        return AbstractC22676k.m65745e(this.navigationBarState, c33841f.navigationBarState) && AbstractC22676k.m65745e(this.destination, c33841f.destination);
    }

    public int hashCode() {
        C31447f c31447f = this.navigationBarState;
        return this.destination.hashCode() + ((c31447f == null ? 0 : c31447f.hashCode()) * 31);
    }

    public String toString() {
        return "NavigationContentState(navigationBarState=" + this.navigationBarState + ", destination=" + this.destination + ")";
    }
}
