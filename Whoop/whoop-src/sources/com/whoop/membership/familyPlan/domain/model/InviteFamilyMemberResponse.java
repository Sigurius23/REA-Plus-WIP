package com.whoop.membership.familyPlan.domain.model;

import com.whoop.membership.management.domain.models.ScreenSection;
import com.whoop.membership.management.domain.models.ScreenSection$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
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
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import ri2.C31469a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJB\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b,\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b-\u0010\u001a¨\u00061"}, m65681d2 = {"Lcom/whoop/membership/familyPlan/domain/model/InviteFamilyMemberResponse;", "", "", "navigationBarText", "", "Lcom/whoop/membership/management/domain/models/ScreenSection;", "sections", "trackingTier", "inviteScreenState", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$membership_release", "(Lcom/whoop/membership/familyPlan/domain/model/InviteFamilyMemberResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/membership/familyPlan/domain/model/InviteFamilyMemberResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNavigationBarText", "Ljava/util/List;", "getSections", "getTrackingTier", "getInviteScreenState", "Companion", "$serializer", "a", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class InviteFamilyMemberResponse {
    private final String inviteScreenState;
    private final String navigationBarText;
    private final List<ScreenSection> sections;
    private final String trackingTier;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C31469a(25)), null, null};

    /* JADX INFO: renamed from: com.whoop.membership.familyPlan.domain.model.InviteFamilyMemberResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/membership/familyPlan/domain/model/InviteFamilyMemberResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/membership/familyPlan/domain/model/InviteFamilyMemberResponse;", "serializer", "()Lwc3/c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return InviteFamilyMemberResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ InviteFamilyMemberResponse(int i13, String str, List list, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, InviteFamilyMemberResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.navigationBarText = str;
        this.sections = list;
        this.trackingTier = str2;
        this.inviteScreenState = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ScreenSection$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InviteFamilyMemberResponse copy$default(InviteFamilyMemberResponse inviteFamilyMemberResponse, String str, List list, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = inviteFamilyMemberResponse.navigationBarText;
        }
        if ((i13 & 2) != 0) {
            list = inviteFamilyMemberResponse.sections;
        }
        if ((i13 & 4) != 0) {
            str2 = inviteFamilyMemberResponse.trackingTier;
        }
        if ((i13 & 8) != 0) {
            str3 = inviteFamilyMemberResponse.inviteScreenState;
        }
        return inviteFamilyMemberResponse.copy(str, list, str2, str3);
    }

    public static final /* synthetic */ void write$Self$membership_release(InviteFamilyMemberResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.navigationBarText);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.sections);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.trackingTier);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.inviteScreenState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNavigationBarText() {
        return this.navigationBarText;
    }

    public final List<ScreenSection> component2() {
        return this.sections;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTrackingTier() {
        return this.trackingTier;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getInviteScreenState() {
        return this.inviteScreenState;
    }

    public final InviteFamilyMemberResponse copy(String navigationBarText, List<ScreenSection> sections, String trackingTier, String inviteScreenState) {
        AbstractC22676k.m65750j(navigationBarText, "navigationBarText");
        AbstractC22676k.m65750j(sections, "sections");
        return new InviteFamilyMemberResponse(navigationBarText, sections, trackingTier, inviteScreenState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InviteFamilyMemberResponse)) {
            return false;
        }
        InviteFamilyMemberResponse inviteFamilyMemberResponse = (InviteFamilyMemberResponse) other;
        return AbstractC22676k.m65745e(this.navigationBarText, inviteFamilyMemberResponse.navigationBarText) && AbstractC22676k.m65745e(this.sections, inviteFamilyMemberResponse.sections) && AbstractC22676k.m65745e(this.trackingTier, inviteFamilyMemberResponse.trackingTier) && AbstractC22676k.m65745e(this.inviteScreenState, inviteFamilyMemberResponse.inviteScreenState);
    }

    public final String getInviteScreenState() {
        return this.inviteScreenState;
    }

    public final String getNavigationBarText() {
        return this.navigationBarText;
    }

    public final List<ScreenSection> getSections() {
        return this.sections;
    }

    public final String getTrackingTier() {
        return this.trackingTier;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.navigationBarText.hashCode() * 31, 31, this.sections);
        String str = this.trackingTier;
        int iHashCode = (iM31983b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.inviteScreenState;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.navigationBarText;
        List<ScreenSection> list = this.sections;
        return AbstractC11266d.m30464r(AbstractC30802r.m94766o("InviteFamilyMemberResponse(navigationBarText=", str, ", sections=", ", trackingTier=", list), this.trackingTier, ", inviteScreenState=", this.inviteScreenState, ")");
    }

    public InviteFamilyMemberResponse(String navigationBarText, List<ScreenSection> sections, String str, String str2) {
        AbstractC22676k.m65750j(navigationBarText, "navigationBarText");
        AbstractC22676k.m65750j(sections, "sections");
        this.navigationBarText = navigationBarText;
        this.sections = sections;
        this.trackingTier = str;
        this.inviteScreenState = str2;
    }
}
