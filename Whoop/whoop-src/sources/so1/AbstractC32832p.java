package so1;

import c13.AbstractC3855a;
import com.mapbox.common.HttpHeaders;
import com.whoop.design.models.calendar.CalendarDateModel;
import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogCalendarErrorType;
import com.whoop.metrics.common.ScreenState;
import fy1.InterfaceC14875k;
import h91.C17027b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import np1.C27025c;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: so1.p */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m65681d2 = {"Lso1/p;", "Lfy1/k;", "<init>", "()V", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "b", "a", "e", "c", "d", "f", "Lso1/p$a;", "Lso1/p$b;", "Lso1/p$c;", "Lso1/p$d;", "Lso1/p$e;", "Lso1/p$f;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32832p implements InterfaceC14875k {

    /* JADX INFO: renamed from: so1.p$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lso1/p$a;", "Lso1/p;", "", HttpHeaders.DATE, "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarErrorType;", "errorType", "<init>", "(Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarErrorType;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarErrorType;", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarErrorType;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC32832p {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String date;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final LogCalendarErrorType errorType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String date, LogCalendarErrorType errorType) {
            super(null);
            AbstractC22676k.m65750j(date, "date");
            AbstractC22676k.m65750j(errorType, "errorType");
            this.date = date;
            this.errorType = errorType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final LogCalendarErrorType getErrorType() {
            return this.errorType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.date, aVar.date) && this.errorType == aVar.errorType;
        }

        public int hashCode() {
            return this.errorType.hashCode() + (this.date.hashCode() * 31);
        }

        public String toString() {
            return "Error(date=" + this.date + ", errorType=" + this.errorType + ")";
        }
    }

    /* JADX INFO: renamed from: so1.p$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lso1/p$b;", "Lso1/p;", "<init>", "()V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32832p {

        /* JADX INFO: renamed from: b */
        public static final b f136795b = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: so1.p$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lso1/p$c;", "Lso1/p;", "<init>", "()V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32832p {

        /* JADX INFO: renamed from: b */
        public static final c f136796b = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: so1.p$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lso1/p$d;", "Lso1/p;", "<init>", "()V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32832p {

        /* JADX INFO: renamed from: b */
        public static final d f136797b = new d();

        private d() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: so1.p$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lso1/p$e;", "Lso1/p;", "<init>", "()V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32832p {

        /* JADX INFO: renamed from: b */
        public static final e f136798b = new e();

        private e() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: so1.p$f */
    @Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0010\u0010\f\u001a\f\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b&\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b \u0010#R!\u0010\f\u001a\f\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b$\u0010,R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u001bR#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b*\u00101R\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b%\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b3\u00105\u001a\u0004\b-\u00106¨\u00067"}, m65681d2 = {"Lso1/p$f;", "Lso1/p;", "Lcom/whoop/design/util/TextResource;", "navigationTitle", "title", "description", "Lnp1/c;", "monthPicker", "buttonTitle", "Lh91/b;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/domain/calendar/CalendarDomainState;", "calendarDomainState", "", "selectedIndex", "", "", "", "periodOverrides", "isSaveEnabled", "Lso1/l;", "savingModal", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lnp1/c;Lcom/whoop/design/util/TextResource;Lh91/b;ILjava/util/Map;ZLso1/l;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "c", "j", "d", "e", "Lnp1/c;", "()Lnp1/c;", "g", "Lh91/b;", "()Lh91/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "I", "i", "Ljava/util/Map;", "()Ljava/util/Map;", "Z", "k", "()Z", "Lso1/l;", "()Lso1/l;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC32832p {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource navigationTitle;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource description;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C27025c monthPicker;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final TextResource buttonTitle;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final C17027b<CalendarDateModel> calendarDomainState;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final int selectedIndex;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final Map<String, Boolean> periodOverrides;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final boolean isSaveEnabled;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final C32824l savingModal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(TextResource navigationTitle, TextResource title, TextResource description, C27025c monthPicker, TextResource buttonTitle, C17027b<CalendarDateModel> calendarDomainState, int i13, Map<String, Boolean> periodOverrides, boolean z4, C32824l savingModal) {
            super(null);
            AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(monthPicker, "monthPicker");
            AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
            AbstractC22676k.m65750j(calendarDomainState, "calendarDomainState");
            AbstractC22676k.m65750j(periodOverrides, "periodOverrides");
            AbstractC22676k.m65750j(savingModal, "savingModal");
            this.navigationTitle = navigationTitle;
            this.title = title;
            this.description = description;
            this.monthPicker = monthPicker;
            this.buttonTitle = buttonTitle;
            this.calendarDomainState = calendarDomainState;
            this.selectedIndex = i13;
            this.periodOverrides = periodOverrides;
            this.isSaveEnabled = z4;
            this.savingModal = savingModal;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getButtonTitle() {
            return this.buttonTitle;
        }

        /* JADX INFO: renamed from: c */
        public final C17027b<CalendarDateModel> m103029c() {
            return this.calendarDomainState;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextResource getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C27025c getMonthPicker() {
            return this.monthPicker;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return AbstractC22676k.m65745e(this.navigationTitle, fVar.navigationTitle) && AbstractC22676k.m65745e(this.title, fVar.title) && AbstractC22676k.m65745e(this.description, fVar.description) && AbstractC22676k.m65745e(this.monthPicker, fVar.monthPicker) && AbstractC22676k.m65745e(this.buttonTitle, fVar.buttonTitle) && AbstractC22676k.m65745e(this.calendarDomainState, fVar.calendarDomainState) && this.selectedIndex == fVar.selectedIndex && AbstractC22676k.m65745e(this.periodOverrides, fVar.periodOverrides) && this.isSaveEnabled == fVar.isSaveEnabled && AbstractC22676k.m65745e(this.savingModal, fVar.savingModal);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final TextResource getNavigationTitle() {
            return this.navigationTitle;
        }

        /* JADX INFO: renamed from: g */
        public final Map<String, Boolean> m103033g() {
            return this.periodOverrides;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final C32824l getSavingModal() {
            return this.savingModal;
        }

        public int hashCode() {
            return this.savingModal.hashCode() + AbstractC2875y.m8289b(AbstractC3855a.m11821e(this.periodOverrides, AbstractC11266d.m30448b(this.selectedIndex, (this.calendarDomainState.hashCode() + AbstractC31061c.m95625a((this.monthPicker.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.navigationTitle.hashCode() * 31, this.title, 31), this.description, 31)) * 31, this.buttonTitle, 31)) * 31, 31), 31), 31, this.isSaveEnabled);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final int getSelectedIndex() {
            return this.selectedIndex;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final boolean getIsSaveEnabled() {
            return this.isSaveEnabled;
        }

        public String toString() {
            TextResource textResource = this.navigationTitle;
            TextResource textResource2 = this.title;
            TextResource textResource3 = this.description;
            C27025c c27025c = this.monthPicker;
            TextResource textResource4 = this.buttonTitle;
            C17027b<CalendarDateModel> c17027b = this.calendarDomainState;
            int i13 = this.selectedIndex;
            Map<String, Boolean> map = this.periodOverrides;
            boolean z4 = this.isSaveEnabled;
            C32824l c32824l = this.savingModal;
            StringBuilder sbM106658q = AbstractC33745d.m106658q("Success(navigationTitle=", textResource, ", title=", textResource2, ", description=");
            sbM106658q.append(textResource3);
            sbM106658q.append(", monthPicker=");
            sbM106658q.append(c27025c);
            sbM106658q.append(", buttonTitle=");
            sbM106658q.append(textResource4);
            sbM106658q.append(", calendarDomainState=");
            sbM106658q.append(c17027b);
            sbM106658q.append(", selectedIndex=");
            sbM106658q.append(i13);
            sbM106658q.append(", periodOverrides=");
            sbM106658q.append(map);
            sbM106658q.append(", isSaveEnabled=");
            sbM106658q.append(z4);
            sbM106658q.append(", savingModal=");
            sbM106658q.append(c32824l);
            sbM106658q.append(")");
            return sbM106658q.toString();
        }
    }

    public /* synthetic */ AbstractC32832p(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // fy1.InterfaceC14875k
    public ScreenState getState() {
        if (equals(b.f136795b)) {
            return ScreenState.LOADING;
        }
        if (this instanceof f) {
            return ScreenState.SUCCESS;
        }
        if ((this instanceof a) || equals(c.f136796b)) {
            return ScreenState.ERROR;
        }
        if (equals(e.f136798b) || equals(d.f136797b)) {
            return ScreenState.OTHER;
        }
        throw new NoWhenBranchMatchedException();
    }

    private AbstractC32832p() {
    }
}
