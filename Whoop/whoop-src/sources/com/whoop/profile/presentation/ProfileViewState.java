package com.whoop.profile.presentation;

import c13.AbstractC3855a;
import com.mapbox.common.HttpHeaders;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.util.TextResource;
import com.whoop.profile.domain.models.ProfileSectionSpacingType;
import d13.AbstractC11478a;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import ih0.AbstractC18489d0;
import j11.EnumC21213p;
import java.util.List;
import kd1.AbstractC22403o;
import m83.C25271y;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.C25306o;
import p736sz0.C33211q0;
import p745y81.InterfaceC39332e;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: loaded from: classes9.dex */
@p715kotlin.Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\b*+,-./01BK\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003JM\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0014\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010&\u001a\u00020'HÖ\u0081\u0004J\n\u0010(\u001a\u00020)HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00062"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileViewState;", "", "popUpDialog", "Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;", "fullScreenModal", "Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;", "designModal", "Lcom/whoop/design/models/modal/AnyModal;", "pendingNavigation", "Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;", "metadata", "Lcom/whoop/profile/presentation/ProfileViewState$Metadata;", "screenContent", "Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;", "<init>", "(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;)V", "getPopUpDialog", "()Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;", "getFullScreenModal", "()Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;", "getDesignModal", "()Lcom/whoop/design/models/modal/AnyModal;", "getPendingNavigation", "()Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;", "getMetadata", "()Lcom/whoop/profile/presentation/ProfileViewState$Metadata;", "getScreenContent", "()Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "FullScreenModal", "ProfileDialogState", "Metadata", "UserData", "MembershipData", "BottomSheet", "ScreenContent", "ComponentItem", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class ProfileViewState {
    public static final int $stable = 8;
    private final AnyModal designModal;
    private final FullScreenModal fullScreenModal;
    private final Metadata metadata;
    private final ProfileEvent.NavigationEvent pendingNavigation;
    private final ProfileDialogState popUpDialog;
    private final ScreenContent screenContent;

    @p715kotlin.Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ0\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;", "", "Lkd1/o;", "image", "", "title", "subtitle", "<init>", "(Lkd1/o;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lkd1/o;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lkd1/o;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkd1/o;", "getImage", "Ljava/lang/String;", "getTitle", "getSubtitle", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class BottomSheet {
        public static final int $stable = AbstractC22403o.f87638a;
        private final AbstractC22403o image;
        private final String subtitle;
        private final String title;

        public BottomSheet(AbstractC22403o abstractC22403o, String title, String subtitle) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(subtitle, "subtitle");
            this.image = abstractC22403o;
            this.title = title;
            this.subtitle = subtitle;
        }

        public static /* synthetic */ BottomSheet copy$default(BottomSheet bottomSheet, AbstractC22403o abstractC22403o, String str, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                abstractC22403o = bottomSheet.image;
            }
            if ((i13 & 2) != 0) {
                str = bottomSheet.title;
            }
            if ((i13 & 4) != 0) {
                str2 = bottomSheet.subtitle;
            }
            return bottomSheet.copy(abstractC22403o, str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AbstractC22403o getImage() {
            return this.image;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final BottomSheet copy(AbstractC22403o image, String title, String subtitle) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(subtitle, "subtitle");
            return new BottomSheet(image, title, subtitle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BottomSheet)) {
                return false;
            }
            BottomSheet bottomSheet = (BottomSheet) other;
            return AbstractC22676k.m65745e(this.image, bottomSheet.image) && AbstractC22676k.m65745e(this.title, bottomSheet.title) && AbstractC22676k.m65745e(this.subtitle, bottomSheet.subtitle);
        }

        public final AbstractC22403o getImage() {
            return this.image;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            AbstractC22403o abstractC22403o = this.image;
            return this.subtitle.hashCode() + AbstractC11266d.m30450d((abstractC22403o == null ? 0 : abstractC22403o.hashCode()) * 31, 31, this.title);
        }

        public String toString() {
            AbstractC22403o abstractC22403o = this.image;
            String str = this.title;
            String str2 = this.subtitle;
            StringBuilder sb4 = new StringBuilder("BottomSheet(image=");
            sb4.append(abstractC22403o);
            sb4.append(", title=");
            sb4.append(str);
            sb4.append(", subtitle=");
            return AbstractC25012a.m73376i(str2, ")", sb4);
        }
    }

    @p715kotlin.Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0014J`\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010\u0016J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b\u0005\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b/\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b1\u0010\u001cR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b2\u0010\u0014¨\u00063"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileViewState$Metadata;", "", "Lkd1/o;", "entitlementImage", "", "isSelfProfile", "", "editButtonTitle", "Lcom/whoop/analytics/AnalyticEventModel;", "editButtonAnalyticEvent", "Lcom/whoop/profile/presentation/ProfileViewState$UserData;", "userData", "Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;", "membershipData", "showSettingsButton", "<init>", "(Lkd1/o;ZLjava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/profile/presentation/ProfileViewState$UserData;Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;Z)V", "component1", "()Lkd1/o;", "component2", "()Z", "component3", "()Ljava/lang/String;", "component4", "()Lcom/whoop/analytics/AnalyticEventModel;", "component5", "()Lcom/whoop/profile/presentation/ProfileViewState$UserData;", "component6", "()Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;", "component7", "copy", "(Lkd1/o;ZLjava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/profile/presentation/ProfileViewState$UserData;Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;Z)Lcom/whoop/profile/presentation/ProfileViewState$Metadata;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lkd1/o;", "getEntitlementImage", "Z", "Ljava/lang/String;", "getEditButtonTitle", "Lcom/whoop/analytics/AnalyticEventModel;", "getEditButtonAnalyticEvent", "Lcom/whoop/profile/presentation/ProfileViewState$UserData;", "getUserData", "Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;", "getMembershipData", "getShowSettingsButton", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class Metadata {
        public static final int $stable = 8;
        private final AnalyticEventModel editButtonAnalyticEvent;
        private final String editButtonTitle;
        private final AbstractC22403o entitlementImage;
        private final boolean isSelfProfile;
        private final MembershipData membershipData;
        private final boolean showSettingsButton;
        private final UserData userData;

        public Metadata() {
            this(null, false, null, null, null, null, false, 127, null);
        }

        public static /* synthetic */ Metadata copy$default(Metadata metadata, AbstractC22403o abstractC22403o, boolean z4, String str, AnalyticEventModel analyticEventModel, UserData userData, MembershipData membershipData, boolean z13, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                abstractC22403o = metadata.entitlementImage;
            }
            if ((i13 & 2) != 0) {
                z4 = metadata.isSelfProfile;
            }
            if ((i13 & 4) != 0) {
                str = metadata.editButtonTitle;
            }
            if ((i13 & 8) != 0) {
                analyticEventModel = metadata.editButtonAnalyticEvent;
            }
            if ((i13 & 16) != 0) {
                userData = metadata.userData;
            }
            if ((i13 & 32) != 0) {
                membershipData = metadata.membershipData;
            }
            if ((i13 & 64) != 0) {
                z13 = metadata.showSettingsButton;
            }
            MembershipData membershipData2 = membershipData;
            boolean z14 = z13;
            UserData userData2 = userData;
            String str2 = str;
            return metadata.copy(abstractC22403o, z4, str2, analyticEventModel, userData2, membershipData2, z14);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AbstractC22403o getEntitlementImage() {
            return this.entitlementImage;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsSelfProfile() {
            return this.isSelfProfile;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getEditButtonTitle() {
            return this.editButtonTitle;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final AnalyticEventModel getEditButtonAnalyticEvent() {
            return this.editButtonAnalyticEvent;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final UserData getUserData() {
            return this.userData;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final MembershipData getMembershipData() {
            return this.membershipData;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final boolean getShowSettingsButton() {
            return this.showSettingsButton;
        }

        public final Metadata copy(AbstractC22403o entitlementImage, boolean isSelfProfile, String editButtonTitle, AnalyticEventModel editButtonAnalyticEvent, UserData userData, MembershipData membershipData, boolean showSettingsButton) {
            return new Metadata(entitlementImage, isSelfProfile, editButtonTitle, editButtonAnalyticEvent, userData, membershipData, showSettingsButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Metadata)) {
                return false;
            }
            Metadata metadata = (Metadata) other;
            return AbstractC22676k.m65745e(this.entitlementImage, metadata.entitlementImage) && this.isSelfProfile == metadata.isSelfProfile && AbstractC22676k.m65745e(this.editButtonTitle, metadata.editButtonTitle) && AbstractC22676k.m65745e(this.editButtonAnalyticEvent, metadata.editButtonAnalyticEvent) && AbstractC22676k.m65745e(this.userData, metadata.userData) && AbstractC22676k.m65745e(this.membershipData, metadata.membershipData) && this.showSettingsButton == metadata.showSettingsButton;
        }

        public final AnalyticEventModel getEditButtonAnalyticEvent() {
            return this.editButtonAnalyticEvent;
        }

        public final String getEditButtonTitle() {
            return this.editButtonTitle;
        }

        public final AbstractC22403o getEntitlementImage() {
            return this.entitlementImage;
        }

        public final MembershipData getMembershipData() {
            return this.membershipData;
        }

        public final boolean getShowSettingsButton() {
            return this.showSettingsButton;
        }

        public final UserData getUserData() {
            return this.userData;
        }

        public int hashCode() {
            AbstractC22403o abstractC22403o = this.entitlementImage;
            int iM8289b = AbstractC2875y.m8289b((abstractC22403o == null ? 0 : abstractC22403o.hashCode()) * 31, 31, this.isSelfProfile);
            String str = this.editButtonTitle;
            int iHashCode = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
            AnalyticEventModel analyticEventModel = this.editButtonAnalyticEvent;
            int iHashCode2 = (iHashCode + (analyticEventModel == null ? 0 : analyticEventModel.hashCode())) * 31;
            UserData userData = this.userData;
            int iHashCode3 = (iHashCode2 + (userData == null ? 0 : userData.hashCode())) * 31;
            MembershipData membershipData = this.membershipData;
            return Boolean.hashCode(this.showSettingsButton) + ((iHashCode3 + (membershipData != null ? membershipData.hashCode() : 0)) * 31);
        }

        public final boolean isSelfProfile() {
            return this.isSelfProfile;
        }

        public String toString() {
            AbstractC22403o abstractC22403o = this.entitlementImage;
            boolean z4 = this.isSelfProfile;
            String str = this.editButtonTitle;
            AnalyticEventModel analyticEventModel = this.editButtonAnalyticEvent;
            UserData userData = this.userData;
            MembershipData membershipData = this.membershipData;
            boolean z13 = this.showSettingsButton;
            StringBuilder sb4 = new StringBuilder("Metadata(entitlementImage=");
            sb4.append(abstractC22403o);
            sb4.append(", isSelfProfile=");
            sb4.append(z4);
            sb4.append(", editButtonTitle=");
            sb4.append(str);
            sb4.append(", editButtonAnalyticEvent=");
            sb4.append(analyticEventModel);
            sb4.append(", userData=");
            sb4.append(userData);
            sb4.append(", membershipData=");
            sb4.append(membershipData);
            sb4.append(", showSettingsButton=");
            return AbstractC18489d0.m53372m(sb4, z13, ")");
        }

        public Metadata(AbstractC22403o abstractC22403o, boolean z4, String str, AnalyticEventModel analyticEventModel, UserData userData, MembershipData membershipData, boolean z13) {
            this.entitlementImage = abstractC22403o;
            this.isSelfProfile = z4;
            this.editButtonTitle = str;
            this.editButtonAnalyticEvent = analyticEventModel;
            this.userData = userData;
            this.membershipData = membershipData;
            this.showSettingsButton = z13;
        }

        public /* synthetic */ Metadata(AbstractC22403o abstractC22403o, boolean z4, String str, AnalyticEventModel analyticEventModel, UserData userData, MembershipData membershipData, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : abstractC22403o, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : analyticEventModel, (i13 & 16) != 0 ? null : userData, (i13 & 32) != 0 ? null : membershipData, (i13 & 64) != 0 ? false : z13);
        }
    }

    @p715kotlin.Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;", "", "items", "", "Lcom/whoop/profile/presentation/ProfileViewState$ComponentItem;", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class ScreenContent {
        public static final int $stable = 8;
        private final List<ComponentItem> items;

        /* JADX WARN: Multi-variable type inference failed */
        public ScreenContent() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ScreenContent copy$default(ScreenContent screenContent, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                list = screenContent.items;
            }
            return screenContent.copy(list);
        }

        public final List<ComponentItem> component1() {
            return this.items;
        }

        public final ScreenContent copy(List<ComponentItem> items) {
            AbstractC22676k.m65750j(items, "items");
            return new ScreenContent(items);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ScreenContent) && AbstractC22676k.m65745e(this.items, ((ScreenContent) other).items);
        }

        public final List<ComponentItem> getItems() {
            return this.items;
        }

        public int hashCode() {
            return this.items.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106654m("ScreenContent(items=", ")", this.items);
        }

        public ScreenContent(List<ComponentItem> items) {
            AbstractC22676k.m65750j(items, "items");
            this.items = items;
        }

        public /* synthetic */ ScreenContent(List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? C25271y.f99162w : list);
        }
    }

    public ProfileViewState() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ ProfileViewState copy$default(ProfileViewState profileViewState, ProfileDialogState profileDialogState, FullScreenModal fullScreenModal, AnyModal anyModal, ProfileEvent.NavigationEvent navigationEvent, Metadata metadata, ScreenContent screenContent, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            profileDialogState = profileViewState.popUpDialog;
        }
        if ((i13 & 2) != 0) {
            fullScreenModal = profileViewState.fullScreenModal;
        }
        if ((i13 & 4) != 0) {
            anyModal = profileViewState.designModal;
        }
        if ((i13 & 8) != 0) {
            navigationEvent = profileViewState.pendingNavigation;
        }
        if ((i13 & 16) != 0) {
            metadata = profileViewState.metadata;
        }
        if ((i13 & 32) != 0) {
            screenContent = profileViewState.screenContent;
        }
        Metadata metadata2 = metadata;
        ScreenContent screenContent2 = screenContent;
        return profileViewState.copy(profileDialogState, fullScreenModal, anyModal, navigationEvent, metadata2, screenContent2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ProfileDialogState getPopUpDialog() {
        return this.popUpDialog;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FullScreenModal getFullScreenModal() {
        return this.fullScreenModal;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AnyModal getDesignModal() {
        return this.designModal;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ProfileEvent.NavigationEvent getPendingNavigation() {
        return this.pendingNavigation;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Metadata getMetadata() {
        return this.metadata;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ScreenContent getScreenContent() {
        return this.screenContent;
    }

    public final ProfileViewState copy(ProfileDialogState popUpDialog, FullScreenModal fullScreenModal, AnyModal designModal, ProfileEvent.NavigationEvent pendingNavigation, Metadata metadata, ScreenContent screenContent) {
        AbstractC22676k.m65750j(metadata, "metadata");
        AbstractC22676k.m65750j(screenContent, "screenContent");
        return new ProfileViewState(popUpDialog, fullScreenModal, designModal, pendingNavigation, metadata, screenContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileViewState)) {
            return false;
        }
        ProfileViewState profileViewState = (ProfileViewState) other;
        return AbstractC22676k.m65745e(this.popUpDialog, profileViewState.popUpDialog) && AbstractC22676k.m65745e(this.fullScreenModal, profileViewState.fullScreenModal) && AbstractC22676k.m65745e(this.designModal, profileViewState.designModal) && AbstractC22676k.m65745e(this.pendingNavigation, profileViewState.pendingNavigation) && AbstractC22676k.m65745e(this.metadata, profileViewState.metadata) && AbstractC22676k.m65745e(this.screenContent, profileViewState.screenContent);
    }

    public final AnyModal getDesignModal() {
        return this.designModal;
    }

    public final FullScreenModal getFullScreenModal() {
        return this.fullScreenModal;
    }

    public final Metadata getMetadata() {
        return this.metadata;
    }

    public final ProfileEvent.NavigationEvent getPendingNavigation() {
        return this.pendingNavigation;
    }

    public final ProfileDialogState getPopUpDialog() {
        return this.popUpDialog;
    }

    public final ScreenContent getScreenContent() {
        return this.screenContent;
    }

    public int hashCode() {
        ProfileDialogState profileDialogState = this.popUpDialog;
        int iHashCode = (profileDialogState == null ? 0 : profileDialogState.hashCode()) * 31;
        FullScreenModal fullScreenModal = this.fullScreenModal;
        int iHashCode2 = (iHashCode + (fullScreenModal == null ? 0 : fullScreenModal.hashCode())) * 31;
        AnyModal anyModal = this.designModal;
        int iHashCode3 = (iHashCode2 + (anyModal == null ? 0 : anyModal.hashCode())) * 31;
        ProfileEvent.NavigationEvent navigationEvent = this.pendingNavigation;
        return this.screenContent.hashCode() + ((this.metadata.hashCode() + ((iHashCode3 + (navigationEvent != null ? navigationEvent.hashCode() : 0)) * 31)) * 31);
    }

    public String toString() {
        return "ProfileViewState(popUpDialog=" + this.popUpDialog + ", fullScreenModal=" + this.fullScreenModal + ", designModal=" + this.designModal + ", pendingNavigation=" + this.pendingNavigation + ", metadata=" + this.metadata + ", screenContent=" + this.screenContent + ")";
    }

    public ProfileViewState(ProfileDialogState profileDialogState, FullScreenModal fullScreenModal, AnyModal anyModal, ProfileEvent.NavigationEvent navigationEvent, Metadata metadata, ScreenContent screenContent) {
        AbstractC22676k.m65750j(metadata, "metadata");
        AbstractC22676k.m65750j(screenContent, "screenContent");
        this.popUpDialog = profileDialogState;
        this.fullScreenModal = fullScreenModal;
        this.designModal = anyModal;
        this.pendingNavigation = navigationEvent;
        this.metadata = metadata;
        this.screenContent = screenContent;
    }

    @p715kotlin.Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileViewState$ComponentItem;", "", "", "Lm91/o;", "itemViewState", "Lcom/whoop/profile/domain/models/ProfileSectionSpacingType;", "insetBottom", "<init>", "(Ljava/util/List;Lcom/whoop/profile/domain/models/ProfileSectionSpacingType;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/whoop/profile/domain/models/ProfileSectionSpacingType;", "copy", "(Ljava/util/List;Lcom/whoop/profile/domain/models/ProfileSectionSpacingType;)Lcom/whoop/profile/presentation/ProfileViewState$ComponentItem;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItemViewState", "Lcom/whoop/profile/domain/models/ProfileSectionSpacingType;", "getInsetBottom", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class ComponentItem {
        public static final int $stable = 8;
        private final ProfileSectionSpacingType insetBottom;
        private final List<C25306o> itemViewState;

        public ComponentItem(List<C25306o> itemViewState, ProfileSectionSpacingType insetBottom) {
            AbstractC22676k.m65750j(itemViewState, "itemViewState");
            AbstractC22676k.m65750j(insetBottom, "insetBottom");
            this.itemViewState = itemViewState;
            this.insetBottom = insetBottom;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ComponentItem copy$default(ComponentItem componentItem, List list, ProfileSectionSpacingType profileSectionSpacingType, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                list = componentItem.itemViewState;
            }
            if ((i13 & 2) != 0) {
                profileSectionSpacingType = componentItem.insetBottom;
            }
            return componentItem.copy(list, profileSectionSpacingType);
        }

        public final List<C25306o> component1() {
            return this.itemViewState;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ProfileSectionSpacingType getInsetBottom() {
            return this.insetBottom;
        }

        public final ComponentItem copy(List<C25306o> itemViewState, ProfileSectionSpacingType insetBottom) {
            AbstractC22676k.m65750j(itemViewState, "itemViewState");
            AbstractC22676k.m65750j(insetBottom, "insetBottom");
            return new ComponentItem(itemViewState, insetBottom);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ComponentItem)) {
                return false;
            }
            ComponentItem componentItem = (ComponentItem) other;
            return AbstractC22676k.m65745e(this.itemViewState, componentItem.itemViewState) && this.insetBottom == componentItem.insetBottom;
        }

        public final ProfileSectionSpacingType getInsetBottom() {
            return this.insetBottom;
        }

        public final List<C25306o> getItemViewState() {
            return this.itemViewState;
        }

        public int hashCode() {
            return this.insetBottom.hashCode() + (this.itemViewState.hashCode() * 31);
        }

        public String toString() {
            return "ComponentItem(itemViewState=" + this.itemViewState + ", insetBottom=" + this.insetBottom + ")";
        }

        public /* synthetic */ ComponentItem(List list, ProfileSectionSpacingType profileSectionSpacingType, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i13 & 2) != 0 ? ProfileSectionSpacingType.COMPACT : profileSectionSpacingType);
        }
    }

    @p715kotlin.Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ>\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b!\u0010\r¨\u0006\""}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;", "", "Lsz0/q0;", "state", "Lcom/whoop/profile/presentation/ProfileEvent;", "primaryClickEvent", "secondaryClickEvent", "backClickEvent", "<init>", "(Lsz0/q0;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;)V", "component1", "()Lsz0/q0;", "component2", "()Lcom/whoop/profile/presentation/ProfileEvent;", "component3", "component4", "copy", "(Lsz0/q0;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;)Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lsz0/q0;", "getState", "Lcom/whoop/profile/presentation/ProfileEvent;", "getPrimaryClickEvent", "getSecondaryClickEvent", "getBackClickEvent", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class FullScreenModal {
        public static final int $stable = C33211q0.f138501k;
        private final ProfileEvent backClickEvent;
        private final ProfileEvent primaryClickEvent;
        private final ProfileEvent secondaryClickEvent;
        private final C33211q0 state;

        public FullScreenModal(C33211q0 state, ProfileEvent profileEvent, ProfileEvent profileEvent2, ProfileEvent profileEvent3) {
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
            this.primaryClickEvent = profileEvent;
            this.secondaryClickEvent = profileEvent2;
            this.backClickEvent = profileEvent3;
        }

        public static /* synthetic */ FullScreenModal copy$default(FullScreenModal fullScreenModal, C33211q0 c33211q0, ProfileEvent profileEvent, ProfileEvent profileEvent2, ProfileEvent profileEvent3, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                c33211q0 = fullScreenModal.state;
            }
            if ((i13 & 2) != 0) {
                profileEvent = fullScreenModal.primaryClickEvent;
            }
            if ((i13 & 4) != 0) {
                profileEvent2 = fullScreenModal.secondaryClickEvent;
            }
            if ((i13 & 8) != 0) {
                profileEvent3 = fullScreenModal.backClickEvent;
            }
            return fullScreenModal.copy(c33211q0, profileEvent, profileEvent2, profileEvent3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final C33211q0 getState() {
            return this.state;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ProfileEvent getPrimaryClickEvent() {
            return this.primaryClickEvent;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ProfileEvent getSecondaryClickEvent() {
            return this.secondaryClickEvent;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final ProfileEvent getBackClickEvent() {
            return this.backClickEvent;
        }

        public final FullScreenModal copy(C33211q0 state, ProfileEvent primaryClickEvent, ProfileEvent secondaryClickEvent, ProfileEvent backClickEvent) {
            AbstractC22676k.m65750j(state, "state");
            return new FullScreenModal(state, primaryClickEvent, secondaryClickEvent, backClickEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FullScreenModal)) {
                return false;
            }
            FullScreenModal fullScreenModal = (FullScreenModal) other;
            return AbstractC22676k.m65745e(this.state, fullScreenModal.state) && AbstractC22676k.m65745e(this.primaryClickEvent, fullScreenModal.primaryClickEvent) && AbstractC22676k.m65745e(this.secondaryClickEvent, fullScreenModal.secondaryClickEvent) && AbstractC22676k.m65745e(this.backClickEvent, fullScreenModal.backClickEvent);
        }

        public final ProfileEvent getBackClickEvent() {
            return this.backClickEvent;
        }

        public final ProfileEvent getPrimaryClickEvent() {
            return this.primaryClickEvent;
        }

        public final ProfileEvent getSecondaryClickEvent() {
            return this.secondaryClickEvent;
        }

        public final C33211q0 getState() {
            return this.state;
        }

        public int hashCode() {
            int iHashCode = this.state.hashCode() * 31;
            ProfileEvent profileEvent = this.primaryClickEvent;
            int iHashCode2 = (iHashCode + (profileEvent == null ? 0 : profileEvent.hashCode())) * 31;
            ProfileEvent profileEvent2 = this.secondaryClickEvent;
            int iHashCode3 = (iHashCode2 + (profileEvent2 == null ? 0 : profileEvent2.hashCode())) * 31;
            ProfileEvent profileEvent3 = this.backClickEvent;
            return iHashCode3 + (profileEvent3 != null ? profileEvent3.hashCode() : 0);
        }

        public String toString() {
            return "FullScreenModal(state=" + this.state + ", primaryClickEvent=" + this.primaryClickEvent + ", secondaryClickEvent=" + this.secondaryClickEvent + ", backClickEvent=" + this.backClickEvent + ")";
        }

        public /* synthetic */ FullScreenModal(C33211q0 c33211q0, ProfileEvent profileEvent, ProfileEvent profileEvent2, ProfileEvent profileEvent3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c33211q0, (i13 & 2) != 0 ? null : profileEvent, (i13 & 4) != 0 ? null : profileEvent2, (i13 & 8) != 0 ? null : profileEvent3);
        }
    }

    @p715kotlin.Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010JT\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b#\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b$\u0010\u0010R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b'\u0010\u0010¨\u0006("}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileViewState$UserData;", "", "Lkd1/o;", "profileImageUrl", "", "firstName", "lastName", "username", "", HttpHeaders.AGE, "location", "<init>", "(Lkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "component1", "()Lkd1/o;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Ljava/lang/Integer;", "component6", "copy", "(Lkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/whoop/profile/presentation/ProfileViewState$UserData;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkd1/o;", "getProfileImageUrl", "Ljava/lang/String;", "getFirstName", "getLastName", "getUsername", "Ljava/lang/Integer;", "getAge", "getLocation", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class UserData {
        public static final int $stable = AbstractC22403o.f87638a;
        private final Integer age;
        private final String firstName;
        private final String lastName;
        private final String location;
        private final AbstractC22403o profileImageUrl;
        private final String username;

        public UserData(AbstractC22403o abstractC22403o, String firstName, String lastName, String str, Integer num, String str2) {
            AbstractC22676k.m65750j(firstName, "firstName");
            AbstractC22676k.m65750j(lastName, "lastName");
            this.profileImageUrl = abstractC22403o;
            this.firstName = firstName;
            this.lastName = lastName;
            this.username = str;
            this.age = num;
            this.location = str2;
        }

        public static /* synthetic */ UserData copy$default(UserData userData, AbstractC22403o abstractC22403o, String str, String str2, String str3, Integer num, String str4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                abstractC22403o = userData.profileImageUrl;
            }
            if ((i13 & 2) != 0) {
                str = userData.firstName;
            }
            if ((i13 & 4) != 0) {
                str2 = userData.lastName;
            }
            if ((i13 & 8) != 0) {
                str3 = userData.username;
            }
            if ((i13 & 16) != 0) {
                num = userData.age;
            }
            if ((i13 & 32) != 0) {
                str4 = userData.location;
            }
            Integer num2 = num;
            String str5 = str4;
            return userData.copy(abstractC22403o, str, str2, str3, num2, str5);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AbstractC22403o getProfileImageUrl() {
            return this.profileImageUrl;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getFirstName() {
            return this.firstName;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getLastName() {
            return this.lastName;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getUsername() {
            return this.username;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Integer getAge() {
            return this.age;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getLocation() {
            return this.location;
        }

        public final UserData copy(AbstractC22403o profileImageUrl, String firstName, String lastName, String username, Integer age, String location) {
            AbstractC22676k.m65750j(firstName, "firstName");
            AbstractC22676k.m65750j(lastName, "lastName");
            return new UserData(profileImageUrl, firstName, lastName, username, age, location);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserData)) {
                return false;
            }
            UserData userData = (UserData) other;
            return AbstractC22676k.m65745e(this.profileImageUrl, userData.profileImageUrl) && AbstractC22676k.m65745e(this.firstName, userData.firstName) && AbstractC22676k.m65745e(this.lastName, userData.lastName) && AbstractC22676k.m65745e(this.username, userData.username) && AbstractC22676k.m65745e(this.age, userData.age) && AbstractC22676k.m65745e(this.location, userData.location);
        }

        public final Integer getAge() {
            return this.age;
        }

        public final String getFirstName() {
            return this.firstName;
        }

        public final String getLastName() {
            return this.lastName;
        }

        public final String getLocation() {
            return this.location;
        }

        public final AbstractC22403o getProfileImageUrl() {
            return this.profileImageUrl;
        }

        public final String getUsername() {
            return this.username;
        }

        public int hashCode() {
            AbstractC22403o abstractC22403o = this.profileImageUrl;
            int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((abstractC22403o == null ? 0 : abstractC22403o.hashCode()) * 31, 31, this.firstName), 31, this.lastName);
            String str = this.username;
            int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.age;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.location;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            AbstractC22403o abstractC22403o = this.profileImageUrl;
            String str = this.firstName;
            String str2 = this.lastName;
            String str3 = this.username;
            Integer num = this.age;
            String str4 = this.location;
            StringBuilder sb4 = new StringBuilder("UserData(profileImageUrl=");
            sb4.append(abstractC22403o);
            sb4.append(", firstName=");
            sb4.append(str);
            sb4.append(", lastName=");
            AbstractC11266d.m30444B(sb4, str2, ", username=", str3, ", age=");
            sb4.append(num);
            sb4.append(", location=");
            sb4.append(str4);
            sb4.append(")");
            return sb4.toString();
        }

        public /* synthetic */ UserData(AbstractC22403o abstractC22403o, String str, String str2, String str3, Integer num, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : abstractC22403o, str, str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : num, (i13 & 32) != 0 ? null : str4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ProfileViewState(ProfileDialogState profileDialogState, FullScreenModal fullScreenModal, AnyModal anyModal, ProfileEvent.NavigationEvent navigationEvent, Metadata metadata, ScreenContent screenContent, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        ScreenContent screenContent2;
        List list = null;
        Object[] objArr = 0;
        ProfileDialogState profileDialogState2 = (i13 & 1) != 0 ? null : profileDialogState;
        FullScreenModal fullScreenModal2 = (i13 & 2) != 0 ? null : fullScreenModal;
        AnyModal anyModal2 = (i13 & 4) != 0 ? null : anyModal;
        ProfileEvent.NavigationEvent navigationEvent2 = (i13 & 8) != 0 ? null : navigationEvent;
        Metadata metadata2 = (i13 & 16) != 0 ? new Metadata(null, false, null, null, null, null, false, 127, null) : metadata;
        if ((i13 & 32) != 0) {
            screenContent2 = new ScreenContent(list, 1, objArr == true ? 1 : 0);
        } else {
            screenContent2 = screenContent;
        }
        this(profileDialogState2, fullScreenModal2, anyModal2, navigationEvent2, metadata2, screenContent2);
    }

    @p715kotlin.Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJv\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u0014J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b\u0003\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b0\u0010\u0014R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b2\u0010\u001cR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b3\u0010\u001cR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b4\u0010\u001c¨\u00065"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;", "", "", "isFoundingMember", "", "memberSinceTitle", "memberSinceDate", "Lgz0/m0;", "icon", "Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;", "bottomSheet", "followingState", "communityVisible", "ageVisible", "locationVisible", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lgz0/m0;", "component5", "()Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;", "component6", "component7", "()Ljava/lang/Boolean;", "component8", "component9", "copy", "(ZLjava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Ljava/lang/String;", "getMemberSinceTitle", "getMemberSinceDate", "Lgz0/m0;", "getIcon", "Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;", "getBottomSheet", "getFollowingState", "Ljava/lang/Boolean;", "getCommunityVisible", "getAgeVisible", "getLocationVisible", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class MembershipData {
        public static final int $stable = AbstractC22403o.f87638a;
        private final Boolean ageVisible;
        private final BottomSheet bottomSheet;
        private final Boolean communityVisible;
        private final String followingState;
        private final EnumC16313m0 icon;
        private final boolean isFoundingMember;
        private final Boolean locationVisible;
        private final String memberSinceDate;
        private final String memberSinceTitle;

        public MembershipData(boolean z4, String memberSinceTitle, String str, EnumC16313m0 icon, BottomSheet bottomSheet, String str2, Boolean bool, Boolean bool2, Boolean bool3) {
            AbstractC22676k.m65750j(memberSinceTitle, "memberSinceTitle");
            AbstractC22676k.m65750j(icon, "icon");
            this.isFoundingMember = z4;
            this.memberSinceTitle = memberSinceTitle;
            this.memberSinceDate = str;
            this.icon = icon;
            this.bottomSheet = bottomSheet;
            this.followingState = str2;
            this.communityVisible = bool;
            this.ageVisible = bool2;
            this.locationVisible = bool3;
        }

        public static /* synthetic */ MembershipData copy$default(MembershipData membershipData, boolean z4, String str, String str2, EnumC16313m0 enumC16313m0, BottomSheet bottomSheet, String str3, Boolean bool, Boolean bool2, Boolean bool3, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z4 = membershipData.isFoundingMember;
            }
            if ((i13 & 2) != 0) {
                str = membershipData.memberSinceTitle;
            }
            if ((i13 & 4) != 0) {
                str2 = membershipData.memberSinceDate;
            }
            if ((i13 & 8) != 0) {
                enumC16313m0 = membershipData.icon;
            }
            if ((i13 & 16) != 0) {
                bottomSheet = membershipData.bottomSheet;
            }
            if ((i13 & 32) != 0) {
                str3 = membershipData.followingState;
            }
            if ((i13 & 64) != 0) {
                bool = membershipData.communityVisible;
            }
            if ((i13 & 128) != 0) {
                bool2 = membershipData.ageVisible;
            }
            if ((i13 & 256) != 0) {
                bool3 = membershipData.locationVisible;
            }
            Boolean bool4 = bool2;
            Boolean bool5 = bool3;
            String str4 = str3;
            Boolean bool6 = bool;
            BottomSheet bottomSheet2 = bottomSheet;
            String str5 = str2;
            return membershipData.copy(z4, str, str5, enumC16313m0, bottomSheet2, str4, bool6, bool4, bool5);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsFoundingMember() {
            return this.isFoundingMember;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMemberSinceTitle() {
            return this.memberSinceTitle;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getMemberSinceDate() {
            return this.memberSinceDate;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final EnumC16313m0 getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final BottomSheet getBottomSheet() {
            return this.bottomSheet;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getFollowingState() {
            return this.followingState;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Boolean getCommunityVisible() {
            return this.communityVisible;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Boolean getAgeVisible() {
            return this.ageVisible;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Boolean getLocationVisible() {
            return this.locationVisible;
        }

        public final MembershipData copy(boolean isFoundingMember, String memberSinceTitle, String memberSinceDate, EnumC16313m0 icon, BottomSheet bottomSheet, String followingState, Boolean communityVisible, Boolean ageVisible, Boolean locationVisible) {
            AbstractC22676k.m65750j(memberSinceTitle, "memberSinceTitle");
            AbstractC22676k.m65750j(icon, "icon");
            return new MembershipData(isFoundingMember, memberSinceTitle, memberSinceDate, icon, bottomSheet, followingState, communityVisible, ageVisible, locationVisible);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MembershipData)) {
                return false;
            }
            MembershipData membershipData = (MembershipData) other;
            return this.isFoundingMember == membershipData.isFoundingMember && AbstractC22676k.m65745e(this.memberSinceTitle, membershipData.memberSinceTitle) && AbstractC22676k.m65745e(this.memberSinceDate, membershipData.memberSinceDate) && this.icon == membershipData.icon && AbstractC22676k.m65745e(this.bottomSheet, membershipData.bottomSheet) && AbstractC22676k.m65745e(this.followingState, membershipData.followingState) && AbstractC22676k.m65745e(this.communityVisible, membershipData.communityVisible) && AbstractC22676k.m65745e(this.ageVisible, membershipData.ageVisible) && AbstractC22676k.m65745e(this.locationVisible, membershipData.locationVisible);
        }

        public final Boolean getAgeVisible() {
            return this.ageVisible;
        }

        public final BottomSheet getBottomSheet() {
            return this.bottomSheet;
        }

        public final Boolean getCommunityVisible() {
            return this.communityVisible;
        }

        public final String getFollowingState() {
            return this.followingState;
        }

        public final EnumC16313m0 getIcon() {
            return this.icon;
        }

        public final Boolean getLocationVisible() {
            return this.locationVisible;
        }

        public final String getMemberSinceDate() {
            return this.memberSinceDate;
        }

        public final String getMemberSinceTitle() {
            return this.memberSinceTitle;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(Boolean.hashCode(this.isFoundingMember) * 31, 31, this.memberSinceTitle);
            String str = this.memberSinceDate;
            int iM48500b = AbstractC17176i.m48500b(this.icon, (iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31);
            BottomSheet bottomSheet = this.bottomSheet;
            int iHashCode = (iM48500b + (bottomSheet == null ? 0 : bottomSheet.hashCode())) * 31;
            String str2 = this.followingState;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.communityVisible;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.ageVisible;
            int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.locationVisible;
            return iHashCode4 + (bool3 != null ? bool3.hashCode() : 0);
        }

        public final boolean isFoundingMember() {
            return this.isFoundingMember;
        }

        public String toString() {
            boolean z4 = this.isFoundingMember;
            String str = this.memberSinceTitle;
            String str2 = this.memberSinceDate;
            EnumC16313m0 enumC16313m0 = this.icon;
            BottomSheet bottomSheet = this.bottomSheet;
            String str3 = this.followingState;
            Boolean bool = this.communityVisible;
            Boolean bool2 = this.ageVisible;
            Boolean bool3 = this.locationVisible;
            StringBuilder sbM38567n = AbstractC13673n.m38567n("MembershipData(isFoundingMember=", ", memberSinceTitle=", str, ", memberSinceDate=", z4);
            sbM38567n.append(str2);
            sbM38567n.append(", icon=");
            sbM38567n.append(enumC16313m0);
            sbM38567n.append(", bottomSheet=");
            sbM38567n.append(bottomSheet);
            sbM38567n.append(", followingState=");
            sbM38567n.append(str3);
            sbM38567n.append(", communityVisible=");
            AbstractC3855a.m11839w(sbM38567n, bool, ", ageVisible=", bool2, ", locationVisible=");
            return AbstractC11478a.m30858j(sbM38567n, bool3, ")");
        }

        public /* synthetic */ MembershipData(boolean z4, String str, String str2, EnumC16313m0 enumC16313m0, BottomSheet bottomSheet, String str3, Boolean bool, Boolean bool2, Boolean bool3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(z4, str, str2, enumC16313m0, (i13 & 16) != 0 ? null : bottomSheet, (i13 & 32) != 0 ? null : str3, (i13 & 64) != 0 ? null : bool, (i13 & 128) != 0 ? null : bool2, (i13 & 256) != 0 ? null : bool3);
        }
    }

    @p715kotlin.Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b!\u0010 J~\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b2\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b3\u0010\u0014R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b6\u0010\u001bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b8\u0010\u001eR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b:\u0010 R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\b;\u0010 ¨\u0006<"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;", "", "Lcom/whoop/design/util/TextResource;", "title", "primaryActionText", "Ly81/e;", "primaryActionColor", "secondaryActionText", "description", "", "showCloseIcon", "useSolidButtons", "Lj11/p;", "topDialogStyle", "Lcom/whoop/profile/presentation/ProfileEvent;", "approveEvent", "dismissEvent", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;)V", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "()Ly81/e;", "component4", "component5", "component6", "()Z", "component7", "component8", "()Lj11/p;", "component9", "()Lcom/whoop/profile/presentation/ProfileEvent;", "component10", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;)Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getTitle", "getPrimaryActionText", "Ly81/e;", "getPrimaryActionColor", "getSecondaryActionText", "getDescription", "Z", "getShowCloseIcon", "getUseSolidButtons", "Lj11/p;", "getTopDialogStyle", "Lcom/whoop/profile/presentation/ProfileEvent;", "getApproveEvent", "getDismissEvent", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class ProfileDialogState {
        public static final int $stable = 8;
        private final ProfileEvent approveEvent;
        private final TextResource description;
        private final ProfileEvent dismissEvent;
        private final InterfaceC39332e primaryActionColor;
        private final TextResource primaryActionText;
        private final TextResource secondaryActionText;
        private final boolean showCloseIcon;
        private final TextResource title;
        private final EnumC21213p topDialogStyle;
        private final boolean useSolidButtons;

        public ProfileDialogState(TextResource title, TextResource textResource, InterfaceC39332e interfaceC39332e, TextResource textResource2, TextResource description, boolean z4, boolean z13, EnumC21213p topDialogStyle, ProfileEvent profileEvent, ProfileEvent profileEvent2) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(topDialogStyle, "topDialogStyle");
            this.title = title;
            this.primaryActionText = textResource;
            this.primaryActionColor = interfaceC39332e;
            this.secondaryActionText = textResource2;
            this.description = description;
            this.showCloseIcon = z4;
            this.useSolidButtons = z13;
            this.topDialogStyle = topDialogStyle;
            this.approveEvent = profileEvent;
            this.dismissEvent = profileEvent2;
        }

        public static /* synthetic */ ProfileDialogState copy$default(ProfileDialogState profileDialogState, TextResource textResource, TextResource textResource2, InterfaceC39332e interfaceC39332e, TextResource textResource3, TextResource textResource4, boolean z4, boolean z13, EnumC21213p enumC21213p, ProfileEvent profileEvent, ProfileEvent profileEvent2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                textResource = profileDialogState.title;
            }
            if ((i13 & 2) != 0) {
                textResource2 = profileDialogState.primaryActionText;
            }
            if ((i13 & 4) != 0) {
                interfaceC39332e = profileDialogState.primaryActionColor;
            }
            if ((i13 & 8) != 0) {
                textResource3 = profileDialogState.secondaryActionText;
            }
            if ((i13 & 16) != 0) {
                textResource4 = profileDialogState.description;
            }
            if ((i13 & 32) != 0) {
                z4 = profileDialogState.showCloseIcon;
            }
            if ((i13 & 64) != 0) {
                z13 = profileDialogState.useSolidButtons;
            }
            if ((i13 & 128) != 0) {
                enumC21213p = profileDialogState.topDialogStyle;
            }
            if ((i13 & 256) != 0) {
                profileEvent = profileDialogState.approveEvent;
            }
            if ((i13 & 512) != 0) {
                profileEvent2 = profileDialogState.dismissEvent;
            }
            ProfileEvent profileEvent3 = profileEvent;
            ProfileEvent profileEvent4 = profileEvent2;
            boolean z14 = z13;
            EnumC21213p enumC21213p2 = enumC21213p;
            TextResource textResource5 = textResource4;
            boolean z15 = z4;
            return profileDialogState.copy(textResource, textResource2, interfaceC39332e, textResource3, textResource5, z15, z14, enumC21213p2, profileEvent3, profileEvent4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final ProfileEvent getDismissEvent() {
            return this.dismissEvent;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final TextResource getPrimaryActionText() {
            return this.primaryActionText;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final InterfaceC39332e getPrimaryActionColor() {
            return this.primaryActionColor;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final TextResource getSecondaryActionText() {
            return this.secondaryActionText;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final TextResource getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getShowCloseIcon() {
            return this.showCloseIcon;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final boolean getUseSolidButtons() {
            return this.useSolidButtons;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final EnumC21213p getTopDialogStyle() {
            return this.topDialogStyle;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final ProfileEvent getApproveEvent() {
            return this.approveEvent;
        }

        public final ProfileDialogState copy(TextResource title, TextResource primaryActionText, InterfaceC39332e primaryActionColor, TextResource secondaryActionText, TextResource description, boolean showCloseIcon, boolean useSolidButtons, EnumC21213p topDialogStyle, ProfileEvent approveEvent, ProfileEvent dismissEvent) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(topDialogStyle, "topDialogStyle");
            return new ProfileDialogState(title, primaryActionText, primaryActionColor, secondaryActionText, description, showCloseIcon, useSolidButtons, topDialogStyle, approveEvent, dismissEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProfileDialogState)) {
                return false;
            }
            ProfileDialogState profileDialogState = (ProfileDialogState) other;
            return AbstractC22676k.m65745e(this.title, profileDialogState.title) && AbstractC22676k.m65745e(this.primaryActionText, profileDialogState.primaryActionText) && AbstractC22676k.m65745e(this.primaryActionColor, profileDialogState.primaryActionColor) && AbstractC22676k.m65745e(this.secondaryActionText, profileDialogState.secondaryActionText) && AbstractC22676k.m65745e(this.description, profileDialogState.description) && this.showCloseIcon == profileDialogState.showCloseIcon && this.useSolidButtons == profileDialogState.useSolidButtons && this.topDialogStyle == profileDialogState.topDialogStyle && AbstractC22676k.m65745e(this.approveEvent, profileDialogState.approveEvent) && AbstractC22676k.m65745e(this.dismissEvent, profileDialogState.dismissEvent);
        }

        public final ProfileEvent getApproveEvent() {
            return this.approveEvent;
        }

        public final TextResource getDescription() {
            return this.description;
        }

        public final ProfileEvent getDismissEvent() {
            return this.dismissEvent;
        }

        public final InterfaceC39332e getPrimaryActionColor() {
            return this.primaryActionColor;
        }

        public final TextResource getPrimaryActionText() {
            return this.primaryActionText;
        }

        public final TextResource getSecondaryActionText() {
            return this.secondaryActionText;
        }

        public final boolean getShowCloseIcon() {
            return this.showCloseIcon;
        }

        public final TextResource getTitle() {
            return this.title;
        }

        public final EnumC21213p getTopDialogStyle() {
            return this.topDialogStyle;
        }

        public final boolean getUseSolidButtons() {
            return this.useSolidButtons;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            TextResource textResource = this.primaryActionText;
            int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
            InterfaceC39332e interfaceC39332e = this.primaryActionColor;
            int iHashCode3 = (iHashCode2 + (interfaceC39332e == null ? 0 : interfaceC39332e.hashCode())) * 31;
            TextResource textResource2 = this.secondaryActionText;
            int iM106647f = AbstractC33745d.m106647f(this.topDialogStyle, AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC31061c.m95625a((iHashCode3 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31, this.description, 31), 31, this.showCloseIcon), 31, this.useSolidButtons), 31);
            ProfileEvent profileEvent = this.approveEvent;
            int iHashCode4 = (iM106647f + (profileEvent == null ? 0 : profileEvent.hashCode())) * 31;
            ProfileEvent profileEvent2 = this.dismissEvent;
            return iHashCode4 + (profileEvent2 != null ? profileEvent2.hashCode() : 0);
        }

        public String toString() {
            TextResource textResource = this.title;
            TextResource textResource2 = this.primaryActionText;
            InterfaceC39332e interfaceC39332e = this.primaryActionColor;
            TextResource textResource3 = this.secondaryActionText;
            TextResource textResource4 = this.description;
            boolean z4 = this.showCloseIcon;
            boolean z13 = this.useSolidButtons;
            EnumC21213p enumC21213p = this.topDialogStyle;
            ProfileEvent profileEvent = this.approveEvent;
            ProfileEvent profileEvent2 = this.dismissEvent;
            StringBuilder sbM106658q = AbstractC33745d.m106658q("ProfileDialogState(title=", textResource, ", primaryActionText=", textResource2, ", primaryActionColor=");
            AbstractC33745d.m106665x(sbM106658q, interfaceC39332e, ", secondaryActionText=", textResource3, ", description=");
            AbstractC33745d.m106664w(textResource4, ", showCloseIcon=", ", useSolidButtons=", sbM106658q, z4);
            AbstractC33745d.m106666y(sbM106658q, z13, ", topDialogStyle=", enumC21213p, ", approveEvent=");
            sbM106658q.append(profileEvent);
            sbM106658q.append(", dismissEvent=");
            sbM106658q.append(profileEvent2);
            sbM106658q.append(")");
            return sbM106658q.toString();
        }

        public /* synthetic */ ProfileDialogState(TextResource textResource, TextResource textResource2, InterfaceC39332e interfaceC39332e, TextResource textResource3, TextResource textResource4, boolean z4, boolean z13, EnumC21213p enumC21213p, ProfileEvent profileEvent, ProfileEvent profileEvent2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(textResource, (i13 & 2) != 0 ? null : textResource2, (i13 & 4) != 0 ? null : interfaceC39332e, (i13 & 8) != 0 ? null : textResource3, textResource4, (i13 & 32) != 0 ? false : z4, (i13 & 64) != 0 ? false : z13, (i13 & 128) != 0 ? EnumC21213p.DEFAULT : enumC21213p, (i13 & 256) != 0 ? null : profileEvent, (i13 & 512) != 0 ? null : profileEvent2);
        }
    }
}
