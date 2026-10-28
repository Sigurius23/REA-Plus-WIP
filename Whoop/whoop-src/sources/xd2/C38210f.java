package xd2;

import c13.AbstractC3855a;
import com.whoop.design.util.TextResource;
import java.util.List;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: xd2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lxd2/f;", "", "Lcom/whoop/design/util/TextResource;", "title", "", "id", "", "Lxd2/e;", "items", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "Ljava/lang/String;", "getId", "c", "Ljava/util/List;", "()Ljava/util/List;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38210f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C38209e> items;

    public C38210f(TextResource title, String id4, List<C38209e> items) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(items, "items");
        this.title = title;
        this.id = id4;
        this.items = items;
    }

    /* JADX INFO: renamed from: a */
    public final List<C38209e> m122427a() {
        return this.items;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38210f)) {
            return false;
        }
        C38210f c38210f = (C38210f) other;
        return AbstractC22676k.m65745e(this.title, c38210f.title) && AbstractC22676k.m65745e(this.id, c38210f.id) && AbstractC22676k.m65745e(this.items, c38210f.items);
    }

    public int hashCode() {
        return this.items.hashCode() + AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.id);
    }

    public String toString() {
        TextResource textResource = this.title;
        String str = this.id;
        return AbstractC3855a.m11829m(AbstractC30007c.m91845o("ShepherdHistoryRecordSection(title=", textResource, ", id=", str, ", items="), this.items, ")");
    }
}
