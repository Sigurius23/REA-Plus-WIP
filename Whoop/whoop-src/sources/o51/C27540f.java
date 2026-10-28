package o51;

import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: o51.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lo51/f;", "", "", "initialIndex", "", "", "elementNames", "<init>", "(ILjava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27540f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int initialIndex;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<String> elementNames;

    public C27540f(int i13, List<String> elementNames) {
        AbstractC22676k.m65750j(elementNames, "elementNames");
        this.initialIndex = i13;
        this.elementNames = elementNames;
    }

    /* JADX INFO: renamed from: a */
    public final List<String> m83096a() {
        return this.elementNames;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getInitialIndex() {
        return this.initialIndex;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27540f)) {
            return false;
        }
        C27540f c27540f = (C27540f) other;
        return this.initialIndex == c27540f.initialIndex && AbstractC22676k.m65745e(this.elementNames, c27540f.elementNames);
    }

    public int hashCode() {
        return this.elementNames.hashCode() + (Integer.hashCode(this.initialIndex) * 31);
    }

    public String toString() {
        return "SegmentControllerViewState(initialIndex=" + this.initialIndex + ", elementNames=" + this.elementNames + ")";
    }
}
