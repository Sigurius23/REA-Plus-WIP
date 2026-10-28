package p711j31;

import com.mapbox.maps.MapboxMap;
import p181h2.C16617b;
import p512u2.AbstractC34471q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: j31.p */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lj31/p;", "", "Lu2/q;", "id", "Lh2/b;", MapboxMap.QFE_OFFSET, "<init>", "(JLh2/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Lh2/b;", "()Lh2/b;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21285p {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C16617b offset;

    public /* synthetic */ C21285p(long j7, C16617b c16617b, DefaultConstructorMarker defaultConstructorMarker) {
        this(j7, c16617b);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C16617b getOffset() {
        return this.offset;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21285p)) {
            return false;
        }
        C21285p c21285p = (C21285p) other;
        return AbstractC34471q.m108943a(this.id, c21285p.id) && AbstractC22676k.m65745e(this.offset, c21285p.offset);
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.id) * 31;
        C16617b c16617b = this.offset;
        return iHashCode + (c16617b == null ? 0 : Long.hashCode(c16617b.f63937a));
    }

    public String toString() {
        return "StartDrag(id=" + AbstractC34471q.m108944b(this.id) + ", offset=" + this.offset + ")";
    }

    private C21285p(long j7, C16617b c16617b) {
        this.id = j7;
        this.offset = c16617b;
    }

    public /* synthetic */ C21285p(long j7, C16617b c16617b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j7, (i13 & 2) != 0 ? null : c16617b, null);
    }
}
