package bm2;

import com.whoop.design.util.TextResource;
import p294l3.C23254g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: bm2.i0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lbm2/i0;", "", "Lcom/whoop/design/util/TextResource;", "title", "buttonTitle", "Ll3/g;", "description", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ll3/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Ll3/g;", "()Ll3/g;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3448i0 {

    /* JADX INFO: renamed from: d */
    public static final int f13519d = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource buttonTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C23254g description;

    public C3448i0(TextResource title, TextResource buttonTitle, C23254g description) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        AbstractC22676k.m65750j(description, "description");
        this.title = title;
        this.buttonTitle = buttonTitle;
        this.description = description;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getButtonTitle() {
        return this.buttonTitle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C23254g getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3448i0)) {
            return false;
        }
        C3448i0 c3448i0 = (C3448i0) other;
        return AbstractC22676k.m65745e(this.title, c3448i0.title) && AbstractC22676k.m65745e(this.buttonTitle, c3448i0.buttonTitle) && AbstractC22676k.m65745e(this.description, c3448i0.description);
    }

    public int hashCode() {
        return this.description.hashCode() + AbstractC31061c.m95625a(this.title.hashCode() * 31, this.buttonTitle, 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.buttonTitle;
        C23254g c23254g = this.description;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("ModalViewState(title=", textResource, ", buttonTitle=", textResource2, ", description=");
        sbM106658q.append((Object) c23254g);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
