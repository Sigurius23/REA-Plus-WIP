package d31;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import p01.C28582b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: d31.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, m65681d2 = {"Ld31/c;", "Lm91/u;", "Lp01/b;", NotificationCompat.CATEGORY_PROGRESS, "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "<init>", "(Lp01/b;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lp01/b;", "()Lp01/b;", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "c", "d", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11578c implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C28582b progress;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subtitle;

    public C11578c(C28582b progress, TextResource title, TextResource textResource) {
        AbstractC22676k.m65750j(progress, "progress");
        AbstractC22676k.m65750j(title, "title");
        this.progress = progress;
        this.title = title;
        this.subtitle = textResource;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C28582b getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11578c)) {
            return false;
        }
        C11578c c11578c = (C11578c) other;
        return AbstractC22676k.m65745e(this.progress, c11578c.progress) && AbstractC22676k.m65745e(this.title, c11578c.title) && AbstractC22676k.m65745e(this.subtitle, c11578c.subtitle);
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.progress.hashCode() * 31, this.title, 31);
        TextResource textResource = this.subtitle;
        return iM95625a + (textResource == null ? 0 : textResource.hashCode());
    }

    public String toString() {
        C28582b c28582b = this.progress;
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        StringBuilder sb4 = new StringBuilder("ProgressMetricRowState(progress=");
        sb4.append(c28582b);
        sb4.append(", title=");
        sb4.append(textResource);
        sb4.append(", subtitle=");
        return AbstractC30007c.m91841k(sb4, textResource2, ")");
    }
}
