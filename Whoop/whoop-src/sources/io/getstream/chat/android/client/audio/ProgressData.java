package io.getstream.chat.android.client.audio;

import androidx.core.app.NotificationCompat;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import p000.AbstractC11266d;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/chat/android/client/audio/ProgressData;", "", "currentPosition", "", NotificationCompat.CATEGORY_PROGRESS, "", AttachmentExtensionsKt.EXTRA_DURATION, "<init>", "(IFI)V", "getCurrentPosition", "()I", "getProgress", "()F", "getDuration", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ProgressData {
    private final int currentPosition;
    private final int duration;
    private final float progress;

    public ProgressData(int i13, float f13, int i14) {
        this.currentPosition = i13;
        this.progress = f13;
        this.duration = i14;
    }

    public static ProgressData copy$default(ProgressData progressData, int i13, float f13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = progressData.currentPosition;
        }
        if ((i15 & 2) != 0) {
            f13 = progressData.progress;
        }
        if ((i15 & 4) != 0) {
            i14 = progressData.duration;
        }
        progressData.getClass();
        return new ProgressData(i13, f13, i14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCurrentPosition() {
        return this.currentPosition;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    public final ProgressData copy(int currentPosition, float progress, int duration) {
        return new ProgressData(currentPosition, progress, duration);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressData)) {
            return false;
        }
        ProgressData progressData = (ProgressData) other;
        return this.currentPosition == progressData.currentPosition && Float.compare(this.progress, progressData.progress) == 0 && this.duration == progressData.duration;
    }

    public final int getCurrentPosition() {
        return this.currentPosition;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final int hashCode() {
        return Integer.hashCode(this.duration) + AbstractC11266d.m30447a(this.progress, Integer.hashCode(this.currentPosition) * 31, 31);
    }

    public final String toString() {
        int i13 = this.currentPosition;
        float f13 = this.progress;
        int i14 = this.duration;
        StringBuilder sb4 = new StringBuilder("ProgressData(currentPosition=");
        sb4.append(i13);
        sb4.append(", progress=");
        sb4.append(f13);
        sb4.append(", duration=");
        return AbstractC18489d0.m53371l(sb4, i14, ")");
    }
}
