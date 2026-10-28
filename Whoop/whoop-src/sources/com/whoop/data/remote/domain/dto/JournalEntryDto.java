package com.whoop.data.remote.domain.dto;

import com.google.gson.annotations.SerializedName;
import com.whoop.data.remote.domain.response.journal.JournalEntry;
import com.whoop.data.remote.domain.response.journal.TrackedBehavior;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
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
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010$JF\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b'\u0010\"J\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010\"R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010$¨\u00068"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/JournalEntryDto;", "", "", "cycleId", "", "journalEntryId", "", "notes", "", "Lcom/whoop/data/remote/domain/dto/TrackedBehaviorDto;", "trackedBehaviors", "<init>", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/JournalEntryDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/data/remote/domain/response/journal/JournalEntry;", "toJournalEntry", "()Lcom/whoop/data/remote/domain/response/journal/JournalEntry;", "component1", "()Ljava/lang/Long;", "component2", "()Ljava/lang/Integer;", "component3", "()Ljava/lang/String;", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/data/remote/domain/dto/JournalEntryDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getCycleId", "Ljava/lang/Integer;", "getJournalEntryId", "Ljava/lang/String;", "getNotes", "Ljava/util/List;", "getTrackedBehaviors", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class JournalEntryDto {

    @SerializedName("cycle_id")
    private final Long cycleId;

    @SerializedName("journal_entry_id")
    private final Integer journalEntryId;

    @SerializedName("notes")
    private final String notes;

    @SerializedName("tracked_behaviors")
    private final List<TrackedBehaviorDto> trackedBehaviors;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36541a(3))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/JournalEntryDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/JournalEntryDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return JournalEntryDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ JournalEntryDto(int i13, Long l7, Integer num, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, JournalEntryDto$$serializer.INSTANCE.getDescriptor());
        }
        this.cycleId = l7;
        this.journalEntryId = num;
        this.notes = str;
        this.trackedBehaviors = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(TrackedBehaviorDto$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JournalEntryDto copy$default(JournalEntryDto journalEntryDto, Long l7, Integer num, String str, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            l7 = journalEntryDto.cycleId;
        }
        if ((i13 & 2) != 0) {
            num = journalEntryDto.journalEntryId;
        }
        if ((i13 & 4) != 0) {
            str = journalEntryDto.notes;
        }
        if ((i13 & 8) != 0) {
            list = journalEntryDto.trackedBehaviors;
        }
        return journalEntryDto.copy(l7, num, str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TrackedBehavior toJournalEntry$lambda$0(TrackedBehaviorDto trackedBehaviorDto) {
        AbstractC22676k.m65750j(trackedBehaviorDto, "trackedBehaviorDto");
        return trackedBehaviorDto.toTrackedBehavior();
    }

    public static final /* synthetic */ void write$Self$core_release(JournalEntryDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, LongSerializer.INSTANCE, self.cycleId);
        output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.journalEntryId);
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.notes);
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.trackedBehaviors);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getCycleId() {
        return this.cycleId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getJournalEntryId() {
        return this.journalEntryId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNotes() {
        return this.notes;
    }

    public final List<TrackedBehaviorDto> component4() {
        return this.trackedBehaviors;
    }

    public final JournalEntryDto copy(Long cycleId, Integer journalEntryId, String notes, List<TrackedBehaviorDto> trackedBehaviors) {
        return new JournalEntryDto(cycleId, journalEntryId, notes, trackedBehaviors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JournalEntryDto)) {
            return false;
        }
        JournalEntryDto journalEntryDto = (JournalEntryDto) other;
        return AbstractC22676k.m65745e(this.cycleId, journalEntryDto.cycleId) && AbstractC22676k.m65745e(this.journalEntryId, journalEntryDto.journalEntryId) && AbstractC22676k.m65745e(this.notes, journalEntryDto.notes) && AbstractC22676k.m65745e(this.trackedBehaviors, journalEntryDto.trackedBehaviors);
    }

    public final Long getCycleId() {
        return this.cycleId;
    }

    public final Integer getJournalEntryId() {
        return this.journalEntryId;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final List<TrackedBehaviorDto> getTrackedBehaviors() {
        return this.trackedBehaviors;
    }

    public int hashCode() {
        Long l7 = this.cycleId;
        int iHashCode = (l7 == null ? 0 : l7.hashCode()) * 31;
        Integer num = this.journalEntryId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.notes;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<TrackedBehaviorDto> list = this.trackedBehaviors;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final JournalEntry toJournalEntry() {
        Integer num = this.journalEntryId;
        String str = this.notes;
        List<TrackedBehaviorDto> list = this.trackedBehaviors;
        AbstractC22676k.m65747g(list);
        return new JournalEntry(num, str, AbstractC38176k.m122276E(AbstractC38176k.m122272A(AbstractC25265s.m74145r0(list), new C36478d(6))));
    }

    public String toString() {
        Long l7 = this.cycleId;
        Integer num = this.journalEntryId;
        String str = this.notes;
        List<TrackedBehaviorDto> list = this.trackedBehaviors;
        StringBuilder sb4 = new StringBuilder("JournalEntryDto(cycleId=");
        sb4.append(l7);
        sb4.append(", journalEntryId=");
        sb4.append(num);
        sb4.append(", notes=");
        return AbstractC30007c.m91840j(str, ", trackedBehaviors=", ")", sb4, list);
    }

    public JournalEntryDto(Long l7, Integer num, String str, List<TrackedBehaviorDto> list) {
        this.cycleId = l7;
        this.journalEntryId = num;
        this.notes = str;
        this.trackedBehaviors = list;
    }
}
