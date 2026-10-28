package wt2;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: wt2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016¨\u0006\u001d"}, m65681d2 = {"Lwt2/b;", "", "Lcom/whoop/design/util/TextResource;", "title", "description", "buttonText", "cancelButtonText", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "getTitle", "()Lcom/whoop/design/util/TextResource;", "b", "getDescription", "c", "getButtonText", "d", "getCancelButtonText", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37621b {

    /* JADX INFO: renamed from: e */
    public static final int f160989e = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource description;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource buttonText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource cancelButtonText;

    public C37621b(TextResource title, TextResource description, TextResource buttonText, TextResource cancelButtonText) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(buttonText, "buttonText");
        AbstractC22676k.m65750j(cancelButtonText, "cancelButtonText");
        this.title = title;
        this.description = description;
        this.buttonText = buttonText;
        this.cancelButtonText = cancelButtonText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37621b)) {
            return false;
        }
        C37621b c37621b = (C37621b) other;
        return AbstractC22676k.m65745e(this.title, c37621b.title) && AbstractC22676k.m65745e(this.description, c37621b.description) && AbstractC22676k.m65745e(this.buttonText, c37621b.buttonText) && AbstractC22676k.m65745e(this.cancelButtonText, c37621b.cancelButtonText);
    }

    public int hashCode() {
        return this.cancelButtonText.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.description, 31), this.buttonText, 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.description;
        return AbstractC33745d.m106655n(AbstractC33745d.m106658q("CancelPlanModalState(title=", textResource, ", description=", textResource2, ", buttonText="), this.buttonText, ", cancelButtonText=", this.cancelButtonText, ")");
    }
}
