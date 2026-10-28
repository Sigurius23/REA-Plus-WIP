package wr1;

import com.mapbox.common.HttpHeaders;
import ih0.AbstractC18489d0;
import nh3.AbstractC26725a;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import ur1.InterfaceC35190g;

/* JADX INFO: renamed from: wr1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lwr1/b;", "Lur1/g;", "<init>", "()V", "a", "b", "Lwr1/b$a;", "Lwr1/b$b;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37568b implements InterfaceC35190g {

    /* JADX INFO: renamed from: wr1.b$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lwr1/b$a;", "Lwr1/b;", "", HttpHeaders.DATE, "", "displayLoading", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "getDisplayLoading", "()Z", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC37568b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String date;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean displayLoading;

        public a(String str, boolean z4) {
            super(null);
            this.date = str;
            this.displayLoading = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.date, aVar.date) && this.displayLoading == aVar.displayLoading;
        }

        public int hashCode() {
            String str = this.date;
            return Boolean.hashCode(this.displayLoading) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            return AbstractC26725a.m79503g("Refresh(date=", this.date, ", displayLoading=", ")", this.displayLoading);
        }
    }

    /* JADX INFO: renamed from: wr1.b$b */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lwr1/b$b;", "Lwr1/b;", "", "selectedDate", "currentDate", "", "hasUserEditJournal", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Z", "()Z", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC37568b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String selectedDate;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String currentDate;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean hasUserEditJournal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String selectedDate, String str, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(selectedDate, "selectedDate");
            this.selectedDate = selectedDate;
            this.currentDate = str;
            this.hasUserEditJournal = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCurrentDate() {
            return this.currentDate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getHasUserEditJournal() {
            return this.hasUserEditJournal;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSelectedDate() {
            return this.selectedDate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.selectedDate, bVar.selectedDate) && AbstractC22676k.m65745e(this.currentDate, bVar.currentDate) && this.hasUserEditJournal == bVar.hasUserEditJournal;
        }

        public int hashCode() {
            int iHashCode = this.selectedDate.hashCode() * 31;
            String str = this.currentDate;
            return Boolean.hashCode(this.hasUserEditJournal) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public String toString() {
            String str = this.selectedDate;
            String str2 = this.currentDate;
            return AbstractC18489d0.m53372m(AbstractC11895b.m32001t("UpdateSelectedPill(selectedDate=", str, ", currentDate=", str2, ", hasUserEditJournal="), this.hasUserEditJournal, ")");
        }
    }

    public /* synthetic */ AbstractC37568b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC37568b() {
    }
}
