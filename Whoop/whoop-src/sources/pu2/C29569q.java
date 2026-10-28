package pu2;

import com.whoop.design.util.TextResource;
import cu2.AbstractC11123c;
import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: pu2.q */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lpu2/q;", "", "Lcom/whoop/design/util/TextResource;", "title", "", "titleColor", "", "upNextVisible", "<init>", "(Lcom/whoop/design/util/TextResource;IZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "b", "I", "c", "Z", "()Z", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29569q {

    /* JADX INFO: renamed from: d */
    public static final int f120633d = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int titleColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean upNextVisible;

    public C29569q(TextResource title, int i13, boolean z4) {
        AbstractC22676k.m65750j(title, "title");
        this.title = title;
        this.titleColor = i13;
        this.upNextVisible = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getTitleColor() {
        return this.titleColor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getUpNextVisible() {
        return this.upNextVisible;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29569q)) {
            return false;
        }
        C29569q c29569q = (C29569q) other;
        return AbstractC22676k.m65745e(this.title, c29569q.title) && this.titleColor == c29569q.titleColor && this.upNextVisible == c29569q.upNextVisible;
    }

    public int hashCode() {
        return Boolean.hashCode(this.upNextVisible) + AbstractC11266d.m30448b(this.titleColor, this.title.hashCode() * 31, 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        int i13 = this.titleColor;
        boolean z4 = this.upNextVisible;
        StringBuilder sb4 = new StringBuilder("NotificationHeaderState(title=");
        sb4.append(textResource);
        sb4.append(", titleColor=");
        sb4.append(i13);
        sb4.append(", upNextVisible=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }

    public /* synthetic */ C29569q(TextResource textResource, int i13, boolean z4, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, (i14 & 2) != 0 ? AbstractC11123c.f35347d : i13, (i14 & 4) != 0 ? false : z4);
    }
}
