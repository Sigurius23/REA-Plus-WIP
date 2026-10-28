package rq0;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: rq0.v0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lrq0/v0;", "", "", "name", "", "sortType", "analyticsAction", "index", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "I", "d", "()I", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31700v0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int sortType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String analyticsAction;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int index;

    public C31700v0(String name, int i13, String analyticsAction, int i14) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(analyticsAction, "analyticsAction");
        this.name = name;
        this.sortType = i13;
        this.analyticsAction = analyticsAction;
        this.index = i14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAnalyticsAction() {
        return this.analyticsAction;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getSortType() {
        return this.sortType;
    }
}
