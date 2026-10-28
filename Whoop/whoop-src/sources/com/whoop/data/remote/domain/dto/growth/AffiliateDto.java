package com.whoop.data.remote.domain.dto.growth;

import androidx.core.app.NotificationCompat;
import com.whoop.data.remote.domain.response.growth.AffiliateStatus;
import com.whoop.data.remote.domain.response.growth.AffiliateType;
import com.whoop.data.remote.domain.response.growth.MembershipAffiliate;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J(\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0019¨\u0006)"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/growth/AffiliateDto;", "", "", "organization", NotificationCompat.CATEGORY_STATUS, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/growth/AffiliateDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/data/remote/domain/response/growth/MembershipAffiliate;", "toMembershipAffiliate", "()Lcom/whoop/data/remote/domain/response/growth/MembershipAffiliate;", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/growth/AffiliateDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization", "getStatus", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AffiliateDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String organization;
    private final String status;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/growth/AffiliateDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/growth/AffiliateDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AffiliateDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AffiliateDto(int i13, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, AffiliateDto$$serializer.INSTANCE.getDescriptor());
        }
        this.organization = str;
        this.status = str2;
    }

    public static /* synthetic */ AffiliateDto copy$default(AffiliateDto affiliateDto, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = affiliateDto.organization;
        }
        if ((i13 & 2) != 0) {
            str2 = affiliateDto.status;
        }
        return affiliateDto.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$core_release(AffiliateDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.organization);
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.status);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization() {
        return this.organization;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final AffiliateDto copy(String organization, String status) {
        return new AffiliateDto(organization, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AffiliateDto)) {
            return false;
        }
        AffiliateDto affiliateDto = (AffiliateDto) other;
        return AbstractC22676k.m65745e(this.organization, affiliateDto.organization) && AbstractC22676k.m65745e(this.status, affiliateDto.status);
    }

    public final String getOrganization() {
        return this.organization;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.organization;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.status;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final MembershipAffiliate toMembershipAffiliate() {
        return new MembershipAffiliate(AffiliateType.INSTANCE.fromStringOrDefault(this.organization), AffiliateStatus.INSTANCE.fromStringOrDefault(this.status));
    }

    public String toString() {
        return AbstractC2875y.m8300m("AffiliateDto(organization=", this.organization, ", status=", this.status, ")");
    }

    public AffiliateDto(String str, String str2) {
        this.organization = str;
        this.status = str2;
    }
}
