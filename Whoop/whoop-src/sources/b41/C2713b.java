package b41;

import d13.AbstractC11478a;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b41.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000f\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lb41/b;", "", "", "text", "", "isSecure", "isExceedMaxLength", "<init>", "(Ljava/lang/String;ZLjava/lang/Boolean;)V", "a", "(Ljava/lang/String;ZLjava/lang/Boolean;)Lb41/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "Z", "e", "()Z", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C2713b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isSecure;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Boolean isExceedMaxLength;

    public C2713b(String str, boolean z4, Boolean bool) {
        this.text = str;
        this.isSecure = z4;
        this.isExceedMaxLength = bool;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C2713b m7597b(C2713b c2713b, String str, boolean z4, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c2713b.text;
        }
        if ((i13 & 2) != 0) {
            z4 = c2713b.isSecure;
        }
        if ((i13 & 4) != 0) {
            bool = c2713b.isExceedMaxLength;
        }
        return c2713b.m7598a(str, z4, bool);
    }

    /* JADX INFO: renamed from: a */
    public final C2713b m7598a(String text, boolean isSecure, Boolean isExceedMaxLength) {
        return new C2713b(text, isSecure, isExceedMaxLength);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getIsExceedMaxLength() {
        return this.isExceedMaxLength;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsSecure() {
        return this.isSecure;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2713b)) {
            return false;
        }
        C2713b c2713b = (C2713b) other;
        return AbstractC22676k.m65745e(this.text, c2713b.text) && this.isSecure == c2713b.isSecure && AbstractC22676k.m65745e(this.isExceedMaxLength, c2713b.isExceedMaxLength);
    }

    public int hashCode() {
        String str = this.text;
        int iM8289b = AbstractC2875y.m8289b((str == null ? 0 : str.hashCode()) * 31, 31, this.isSecure);
        Boolean bool = this.isExceedMaxLength;
        return iM8289b + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.text;
        boolean z4 = this.isSecure;
        return AbstractC11478a.m30858j(AbstractC25012a.m73379l("TextInputItemInternalState(text=", str, ", isSecure=", ", isExceedMaxLength=", z4), this.isExceedMaxLength, ")");
    }
}
