package io.getstream.android.video.generated.models;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lio/getstream/android/video/generated/models/UnsupportedVideoEventException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "type", "", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class UnsupportedVideoEventException extends Exception {
    private final String type;

    public UnsupportedVideoEventException(String type) {
        AbstractC22676k.m65750j(type, "type");
        this.type = type;
    }

    public final String getType() {
        return this.type;
    }
}
