package ny0;

import com.whoop.whoopaction.domain.models.Action;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import jh3.AbstractC21702c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: ny0.h0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, m65681d2 = {"Lny0/h0;", "Lm91/u;", "", "title", "Lgz0/m0;", "icon", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "", "isLoading", "<init>", "(Ljava/lang/String;Lgz0/m0;Lcom/whoop/whoopaction/domain/models/Action;Z)V", "a", "(Ljava/lang/String;Lgz0/m0;Lcom/whoop/whoopaction/domain/models/Action;Z)Lny0/h0;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "b", "Lgz0/m0;", "e", "()Lgz0/m0;", "c", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "d", "Z", "g", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27257h0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Action action;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isLoading;

    public C27257h0(String title, EnumC16313m0 icon, Action action, boolean z4) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(icon, "icon");
        this.title = title;
        this.icon = icon;
        this.action = action;
        this.isLoading = z4;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C27257h0 m82169b(C27257h0 c27257h0, String str, EnumC16313m0 enumC16313m0, Action action, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c27257h0.title;
        }
        if ((i13 & 2) != 0) {
            enumC16313m0 = c27257h0.icon;
        }
        if ((i13 & 4) != 0) {
            action = c27257h0.action;
        }
        if ((i13 & 8) != 0) {
            z4 = c27257h0.isLoading;
        }
        return c27257h0.m82170a(str, enumC16313m0, action, z4);
    }

    /* JADX INFO: renamed from: a */
    public final C27257h0 m82170a(String title, EnumC16313m0 icon, Action action, boolean isLoading) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(icon, "icon");
        return new C27257h0(title, icon, action, isLoading);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27257h0)) {
            return false;
        }
        C27257h0 c27257h0 = (C27257h0) other;
        return AbstractC22676k.m65745e(this.title, c27257h0.title) && this.icon == c27257h0.icon && AbstractC22676k.m65745e(this.action, c27257h0.action) && this.isLoading == c27257h0.isLoading;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public int hashCode() {
        int iM48500b = AbstractC17176i.m48500b(this.icon, this.title.hashCode() * 31, 31);
        Action action = this.action;
        return Boolean.hashCode(this.isLoading) + ((iM48500b + (action == null ? 0 : action.hashCode())) * 31);
    }

    public String toString() {
        String str = this.title;
        EnumC16313m0 enumC16313m0 = this.icon;
        Action action = this.action;
        boolean z4 = this.isLoading;
        StringBuilder sbM61141l = AbstractC21702c.m61141l("SecondaryActionButtonState(title=", str, ", icon=", enumC16313m0, ", action=");
        sbM61141l.append(action);
        sbM61141l.append(", isLoading=");
        sbM61141l.append(z4);
        sbM61141l.append(")");
        return sbM61141l.toString();
    }

    public /* synthetic */ C27257h0(String str, EnumC16313m0 enumC16313m0, Action action, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? EnumC16313m0.CARET_FORWARD : enumC16313m0, (i13 & 4) != 0 ? null : action, (i13 & 8) != 0 ? false : z4);
    }
}
