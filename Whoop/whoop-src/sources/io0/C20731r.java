package io0;

import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: io0.r */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0019\u0010\f¨\u0006\u001a"}, m65681d2 = {"Lio0/r;", "", "", "text", "", "isValid", "serverErrorMessage", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "a", "(Ljava/lang/String;ZLjava/lang/String;)Lio0/r;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "Z", "e", "()Z", "c", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20731r {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isValid;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String serverErrorMessage;

    public C20731r(String text, boolean z4, String str) {
        AbstractC22676k.m65750j(text, "text");
        this.text = text;
        this.isValid = z4;
        this.serverErrorMessage = str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C20731r m57009b(C20731r c20731r, String str, boolean z4, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c20731r.text;
        }
        if ((i13 & 2) != 0) {
            z4 = c20731r.isValid;
        }
        if ((i13 & 4) != 0) {
            str2 = c20731r.serverErrorMessage;
        }
        return c20731r.m57010a(str, z4, str2);
    }

    /* JADX INFO: renamed from: a */
    public final C20731r m57010a(String text, boolean isValid, String serverErrorMessage) {
        AbstractC22676k.m65750j(text, "text");
        return new C20731r(text, isValid, serverErrorMessage);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getServerErrorMessage() {
        return this.serverErrorMessage;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20731r)) {
            return false;
        }
        C20731r c20731r = (C20731r) other;
        return AbstractC22676k.m65745e(this.text, c20731r.text) && this.isValid == c20731r.isValid && AbstractC22676k.m65745e(this.serverErrorMessage, c20731r.serverErrorMessage);
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(this.text.hashCode() * 31, 31, this.isValid);
        String str = this.serverErrorMessage;
        return iM8289b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.serverErrorMessage, ")", AbstractC25012a.m73379l("FieldValue(text=", this.text, ", isValid=", ", serverErrorMessage=", this.isValid));
    }

    public /* synthetic */ C20731r(String str, boolean z4, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? true : z4, (i13 & 4) != 0 ? null : str2);
    }
}
