package com.whoop.weightlifting.data.dto;

import com.whoop.coacheverywherecommon.models.AiContextMetadata;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006)"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/WorkoutLibraryMetadataListItemDto;", "", "", "id", "Lcom/whoop/weightlifting/data/dto/MetaData;", "metadata", "<init>", "(Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/MetaData;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/weightlifting/data/dto/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/data/dto/WorkoutLibraryMetadataListItemDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/weightlifting/data/dto/MetaData;", "copy", "(Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/MetaData;)Lcom/whoop/weightlifting/data/dto/WorkoutLibraryMetadataListItemDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/whoop/weightlifting/data/dto/MetaData;", "getMetadata", "Companion", "$serializer", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WorkoutLibraryMetadataListItemDto {
    private final String id;
    private final MetaData metadata;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = AiContextMetadata.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/WorkoutLibraryMetadataListItemDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/data/dto/WorkoutLibraryMetadataListItemDto;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WorkoutLibraryMetadataListItemDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WorkoutLibraryMetadataListItemDto(int i13, String str, MetaData metaData, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, WorkoutLibraryMetadataListItemDto$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        if ((i13 & 2) == 0) {
            this.metadata = null;
        } else {
            this.metadata = metaData;
        }
    }

    public static /* synthetic */ WorkoutLibraryMetadataListItemDto copy$default(WorkoutLibraryMetadataListItemDto workoutLibraryMetadataListItemDto, String str, MetaData metaData, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = workoutLibraryMetadataListItemDto.id;
        }
        if ((i13 & 2) != 0) {
            metaData = workoutLibraryMetadataListItemDto.metadata;
        }
        return workoutLibraryMetadataListItemDto.copy(str, metaData);
    }

    public static final /* synthetic */ void write$Self$weightlifting_release(WorkoutLibraryMetadataListItemDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.metadata == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, MetaData$$serializer.INSTANCE, self.metadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final WorkoutLibraryMetadataListItemDto copy(String id4, MetaData metadata) {
        AbstractC22676k.m65750j(id4, "id");
        return new WorkoutLibraryMetadataListItemDto(id4, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkoutLibraryMetadataListItemDto)) {
            return false;
        }
        WorkoutLibraryMetadataListItemDto workoutLibraryMetadataListItemDto = (WorkoutLibraryMetadataListItemDto) other;
        return AbstractC22676k.m65745e(this.id, workoutLibraryMetadataListItemDto.id) && AbstractC22676k.m65745e(this.metadata, workoutLibraryMetadataListItemDto.metadata);
    }

    public final String getId() {
        return this.id;
    }

    public final MetaData getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        MetaData metaData = this.metadata;
        return iHashCode + (metaData == null ? 0 : metaData.hashCode());
    }

    public String toString() {
        return "WorkoutLibraryMetadataListItemDto(id=" + this.id + ", metadata=" + this.metadata + ")";
    }

    public WorkoutLibraryMetadataListItemDto(String id4, MetaData metaData) {
        AbstractC22676k.m65750j(id4, "id");
        this.id = id4;
        this.metadata = metaData;
    }

    public /* synthetic */ WorkoutLibraryMetadataListItemDto(String str, MetaData metaData, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : metaData);
    }
}
