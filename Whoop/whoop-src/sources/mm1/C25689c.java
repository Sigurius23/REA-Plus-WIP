package mm1;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import f11.C14005e;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import ny0.C27256h;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: mm1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0019\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(¨\u0006)"}, m65681d2 = {"Lmm1/c;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "Lcom/whoop/navigation/e;", "destination", "Lgz0/m0;", "endIcon", "Lf11/e;", "dailyTickMark", "Lny0/h;", "logButton", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lgz0/m0;Lf11/e;Lny0/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "b", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "c", "Lgz0/m0;", "()Lgz0/m0;", "d", "Lf11/e;", "()Lf11/e;", "e", "Lny0/h;", "()Lny0/h;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25689c implements InterfaceC25312u {

    /* JADX INFO: renamed from: f */
    public static final int f101175f = ((C27256h.f109055z | C14005e.f49972m) | C9598e.f28134d) | TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC16313m0 endIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C14005e dailyTickMark;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C27256h logButton;

    public C25689c(TextResource title, C9598e destination, EnumC16313m0 endIcon, C14005e dailyTickMark, C27256h c27256h) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(destination, "destination");
        AbstractC22676k.m65750j(endIcon, "endIcon");
        AbstractC22676k.m65750j(dailyTickMark, "dailyTickMark");
        this.title = title;
        this.destination = destination;
        this.endIcon = endIcon;
        this.dailyTickMark = dailyTickMark;
        this.logButton = c27256h;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C14005e getDailyTickMark() {
        return this.dailyTickMark;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC16313m0 getEndIcon() {
        return this.endIcon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C27256h getLogButton() {
        return this.logButton;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25689c)) {
            return false;
        }
        C25689c c25689c = (C25689c) other;
        return AbstractC22676k.m65745e(this.title, c25689c.title) && AbstractC22676k.m65745e(this.destination, c25689c.destination) && this.endIcon == c25689c.endIcon && AbstractC22676k.m65745e(this.dailyTickMark, c25689c.dailyTickMark) && AbstractC22676k.m65745e(this.logButton, c25689c.logButton);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = (this.dailyTickMark.hashCode() + AbstractC17176i.m48500b(this.endIcon, AbstractC36095b.m114673a(this.destination, this.title.hashCode() * 31, 31), 31)) * 31;
        C27256h c27256h = this.logButton;
        return iHashCode + (c27256h == null ? 0 : c27256h.hashCode());
    }

    public String toString() {
        return "MciHomeTileState(title=" + this.title + ", destination=" + this.destination + ", endIcon=" + this.endIcon + ", dailyTickMark=" + this.dailyTickMark + ", logButton=" + this.logButton + ")";
    }
}
