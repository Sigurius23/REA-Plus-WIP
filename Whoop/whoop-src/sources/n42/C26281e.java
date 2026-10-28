package n42;

import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: n42.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0016\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b\u001a\u0010 ¨\u0006!"}, m65681d2 = {"Ln42/e;", "", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "", "Ln42/b;", "accountList", "footer", "", "display", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "d", "c", "Ljava/util/List;", "()Ljava/util/List;", "Z", "()Z", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26281e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C26278b> accountList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource footer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean display;

    public C26281e(TextResource title, TextResource subtitle, List<C26278b> accountList, TextResource footer, boolean z4) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(accountList, "accountList");
        AbstractC22676k.m65750j(footer, "footer");
        this.title = title;
        this.subtitle = subtitle;
        this.accountList = accountList;
        this.footer = footer;
        this.display = z4;
    }

    /* JADX INFO: renamed from: a */
    public final List<C26278b> m77977a() {
        return this.accountList;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getDisplay() {
        return this.display;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26281e)) {
            return false;
        }
        C26281e c26281e = (C26281e) other;
        return AbstractC22676k.m65745e(this.title, c26281e.title) && AbstractC22676k.m65745e(this.subtitle, c26281e.subtitle) && AbstractC22676k.m65745e(this.accountList, c26281e.accountList) && AbstractC22676k.m65745e(this.footer, c26281e.footer) && this.display == c26281e.display;
    }

    public int hashCode() {
        return Boolean.hashCode(this.display) + AbstractC31061c.m95625a(AbstractC11895b.m31983b(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.subtitle, 31), 31, this.accountList), this.footer, 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        List<C26278b> list = this.accountList;
        TextResource textResource3 = this.footer;
        boolean z4 = this.display;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("DataSharingViewState(title=", textResource, ", subtitle=", textResource2, ", accountList=");
        AbstractC30007c.m91852v(textResource3, ", footer=", ", display=", sbM106658q, list);
        return AbstractC18489d0.m53372m(sbM106658q, z4, ")");
    }
}
