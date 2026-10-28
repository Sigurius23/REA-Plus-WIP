package mq0;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: mq0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lmq0/c;", "", "", "errorTitle", "errorDescription", "", "isTryAgainVisible", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "()Z", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25878c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String errorTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String errorDescription;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isTryAgainVisible;

    public C25878c(String errorTitle, String errorDescription, boolean z4) {
        AbstractC22676k.m65750j(errorTitle, "errorTitle");
        AbstractC22676k.m65750j(errorDescription, "errorDescription");
        this.errorTitle = errorTitle;
        this.errorDescription = errorDescription;
        this.isTryAgainVisible = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getErrorDescription() {
        return this.errorDescription;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getErrorTitle() {
        return this.errorTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsTryAgainVisible() {
        return this.isTryAgainVisible;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25878c)) {
            return false;
        }
        C25878c c25878c = (C25878c) other;
        return AbstractC22676k.m65745e(this.errorTitle, c25878c.errorTitle) && AbstractC22676k.m65745e(this.errorDescription, c25878c.errorDescription) && this.isTryAgainVisible == c25878c.isTryAgainVisible;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isTryAgainVisible) + AbstractC11266d.m30450d(this.errorTitle.hashCode() * 31, 31, this.errorDescription);
    }

    public String toString() {
        String str = this.errorTitle;
        String str2 = this.errorDescription;
        return AbstractC18489d0.m53372m(AbstractC11895b.m32001t("DataWidgetErrorState(errorTitle=", str, ", errorDescription=", str2, ", isTryAgainVisible="), this.isTryAgainVisible, ")");
    }

    public /* synthetic */ C25878c(String str, String str2, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? false : z4);
    }
}
