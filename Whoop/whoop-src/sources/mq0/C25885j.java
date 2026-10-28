package mq0;

import bq0.C3546b;
import java.util.ArrayList;
import java.util.List;
import l83.C23465k;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: mq0.j */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0003\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R0\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010!\u001a\u0004\b\u0016\u0010\"\"\u0004\b#\u0010$R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b\u001b\u0010'\"\u0004\b(\u0010)¨\u0006*"}, m65681d2 = {"Lmq0/j;", "", "", "isConnected", "", "Lbq0/b;", "dataWidgets", "Ll83/k;", "", "authHeader", "Lmq0/c;", "dataWidgetErrorState", "<init>", "(ZLjava/util/List;Ll83/k;Lmq0/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "setConnected", "(Z)V", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "setDataWidgets", "(Ljava/util/List;)V", "Ll83/k;", "()Ll83/k;", "setAuthHeader", "(Ll83/k;)V", "d", "Lmq0/c;", "()Lmq0/c;", "setDataWidgetErrorState", "(Lmq0/c;)V", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25885j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean isConnected;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private List<C3546b> dataWidgets;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C23465k authHeader;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private C25878c dataWidgetErrorState;

    public C25885j(boolean z4, List<C3546b> dataWidgets, C23465k c23465k, C25878c c25878c) {
        AbstractC22676k.m65750j(dataWidgets, "dataWidgets");
        this.isConnected = z4;
        this.dataWidgets = dataWidgets;
        this.authHeader = c23465k;
        this.dataWidgetErrorState = c25878c;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C23465k getAuthHeader() {
        return this.authHeader;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C25878c getDataWidgetErrorState() {
        return this.dataWidgetErrorState;
    }

    /* JADX INFO: renamed from: c */
    public final List<C3546b> m76531c() {
        return this.dataWidgets;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25885j)) {
            return false;
        }
        C25885j c25885j = (C25885j) other;
        return this.isConnected == c25885j.isConnected && AbstractC22676k.m65745e(this.dataWidgets, c25885j.dataWidgets) && AbstractC22676k.m65745e(this.authHeader, c25885j.authHeader) && AbstractC22676k.m65745e(this.dataWidgetErrorState, c25885j.dataWidgetErrorState);
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(Boolean.hashCode(this.isConnected) * 31, 31, this.dataWidgets);
        C23465k c23465k = this.authHeader;
        int iHashCode = (iM31983b + (c23465k == null ? 0 : c23465k.hashCode())) * 31;
        C25878c c25878c = this.dataWidgetErrorState;
        return iHashCode + (c25878c != null ? c25878c.hashCode() : 0);
    }

    public String toString() {
        return "DataWidgetViewState(isConnected=" + this.isConnected + ", dataWidgets=" + this.dataWidgets + ", authHeader=" + this.authHeader + ", dataWidgetErrorState=" + this.dataWidgetErrorState + ")";
    }

    public /* synthetic */ C25885j(boolean z4, List list, C23465k c23465k, C25878c c25878c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? new ArrayList() : list, (i13 & 4) != 0 ? null : c23465k, (i13 & 8) != 0 ? null : c25878c);
    }
}
