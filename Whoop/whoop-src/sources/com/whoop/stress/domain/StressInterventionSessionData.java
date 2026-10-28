package com.whoop.stress.domain;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hb1.C17089l;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
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
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001dJH\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b.\u0010\u001dR \u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010,\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u001dR \u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010,\u0012\u0004\b3\u00101\u001a\u0004\b2\u0010\u001d¨\u00067"}, m65681d2 = {"Lcom/whoop/stress/domain/StressInterventionSessionData;", "", "", "Lcom/whoop/stress/domain/BreathingEvent;", "breathingEvents", "", "during", "source", "interventionType", "timeZone", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$stress_release", "(Lcom/whoop/stress/domain/StressInterventionSessionData;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/stress/domain/StressInterventionSessionData;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getBreathingEvents", "Ljava/lang/String;", "getDuring", "getSource", "getInterventionType", "getInterventionType$annotations", "()V", "getTimeZone", "getTimeZone$annotations", "Companion", "$serializer", "a", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StressInterventionSessionData {

    @SerializedName("breathing_events")
    private final List<BreathingEvent> breathingEvents;

    @SerializedName("during")
    private final String during;

    @SerializedName("type")
    private final String interventionType;

    @SerializedName("source")
    private final String source;

    @SerializedName("timezone")
    private final String timeZone;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C17089l(10)), null, null, null, null};

    /* JADX INFO: renamed from: com.whoop.stress.domain.StressInterventionSessionData$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/stress/domain/StressInterventionSessionData$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/stress/domain/StressInterventionSessionData;", "serializer", "()Lwc3/c;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StressInterventionSessionData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StressInterventionSessionData(int i13, List list, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, StressInterventionSessionData$$serializer.INSTANCE.getDescriptor());
        }
        this.breathingEvents = list;
        this.during = str;
        this.source = str2;
        this.interventionType = str3;
        this.timeZone = str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(BreathingEvent$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StressInterventionSessionData copy$default(StressInterventionSessionData stressInterventionSessionData, List list, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = stressInterventionSessionData.breathingEvents;
        }
        if ((i13 & 2) != 0) {
            str = stressInterventionSessionData.during;
        }
        if ((i13 & 4) != 0) {
            str2 = stressInterventionSessionData.source;
        }
        if ((i13 & 8) != 0) {
            str3 = stressInterventionSessionData.interventionType;
        }
        if ((i13 & 16) != 0) {
            str4 = stressInterventionSessionData.timeZone;
        }
        String str5 = str4;
        String str6 = str2;
        return stressInterventionSessionData.copy(list, str, str6, str3, str5);
    }

    @InterfaceC37143h("type")
    public static /* synthetic */ void getInterventionType$annotations() {
    }

    @InterfaceC37143h("timezone")
    public static /* synthetic */ void getTimeZone$annotations() {
    }

    public static final /* synthetic */ void write$Self$stress_release(StressInterventionSessionData self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.breathingEvents);
        output.encodeStringElement(serialDesc, 1, self.during);
        output.encodeStringElement(serialDesc, 2, self.source);
        output.encodeStringElement(serialDesc, 3, self.interventionType);
        output.encodeStringElement(serialDesc, 4, self.timeZone);
    }

    public final List<BreathingEvent> component1() {
        return this.breathingEvents;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDuring() {
        return this.during;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getInterventionType() {
        return this.interventionType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTimeZone() {
        return this.timeZone;
    }

    public final StressInterventionSessionData copy(List<BreathingEvent> breathingEvents, String during, String source, String interventionType, String timeZone) {
        AbstractC22676k.m65750j(breathingEvents, "breathingEvents");
        AbstractC22676k.m65750j(during, "during");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(interventionType, "interventionType");
        AbstractC22676k.m65750j(timeZone, "timeZone");
        return new StressInterventionSessionData(breathingEvents, during, source, interventionType, timeZone);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StressInterventionSessionData)) {
            return false;
        }
        StressInterventionSessionData stressInterventionSessionData = (StressInterventionSessionData) other;
        return AbstractC22676k.m65745e(this.breathingEvents, stressInterventionSessionData.breathingEvents) && AbstractC22676k.m65745e(this.during, stressInterventionSessionData.during) && AbstractC22676k.m65745e(this.source, stressInterventionSessionData.source) && AbstractC22676k.m65745e(this.interventionType, stressInterventionSessionData.interventionType) && AbstractC22676k.m65745e(this.timeZone, stressInterventionSessionData.timeZone);
    }

    public final List<BreathingEvent> getBreathingEvents() {
        return this.breathingEvents;
    }

    public final String getDuring() {
        return this.during;
    }

    public final String getInterventionType() {
        return this.interventionType;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getTimeZone() {
        return this.timeZone;
    }

    public int hashCode() {
        return this.timeZone.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.breathingEvents.hashCode() * 31, 31, this.during), 31, this.source), 31, this.interventionType);
    }

    public String toString() {
        List<BreathingEvent> list = this.breathingEvents;
        String str = this.during;
        String str2 = this.source;
        String str3 = this.interventionType;
        String str4 = this.timeZone;
        StringBuilder sbM79507k = AbstractC26725a.m79507k("StressInterventionSessionData(breathingEvents=", ", during=", str, ", source=", list);
        AbstractC11266d.m30444B(sbM79507k, str2, ", interventionType=", str3, ", timeZone=");
        return AbstractC25012a.m73376i(str4, ")", sbM79507k);
    }

    public StressInterventionSessionData(List<BreathingEvent> breathingEvents, String during, String source, String interventionType, String timeZone) {
        AbstractC22676k.m65750j(breathingEvents, "breathingEvents");
        AbstractC22676k.m65750j(during, "during");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(interventionType, "interventionType");
        AbstractC22676k.m65750j(timeZone, "timeZone");
        this.breathingEvents = breathingEvents;
        this.during = during;
        this.source = source;
        this.interventionType = interventionType;
        this.timeZone = timeZone;
    }
}
