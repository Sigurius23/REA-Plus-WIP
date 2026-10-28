package com.whoop.stress.domain.model;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih1.C18518b;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
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
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:;B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBG\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b!\u0010\"J@\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010\u001eJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001cR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00100\u0012\u0004\b2\u0010/\u001a\u0004\b1\u0010\u001eR&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00103\u0012\u0004\b5\u0010/\u001a\u0004\b4\u0010 R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00106\u0012\u0004\b8\u0010/\u001a\u0004\b7\u0010\"¨\u0006<"}, m65681d2 = {"Lcom/whoop/stress/domain/model/StressInterventionFrame;", "", "", "time", "", "overlay", "", "Lcom/whoop/stress/domain/model/StressInterventionBottomDisplay;", "bottomDisplay", "Lcom/whoop/stress/domain/model/BreathType;", "breathType", "<init>", "(JLjava/lang/String;Ljava/util/List;Lcom/whoop/stress/domain/model/BreathType;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/util/List;Lcom/whoop/stress/domain/model/BreathType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$stress_release", "(Lcom/whoop/stress/domain/model/StressInterventionFrame;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "component4", "()Lcom/whoop/stress/domain/model/BreathType;", "copy", "(JLjava/lang/String;Ljava/util/List;Lcom/whoop/stress/domain/model/BreathType;)Lcom/whoop/stress/domain/model/StressInterventionFrame;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTime", "getTime$annotations", "()V", "Ljava/lang/String;", "getOverlay", "getOverlay$annotations", "Ljava/util/List;", "getBottomDisplay", "getBottomDisplay$annotations", "Lcom/whoop/stress/domain/model/BreathType;", "getBreathType", "getBreathType$annotations", "Companion", "$serializer", "a", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StressInterventionFrame {
    private static final InterfaceC23462h[] $childSerializers;

    @SerializedName("bottom_display")
    private final List<StressInterventionBottomDisplay> bottomDisplay;

    @SerializedName("breath_type")
    private final BreathType breathType;

    @SerializedName("overlay_text_display")
    private final String overlay;

    @SerializedName("visible_time_ms")
    private final long time;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.stress.domain.model.StressInterventionFrame$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/stress/domain/model/StressInterventionFrame$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/stress/domain/model/StressInterventionFrame;", "serializer", "()Lwc3/c;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StressInterventionFrame$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C18518b(11)), AbstractC30060g.m92087G(enumC23463i, new C18518b(12))};
    }

    public /* synthetic */ StressInterventionFrame(int i13, long j7, String str, List list, BreathType breathType, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, StressInterventionFrame$$serializer.INSTANCE.getDescriptor());
        }
        this.time = j7;
        this.overlay = str;
        this.bottomDisplay = list;
        this.breathType = breathType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StressInterventionBottomDisplay$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return BreathType.INSTANCE.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StressInterventionFrame copy$default(StressInterventionFrame stressInterventionFrame, long j7, String str, List list, BreathType breathType, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j7 = stressInterventionFrame.time;
        }
        long j13 = j7;
        if ((i13 & 2) != 0) {
            str = stressInterventionFrame.overlay;
        }
        String str2 = str;
        if ((i13 & 4) != 0) {
            list = stressInterventionFrame.bottomDisplay;
        }
        List list2 = list;
        if ((i13 & 8) != 0) {
            breathType = stressInterventionFrame.breathType;
        }
        return stressInterventionFrame.copy(j13, str2, list2, breathType);
    }

    @InterfaceC37143h("bottom_display")
    public static /* synthetic */ void getBottomDisplay$annotations() {
    }

    @InterfaceC37143h("breath_type")
    public static /* synthetic */ void getBreathType$annotations() {
    }

    @InterfaceC37143h("overlay_text_display")
    public static /* synthetic */ void getOverlay$annotations() {
    }

    @InterfaceC37143h("visible_time_ms")
    public static /* synthetic */ void getTime$annotations() {
    }

    public static final /* synthetic */ void write$Self$stress_release(StressInterventionFrame self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeLongElement(serialDesc, 0, self.time);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.overlay);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.bottomDisplay);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.breathType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOverlay() {
        return this.overlay;
    }

    public final List<StressInterventionBottomDisplay> component3() {
        return this.bottomDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BreathType getBreathType() {
        return this.breathType;
    }

    public final StressInterventionFrame copy(long time, String overlay, List<StressInterventionBottomDisplay> bottomDisplay, BreathType breathType) {
        AbstractC22676k.m65750j(bottomDisplay, "bottomDisplay");
        AbstractC22676k.m65750j(breathType, "breathType");
        return new StressInterventionFrame(time, overlay, bottomDisplay, breathType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StressInterventionFrame)) {
            return false;
        }
        StressInterventionFrame stressInterventionFrame = (StressInterventionFrame) other;
        return this.time == stressInterventionFrame.time && AbstractC22676k.m65745e(this.overlay, stressInterventionFrame.overlay) && AbstractC22676k.m65745e(this.bottomDisplay, stressInterventionFrame.bottomDisplay) && this.breathType == stressInterventionFrame.breathType;
    }

    public final List<StressInterventionBottomDisplay> getBottomDisplay() {
        return this.bottomDisplay;
    }

    public final BreathType getBreathType() {
        return this.breathType;
    }

    public final String getOverlay() {
        return this.overlay;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.time) * 31;
        String str = this.overlay;
        return this.breathType.hashCode() + AbstractC11895b.m31983b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.bottomDisplay);
    }

    public String toString() {
        long j7 = this.time;
        String str = this.overlay;
        List<StressInterventionBottomDisplay> list = this.bottomDisplay;
        BreathType breathType = this.breathType;
        StringBuilder sbM114685m = AbstractC36095b.m114685m("StressInterventionFrame(time=", ", overlay=", j7, str);
        sbM114685m.append(", bottomDisplay=");
        sbM114685m.append(list);
        sbM114685m.append(", breathType=");
        sbM114685m.append(breathType);
        sbM114685m.append(")");
        return sbM114685m.toString();
    }

    public StressInterventionFrame(long j7, String str, List<StressInterventionBottomDisplay> bottomDisplay, BreathType breathType) {
        AbstractC22676k.m65750j(bottomDisplay, "bottomDisplay");
        AbstractC22676k.m65750j(breathType, "breathType");
        this.time = j7;
        this.overlay = str;
        this.bottomDisplay = bottomDisplay;
        this.breathType = breathType;
    }
}
