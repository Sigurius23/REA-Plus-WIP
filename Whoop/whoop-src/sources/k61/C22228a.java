package k61;

import i91.AbstractC18247a;
import i91.AbstractC18249c;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: k61.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, m65681d2 = {"Lk61/a;", "", "Li91/a;", "background", "scrubbedBackground", "<init>", "(Li91/a;Li91/a;)V", "a", "(Li91/a;Li91/a;)Lk61/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Li91/a;", "c", "()Li91/a;", "b", "getScrubbedBackground", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22228a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC18247a background;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC18247a scrubbedBackground;

    public C22228a(AbstractC18247a background, AbstractC18247a scrubbedBackground) {
        AbstractC22676k.m65750j(background, "background");
        AbstractC22676k.m65750j(scrubbedBackground, "scrubbedBackground");
        this.background = background;
        this.scrubbedBackground = scrubbedBackground;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C22228a m63727b(C22228a c22228a, AbstractC18247a abstractC18247a, AbstractC18247a abstractC18247a2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            abstractC18247a = c22228a.background;
        }
        if ((i13 & 2) != 0) {
            abstractC18247a2 = c22228a.scrubbedBackground;
        }
        return c22228a.m63728a(abstractC18247a, abstractC18247a2);
    }

    /* JADX INFO: renamed from: a */
    public final C22228a m63728a(AbstractC18247a background, AbstractC18247a scrubbedBackground) {
        AbstractC22676k.m65750j(background, "background");
        AbstractC22676k.m65750j(scrubbedBackground, "scrubbedBackground");
        return new C22228a(background, scrubbedBackground);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC18247a getBackground() {
        return this.background;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22228a)) {
            return false;
        }
        C22228a c22228a = (C22228a) other;
        return AbstractC22676k.m65745e(this.background, c22228a.background) && AbstractC22676k.m65745e(this.scrubbedBackground, c22228a.scrubbedBackground);
    }

    public int hashCode() {
        return this.scrubbedBackground.hashCode() + (this.background.hashCode() * 31);
    }

    public String toString() {
        return "FillState(background=" + this.background + ", scrubbedBackground=" + this.scrubbedBackground + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C22228a(AbstractC18247a abstractC18247a, AbstractC18247a abstractC18247a2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 1) != 0) {
            int i14 = C17919x.f69638o;
            abstractC18247a = AbstractC18249c.m52577o(C17919x.f69629f);
        }
        if ((i13 & 2) != 0) {
            int i15 = C17919x.f69638o;
            abstractC18247a2 = AbstractC18249c.m52577o(C17919x.f69629f);
        }
        this(abstractC18247a, abstractC18247a2);
    }
}
