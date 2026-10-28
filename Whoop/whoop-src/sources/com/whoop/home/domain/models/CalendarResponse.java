package com.whoop.home.domain.models;

import c13.AbstractC3855a;
import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.calendar.CalendarDateModel;
import com.whoop.design.models.calendar.CalendarDateModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import we1.C37224h;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nBE\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ\u0010\u0010!\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u001aR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001cR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b+\u0010\u001c¨\u0006."}, m65681d2 = {"Lcom/whoop/home/domain/models/CalendarResponse;", "", "", "calendarTitleDisplay", "", "Lcom/whoop/home/domain/models/CalendarKey;", "calendarKey", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "daysOfMonth", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$home_release", "(Lcom/whoop/home/domain/models/CalendarResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/whoop/home/domain/models/CalendarResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCalendarTitleDisplay", "Ljava/util/List;", "getCalendarKey", "getDaysOfMonth", "Companion", "$serializer", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CalendarResponse {
    private static final InterfaceC23462h[] $childSerializers;

    @SerializedName("calendar_key")
    private final List<CalendarKey> calendarKey;

    @SerializedName("calendar_title_display")
    private final String calendarTitleDisplay;

    @SerializedName("days_of_month")
    private final List<CalendarDateModel> daysOfMonth;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/home/domain/models/CalendarResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/home/domain/models/CalendarResponse;", "serializer", "()Lwc3/c;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CalendarResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C37224h(12)), AbstractC30060g.m92087G(enumC23463i, new C37224h(13))};
    }

    public /* synthetic */ CalendarResponse(int i13, String str, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, CalendarResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.calendarTitleDisplay = str;
        if ((i13 & 2) == 0) {
            this.calendarKey = new ArrayList();
        } else {
            this.calendarKey = list;
        }
        if ((i13 & 4) == 0) {
            this.daysOfMonth = new ArrayList();
        } else {
            this.daysOfMonth = list2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(CalendarKey$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(CalendarDateModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CalendarResponse copy$default(CalendarResponse calendarResponse, String str, List list, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = calendarResponse.calendarTitleDisplay;
        }
        if ((i13 & 2) != 0) {
            list = calendarResponse.calendarKey;
        }
        if ((i13 & 4) != 0) {
            list2 = calendarResponse.daysOfMonth;
        }
        return calendarResponse.copy(str, list, list2);
    }

    public static final /* synthetic */ void write$Self$home_release(CalendarResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.calendarTitleDisplay);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.calendarKey, new ArrayList())) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.calendarKey);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && AbstractC22676k.m65745e(self.daysOfMonth, new ArrayList())) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.daysOfMonth);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCalendarTitleDisplay() {
        return this.calendarTitleDisplay;
    }

    public final List<CalendarKey> component2() {
        return this.calendarKey;
    }

    public final List<CalendarDateModel> component3() {
        return this.daysOfMonth;
    }

    public final CalendarResponse copy(String calendarTitleDisplay, List<CalendarKey> calendarKey, List<CalendarDateModel> daysOfMonth) {
        AbstractC22676k.m65750j(calendarTitleDisplay, "calendarTitleDisplay");
        AbstractC22676k.m65750j(calendarKey, "calendarKey");
        AbstractC22676k.m65750j(daysOfMonth, "daysOfMonth");
        return new CalendarResponse(calendarTitleDisplay, calendarKey, daysOfMonth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalendarResponse)) {
            return false;
        }
        CalendarResponse calendarResponse = (CalendarResponse) other;
        return AbstractC22676k.m65745e(this.calendarTitleDisplay, calendarResponse.calendarTitleDisplay) && AbstractC22676k.m65745e(this.calendarKey, calendarResponse.calendarKey) && AbstractC22676k.m65745e(this.daysOfMonth, calendarResponse.daysOfMonth);
    }

    public final List<CalendarKey> getCalendarKey() {
        return this.calendarKey;
    }

    public final String getCalendarTitleDisplay() {
        return this.calendarTitleDisplay;
    }

    public final List<CalendarDateModel> getDaysOfMonth() {
        return this.daysOfMonth;
    }

    public int hashCode() {
        return this.daysOfMonth.hashCode() + AbstractC11895b.m31983b(this.calendarTitleDisplay.hashCode() * 31, 31, this.calendarKey);
    }

    public String toString() {
        String str = this.calendarTitleDisplay;
        List<CalendarKey> list = this.calendarKey;
        return AbstractC3855a.m11829m(AbstractC30802r.m94766o("CalendarResponse(calendarTitleDisplay=", str, ", calendarKey=", ", daysOfMonth=", list), this.daysOfMonth, ")");
    }

    public CalendarResponse(String calendarTitleDisplay, List<CalendarKey> calendarKey, List<CalendarDateModel> daysOfMonth) {
        AbstractC22676k.m65750j(calendarTitleDisplay, "calendarTitleDisplay");
        AbstractC22676k.m65750j(calendarKey, "calendarKey");
        AbstractC22676k.m65750j(daysOfMonth, "daysOfMonth");
        this.calendarTitleDisplay = calendarTitleDisplay;
        this.calendarKey = calendarKey;
        this.daysOfMonth = daysOfMonth;
    }

    public /* synthetic */ CalendarResponse(String str, List list, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? new ArrayList() : list, (i13 & 4) != 0 ? new ArrayList() : list2);
    }
}
