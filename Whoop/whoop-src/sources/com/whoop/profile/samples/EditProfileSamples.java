package com.whoop.profile.samples;

import android.net.Uri;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.domain.model.UnitSystem;
import com.whoop.profile.C9691R;
import com.whoop.profile.domain.edit.EditProfileDomainState;
import com.whoop.profile.domain.edit.models.CountryOption;
import com.whoop.profile.domain.edit.models.EditProfileResponse;
import com.whoop.profile.domain.edit.models.StateOption;
import com.whoop.profile.domain.models.Gender;
import com.whoop.profile.domain.models.PhysiologicalBaseline;
import com.whoop.profile.presentation.edit.EditProfileViewState;
import com.whoop.profile.view.edit.form.EditProfileFormState;
import com.whoop.profile.view.edit.form.FieldState;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.Iterator;
import java.util.List;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p736sz0.AbstractC33208p0;
import p736sz0.C33211q0;
import ty1.C34260e;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u001b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u001b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0011\u0010$\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'R\u0011\u0010*\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\b+\u0010'R\u0011\u0010,\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\b-\u0010'R\u0011\u0010.\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\b/\u0010'R\u0011\u00100\u001a\u000201¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u00104\u001a\u000201¢\u0006\b\n\u0000\u001a\u0004\b5\u00103R\u0011\u00106\u001a\u000201¢\u0006\b\n\u0000\u001a\u0004\b7\u00103R\u0011\u00108\u001a\u000201¢\u0006\b\n\u0000\u001a\u0004\b9\u00103R\u0011\u0010:\u001a\u000201¢\u0006\b\n\u0000\u001a\u0004\b;\u00103R\u0011\u0010<\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\u0011R\u0011\u0010>\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b?\u0010\u0011R\u0011\u0010@\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\bA\u0010\u0011R\u0011\u0010B\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\bC\u0010\u0011R\u0011\u0010D\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\bE\u0010\u0011R\u0011\u0010F\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\bG\u0010\u0011R\u0011\u0010H\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\bI\u0010\u0011R\u0011\u0010J\u001a\u00020K¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0011\u0010N\u001a\u00020K¢\u0006\b\n\u0000\u001a\u0004\bO\u0010MR\u0011\u0010P\u001a\u00020K¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010MR\u0011\u0010R\u001a\u00020K¢\u0006\b\n\u0000\u001a\u0004\bS\u0010MR\u0011\u0010T\u001a\u00020K¢\u0006\b\n\u0000\u001a\u0004\bU\u0010MR\u0011\u0010V\u001a\u00020W¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0011\u0010Z\u001a\u00020[¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010]R\u0011\u0010^\u001a\u00020[¢\u0006\b\n\u0000\u001a\u0004\b_\u0010]R\u0011\u0010`\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\ba\u0010bR\u0011\u0010c\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\bd\u0010\u0011¨\u0006e"}, m65681d2 = {"Lcom/whoop/profile/samples/EditProfileSamples;", "", "<init>", "()V", "editProfileFullScreenLoadingSample", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;", "getEditProfileFullScreenLoadingSample", "()Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;", "editProfileFullScreenSavingSample", "getEditProfileFullScreenSavingSample", "editProfileFullScreenSuccessSample", "getEditProfileFullScreenSuccessSample", "editProfileFullScreenErrorSample", "getEditProfileFullScreenErrorSample", "sampleEditProfileViewState", "Lcom/whoop/profile/presentation/edit/EditProfileViewState;", "getSampleEditProfileViewState", "()Lcom/whoop/profile/presentation/edit/EditProfileViewState;", "sampleEditProfileViewStateWithNulls", "getSampleEditProfileViewStateWithNulls", "mockEditProfileResponse", "Lcom/whoop/profile/domain/edit/models/EditProfileResponse;", "getMockEditProfileResponse", "()Lcom/whoop/profile/domain/edit/models/EditProfileResponse;", "mockEditProfileResponseWithNullBaseline", "getMockEditProfileResponseWithNullBaseline", "sampleCountriesForTesting", "", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;", "getSampleCountriesForTesting", "()Ljava/util/List;", "sampleUsStates", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;", "getSampleUsStates", "sampleCanadianProvinces", "getSampleCanadianProvinces", "sampleAvatarStateLoading", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;", "getSampleAvatarStateLoading", "()Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;", "sampleAvatarStateSuccess", "getSampleAvatarStateSuccess", "sampleAvatarStateError", "getSampleAvatarStateError", "sampleAvatarStateIdle", "getSampleAvatarStateIdle", "sampleAvatarStateWithoutUrl", "getSampleAvatarStateWithoutUrl", "sampleEmailValidationStateIdle", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;", "getSampleEmailValidationStateIdle", "()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;", "sampleEmailValidationStateValidating", "getSampleEmailValidationStateValidating", "sampleEmailValidationStateSuccess", "getSampleEmailValidationStateSuccess", "sampleEmailValidationStateError", "getSampleEmailValidationStateError", "sampleEmailValidationStateNetworkError", "getSampleEmailValidationStateNetworkError", "editProfileViewStateWithAvatarLoading", "getEditProfileViewStateWithAvatarLoading", "editProfileViewStateWithAvatarSuccess", "getEditProfileViewStateWithAvatarSuccess", "editProfileViewStateWithAvatarError", "getEditProfileViewStateWithAvatarError", "editProfileViewStateWithEmailValidating", "getEditProfileViewStateWithEmailValidating", "editProfileViewStateWithEmailValidationSuccess", "getEditProfileViewStateWithEmailValidationSuccess", "editProfileViewStateWithEmailValidationError", "getEditProfileViewStateWithEmailValidationError", "editProfileViewStateWithEmailValidationNetworkError", "getEditProfileViewStateWithEmailValidationNetworkError", "sampleEmailValidationDomainStateIdle", "Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;", "getSampleEmailValidationDomainStateIdle", "()Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;", "sampleEmailValidationDomainStateValidating", "getSampleEmailValidationDomainStateValidating", "sampleEmailValidationDomainStateAvailable", "getSampleEmailValidationDomainStateAvailable", "sampleEmailValidationDomainStateNotAvailable", "getSampleEmailValidationDomainStateNotAvailable", "sampleEmailValidationDomainStateNetworkError", "getSampleEmailValidationDomainStateNetworkError", "sampleEditProfileDomainState", "Lcom/whoop/profile/domain/edit/EditProfileDomainState;", "getSampleEditProfileDomainState", "()Lcom/whoop/profile/domain/edit/EditProfileDomainState;", "sampleEditProfileFormState", "Lcom/whoop/profile/view/edit/form/EditProfileFormState;", "getSampleEditProfileFormState", "()Lcom/whoop/profile/view/edit/form/EditProfileFormState;", "sampleEditProfileFormStateImperial", "getSampleEditProfileFormStateImperial", "sampleCountryWithoutStates", "getSampleCountryWithoutStates", "()Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;", "sampleViewStateForBottomSheetTesting", "getSampleViewStateForBottomSheetTesting", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EditProfileSamples {
    public static final int $stable;
    public static final EditProfileSamples INSTANCE = new EditProfileSamples();
    private static final EditProfileViewState.FullScreenModal editProfileFullScreenErrorSample;
    private static final EditProfileViewState.FullScreenModal editProfileFullScreenLoadingSample;
    private static final EditProfileViewState.FullScreenModal editProfileFullScreenSavingSample;
    private static final EditProfileViewState.FullScreenModal editProfileFullScreenSuccessSample;
    private static final EditProfileViewState editProfileViewStateWithAvatarError;
    private static final EditProfileViewState editProfileViewStateWithAvatarLoading;
    private static final EditProfileViewState editProfileViewStateWithAvatarSuccess;
    private static final EditProfileViewState editProfileViewStateWithEmailValidating;
    private static final EditProfileViewState editProfileViewStateWithEmailValidationError;
    private static final EditProfileViewState editProfileViewStateWithEmailValidationNetworkError;
    private static final EditProfileViewState editProfileViewStateWithEmailValidationSuccess;
    private static final EditProfileResponse mockEditProfileResponse;
    private static final EditProfileResponse mockEditProfileResponseWithNullBaseline;
    private static final EditProfileViewState.AvatarViewState sampleAvatarStateError;
    private static final EditProfileViewState.AvatarViewState sampleAvatarStateIdle;
    private static final EditProfileViewState.AvatarViewState sampleAvatarStateLoading;
    private static final EditProfileViewState.AvatarViewState sampleAvatarStateSuccess;
    private static final EditProfileViewState.AvatarViewState sampleAvatarStateWithoutUrl;
    private static final List<EditProfileViewState.State> sampleCanadianProvinces;
    private static final List<EditProfileViewState.Country> sampleCountriesForTesting;
    private static final EditProfileViewState.Country sampleCountryWithoutStates;
    private static final EditProfileDomainState sampleEditProfileDomainState;
    private static final EditProfileFormState sampleEditProfileFormState;
    private static final EditProfileFormState sampleEditProfileFormStateImperial;
    private static final EditProfileViewState sampleEditProfileViewState;
    private static final EditProfileViewState sampleEditProfileViewStateWithNulls;
    private static final EditProfileDomainState.EmailValidationDomainState sampleEmailValidationDomainStateAvailable;
    private static final EditProfileDomainState.EmailValidationDomainState sampleEmailValidationDomainStateIdle;
    private static final EditProfileDomainState.EmailValidationDomainState sampleEmailValidationDomainStateNetworkError;
    private static final EditProfileDomainState.EmailValidationDomainState sampleEmailValidationDomainStateNotAvailable;
    private static final EditProfileDomainState.EmailValidationDomainState sampleEmailValidationDomainStateValidating;
    private static final EditProfileViewState.EmailValidationViewState sampleEmailValidationStateError;
    private static final EditProfileViewState.EmailValidationViewState sampleEmailValidationStateIdle;
    private static final EditProfileViewState.EmailValidationViewState sampleEmailValidationStateNetworkError;
    private static final EditProfileViewState.EmailValidationViewState sampleEmailValidationStateSuccess;
    private static final EditProfileViewState.EmailValidationViewState sampleEmailValidationStateValidating;
    private static final List<EditProfileViewState.State> sampleUsStates;
    private static final EditProfileViewState sampleViewStateForBottomSheetTesting;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object next;
        List<EditProfileViewState.State> states;
        Object next2;
        List<EditProfileViewState.State> states2;
        AbstractC33208p0.c cVar = AbstractC33208p0.c.f138471e;
        boolean z4 = false;
        boolean z13 = false;
        editProfileFullScreenLoadingSample = new EditProfileViewState.FullScreenModal(new C33211q0(null, cVar, AbstractC8693b.m21278l("Loading your profile..."), null, null, false, z4, null, false, z13, MessageListItemViewType.START_OF_THE_CHANNEL, null), 0 == true ? 1 : 0, null, null, 14, 0 == true ? 1 : 0);
        boolean z14 = false;
        editProfileFullScreenSavingSample = new EditProfileViewState.FullScreenModal(new C33211q0(0 == true ? 1 : 0, cVar, AbstractC8693b.m21278l("Saving your profile..."), 0 == true ? 1 : 0, null, z4, false, null, z13, z14, MessageListItemViewType.START_OF_THE_CHANNEL, null), 0 == true ? 1 : 0, null, null, 14, 0 == true ? 1 : 0);
        boolean z15 = false;
        editProfileFullScreenSuccessSample = new EditProfileViewState.FullScreenModal(new C33211q0(null, new AbstractC33208p0.h(AbstractC8693b.m21278l("Profile Updated!"), 0L, new C34260e(8), 2, 0 == true ? 1 : 0), AbstractC8693b.m21278l("Your profile has been successfully updated."), null, null, false, false, null, z14, z15, MessageListItemViewType.START_OF_THE_CHANNEL, null), 0 == true ? 1 : 0, null, null, 14, 0 == true ? 1 : 0);
        Object[] objArr = 0 == true ? 1 : 0;
        editProfileFullScreenErrorSample = new EditProfileViewState.FullScreenModal(new C33211q0(null, new AbstractC33208p0.b(AbstractC8693b.m21278l("Error Saving Profile"), false, objArr, 6, null), AbstractC8693b.m21278l("There was an error saving your profile. Please try again."), 0 == true ? 1 : 0, null, false, false, null, z15, false, MessageListItemViewType.START_OF_THE_CHANNEL, null), 0 == true ? 1 : 0, null, null, 14, 0 == true ? 1 : 0);
        TextResource textResourceM21278l = AbstractC8693b.m21278l("EDIT PROFILE");
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("Kimberly");
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l("Taylor");
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l("kimberlytaylor");
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l("kimberlytaylor@gmail.com");
        TextResource textResourceM21278l6 = AbstractC8693b.m21278l("Boston");
        TextResource textResourceM21278l7 = AbstractC8693b.m21278l("United States");
        TextResource textResourceM21278l8 = AbstractC8693b.m21278l("Massachusetts");
        TextResource textResourceM21278l9 = AbstractC8693b.m21278l("1995-11-10");
        UnitSystem unitSystem = UnitSystem.METRIC;
        TextResource textResourceM21278l10 = AbstractC8693b.m21278l("FEMALE");
        TextResource textResourceM21278l11 = AbstractC8693b.m21278l("FEMALE");
        EditProfileViewState.ValidationRanges validationRanges = new EditProfileViewState.ValidationRanges(3, 7, 0.91f, 2.13f, 50, 400, 10, 500);
        EditProfileViewState.Country country = new EditProfileViewState.Country(AbstractC8693b.m21278l("United States"), "US", "🇺🇸", "2007-05-22T16:31:01.259Z", AbstractC37056f.m118959K(new EditProfileViewState.State(AbstractC8693b.m21278l("Alabama"), "AL"), new EditProfileViewState.State(AbstractC8693b.m21278l("Alaska"), "AK"), new EditProfileViewState.State(AbstractC8693b.m21278l("Arizona"), "AZ"), new EditProfileViewState.State(AbstractC8693b.m21278l("Arkansas"), "AR"), new EditProfileViewState.State(AbstractC8693b.m21278l("California"), "CA"), new EditProfileViewState.State(AbstractC8693b.m21278l("Colorado"), "CO"), new EditProfileViewState.State(AbstractC8693b.m21278l("Connecticut"), "CT"), new EditProfileViewState.State(AbstractC8693b.m21278l("Delaware"), "DE"), new EditProfileViewState.State(AbstractC8693b.m21278l("Florida"), "FL"), new EditProfileViewState.State(AbstractC8693b.m21278l("Georgia"), "GA"), new EditProfileViewState.State(AbstractC8693b.m21278l("Massachusetts"), "MA"), new EditProfileViewState.State(AbstractC8693b.m21278l("New York"), "NY"), new EditProfileViewState.State(AbstractC8693b.m21278l("Texas"), "TX")));
        EditProfileViewState.Country country2 = new EditProfileViewState.Country(AbstractC8693b.m21278l("Canada"), "CA", "🇨🇦", "2007-05-22T16:31:01.259Z", AbstractC37056f.m118959K(new EditProfileViewState.State(AbstractC8693b.m21278l("Alberta"), "AB"), new EditProfileViewState.State(AbstractC8693b.m21278l("British Columbia"), "BC"), new EditProfileViewState.State(AbstractC8693b.m21278l("Manitoba"), "MB"), new EditProfileViewState.State(AbstractC8693b.m21278l("New Brunswick"), "NB"), new EditProfileViewState.State(AbstractC8693b.m21278l("Newfoundland and Labrador"), "NL"), new EditProfileViewState.State(AbstractC8693b.m21278l("Northwest Territories"), "NT"), new EditProfileViewState.State(AbstractC8693b.m21278l("Nova Scotia"), "NS"), new EditProfileViewState.State(AbstractC8693b.m21278l("Ontario"), "ON"), new EditProfileViewState.State(AbstractC8693b.m21278l("Quebec"), "QC")));
        TextResource textResourceM21278l12 = AbstractC8693b.m21278l("United Kingdom");
        C25271y c25271y = C25271y.f99162w;
        sampleEditProfileViewState = new EditProfileViewState(null, null, new EditProfileViewState.EditProfileData(textResourceM21278l, "https://s3-us-west-2.amazonaws.com/avatars.whoop.com/uploads/uploads/user/22642350-22642399/22642393_3a9d5baf-6487-4b88-9880-2a02980b4307.jpeg", textResourceM21278l2, textResourceM21278l3, textResourceM21278l4, textResourceM21278l5, textResourceM21278l6, textResourceM21278l7, textResourceM21278l8, 1.738167392233E9d, 29, false, 22642393L, 1.85f, 108.86d, textResourceM21278l9, unitSystem, textResourceM21278l10, textResourceM21278l11, validationRanges, AbstractC37056f.m118959K(country, country2, new EditProfileViewState.Country(textResourceM21278l12, "GB", "🇬🇧", "2007-05-22T16:31:01.259Z", c25271y), new EditProfileViewState.Country(AbstractC8693b.m21278l("Australia"), "AU", "🇦🇺", "2007-05-22T16:31:01.259Z", c25271y))), null, null, null, null, true, false, 379, null);
        sampleEditProfileViewStateWithNulls = new EditProfileViewState(0 == true ? 1 : 0, null, new EditProfileViewState.EditProfileData(AbstractC8693b.m21278l("EDIT PROFILE"), null, AbstractC8693b.m21278l("John"), AbstractC8693b.m21278l("Doe"), AbstractC8693b.m21278l(""), null, null, AbstractC8693b.m21278l("United States"), null, 1.6409952E9d, 30, true, 12345L, 0.0f, 0.0d, AbstractC8693b.m21278l(""), unitSystem, AbstractC8693b.m21278l("MALE"), AbstractC8693b.m21278l("MALE"), new EditProfileViewState.ValidationRanges(3, 7, 0.91f, 2.13f, 50, 400, 10, 500), c25271y), null, null, null, null, false, false, 379, null);
        EditProfileResponse editProfileResponse = new EditProfileResponse("EDIT PROFILE", "https://example.com/avatar.jpg", "John", "Doe", "johndoe", "john.doe@example.com", "Boston", "United States", "Massachusetts", 1.6409952E9d, 30, Boolean.FALSE, 12345, 1.75f, 70.0f, "1993-01-01", "metric", 3, 7, Float.valueOf(0.91f), Float.valueOf(2.13f), 50, 400, 10, 500, Gender.MALE, PhysiologicalBaseline.MALE, AbstractC37056f.m118958J(new CountryOption("United States", "US", "https://example.com/flags/us.png", "2007-05-22T16:31:01.259Z", AbstractC37056f.m118959K(new StateOption("CALIFORNIA", ""), new StateOption("NEW YORK", ""), new StateOption("TEXAS", "")))), (List) null, 268435456, (DefaultConstructorMarker) null);
        mockEditProfileResponse = editProfileResponse;
        mockEditProfileResponseWithNullBaseline = EditProfileResponse.copy$default(editProfileResponse, null, null, null, null, null, null, null, null, null, 0.0d, 0, null, 0, 0.0f, 0.0f, null, null, 0, 0, null, null, 0, 0, 0, 0, null, null, null, null, 469762047, null);
        List<EditProfileViewState.Country> listM118959K = AbstractC37056f.m118959K(new EditProfileViewState.Country(AbstractC8693b.m21278l("United States"), "US", "🇺🇸", "2007-05-22T16:31:01.259Z", AbstractC37056f.m118959K(new EditProfileViewState.State(AbstractC8693b.m21278l("Alabama"), "AL"), new EditProfileViewState.State(AbstractC8693b.m21278l("Alaska"), "AK"), new EditProfileViewState.State(AbstractC8693b.m21278l("Arizona"), "AZ"), new EditProfileViewState.State(AbstractC8693b.m21278l("Arkansas"), "AR"), new EditProfileViewState.State(AbstractC8693b.m21278l("California"), "CA"), new EditProfileViewState.State(AbstractC8693b.m21278l("Colorado"), "CO"), new EditProfileViewState.State(AbstractC8693b.m21278l("Connecticut"), "CT"), new EditProfileViewState.State(AbstractC8693b.m21278l("Delaware"), "DE"), new EditProfileViewState.State(AbstractC8693b.m21278l("Florida"), "FL"), new EditProfileViewState.State(AbstractC8693b.m21278l("Georgia"), "GA"), new EditProfileViewState.State(AbstractC8693b.m21278l("Massachusetts"), "MA"), new EditProfileViewState.State(AbstractC8693b.m21278l("New York"), "NY"), new EditProfileViewState.State(AbstractC8693b.m21278l("Texas"), "TX"))), new EditProfileViewState.Country(AbstractC8693b.m21278l("Canada"), "CA", "🇨🇦", "2007-05-22T16:31:01.259Z", AbstractC37056f.m118959K(new EditProfileViewState.State(AbstractC8693b.m21278l("Alberta"), "AB"), new EditProfileViewState.State(AbstractC8693b.m21278l("British Columbia"), "BC"), new EditProfileViewState.State(AbstractC8693b.m21278l("Manitoba"), "MB"), new EditProfileViewState.State(AbstractC8693b.m21278l("New Brunswick"), "NB"), new EditProfileViewState.State(AbstractC8693b.m21278l("Newfoundland and Labrador"), "NL"), new EditProfileViewState.State(AbstractC8693b.m21278l("Northwest Territories"), "NT"), new EditProfileViewState.State(AbstractC8693b.m21278l("Nova Scotia"), "NS"), new EditProfileViewState.State(AbstractC8693b.m21278l("Ontario"), "ON"), new EditProfileViewState.State(AbstractC8693b.m21278l("Quebec"), "QC"))), new EditProfileViewState.Country(AbstractC8693b.m21278l("United Kingdom"), "GB", "🇬🇧", "2007-05-22T16:31:01.259Z", c25271y), new EditProfileViewState.Country(AbstractC8693b.m21278l("Australia"), "AU", "🇦🇺", "2007-05-22T16:31:01.259Z", c25271y), new EditProfileViewState.Country(AbstractC8693b.m21278l("Germany"), "DE", "🇩🇪", "2007-05-22T16:31:01.259Z", c25271y), new EditProfileViewState.Country(AbstractC8693b.m21278l("France"), "FR", "🇫🇷", "2007-05-22T16:31:01.259Z", c25271y), new EditProfileViewState.Country(AbstractC8693b.m21278l("Japan"), "JP", "🇯🇵", "2007-05-22T16:31:01.259Z", c25271y), new EditProfileViewState.Country(AbstractC8693b.m21278l("Brazil"), "BR", "🇧🇷", "2007-05-22T16:31:01.259Z", c25271y), new EditProfileViewState.Country(AbstractC8693b.m21278l("Mexico"), "MX", "🇲🇽", "2007-05-22T16:31:01.259Z", c25271y), new EditProfileViewState.Country(AbstractC8693b.m21278l("Afghanistan"), "AF", "🇦🇫", "2007-05-22T16:31:01.259Z", c25271y));
        sampleCountriesForTesting = listM118959K;
        Iterator<T> it = listM118959K.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((EditProfileViewState.Country) next).getCountryCode(), "US"));
        EditProfileViewState.Country country3 = (EditProfileViewState.Country) next;
        if (country3 == null || (states = country3.getStates()) == null) {
            states = c25271y;
        }
        sampleUsStates = states;
        Iterator<T> it3 = sampleCountriesForTesting.iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
        } while (!AbstractC22676k.m65745e(((EditProfileViewState.Country) next2).getCountryCode(), "CA"));
        EditProfileViewState.Country country4 = (EditProfileViewState.Country) next2;
        if (country4 == null || (states2 = country4.getStates()) == null) {
            states2 = c25271y;
        }
        sampleCanadianProvinces = states2;
        boolean z16 = false;
        boolean z17 = false;
        EditProfileViewState.AvatarViewState avatarViewState = new EditProfileViewState.AvatarViewState(true, z16, null, "https://example.com/avatar.jpg", false, null, false, true, z17, false, null, 1136, null);
        sampleAvatarStateLoading = avatarViewState;
        int i13 = 1136;
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z18 = false;
        Uri uri = null;
        boolean z19 = false;
        byte[] bArr = null;
        EditProfileViewState.AvatarViewState avatarViewState2 = new EditProfileViewState.AvatarViewState(z16, true, null, "https://example.com/new-avatar.jpg", z18, uri, z19, z17, true, false, bArr, i13, defaultConstructorMarker);
        sampleAvatarStateSuccess = avatarViewState2;
        boolean z24 = false;
        boolean z25 = false;
        EditProfileViewState.AvatarViewState avatarViewState3 = new EditProfileViewState.AvatarViewState(z16, z24, "Failed to upload avatar", "https://example.com/avatar.jpg", z18, uri, z19, z17, z25, true, bArr, i13, defaultConstructorMarker);
        sampleAvatarStateError = avatarViewState3;
        boolean z26 = false;
        sampleAvatarStateIdle = new EditProfileViewState.AvatarViewState(z16, z24, null, null, z18, uri, z19, z17, z25, z26, bArr, 2047, defaultConstructorMarker);
        boolean z27 = false;
        sampleAvatarStateWithoutUrl = new EditProfileViewState.AvatarViewState(z24, z27, 0 == true ? 1 : 0, null, false, null, z17, z25, z26, false, null, 1136, null);
        sampleEmailValidationStateIdle = new EditProfileViewState.EmailValidationViewState(z27, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 15, null);
        EditProfileViewState.EmailValidationViewState emailValidationViewState = new EditProfileViewState.EmailValidationViewState(true, null, null, "test@example.com");
        sampleEmailValidationStateValidating = emailValidationViewState;
        EditProfileViewState.EmailValidationViewState emailValidationViewState2 = new EditProfileViewState.EmailValidationViewState(false, Boolean.TRUE, null, "test@example.com");
        sampleEmailValidationStateSuccess = emailValidationViewState2;
        Boolean bool = Boolean.FALSE;
        EditProfileViewState.EmailValidationViewState emailValidationViewState3 = new EditProfileViewState.EmailValidationViewState(false, bool, AbstractC8693b.m21277k(C9691R.string.profile_edit_email_cannot_be_used), "test@example.com");
        sampleEmailValidationStateError = emailValidationViewState3;
        EditProfileViewState.EmailValidationViewState emailValidationViewState4 = new EditProfileViewState.EmailValidationViewState(false, bool, AbstractC8693b.m21277k(C9691R.string.profile_edit_email_validation_network_error), "test@example.com");
        sampleEmailValidationStateNetworkError = emailValidationViewState4;
        EditProfileViewState editProfileViewState = sampleEditProfileViewState;
        editProfileViewStateWithAvatarLoading = EditProfileViewState.copy$default(editProfileViewState, null, null, null, null, avatarViewState, null, null, false, false, 495, null);
        editProfileViewStateWithAvatarSuccess = EditProfileViewState.copy$default(editProfileViewState, null, null, null, null, avatarViewState2, null, null, false, false, 495, null);
        editProfileViewStateWithAvatarError = EditProfileViewState.copy$default(editProfileViewState, null, null, null, null, avatarViewState3, null, null, false, false, 495, null);
        editProfileViewStateWithEmailValidating = EditProfileViewState.copy$default(editProfileViewState, null, null, null, null, null, emailValidationViewState, null, false, false, 479, null);
        editProfileViewStateWithEmailValidationSuccess = EditProfileViewState.copy$default(editProfileViewState, null, null, null, null, null, emailValidationViewState2, null, false, false, 479, null);
        editProfileViewStateWithEmailValidationError = EditProfileViewState.copy$default(editProfileViewState, null, null, null, null, null, emailValidationViewState3, null, false, false, 479, null);
        editProfileViewStateWithEmailValidationNetworkError = EditProfileViewState.copy$default(editProfileViewState, null, null, null, null, null, emailValidationViewState4, null, false, false, 479, null);
        sampleEmailValidationDomainStateIdle = new EditProfileDomainState.EmailValidationDomainState(false, null, null, 7, null);
        sampleEmailValidationDomainStateValidating = new EditProfileDomainState.EmailValidationDomainState(true, null, "test@example.com");
        sampleEmailValidationDomainStateAvailable = new EditProfileDomainState.EmailValidationDomainState(false, EditProfileDomainState.EmailValidationResult.Available.INSTANCE, "test@example.com");
        sampleEmailValidationDomainStateNotAvailable = new EditProfileDomainState.EmailValidationDomainState(false, EditProfileDomainState.EmailValidationResult.NotAvailable.INSTANCE, "test@example.com");
        sampleEmailValidationDomainStateNetworkError = new EditProfileDomainState.EmailValidationDomainState(false, EditProfileDomainState.EmailValidationResult.NetworkError.INSTANCE, "test@example.com");
        sampleEditProfileDomainState = new EditProfileDomainState(mockEditProfileResponse, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, null, 30, null);
        boolean z28 = false;
        boolean z29 = false;
        boolean z34 = false;
        boolean z35 = false;
        boolean z36 = false;
        boolean z37 = false;
        boolean z38 = false;
        boolean z39 = false;
        boolean z44 = false;
        boolean z45 = false;
        boolean z46 = false;
        boolean z47 = false;
        boolean z48 = false;
        boolean z49 = false;
        EditProfileFormState editProfileFormState = new EditProfileFormState(new FieldState("test@example.com", 0 == true ? 1 : 0, false, z28, z29, z34, 62, null), new FieldState("testuser", null, z28, z29, z34, z35, 62, null), new FieldState("Test", null, z29, z34, z35, z36, 62, null), new FieldState("User", null, z34, z35, z36, z37, 62, null), new FieldState("175", null, z35, z36, z37, z38, 62, null), new FieldState("70", null, z36, z37, z38, z39, 62, null), new FieldState("metric", null, z37, z38, z39, z44, 62, null), new FieldState("MALE", null, z38, z39, z44, z45, 62, null), new FieldState("MALE", null, z39, z44, z45, z46, 62, null), new FieldState("US", null, z44, z45, z46, z47, 62, null), new FieldState("CA", null, z45, z46, z47, z48, 62, null), new FieldState("1990-01-01", null, z46, z47, z48, z49, 62, null), new FieldState("Boston", null, z47, z48, z49, false, 62, null));
        sampleEditProfileFormState = editProfileFormState;
        boolean z52 = false;
        boolean z54 = false;
        boolean z55 = false;
        boolean z56 = false;
        sampleEditProfileFormStateImperial = EditProfileFormState.copy$default(editProfileFormState, null, null, null, null, new FieldState("5'9\"", null, z52, z54, z55, z56, 62, null), new FieldState("154", null, z54, z55, z56, false, 62, null), new FieldState("imperial", null, false, z52, z54, z55, 62, null), null, null, null, null, null, null, 8079, null);
        sampleCountryWithoutStates = new EditProfileViewState.Country(AbstractC8693b.m21278l("United Kingdom"), "GB", "🇬🇧", "2007-05-22T16:31:01.259Z", c25271y);
        EditProfileViewState.EditProfileData profileData = editProfileViewState.getProfileData();
        sampleViewStateForBottomSheetTesting = EditProfileViewState.copy$default(editProfileViewState, null, null, profileData != null ? EditProfileViewState.EditProfileData.copy$default(profileData, null, null, null, null, null, null, null, null, null, 0.0d, 0, false, 0L, 0.0f, 0.0d, null, null, null, null, null, sampleCountriesForTesting, 1048575, null) : null, null, null, null, null, false, false, 507, null);
        $stable = 8;
    }

    private EditProfileSamples() {
    }

    public final EditProfileViewState.FullScreenModal getEditProfileFullScreenErrorSample() {
        return editProfileFullScreenErrorSample;
    }

    public final EditProfileViewState.FullScreenModal getEditProfileFullScreenLoadingSample() {
        return editProfileFullScreenLoadingSample;
    }

    public final EditProfileViewState.FullScreenModal getEditProfileFullScreenSavingSample() {
        return editProfileFullScreenSavingSample;
    }

    public final EditProfileViewState.FullScreenModal getEditProfileFullScreenSuccessSample() {
        return editProfileFullScreenSuccessSample;
    }

    public final EditProfileViewState getEditProfileViewStateWithAvatarError() {
        return editProfileViewStateWithAvatarError;
    }

    public final EditProfileViewState getEditProfileViewStateWithAvatarLoading() {
        return editProfileViewStateWithAvatarLoading;
    }

    public final EditProfileViewState getEditProfileViewStateWithAvatarSuccess() {
        return editProfileViewStateWithAvatarSuccess;
    }

    public final EditProfileViewState getEditProfileViewStateWithEmailValidating() {
        return editProfileViewStateWithEmailValidating;
    }

    public final EditProfileViewState getEditProfileViewStateWithEmailValidationError() {
        return editProfileViewStateWithEmailValidationError;
    }

    public final EditProfileViewState getEditProfileViewStateWithEmailValidationNetworkError() {
        return editProfileViewStateWithEmailValidationNetworkError;
    }

    public final EditProfileViewState getEditProfileViewStateWithEmailValidationSuccess() {
        return editProfileViewStateWithEmailValidationSuccess;
    }

    public final EditProfileResponse getMockEditProfileResponse() {
        return mockEditProfileResponse;
    }

    public final EditProfileResponse getMockEditProfileResponseWithNullBaseline() {
        return mockEditProfileResponseWithNullBaseline;
    }

    public final EditProfileViewState.AvatarViewState getSampleAvatarStateError() {
        return sampleAvatarStateError;
    }

    public final EditProfileViewState.AvatarViewState getSampleAvatarStateIdle() {
        return sampleAvatarStateIdle;
    }

    public final EditProfileViewState.AvatarViewState getSampleAvatarStateLoading() {
        return sampleAvatarStateLoading;
    }

    public final EditProfileViewState.AvatarViewState getSampleAvatarStateSuccess() {
        return sampleAvatarStateSuccess;
    }

    public final EditProfileViewState.AvatarViewState getSampleAvatarStateWithoutUrl() {
        return sampleAvatarStateWithoutUrl;
    }

    public final List<EditProfileViewState.State> getSampleCanadianProvinces() {
        return sampleCanadianProvinces;
    }

    public final List<EditProfileViewState.Country> getSampleCountriesForTesting() {
        return sampleCountriesForTesting;
    }

    public final EditProfileViewState.Country getSampleCountryWithoutStates() {
        return sampleCountryWithoutStates;
    }

    public final EditProfileDomainState getSampleEditProfileDomainState() {
        return sampleEditProfileDomainState;
    }

    public final EditProfileFormState getSampleEditProfileFormState() {
        return sampleEditProfileFormState;
    }

    public final EditProfileFormState getSampleEditProfileFormStateImperial() {
        return sampleEditProfileFormStateImperial;
    }

    public final EditProfileViewState getSampleEditProfileViewState() {
        return sampleEditProfileViewState;
    }

    public final EditProfileViewState getSampleEditProfileViewStateWithNulls() {
        return sampleEditProfileViewStateWithNulls;
    }

    public final EditProfileDomainState.EmailValidationDomainState getSampleEmailValidationDomainStateAvailable() {
        return sampleEmailValidationDomainStateAvailable;
    }

    public final EditProfileDomainState.EmailValidationDomainState getSampleEmailValidationDomainStateIdle() {
        return sampleEmailValidationDomainStateIdle;
    }

    public final EditProfileDomainState.EmailValidationDomainState getSampleEmailValidationDomainStateNetworkError() {
        return sampleEmailValidationDomainStateNetworkError;
    }

    public final EditProfileDomainState.EmailValidationDomainState getSampleEmailValidationDomainStateNotAvailable() {
        return sampleEmailValidationDomainStateNotAvailable;
    }

    public final EditProfileDomainState.EmailValidationDomainState getSampleEmailValidationDomainStateValidating() {
        return sampleEmailValidationDomainStateValidating;
    }

    public final EditProfileViewState.EmailValidationViewState getSampleEmailValidationStateError() {
        return sampleEmailValidationStateError;
    }

    public final EditProfileViewState.EmailValidationViewState getSampleEmailValidationStateIdle() {
        return sampleEmailValidationStateIdle;
    }

    public final EditProfileViewState.EmailValidationViewState getSampleEmailValidationStateNetworkError() {
        return sampleEmailValidationStateNetworkError;
    }

    public final EditProfileViewState.EmailValidationViewState getSampleEmailValidationStateSuccess() {
        return sampleEmailValidationStateSuccess;
    }

    public final EditProfileViewState.EmailValidationViewState getSampleEmailValidationStateValidating() {
        return sampleEmailValidationStateValidating;
    }

    public final List<EditProfileViewState.State> getSampleUsStates() {
        return sampleUsStates;
    }

    public final EditProfileViewState getSampleViewStateForBottomSheetTesting() {
        return sampleViewStateForBottomSheetTesting;
    }
}
