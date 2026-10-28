package au2;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: au2.j */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lau2/j;", "", "Lcom/whoop/design/util/TextResource;", "title", NotificationCompat.CATEGORY_PROGRESS, "Lau2/k;", "style", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lau2/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "getTitle", "()Lcom/whoop/design/util/TextResource;", "b", "getProgress", "c", "Lau2/k;", "getStyle", "()Lau2/k;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C2085j {

    /* JADX INFO: renamed from: d */
    public static final int f8249d = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource progress;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC2086k style;

    public C2085j(TextResource title, TextResource progress, EnumC2086k style) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(progress, "progress");
        AbstractC22676k.m65750j(style, "style");
        this.title = title;
        this.progress = progress;
        this.style = style;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2085j)) {
            return false;
        }
        C2085j c2085j = (C2085j) other;
        return AbstractC22676k.m65745e(this.title, c2085j.title) && AbstractC22676k.m65745e(this.progress, c2085j.progress) && this.style == c2085j.style;
    }

    public int hashCode() {
        return this.style.hashCode() + AbstractC31061c.m95625a(this.title.hashCode() * 31, this.progress, 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.progress;
        EnumC2086k enumC2086k = this.style;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("SummaryListItemState(title=", textResource, ", progress=", textResource2, ", style=");
        sbM106658q.append(enumC2086k);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
