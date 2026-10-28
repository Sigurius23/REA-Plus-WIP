package io.getstream.chat.android.p226ui.common.feature.messages.list;

import androidx.core.app.NotificationCompat;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13075p1;
import io.getstream.chat.android.client.audio.AudioPlayer;
import io.getstream.chat.android.client.audio.AudioState;
import io.getstream.chat.android.client.audio.ProgressData;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.chat.android.client.utils.attachment.AttachmentUtilsKt;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.common.state.messages.list.AudioPlayerState;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC11266d;
import p002a0.AbstractC0040n;
import p002a0.C0014d0;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes3.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 I2\u00020\u0001:\u0001IB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJA\u0010\"\u001a\u00020\u0017*\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00062\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00130\u001e2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u0005¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u0005¢\u0006\u0004\b'\u0010&J\u0015\u0010(\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u0005¢\u0006\u0004\b(\u0010&J\u0015\u0010)\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u0005¢\u0006\u0004\b)\u0010&J\u001d\u0010+\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0013¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u0005¢\u0006\u0004\b-\u0010&J\r\u0010.\u001a\u00020\f¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\f¢\u0006\u0004\b0\u0010/J\r\u00101\u001a\u00020\f¢\u0006\u0004\b1\u0010/J(\u00107\u001a\u000202*\u0002022\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001303H\u0080\u0002¢\u0006\u0004\b5\u00106J\u001c\u0010;\u001a\u000202*\u0002022\u0006\u00108\u001a\u00020\u001bH\u0080\u0002¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010<R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010=R\u001b\u0010C\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00170D8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H¨\u0006J"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;", "", "Lio/getstream/chat/android/client/audio/AudioPlayer;", "audioPlayer", "Lkotlin/Function1;", "Lio/getstream/chat/android/models/Attachment;", "", "getRecordingUri", "<init>", "(Lio/getstream/chat/android/client/audio/AudioPlayer;Lkotlin/jvm/functions/Function1;)V", "Lio/getstream/chat/android/client/audio/AudioState;", "playbackState", "Ll83/a0;", "onAudioStateChanged", "(Lio/getstream/chat/android/client/audio/AudioState;)V", "Lio/getstream/chat/android/client/audio/ProgressData;", "progressState", "onAudioPlayingProgress", "(Lio/getstream/chat/android/client/audio/ProgressData;)V", "", "speed", "onAudioPlayingSpeed", "(F)V", "Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;", "newState", "setState", "(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;)V", "", "audioHash", "recordingUri", "", "waveform", "playbackInMs", "durationInMs", "newCurrentState", "(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;ILjava/lang/String;Ljava/util/List;II)Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;", "attachment", "resetAudio", "(Lio/getstream/chat/android/models/Attachment;)V", "togglePlayback", "changeSpeed", "startSeek", NotificationCompat.CATEGORY_PROGRESS, "seekTo", "(Lio/getstream/chat/android/models/Attachment;F)V", "play", "pause", "()V", "resume", "reset", "La0/n;", "Ll83/k;", "that", "plus$stream_chat_android_ui_common_release", "(La0/n;Ll83/k;)La0/n;", "plus", "key", "minus$stream_chat_android_ui_common_release", "(La0/n;I)La0/n;", "minus", "Lio/getstream/chat/android/client/audio/AudioPlayer;", "Lkotlin/jvm/functions/Function1;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Lec3/p1;", "state", "Lec3/p1;", "getState", "()Lec3/p1;", "Companion", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AudioPlayerController {
    public static final int $stable = 8;
    private static final Companion Companion = new Companion();
    private static final float MILLIS_IN_SECOND = 1000.0f;
    private static final int NO_ID = -1;
    private static final float NULL_DURATION = 0.0f;
    private final AudioPlayer audioPlayer;
    private final Function1 getRecordingUri;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final InterfaceC13075p1 state;

    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController$Companion;", "", "<init>", "()V", "NO_ID", "", "NULL_DURATION", "", "MILLIS_IN_SECOND", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.AudioPlayerController$play$4 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C195494 extends C22672i implements Function1 {
        public C195494(Object obj) {
            super(1, 0, AudioPlayerController.class, obj, "onAudioStateChanged", "onAudioStateChanged(Lio/getstream/chat/android/client/audio/AudioState;)V");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AudioState) obj);
            return C23454a0.f92919a;
        }

        public final void invoke(AudioState p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((AudioPlayerController) this.receiver).onAudioStateChanged(p13);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.AudioPlayerController$play$5 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C195505 extends C22672i implements Function1 {
        public C195505(Object obj) {
            super(1, 0, AudioPlayerController.class, obj, "onAudioPlayingProgress", "onAudioPlayingProgress(Lio/getstream/chat/android/client/audio/ProgressData;)V");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ProgressData) obj);
            return C23454a0.f92919a;
        }

        public final void invoke(ProgressData p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((AudioPlayerController) this.receiver).onAudioPlayingProgress(p13);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.AudioPlayerController$play$6 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C195516 extends C22672i implements Function1 {
        public C195516(Object obj) {
            super(1, 0, AudioPlayerController.class, obj, "onAudioPlayingSpeed", "onAudioPlayingSpeed(F)V");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).floatValue());
            return C23454a0.f92919a;
        }

        public final void invoke(float f13) {
            ((AudioPlayerController) this.receiver).onAudioPlayingSpeed(f13);
        }
    }

    public AudioPlayerController(AudioPlayer audioPlayer, Function1 getRecordingUri) {
        AbstractC22676k.m65750j(audioPlayer, "audioPlayer");
        AbstractC22676k.m65750j(getRecordingUri, "getRecordingUri");
        this.audioPlayer = audioPlayer;
        this.getRecordingUri = getRecordingUri;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:AudioPlayerController");
        this.state = AbstractC13091v.m36593c(new AudioPlayerState(null, null, null, getRecordingUri, 7, null));
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final AudioPlayerState newCurrentState(AudioPlayerState audioPlayerState, int i13, String str, List<Float> list, int i14, int i15) {
        return AudioPlayerState.copy$default(audioPlayerState, new AudioPlayerState.CurrentAudioState(i13, 0.0f, i14 / i15, str, list, i14, i15, false, false, false, 898, null), (audioPlayerState.getCurrent().getPlayingId() == i13 || audioPlayerState.getCurrent().getPlayingId() == -1 || audioPlayerState.getCurrent().getPlayingProgress() <= 0.0f) ? audioPlayerState.getSeekTo() : plus$stream_chat_android_ui_common_release(audioPlayerState.getSeekTo(), new C23465k(Integer.valueOf(audioPlayerState.getCurrent().getPlayingId()), Float.valueOf(audioPlayerState.getCurrent().getPlayingProgress()))), null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAudioPlayingProgress(ProgressData progressState) {
        AudioPlayerState audioPlayerState = (AudioPlayerState) ((C13045h2) this.state).getValue();
        if (audioPlayerState.getCurrent().getPlayingId() != -1) {
            setState(AudioPlayerState.copy$default(audioPlayerState, AudioPlayerState.CurrentAudioState.copy$default(audioPlayerState.getCurrent(), 0, 0.0f, progressState.getProgress(), null, null, progressState.getCurrentPosition(), progressState.getDuration(), false, true, false, 667, null), minus$stream_chat_android_ui_common_release(audioPlayerState.getSeekTo(), audioPlayerState.getCurrent().getPlayingId()), null, null, 12, null));
            return;
        }
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[onAudioPlayingProgress] rejected (no playingId)", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAudioPlayingSpeed(float speed) {
        float f13;
        AudioPlayerState audioPlayerState = (AudioPlayerState) ((C13045h2) this.state).getValue();
        if (audioPlayerState.getCurrent().getPlayingId() == -1) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, "[onAudioPlayingSpeed] rejected (no playingId)", null);
                return;
            }
            return;
        }
        C2345k logger2 = getLogger();
        InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
        String str2 = logger2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
            InterfaceC2344j interfaceC2344j = logger2.f9274b;
            String strStringify = audioPlayerState.stringify();
            StringBuilder sb4 = new StringBuilder("[onAudioPlayingSpeed] speed: ");
            f13 = speed;
            sb4.append(f13);
            sb4.append(", state: ");
            sb4.append(strStringify);
            interfaceC2344j.log(enumC2341g2, str2, sb4.toString(), null);
        } else {
            f13 = speed;
        }
        setState(AudioPlayerState.copy$default(audioPlayerState, AudioPlayerState.CurrentAudioState.copy$default(audioPlayerState.getCurrent(), 0, f13, 0.0f, null, null, 0, 0, false, false, false, 1021, null), null, plus$stream_chat_android_ui_common_release(audioPlayerState.getSpeeds(), new C23465k(Integer.valueOf(audioPlayerState.getCurrent().getPlayingId()), Float.valueOf(speed))), null, 10, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAudioStateChanged(AudioState playbackState) {
        AudioPlayerState audioPlayerState = (AudioPlayerState) ((C13045h2) this.state).getValue();
        if (audioPlayerState.getCurrent().getPlayingId() == -1) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, "[onAudioStateChanged] rejected (no playingId)", null);
                return;
            }
            return;
        }
        C2345k logger2 = getLogger();
        InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
        String str2 = logger2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
            logger2.f9274b.log(enumC2341g2, str2, "[onAudioStateChanged] playbackState: " + playbackState, null);
        }
        setState(AudioPlayerState.copy$default(audioPlayerState, AudioPlayerState.CurrentAudioState.copy$default(audioPlayerState.getCurrent(), 0, 0.0f, 0.0f, null, null, 0, 0, playbackState == AudioState.LOADING, playbackState == AudioState.PLAYING, false, 639, null), null, null, null, 14, null));
    }

    private final void setState(AudioPlayerState newState) {
        ((C13045h2) this.state).m36570j(newState);
    }

    public final void changeSpeed(Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "attachment");
        if (!AttachmentUtilsKt.isAudioRecording(attachment)) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[changeSpeed] rejected (not an audio recording): ", attachment.getType()), null);
                return;
            }
            return;
        }
        if (((String) this.getRecordingUri.invoke(attachment)) != null) {
            int iHashCode = attachment.hashCode();
            float fChangeSpeed = this.audioPlayer.changeSpeed(iHashCode);
            AudioPlayerState audioPlayerState = (AudioPlayerState) ((C13045h2) this.state).getValue();
            setState(AudioPlayerState.copy$default(audioPlayerState, audioPlayerState.getCurrent().getPlayingId() == iHashCode ? AudioPlayerState.CurrentAudioState.copy$default(audioPlayerState.getCurrent(), 0, fChangeSpeed, 0.0f, null, null, 0, 0, false, false, false, 1021, null) : audioPlayerState.getCurrent(), null, plus$stream_chat_android_ui_common_release(audioPlayerState.getSpeeds(), new C23465k(Integer.valueOf(iHashCode), Float.valueOf(fChangeSpeed))), null, 10, null));
            return;
        }
        C2345k logger2 = getLogger();
        InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
        String str2 = logger2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
            logger2.f9274b.log(enumC2341g2, str2, "[changeSpeed] rejected (no recordingUri): " + attachment, null);
        }
    }

    public final InterfaceC13075p1 getState() {
        return this.state;
    }

    public final AbstractC0040n minus$stream_chat_android_ui_common_release(AbstractC0040n abstractC0040n, int i13) {
        AbstractC22676k.m65750j(abstractC0040n, "<this>");
        if (abstractC0040n.m96a(i13) < 0) {
            return abstractC0040n;
        }
        C0014d0 c0014d0 = new C0014d0(abstractC0040n.f124e);
        int[] iArr = abstractC0040n.f121b;
        float[] fArr = abstractC0040n.f122c;
        long[] jArr = abstractC0040n.f120a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i14 = 0;
            while (true) {
                long j7 = jArr[i14];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((255 & j7) < 128) {
                            int i17 = (i14 << 3) + i16;
                            int i18 = iArr[i17];
                            float f13 = fArr[i17];
                            if (i18 != i13) {
                                c0014d0.m15d(f13, i18);
                            }
                        }
                        j7 >>= 8;
                    }
                    if (i15 != 8) {
                        break;
                    }
                }
                if (i14 == length) {
                    break;
                }
                i14++;
            }
        }
        return c0014d0;
    }

    public final void pause() {
        AudioPlayerState audioPlayerState = (AudioPlayerState) ((C13045h2) this.state).getValue();
        if (audioPlayerState.getCurrent().getPlayingId() == -1) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, "[pause] rejected (no playingId)", null);
                return;
            }
            return;
        }
        if (audioPlayerState.getCurrent().isPlaying()) {
            C2345k logger2 = getLogger();
            InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
            String str2 = logger2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                logger2.f9274b.log(enumC2341g2, str2, AbstractC2875y.m8295h(audioPlayerState.getCurrent().getPlayingId(), "[pause] audioHash: "), null);
            }
            this.audioPlayer.pause();
            return;
        }
        C2345k logger3 = getLogger();
        InterfaceC2339e interfaceC2339e3 = logger3.f9275c;
        String str3 = logger3.f9273a;
        EnumC2341g enumC2341g3 = EnumC2341g.DEBUG;
        if (interfaceC2339e3.isLoggable(enumC2341g3, str3)) {
            logger3.f9274b.log(enumC2341g3, str3, "[pause] rejected (not playing)", null);
        }
    }

    public final void play(Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "attachment");
        if (!AttachmentUtilsKt.isAudioRecording(attachment)) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[play] rejected (not an audio recording): ", attachment.getType()), null);
                return;
            }
            return;
        }
        String str2 = (String) this.getRecordingUri.invoke(attachment);
        if (str2 == null) {
            C2345k logger2 = getLogger();
            InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
            String str3 = logger2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str3)) {
                logger2.f9274b.log(enumC2341g2, str3, "[play] rejected (no recordingUri): " + attachment, null);
                return;
            }
            return;
        }
        AudioPlayerState audioPlayerState = (AudioPlayerState) ((C13045h2) this.state).getValue();
        int iHashCode = attachment.hashCode();
        List<Float> waveformData = AttachmentExtensionsKt.getWaveformData(attachment);
        if (waveformData == null) {
            waveformData = C25271y.f99162w;
        }
        int currentPositionInMs = this.audioPlayer.getCurrentPositionInMs(iHashCode);
        Float duration = AttachmentExtensionsKt.getDuration(attachment);
        int iFloatValue = (int) ((duration != null ? duration.floatValue() : 0.0f) * MILLIS_IN_SECOND);
        AbstractC0040n seekTo = audioPlayerState.getSeekTo();
        int iM96a = seekTo.m96a(iHashCode);
        float f13 = iM96a >= 0 ? seekTo.f122c[iM96a] : 0.0f;
        if (f13 > 0.0f) {
            currentPositionInMs = (int) (f13 * iFloatValue);
            C2345k logger3 = getLogger();
            InterfaceC2339e interfaceC2339e3 = logger3.f9275c;
            String str4 = logger3.f9273a;
            EnumC2341g enumC2341g3 = EnumC2341g.VERBOSE;
            if (interfaceC2339e3.isLoggable(enumC2341g3, str4)) {
                logger3.f9274b.log(enumC2341g3, str4, AbstractC2875y.m8295h(currentPositionInMs, "[play] seekTo: "), null);
            }
        }
        C2345k logger4 = getLogger();
        InterfaceC2339e interfaceC2339e4 = logger4.f9275c;
        String str5 = logger4.f9273a;
        EnumC2341g enumC2341g4 = EnumC2341g.DEBUG;
        if (interfaceC2339e4.isLoggable(enumC2341g4, str5)) {
            InterfaceC2344j interfaceC2344j = logger4.f9274b;
            String strStringify = audioPlayerState.stringify();
            StringBuilder sbM30465s = AbstractC11266d.m30465s(iHashCode, currentPositionInMs, "[play] audioHash: ", ", playbackInMs: ", ", state: ");
            sbM30465s.append(strStringify);
            interfaceC2344j.log(enumC2341g4, str5, sbM30465s.toString(), null);
        }
        int i13 = currentPositionInMs;
        setState(newCurrentState(audioPlayerState, iHashCode, str2, waveformData, i13, iFloatValue));
        if (f13 > 0.0f) {
            this.audioPlayer.seekTo(i13, iHashCode);
        }
        this.audioPlayer.registerOnAudioStateChange(iHashCode, new C195494(this));
        this.audioPlayer.registerOnProgressStateChange(iHashCode, new C195505(this));
        this.audioPlayer.registerOnSpeedChange(iHashCode, new C195516(this));
        this.audioPlayer.play(str2, iHashCode);
        AudioState currentState = this.audioPlayer.getCurrentState();
        AudioPlayerState audioPlayerState2 = (AudioPlayerState) ((C13045h2) this.state).getValue();
        setState(AudioPlayerState.copy$default(audioPlayerState2, AudioPlayerState.CurrentAudioState.copy$default(audioPlayerState2.getCurrent(), 0, 0.0f, 0.0f, null, null, 0, 0, currentState == AudioState.LOADING, currentState == AudioState.PLAYING, false, 639, null), null, null, null, 14, null));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005b A[LOOP:0: B:5:0x0024->B:15:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x005e A[EDGE_INSN: B:19:0x005e->B:16:0x005e BREAK  A[LOOP:0: B:5:0x0024->B:15:0x005b], SYNTHETIC] */
    public final AbstractC0040n plus$stream_chat_android_ui_common_release(AbstractC0040n abstractC0040n, C23465k that) {
        AbstractC22676k.m65750j(abstractC0040n, "<this>");
        AbstractC22676k.m65750j(that, "that");
        C0014d0 c0014d0 = new C0014d0(abstractC0040n.f124e + 1);
        int[] iArr = abstractC0040n.f121b;
        float[] fArr = abstractC0040n.f122c;
        long[] jArr = abstractC0040n.f120a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j7 = jArr[i13];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i13 != length) {
                        break;
                        break;
                    }
                    i13++;
                } else {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j7) < 128) {
                            int i16 = (i13 << 3) + i15;
                            c0014d0.m15d(fArr[i16], iArr[i16]);
                        }
                        j7 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                    if (i13 != length) {
                        break;
                    }
                    i13++;
                }
            }
        }
        c0014d0.m15d(((Number) that.f92938x).floatValue(), ((Number) that.f92937w).intValue());
        return c0014d0;
    }

    public final void reset() {
        AudioPlayerState audioPlayerState = (AudioPlayerState) ((C13045h2) this.state).getValue();
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC2875y.m8295h(audioPlayerState.getCurrent().getPlayingId(), "[reset] state.playingId: "), null);
        }
        this.audioPlayer.reset();
        setState(new AudioPlayerState(null, null, null, this.getRecordingUri, 7, null));
    }

    public final void resetAudio(Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "attachment");
        if (!AttachmentUtilsKt.isAudioRecording(attachment)) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[resetAudio] rejected (not an audio recording): ", attachment.getType()), null);
                return;
            }
            return;
        }
        if (((String) this.getRecordingUri.invoke(attachment)) == null) {
            C2345k logger2 = getLogger();
            InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
            String str2 = logger2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                logger2.f9274b.log(enumC2341g2, str2, "[resetAudio] rejected (no recordingUri): " + attachment, null);
                return;
            }
            return;
        }
        int iHashCode = attachment.hashCode();
        if (((AudioPlayerState) ((C13045h2) this.state).getValue()).getCurrent().getPlayingId() == iHashCode) {
            this.audioPlayer.resetAudio(iHashCode);
            return;
        }
        C2345k logger3 = getLogger();
        InterfaceC2339e interfaceC2339e3 = logger3.f9275c;
        String str3 = logger3.f9273a;
        EnumC2341g enumC2341g3 = EnumC2341g.VERBOSE;
        if (interfaceC2339e3.isLoggable(enumC2341g3, str3)) {
            logger3.f9274b.log(enumC2341g3, str3, AbstractC2875y.m8295h(iHashCode, "[resetAudio] rejected (not playing): "), null);
        }
    }

    public final void resume() {
        AudioPlayerState audioPlayerState = (AudioPlayerState) ((C13045h2) this.state).getValue();
        if (audioPlayerState.getCurrent().getPlayingId() == -1) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, "[resume] rejected (no playingId)", null);
                return;
            }
            return;
        }
        if (audioPlayerState.getCurrent().isPlaying()) {
            C2345k logger2 = getLogger();
            InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
            String str2 = logger2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                logger2.f9274b.log(enumC2341g2, str2, "[resume] rejected (already playing)", null);
                return;
            }
            return;
        }
        AudioState currentState = this.audioPlayer.getCurrentState();
        if (currentState == AudioState.IDLE || currentState == AudioState.PAUSE) {
            int playingId = audioPlayerState.getCurrent().getPlayingId();
            C2345k logger3 = getLogger();
            InterfaceC2339e interfaceC2339e3 = logger3.f9275c;
            String str3 = logger3.f9273a;
            EnumC2341g enumC2341g3 = EnumC2341g.DEBUG;
            if (interfaceC2339e3.isLoggable(enumC2341g3, str3)) {
                logger3.f9274b.log(enumC2341g3, str3, AbstractC2875y.m8295h(playingId, "[resume] audioHash: "), null);
            }
            this.audioPlayer.resume(playingId);
            return;
        }
        C2345k logger4 = getLogger();
        InterfaceC2339e interfaceC2339e4 = logger4.f9275c;
        String str4 = logger4.f9273a;
        EnumC2341g enumC2341g4 = EnumC2341g.VERBOSE;
        if (interfaceC2339e4.isLoggable(enumC2341g4, str4)) {
            logger4.f9274b.log(enumC2341g4, str4, "[resume] rejected (not idle or paused): " + currentState, null);
        }
    }

    public final void seekTo(Attachment attachment, float progress) {
        AbstractC22676k.m65750j(attachment, "attachment");
        if (!AttachmentUtilsKt.isAudioRecording(attachment)) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[seekTo] rejected (not an audio recording): ", attachment.getType()), null);
                return;
            }
            return;
        }
        if (((String) this.getRecordingUri.invoke(attachment)) == null) {
            C2345k logger2 = getLogger();
            InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
            String str2 = logger2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                logger2.f9274b.log(enumC2341g2, str2, "[seekTo] rejected (no recordingUri): " + attachment, null);
                return;
            }
            return;
        }
        int iHashCode = attachment.hashCode();
        AudioPlayerState audioPlayerState = (AudioPlayerState) ((C13045h2) this.state).getValue();
        boolean z4 = audioPlayerState.getCurrent().getPlayingId() == iHashCode;
        Float duration = AttachmentExtensionsKt.getDuration(attachment);
        int iFloatValue = (int) ((duration != null ? duration.floatValue() : 0.0f) * progress * MILLIS_IN_SECOND);
        C2345k logger3 = getLogger();
        InterfaceC2339e interfaceC2339e3 = logger3.f9275c;
        String str3 = logger3.f9273a;
        EnumC2341g enumC2341g3 = EnumC2341g.INFO;
        if (interfaceC2339e3.isLoggable(enumC2341g3, str3)) {
            logger3.f9274b.log(enumC2341g3, str3, "[seekTo] isCurrentAudio: " + z4 + ", positionInMs: " + iFloatValue + ", audioHash: " + iHashCode + ", state: " + audioPlayerState.stringify(), null);
        }
        this.audioPlayer.seekTo(iFloatValue, iHashCode);
        setState(AudioPlayerState.copy$default(audioPlayerState, z4 ? AudioPlayerState.CurrentAudioState.copy$default(audioPlayerState.getCurrent(), 0, 0.0f, progress, null, null, iFloatValue, 0, false, false, false, 475, null) : audioPlayerState.getCurrent(), plus$stream_chat_android_ui_common_release(audioPlayerState.getSeekTo(), new C23465k(Integer.valueOf(iHashCode), Float.valueOf(progress))), null, null, 12, null));
    }

    public final void startSeek(Attachment attachment) {
        AudioPlayerState.CurrentAudioState current;
        AbstractC22676k.m65750j(attachment, "attachment");
        if (!AttachmentUtilsKt.isAudioRecording(attachment)) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[startSeek] rejected (not an audio recording): ", attachment.getType()), null);
                return;
            }
            return;
        }
        if (((String) this.getRecordingUri.invoke(attachment)) == null) {
            C2345k logger2 = getLogger();
            InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
            String str2 = logger2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                logger2.f9274b.log(enumC2341g2, str2, "[startSeek] rejected (no recordingUri): " + attachment, null);
                return;
            }
            return;
        }
        int iHashCode = attachment.hashCode();
        AudioPlayerState audioPlayerState = (AudioPlayerState) ((C13045h2) this.state).getValue();
        if (audioPlayerState.getCurrent().getPlayingId() != iHashCode) {
            C2345k logger3 = getLogger();
            InterfaceC2339e interfaceC2339e3 = logger3.f9275c;
            String str3 = logger3.f9273a;
            EnumC2341g enumC2341g3 = EnumC2341g.VERBOSE;
            if (interfaceC2339e3.isLoggable(enumC2341g3, str3)) {
                logger3.f9274b.log(enumC2341g3, str3, AbstractC2875y.m8295h(iHashCode, "[startSeek] rejected (not playing): "), null);
                return;
            }
            return;
        }
        C2345k logger4 = getLogger();
        InterfaceC2339e interfaceC2339e4 = logger4.f9275c;
        String str4 = logger4.f9273a;
        EnumC2341g enumC2341g4 = EnumC2341g.INFO;
        if (interfaceC2339e4.isLoggable(enumC2341g4, str4)) {
            logger4.f9274b.log(enumC2341g4, str4, AbstractC2875y.m8295h(audioPlayerState.getCurrent().getPlayingId(), "[startSeek] audioHash: "), null);
        }
        this.audioPlayer.startSeek(audioPlayerState.getCurrent().getPlayingId());
        AudioState currentState = this.audioPlayer.getCurrentState();
        if (audioPlayerState.getCurrent().getPlayingId() == iHashCode) {
            current = AudioPlayerState.CurrentAudioState.copy$default(audioPlayerState.getCurrent(), 0, 0.0f, 0.0f, null, null, 0, 0, false, currentState == AudioState.PLAYING, true, 255, null);
        } else {
            current = audioPlayerState.getCurrent();
        }
        setState(AudioPlayerState.copy$default(audioPlayerState, current, null, null, null, 14, null));
    }

    public final void togglePlayback(Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "attachment");
        if (!AttachmentUtilsKt.isAudioRecording(attachment)) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[togglePlayback] rejected (not an audio recording): ", attachment.getType()), null);
                return;
            }
            return;
        }
        if (((String) this.getRecordingUri.invoke(attachment)) == null) {
            C2345k logger2 = getLogger();
            InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
            String str2 = logger2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                logger2.f9274b.log(enumC2341g2, str2, "[togglePlayback] rejected (no recordingUri): " + attachment, null);
                return;
            }
            return;
        }
        int iHashCode = attachment.hashCode();
        AudioPlayerState audioPlayerState = (AudioPlayerState) ((C13045h2) this.state).getValue();
        int currentAudioHash = this.audioPlayer.getCurrentAudioHash();
        boolean z4 = audioPlayerState.getCurrent().getPlayingId() == iHashCode;
        float playingProgress = audioPlayerState.getCurrent().getPlayingProgress();
        boolean z13 = playingProgress > 0.0f && playingProgress < 1.0f;
        C2345k logger3 = getLogger();
        InterfaceC2339e interfaceC2339e3 = logger3.f9275c;
        String str3 = logger3.f9273a;
        EnumC2341g enumC2341g3 = EnumC2341g.DEBUG;
        if (interfaceC2339e3.isLoggable(enumC2341g3, str3)) {
            InterfaceC2344j interfaceC2344j = logger3.f9274b;
            String strStringify = audioPlayerState.stringify();
            StringBuilder sbM30465s = AbstractC11266d.m30465s(iHashCode, currentAudioHash, "[togglePlayback] audioHash: ", ", currentPlayingId; ", ", isCurrentTrack: ");
            AbstractC38963t7.m124392v(sbM30465s, z4, ", isProgressRunning: ", z13, ", state: ");
            sbM30465s.append(strStringify);
            interfaceC2344j.log(enumC2341g3, str3, sbM30465s.toString(), null);
        }
        boolean z14 = z4 && z13;
        boolean z15 = currentAudioHash == iHashCode;
        if (z14 && z15) {
            if (audioPlayerState.getCurrent().isPlaying()) {
                pause();
                return;
            } else {
                resume();
                return;
            }
        }
        if (!z14) {
            play(attachment);
        } else {
            setState(AudioPlayerState.copy$default(audioPlayerState, null, plus$stream_chat_android_ui_common_release(audioPlayerState.getSeekTo(), new C23465k(Integer.valueOf(iHashCode), Float.valueOf(audioPlayerState.getCurrent().getPlayingProgress()))), null, null, 13, null));
            play(attachment);
        }
    }
}
