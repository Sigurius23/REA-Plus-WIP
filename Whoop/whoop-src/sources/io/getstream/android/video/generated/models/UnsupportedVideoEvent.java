package io.getstream.android.video.generated.models;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m65681d2 = {"Lio/getstream/android/video/generated/models/UnsupportedVideoEvent;", "Lio/getstream/android/video/generated/models/VideoEvent;", "type", "", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getEventType", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class UnsupportedVideoEvent extends VideoEvent {
    private final String type;

    public UnsupportedVideoEvent(String type) {
        AbstractC22676k.m65750j(type, "type");
        this.type = type;
    }

    @Override // io.getstream.android.video.generated.models.VideoEvent
    /* JADX INFO: renamed from: getEventType, reason: from getter */
    public String getType() {
        return this.type;
    }

    public final String getType() {
        return this.type;
    }
}
