package iw0;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: iw0.h0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Liw0/h0;", "", "Lcom/whoop/design/util/TextResource;", "headerTitle", "headerSubTitle", "Lkd1/o;", "dataIcon", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Lkd1/o;", "()Lkd1/o;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20972h0 {

    /* JADX INFO: renamed from: d */
    public static final int f79239d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource headerTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource headerSubTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC22403o dataIcon;

    static {
        int i13 = AbstractC22403o.f87638a;
        int i14 = TextResource.$stable;
        f79239d = i13 | i14 | i14;
    }

    public C20972h0(TextResource headerTitle, TextResource headerSubTitle, AbstractC22403o abstractC22403o) {
        AbstractC22676k.m65750j(headerTitle, "headerTitle");
        AbstractC22676k.m65750j(headerSubTitle, "headerSubTitle");
        this.headerTitle = headerTitle;
        this.headerSubTitle = headerSubTitle;
        this.dataIcon = abstractC22403o;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC22403o getDataIcon() {
        return this.dataIcon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getHeaderSubTitle() {
        return this.headerSubTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getHeaderTitle() {
        return this.headerTitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20972h0)) {
            return false;
        }
        C20972h0 c20972h0 = (C20972h0) other;
        return AbstractC22676k.m65745e(this.headerTitle, c20972h0.headerTitle) && AbstractC22676k.m65745e(this.headerSubTitle, c20972h0.headerSubTitle) && AbstractC22676k.m65745e(this.dataIcon, c20972h0.dataIcon);
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.headerTitle.hashCode() * 31, this.headerSubTitle, 31);
        AbstractC22403o abstractC22403o = this.dataIcon;
        return iM95625a + (abstractC22403o == null ? 0 : abstractC22403o.hashCode());
    }

    public String toString() {
        TextResource textResource = this.headerTitle;
        TextResource textResource2 = this.headerSubTitle;
        AbstractC22403o abstractC22403o = this.dataIcon;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("HeaderToolBarState(headerTitle=", textResource, ", headerSubTitle=", textResource2, ", dataIcon=");
        sbM106658q.append(abstractC22403o);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public /* synthetic */ C20972h0(TextResource textResource, TextResource textResource2, AbstractC22403o abstractC22403o, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 4) != 0 ? null : abstractC22403o);
    }
}
