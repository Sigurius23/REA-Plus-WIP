package nj2;

import com.whoop.design.util.TextResource;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: nj2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b\u001e\u0010\u000e¨\u0006 "}, m65681d2 = {"Lnj2/f;", "", "", "isLoading", "Lcom/whoop/design/util/TextResource;", "title", "backButtonEnabled", "forwardButtonEnabled", "", "backDate", "forwardDate", "<init>", "(ZLcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "f", "()Z", "b", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "c", "d", "Ljava/lang/String;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26759f {

    /* JADX INFO: renamed from: g */
    public static final int f106503g = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean backButtonEnabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean forwardButtonEnabled;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String backDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String forwardDate;

    public C26759f(boolean z4, TextResource title, boolean z13, boolean z14, String backDate, String forwardDate) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(backDate, "backDate");
        AbstractC22676k.m65750j(forwardDate, "forwardDate");
        this.isLoading = z4;
        this.title = title;
        this.backButtonEnabled = z13;
        this.forwardButtonEnabled = z14;
        this.backDate = backDate;
        this.forwardDate = forwardDate;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getBackButtonEnabled() {
        return this.backButtonEnabled;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBackDate() {
        return this.backDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getForwardButtonEnabled() {
        return this.forwardButtonEnabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getForwardDate() {
        return this.forwardDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26759f)) {
            return false;
        }
        C26759f c26759f = (C26759f) other;
        return this.isLoading == c26759f.isLoading && AbstractC22676k.m65745e(this.title, c26759f.title) && this.backButtonEnabled == c26759f.backButtonEnabled && this.forwardButtonEnabled == c26759f.forwardButtonEnabled && AbstractC22676k.m65745e(this.backDate, c26759f.backDate) && AbstractC22676k.m65745e(this.forwardDate, c26759f.forwardDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public int hashCode() {
        return this.forwardDate.hashCode() + AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC31061c.m95625a(Boolean.hashCode(this.isLoading) * 31, this.title, 31), 31, this.backButtonEnabled), 31, this.forwardButtonEnabled), 31, this.backDate);
    }

    public String toString() {
        boolean z4 = this.isLoading;
        TextResource textResource = this.title;
        boolean z13 = this.backButtonEnabled;
        boolean z14 = this.forwardButtonEnabled;
        String str = this.backDate;
        String str2 = this.forwardDate;
        StringBuilder sb4 = new StringBuilder("StressDateSelectorState(isLoading=");
        sb4.append(z4);
        sb4.append(", title=");
        sb4.append(textResource);
        sb4.append(", backButtonEnabled=");
        AbstractC38963t7.m124392v(sb4, z13, ", forwardButtonEnabled=", z14, ", backDate=");
        return AbstractC11266d.m30464r(sb4, str, ", forwardDate=", str2, ")");
    }
}
