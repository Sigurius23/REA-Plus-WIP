package com.whoop.data.remote.domain.dto;

import com.google.gson.annotations.SerializedName;
import com.whoop.data.remote.domain.response.journal.JournalBehaviorTracker;
import com.whoop.data.remote.domain.response.journal.UserSelectedJournalBehaviorResponse;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import vs2.C36478d;
import vw0.C36541a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xb3.AbstractC38176k;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ.\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010+R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001c¨\u00060"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/UserSelectedJournalBehaviorResponseDto;", "", "", "totalCount", "", "Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;", "records", "<init>", "(Ljava/lang/Integer;Ljava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/UserSelectedJournalBehaviorResponseDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/data/remote/domain/response/journal/UserSelectedJournalBehaviorResponse;", "toUserSelectedJournalBehaviorResponse", "()Lcom/whoop/data/remote/domain/response/journal/UserSelectedJournalBehaviorResponse;", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/Integer;Ljava/util/List;)Lcom/whoop/data/remote/domain/dto/UserSelectedJournalBehaviorResponseDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getTotalCount", "setTotalCount", "(Ljava/lang/Integer;)V", "Ljava/util/List;", "getRecords", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class UserSelectedJournalBehaviorResponseDto {

    @SerializedName("records")
    private final List<JournalBehaviorTrackerDto> records;

    @SerializedName("total_count")
    private Integer totalCount;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36541a(13))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/UserSelectedJournalBehaviorResponseDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/UserSelectedJournalBehaviorResponseDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return UserSelectedJournalBehaviorResponseDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ UserSelectedJournalBehaviorResponseDto(int i13, Integer num, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, UserSelectedJournalBehaviorResponseDto$$serializer.INSTANCE.getDescriptor());
        }
        this.totalCount = num;
        this.records = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(JournalBehaviorTrackerDto$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserSelectedJournalBehaviorResponseDto copy$default(UserSelectedJournalBehaviorResponseDto userSelectedJournalBehaviorResponseDto, Integer num, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = userSelectedJournalBehaviorResponseDto.totalCount;
        }
        if ((i13 & 2) != 0) {
            list = userSelectedJournalBehaviorResponseDto.records;
        }
        return userSelectedJournalBehaviorResponseDto.copy(num, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JournalBehaviorTracker toUserSelectedJournalBehaviorResponse$lambda$0(JournalBehaviorTrackerDto trackerDto) {
        AbstractC22676k.m65750j(trackerDto, "trackerDto");
        return trackerDto.toJournalBehaviorTracker();
    }

    public static final /* synthetic */ void write$Self$core_release(UserSelectedJournalBehaviorResponseDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.totalCount);
        output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.records);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getTotalCount() {
        return this.totalCount;
    }

    public final List<JournalBehaviorTrackerDto> component2() {
        return this.records;
    }

    public final UserSelectedJournalBehaviorResponseDto copy(Integer totalCount, List<JournalBehaviorTrackerDto> records) {
        return new UserSelectedJournalBehaviorResponseDto(totalCount, records);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserSelectedJournalBehaviorResponseDto)) {
            return false;
        }
        UserSelectedJournalBehaviorResponseDto userSelectedJournalBehaviorResponseDto = (UserSelectedJournalBehaviorResponseDto) other;
        return AbstractC22676k.m65745e(this.totalCount, userSelectedJournalBehaviorResponseDto.totalCount) && AbstractC22676k.m65745e(this.records, userSelectedJournalBehaviorResponseDto.records);
    }

    public final List<JournalBehaviorTrackerDto> getRecords() {
        return this.records;
    }

    public final Integer getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        Integer num = this.totalCount;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<JournalBehaviorTrackerDto> list = this.records;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final void setTotalCount(Integer num) {
        this.totalCount = num;
    }

    public String toString() {
        return "UserSelectedJournalBehaviorResponseDto(totalCount=" + this.totalCount + ", records=" + this.records + ")";
    }

    public final UserSelectedJournalBehaviorResponse toUserSelectedJournalBehaviorResponse() {
        Integer num = this.totalCount;
        AbstractC22676k.m65747g(num);
        int iIntValue = num.intValue();
        List<JournalBehaviorTrackerDto> list = this.records;
        AbstractC22676k.m65747g(list);
        return new UserSelectedJournalBehaviorResponse(iIntValue, AbstractC38176k.m122276E(AbstractC38176k.m122272A(AbstractC25265s.m74145r0(list), new C36478d(9))));
    }

    public UserSelectedJournalBehaviorResponseDto(Integer num, List<JournalBehaviorTrackerDto> list) {
        this.totalCount = num;
        this.records = list;
    }
}
