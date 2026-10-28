package com.whoop.profile.presentation.edit;

import android.net.Uri;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import c13.AbstractC3855a;
import com.mapbox.common.HttpHeaders;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.domain.model.UnitSystem;
import ge3.AbstractC15751g;
import hc3.AbstractC17176i;
import ih0.AbstractC18489d0;
import j11.EnumC21213p;
import java.util.Arrays;
import java.util.List;
import jh3.AbstractC21702c;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p736sz0.C33211q0;
import p745y81.InterfaceC39332e;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import t83.InterfaceC33616a;
import te0.AbstractC33745d;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\f789:;<=>?@ABBg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003J\t\u0010,\u001a\u00020\rHÆ\u0003J\t\u0010-\u001a\u00020\u000fHÆ\u0003J\t\u0010.\u001a\u00020\u0011HÆ\u0003J\t\u0010/\u001a\u00020\u0011HÆ\u0003Ji\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001J\u0014\u00101\u001a\u00020\u00112\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00103\u001a\u000204HÖ\u0081\u0004J\n\u00105\u001a\u000206HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0012\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010$R\u0011\u0010%\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b&\u0010$¨\u0006C"}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileViewState;", "", "popUpDialog", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;", "fullScreenModal", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;", "profileData", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;", "editableFields", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;", "avatarState", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;", "emailValidationState", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;", "usernameValidationState", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;", "showUsernameField", "", "isUsernameFieldEditable", "<init>", "(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;ZZ)V", "getPopUpDialog", "()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;", "getFullScreenModal", "()Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;", "getProfileData", "()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;", "getEditableFields", "()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;", "getAvatarState", "()Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;", "getEmailValidationState", "()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;", "getUsernameValidationState", "()Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;", "getShowUsernameField", "()Z", "canSave", "getCanSave", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "", "EditableFieldState", "EditableFields", "EditProfileData", "ValidationRanges", "Country", "State", "FullScreenModal", "EditProfileDialogState", "BottomSheetType", "AvatarViewState", "EmailValidationViewState", "UsernameValidationViewState", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class EditProfileViewState {
    public static final int $stable = 8;
    private final AvatarViewState avatarState;
    private final EditableFields editableFields;
    private final EmailValidationViewState emailValidationState;
    private final FullScreenModal fullScreenModal;
    private final boolean isUsernameFieldEditable;
    private final EditProfileDialogState popUpDialog;
    private final EditProfileData profileData;
    private final boolean showUsernameField;
    private final UsernameValidationViewState usernameValidationState;

    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u007f\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0014\u0010+\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010-\u001a\u00020.HÖ\u0081\u0004J\n\u0010/\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00060"}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;", "", "isUploading", "", "uploadSuccess", "uploadError", "", "currentAvatarUrl", "isEditingAvatar", "selectedImageUri", "Landroid/net/Uri;", "isInCropMode", "showUploadingModal", "showSuccessModal", "showErrorModal", "pendingRetryData", "", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;ZLandroid/net/Uri;ZZZZ[B)V", "()Z", "getUploadSuccess", "getUploadError", "()Ljava/lang/String;", "getCurrentAvatarUrl", "getSelectedImageUri", "()Landroid/net/Uri;", "getShowUploadingModal", "getShowSuccessModal", "getShowErrorModal", "getPendingRetryData", "()[B", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class AvatarViewState {
        public static final int $stable = 8;
        private final String currentAvatarUrl;
        private final boolean isEditingAvatar;
        private final boolean isInCropMode;
        private final boolean isUploading;
        private final byte[] pendingRetryData;
        private final Uri selectedImageUri;
        private final boolean showErrorModal;
        private final boolean showSuccessModal;
        private final boolean showUploadingModal;
        private final String uploadError;
        private final boolean uploadSuccess;

        public AvatarViewState() {
            this(false, false, null, null, false, null, false, false, false, false, null, 2047, null);
        }

        public static /* synthetic */ AvatarViewState copy$default(AvatarViewState avatarViewState, boolean z4, boolean z13, String str, String str2, boolean z14, Uri uri, boolean z15, boolean z16, boolean z17, boolean z18, byte[] bArr, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z4 = avatarViewState.isUploading;
            }
            if ((i13 & 2) != 0) {
                z13 = avatarViewState.uploadSuccess;
            }
            if ((i13 & 4) != 0) {
                str = avatarViewState.uploadError;
            }
            if ((i13 & 8) != 0) {
                str2 = avatarViewState.currentAvatarUrl;
            }
            if ((i13 & 16) != 0) {
                z14 = avatarViewState.isEditingAvatar;
            }
            if ((i13 & 32) != 0) {
                uri = avatarViewState.selectedImageUri;
            }
            if ((i13 & 64) != 0) {
                z15 = avatarViewState.isInCropMode;
            }
            if ((i13 & 128) != 0) {
                z16 = avatarViewState.showUploadingModal;
            }
            if ((i13 & 256) != 0) {
                z17 = avatarViewState.showSuccessModal;
            }
            if ((i13 & 512) != 0) {
                z18 = avatarViewState.showErrorModal;
            }
            if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                bArr = avatarViewState.pendingRetryData;
            }
            boolean z19 = z18;
            byte[] bArr2 = bArr;
            boolean z24 = z16;
            boolean z25 = z17;
            Uri uri2 = uri;
            boolean z26 = z15;
            boolean z27 = z14;
            String str3 = str;
            return avatarViewState.copy(z4, z13, str3, str2, z27, uri2, z26, z24, z25, z19, bArr2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsUploading() {
            return this.isUploading;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final boolean getShowErrorModal() {
            return this.showErrorModal;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final byte[] getPendingRetryData() {
            return this.pendingRetryData;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getUploadSuccess() {
            return this.uploadSuccess;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getUploadError() {
            return this.uploadError;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getCurrentAvatarUrl() {
            return this.currentAvatarUrl;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getIsEditingAvatar() {
            return this.isEditingAvatar;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Uri getSelectedImageUri() {
            return this.selectedImageUri;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final boolean getIsInCropMode() {
            return this.isInCropMode;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final boolean getShowUploadingModal() {
            return this.showUploadingModal;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final boolean getShowSuccessModal() {
            return this.showSuccessModal;
        }

        public final AvatarViewState copy(boolean isUploading, boolean uploadSuccess, String uploadError, String currentAvatarUrl, boolean isEditingAvatar, Uri selectedImageUri, boolean isInCropMode, boolean showUploadingModal, boolean showSuccessModal, boolean showErrorModal, byte[] pendingRetryData) {
            return new AvatarViewState(isUploading, uploadSuccess, uploadError, currentAvatarUrl, isEditingAvatar, selectedImageUri, isInCropMode, showUploadingModal, showSuccessModal, showErrorModal, pendingRetryData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AvatarViewState)) {
                return false;
            }
            AvatarViewState avatarViewState = (AvatarViewState) other;
            return this.isUploading == avatarViewState.isUploading && this.uploadSuccess == avatarViewState.uploadSuccess && AbstractC22676k.m65745e(this.uploadError, avatarViewState.uploadError) && AbstractC22676k.m65745e(this.currentAvatarUrl, avatarViewState.currentAvatarUrl) && this.isEditingAvatar == avatarViewState.isEditingAvatar && AbstractC22676k.m65745e(this.selectedImageUri, avatarViewState.selectedImageUri) && this.isInCropMode == avatarViewState.isInCropMode && this.showUploadingModal == avatarViewState.showUploadingModal && this.showSuccessModal == avatarViewState.showSuccessModal && this.showErrorModal == avatarViewState.showErrorModal && AbstractC22676k.m65745e(this.pendingRetryData, avatarViewState.pendingRetryData);
        }

        public final String getCurrentAvatarUrl() {
            return this.currentAvatarUrl;
        }

        public final byte[] getPendingRetryData() {
            return this.pendingRetryData;
        }

        public final Uri getSelectedImageUri() {
            return this.selectedImageUri;
        }

        public final boolean getShowErrorModal() {
            return this.showErrorModal;
        }

        public final boolean getShowSuccessModal() {
            return this.showSuccessModal;
        }

        public final boolean getShowUploadingModal() {
            return this.showUploadingModal;
        }

        public final String getUploadError() {
            return this.uploadError;
        }

        public final boolean getUploadSuccess() {
            return this.uploadSuccess;
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(Boolean.hashCode(this.isUploading) * 31, 31, this.uploadSuccess);
            String str = this.uploadError;
            int iHashCode = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.currentAvatarUrl;
            int iM8289b2 = AbstractC2875y.m8289b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isEditingAvatar);
            Uri uri = this.selectedImageUri;
            int iM8289b3 = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM8289b2 + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.isInCropMode), 31, this.showUploadingModal), 31, this.showSuccessModal), 31, this.showErrorModal);
            byte[] bArr = this.pendingRetryData;
            return iM8289b3 + (bArr != null ? Arrays.hashCode(bArr) : 0);
        }

        public final boolean isEditingAvatar() {
            return this.isEditingAvatar;
        }

        public final boolean isInCropMode() {
            return this.isInCropMode;
        }

        public final boolean isUploading() {
            return this.isUploading;
        }

        public String toString() {
            boolean z4 = this.isUploading;
            boolean z13 = this.uploadSuccess;
            String str = this.uploadError;
            String str2 = this.currentAvatarUrl;
            boolean z14 = this.isEditingAvatar;
            Uri uri = this.selectedImageUri;
            boolean z15 = this.isInCropMode;
            boolean z16 = this.showUploadingModal;
            boolean z17 = this.showSuccessModal;
            boolean z18 = this.showErrorModal;
            String string = Arrays.toString(this.pendingRetryData);
            StringBuilder sbM32002u = AbstractC11895b.m32002u("AvatarViewState(isUploading=", ", uploadSuccess=", ", uploadError=", z4, z13);
            AbstractC11266d.m30444B(sbM32002u, str, ", currentAvatarUrl=", str2, ", isEditingAvatar=");
            sbM32002u.append(z14);
            sbM32002u.append(", selectedImageUri=");
            sbM32002u.append(uri);
            sbM32002u.append(", isInCropMode=");
            AbstractC38963t7.m124392v(sbM32002u, z15, ", showUploadingModal=", z16, ", showSuccessModal=");
            AbstractC38963t7.m124392v(sbM32002u, z17, ", showErrorModal=", z18, ", pendingRetryData=");
            return AbstractC25012a.m73376i(string, ")", sbM32002u);
        }

        public AvatarViewState(boolean z4, boolean z13, String str, String str2, boolean z14, Uri uri, boolean z15, boolean z16, boolean z17, boolean z18, byte[] bArr) {
            this.isUploading = z4;
            this.uploadSuccess = z13;
            this.uploadError = str;
            this.currentAvatarUrl = str2;
            this.isEditingAvatar = z14;
            this.selectedImageUri = uri;
            this.isInCropMode = z15;
            this.showUploadingModal = z16;
            this.showSuccessModal = z17;
            this.showErrorModal = z18;
            this.pendingRetryData = bArr;
        }

        public /* synthetic */ AvatarViewState(boolean z4, boolean z13, String str, String str2, boolean z14, Uri uri, boolean z15, boolean z16, boolean z17, boolean z18, byte[] bArr, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? false : z14, (i13 & 32) != 0 ? null : uri, (i13 & 64) != 0 ? false : z15, (i13 & 128) != 0 ? false : z16, (i13 & 256) != 0 ? false : z17, (i13 & 512) != 0 ? false : z18, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : bArr);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;", "", "<init>", "(Ljava/lang/String;I)V", "COUNTRY", "STATE", "GENDER", "PHYSIOLOGICAL_BASELINE", "UNITS", "HEIGHT", "WEIGHT", "AVATAR", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum BottomSheetType {
        COUNTRY,
        STATE,
        GENDER,
        PHYSIOLOGICAL_BASELINE,
        UNITS,
        HEIGHT,
        WEIGHT,
        AVATAR;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;", "", "name", "Lcom/whoop/design/util/TextResource;", "countryCode", "", "countryFlag", "ageLimit", "states", "", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getName", "()Lcom/whoop/design/util/TextResource;", "getCountryCode", "()Ljava/lang/String;", "getCountryFlag", "getAgeLimit", "getStates", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class Country {
        public static final int $stable = 8;
        private final String ageLimit;
        private final String countryCode;
        private final String countryFlag;
        private final TextResource name;
        private final List<State> states;

        public Country(TextResource name, String countryCode, String countryFlag, String ageLimit, List<State> states) {
            AbstractC22676k.m65750j(name, "name");
            AbstractC22676k.m65750j(countryCode, "countryCode");
            AbstractC22676k.m65750j(countryFlag, "countryFlag");
            AbstractC22676k.m65750j(ageLimit, "ageLimit");
            AbstractC22676k.m65750j(states, "states");
            this.name = name;
            this.countryCode = countryCode;
            this.countryFlag = countryFlag;
            this.ageLimit = ageLimit;
            this.states = states;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Country copy$default(Country country, TextResource textResource, String str, String str2, String str3, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                textResource = country.name;
            }
            if ((i13 & 2) != 0) {
                str = country.countryCode;
            }
            if ((i13 & 4) != 0) {
                str2 = country.countryFlag;
            }
            if ((i13 & 8) != 0) {
                str3 = country.ageLimit;
            }
            if ((i13 & 16) != 0) {
                list = country.states;
            }
            List list2 = list;
            String str4 = str2;
            return country.copy(textResource, str, str4, str3, list2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final TextResource getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCountryCode() {
            return this.countryCode;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCountryFlag() {
            return this.countryFlag;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getAgeLimit() {
            return this.ageLimit;
        }

        public final List<State> component5() {
            return this.states;
        }

        public final Country copy(TextResource name, String countryCode, String countryFlag, String ageLimit, List<State> states) {
            AbstractC22676k.m65750j(name, "name");
            AbstractC22676k.m65750j(countryCode, "countryCode");
            AbstractC22676k.m65750j(countryFlag, "countryFlag");
            AbstractC22676k.m65750j(ageLimit, "ageLimit");
            AbstractC22676k.m65750j(states, "states");
            return new Country(name, countryCode, countryFlag, ageLimit, states);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Country)) {
                return false;
            }
            Country country = (Country) other;
            return AbstractC22676k.m65745e(this.name, country.name) && AbstractC22676k.m65745e(this.countryCode, country.countryCode) && AbstractC22676k.m65745e(this.countryFlag, country.countryFlag) && AbstractC22676k.m65745e(this.ageLimit, country.ageLimit) && AbstractC22676k.m65745e(this.states, country.states);
        }

        public final String getAgeLimit() {
            return this.ageLimit;
        }

        public final String getCountryCode() {
            return this.countryCode;
        }

        public final String getCountryFlag() {
            return this.countryFlag;
        }

        public final TextResource getName() {
            return this.name;
        }

        public final List<State> getStates() {
            return this.states;
        }

        public int hashCode() {
            return this.states.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.name.hashCode() * 31, 31, this.countryCode), 31, this.countryFlag), 31, this.ageLimit);
        }

        public String toString() {
            TextResource textResource = this.name;
            String str = this.countryCode;
            String str2 = this.countryFlag;
            String str3 = this.ageLimit;
            List<State> list = this.states;
            StringBuilder sbM91845o = AbstractC30007c.m91845o("Country(name=", textResource, ", countryCode=", str, ", countryFlag=");
            AbstractC11266d.m30444B(sbM91845o, str2, ", ageLimit=", str3, ", states=");
            return AbstractC3855a.m11829m(sbM91845o, list, ")");
        }
    }

    @Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b<\b\u0087\b\u0018\u00002\u00020\u0001B½\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\u0004\b\"\u0010#J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u000eHÆ\u0003J\t\u0010M\u001a\u00020\u0010HÆ\u0003J\t\u0010N\u001a\u00020\u0012HÆ\u0003J\t\u0010O\u001a\u00020\u0014HÆ\u0003J\t\u0010P\u001a\u00020\u0016HÆ\u0003J\t\u0010Q\u001a\u00020\u000eHÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u001aHÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u001eHÆ\u0003J\u000f\u0010W\u001a\b\u0012\u0004\u0012\u00020!0 HÆ\u0003Jé\u0001\u0010X\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 HÆ\u0001J\u0014\u0010Y\u001a\u00020\u00122\b\u0010Z\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010[\u001a\u00020\u0010HÖ\u0081\u0004J\n\u0010\\\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010%R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010%R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\u0017\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b9\u00100R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010%R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010%R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010%R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\b\n\u0000\u001a\u0004\bA\u0010B¨\u0006]"}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;", "", "title", "Lcom/whoop/design/util/TextResource;", "avatarUrl", "", "firstName", "lastName", "username", NotificationCompat.CATEGORY_EMAIL, "city", "country", "state", "memberSince", "", HttpHeaders.AGE, "", "foundingMember", "", "userId", "", "height", "", "weight", "birthday", "unitSystem", "Lcom/whoop/domain/model/UnitSystem;", "gender", "physiologicalBaseline", "validationRanges", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;", "countries", "", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;DIZJFDLcom/whoop/design/util/TextResource;Lcom/whoop/domain/model/UnitSystem;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;Ljava/util/List;)V", "getTitle", "()Lcom/whoop/design/util/TextResource;", "getAvatarUrl", "()Ljava/lang/String;", "getFirstName", "getLastName", "getUsername", "getEmail", "getCity", "getCountry", "getState", "getMemberSince", "()D", "getAge", "()I", "getFoundingMember", "()Z", "getUserId", "()J", "getHeight", "()F", "getWeight", "getBirthday", "getUnitSystem", "()Lcom/whoop/domain/model/UnitSystem;", "getGender", "getPhysiologicalBaseline", "getValidationRanges", "()Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;", "getCountries", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "equals", "other", "hashCode", "toString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class EditProfileData {
        public static final int $stable = 8;
        private final int age;
        private final String avatarUrl;
        private final TextResource birthday;
        private final TextResource city;
        private final List<Country> countries;
        private final TextResource country;
        private final TextResource email;
        private final TextResource firstName;
        private final boolean foundingMember;
        private final TextResource gender;
        private final float height;
        private final TextResource lastName;
        private final double memberSince;
        private final TextResource physiologicalBaseline;
        private final TextResource state;
        private final TextResource title;
        private final UnitSystem unitSystem;
        private final long userId;
        private final TextResource username;
        private final ValidationRanges validationRanges;
        private final double weight;

        public EditProfileData(TextResource title, String str, TextResource firstName, TextResource lastName, TextResource username, TextResource textResource, TextResource textResource2, TextResource country, TextResource textResource3, double d3, int i13, boolean z4, long j7, float f13, double d14, TextResource birthday, UnitSystem unitSystem, TextResource gender, TextResource physiologicalBaseline, ValidationRanges validationRanges, List<Country> countries) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(firstName, "firstName");
            AbstractC22676k.m65750j(lastName, "lastName");
            AbstractC22676k.m65750j(username, "username");
            AbstractC22676k.m65750j(country, "country");
            AbstractC22676k.m65750j(birthday, "birthday");
            AbstractC22676k.m65750j(unitSystem, "unitSystem");
            AbstractC22676k.m65750j(gender, "gender");
            AbstractC22676k.m65750j(physiologicalBaseline, "physiologicalBaseline");
            AbstractC22676k.m65750j(validationRanges, "validationRanges");
            AbstractC22676k.m65750j(countries, "countries");
            this.title = title;
            this.avatarUrl = str;
            this.firstName = firstName;
            this.lastName = lastName;
            this.username = username;
            this.email = textResource;
            this.city = textResource2;
            this.country = country;
            this.state = textResource3;
            this.memberSince = d3;
            this.age = i13;
            this.foundingMember = z4;
            this.userId = j7;
            this.height = f13;
            this.weight = d14;
            this.birthday = birthday;
            this.unitSystem = unitSystem;
            this.gender = gender;
            this.physiologicalBaseline = physiologicalBaseline;
            this.validationRanges = validationRanges;
            this.countries = countries;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EditProfileData copy$default(EditProfileData editProfileData, TextResource textResource, String str, TextResource textResource2, TextResource textResource3, TextResource textResource4, TextResource textResource5, TextResource textResource6, TextResource textResource7, TextResource textResource8, double d3, int i13, boolean z4, long j7, float f13, double d14, TextResource textResource9, UnitSystem unitSystem, TextResource textResource10, TextResource textResource11, ValidationRanges validationRanges, List list, int i14, Object obj) {
            List list2;
            ValidationRanges validationRanges2;
            TextResource textResource12 = (i14 & 1) != 0 ? editProfileData.title : textResource;
            String str2 = (i14 & 2) != 0 ? editProfileData.avatarUrl : str;
            TextResource textResource13 = (i14 & 4) != 0 ? editProfileData.firstName : textResource2;
            TextResource textResource14 = (i14 & 8) != 0 ? editProfileData.lastName : textResource3;
            TextResource textResource15 = (i14 & 16) != 0 ? editProfileData.username : textResource4;
            TextResource textResource16 = (i14 & 32) != 0 ? editProfileData.email : textResource5;
            TextResource textResource17 = (i14 & 64) != 0 ? editProfileData.city : textResource6;
            TextResource textResource18 = (i14 & 128) != 0 ? editProfileData.country : textResource7;
            TextResource textResource19 = (i14 & 256) != 0 ? editProfileData.state : textResource8;
            double d15 = (i14 & 512) != 0 ? editProfileData.memberSince : d3;
            int i15 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? editProfileData.age : i13;
            boolean z13 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? editProfileData.foundingMember : z4;
            TextResource textResource20 = textResource12;
            String str3 = str2;
            long j13 = (i14 & 4096) != 0 ? editProfileData.userId : j7;
            float f14 = (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? editProfileData.height : f13;
            long j14 = j13;
            double d16 = (i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? editProfileData.weight : d14;
            TextResource textResource21 = (i14 & 32768) != 0 ? editProfileData.birthday : textResource9;
            UnitSystem unitSystem2 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? editProfileData.unitSystem : unitSystem;
            TextResource textResource22 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? editProfileData.gender : textResource10;
            TextResource textResource23 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? editProfileData.physiologicalBaseline : textResource11;
            ValidationRanges validationRanges3 = (i14 & 524288) != 0 ? editProfileData.validationRanges : validationRanges;
            if ((i14 & 1048576) != 0) {
                validationRanges2 = validationRanges3;
                list2 = editProfileData.countries;
            } else {
                list2 = list;
                validationRanges2 = validationRanges3;
            }
            return editProfileData.copy(textResource20, str3, textResource13, textResource14, textResource15, textResource16, textResource17, textResource18, textResource19, d15, i15, z13, j14, f14, d16, textResource21, unitSystem2, textResource22, textResource23, validationRanges2, list2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final double getMemberSince() {
            return this.memberSince;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final int getAge() {
            return this.age;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final boolean getFoundingMember() {
            return this.foundingMember;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final long getUserId() {
            return this.userId;
        }

        /* JADX INFO: renamed from: component14, reason: from getter */
        public final float getHeight() {
            return this.height;
        }

        /* JADX INFO: renamed from: component15, reason: from getter */
        public final double getWeight() {
            return this.weight;
        }

        /* JADX INFO: renamed from: component16, reason: from getter */
        public final TextResource getBirthday() {
            return this.birthday;
        }

        /* JADX INFO: renamed from: component17, reason: from getter */
        public final UnitSystem getUnitSystem() {
            return this.unitSystem;
        }

        /* JADX INFO: renamed from: component18, reason: from getter */
        public final TextResource getGender() {
            return this.gender;
        }

        /* JADX INFO: renamed from: component19, reason: from getter */
        public final TextResource getPhysiologicalBaseline() {
            return this.physiologicalBaseline;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        /* JADX INFO: renamed from: component20, reason: from getter */
        public final ValidationRanges getValidationRanges() {
            return this.validationRanges;
        }

        public final List<Country> component21() {
            return this.countries;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final TextResource getFirstName() {
            return this.firstName;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final TextResource getLastName() {
            return this.lastName;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final TextResource getUsername() {
            return this.username;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final TextResource getEmail() {
            return this.email;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final TextResource getCity() {
            return this.city;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final TextResource getCountry() {
            return this.country;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final TextResource getState() {
            return this.state;
        }

        public final EditProfileData copy(TextResource title, String avatarUrl, TextResource firstName, TextResource lastName, TextResource username, TextResource email, TextResource city, TextResource country, TextResource state, double memberSince, int age, boolean foundingMember, long userId, float height, double weight, TextResource birthday, UnitSystem unitSystem, TextResource gender, TextResource physiologicalBaseline, ValidationRanges validationRanges, List<Country> countries) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(firstName, "firstName");
            AbstractC22676k.m65750j(lastName, "lastName");
            AbstractC22676k.m65750j(username, "username");
            AbstractC22676k.m65750j(country, "country");
            AbstractC22676k.m65750j(birthday, "birthday");
            AbstractC22676k.m65750j(unitSystem, "unitSystem");
            AbstractC22676k.m65750j(gender, "gender");
            AbstractC22676k.m65750j(physiologicalBaseline, "physiologicalBaseline");
            AbstractC22676k.m65750j(validationRanges, "validationRanges");
            AbstractC22676k.m65750j(countries, "countries");
            return new EditProfileData(title, avatarUrl, firstName, lastName, username, email, city, country, state, memberSince, age, foundingMember, userId, height, weight, birthday, unitSystem, gender, physiologicalBaseline, validationRanges, countries);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EditProfileData)) {
                return false;
            }
            EditProfileData editProfileData = (EditProfileData) other;
            return AbstractC22676k.m65745e(this.title, editProfileData.title) && AbstractC22676k.m65745e(this.avatarUrl, editProfileData.avatarUrl) && AbstractC22676k.m65745e(this.firstName, editProfileData.firstName) && AbstractC22676k.m65745e(this.lastName, editProfileData.lastName) && AbstractC22676k.m65745e(this.username, editProfileData.username) && AbstractC22676k.m65745e(this.email, editProfileData.email) && AbstractC22676k.m65745e(this.city, editProfileData.city) && AbstractC22676k.m65745e(this.country, editProfileData.country) && AbstractC22676k.m65745e(this.state, editProfileData.state) && Double.compare(this.memberSince, editProfileData.memberSince) == 0 && this.age == editProfileData.age && this.foundingMember == editProfileData.foundingMember && this.userId == editProfileData.userId && Float.compare(this.height, editProfileData.height) == 0 && Double.compare(this.weight, editProfileData.weight) == 0 && AbstractC22676k.m65745e(this.birthday, editProfileData.birthday) && this.unitSystem == editProfileData.unitSystem && AbstractC22676k.m65745e(this.gender, editProfileData.gender) && AbstractC22676k.m65745e(this.physiologicalBaseline, editProfileData.physiologicalBaseline) && AbstractC22676k.m65745e(this.validationRanges, editProfileData.validationRanges) && AbstractC22676k.m65745e(this.countries, editProfileData.countries);
        }

        public final int getAge() {
            return this.age;
        }

        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        public final TextResource getBirthday() {
            return this.birthday;
        }

        public final TextResource getCity() {
            return this.city;
        }

        public final List<Country> getCountries() {
            return this.countries;
        }

        public final TextResource getCountry() {
            return this.country;
        }

        public final TextResource getEmail() {
            return this.email;
        }

        public final TextResource getFirstName() {
            return this.firstName;
        }

        public final boolean getFoundingMember() {
            return this.foundingMember;
        }

        public final TextResource getGender() {
            return this.gender;
        }

        public final float getHeight() {
            return this.height;
        }

        public final TextResource getLastName() {
            return this.lastName;
        }

        public final double getMemberSince() {
            return this.memberSince;
        }

        public final TextResource getPhysiologicalBaseline() {
            return this.physiologicalBaseline;
        }

        public final TextResource getState() {
            return this.state;
        }

        public final TextResource getTitle() {
            return this.title;
        }

        public final UnitSystem getUnitSystem() {
            return this.unitSystem;
        }

        public final long getUserId() {
            return this.userId;
        }

        public final TextResource getUsername() {
            return this.username;
        }

        public final ValidationRanges getValidationRanges() {
            return this.validationRanges;
        }

        public final double getWeight() {
            return this.weight;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.avatarUrl;
            int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, this.firstName, 31), this.lastName, 31), this.username, 31);
            TextResource textResource = this.email;
            int iHashCode2 = (iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31;
            TextResource textResource2 = this.city;
            int iM95625a2 = AbstractC31061c.m95625a((iHashCode2 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31, this.country, 31);
            TextResource textResource3 = this.state;
            return this.countries.hashCode() + ((this.validationRanges.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a((this.unitSystem.hashCode() + AbstractC31061c.m95625a(AbstractC17176i.m48499a(AbstractC11266d.m30447a(this.height, AbstractC11266d.m30451e(AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.age, AbstractC17176i.m48499a((iM95625a2 + (textResource3 != null ? textResource3.hashCode() : 0)) * 31, 31, this.memberSince), 31), 31, this.foundingMember), this.userId, 31), 31), 31, this.weight), this.birthday, 31)) * 31, this.gender, 31), this.physiologicalBaseline, 31)) * 31);
        }

        public String toString() {
            TextResource textResource = this.title;
            String str = this.avatarUrl;
            TextResource textResource2 = this.firstName;
            TextResource textResource3 = this.lastName;
            TextResource textResource4 = this.username;
            TextResource textResource5 = this.email;
            TextResource textResource6 = this.city;
            TextResource textResource7 = this.country;
            TextResource textResource8 = this.state;
            double d3 = this.memberSince;
            int i13 = this.age;
            boolean z4 = this.foundingMember;
            long j7 = this.userId;
            float f13 = this.height;
            double d14 = this.weight;
            TextResource textResource9 = this.birthday;
            UnitSystem unitSystem = this.unitSystem;
            TextResource textResource10 = this.gender;
            TextResource textResource11 = this.physiologicalBaseline;
            ValidationRanges validationRanges = this.validationRanges;
            List<Country> list = this.countries;
            StringBuilder sbM91845o = AbstractC30007c.m91845o("EditProfileData(title=", textResource, ", avatarUrl=", str, ", firstName=");
            AbstractC30007c.m91855y(sbM91845o, textResource2, ", lastName=", textResource3, ", username=");
            AbstractC30007c.m91855y(sbM91845o, textResource4, ", email=", textResource5, ", city=");
            AbstractC30007c.m91855y(sbM91845o, textResource6, ", country=", textResource7, ", state=");
            sbM91845o.append(textResource8);
            sbM91845o.append(", memberSince=");
            sbM91845o.append(d3);
            sbM91845o.append(", age=");
            sbM91845o.append(i13);
            sbM91845o.append(", foundingMember=");
            sbM91845o.append(z4);
            AbstractC2875y.m8285A(sbM91845o, ", userId=", j7, ", height=");
            sbM91845o.append(f13);
            sbM91845o.append(", weight=");
            sbM91845o.append(d14);
            sbM91845o.append(", birthday=");
            sbM91845o.append(textResource9);
            sbM91845o.append(", unitSystem=");
            sbM91845o.append(unitSystem);
            sbM91845o.append(", gender=");
            sbM91845o.append(textResource10);
            sbM91845o.append(", physiologicalBaseline=");
            sbM91845o.append(textResource11);
            sbM91845o.append(", validationRanges=");
            sbM91845o.append(validationRanges);
            sbM91845o.append(", countries=");
            sbM91845o.append(list);
            sbM91845o.append(")");
            return sbM91845o.toString();
        }
    }

    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000e¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;", "", "value", "", "isDirty", "", "isFocused", "errorMessage", "Lcom/whoop/design/util/TextResource;", "isLocked", "<init>", "(Ljava/lang/String;ZZLcom/whoop/design/util/TextResource;Z)V", "getValue", "()Ljava/lang/String;", "()Z", "getErrorMessage", "()Lcom/whoop/design/util/TextResource;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class EditableFieldState {
        public static final int $stable = TextResource.$stable;
        private final TextResource errorMessage;
        private final boolean isDirty;
        private final boolean isFocused;
        private final boolean isLocked;
        private final String value;

        public EditableFieldState() {
            this(null, false, false, null, false, 31, null);
        }

        public static /* synthetic */ EditableFieldState copy$default(EditableFieldState editableFieldState, String str, boolean z4, boolean z13, TextResource textResource, boolean z14, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = editableFieldState.value;
            }
            if ((i13 & 2) != 0) {
                z4 = editableFieldState.isDirty;
            }
            if ((i13 & 4) != 0) {
                z13 = editableFieldState.isFocused;
            }
            if ((i13 & 8) != 0) {
                textResource = editableFieldState.errorMessage;
            }
            if ((i13 & 16) != 0) {
                z14 = editableFieldState.isLocked;
            }
            boolean z15 = z14;
            boolean z16 = z13;
            return editableFieldState.copy(str, z4, z16, textResource, z15);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsDirty() {
            return this.isDirty;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsFocused() {
            return this.isFocused;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final TextResource getErrorMessage() {
            return this.errorMessage;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getIsLocked() {
            return this.isLocked;
        }

        public final EditableFieldState copy(String value, boolean isDirty, boolean isFocused, TextResource errorMessage, boolean isLocked) {
            AbstractC22676k.m65750j(value, "value");
            AbstractC22676k.m65750j(errorMessage, "errorMessage");
            return new EditableFieldState(value, isDirty, isFocused, errorMessage, isLocked);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EditableFieldState)) {
                return false;
            }
            EditableFieldState editableFieldState = (EditableFieldState) other;
            return AbstractC22676k.m65745e(this.value, editableFieldState.value) && this.isDirty == editableFieldState.isDirty && this.isFocused == editableFieldState.isFocused && AbstractC22676k.m65745e(this.errorMessage, editableFieldState.errorMessage) && this.isLocked == editableFieldState.isLocked;
        }

        public final TextResource getErrorMessage() {
            return this.errorMessage;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isLocked) + AbstractC31061c.m95625a(AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.value.hashCode() * 31, 31, this.isDirty), 31, this.isFocused), this.errorMessage, 31);
        }

        public final boolean isDirty() {
            return this.isDirty;
        }

        public final boolean isFocused() {
            return this.isFocused;
        }

        public final boolean isLocked() {
            return this.isLocked;
        }

        public String toString() {
            String str = this.value;
            boolean z4 = this.isDirty;
            boolean z13 = this.isFocused;
            TextResource textResource = this.errorMessage;
            boolean z14 = this.isLocked;
            StringBuilder sbM73379l = AbstractC25012a.m73379l("EditableFieldState(value=", str, ", isDirty=", ", isFocused=", z4);
            AbstractC21702c.m61144o(textResource, ", errorMessage=", ", isLocked=", sbM73379l, z13);
            return AbstractC18489d0.m53372m(sbM73379l, z14, ")");
        }

        public EditableFieldState(String value, boolean z4, boolean z13, TextResource errorMessage, boolean z14) {
            AbstractC22676k.m65750j(value, "value");
            AbstractC22676k.m65750j(errorMessage, "errorMessage");
            this.value = value;
            this.isDirty = z4;
            this.isFocused = z13;
            this.errorMessage = errorMessage;
            this.isLocked = z14;
        }

        public /* synthetic */ EditableFieldState(String str, boolean z4, boolean z13, TextResource textResource, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 16) != 0 ? false : z14);
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u008b\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0014\u00102\u001a\u00020!2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00104\u001a\u000205HÖ\u0081\u0004J\n\u00106\u001a\u000207HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0011\u0010 \u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u00068"}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;", "", NotificationCompat.CATEGORY_EMAIL, "Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;", "username", "firstName", "lastName", "gender", "physiologicalBaseline", "height", "weight", "unitSystem", "country", "state", "birthday", "city", "<init>", "(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;)V", "getEmail", "()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;", "getUsername", "getFirstName", "getLastName", "getGender", "getPhysiologicalBaseline", "getHeight", "getWeight", "getUnitSystem", "getCountry", "getState", "getBirthday", "getCity", "hasChanges", "", "getHasChanges", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "", "toString", "", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class EditableFields {
        public static final int $stable = TextResource.$stable;
        private final EditableFieldState birthday;
        private final EditableFieldState city;
        private final EditableFieldState country;
        private final EditableFieldState email;
        private final EditableFieldState firstName;
        private final EditableFieldState gender;
        private final EditableFieldState height;
        private final EditableFieldState lastName;
        private final EditableFieldState physiologicalBaseline;
        private final EditableFieldState state;
        private final EditableFieldState unitSystem;
        private final EditableFieldState username;
        private final EditableFieldState weight;

        public EditableFields() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        }

        public static /* synthetic */ EditableFields copy$default(EditableFields editableFields, EditableFieldState editableFieldState, EditableFieldState editableFieldState2, EditableFieldState editableFieldState3, EditableFieldState editableFieldState4, EditableFieldState editableFieldState5, EditableFieldState editableFieldState6, EditableFieldState editableFieldState7, EditableFieldState editableFieldState8, EditableFieldState editableFieldState9, EditableFieldState editableFieldState10, EditableFieldState editableFieldState11, EditableFieldState editableFieldState12, EditableFieldState editableFieldState13, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                editableFieldState = editableFields.email;
            }
            return editableFields.copy(editableFieldState, (i13 & 2) != 0 ? editableFields.username : editableFieldState2, (i13 & 4) != 0 ? editableFields.firstName : editableFieldState3, (i13 & 8) != 0 ? editableFields.lastName : editableFieldState4, (i13 & 16) != 0 ? editableFields.gender : editableFieldState5, (i13 & 32) != 0 ? editableFields.physiologicalBaseline : editableFieldState6, (i13 & 64) != 0 ? editableFields.height : editableFieldState7, (i13 & 128) != 0 ? editableFields.weight : editableFieldState8, (i13 & 256) != 0 ? editableFields.unitSystem : editableFieldState9, (i13 & 512) != 0 ? editableFields.country : editableFieldState10, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? editableFields.state : editableFieldState11, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? editableFields.birthday : editableFieldState12, (i13 & 4096) != 0 ? editableFields.city : editableFieldState13);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final EditableFieldState getEmail() {
            return this.email;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final EditableFieldState getCountry() {
            return this.country;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final EditableFieldState getState() {
            return this.state;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final EditableFieldState getBirthday() {
            return this.birthday;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final EditableFieldState getCity() {
            return this.city;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final EditableFieldState getUsername() {
            return this.username;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final EditableFieldState getFirstName() {
            return this.firstName;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final EditableFieldState getLastName() {
            return this.lastName;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final EditableFieldState getGender() {
            return this.gender;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final EditableFieldState getPhysiologicalBaseline() {
            return this.physiologicalBaseline;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final EditableFieldState getHeight() {
            return this.height;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final EditableFieldState getWeight() {
            return this.weight;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final EditableFieldState getUnitSystem() {
            return this.unitSystem;
        }

        public final EditableFields copy(EditableFieldState email, EditableFieldState username, EditableFieldState firstName, EditableFieldState lastName, EditableFieldState gender, EditableFieldState physiologicalBaseline, EditableFieldState height, EditableFieldState weight, EditableFieldState unitSystem, EditableFieldState country, EditableFieldState state, EditableFieldState birthday, EditableFieldState city) {
            AbstractC22676k.m65750j(email, "email");
            AbstractC22676k.m65750j(username, "username");
            AbstractC22676k.m65750j(firstName, "firstName");
            AbstractC22676k.m65750j(lastName, "lastName");
            AbstractC22676k.m65750j(gender, "gender");
            AbstractC22676k.m65750j(physiologicalBaseline, "physiologicalBaseline");
            AbstractC22676k.m65750j(height, "height");
            AbstractC22676k.m65750j(weight, "weight");
            AbstractC22676k.m65750j(unitSystem, "unitSystem");
            AbstractC22676k.m65750j(country, "country");
            AbstractC22676k.m65750j(state, "state");
            AbstractC22676k.m65750j(birthday, "birthday");
            AbstractC22676k.m65750j(city, "city");
            return new EditableFields(email, username, firstName, lastName, gender, physiologicalBaseline, height, weight, unitSystem, country, state, birthday, city);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EditableFields)) {
                return false;
            }
            EditableFields editableFields = (EditableFields) other;
            return AbstractC22676k.m65745e(this.email, editableFields.email) && AbstractC22676k.m65745e(this.username, editableFields.username) && AbstractC22676k.m65745e(this.firstName, editableFields.firstName) && AbstractC22676k.m65745e(this.lastName, editableFields.lastName) && AbstractC22676k.m65745e(this.gender, editableFields.gender) && AbstractC22676k.m65745e(this.physiologicalBaseline, editableFields.physiologicalBaseline) && AbstractC22676k.m65745e(this.height, editableFields.height) && AbstractC22676k.m65745e(this.weight, editableFields.weight) && AbstractC22676k.m65745e(this.unitSystem, editableFields.unitSystem) && AbstractC22676k.m65745e(this.country, editableFields.country) && AbstractC22676k.m65745e(this.state, editableFields.state) && AbstractC22676k.m65745e(this.birthday, editableFields.birthday) && AbstractC22676k.m65745e(this.city, editableFields.city);
        }

        public final EditableFieldState getBirthday() {
            return this.birthday;
        }

        public final EditableFieldState getCity() {
            return this.city;
        }

        public final EditableFieldState getCountry() {
            return this.country;
        }

        public final EditableFieldState getEmail() {
            return this.email;
        }

        public final EditableFieldState getFirstName() {
            return this.firstName;
        }

        public final EditableFieldState getGender() {
            return this.gender;
        }

        public final boolean getHasChanges() {
            return this.email.isDirty() || this.username.isDirty() || this.firstName.isDirty() || this.lastName.isDirty() || this.gender.isDirty() || this.physiologicalBaseline.isDirty() || this.height.isDirty() || this.weight.isDirty() || this.unitSystem.isDirty() || this.country.isDirty() || this.state.isDirty() || this.city.isDirty() || this.birthday.isDirty();
        }

        public final EditableFieldState getHeight() {
            return this.height;
        }

        public final EditableFieldState getLastName() {
            return this.lastName;
        }

        public final EditableFieldState getPhysiologicalBaseline() {
            return this.physiologicalBaseline;
        }

        public final EditableFieldState getState() {
            return this.state;
        }

        public final EditableFieldState getUnitSystem() {
            return this.unitSystem;
        }

        public final EditableFieldState getUsername() {
            return this.username;
        }

        public final EditableFieldState getWeight() {
            return this.weight;
        }

        public int hashCode() {
            return this.city.hashCode() + ((this.birthday.hashCode() + ((this.state.hashCode() + ((this.country.hashCode() + ((this.unitSystem.hashCode() + ((this.weight.hashCode() + ((this.height.hashCode() + ((this.physiologicalBaseline.hashCode() + ((this.gender.hashCode() + ((this.lastName.hashCode() + ((this.firstName.hashCode() + ((this.username.hashCode() + (this.email.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public String toString() {
            return "EditableFields(email=" + this.email + ", username=" + this.username + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", gender=" + this.gender + ", physiologicalBaseline=" + this.physiologicalBaseline + ", height=" + this.height + ", weight=" + this.weight + ", unitSystem=" + this.unitSystem + ", country=" + this.country + ", state=" + this.state + ", birthday=" + this.birthday + ", city=" + this.city + ")";
        }

        public EditableFields(EditableFieldState email, EditableFieldState username, EditableFieldState firstName, EditableFieldState lastName, EditableFieldState gender, EditableFieldState physiologicalBaseline, EditableFieldState height, EditableFieldState weight, EditableFieldState unitSystem, EditableFieldState country, EditableFieldState state, EditableFieldState birthday, EditableFieldState city) {
            AbstractC22676k.m65750j(email, "email");
            AbstractC22676k.m65750j(username, "username");
            AbstractC22676k.m65750j(firstName, "firstName");
            AbstractC22676k.m65750j(lastName, "lastName");
            AbstractC22676k.m65750j(gender, "gender");
            AbstractC22676k.m65750j(physiologicalBaseline, "physiologicalBaseline");
            AbstractC22676k.m65750j(height, "height");
            AbstractC22676k.m65750j(weight, "weight");
            AbstractC22676k.m65750j(unitSystem, "unitSystem");
            AbstractC22676k.m65750j(country, "country");
            AbstractC22676k.m65750j(state, "state");
            AbstractC22676k.m65750j(birthday, "birthday");
            AbstractC22676k.m65750j(city, "city");
            this.email = email;
            this.username = username;
            this.firstName = firstName;
            this.lastName = lastName;
            this.gender = gender;
            this.physiologicalBaseline = physiologicalBaseline;
            this.height = height;
            this.weight = weight;
            this.unitSystem = unitSystem;
            this.country = country;
            this.state = state;
            this.birthday = birthday;
            this.city = city;
        }

        public /* synthetic */ EditableFields(EditableFieldState editableFieldState, EditableFieldState editableFieldState2, EditableFieldState editableFieldState3, EditableFieldState editableFieldState4, EditableFieldState editableFieldState5, EditableFieldState editableFieldState6, EditableFieldState editableFieldState7, EditableFieldState editableFieldState8, EditableFieldState editableFieldState9, EditableFieldState editableFieldState10, EditableFieldState editableFieldState11, EditableFieldState editableFieldState12, EditableFieldState editableFieldState13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            EditableFieldState editableFieldState14;
            EditableFieldState editableFieldState15;
            EditableFieldState editableFieldState16;
            EditableFieldState editableFieldState17;
            EditableFieldState editableFieldState18;
            EditableFieldState editableFieldState19;
            EditableFieldState editableFieldState20;
            EditableFieldState editableFieldState21;
            EditableFieldState editableFieldState22;
            EditableFieldState editableFieldState23;
            EditableFieldState editableFieldState24;
            EditableFieldState editableFieldState25;
            EditableFieldState editableFieldState26;
            if ((i13 & 1) != 0) {
                editableFieldState14 = new EditableFieldState(null, false, false, null, false, 31, null);
            } else {
                editableFieldState14 = editableFieldState;
            }
            if ((i13 & 2) != 0) {
                editableFieldState15 = new EditableFieldState(null, false, false, null, false, 31, null);
            } else {
                editableFieldState15 = editableFieldState2;
            }
            if ((i13 & 4) != 0) {
                editableFieldState16 = new EditableFieldState(null, false, false, null, false, 31, null);
            } else {
                editableFieldState16 = editableFieldState3;
            }
            if ((i13 & 8) != 0) {
                editableFieldState17 = new EditableFieldState(null, false, false, null, false, 31, null);
            } else {
                editableFieldState17 = editableFieldState4;
            }
            if ((i13 & 16) != 0) {
                editableFieldState18 = new EditableFieldState(null, false, false, null, false, 31, null);
            } else {
                editableFieldState18 = editableFieldState5;
            }
            if ((i13 & 32) != 0) {
                editableFieldState19 = new EditableFieldState(null, false, false, null, false, 31, null);
            } else {
                editableFieldState19 = editableFieldState6;
            }
            if ((i13 & 64) != 0) {
                editableFieldState20 = new EditableFieldState(null, false, false, null, false, 31, null);
            } else {
                editableFieldState20 = editableFieldState7;
            }
            if ((i13 & 128) != 0) {
                editableFieldState21 = new EditableFieldState(null, false, false, null, false, 31, null);
            } else {
                editableFieldState21 = editableFieldState8;
            }
            if ((i13 & 256) != 0) {
                editableFieldState22 = new EditableFieldState(null, false, false, null, false, 31, null);
            } else {
                editableFieldState22 = editableFieldState9;
            }
            if ((i13 & 512) != 0) {
                editableFieldState23 = new EditableFieldState(null, false, false, null, false, 31, null);
            } else {
                editableFieldState23 = editableFieldState10;
            }
            if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                editableFieldState24 = new EditableFieldState(null, false, false, null, false, 31, null);
            } else {
                editableFieldState24 = editableFieldState11;
            }
            if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                editableFieldState25 = new EditableFieldState(null, false, false, null, false, 31, null);
            } else {
                editableFieldState25 = editableFieldState12;
            }
            if ((i13 & 4096) != 0) {
                editableFieldState26 = new EditableFieldState(null, false, false, null, false, 31, null);
            } else {
                editableFieldState26 = editableFieldState13;
            }
            this(editableFieldState14, editableFieldState15, editableFieldState16, editableFieldState17, editableFieldState18, editableFieldState19, editableFieldState20, editableFieldState21, editableFieldState22, editableFieldState23, editableFieldState24, editableFieldState25, editableFieldState26);
        }
    }

    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J<\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0014\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\bHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0004\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;", "", "isValidating", "", "isValid", "validationError", "Lcom/whoop/design/util/TextResource;", "lastValidatedEmail", "", "<init>", "(ZLjava/lang/Boolean;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getValidationError", "()Lcom/whoop/design/util/TextResource;", "getLastValidatedEmail", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(ZLjava/lang/Boolean;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;", "equals", "other", "hashCode", "", "toString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class EmailValidationViewState {
        public static final int $stable = TextResource.$stable;
        private final Boolean isValid;
        private final boolean isValidating;
        private final String lastValidatedEmail;
        private final TextResource validationError;

        public EmailValidationViewState() {
            this(false, null, null, null, 15, null);
        }

        public static /* synthetic */ EmailValidationViewState copy$default(EmailValidationViewState emailValidationViewState, boolean z4, Boolean bool, TextResource textResource, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z4 = emailValidationViewState.isValidating;
            }
            if ((i13 & 2) != 0) {
                bool = emailValidationViewState.isValid;
            }
            if ((i13 & 4) != 0) {
                textResource = emailValidationViewState.validationError;
            }
            if ((i13 & 8) != 0) {
                str = emailValidationViewState.lastValidatedEmail;
            }
            return emailValidationViewState.copy(z4, bool, textResource, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsValidating() {
            return this.isValidating;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getIsValid() {
            return this.isValid;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final TextResource getValidationError() {
            return this.validationError;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getLastValidatedEmail() {
            return this.lastValidatedEmail;
        }

        public final EmailValidationViewState copy(boolean isValidating, Boolean isValid, TextResource validationError, String lastValidatedEmail) {
            return new EmailValidationViewState(isValidating, isValid, validationError, lastValidatedEmail);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EmailValidationViewState)) {
                return false;
            }
            EmailValidationViewState emailValidationViewState = (EmailValidationViewState) other;
            return this.isValidating == emailValidationViewState.isValidating && AbstractC22676k.m65745e(this.isValid, emailValidationViewState.isValid) && AbstractC22676k.m65745e(this.validationError, emailValidationViewState.validationError) && AbstractC22676k.m65745e(this.lastValidatedEmail, emailValidationViewState.lastValidatedEmail);
        }

        public final String getLastValidatedEmail() {
            return this.lastValidatedEmail;
        }

        public final TextResource getValidationError() {
            return this.validationError;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isValidating) * 31;
            Boolean bool = this.isValid;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            TextResource textResource = this.validationError;
            int iHashCode3 = (iHashCode2 + (textResource == null ? 0 : textResource.hashCode())) * 31;
            String str = this.lastValidatedEmail;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }

        public final Boolean isValid() {
            return this.isValid;
        }

        public final boolean isValidating() {
            return this.isValidating;
        }

        public String toString() {
            return "EmailValidationViewState(isValidating=" + this.isValidating + ", isValid=" + this.isValid + ", validationError=" + this.validationError + ", lastValidatedEmail=" + this.lastValidatedEmail + ")";
        }

        public EmailValidationViewState(boolean z4, Boolean bool, TextResource textResource, String str) {
            this.isValidating = z4;
            this.isValid = bool;
            this.validationError = textResource;
            this.lastValidatedEmail = str;
        }

        public /* synthetic */ EmailValidationViewState(boolean z4, Boolean bool, TextResource textResource, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? null : bool, (i13 & 4) != 0 ? null : textResource, (i13 & 8) != 0 ? null : str);
        }
    }

    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;", "", "name", "Lcom/whoop/design/util/TextResource;", "code", "", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V", "getName", "()Lcom/whoop/design/util/TextResource;", "getCode", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class State {
        public static final int $stable = TextResource.$stable;
        private final String code;
        private final TextResource name;

        public State(TextResource name, String code) {
            AbstractC22676k.m65750j(name, "name");
            AbstractC22676k.m65750j(code, "code");
            this.name = name;
            this.code = code;
        }

        public static /* synthetic */ State copy$default(State state, TextResource textResource, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                textResource = state.name;
            }
            if ((i13 & 2) != 0) {
                str = state.code;
            }
            return state.copy(textResource, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final TextResource getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        public final State copy(TextResource name, String code) {
            AbstractC22676k.m65750j(name, "name");
            AbstractC22676k.m65750j(code, "code");
            return new State(name, code);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return AbstractC22676k.m65745e(this.name, state.name) && AbstractC22676k.m65745e(this.code, state.code);
        }

        public final String getCode() {
            return this.code;
        }

        public final TextResource getName() {
            return this.name;
        }

        public int hashCode() {
            return this.code.hashCode() + (this.name.hashCode() * 31);
        }

        public String toString() {
            return "State(name=" + this.name + ", code=" + this.code + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JH\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0014\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\tHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0004\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;", "", "isValidating", "", "isValid", "validationError", "Lcom/whoop/design/util/TextResource;", "validationSuccess", "lastValidatedUsername", "", "<init>", "(ZLjava/lang/Boolean;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getValidationError", "()Lcom/whoop/design/util/TextResource;", "getValidationSuccess", "getLastValidatedUsername", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "(ZLjava/lang/Boolean;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;", "equals", "other", "hashCode", "", "toString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class UsernameValidationViewState {
        public static final int $stable = TextResource.$stable;
        private final Boolean isValid;
        private final boolean isValidating;
        private final String lastValidatedUsername;
        private final TextResource validationError;
        private final TextResource validationSuccess;

        public UsernameValidationViewState() {
            this(false, null, null, null, null, 31, null);
        }

        public static /* synthetic */ UsernameValidationViewState copy$default(UsernameValidationViewState usernameValidationViewState, boolean z4, Boolean bool, TextResource textResource, TextResource textResource2, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z4 = usernameValidationViewState.isValidating;
            }
            if ((i13 & 2) != 0) {
                bool = usernameValidationViewState.isValid;
            }
            if ((i13 & 4) != 0) {
                textResource = usernameValidationViewState.validationError;
            }
            if ((i13 & 8) != 0) {
                textResource2 = usernameValidationViewState.validationSuccess;
            }
            if ((i13 & 16) != 0) {
                str = usernameValidationViewState.lastValidatedUsername;
            }
            String str2 = str;
            TextResource textResource3 = textResource;
            return usernameValidationViewState.copy(z4, bool, textResource3, textResource2, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsValidating() {
            return this.isValidating;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getIsValid() {
            return this.isValid;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final TextResource getValidationError() {
            return this.validationError;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final TextResource getValidationSuccess() {
            return this.validationSuccess;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getLastValidatedUsername() {
            return this.lastValidatedUsername;
        }

        public final UsernameValidationViewState copy(boolean isValidating, Boolean isValid, TextResource validationError, TextResource validationSuccess, String lastValidatedUsername) {
            return new UsernameValidationViewState(isValidating, isValid, validationError, validationSuccess, lastValidatedUsername);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UsernameValidationViewState)) {
                return false;
            }
            UsernameValidationViewState usernameValidationViewState = (UsernameValidationViewState) other;
            return this.isValidating == usernameValidationViewState.isValidating && AbstractC22676k.m65745e(this.isValid, usernameValidationViewState.isValid) && AbstractC22676k.m65745e(this.validationError, usernameValidationViewState.validationError) && AbstractC22676k.m65745e(this.validationSuccess, usernameValidationViewState.validationSuccess) && AbstractC22676k.m65745e(this.lastValidatedUsername, usernameValidationViewState.lastValidatedUsername);
        }

        public final String getLastValidatedUsername() {
            return this.lastValidatedUsername;
        }

        public final TextResource getValidationError() {
            return this.validationError;
        }

        public final TextResource getValidationSuccess() {
            return this.validationSuccess;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isValidating) * 31;
            Boolean bool = this.isValid;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            TextResource textResource = this.validationError;
            int iHashCode3 = (iHashCode2 + (textResource == null ? 0 : textResource.hashCode())) * 31;
            TextResource textResource2 = this.validationSuccess;
            int iHashCode4 = (iHashCode3 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
            String str = this.lastValidatedUsername;
            return iHashCode4 + (str != null ? str.hashCode() : 0);
        }

        public final Boolean isValid() {
            return this.isValid;
        }

        public final boolean isValidating() {
            return this.isValidating;
        }

        public String toString() {
            boolean z4 = this.isValidating;
            Boolean bool = this.isValid;
            TextResource textResource = this.validationError;
            TextResource textResource2 = this.validationSuccess;
            String str = this.lastValidatedUsername;
            StringBuilder sb4 = new StringBuilder("UsernameValidationViewState(isValidating=");
            sb4.append(z4);
            sb4.append(", isValid=");
            sb4.append(bool);
            sb4.append(", validationError=");
            AbstractC30007c.m91855y(sb4, textResource, ", validationSuccess=", textResource2, ", lastValidatedUsername=");
            return AbstractC25012a.m73376i(str, ")", sb4);
        }

        public UsernameValidationViewState(boolean z4, Boolean bool, TextResource textResource, TextResource textResource2, String str) {
            this.isValidating = z4;
            this.isValid = bool;
            this.validationError = textResource;
            this.validationSuccess = textResource2;
            this.lastValidatedUsername = str;
        }

        public /* synthetic */ UsernameValidationViewState(boolean z4, Boolean bool, TextResource textResource, TextResource textResource2, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? null : bool, (i13 & 4) != 0 ? null : textResource, (i13 & 8) != 0 ? null : textResource2, (i13 & 16) != 0 ? null : str);
        }
    }

    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003JY\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010%\u001a\u00020&HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006'"}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;", "", "heightFeetMin", "", "heightFeetMax", "heightMetersMin", "", "heightMetersMax", "weightPoundsMin", "weightPoundsMax", "weightKilogramsMin", "weightKilogramsMax", "<init>", "(IIFFIIII)V", "getHeightFeetMin", "()I", "getHeightFeetMax", "getHeightMetersMin", "()F", "getHeightMetersMax", "getWeightPoundsMin", "getWeightPoundsMax", "getWeightKilogramsMin", "getWeightKilogramsMax", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class ValidationRanges {
        public static final int $stable = 0;
        private final int heightFeetMax;
        private final int heightFeetMin;
        private final float heightMetersMax;
        private final float heightMetersMin;
        private final int weightKilogramsMax;
        private final int weightKilogramsMin;
        private final int weightPoundsMax;
        private final int weightPoundsMin;

        public ValidationRanges(int i13, int i14, float f13, float f14, int i15, int i16, int i17, int i18) {
            this.heightFeetMin = i13;
            this.heightFeetMax = i14;
            this.heightMetersMin = f13;
            this.heightMetersMax = f14;
            this.weightPoundsMin = i15;
            this.weightPoundsMax = i16;
            this.weightKilogramsMin = i17;
            this.weightKilogramsMax = i18;
        }

        public static /* synthetic */ ValidationRanges copy$default(ValidationRanges validationRanges, int i13, int i14, float f13, float f14, int i15, int i16, int i17, int i18, int i19, Object obj) {
            if ((i19 & 1) != 0) {
                i13 = validationRanges.heightFeetMin;
            }
            if ((i19 & 2) != 0) {
                i14 = validationRanges.heightFeetMax;
            }
            if ((i19 & 4) != 0) {
                f13 = validationRanges.heightMetersMin;
            }
            if ((i19 & 8) != 0) {
                f14 = validationRanges.heightMetersMax;
            }
            if ((i19 & 16) != 0) {
                i15 = validationRanges.weightPoundsMin;
            }
            if ((i19 & 32) != 0) {
                i16 = validationRanges.weightPoundsMax;
            }
            if ((i19 & 64) != 0) {
                i17 = validationRanges.weightKilogramsMin;
            }
            if ((i19 & 128) != 0) {
                i18 = validationRanges.weightKilogramsMax;
            }
            int i24 = i17;
            int i25 = i18;
            int i26 = i15;
            int i27 = i16;
            return validationRanges.copy(i13, i14, f13, f14, i26, i27, i24, i25);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getHeightFeetMin() {
            return this.heightFeetMin;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getHeightFeetMax() {
            return this.heightFeetMax;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getHeightMetersMin() {
            return this.heightMetersMin;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getHeightMetersMax() {
            return this.heightMetersMax;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final int getWeightPoundsMin() {
            return this.weightPoundsMin;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getWeightPoundsMax() {
            return this.weightPoundsMax;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final int getWeightKilogramsMin() {
            return this.weightKilogramsMin;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final int getWeightKilogramsMax() {
            return this.weightKilogramsMax;
        }

        public final ValidationRanges copy(int heightFeetMin, int heightFeetMax, float heightMetersMin, float heightMetersMax, int weightPoundsMin, int weightPoundsMax, int weightKilogramsMin, int weightKilogramsMax) {
            return new ValidationRanges(heightFeetMin, heightFeetMax, heightMetersMin, heightMetersMax, weightPoundsMin, weightPoundsMax, weightKilogramsMin, weightKilogramsMax);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ValidationRanges)) {
                return false;
            }
            ValidationRanges validationRanges = (ValidationRanges) other;
            return this.heightFeetMin == validationRanges.heightFeetMin && this.heightFeetMax == validationRanges.heightFeetMax && Float.compare(this.heightMetersMin, validationRanges.heightMetersMin) == 0 && Float.compare(this.heightMetersMax, validationRanges.heightMetersMax) == 0 && this.weightPoundsMin == validationRanges.weightPoundsMin && this.weightPoundsMax == validationRanges.weightPoundsMax && this.weightKilogramsMin == validationRanges.weightKilogramsMin && this.weightKilogramsMax == validationRanges.weightKilogramsMax;
        }

        public final int getHeightFeetMax() {
            return this.heightFeetMax;
        }

        public final int getHeightFeetMin() {
            return this.heightFeetMin;
        }

        public final float getHeightMetersMax() {
            return this.heightMetersMax;
        }

        public final float getHeightMetersMin() {
            return this.heightMetersMin;
        }

        public final int getWeightKilogramsMax() {
            return this.weightKilogramsMax;
        }

        public final int getWeightKilogramsMin() {
            return this.weightKilogramsMin;
        }

        public final int getWeightPoundsMax() {
            return this.weightPoundsMax;
        }

        public final int getWeightPoundsMin() {
            return this.weightPoundsMin;
        }

        public int hashCode() {
            return Integer.hashCode(this.weightKilogramsMax) + AbstractC11266d.m30448b(this.weightKilogramsMin, AbstractC11266d.m30448b(this.weightPoundsMax, AbstractC11266d.m30448b(this.weightPoundsMin, AbstractC11266d.m30447a(this.heightMetersMax, AbstractC11266d.m30447a(this.heightMetersMin, AbstractC11266d.m30448b(this.heightFeetMax, Integer.hashCode(this.heightFeetMin) * 31, 31), 31), 31), 31), 31), 31);
        }

        public String toString() {
            int i13 = this.heightFeetMin;
            int i14 = this.heightFeetMax;
            float f13 = this.heightMetersMin;
            float f14 = this.heightMetersMax;
            int i15 = this.weightPoundsMin;
            int i16 = this.weightPoundsMax;
            int i17 = this.weightKilogramsMin;
            int i18 = this.weightKilogramsMax;
            StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "ValidationRanges(heightFeetMin=", ", heightFeetMax=", ", heightMetersMin=");
            AbstractC30802r.m94772u(sbM30465s, f13, ", heightMetersMax=", f14, ", weightPoundsMin=");
            AbstractC30802r.m94773v(sbM30465s, i15, ", weightPoundsMax=", i16, ", weightKilogramsMin=");
            return AbstractC26725a.m79505i(sbM30465s, i17, ", weightKilogramsMax=", i18, ")");
        }
    }

    public EditProfileViewState() {
        this(null, null, null, null, null, null, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public static /* synthetic */ EditProfileViewState copy$default(EditProfileViewState editProfileViewState, EditProfileDialogState editProfileDialogState, FullScreenModal fullScreenModal, EditProfileData editProfileData, EditableFields editableFields, AvatarViewState avatarViewState, EmailValidationViewState emailValidationViewState, UsernameValidationViewState usernameValidationViewState, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            editProfileDialogState = editProfileViewState.popUpDialog;
        }
        if ((i13 & 2) != 0) {
            fullScreenModal = editProfileViewState.fullScreenModal;
        }
        if ((i13 & 4) != 0) {
            editProfileData = editProfileViewState.profileData;
        }
        if ((i13 & 8) != 0) {
            editableFields = editProfileViewState.editableFields;
        }
        if ((i13 & 16) != 0) {
            avatarViewState = editProfileViewState.avatarState;
        }
        if ((i13 & 32) != 0) {
            emailValidationViewState = editProfileViewState.emailValidationState;
        }
        if ((i13 & 64) != 0) {
            usernameValidationViewState = editProfileViewState.usernameValidationState;
        }
        if ((i13 & 128) != 0) {
            z4 = editProfileViewState.showUsernameField;
        }
        if ((i13 & 256) != 0) {
            z13 = editProfileViewState.isUsernameFieldEditable;
        }
        boolean z14 = z4;
        boolean z15 = z13;
        EmailValidationViewState emailValidationViewState2 = emailValidationViewState;
        UsernameValidationViewState usernameValidationViewState2 = usernameValidationViewState;
        AvatarViewState avatarViewState2 = avatarViewState;
        EditProfileData editProfileData2 = editProfileData;
        return editProfileViewState.copy(editProfileDialogState, fullScreenModal, editProfileData2, editableFields, avatarViewState2, emailValidationViewState2, usernameValidationViewState2, z14, z15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EditProfileDialogState getPopUpDialog() {
        return this.popUpDialog;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FullScreenModal getFullScreenModal() {
        return this.fullScreenModal;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EditProfileData getProfileData() {
        return this.profileData;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final EditableFields getEditableFields() {
        return this.editableFields;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final AvatarViewState getAvatarState() {
        return this.avatarState;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final EmailValidationViewState getEmailValidationState() {
        return this.emailValidationState;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final UsernameValidationViewState getUsernameValidationState() {
        return this.usernameValidationState;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getShowUsernameField() {
        return this.showUsernameField;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsUsernameFieldEditable() {
        return this.isUsernameFieldEditable;
    }

    public final EditProfileViewState copy(EditProfileDialogState popUpDialog, FullScreenModal fullScreenModal, EditProfileData profileData, EditableFields editableFields, AvatarViewState avatarState, EmailValidationViewState emailValidationState, UsernameValidationViewState usernameValidationState, boolean showUsernameField, boolean isUsernameFieldEditable) {
        AbstractC22676k.m65750j(editableFields, "editableFields");
        AbstractC22676k.m65750j(avatarState, "avatarState");
        AbstractC22676k.m65750j(emailValidationState, "emailValidationState");
        AbstractC22676k.m65750j(usernameValidationState, "usernameValidationState");
        return new EditProfileViewState(popUpDialog, fullScreenModal, profileData, editableFields, avatarState, emailValidationState, usernameValidationState, showUsernameField, isUsernameFieldEditable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditProfileViewState)) {
            return false;
        }
        EditProfileViewState editProfileViewState = (EditProfileViewState) other;
        return AbstractC22676k.m65745e(this.popUpDialog, editProfileViewState.popUpDialog) && AbstractC22676k.m65745e(this.fullScreenModal, editProfileViewState.fullScreenModal) && AbstractC22676k.m65745e(this.profileData, editProfileViewState.profileData) && AbstractC22676k.m65745e(this.editableFields, editProfileViewState.editableFields) && AbstractC22676k.m65745e(this.avatarState, editProfileViewState.avatarState) && AbstractC22676k.m65745e(this.emailValidationState, editProfileViewState.emailValidationState) && AbstractC22676k.m65745e(this.usernameValidationState, editProfileViewState.usernameValidationState) && this.showUsernameField == editProfileViewState.showUsernameField && this.isUsernameFieldEditable == editProfileViewState.isUsernameFieldEditable;
    }

    public final AvatarViewState getAvatarState() {
        return this.avatarState;
    }

    public final boolean getCanSave() {
        return this.editableFields.getHasChanges();
    }

    public final EditableFields getEditableFields() {
        return this.editableFields;
    }

    public final EmailValidationViewState getEmailValidationState() {
        return this.emailValidationState;
    }

    public final FullScreenModal getFullScreenModal() {
        return this.fullScreenModal;
    }

    public final EditProfileDialogState getPopUpDialog() {
        return this.popUpDialog;
    }

    public final EditProfileData getProfileData() {
        return this.profileData;
    }

    public final boolean getShowUsernameField() {
        return this.showUsernameField;
    }

    public final UsernameValidationViewState getUsernameValidationState() {
        return this.usernameValidationState;
    }

    public int hashCode() {
        EditProfileDialogState editProfileDialogState = this.popUpDialog;
        int iHashCode = (editProfileDialogState == null ? 0 : editProfileDialogState.hashCode()) * 31;
        FullScreenModal fullScreenModal = this.fullScreenModal;
        int iHashCode2 = (iHashCode + (fullScreenModal == null ? 0 : fullScreenModal.hashCode())) * 31;
        EditProfileData editProfileData = this.profileData;
        return Boolean.hashCode(this.isUsernameFieldEditable) + AbstractC2875y.m8289b((this.usernameValidationState.hashCode() + ((this.emailValidationState.hashCode() + ((this.avatarState.hashCode() + ((this.editableFields.hashCode() + ((iHashCode2 + (editProfileData != null ? editProfileData.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.showUsernameField);
    }

    public final boolean isUsernameFieldEditable() {
        return this.isUsernameFieldEditable;
    }

    public String toString() {
        EditProfileDialogState editProfileDialogState = this.popUpDialog;
        FullScreenModal fullScreenModal = this.fullScreenModal;
        EditProfileData editProfileData = this.profileData;
        EditableFields editableFields = this.editableFields;
        AvatarViewState avatarViewState = this.avatarState;
        EmailValidationViewState emailValidationViewState = this.emailValidationState;
        UsernameValidationViewState usernameValidationViewState = this.usernameValidationState;
        boolean z4 = this.showUsernameField;
        boolean z13 = this.isUsernameFieldEditable;
        StringBuilder sb4 = new StringBuilder("EditProfileViewState(popUpDialog=");
        sb4.append(editProfileDialogState);
        sb4.append(", fullScreenModal=");
        sb4.append(fullScreenModal);
        sb4.append(", profileData=");
        sb4.append(editProfileData);
        sb4.append(", editableFields=");
        sb4.append(editableFields);
        sb4.append(", avatarState=");
        sb4.append(avatarViewState);
        sb4.append(", emailValidationState=");
        sb4.append(emailValidationViewState);
        sb4.append(", usernameValidationState=");
        sb4.append(usernameValidationViewState);
        sb4.append(", showUsernameField=");
        sb4.append(z4);
        sb4.append(", isUsernameFieldEditable=");
        return AbstractC18489d0.m53372m(sb4, z13, ")");
    }

    public EditProfileViewState(EditProfileDialogState editProfileDialogState, FullScreenModal fullScreenModal, EditProfileData editProfileData, EditableFields editableFields, AvatarViewState avatarState, EmailValidationViewState emailValidationState, UsernameValidationViewState usernameValidationState, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(editableFields, "editableFields");
        AbstractC22676k.m65750j(avatarState, "avatarState");
        AbstractC22676k.m65750j(emailValidationState, "emailValidationState");
        AbstractC22676k.m65750j(usernameValidationState, "usernameValidationState");
        this.popUpDialog = editProfileDialogState;
        this.fullScreenModal = fullScreenModal;
        this.profileData = editProfileData;
        this.editableFields = editableFields;
        this.avatarState = avatarState;
        this.emailValidationState = emailValidationState;
        this.usernameValidationState = usernameValidationState;
        this.showUsernameField = z4;
        this.isUsernameFieldEditable = z13;
    }

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ>\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b!\u0010\r¨\u0006\""}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;", "", "Lsz0/q0;", "state", "Lcom/whoop/profile/presentation/edit/EditProfileEvent;", "primaryClickEvent", "secondaryClickEvent", "backClickEvent", "<init>", "(Lsz0/q0;Lcom/whoop/profile/presentation/edit/EditProfileEvent;Lcom/whoop/profile/presentation/edit/EditProfileEvent;Lcom/whoop/profile/presentation/edit/EditProfileEvent;)V", "component1", "()Lsz0/q0;", "component2", "()Lcom/whoop/profile/presentation/edit/EditProfileEvent;", "component3", "component4", "copy", "(Lsz0/q0;Lcom/whoop/profile/presentation/edit/EditProfileEvent;Lcom/whoop/profile/presentation/edit/EditProfileEvent;Lcom/whoop/profile/presentation/edit/EditProfileEvent;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lsz0/q0;", "getState", "Lcom/whoop/profile/presentation/edit/EditProfileEvent;", "getPrimaryClickEvent", "getSecondaryClickEvent", "getBackClickEvent", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class FullScreenModal {
        public static final int $stable = C33211q0.f138501k;
        private final EditProfileEvent backClickEvent;
        private final EditProfileEvent primaryClickEvent;
        private final EditProfileEvent secondaryClickEvent;
        private final C33211q0 state;

        public FullScreenModal(C33211q0 state, EditProfileEvent editProfileEvent, EditProfileEvent editProfileEvent2, EditProfileEvent editProfileEvent3) {
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
            this.primaryClickEvent = editProfileEvent;
            this.secondaryClickEvent = editProfileEvent2;
            this.backClickEvent = editProfileEvent3;
        }

        public static /* synthetic */ FullScreenModal copy$default(FullScreenModal fullScreenModal, C33211q0 c33211q0, EditProfileEvent editProfileEvent, EditProfileEvent editProfileEvent2, EditProfileEvent editProfileEvent3, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                c33211q0 = fullScreenModal.state;
            }
            if ((i13 & 2) != 0) {
                editProfileEvent = fullScreenModal.primaryClickEvent;
            }
            if ((i13 & 4) != 0) {
                editProfileEvent2 = fullScreenModal.secondaryClickEvent;
            }
            if ((i13 & 8) != 0) {
                editProfileEvent3 = fullScreenModal.backClickEvent;
            }
            return fullScreenModal.copy(c33211q0, editProfileEvent, editProfileEvent2, editProfileEvent3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final C33211q0 getState() {
            return this.state;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final EditProfileEvent getPrimaryClickEvent() {
            return this.primaryClickEvent;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final EditProfileEvent getSecondaryClickEvent() {
            return this.secondaryClickEvent;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final EditProfileEvent getBackClickEvent() {
            return this.backClickEvent;
        }

        public final FullScreenModal copy(C33211q0 state, EditProfileEvent primaryClickEvent, EditProfileEvent secondaryClickEvent, EditProfileEvent backClickEvent) {
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

        public final EditProfileEvent getBackClickEvent() {
            return this.backClickEvent;
        }

        public final EditProfileEvent getPrimaryClickEvent() {
            return this.primaryClickEvent;
        }

        public final EditProfileEvent getSecondaryClickEvent() {
            return this.secondaryClickEvent;
        }

        public final C33211q0 getState() {
            return this.state;
        }

        public int hashCode() {
            int iHashCode = this.state.hashCode() * 31;
            EditProfileEvent editProfileEvent = this.primaryClickEvent;
            int iHashCode2 = (iHashCode + (editProfileEvent == null ? 0 : editProfileEvent.hashCode())) * 31;
            EditProfileEvent editProfileEvent2 = this.secondaryClickEvent;
            int iHashCode3 = (iHashCode2 + (editProfileEvent2 == null ? 0 : editProfileEvent2.hashCode())) * 31;
            EditProfileEvent editProfileEvent3 = this.backClickEvent;
            return iHashCode3 + (editProfileEvent3 != null ? editProfileEvent3.hashCode() : 0);
        }

        public String toString() {
            return "FullScreenModal(state=" + this.state + ", primaryClickEvent=" + this.primaryClickEvent + ", secondaryClickEvent=" + this.secondaryClickEvent + ", backClickEvent=" + this.backClickEvent + ")";
        }

        public /* synthetic */ FullScreenModal(C33211q0 c33211q0, EditProfileEvent editProfileEvent, EditProfileEvent editProfileEvent2, EditProfileEvent editProfileEvent3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c33211q0, (i13 & 2) != 0 ? null : editProfileEvent, (i13 & 4) != 0 ? null : editProfileEvent2, (i13 & 8) != 0 ? null : editProfileEvent3);
        }
    }

    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b!\u0010 J~\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b2\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b3\u0010\u0014R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b6\u0010\u001bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b8\u0010\u001eR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b:\u0010 R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\b;\u0010 ¨\u0006<"}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;", "", "Lcom/whoop/design/util/TextResource;", "title", "primaryActionText", "Ly81/e;", "primaryActionColor", "secondaryActionText", "description", "", "showCloseIcon", "useSolidButtons", "Lj11/p;", "topDialogStyle", "Lcom/whoop/profile/presentation/edit/EditProfileEvent;", "approveEvent", "dismissEvent", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lcom/whoop/profile/presentation/edit/EditProfileEvent;Lcom/whoop/profile/presentation/edit/EditProfileEvent;)V", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "()Ly81/e;", "component4", "component5", "component6", "()Z", "component7", "component8", "()Lj11/p;", "component9", "()Lcom/whoop/profile/presentation/edit/EditProfileEvent;", "component10", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lcom/whoop/profile/presentation/edit/EditProfileEvent;Lcom/whoop/profile/presentation/edit/EditProfileEvent;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getTitle", "getPrimaryActionText", "Ly81/e;", "getPrimaryActionColor", "getSecondaryActionText", "getDescription", "Z", "getShowCloseIcon", "getUseSolidButtons", "Lj11/p;", "getTopDialogStyle", "Lcom/whoop/profile/presentation/edit/EditProfileEvent;", "getApproveEvent", "getDismissEvent", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class EditProfileDialogState {
        public static final int $stable = 8;
        private final EditProfileEvent approveEvent;
        private final TextResource description;
        private final EditProfileEvent dismissEvent;
        private final InterfaceC39332e primaryActionColor;
        private final TextResource primaryActionText;
        private final TextResource secondaryActionText;
        private final boolean showCloseIcon;
        private final TextResource title;
        private final EnumC21213p topDialogStyle;
        private final boolean useSolidButtons;

        public EditProfileDialogState(TextResource title, TextResource textResource, InterfaceC39332e interfaceC39332e, TextResource textResource2, TextResource description, boolean z4, boolean z13, EnumC21213p topDialogStyle, EditProfileEvent editProfileEvent, EditProfileEvent editProfileEvent2) {
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
            this.approveEvent = editProfileEvent;
            this.dismissEvent = editProfileEvent2;
        }

        public static /* synthetic */ EditProfileDialogState copy$default(EditProfileDialogState editProfileDialogState, TextResource textResource, TextResource textResource2, InterfaceC39332e interfaceC39332e, TextResource textResource3, TextResource textResource4, boolean z4, boolean z13, EnumC21213p enumC21213p, EditProfileEvent editProfileEvent, EditProfileEvent editProfileEvent2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                textResource = editProfileDialogState.title;
            }
            if ((i13 & 2) != 0) {
                textResource2 = editProfileDialogState.primaryActionText;
            }
            if ((i13 & 4) != 0) {
                interfaceC39332e = editProfileDialogState.primaryActionColor;
            }
            if ((i13 & 8) != 0) {
                textResource3 = editProfileDialogState.secondaryActionText;
            }
            if ((i13 & 16) != 0) {
                textResource4 = editProfileDialogState.description;
            }
            if ((i13 & 32) != 0) {
                z4 = editProfileDialogState.showCloseIcon;
            }
            if ((i13 & 64) != 0) {
                z13 = editProfileDialogState.useSolidButtons;
            }
            if ((i13 & 128) != 0) {
                enumC21213p = editProfileDialogState.topDialogStyle;
            }
            if ((i13 & 256) != 0) {
                editProfileEvent = editProfileDialogState.approveEvent;
            }
            if ((i13 & 512) != 0) {
                editProfileEvent2 = editProfileDialogState.dismissEvent;
            }
            EditProfileEvent editProfileEvent3 = editProfileEvent;
            EditProfileEvent editProfileEvent4 = editProfileEvent2;
            boolean z14 = z13;
            EnumC21213p enumC21213p2 = enumC21213p;
            TextResource textResource5 = textResource4;
            boolean z15 = z4;
            return editProfileDialogState.copy(textResource, textResource2, interfaceC39332e, textResource3, textResource5, z15, z14, enumC21213p2, editProfileEvent3, editProfileEvent4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final EditProfileEvent getDismissEvent() {
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
        public final EditProfileEvent getApproveEvent() {
            return this.approveEvent;
        }

        public final EditProfileDialogState copy(TextResource title, TextResource primaryActionText, InterfaceC39332e primaryActionColor, TextResource secondaryActionText, TextResource description, boolean showCloseIcon, boolean useSolidButtons, EnumC21213p topDialogStyle, EditProfileEvent approveEvent, EditProfileEvent dismissEvent) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(topDialogStyle, "topDialogStyle");
            return new EditProfileDialogState(title, primaryActionText, primaryActionColor, secondaryActionText, description, showCloseIcon, useSolidButtons, topDialogStyle, approveEvent, dismissEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EditProfileDialogState)) {
                return false;
            }
            EditProfileDialogState editProfileDialogState = (EditProfileDialogState) other;
            return AbstractC22676k.m65745e(this.title, editProfileDialogState.title) && AbstractC22676k.m65745e(this.primaryActionText, editProfileDialogState.primaryActionText) && AbstractC22676k.m65745e(this.primaryActionColor, editProfileDialogState.primaryActionColor) && AbstractC22676k.m65745e(this.secondaryActionText, editProfileDialogState.secondaryActionText) && AbstractC22676k.m65745e(this.description, editProfileDialogState.description) && this.showCloseIcon == editProfileDialogState.showCloseIcon && this.useSolidButtons == editProfileDialogState.useSolidButtons && this.topDialogStyle == editProfileDialogState.topDialogStyle && AbstractC22676k.m65745e(this.approveEvent, editProfileDialogState.approveEvent) && AbstractC22676k.m65745e(this.dismissEvent, editProfileDialogState.dismissEvent);
        }

        public final EditProfileEvent getApproveEvent() {
            return this.approveEvent;
        }

        public final TextResource getDescription() {
            return this.description;
        }

        public final EditProfileEvent getDismissEvent() {
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
            EditProfileEvent editProfileEvent = this.approveEvent;
            int iHashCode4 = (iM106647f + (editProfileEvent == null ? 0 : editProfileEvent.hashCode())) * 31;
            EditProfileEvent editProfileEvent2 = this.dismissEvent;
            return iHashCode4 + (editProfileEvent2 != null ? editProfileEvent2.hashCode() : 0);
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
            EditProfileEvent editProfileEvent = this.approveEvent;
            EditProfileEvent editProfileEvent2 = this.dismissEvent;
            StringBuilder sbM106658q = AbstractC33745d.m106658q("EditProfileDialogState(title=", textResource, ", primaryActionText=", textResource2, ", primaryActionColor=");
            AbstractC33745d.m106665x(sbM106658q, interfaceC39332e, ", secondaryActionText=", textResource3, ", description=");
            AbstractC33745d.m106664w(textResource4, ", showCloseIcon=", ", useSolidButtons=", sbM106658q, z4);
            AbstractC33745d.m106666y(sbM106658q, z13, ", topDialogStyle=", enumC21213p, ", approveEvent=");
            sbM106658q.append(editProfileEvent);
            sbM106658q.append(", dismissEvent=");
            sbM106658q.append(editProfileEvent2);
            sbM106658q.append(")");
            return sbM106658q.toString();
        }

        public /* synthetic */ EditProfileDialogState(TextResource textResource, TextResource textResource2, InterfaceC39332e interfaceC39332e, TextResource textResource3, TextResource textResource4, boolean z4, boolean z13, EnumC21213p enumC21213p, EditProfileEvent editProfileEvent, EditProfileEvent editProfileEvent2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(textResource, (i13 & 2) != 0 ? null : textResource2, (i13 & 4) != 0 ? null : interfaceC39332e, (i13 & 8) != 0 ? null : textResource3, textResource4, (i13 & 32) != 0 ? false : z4, (i13 & 64) != 0 ? false : z13, (i13 & 128) != 0 ? EnumC21213p.DEFAULT : enumC21213p, (i13 & 256) != 0 ? null : editProfileEvent, (i13 & 512) != 0 ? null : editProfileEvent2);
        }
    }

    public /* synthetic */ EditProfileViewState(EditProfileDialogState editProfileDialogState, FullScreenModal fullScreenModal, EditProfileData editProfileData, EditableFields editableFields, AvatarViewState avatarViewState, EmailValidationViewState emailValidationViewState, UsernameValidationViewState usernameValidationViewState, boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : editProfileDialogState, (i13 & 2) != 0 ? null : fullScreenModal, (i13 & 4) == 0 ? editProfileData : null, (i13 & 8) != 0 ? new EditableFields(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null) : editableFields, (i13 & 16) != 0 ? new AvatarViewState(false, false, null, null, false, null, false, false, false, false, null, 2047, null) : avatarViewState, (i13 & 32) != 0 ? new EmailValidationViewState(false, null, null, null, 15, null) : emailValidationViewState, (i13 & 64) != 0 ? new UsernameValidationViewState(false, null, null, null, null, 31, null) : usernameValidationViewState, (i13 & 128) != 0 ? false : z4, (i13 & 256) != 0 ? false : z13);
    }
}
