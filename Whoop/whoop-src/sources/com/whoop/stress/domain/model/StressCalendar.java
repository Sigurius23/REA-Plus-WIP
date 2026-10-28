package com.whoop.stress.domain.model;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.calendar.CalendarDateModel;
import com.whoop.design.models.calendar.CalendarDateModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih1.C18518b;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0018R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010(\u0012\u0004\b*\u0010'\u001a\u0004\b)\u0010\u001a¨\u0006."}, m65681d2 = {"Lcom/whoop/stress/domain/model/StressCalendar;", "", "", "calendarTitleDisplay", "", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "daysOfMonth", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$stress_release", "(Lcom/whoop/stress/domain/model/StressCalendar;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/whoop/stress/domain/model/StressCalendar;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCalendarTitleDisplay", "getCalendarTitleDisplay$annotations", "()V", "Ljava/util/List;", "getDaysOfMonth", "getDaysOfMonth$annotations", "Companion", "$serializer", "a", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StressCalendar {

    @SerializedName("calendar_title_display")
    private final String calendarTitleDisplay;

    @SerializedName("days_of_month")
    private final List<CalendarDateModel> daysOfMonth;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C18518b(6))};

    /* JADX INFO: renamed from: com.whoop.stress.domain.model.StressCalendar$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/stress/domain/model/StressCalendar$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/stress/domain/model/StressCalendar;", "serializer", "()Lwc3/c;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StressCalendar$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StressCalendar() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(CalendarDateModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StressCalendar copy$default(StressCalendar stressCalendar, String str, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = stressCalendar.calendarTitleDisplay;
        }
        if ((i13 & 2) != 0) {
            list = stressCalendar.daysOfMonth;
        }
        return stressCalendar.copy(str, list);
    }

    @InterfaceC37143h("calendar_title_display")
    public static /* synthetic */ void getCalendarTitleDisplay$annotations() {
    }

    @InterfaceC37143h("days_of_month")
    public static /* synthetic */ void getDaysOfMonth$annotations() {
    }

    public static final /* synthetic */ void write$Self$stress_release(StressCalendar self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.calendarTitleDisplay, "")) {
            output.encodeStringElement(serialDesc, 0, self.calendarTitleDisplay);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && AbstractC22676k.m65745e(self.daysOfMonth, C25271y.f99162w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.daysOfMonth);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCalendarTitleDisplay() {
        return this.calendarTitleDisplay;
    }

    public final List<CalendarDateModel> component2() {
        return this.daysOfMonth;
    }

    public final StressCalendar copy(String calendarTitleDisplay, List<CalendarDateModel> daysOfMonth) {
        AbstractC22676k.m65750j(calendarTitleDisplay, "calendarTitleDisplay");
        AbstractC22676k.m65750j(daysOfMonth, "daysOfMonth");
        return new StressCalendar(calendarTitleDisplay, daysOfMonth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StressCalendar)) {
            return false;
        }
        StressCalendar stressCalendar = (StressCalendar) other;
        return AbstractC22676k.m65745e(this.calendarTitleDisplay, stressCalendar.calendarTitleDisplay) && AbstractC22676k.m65745e(this.daysOfMonth, stressCalendar.daysOfMonth);
    }

    public final String getCalendarTitleDisplay() {
        return this.calendarTitleDisplay;
    }

    public final List<CalendarDateModel> getDaysOfMonth() {
        return this.daysOfMonth;
    }

    public int hashCode() {
        return this.daysOfMonth.hashCode() + (this.calendarTitleDisplay.hashCode() * 31);
    }

    public String toString() {
        return AbstractC36095b.m114679g("StressCalendar(calendarTitleDisplay=", this.calendarTitleDisplay, ", daysOfMonth=", ")", this.daysOfMonth);
    }

    public /* synthetic */ StressCalendar(int i13, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.calendarTitleDisplay = (i13 & 1) == 0 ? "" : str;
        if ((i13 & 2) == 0) {
            this.daysOfMonth = C25271y.f99162w;
        } else {
            this.daysOfMonth = list;
        }
    }

    public StressCalendar(String calendarTitleDisplay, List<CalendarDateModel> daysOfMonth) {
        AbstractC22676k.m65750j(calendarTitleDisplay, "calendarTitleDisplay");
        AbstractC22676k.m65750j(daysOfMonth, "daysOfMonth");
        this.calendarTitleDisplay = calendarTitleDisplay;
        this.daysOfMonth = daysOfMonth;
    }

    public /* synthetic */ StressCalendar(String str, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? C25271y.f99162w : list);
    }
}
