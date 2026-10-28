package c11;

import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25305n;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: c11.p */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJB\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0007\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001e\u0010#R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b$\u0010 ¨\u0006%"}, m65681d2 = {"Lc11/p;", "Lm91/n;", "", "id", "Lcom/whoop/design/util/TextResource;", "titleDisplay", "", "isEnabled", "Lc11/i;", "content", "isInitiallyExpanded", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLc11/i;Z)V", "a", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLc11/i;Z)Lc11/p;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "c", "Z", "()Z", "d", "Lc11/i;", "()Lc11/i;", "f", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3849p implements InterfaceC25305n<String> {

    /* JADX INFO: renamed from: f */
    public static final int f15760f = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource titleDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isEnabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C3842i content;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isInitiallyExpanded;

    public C3849p(String id4, TextResource titleDisplay, boolean z4, C3842i content, boolean z13) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(content, "content");
        this.id = id4;
        this.titleDisplay = titleDisplay;
        this.isEnabled = z4;
        this.content = content;
        this.isInitiallyExpanded = z13;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C3849p m11792b(C3849p c3849p, String str, TextResource textResource, boolean z4, C3842i c3842i, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c3849p.id;
        }
        if ((i13 & 2) != 0) {
            textResource = c3849p.titleDisplay;
        }
        if ((i13 & 4) != 0) {
            z4 = c3849p.isEnabled;
        }
        if ((i13 & 8) != 0) {
            c3842i = c3849p.content;
        }
        if ((i13 & 16) != 0) {
            z13 = c3849p.isInitiallyExpanded;
        }
        boolean z14 = z13;
        boolean z15 = z4;
        return c3849p.m11793a(str, textResource, z15, c3842i, z14);
    }

    /* JADX INFO: renamed from: a */
    public final C3849p m11793a(String id4, TextResource titleDisplay, boolean isEnabled, C3842i content, boolean isInitiallyExpanded) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(content, "content");
        return new C3849p(id4, titleDisplay, isEnabled, content, isInitiallyExpanded);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C3842i getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTitleDisplay() {
        return this.titleDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3849p)) {
            return false;
        }
        C3849p c3849p = (C3849p) other;
        return AbstractC22676k.m65745e(this.id, c3849p.id) && AbstractC22676k.m65745e(this.titleDisplay, c3849p.titleDisplay) && this.isEnabled == c3849p.isEnabled && AbstractC22676k.m65745e(this.content, c3849p.content) && this.isInitiallyExpanded == c3849p.isInitiallyExpanded;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsInitiallyExpanded() {
        return this.isInitiallyExpanded;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isInitiallyExpanded) + ((this.content.hashCode() + AbstractC2875y.m8289b(AbstractC31061c.m95625a(this.id.hashCode() * 31, this.titleDisplay, 31), 31, this.isEnabled)) * 31);
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.titleDisplay;
        boolean z4 = this.isEnabled;
        C3842i c3842i = this.content;
        boolean z13 = this.isInitiallyExpanded;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("SingleContributorContainerViewState(id=", str, ", titleDisplay=", textResource, ", isEnabled=");
        sbM91847q.append(z4);
        sbM91847q.append(", content=");
        sbM91847q.append(c3842i);
        sbM91847q.append(", isInitiallyExpanded=");
        return AbstractC18489d0.m53372m(sbM91847q, z13, ")");
    }

    @Override // p720m91.InterfaceC25305n
    public String getId() {
        return this.id;
    }

    public /* synthetic */ C3849p(String str, TextResource textResource, boolean z4, C3842i c3842i, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textResource, z4, c3842i, (i13 & 16) != 0 ? false : z13);
    }
}
