package ec2;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: ec2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lec2/a;", "", "", "id", "Lcom/whoop/design/util/TextResource;", "languageTitle", "subtitle", "", "initiallySelected", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "d", "Z", "()Z", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13010a {

    /* JADX INFO: renamed from: e */
    public static final int f44968e = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource languageTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean initiallySelected;

    public C13010a(String id4, TextResource languageTitle, TextResource subtitle, boolean z4) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(languageTitle, "languageTitle");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        this.id = id4;
        this.languageTitle = languageTitle;
        this.subtitle = subtitle;
        this.initiallySelected = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getInitiallySelected() {
        return this.initiallySelected;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getLanguageTitle() {
        return this.languageTitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13010a)) {
            return false;
        }
        C13010a c13010a = (C13010a) other;
        return AbstractC22676k.m65745e(this.id, c13010a.id) && AbstractC22676k.m65745e(this.languageTitle, c13010a.languageTitle) && AbstractC22676k.m65745e(this.subtitle, c13010a.subtitle) && this.initiallySelected == c13010a.initiallySelected;
    }

    public int hashCode() {
        return Boolean.hashCode(this.initiallySelected) + AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.id.hashCode() * 31, this.languageTitle, 31), this.subtitle, 31);
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.languageTitle;
        TextResource textResource2 = this.subtitle;
        boolean z4 = this.initiallySelected;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("LanguagePrefsItemViewState(id=", str, ", languageTitle=", textResource, ", subtitle=");
        sbM91847q.append(textResource2);
        sbM91847q.append(", initiallySelected=");
        sbM91847q.append(z4);
        sbM91847q.append(")");
        return sbM91847q.toString();
    }
}
