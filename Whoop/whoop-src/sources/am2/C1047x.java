package am2;

import java.util.List;
import l83.C23465k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: am2.x */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R)\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u0018"}, m65681d2 = {"Lam2/x;", "", "", "Ll83/k;", "", "Lvl2/a;", "options", "", "initialSelected", "<init>", "(Ljava/util/List;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "I", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C1047x {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C23465k> options;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int initialSelected;

    /* JADX WARN: Multi-variable type inference failed */
    public C1047x(List<? extends C23465k> options, int i13) {
        AbstractC22676k.m65750j(options, "options");
        this.options = options;
        this.initialSelected = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getInitialSelected() {
        return this.initialSelected;
    }

    /* JADX INFO: renamed from: b */
    public final List<C23465k> m3065b() {
        return this.options;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C1047x)) {
            return false;
        }
        C1047x c1047x = (C1047x) other;
        return AbstractC22676k.m65745e(this.options, c1047x.options) && this.initialSelected == c1047x.initialSelected;
    }

    public int hashCode() {
        return Integer.hashCode(this.initialSelected) + (this.options.hashCode() * 31);
    }

    public String toString() {
        return "SegmentControlState(options=" + this.options + ", initialSelected=" + this.initialSelected + ")";
    }
}
