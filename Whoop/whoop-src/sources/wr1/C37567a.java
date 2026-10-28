package wr1;

import c13.AbstractC3855a;
import com.whoop.journal.interactors.p062v2.datepicker.JournalDatePickerResponse;
import java.util.LinkedHashMap;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: wr1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJF\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, m65681d2 = {"Lwr1/a;", "", "Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;", "response", "", "selectedDate", "", "", "journalEditStatusByDate", "shouldAnimate", "<init>", "(Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;Ljava/lang/String;Ljava/util/Map;Z)V", "a", "(Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;Ljava/lang/String;Ljava/util/Map;Z)Lwr1/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;", "d", "()Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;", "b", "Ljava/lang/String;", "e", "c", "Ljava/util/Map;", "()Ljava/util/Map;", "Z", "f", "()Z", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37567a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final JournalDatePickerResponse response;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String selectedDate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Map<String, Boolean> journalEditStatusByDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean shouldAnimate;

    public C37567a(JournalDatePickerResponse response, String str, Map<String, Boolean> journalEditStatusByDate, boolean z4) {
        AbstractC22676k.m65750j(response, "response");
        AbstractC22676k.m65750j(journalEditStatusByDate, "journalEditStatusByDate");
        this.response = response;
        this.selectedDate = str;
        this.journalEditStatusByDate = journalEditStatusByDate;
        this.shouldAnimate = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C37567a m120591b(C37567a c37567a, JournalDatePickerResponse journalDatePickerResponse, String str, Map map, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            journalDatePickerResponse = c37567a.response;
        }
        if ((i13 & 2) != 0) {
            str = c37567a.selectedDate;
        }
        if ((i13 & 4) != 0) {
            map = c37567a.journalEditStatusByDate;
        }
        if ((i13 & 8) != 0) {
            z4 = c37567a.shouldAnimate;
        }
        return c37567a.m120592a(journalDatePickerResponse, str, map, z4);
    }

    /* JADX INFO: renamed from: a */
    public final C37567a m120592a(JournalDatePickerResponse response, String selectedDate, Map<String, Boolean> journalEditStatusByDate, boolean shouldAnimate) {
        AbstractC22676k.m65750j(response, "response");
        AbstractC22676k.m65750j(journalEditStatusByDate, "journalEditStatusByDate");
        return new C37567a(response, selectedDate, journalEditStatusByDate, shouldAnimate);
    }

    /* JADX INFO: renamed from: c */
    public final Map<String, Boolean> m120593c() {
        return this.journalEditStatusByDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final JournalDatePickerResponse getResponse() {
        return this.response;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSelectedDate() {
        return this.selectedDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37567a)) {
            return false;
        }
        C37567a c37567a = (C37567a) other;
        return AbstractC22676k.m65745e(this.response, c37567a.response) && AbstractC22676k.m65745e(this.selectedDate, c37567a.selectedDate) && AbstractC22676k.m65745e(this.journalEditStatusByDate, c37567a.journalEditStatusByDate) && this.shouldAnimate == c37567a.shouldAnimate;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getShouldAnimate() {
        return this.shouldAnimate;
    }

    public int hashCode() {
        int iHashCode = this.response.hashCode() * 31;
        String str = this.selectedDate;
        return Boolean.hashCode(this.shouldAnimate) + AbstractC3855a.m11821e(this.journalEditStatusByDate, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public String toString() {
        return "JournalDatePickerAccumulator(response=" + this.response + ", selectedDate=" + this.selectedDate + ", journalEditStatusByDate=" + this.journalEditStatusByDate + ", shouldAnimate=" + this.shouldAnimate + ")";
    }

    public /* synthetic */ C37567a(JournalDatePickerResponse journalDatePickerResponse, String str, Map map, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(journalDatePickerResponse, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? new LinkedHashMap() : map, (i13 & 8) != 0 ? true : z4);
    }
}
