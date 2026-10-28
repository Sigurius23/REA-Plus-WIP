package com.whoop.navigation;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ2\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001b¨\u0006."}, m65681d2 = {"Lcom/whoop/navigation/SleepDetailsScreenModel;", "Lcom/whoop/navigation/CommonNavigationScreenModel;", "", "activityId", "entryPoint", "Lcom/whoop/navigation/AiAction;", "aiAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/SleepDetailsScreenModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/navigation/AiAction;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)Lcom/whoop/navigation/SleepDetailsScreenModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getActivityId", "getEntryPoint", "Lcom/whoop/navigation/AiAction;", "getAiAction", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SleepDetailsScreenModel implements CommonNavigationScreenModel {
    private final String activityId;
    private final AiAction aiAction;
    private final String entryPoint;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.navigation.SleepDetailsScreenModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/SleepDetailsScreenModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/SleepDetailsScreenModel;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SleepDetailsScreenModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SleepDetailsScreenModel(int i13, String str, String str2, AiAction aiAction, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, SleepDetailsScreenModel$$serializer.INSTANCE.getDescriptor());
        }
        this.activityId = str;
        if ((i13 & 2) == 0) {
            this.entryPoint = null;
        } else {
            this.entryPoint = str2;
        }
        if ((i13 & 4) == 0) {
            this.aiAction = null;
        } else {
            this.aiAction = aiAction;
        }
    }

    public static /* synthetic */ SleepDetailsScreenModel copy$default(SleepDetailsScreenModel sleepDetailsScreenModel, String str, String str2, AiAction aiAction, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sleepDetailsScreenModel.activityId;
        }
        if ((i13 & 2) != 0) {
            str2 = sleepDetailsScreenModel.entryPoint;
        }
        if ((i13 & 4) != 0) {
            aiAction = sleepDetailsScreenModel.aiAction;
        }
        return sleepDetailsScreenModel.copy(str, str2, aiAction);
    }

    public static final /* synthetic */ void write$Self$navigation_release(SleepDetailsScreenModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.activityId);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.entryPoint != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.entryPoint);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.aiAction == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, AiAction$$serializer.INSTANCE, self.aiAction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getActivityId() {
        return this.activityId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEntryPoint() {
        return this.entryPoint;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AiAction getAiAction() {
        return this.aiAction;
    }

    public final SleepDetailsScreenModel copy(String activityId, String entryPoint, AiAction aiAction) {
        AbstractC22676k.m65750j(activityId, "activityId");
        return new SleepDetailsScreenModel(activityId, entryPoint, aiAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepDetailsScreenModel)) {
            return false;
        }
        SleepDetailsScreenModel sleepDetailsScreenModel = (SleepDetailsScreenModel) other;
        return AbstractC22676k.m65745e(this.activityId, sleepDetailsScreenModel.activityId) && AbstractC22676k.m65745e(this.entryPoint, sleepDetailsScreenModel.entryPoint) && AbstractC22676k.m65745e(this.aiAction, sleepDetailsScreenModel.aiAction);
    }

    public final String getActivityId() {
        return this.activityId;
    }

    public final AiAction getAiAction() {
        return this.aiAction;
    }

    public final String getEntryPoint() {
        return this.entryPoint;
    }

    public int hashCode() {
        int iHashCode = this.activityId.hashCode() * 31;
        String str = this.entryPoint;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AiAction aiAction = this.aiAction;
        return iHashCode2 + (aiAction != null ? aiAction.hashCode() : 0);
    }

    public String toString() {
        String str = this.activityId;
        String str2 = this.entryPoint;
        AiAction aiAction = this.aiAction;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SleepDetailsScreenModel(activityId=", str, ", entryPoint=", str2, ", aiAction=");
        sbM32001t.append(aiAction);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public SleepDetailsScreenModel(String activityId, String str, AiAction aiAction) {
        AbstractC22676k.m65750j(activityId, "activityId");
        this.activityId = activityId;
        this.entryPoint = str;
        this.aiAction = aiAction;
    }

    public /* synthetic */ SleepDetailsScreenModel(String str, String str2, AiAction aiAction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : aiAction);
    }
}
