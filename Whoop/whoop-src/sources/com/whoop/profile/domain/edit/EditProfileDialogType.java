package com.whoop.profile.domain.edit;

import p715kotlin.Metadata;
import y82.EnumC39339b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0002\n\u000b¨\u0006\fÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileDialogType;", "", "FullScreenModal", "Loading", "Saving", EnumC39339b.RESULT_SUCCESS, "NetworkError", "RequestFailed", "SaveError", "NoChangesToSave", "Lcom/whoop/profile/domain/edit/EditProfileDialogType$FullScreenModal;", "Lcom/whoop/profile/domain/edit/EditProfileDialogType$NoChangesToSave;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface EditProfileDialogType {

    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileDialogType$FullScreenModal;", "Lcom/whoop/profile/domain/edit/EditProfileDialogType;", "Lcom/whoop/profile/domain/edit/EditProfileDialogType$Loading;", "Lcom/whoop/profile/domain/edit/EditProfileDialogType$NetworkError;", "Lcom/whoop/profile/domain/edit/EditProfileDialogType$RequestFailed;", "Lcom/whoop/profile/domain/edit/EditProfileDialogType$SaveError;", "Lcom/whoop/profile/domain/edit/EditProfileDialogType$Saving;", "Lcom/whoop/profile/domain/edit/EditProfileDialogType$Success;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface FullScreenModal extends EditProfileDialogType {
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileDialogType$Loading;", "Lcom/whoop/profile/domain/edit/EditProfileDialogType$FullScreenModal;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Loading implements FullScreenModal {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileDialogType$NetworkError;", "Lcom/whoop/profile/domain/edit/EditProfileDialogType$FullScreenModal;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class NetworkError implements FullScreenModal {
        public static final int $stable = 0;
        public static final NetworkError INSTANCE = new NetworkError();

        private NetworkError() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileDialogType$NoChangesToSave;", "Lcom/whoop/profile/domain/edit/EditProfileDialogType;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class NoChangesToSave implements EditProfileDialogType {
        public static final int $stable = 0;
        public static final NoChangesToSave INSTANCE = new NoChangesToSave();

        private NoChangesToSave() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileDialogType$RequestFailed;", "Lcom/whoop/profile/domain/edit/EditProfileDialogType$FullScreenModal;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class RequestFailed implements FullScreenModal {
        public static final int $stable = 0;
        public static final RequestFailed INSTANCE = new RequestFailed();

        private RequestFailed() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileDialogType$SaveError;", "Lcom/whoop/profile/domain/edit/EditProfileDialogType$FullScreenModal;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class SaveError implements FullScreenModal {
        public static final int $stable = 0;
        public static final SaveError INSTANCE = new SaveError();

        private SaveError() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileDialogType$Saving;", "Lcom/whoop/profile/domain/edit/EditProfileDialogType$FullScreenModal;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Saving implements FullScreenModal {
        public static final int $stable = 0;
        public static final Saving INSTANCE = new Saving();

        private Saving() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileDialogType$Success;", "Lcom/whoop/profile/domain/edit/EditProfileDialogType$FullScreenModal;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Success implements FullScreenModal {
        public static final int $stable = 0;
        public static final Success INSTANCE = new Success();

        private Success() {
        }
    }
}
