package zm1;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zm1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lzm1/b;", "", "Lcom/whoop/design/util/TextResource;", "itemText", "", "filled", "<init>", "(Lcom/whoop/design/util/TextResource;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "Z", "()Z", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40891b {

    /* JADX INFO: renamed from: c */
    public static final int f176214c = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource itemText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean filled;

    public C40891b(TextResource itemText, boolean z4) {
        AbstractC22676k.m65750j(itemText, "itemText");
        this.itemText = itemText;
        this.filled = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getFilled() {
        return this.filled;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getItemText() {
        return this.itemText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40891b)) {
            return false;
        }
        C40891b c40891b = (C40891b) other;
        return AbstractC22676k.m65745e(this.itemText, c40891b.itemText) && this.filled == c40891b.filled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.filled) + (this.itemText.hashCode() * 31);
    }

    public String toString() {
        return "ProgressItem(itemText=" + this.itemText + ", filled=" + this.filled + ")";
    }
}
