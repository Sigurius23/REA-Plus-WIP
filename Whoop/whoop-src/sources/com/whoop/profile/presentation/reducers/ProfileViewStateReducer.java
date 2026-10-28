package com.whoop.profile.presentation.reducers;

import ck1.C4780c;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.C9691R;
import com.whoop.profile.domain.ProfileDialogType;
import com.whoop.profile.domain.ProfileDomainState;
import com.whoop.profile.domain.ProfileNavigationEffect;
import com.whoop.profile.domain.ProfileReportResult;
import com.whoop.profile.domain.models.BottomSheet;
import com.whoop.profile.domain.models.ProfileResponse;
import com.whoop.profile.domain.models.ProfileSectionModel;
import com.whoop.profile.domain.models.ProfileSectionSpacingType;
import com.whoop.profile.presentation.ProfileEvent;
import com.whoop.profile.presentation.ProfileViewState;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import kd1.AbstractC22403o;
import l83.C23454a0;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p716lb1.C23596b1;
import p720m91.C25306o;
import p736sz0.C33205o0;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\t*\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"¨\u0006#"}, m65681d2 = {"Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;", "", "Ljb1/a;", "reducer", "Ltr2/n;", "logger", "<init>", "(Ljb1/a;Ltr2/n;)V", "Lcom/whoop/profile/domain/ProfileDialogType$FullScreenModal;", "Lcom/whoop/profile/presentation/ProfileViewState;", "toFullScreenModal", "(Lcom/whoop/profile/domain/ProfileDialogType$FullScreenModal;)Lcom/whoop/profile/presentation/ProfileViewState;", "Lcom/whoop/profile/domain/ProfileDomainState;", "toViewState", "(Lcom/whoop/profile/domain/ProfileDomainState;)Lcom/whoop/profile/presentation/ProfileViewState;", "Lcom/whoop/profile/domain/ProfileReportResult;", "Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;", "toDialogState", "(Lcom/whoop/profile/domain/ProfileReportResult;)Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;", "Lcom/whoop/profile/domain/ProfileNavigationEffect;", "Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;", "toNavigationEvent", "(Lcom/whoop/profile/domain/ProfileNavigationEffect;)Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;", "sectionItemReducer", "()Ljb1/a;", "", "spacing", "Lcom/whoop/profile/domain/models/ProfileSectionSpacingType;", "mapSpacingType", "(Ljava/lang/String;)Lcom/whoop/profile/domain/models/ProfileSectionSpacingType;", "domainResult", "reduce", "Ljb1/a;", "getReducer$profile_release", "Ltr2/n;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ProfileViewStateReducer {
    public static final int $stable = 8;
    private final InterfaceC34116n logger;
    private final C21535a reducer;

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProfileReportResult.values().length];
            try {
                iArr[ProfileReportResult.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProfileReportResult.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ProfileViewStateReducer(C21535a reducer, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(logger, "logger");
        this.reducer = reducer;
        this.logger = logger;
    }

    private final ProfileSectionSpacingType mapSpacingType(String spacing) {
        String upperCase = spacing.toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        if (upperCase.equals("NORMAL")) {
            return ProfileSectionSpacingType.NORMAL;
        }
        return upperCase.equals("COMPACT") ? ProfileSectionSpacingType.COMPACT : ProfileSectionSpacingType.COMPACT;
    }

    private final C21535a sectionItemReducer() {
        return AbstractC21537c.m60554d(new C4780c(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 sectionItemReducer$lambda$0(ProfileViewStateReducer profileViewStateReducer, C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60548c(C23596b1.f93677a.m68522a());
        designItemReducer.m60548c(profileViewStateReducer.reducer.getModelMapper());
        return C23454a0.f92919a;
    }

    private final ProfileViewState.ProfileDialogState toDialogState(ProfileReportResult profileReportResult) {
        int i13 = WhenMappings.$EnumSwitchMapping$0[profileReportResult.ordinal()];
        if (i13 == 1) {
            TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(C9691R.string.profile_report_success_title);
            TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(C9691R.string.profile_report_success_description);
            TextResource.C8688b c8688bM21277k3 = AbstractC8693b.m21277k(C9691R.string.profile_report_dialog_dismiss);
            ProfileEvent.DismissReportDialog dismissReportDialog = ProfileEvent.DismissReportDialog.INSTANCE;
            return new ProfileViewState.ProfileDialogState(c8688bM21277k, c8688bM21277k3, null, null, c8688bM21277k2, false, true, null, dismissReportDialog, dismissReportDialog, 172, null);
        }
        if (i13 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        TextResource.C8688b c8688bM21277k4 = AbstractC8693b.m21277k(C9691R.string.profile_report_failure_title);
        TextResource.C8688b c8688bM21277k5 = AbstractC8693b.m21277k(C9691R.string.profile_report_failure_description);
        TextResource.C8688b c8688bM21277k6 = AbstractC8693b.m21277k(C9691R.string.profile_report_dialog_dismiss);
        ProfileEvent.DismissReportDialog dismissReportDialog2 = ProfileEvent.DismissReportDialog.INSTANCE;
        return new ProfileViewState.ProfileDialogState(c8688bM21277k4, c8688bM21277k6, null, null, c8688bM21277k5, false, true, null, dismissReportDialog2, dismissReportDialog2, 172, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ProfileViewState toFullScreenModal(ProfileDialogType.FullScreenModal fullScreenModal) {
        if (fullScreenModal instanceof ProfileDialogType.Loading) {
            ProfileEvent profileEvent = null;
            ProfileEvent.NavigationEvent navigationEvent = null;
            ProfileEvent profileEvent2 = null;
            ProfileViewState.ScreenContent screenContent = null;
            return new ProfileViewState(null, new ProfileViewState.FullScreenModal(C33205o0.f138451a.m105288b(), profileEvent, navigationEvent, profileEvent2, 14, null), 0 == true ? 1 : 0, navigationEvent, 0 == true ? 1 : 0, screenContent, 61, null);
        }
        if (fullScreenModal instanceof ProfileDialogType.NetworkError) {
            ProfileEvent.NavigationEvent navigationEvent2 = null;
            return new ProfileViewState(null, new ProfileViewState.FullScreenModal(C33205o0.f138451a.m105289c(), ProfileEvent.Refresh.INSTANCE, navigationEvent2, ProfileEvent.GoBack.INSTANCE, 4, null), null, navigationEvent2, null, null, 61, null);
        }
        if (fullScreenModal instanceof ProfileDialogType.RequestFailed) {
            ProfileEvent.NavigationEvent navigationEvent3 = null;
            return new ProfileViewState(null, new ProfileViewState.FullScreenModal(C33205o0.f138451a.m105291e(), ProfileEvent.Refresh.INSTANCE, navigationEvent3, ProfileEvent.GoBack.INSTANCE, 4, null), null, navigationEvent3, null, null, 61, null);
        }
        if (!(fullScreenModal instanceof ProfileDialogType.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        ProfileEvent profileEvent3 = null;
        ProfileEvent.NavigationEvent navigationEvent4 = null;
        ProfileEvent profileEvent4 = null;
        ProfileViewState.ScreenContent screenContent2 = null;
        return new ProfileViewState(null, new ProfileViewState.FullScreenModal(C33205o0.f138451a.m105293g(), profileEvent3, navigationEvent4, profileEvent4, 14, null), 0 == true ? 1 : 0, navigationEvent4, 0 == true ? 1 : 0, screenContent2, 61, null);
    }

    private final ProfileEvent.NavigationEvent toNavigationEvent(ProfileNavigationEffect profileNavigationEffect) {
        if (profileNavigationEffect instanceof ProfileNavigationEffect.BackendDriven) {
            ProfileNavigationEffect.BackendDriven backendDriven = (ProfileNavigationEffect.BackendDriven) profileNavigationEffect;
            return new ProfileEvent.BackendDrivenNavigation(backendDriven.getNavAction(), backendDriven.getSource(), null, 4, null);
        }
        if (profileNavigationEffect instanceof ProfileNavigationEffect.PerformDismiss) {
            return new ProfileEvent.PerformDismissNavigation(((ProfileNavigationEffect.PerformDismiss) profileNavigationEffect).getDismissEvent());
        }
        throw new NoWhenBranchMatchedException();
    }

    private final ProfileViewState toViewState(ProfileDomainState profileDomainState) {
        AbstractC22403o.c cVar;
        ProfileSectionSpacingType profileSectionSpacingTypeMapSpacingType;
        try {
            ProfileResponse response = profileDomainState.getResponse();
            if (response == null) {
                ProfileReportResult reportResult = profileDomainState.getReportResult();
                ProfileViewState.ProfileDialogState dialogState = reportResult != null ? toDialogState(reportResult) : null;
                AnyModal designModal = profileDomainState.getDesignModal();
                ProfileNavigationEffect pendingNavigation = profileDomainState.getPendingNavigation();
                return new ProfileViewState(dialogState, null, designModal, pendingNavigation != null ? toNavigationEvent(pendingNavigation) : null, null, null, 50, null);
            }
            C21535a c21535aSectionItemReducer = sectionItemReducer();
            ProfileReportResult reportResult2 = profileDomainState.getReportResult();
            ProfileViewState.ProfileDialogState dialogState2 = reportResult2 != null ? toDialogState(reportResult2) : null;
            AnyModal designModal2 = profileDomainState.getDesignModal();
            ProfileNavigationEffect pendingNavigation2 = profileDomainState.getPendingNavigation();
            ProfileEvent.NavigationEvent navigationEvent = pendingNavigation2 != null ? toNavigationEvent(pendingNavigation2) : null;
            String entitlementsImageUrl = response.getProfileMetadata().getEntitlementsImageUrl();
            if (entitlementsImageUrl != null) {
                C38072d c38072d = C38072d.f163053a;
                cVar = new AbstractC22403o.c(entitlementsImageUrl, c38072d.m121951d().getLogo().getWhoopText(), 0, c38072d.m121951d().getLogo().getWhoopText(), 4, null);
            } else {
                cVar = null;
            }
            String editButtonTitle = response.getProfileMetadata().getEditButtonTitle();
            AnalyticEventModel editButtonAnalyticEvent = response.getProfileMetadata().getEditButtonAnalyticEvent();
            boolean zIsSelfProfile = response.getProfileMetadata().isSelfProfile();
            boolean showSettingsButton = profileDomainState.getShowSettingsButton();
            String profileImageUrl = response.getProfileMetadata().getUserData().getProfileImageUrl();
            ProfileViewState.UserData userData = new ProfileViewState.UserData(profileImageUrl != null ? new AbstractC22403o.c(profileImageUrl, 0, 0, 0, 14, null) : null, response.getProfileMetadata().getUserData().getFirstName(), response.getProfileMetadata().getUserData().getLastName(), response.getProfileMetadata().getUserData().getUsername(), response.getProfileMetadata().getUserData().getAge(), response.getProfileMetadata().getUserData().getLocation());
            boolean zIsFoundingMember = response.getProfileMetadata().getMembershipData().isFoundingMember();
            String memberSinceTitle = response.getProfileMetadata().getMembershipData().getMemberSinceTitle();
            String memberSinceDate = response.getProfileMetadata().getMembershipData().getMemberSinceDate();
            EnumC16313m0 enumC16313m0M46378c = AbstractC16315n0.m46378c(response.getProfileMetadata().getMembershipData().getIcon(), EnumC16313m0.WHOOP_LOGO_CIRCLE);
            BottomSheet bottomSheet = response.getProfileMetadata().getMembershipData().getBottomSheet();
            ProfileViewState.Metadata metadata = new ProfileViewState.Metadata(cVar, zIsSelfProfile, editButtonTitle, editButtonAnalyticEvent, userData, new ProfileViewState.MembershipData(zIsFoundingMember, memberSinceTitle, memberSinceDate, enumC16313m0M46378c, bottomSheet != null ? new ProfileViewState.BottomSheet(!AbstractC39414r.m125890i0(bottomSheet.getImage()) ? new AbstractC22403o.c(bottomSheet.getImage(), 0, 0, 0, 14, null) : null, bottomSheet.getTitle(), bottomSheet.getSubtitle()) : null, response.getProfileMetadata().getMembershipData().getFollowingState(), response.getProfileMetadata().getMembershipData().getCommunityVisible(), response.getProfileMetadata().getMembershipData().getAgeVisible(), response.getProfileMetadata().getMembershipData().getLocationVisible()), showSettingsButton);
            List<ProfileSectionModel> sections = response.getSections();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sections, 10));
            for (ProfileSectionModel profileSectionModel : sections) {
                String sectionType = profileSectionModel.getSectionType();
                if (sectionType == null || (profileSectionSpacingTypeMapSpacingType = mapSpacingType(sectionType)) == null) {
                    profileSectionSpacingTypeMapSpacingType = ProfileSectionSpacingType.COMPACT;
                }
                arrayList.add(new ProfileViewState.ComponentItem(ProfileViewStateReducerKt.withInFlightCardButtonDisabled((List<C25306o>) C21535a.m60536k(c21535aSectionItemReducer, profileSectionModel.getItems(), null, 2, null), profileDomainState.getInFlightCardButtonId()), profileSectionSpacingTypeMapSpacingType));
            }
            return new ProfileViewState(dialogState2, null, designModal2, navigationEvent, metadata, new ProfileViewState.ScreenContent(arrayList), 2, null);
        } catch (Exception e5) {
            this.logger.mo85230v("Error reducing ProfileDomainState to ProfileViewState", e5, new AbstractC30556a.a[0]);
            ProfileEvent.NavigationEvent navigationEvent2 = null;
            return new ProfileViewState(null, new ProfileViewState.FullScreenModal(C33205o0.f138451a.m105291e(), ProfileEvent.Refresh.INSTANCE, navigationEvent2, ProfileEvent.GoBack.INSTANCE, 4, null), null, navigationEvent2, null, null, 61, null);
        }
    }

    /* JADX INFO: renamed from: getReducer$profile_release, reason: from getter */
    public final C21535a getReducer() {
        return this.reducer;
    }

    public final ProfileViewState reduce(ProfileDomainState domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        return domainResult.getCurrentDialogType() instanceof ProfileDialogType.FullScreenModal ? toFullScreenModal((ProfileDialogType.FullScreenModal) domainResult.getCurrentDialogType()) : toViewState(domainResult);
    }

    public /* synthetic */ ProfileViewStateReducer(C21535a c21535a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? ProfileViewStateReducerKt.itemReducer : c21535a, interfaceC34116n);
    }
}
