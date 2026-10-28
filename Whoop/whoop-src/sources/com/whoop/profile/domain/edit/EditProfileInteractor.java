package com.whoop.profile.domain.edit;

import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import androidx.recyclerview.widget.AbstractC1707m0;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import com.whoop.profile.domain.edit.models.EditProfileResponse;
import com.whoop.profile.domain.edit.models.UpdateProfileRequest;
import com.whoop.profile.domain.edit.models.UsernameCheckV2ResponseBody;
import com.whoop.profile.domain.models.Gender;
import com.whoop.profile.domain.models.PhysiologicalBaseline;
import com.whoop.profile.view.edit.form.EditProfileFormState;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import f63.AbstractC14155c;
import ge3.AbstractC15751g;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.util.Arrays;
import java.util.Locale;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import od1.InterfaceC27844g;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pd1.C29104a;
import pr2.InterfaceC29494b;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.C34387c;
import u02.InterfaceC34385a;
import w02.C36684a;
import w53.C36845b;
import wc3.InterfaceC37138c;
import y00.AbstractC38963t7;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u000245B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\"\u001a\u00020\u001eH\u0002¢\u0006\u0004\b#\u0010!J\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J!\u0010*\u001a\u00020\u00142\u0006\u0010)\u001a\u00020(2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b*\u0010+J#\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00101R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00102R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00103¨\u00066"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileInteractor;", "Lod1/g;", "Lcom/whoop/profile/domain/edit/EditProfileDomainAction;", "Lcom/whoop/profile/domain/edit/EditProfileDomainState;", "Lu02/c;", "apiClient", "Ltr2/n;", "logger", "Lpr2/b;", "avatarService", "Lpd1/a;", "bootstrapUserSignIn", "Lw02/a;", "errorBodyParser", "<init>", "(Lu02/c;Ltr2/n;Lpr2/b;Lpd1/a;Lw02/a;)V", "Lec3/l;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;", "deleteCurrentUserAvatarFlow", "()Lec3/l;", "Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;", "updateRequest", "Lcom/whoop/profile/domain/edit/models/EditProfileResponse;", "currentResponse", "handleSave", "(Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;)Lec3/l;", "", "imageData", "uploadAvatar", "([B)Lec3/l;", "", NotificationCompat.CATEGORY_EMAIL, "validateEmailField", "(Ljava/lang/String;)Lec3/l;", "username", "validateUsernameField", "", "preserveFormState", "handleRefresh", "(Z)Lec3/l;", "Lcom/whoop/profile/view/edit/form/EditProfileFormState;", "formState", "createUpdateRequestFromFormState", "(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;)Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "Lu02/c;", "Ltr2/n;", "Lpr2/b;", "Lpd1/a;", "Lw02/a;", "InternalState", "StateUpdate", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EditProfileInteractor implements InterfaceC27844g<EditProfileDomainAction, EditProfileDomainState> {
    public static final int $stable = 8;
    private final C34387c apiClient;
    private final InterfaceC29494b avatarService;
    private final C29104a bootstrapUserSignIn;
    private final C36684a errorBodyParser;
    private final InterfaceC34116n logger;

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001BÛ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u00108\u001a\u00020\tJ\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\t\u0010F\u001a\u00020\u0005HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010I\u001a\u00020\u0005HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u000bHÆ\u0003JÝ\u0001\u0010L\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0014\u0010M\u001a\u00020\u00052\b\u0010N\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010O\u001a\u00020PHÖ\u0081\u0004J\n\u0010Q\u001a\u00020\u000bHÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010!R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010!R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010&R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010!R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b3\u0010&R\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010!R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b7\u0010&¨\u0006R"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;", "", "response", "Lcom/whoop/profile/domain/edit/models/EditProfileResponse;", "isLoading", "", "isSaving", "saveSuccess", "error", "Lcom/whoop/profile/domain/edit/EditProfileDomainState;", "saveError", "", "pendingSaveRequest", "Lcom/whoop/profile/view/edit/form/EditProfileFormState;", "lastFailedFormState", "avatarUploading", "avatarUploadSuccess", "avatarUploadError", "pendingRetryData", "", "avatarRefreshNeeded", "emailValidating", "emailValidationResult", "Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;", "lastValidatedEmail", "usernameValidating", "usernameValidationResult", "Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;", "lastValidatedUsername", "<init>", "(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;ZZZLcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/lang/String;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZZLjava/lang/String;[BZZLcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;Ljava/lang/String;ZLcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;Ljava/lang/String;)V", "getResponse", "()Lcom/whoop/profile/domain/edit/models/EditProfileResponse;", "()Z", "getSaveSuccess", "getError", "()Lcom/whoop/profile/domain/edit/EditProfileDomainState;", "getSaveError", "()Ljava/lang/String;", "getPendingSaveRequest", "()Lcom/whoop/profile/view/edit/form/EditProfileFormState;", "getLastFailedFormState", "getAvatarUploading", "getAvatarUploadSuccess", "getAvatarUploadError", "getPendingRetryData", "()[B", "getAvatarRefreshNeeded", "getEmailValidating", "getEmailValidationResult", "()Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;", "getLastValidatedEmail", "getUsernameValidating", "getUsernameValidationResult", "()Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;", "getLastValidatedUsername", "toDomainState", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "equals", "other", "hashCode", "", "toString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class InternalState {
        private final boolean avatarRefreshNeeded;
        private final String avatarUploadError;
        private final boolean avatarUploadSuccess;
        private final boolean avatarUploading;
        private final boolean emailValidating;
        private final EditProfileDomainState.EmailValidationResult emailValidationResult;
        private final EditProfileDomainState error;
        private final boolean isLoading;
        private final boolean isSaving;
        private final EditProfileFormState lastFailedFormState;
        private final String lastValidatedEmail;
        private final String lastValidatedUsername;
        private final byte[] pendingRetryData;
        private final EditProfileFormState pendingSaveRequest;
        private final EditProfileResponse response;
        private final String saveError;
        private final boolean saveSuccess;
        private final boolean usernameValidating;
        private final EditProfileDomainState.UsernameValidationResult usernameValidationResult;

        public InternalState() {
            this(null, false, false, false, null, null, null, null, false, false, null, null, false, false, null, null, false, null, null, 524287, null);
        }

        public static /* synthetic */ InternalState copy$default(InternalState internalState, EditProfileResponse editProfileResponse, boolean z4, boolean z13, boolean z14, EditProfileDomainState editProfileDomainState, String str, EditProfileFormState editProfileFormState, EditProfileFormState editProfileFormState2, boolean z15, boolean z16, String str2, byte[] bArr, boolean z17, boolean z18, EditProfileDomainState.EmailValidationResult emailValidationResult, String str3, boolean z19, EditProfileDomainState.UsernameValidationResult usernameValidationResult, String str4, int i13, Object obj) {
            String str5;
            EditProfileDomainState.UsernameValidationResult usernameValidationResult2;
            EditProfileResponse editProfileResponse2 = (i13 & 1) != 0 ? internalState.response : editProfileResponse;
            boolean z24 = (i13 & 2) != 0 ? internalState.isLoading : z4;
            boolean z25 = (i13 & 4) != 0 ? internalState.isSaving : z13;
            boolean z26 = (i13 & 8) != 0 ? internalState.saveSuccess : z14;
            EditProfileDomainState editProfileDomainState2 = (i13 & 16) != 0 ? internalState.error : editProfileDomainState;
            String str6 = (i13 & 32) != 0 ? internalState.saveError : str;
            EditProfileFormState editProfileFormState3 = (i13 & 64) != 0 ? internalState.pendingSaveRequest : editProfileFormState;
            EditProfileFormState editProfileFormState4 = (i13 & 128) != 0 ? internalState.lastFailedFormState : editProfileFormState2;
            boolean z27 = (i13 & 256) != 0 ? internalState.avatarUploading : z15;
            boolean z28 = (i13 & 512) != 0 ? internalState.avatarUploadSuccess : z16;
            String str7 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? internalState.avatarUploadError : str2;
            byte[] bArr2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? internalState.pendingRetryData : bArr;
            boolean z29 = (i13 & 4096) != 0 ? internalState.avatarRefreshNeeded : z17;
            boolean z34 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? internalState.emailValidating : z18;
            EditProfileResponse editProfileResponse3 = editProfileResponse2;
            EditProfileDomainState.EmailValidationResult emailValidationResult2 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? internalState.emailValidationResult : emailValidationResult;
            String str8 = (i13 & 32768) != 0 ? internalState.lastValidatedEmail : str3;
            boolean z35 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? internalState.usernameValidating : z19;
            EditProfileDomainState.UsernameValidationResult usernameValidationResult3 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? internalState.usernameValidationResult : usernameValidationResult;
            if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                usernameValidationResult2 = usernameValidationResult3;
                str5 = internalState.lastValidatedUsername;
            } else {
                str5 = str4;
                usernameValidationResult2 = usernameValidationResult3;
            }
            return internalState.copy(editProfileResponse3, z24, z25, z26, editProfileDomainState2, str6, editProfileFormState3, editProfileFormState4, z27, z28, str7, bArr2, z29, z34, emailValidationResult2, str8, z35, usernameValidationResult2, str5);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final EditProfileResponse getResponse() {
            return this.response;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final boolean getAvatarUploadSuccess() {
            return this.avatarUploadSuccess;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getAvatarUploadError() {
            return this.avatarUploadError;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final byte[] getPendingRetryData() {
            return this.pendingRetryData;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final boolean getAvatarRefreshNeeded() {
            return this.avatarRefreshNeeded;
        }

        /* JADX INFO: renamed from: component14, reason: from getter */
        public final boolean getEmailValidating() {
            return this.emailValidating;
        }

        /* JADX INFO: renamed from: component15, reason: from getter */
        public final EditProfileDomainState.EmailValidationResult getEmailValidationResult() {
            return this.emailValidationResult;
        }

        /* JADX INFO: renamed from: component16, reason: from getter */
        public final String getLastValidatedEmail() {
            return this.lastValidatedEmail;
        }

        /* JADX INFO: renamed from: component17, reason: from getter */
        public final boolean getUsernameValidating() {
            return this.usernameValidating;
        }

        /* JADX INFO: renamed from: component18, reason: from getter */
        public final EditProfileDomainState.UsernameValidationResult getUsernameValidationResult() {
            return this.usernameValidationResult;
        }

        /* JADX INFO: renamed from: component19, reason: from getter */
        public final String getLastValidatedUsername() {
            return this.lastValidatedUsername;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsSaving() {
            return this.isSaving;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getSaveSuccess() {
            return this.saveSuccess;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final EditProfileDomainState getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getSaveError() {
            return this.saveError;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final EditProfileFormState getPendingSaveRequest() {
            return this.pendingSaveRequest;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final EditProfileFormState getLastFailedFormState() {
            return this.lastFailedFormState;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final boolean getAvatarUploading() {
            return this.avatarUploading;
        }

        public final InternalState copy(EditProfileResponse response, boolean isLoading, boolean isSaving, boolean saveSuccess, EditProfileDomainState error, String saveError, EditProfileFormState pendingSaveRequest, EditProfileFormState lastFailedFormState, boolean avatarUploading, boolean avatarUploadSuccess, String avatarUploadError, byte[] pendingRetryData, boolean avatarRefreshNeeded, boolean emailValidating, EditProfileDomainState.EmailValidationResult emailValidationResult, String lastValidatedEmail, boolean usernameValidating, EditProfileDomainState.UsernameValidationResult usernameValidationResult, String lastValidatedUsername) {
            return new InternalState(response, isLoading, isSaving, saveSuccess, error, saveError, pendingSaveRequest, lastFailedFormState, avatarUploading, avatarUploadSuccess, avatarUploadError, pendingRetryData, avatarRefreshNeeded, emailValidating, emailValidationResult, lastValidatedEmail, usernameValidating, usernameValidationResult, lastValidatedUsername);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InternalState)) {
                return false;
            }
            InternalState internalState = (InternalState) other;
            return AbstractC22676k.m65745e(this.response, internalState.response) && this.isLoading == internalState.isLoading && this.isSaving == internalState.isSaving && this.saveSuccess == internalState.saveSuccess && AbstractC22676k.m65745e(this.error, internalState.error) && AbstractC22676k.m65745e(this.saveError, internalState.saveError) && AbstractC22676k.m65745e(this.pendingSaveRequest, internalState.pendingSaveRequest) && AbstractC22676k.m65745e(this.lastFailedFormState, internalState.lastFailedFormState) && this.avatarUploading == internalState.avatarUploading && this.avatarUploadSuccess == internalState.avatarUploadSuccess && AbstractC22676k.m65745e(this.avatarUploadError, internalState.avatarUploadError) && AbstractC22676k.m65745e(this.pendingRetryData, internalState.pendingRetryData) && this.avatarRefreshNeeded == internalState.avatarRefreshNeeded && this.emailValidating == internalState.emailValidating && AbstractC22676k.m65745e(this.emailValidationResult, internalState.emailValidationResult) && AbstractC22676k.m65745e(this.lastValidatedEmail, internalState.lastValidatedEmail) && this.usernameValidating == internalState.usernameValidating && AbstractC22676k.m65745e(this.usernameValidationResult, internalState.usernameValidationResult) && AbstractC22676k.m65745e(this.lastValidatedUsername, internalState.lastValidatedUsername);
        }

        public final boolean getAvatarRefreshNeeded() {
            return this.avatarRefreshNeeded;
        }

        public final String getAvatarUploadError() {
            return this.avatarUploadError;
        }

        public final boolean getAvatarUploadSuccess() {
            return this.avatarUploadSuccess;
        }

        public final boolean getAvatarUploading() {
            return this.avatarUploading;
        }

        public final boolean getEmailValidating() {
            return this.emailValidating;
        }

        public final EditProfileDomainState.EmailValidationResult getEmailValidationResult() {
            return this.emailValidationResult;
        }

        public final EditProfileDomainState getError() {
            return this.error;
        }

        public final EditProfileFormState getLastFailedFormState() {
            return this.lastFailedFormState;
        }

        public final String getLastValidatedEmail() {
            return this.lastValidatedEmail;
        }

        public final String getLastValidatedUsername() {
            return this.lastValidatedUsername;
        }

        public final byte[] getPendingRetryData() {
            return this.pendingRetryData;
        }

        public final EditProfileFormState getPendingSaveRequest() {
            return this.pendingSaveRequest;
        }

        public final EditProfileResponse getResponse() {
            return this.response;
        }

        public final String getSaveError() {
            return this.saveError;
        }

        public final boolean getSaveSuccess() {
            return this.saveSuccess;
        }

        public final boolean getUsernameValidating() {
            return this.usernameValidating;
        }

        public final EditProfileDomainState.UsernameValidationResult getUsernameValidationResult() {
            return this.usernameValidationResult;
        }

        public int hashCode() {
            EditProfileResponse editProfileResponse = this.response;
            int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((editProfileResponse == null ? 0 : editProfileResponse.hashCode()) * 31, 31, this.isLoading), 31, this.isSaving), 31, this.saveSuccess);
            EditProfileDomainState editProfileDomainState = this.error;
            int iHashCode = (iM8289b + (editProfileDomainState == null ? 0 : editProfileDomainState.hashCode())) * 31;
            String str = this.saveError;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            EditProfileFormState editProfileFormState = this.pendingSaveRequest;
            int iHashCode3 = (iHashCode2 + (editProfileFormState == null ? 0 : editProfileFormState.hashCode())) * 31;
            EditProfileFormState editProfileFormState2 = this.lastFailedFormState;
            int iM8289b2 = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode3 + (editProfileFormState2 == null ? 0 : editProfileFormState2.hashCode())) * 31, 31, this.avatarUploading), 31, this.avatarUploadSuccess);
            String str2 = this.avatarUploadError;
            int iHashCode4 = (iM8289b2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            byte[] bArr = this.pendingRetryData;
            int iM8289b3 = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode4 + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31, 31, this.avatarRefreshNeeded), 31, this.emailValidating);
            EditProfileDomainState.EmailValidationResult emailValidationResult = this.emailValidationResult;
            int iHashCode5 = (iM8289b3 + (emailValidationResult == null ? 0 : emailValidationResult.hashCode())) * 31;
            String str3 = this.lastValidatedEmail;
            int iM8289b4 = AbstractC2875y.m8289b((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.usernameValidating);
            EditProfileDomainState.UsernameValidationResult usernameValidationResult = this.usernameValidationResult;
            int iHashCode6 = (iM8289b4 + (usernameValidationResult == null ? 0 : usernameValidationResult.hashCode())) * 31;
            String str4 = this.lastValidatedUsername;
            return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public final boolean isSaving() {
            return this.isSaving;
        }

        public final EditProfileDomainState toDomainState() {
            EditProfileDomainState.AvatarDomainState avatarDomainState = new EditProfileDomainState.AvatarDomainState(this.avatarUploading, this.avatarUploadSuccess, this.avatarUploadError, this.pendingRetryData);
            EditProfileDomainState.EmailValidationDomainState emailValidationDomainState = new EditProfileDomainState.EmailValidationDomainState(this.emailValidating, this.emailValidationResult, this.lastValidatedEmail);
            EditProfileDomainState.UsernameValidationDomainState usernameValidationDomainState = new EditProfileDomainState.UsernameValidationDomainState(this.usernameValidating, this.usernameValidationResult, this.lastValidatedUsername);
            if (this.isLoading) {
                return new EditProfileDomainState(null, EditProfileDialogType.Loading.INSTANCE, avatarDomainState, emailValidationDomainState, usernameValidationDomainState, 1, null);
            }
            if (this.isSaving) {
                return new EditProfileDomainState(null, EditProfileDialogType.Saving.INSTANCE, avatarDomainState, emailValidationDomainState, usernameValidationDomainState, 1, null);
            }
            if (this.saveSuccess) {
                return new EditProfileDomainState(this.response, EditProfileDialogType.Success.INSTANCE, avatarDomainState, emailValidationDomainState, usernameValidationDomainState);
            }
            if (this.saveError != null) {
                return new EditProfileDomainState(this.response, EditProfileDialogType.SaveError.INSTANCE, avatarDomainState, emailValidationDomainState, usernameValidationDomainState);
            }
            EditProfileDomainState editProfileDomainState = this.error;
            if (editProfileDomainState != null) {
                return EditProfileDomainState.copy$default(editProfileDomainState, null, null, avatarDomainState, emailValidationDomainState, usernameValidationDomainState, 3, null);
            }
            return new EditProfileDomainState(this.response, null, avatarDomainState, emailValidationDomainState, usernameValidationDomainState, 2, null);
        }

        public String toString() {
            EditProfileResponse editProfileResponse = this.response;
            boolean z4 = this.isLoading;
            boolean z13 = this.isSaving;
            boolean z14 = this.saveSuccess;
            EditProfileDomainState editProfileDomainState = this.error;
            String str = this.saveError;
            EditProfileFormState editProfileFormState = this.pendingSaveRequest;
            EditProfileFormState editProfileFormState2 = this.lastFailedFormState;
            boolean z15 = this.avatarUploading;
            boolean z16 = this.avatarUploadSuccess;
            String str2 = this.avatarUploadError;
            String string = Arrays.toString(this.pendingRetryData);
            boolean z17 = this.avatarRefreshNeeded;
            boolean z18 = this.emailValidating;
            EditProfileDomainState.EmailValidationResult emailValidationResult = this.emailValidationResult;
            String str3 = this.lastValidatedEmail;
            boolean z19 = this.usernameValidating;
            EditProfileDomainState.UsernameValidationResult usernameValidationResult = this.usernameValidationResult;
            String str4 = this.lastValidatedUsername;
            StringBuilder sb4 = new StringBuilder("InternalState(response=");
            sb4.append(editProfileResponse);
            sb4.append(", isLoading=");
            sb4.append(z4);
            sb4.append(", isSaving=");
            AbstractC38963t7.m124392v(sb4, z13, ", saveSuccess=", z14, ", error=");
            sb4.append(editProfileDomainState);
            sb4.append(", saveError=");
            sb4.append(str);
            sb4.append(", pendingSaveRequest=");
            sb4.append(editProfileFormState);
            sb4.append(", lastFailedFormState=");
            sb4.append(editProfileFormState2);
            sb4.append(", avatarUploading=");
            AbstractC38963t7.m124392v(sb4, z15, ", avatarUploadSuccess=", z16, ", avatarUploadError=");
            AbstractC11266d.m30444B(sb4, str2, ", pendingRetryData=", string, ", avatarRefreshNeeded=");
            AbstractC38963t7.m124392v(sb4, z17, ", emailValidating=", z18, ", emailValidationResult=");
            sb4.append(emailValidationResult);
            sb4.append(", lastValidatedEmail=");
            sb4.append(str3);
            sb4.append(", usernameValidating=");
            sb4.append(z19);
            sb4.append(", usernameValidationResult=");
            sb4.append(usernameValidationResult);
            sb4.append(", lastValidatedUsername=");
            return AbstractC25012a.m73376i(str4, ")", sb4);
        }

        public InternalState(EditProfileResponse editProfileResponse, boolean z4, boolean z13, boolean z14, EditProfileDomainState editProfileDomainState, String str, EditProfileFormState editProfileFormState, EditProfileFormState editProfileFormState2, boolean z15, boolean z16, String str2, byte[] bArr, boolean z17, boolean z18, EditProfileDomainState.EmailValidationResult emailValidationResult, String str3, boolean z19, EditProfileDomainState.UsernameValidationResult usernameValidationResult, String str4) {
            this.response = editProfileResponse;
            this.isLoading = z4;
            this.isSaving = z13;
            this.saveSuccess = z14;
            this.error = editProfileDomainState;
            this.saveError = str;
            this.pendingSaveRequest = editProfileFormState;
            this.lastFailedFormState = editProfileFormState2;
            this.avatarUploading = z15;
            this.avatarUploadSuccess = z16;
            this.avatarUploadError = str2;
            this.pendingRetryData = bArr;
            this.avatarRefreshNeeded = z17;
            this.emailValidating = z18;
            this.emailValidationResult = emailValidationResult;
            this.lastValidatedEmail = str3;
            this.usernameValidating = z19;
            this.usernameValidationResult = usernameValidationResult;
            this.lastValidatedUsername = str4;
        }

        public /* synthetic */ InternalState(EditProfileResponse editProfileResponse, boolean z4, boolean z13, boolean z14, EditProfileDomainState editProfileDomainState, String str, EditProfileFormState editProfileFormState, EditProfileFormState editProfileFormState2, boolean z15, boolean z16, String str2, byte[] bArr, boolean z17, boolean z18, EditProfileDomainState.EmailValidationResult emailValidationResult, String str3, boolean z19, EditProfileDomainState.UsernameValidationResult usernameValidationResult, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : editProfileResponse, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? false : z14, (i13 & 16) != 0 ? null : editProfileDomainState, (i13 & 32) != 0 ? null : str, (i13 & 64) != 0 ? null : editProfileFormState, (i13 & 128) != 0 ? null : editProfileFormState2, (i13 & 256) != 0 ? false : z15, (i13 & 512) != 0 ? false : z16, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str2, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : bArr, (i13 & 4096) != 0 ? false : z17, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? false : z18, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : emailValidationResult, (i13 & 32768) != 0 ? null : str3, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? false : z19, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? null : usernameValidationResult, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? null : str4);
        }
    }

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0010\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0010\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;", "", "<init>", "()V", "Loading", "DataLoaded", "ErrorOccurred", "SaveRequested", "SavingStarted", "SaveCompleted", "SaveFailed", "NoOp", "AvatarUploading", "AvatarUploadSuccess", "AvatarUploadError", "EmailValidationStarted", "EmailValidationCompleted", "UsernameValidationStarted", "UsernameValidationCompleted", "ClearUsernameValidation", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$AvatarUploadError;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$AvatarUploadSuccess;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$AvatarUploading;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ClearUsernameValidation;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$DataLoaded;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$EmailValidationCompleted;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$EmailValidationStarted;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ErrorOccurred;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$Loading;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$NoOp;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$SaveCompleted;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$SaveFailed;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$SaveRequested;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$SavingStarted;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$UsernameValidationCompleted;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$UsernameValidationStarted;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class StateUpdate {

        @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$AvatarUploadError;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;", "errorMessage", "", "imageData", "", "<init>", "(Ljava/lang/String;[B)V", "getErrorMessage", "()Ljava/lang/String;", "getImageData", "()[B", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class AvatarUploadError extends StateUpdate {
            public static final int $stable = 8;
            private final String errorMessage;
            private final byte[] imageData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AvatarUploadError(String errorMessage, byte[] imageData) {
                super(null);
                AbstractC22676k.m65750j(errorMessage, "errorMessage");
                AbstractC22676k.m65750j(imageData, "imageData");
                this.errorMessage = errorMessage;
                this.imageData = imageData;
            }

            public static /* synthetic */ AvatarUploadError copy$default(AvatarUploadError avatarUploadError, String str, byte[] bArr, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = avatarUploadError.errorMessage;
                }
                if ((i13 & 2) != 0) {
                    bArr = avatarUploadError.imageData;
                }
                return avatarUploadError.copy(str, bArr);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getErrorMessage() {
                return this.errorMessage;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final byte[] getImageData() {
                return this.imageData;
            }

            public final AvatarUploadError copy(String errorMessage, byte[] imageData) {
                AbstractC22676k.m65750j(errorMessage, "errorMessage");
                AbstractC22676k.m65750j(imageData, "imageData");
                return new AvatarUploadError(errorMessage, imageData);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AvatarUploadError)) {
                    return false;
                }
                AvatarUploadError avatarUploadError = (AvatarUploadError) other;
                return AbstractC22676k.m65745e(this.errorMessage, avatarUploadError.errorMessage) && AbstractC22676k.m65745e(this.imageData, avatarUploadError.imageData);
            }

            public final String getErrorMessage() {
                return this.errorMessage;
            }

            public final byte[] getImageData() {
                return this.imageData;
            }

            public int hashCode() {
                return Arrays.hashCode(this.imageData) + (this.errorMessage.hashCode() * 31);
            }

            public String toString() {
                return AbstractC2875y.m8300m("AvatarUploadError(errorMessage=", this.errorMessage, ", imageData=", Arrays.toString(this.imageData), ")");
            }
        }

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$AvatarUploadSuccess;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;", "avatarUrl", "", "<init>", "(Ljava/lang/String;)V", "getAvatarUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class AvatarUploadSuccess extends StateUpdate {
            public static final int $stable = 0;
            private final String avatarUrl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AvatarUploadSuccess(String avatarUrl) {
                super(null);
                AbstractC22676k.m65750j(avatarUrl, "avatarUrl");
                this.avatarUrl = avatarUrl;
            }

            public static /* synthetic */ AvatarUploadSuccess copy$default(AvatarUploadSuccess avatarUploadSuccess, String str, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = avatarUploadSuccess.avatarUrl;
                }
                return avatarUploadSuccess.copy(str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getAvatarUrl() {
                return this.avatarUrl;
            }

            public final AvatarUploadSuccess copy(String avatarUrl) {
                AbstractC22676k.m65750j(avatarUrl, "avatarUrl");
                return new AvatarUploadSuccess(avatarUrl);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AvatarUploadSuccess) && AbstractC22676k.m65745e(this.avatarUrl, ((AvatarUploadSuccess) other).avatarUrl);
            }

            public final String getAvatarUrl() {
                return this.avatarUrl;
            }

            public int hashCode() {
                return this.avatarUrl.hashCode();
            }

            public String toString() {
                return AbstractC11895b.m31996o("AvatarUploadSuccess(avatarUrl=", this.avatarUrl, ")");
            }
        }

        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$AvatarUploading;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;", "imageData", "", "<init>", "([B)V", "getImageData", "()[B", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class AvatarUploading extends StateUpdate {
            public static final int $stable = 8;
            private final byte[] imageData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AvatarUploading(byte[] imageData) {
                super(null);
                AbstractC22676k.m65750j(imageData, "imageData");
                this.imageData = imageData;
            }

            public static /* synthetic */ AvatarUploading copy$default(AvatarUploading avatarUploading, byte[] bArr, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    bArr = avatarUploading.imageData;
                }
                return avatarUploading.copy(bArr);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final byte[] getImageData() {
                return this.imageData;
            }

            public final AvatarUploading copy(byte[] imageData) {
                AbstractC22676k.m65750j(imageData, "imageData");
                return new AvatarUploading(imageData);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AvatarUploading) && AbstractC22676k.m65745e(this.imageData, ((AvatarUploading) other).imageData);
            }

            public final byte[] getImageData() {
                return this.imageData;
            }

            public int hashCode() {
                return Arrays.hashCode(this.imageData);
            }

            public String toString() {
                return AbstractC11895b.m31996o("AvatarUploading(imageData=", Arrays.toString(this.imageData), ")");
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ClearUsernameValidation;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class ClearUsernameValidation extends StateUpdate {
            public static final int $stable = 0;
            public static final ClearUsernameValidation INSTANCE = new ClearUsernameValidation();

            private ClearUsernameValidation() {
                super(null);
            }
        }

        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$DataLoaded;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;", "response", "Lcom/whoop/profile/domain/edit/models/EditProfileResponse;", "preserveFormState", "", "<init>", "(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;Z)V", "getResponse", "()Lcom/whoop/profile/domain/edit/models/EditProfileResponse;", "getPreserveFormState", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class DataLoaded extends StateUpdate {
            public static final int $stable = 8;
            private final boolean preserveFormState;
            private final EditProfileResponse response;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DataLoaded(EditProfileResponse response, boolean z4) {
                super(null);
                AbstractC22676k.m65750j(response, "response");
                this.response = response;
                this.preserveFormState = z4;
            }

            public static /* synthetic */ DataLoaded copy$default(DataLoaded dataLoaded, EditProfileResponse editProfileResponse, boolean z4, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    editProfileResponse = dataLoaded.response;
                }
                if ((i13 & 2) != 0) {
                    z4 = dataLoaded.preserveFormState;
                }
                return dataLoaded.copy(editProfileResponse, z4);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final EditProfileResponse getResponse() {
                return this.response;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final boolean getPreserveFormState() {
                return this.preserveFormState;
            }

            public final DataLoaded copy(EditProfileResponse response, boolean preserveFormState) {
                AbstractC22676k.m65750j(response, "response");
                return new DataLoaded(response, preserveFormState);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DataLoaded)) {
                    return false;
                }
                DataLoaded dataLoaded = (DataLoaded) other;
                return AbstractC22676k.m65745e(this.response, dataLoaded.response) && this.preserveFormState == dataLoaded.preserveFormState;
            }

            public final boolean getPreserveFormState() {
                return this.preserveFormState;
            }

            public final EditProfileResponse getResponse() {
                return this.response;
            }

            public int hashCode() {
                return Boolean.hashCode(this.preserveFormState) + (this.response.hashCode() * 31);
            }

            public String toString() {
                return "DataLoaded(response=" + this.response + ", preserveFormState=" + this.preserveFormState + ")";
            }

            public /* synthetic */ DataLoaded(EditProfileResponse editProfileResponse, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this(editProfileResponse, (i13 & 2) != 0 ? false : z4);
            }
        }

        @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$EmailValidationCompleted;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;", NotificationCompat.CATEGORY_EMAIL, "", "result", "Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;", "<init>", "(Ljava/lang/String;Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;)V", "getEmail", "()Ljava/lang/String;", "getResult", "()Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class EmailValidationCompleted extends StateUpdate {
            public static final int $stable = 0;
            private final String email;
            private final EditProfileDomainState.EmailValidationResult result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EmailValidationCompleted(String email, EditProfileDomainState.EmailValidationResult result) {
                super(null);
                AbstractC22676k.m65750j(email, "email");
                AbstractC22676k.m65750j(result, "result");
                this.email = email;
                this.result = result;
            }

            public static /* synthetic */ EmailValidationCompleted copy$default(EmailValidationCompleted emailValidationCompleted, String str, EditProfileDomainState.EmailValidationResult emailValidationResult, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = emailValidationCompleted.email;
                }
                if ((i13 & 2) != 0) {
                    emailValidationResult = emailValidationCompleted.result;
                }
                return emailValidationCompleted.copy(str, emailValidationResult);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getEmail() {
                return this.email;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final EditProfileDomainState.EmailValidationResult getResult() {
                return this.result;
            }

            public final EmailValidationCompleted copy(String email, EditProfileDomainState.EmailValidationResult result) {
                AbstractC22676k.m65750j(email, "email");
                AbstractC22676k.m65750j(result, "result");
                return new EmailValidationCompleted(email, result);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof EmailValidationCompleted)) {
                    return false;
                }
                EmailValidationCompleted emailValidationCompleted = (EmailValidationCompleted) other;
                return AbstractC22676k.m65745e(this.email, emailValidationCompleted.email) && AbstractC22676k.m65745e(this.result, emailValidationCompleted.result);
            }

            public final String getEmail() {
                return this.email;
            }

            public final EditProfileDomainState.EmailValidationResult getResult() {
                return this.result;
            }

            public int hashCode() {
                return this.result.hashCode() + (this.email.hashCode() * 31);
            }

            public String toString() {
                return "EmailValidationCompleted(email=" + this.email + ", result=" + this.result + ")";
            }
        }

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$EmailValidationStarted;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;", NotificationCompat.CATEGORY_EMAIL, "", "<init>", "(Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class EmailValidationStarted extends StateUpdate {
            public static final int $stable = 0;
            private final String email;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EmailValidationStarted(String email) {
                super(null);
                AbstractC22676k.m65750j(email, "email");
                this.email = email;
            }

            public static /* synthetic */ EmailValidationStarted copy$default(EmailValidationStarted emailValidationStarted, String str, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = emailValidationStarted.email;
                }
                return emailValidationStarted.copy(str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getEmail() {
                return this.email;
            }

            public final EmailValidationStarted copy(String email) {
                AbstractC22676k.m65750j(email, "email");
                return new EmailValidationStarted(email);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EmailValidationStarted) && AbstractC22676k.m65745e(this.email, ((EmailValidationStarted) other).email);
            }

            public final String getEmail() {
                return this.email;
            }

            public int hashCode() {
                return this.email.hashCode();
            }

            public String toString() {
                return AbstractC11895b.m31996o("EmailValidationStarted(email=", this.email, ")");
            }
        }

        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ErrorOccurred;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;", "error", "Lcom/whoop/profile/domain/edit/EditProfileDomainState;", "<init>", "(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)V", "getError", "()Lcom/whoop/profile/domain/edit/EditProfileDomainState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class ErrorOccurred extends StateUpdate {
            public static final int $stable = 8;
            private final EditProfileDomainState error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ErrorOccurred(EditProfileDomainState error) {
                super(null);
                AbstractC22676k.m65750j(error, "error");
                this.error = error;
            }

            public static /* synthetic */ ErrorOccurred copy$default(ErrorOccurred errorOccurred, EditProfileDomainState editProfileDomainState, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    editProfileDomainState = errorOccurred.error;
                }
                return errorOccurred.copy(editProfileDomainState);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final EditProfileDomainState getError() {
                return this.error;
            }

            public final ErrorOccurred copy(EditProfileDomainState error) {
                AbstractC22676k.m65750j(error, "error");
                return new ErrorOccurred(error);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ErrorOccurred) && AbstractC22676k.m65745e(this.error, ((ErrorOccurred) other).error);
            }

            public final EditProfileDomainState getError() {
                return this.error;
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "ErrorOccurred(error=" + this.error + ")";
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$Loading;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Loading extends StateUpdate {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$NoOp;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class NoOp extends StateUpdate {
            public static final int $stable = 0;
            public static final NoOp INSTANCE = new NoOp();

            private NoOp() {
                super(null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$SaveCompleted;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class SaveCompleted extends StateUpdate {
            public static final int $stable = 0;
            public static final SaveCompleted INSTANCE = new SaveCompleted();

            private SaveCompleted() {
                super(null);
            }
        }

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$SaveFailed;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;", "error", "", "<init>", "(Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class SaveFailed extends StateUpdate {
            public static final int $stable = 0;
            private final String error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SaveFailed(String error) {
                super(null);
                AbstractC22676k.m65750j(error, "error");
                this.error = error;
            }

            public static /* synthetic */ SaveFailed copy$default(SaveFailed saveFailed, String str, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = saveFailed.error;
                }
                return saveFailed.copy(str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getError() {
                return this.error;
            }

            public final SaveFailed copy(String error) {
                AbstractC22676k.m65750j(error, "error");
                return new SaveFailed(error);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SaveFailed) && AbstractC22676k.m65745e(this.error, ((SaveFailed) other).error);
            }

            public final String getError() {
                return this.error;
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return AbstractC11895b.m31996o("SaveFailed(error=", this.error, ")");
            }
        }

        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$SaveRequested;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;", "formState", "Lcom/whoop/profile/view/edit/form/EditProfileFormState;", "<init>", "(Lcom/whoop/profile/view/edit/form/EditProfileFormState;)V", "getFormState", "()Lcom/whoop/profile/view/edit/form/EditProfileFormState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class SaveRequested extends StateUpdate {
            public static final int $stable = TextResource.$stable;
            private final EditProfileFormState formState;

            public SaveRequested(EditProfileFormState editProfileFormState) {
                super(null);
                this.formState = editProfileFormState;
            }

            public static /* synthetic */ SaveRequested copy$default(SaveRequested saveRequested, EditProfileFormState editProfileFormState, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    editProfileFormState = saveRequested.formState;
                }
                return saveRequested.copy(editProfileFormState);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final EditProfileFormState getFormState() {
                return this.formState;
            }

            public final SaveRequested copy(EditProfileFormState formState) {
                return new SaveRequested(formState);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SaveRequested) && AbstractC22676k.m65745e(this.formState, ((SaveRequested) other).formState);
            }

            public final EditProfileFormState getFormState() {
                return this.formState;
            }

            public int hashCode() {
                EditProfileFormState editProfileFormState = this.formState;
                if (editProfileFormState == null) {
                    return 0;
                }
                return editProfileFormState.hashCode();
            }

            public String toString() {
                return "SaveRequested(formState=" + this.formState + ")";
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$SavingStarted;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class SavingStarted extends StateUpdate {
            public static final int $stable = 0;
            public static final SavingStarted INSTANCE = new SavingStarted();

            private SavingStarted() {
                super(null);
            }
        }

        @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$UsernameValidationCompleted;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;", "username", "", "result", "Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;", "<init>", "(Ljava/lang/String;Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;)V", "getUsername", "()Ljava/lang/String;", "getResult", "()Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class UsernameValidationCompleted extends StateUpdate {
            public static final int $stable = 0;
            private final EditProfileDomainState.UsernameValidationResult result;
            private final String username;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UsernameValidationCompleted(String username, EditProfileDomainState.UsernameValidationResult result) {
                super(null);
                AbstractC22676k.m65750j(username, "username");
                AbstractC22676k.m65750j(result, "result");
                this.username = username;
                this.result = result;
            }

            public static /* synthetic */ UsernameValidationCompleted copy$default(UsernameValidationCompleted usernameValidationCompleted, String str, EditProfileDomainState.UsernameValidationResult usernameValidationResult, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = usernameValidationCompleted.username;
                }
                if ((i13 & 2) != 0) {
                    usernameValidationResult = usernameValidationCompleted.result;
                }
                return usernameValidationCompleted.copy(str, usernameValidationResult);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getUsername() {
                return this.username;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final EditProfileDomainState.UsernameValidationResult getResult() {
                return this.result;
            }

            public final UsernameValidationCompleted copy(String username, EditProfileDomainState.UsernameValidationResult result) {
                AbstractC22676k.m65750j(username, "username");
                AbstractC22676k.m65750j(result, "result");
                return new UsernameValidationCompleted(username, result);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UsernameValidationCompleted)) {
                    return false;
                }
                UsernameValidationCompleted usernameValidationCompleted = (UsernameValidationCompleted) other;
                return AbstractC22676k.m65745e(this.username, usernameValidationCompleted.username) && AbstractC22676k.m65745e(this.result, usernameValidationCompleted.result);
            }

            public final EditProfileDomainState.UsernameValidationResult getResult() {
                return this.result;
            }

            public final String getUsername() {
                return this.username;
            }

            public int hashCode() {
                return this.result.hashCode() + (this.username.hashCode() * 31);
            }

            public String toString() {
                return "UsernameValidationCompleted(username=" + this.username + ", result=" + this.result + ")";
            }
        }

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$UsernameValidationStarted;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;", "username", "", "<init>", "(Ljava/lang/String;)V", "getUsername", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class UsernameValidationStarted extends StateUpdate {
            public static final int $stable = 0;
            private final String username;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UsernameValidationStarted(String username) {
                super(null);
                AbstractC22676k.m65750j(username, "username");
                this.username = username;
            }

            public static /* synthetic */ UsernameValidationStarted copy$default(UsernameValidationStarted usernameValidationStarted, String str, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = usernameValidationStarted.username;
                }
                return usernameValidationStarted.copy(str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getUsername() {
                return this.username;
            }

            public final UsernameValidationStarted copy(String username) {
                AbstractC22676k.m65750j(username, "username");
                return new UsernameValidationStarted(username);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UsernameValidationStarted) && AbstractC22676k.m65745e(this.username, ((UsernameValidationStarted) other).username);
            }

            public final String getUsername() {
                return this.username;
            }

            public int hashCode() {
                return this.username.hashCode();
            }

            public String toString() {
                return AbstractC11895b.m31996o("UsernameValidationStarted(username=", this.username, ")");
            }
        }

        public /* synthetic */ StateUpdate(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateUpdate() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.profile.domain.edit.EditProfileInteractor$deleteCurrentUserAvatarFlow$1 */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.profile.domain.edit.EditProfileInteractor$deleteCurrentUserAvatarFlow$1", m100430f = "EditProfileInteractor.kt", m100431l = {AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION, 253, 255, 256, 259, 264}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C97021 extends AbstractC32275i implements InterfaceC4351m {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public C97021(InterfaceC30057d<? super C97021> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C97021 c97021 = EditProfileInteractor.this.new C97021(interfaceC30057d);
            c97021.L$0 = obj;
            return c97021;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C97021) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0064  */
        /* JADX WARN: Code duplicated, block: B:23:0x0066 A[Catch: Exception -> 0x0029, PHI: r8
          0x0066: PHI (r8v12 java.lang.Object) = (r8v11 java.lang.Object), (r8v0 java.lang.Object) binds: [B:21:0x0062, B:14:0x0034] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0029, blocks: (B:8:0x0024, B:13:0x0030, B:28:0x0080, B:14:0x0034, B:23:0x0066, B:25:0x006c, B:31:0x0095, B:33:0x0099, B:36:0x00c0, B:37:0x00c5, B:20:0x0053), top: B:43:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:25:0x006c A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:8:0x0024, B:13:0x0030, B:28:0x0080, B:14:0x0034, B:23:0x0066, B:25:0x006c, B:31:0x0095, B:33:0x0099, B:36:0x00c0, B:37:0x00c5, B:20:0x0053), top: B:43:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:27:0x007f  */
        /* JADX WARN: Code duplicated, block: B:28:0x0080 A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:8:0x0024, B:13:0x0030, B:28:0x0080, B:14:0x0034, B:23:0x0066, B:25:0x006c, B:31:0x0095, B:33:0x0099, B:36:0x00c0, B:37:0x00c5, B:20:0x0053), top: B:43:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:30:0x0094  */
        /* JADX WARN: Code duplicated, block: B:31:0x0095 A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:8:0x0024, B:13:0x0030, B:28:0x0080, B:14:0x0034, B:23:0x0066, B:25:0x006c, B:31:0x0095, B:33:0x0099, B:36:0x00c0, B:37:0x00c5, B:20:0x0053), top: B:43:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:33:0x0099 A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:8:0x0024, B:13:0x0030, B:28:0x0080, B:14:0x0034, B:23:0x0066, B:25:0x006c, B:31:0x0095, B:33:0x0099, B:36:0x00c0, B:37:0x00c5, B:20:0x0053), top: B:43:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
        /* JADX WARN: Code duplicated, block: B:36:0x00c0 A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:8:0x0024, B:13:0x0030, B:28:0x0080, B:14:0x0034, B:23:0x0066, B:25:0x006c, B:31:0x0095, B:33:0x0099, B:36:0x00c0, B:37:0x00c5, B:20:0x0053), top: B:43:0x000c }] */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00ef, code lost:
        
            if (r1.emit(r0, r7) == r2) goto L40;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:33:0x0099, please report this as an issue */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 264
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.profile.domain.edit.EditProfileInteractor.C97021.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.profile.domain.edit.EditProfileInteractor$handleRefresh$1 */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.profile.domain.edit.EditProfileInteractor$handleRefresh$1", m100430f = "EditProfileInteractor.kt", m100431l = {488, 493, 499, 501, 503, 512, 522}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C97031 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ boolean $preserveFormState;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C97031(boolean z4, InterfaceC30057d<? super C97031> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$preserveFormState = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C97031 c97031 = EditProfileInteractor.this.new C97031(this.$preserveFormState, interfaceC30057d);
            c97031.L$0 = obj;
            return c97031;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C97031) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0096  */
        /* JADX WARN: Code duplicated, block: B:27:0x0098 A[Catch: Exception -> 0x0037, PHI: r0
          0x0098: PHI (r0v13 java.lang.Object) = (r0v12 java.lang.Object), (r0v28 java.lang.Object) binds: [B:25:0x0094, B:19:0x0055] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0037, blocks: (B:9:0x0032, B:15:0x0047, B:32:0x00cd, B:34:0x00d1, B:37:0x00d7, B:40:0x00f1, B:18:0x0052, B:27:0x0098, B:29:0x009e, B:43:0x011a, B:45:0x011e, B:47:0x0128, B:49:0x014b, B:48:0x013a, B:52:0x0162, B:53:0x0167, B:24:0x006e), top: B:63:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:29:0x009e A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:9:0x0032, B:15:0x0047, B:32:0x00cd, B:34:0x00d1, B:37:0x00d7, B:40:0x00f1, B:18:0x0052, B:27:0x0098, B:29:0x009e, B:43:0x011a, B:45:0x011e, B:47:0x0128, B:49:0x014b, B:48:0x013a, B:52:0x0162, B:53:0x0167, B:24:0x006e), top: B:63:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:31:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:32:0x00cd A[Catch: Exception -> 0x0037, PHI: r0
          0x00cd: PHI (r0v29 java.lang.Object) = (r0v25 java.lang.Object), (r0v41 java.lang.Object) binds: [B:30:0x00c9, B:16:0x004a] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0037, blocks: (B:9:0x0032, B:15:0x0047, B:32:0x00cd, B:34:0x00d1, B:37:0x00d7, B:40:0x00f1, B:18:0x0052, B:27:0x0098, B:29:0x009e, B:43:0x011a, B:45:0x011e, B:47:0x0128, B:49:0x014b, B:48:0x013a, B:52:0x0162, B:53:0x0167, B:24:0x006e), top: B:63:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:34:0x00d1 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:9:0x0032, B:15:0x0047, B:32:0x00cd, B:34:0x00d1, B:37:0x00d7, B:40:0x00f1, B:18:0x0052, B:27:0x0098, B:29:0x009e, B:43:0x011a, B:45:0x011e, B:47:0x0128, B:49:0x014b, B:48:0x013a, B:52:0x0162, B:53:0x0167, B:24:0x006e), top: B:63:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:35:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:37:0x00d7 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:9:0x0032, B:15:0x0047, B:32:0x00cd, B:34:0x00d1, B:37:0x00d7, B:40:0x00f1, B:18:0x0052, B:27:0x0098, B:29:0x009e, B:43:0x011a, B:45:0x011e, B:47:0x0128, B:49:0x014b, B:48:0x013a, B:52:0x0162, B:53:0x0167, B:24:0x006e), top: B:63:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:39:0x00ef  */
        /* JADX WARN: Code duplicated, block: B:40:0x00f1 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:9:0x0032, B:15:0x0047, B:32:0x00cd, B:34:0x00d1, B:37:0x00d7, B:40:0x00f1, B:18:0x0052, B:27:0x0098, B:29:0x009e, B:43:0x011a, B:45:0x011e, B:47:0x0128, B:49:0x014b, B:48:0x013a, B:52:0x0162, B:53:0x0167, B:24:0x006e), top: B:63:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:42:0x0118  */
        /* JADX WARN: Code duplicated, block: B:43:0x011a A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:9:0x0032, B:15:0x0047, B:32:0x00cd, B:34:0x00d1, B:37:0x00d7, B:40:0x00f1, B:18:0x0052, B:27:0x0098, B:29:0x009e, B:43:0x011a, B:45:0x011e, B:47:0x0128, B:49:0x014b, B:48:0x013a, B:52:0x0162, B:53:0x0167, B:24:0x006e), top: B:63:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:45:0x011e A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:9:0x0032, B:15:0x0047, B:32:0x00cd, B:34:0x00d1, B:37:0x00d7, B:40:0x00f1, B:18:0x0052, B:27:0x0098, B:29:0x009e, B:43:0x011a, B:45:0x011e, B:47:0x0128, B:49:0x014b, B:48:0x013a, B:52:0x0162, B:53:0x0167, B:24:0x006e), top: B:63:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:47:0x0128 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:9:0x0032, B:15:0x0047, B:32:0x00cd, B:34:0x00d1, B:37:0x00d7, B:40:0x00f1, B:18:0x0052, B:27:0x0098, B:29:0x009e, B:43:0x011a, B:45:0x011e, B:47:0x0128, B:49:0x014b, B:48:0x013a, B:52:0x0162, B:53:0x0167, B:24:0x006e), top: B:63:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:48:0x013a A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:9:0x0032, B:15:0x0047, B:32:0x00cd, B:34:0x00d1, B:37:0x00d7, B:40:0x00f1, B:18:0x0052, B:27:0x0098, B:29:0x009e, B:43:0x011a, B:45:0x011e, B:47:0x0128, B:49:0x014b, B:48:0x013a, B:52:0x0162, B:53:0x0167, B:24:0x006e), top: B:63:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:51:0x0161  */
        /* JADX WARN: Code duplicated, block: B:52:0x0162 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:9:0x0032, B:15:0x0047, B:32:0x00cd, B:34:0x00d1, B:37:0x00d7, B:40:0x00f1, B:18:0x0052, B:27:0x0098, B:29:0x009e, B:43:0x011a, B:45:0x011e, B:47:0x0128, B:49:0x014b, B:48:0x013a, B:52:0x0162, B:53:0x0167, B:24:0x006e), top: B:63:0x000e }] */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x01b3, code lost:
        
            if (r9.emit(r0, r21) == r10) goto L60;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 462
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.profile.domain.edit.EditProfileInteractor.C97031.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.profile.domain.edit.EditProfileInteractor$handleSave$1 */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.profile.domain.edit.EditProfileInteractor$handleSave$1", m100430f = "EditProfileInteractor.kt", m100431l = {269, 271, 277, 278, 281}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C97041 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ UpdateProfileRequest $updateRequest;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ EditProfileInteractor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C97041(UpdateProfileRequest updateProfileRequest, EditProfileInteractor editProfileInteractor, InterfaceC30057d<? super C97041> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$updateRequest = updateProfileRequest;
            this.this$0 = editProfileInteractor;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C97041 c97041 = new C97041(this.$updateRequest, this.this$0, interfaceC30057d);
            c97041.L$0 = obj;
            return c97041;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C97041) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x008c  */
        /* JADX WARN: Code duplicated, block: B:27:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:30:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:32:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:37:0x00dd  */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00af, code lost:
        
            if (r8.emit(r0, r14) == r9) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00d7, code lost:
        
            if (r8.emit(r1, r14) == r9) goto L34;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 227
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.profile.domain.edit.EditProfileInteractor.C97041.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.profile.domain.edit.EditProfileInteractor$interact$2 */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.profile.domain.edit.EditProfileInteractor$interact$2", m100430f = "EditProfileInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;", "currentState", "update", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C97052 extends AbstractC32275i implements Function3 {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public C97052(InterfaceC30057d<? super C97052> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(InternalState internalState, StateUpdate stateUpdate, InterfaceC30057d<? super InternalState> interfaceC30057d) {
            C97052 c97052 = EditProfileInteractor.this.new C97052(interfaceC30057d);
            c97052.L$0 = internalState;
            c97052.L$1 = stateUpdate;
            return c97052.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InternalState internalStateCopy$default;
            InternalState internalState = (InternalState) this.L$0;
            StateUpdate stateUpdate = (StateUpdate) this.L$1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (stateUpdate instanceof StateUpdate.Loading) {
                return InternalState.copy$default(internalState, null, true, false, false, null, null, null, null, false, false, null, null, false, false, null, null, false, null, null, 524285, null);
            }
            if (stateUpdate instanceof StateUpdate.DataLoaded) {
                StateUpdate.DataLoaded dataLoaded = (StateUpdate.DataLoaded) stateUpdate;
                return dataLoaded.getPreserveFormState() ? InternalState.copy$default(internalState, dataLoaded.getResponse(), false, false, false, null, null, null, null, false, internalState.getAvatarUploadSuccess(), null, null, false, false, null, null, false, null, null, 523756, null) : InternalState.copy$default(internalState, dataLoaded.getResponse(), false, false, false, null, null, null, null, false, false, null, null, false, false, null, null, false, null, null, 524268, null);
            }
            if (stateUpdate instanceof StateUpdate.ErrorOccurred) {
                return InternalState.copy$default(internalState, null, false, false, false, ((StateUpdate.ErrorOccurred) stateUpdate).getError(), null, null, null, false, false, null, null, false, false, null, null, false, null, null, 524269, null);
            }
            if (stateUpdate instanceof StateUpdate.SaveRequested) {
                EditProfileFormState formState = ((StateUpdate.SaveRequested) stateUpdate).getFormState();
                if (formState == null) {
                    formState = internalState.getLastFailedFormState();
                }
                EditProfileFormState editProfileFormState = formState;
                if (editProfileFormState != null && (internalStateCopy$default = InternalState.copy$default(internalState, null, false, false, false, null, null, editProfileFormState, null, false, false, null, null, false, false, null, null, false, null, null, 524223, null)) != null) {
                    return internalStateCopy$default;
                }
                EditProfileInteractor.this.logger.mo85226q("Save rejected - no formState available", new AbstractC30556a.a[0]);
                return internalState;
            }
            if (stateUpdate instanceof StateUpdate.AvatarUploading) {
                return InternalState.copy$default(internalState, null, false, false, false, null, null, null, null, true, false, null, ((StateUpdate.AvatarUploading) stateUpdate).getImageData(), false, false, null, null, false, null, null, 520447, null);
            }
            if (stateUpdate instanceof StateUpdate.AvatarUploadSuccess) {
                return InternalState.copy$default(internalState, null, false, false, false, null, null, null, null, false, true, null, null, true, false, null, null, false, null, null, 518399, null);
            }
            if (stateUpdate instanceof StateUpdate.AvatarUploadError) {
                StateUpdate.AvatarUploadError avatarUploadError = (StateUpdate.AvatarUploadError) stateUpdate;
                return InternalState.copy$default(internalState, null, false, false, false, null, null, null, null, false, false, avatarUploadError.getErrorMessage(), avatarUploadError.getImageData(), false, false, null, null, false, null, null, 520447, null);
            }
            if (stateUpdate instanceof StateUpdate.EmailValidationStarted) {
                return InternalState.copy$default(internalState, null, false, false, false, null, null, null, null, false, false, null, null, false, true, null, ((StateUpdate.EmailValidationStarted) stateUpdate).getEmail(), false, null, null, 466943, null);
            }
            if (stateUpdate instanceof StateUpdate.EmailValidationCompleted) {
                StateUpdate.EmailValidationCompleted emailValidationCompleted = (StateUpdate.EmailValidationCompleted) stateUpdate;
                return InternalState.copy$default(internalState, null, false, false, false, null, null, null, null, false, false, null, null, false, false, emailValidationCompleted.getResult(), emailValidationCompleted.getEmail(), false, null, null, 466943, null);
            }
            if (stateUpdate instanceof StateUpdate.UsernameValidationStarted) {
                return InternalState.copy$default(internalState, null, false, false, false, null, null, null, null, false, false, null, null, false, false, null, null, true, null, ((StateUpdate.UsernameValidationStarted) stateUpdate).getUsername(), 65535, null);
            }
            if (stateUpdate instanceof StateUpdate.UsernameValidationCompleted) {
                StateUpdate.UsernameValidationCompleted usernameValidationCompleted = (StateUpdate.UsernameValidationCompleted) stateUpdate;
                return InternalState.copy$default(internalState, null, false, false, false, null, null, null, null, false, false, null, null, false, false, null, null, false, usernameValidationCompleted.getResult(), usernameValidationCompleted.getUsername(), 65535, null);
            }
            if (stateUpdate instanceof StateUpdate.ClearUsernameValidation) {
                return InternalState.copy$default(internalState, null, false, false, false, null, null, null, null, false, false, null, null, false, false, null, null, false, null, null, 65535, null);
            }
            if ((stateUpdate instanceof StateUpdate.SavingStarted) || (stateUpdate instanceof StateUpdate.SaveCompleted) || (stateUpdate instanceof StateUpdate.SaveFailed) || (stateUpdate instanceof StateUpdate.NoOp)) {
                return internalState;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: com.whoop.profile.domain.edit.EditProfileInteractor$uploadAvatar$1 */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.profile.domain.edit.EditProfileInteractor$uploadAvatar$1", m100430f = "EditProfileInteractor.kt", m100431l = {373, 376, 378, 379, 383, 388}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C97081 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ byte[] $imageData;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ EditProfileInteractor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C97081(byte[] bArr, EditProfileInteractor editProfileInteractor, InterfaceC30057d<? super C97081> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$imageData = bArr;
            this.this$0 = editProfileInteractor;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C97081 c97081 = new C97081(this.$imageData, this.this$0, interfaceC30057d);
            c97081.L$0 = obj;
            return c97081;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C97081) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0065  */
        /* JADX WARN: Code duplicated, block: B:23:0x0067 A[Catch: Exception -> 0x0028, PHI: r7
          0x0067: PHI (r7v12 java.lang.Object) = (r7v11 java.lang.Object), (r7v0 java.lang.Object) binds: [B:21:0x0063, B:14:0x0033] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0028, blocks: (B:8:0x0023, B:13:0x002f, B:28:0x0081, B:14:0x0033, B:23:0x0067, B:25:0x006d, B:31:0x0096, B:33:0x009a, B:36:0x00c1, B:37:0x00c6, B:20:0x0052), top: B:43:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:25:0x006d A[Catch: Exception -> 0x0028, TryCatch #0 {Exception -> 0x0028, blocks: (B:8:0x0023, B:13:0x002f, B:28:0x0081, B:14:0x0033, B:23:0x0067, B:25:0x006d, B:31:0x0096, B:33:0x009a, B:36:0x00c1, B:37:0x00c6, B:20:0x0052), top: B:43:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:27:0x0080  */
        /* JADX WARN: Code duplicated, block: B:28:0x0081 A[Catch: Exception -> 0x0028, TryCatch #0 {Exception -> 0x0028, blocks: (B:8:0x0023, B:13:0x002f, B:28:0x0081, B:14:0x0033, B:23:0x0067, B:25:0x006d, B:31:0x0096, B:33:0x009a, B:36:0x00c1, B:37:0x00c6, B:20:0x0052), top: B:43:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:30:0x0095  */
        /* JADX WARN: Code duplicated, block: B:31:0x0096 A[Catch: Exception -> 0x0028, TryCatch #0 {Exception -> 0x0028, blocks: (B:8:0x0023, B:13:0x002f, B:28:0x0081, B:14:0x0033, B:23:0x0067, B:25:0x006d, B:31:0x0096, B:33:0x009a, B:36:0x00c1, B:37:0x00c6, B:20:0x0052), top: B:43:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:33:0x009a A[Catch: Exception -> 0x0028, TryCatch #0 {Exception -> 0x0028, blocks: (B:8:0x0023, B:13:0x002f, B:28:0x0081, B:14:0x0033, B:23:0x0067, B:25:0x006d, B:31:0x0096, B:33:0x009a, B:36:0x00c1, B:37:0x00c6, B:20:0x0052), top: B:43:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:35:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:36:0x00c1 A[Catch: Exception -> 0x0028, TryCatch #0 {Exception -> 0x0028, blocks: (B:8:0x0023, B:13:0x002f, B:28:0x0081, B:14:0x0033, B:23:0x0067, B:25:0x006d, B:31:0x0096, B:33:0x009a, B:36:0x00c1, B:37:0x00c6, B:20:0x0052), top: B:43:0x000b }] */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00f1, code lost:
        
            if (r1.emit(r0, r6) == r2) goto L40;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:33:0x009a, please report this as an issue */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instruction units count: 266
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.profile.domain.edit.EditProfileInteractor.C97081.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.profile.domain.edit.EditProfileInteractor$validateEmailField$1 */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.profile.domain.edit.EditProfileInteractor$validateEmailField$1", m100430f = "EditProfileInteractor.kt", m100431l = {395, 398, 404, 410, 413}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C97091 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $email;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ EditProfileInteractor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C97091(String str, EditProfileInteractor editProfileInteractor, InterfaceC30057d<? super C97091> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$email = str;
            this.this$0 = editProfileInteractor;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C97091 c97091 = new C97091(this.$email, this.this$0, interfaceC30057d);
            c97091.L$0 = obj;
            return c97091;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C97091) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:33:0x00de  */
        /* JADX WARN: Code duplicated, block: B:34:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:37:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:38:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:42:0x0109  */
        /* JADX WARN: Code duplicated, block: B:44:0x010d  */
        /* JADX WARN: Code duplicated, block: B:47:0x0125 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:48:0x0126  */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objM108729b;
            InterfaceC34385a interfaceC34385a;
            StateUpdate.EmailValidationCompleted emailValidationCompleted;
            Object objM118137a;
            Boolean bool;
            EditProfileDomainState.EmailValidationResult emailValidationResult;
            StateUpdate.EmailValidationCompleted emailValidationCompleted2;
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!AbstractC39414r.m125890i0(this.$email)) {
                    StateUpdate.EmailValidationStarted emailValidationStarted = new StateUpdate.EmailValidationStarted(this.$email);
                    this.L$0 = interfaceC13062m;
                    this.label = 1;
                    if (interfaceC13062m.emit(emailValidationStarted, this) != enumC31071a) {
                    }
                    return enumC31071a;
                }
                return c23454a0;
            }
            if (i13 == 1) {
                AbstractC34132o.m107864I(obj);
            } else {
                if (i13 == 2) {
                    AbstractC34132o.m107864I(obj);
                    objM108729b = obj;
                    interfaceC34385a = (InterfaceC34385a) objM108729b;
                    if (interfaceC34385a instanceof InterfaceC34385a.c) {
                        C36845b c36845bMo13321a = ((AbstractC14155c) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).mo13321a();
                        InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(Boolean.TYPE);
                        C32236a c32236aM44445Y = AbstractC15751g.m44445Y(AbstractC22671h0.f89337a.getOrCreateKotlinClass(Boolean.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d));
                        this.L$0 = interfaceC13062m;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 3;
                        objM118137a = c36845bMo13321a.m118137a(c32236aM44445Y, this);
                        if (objM118137a != enumC31071a) {
                        }
                    } else {
                        if (interfaceC34385a instanceof InterfaceC34385a.b) {
                            throw new NoWhenBranchMatchedException();
                        }
                        emailValidationCompleted = new StateUpdate.EmailValidationCompleted(this.$email, EditProfileDomainState.EmailValidationResult.NetworkError.INSTANCE);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 5;
                        if (interfaceC13062m.emit(emailValidationCompleted, this) == enumC31071a) {
                            return c23454a0;
                        }
                    }
                    return enumC31071a;
                }
                if (i13 != 3) {
                    if (i13 == 4) {
                    } else if (i13 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                objM118137a = obj;
            }
            if (objM118137a instanceof Boolean) {
                bool = (Boolean) objM118137a;
            } else {
                bool = null;
            }
            if (AbstractC22676k.m65745e(bool, Boolean.FALSE)) {
                emailValidationResult = EditProfileDomainState.EmailValidationResult.Available.INSTANCE;
            } else {
                emailValidationResult = EditProfileDomainState.EmailValidationResult.NotAvailable.INSTANCE;
            }
            emailValidationCompleted2 = new StateUpdate.EmailValidationCompleted(this.$email, emailValidationResult);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 4;
            if (interfaceC13062m.emit(emailValidationCompleted2, this) != enumC31071a) {
                return enumC31071a;
            }
            return c23454a0;
            CheckEmailAvailabilityRequest checkEmailAvailabilityRequest = new CheckEmailAvailabilityRequest(this.$email);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.this$0.logger;
            EditProfileInteractor$validateEmailField$1$apiResult$1 editProfileInteractor$validateEmailField$1$apiResult$1 = new EditProfileInteractor$validateEmailField$1$apiResult$1(this.this$0, checkEmailAvailabilityRequest, null);
            this.L$0 = interfaceC13062m;
            this.L$1 = null;
            this.label = 2;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to validate email", editProfileInteractor$validateEmailField$1$apiResult$1, this, 2, null);
            if (objM108729b != enumC31071a) {
                interfaceC34385a = (InterfaceC34385a) objM108729b;
                if (interfaceC34385a instanceof InterfaceC34385a.c) {
                    C36845b c36845bMo13321a2 = ((AbstractC14155c) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).mo13321a();
                    InterfaceC21456a0 interfaceC21456a0M65691d2 = AbstractC22671h0.m65691d(Boolean.TYPE);
                    C32236a c32236aM44445Y2 = AbstractC15751g.m44445Y(AbstractC22671h0.f89337a.getOrCreateKotlinClass(Boolean.class), interfaceC21456a0M65691d2, AbstractC21478l0.m60396B(interfaceC21456a0M65691d2));
                    this.L$0 = interfaceC13062m;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    objM118137a = c36845bMo13321a2.m118137a(c32236aM44445Y2, this);
                    if (objM118137a != enumC31071a) {
                        if (objM118137a instanceof Boolean) {
                            bool = (Boolean) objM118137a;
                        } else {
                            bool = null;
                        }
                        if (AbstractC22676k.m65745e(bool, Boolean.FALSE)) {
                            emailValidationResult = EditProfileDomainState.EmailValidationResult.Available.INSTANCE;
                        } else {
                            emailValidationResult = EditProfileDomainState.EmailValidationResult.NotAvailable.INSTANCE;
                        }
                        emailValidationCompleted2 = new StateUpdate.EmailValidationCompleted(this.$email, emailValidationResult);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 4;
                        if (interfaceC13062m.emit(emailValidationCompleted2, this) != enumC31071a) {
                            return c23454a0;
                        }
                    }
                } else {
                    if (interfaceC34385a instanceof InterfaceC34385a.b) {
                        throw new NoWhenBranchMatchedException();
                    }
                    emailValidationCompleted = new StateUpdate.EmailValidationCompleted(this.$email, EditProfileDomainState.EmailValidationResult.NetworkError.INSTANCE);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                    if (interfaceC13062m.emit(emailValidationCompleted, this) == enumC31071a) {
                        return c23454a0;
                    }
                }
            }
            return enumC31071a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.profile.domain.edit.EditProfileInteractor$validateUsernameField$1 */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.profile.domain.edit.EditProfileInteractor$validateUsernameField$1", m100430f = "EditProfileInteractor.kt", m100431l = {422, 427, 433, 447, 450, 459}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C97101 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $username;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ EditProfileInteractor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C97101(String str, EditProfileInteractor editProfileInteractor, InterfaceC30057d<? super C97101> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$username = str;
            this.this$0 = editProfileInteractor;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C97101 c97101 = new C97101(this.$username, this.this$0, interfaceC30057d);
            c97101.L$0 = obj;
            return c97101;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C97101) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x00aa A[PHI: r10 r14
          0x00aa: PHI (r10v3 com.whoop.profile.domain.edit.EditProfileInteractor$validateUsernameField$1) = 
          (r10v2 com.whoop.profile.domain.edit.EditProfileInteractor$validateUsernameField$1)
          (r10v4 com.whoop.profile.domain.edit.EditProfileInteractor$validateUsernameField$1)
         binds: [B:21:0x00a6, B:12:0x004f] A[DONT_GENERATE, DONT_INLINE]
          0x00aa: PHI (r14v8 java.lang.Object) = (r14v7 java.lang.Object), (r14v0 java.lang.Object) binds: [B:21:0x00a6, B:12:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:25:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:28:0x00e1 A[PHI: r10 r14
          0x00e1: PHI (r10v5 com.whoop.profile.domain.edit.EditProfileInteractor$validateUsernameField$1) = 
          (r10v3 com.whoop.profile.domain.edit.EditProfileInteractor$validateUsernameField$1)
          (r10v6 com.whoop.profile.domain.edit.EditProfileInteractor$validateUsernameField$1)
         binds: [B:26:0x00dd, B:11:0x0041] A[DONT_GENERATE, DONT_INLINE]
          0x00e1: PHI (r14v19 java.lang.Object) = (r14v18 java.lang.Object), (r14v0 java.lang.Object) binds: [B:26:0x00dd, B:11:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:30:0x00e5  */
        /* JADX WARN: Code duplicated, block: B:31:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:33:0x00eb  */
        /* JADX WARN: Code duplicated, block: B:36:0x00fd  */
        /* JADX WARN: Code duplicated, block: B:39:0x0106  */
        /* JADX WARN: Code duplicated, block: B:40:0x0110  */
        /* JADX WARN: Code duplicated, block: B:42:0x0118  */
        /* JADX WARN: Code duplicated, block: B:43:0x0122  */
        /* JADX WARN: Code duplicated, block: B:44:0x0124 A[ADDED_TO_REGION, REMOVE] */
        /* JADX WARN: Code duplicated, block: B:45:0x012a  */
        /* JADX WARN: Code duplicated, block: B:55:0x0161  */
        /* JADX WARN: Code duplicated, block: B:57:0x0165  */
        /* JADX WARN: Code duplicated, block: B:60:0x0189 A[PHI: r10 r14
          0x0189: PHI (r10v7 com.whoop.profile.domain.edit.EditProfileInteractor$validateUsernameField$1) = 
          (r10v3 com.whoop.profile.domain.edit.EditProfileInteractor$validateUsernameField$1)
          (r10v8 com.whoop.profile.domain.edit.EditProfileInteractor$validateUsernameField$1)
         binds: [B:58:0x0186, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]
          0x0189: PHI (r14v28 java.lang.Object) = (r14v13 java.lang.Object), (r14v0 java.lang.Object) binds: [B:58:0x0186, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:62:0x018d  */
        /* JADX WARN: Code duplicated, block: B:67:0x019a  */
        /* JADX WARN: Code duplicated, block: B:69:0x019d  */
        /* JADX WARN: Code duplicated, block: B:70:0x01a3  */
        /* JADX WARN: Code duplicated, block: B:73:0x01c2 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:74:0x01c3 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:75:0x01c4  */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C97101 c97101;
            InterfaceC34385a interfaceC34385a;
            UsernameCheckV2ResponseBody usernameCheckV2ResponseBody;
            String lowerCase;
            String text;
            EditProfileDomainState.UsernameValidationResult networkError;
            StateUpdate.UsernameValidationCompleted usernameValidationCompleted;
            String status;
            UsernameCheckV2ResponseBody usernameCheckV2ResponseBody2;
            String text2;
            EditProfileDomainState.UsernameValidationResult networkError2;
            StateUpdate.UsernameValidationCompleted usernameValidationCompleted2;
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            C23454a0 c23454a0 = C23454a0.f92919a;
            switch (i13) {
                case 0:
                    AbstractC34132o.m107864I(obj);
                    if (!AbstractC39414r.m125890i0(this.$username)) {
                        StateUpdate.UsernameValidationStarted usernameValidationStarted = new StateUpdate.UsernameValidationStarted(this.$username);
                        this.L$0 = interfaceC13062m;
                        this.label = 1;
                        if (interfaceC13062m.emit(usernameValidationStarted, this) != enumC31071a) {
                            CheckUsernameAvailabilityRequest checkUsernameAvailabilityRequest = new CheckUsernameAvailabilityRequest(this.$username);
                            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                            InterfaceC34116n interfaceC34116n = this.this$0.logger;
                            EditProfileInteractor$validateUsernameField$1$apiResult$1 editProfileInteractor$validateUsernameField$1$apiResult$1 = new EditProfileInteractor$validateUsernameField$1$apiResult$1(this.this$0, checkUsernameAvailabilityRequest, null);
                            this.L$0 = interfaceC13062m;
                            this.L$1 = null;
                            this.label = 2;
                            c97101 = this;
                            obj = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to validate username", editProfileInteractor$validateUsernameField$1$apiResult$1, c97101, 2, null);
                            if (obj != enumC31071a) {
                                interfaceC34385a = (InterfaceC34385a) obj;
                                if (interfaceC34385a instanceof InterfaceC34385a.c) {
                                    C36845b c36845bMo13321a = ((AbstractC14155c) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).mo13321a();
                                    InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(UsernameCheckV2ResponseBody.class);
                                    C32236a c32236aM44445Y = AbstractC15751g.m44445Y(AbstractC22671h0.f89337a.getOrCreateKotlinClass(UsernameCheckV2ResponseBody.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d));
                                    c97101.L$0 = interfaceC13062m;
                                    c97101.L$1 = null;
                                    c97101.L$2 = null;
                                    c97101.label = 3;
                                    obj = c36845bMo13321a.m118137a(c32236aM44445Y, this);
                                    if (obj != enumC31071a) {
                                        if (obj instanceof UsernameCheckV2ResponseBody) {
                                            usernameCheckV2ResponseBody = (UsernameCheckV2ResponseBody) obj;
                                        } else {
                                            usernameCheckV2ResponseBody = null;
                                        }
                                        if (usernameCheckV2ResponseBody != null || (status = usernameCheckV2ResponseBody.getStatus()) == null) {
                                            lowerCase = null;
                                        } else {
                                            lowerCase = status.toLowerCase(Locale.ROOT);
                                            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
                                        }
                                        if (AbstractC22676k.m65745e(lowerCase, "success")) {
                                            networkError = new EditProfileDomainState.UsernameValidationResult.Available(usernameCheckV2ResponseBody.getText());
                                        } else if (AbstractC22676k.m65745e(lowerCase, "error")) {
                                            networkError = new EditProfileDomainState.UsernameValidationResult.NotAvailable(usernameCheckV2ResponseBody.getText());
                                        } else {
                                            networkError = (lowerCase != null || (text = usernameCheckV2ResponseBody.getText()) == null || AbstractC39414r.m125890i0(text)) ? new EditProfileDomainState.UsernameValidationResult.NetworkError(null) : new EditProfileDomainState.UsernameValidationResult.NotAvailable(usernameCheckV2ResponseBody.getText());
                                        }
                                        usernameValidationCompleted = new StateUpdate.UsernameValidationCompleted(c97101.$username, networkError);
                                        c97101.L$0 = null;
                                        c97101.L$1 = null;
                                        c97101.L$2 = null;
                                        c97101.L$3 = null;
                                        c97101.L$4 = null;
                                        c97101.label = 4;
                                        if (interfaceC13062m.emit(usernameValidationCompleted, this) == enumC31071a) {
                                        }
                                    }
                                } else {
                                    if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    C36684a c36684a = c97101.this$0.errorBodyParser;
                                    Exception exception = ((InterfaceC34385a.b) interfaceC34385a).getException();
                                    InterfaceC37138c interfaceC37138cSerializer = UsernameCheckV2ResponseBody.INSTANCE.serializer();
                                    c97101.L$0 = interfaceC13062m;
                                    c97101.L$1 = null;
                                    c97101.L$2 = null;
                                    c97101.label = 5;
                                    obj = c36684a.m117757a(exception, interfaceC37138cSerializer, this);
                                    if (obj != enumC31071a) {
                                        usernameCheckV2ResponseBody2 = (UsernameCheckV2ResponseBody) obj;
                                        if (usernameCheckV2ResponseBody2 != null || (text2 = usernameCheckV2ResponseBody2.getText()) == null || AbstractC39414r.m125890i0(text2)) {
                                            text2 = null;
                                        }
                                        if (text2 != null) {
                                            networkError2 = new EditProfileDomainState.UsernameValidationResult.NotAvailable(text2);
                                        } else {
                                            networkError2 = new EditProfileDomainState.UsernameValidationResult.NetworkError(null);
                                        }
                                        usernameValidationCompleted2 = new StateUpdate.UsernameValidationCompleted(c97101.$username, networkError2);
                                        c97101.L$0 = null;
                                        c97101.L$1 = null;
                                        c97101.L$2 = null;
                                        c97101.L$3 = null;
                                        c97101.L$4 = null;
                                        c97101.label = 6;
                                        if (interfaceC13062m.emit(usernameValidationCompleted2, this) == enumC31071a) {
                                        }
                                    }
                                }
                            }
                        }
                        return enumC31071a;
                    }
                    return c23454a0;
                case 1:
                    AbstractC34132o.m107864I(obj);
                    CheckUsernameAvailabilityRequest checkUsernameAvailabilityRequest2 = new CheckUsernameAvailabilityRequest(this.$username);
                    InterfaceC34385a.Companion companion2 = InterfaceC34385a.INSTANCE;
                    InterfaceC34116n interfaceC34116n2 = this.this$0.logger;
                    EditProfileInteractor$validateUsernameField$1$apiResult$1 editProfileInteractor$validateUsernameField$1$apiResult$2 = new EditProfileInteractor$validateUsernameField$1$apiResult$1(this.this$0, checkUsernameAvailabilityRequest2, null);
                    this.L$0 = interfaceC13062m;
                    this.L$1 = null;
                    this.label = 2;
                    c97101 = this;
                    obj = InterfaceC34385a.Companion.m108729b(companion2, interfaceC34116n2, null, "Failed to validate username", editProfileInteractor$validateUsernameField$1$apiResult$2, c97101, 2, null);
                    if (obj != enumC31071a) {
                        interfaceC34385a = (InterfaceC34385a) obj;
                        if (interfaceC34385a instanceof InterfaceC34385a.c) {
                            C36845b c36845bMo13321a2 = ((AbstractC14155c) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).mo13321a();
                            InterfaceC21456a0 interfaceC21456a0M65691d2 = AbstractC22671h0.m65691d(UsernameCheckV2ResponseBody.class);
                            C32236a c32236aM44445Y2 = AbstractC15751g.m44445Y(AbstractC22671h0.f89337a.getOrCreateKotlinClass(UsernameCheckV2ResponseBody.class), interfaceC21456a0M65691d2, AbstractC21478l0.m60396B(interfaceC21456a0M65691d2));
                            c97101.L$0 = interfaceC13062m;
                            c97101.L$1 = null;
                            c97101.L$2 = null;
                            c97101.label = 3;
                            obj = c36845bMo13321a2.m118137a(c32236aM44445Y2, this);
                            if (obj != enumC31071a) {
                                if (obj instanceof UsernameCheckV2ResponseBody) {
                                    usernameCheckV2ResponseBody = (UsernameCheckV2ResponseBody) obj;
                                } else {
                                    usernameCheckV2ResponseBody = null;
                                }
                                if (usernameCheckV2ResponseBody != null) {
                                    lowerCase = null;
                                } else {
                                    lowerCase = null;
                                }
                                if (AbstractC22676k.m65745e(lowerCase, "success")) {
                                    networkError = new EditProfileDomainState.UsernameValidationResult.Available(usernameCheckV2ResponseBody.getText());
                                } else if (AbstractC22676k.m65745e(lowerCase, "error")) {
                                    networkError = new EditProfileDomainState.UsernameValidationResult.NotAvailable(usernameCheckV2ResponseBody.getText());
                                } else if (lowerCase != null) {
                                    networkError = new EditProfileDomainState.UsernameValidationResult.NetworkError(null);
                                }
                                usernameValidationCompleted = new StateUpdate.UsernameValidationCompleted(c97101.$username, networkError);
                                c97101.L$0 = null;
                                c97101.L$1 = null;
                                c97101.L$2 = null;
                                c97101.L$3 = null;
                                c97101.L$4 = null;
                                c97101.label = 4;
                                if (interfaceC13062m.emit(usernameValidationCompleted, this) == enumC31071a) {
                                    return c23454a0;
                                }
                            }
                        } else {
                            if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            C36684a c36684a2 = c97101.this$0.errorBodyParser;
                            Exception exception2 = ((InterfaceC34385a.b) interfaceC34385a).getException();
                            InterfaceC37138c interfaceC37138cSerializer2 = UsernameCheckV2ResponseBody.INSTANCE.serializer();
                            c97101.L$0 = interfaceC13062m;
                            c97101.L$1 = null;
                            c97101.L$2 = null;
                            c97101.label = 5;
                            obj = c36684a2.m117757a(exception2, interfaceC37138cSerializer2, this);
                            if (obj != enumC31071a) {
                                usernameCheckV2ResponseBody2 = (UsernameCheckV2ResponseBody) obj;
                                if (usernameCheckV2ResponseBody2 != null) {
                                    text2 = null;
                                } else {
                                    text2 = null;
                                }
                                if (text2 != null) {
                                    networkError2 = new EditProfileDomainState.UsernameValidationResult.NotAvailable(text2);
                                } else {
                                    networkError2 = new EditProfileDomainState.UsernameValidationResult.NetworkError(null);
                                }
                                usernameValidationCompleted2 = new StateUpdate.UsernameValidationCompleted(c97101.$username, networkError2);
                                c97101.L$0 = null;
                                c97101.L$1 = null;
                                c97101.L$2 = null;
                                c97101.L$3 = null;
                                c97101.L$4 = null;
                                c97101.label = 6;
                                if (interfaceC13062m.emit(usernameValidationCompleted2, this) == enumC31071a) {
                                    return c23454a0;
                                }
                            }
                        }
                    }
                    return enumC31071a;
                case 2:
                    AbstractC34132o.m107864I(obj);
                    c97101 = this;
                    interfaceC34385a = (InterfaceC34385a) obj;
                    if (interfaceC34385a instanceof InterfaceC34385a.c) {
                        C36845b c36845bMo13321a3 = ((AbstractC14155c) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).mo13321a();
                        InterfaceC21456a0 interfaceC21456a0M65691d3 = AbstractC22671h0.m65691d(UsernameCheckV2ResponseBody.class);
                        C32236a c32236aM44445Y3 = AbstractC15751g.m44445Y(AbstractC22671h0.f89337a.getOrCreateKotlinClass(UsernameCheckV2ResponseBody.class), interfaceC21456a0M65691d3, AbstractC21478l0.m60396B(interfaceC21456a0M65691d3));
                        c97101.L$0 = interfaceC13062m;
                        c97101.L$1 = null;
                        c97101.L$2 = null;
                        c97101.label = 3;
                        obj = c36845bMo13321a3.m118137a(c32236aM44445Y3, this);
                        if (obj != enumC31071a) {
                            if (obj instanceof UsernameCheckV2ResponseBody) {
                                usernameCheckV2ResponseBody = (UsernameCheckV2ResponseBody) obj;
                            } else {
                                usernameCheckV2ResponseBody = null;
                            }
                            if (usernameCheckV2ResponseBody != null) {
                                lowerCase = null;
                            } else {
                                lowerCase = null;
                            }
                            if (AbstractC22676k.m65745e(lowerCase, "success")) {
                                networkError = new EditProfileDomainState.UsernameValidationResult.Available(usernameCheckV2ResponseBody.getText());
                            } else if (AbstractC22676k.m65745e(lowerCase, "error")) {
                                networkError = new EditProfileDomainState.UsernameValidationResult.NotAvailable(usernameCheckV2ResponseBody.getText());
                            } else if (lowerCase != null) {
                                networkError = new EditProfileDomainState.UsernameValidationResult.NetworkError(null);
                            }
                            usernameValidationCompleted = new StateUpdate.UsernameValidationCompleted(c97101.$username, networkError);
                            c97101.L$0 = null;
                            c97101.L$1 = null;
                            c97101.L$2 = null;
                            c97101.L$3 = null;
                            c97101.L$4 = null;
                            c97101.label = 4;
                            if (interfaceC13062m.emit(usernameValidationCompleted, this) == enumC31071a) {
                                return c23454a0;
                            }
                        }
                    } else {
                        if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        C36684a c36684a3 = c97101.this$0.errorBodyParser;
                        Exception exception3 = ((InterfaceC34385a.b) interfaceC34385a).getException();
                        InterfaceC37138c interfaceC37138cSerializer3 = UsernameCheckV2ResponseBody.INSTANCE.serializer();
                        c97101.L$0 = interfaceC13062m;
                        c97101.L$1 = null;
                        c97101.L$2 = null;
                        c97101.label = 5;
                        obj = c36684a3.m117757a(exception3, interfaceC37138cSerializer3, this);
                        if (obj != enumC31071a) {
                            usernameCheckV2ResponseBody2 = (UsernameCheckV2ResponseBody) obj;
                            if (usernameCheckV2ResponseBody2 != null) {
                                text2 = null;
                            } else {
                                text2 = null;
                            }
                            if (text2 != null) {
                                networkError2 = new EditProfileDomainState.UsernameValidationResult.NotAvailable(text2);
                            } else {
                                networkError2 = new EditProfileDomainState.UsernameValidationResult.NetworkError(null);
                            }
                            usernameValidationCompleted2 = new StateUpdate.UsernameValidationCompleted(c97101.$username, networkError2);
                            c97101.L$0 = null;
                            c97101.L$1 = null;
                            c97101.L$2 = null;
                            c97101.L$3 = null;
                            c97101.L$4 = null;
                            c97101.label = 6;
                            if (interfaceC13062m.emit(usernameValidationCompleted2, this) == enumC31071a) {
                                return c23454a0;
                            }
                        }
                    }
                    return enumC31071a;
                case 3:
                    AbstractC34132o.m107864I(obj);
                    c97101 = this;
                    if (obj instanceof UsernameCheckV2ResponseBody) {
                        usernameCheckV2ResponseBody = (UsernameCheckV2ResponseBody) obj;
                    } else {
                        usernameCheckV2ResponseBody = null;
                    }
                    if (usernameCheckV2ResponseBody != null) {
                        lowerCase = null;
                    } else {
                        lowerCase = null;
                    }
                    if (AbstractC22676k.m65745e(lowerCase, "success")) {
                        networkError = new EditProfileDomainState.UsernameValidationResult.Available(usernameCheckV2ResponseBody.getText());
                    } else if (AbstractC22676k.m65745e(lowerCase, "error")) {
                        networkError = new EditProfileDomainState.UsernameValidationResult.NotAvailable(usernameCheckV2ResponseBody.getText());
                    } else if (lowerCase != null) {
                        networkError = new EditProfileDomainState.UsernameValidationResult.NetworkError(null);
                    }
                    usernameValidationCompleted = new StateUpdate.UsernameValidationCompleted(c97101.$username, networkError);
                    c97101.L$0 = null;
                    c97101.L$1 = null;
                    c97101.L$2 = null;
                    c97101.L$3 = null;
                    c97101.L$4 = null;
                    c97101.label = 4;
                    if (interfaceC13062m.emit(usernameValidationCompleted, this) == enumC31071a) {
                        return enumC31071a;
                    }
                    return c23454a0;
                case 4:
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                case 5:
                    AbstractC34132o.m107864I(obj);
                    c97101 = this;
                    usernameCheckV2ResponseBody2 = (UsernameCheckV2ResponseBody) obj;
                    if (usernameCheckV2ResponseBody2 != null) {
                        text2 = null;
                    } else {
                        text2 = null;
                    }
                    if (text2 != null) {
                        networkError2 = new EditProfileDomainState.UsernameValidationResult.NotAvailable(text2);
                    } else {
                        networkError2 = new EditProfileDomainState.UsernameValidationResult.NetworkError(null);
                    }
                    usernameValidationCompleted2 = new StateUpdate.UsernameValidationCompleted(c97101.$username, networkError2);
                    c97101.L$0 = null;
                    c97101.L$1 = null;
                    c97101.L$2 = null;
                    c97101.L$3 = null;
                    c97101.L$4 = null;
                    c97101.label = 6;
                    if (interfaceC13062m.emit(usernameValidationCompleted2, this) == enumC31071a) {
                        return enumC31071a;
                    }
                    return c23454a0;
                case 6:
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public EditProfileInteractor(C34387c apiClient, InterfaceC34116n logger, InterfaceC29494b avatarService, C29104a bootstrapUserSignIn, C36684a errorBodyParser) {
        AbstractC22676k.m65750j(apiClient, "apiClient");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(avatarService, "avatarService");
        AbstractC22676k.m65750j(bootstrapUserSignIn, "bootstrapUserSignIn");
        AbstractC22676k.m65750j(errorBodyParser, "errorBodyParser");
        this.apiClient = apiClient;
        this.logger = logger;
        this.avatarService = avatarService;
        this.bootstrapUserSignIn = bootstrapUserSignIn;
        this.errorBodyParser = errorBodyParser;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UpdateProfileRequest createUpdateRequestFromFormState(EditProfileFormState formState, EditProfileResponse currentResponse) {
        String str;
        Float fM125915y = AbstractC39420x.m125915y(formState.getHeight().getValue());
        float fFloatValue = fM125915y != null ? fM125915y.floatValue() : 0.0f;
        Float fM125915y2 = AbstractC39420x.m125915y(formState.getWeight().getValue());
        float fFloatValue2 = fM125915y2 != null ? fM125915y2.floatValue() : 0.0f;
        String value = formState.getUnitSystem().getValue();
        if (value.length() <= 0) {
            value = null;
        }
        if (value == null) {
            value = currentResponse != null ? currentResponse.getUnitSystem() : null;
            if (value == null) {
                value = "imperial";
            }
        }
        String str2 = value;
        String value2 = formState.getEmail().getValue();
        String value3 = formState.getFirstName().getValue();
        String value4 = formState.getLastName().getValue();
        String value5 = formState.getCountry().getValue();
        Gender genderValueOf = Gender.valueOf(formState.getGender().getValue());
        String value6 = formState.getBirthday().getValue();
        if (value6.length() <= 0) {
            value6 = null;
        }
        if (value6 == null && (currentResponse == null || (value6 = currentResponse.getBirthday()) == null)) {
            value6 = "";
        }
        String str3 = value6;
        String value7 = formState.getUsername().getValue();
        String str4 = value7.length() > 0 ? value7 : null;
        String value8 = formState.getState().getValue();
        String str5 = value8.length() > 0 ? value8 : null;
        String value9 = formState.getCity().getValue();
        if (value9.length() <= 0) {
            value9 = null;
        }
        if (value9 != null) {
            str = value9;
        } else if (currentResponse != null) {
            value9 = currentResponse.getCity();
            str = value9;
        } else {
            str = null;
        }
        String value10 = formState.getPhysiologicalBaseline().getValue();
        if (value10.length() <= 0) {
            value10 = null;
        }
        return new UpdateProfileRequest(value2, str4, value3, value4, value5, str5, str, str3, genderValueOf, value10 != null ? PhysiologicalBaseline.valueOf(value10) : null, fFloatValue, fFloatValue2, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC13058l deleteCurrentUserAvatarFlow() {
        return new C13084s1(new C97021(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC13058l handleRefresh(boolean preserveFormState) {
        return new C13084s1(new C97031(preserveFormState, null));
    }

    public static /* synthetic */ InterfaceC13058l handleRefresh$default(EditProfileInteractor editProfileInteractor, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = false;
        }
        return editProfileInteractor.handleRefresh(z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC13058l handleSave(UpdateProfileRequest updateRequest, EditProfileResponse currentResponse) {
        return new C13084s1(new C97041(updateRequest, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC13058l uploadAvatar(byte[] imageData) {
        return new C13084s1(new C97081(imageData, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC13058l validateEmailField(String email) {
        return new C13084s1(new C97091(email, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC13058l validateUsernameField(String username) {
        return new C13084s1(new C97101(username, this, null));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(new C13060l1(new InternalState(null, false, false, false, null, null, null, null, false, false, null, null, false, false, null, null, false, null, null, 524287, null), AbstractC13091v.m36590P(upstream, new EditProfileInteractor$interact$$inlined$flatMapLatest$1(null, this)), new C97052(null)), new EditProfileInteractor$interact$$inlined$flatMapLatest$2(null, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ EditProfileInteractor(C34387c c34387c, InterfaceC34116n interfaceC34116n, InterfaceC29494b interfaceC29494b, C29104a c29104a, C36684a c36684a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 16) != 0) {
            c36684a = new C36684a(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
        this(c34387c, interfaceC34116n, interfaceC29494b, c29104a, c36684a);
    }
}
