package com.whoop.data.remote.domain.dto.growth;

import ad3.InterfaceC0778u;
import com.google.gson.annotations.SerializedName;
import com.whoop.data.remote.domain.response.growth.CheckoutOrigin;
import com.whoop.data.remote.domain.response.growth.MembershipAffiliate;
import com.whoop.data.remote.domain.response.growth.MembershipInfo;
import com.whoop.data.remote.domain.response.growth.MembershipStatus;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ@\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001fJ\u0010\u0010'\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001fR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010-\u0012\u0004\b2\u00100\u001a\u0004\b1\u0010\u001fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00103\u0012\u0004\b5\u00100\u001a\u0004\b4\u0010\"R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b7\u00100\u001a\u0004\b6\u0010\u001f¨\u0006:"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/growth/MembershipInfoDto;", "", "", "membershipStatus", "checkoutOrigin", "Lcom/whoop/data/remote/domain/dto/growth/AffiliateInfoDto;", "affiliateInfoDto", "nextBillDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/growth/AffiliateInfoDto;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/growth/AffiliateInfoDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/growth/MembershipInfoDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/data/remote/domain/response/growth/MembershipInfo;", "toMembershipInfo", "()Lcom/whoop/data/remote/domain/response/growth/MembershipInfo;", "Lcom/whoop/data/remote/domain/response/growth/MembershipAffiliate;", "toMembershipAffiliate", "()Lcom/whoop/data/remote/domain/response/growth/MembershipAffiliate;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/data/remote/domain/dto/growth/AffiliateInfoDto;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/growth/AffiliateInfoDto;Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/growth/MembershipInfoDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMembershipStatus", "getMembershipStatus$annotations", "()V", "getCheckoutOrigin", "getCheckoutOrigin$annotations", "Lcom/whoop/data/remote/domain/dto/growth/AffiliateInfoDto;", "getAffiliateInfoDto", "getAffiliateInfoDto$annotations", "getNextBillDate", "getNextBillDate$annotations", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MembershipInfoDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("affiliate")
    private final AffiliateInfoDto affiliateInfoDto;

    @SerializedName("checkoutOrigin")
    private final String checkoutOrigin;

    @SerializedName("membershipStatus")
    private final String membershipStatus;

    @SerializedName("nextBillDate")
    private final String nextBillDate;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/growth/MembershipInfoDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/growth/MembershipInfoDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MembershipInfoDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MembershipInfoDto(int i13, String str, String str2, AffiliateInfoDto affiliateInfoDto, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, MembershipInfoDto$$serializer.INSTANCE.getDescriptor());
        }
        this.membershipStatus = str;
        this.checkoutOrigin = str2;
        this.affiliateInfoDto = affiliateInfoDto;
        this.nextBillDate = str3;
    }

    public static /* synthetic */ MembershipInfoDto copy$default(MembershipInfoDto membershipInfoDto, String str, String str2, AffiliateInfoDto affiliateInfoDto, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = membershipInfoDto.membershipStatus;
        }
        if ((i13 & 2) != 0) {
            str2 = membershipInfoDto.checkoutOrigin;
        }
        if ((i13 & 4) != 0) {
            affiliateInfoDto = membershipInfoDto.affiliateInfoDto;
        }
        if ((i13 & 8) != 0) {
            str3 = membershipInfoDto.nextBillDate;
        }
        return membershipInfoDto.copy(str, str2, affiliateInfoDto, str3);
    }

    @InterfaceC37143h("affiliate")
    public static /* synthetic */ void getAffiliateInfoDto$annotations() {
    }

    @InterfaceC0778u(names = {"checkoutOrigin"})
    public static /* synthetic */ void getCheckoutOrigin$annotations() {
    }

    @InterfaceC0778u(names = {"membershipStatus"})
    public static /* synthetic */ void getMembershipStatus$annotations() {
    }

    @InterfaceC0778u(names = {"nextBillDate"})
    public static /* synthetic */ void getNextBillDate$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_release(MembershipInfoDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.membershipStatus);
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.checkoutOrigin);
        output.encodeNullableSerializableElement(serialDesc, 2, AffiliateInfoDto$$serializer.INSTANCE, self.affiliateInfoDto);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.nextBillDate);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMembershipStatus() {
        return this.membershipStatus;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCheckoutOrigin() {
        return this.checkoutOrigin;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AffiliateInfoDto getAffiliateInfoDto() {
        return this.affiliateInfoDto;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNextBillDate() {
        return this.nextBillDate;
    }

    public final MembershipInfoDto copy(String membershipStatus, String checkoutOrigin, AffiliateInfoDto affiliateInfoDto, String nextBillDate) {
        return new MembershipInfoDto(membershipStatus, checkoutOrigin, affiliateInfoDto, nextBillDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MembershipInfoDto)) {
            return false;
        }
        MembershipInfoDto membershipInfoDto = (MembershipInfoDto) other;
        return AbstractC22676k.m65745e(this.membershipStatus, membershipInfoDto.membershipStatus) && AbstractC22676k.m65745e(this.checkoutOrigin, membershipInfoDto.checkoutOrigin) && AbstractC22676k.m65745e(this.affiliateInfoDto, membershipInfoDto.affiliateInfoDto) && AbstractC22676k.m65745e(this.nextBillDate, membershipInfoDto.nextBillDate);
    }

    public final AffiliateInfoDto getAffiliateInfoDto() {
        return this.affiliateInfoDto;
    }

    public final String getCheckoutOrigin() {
        return this.checkoutOrigin;
    }

    public final String getMembershipStatus() {
        return this.membershipStatus;
    }

    public final String getNextBillDate() {
        return this.nextBillDate;
    }

    public int hashCode() {
        String str = this.membershipStatus;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.checkoutOrigin;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AffiliateInfoDto affiliateInfoDto = this.affiliateInfoDto;
        int iHashCode3 = (iHashCode2 + (affiliateInfoDto == null ? 0 : affiliateInfoDto.hashCode())) * 31;
        String str3 = this.nextBillDate;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final MembershipAffiliate toMembershipAffiliate() {
        AffiliateInfoDto affiliateInfoDto = this.affiliateInfoDto;
        if (affiliateInfoDto != null) {
            return affiliateInfoDto.toMembershipAffiliate();
        }
        return null;
    }

    public final MembershipInfo toMembershipInfo() {
        CheckoutOrigin checkoutOrigin;
        MembershipStatus membershipStatusFromStringOrDefault = MembershipStatus.INSTANCE.fromStringOrDefault(this.membershipStatus);
        String str = this.checkoutOrigin;
        CheckoutOrigin checkoutOrigin2 = CheckoutOrigin.US;
        CheckoutOrigin[] checkoutOriginArrValues = CheckoutOrigin.values();
        int length = checkoutOriginArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                checkoutOrigin = null;
                break;
            }
            checkoutOrigin = checkoutOriginArrValues[i13];
            if (AbstractC22676k.m65745e(checkoutOrigin.getSerializedValue(), str)) {
                break;
            }
            i13++;
        }
        if (checkoutOrigin != null) {
            checkoutOrigin2 = checkoutOrigin;
        }
        return new MembershipInfo(membershipStatusFromStringOrDefault, checkoutOrigin2, this.nextBillDate);
    }

    public String toString() {
        String str = this.membershipStatus;
        String str2 = this.checkoutOrigin;
        AffiliateInfoDto affiliateInfoDto = this.affiliateInfoDto;
        String str3 = this.nextBillDate;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MembershipInfoDto(membershipStatus=", str, ", checkoutOrigin=", str2, ", affiliateInfoDto=");
        sbM32001t.append(affiliateInfoDto);
        sbM32001t.append(", nextBillDate=");
        sbM32001t.append(str3);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public MembershipInfoDto(String str, String str2, AffiliateInfoDto affiliateInfoDto, String str3) {
        this.membershipStatus = str;
        this.checkoutOrigin = str2;
        this.affiliateInfoDto = affiliateInfoDto;
        this.nextBillDate = str3;
    }
}
