package vt1;

import com.whoop.design.util.TextResource;
import java.util.List;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: vt1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lvt1/e;", "", "Lcom/whoop/design/util/TextResource;", "sectionTitle", "", "Lkd1/o;", "webpageLinks", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/util/List;", "()Ljava/util/List;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36491e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource sectionTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<AbstractC22403o> webpageLinks;

    /* JADX WARN: Multi-variable type inference failed */
    public C36491e(TextResource sectionTitle, List<? extends AbstractC22403o> webpageLinks) {
        AbstractC22676k.m65750j(sectionTitle, "sectionTitle");
        AbstractC22676k.m65750j(webpageLinks, "webpageLinks");
        this.sectionTitle = sectionTitle;
        this.webpageLinks = webpageLinks;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getSectionTitle() {
        return this.sectionTitle;
    }

    /* JADX INFO: renamed from: b */
    public final List<AbstractC22403o> m116948b() {
        return this.webpageLinks;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36491e)) {
            return false;
        }
        C36491e c36491e = (C36491e) other;
        return AbstractC22676k.m65745e(this.sectionTitle, c36491e.sectionTitle) && AbstractC22676k.m65745e(this.webpageLinks, c36491e.webpageLinks);
    }

    public int hashCode() {
        return this.webpageLinks.hashCode() + (this.sectionTitle.hashCode() * 31);
    }

    public String toString() {
        return AbstractC30007c.m91839i(this.sectionTitle, "RegulatoryInfoViewState(sectionTitle=", ", webpageLinks=", ")", this.webpageLinks);
    }
}
