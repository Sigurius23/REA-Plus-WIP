package w51;

import c13.AbstractC3855a;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: w51.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lw51/c;", "", "", "isExpanded", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36837c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isExpanded;

    public C36837c(boolean z4) {
        this.isExpanded = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C36837c) && this.isExpanded == ((C36837c) other).isExpanded;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isExpanded);
    }

    public String toString() {
        return AbstractC3855a.m11827k("ToggleExpandedState(isExpanded=", ")", this.isExpanded);
    }
}
