package i71;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: i71.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Li71/d;", "", "", "indexOffset", "totalCount", "<init>", "(ILjava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18200d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int indexOffset;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Integer totalCount;

    public C18200d(int i13, Integer num) {
        this.indexOffset = i13;
        this.totalCount = num;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getIndexOffset() {
        return this.indexOffset;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getTotalCount() {
        return this.totalCount;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18200d)) {
            return false;
        }
        C18200d c18200d = (C18200d) other;
        return this.indexOffset == c18200d.indexOffset && AbstractC22676k.m65745e(this.totalCount, c18200d.totalCount);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.indexOffset) * 31;
        Integer num = this.totalCount;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "DataScrollerOffset(indexOffset=" + this.indexOffset + ", totalCount=" + this.totalCount + ")";
    }

    public /* synthetic */ C18200d(int i13, Integer num, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i13, (i14 & 2) != 0 ? null : num);
    }
}
