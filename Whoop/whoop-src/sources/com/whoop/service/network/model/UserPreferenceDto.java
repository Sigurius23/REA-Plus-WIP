package com.whoop.service.network.model;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006'"}, m65681d2 = {"Lcom/whoop/service/network/model/UserPreferenceDto;", "", "", "autoDetectWorkout", "autoClassifyWorkout", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/service/network/model/UserPreferenceDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/service/network/model/UserPreferenceDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getAutoDetectWorkout", "getAutoClassifyWorkout", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class UserPreferenceDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Boolean autoClassifyWorkout;
    private final Boolean autoDetectWorkout;

    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/service/network/model/UserPreferenceDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/service/network/model/UserPreferenceDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return UserPreferenceDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserPreferenceDto() {
        this((Boolean) null, (Boolean) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ UserPreferenceDto copy$default(UserPreferenceDto userPreferenceDto, Boolean bool, Boolean bool2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            bool = userPreferenceDto.autoDetectWorkout;
        }
        if ((i13 & 2) != 0) {
            bool2 = userPreferenceDto.autoClassifyWorkout;
        }
        return userPreferenceDto.copy(bool, bool2);
    }

    public static final /* synthetic */ void write$Self$core_release(UserPreferenceDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.autoDetectWorkout != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.autoDetectWorkout);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.autoClassifyWorkout == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, BooleanSerializer.INSTANCE, self.autoClassifyWorkout);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getAutoDetectWorkout() {
        return this.autoDetectWorkout;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getAutoClassifyWorkout() {
        return this.autoClassifyWorkout;
    }

    public final UserPreferenceDto copy(Boolean autoDetectWorkout, Boolean autoClassifyWorkout) {
        return new UserPreferenceDto(autoDetectWorkout, autoClassifyWorkout);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserPreferenceDto)) {
            return false;
        }
        UserPreferenceDto userPreferenceDto = (UserPreferenceDto) other;
        return AbstractC22676k.m65745e(this.autoDetectWorkout, userPreferenceDto.autoDetectWorkout) && AbstractC22676k.m65745e(this.autoClassifyWorkout, userPreferenceDto.autoClassifyWorkout);
    }

    public final Boolean getAutoClassifyWorkout() {
        return this.autoClassifyWorkout;
    }

    public final Boolean getAutoDetectWorkout() {
        return this.autoDetectWorkout;
    }

    public int hashCode() {
        Boolean bool = this.autoDetectWorkout;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.autoClassifyWorkout;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "UserPreferenceDto(autoDetectWorkout=" + this.autoDetectWorkout + ", autoClassifyWorkout=" + this.autoClassifyWorkout + ")";
    }

    public /* synthetic */ UserPreferenceDto(int i13, Boolean bool, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.autoDetectWorkout = null;
        } else {
            this.autoDetectWorkout = bool;
        }
        if ((i13 & 2) == 0) {
            this.autoClassifyWorkout = null;
        } else {
            this.autoClassifyWorkout = bool2;
        }
    }

    public UserPreferenceDto(Boolean bool, Boolean bool2) {
        this.autoDetectWorkout = bool;
        this.autoClassifyWorkout = bool2;
    }

    public /* synthetic */ UserPreferenceDto(Boolean bool, Boolean bool2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : bool, (i13 & 2) != 0 ? null : bool2);
    }
}
