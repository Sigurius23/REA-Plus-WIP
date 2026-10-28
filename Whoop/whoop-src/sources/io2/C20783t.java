package io2;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: io2.t */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lio2/t;", "", "Lcom/whoop/design/util/TextResource;", "title", "body", "ctaText", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "b", "c", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20783t {

    /* JADX INFO: renamed from: e */
    public static final int f78047e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource body;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource ctaText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C9598e destination;

    static {
        int i13 = C9598e.f28134d;
        int i14 = TextResource.$stable;
        f78047e = i13 | i14 | i14 | i14;
    }

    public C20783t(TextResource title, TextResource textResource, TextResource textResource2, C9598e c9598e) {
        AbstractC22676k.m65750j(title, "title");
        this.title = title;
        this.body = textResource;
        this.ctaText = textResource2;
        this.destination = c9598e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20783t)) {
            return false;
        }
        C20783t c20783t = (C20783t) other;
        return AbstractC22676k.m65745e(this.title, c20783t.title) && AbstractC22676k.m65745e(this.body, c20783t.body) && AbstractC22676k.m65745e(this.ctaText, c20783t.ctaText) && AbstractC22676k.m65745e(this.destination, c20783t.destination);
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        TextResource textResource = this.body;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        TextResource textResource2 = this.ctaText;
        int iHashCode3 = (iHashCode2 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        C9598e c9598e = this.destination;
        return iHashCode3 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.body;
        TextResource textResource3 = this.ctaText;
        C9598e c9598e = this.destination;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("OrderDetailsSummaryViewState(title=", textResource, ", body=", textResource2, ", ctaText=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", destination=");
        sbM106658q.append(c9598e);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
