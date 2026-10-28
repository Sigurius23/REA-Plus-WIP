package v31;

import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: v31.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ<\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, m65681d2 = {"Lv31/g;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "Lv31/a;", "progressBar", "Lgz0/m0;", "closeIcon", "Lv31/h;", "style", "<init>", "(Lcom/whoop/design/util/TextResource;Lv31/a;Lgz0/m0;Lv31/h;)V", "a", "(Lcom/whoop/design/util/TextResource;Lv31/a;Lgz0/m0;Lv31/h;)Lv31/g;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "b", "Lv31/a;", "e", "()Lv31/a;", "c", "Lgz0/m0;", "()Lgz0/m0;", "d", "Lv31/h;", "f", "()Lv31/h;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35611g implements InterfaceC25312u {

    /* JADX INFO: renamed from: e */
    public static final int f151392e = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C35605a progressBar;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC16313m0 closeIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC35612h style;

    public C35611g(TextResource title, C35605a c35605a, EnumC16313m0 enumC16313m0, EnumC35612h style) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(style, "style");
        this.title = title;
        this.progressBar = c35605a;
        this.closeIcon = enumC16313m0;
        this.style = style;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C35611g m112819b(C35611g c35611g, TextResource textResource, C35605a c35605a, EnumC16313m0 enumC16313m0, EnumC35612h enumC35612h, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = c35611g.title;
        }
        if ((i13 & 2) != 0) {
            c35605a = c35611g.progressBar;
        }
        if ((i13 & 4) != 0) {
            enumC16313m0 = c35611g.closeIcon;
        }
        if ((i13 & 8) != 0) {
            enumC35612h = c35611g.style;
        }
        return c35611g.m112820a(textResource, c35605a, enumC16313m0, enumC35612h);
    }

    /* JADX INFO: renamed from: a */
    public final C35611g m112820a(TextResource title, C35605a progressBar, EnumC16313m0 closeIcon, EnumC35612h style) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(style, "style");
        return new C35611g(title, progressBar, closeIcon, style);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC16313m0 getCloseIcon() {
        return this.closeIcon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C35605a getProgressBar() {
        return this.progressBar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35611g)) {
            return false;
        }
        C35611g c35611g = (C35611g) other;
        return AbstractC22676k.m65745e(this.title, c35611g.title) && AbstractC22676k.m65745e(this.progressBar, c35611g.progressBar) && this.closeIcon == c35611g.closeIcon && this.style == c35611g.style;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC35612h getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        C35605a c35605a = this.progressBar;
        int iHashCode2 = (iHashCode + (c35605a == null ? 0 : c35605a.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.closeIcon;
        return this.style.hashCode() + ((iHashCode2 + (enumC16313m0 != null ? enumC16313m0.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "StepperComponentState(title=" + this.title + ", progressBar=" + this.progressBar + ", closeIcon=" + this.closeIcon + ", style=" + this.style + ")";
    }
}
