package com.whoop.personalrecords.miniarch.domain;

import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y82.EnumC39339b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0001\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType;", "", "MiniArchModal", "Loading", "NetworkError", "RequestFailed", EnumC39339b.RESULT_SUCCESS, "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType$MiniArchModal;", "personal-records-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface PersonalRecordsDialogType {

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType$Loading;", "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType$MiniArchModal;", "<init>", "()V", "personal-records-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Loading implements MiniArchModal {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType$MiniArchModal;", "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType;", "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType$Loading;", "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType$NetworkError;", "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType$RequestFailed;", "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType$Success;", "personal-records-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface MiniArchModal extends PersonalRecordsDialogType {
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType$NetworkError;", "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType$MiniArchModal;", "<init>", "()V", "personal-records-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class NetworkError implements MiniArchModal {
        public static final int $stable = 0;
        public static final NetworkError INSTANCE = new NetworkError();

        private NetworkError() {
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType$RequestFailed;", "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType$MiniArchModal;", "path", "", "<init>", "(Ljava/lang/String;)V", "getPath", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "personal-records-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class RequestFailed implements MiniArchModal {
        public static final int $stable = 0;
        private final String path;

        public RequestFailed(String path) {
            AbstractC22676k.m65750j(path, "path");
            this.path = path;
        }

        public static /* synthetic */ RequestFailed copy$default(RequestFailed requestFailed, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = requestFailed.path;
            }
            return requestFailed.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        public final RequestFailed copy(String path) {
            AbstractC22676k.m65750j(path, "path");
            return new RequestFailed(path);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RequestFailed) && AbstractC22676k.m65745e(this.path, ((RequestFailed) other).path);
        }

        public final String getPath() {
            return this.path;
        }

        public int hashCode() {
            return this.path.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("RequestFailed(path=", this.path, ")");
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType$Success;", "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType$MiniArchModal;", "<init>", "()V", "personal-records-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Success implements MiniArchModal {
        public static final int $stable = 0;
        public static final Success INSTANCE = new Success();

        private Success() {
        }
    }
}
