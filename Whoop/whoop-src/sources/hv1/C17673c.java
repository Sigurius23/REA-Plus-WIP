package hv1;

import java.time.LocalDateTime;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: hv1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001f"}, m65681d2 = {"Lhv1/c;", "Lm91/u;", "", "displayDate", "Ljava/time/LocalDateTime;", "formattedDate", "", "startDate", "currentDate", "<init>", "(Ljava/lang/String;Ljava/time/LocalDateTime;JJ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/time/LocalDateTime;", "c", "()Ljava/time/LocalDateTime;", "J", "e", "()J", "d", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17673c implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String displayDate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final LocalDateTime formattedDate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long startDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long currentDate;

    public C17673c(String displayDate, LocalDateTime formattedDate, long j7, long j13) {
        AbstractC22676k.m65750j(displayDate, "displayDate");
        AbstractC22676k.m65750j(formattedDate, "formattedDate");
        this.displayDate = displayDate;
        this.formattedDate = formattedDate;
        this.startDate = j7;
        this.currentDate = j13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getCurrentDate() {
        return this.currentDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDisplayDate() {
        return this.displayDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LocalDateTime getFormattedDate() {
        return this.formattedDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getStartDate() {
        return this.startDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17673c)) {
            return false;
        }
        C17673c c17673c = (C17673c) other;
        return AbstractC22676k.m65745e(this.displayDate, c17673c.displayDate) && AbstractC22676k.m65745e(this.formattedDate, c17673c.formattedDate) && this.startDate == c17673c.startDate && this.currentDate == c17673c.currentDate;
    }

    public int hashCode() {
        return Long.hashCode(this.currentDate) + AbstractC11266d.m30451e((this.formattedDate.hashCode() + (this.displayDate.hashCode() * 31)) * 31, this.startDate, 31);
    }

    public String toString() {
        return "DateTimeItemViewState(displayDate=" + this.displayDate + ", formattedDate=" + this.formattedDate + ", startDate=" + this.startDate + ", currentDate=" + this.currentDate + ")";
    }
}
