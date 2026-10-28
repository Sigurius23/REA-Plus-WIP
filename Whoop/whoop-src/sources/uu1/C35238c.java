package uu1;

import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: uu1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Luu1/c;", "Lm91/u;", "", "subHeader", "subHeaderEnd", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "last-night-sleep_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35238c implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String subHeader;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String subHeaderEnd;

    public C35238c(String subHeader, String subHeaderEnd) {
        AbstractC22676k.m65750j(subHeader, "subHeader");
        AbstractC22676k.m65750j(subHeaderEnd, "subHeaderEnd");
        this.subHeader = subHeader;
        this.subHeaderEnd = subHeaderEnd;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getSubHeader() {
        return this.subHeader;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSubHeaderEnd() {
        return this.subHeaderEnd;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35238c)) {
            return false;
        }
        C35238c c35238c = (C35238c) other;
        return AbstractC22676k.m65745e(this.subHeader, c35238c.subHeader) && AbstractC22676k.m65745e(this.subHeaderEnd, c35238c.subHeaderEnd);
    }

    public int hashCode() {
        return this.subHeaderEnd.hashCode() + (this.subHeader.hashCode() * 31);
    }

    public String toString() {
        return AbstractC2875y.m8300m("SubHeaderState(subHeader=", this.subHeader, ", subHeaderEnd=", this.subHeaderEnd, ")");
    }
}
