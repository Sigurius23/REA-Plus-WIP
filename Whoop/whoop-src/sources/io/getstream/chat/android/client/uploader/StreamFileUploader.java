package io.getstream.chat.android.client.uploader;

import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.api.RetrofitCdnApi;
import io.getstream.chat.android.client.api.models.UploadFileResponse;
import io.getstream.chat.android.client.api2.mapping.UploadFileResponseMappingKt;
import io.getstream.chat.android.client.extensions.FileExtensionsKt;
import io.getstream.chat.android.client.utils.ProgressCallback;
import java.io.File;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import p463rj.AbstractC31484o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.AbstractC34846v0;
import ud3.C34818h0;
import ud3.C34820i0;
import ud3.C34834p0;
import ud3.C34844u0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ=\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0015J=\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0014J5\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J5\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ5\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ'\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000e\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00112\u0006\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001fJ'\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000e\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b \u0010\u001eJ\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00112\u0006\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, m65681d2 = {"Lio/getstream/chat/android/client/uploader/StreamFileUploader;", "Lio/getstream/chat/android/client/uploader/FileUploader;", "Lio/getstream/chat/android/client/api/RetrofitCdnApi;", "retrofitCdnApi", "<init>", "(Lio/getstream/chat/android/client/api/RetrofitCdnApi;)V", "Ljava/io/File;", "Lud3/i0;", "asBodyPart", "(Ljava/io/File;)Lud3/i0;", "", "channelType", "channelId", "userId", "file", "Lio/getstream/chat/android/client/utils/ProgressCallback;", "callback", "Ln23/h;", "Lio/getstream/chat/android/models/UploadedFile;", "sendFile", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Ln23/h;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ln23/h;", "sendImage", QueryParams.URL, "Ll83/a0;", "deleteFile", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ln23/h;", "deleteImage", "progressCallback", "uploadFile", "(Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Ln23/h;", "(Ljava/lang/String;)Ln23/h;", "uploadImage", "Lio/getstream/chat/android/client/api/RetrofitCdnApi;", "Lio/getstream/chat/android/client/uploader/FilenameSanitizer;", "filenameSanitizer", "Lio/getstream/chat/android/client/uploader/FilenameSanitizer;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class StreamFileUploader implements FileUploader {
    private final FilenameSanitizer filenameSanitizer;
    private final RetrofitCdnApi retrofitCdnApi;

    public StreamFileUploader(RetrofitCdnApi retrofitCdnApi) {
        AbstractC22676k.m65750j(retrofitCdnApi, "retrofitCdnApi");
        this.retrofitCdnApi = retrofitCdnApi;
        this.filenameSanitizer = new FilenameSanitizer();
    }

    private final C34820i0 asBodyPart(File file) {
        C34844u0 c34844u0 = AbstractC34846v0.Companion;
        C34818h0 mediaType = FileExtensionsKt.getMediaType(file);
        c34844u0.getClass();
        C34834p0 c34834p0M109924a = C34844u0.m109924a(file, mediaType);
        FilenameSanitizer filenameSanitizer = this.filenameSanitizer;
        String name = file.getName();
        AbstractC22676k.m65749i(name, "getName(...)");
        return AbstractC31484o.m96963o("file", filenameSanitizer.sanitize(name), c34834p0M109924a);
    }

    @Override // io.getstream.chat.android.client.uploader.FileUploader
    public final AbstractC26205h deleteFile(String channelType, String channelId, String userId, String url) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(url, "url");
        return this.retrofitCdnApi.deleteFile(channelType, channelId, url).execute().m77818d();
    }

    @Override // io.getstream.chat.android.client.uploader.FileUploader
    public final AbstractC26205h deleteImage(String channelType, String channelId, String userId, String url) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(url, "url");
        return this.retrofitCdnApi.deleteImage(channelType, channelId, url).execute().m77818d();
    }

    @Override // io.getstream.chat.android.client.uploader.FileUploader
    public final AbstractC26205h sendFile(String channelType, String channelId, String userId, File file, ProgressCallback callback) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(file, "file");
        AbstractC22676k.m65750j(callback, "callback");
        AbstractC26205h abstractC26205hExecute = this.retrofitCdnApi.sendFile(channelType, channelId, asBodyPart(file), callback).execute();
        if (abstractC26205hExecute instanceof C26204g) {
            return new C26204g(UploadFileResponseMappingKt.toUploadedFile((UploadFileResponse) ((C26204g) abstractC26205hExecute).m77814e()));
        }
        if (abstractC26205hExecute instanceof C26203f) {
            return abstractC26205hExecute;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // io.getstream.chat.android.client.uploader.FileUploader
    public final AbstractC26205h sendImage(String channelType, String channelId, String userId, File file, ProgressCallback callback) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(file, "file");
        AbstractC22676k.m65750j(callback, "callback");
        AbstractC26205h abstractC26205hExecute = this.retrofitCdnApi.sendImage(channelType, channelId, asBodyPart(file), callback).execute();
        if (abstractC26205hExecute instanceof C26204g) {
            return new C26204g(UploadFileResponseMappingKt.toUploadedFile((UploadFileResponse) ((C26204g) abstractC26205hExecute).m77814e()));
        }
        if (abstractC26205hExecute instanceof C26203f) {
            return abstractC26205hExecute;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // io.getstream.chat.android.client.uploader.FileUploader
    public final AbstractC26205h uploadFile(File file, ProgressCallback progressCallback) {
        AbstractC22676k.m65750j(file, "file");
        AbstractC26205h abstractC26205hExecute = this.retrofitCdnApi.uploadFile(asBodyPart(file), progressCallback).execute();
        if (abstractC26205hExecute instanceof C26204g) {
            return new C26204g(UploadFileResponseMappingKt.toUploadedFile((UploadFileResponse) ((C26204g) abstractC26205hExecute).m77814e()));
        }
        if (abstractC26205hExecute instanceof C26203f) {
            return abstractC26205hExecute;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // io.getstream.chat.android.client.uploader.FileUploader
    public final AbstractC26205h uploadImage(File file, ProgressCallback progressCallback) {
        AbstractC22676k.m65750j(file, "file");
        AbstractC26205h abstractC26205hExecute = this.retrofitCdnApi.uploadImage(asBodyPart(file), progressCallback).execute();
        if (abstractC26205hExecute instanceof C26204g) {
            return new C26204g(UploadFileResponseMappingKt.toUploadedFile((UploadFileResponse) ((C26204g) abstractC26205hExecute).m77814e()));
        }
        if (abstractC26205hExecute instanceof C26203f) {
            return abstractC26205hExecute;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // io.getstream.chat.android.client.uploader.FileUploader
    public final AbstractC26205h deleteFile(String url) {
        AbstractC22676k.m65750j(url, "url");
        return this.retrofitCdnApi.deleteFile(url).execute().m77818d();
    }

    @Override // io.getstream.chat.android.client.uploader.FileUploader
    public final AbstractC26205h deleteImage(String url) {
        AbstractC22676k.m65750j(url, "url");
        return this.retrofitCdnApi.deleteImage(url).execute().m77818d();
    }

    @Override // io.getstream.chat.android.client.uploader.FileUploader
    public final AbstractC26205h sendFile(String channelType, String channelId, String userId, File file) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(file, "file");
        AbstractC26205h abstractC26205hExecute = this.retrofitCdnApi.sendFile(channelType, channelId, asBodyPart(file), null).execute();
        if (abstractC26205hExecute instanceof C26204g) {
            return new C26204g(UploadFileResponseMappingKt.toUploadedFile((UploadFileResponse) ((C26204g) abstractC26205hExecute).m77814e()));
        }
        if (abstractC26205hExecute instanceof C26203f) {
            return abstractC26205hExecute;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // io.getstream.chat.android.client.uploader.FileUploader
    public final AbstractC26205h sendImage(String channelType, String channelId, String userId, File file) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(file, "file");
        AbstractC26205h abstractC26205hExecute = this.retrofitCdnApi.sendImage(channelType, channelId, asBodyPart(file), null).execute();
        if (abstractC26205hExecute instanceof C26204g) {
            return new C26204g(UploadFileResponseMappingKt.toUploadedFile((UploadFileResponse) ((C26204g) abstractC26205hExecute).m77814e()));
        }
        if (abstractC26205hExecute instanceof C26203f) {
            return abstractC26205hExecute;
        }
        throw new NoWhenBranchMatchedException();
    }
}
