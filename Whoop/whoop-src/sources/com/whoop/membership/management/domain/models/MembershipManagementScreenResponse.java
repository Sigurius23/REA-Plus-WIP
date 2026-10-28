package com.whoop.membership.management.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gw1.C16268a;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fBQ\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJL\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b0\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b1\u0010\u001b¨\u00064"}, m65681d2 = {"Lcom/whoop/membership/management/domain/models/MembershipManagementScreenResponse;", "", "", "navigationBarText", "", "Lcom/whoop/membership/management/domain/models/ScreenSection;", "sections", "", "trackingMonths", "trackingUpgradesAvailable", "trackingCardUpsell", "<init>", "(Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$membership_release", "(Lcom/whoop/membership/management/domain/models/MembershipManagementScreenResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()I", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;)Lcom/whoop/membership/management/domain/models/MembershipManagementScreenResponse;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNavigationBarText", "Ljava/util/List;", "getSections", "I", "getTrackingMonths", "getTrackingUpgradesAvailable", "getTrackingCardUpsell", "Companion", "$serializer", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MembershipManagementScreenResponse {
    private final String navigationBarText;
    private final List<ScreenSection> sections;
    private final String trackingCardUpsell;
    private final int trackingMonths;
    private final String trackingUpgradesAvailable;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C16268a(16)), null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/membership/management/domain/models/MembershipManagementScreenResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/membership/management/domain/models/MembershipManagementScreenResponse;", "serializer", "()Lwc3/c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MembershipManagementScreenResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MembershipManagementScreenResponse(int i13, String str, List list, int i14, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, MembershipManagementScreenResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.navigationBarText = str;
        this.sections = list;
        this.trackingMonths = i14;
        this.trackingUpgradesAvailable = str2;
        this.trackingCardUpsell = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ScreenSection$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MembershipManagementScreenResponse copy$default(MembershipManagementScreenResponse membershipManagementScreenResponse, String str, List list, int i13, String str2, String str3, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = membershipManagementScreenResponse.navigationBarText;
        }
        if ((i14 & 2) != 0) {
            list = membershipManagementScreenResponse.sections;
        }
        if ((i14 & 4) != 0) {
            i13 = membershipManagementScreenResponse.trackingMonths;
        }
        if ((i14 & 8) != 0) {
            str2 = membershipManagementScreenResponse.trackingUpgradesAvailable;
        }
        if ((i14 & 16) != 0) {
            str3 = membershipManagementScreenResponse.trackingCardUpsell;
        }
        String str4 = str3;
        int i15 = i13;
        return membershipManagementScreenResponse.copy(str, list, i15, str2, str4);
    }

    public static final /* synthetic */ void write$Self$membership_release(MembershipManagementScreenResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.navigationBarText);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.sections);
        output.encodeIntElement(serialDesc, 2, self.trackingMonths);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.trackingUpgradesAvailable);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.trackingCardUpsell);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNavigationBarText() {
        return this.navigationBarText;
    }

    public final List<ScreenSection> component2() {
        return this.sections;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTrackingMonths() {
        return this.trackingMonths;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTrackingUpgradesAvailable() {
        return this.trackingUpgradesAvailable;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTrackingCardUpsell() {
        return this.trackingCardUpsell;
    }

    public final MembershipManagementScreenResponse copy(String navigationBarText, List<ScreenSection> sections, int trackingMonths, String trackingUpgradesAvailable, String trackingCardUpsell) {
        AbstractC22676k.m65750j(navigationBarText, "navigationBarText");
        AbstractC22676k.m65750j(sections, "sections");
        return new MembershipManagementScreenResponse(navigationBarText, sections, trackingMonths, trackingUpgradesAvailable, trackingCardUpsell);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MembershipManagementScreenResponse)) {
            return false;
        }
        MembershipManagementScreenResponse membershipManagementScreenResponse = (MembershipManagementScreenResponse) other;
        return AbstractC22676k.m65745e(this.navigationBarText, membershipManagementScreenResponse.navigationBarText) && AbstractC22676k.m65745e(this.sections, membershipManagementScreenResponse.sections) && this.trackingMonths == membershipManagementScreenResponse.trackingMonths && AbstractC22676k.m65745e(this.trackingUpgradesAvailable, membershipManagementScreenResponse.trackingUpgradesAvailable) && AbstractC22676k.m65745e(this.trackingCardUpsell, membershipManagementScreenResponse.trackingCardUpsell);
    }

    public final String getNavigationBarText() {
        return this.navigationBarText;
    }

    public final List<ScreenSection> getSections() {
        return this.sections;
    }

    public final String getTrackingCardUpsell() {
        return this.trackingCardUpsell;
    }

    public final int getTrackingMonths() {
        return this.trackingMonths;
    }

    public final String getTrackingUpgradesAvailable() {
        return this.trackingUpgradesAvailable;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.trackingMonths, AbstractC11895b.m31983b(this.navigationBarText.hashCode() * 31, 31, this.sections), 31);
        String str = this.trackingUpgradesAvailable;
        int iHashCode = (iM30448b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.trackingCardUpsell;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.navigationBarText;
        List<ScreenSection> list = this.sections;
        int i13 = this.trackingMonths;
        String str2 = this.trackingUpgradesAvailable;
        String str3 = this.trackingCardUpsell;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("MembershipManagementScreenResponse(navigationBarText=", str, ", sections=", ", trackingMonths=", list);
        AbstractC11895b.m31979B(i13, ", trackingUpgradesAvailable=", str2, ", trackingCardUpsell=", sbM94766o);
        return AbstractC25012a.m73376i(str3, ")", sbM94766o);
    }

    public MembershipManagementScreenResponse(String navigationBarText, List<ScreenSection> sections, int i13, String str, String str2) {
        AbstractC22676k.m65750j(navigationBarText, "navigationBarText");
        AbstractC22676k.m65750j(sections, "sections");
        this.navigationBarText = navigationBarText;
        this.sections = sections;
        this.trackingMonths = i13;
        this.trackingUpgradesAvailable = str;
        this.trackingCardUpsell = str2;
    }
}
