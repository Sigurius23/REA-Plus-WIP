package com.whoop.data.remote.domain.dto;

import com.google.gson.annotations.SerializedName;
import com.whoop.data.remote.domain.response.journal.JournalEntryWrapper;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001c¨\u0006."}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/JournalEntryWrapperDto;", "", "Lcom/whoop/data/remote/domain/dto/JournalEntryDto;", "journal", "Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;", "metadata", "<init>", "(Lcom/whoop/data/remote/domain/dto/JournalEntryDto;Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/data/remote/domain/dto/JournalEntryDto;Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/JournalEntryWrapperDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/data/remote/domain/response/journal/JournalEntryWrapper;", "toJournalEntryWrapper", "()Lcom/whoop/data/remote/domain/response/journal/JournalEntryWrapper;", "component1", "()Lcom/whoop/data/remote/domain/dto/JournalEntryDto;", "component2", "()Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;", "copy", "(Lcom/whoop/data/remote/domain/dto/JournalEntryDto;Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;)Lcom/whoop/data/remote/domain/dto/JournalEntryWrapperDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/data/remote/domain/dto/JournalEntryDto;", "getJournal", "Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;", "getMetadata", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class JournalEntryWrapperDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("journal")
    private final JournalEntryDto journal;

    @SerializedName("metadata")
    private final JournalEntryMetadataDto metadata;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/JournalEntryWrapperDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/JournalEntryWrapperDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return JournalEntryWrapperDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ JournalEntryWrapperDto(int i13, JournalEntryDto journalEntryDto, JournalEntryMetadataDto journalEntryMetadataDto, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, JournalEntryWrapperDto$$serializer.INSTANCE.getDescriptor());
        }
        this.journal = journalEntryDto;
        this.metadata = journalEntryMetadataDto;
    }

    public static /* synthetic */ JournalEntryWrapperDto copy$default(JournalEntryWrapperDto journalEntryWrapperDto, JournalEntryDto journalEntryDto, JournalEntryMetadataDto journalEntryMetadataDto, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            journalEntryDto = journalEntryWrapperDto.journal;
        }
        if ((i13 & 2) != 0) {
            journalEntryMetadataDto = journalEntryWrapperDto.metadata;
        }
        return journalEntryWrapperDto.copy(journalEntryDto, journalEntryMetadataDto);
    }

    public static final /* synthetic */ void write$Self$core_release(JournalEntryWrapperDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, JournalEntryDto$$serializer.INSTANCE, self.journal);
        output.encodeSerializableElement(serialDesc, 1, JournalEntryMetadataDto$$serializer.INSTANCE, self.metadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final JournalEntryDto getJournal() {
        return this.journal;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JournalEntryMetadataDto getMetadata() {
        return this.metadata;
    }

    public final JournalEntryWrapperDto copy(JournalEntryDto journal, JournalEntryMetadataDto metadata) {
        AbstractC22676k.m65750j(metadata, "metadata");
        return new JournalEntryWrapperDto(journal, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JournalEntryWrapperDto)) {
            return false;
        }
        JournalEntryWrapperDto journalEntryWrapperDto = (JournalEntryWrapperDto) other;
        return AbstractC22676k.m65745e(this.journal, journalEntryWrapperDto.journal) && AbstractC22676k.m65745e(this.metadata, journalEntryWrapperDto.metadata);
    }

    public final JournalEntryDto getJournal() {
        return this.journal;
    }

    public final JournalEntryMetadataDto getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        JournalEntryDto journalEntryDto = this.journal;
        return this.metadata.hashCode() + ((journalEntryDto == null ? 0 : journalEntryDto.hashCode()) * 31);
    }

    public final JournalEntryWrapper toJournalEntryWrapper() {
        JournalEntryDto journalEntryDto = this.journal;
        return new JournalEntryWrapper(journalEntryDto != null ? journalEntryDto.toJournalEntry() : null, this.metadata.toJournalEntryMetadata());
    }

    public String toString() {
        return "JournalEntryWrapperDto(journal=" + this.journal + ", metadata=" + this.metadata + ")";
    }

    public JournalEntryWrapperDto(JournalEntryDto journalEntryDto, JournalEntryMetadataDto metadata) {
        AbstractC22676k.m65750j(metadata, "metadata");
        this.journal = journalEntryDto;
        this.metadata = metadata;
    }
}
