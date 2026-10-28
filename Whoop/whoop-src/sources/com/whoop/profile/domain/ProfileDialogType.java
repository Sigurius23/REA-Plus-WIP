package com.whoop.profile.domain;

import p715kotlin.Metadata;
import y82.EnumC39339b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0001\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileDialogType;", "", "FullScreenModal", "Loading", "NetworkError", "RequestFailed", EnumC39339b.RESULT_SUCCESS, "Lcom/whoop/profile/domain/ProfileDialogType$FullScreenModal;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface ProfileDialogType {

    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileDialogType$FullScreenModal;", "Lcom/whoop/profile/domain/ProfileDialogType;", "Lcom/whoop/profile/domain/ProfileDialogType$Loading;", "Lcom/whoop/profile/domain/ProfileDialogType$NetworkError;", "Lcom/whoop/profile/domain/ProfileDialogType$RequestFailed;", "Lcom/whoop/profile/domain/ProfileDialogType$Success;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface FullScreenModal extends ProfileDialogType {
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileDialogType$Loading;", "Lcom/whoop/profile/domain/ProfileDialogType$FullScreenModal;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Loading implements FullScreenModal {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileDialogType$NetworkError;", "Lcom/whoop/profile/domain/ProfileDialogType$FullScreenModal;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class NetworkError implements FullScreenModal {
        public static final int $stable = 0;
        public static final NetworkError INSTANCE = new NetworkError();

        private NetworkError() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileDialogType$RequestFailed;", "Lcom/whoop/profile/domain/ProfileDialogType$FullScreenModal;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class RequestFailed implements FullScreenModal {
        public static final int $stable = 0;
        public static final RequestFailed INSTANCE = new RequestFailed();

        private RequestFailed() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileDialogType$Success;", "Lcom/whoop/profile/domain/ProfileDialogType$FullScreenModal;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Success implements FullScreenModal {
        public static final int $stable = 0;
        public static final Success INSTANCE = new Success();

        private Success() {
        }
    }
}
