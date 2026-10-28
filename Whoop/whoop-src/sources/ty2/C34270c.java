package ty2;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: ty2.c */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001b"}, m65681d2 = {"Lty2/c;", "", "Lcom/whoop/design/util/TextResource;", "cta", "title", "body", "primaryCta", "secondaryCta", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "e", "c", "d", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34270c {

    /* JADX INFO: renamed from: f */
    public static final int f143943f = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource cta;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource body;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource primaryCta;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource secondaryCta;

    public C34270c(TextResource cta, TextResource title, TextResource body, TextResource primaryCta, TextResource secondaryCta) {
        AbstractC22676k.m65750j(cta, "cta");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(primaryCta, "primaryCta");
        AbstractC22676k.m65750j(secondaryCta, "secondaryCta");
        this.cta = cta;
        this.title = title;
        this.body = body;
        this.primaryCta = primaryCta;
        this.secondaryCta = secondaryCta;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getPrimaryCta() {
        return this.primaryCta;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSecondaryCta() {
        return this.secondaryCta;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34270c)) {
            return false;
        }
        C34270c c34270c = (C34270c) other;
        return AbstractC22676k.m65745e(this.cta, c34270c.cta) && AbstractC22676k.m65745e(this.title, c34270c.title) && AbstractC22676k.m65745e(this.body, c34270c.body) && AbstractC22676k.m65745e(this.primaryCta, c34270c.primaryCta) && AbstractC22676k.m65745e(this.secondaryCta, c34270c.secondaryCta);
    }

    public int hashCode() {
        return this.secondaryCta.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.cta.hashCode() * 31, this.title, 31), this.body, 31), this.primaryCta, 31);
    }

    public String toString() {
        TextResource textResource = this.cta;
        TextResource textResource2 = this.title;
        TextResource textResource3 = this.body;
        TextResource textResource4 = this.primaryCta;
        TextResource textResource5 = this.secondaryCta;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("CancelStudyViewState(cta=", textResource, ", title=", textResource2, ", body=");
        AbstractC30007c.m91855y(sbM106658q, textResource3, ", primaryCta=", textResource4, ", secondaryCta=");
        return AbstractC30007c.m91841k(sbM106658q, textResource5, ")");
    }
}
