package zm1;

import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zm1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\r¨\u0006\u001a"}, m65681d2 = {"Lzm1/a;", "", "Lcom/whoop/design/util/TextResource;", "title", "", "filledCount", "totalCount", "<init>", "(Lcom/whoop/design/util/TextResource;II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "b", "I", "getFilledCount", "c", "getTotalCount", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40890a {

    /* JADX INFO: renamed from: d */
    public static final int f176210d = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int filledCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int totalCount;

    public C40890a(TextResource title, int i13, int i14) {
        AbstractC22676k.m65750j(title, "title");
        this.title = title;
        this.filledCount = i13;
        this.totalCount = i14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40890a)) {
            return false;
        }
        C40890a c40890a = (C40890a) other;
        return AbstractC22676k.m65745e(this.title, c40890a.title) && this.filledCount == c40890a.filledCount && this.totalCount == c40890a.totalCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.totalCount) + AbstractC11266d.m30448b(this.filledCount, this.title.hashCode() * 31, 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        int i13 = this.filledCount;
        int i14 = this.totalCount;
        StringBuilder sb4 = new StringBuilder("DailyProgress(title=");
        sb4.append(textResource);
        sb4.append(", filledCount=");
        sb4.append(i13);
        sb4.append(", totalCount=");
        return AbstractC18489d0.m53371l(sb4, i14, ")");
    }
}
