package io.getstream.android.video.generated.models;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import io.getstream.chat.android.models.ChannelCapabilities;
import p088dc.AbstractC11895b;
import p441qx.AbstractC30704c0;
import p441qx.InterfaceC30729p;
import p441qx.InterfaceC30738t0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \n2\u00020\u0001:'\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-.B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001%/0123456789:;<=>?@ABCDEFGHIJKLMNOPQRS¨\u0006T"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "toString", "BlockUsers", "ChangeMaxDuration", "Companion", "CreateCall", "CreateReaction", "EnableNoiseCancellation", "EndCall", "JoinBackstage", "JoinCall", "JoinEndedCall", "KickUser", "MuteUsers", "OwnCapabilityAdapter", "PinForEveryone", "ReadCall", "RemoveCallMember", "Screenshare", "SendAudio", "SendClosedCaptionsCall", "SendVideo", "StartBroadcastCall", "StartClosedCaptionsCall", "StartFrameRecordCall", "StartIndividualRecordCall", "StartRawRecordCall", "StartRecordCall", "StartTranscriptionCall", "StopBroadcastCall", "StopClosedCaptionsCall", "StopFrameRecordCall", "StopIndividualRecordCall", "StopRawRecordCall", "StopRecordCall", "StopTranscriptionCall", "Unknown", "UpdateCall", "UpdateCallMember", "UpdateCallPermissions", "UpdateCallSettings", "Lio/getstream/android/video/generated/models/OwnCapability$BlockUsers;", "Lio/getstream/android/video/generated/models/OwnCapability$ChangeMaxDuration;", "Lio/getstream/android/video/generated/models/OwnCapability$CreateCall;", "Lio/getstream/android/video/generated/models/OwnCapability$CreateReaction;", "Lio/getstream/android/video/generated/models/OwnCapability$EnableNoiseCancellation;", "Lio/getstream/android/video/generated/models/OwnCapability$EndCall;", "Lio/getstream/android/video/generated/models/OwnCapability$JoinBackstage;", "Lio/getstream/android/video/generated/models/OwnCapability$JoinCall;", "Lio/getstream/android/video/generated/models/OwnCapability$JoinEndedCall;", "Lio/getstream/android/video/generated/models/OwnCapability$KickUser;", "Lio/getstream/android/video/generated/models/OwnCapability$MuteUsers;", "Lio/getstream/android/video/generated/models/OwnCapability$PinForEveryone;", "Lio/getstream/android/video/generated/models/OwnCapability$ReadCall;", "Lio/getstream/android/video/generated/models/OwnCapability$RemoveCallMember;", "Lio/getstream/android/video/generated/models/OwnCapability$Screenshare;", "Lio/getstream/android/video/generated/models/OwnCapability$SendAudio;", "Lio/getstream/android/video/generated/models/OwnCapability$SendClosedCaptionsCall;", "Lio/getstream/android/video/generated/models/OwnCapability$SendVideo;", "Lio/getstream/android/video/generated/models/OwnCapability$StartBroadcastCall;", "Lio/getstream/android/video/generated/models/OwnCapability$StartClosedCaptionsCall;", "Lio/getstream/android/video/generated/models/OwnCapability$StartFrameRecordCall;", "Lio/getstream/android/video/generated/models/OwnCapability$StartIndividualRecordCall;", "Lio/getstream/android/video/generated/models/OwnCapability$StartRawRecordCall;", "Lio/getstream/android/video/generated/models/OwnCapability$StartRecordCall;", "Lio/getstream/android/video/generated/models/OwnCapability$StartTranscriptionCall;", "Lio/getstream/android/video/generated/models/OwnCapability$StopBroadcastCall;", "Lio/getstream/android/video/generated/models/OwnCapability$StopClosedCaptionsCall;", "Lio/getstream/android/video/generated/models/OwnCapability$StopFrameRecordCall;", "Lio/getstream/android/video/generated/models/OwnCapability$StopIndividualRecordCall;", "Lio/getstream/android/video/generated/models/OwnCapability$StopRawRecordCall;", "Lio/getstream/android/video/generated/models/OwnCapability$StopRecordCall;", "Lio/getstream/android/video/generated/models/OwnCapability$StopTranscriptionCall;", "Lio/getstream/android/video/generated/models/OwnCapability$Unknown;", "Lio/getstream/android/video/generated/models/OwnCapability$UpdateCall;", "Lio/getstream/android/video/generated/models/OwnCapability$UpdateCallMember;", "Lio/getstream/android/video/generated/models/OwnCapability$UpdateCallPermissions;", "Lio/getstream/android/video/generated/models/OwnCapability$UpdateCallSettings;", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public abstract class OwnCapability {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String value;

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$BlockUsers;", "Lio/getstream/android/video/generated/models/OwnCapability;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class BlockUsers extends OwnCapability {
        public static final BlockUsers INSTANCE = new BlockUsers();

        private BlockUsers() {
            super("block-users", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$ChangeMaxDuration;", "Lio/getstream/android/video/generated/models/OwnCapability;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class ChangeMaxDuration extends OwnCapability {
        public static final ChangeMaxDuration INSTANCE = new ChangeMaxDuration();

        private ChangeMaxDuration() {
            super("change-max-duration", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$Companion;", "", "()V", "fromString", "Lio/getstream/android/video/generated/models/OwnCapability;", "s", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final OwnCapability fromString(String s13) {
            AbstractC22676k.m65750j(s13, "s");
            switch (s13.hashCode()) {
                case -2120275633:
                    if (s13.equals("start-frame-record-call")) {
                        return StartFrameRecordCall.INSTANCE;
                    }
                    break;
                case -2000892822:
                    if (s13.equals("stop-raw-record-call")) {
                        return StopRawRecordCall.INSTANCE;
                    }
                    break;
                case -1495000603:
                    if (s13.equals("update-call-member")) {
                        return UpdateCallMember.INSTANCE;
                    }
                    break;
                case -1466120977:
                    if (s13.equals("stop-frame-record-call")) {
                        return StopFrameRecordCall.INSTANCE;
                    }
                    break;
                case -1463548396:
                    if (s13.equals("join-ended-call")) {
                        return JoinEndedCall.INSTANCE;
                    }
                    break;
                case -1160130507:
                    if (s13.equals("read-call")) {
                        return ReadCall.INSTANCE;
                    }
                    break;
                case -1058251595:
                    if (s13.equals("start-broadcast-call")) {
                        return StartBroadcastCall.INSTANCE;
                    }
                    break;
                case -1035579662:
                    if (s13.equals("kick-user")) {
                        return KickUser.INSTANCE;
                    }
                    break;
                case -1016399064:
                    if (s13.equals("stop-closed-captions-call")) {
                        return StopClosedCaptionsCall.INSTANCE;
                    }
                    break;
                case -861565585:
                    if (s13.equals("start-record-call")) {
                        return StartRecordCall.INSTANCE;
                    }
                    break;
                case -635011484:
                    if (s13.equals("stop-transcription-call")) {
                        return StopTranscriptionCall.INSTANCE;
                    }
                    break;
                case -620381871:
                    if (s13.equals("send-audio")) {
                        return SendAudio.INSTANCE;
                    }
                    break;
                case -620136222:
                    if (s13.equals("update-call")) {
                        return UpdateCall.INSTANCE;
                    }
                    break;
                case -601345546:
                    if (s13.equals("send-video")) {
                        return SendVideo.INSTANCE;
                    }
                    break;
                case -553219366:
                    if (s13.equals("change-max-duration")) {
                        return ChangeMaxDuration.INSTANCE;
                    }
                    break;
                case -540776159:
                    if (s13.equals(ChannelCapabilities.JOIN_CALL)) {
                        return JoinCall.INSTANCE;
                    }
                    break;
                case -540264305:
                    if (s13.equals(ChannelCapabilities.CREATE_CALL)) {
                        return CreateCall.INSTANCE;
                    }
                    break;
                case -202110776:
                    if (s13.equals("block-users")) {
                        return BlockUsers.INSTANCE;
                    }
                    break;
                case -93822705:
                    if (s13.equals("stop-record-call")) {
                        return StopRecordCall.INSTANCE;
                    }
                    break;
                case -92429138:
                    if (s13.equals("update-call-settings")) {
                        return UpdateCallSettings.INSTANCE;
                    }
                    break;
                case -24972557:
                    if (s13.equals("screenshare")) {
                        return Screenshare.INSTANCE;
                    }
                    break;
                case -8454816:
                    if (s13.equals("enable-noise-cancellation")) {
                        return EnableNoiseCancellation.INSTANCE;
                    }
                    break;
                case 69035285:
                    if (s13.equals("stop-broadcast-call")) {
                        return StopBroadcastCall.INSTANCE;
                    }
                    break;
                case 182074708:
                    if (s13.equals("mute-users")) {
                        return MuteUsers.INSTANCE;
                    }
                    break;
                case 227284954:
                    if (s13.equals("create-reaction")) {
                        return CreateReaction.INSTANCE;
                    }
                    break;
                case 245389095:
                    if (s13.equals("pin-for-everyone")) {
                        return PinForEveryone.INSTANCE;
                    }
                    break;
                case 420163313:
                    if (s13.equals("start-individual-record-call")) {
                        return StartIndividualRecordCall.INSTANCE;
                    }
                    break;
                case 561030660:
                    if (s13.equals("start-transcription-call")) {
                        return StartTranscriptionCall.INSTANCE;
                    }
                    break;
                case 772684825:
                    if (s13.equals("update-call-permissions")) {
                        return UpdateCallPermissions.INSTANCE;
                    }
                    break;
                case 1415481748:
                    if (s13.equals("join-backstage")) {
                        return JoinBackstage.INSTANCE;
                    }
                    break;
                case 1482544977:
                    if (s13.equals("stop-individual-record-call")) {
                        return StopIndividualRecordCall.INSTANCE;
                    }
                    break;
                case 1623833288:
                    if (s13.equals("start-closed-captions-call")) {
                        return StartClosedCaptionsCall.INSTANCE;
                    }
                    break;
                case 1678861328:
                    if (s13.equals("end-call")) {
                        return EndCall.INSTANCE;
                    }
                    break;
                case 1707919562:
                    if (s13.equals("start-raw-record-call")) {
                        return StartRawRecordCall.INSTANCE;
                    }
                    break;
                case 1725776738:
                    if (s13.equals("send-closed-captions-call")) {
                        return SendClosedCaptionsCall.INSTANCE;
                    }
                    break;
                case 2109610272:
                    if (s13.equals("remove-call-member")) {
                        return RemoveCallMember.INSTANCE;
                    }
                    break;
            }
            return new Unknown(s13);
        }

        private Companion() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$CreateCall;", "Lio/getstream/android/video/generated/models/OwnCapability;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class CreateCall extends OwnCapability {
        public static final CreateCall INSTANCE = new CreateCall();

        private CreateCall() {
            super(ChannelCapabilities.CREATE_CALL, null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$CreateReaction;", "Lio/getstream/android/video/generated/models/OwnCapability;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class CreateReaction extends OwnCapability {
        public static final CreateReaction INSTANCE = new CreateReaction();

        private CreateReaction() {
            super("create-reaction", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$EnableNoiseCancellation;", "Lio/getstream/android/video/generated/models/OwnCapability;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class EnableNoiseCancellation extends OwnCapability {
        public static final EnableNoiseCancellation INSTANCE = new EnableNoiseCancellation();

        private EnableNoiseCancellation() {
            super("enable-noise-cancellation", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$EndCall;", "Lio/getstream/android/video/generated/models/OwnCapability;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class EndCall extends OwnCapability {
        public static final EndCall INSTANCE = new EndCall();

        private EndCall() {
            super("end-call", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$JoinBackstage;", "Lio/getstream/android/video/generated/models/OwnCapability;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class JoinBackstage extends OwnCapability {
        public static final JoinBackstage INSTANCE = new JoinBackstage();

        private JoinBackstage() {
            super("join-backstage", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$JoinCall;", "Lio/getstream/android/video/generated/models/OwnCapability;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class JoinCall extends OwnCapability {
        public static final JoinCall INSTANCE = new JoinCall();

        private JoinCall() {
            super(ChannelCapabilities.JOIN_CALL, null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$JoinEndedCall;", "Lio/getstream/android/video/generated/models/OwnCapability;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class JoinEndedCall extends OwnCapability {
        public static final JoinEndedCall INSTANCE = new JoinEndedCall();

        private JoinEndedCall() {
            super("join-ended-call", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$KickUser;", "Lio/getstream/android/video/generated/models/OwnCapability;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class KickUser extends OwnCapability {
        public static final KickUser INSTANCE = new KickUser();

        private KickUser() {
            super("kick-user", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$MuteUsers;", "Lio/getstream/android/video/generated/models/OwnCapability;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class MuteUsers extends OwnCapability {
        public static final MuteUsers INSTANCE = new MuteUsers();

        private MuteUsers() {
            super("mute-users", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$OwnCapabilityAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/android/video/generated/models/OwnCapability;", "<init>", "()V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/android/video/generated/models/OwnCapability;", "Lqx/c0;", "writer", "value", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/android/video/generated/models/OwnCapability;)V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class OwnCapabilityAdapter extends JsonAdapter<OwnCapability> {
        @Override // com.squareup.moshi.JsonAdapter
        @InterfaceC30729p
        public OwnCapability fromJson(JsonReader reader) {
            AbstractC22676k.m65750j(reader, "reader");
            String strNextString = reader.nextString();
            if (strNextString == null) {
                return null;
            }
            return OwnCapability.INSTANCE.fromString(strNextString);
        }

        @Override // com.squareup.moshi.JsonAdapter
        @InterfaceC30738t0
        public void toJson(AbstractC30704c0 writer, OwnCapability value) {
            AbstractC22676k.m65750j(writer, "writer");
            writer.mo94362F0(value != null ? value.getValue() : null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$PinForEveryone;", "Lio/getstream/android/video/generated/models/OwnCapability;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class PinForEveryone extends OwnCapability {
        public static final PinForEveryone INSTANCE = new PinForEveryone();

        private PinForEveryone() {
            super("pin-for-everyone", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$ReadCall;", "Lio/getstream/android/video/generated/models/OwnCapability;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class ReadCall extends OwnCapability {
        public static final ReadCall INSTANCE = new ReadCall();

        private ReadCall() {
            super("read-call", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$RemoveCallMember;", "Lio/getstream/android/video/generated/models/OwnCapability;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class RemoveCallMember extends OwnCapability {
        public static final RemoveCallMember INSTANCE = new RemoveCallMember();

        private RemoveCallMember() {
            super("remove-call-member", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$Screenshare;", "Lio/getstream/android/video/generated/models/OwnCapability;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class Screenshare extends OwnCapability {
        public static final Screenshare INSTANCE = new Screenshare();

        private Screenshare() {
            super("screenshare", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$SendAudio;", "Lio/getstream/android/video/generated/models/OwnCapability;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class SendAudio extends OwnCapability {
        public static final SendAudio INSTANCE = new SendAudio();

        private SendAudio() {
            super("send-audio", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$SendClosedCaptionsCall;", "Lio/getstream/android/video/generated/models/OwnCapability;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class SendClosedCaptionsCall extends OwnCapability {
        public static final SendClosedCaptionsCall INSTANCE = new SendClosedCaptionsCall();

        private SendClosedCaptionsCall() {
            super("send-closed-captions-call", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$SendVideo;", "Lio/getstream/android/video/generated/models/OwnCapability;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class SendVideo extends OwnCapability {
        public static final SendVideo INSTANCE = new SendVideo();

        private SendVideo() {
            super("send-video", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$StartBroadcastCall;", "Lio/getstream/android/video/generated/models/OwnCapability;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class StartBroadcastCall extends OwnCapability {
        public static final StartBroadcastCall INSTANCE = new StartBroadcastCall();

        private StartBroadcastCall() {
            super("start-broadcast-call", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$StartClosedCaptionsCall;", "Lio/getstream/android/video/generated/models/OwnCapability;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class StartClosedCaptionsCall extends OwnCapability {
        public static final StartClosedCaptionsCall INSTANCE = new StartClosedCaptionsCall();

        private StartClosedCaptionsCall() {
            super("start-closed-captions-call", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$StartFrameRecordCall;", "Lio/getstream/android/video/generated/models/OwnCapability;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class StartFrameRecordCall extends OwnCapability {
        public static final StartFrameRecordCall INSTANCE = new StartFrameRecordCall();

        private StartFrameRecordCall() {
            super("start-frame-record-call", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$StartIndividualRecordCall;", "Lio/getstream/android/video/generated/models/OwnCapability;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class StartIndividualRecordCall extends OwnCapability {
        public static final StartIndividualRecordCall INSTANCE = new StartIndividualRecordCall();

        private StartIndividualRecordCall() {
            super("start-individual-record-call", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$StartRawRecordCall;", "Lio/getstream/android/video/generated/models/OwnCapability;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class StartRawRecordCall extends OwnCapability {
        public static final StartRawRecordCall INSTANCE = new StartRawRecordCall();

        private StartRawRecordCall() {
            super("start-raw-record-call", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$StartRecordCall;", "Lio/getstream/android/video/generated/models/OwnCapability;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class StartRecordCall extends OwnCapability {
        public static final StartRecordCall INSTANCE = new StartRecordCall();

        private StartRecordCall() {
            super("start-record-call", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$StartTranscriptionCall;", "Lio/getstream/android/video/generated/models/OwnCapability;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class StartTranscriptionCall extends OwnCapability {
        public static final StartTranscriptionCall INSTANCE = new StartTranscriptionCall();

        private StartTranscriptionCall() {
            super("start-transcription-call", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$StopBroadcastCall;", "Lio/getstream/android/video/generated/models/OwnCapability;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class StopBroadcastCall extends OwnCapability {
        public static final StopBroadcastCall INSTANCE = new StopBroadcastCall();

        private StopBroadcastCall() {
            super("stop-broadcast-call", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$StopClosedCaptionsCall;", "Lio/getstream/android/video/generated/models/OwnCapability;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class StopClosedCaptionsCall extends OwnCapability {
        public static final StopClosedCaptionsCall INSTANCE = new StopClosedCaptionsCall();

        private StopClosedCaptionsCall() {
            super("stop-closed-captions-call", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$StopFrameRecordCall;", "Lio/getstream/android/video/generated/models/OwnCapability;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class StopFrameRecordCall extends OwnCapability {
        public static final StopFrameRecordCall INSTANCE = new StopFrameRecordCall();

        private StopFrameRecordCall() {
            super("stop-frame-record-call", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$StopIndividualRecordCall;", "Lio/getstream/android/video/generated/models/OwnCapability;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class StopIndividualRecordCall extends OwnCapability {
        public static final StopIndividualRecordCall INSTANCE = new StopIndividualRecordCall();

        private StopIndividualRecordCall() {
            super("stop-individual-record-call", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$StopRawRecordCall;", "Lio/getstream/android/video/generated/models/OwnCapability;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class StopRawRecordCall extends OwnCapability {
        public static final StopRawRecordCall INSTANCE = new StopRawRecordCall();

        private StopRawRecordCall() {
            super("stop-raw-record-call", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$StopRecordCall;", "Lio/getstream/android/video/generated/models/OwnCapability;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class StopRecordCall extends OwnCapability {
        public static final StopRecordCall INSTANCE = new StopRecordCall();

        private StopRecordCall() {
            super("stop-record-call", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$StopTranscriptionCall;", "Lio/getstream/android/video/generated/models/OwnCapability;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class StopTranscriptionCall extends OwnCapability {
        public static final StopTranscriptionCall INSTANCE = new StopTranscriptionCall();

        private StopTranscriptionCall() {
            super("stop-transcription-call", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$Unknown;", "Lio/getstream/android/video/generated/models/OwnCapability;", "unknownValue", "", "(Ljava/lang/String;)V", "getUnknownValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final /* data */ class Unknown extends OwnCapability {
        private final String unknownValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unknown(String unknownValue) {
            super(unknownValue, null);
            AbstractC22676k.m65750j(unknownValue, "unknownValue");
            this.unknownValue = unknownValue;
        }

        public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = unknown.unknownValue;
            }
            return unknown.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUnknownValue() {
            return this.unknownValue;
        }

        public final Unknown copy(String unknownValue) {
            AbstractC22676k.m65750j(unknownValue, "unknownValue");
            return new Unknown(unknownValue);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Unknown) && AbstractC22676k.m65745e(this.unknownValue, ((Unknown) other).unknownValue);
        }

        public final String getUnknownValue() {
            return this.unknownValue;
        }

        public int hashCode() {
            return this.unknownValue.hashCode();
        }

        @Override // io.getstream.android.video.generated.models.OwnCapability
        public String toString() {
            return AbstractC11895b.m31996o("Unknown(unknownValue=", this.unknownValue, ")");
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$UpdateCall;", "Lio/getstream/android/video/generated/models/OwnCapability;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class UpdateCall extends OwnCapability {
        public static final UpdateCall INSTANCE = new UpdateCall();

        private UpdateCall() {
            super("update-call", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$UpdateCallMember;", "Lio/getstream/android/video/generated/models/OwnCapability;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class UpdateCallMember extends OwnCapability {
        public static final UpdateCallMember INSTANCE = new UpdateCallMember();

        private UpdateCallMember() {
            super("update-call-member", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$UpdateCallPermissions;", "Lio/getstream/android/video/generated/models/OwnCapability;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class UpdateCallPermissions extends OwnCapability {
        public static final UpdateCallPermissions INSTANCE = new UpdateCallPermissions();

        private UpdateCallPermissions() {
            super("update-call-permissions", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnCapability$UpdateCallSettings;", "Lio/getstream/android/video/generated/models/OwnCapability;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class UpdateCallSettings extends OwnCapability {
        public static final UpdateCallSettings INSTANCE = new UpdateCallSettings();

        private UpdateCallSettings() {
            super("update-call-settings", null);
        }
    }

    public /* synthetic */ OwnCapability(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String getValue() {
        return this.value;
    }

    public String toString() {
        return this.value;
    }

    private OwnCapability(String str) {
        this.value = str;
    }
}
