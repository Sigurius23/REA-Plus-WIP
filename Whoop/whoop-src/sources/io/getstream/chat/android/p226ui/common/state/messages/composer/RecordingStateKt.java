package io.getstream.chat.android.p226ui.common.state.messages.composer;

import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m65681d2 = {"copy", "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Recording;", AttachmentExtensionsKt.EXTRA_DURATION, "", "waveform", "", "", "stream-chat-android-ui-common_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class RecordingStateKt {
    public static final RecordingState.Recording copy(RecordingState.Recording recording, int i13, List<Float> waveform) {
        AbstractC22676k.m65750j(recording, "<this>");
        AbstractC22676k.m65750j(waveform, "waveform");
        if (recording instanceof RecordingState.Hold) {
            return new RecordingState.Hold(i13, waveform, ((RecordingState.Hold) recording).getOffset());
        }
        if (recording instanceof RecordingState.Locked) {
            return new RecordingState.Locked(i13, waveform);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ RecordingState.Recording copy$default(RecordingState.Recording recording, int i13, List list, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = recording.getDurationInMs();
        }
        if ((i14 & 2) != 0) {
            list = recording.getWaveform();
        }
        return copy(recording, i13, list);
    }
}
