package td2;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: td2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Ltd2/e;", "", "Lcom/whoop/design/util/TextResource;", "label", "", "hasFocus", "<init>", "(Lcom/whoop/design/util/TextResource;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "b", "Z", "getHasFocus", "()Z", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33714e {

    /* JADX INFO: renamed from: c */
    public static final int f140962c = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource label;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean hasFocus;

    public C33714e(TextResource label, boolean z4) {
        AbstractC22676k.m65750j(label, "label");
        this.label = label;
        this.hasFocus = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getLabel() {
        return this.label;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33714e)) {
            return false;
        }
        C33714e c33714e = (C33714e) other;
        return AbstractC22676k.m65745e(this.label, c33714e.label) && this.hasFocus == c33714e.hasFocus;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasFocus) + (this.label.hashCode() * 31);
    }

    public String toString() {
        return "ShepherdHistoryDetailClearButtonViewState(label=" + this.label + ", hasFocus=" + this.hasFocus + ")";
    }
}
