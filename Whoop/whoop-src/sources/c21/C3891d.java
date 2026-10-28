package c21;

import com.whoop.navigation.C9598e;
import java.util.List;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: c21.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lc21/d;", "Lm91/u;", "", "title", "", "Lc21/e;", "metrics", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/util/List;", "()Ljava/util/List;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3891d implements InterfaceC25312u {

    /* JADX INFO: renamed from: d */
    public static final int f15929d = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C3892e> metrics;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C9598e destination;

    public C3891d(String title, List<C3892e> metrics, C9598e c9598e) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(metrics, "metrics");
        this.title = title;
        this.metrics = metrics;
        this.destination = c9598e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: b */
    public final List<C3892e> m11882b() {
        return this.metrics;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3891d)) {
            return false;
        }
        C3891d c3891d = (C3891d) other;
        return AbstractC22676k.m65745e(this.title, c3891d.title) && AbstractC22676k.m65745e(this.metrics, c3891d.metrics) && AbstractC22676k.m65745e(this.destination, c3891d.destination);
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.title.hashCode() * 31, 31, this.metrics);
        C9598e c9598e = this.destination;
        return iM31983b + (c9598e == null ? 0 : c9598e.hashCode());
    }

    public String toString() {
        String str = this.title;
        List<C3892e> list = this.metrics;
        return AbstractC33745d.m106656o(AbstractC30802r.m94766o("HealthMonitorCardViewState(title=", str, ", metrics=", ", destination=", list), this.destination, ")");
    }
}
