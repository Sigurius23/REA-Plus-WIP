package in1;

import com.whoop.design.util.TextResource;
import java.util.List;
import ln1.C24526d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: in1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018¨\u0006\u001f"}, m65681d2 = {"Lin1/e;", "", "Lcom/whoop/design/util/TextResource;", "title", "listHeader", "", "Lln1/d;", "metrics", "primaryButtonText", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "getTitle", "()Lcom/whoop/design/util/TextResource;", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "getPrimaryButtonText", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18725e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource listHeader;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C24526d> metrics;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource primaryButtonText;

    public C18725e(TextResource title, TextResource listHeader, List<C24526d> metrics, TextResource primaryButtonText) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(listHeader, "listHeader");
        AbstractC22676k.m65750j(metrics, "metrics");
        AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
        this.title = title;
        this.listHeader = listHeader;
        this.metrics = metrics;
        this.primaryButtonText = primaryButtonText;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getListHeader() {
        return this.listHeader;
    }

    /* JADX INFO: renamed from: b */
    public final List<C24526d> m54461b() {
        return this.metrics;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18725e)) {
            return false;
        }
        C18725e c18725e = (C18725e) other;
        return AbstractC22676k.m65745e(this.title, c18725e.title) && AbstractC22676k.m65745e(this.listHeader, c18725e.listHeader) && AbstractC22676k.m65745e(this.metrics, c18725e.metrics) && AbstractC22676k.m65745e(this.primaryButtonText, c18725e.primaryButtonText);
    }

    public int hashCode() {
        return this.primaryButtonText.hashCode() + AbstractC11895b.m31983b(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.listHeader, 31), 31, this.metrics);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.listHeader;
        List<C24526d> list = this.metrics;
        TextResource textResource3 = this.primaryButtonText;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("EditableGaugeMetricsViewState(title=", textResource, ", listHeader=", textResource2, ", metrics=");
        sbM106658q.append(list);
        sbM106658q.append(", primaryButtonText=");
        sbM106658q.append(textResource3);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
