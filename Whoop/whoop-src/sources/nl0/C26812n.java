package nl0;

import com.whoop.design.util.TextResource;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: nl0.n */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lnl0/n;", "", "", "id", "Lcom/whoop/design/util/TextResource;", "message", "Lkd1/o;", "icon", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lkd1/o;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "Lkd1/o;", "()Lkd1/o;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26812n {

    /* JADX INFO: renamed from: d */
    public static final int f106870d = AbstractC22403o.f87638a | TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource message;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC22403o icon;

    public C26812n(String id4, TextResource message, AbstractC22403o abstractC22403o) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(message, "message");
        this.id = id4;
        this.message = message;
        this.icon = abstractC22403o;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC22403o getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getMessage() {
        return this.message;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26812n)) {
            return false;
        }
        C26812n c26812n = (C26812n) other;
        return AbstractC22676k.m65745e(this.id, c26812n.id) && AbstractC22676k.m65745e(this.message, c26812n.message) && AbstractC22676k.m65745e(this.icon, c26812n.icon);
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.id.hashCode() * 31, this.message, 31);
        AbstractC22403o abstractC22403o = this.icon;
        return iM95625a + (abstractC22403o == null ? 0 : abstractC22403o.hashCode());
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.message;
        AbstractC22403o abstractC22403o = this.icon;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("PastConversationItem(id=", str, ", message=", textResource, ", icon=");
        sbM91847q.append(abstractC22403o);
        sbM91847q.append(")");
        return sbM91847q.toString();
    }
}
