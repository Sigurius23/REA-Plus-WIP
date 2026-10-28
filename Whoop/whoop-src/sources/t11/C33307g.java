package t11;

import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: t11.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lt11/g;", "", "", "id", "Lcom/whoop/design/util/TextResource;", "text", "", "autoFocus", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33307g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource text;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean autoFocus;

    public C33307g(String id4, TextResource text, boolean z4) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(text, "text");
        this.id = id4;
        this.text = text;
        this.autoFocus = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAutoFocus() {
        return this.autoFocus;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33307g)) {
            return false;
        }
        C33307g c33307g = (C33307g) other;
        return AbstractC22676k.m65745e(this.id, c33307g.id) && AbstractC22676k.m65745e(this.text, c33307g.text) && this.autoFocus == c33307g.autoFocus;
    }

    public int hashCode() {
        return Boolean.hashCode(this.autoFocus) + AbstractC31061c.m95625a(this.id.hashCode() * 31, this.text, 31);
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.text;
        return AbstractC18489d0.m53372m(AbstractC30007c.m91847q("InteractiveTileState(id=", str, ", text=", textResource, ", autoFocus="), this.autoFocus, ")");
    }
}
