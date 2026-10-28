package com.whoop.data.remote.domain.dto;

import com.google.gson.annotations.SerializedName;
import com.whoop.data.remote.domain.response.journal.JournalBehaviourTrackerHistory;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!JL\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b1\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00102\u0012\u0004\b4\u00105\u001a\u0004\b3\u0010!¨\u00068"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;", "", "", "behaviorTrackerId", "userId", "yesCount", "noCount", "Lcom/whoop/data/remote/domain/dto/TrackerValueDto;", "trackerValue", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/data/remote/domain/dto/TrackerValueDto;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/data/remote/domain/dto/TrackerValueDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;", "toJournalBehaviourTrackerHistory", "()Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "component5", "()Lcom/whoop/data/remote/domain/dto/TrackerValueDto;", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/data/remote/domain/dto/TrackerValueDto;)Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getBehaviorTrackerId", "getUserId", "getYesCount", "getNoCount", "Lcom/whoop/data/remote/domain/dto/TrackerValueDto;", "getTrackerValue", "getTrackerValue$annotations", "()V", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class JournalBehaviourTrackerHistoryDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("behavior_tracker_id")
    private final Integer behaviorTrackerId;

    @SerializedName("no_count")
    private final Integer noCount;

    @SerializedName("last_value")
    private final TrackerValueDto trackerValue;

    @SerializedName("user_id")
    private final Integer userId;

    @SerializedName("yes_count")
    private final Integer yesCount;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return JournalBehaviourTrackerHistoryDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ JournalBehaviourTrackerHistoryDto(int i13, Integer num, Integer num2, Integer num3, Integer num4, TrackerValueDto trackerValueDto, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, JournalBehaviourTrackerHistoryDto$$serializer.INSTANCE.getDescriptor());
        }
        this.behaviorTrackerId = num;
        this.userId = num2;
        this.yesCount = num3;
        this.noCount = num4;
        this.trackerValue = trackerValueDto;
    }

    public static /* synthetic */ JournalBehaviourTrackerHistoryDto copy$default(JournalBehaviourTrackerHistoryDto journalBehaviourTrackerHistoryDto, Integer num, Integer num2, Integer num3, Integer num4, TrackerValueDto trackerValueDto, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = journalBehaviourTrackerHistoryDto.behaviorTrackerId;
        }
        if ((i13 & 2) != 0) {
            num2 = journalBehaviourTrackerHistoryDto.userId;
        }
        if ((i13 & 4) != 0) {
            num3 = journalBehaviourTrackerHistoryDto.yesCount;
        }
        if ((i13 & 8) != 0) {
            num4 = journalBehaviourTrackerHistoryDto.noCount;
        }
        if ((i13 & 16) != 0) {
            trackerValueDto = journalBehaviourTrackerHistoryDto.trackerValue;
        }
        TrackerValueDto trackerValueDto2 = trackerValueDto;
        Integer num5 = num3;
        return journalBehaviourTrackerHistoryDto.copy(num, num2, num5, num4, trackerValueDto2);
    }

    @InterfaceC37143h("last_value")
    public static /* synthetic */ void getTrackerValue$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_release(JournalBehaviourTrackerHistoryDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, intSerializer, self.behaviorTrackerId);
        output.encodeNullableSerializableElement(serialDesc, 1, intSerializer, self.userId);
        output.encodeNullableSerializableElement(serialDesc, 2, intSerializer, self.yesCount);
        output.encodeNullableSerializableElement(serialDesc, 3, intSerializer, self.noCount);
        output.encodeNullableSerializableElement(serialDesc, 4, TrackerValueDto$$serializer.INSTANCE, self.trackerValue);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getBehaviorTrackerId() {
        return this.behaviorTrackerId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getYesCount() {
        return this.yesCount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getNoCount() {
        return this.noCount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TrackerValueDto getTrackerValue() {
        return this.trackerValue;
    }

    public final JournalBehaviourTrackerHistoryDto copy(Integer behaviorTrackerId, Integer userId, Integer yesCount, Integer noCount, TrackerValueDto trackerValue) {
        return new JournalBehaviourTrackerHistoryDto(behaviorTrackerId, userId, yesCount, noCount, trackerValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JournalBehaviourTrackerHistoryDto)) {
            return false;
        }
        JournalBehaviourTrackerHistoryDto journalBehaviourTrackerHistoryDto = (JournalBehaviourTrackerHistoryDto) other;
        return AbstractC22676k.m65745e(this.behaviorTrackerId, journalBehaviourTrackerHistoryDto.behaviorTrackerId) && AbstractC22676k.m65745e(this.userId, journalBehaviourTrackerHistoryDto.userId) && AbstractC22676k.m65745e(this.yesCount, journalBehaviourTrackerHistoryDto.yesCount) && AbstractC22676k.m65745e(this.noCount, journalBehaviourTrackerHistoryDto.noCount) && AbstractC22676k.m65745e(this.trackerValue, journalBehaviourTrackerHistoryDto.trackerValue);
    }

    public final Integer getBehaviorTrackerId() {
        return this.behaviorTrackerId;
    }

    public final Integer getNoCount() {
        return this.noCount;
    }

    public final TrackerValueDto getTrackerValue() {
        return this.trackerValue;
    }

    public final Integer getUserId() {
        return this.userId;
    }

    public final Integer getYesCount() {
        return this.yesCount;
    }

    public int hashCode() {
        Integer num = this.behaviorTrackerId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.userId;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.yesCount;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.noCount;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        TrackerValueDto trackerValueDto = this.trackerValue;
        return iHashCode4 + (trackerValueDto != null ? trackerValueDto.hashCode() : 0);
    }

    public final JournalBehaviourTrackerHistory toJournalBehaviourTrackerHistory() {
        Integer num = this.userId;
        AbstractC22676k.m65747g(num);
        int iIntValue = num.intValue();
        Integer num2 = this.behaviorTrackerId;
        AbstractC22676k.m65747g(num2);
        int iIntValue2 = num2.intValue();
        Integer num3 = this.yesCount;
        AbstractC22676k.m65747g(num3);
        int iIntValue3 = num3.intValue();
        Integer num4 = this.noCount;
        AbstractC22676k.m65747g(num4);
        int iIntValue4 = num4.intValue();
        TrackerValueDto trackerValueDto = this.trackerValue;
        return new JournalBehaviourTrackerHistory(iIntValue2, iIntValue, iIntValue3, iIntValue4, trackerValueDto != null ? trackerValueDto.toTrackerValue() : null);
    }

    public String toString() {
        Integer num = this.behaviorTrackerId;
        Integer num2 = this.userId;
        Integer num3 = this.yesCount;
        Integer num4 = this.noCount;
        TrackerValueDto trackerValueDto = this.trackerValue;
        StringBuilder sbM114684l = AbstractC36095b.m114684l("JournalBehaviourTrackerHistoryDto(behaviorTrackerId=", num, ", userId=", num2, ", yesCount=");
        AbstractC31061c.m95621A(sbM114684l, num3, ", noCount=", num4, ", trackerValue=");
        sbM114684l.append(trackerValueDto);
        sbM114684l.append(")");
        return sbM114684l.toString();
    }

    public JournalBehaviourTrackerHistoryDto(Integer num, Integer num2, Integer num3, Integer num4, TrackerValueDto trackerValueDto) {
        this.behaviorTrackerId = num;
        this.userId = num2;
        this.yesCount = num3;
        this.noCount = num4;
        this.trackerValue = trackerValueDto;
    }
}
