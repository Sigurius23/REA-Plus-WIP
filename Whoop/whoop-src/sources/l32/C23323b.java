package l32;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: l32.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, m65681d2 = {"Ll32/b;", "Lm91/u;", "", "path", "updatePath", "screenName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23323b implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String path;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String updatePath;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String screenName;

    public C23323b(String path, String updatePath, String screenName) {
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(updatePath, "updatePath");
        AbstractC22676k.m65750j(screenName, "screenName");
        this.path = path;
        this.updatePath = updatePath;
        this.screenName = screenName;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getScreenName() {
        return this.screenName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getUpdatePath() {
        return this.updatePath;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23323b)) {
            return false;
        }
        C23323b c23323b = (C23323b) other;
        return AbstractC22676k.m65745e(this.path, c23323b.path) && AbstractC22676k.m65745e(this.updatePath, c23323b.updatePath) && AbstractC22676k.m65745e(this.screenName, c23323b.screenName);
    }

    public int hashCode() {
        return this.screenName.hashCode() + AbstractC11266d.m30450d(this.path.hashCode() * 31, 31, this.updatePath);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.screenName, ")", AbstractC11895b.m32001t("MiniArchStripePaymentSheetTileItemState(path=", this.path, ", updatePath=", this.updatePath, ", screenName="));
    }
}
