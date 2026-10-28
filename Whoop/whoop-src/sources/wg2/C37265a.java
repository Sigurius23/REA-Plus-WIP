package wg2;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: wg2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0015\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lwg2/a;", "Lm91/u;", "", "id", "path", "", "showLoading", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "c", "Z", "()Z", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37265a implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String path;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean showLoading;

    public C37265a(String id4, String path, boolean z4) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(path, "path");
        this.id = id4;
        this.path = path;
        this.showLoading = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getShowLoading() {
        return this.showLoading;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37265a)) {
            return false;
        }
        C37265a c37265a = (C37265a) other;
        return AbstractC22676k.m65745e(this.id, c37265a.id) && AbstractC22676k.m65745e(this.path, c37265a.path) && this.showLoading == c37265a.showLoading;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showLoading) + AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.path);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.path;
        return AbstractC18489d0.m53372m(AbstractC11895b.m32001t("TargetsCardItemViewState(id=", str, ", path=", str2, ", showLoading="), this.showLoading, ")");
    }
}
