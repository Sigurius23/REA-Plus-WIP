package k21;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;

/* JADX INFO: renamed from: k21.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lk21/a;", "", "Lcom/whoop/design/util/TextResource;", "title", "Lcom/whoop/navigation/e;", "destination", "Ly81/e;", "color", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ly81/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "Ly81/e;", "()Ly81/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22157a {

    /* JADX INFO: renamed from: d */
    public static final int f85912d = C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC39332e color;

    public C22157a(TextResource title, C9598e destination, InterfaceC39332e color) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(destination, "destination");
        AbstractC22676k.m65750j(color, "color");
        this.title = title;
        this.destination = destination;
        this.color = color;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC39332e getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22157a)) {
            return false;
        }
        C22157a c22157a = (C22157a) other;
        return AbstractC22676k.m65745e(this.title, c22157a.title) && AbstractC22676k.m65745e(this.destination, c22157a.destination) && AbstractC22676k.m65745e(this.color, c22157a.color);
    }

    public int hashCode() {
        return this.color.hashCode() + AbstractC36095b.m114673a(this.destination, this.title.hashCode() * 31, 31);
    }

    public String toString() {
        return "ButtonState(title=" + this.title + ", destination=" + this.destination + ", color=" + this.color + ")";
    }
}
