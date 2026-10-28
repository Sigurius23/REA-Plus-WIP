package wt2;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wt2.h */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lwt2/h;", "", "Lcom/whoop/design/util/TextResource;", "display", "Lwt2/m;", "style", "<init>", "(Lcom/whoop/design/util/TextResource;Lwt2/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "b", "Lwt2/m;", "()Lwt2/m;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37627h {

    /* JADX INFO: renamed from: c */
    public static final int f161015c = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource display;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC37632m style;

    public C37627h(TextResource display, EnumC37632m style) {
        AbstractC22676k.m65750j(display, "display");
        AbstractC22676k.m65750j(style, "style");
        this.display = display;
        this.style = style;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getDisplay() {
        return this.display;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC37632m getStyle() {
        return this.style;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37627h)) {
            return false;
        }
        C37627h c37627h = (C37627h) other;
        return AbstractC22676k.m65745e(this.display, c37627h.display) && this.style == c37627h.style;
    }

    public int hashCode() {
        return this.style.hashCode() + (this.display.hashCode() * 31);
    }

    public String toString() {
        return "StyledStringState(display=" + this.display + ", style=" + this.style + ")";
    }
}
