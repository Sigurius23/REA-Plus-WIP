package p711j31;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: j31.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\bJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, m65681d2 = {"Lj31/d;", "", "", "index", "key", "<init>", "(ILjava/lang/Object;)V", "a", "()I", "b", "()Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "c", "Ljava/lang/Object;", "d", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21273d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int index;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Object key;

    public C21273d(int i13, Object obj) {
        this.index = i13;
        this.key = obj;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Object getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: c */
    public final int m59692c() {
        return this.index;
    }

    /* JADX INFO: renamed from: d */
    public final Object m59693d() {
        return this.key;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21273d)) {
            return false;
        }
        C21273d c21273d = (C21273d) other;
        return this.index == c21273d.index && AbstractC22676k.m65745e(this.key, c21273d.key);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.index) * 31;
        Object obj = this.key;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "ItemPosition(index=" + this.index + ", key=" + this.key + ")";
    }
}
