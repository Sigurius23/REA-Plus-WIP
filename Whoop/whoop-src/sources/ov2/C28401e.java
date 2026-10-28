package ov2;

import nv2.C27177c;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: ov2.e */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0013\u0010\n¨\u0006\u0019"}, m65681d2 = {"Lov2/e;", "Lm91/u;", "Lnv2/c;", "viewState", "", "path", "analyticsActionFromBackend", "<init>", "(Lnv2/c;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lnv2/c;", "c", "()Lnv2/c;", "b", "Ljava/lang/String;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28401e implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C27177c viewState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String path;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String analyticsActionFromBackend;

    public C28401e(C27177c viewState, String path, String str) {
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(path, "path");
        this.viewState = viewState;
        this.path = path;
        this.analyticsActionFromBackend = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAnalyticsActionFromBackend() {
        return this.analyticsActionFromBackend;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C27177c getViewState() {
        return this.viewState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28401e)) {
            return false;
        }
        C28401e c28401e = (C28401e) other;
        return AbstractC22676k.m65745e(this.viewState, c28401e.viewState) && AbstractC22676k.m65745e(this.path, c28401e.path) && AbstractC22676k.m65745e(this.analyticsActionFromBackend, c28401e.analyticsActionFromBackend);
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.viewState.hashCode() * 31, 31, this.path);
        String str = this.analyticsActionFromBackend;
        return iM30450d + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        C27177c c27177c = this.viewState;
        String str = this.path;
        String str2 = this.analyticsActionFromBackend;
        StringBuilder sb4 = new StringBuilder("ExerciseRecordsScreenState(viewState=");
        sb4.append(c27177c);
        sb4.append(", path=");
        sb4.append(str);
        sb4.append(", analyticsActionFromBackend=");
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }
}
