package io.getstream.chat.android.models.streamcdn.image;

import p319m4.AbstractC25012a;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/models/streamcdn/image/StreamCdnOriginalImageDimensions;", "", "originalWidth", "", "originalHeight", "<init>", "(II)V", "getOriginalWidth", "()I", "getOriginalHeight", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class StreamCdnOriginalImageDimensions {
    private final int originalHeight;
    private final int originalWidth;

    public StreamCdnOriginalImageDimensions(int i13, int i14) {
        this.originalWidth = i13;
        this.originalHeight = i14;
    }

    public static /* synthetic */ StreamCdnOriginalImageDimensions copy$default(StreamCdnOriginalImageDimensions streamCdnOriginalImageDimensions, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = streamCdnOriginalImageDimensions.originalWidth;
        }
        if ((i15 & 2) != 0) {
            i14 = streamCdnOriginalImageDimensions.originalHeight;
        }
        return streamCdnOriginalImageDimensions.copy(i13, i14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getOriginalWidth() {
        return this.originalWidth;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getOriginalHeight() {
        return this.originalHeight;
    }

    public final StreamCdnOriginalImageDimensions copy(int originalWidth, int originalHeight) {
        return new StreamCdnOriginalImageDimensions(originalWidth, originalHeight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StreamCdnOriginalImageDimensions)) {
            return false;
        }
        StreamCdnOriginalImageDimensions streamCdnOriginalImageDimensions = (StreamCdnOriginalImageDimensions) other;
        return this.originalWidth == streamCdnOriginalImageDimensions.originalWidth && this.originalHeight == streamCdnOriginalImageDimensions.originalHeight;
    }

    public final int getOriginalHeight() {
        return this.originalHeight;
    }

    public final int getOriginalWidth() {
        return this.originalWidth;
    }

    public int hashCode() {
        return Integer.hashCode(this.originalHeight) + (Integer.hashCode(this.originalWidth) * 31);
    }

    public String toString() {
        return AbstractC25012a.m73372e(this.originalWidth, this.originalHeight, "StreamCdnOriginalImageDimensions(originalWidth=", ", originalHeight=", ")");
    }
}
