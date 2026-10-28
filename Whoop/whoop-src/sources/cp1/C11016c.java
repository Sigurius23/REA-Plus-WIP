package cp1;

import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: cp1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u001a\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Lcp1/c;", "", "Lcom/whoop/design/util/TextResource;", "text", "", "screenCount", "maxScreenCount", "<init>", "(Lcom/whoop/design/util/TextResource;II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "I", "d", "()Z", "isComplete", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11016c {

    /* JADX INFO: renamed from: d */
    public static final int f34492d = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int screenCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int maxScreenCount;

    public C11016c(TextResource text, int i13, int i14) {
        AbstractC22676k.m65750j(text, "text");
        this.text = text;
        this.screenCount = i13;
        this.maxScreenCount = i14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getMaxScreenCount() {
        return this.maxScreenCount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getScreenCount() {
        return this.screenCount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m29575d() {
        int i13 = this.maxScreenCount;
        return i13 > 0 && this.screenCount >= i13;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11016c)) {
            return false;
        }
        C11016c c11016c = (C11016c) other;
        return AbstractC22676k.m65745e(this.text, c11016c.text) && this.screenCount == c11016c.screenCount && this.maxScreenCount == c11016c.maxScreenCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.maxScreenCount) + AbstractC11266d.m30448b(this.screenCount, this.text.hashCode() * 31, 31);
    }

    public String toString() {
        TextResource textResource = this.text;
        int i13 = this.screenCount;
        int i14 = this.maxScreenCount;
        StringBuilder sb4 = new StringBuilder("FlowProgressState(text=");
        sb4.append(textResource);
        sb4.append(", screenCount=");
        sb4.append(i13);
        sb4.append(", maxScreenCount=");
        return AbstractC18489d0.m53371l(sb4, i14, ")");
    }
}
