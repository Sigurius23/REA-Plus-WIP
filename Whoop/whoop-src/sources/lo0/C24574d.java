package lo0;

import com.whoop.design.models.items.SecondaryButtonModel;
import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: lo0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0018\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0015\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Llo0/d;", "Lm91/u;", "", "id", "Lcom/whoop/design/util/TextResource;", "title", "description", "Lcom/whoop/design/models/items/SecondaryButtonModel;", "cta", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/SecondaryButtonModel;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "d", "Lcom/whoop/design/models/items/SecondaryButtonModel;", "()Lcom/whoop/design/models/items/SecondaryButtonModel;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24574d implements InterfaceC25312u {

    /* JADX INFO: renamed from: e */
    public static final int f96019e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final SecondaryButtonModel cta;

    static {
        int i13 = SecondaryButtonModel.$stable;
        int i14 = TextResource.$stable;
        f96019e = i13 | i14 | i14;
    }

    public C24574d(String id4, TextResource title, TextResource description, SecondaryButtonModel secondaryButtonModel) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        this.id = id4;
        this.title = title;
        this.description = description;
        this.cta = secondaryButtonModel;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final SecondaryButtonModel getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24574d)) {
            return false;
        }
        C24574d c24574d = (C24574d) other;
        return AbstractC22676k.m65745e(this.id, c24574d.id) && AbstractC22676k.m65745e(this.title, c24574d.title) && AbstractC22676k.m65745e(this.description, c24574d.description) && AbstractC22676k.m65745e(this.cta, c24574d.cta);
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.id.hashCode() * 31, this.title, 31), this.description, 31);
        SecondaryButtonModel secondaryButtonModel = this.cta;
        return iM95625a + (secondaryButtonModel == null ? 0 : secondaryButtonModel.hashCode());
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.title;
        TextResource textResource2 = this.description;
        SecondaryButtonModel secondaryButtonModel = this.cta;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("AppointmentSummaryFieldViewState(id=", str, ", title=", textResource, ", description=");
        sbM91847q.append(textResource2);
        sbM91847q.append(", cta=");
        sbM91847q.append(secondaryButtonModel);
        sbM91847q.append(")");
        return sbM91847q.toString();
    }
}
