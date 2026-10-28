package io.getstream.chat.android.client.uploader;

import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.utils.ProgressCallback;
import java.io.File;
import n23.AbstractC26205h;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J=\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\f\u0010\rJ5\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\u000eJ=\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000f\u0010\rJ5\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u000f\u0010\u000eJ5\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013J5\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u0013J'\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0018J'\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/uploader/FileUploader;", "", "", "channelType", "channelId", "userId", "Ljava/io/File;", "file", "Lio/getstream/chat/android/client/utils/ProgressCallback;", "callback", "Ln23/h;", "Lio/getstream/chat/android/models/UploadedFile;", "sendFile", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Ln23/h;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ln23/h;", "sendImage", QueryParams.URL, "Ll83/a0;", "deleteFile", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ln23/h;", "deleteImage", "progressCallback", "uploadFile", "(Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Ln23/h;", "(Ljava/lang/String;)Ln23/h;", "uploadImage", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface FileUploader {
    default AbstractC26205h deleteFile(String url) {
        AbstractC22676k.m65750j(url, "url");
        int i13 = FileUploaderKt.f73956a;
        throw new KotlinNothingValueException();
    }

    AbstractC26205h deleteFile(String channelType, String channelId, String userId, String url);

    default AbstractC26205h deleteImage(String url) {
        AbstractC22676k.m65750j(url, "url");
        int i13 = FileUploaderKt.f73956a;
        throw new KotlinNothingValueException();
    }

    AbstractC26205h deleteImage(String channelType, String channelId, String userId, String url);

    AbstractC26205h sendFile(String channelType, String channelId, String userId, File file);

    AbstractC26205h sendFile(String channelType, String channelId, String userId, File file, ProgressCallback callback);

    AbstractC26205h sendImage(String channelType, String channelId, String userId, File file);

    AbstractC26205h sendImage(String channelType, String channelId, String userId, File file, ProgressCallback callback);

    default AbstractC26205h uploadFile(File file, ProgressCallback progressCallback) {
        AbstractC22676k.m65750j(file, "file");
        int i13 = FileUploaderKt.f73956a;
        throw new KotlinNothingValueException();
    }

    default AbstractC26205h uploadImage(File file, ProgressCallback progressCallback) {
        AbstractC22676k.m65750j(file, "file");
        int i13 = FileUploaderKt.f73956a;
        throw new KotlinNothingValueException();
    }
}
