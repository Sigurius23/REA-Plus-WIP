package n42;

import com.whoop.design.util.TextResource;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: n42.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0015\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001d"}, m65681d2 = {"Ln42/a;", "", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "", "Ln42/d;", "dataSharingBoxes", "disclaimer", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26277a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C26280d> dataSharingBoxes;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource disclaimer;

    public C26277a(TextResource title, TextResource subtitle, List<C26280d> dataSharingBoxes, TextResource disclaimer) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(dataSharingBoxes, "dataSharingBoxes");
        AbstractC22676k.m65750j(disclaimer, "disclaimer");
        this.title = title;
        this.subtitle = subtitle;
        this.dataSharingBoxes = dataSharingBoxes;
        this.disclaimer = disclaimer;
    }

    /* JADX INFO: renamed from: a */
    public final List<C26280d> m77965a() {
        return this.dataSharingBoxes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getDisclaimer() {
        return this.disclaimer;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26277a)) {
            return false;
        }
        C26277a c26277a = (C26277a) other;
        return AbstractC22676k.m65745e(this.title, c26277a.title) && AbstractC22676k.m65745e(this.subtitle, c26277a.subtitle) && AbstractC22676k.m65745e(this.dataSharingBoxes, c26277a.dataSharingBoxes) && AbstractC22676k.m65745e(this.disclaimer, c26277a.disclaimer);
    }

    public int hashCode() {
        return this.disclaimer.hashCode() + AbstractC11895b.m31983b(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.subtitle, 31), 31, this.dataSharingBoxes);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        List<C26280d> list = this.dataSharingBoxes;
        TextResource textResource3 = this.disclaimer;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("AccountDataSharingViewState(title=", textResource, ", subtitle=", textResource2, ", dataSharingBoxes=");
        sbM106658q.append(list);
        sbM106658q.append(", disclaimer=");
        sbM106658q.append(textResource3);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
