package com.whoop.navigation;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.profile.domain.ProfileApiKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J@\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u0018¨\u00060"}, m65681d2 = {"Lcom/whoop/navigation/ProfileScreenModel;", "Lcom/whoop/navigation/CommonNavigationScreenModel;", "", "source", "", ProfileApiKt.TARGET_USER_ID_PARAM, ProfileApiKt.COMMUNITY_ID_PARAM, "educationType", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/ProfileScreenModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/whoop/navigation/ProfileScreenModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSource", "Ljava/lang/Integer;", "getTargetUserId", "getCommunityId", "getEducationType", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ProfileScreenModel implements CommonNavigationScreenModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Integer communityId;
    private final String educationType;
    private final String source;
    private final Integer targetUserId;

    /* JADX INFO: renamed from: com.whoop.navigation.ProfileScreenModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/ProfileScreenModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/ProfileScreenModel;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ProfileScreenModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ProfileScreenModel(int i13, String str, Integer num, Integer num2, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, ProfileScreenModel$$serializer.INSTANCE.getDescriptor());
        }
        this.source = str;
        this.targetUserId = num;
        this.communityId = num2;
        if ((i13 & 8) == 0) {
            this.educationType = null;
        } else {
            this.educationType = str2;
        }
    }

    public static /* synthetic */ ProfileScreenModel copy$default(ProfileScreenModel profileScreenModel, String str, Integer num, Integer num2, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = profileScreenModel.source;
        }
        if ((i13 & 2) != 0) {
            num = profileScreenModel.targetUserId;
        }
        if ((i13 & 4) != 0) {
            num2 = profileScreenModel.communityId;
        }
        if ((i13 & 8) != 0) {
            str2 = profileScreenModel.educationType;
        }
        return profileScreenModel.copy(str, num, num2, str2);
    }

    public static final /* synthetic */ void write$Self$navigation_release(ProfileScreenModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.source);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, intSerializer, self.targetUserId);
        output.encodeNullableSerializableElement(serialDesc, 2, intSerializer, self.communityId);
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.educationType == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.educationType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getTargetUserId() {
        return this.targetUserId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getCommunityId() {
        return this.communityId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEducationType() {
        return this.educationType;
    }

    public final ProfileScreenModel copy(String source, Integer targetUserId, Integer communityId, String educationType) {
        return new ProfileScreenModel(source, targetUserId, communityId, educationType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileScreenModel)) {
            return false;
        }
        ProfileScreenModel profileScreenModel = (ProfileScreenModel) other;
        return AbstractC22676k.m65745e(this.source, profileScreenModel.source) && AbstractC22676k.m65745e(this.targetUserId, profileScreenModel.targetUserId) && AbstractC22676k.m65745e(this.communityId, profileScreenModel.communityId) && AbstractC22676k.m65745e(this.educationType, profileScreenModel.educationType);
    }

    public final Integer getCommunityId() {
        return this.communityId;
    }

    public final String getEducationType() {
        return this.educationType;
    }

    public final String getSource() {
        return this.source;
    }

    public final Integer getTargetUserId() {
        return this.targetUserId;
    }

    public int hashCode() {
        String str = this.source;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.targetUserId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.communityId;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.educationType;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ProfileScreenModel(source=" + this.source + ", targetUserId=" + this.targetUserId + ", communityId=" + this.communityId + ", educationType=" + this.educationType + ")";
    }

    public ProfileScreenModel(String str, Integer num, Integer num2, String str2) {
        this.source = str;
        this.targetUserId = num;
        this.communityId = num2;
        this.educationType = str2;
    }

    public /* synthetic */ ProfileScreenModel(String str, Integer num, Integer num2, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, num, num2, (i13 & 8) != 0 ? null : str2);
    }
}
