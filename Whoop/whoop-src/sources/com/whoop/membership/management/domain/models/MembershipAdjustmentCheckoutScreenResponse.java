package com.whoop.membership.management.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gw1.C16268a;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rB[\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJR\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b'\u0010\"J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b0\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b1\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010\"R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b4\u0010\u001c¨\u00067"}, m65681d2 = {"Lcom/whoop/membership/management/domain/models/MembershipAdjustmentCheckoutScreenResponse;", "", "", "navigationBarText", "", "Lcom/whoop/membership/management/domain/models/ScreenSection;", "sections", "style", "trackingType", "", "trackingMonths", "trackingTier", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$membership_release", "(Lcom/whoop/membership/management/domain/models/MembershipAdjustmentCheckoutScreenResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "()I", "component6", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lcom/whoop/membership/management/domain/models/MembershipAdjustmentCheckoutScreenResponse;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNavigationBarText", "Ljava/util/List;", "getSections", "getStyle", "getTrackingType", "I", "getTrackingMonths", "getTrackingTier", "Companion", "$serializer", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MembershipAdjustmentCheckoutScreenResponse {
    private final String navigationBarText;
    private final List<ScreenSection> sections;
    private final String style;
    private final int trackingMonths;
    private final String trackingTier;
    private final String trackingType;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C16268a(15)), null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/membership/management/domain/models/MembershipAdjustmentCheckoutScreenResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/membership/management/domain/models/MembershipAdjustmentCheckoutScreenResponse;", "serializer", "()Lwc3/c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MembershipAdjustmentCheckoutScreenResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MembershipAdjustmentCheckoutScreenResponse(int i13, String str, List list, String str2, String str3, int i14, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, MembershipAdjustmentCheckoutScreenResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.navigationBarText = str;
        this.sections = list;
        this.style = str2;
        this.trackingType = str3;
        this.trackingMonths = i14;
        this.trackingTier = str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ScreenSection$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MembershipAdjustmentCheckoutScreenResponse copy$default(MembershipAdjustmentCheckoutScreenResponse membershipAdjustmentCheckoutScreenResponse, String str, List list, String str2, String str3, int i13, String str4, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = membershipAdjustmentCheckoutScreenResponse.navigationBarText;
        }
        if ((i14 & 2) != 0) {
            list = membershipAdjustmentCheckoutScreenResponse.sections;
        }
        if ((i14 & 4) != 0) {
            str2 = membershipAdjustmentCheckoutScreenResponse.style;
        }
        if ((i14 & 8) != 0) {
            str3 = membershipAdjustmentCheckoutScreenResponse.trackingType;
        }
        if ((i14 & 16) != 0) {
            i13 = membershipAdjustmentCheckoutScreenResponse.trackingMonths;
        }
        if ((i14 & 32) != 0) {
            str4 = membershipAdjustmentCheckoutScreenResponse.trackingTier;
        }
        int i15 = i13;
        String str5 = str4;
        return membershipAdjustmentCheckoutScreenResponse.copy(str, list, str2, str3, i15, str5);
    }

    public static final /* synthetic */ void write$Self$membership_release(MembershipAdjustmentCheckoutScreenResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.navigationBarText);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.sections);
        output.encodeStringElement(serialDesc, 2, self.style);
        output.encodeStringElement(serialDesc, 3, self.trackingType);
        output.encodeIntElement(serialDesc, 4, self.trackingMonths);
        output.encodeStringElement(serialDesc, 5, self.trackingTier);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNavigationBarText() {
        return this.navigationBarText;
    }

    public final List<ScreenSection> component2() {
        return this.sections;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTrackingType() {
        return this.trackingType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTrackingMonths() {
        return this.trackingMonths;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTrackingTier() {
        return this.trackingTier;
    }

    public final MembershipAdjustmentCheckoutScreenResponse copy(String navigationBarText, List<ScreenSection> sections, String style, String trackingType, int trackingMonths, String trackingTier) {
        AbstractC22676k.m65750j(navigationBarText, "navigationBarText");
        AbstractC22676k.m65750j(sections, "sections");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(trackingType, "trackingType");
        AbstractC22676k.m65750j(trackingTier, "trackingTier");
        return new MembershipAdjustmentCheckoutScreenResponse(navigationBarText, sections, style, trackingType, trackingMonths, trackingTier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MembershipAdjustmentCheckoutScreenResponse)) {
            return false;
        }
        MembershipAdjustmentCheckoutScreenResponse membershipAdjustmentCheckoutScreenResponse = (MembershipAdjustmentCheckoutScreenResponse) other;
        return AbstractC22676k.m65745e(this.navigationBarText, membershipAdjustmentCheckoutScreenResponse.navigationBarText) && AbstractC22676k.m65745e(this.sections, membershipAdjustmentCheckoutScreenResponse.sections) && AbstractC22676k.m65745e(this.style, membershipAdjustmentCheckoutScreenResponse.style) && AbstractC22676k.m65745e(this.trackingType, membershipAdjustmentCheckoutScreenResponse.trackingType) && this.trackingMonths == membershipAdjustmentCheckoutScreenResponse.trackingMonths && AbstractC22676k.m65745e(this.trackingTier, membershipAdjustmentCheckoutScreenResponse.trackingTier);
    }

    public final String getNavigationBarText() {
        return this.navigationBarText;
    }

    public final List<ScreenSection> getSections() {
        return this.sections;
    }

    public final String getStyle() {
        return this.style;
    }

    public final int getTrackingMonths() {
        return this.trackingMonths;
    }

    public final String getTrackingTier() {
        return this.trackingTier;
    }

    public final String getTrackingType() {
        return this.trackingType;
    }

    public int hashCode() {
        return this.trackingTier.hashCode() + AbstractC11266d.m30448b(this.trackingMonths, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11895b.m31983b(this.navigationBarText.hashCode() * 31, 31, this.sections), 31, this.style), 31, this.trackingType), 31);
    }

    public String toString() {
        String str = this.navigationBarText;
        List<ScreenSection> list = this.sections;
        String str2 = this.style;
        String str3 = this.trackingType;
        int i13 = this.trackingMonths;
        String str4 = this.trackingTier;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("MembershipAdjustmentCheckoutScreenResponse(navigationBarText=", str, ", sections=", ", style=", list);
        AbstractC11266d.m30444B(sbM94766o, str2, ", trackingType=", str3, ", trackingMonths=");
        return AbstractC38963t7.m124376f(i13, ", trackingTier=", str4, ")", sbM94766o);
    }

    public MembershipAdjustmentCheckoutScreenResponse(String navigationBarText, List<ScreenSection> sections, String style, String trackingType, int i13, String trackingTier) {
        AbstractC22676k.m65750j(navigationBarText, "navigationBarText");
        AbstractC22676k.m65750j(sections, "sections");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(trackingType, "trackingType");
        AbstractC22676k.m65750j(trackingTier, "trackingTier");
        this.navigationBarText = navigationBarText;
        this.sections = sections;
        this.style = style;
        this.trackingType = trackingType;
        this.trackingMonths = i13;
        this.trackingTier = trackingTier;
    }
}
