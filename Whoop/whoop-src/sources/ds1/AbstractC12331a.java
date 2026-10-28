package ds1;

import hc3.AbstractC17176i;
import java.util.List;
import km0.C22581e;
import org.joda.time.LocalTime;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: ds1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lds1/a;", "", "<init>", "()V", "c", "b", "a", "Lds1/a$a;", "Lds1/a$b;", "Lds1/a$c;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12331a {

    /* JADX INFO: renamed from: ds1.a$a */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u0010R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010!R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b\u0017\u0010#¨\u0006$"}, m65681d2 = {"Lds1/a$a;", "Lds1/a;", "", "isLoading", "isError", "", "performFuzzySearch", "", "", "lastSelectedToggleIds", "selectedToggleIDs", "Lkm0/e;", "bottomSheetViewState", "<init>", "(ZZLjava/lang/String;Ljava/util/List;Ljava/util/List;Lkm0/e;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "f", "()Z", "b", "e", "c", "Ljava/lang/String;", "d", "Ljava/util/List;", "()Ljava/util/List;", "Lkm0/e;", "()Lkm0/e;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC12331a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isLoading;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isError;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String performFuzzySearch;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final List<Integer> lastSelectedToggleIds;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final List<Integer> selectedToggleIDs;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C22581e bottomSheetViewState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z4, boolean z13, String str, List<Integer> lastSelectedToggleIds, List<Integer> selectedToggleIDs, C22581e bottomSheetViewState) {
            super(null);
            AbstractC22676k.m65750j(lastSelectedToggleIds, "lastSelectedToggleIds");
            AbstractC22676k.m65750j(selectedToggleIDs, "selectedToggleIDs");
            AbstractC22676k.m65750j(bottomSheetViewState, "bottomSheetViewState");
            this.isLoading = z4;
            this.isError = z13;
            this.performFuzzySearch = str;
            this.lastSelectedToggleIds = lastSelectedToggleIds;
            this.selectedToggleIDs = selectedToggleIDs;
            this.bottomSheetViewState = bottomSheetViewState;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C22581e getBottomSheetViewState() {
            return this.bottomSheetViewState;
        }

        /* JADX INFO: renamed from: b */
        public final List<Integer> m34419b() {
            return this.lastSelectedToggleIds;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPerformFuzzySearch() {
            return this.performFuzzySearch;
        }

        /* JADX INFO: renamed from: d */
        public final List<Integer> m34421d() {
            return this.selectedToggleIDs;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getIsError() {
            return this.isError;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.isLoading == aVar.isLoading && this.isError == aVar.isError && AbstractC22676k.m65745e(this.performFuzzySearch, aVar.performFuzzySearch) && AbstractC22676k.m65745e(this.lastSelectedToggleIds, aVar.lastSelectedToggleIds) && AbstractC22676k.m65745e(this.selectedToggleIDs, aVar.selectedToggleIDs) && AbstractC22676k.m65745e(this.bottomSheetViewState, aVar.bottomSheetViewState);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.isError);
            String str = this.performFuzzySearch;
            return this.bottomSheetViewState.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b((iM8289b + (str == null ? 0 : str.hashCode())) * 31, 31, this.lastSelectedToggleIds), 31, this.selectedToggleIDs);
        }

        public String toString() {
            boolean z4 = this.isLoading;
            boolean z13 = this.isError;
            String str = this.performFuzzySearch;
            List<Integer> list = this.lastSelectedToggleIds;
            List<Integer> list2 = this.selectedToggleIDs;
            C22581e c22581e = this.bottomSheetViewState;
            StringBuilder sbM32002u = AbstractC11895b.m32002u("BottomSheetV2(isLoading=", ", isError=", ", performFuzzySearch=", z4, z13);
            AbstractC36095b.m114694v(str, ", lastSelectedToggleIds=", ", selectedToggleIDs=", sbM32002u, list);
            sbM32002u.append(list2);
            sbM32002u.append(", bottomSheetViewState=");
            sbM32002u.append(c22581e);
            sbM32002u.append(")");
            return sbM32002u.toString();
        }
    }

    /* JADX INFO: renamed from: ds1.a$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u0019\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u001e\u0010\r¨\u0006 "}, m65681d2 = {"Lds1/a$b;", "Lds1/a;", "", "sheetTitle", "questionTitle", "currentValue", "", "min", "max", "unit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getSheetTitle", "b", "d", "c", "D", "()D", "e", "f", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC12331a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String sheetTitle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String questionTitle;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String currentValue;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final double min;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final double max;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String unit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String sheetTitle, String questionTitle, String currentValue, double d3, double d14, String unit) {
            super(null);
            AbstractC22676k.m65750j(sheetTitle, "sheetTitle");
            AbstractC22676k.m65750j(questionTitle, "questionTitle");
            AbstractC22676k.m65750j(currentValue, "currentValue");
            AbstractC22676k.m65750j(unit, "unit");
            this.sheetTitle = sheetTitle;
            this.questionTitle = questionTitle;
            this.currentValue = currentValue;
            this.min = d3;
            this.max = d14;
            this.unit = unit;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCurrentValue() {
            return this.currentValue;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final double getMax() {
            return this.max;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final double getMin() {
            return this.min;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getQuestionTitle() {
            return this.questionTitle;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getUnit() {
            return this.unit;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.sheetTitle, bVar.sheetTitle) && AbstractC22676k.m65745e(this.questionTitle, bVar.questionTitle) && AbstractC22676k.m65745e(this.currentValue, bVar.currentValue) && Double.compare(this.min, bVar.min) == 0 && Double.compare(this.max, bVar.max) == 0 && AbstractC22676k.m65745e(this.unit, bVar.unit);
        }

        public int hashCode() {
            return this.unit.hashCode() + AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.sheetTitle.hashCode() * 31, 31, this.questionTitle), 31, this.currentValue), 31, this.min), 31, this.max);
        }

        public String toString() {
            String str = this.sheetTitle;
            String str2 = this.questionTitle;
            String str3 = this.currentValue;
            double d3 = this.min;
            double d14 = this.max;
            String str4 = this.unit;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("Magnitude(sheetTitle=", str, ", questionTitle=", str2, ", currentValue=");
            sbM32001t.append(str3);
            sbM32001t.append(", min=");
            sbM32001t.append(d3);
            AbstractC31061c.m95622B(sbM32001t, ", max=", d14, ", unit=");
            return AbstractC25012a.m73376i(str4, ")", sbM32001t);
        }
    }

    /* JADX INFO: renamed from: ds1.a$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lds1/a$c;", "Lds1/a;", "Lorg/joda/time/LocalTime;", "initialTime", "", "is24HourFormat", "<init>", "(Lorg/joda/time/LocalTime;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lorg/joda/time/LocalTime;", "()Lorg/joda/time/LocalTime;", "b", "Z", "()Z", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC12331a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final LocalTime initialTime;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean is24HourFormat;

        public c(LocalTime localTime, boolean z4) {
            super(null);
            this.initialTime = localTime;
            this.is24HourFormat = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalTime getInitialTime() {
            return this.initialTime;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIs24HourFormat() {
            return this.is24HourFormat;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.initialTime, cVar.initialTime) && this.is24HourFormat == cVar.is24HourFormat;
        }

        public int hashCode() {
            LocalTime localTime = this.initialTime;
            return Boolean.hashCode(this.is24HourFormat) + ((localTime == null ? 0 : localTime.hashCode()) * 31);
        }

        public String toString() {
            return "Time(initialTime=" + this.initialTime + ", is24HourFormat=" + this.is24HourFormat + ")";
        }
    }

    public /* synthetic */ AbstractC12331a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC12331a() {
    }
}
