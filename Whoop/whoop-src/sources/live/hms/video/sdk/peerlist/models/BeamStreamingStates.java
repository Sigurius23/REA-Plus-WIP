package live.hms.video.sdk.peerlist.models;

import ge3.AbstractC15751g;
import io.getstream.chat.android.models.MessageType;
import live.hms.video.sdk.models.enums.HMSStreamingState;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\nj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\u000b"}, m65681d2 = {"Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;", "", "<init>", "(Ljava/lang/String;I)V", "none", "initialised", "started", "stopped", MessageType.FAILED, "toHMSStreamingState", "Llive/hms/video/sdk/models/enums/HMSStreamingState;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public enum BeamStreamingStates {
    none,
    initialised,
    started,
    stopped,
    failed;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BeamStreamingStates.values().length];
            try {
                iArr[BeamStreamingStates.none.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeamStreamingStates.initialised.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeamStreamingStates.started.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BeamStreamingStates.stopped.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BeamStreamingStates.failed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final HMSStreamingState toHMSStreamingState() {
        int i13 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i13 == 1) {
            return HMSStreamingState.NONE;
        }
        if (i13 == 2) {
            return HMSStreamingState.STARTING;
        }
        if (i13 == 3) {
            return HMSStreamingState.STARTED;
        }
        if (i13 == 4) {
            return HMSStreamingState.STOPPED;
        }
        if (i13 == 5) {
            return HMSStreamingState.FAILED;
        }
        throw new NoWhenBranchMatchedException();
    }
}
