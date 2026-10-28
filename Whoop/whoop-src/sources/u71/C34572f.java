package u71;

import com.whoop.design.util.TextResource;
import hy0.EnumC17775o1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y71.C39274g;

/* JADX INFO: renamed from: u71.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lu71/f;", "", "Lcom/whoop/design/util/TextResource;", "title", "Lhy0/o1;", "style", "Ly71/g;", "icon", "<init>", "(Lcom/whoop/design/util/TextResource;Lhy0/o1;Ly71/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Lhy0/o1;", "()Lhy0/o1;", "Ly71/g;", "()Ly71/g;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34572f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC17775o1 style;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C39274g icon;

    public C34572f(TextResource title, EnumC17775o1 style, C39274g icon) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(icon, "icon");
        this.title = title;
        this.style = style;
        this.icon = icon;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C39274g getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC17775o1 getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34572f)) {
            return false;
        }
        C34572f c34572f = (C34572f) other;
        return AbstractC22676k.m65745e(this.title, c34572f.title) && this.style == c34572f.style && AbstractC22676k.m65745e(this.icon, c34572f.icon);
    }

    public int hashCode() {
        return this.icon.hashCode() + ((this.style.hashCode() + (this.title.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "JournalEntrypointBehaviorTag(title=" + this.title + ", style=" + this.style + ", icon=" + this.icon + ")";
    }
}
