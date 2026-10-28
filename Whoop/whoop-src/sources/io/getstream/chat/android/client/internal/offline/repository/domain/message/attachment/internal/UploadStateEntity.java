package io.getstream.chat.android.client.internal.offline.repository.domain.message.attachment.internal;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/UploadStateEntity;", "", "statusCode", "", "errorMessage", "", "<init>", "(ILjava/lang/String;)V", "getStatusCode", "()I", "getErrorMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UploadStateEntity {
    public static final int UPLOAD_STATE_FAILED = 3;
    public static final int UPLOAD_STATE_IN_PROGRESS = 2;
    public static final int UPLOAD_STATE_SUCCESS = 1;
    private final String errorMessage;
    private final int statusCode;

    public UploadStateEntity(int i13, String str) {
        this.statusCode = i13;
        this.errorMessage = str;
    }

    public static UploadStateEntity copy$default(UploadStateEntity uploadStateEntity, int i13, String str, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = uploadStateEntity.statusCode;
        }
        if ((i14 & 2) != 0) {
            str = uploadStateEntity.errorMessage;
        }
        uploadStateEntity.getClass();
        return new UploadStateEntity(i13, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final UploadStateEntity copy(int statusCode, String errorMessage) {
        return new UploadStateEntity(statusCode, errorMessage);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadStateEntity)) {
            return false;
        }
        UploadStateEntity uploadStateEntity = (UploadStateEntity) other;
        return this.statusCode == uploadStateEntity.statusCode && AbstractC22676k.m65745e(this.errorMessage, uploadStateEntity.errorMessage);
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.statusCode) * 31;
        String str = this.errorMessage;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return AbstractC30007c.m91838h(this.statusCode, "UploadStateEntity(statusCode=", ", errorMessage=", this.errorMessage, ")");
    }
}
