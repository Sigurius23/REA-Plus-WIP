package h31;

import i91.AbstractC18247a;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: h31.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lh31/a;", "", "Li91/a;", "background", "Li2/x;", "spinnerColor", "<init>", "(Li91/a;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li91/a;", "()Li91/a;", "b", "J", "()J", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C16808a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC18247a background;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long spinnerColor;

    public /* synthetic */ C16808a(AbstractC18247a abstractC18247a, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC18247a, j7);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC18247a getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getSpinnerColor() {
        return this.spinnerColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16808a)) {
            return false;
        }
        C16808a c16808a = (C16808a) other;
        return AbstractC22676k.m65745e(this.background, c16808a.background) && C17919x.m51542d(this.spinnerColor, c16808a.spinnerColor);
    }

    public int hashCode() {
        int iHashCode = this.background.hashCode() * 31;
        long j7 = this.spinnerColor;
        int i13 = C17919x.f69638o;
        return Long.hashCode(j7) + iHashCode;
    }

    public String toString() {
        return "LoadingChrome(background=" + this.background + ", spinnerColor=" + C17919x.m51548j(this.spinnerColor) + ")";
    }

    private C16808a(AbstractC18247a background, long j7) {
        AbstractC22676k.m65750j(background, "background");
        this.background = background;
        this.spinnerColor = j7;
    }
}
