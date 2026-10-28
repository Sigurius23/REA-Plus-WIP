package uq2;

import com.whoop.design.util.TextResource;
import jr2.C21905d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: uq2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u001a"}, m65681d2 = {"Luq2/a;", "", "Lcom/whoop/design/util/TextResource;", "lowEnd", "Ljr2/d;", "background", "highEnd", "<init>", "(Lcom/whoop/design/util/TextResource;Ljr2/d;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Ljr2/d;", "()Ljr2/d;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35164a {

    /* JADX INFO: renamed from: d */
    public static final int f149256d = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource lowEnd;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C21905d background;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource highEnd;

    public C35164a(TextResource lowEnd, C21905d background, TextResource highEnd) {
        AbstractC22676k.m65750j(lowEnd, "lowEnd");
        AbstractC22676k.m65750j(background, "background");
        AbstractC22676k.m65750j(highEnd, "highEnd");
        this.lowEnd = lowEnd;
        this.background = background;
        this.highEnd = highEnd;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C21905d getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getHighEnd() {
        return this.highEnd;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getLowEnd() {
        return this.lowEnd;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35164a)) {
            return false;
        }
        C35164a c35164a = (C35164a) other;
        return AbstractC22676k.m65745e(this.lowEnd, c35164a.lowEnd) && AbstractC22676k.m65745e(this.background, c35164a.background) && AbstractC22676k.m65745e(this.highEnd, c35164a.highEnd);
    }

    public int hashCode() {
        return this.highEnd.hashCode() + ((this.background.hashCode() + (this.lowEnd.hashCode() * 31)) * 31);
    }

    public String toString() {
        TextResource textResource = this.lowEnd;
        C21905d c21905d = this.background;
        TextResource textResource2 = this.highEnd;
        StringBuilder sb4 = new StringBuilder("FinaleLegend(lowEnd=");
        sb4.append(textResource);
        sb4.append(", background=");
        sb4.append(c21905d);
        sb4.append(", highEnd=");
        return AbstractC30007c.m91841k(sb4, textResource2, ")");
    }
}
