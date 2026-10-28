package io.getstream.chat.android.p226ui.common.state.messages.list;

import ih0.AbstractC18489d0;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import java.util.List;
import m83.C25271y;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p002a0.AbstractC0040n;
import p002a0.AbstractC0042o;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes3.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001'B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u001e\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JF\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\u0012R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010\u0015¨\u0006("}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;", "", "Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;", "current", "La0/n;", "seekTo", "speeds", "Lkotlin/Function1;", "Lio/getstream/chat/android/models/Attachment;", "", "getRecordingUri", "<init>", "(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;La0/n;La0/n;Lkotlin/jvm/functions/Function1;)V", "stringify", "()Ljava/lang/String;", "component1", "()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;", "component2", "()La0/n;", "component3", "component4", "()Lkotlin/jvm/functions/Function1;", "copy", "(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;La0/n;La0/n;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;", "getCurrent", "La0/n;", "getSeekTo", "getSpeeds", "Lkotlin/jvm/functions/Function1;", "getGetRecordingUri", "CurrentAudioState", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class AudioPlayerState {
    public static final int $stable = 0;
    private final CurrentAudioState current;
    private final Function1 getRecordingUri;
    private final AbstractC0040n seekTo;
    private final AbstractC0040n speeds;

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\nHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u000eHÆ\u0003J\t\u0010'\u001a\u00020\u000eHÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003Js\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eHÆ\u0001J\u0013\u0010*\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\t\u0010-\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001e¨\u0006."}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;", "", "playingId", "", "playingSpeed", "", "playingProgress", "audioUri", "", "waveform", "", "playbackInMs", "durationInMs", "isLoading", "", "isPlaying", "isSeeking", "<init>", "(IFFLjava/lang/String;Ljava/util/List;IIZZZ)V", "getPlayingId", "()I", "getPlayingSpeed", "()F", "getPlayingProgress", "getAudioUri", "()Ljava/lang/String;", "getWaveform", "()Ljava/util/List;", "getPlaybackInMs", "getDurationInMs", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "toString", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class CurrentAudioState {
        public static final int $stable = 8;
        private final String audioUri;
        private final int durationInMs;
        private final boolean isLoading;
        private final boolean isPlaying;
        private final boolean isSeeking;
        private final int playbackInMs;
        private final int playingId;
        private final float playingProgress;
        private final float playingSpeed;
        private final List<Float> waveform;

        public CurrentAudioState() {
            this(0, 0.0f, 0.0f, null, null, 0, 0, false, false, false, 1023, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CurrentAudioState copy$default(CurrentAudioState currentAudioState, int i13, float f13, float f14, String str, List list, int i14, int i15, boolean z4, boolean z13, boolean z14, int i16, Object obj) {
            if ((i16 & 1) != 0) {
                i13 = currentAudioState.playingId;
            }
            if ((i16 & 2) != 0) {
                f13 = currentAudioState.playingSpeed;
            }
            if ((i16 & 4) != 0) {
                f14 = currentAudioState.playingProgress;
            }
            if ((i16 & 8) != 0) {
                str = currentAudioState.audioUri;
            }
            if ((i16 & 16) != 0) {
                list = currentAudioState.waveform;
            }
            if ((i16 & 32) != 0) {
                i14 = currentAudioState.playbackInMs;
            }
            if ((i16 & 64) != 0) {
                i15 = currentAudioState.durationInMs;
            }
            if ((i16 & 128) != 0) {
                z4 = currentAudioState.isLoading;
            }
            if ((i16 & 256) != 0) {
                z13 = currentAudioState.isPlaying;
            }
            if ((i16 & 512) != 0) {
                z14 = currentAudioState.isSeeking;
            }
            boolean z15 = z13;
            boolean z16 = z14;
            int i17 = i15;
            boolean z17 = z4;
            List list2 = list;
            int i18 = i14;
            return currentAudioState.copy(i13, f13, f14, str, list2, i18, i17, z17, z15, z16);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getPlayingId() {
            return this.playingId;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final boolean getIsSeeking() {
            return this.isSeeking;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getPlayingSpeed() {
            return this.playingSpeed;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getPlayingProgress() {
            return this.playingProgress;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getAudioUri() {
            return this.audioUri;
        }

        public final List<Float> component5() {
            return this.waveform;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getPlaybackInMs() {
            return this.playbackInMs;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final int getDurationInMs() {
            return this.durationInMs;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final boolean getIsPlaying() {
            return this.isPlaying;
        }

        public final CurrentAudioState copy(int playingId, float playingSpeed, float playingProgress, String audioUri, List<Float> waveform, int playbackInMs, int durationInMs, boolean isLoading, boolean isPlaying, boolean isSeeking) {
            AbstractC22676k.m65750j(audioUri, "audioUri");
            AbstractC22676k.m65750j(waveform, "waveform");
            return new CurrentAudioState(playingId, playingSpeed, playingProgress, audioUri, waveform, playbackInMs, durationInMs, isLoading, isPlaying, isSeeking);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CurrentAudioState)) {
                return false;
            }
            CurrentAudioState currentAudioState = (CurrentAudioState) other;
            return this.playingId == currentAudioState.playingId && Float.compare(this.playingSpeed, currentAudioState.playingSpeed) == 0 && Float.compare(this.playingProgress, currentAudioState.playingProgress) == 0 && AbstractC22676k.m65745e(this.audioUri, currentAudioState.audioUri) && AbstractC22676k.m65745e(this.waveform, currentAudioState.waveform) && this.playbackInMs == currentAudioState.playbackInMs && this.durationInMs == currentAudioState.durationInMs && this.isLoading == currentAudioState.isLoading && this.isPlaying == currentAudioState.isPlaying && this.isSeeking == currentAudioState.isSeeking;
        }

        public final String getAudioUri() {
            return this.audioUri;
        }

        public final int getDurationInMs() {
            return this.durationInMs;
        }

        public final int getPlaybackInMs() {
            return this.playbackInMs;
        }

        public final int getPlayingId() {
            return this.playingId;
        }

        public final float getPlayingProgress() {
            return this.playingProgress;
        }

        public final float getPlayingSpeed() {
            return this.playingSpeed;
        }

        public final List<Float> getWaveform() {
            return this.waveform;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isSeeking) + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.durationInMs, AbstractC11266d.m30448b(this.playbackInMs, AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30447a(this.playingProgress, AbstractC11266d.m30447a(this.playingSpeed, Integer.hashCode(this.playingId) * 31, 31), 31), 31, this.audioUri), 31, this.waveform), 31), 31), 31, this.isLoading), 31, this.isPlaying);
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public final boolean isPlaying() {
            return this.isPlaying;
        }

        public final boolean isSeeking() {
            return this.isSeeking;
        }

        public final String toString() {
            int i13 = this.playingId;
            float f13 = this.playingSpeed;
            float f14 = this.playingProgress;
            String str = this.audioUri;
            List<Float> list = this.waveform;
            int i14 = this.playbackInMs;
            int i15 = this.durationInMs;
            boolean z4 = this.isLoading;
            boolean z13 = this.isPlaying;
            boolean z14 = this.isSeeking;
            StringBuilder sb4 = new StringBuilder("CurrentAudioState(playingId=");
            sb4.append(i13);
            sb4.append(", playingSpeed=");
            sb4.append(f13);
            sb4.append(", playingProgress=");
            sb4.append(f14);
            sb4.append(", audioUri=");
            sb4.append(str);
            sb4.append(", waveform=");
            sb4.append(list);
            sb4.append(", playbackInMs=");
            sb4.append(i14);
            sb4.append(", durationInMs=");
            AbstractC13673n.m38573t(i15, ", isLoading=", ", isPlaying=", sb4, z4);
            return AbstractC36095b.m114682j(sb4, z13, ", isSeeking=", z14, ")");
        }

        public CurrentAudioState(int i13, float f13, float f14, String audioUri, List<Float> waveform, int i14, int i15, boolean z4, boolean z13, boolean z14) {
            AbstractC22676k.m65750j(audioUri, "audioUri");
            AbstractC22676k.m65750j(waveform, "waveform");
            this.playingId = i13;
            this.playingSpeed = f13;
            this.playingProgress = f14;
            this.audioUri = audioUri;
            this.waveform = waveform;
            this.playbackInMs = i14;
            this.durationInMs = i15;
            this.isLoading = z4;
            this.isPlaying = z13;
            this.isSeeking = z14;
        }

        public /* synthetic */ CurrentAudioState(int i13, float f13, float f14, String str, List list, int i14, int i15, boolean z4, boolean z13, boolean z14, int i16, DefaultConstructorMarker defaultConstructorMarker) {
            this((i16 & 1) != 0 ? -1 : i13, (i16 & 2) != 0 ? 1.0f : f13, (i16 & 4) != 0 ? 0.0f : f14, (i16 & 8) != 0 ? "" : str, (i16 & 16) != 0 ? C25271y.f99162w : list, (i16 & 32) != 0 ? 0 : i14, (i16 & 64) != 0 ? 0 : i15, (i16 & 128) != 0 ? false : z4, (i16 & 256) != 0 ? false : z13, (i16 & 512) != 0 ? false : z14);
        }
    }

    public AudioPlayerState(CurrentAudioState current, AbstractC0040n seekTo, AbstractC0040n speeds, Function1 getRecordingUri) {
        AbstractC22676k.m65750j(current, "current");
        AbstractC22676k.m65750j(seekTo, "seekTo");
        AbstractC22676k.m65750j(speeds, "speeds");
        AbstractC22676k.m65750j(getRecordingUri, "getRecordingUri");
        this.current = current;
        this.seekTo = seekTo;
        this.speeds = speeds;
        this.getRecordingUri = getRecordingUri;
    }

    public static /* synthetic */ AudioPlayerState copy$default(AudioPlayerState audioPlayerState, CurrentAudioState currentAudioState, AbstractC0040n abstractC0040n, AbstractC0040n abstractC0040n2, Function1 function1, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            currentAudioState = audioPlayerState.current;
        }
        if ((i13 & 2) != 0) {
            abstractC0040n = audioPlayerState.seekTo;
        }
        if ((i13 & 4) != 0) {
            abstractC0040n2 = audioPlayerState.speeds;
        }
        if ((i13 & 8) != 0) {
            function1 = audioPlayerState.getRecordingUri;
        }
        return audioPlayerState.copy(currentAudioState, abstractC0040n, abstractC0040n2, function1);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CurrentAudioState getCurrent() {
        return this.current;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AbstractC0040n getSeekTo() {
        return this.seekTo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AbstractC0040n getSpeeds() {
        return this.speeds;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Function1 getGetRecordingUri() {
        return this.getRecordingUri;
    }

    public final AudioPlayerState copy(CurrentAudioState current, AbstractC0040n seekTo, AbstractC0040n speeds, Function1 getRecordingUri) {
        AbstractC22676k.m65750j(current, "current");
        AbstractC22676k.m65750j(seekTo, "seekTo");
        AbstractC22676k.m65750j(speeds, "speeds");
        AbstractC22676k.m65750j(getRecordingUri, "getRecordingUri");
        return new AudioPlayerState(current, seekTo, speeds, getRecordingUri);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioPlayerState)) {
            return false;
        }
        AudioPlayerState audioPlayerState = (AudioPlayerState) other;
        return AbstractC22676k.m65745e(this.current, audioPlayerState.current) && AbstractC22676k.m65745e(this.seekTo, audioPlayerState.seekTo) && AbstractC22676k.m65745e(this.speeds, audioPlayerState.speeds) && AbstractC22676k.m65745e(this.getRecordingUri, audioPlayerState.getRecordingUri);
    }

    public final CurrentAudioState getCurrent() {
        return this.current;
    }

    public final Function1 getGetRecordingUri() {
        return this.getRecordingUri;
    }

    public final AbstractC0040n getSeekTo() {
        return this.seekTo;
    }

    public final AbstractC0040n getSpeeds() {
        return this.speeds;
    }

    public final int hashCode() {
        return this.getRecordingUri.hashCode() + ((this.speeds.hashCode() + ((this.seekTo.hashCode() + (this.current.hashCode() * 31)) * 31)) * 31);
    }

    public final String stringify() {
        CurrentAudioState currentAudioState = this.current;
        int playingId = currentAudioState.getPlayingId();
        float playingProgress = currentAudioState.getPlayingProgress();
        int durationInMs = currentAudioState.getDurationInMs();
        boolean zIsPlaying = currentAudioState.isPlaying();
        boolean zIsSeeking = currentAudioState.isSeeking();
        boolean zIsLoading = currentAudioState.isLoading();
        float playingSpeed = currentAudioState.getPlayingSpeed();
        int size = currentAudioState.getWaveform().size();
        int iHashCode = currentAudioState.getAudioUri().hashCode();
        int i13 = this.seekTo.f124e;
        int i14 = this.speeds.f124e;
        StringBuilder sb4 = new StringBuilder("AudioPlayerState(playingId=");
        sb4.append(playingId);
        sb4.append(", playingProgress=");
        sb4.append(playingProgress);
        sb4.append(", durationInMs=");
        AbstractC13673n.m38573t(durationInMs, ", isPlaying=", ", isSeeking=", sb4, zIsPlaying);
        AbstractC38963t7.m124392v(sb4, zIsSeeking, ", isLoading=", zIsLoading, ", playingSpeed=");
        sb4.append(playingSpeed);
        sb4.append(", waveform.size=");
        sb4.append(size);
        sb4.append(", playingUriHash=");
        AbstractC30802r.m94773v(sb4, iHashCode, ", seekTo.size=", i13, ",speeds.size=");
        return AbstractC18489d0.m53371l(sb4, i14, ")");
    }

    public final String toString() {
        return "AudioPlayerState(current=" + this.current + ", seekTo=" + this.seekTo + ", speeds=" + this.speeds + ", getRecordingUri=" + this.getRecordingUri + ")";
    }

    public AudioPlayerState(CurrentAudioState currentAudioState, AbstractC0040n abstractC0040n, AbstractC0040n abstractC0040n2, Function1 function1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new CurrentAudioState(0, 0.0f, 0.0f, null, null, 0, 0, false, false, false, 1023, null) : currentAudioState, (i13 & 2) != 0 ? AbstractC0042o.f128a : abstractC0040n, (i13 & 4) != 0 ? AbstractC0042o.f128a : abstractC0040n2, function1);
    }
}
