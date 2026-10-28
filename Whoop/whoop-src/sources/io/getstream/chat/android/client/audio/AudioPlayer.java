package io.getstream.chat.android.client.audio;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010 \n\u0002\b\f\bg\u0018\u00002\u00020\u0001J+\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H&¢\u0006\u0004\b\b\u0010\tJ+\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004H&¢\u0006\u0004\b\f\u0010\tJ+\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u0004H&¢\u0006\u0004\b\u000f\u0010\tJ'\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H&¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0006H&¢\u0006\u0004\b\u001a\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u001d\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b!\u0010\u001cJ\u0017\u0010\"\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\rH&¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b(\u0010\u001cJ\u001d\u0010+\u001a\u00020\u00062\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020)H&¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0006H&¢\u0006\u0004\b-\u0010\u0016J\u000f\u0010.\u001a\u00020\u0006H&¢\u0006\u0004\b.\u0010\u0016R\u0014\u00101\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00104\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00065À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/audio/AudioPlayer;", "", "", "audioHash", "Lkotlin/Function1;", "Lio/getstream/chat/android/client/audio/AudioState;", "Ll83/a0;", "onAudioStateChange", "registerOnAudioStateChange", "(ILkotlin/jvm/functions/Function1;)V", "Lio/getstream/chat/android/client/audio/ProgressData;", "onProgressDataChange", "registerOnProgressStateChange", "", "onSpeedChange", "registerOnSpeedChange", "", "sourceUrl", "position", "registerTrack", "(Ljava/lang/String;II)V", "clearTracks", "()V", "prepare", "(Ljava/lang/String;I)V", "play", "pause", "resume", "(I)V", "resetAudio", "positionInMs", "seekTo", "(II)V", "startSeek", "changeSpeed", "(I)F", "currentSpeed", "()F", "getCurrentPositionInMs", "(I)I", "removeAudio", "", "audioHashList", "removeAudios", "(Ljava/util/List;)V", "reset", "dispose", "getCurrentState", "()Lio/getstream/chat/android/client/audio/AudioState;", "currentState", "getCurrentPlayingId", "()I", "currentPlayingId", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface AudioPlayer {
    float changeSpeed(int audioHash);

    void clearTracks();

    float currentSpeed();

    void dispose();

    int getCurrentPlayingId();

    int getCurrentPositionInMs(int audioHash);

    AudioState getCurrentState();

    void pause();

    void play(String sourceUrl, int audioHash);

    void prepare(String sourceUrl, int audioHash);

    void registerOnAudioStateChange(int audioHash, Function1 onAudioStateChange);

    void registerOnProgressStateChange(int audioHash, Function1 onProgressDataChange);

    void registerOnSpeedChange(int audioHash, Function1 onSpeedChange);

    void registerTrack(String sourceUrl, int audioHash, int position);

    void removeAudio(int audioHash);

    void removeAudios(List<Integer> audioHashList);

    void reset();

    void resetAudio(int audioHash);

    void resume(int audioHash);

    void seekTo(int positionInMs, int audioHash);

    void startSeek(int audioHash);
}
