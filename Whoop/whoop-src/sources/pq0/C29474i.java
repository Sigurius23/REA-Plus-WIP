package pq0;

import com.whoop.domain.model.teams.Widget;
import java.util.List;
import l83.C23465k;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: pq0.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR0\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b \u0010\"\"\u0004\b#\u0010$R\"\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010!\u001a\u0004\b\n\u0010\"\"\u0004\b%\u0010$R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b\u001b\u0010(\"\u0004\b)\u0010*¨\u0006+"}, m65681d2 = {"Lpq0/i;", "", "", "Lcom/whoop/domain/model/teams/Widget;", "widgets", "Ll83/k;", "", "authHeader", "", "showWidgetTab", "isConnected", "Lpq0/g;", "globalShareErrorState", "<init>", "(Ljava/util/List;Ll83/k;ZZLpq0/g;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "Ll83/k;", "()Ll83/k;", "setAuthHeader", "(Ll83/k;)V", "c", "Z", "()Z", "setShowWidgetTab", "(Z)V", "setConnected", "e", "Lpq0/g;", "()Lpq0/g;", "setGlobalShareErrorState", "(Lpq0/g;)V", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29474i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<Widget> widgets;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private C23465k authHeader;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean showWidgetTab;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isConnected;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private C29472g globalShareErrorState;

    public C29474i(List<Widget> widgets, C23465k c23465k, boolean z4, boolean z13, C29472g c29472g) {
        AbstractC22676k.m65750j(widgets, "widgets");
        this.widgets = widgets;
        this.authHeader = c23465k;
        this.showWidgetTab = z4;
        this.isConnected = z13;
        this.globalShareErrorState = c29472g;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C23465k getAuthHeader() {
        return this.authHeader;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C29472g getGlobalShareErrorState() {
        return this.globalShareErrorState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getShowWidgetTab() {
        return this.showWidgetTab;
    }

    /* JADX INFO: renamed from: d */
    public final List<Widget> m90008d() {
        return this.widgets;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29474i)) {
            return false;
        }
        C29474i c29474i = (C29474i) other;
        return AbstractC22676k.m65745e(this.widgets, c29474i.widgets) && AbstractC22676k.m65745e(this.authHeader, c29474i.authHeader) && this.showWidgetTab == c29474i.showWidgetTab && this.isConnected == c29474i.isConnected && AbstractC22676k.m65745e(this.globalShareErrorState, c29474i.globalShareErrorState);
    }

    public int hashCode() {
        int iHashCode = this.widgets.hashCode() * 31;
        C23465k c23465k = this.authHeader;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode + (c23465k == null ? 0 : c23465k.hashCode())) * 31, 31, this.showWidgetTab), 31, this.isConnected);
        C29472g c29472g = this.globalShareErrorState;
        return iM8289b + (c29472g != null ? c29472g.hashCode() : 0);
    }

    public String toString() {
        List<Widget> list = this.widgets;
        C23465k c23465k = this.authHeader;
        boolean z4 = this.showWidgetTab;
        boolean z13 = this.isConnected;
        C29472g c29472g = this.globalShareErrorState;
        StringBuilder sb4 = new StringBuilder("ShareWidgetDialogViewState(widgets=");
        sb4.append(list);
        sb4.append(", authHeader=");
        sb4.append(c23465k);
        sb4.append(", showWidgetTab=");
        AbstractC38963t7.m124392v(sb4, z4, ", isConnected=", z13, ", globalShareErrorState=");
        sb4.append(c29472g);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C29474i(List list, C23465k c23465k, boolean z4, boolean z13, C29472g c29472g, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list, (i13 & 2) != 0 ? null : c23465k, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? false : z13, (i13 & 16) != 0 ? null : c29472g);
    }
}
