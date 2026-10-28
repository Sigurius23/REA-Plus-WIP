package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ<\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b-\u0010\u001c¨\u00060"}, m65681d2 = {"Lcom/whoop/design/models/items/ExerciseRecordHeaderModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "achievementIcon", "recordDate", "Lcom/whoop/design/models/items/ExerciseRecordMetricModel;", "recordSubtitle", "recordTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ExerciseRecordMetricModel;Lcom/whoop/design/models/items/ExerciseRecordMetricModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ExerciseRecordMetricModel;Lcom/whoop/design/models/items/ExerciseRecordMetricModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ExerciseRecordHeaderModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/models/items/ExerciseRecordMetricModel;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ExerciseRecordMetricModel;Lcom/whoop/design/models/items/ExerciseRecordMetricModel;)Lcom/whoop/design/models/items/ExerciseRecordHeaderModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAchievementIcon", "getRecordDate", "Lcom/whoop/design/models/items/ExerciseRecordMetricModel;", "getRecordSubtitle", "getRecordTitle", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ExerciseRecordHeaderModel implements DesignSystemModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String achievementIcon;
    private final String recordDate;
    private final ExerciseRecordMetricModel recordSubtitle;
    private final ExerciseRecordMetricModel recordTitle;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ExerciseRecordHeaderModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ExerciseRecordHeaderModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ExerciseRecordHeaderModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ExerciseRecordHeaderModel(int i13, String str, String str2, ExerciseRecordMetricModel exerciseRecordMetricModel, ExerciseRecordMetricModel exerciseRecordMetricModel2, SerializationConstructorMarker serializationConstructorMarker) {
        if (10 != (i13 & 10)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 10, ExerciseRecordHeaderModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.achievementIcon = null;
        } else {
            this.achievementIcon = str;
        }
        this.recordDate = str2;
        if ((i13 & 4) == 0) {
            this.recordSubtitle = null;
        } else {
            this.recordSubtitle = exerciseRecordMetricModel;
        }
        this.recordTitle = exerciseRecordMetricModel2;
    }

    public static /* synthetic */ ExerciseRecordHeaderModel copy$default(ExerciseRecordHeaderModel exerciseRecordHeaderModel, String str, String str2, ExerciseRecordMetricModel exerciseRecordMetricModel, ExerciseRecordMetricModel exerciseRecordMetricModel2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = exerciseRecordHeaderModel.achievementIcon;
        }
        if ((i13 & 2) != 0) {
            str2 = exerciseRecordHeaderModel.recordDate;
        }
        if ((i13 & 4) != 0) {
            exerciseRecordMetricModel = exerciseRecordHeaderModel.recordSubtitle;
        }
        if ((i13 & 8) != 0) {
            exerciseRecordMetricModel2 = exerciseRecordHeaderModel.recordTitle;
        }
        return exerciseRecordHeaderModel.copy(str, str2, exerciseRecordMetricModel, exerciseRecordMetricModel2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ExerciseRecordHeaderModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.achievementIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.achievementIcon);
        }
        output.encodeStringElement(serialDesc, 1, self.recordDate);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.recordSubtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, ExerciseRecordMetricModel$$serializer.INSTANCE, self.recordSubtitle);
        }
        output.encodeSerializableElement(serialDesc, 3, ExerciseRecordMetricModel$$serializer.INSTANCE, self.recordTitle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAchievementIcon() {
        return this.achievementIcon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRecordDate() {
        return this.recordDate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ExerciseRecordMetricModel getRecordSubtitle() {
        return this.recordSubtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ExerciseRecordMetricModel getRecordTitle() {
        return this.recordTitle;
    }

    public final ExerciseRecordHeaderModel copy(String achievementIcon, String recordDate, ExerciseRecordMetricModel recordSubtitle, ExerciseRecordMetricModel recordTitle) {
        AbstractC22676k.m65750j(recordDate, "recordDate");
        AbstractC22676k.m65750j(recordTitle, "recordTitle");
        return new ExerciseRecordHeaderModel(achievementIcon, recordDate, recordSubtitle, recordTitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExerciseRecordHeaderModel)) {
            return false;
        }
        ExerciseRecordHeaderModel exerciseRecordHeaderModel = (ExerciseRecordHeaderModel) other;
        return AbstractC22676k.m65745e(this.achievementIcon, exerciseRecordHeaderModel.achievementIcon) && AbstractC22676k.m65745e(this.recordDate, exerciseRecordHeaderModel.recordDate) && AbstractC22676k.m65745e(this.recordSubtitle, exerciseRecordHeaderModel.recordSubtitle) && AbstractC22676k.m65745e(this.recordTitle, exerciseRecordHeaderModel.recordTitle);
    }

    public final String getAchievementIcon() {
        return this.achievementIcon;
    }

    public final String getRecordDate() {
        return this.recordDate;
    }

    public final ExerciseRecordMetricModel getRecordSubtitle() {
        return this.recordSubtitle;
    }

    public final ExerciseRecordMetricModel getRecordTitle() {
        return this.recordTitle;
    }

    public int hashCode() {
        String str = this.achievementIcon;
        int iM30450d = AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.recordDate);
        ExerciseRecordMetricModel exerciseRecordMetricModel = this.recordSubtitle;
        return this.recordTitle.hashCode() + ((iM30450d + (exerciseRecordMetricModel != null ? exerciseRecordMetricModel.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.achievementIcon;
        String str2 = this.recordDate;
        ExerciseRecordMetricModel exerciseRecordMetricModel = this.recordSubtitle;
        ExerciseRecordMetricModel exerciseRecordMetricModel2 = this.recordTitle;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ExerciseRecordHeaderModel(achievementIcon=", str, ", recordDate=", str2, ", recordSubtitle=");
        sbM32001t.append(exerciseRecordMetricModel);
        sbM32001t.append(", recordTitle=");
        sbM32001t.append(exerciseRecordMetricModel2);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public ExerciseRecordHeaderModel(String str, String recordDate, ExerciseRecordMetricModel exerciseRecordMetricModel, ExerciseRecordMetricModel recordTitle) {
        AbstractC22676k.m65750j(recordDate, "recordDate");
        AbstractC22676k.m65750j(recordTitle, "recordTitle");
        this.achievementIcon = str;
        this.recordDate = recordDate;
        this.recordSubtitle = exerciseRecordMetricModel;
        this.recordTitle = recordTitle;
    }

    public /* synthetic */ ExerciseRecordHeaderModel(String str, String str2, ExerciseRecordMetricModel exerciseRecordMetricModel, ExerciseRecordMetricModel exerciseRecordMetricModel2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, str2, (i13 & 4) != 0 ? null : exerciseRecordMetricModel, exerciseRecordMetricModel2);
    }
}
