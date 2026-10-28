package com.whoop.privacyconsent.api;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import d13.AbstractC11478a;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B7\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J2\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b)\u0010\u0019¨\u0006,"}, m65681d2 = {"Lcom/whoop/privacyconsent/api/PrivacyConsentSettingsResponse;", "", "", "searchable", "allowRecommendation", "mutualCommunitySharing", "<init>", "(ZLjava/lang/Boolean;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$privacy_consent_release", "(Lcom/whoop/privacyconsent/api/PrivacyConsentSettingsResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Z", "component2", "()Ljava/lang/Boolean;", "component3", "copy", "(ZLjava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/privacyconsent/api/PrivacyConsentSettingsResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getSearchable", "Ljava/lang/Boolean;", "getAllowRecommendation", "getMutualCommunitySharing", "Companion", "$serializer", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PrivacyConsentSettingsResponse {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Boolean allowRecommendation;
    private final Boolean mutualCommunitySharing;
    private final boolean searchable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/privacyconsent/api/PrivacyConsentSettingsResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/privacyconsent/api/PrivacyConsentSettingsResponse;", "serializer", "()Lwc3/c;", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PrivacyConsentSettingsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PrivacyConsentSettingsResponse(int i13, boolean z4, Boolean bool, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, PrivacyConsentSettingsResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.searchable = z4;
        this.allowRecommendation = bool;
        if ((i13 & 4) == 0) {
            this.mutualCommunitySharing = null;
        } else {
            this.mutualCommunitySharing = bool2;
        }
    }

    public static /* synthetic */ PrivacyConsentSettingsResponse copy$default(PrivacyConsentSettingsResponse privacyConsentSettingsResponse, boolean z4, Boolean bool, Boolean bool2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = privacyConsentSettingsResponse.searchable;
        }
        if ((i13 & 2) != 0) {
            bool = privacyConsentSettingsResponse.allowRecommendation;
        }
        if ((i13 & 4) != 0) {
            bool2 = privacyConsentSettingsResponse.mutualCommunitySharing;
        }
        return privacyConsentSettingsResponse.copy(z4, bool, bool2);
    }

    public static final /* synthetic */ void write$Self$privacy_consent_release(PrivacyConsentSettingsResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.searchable);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, booleanSerializer, self.allowRecommendation);
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.mutualCommunitySharing == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, booleanSerializer, self.mutualCommunitySharing);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSearchable() {
        return this.searchable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getAllowRecommendation() {
        return this.allowRecommendation;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getMutualCommunitySharing() {
        return this.mutualCommunitySharing;
    }

    public final PrivacyConsentSettingsResponse copy(boolean searchable, Boolean allowRecommendation, Boolean mutualCommunitySharing) {
        return new PrivacyConsentSettingsResponse(searchable, allowRecommendation, mutualCommunitySharing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrivacyConsentSettingsResponse)) {
            return false;
        }
        PrivacyConsentSettingsResponse privacyConsentSettingsResponse = (PrivacyConsentSettingsResponse) other;
        return this.searchable == privacyConsentSettingsResponse.searchable && AbstractC22676k.m65745e(this.allowRecommendation, privacyConsentSettingsResponse.allowRecommendation) && AbstractC22676k.m65745e(this.mutualCommunitySharing, privacyConsentSettingsResponse.mutualCommunitySharing);
    }

    public final Boolean getAllowRecommendation() {
        return this.allowRecommendation;
    }

    public final Boolean getMutualCommunitySharing() {
        return this.mutualCommunitySharing;
    }

    public final boolean getSearchable() {
        return this.searchable;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.searchable) * 31;
        Boolean bool = this.allowRecommendation;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.mutualCommunitySharing;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        boolean z4 = this.searchable;
        Boolean bool = this.allowRecommendation;
        Boolean bool2 = this.mutualCommunitySharing;
        StringBuilder sb4 = new StringBuilder("PrivacyConsentSettingsResponse(searchable=");
        sb4.append(z4);
        sb4.append(", allowRecommendation=");
        sb4.append(bool);
        sb4.append(", mutualCommunitySharing=");
        return AbstractC11478a.m30858j(sb4, bool2, ")");
    }

    public PrivacyConsentSettingsResponse(boolean z4, Boolean bool, Boolean bool2) {
        this.searchable = z4;
        this.allowRecommendation = bool;
        this.mutualCommunitySharing = bool2;
    }

    public /* synthetic */ PrivacyConsentSettingsResponse(boolean z4, Boolean bool, Boolean bool2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, bool, (i13 & 4) != 0 ? null : bool2);
    }
}
