package px0;

import c13.AbstractC3855a;
import java.util.List;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: px0.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lpx0/f;", "", "", "caption", "", "isPresentedFlow", "", "Lpx0/e;", "entries", "<init>", "(Ljava/lang/String;ZLjava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "c", "()Z", "Ljava/util/List;", "()Ljava/util/List;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29596f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String caption;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isPresentedFlow;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C29595e> entries;

    public C29596f(String caption, boolean z4, List<C29595e> entries) {
        AbstractC22676k.m65750j(caption, "caption");
        AbstractC22676k.m65750j(entries, "entries");
        this.caption = caption;
        this.isPresentedFlow = z4;
        this.entries = entries;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCaption() {
        return this.caption;
    }

    /* JADX INFO: renamed from: b */
    public final List<C29595e> m90775b() {
        return this.entries;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsPresentedFlow() {
        return this.isPresentedFlow;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29596f)) {
            return false;
        }
        C29596f c29596f = (C29596f) other;
        return AbstractC22676k.m65745e(this.caption, c29596f.caption) && this.isPresentedFlow == c29596f.isPresentedFlow && AbstractC22676k.m65745e(this.entries, c29596f.entries);
    }

    public int hashCode() {
        return this.entries.hashCode() + AbstractC2875y.m8289b(this.caption.hashCode() * 31, 31, this.isPresentedFlow);
    }

    public String toString() {
        String str = this.caption;
        boolean z4 = this.isPresentedFlow;
        return AbstractC3855a.m11829m(AbstractC25012a.m73379l("PlaygroundStackGroup(caption=", str, ", isPresentedFlow=", ", entries=", z4), this.entries, ")");
    }
}
