package h02;

import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: h02.l */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lh02/l;", "", "Lcom/whoop/design/util/TextResource;", "title", "annotatedText", "", "isCollapsed", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "c", "Z", "()Z", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16582l {

    /* JADX INFO: renamed from: d */
    public static final int f63833d = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource annotatedText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isCollapsed;

    public C16582l(TextResource title, TextResource annotatedText, boolean z4) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(annotatedText, "annotatedText");
        this.title = title;
        this.annotatedText = annotatedText;
        this.isCollapsed = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getAnnotatedText() {
        return this.annotatedText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsCollapsed() {
        return this.isCollapsed;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16582l)) {
            return false;
        }
        C16582l c16582l = (C16582l) other;
        return AbstractC22676k.m65745e(this.title, c16582l.title) && AbstractC22676k.m65745e(this.annotatedText, c16582l.annotatedText) && this.isCollapsed == c16582l.isCollapsed;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isCollapsed) + AbstractC31061c.m95625a(this.title.hashCode() * 31, this.annotatedText, 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.annotatedText;
        return AbstractC18489d0.m53372m(AbstractC33745d.m106658q("ProductAccordionEntryState(title=", textResource, ", annotatedText=", textResource2, ", isCollapsed="), this.isCollapsed, ")");
    }

    public /* synthetic */ C16582l(TextResource textResource, TextResource textResource2, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new TextResource.C8691e("") : textResource, (i13 & 2) != 0 ? new TextResource.C8691e("") : textResource2, (i13 & 4) != 0 ? true : z4);
    }
}
