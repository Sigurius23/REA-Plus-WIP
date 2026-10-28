package com.whoop.membership.management.domain.models.items;

import androidx.core.app.FrameMetricsAggregator;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hb1.C17089l;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0002KJBc\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013B{\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010#J~\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u0010#J\u0010\u00104\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00109\u001a\u0002082\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b9\u0010:R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010;\u001a\u0004\b=\u0010#R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b>\u0010#R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010?\u001a\u0004\b@\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010A\u001a\u0004\bB\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010C\u001a\u0004\bD\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010E\u001a\u0004\bF\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010G\u001a\u0004\bH\u0010/R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010;\u001a\u0004\bI\u0010#¨\u0006L"}, m65681d2 = {"Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "tierImage", "profilePhoto", "", "Lcom/whoop/membership/management/domain/models/items/MembershipInfoModel;", "membershipInfo", "Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;", "downgradeInfo", "Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;", "inactive", "Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;", "switchBillingInfo", "Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel;", "additionalInfo", "style", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$membership_release", "(Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "()Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;", "component6", "()Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;", "component7", "()Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;", "component8", "()Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel;", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel;Ljava/lang/String;)Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTierImage", "getProfilePhoto", "Ljava/util/List;", "getMembershipInfo", "Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;", "getDowngradeInfo", "Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;", "getInactive", "Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;", "getSwitchBillingInfo", "Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel;", "getAdditionalInfo", "getStyle", "Companion", "$serializer", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MembershipCardModel implements DesignSystemModel {
    private final AdditionalInfoModel additionalInfo;
    private final DowngradeInfoModel downgradeInfo;
    private final InactiveInfoModel inactive;
    private final List<MembershipInfoModel> membershipInfo;
    private final String profilePhoto;
    private final String style;
    private final SwitchBillingInfoModel switchBillingInfo;
    private final String tierImage;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C17089l(18)), null, null, null, null, null};

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/membership/management/domain/models/items/MembershipCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;", "serializer", "()Lwc3/c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MembershipCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MembershipCardModel(int i13, String str, String str2, String str3, List list, DowngradeInfoModel downgradeInfoModel, InactiveInfoModel inactiveInfoModel, SwitchBillingInfoModel switchBillingInfoModel, AdditionalInfoModel additionalInfoModel, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i13 & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i13, FrameMetricsAggregator.EVERY_DURATION, MembershipCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.tierImage = str2;
        this.profilePhoto = str3;
        this.membershipInfo = list;
        this.downgradeInfo = downgradeInfoModel;
        this.inactive = inactiveInfoModel;
        this.switchBillingInfo = switchBillingInfoModel;
        this.additionalInfo = additionalInfoModel;
        this.style = str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(MembershipInfoModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MembershipCardModel copy$default(MembershipCardModel membershipCardModel, String str, String str2, String str3, List list, DowngradeInfoModel downgradeInfoModel, InactiveInfoModel inactiveInfoModel, SwitchBillingInfoModel switchBillingInfoModel, AdditionalInfoModel additionalInfoModel, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = membershipCardModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = membershipCardModel.tierImage;
        }
        if ((i13 & 4) != 0) {
            str3 = membershipCardModel.profilePhoto;
        }
        if ((i13 & 8) != 0) {
            list = membershipCardModel.membershipInfo;
        }
        if ((i13 & 16) != 0) {
            downgradeInfoModel = membershipCardModel.downgradeInfo;
        }
        if ((i13 & 32) != 0) {
            inactiveInfoModel = membershipCardModel.inactive;
        }
        if ((i13 & 64) != 0) {
            switchBillingInfoModel = membershipCardModel.switchBillingInfo;
        }
        if ((i13 & 128) != 0) {
            additionalInfoModel = membershipCardModel.additionalInfo;
        }
        if ((i13 & 256) != 0) {
            str4 = membershipCardModel.style;
        }
        AdditionalInfoModel additionalInfoModel2 = additionalInfoModel;
        String str5 = str4;
        InactiveInfoModel inactiveInfoModel2 = inactiveInfoModel;
        SwitchBillingInfoModel switchBillingInfoModel2 = switchBillingInfoModel;
        DowngradeInfoModel downgradeInfoModel2 = downgradeInfoModel;
        String str6 = str3;
        return membershipCardModel.copy(str, str2, str6, list, downgradeInfoModel2, inactiveInfoModel2, switchBillingInfoModel2, additionalInfoModel2, str5);
    }

    public static final /* synthetic */ void write$Self$membership_release(MembershipCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.title);
        output.encodeStringElement(serialDesc, 1, self.tierImage);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.profilePhoto);
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.membershipInfo);
        output.encodeNullableSerializableElement(serialDesc, 4, DowngradeInfoModel$$serializer.INSTANCE, self.downgradeInfo);
        output.encodeNullableSerializableElement(serialDesc, 5, InactiveInfoModel$$serializer.INSTANCE, self.inactive);
        output.encodeNullableSerializableElement(serialDesc, 6, SwitchBillingInfoModel$$serializer.INSTANCE, self.switchBillingInfo);
        output.encodeNullableSerializableElement(serialDesc, 7, AdditionalInfoModel$$serializer.INSTANCE, self.additionalInfo);
        output.encodeStringElement(serialDesc, 8, self.style);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTierImage() {
        return this.tierImage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProfilePhoto() {
        return this.profilePhoto;
    }

    public final List<MembershipInfoModel> component4() {
        return this.membershipInfo;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DowngradeInfoModel getDowngradeInfo() {
        return this.downgradeInfo;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final InactiveInfoModel getInactive() {
        return this.inactive;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final SwitchBillingInfoModel getSwitchBillingInfo() {
        return this.switchBillingInfo;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final AdditionalInfoModel getAdditionalInfo() {
        return this.additionalInfo;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    public final MembershipCardModel copy(String title, String tierImage, String profilePhoto, List<MembershipInfoModel> membershipInfo, DowngradeInfoModel downgradeInfo, InactiveInfoModel inactive, SwitchBillingInfoModel switchBillingInfo, AdditionalInfoModel additionalInfo, String style) {
        AbstractC22676k.m65750j(tierImage, "tierImage");
        AbstractC22676k.m65750j(style, "style");
        return new MembershipCardModel(title, tierImage, profilePhoto, membershipInfo, downgradeInfo, inactive, switchBillingInfo, additionalInfo, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MembershipCardModel)) {
            return false;
        }
        MembershipCardModel membershipCardModel = (MembershipCardModel) other;
        return AbstractC22676k.m65745e(this.title, membershipCardModel.title) && AbstractC22676k.m65745e(this.tierImage, membershipCardModel.tierImage) && AbstractC22676k.m65745e(this.profilePhoto, membershipCardModel.profilePhoto) && AbstractC22676k.m65745e(this.membershipInfo, membershipCardModel.membershipInfo) && AbstractC22676k.m65745e(this.downgradeInfo, membershipCardModel.downgradeInfo) && AbstractC22676k.m65745e(this.inactive, membershipCardModel.inactive) && AbstractC22676k.m65745e(this.switchBillingInfo, membershipCardModel.switchBillingInfo) && AbstractC22676k.m65745e(this.additionalInfo, membershipCardModel.additionalInfo) && AbstractC22676k.m65745e(this.style, membershipCardModel.style);
    }

    public final AdditionalInfoModel getAdditionalInfo() {
        return this.additionalInfo;
    }

    public final DowngradeInfoModel getDowngradeInfo() {
        return this.downgradeInfo;
    }

    public final InactiveInfoModel getInactive() {
        return this.inactive;
    }

    public final List<MembershipInfoModel> getMembershipInfo() {
        return this.membershipInfo;
    }

    public final String getProfilePhoto() {
        return this.profilePhoto;
    }

    public final String getStyle() {
        return this.style;
    }

    public final SwitchBillingInfoModel getSwitchBillingInfo() {
        return this.switchBillingInfo;
    }

    public final String getTierImage() {
        return this.tierImage;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iM30450d = AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.tierImage);
        String str2 = this.profilePhoto;
        int iHashCode = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<MembershipInfoModel> list = this.membershipInfo;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        DowngradeInfoModel downgradeInfoModel = this.downgradeInfo;
        int iHashCode3 = (iHashCode2 + (downgradeInfoModel == null ? 0 : downgradeInfoModel.hashCode())) * 31;
        InactiveInfoModel inactiveInfoModel = this.inactive;
        int iHashCode4 = (iHashCode3 + (inactiveInfoModel == null ? 0 : inactiveInfoModel.hashCode())) * 31;
        SwitchBillingInfoModel switchBillingInfoModel = this.switchBillingInfo;
        int iHashCode5 = (iHashCode4 + (switchBillingInfoModel == null ? 0 : switchBillingInfoModel.hashCode())) * 31;
        AdditionalInfoModel additionalInfoModel = this.additionalInfo;
        return this.style.hashCode() + ((iHashCode5 + (additionalInfoModel != null ? additionalInfoModel.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.tierImage;
        String str3 = this.profilePhoto;
        List<MembershipInfoModel> list = this.membershipInfo;
        DowngradeInfoModel downgradeInfoModel = this.downgradeInfo;
        InactiveInfoModel inactiveInfoModel = this.inactive;
        SwitchBillingInfoModel switchBillingInfoModel = this.switchBillingInfo;
        AdditionalInfoModel additionalInfoModel = this.additionalInfo;
        String str4 = this.style;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MembershipCardModel(title=", str, ", tierImage=", str2, ", profilePhoto=");
        AbstractC36095b.m114694v(str3, ", membershipInfo=", ", downgradeInfo=", sbM32001t, list);
        sbM32001t.append(downgradeInfoModel);
        sbM32001t.append(", inactive=");
        sbM32001t.append(inactiveInfoModel);
        sbM32001t.append(", switchBillingInfo=");
        sbM32001t.append(switchBillingInfoModel);
        sbM32001t.append(", additionalInfo=");
        sbM32001t.append(additionalInfoModel);
        sbM32001t.append(", style=");
        return AbstractC25012a.m73376i(str4, ")", sbM32001t);
    }

    public MembershipCardModel(String str, String tierImage, String str2, List<MembershipInfoModel> list, DowngradeInfoModel downgradeInfoModel, InactiveInfoModel inactiveInfoModel, SwitchBillingInfoModel switchBillingInfoModel, AdditionalInfoModel additionalInfoModel, String style) {
        AbstractC22676k.m65750j(tierImage, "tierImage");
        AbstractC22676k.m65750j(style, "style");
        this.title = str;
        this.tierImage = tierImage;
        this.profilePhoto = str2;
        this.membershipInfo = list;
        this.downgradeInfo = downgradeInfoModel;
        this.inactive = inactiveInfoModel;
        this.switchBillingInfo = switchBillingInfoModel;
        this.additionalInfo = additionalInfoModel;
        this.style = style;
    }
}
