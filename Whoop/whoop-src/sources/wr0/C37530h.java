package wr0;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: wr0.h */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lwr0/h;", "Lm91/u;", "", "id", "path", "refreshScope", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "c", "community-moments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37530h implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String path;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String refreshScope;

    public C37530h(String id4, String path, String str) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(path, "path");
        this.id = id4;
        this.path = path;
        this.refreshScope = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getRefreshScope() {
        return this.refreshScope;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37530h)) {
            return false;
        }
        C37530h c37530h = (C37530h) other;
        return AbstractC22676k.m65745e(this.id, c37530h.id) && AbstractC22676k.m65745e(this.path, c37530h.path) && AbstractC22676k.m65745e(this.refreshScope, c37530h.refreshScope);
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.path);
        String str = this.refreshScope;
        return iM30450d + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.refreshScope, ")", AbstractC11895b.m32001t("CommunityMomentsContainerWrapperViewState(id=", this.id, ", path=", this.path, ", refreshScope="));
    }
}
