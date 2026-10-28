package com.whoop.hormonalinsights.logsymptoms.domain.models;

import c13.AbstractC3855a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import jl0.C21769a;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ8\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001c¨\u0006."}, m65681d2 = {"Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsSaveRequest;", "", "", "menstruation", "cervicalMucus", "", "Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;", "trackerInputs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsSaveRequest;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsSaveRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMenstruation", "getCervicalMucus", "Ljava/util/List;", "getTrackerInputs", "Companion", "$serializer", "a", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LogSymptomsSaveRequest {
    private final String cervicalMucus;
    private final String menstruation;
    private final List<SymptomTrackerInput> trackerInputs;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C21769a(28))};

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.logsymptoms.domain.models.LogSymptomsSaveRequest$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsSaveRequest$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsSaveRequest;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LogSymptomsSaveRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public LogSymptomsSaveRequest() {
        this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(SymptomTrackerInput$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LogSymptomsSaveRequest copy$default(LogSymptomsSaveRequest logSymptomsSaveRequest, String str, String str2, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = logSymptomsSaveRequest.menstruation;
        }
        if ((i13 & 2) != 0) {
            str2 = logSymptomsSaveRequest.cervicalMucus;
        }
        if ((i13 & 4) != 0) {
            list = logSymptomsSaveRequest.trackerInputs;
        }
        return logSymptomsSaveRequest.copy(str, str2, list);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(LogSymptomsSaveRequest self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.menstruation != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.menstruation);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.cervicalMucus != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.cervicalMucus);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && AbstractC22676k.m65745e(self.trackerInputs, C25271y.f99162w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.trackerInputs);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMenstruation() {
        return this.menstruation;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCervicalMucus() {
        return this.cervicalMucus;
    }

    public final List<SymptomTrackerInput> component3() {
        return this.trackerInputs;
    }

    public final LogSymptomsSaveRequest copy(String menstruation, String cervicalMucus, List<SymptomTrackerInput> trackerInputs) {
        AbstractC22676k.m65750j(trackerInputs, "trackerInputs");
        return new LogSymptomsSaveRequest(menstruation, cervicalMucus, trackerInputs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogSymptomsSaveRequest)) {
            return false;
        }
        LogSymptomsSaveRequest logSymptomsSaveRequest = (LogSymptomsSaveRequest) other;
        return AbstractC22676k.m65745e(this.menstruation, logSymptomsSaveRequest.menstruation) && AbstractC22676k.m65745e(this.cervicalMucus, logSymptomsSaveRequest.cervicalMucus) && AbstractC22676k.m65745e(this.trackerInputs, logSymptomsSaveRequest.trackerInputs);
    }

    public final String getCervicalMucus() {
        return this.cervicalMucus;
    }

    public final String getMenstruation() {
        return this.menstruation;
    }

    public final List<SymptomTrackerInput> getTrackerInputs() {
        return this.trackerInputs;
    }

    public int hashCode() {
        String str = this.menstruation;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cervicalMucus;
        return this.trackerInputs.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.menstruation;
        String str2 = this.cervicalMucus;
        return AbstractC3855a.m11829m(AbstractC11895b.m32001t("LogSymptomsSaveRequest(menstruation=", str, ", cervicalMucus=", str2, ", trackerInputs="), this.trackerInputs, ")");
    }

    public /* synthetic */ LogSymptomsSaveRequest(int i13, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.menstruation = null;
        } else {
            this.menstruation = str;
        }
        if ((i13 & 2) == 0) {
            this.cervicalMucus = null;
        } else {
            this.cervicalMucus = str2;
        }
        if ((i13 & 4) == 0) {
            this.trackerInputs = C25271y.f99162w;
        } else {
            this.trackerInputs = list;
        }
    }

    public LogSymptomsSaveRequest(String str, String str2, List<SymptomTrackerInput> trackerInputs) {
        AbstractC22676k.m65750j(trackerInputs, "trackerInputs");
        this.menstruation = str;
        this.cervicalMucus = str2;
        this.trackerInputs = trackerInputs;
    }

    public /* synthetic */ LogSymptomsSaveRequest(String str, String str2, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? C25271y.f99162w : list);
    }
}
