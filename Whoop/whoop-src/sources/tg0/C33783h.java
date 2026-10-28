package tg0;

import fl0.C14567l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: tg0.h */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Ltg0/h;", "", "Ltg0/a;", "action", "Lfl0/l;", "analyticsData", "<init>", "(Ltg0/a;Lfl0/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltg0/a;", "()Ltg0/a;", "b", "Lfl0/l;", "()Lfl0/l;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33783h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC33776a action;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C14567l analyticsData;

    public C33783h(AbstractC33776a action, C14567l analyticsData) {
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(analyticsData, "analyticsData");
        this.action = action;
        this.analyticsData = analyticsData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC33776a getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C14567l getAnalyticsData() {
        return this.analyticsData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33783h)) {
            return false;
        }
        C33783h c33783h = (C33783h) other;
        return AbstractC22676k.m65745e(this.action, c33783h.action) && AbstractC22676k.m65745e(this.analyticsData, c33783h.analyticsData);
    }

    public int hashCode() {
        return this.analyticsData.hashCode() + (this.action.hashCode() * 31);
    }

    public String toString() {
        return "RetryState(action=" + this.action + ", analyticsData=" + this.analyticsData + ")";
    }
}
