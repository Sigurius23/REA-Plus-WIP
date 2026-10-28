package io.getstream.chat.android.client.api2.model.response;

import live.hms.video.utils.HMSFieldTrials;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/response/AppDto;", "", "name", "", "file_upload_config", "Lio/getstream/chat/android/client/api2/model/response/FileUploadConfigDto;", "image_upload_config", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/response/FileUploadConfigDto;Lio/getstream/chat/android/client/api2/model/response/FileUploadConfigDto;)V", "getName", "()Ljava/lang/String;", "getFile_upload_config", "()Lio/getstream/chat/android/client/api2/model/response/FileUploadConfigDto;", "getImage_upload_config", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class AppDto {
    private final FileUploadConfigDto file_upload_config;
    private final FileUploadConfigDto image_upload_config;
    private final String name;

    public AppDto(String name, FileUploadConfigDto file_upload_config, FileUploadConfigDto image_upload_config) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(file_upload_config, "file_upload_config");
        AbstractC22676k.m65750j(image_upload_config, "image_upload_config");
        this.name = name;
        this.file_upload_config = file_upload_config;
        this.image_upload_config = image_upload_config;
    }

    public static /* synthetic */ AppDto copy$default(AppDto appDto, String str, FileUploadConfigDto fileUploadConfigDto, FileUploadConfigDto fileUploadConfigDto2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = appDto.name;
        }
        if ((i13 & 2) != 0) {
            fileUploadConfigDto = appDto.file_upload_config;
        }
        if ((i13 & 4) != 0) {
            fileUploadConfigDto2 = appDto.image_upload_config;
        }
        return appDto.copy(str, fileUploadConfigDto, fileUploadConfigDto2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FileUploadConfigDto getFile_upload_config() {
        return this.file_upload_config;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final FileUploadConfigDto getImage_upload_config() {
        return this.image_upload_config;
    }

    public final AppDto copy(String name, FileUploadConfigDto file_upload_config, FileUploadConfigDto image_upload_config) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(file_upload_config, "file_upload_config");
        AbstractC22676k.m65750j(image_upload_config, "image_upload_config");
        return new AppDto(name, file_upload_config, image_upload_config);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppDto)) {
            return false;
        }
        AppDto appDto = (AppDto) other;
        return AbstractC22676k.m65745e(this.name, appDto.name) && AbstractC22676k.m65745e(this.file_upload_config, appDto.file_upload_config) && AbstractC22676k.m65745e(this.image_upload_config, appDto.image_upload_config);
    }

    public final FileUploadConfigDto getFile_upload_config() {
        return this.file_upload_config;
    }

    public final FileUploadConfigDto getImage_upload_config() {
        return this.image_upload_config;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.image_upload_config.hashCode() + ((this.file_upload_config.hashCode() + (this.name.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "AppDto(name=" + this.name + ", file_upload_config=" + this.file_upload_config + ", image_upload_config=" + this.image_upload_config + ")";
    }
}
