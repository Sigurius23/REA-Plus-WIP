package com.whoop.bot.models.conversation;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import md1.C25452a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%JX\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010\u001fJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b3\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b4\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b5\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b6\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010%¨\u0006;"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/SleepBoundModel;", "", "Lcom/whoop/design/util/TextResource;", "label", "", "icon", "predictedTime", "timeUnit", "typicalTitle", "typicalTime", "Lcom/whoop/bot/models/conversation/AlarmModel;", NotificationCompat.CATEGORY_ALARM, "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/bot/models/conversation/AlarmModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/bot/models/conversation/AlarmModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/bot/models/conversation/SleepBoundModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "()Lcom/whoop/bot/models/conversation/AlarmModel;", "copy", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/bot/models/conversation/AlarmModel;)Lcom/whoop/bot/models/conversation/SleepBoundModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getLabel", "Ljava/lang/String;", "getIcon", "getPredictedTime", "getTimeUnit", "getTypicalTitle", "getTypicalTime", "Lcom/whoop/bot/models/conversation/AlarmModel;", "getAlarm", "Companion", "$serializer", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SleepBoundModel {
    private final AlarmModel alarm;
    private final String icon;
    private final TextResource label;
    private final TextResource predictedTime;
    private final TextResource timeUnit;
    private final TextResource typicalTime;
    private final TextResource typicalTitle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/SleepBoundModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/bot/models/conversation/SleepBoundModel;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SleepBoundModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SleepBoundModel(int i13, TextResource textResource, String str, TextResource textResource2, TextResource textResource3, TextResource textResource4, TextResource textResource5, AlarmModel alarmModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, SleepBoundModel$$serializer.INSTANCE.getDescriptor());
        }
        this.label = textResource;
        this.icon = str;
        this.predictedTime = textResource2;
        this.timeUnit = textResource3;
        this.typicalTitle = textResource4;
        this.typicalTime = textResource5;
        this.alarm = alarmModel;
    }

    public static /* synthetic */ SleepBoundModel copy$default(SleepBoundModel sleepBoundModel, TextResource textResource, String str, TextResource textResource2, TextResource textResource3, TextResource textResource4, TextResource textResource5, AlarmModel alarmModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = sleepBoundModel.label;
        }
        if ((i13 & 2) != 0) {
            str = sleepBoundModel.icon;
        }
        if ((i13 & 4) != 0) {
            textResource2 = sleepBoundModel.predictedTime;
        }
        if ((i13 & 8) != 0) {
            textResource3 = sleepBoundModel.timeUnit;
        }
        if ((i13 & 16) != 0) {
            textResource4 = sleepBoundModel.typicalTitle;
        }
        if ((i13 & 32) != 0) {
            textResource5 = sleepBoundModel.typicalTime;
        }
        if ((i13 & 64) != 0) {
            alarmModel = sleepBoundModel.alarm;
        }
        TextResource textResource6 = textResource5;
        AlarmModel alarmModel2 = alarmModel;
        TextResource textResource7 = textResource4;
        TextResource textResource8 = textResource2;
        return sleepBoundModel.copy(textResource, str, textResource8, textResource3, textResource7, textResource6, alarmModel2);
    }

    public static final /* synthetic */ void write$Self$bot_release(SleepBoundModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 0, c25452a, self.label);
        output.encodeStringElement(serialDesc, 1, self.icon);
        output.encodeSerializableElement(serialDesc, 2, c25452a, self.predictedTime);
        output.encodeSerializableElement(serialDesc, 3, c25452a, self.timeUnit);
        output.encodeSerializableElement(serialDesc, 4, c25452a, self.typicalTitle);
        output.encodeSerializableElement(serialDesc, 5, c25452a, self.typicalTime);
        output.encodeNullableSerializableElement(serialDesc, 6, AlarmModel$$serializer.INSTANCE, self.alarm);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getPredictedTime() {
        return this.predictedTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TextResource getTimeUnit() {
        return this.timeUnit;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TextResource getTypicalTitle() {
        return this.typicalTitle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TextResource getTypicalTime() {
        return this.typicalTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final AlarmModel getAlarm() {
        return this.alarm;
    }

    public final SleepBoundModel copy(TextResource label, String icon, TextResource predictedTime, TextResource timeUnit, TextResource typicalTitle, TextResource typicalTime, AlarmModel alarm) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(predictedTime, "predictedTime");
        AbstractC22676k.m65750j(timeUnit, "timeUnit");
        AbstractC22676k.m65750j(typicalTitle, "typicalTitle");
        AbstractC22676k.m65750j(typicalTime, "typicalTime");
        return new SleepBoundModel(label, icon, predictedTime, timeUnit, typicalTitle, typicalTime, alarm);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepBoundModel)) {
            return false;
        }
        SleepBoundModel sleepBoundModel = (SleepBoundModel) other;
        return AbstractC22676k.m65745e(this.label, sleepBoundModel.label) && AbstractC22676k.m65745e(this.icon, sleepBoundModel.icon) && AbstractC22676k.m65745e(this.predictedTime, sleepBoundModel.predictedTime) && AbstractC22676k.m65745e(this.timeUnit, sleepBoundModel.timeUnit) && AbstractC22676k.m65745e(this.typicalTitle, sleepBoundModel.typicalTitle) && AbstractC22676k.m65745e(this.typicalTime, sleepBoundModel.typicalTime) && AbstractC22676k.m65745e(this.alarm, sleepBoundModel.alarm);
    }

    public final AlarmModel getAlarm() {
        return this.alarm;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final TextResource getLabel() {
        return this.label;
    }

    public final TextResource getPredictedTime() {
        return this.predictedTime;
    }

    public final TextResource getTimeUnit() {
        return this.timeUnit;
    }

    public final TextResource getTypicalTime() {
        return this.typicalTime;
    }

    public final TextResource getTypicalTitle() {
        return this.typicalTitle;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11266d.m30450d(this.label.hashCode() * 31, 31, this.icon), this.predictedTime, 31), this.timeUnit, 31), this.typicalTitle, 31), this.typicalTime, 31);
        AlarmModel alarmModel = this.alarm;
        return iM95625a + (alarmModel == null ? 0 : alarmModel.hashCode());
    }

    public String toString() {
        TextResource textResource = this.label;
        String str = this.icon;
        TextResource textResource2 = this.predictedTime;
        TextResource textResource3 = this.timeUnit;
        TextResource textResource4 = this.typicalTitle;
        TextResource textResource5 = this.typicalTime;
        AlarmModel alarmModel = this.alarm;
        StringBuilder sbM91845o = AbstractC30007c.m91845o("SleepBoundModel(label=", textResource, ", icon=", str, ", predictedTime=");
        AbstractC30007c.m91855y(sbM91845o, textResource2, ", timeUnit=", textResource3, ", typicalTitle=");
        AbstractC30007c.m91855y(sbM91845o, textResource4, ", typicalTime=", textResource5, ", alarm=");
        sbM91845o.append(alarmModel);
        sbM91845o.append(")");
        return sbM91845o.toString();
    }

    public SleepBoundModel(TextResource label, String icon, TextResource predictedTime, TextResource timeUnit, TextResource typicalTitle, TextResource typicalTime, AlarmModel alarmModel) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(predictedTime, "predictedTime");
        AbstractC22676k.m65750j(timeUnit, "timeUnit");
        AbstractC22676k.m65750j(typicalTitle, "typicalTitle");
        AbstractC22676k.m65750j(typicalTime, "typicalTime");
        this.label = label;
        this.icon = icon;
        this.predictedTime = predictedTime;
        this.timeUnit = timeUnit;
        this.typicalTitle = typicalTitle;
        this.typicalTime = typicalTime;
        this.alarm = alarmModel;
    }
}
