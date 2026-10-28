package ej1;

import com.whoop.design.util.TextResource;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: ej1.j0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lej1/j0;", "Lm91/u;", "", "Lej1/z;", "heartScreenerStatuses", "Lcom/whoop/design/util/TextResource;", "spanningText", "<init>", "(Ljava/util/List;Lcom/whoop/design/util/TextResource;)V", "a", "(Ljava/util/List;Lcom/whoop/design/util/TextResource;)Lej1/j0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13247j0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C13263z> heartScreenerStatuses;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource spanningText;

    public C13247j0(List<C13263z> heartScreenerStatuses, TextResource textResource) {
        AbstractC22676k.m65750j(heartScreenerStatuses, "heartScreenerStatuses");
        this.heartScreenerStatuses = heartScreenerStatuses;
        this.spanningText = textResource;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C13247j0 m37225b(C13247j0 c13247j0, List list, TextResource textResource, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = c13247j0.heartScreenerStatuses;
        }
        if ((i13 & 2) != 0) {
            textResource = c13247j0.spanningText;
        }
        return c13247j0.m37226a(list, textResource);
    }

    /* JADX INFO: renamed from: a */
    public final C13247j0 m37226a(List<C13263z> heartScreenerStatuses, TextResource spanningText) {
        AbstractC22676k.m65750j(heartScreenerStatuses, "heartScreenerStatuses");
        return new C13247j0(heartScreenerStatuses, spanningText);
    }

    /* JADX INFO: renamed from: c */
    public final List<C13263z> m37227c() {
        return this.heartScreenerStatuses;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getSpanningText() {
        return this.spanningText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13247j0)) {
            return false;
        }
        C13247j0 c13247j0 = (C13247j0) other;
        return AbstractC22676k.m65745e(this.heartScreenerStatuses, c13247j0.heartScreenerStatuses) && AbstractC22676k.m65745e(this.spanningText, c13247j0.spanningText);
    }

    public int hashCode() {
        int iHashCode = this.heartScreenerStatuses.hashCode() * 31;
        TextResource textResource = this.spanningText;
        return iHashCode + (textResource == null ? 0 : textResource.hashCode());
    }

    public String toString() {
        return "ScreenerStatusTileBodyViewState(heartScreenerStatuses=" + this.heartScreenerStatuses + ", spanningText=" + this.spanningText + ")";
    }
}
