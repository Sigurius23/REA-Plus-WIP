package com.whoop.data.remote.domain.request;

import com.google.gson.annotations.SerializedName;
import com.whoop.data.remote.domain.dto.QuestionType;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlin.C2012k;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002CBBW\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B_\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b&\u0010#J\u0012\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b)\u0010*Jb\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b-\u0010#J\u0010\u0010.\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b.\u0010!J\u001a\u00100\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00102\u0012\u0004\b4\u00105\u001a\u0004\b3\u0010\u001fR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00106\u0012\u0004\b8\u00105\u001a\u0004\b7\u0010!R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010%R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b=\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bA\u0010*¨\u0006D"}, m65681d2 = {"Lcom/whoop/data/remote/domain/request/JournalTrackerInput;", "", "", "answered", "", "trackerId", "", "magnitudeInputLabel", "", "magnitudeInputValue", "timeInputLabel", "", "timeInputValue", "Lcom/whoop/data/remote/domain/dto/QuestionType;", "questionType", "<init>", "(Ljava/lang/Boolean;ILjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/data/remote/domain/dto/QuestionType;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Boolean;ILjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/data/remote/domain/dto/QuestionType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/request/JournalTrackerInput;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "component2", "()I", "component3", "()Ljava/lang/String;", "component4", "()Ljava/lang/Float;", "component5", "component6", "()Ljava/lang/Long;", "component7", "()Lcom/whoop/data/remote/domain/dto/QuestionType;", "copy", "(Ljava/lang/Boolean;ILjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/data/remote/domain/dto/QuestionType;)Lcom/whoop/data/remote/domain/request/JournalTrackerInput;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getAnswered", "getAnswered$annotations", "()V", "I", "getTrackerId", "getTrackerId$annotations", "Ljava/lang/String;", "getMagnitudeInputLabel", "Ljava/lang/Float;", "getMagnitudeInputValue", "getTimeInputLabel", "Ljava/lang/Long;", "getTimeInputValue", "Lcom/whoop/data/remote/domain/dto/QuestionType;", "getQuestionType", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class JournalTrackerInput {

    @SerializedName("answered_yes")
    private final Boolean answered;

    @SerializedName("magnitude_input_label")
    private final String magnitudeInputLabel;

    @SerializedName("magnitude_input_value")
    private final Float magnitudeInputValue;
    private final QuestionType questionType;

    @SerializedName("time_input_label")
    private final String timeInputLabel;

    @SerializedName("time_input_value")
    private final Long timeInputValue;

    @SerializedName("behavior_tracker_id")
    private final int trackerId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C2012k(11))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/request/JournalTrackerInput$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/request/JournalTrackerInput;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return JournalTrackerInput$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ JournalTrackerInput(int i13, Boolean bool, int i14, String str, Float f13, String str2, Long l7, QuestionType questionType, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i13 & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2, JournalTrackerInput$$serializer.INSTANCE.getDescriptor());
        }
        this.answered = (i13 & 1) == 0 ? Boolean.FALSE : bool;
        this.trackerId = i14;
        if ((i13 & 4) == 0) {
            this.magnitudeInputLabel = null;
        } else {
            this.magnitudeInputLabel = str;
        }
        if ((i13 & 8) == 0) {
            this.magnitudeInputValue = null;
        } else {
            this.magnitudeInputValue = f13;
        }
        if ((i13 & 16) == 0) {
            this.timeInputLabel = null;
        } else {
            this.timeInputLabel = str2;
        }
        if ((i13 & 32) == 0) {
            this.timeInputValue = null;
        } else {
            this.timeInputValue = l7;
        }
        if ((i13 & 64) == 0) {
            this.questionType = null;
        } else {
            this.questionType = questionType;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.data.remote.domain.dto.QuestionType", QuestionType.values());
    }

    public static /* synthetic */ JournalTrackerInput copy$default(JournalTrackerInput journalTrackerInput, Boolean bool, int i13, String str, Float f13, String str2, Long l7, QuestionType questionType, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            bool = journalTrackerInput.answered;
        }
        if ((i14 & 2) != 0) {
            i13 = journalTrackerInput.trackerId;
        }
        if ((i14 & 4) != 0) {
            str = journalTrackerInput.magnitudeInputLabel;
        }
        if ((i14 & 8) != 0) {
            f13 = journalTrackerInput.magnitudeInputValue;
        }
        if ((i14 & 16) != 0) {
            str2 = journalTrackerInput.timeInputLabel;
        }
        if ((i14 & 32) != 0) {
            l7 = journalTrackerInput.timeInputValue;
        }
        if ((i14 & 64) != 0) {
            questionType = journalTrackerInput.questionType;
        }
        Long l12 = l7;
        QuestionType questionType2 = questionType;
        String str3 = str2;
        String str4 = str;
        return journalTrackerInput.copy(bool, i13, str4, f13, str3, l12, questionType2);
    }

    @InterfaceC37143h("answered_yes")
    public static /* synthetic */ void getAnswered$annotations() {
    }

    @InterfaceC37143h("behavior_tracker_id")
    public static /* synthetic */ void getTrackerId$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_release(JournalTrackerInput self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.answered, Boolean.FALSE)) {
            output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.answered);
        }
        output.encodeIntElement(serialDesc, 1, self.trackerId);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.magnitudeInputLabel != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.magnitudeInputLabel);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.magnitudeInputValue != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, FloatSerializer.INSTANCE, self.magnitudeInputValue);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.timeInputLabel != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.timeInputLabel);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.timeInputValue != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, LongSerializer.INSTANCE, self.timeInputValue);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.questionType == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.questionType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getAnswered() {
        return this.answered;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTrackerId() {
        return this.trackerId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMagnitudeInputLabel() {
        return this.magnitudeInputLabel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Float getMagnitudeInputValue() {
        return this.magnitudeInputValue;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTimeInputLabel() {
        return this.timeInputLabel;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getTimeInputValue() {
        return this.timeInputValue;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final QuestionType getQuestionType() {
        return this.questionType;
    }

    public final JournalTrackerInput copy(Boolean answered, int trackerId, String magnitudeInputLabel, Float magnitudeInputValue, String timeInputLabel, Long timeInputValue, QuestionType questionType) {
        return new JournalTrackerInput(answered, trackerId, magnitudeInputLabel, magnitudeInputValue, timeInputLabel, timeInputValue, questionType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JournalTrackerInput)) {
            return false;
        }
        JournalTrackerInput journalTrackerInput = (JournalTrackerInput) other;
        return AbstractC22676k.m65745e(this.answered, journalTrackerInput.answered) && this.trackerId == journalTrackerInput.trackerId && AbstractC22676k.m65745e(this.magnitudeInputLabel, journalTrackerInput.magnitudeInputLabel) && AbstractC22676k.m65745e(this.magnitudeInputValue, journalTrackerInput.magnitudeInputValue) && AbstractC22676k.m65745e(this.timeInputLabel, journalTrackerInput.timeInputLabel) && AbstractC22676k.m65745e(this.timeInputValue, journalTrackerInput.timeInputValue) && this.questionType == journalTrackerInput.questionType;
    }

    public final Boolean getAnswered() {
        return this.answered;
    }

    public final String getMagnitudeInputLabel() {
        return this.magnitudeInputLabel;
    }

    public final Float getMagnitudeInputValue() {
        return this.magnitudeInputValue;
    }

    public final QuestionType getQuestionType() {
        return this.questionType;
    }

    public final String getTimeInputLabel() {
        return this.timeInputLabel;
    }

    public final Long getTimeInputValue() {
        return this.timeInputValue;
    }

    public final int getTrackerId() {
        return this.trackerId;
    }

    public int hashCode() {
        Boolean bool = this.answered;
        int iM30448b = AbstractC11266d.m30448b(this.trackerId, (bool == null ? 0 : bool.hashCode()) * 31, 31);
        String str = this.magnitudeInputLabel;
        int iHashCode = (iM30448b + (str == null ? 0 : str.hashCode())) * 31;
        Float f13 = this.magnitudeInputValue;
        int iHashCode2 = (iHashCode + (f13 == null ? 0 : f13.hashCode())) * 31;
        String str2 = this.timeInputLabel;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l7 = this.timeInputValue;
        int iHashCode4 = (iHashCode3 + (l7 == null ? 0 : l7.hashCode())) * 31;
        QuestionType questionType = this.questionType;
        return iHashCode4 + (questionType != null ? questionType.hashCode() : 0);
    }

    public String toString() {
        return "JournalTrackerInput(answered=" + this.answered + ", trackerId=" + this.trackerId + ", magnitudeInputLabel=" + this.magnitudeInputLabel + ", magnitudeInputValue=" + this.magnitudeInputValue + ", timeInputLabel=" + this.timeInputLabel + ", timeInputValue=" + this.timeInputValue + ", questionType=" + this.questionType + ")";
    }

    public JournalTrackerInput(Boolean bool, int i13, String str, Float f13, String str2, Long l7, QuestionType questionType) {
        this.answered = bool;
        this.trackerId = i13;
        this.magnitudeInputLabel = str;
        this.magnitudeInputValue = f13;
        this.timeInputLabel = str2;
        this.timeInputValue = l7;
        this.questionType = questionType;
    }

    public /* synthetic */ JournalTrackerInput(Boolean bool, int i13, String str, Float f13, String str2, Long l7, QuestionType questionType, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? Boolean.FALSE : bool, i13, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : f13, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? null : l7, (i14 & 64) != 0 ? null : questionType);
    }
}
