package p90;

import com.whoop.design.util.TextResource;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: p90.f */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\n¨\u0006\u001a"}, m65681d2 = {"Lp90/f;", "", "", "type", "Lcom/whoop/design/util/TextResource;", "message", "analyticName", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getType", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "c", "getAnalyticName", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28998f {

    /* JADX INFO: renamed from: d */
    public static final int f117313d = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource message;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String analyticName;

    public C28998f(String type, TextResource message, String analyticName) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(analyticName, "analyticName");
        this.type = type;
        this.message = message;
        this.analyticName = analyticName;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getMessage() {
        return this.message;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28998f)) {
            return false;
        }
        C28998f c28998f = (C28998f) other;
        return AbstractC22676k.m65745e(this.type, c28998f.type) && AbstractC22676k.m65745e(this.message, c28998f.message) && AbstractC22676k.m65745e(this.analyticName, c28998f.analyticName);
    }

    public int hashCode() {
        return this.analyticName.hashCode() + AbstractC31061c.m95625a(this.type.hashCode() * 31, this.message, 31);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.analyticName, ")", AbstractC30007c.m91847q("PaymentErrorCalloutState(type=", this.type, ", message=", this.message, ", analyticName="));
    }
}
