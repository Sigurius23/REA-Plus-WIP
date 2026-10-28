package px0;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: px0.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Lpx0/e;", "", "", "index", "name", "style", "", "isBoundary", "isCurrent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "Z", "()Z", "e", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29595e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String index;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String style;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isBoundary;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isCurrent;

    public C29595e(String index, String name, String style, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(index, "index");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(style, "style");
        this.index = index;
        this.name = name;
        this.style = style;
        this.isBoundary = z4;
        this.isCurrent = z13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsBoundary() {
        return this.isBoundary;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsCurrent() {
        return this.isCurrent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29595e)) {
            return false;
        }
        C29595e c29595e = (C29595e) other;
        return AbstractC22676k.m65745e(this.index, c29595e.index) && AbstractC22676k.m65745e(this.name, c29595e.name) && AbstractC22676k.m65745e(this.style, c29595e.style) && this.isBoundary == c29595e.isBoundary && this.isCurrent == c29595e.isCurrent;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isCurrent) + AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.index.hashCode() * 31, 31, this.name), 31, this.style), 31, this.isBoundary);
    }

    public String toString() {
        String str = this.index;
        String str2 = this.name;
        String str3 = this.style;
        boolean z4 = this.isBoundary;
        boolean z13 = this.isCurrent;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PlaygroundStackEntry(index=", str, ", name=", str2, ", style=");
        AbstractC38963t7.m124390t(sbM32001t, str3, ", isBoundary=", z4, ", isCurrent=");
        return AbstractC18489d0.m53372m(sbM32001t, z13, ")");
    }
}
