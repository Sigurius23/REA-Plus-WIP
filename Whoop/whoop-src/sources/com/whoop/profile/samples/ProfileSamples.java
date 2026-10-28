package com.whoop.profile.samples;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.C9691R;
import com.whoop.profile.presentation.ProfileEvent;
import com.whoop.profile.presentation.ProfileViewState;
import gz0.EnumC16313m0;
import kd1.AbstractC22403o;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p736sz0.C33205o0;
import p736sz0.C33211q0;
import x81.C38072d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\u001e\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017¨\u0006 "}, m65681d2 = {"Lcom/whoop/profile/samples/ProfileSamples;", "", "<init>", "()V", "sampleProfileViewStateMetadata", "Lcom/whoop/profile/presentation/ProfileViewState$Metadata;", "getSampleProfileViewStateMetadata", "()Lcom/whoop/profile/presentation/ProfileViewState$Metadata;", "sampleProfileViewStateMetadataWithLongText", "getSampleProfileViewStateMetadataWithLongText", "sampleFoundingMemberProfileViewStateMetadata", "getSampleFoundingMemberProfileViewStateMetadata", "sampleProfileViewStateMetadataWithNullMemberSinceDate", "getSampleProfileViewStateMetadataWithNullMemberSinceDate", "sampleReportSuccessDialog", "Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;", "getSampleReportSuccessDialog", "()Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;", "sampleReportFailureDialog", "getSampleReportFailureDialog", "sampleLoadingViewState", "Lcom/whoop/profile/presentation/ProfileViewState;", "getSampleLoadingViewState", "()Lcom/whoop/profile/presentation/ProfileViewState;", "sampleNetworkErrorViewState", "getSampleNetworkErrorViewState", "sampleRequestFailedViewState", "getSampleRequestFailedViewState", "sampleSuccessViewState", "getSampleSuccessViewState", "sampleProfileViewState", "getSampleProfileViewState", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ProfileSamples {
    public static final int $stable;
    public static final ProfileSamples INSTANCE = new ProfileSamples();
    private static final ProfileViewState.Metadata sampleFoundingMemberProfileViewStateMetadata;
    private static final ProfileViewState sampleLoadingViewState;
    private static final ProfileViewState sampleNetworkErrorViewState;
    private static final ProfileViewState sampleProfileViewState;
    private static final ProfileViewState.Metadata sampleProfileViewStateMetadata;
    private static final ProfileViewState.Metadata sampleProfileViewStateMetadataWithLongText;
    private static final ProfileViewState.Metadata sampleProfileViewStateMetadataWithNullMemberSinceDate;
    private static final ProfileViewState.ProfileDialogState sampleReportFailureDialog;
    private static final ProfileViewState.ProfileDialogState sampleReportSuccessDialog;
    private static final ProfileViewState sampleRequestFailedViewState;
    private static final ProfileViewState sampleSuccessViewState;

    static {
        AbstractC22403o.a aVar = new AbstractC22403o.a(EnumC16313m0.WHOOP_LOGO_TEXT.toWhoopIcon());
        C38072d c38072d = C38072d.f163053a;
        ProfileViewState.UserData userData = new ProfileViewState.UserData(new AbstractC22403o.c("https://lh3.googleusercontent.com/a/ACg8ocI_8VJzPzDcn_3YPD_DHsF_D-6N0SzKpQbuu7ObOHueb4Vodqk=s576-c-no", 0, AbstractC11895b.m31985d(c38072d), AbstractC11895b.m31985d(c38072d), 2, null), "Kimberly", "Taylor", "kimberlytaylor", 34, "Boston, US");
        EnumC16313m0 enumC16313m0 = EnumC16313m0.WHOOP_LOGO_CIRCLE;
        sampleProfileViewStateMetadata = new ProfileViewState.Metadata(aVar, true, "EDIT", null, userData, new ProfileViewState.MembershipData(false, "Member since", "June 2014", enumC16313m0, null, null, null, null, null, 496, null), false, 72, null);
        sampleProfileViewStateMetadataWithLongText = new ProfileViewState.Metadata(null, true, "EDIT", null, new ProfileViewState.UserData(new AbstractC22403o.c("https://lh3.googleusercontent.com/a/ACg8ocI_8VJzPzDcn_3YPD_DHsF_D-6N0SzKpQbuu7ObOHueb4Vodqk=s576-c-no", 0, AbstractC11895b.m31985d(c38072d), AbstractC11895b.m31985d(c38072d), 2, null), "Alexander", "Montgomery-Wellington", "alexander.montgomery.wellington.thethird", 42, "San Francisco Bay Area, California, United States"), new ProfileViewState.MembershipData(false, "Member since", "June 2014", enumC16313m0, null, null, null, null, null, 496, null), false, 73, null);
        ProfileViewState.Metadata metadata = new ProfileViewState.Metadata(null, true, "EDIT", null, new ProfileViewState.UserData(new AbstractC22403o.c("https://lh3.googleusercontent.com/a/ACg8ocI_8VJzPzDcn_3YPD_DHsF_D-6N0SzKpQbuu7ObOHueb4Vodqk=s576-c-no", 0, AbstractC11895b.m31985d(c38072d), AbstractC11895b.m31985d(c38072d), 2, null), "Sarah", "Johnson", "sarahjohnson", 28, "Austin, TX"), new ProfileViewState.MembershipData(true, "Member since", "February 2012", EnumC16313m0.FOUNDING_MEMBER, new ProfileViewState.BottomSheet(new AbstractC22403o.c("https://example.com/founding-member-icon.png", 0, 0, 0, 14, null), "Founding Member", "Founding members joined WHOOP when we first launched. A big thank you to them for their early support!"), null, null, null, null, 480, null), false, 73, null);
        sampleFoundingMemberProfileViewStateMetadata = metadata;
        sampleProfileViewStateMetadataWithNullMemberSinceDate = new ProfileViewState.Metadata(null, true, "EDIT", null, new ProfileViewState.UserData(new AbstractC22403o.c("https://lh3.googleusercontent.com/a/ACg8ocI_8VJzPzDcn_3YPD_DHsF_D-6N0SzKpQbuu7ObOHueb4Vodqk=s576-c-no", 0, AbstractC11895b.m31985d(c38072d), AbstractC11895b.m31985d(c38072d), 2, null), "Sarah", "Johnson", "sarahjohnson", 28, "Austin, TX"), new ProfileViewState.MembershipData(false, "Member since", null, enumC16313m0, null, null, null, null, null, 496, null), false, 73, null);
        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(C9691R.string.profile_report_success_title);
        TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(C9691R.string.profile_report_success_description);
        TextResource.C8688b c8688bM21277k3 = AbstractC8693b.m21277k(C9691R.string.profile_report_dialog_dismiss);
        ProfileEvent.DismissReportDialog dismissReportDialog = ProfileEvent.DismissReportDialog.INSTANCE;
        sampleReportSuccessDialog = new ProfileViewState.ProfileDialogState(c8688bM21277k, c8688bM21277k3, null, null, c8688bM21277k2, false, true, null, dismissReportDialog, dismissReportDialog, 172, null);
        sampleReportFailureDialog = new ProfileViewState.ProfileDialogState(AbstractC8693b.m21277k(C9691R.string.profile_report_failure_title), AbstractC8693b.m21277k(C9691R.string.profile_report_dialog_dismiss), null, null, AbstractC8693b.m21277k(C9691R.string.profile_report_failure_description), false, true, null, dismissReportDialog, dismissReportDialog, 172, null);
        C33205o0 c33205o0 = C33205o0.f138451a;
        sampleLoadingViewState = new ProfileViewState(null, new ProfileViewState.FullScreenModal(c33205o0.m105288b(), null, null, null, 14, null), null, null, metadata, null, 45, null);
        C33211q0 c33211q0M105289c = c33205o0.m105289c();
        ProfileEvent.Refresh refresh = ProfileEvent.Refresh.INSTANCE;
        ProfileEvent.GoBack goBack = ProfileEvent.GoBack.INSTANCE;
        sampleNetworkErrorViewState = new ProfileViewState(null, new ProfileViewState.FullScreenModal(c33211q0M105289c, refresh, null, goBack, 4, null), null, null, metadata, null, 45, null);
        sampleRequestFailedViewState = new ProfileViewState(null, new ProfileViewState.FullScreenModal(c33205o0.m105291e(), refresh, null, goBack, 4, null), null, null, metadata, null, 45, null);
        sampleSuccessViewState = new ProfileViewState(null, new ProfileViewState.FullScreenModal(c33205o0.m105293g(), null, null, null, 14, null), null, null, metadata, null, 45, null);
        sampleProfileViewState = new ProfileViewState(null, null, null, null, metadata, new ProfileViewState.ScreenContent(null, 1, null), 13, null);
        $stable = 8;
    }

    private ProfileSamples() {
    }

    public final ProfileViewState.Metadata getSampleFoundingMemberProfileViewStateMetadata() {
        return sampleFoundingMemberProfileViewStateMetadata;
    }

    public final ProfileViewState getSampleLoadingViewState() {
        return sampleLoadingViewState;
    }

    public final ProfileViewState getSampleNetworkErrorViewState() {
        return sampleNetworkErrorViewState;
    }

    public final ProfileViewState getSampleProfileViewState() {
        return sampleProfileViewState;
    }

    public final ProfileViewState.Metadata getSampleProfileViewStateMetadata() {
        return sampleProfileViewStateMetadata;
    }

    public final ProfileViewState.Metadata getSampleProfileViewStateMetadataWithLongText() {
        return sampleProfileViewStateMetadataWithLongText;
    }

    public final ProfileViewState.Metadata getSampleProfileViewStateMetadataWithNullMemberSinceDate() {
        return sampleProfileViewStateMetadataWithNullMemberSinceDate;
    }

    public final ProfileViewState.ProfileDialogState getSampleReportFailureDialog() {
        return sampleReportFailureDialog;
    }

    public final ProfileViewState.ProfileDialogState getSampleReportSuccessDialog() {
        return sampleReportSuccessDialog;
    }

    public final ProfileViewState getSampleRequestFailedViewState() {
        return sampleRequestFailedViewState;
    }

    public final ProfileViewState getSampleSuccessViewState() {
        return sampleSuccessViewState;
    }
}
