package io.getstream.chat.android.p226ui.common.images.resizing;

import io.getstream.chat.android.models.streamcdn.image.StreamCdnCropImageMode;
import io.getstream.chat.android.models.streamcdn.image.StreamCdnResizeImageMode;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003J?\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;", "", "imageResizingEnabled", "", "resizedWidthPercentage", "", "resizedHeightPercentage", "resizeMode", "Lio/getstream/chat/android/models/streamcdn/image/StreamCdnResizeImageMode;", "cropMode", "Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;", "<init>", "(ZFFLio/getstream/chat/android/models/streamcdn/image/StreamCdnResizeImageMode;Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;)V", "getImageResizingEnabled", "()Z", "getResizedWidthPercentage", "()F", "getResizedHeightPercentage", "getResizeMode", "()Lio/getstream/chat/android/models/streamcdn/image/StreamCdnResizeImageMode;", "getCropMode", "()Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class StreamCdnImageResizing {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final StreamCdnCropImageMode cropMode;
    private final boolean imageResizingEnabled;
    private final StreamCdnResizeImageMode resizeMode;
    private final float resizedHeightPercentage;
    private final float resizedWidthPercentage;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing$Companion;", "", "<init>", "()V", "defaultStreamCdnImageResizing", "Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final StreamCdnImageResizing defaultStreamCdnImageResizing() {
            return new StreamCdnImageResizing(false, 1.0f, 1.0f, null, null);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public StreamCdnImageResizing(boolean z4, float f13, float f14, StreamCdnResizeImageMode streamCdnResizeImageMode, StreamCdnCropImageMode streamCdnCropImageMode) {
        this.imageResizingEnabled = z4;
        this.resizedWidthPercentage = f13;
        this.resizedHeightPercentage = f14;
        this.resizeMode = streamCdnResizeImageMode;
        this.cropMode = streamCdnCropImageMode;
    }

    public static StreamCdnImageResizing copy$default(StreamCdnImageResizing streamCdnImageResizing, boolean z4, float f13, float f14, StreamCdnResizeImageMode streamCdnResizeImageMode, StreamCdnCropImageMode streamCdnCropImageMode, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = streamCdnImageResizing.imageResizingEnabled;
        }
        if ((i13 & 2) != 0) {
            f13 = streamCdnImageResizing.resizedWidthPercentage;
        }
        if ((i13 & 4) != 0) {
            f14 = streamCdnImageResizing.resizedHeightPercentage;
        }
        if ((i13 & 8) != 0) {
            streamCdnResizeImageMode = streamCdnImageResizing.resizeMode;
        }
        if ((i13 & 16) != 0) {
            streamCdnCropImageMode = streamCdnImageResizing.cropMode;
        }
        StreamCdnCropImageMode streamCdnCropImageMode2 = streamCdnCropImageMode;
        streamCdnImageResizing.getClass();
        float f15 = f14;
        return new StreamCdnImageResizing(z4, f13, f15, streamCdnResizeImageMode, streamCdnCropImageMode2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getImageResizingEnabled() {
        return this.imageResizingEnabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getResizedWidthPercentage() {
        return this.resizedWidthPercentage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getResizedHeightPercentage() {
        return this.resizedHeightPercentage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final StreamCdnResizeImageMode getResizeMode() {
        return this.resizeMode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final StreamCdnCropImageMode getCropMode() {
        return this.cropMode;
    }

    public final StreamCdnImageResizing copy(boolean imageResizingEnabled, float resizedWidthPercentage, float resizedHeightPercentage, StreamCdnResizeImageMode resizeMode, StreamCdnCropImageMode cropMode) {
        return new StreamCdnImageResizing(imageResizingEnabled, resizedWidthPercentage, resizedHeightPercentage, resizeMode, cropMode);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StreamCdnImageResizing)) {
            return false;
        }
        StreamCdnImageResizing streamCdnImageResizing = (StreamCdnImageResizing) other;
        return this.imageResizingEnabled == streamCdnImageResizing.imageResizingEnabled && Float.compare(this.resizedWidthPercentage, streamCdnImageResizing.resizedWidthPercentage) == 0 && Float.compare(this.resizedHeightPercentage, streamCdnImageResizing.resizedHeightPercentage) == 0 && this.resizeMode == streamCdnImageResizing.resizeMode && this.cropMode == streamCdnImageResizing.cropMode;
    }

    public final StreamCdnCropImageMode getCropMode() {
        return this.cropMode;
    }

    public final boolean getImageResizingEnabled() {
        return this.imageResizingEnabled;
    }

    public final StreamCdnResizeImageMode getResizeMode() {
        return this.resizeMode;
    }

    public final float getResizedHeightPercentage() {
        return this.resizedHeightPercentage;
    }

    public final float getResizedWidthPercentage() {
        return this.resizedWidthPercentage;
    }

    public final int hashCode() {
        int iM30447a = AbstractC11266d.m30447a(this.resizedHeightPercentage, AbstractC11266d.m30447a(this.resizedWidthPercentage, Boolean.hashCode(this.imageResizingEnabled) * 31, 31), 31);
        StreamCdnResizeImageMode streamCdnResizeImageMode = this.resizeMode;
        int iHashCode = (iM30447a + (streamCdnResizeImageMode == null ? 0 : streamCdnResizeImageMode.hashCode())) * 31;
        StreamCdnCropImageMode streamCdnCropImageMode = this.cropMode;
        return iHashCode + (streamCdnCropImageMode != null ? streamCdnCropImageMode.hashCode() : 0);
    }

    public final String toString() {
        return "StreamCdnImageResizing(imageResizingEnabled=" + this.imageResizingEnabled + ", resizedWidthPercentage=" + this.resizedWidthPercentage + ", resizedHeightPercentage=" + this.resizedHeightPercentage + ", resizeMode=" + this.resizeMode + ", cropMode=" + this.cropMode + ")";
    }
}
