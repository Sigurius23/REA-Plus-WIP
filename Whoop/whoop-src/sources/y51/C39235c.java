package y51;

import com.whoop.design.util.TextResource;
import java.util.List;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: y51.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Ly51/c;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "cta", "", "target", "", "faqs", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "c", "Ljava/lang/String;", "d", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39235c implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource cta;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String target;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<InterfaceC25312u> faqs;

    /* JADX WARN: Multi-variable type inference failed */
    public C39235c(TextResource title, TextResource cta, String target, List<? extends InterfaceC25312u> faqs) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(cta, "cta");
        AbstractC22676k.m65750j(target, "target");
        AbstractC22676k.m65750j(faqs, "faqs");
        this.title = title;
        this.cta = cta;
        this.target = target;
        this.faqs = faqs;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC25312u> m125014b() {
        return this.faqs;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTarget() {
        return this.target;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39235c)) {
            return false;
        }
        C39235c c39235c = (C39235c) other;
        return AbstractC22676k.m65745e(this.title, c39235c.title) && AbstractC22676k.m65745e(this.cta, c39235c.cta) && AbstractC22676k.m65745e(this.target, c39235c.target) && AbstractC22676k.m65745e(this.faqs, c39235c.faqs);
    }

    public int hashCode() {
        return this.faqs.hashCode() + AbstractC11266d.m30450d(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.cta, 31), 31, this.target);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.cta;
        return AbstractC30007c.m91840j(this.target, ", faqs=", ")", AbstractC33745d.m106658q("FaqState(title=", textResource, ", cta=", textResource2, ", target="), this.faqs);
    }
}
