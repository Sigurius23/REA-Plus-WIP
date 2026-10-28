package r31;

import java.util.List;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: r31.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, m65681d2 = {"Lr31/a;", "", "", "", "selectionIds", "", "path", "widgetId", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getSelectionIds", "()Ljava/util/List;", "b", "Ljava/lang/String;", "getPath", "c", "getWidgetId", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30906a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<Integer> selectionIds;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String path;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String widgetId;

    public C30906a(List<Integer> selectionIds, String path, String widgetId) {
        AbstractC22676k.m65750j(selectionIds, "selectionIds");
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(widgetId, "widgetId");
        this.selectionIds = selectionIds;
        this.path = path;
        this.widgetId = widgetId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30906a)) {
            return false;
        }
        C30906a c30906a = (C30906a) other;
        return AbstractC22676k.m65745e(this.selectionIds, c30906a.selectionIds) && AbstractC22676k.m65745e(this.path, c30906a.path) && AbstractC22676k.m65745e(this.widgetId, c30906a.widgetId);
    }

    public int hashCode() {
        return this.widgetId.hashCode() + AbstractC11266d.m30450d(this.selectionIds.hashCode() * 31, 31, this.path);
    }

    public String toString() {
        List<Integer> list = this.selectionIds;
        return AbstractC25012a.m73376i(this.widgetId, ")", AbstractC26725a.m79507k("CommitSelection(selectionIds=", ", path=", this.path, ", widgetId=", list));
    }
}
