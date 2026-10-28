package ic2;

import com.whoop.design.util.TextResource;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: ic2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lic2/a;", "", "", "isActive", "", "namespace", "Lcom/whoop/design/util/TextResource;", "subtitle", "title", "<init>", "(ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "d", "()Z", "b", "Ljava/lang/String;", "c", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18396a {

    /* JADX INFO: renamed from: e */
    public static final int f71567e = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isActive;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String namespace;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource title;

    public C18396a(boolean z4, String namespace, TextResource subtitle, TextResource title) {
        AbstractC22676k.m65750j(namespace, "namespace");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(title, "title");
        this.isActive = z4;
        this.namespace = namespace;
        this.subtitle = subtitle;
        this.title = title;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getNamespace() {
        return this.namespace;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18396a)) {
            return false;
        }
        C18396a c18396a = (C18396a) other;
        return this.isActive == c18396a.isActive && AbstractC22676k.m65745e(this.namespace, c18396a.namespace) && AbstractC22676k.m65745e(this.subtitle, c18396a.subtitle) && AbstractC22676k.m65745e(this.title, c18396a.title);
    }

    public int hashCode() {
        return this.title.hashCode() + AbstractC31061c.m95625a(AbstractC11266d.m30450d(Boolean.hashCode(this.isActive) * 31, 31, this.namespace), this.subtitle, 31);
    }

    public String toString() {
        boolean z4 = this.isActive;
        String str = this.namespace;
        return AbstractC33745d.m106655n(AbstractC13673n.m38567n("IndividualSettingsViewState(isActive=", ", namespace=", str, ", subtitle=", z4), this.subtitle, ", title=", this.title, ")");
    }
}
