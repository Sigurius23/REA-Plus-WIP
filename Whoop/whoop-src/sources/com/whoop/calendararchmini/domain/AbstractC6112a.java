package com.whoop.calendararchmini.domain;

import com.mapbox.common.HttpHeaders;
import ib1.C18334a;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.whoop.calendararchmini.domain.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/calendararchmini/domain/a;", "", "<init>", "()V", "a", "c", "b", "d", "Lcom/whoop/calendararchmini/domain/a$a;", "Lcom/whoop/calendararchmini/domain/a$b;", "Lcom/whoop/calendararchmini/domain/a$c;", "Lcom/whoop/calendararchmini/domain/a$d;", "calendar-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC6112a {

    /* JADX INFO: renamed from: com.whoop.calendararchmini.domain.a$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/calendararchmini/domain/a$a;", "Lcom/whoop/calendararchmini/domain/a;", "Lib1/a;", "wrapperViewState", "<init>", "(Lib1/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lib1/a;", "()Lib1/a;", "calendar-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC6112a {

        /* JADX INFO: renamed from: b */
        public static final int f24293b = C18334a.f71360i;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C18334a wrapperViewState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C18334a wrapperViewState) {
            super(null);
            AbstractC22676k.m65750j(wrapperViewState, "wrapperViewState");
            this.wrapperViewState = wrapperViewState;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C18334a getWrapperViewState() {
            return this.wrapperViewState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.wrapperViewState, ((a) other).wrapperViewState);
        }

        public int hashCode() {
            return this.wrapperViewState.hashCode();
        }

        public String toString() {
            return "Load(wrapperViewState=" + this.wrapperViewState + ")";
        }
    }

    /* JADX INFO: renamed from: com.whoop.calendararchmini.domain.a$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/calendararchmini/domain/a$b;", "Lcom/whoop/calendararchmini/domain/a;", "", HttpHeaders.DATE, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "calendar-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC6112a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String date;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String date) {
            super(null);
            AbstractC22676k.m65750j(date, "date");
            this.date = date;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.date, ((b) other).date);
        }

        public int hashCode() {
            return this.date.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("LoadMonthByDate(date=", this.date, ")");
        }
    }

    /* JADX INFO: renamed from: com.whoop.calendararchmini.domain.a$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/calendararchmini/domain/a$c;", "Lcom/whoop/calendararchmini/domain/a;", "", "monthIndex", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "calendar-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC6112a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int monthIndex;

        public c(int i13) {
            super(null);
            this.monthIndex = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getMonthIndex() {
            return this.monthIndex;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && this.monthIndex == ((c) other).monthIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.monthIndex);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.monthIndex, "LoadMonthByIndex(monthIndex=", ")");
        }
    }

    /* JADX INFO: renamed from: com.whoop.calendararchmini.domain.a$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/calendararchmini/domain/a$d;", "Lcom/whoop/calendararchmini/domain/a;", "", "monthIndex", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "calendar-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC6112a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int monthIndex;

        public d(int i13) {
            super(null);
            this.monthIndex = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getMonthIndex() {
            return this.monthIndex;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && this.monthIndex == ((d) other).monthIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.monthIndex);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.monthIndex, "RetryMonth(monthIndex=", ")");
        }
    }

    public /* synthetic */ AbstractC6112a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC6112a() {
    }
}
