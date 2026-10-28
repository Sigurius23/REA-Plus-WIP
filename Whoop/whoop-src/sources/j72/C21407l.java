package j72;

import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: j72.l */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lj72/l;", "", "Lcom/whoop/design/util/TextResource;", "title", "", "optionId", "", "initiallySelected", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/lang/String;", "Z", "()Z", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21407l {

    /* JADX INFO: renamed from: d */
    public static final int f82073d = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String optionId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean initiallySelected;

    public C21407l(TextResource title, String optionId, boolean z4) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(optionId, "optionId");
        this.title = title;
        this.optionId = optionId;
        this.initiallySelected = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getInitiallySelected() {
        return this.initiallySelected;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getOptionId() {
        return this.optionId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21407l)) {
            return false;
        }
        C21407l c21407l = (C21407l) other;
        return AbstractC22676k.m65745e(this.title, c21407l.title) && AbstractC22676k.m65745e(this.optionId, c21407l.optionId) && this.initiallySelected == c21407l.initiallySelected;
    }

    public int hashCode() {
        return Boolean.hashCode(this.initiallySelected) + AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.optionId);
    }

    public String toString() {
        TextResource textResource = this.title;
        String str = this.optionId;
        return AbstractC18489d0.m53372m(AbstractC30007c.m91845o("SelectionOptionState(title=", textResource, ", optionId=", str, ", initiallySelected="), this.initiallySelected, ")");
    }
}
