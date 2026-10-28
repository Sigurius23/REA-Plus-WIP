package com.whoop.data.remote.domain.dto.community.share;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J2\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0017J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u0019¨\u0006*"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/community/share/SelectTeamDto;", "", "", "id", "", "name", "avatar", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/community/share/SelectTeamDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "copy", "(ILjava/lang/String;Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/community/share/SelectTeamDto;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getName", "getAvatar", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SelectTeamDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String avatar;
    private final int id;
    private final String name;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/community/share/SelectTeamDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/community/share/SelectTeamDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SelectTeamDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SelectTeamDto(int i13, int i14, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, SelectTeamDto$$serializer.INSTANCE.getDescriptor());
        }
        this.id = i14;
        this.name = str;
        this.avatar = str2;
    }

    public static /* synthetic */ SelectTeamDto copy$default(SelectTeamDto selectTeamDto, int i13, String str, String str2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = selectTeamDto.id;
        }
        if ((i14 & 2) != 0) {
            str = selectTeamDto.name;
        }
        if ((i14 & 4) != 0) {
            str2 = selectTeamDto.avatar;
        }
        return selectTeamDto.copy(i13, str, str2);
    }

    public static final /* synthetic */ void write$Self$core_release(SelectTeamDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.id);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.name);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.avatar);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    public final SelectTeamDto copy(int id4, String name, String avatar) {
        return new SelectTeamDto(id4, name, avatar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectTeamDto)) {
            return false;
        }
        SelectTeamDto selectTeamDto = (SelectTeamDto) other;
        return this.id == selectTeamDto.id && AbstractC22676k.m65745e(this.name, selectTeamDto.name) && AbstractC22676k.m65745e(this.avatar, selectTeamDto.avatar);
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.avatar;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.avatar, ")", AbstractC18489d0.m53373n(this.id, "SelectTeamDto(id=", ", name=", this.name, ", avatar="));
    }

    public SelectTeamDto(int i13, String str, String str2) {
        this.id = i13;
        this.name = str;
        this.avatar = str2;
    }
}
