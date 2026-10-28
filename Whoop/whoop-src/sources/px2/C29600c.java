package px2;

import mx2.InterfaceC26015b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: px2.c */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lpx2/c;", "", "Lmx2/b;", "action", "", "label", "<init>", "(Lmx2/b;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx2/b;", "()Lmx2/b;", "b", "Ljava/lang/String;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29600c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26015b action;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String label;

    public C29600c(InterfaceC26015b action, String label) {
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(label, "label");
        this.action = action;
        this.label = label;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC26015b getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29600c)) {
            return false;
        }
        C29600c c29600c = (C29600c) other;
        return AbstractC22676k.m65745e(this.action, c29600c.action) && AbstractC22676k.m65745e(this.label, c29600c.label);
    }

    public int hashCode() {
        return this.label.hashCode() + (this.action.hashCode() * 31);
    }

    public String toString() {
        return "BottomSheetViewOption(action=" + this.action + ", label=" + this.label + ")";
    }
}
