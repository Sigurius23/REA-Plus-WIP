package ty0;

import java.util.List;
import ly0.C24802f;
import n21.C26191e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: ty0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lty0/c;", "Lm91/u;", "Ln21/e;", "legendState", "", "Lly0/f;", "arrowStatState", "<init>", "(Ln21/e;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln21/e;", "b", "()Ln21/e;", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34255c implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C26191e legendState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C24802f> arrowStatState;

    public C34255c(C26191e legendState, List<C24802f> arrowStatState) {
        AbstractC22676k.m65750j(legendState, "legendState");
        AbstractC22676k.m65750j(arrowStatState, "arrowStatState");
        this.legendState = legendState;
        this.arrowStatState = arrowStatState;
    }

    /* JADX INFO: renamed from: a */
    public final List<C24802f> m108316a() {
        return this.arrowStatState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C26191e getLegendState() {
        return this.legendState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34255c)) {
            return false;
        }
        C34255c c34255c = (C34255c) other;
        return AbstractC22676k.m65745e(this.legendState, c34255c.legendState) && AbstractC22676k.m65745e(this.arrowStatState, c34255c.arrowStatState);
    }

    public int hashCode() {
        return this.arrowStatState.hashCode() + (this.legendState.hashCode() * 31);
    }

    public String toString() {
        return "DetailsMetricTilesState(legendState=" + this.legendState + ", arrowStatState=" + this.arrowStatState + ")";
    }
}
