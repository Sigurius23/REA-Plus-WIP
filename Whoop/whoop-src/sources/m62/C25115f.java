package m62;

import com.whoop.navigation.C9598e;
import nh3.AbstractC26725a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m62.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lm62/f;", "", "", "title", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Lcom/whoop/navigation/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25115f {

    /* JADX INFO: renamed from: c */
    public static final int f98414c = C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C9598e destination;

    public C25115f(String title, C9598e destination) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(destination, "destination");
        this.title = title;
        this.destination = destination;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25115f)) {
            return false;
        }
        C25115f c25115f = (C25115f) other;
        return AbstractC22676k.m65745e(this.title, c25115f.title) && AbstractC22676k.m65745e(this.destination, c25115f.destination);
    }

    public int hashCode() {
        return this.destination.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        return AbstractC26725a.m79502f("RafCta(title=", this.title, ", destination=", this.destination, ")");
    }
}
