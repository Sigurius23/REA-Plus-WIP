package com.whoop.hormonalinsights.menstrualcycleinsights.domain.models;

import com.whoop.design.models.calendar.CalendarDateModel;
import com.whoop.design.models.calendar.CalendarDateModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import h91.C17027b;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import qo1.C30526a;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB=\b\u0010\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ8\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010\u001eJ\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR,\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001c\"\u0004\b-\u0010.R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u001e¨\u00063"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainModel;", "", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;", "networkModel", "Lh91/b;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/domain/calendar/CalendarDomainState;", "calendarDomainState", "", "selectedIndex", "<init>", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;Lh91/b;I)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;Lh91/b;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;", "component2", "()Lh91/b;", "component3", "()I", "copy", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;Lh91/b;I)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;", "getNetworkModel", "Lh91/b;", "getCalendarDomainState", "setCalendarDomainState", "(Lh91/b;)V", "I", "getSelectedIndex", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LogCalendarDomainModel {
    private C17027b<CalendarDateModel> calendarDomainState;
    private final LogCalendarResponse networkModel;
    private final int selectedIndex;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C30526a(17)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainModel;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LogCalendarDomainModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ LogCalendarDomainModel(int i13, LogCalendarResponse logCalendarResponse, C17027b c17027b, int i14, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, LogCalendarDomainModel$$serializer.INSTANCE.getDescriptor());
        }
        this.networkModel = logCalendarResponse;
        this.calendarDomainState = c17027b;
        this.selectedIndex = i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17027b.class), null, new InterfaceC37138c[]{CalendarDateModel$$serializer.INSTANCE});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LogCalendarDomainModel copy$default(LogCalendarDomainModel logCalendarDomainModel, LogCalendarResponse logCalendarResponse, C17027b c17027b, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            logCalendarResponse = logCalendarDomainModel.networkModel;
        }
        if ((i14 & 2) != 0) {
            c17027b = logCalendarDomainModel.calendarDomainState;
        }
        if ((i14 & 4) != 0) {
            i13 = logCalendarDomainModel.selectedIndex;
        }
        return logCalendarDomainModel.copy(logCalendarResponse, c17027b, i13);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(LogCalendarDomainModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, LogCalendarResponse$$serializer.INSTANCE, self.networkModel);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.calendarDomainState);
        output.encodeIntElement(serialDesc, 2, self.selectedIndex);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LogCalendarResponse getNetworkModel() {
        return this.networkModel;
    }

    public final C17027b<CalendarDateModel> component2() {
        return this.calendarDomainState;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSelectedIndex() {
        return this.selectedIndex;
    }

    public final LogCalendarDomainModel copy(LogCalendarResponse networkModel, C17027b<CalendarDateModel> calendarDomainState, int selectedIndex) {
        AbstractC22676k.m65750j(networkModel, "networkModel");
        AbstractC22676k.m65750j(calendarDomainState, "calendarDomainState");
        return new LogCalendarDomainModel(networkModel, calendarDomainState, selectedIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogCalendarDomainModel)) {
            return false;
        }
        LogCalendarDomainModel logCalendarDomainModel = (LogCalendarDomainModel) other;
        return AbstractC22676k.m65745e(this.networkModel, logCalendarDomainModel.networkModel) && AbstractC22676k.m65745e(this.calendarDomainState, logCalendarDomainModel.calendarDomainState) && this.selectedIndex == logCalendarDomainModel.selectedIndex;
    }

    public final C17027b<CalendarDateModel> getCalendarDomainState() {
        return this.calendarDomainState;
    }

    public final LogCalendarResponse getNetworkModel() {
        return this.networkModel;
    }

    public final int getSelectedIndex() {
        return this.selectedIndex;
    }

    public int hashCode() {
        return Integer.hashCode(this.selectedIndex) + ((this.calendarDomainState.hashCode() + (this.networkModel.hashCode() * 31)) * 31);
    }

    public final void setCalendarDomainState(C17027b<CalendarDateModel> c17027b) {
        AbstractC22676k.m65750j(c17027b, "<set-?>");
        this.calendarDomainState = c17027b;
    }

    public String toString() {
        LogCalendarResponse logCalendarResponse = this.networkModel;
        C17027b<CalendarDateModel> c17027b = this.calendarDomainState;
        int i13 = this.selectedIndex;
        StringBuilder sb4 = new StringBuilder("LogCalendarDomainModel(networkModel=");
        sb4.append(logCalendarResponse);
        sb4.append(", calendarDomainState=");
        sb4.append(c17027b);
        sb4.append(", selectedIndex=");
        return AbstractC18489d0.m53371l(sb4, i13, ")");
    }

    public LogCalendarDomainModel(LogCalendarResponse networkModel, C17027b<CalendarDateModel> calendarDomainState, int i13) {
        AbstractC22676k.m65750j(networkModel, "networkModel");
        AbstractC22676k.m65750j(calendarDomainState, "calendarDomainState");
        this.networkModel = networkModel;
        this.calendarDomainState = calendarDomainState;
        this.selectedIndex = i13;
    }
}
