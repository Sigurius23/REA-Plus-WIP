package y11;

import com.whoop.design.util.TextResource;
import n21.C26191e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: y11.s */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Ly11/s;", "Lm91/u;", "Ln21/e;", "legendState", "Lcom/whoop/design/util/TextResource;", "legendValue", "<init>", "(Ln21/e;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln21/e;", "()Ln21/e;", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39066s implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C26191e legendState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource legendValue;

    public C39066s(C26191e legendState, TextResource legendValue) {
        AbstractC22676k.m65750j(legendState, "legendState");
        AbstractC22676k.m65750j(legendValue, "legendValue");
        this.legendState = legendState;
        this.legendValue = legendValue;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C26191e getLegendState() {
        return this.legendState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getLegendValue() {
        return this.legendValue;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39066s)) {
            return false;
        }
        C39066s c39066s = (C39066s) other;
        return AbstractC22676k.m65745e(this.legendState, c39066s.legendState) && AbstractC22676k.m65745e(this.legendValue, c39066s.legendValue);
    }

    public int hashCode() {
        return this.legendValue.hashCode() + (this.legendState.hashCode() * 31);
    }

    public String toString() {
        return "LegendContent(legendState=" + this.legendState + ", legendValue=" + this.legendValue + ")";
    }
}
