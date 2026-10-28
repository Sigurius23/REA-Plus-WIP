package io.getstream.chat.android.client.uploader;

import java.io.File;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/chat/android/client/uploader/NoOpFileTransformer;", "Lio/getstream/chat/android/client/uploader/FileTransformer;", "<init>", "()V", "transform", "Ljava/io/File;", "file", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class NoOpFileTransformer implements FileTransformer {
    public static final NoOpFileTransformer INSTANCE = new NoOpFileTransformer();

    private NoOpFileTransformer() {
    }

    @Override // io.getstream.chat.android.client.uploader.FileTransformer
    public final File transform(File file) {
        AbstractC22676k.m65750j(file, "file");
        return file;
    }
}
