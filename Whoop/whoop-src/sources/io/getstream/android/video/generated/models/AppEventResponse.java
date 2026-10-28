package io.getstream.android.video.generated.models;

import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003JF\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m65681d2 = {"Lio/getstream/android/video/generated/models/AppEventResponse;", "", "autoTranslationEnabled", "", "name", "", "asyncUrlEnrichEnabled", "fileUploadConfig", "Lio/getstream/android/video/generated/models/FileUploadConfig;", "imageUploadConfig", "(ZLjava/lang/String;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/FileUploadConfig;Lio/getstream/android/video/generated/models/FileUploadConfig;)V", "getAsyncUrlEnrichEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAutoTranslationEnabled", "()Z", "getFileUploadConfig", "()Lio/getstream/android/video/generated/models/FileUploadConfig;", "getImageUploadConfig", "getName", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "(ZLjava/lang/String;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/FileUploadConfig;Lio/getstream/android/video/generated/models/FileUploadConfig;)Lio/getstream/android/video/generated/models/AppEventResponse;", "equals", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class AppEventResponse {
    private final Boolean asyncUrlEnrichEnabled;
    private final boolean autoTranslationEnabled;
    private final FileUploadConfig fileUploadConfig;
    private final FileUploadConfig imageUploadConfig;
    private final String name;

    public AppEventResponse(@InterfaceC30731q(name = "auto_translation_enabled") boolean z4, @InterfaceC30731q(name = "name") String name, @InterfaceC30731q(name = "async_url_enrich_enabled") Boolean bool, @InterfaceC30731q(name = "file_upload_config") FileUploadConfig fileUploadConfig, @InterfaceC30731q(name = "image_upload_config") FileUploadConfig fileUploadConfig2) {
        AbstractC22676k.m65750j(name, "name");
        this.autoTranslationEnabled = z4;
        this.name = name;
        this.asyncUrlEnrichEnabled = bool;
        this.fileUploadConfig = fileUploadConfig;
        this.imageUploadConfig = fileUploadConfig2;
    }

    public static /* synthetic */ AppEventResponse copy$default(AppEventResponse appEventResponse, boolean z4, String str, Boolean bool, FileUploadConfig fileUploadConfig, FileUploadConfig fileUploadConfig2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = appEventResponse.autoTranslationEnabled;
        }
        if ((i13 & 2) != 0) {
            str = appEventResponse.name;
        }
        if ((i13 & 4) != 0) {
            bool = appEventResponse.asyncUrlEnrichEnabled;
        }
        if ((i13 & 8) != 0) {
            fileUploadConfig = appEventResponse.fileUploadConfig;
        }
        if ((i13 & 16) != 0) {
            fileUploadConfig2 = appEventResponse.imageUploadConfig;
        }
        FileUploadConfig fileUploadConfig3 = fileUploadConfig2;
        Boolean bool2 = bool;
        return appEventResponse.copy(z4, str, bool2, fileUploadConfig, fileUploadConfig3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getAutoTranslationEnabled() {
        return this.autoTranslationEnabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getAsyncUrlEnrichEnabled() {
        return this.asyncUrlEnrichEnabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final FileUploadConfig getFileUploadConfig() {
        return this.fileUploadConfig;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final FileUploadConfig getImageUploadConfig() {
        return this.imageUploadConfig;
    }

    public final AppEventResponse copy(@InterfaceC30731q(name = "auto_translation_enabled") boolean autoTranslationEnabled, @InterfaceC30731q(name = "name") String name, @InterfaceC30731q(name = "async_url_enrich_enabled") Boolean asyncUrlEnrichEnabled, @InterfaceC30731q(name = "file_upload_config") FileUploadConfig fileUploadConfig, @InterfaceC30731q(name = "image_upload_config") FileUploadConfig imageUploadConfig) {
        AbstractC22676k.m65750j(name, "name");
        return new AppEventResponse(autoTranslationEnabled, name, asyncUrlEnrichEnabled, fileUploadConfig, imageUploadConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppEventResponse)) {
            return false;
        }
        AppEventResponse appEventResponse = (AppEventResponse) other;
        return this.autoTranslationEnabled == appEventResponse.autoTranslationEnabled && AbstractC22676k.m65745e(this.name, appEventResponse.name) && AbstractC22676k.m65745e(this.asyncUrlEnrichEnabled, appEventResponse.asyncUrlEnrichEnabled) && AbstractC22676k.m65745e(this.fileUploadConfig, appEventResponse.fileUploadConfig) && AbstractC22676k.m65745e(this.imageUploadConfig, appEventResponse.imageUploadConfig);
    }

    public final Boolean getAsyncUrlEnrichEnabled() {
        return this.asyncUrlEnrichEnabled;
    }

    public final boolean getAutoTranslationEnabled() {
        return this.autoTranslationEnabled;
    }

    public final FileUploadConfig getFileUploadConfig() {
        return this.fileUploadConfig;
    }

    public final FileUploadConfig getImageUploadConfig() {
        return this.imageUploadConfig;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(Boolean.hashCode(this.autoTranslationEnabled) * 31, 31, this.name);
        Boolean bool = this.asyncUrlEnrichEnabled;
        int iHashCode = (iM30450d + (bool == null ? 0 : bool.hashCode())) * 31;
        FileUploadConfig fileUploadConfig = this.fileUploadConfig;
        int iHashCode2 = (iHashCode + (fileUploadConfig == null ? 0 : fileUploadConfig.hashCode())) * 31;
        FileUploadConfig fileUploadConfig2 = this.imageUploadConfig;
        return iHashCode2 + (fileUploadConfig2 != null ? fileUploadConfig2.hashCode() : 0);
    }

    public String toString() {
        boolean z4 = this.autoTranslationEnabled;
        String str = this.name;
        Boolean bool = this.asyncUrlEnrichEnabled;
        FileUploadConfig fileUploadConfig = this.fileUploadConfig;
        FileUploadConfig fileUploadConfig2 = this.imageUploadConfig;
        StringBuilder sbM38567n = AbstractC13673n.m38567n("AppEventResponse(autoTranslationEnabled=", ", name=", str, ", asyncUrlEnrichEnabled=", z4);
        sbM38567n.append(bool);
        sbM38567n.append(", fileUploadConfig=");
        sbM38567n.append(fileUploadConfig);
        sbM38567n.append(", imageUploadConfig=");
        sbM38567n.append(fileUploadConfig2);
        sbM38567n.append(")");
        return sbM38567n.toString();
    }

    public /* synthetic */ AppEventResponse(boolean z4, String str, Boolean bool, FileUploadConfig fileUploadConfig, FileUploadConfig fileUploadConfig2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, str, (i13 & 4) != 0 ? null : bool, (i13 & 8) != 0 ? null : fileUploadConfig, (i13 & 16) != 0 ? null : fileUploadConfig2);
    }
}
