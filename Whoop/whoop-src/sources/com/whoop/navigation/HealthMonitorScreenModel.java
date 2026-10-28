package com.whoop.navigation;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ@\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b-\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001e¨\u00063"}, m65681d2 = {"Lcom/whoop/navigation/HealthMonitorScreenModel;", "Lcom/whoop/navigation/CommonNavigationScreenModel;", "", "initialHr", "", "initialHrZone", "source", "Lcom/whoop/navigation/AiAction;", "aiAction", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/HealthMonitorScreenModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/whoop/navigation/AiAction;", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)Lcom/whoop/navigation/HealthMonitorScreenModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getInitialHr", "Ljava/lang/String;", "getInitialHrZone", "getSource", "Lcom/whoop/navigation/AiAction;", "getAiAction", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HealthMonitorScreenModel implements CommonNavigationScreenModel {
    private final AiAction aiAction;
    private final Integer initialHr;
    private final String initialHrZone;
    private final String source;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.navigation.HealthMonitorScreenModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/HealthMonitorScreenModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/HealthMonitorScreenModel;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HealthMonitorScreenModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public HealthMonitorScreenModel() {
        this((Integer) null, (String) null, (String) null, (AiAction) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ HealthMonitorScreenModel copy$default(HealthMonitorScreenModel healthMonitorScreenModel, Integer num, String str, String str2, AiAction aiAction, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = healthMonitorScreenModel.initialHr;
        }
        if ((i13 & 2) != 0) {
            str = healthMonitorScreenModel.initialHrZone;
        }
        if ((i13 & 4) != 0) {
            str2 = healthMonitorScreenModel.source;
        }
        if ((i13 & 8) != 0) {
            aiAction = healthMonitorScreenModel.aiAction;
        }
        return healthMonitorScreenModel.copy(num, str, str2, aiAction);
    }

    public static final /* synthetic */ void write$Self$navigation_release(HealthMonitorScreenModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.initialHr != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.initialHr);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.initialHrZone != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.initialHrZone);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.source, "")) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.source);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.aiAction == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, AiAction$$serializer.INSTANCE, self.aiAction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getInitialHr() {
        return this.initialHr;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInitialHrZone() {
        return this.initialHrZone;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AiAction getAiAction() {
        return this.aiAction;
    }

    public final HealthMonitorScreenModel copy(Integer initialHr, String initialHrZone, String source, AiAction aiAction) {
        return new HealthMonitorScreenModel(initialHr, initialHrZone, source, aiAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthMonitorScreenModel)) {
            return false;
        }
        HealthMonitorScreenModel healthMonitorScreenModel = (HealthMonitorScreenModel) other;
        return AbstractC22676k.m65745e(this.initialHr, healthMonitorScreenModel.initialHr) && AbstractC22676k.m65745e(this.initialHrZone, healthMonitorScreenModel.initialHrZone) && AbstractC22676k.m65745e(this.source, healthMonitorScreenModel.source) && AbstractC22676k.m65745e(this.aiAction, healthMonitorScreenModel.aiAction);
    }

    public final AiAction getAiAction() {
        return this.aiAction;
    }

    public final Integer getInitialHr() {
        return this.initialHr;
    }

    public final String getInitialHrZone() {
        return this.initialHrZone;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        Integer num = this.initialHr;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.initialHrZone;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.source;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AiAction aiAction = this.aiAction;
        return iHashCode3 + (aiAction != null ? aiAction.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.initialHr;
        String str = this.initialHrZone;
        String str2 = this.source;
        AiAction aiAction = this.aiAction;
        StringBuilder sbM95643s = AbstractC31061c.m95643s("HealthMonitorScreenModel(initialHr=", ", initialHrZone=", num, str, ", source=");
        sbM95643s.append(str2);
        sbM95643s.append(", aiAction=");
        sbM95643s.append(aiAction);
        sbM95643s.append(")");
        return sbM95643s.toString();
    }

    public /* synthetic */ HealthMonitorScreenModel(int i13, Integer num, String str, String str2, AiAction aiAction, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.initialHr = null;
        } else {
            this.initialHr = num;
        }
        if ((i13 & 2) == 0) {
            this.initialHrZone = null;
        } else {
            this.initialHrZone = str;
        }
        if ((i13 & 4) == 0) {
            this.source = "";
        } else {
            this.source = str2;
        }
        if ((i13 & 8) == 0) {
            this.aiAction = null;
        } else {
            this.aiAction = aiAction;
        }
    }

    public HealthMonitorScreenModel(Integer num, String str, String str2, AiAction aiAction) {
        this.initialHr = num;
        this.initialHrZone = str;
        this.source = str2;
        this.aiAction = aiAction;
    }

    public /* synthetic */ HealthMonitorScreenModel(Integer num, String str, String str2, AiAction aiAction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? "" : str2, (i13 & 8) != 0 ? null : aiAction);
    }
}
