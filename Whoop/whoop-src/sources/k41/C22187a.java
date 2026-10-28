package k41;

import java.time.Instant;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.C25306o;

/* JADX INFO: renamed from: k41.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lk41/a;", "", "Ljava/time/Instant;", "until", "Lm91/o;", "item", "<init>", "(Ljava/time/Instant;Lm91/o;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/Instant;", "b", "()Ljava/time/Instant;", "Lm91/o;", "()Lm91/o;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22187a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Instant until;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C25306o item;

    public C22187a(Instant instant, C25306o c25306o) {
        this.until = instant;
        this.item = c25306o;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C25306o getItem() {
        return this.item;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Instant getUntil() {
        return this.until;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22187a)) {
            return false;
        }
        C22187a c22187a = (C22187a) other;
        return AbstractC22676k.m65745e(this.until, c22187a.until) && AbstractC22676k.m65745e(this.item, c22187a.item);
    }

    public int hashCode() {
        Instant instant = this.until;
        int iHashCode = (instant == null ? 0 : instant.hashCode()) * 31;
        C25306o c25306o = this.item;
        return iHashCode + (c25306o != null ? c25306o.hashCode() : 0);
    }

    public String toString() {
        return "PhaseState(until=" + this.until + ", item=" + this.item + ")";
    }
}
