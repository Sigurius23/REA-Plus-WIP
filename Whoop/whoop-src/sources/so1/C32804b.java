package so1;

import com.whoop.design.models.calendar.CalendarDateModel;
import com.whoop.design.util.TextResource;
import h91.C17027b;
import hy0.EnumC17753i0;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import np1.C27025c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import vy0.C36570d0;

/* JADX INFO: renamed from: so1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b%\u0010&R!\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\n8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b!\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b%\u0010.\u001a\u0004\b*\u0010/R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b,\u00100\u001a\u0004\b1\u00102¨\u00063"}, m65681d2 = {"Lso1/b;", "Lm91/u;", "Lnp1/c;", "datePicker", "Lso1/a;", "backToToday", "", "index", "Lh91/b;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/domain/calendar/CalendarDomainState;", "calendarDomainState", "Lhy0/i0;", "legendType", "Lvy0/d0;", "fabMenu", "", "isMciCalendarCodeSeparationFFOn", "<init>", "(Lnp1/c;Lso1/a;Ljava/lang/Integer;Lh91/b;Lhy0/i0;Lvy0/d0;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lnp1/c;", "c", "()Lnp1/c;", "b", "Lso1/a;", "()Lso1/a;", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "d", "Lh91/b;", "()Lh91/b;", "e", "Lhy0/i0;", "g", "()Lhy0/i0;", "Lvy0/d0;", "()Lvy0/d0;", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32804b implements InterfaceC25312u {

    /* JADX INFO: renamed from: h */
    public static final int f136574h;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C27025c datePicker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C32802a backToToday;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Integer index;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C17027b<CalendarDateModel> calendarDomainState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC17753i0 legendType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C36570d0 fabMenu;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean isMciCalendarCodeSeparationFFOn;

    static {
        int i13 = C36570d0.f156622b | C17027b.f65485k;
        int i14 = TextResource.$stable;
        f136574h = i13 | i14 | i14;
    }

    public C32804b(C27025c c27025c, C32802a c32802a, Integer num, C17027b<CalendarDateModel> calendarDomainState, EnumC17753i0 enumC17753i0, C36570d0 c36570d0, boolean z4) {
        AbstractC22676k.m65750j(calendarDomainState, "calendarDomainState");
        this.datePicker = c27025c;
        this.backToToday = c32802a;
        this.index = num;
        this.calendarDomainState = calendarDomainState;
        this.legendType = enumC17753i0;
        this.fabMenu = c36570d0;
        this.isMciCalendarCodeSeparationFFOn = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C32802a getBackToToday() {
        return this.backToToday;
    }

    /* JADX INFO: renamed from: b */
    public final C17027b<CalendarDateModel> m102897b() {
        return this.calendarDomainState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C27025c getDatePicker() {
        return this.datePicker;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C36570d0 getFabMenu() {
        return this.fabMenu;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32804b)) {
            return false;
        }
        C32804b c32804b = (C32804b) other;
        return AbstractC22676k.m65745e(this.datePicker, c32804b.datePicker) && AbstractC22676k.m65745e(this.backToToday, c32804b.backToToday) && AbstractC22676k.m65745e(this.index, c32804b.index) && AbstractC22676k.m65745e(this.calendarDomainState, c32804b.calendarDomainState) && this.legendType == c32804b.legendType && AbstractC22676k.m65745e(this.fabMenu, c32804b.fabMenu) && this.isMciCalendarCodeSeparationFFOn == c32804b.isMciCalendarCodeSeparationFFOn;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final EnumC17753i0 getLegendType() {
        return this.legendType;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsMciCalendarCodeSeparationFFOn() {
        return this.isMciCalendarCodeSeparationFFOn;
    }

    public int hashCode() {
        C27025c c27025c = this.datePicker;
        int iHashCode = (c27025c == null ? 0 : c27025c.hashCode()) * 31;
        C32802a c32802a = this.backToToday;
        int iHashCode2 = (iHashCode + (c32802a == null ? 0 : c32802a.hashCode())) * 31;
        Integer num = this.index;
        int iHashCode3 = (this.calendarDomainState.hashCode() + ((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        EnumC17753i0 enumC17753i0 = this.legendType;
        int iHashCode4 = (iHashCode3 + (enumC17753i0 == null ? 0 : enumC17753i0.hashCode())) * 31;
        C36570d0 c36570d0 = this.fabMenu;
        return Boolean.hashCode(this.isMciCalendarCodeSeparationFFOn) + ((iHashCode4 + (c36570d0 != null ? c36570d0.hashCode() : 0)) * 31);
    }

    public String toString() {
        C27025c c27025c = this.datePicker;
        C32802a c32802a = this.backToToday;
        Integer num = this.index;
        C17027b<CalendarDateModel> c17027b = this.calendarDomainState;
        EnumC17753i0 enumC17753i0 = this.legendType;
        C36570d0 c36570d0 = this.fabMenu;
        boolean z4 = this.isMciCalendarCodeSeparationFFOn;
        StringBuilder sb4 = new StringBuilder("CalendarTileViewState(datePicker=");
        sb4.append(c27025c);
        sb4.append(", backToToday=");
        sb4.append(c32802a);
        sb4.append(", index=");
        sb4.append(num);
        sb4.append(", calendarDomainState=");
        sb4.append(c17027b);
        sb4.append(", legendType=");
        sb4.append(enumC17753i0);
        sb4.append(", fabMenu=");
        sb4.append(c36570d0);
        sb4.append(", isMciCalendarCodeSeparationFFOn=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }
}
