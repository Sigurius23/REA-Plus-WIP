package live.hms.video.signal.jsonrpc.models;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.mapbox.maps.MapboxMap;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.api2.model.requests.CreatePollRequest;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.chat.android.models.CommandDefaults;
import java.lang.reflect.GenericDeclaration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import live.hms.video.connection.models.HMSConnectionRole;
import live.hms.video.connection.models.HMSIceCandidate;
import live.hms.video.connection.models.HMSSessionDescription;
import live.hms.video.connection.models.HMSTrickle;
import live.hms.video.events.AnalyticsEvent;
import live.hms.video.media.settings.HMSRtmpVideoResolution;
import live.hms.video.media.tracks.HMSTrackType;
import live.hms.video.polls.models.HmsPollCategory;
import live.hms.video.polls.models.HmsPollCreationParams;
import live.hms.video.polls.models.HmsPollState;
import live.hms.video.polls.models.HmsPollUserTrackingMode;
import live.hms.video.polls.models.answer.HmsPollAnswer;
import live.hms.video.polls.models.question.HmsPollQuestionSettingContainer;
import live.hms.video.sdk.models.HMSHLSMeetingURLVariant;
import live.hms.video.sdk.models.HMSHLSTimedMetadata;
import live.hms.video.sdk.models.HMSHlsRecordingConfig;
import live.hms.video.sdk.models.HMSNotifications;
import live.hms.video.sdk.models.TranscriptionsMode;
import live.hms.video.signal.HMSSignalMethod;
import live.hms.video.utils.GsonUtils;
import live.hms.video.utils.HMSConstantsKt;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00112\u00020\u0001:1\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./01234B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001056789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcd¨\u0006e"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams;", "", "<init>", "()V", "Answer", "Join", "Offer", "SendOffer", "TrackUpdate", "Trickle", "OnError", "Event", "Leave", "RoleChangeRequest", "BulkRoleChangeRequest", "RoleChangeAccept", "Unsupported", "Companion", "RemovePeerRequest", "EndRoomRequest", "TrackUpdateRequest", "TrackUpdateAllRequest", "SendBroadcast", "RtmpStart", "HLSStart", "HLSStop", "RtmpStop", "PeerMetadataUpdate", "SessionMetadataRequest", "SetSessionMetadata", "SetHLSSessionMetadata", "ListenMetadataChangeRequest", "SetPollParams", "PollQuestionsSet", "PollStartRequest", "PollStopRequest", "PollQuestionsGet", "PollResponseSet", "PollResponsesQuery", "Options", "HMSWhiteBoardGetOption", "PollResultsQuery", "PollLeaderboardQuery", "PollListQuery", "GroupJoin", "GroupLeave", "GroupAdd", "GroupRemove", "FindPeer", "PeerIteratorNext", "StartTranscription", "StopTranscription", "PeerNameSearch", "Llive/hms/video/signal/jsonrpc/models/HMSParams$Answer;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$EndRoomRequest;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$FindPeer;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$GroupAdd;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$GroupJoin;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$GroupLeave;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$GroupRemove;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$HLSStart;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$HLSStop;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$HMSWhiteBoardGetOption;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$Join;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$Leave;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$ListenMetadataChangeRequest;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$Offer;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$OnError;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$PeerIteratorNext;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$PeerMetadataUpdate;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$PeerNameSearch;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollLeaderboardQuery;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsGet;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsSet;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponseSet;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResultsQuery;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollStartRequest;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollStopRequest;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$RemovePeerRequest;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$RoleChangeAccept;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$RoleChangeRequest;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStop;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$SendBroadcast;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$SessionMetadataRequest;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$SetHLSSessionMetadata;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$SetPollParams;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$SetSessionMetadata;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$StartTranscription;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$StopTranscription;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$TrackUpdate;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$TrackUpdateAllRequest;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$TrackUpdateRequest;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$Trickle;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$Unsupported;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public abstract class HMSParams {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$Answer;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "description", "Llive/hms/video/connection/models/HMSSessionDescription;", "<init>", "(Llive/hms/video/connection/models/HMSSessionDescription;)V", "getDescription", "()Llive/hms/video/connection/models/HMSSessionDescription;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class Answer extends HMSParams {

        @SerializedName("desc")
        private final HMSSessionDescription description;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Answer(HMSSessionDescription description) {
            super(null);
            AbstractC22676k.m65750j(description, "description");
            this.description = description;
        }

        public static /* synthetic */ Answer copy$default(Answer answer, HMSSessionDescription hMSSessionDescription, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                hMSSessionDescription = answer.description;
            }
            return answer.copy(hMSSessionDescription);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final HMSSessionDescription getDescription() {
            return this.description;
        }

        public final Answer copy(HMSSessionDescription description) {
            AbstractC22676k.m65750j(description, "description");
            return new Answer(description);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Answer) && AbstractC22676k.m65745e(this.description, ((Answer) other).description);
        }

        public final HMSSessionDescription getDescription() {
            return this.description;
        }

        public int hashCode() {
            return this.description.hashCode();
        }

        public String toString() {
            return "Answer(description=" + this.description + ')';
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "rolesList", "", "", "force", "", "toRoleName", "<init>", "(Ljava/util/List;ZLjava/lang/String;)V", "getRolesList", "()Ljava/util/List;", "getForce", "()Z", "getToRoleName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class BulkRoleChangeRequest extends HMSParams {

        @SerializedName("force")
        private final boolean force;

        @SerializedName("roles")
        private final List<String> rolesList;

        @SerializedName("role")
        private final String toRoleName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BulkRoleChangeRequest(List<String> rolesList, boolean z4, String toRoleName) {
            super(null);
            AbstractC22676k.m65750j(rolesList, "rolesList");
            AbstractC22676k.m65750j(toRoleName, "toRoleName");
            this.rolesList = rolesList;
            this.force = z4;
            this.toRoleName = toRoleName;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BulkRoleChangeRequest copy$default(BulkRoleChangeRequest bulkRoleChangeRequest, List list, boolean z4, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                list = bulkRoleChangeRequest.rolesList;
            }
            if ((i13 & 2) != 0) {
                z4 = bulkRoleChangeRequest.force;
            }
            if ((i13 & 4) != 0) {
                str = bulkRoleChangeRequest.toRoleName;
            }
            return bulkRoleChangeRequest.copy(list, z4, str);
        }

        public final List<String> component1() {
            return this.rolesList;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getForce() {
            return this.force;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getToRoleName() {
            return this.toRoleName;
        }

        public final BulkRoleChangeRequest copy(List<String> rolesList, boolean force, String toRoleName) {
            AbstractC22676k.m65750j(rolesList, "rolesList");
            AbstractC22676k.m65750j(toRoleName, "toRoleName");
            return new BulkRoleChangeRequest(rolesList, force, toRoleName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BulkRoleChangeRequest)) {
                return false;
            }
            BulkRoleChangeRequest bulkRoleChangeRequest = (BulkRoleChangeRequest) other;
            return AbstractC22676k.m65745e(this.rolesList, bulkRoleChangeRequest.rolesList) && this.force == bulkRoleChangeRequest.force && AbstractC22676k.m65745e(this.toRoleName, bulkRoleChangeRequest.toRoleName);
        }

        public final boolean getForce() {
            return this.force;
        }

        public final List<String> getRolesList() {
            return this.rolesList;
        }

        public final String getToRoleName() {
            return this.toRoleName;
        }

        public int hashCode() {
            return this.toRoleName.hashCode() + AbstractC2875y.m8289b(this.rolesList.hashCode() * 31, 31, this.force);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("BulkRoleChangeRequest(rolesList=");
            sb4.append(this.rolesList);
            sb4.append(", force=");
            sb4.append(this.force);
            sb4.append(", toRoleName=");
            return AbstractC25012a.m73377j(sb4, this.toRoleName, ')');
        }
    }

    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$Companion;", "", "<init>", "()V", "fromReceivedParams", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "method", "Llive/hms/video/signal/HMSSignalMethod;", "params", "Lcom/google/gson/JsonObject;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class Companion {

        @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HMSSignalMethod.values().length];
                try {
                    iArr[HMSSignalMethod.ANSWER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[HMSSignalMethod.JOIN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[HMSSignalMethod.OFFER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[HMSSignalMethod.TRICKLE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[HMSSignalMethod.SERVER_ERROR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final HMSParams fromReceivedParams(HMSSignalMethod method, JsonObject params) {
            GenericDeclaration genericDeclaration;
            AbstractC22676k.m65750j(method, "method");
            AbstractC22676k.m65750j(params, "params");
            int i13 = WhenMappings.$EnumSwitchMapping$0[method.ordinal()];
            if (i13 == 1) {
                genericDeclaration = Answer.class;
            } else if (i13 == 2) {
                genericDeclaration = Join.class;
            } else if (i13 == 3) {
                genericDeclaration = Offer.class;
            } else if (i13 != 4) {
                genericDeclaration = i13 != 5 ? Unsupported.class : OnError.class;
            } else {
                genericDeclaration = Trickle.class;
            }
            Object objFromJson = GsonUtils.INSTANCE.getGson().fromJson((JsonElement) params, (Class<Object>) genericDeclaration);
            AbstractC22676k.m65749i(objFromJson, "fromJson(...)");
            return (HMSParams) objFromJson;
        }

        private Companion() {
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$EndRoomRequest;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "lock", "", "reason", "", "<init>", "(ZLjava/lang/String;)V", "getLock", "()Z", "getReason", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class EndRoomRequest extends HMSParams {

        @SerializedName("lock")
        private final boolean lock;

        @SerializedName("reason")
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EndRoomRequest(boolean z4, String reason) {
            super(null);
            AbstractC22676k.m65750j(reason, "reason");
            this.lock = z4;
            this.reason = reason;
        }

        public static /* synthetic */ EndRoomRequest copy$default(EndRoomRequest endRoomRequest, boolean z4, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z4 = endRoomRequest.lock;
            }
            if ((i13 & 2) != 0) {
                str = endRoomRequest.reason;
            }
            return endRoomRequest.copy(z4, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getLock() {
            return this.lock;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        public final EndRoomRequest copy(boolean lock, String reason) {
            AbstractC22676k.m65750j(reason, "reason");
            return new EndRoomRequest(lock, reason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EndRoomRequest)) {
                return false;
            }
            EndRoomRequest endRoomRequest = (EndRoomRequest) other;
            return this.lock == endRoomRequest.lock && AbstractC22676k.m65745e(this.reason, endRoomRequest.reason);
        }

        public final boolean getLock() {
            return this.lock;
        }

        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode() + (Boolean.hashCode(this.lock) * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("EndRoomRequest(lock=");
            sb4.append(this.lock);
            sb4.append(", reason=");
            return AbstractC25012a.m73377j(sb4, this.reason, ')');
        }
    }

    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\"\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u0017\u001a\u00020\tHÆ\u0003JN\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\tHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR,\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$FindPeer;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "groupName", "", "roleName", "peerIDs", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", MapboxMap.QFE_LIMIT, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;I)V", "getGroupName", "()Ljava/lang/String;", "getRoleName", "getPeerIDs", "()Ljava/util/ArrayList;", "Ljava/util/ArrayList;", "getLimit", "()I", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;I)Llive/hms/video/signal/jsonrpc/models/HMSParams$FindPeer;", "equals", "", "other", "", "hashCode", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class FindPeer extends HMSParams {

        @SerializedName("group")
        private final String groupName;

        @SerializedName(MapboxMap.QFE_LIMIT)
        private final int limit;

        @SerializedName("peers")
        private final ArrayList<String> peerIDs;

        @SerializedName("role")
        private final String roleName;

        public FindPeer(String str, String str2, ArrayList<String> arrayList, int i13) {
            super(null);
            this.groupName = str;
            this.roleName = str2;
            this.peerIDs = arrayList;
            this.limit = i13;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FindPeer copy$default(FindPeer findPeer, String str, String str2, ArrayList arrayList, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                str = findPeer.groupName;
            }
            if ((i14 & 2) != 0) {
                str2 = findPeer.roleName;
            }
            if ((i14 & 4) != 0) {
                arrayList = findPeer.peerIDs;
            }
            if ((i14 & 8) != 0) {
                i13 = findPeer.limit;
            }
            return findPeer.copy(str, str2, arrayList, i13);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getGroupName() {
            return this.groupName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getRoleName() {
            return this.roleName;
        }

        public final ArrayList<String> component3() {
            return this.peerIDs;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getLimit() {
            return this.limit;
        }

        public final FindPeer copy(String groupName, String roleName, ArrayList<String> peerIDs, int limit) {
            return new FindPeer(groupName, roleName, peerIDs, limit);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FindPeer)) {
                return false;
            }
            FindPeer findPeer = (FindPeer) other;
            return AbstractC22676k.m65745e(this.groupName, findPeer.groupName) && AbstractC22676k.m65745e(this.roleName, findPeer.roleName) && AbstractC22676k.m65745e(this.peerIDs, findPeer.peerIDs) && this.limit == findPeer.limit;
        }

        public final String getGroupName() {
            return this.groupName;
        }

        public final int getLimit() {
            return this.limit;
        }

        public final ArrayList<String> getPeerIDs() {
            return this.peerIDs;
        }

        public final String getRoleName() {
            return this.roleName;
        }

        public int hashCode() {
            String str = this.groupName;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.roleName;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            ArrayList<String> arrayList = this.peerIDs;
            return Integer.hashCode(this.limit) + ((iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0)) * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("FindPeer(groupName=");
            sb4.append(this.groupName);
            sb4.append(", roleName=");
            sb4.append(this.roleName);
            sb4.append(", peerIDs=");
            sb4.append(this.peerIDs);
            sb4.append(", limit=");
            return AbstractC11895b.m31999r(sb4, this.limit, ')');
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$GroupJoin;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "groupName", "", "<init>", "(Ljava/lang/String;)V", "getGroupName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class GroupJoin extends HMSParams {

        @SerializedName("name")
        private final String groupName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GroupJoin(String groupName) {
            super(null);
            AbstractC22676k.m65750j(groupName, "groupName");
            this.groupName = groupName;
        }

        public static /* synthetic */ GroupJoin copy$default(GroupJoin groupJoin, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = groupJoin.groupName;
            }
            return groupJoin.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getGroupName() {
            return this.groupName;
        }

        public final GroupJoin copy(String groupName) {
            AbstractC22676k.m65750j(groupName, "groupName");
            return new GroupJoin(groupName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GroupJoin) && AbstractC22676k.m65745e(this.groupName, ((GroupJoin) other).groupName);
        }

        public final String getGroupName() {
            return this.groupName;
        }

        public int hashCode() {
            return this.groupName.hashCode();
        }

        public String toString() {
            return AbstractC25012a.m73377j(new StringBuilder("GroupJoin(groupName="), this.groupName, ')');
        }
    }

    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$HLSStart;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "meetingURLVariants", "", "Llive/hms/video/sdk/models/HMSHLSMeetingURLVariant;", "hmsHlsRecordingConfig", "Llive/hms/video/sdk/models/HMSHlsRecordingConfig;", "<init>", "(Ljava/util/List;Llive/hms/video/sdk/models/HMSHlsRecordingConfig;)V", "getMeetingURLVariants", "()Ljava/util/List;", "getHmsHlsRecordingConfig", "()Llive/hms/video/sdk/models/HMSHlsRecordingConfig;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class HLSStart extends HMSParams {

        @SerializedName("hls_recording")
        private final HMSHlsRecordingConfig hmsHlsRecordingConfig;

        @SerializedName("variants")
        private final List<HMSHLSMeetingURLVariant> meetingURLVariants;

        public HLSStart(List<HMSHLSMeetingURLVariant> list, HMSHlsRecordingConfig hMSHlsRecordingConfig) {
            super(null);
            this.meetingURLVariants = list;
            this.hmsHlsRecordingConfig = hMSHlsRecordingConfig;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HLSStart copy$default(HLSStart hLSStart, List list, HMSHlsRecordingConfig hMSHlsRecordingConfig, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                list = hLSStart.meetingURLVariants;
            }
            if ((i13 & 2) != 0) {
                hMSHlsRecordingConfig = hLSStart.hmsHlsRecordingConfig;
            }
            return hLSStart.copy(list, hMSHlsRecordingConfig);
        }

        public final List<HMSHLSMeetingURLVariant> component1() {
            return this.meetingURLVariants;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final HMSHlsRecordingConfig getHmsHlsRecordingConfig() {
            return this.hmsHlsRecordingConfig;
        }

        public final HLSStart copy(List<HMSHLSMeetingURLVariant> meetingURLVariants, HMSHlsRecordingConfig hmsHlsRecordingConfig) {
            return new HLSStart(meetingURLVariants, hmsHlsRecordingConfig);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HLSStart)) {
                return false;
            }
            HLSStart hLSStart = (HLSStart) other;
            return AbstractC22676k.m65745e(this.meetingURLVariants, hLSStart.meetingURLVariants) && AbstractC22676k.m65745e(this.hmsHlsRecordingConfig, hLSStart.hmsHlsRecordingConfig);
        }

        public final HMSHlsRecordingConfig getHmsHlsRecordingConfig() {
            return this.hmsHlsRecordingConfig;
        }

        public final List<HMSHLSMeetingURLVariant> getMeetingURLVariants() {
            return this.meetingURLVariants;
        }

        public int hashCode() {
            List<HMSHLSMeetingURLVariant> list = this.meetingURLVariants;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            HMSHlsRecordingConfig hMSHlsRecordingConfig = this.hmsHlsRecordingConfig;
            return iHashCode + (hMSHlsRecordingConfig != null ? hMSHlsRecordingConfig.hashCode() : 0);
        }

        public String toString() {
            return "HLSStart(meetingURLVariants=" + this.meetingURLVariants + ", hmsHlsRecordingConfig=" + this.hmsHlsRecordingConfig + ')';
        }
    }

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$HLSStop;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "meetingURLVariants", "", "Llive/hms/video/sdk/models/HMSHLSMeetingURLVariant;", "<init>", "(Ljava/util/List;)V", "getMeetingURLVariants", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class HLSStop extends HMSParams {

        @SerializedName("variants")
        private final List<HMSHLSMeetingURLVariant> meetingURLVariants;

        public HLSStop(List<HMSHLSMeetingURLVariant> list) {
            super(null);
            this.meetingURLVariants = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HLSStop copy$default(HLSStop hLSStop, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                list = hLSStop.meetingURLVariants;
            }
            return hLSStop.copy(list);
        }

        public final List<HMSHLSMeetingURLVariant> component1() {
            return this.meetingURLVariants;
        }

        public final HLSStop copy(List<HMSHLSMeetingURLVariant> meetingURLVariants) {
            return new HLSStop(meetingURLVariants);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HLSStop) && AbstractC22676k.m65745e(this.meetingURLVariants, ((HLSStop) other).meetingURLVariants);
        }

        public final List<HMSHLSMeetingURLVariant> getMeetingURLVariants() {
            return this.meetingURLVariants;
        }

        public int hashCode() {
            List<HMSHLSMeetingURLVariant> list = this.meetingURLVariants;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            return AbstractC17176i.m48506h(new StringBuilder("HLSStop(meetingURLVariants="), this.meetingURLVariants, ')');
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$HMSWhiteBoardGetOption;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class HMSWhiteBoardGetOption extends HMSParams {

        @SerializedName("id")
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HMSWhiteBoardGetOption(String id4) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            this.id = id4;
        }

        public static /* synthetic */ HMSWhiteBoardGetOption copy$default(HMSWhiteBoardGetOption hMSWhiteBoardGetOption, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = hMSWhiteBoardGetOption.id;
            }
            return hMSWhiteBoardGetOption.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final HMSWhiteBoardGetOption copy(String id4) {
            AbstractC22676k.m65750j(id4, "id");
            return new HMSWhiteBoardGetOption(id4);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HMSWhiteBoardGetOption) && AbstractC22676k.m65745e(this.id, ((HMSWhiteBoardGetOption) other).id);
        }

        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return AbstractC25012a.m73377j(new StringBuilder("HMSWhiteBoardGetOption(id="), this.id, ')');
        }
    }

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B?\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013¨\u0006#"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$Join;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "name", "", "data", "offer", "Llive/hms/video/connection/models/HMSSessionDescription;", "disableVideoAutoSubscribe", "", "serverSideSubscribeDegradation", "simulcast", "<init>", "(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/connection/models/HMSSessionDescription;ZZZ)V", "getName", "()Ljava/lang/String;", "getData", "getOffer", "()Llive/hms/video/connection/models/HMSSessionDescription;", "getDisableVideoAutoSubscribe", "()Z", "getServerSideSubscribeDegradation", "getSimulcast", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class Join extends HMSParams {

        @SerializedName("data")
        private final String data;

        @SerializedName("disableVidAutoSub")
        private final boolean disableVideoAutoSubscribe;

        @SerializedName("name")
        private final String name;

        @SerializedName("offer")
        private final HMSSessionDescription offer;

        @SerializedName("server_sub_degrade")
        private final boolean serverSideSubscribeDegradation;

        @SerializedName("simulcast")
        private final boolean simulcast;

        public /* synthetic */ Join(String str, String str2, HMSSessionDescription hMSSessionDescription, boolean z4, boolean z13, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, hMSSessionDescription, (i13 & 8) != 0 ? true : z4, (i13 & 16) != 0 ? false : z13, z14);
        }

        public static /* synthetic */ Join copy$default(Join join, String str, String str2, HMSSessionDescription hMSSessionDescription, boolean z4, boolean z13, boolean z14, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = join.name;
            }
            if ((i13 & 2) != 0) {
                str2 = join.data;
            }
            if ((i13 & 4) != 0) {
                hMSSessionDescription = join.offer;
            }
            if ((i13 & 8) != 0) {
                z4 = join.disableVideoAutoSubscribe;
            }
            if ((i13 & 16) != 0) {
                z13 = join.serverSideSubscribeDegradation;
            }
            if ((i13 & 32) != 0) {
                z14 = join.simulcast;
            }
            boolean z15 = z13;
            boolean z16 = z14;
            return join.copy(str, str2, hMSSessionDescription, z4, z15, z16);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final HMSSessionDescription getOffer() {
            return this.offer;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getDisableVideoAutoSubscribe() {
            return this.disableVideoAutoSubscribe;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getServerSideSubscribeDegradation() {
            return this.serverSideSubscribeDegradation;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getSimulcast() {
            return this.simulcast;
        }

        public final Join copy(String name, String data, HMSSessionDescription offer, boolean disableVideoAutoSubscribe, boolean serverSideSubscribeDegradation, boolean simulcast) {
            AbstractC22676k.m65750j(name, "name");
            AbstractC22676k.m65750j(data, "data");
            return new Join(name, data, offer, disableVideoAutoSubscribe, serverSideSubscribeDegradation, simulcast);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Join)) {
                return false;
            }
            Join join = (Join) other;
            return AbstractC22676k.m65745e(this.name, join.name) && AbstractC22676k.m65745e(this.data, join.data) && AbstractC22676k.m65745e(this.offer, join.offer) && this.disableVideoAutoSubscribe == join.disableVideoAutoSubscribe && this.serverSideSubscribeDegradation == join.serverSideSubscribeDegradation && this.simulcast == join.simulcast;
        }

        public final String getData() {
            return this.data;
        }

        public final boolean getDisableVideoAutoSubscribe() {
            return this.disableVideoAutoSubscribe;
        }

        public final String getName() {
            return this.name;
        }

        public final HMSSessionDescription getOffer() {
            return this.offer;
        }

        public final boolean getServerSideSubscribeDegradation() {
            return this.serverSideSubscribeDegradation;
        }

        public final boolean getSimulcast() {
            return this.simulcast;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.name.hashCode() * 31, 31, this.data);
            HMSSessionDescription hMSSessionDescription = this.offer;
            return Boolean.hashCode(this.simulcast) + AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM30450d + (hMSSessionDescription == null ? 0 : hMSSessionDescription.hashCode())) * 31, 31, this.disableVideoAutoSubscribe), 31, this.serverSideSubscribeDegradation);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("Join(name=");
            sb4.append(this.name);
            sb4.append(", data=");
            sb4.append(this.data);
            sb4.append(", offer=");
            sb4.append(this.offer);
            sb4.append(", disableVideoAutoSubscribe=");
            sb4.append(this.disableVideoAutoSubscribe);
            sb4.append(", serverSideSubscribeDegradation=");
            sb4.append(this.serverSideSubscribeDegradation);
            sb4.append(", simulcast=");
            return AbstractC2875y.m8305r(sb4, this.simulcast, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Join(String name, String data, HMSSessionDescription hMSSessionDescription, boolean z4, boolean z13, boolean z14) {
            super(null);
            AbstractC22676k.m65750j(name, "name");
            AbstractC22676k.m65750j(data, "data");
            this.name = name;
            this.data = data;
            this.offer = hMSSessionDescription;
            this.disableVideoAutoSubscribe = z4;
            this.serverSideSubscribeDegradation = z13;
            this.simulcast = z14;
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$Leave;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "version", "", "<init>", "(Ljava/lang/String;)V", "getVersion", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class Leave extends HMSParams {

        @SerializedName("version")
        private final String version;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Leave(String version) {
            super(null);
            AbstractC22676k.m65750j(version, "version");
            this.version = version;
        }

        public static /* synthetic */ Leave copy$default(Leave leave, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = leave.version;
            }
            return leave.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public final Leave copy(String version) {
            AbstractC22676k.m65750j(version, "version");
            return new Leave(version);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Leave) && AbstractC22676k.m65745e(this.version, ((Leave) other).version);
        }

        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            return this.version.hashCode();
        }

        public String toString() {
            return AbstractC25012a.m73377j(new StringBuilder("Leave(version="), this.version, ')');
        }
    }

    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$Offer;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "type", "Llive/hms/video/connection/models/HMSSessionDescription$Type;", "description", "", "<init>", "(Llive/hms/video/connection/models/HMSSessionDescription$Type;Ljava/lang/String;)V", "getType", "()Llive/hms/video/connection/models/HMSSessionDescription$Type;", "getDescription", "()Ljava/lang/String;", "toSDP", "Llive/hms/video/connection/models/HMSSessionDescription;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class Offer extends HMSParams {

        @SerializedName("sdp")
        private final String description;

        @SerializedName("type")
        private final HMSSessionDescription.Type type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Offer(HMSSessionDescription.Type type, String description) {
            super(null);
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(description, "description");
            this.type = type;
            this.description = description;
        }

        public static /* synthetic */ Offer copy$default(Offer offer, HMSSessionDescription.Type type, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                type = offer.type;
            }
            if ((i13 & 2) != 0) {
                str = offer.description;
            }
            return offer.copy(type, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final HMSSessionDescription.Type getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        public final Offer copy(HMSSessionDescription.Type type, String description) {
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(description, "description");
            return new Offer(type, description);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Offer)) {
                return false;
            }
            Offer offer = (Offer) other;
            return this.type == offer.type && AbstractC22676k.m65745e(this.description, offer.description);
        }

        public final String getDescription() {
            return this.description;
        }

        public final HMSSessionDescription.Type getType() {
            return this.type;
        }

        public int hashCode() {
            return this.description.hashCode() + (this.type.hashCode() * 31);
        }

        public final HMSSessionDescription toSDP() {
            return new HMSSessionDescription(this.type, this.description, null, 4, null);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("Offer(type=");
            sb4.append(this.type);
            sb4.append(", description=");
            return AbstractC25012a.m73377j(sb4, this.description, ')');
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$OnError;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "code", "", "message", "", "<init>", "(ILjava/lang/String;)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class OnError extends HMSParams {

        @SerializedName("code")
        private final int code;

        @SerializedName("message")
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnError(int i13, String message) {
            super(null);
            AbstractC22676k.m65750j(message, "message");
            this.code = i13;
            this.message = message;
        }

        public static /* synthetic */ OnError copy$default(OnError onError, int i13, String str, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i13 = onError.code;
            }
            if ((i14 & 2) != 0) {
                str = onError.message;
            }
            return onError.copy(i13, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final OnError copy(int code, String message) {
            AbstractC22676k.m65750j(message, "message");
            return new OnError(code, message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnError)) {
                return false;
            }
            OnError onError = (OnError) other;
            return this.code == onError.code && AbstractC22676k.m65745e(this.message, onError.message);
        }

        public final int getCode() {
            return this.code;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode() + (Integer.hashCode(this.code) * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("OnError(code=");
            sb4.append(this.code);
            sb4.append(", message=");
            return AbstractC25012a.m73377j(sb4, this.message, ')');
        }
    }

    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003Ja\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014¨\u0006\""}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "id", "", "title", "reader", "", "writer", "admin", "isPresenceTrackingEnabled", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Z)V", "getId", "()Ljava/lang/String;", "getTitle", "getReader", "()Ljava/util/List;", "getWriter", "getAdmin", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class Options extends HMSParams {

        @SerializedName("admin")
        private final List<String> admin;

        @SerializedName("id")
        private final String id;

        @SerializedName("presence")
        private final boolean isPresenceTrackingEnabled;

        @SerializedName("reader")
        private final List<String> reader;

        @SerializedName("title")
        private final String title;

        @SerializedName("writer")
        private final List<String> writer;

        public Options() {
            this(null, null, null, null, null, false, 63, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Options copy$default(Options options, String str, String str2, List list, List list2, List list3, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = options.id;
            }
            if ((i13 & 2) != 0) {
                str2 = options.title;
            }
            if ((i13 & 4) != 0) {
                list = options.reader;
            }
            if ((i13 & 8) != 0) {
                list2 = options.writer;
            }
            if ((i13 & 16) != 0) {
                list3 = options.admin;
            }
            if ((i13 & 32) != 0) {
                z4 = options.isPresenceTrackingEnabled;
            }
            List list4 = list3;
            boolean z13 = z4;
            return options.copy(str, str2, list, list2, list4, z13);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final List<String> component3() {
            return this.reader;
        }

        public final List<String> component4() {
            return this.writer;
        }

        public final List<String> component5() {
            return this.admin;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getIsPresenceTrackingEnabled() {
            return this.isPresenceTrackingEnabled;
        }

        public final Options copy(String id4, String title, List<String> reader, List<String> writer, List<String> admin, boolean isPresenceTrackingEnabled) {
            return new Options(id4, title, reader, writer, admin, isPresenceTrackingEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Options)) {
                return false;
            }
            Options options = (Options) other;
            return AbstractC22676k.m65745e(this.id, options.id) && AbstractC22676k.m65745e(this.title, options.title) && AbstractC22676k.m65745e(this.reader, options.reader) && AbstractC22676k.m65745e(this.writer, options.writer) && AbstractC22676k.m65745e(this.admin, options.admin) && this.isPresenceTrackingEnabled == options.isPresenceTrackingEnabled;
        }

        public final List<String> getAdmin() {
            return this.admin;
        }

        public final String getId() {
            return this.id;
        }

        public final List<String> getReader() {
            return this.reader;
        }

        public final String getTitle() {
            return this.title;
        }

        public final List<String> getWriter() {
            return this.writer;
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.title;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<String> list = this.reader;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            List<String> list2 = this.writer;
            int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<String> list3 = this.admin;
            return Boolean.hashCode(this.isPresenceTrackingEnabled) + ((iHashCode4 + (list3 != null ? list3.hashCode() : 0)) * 31);
        }

        public final boolean isPresenceTrackingEnabled() {
            return this.isPresenceTrackingEnabled;
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("Options(id=");
            sb4.append(this.id);
            sb4.append(", title=");
            sb4.append(this.title);
            sb4.append(", reader=");
            sb4.append(this.reader);
            sb4.append(", writer=");
            sb4.append(this.writer);
            sb4.append(", admin=");
            sb4.append(this.admin);
            sb4.append(", isPresenceTrackingEnabled=");
            return AbstractC2875y.m8305r(sb4, this.isPresenceTrackingEnabled, ')');
        }

        public /* synthetic */ Options(String str, String str2, List list, List list2, List list3, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : list, (i13 & 8) != 0 ? null : list2, (i13 & 16) != 0 ? null : list3, (i13 & 32) != 0 ? false : z4);
        }

        public Options(String str, String str2, List<String> list, List<String> list2, List<String> list3, boolean z4) {
            super(null);
            this.id = str;
            this.title = str2;
            this.reader = list;
            this.writer = list2;
            this.admin = list3;
            this.isPresenceTrackingEnabled = z4;
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$PeerIteratorNext;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "iteratorID", "", MapboxMap.QFE_LIMIT, "", "<init>", "(Ljava/lang/String;I)V", "getIteratorID", "()Ljava/lang/String;", "getLimit", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class PeerIteratorNext extends HMSParams {

        @SerializedName("iterator")
        private final String iteratorID;

        @SerializedName(MapboxMap.QFE_LIMIT)
        private final int limit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PeerIteratorNext(String iteratorID, int i13) {
            super(null);
            AbstractC22676k.m65750j(iteratorID, "iteratorID");
            this.iteratorID = iteratorID;
            this.limit = i13;
        }

        public static /* synthetic */ PeerIteratorNext copy$default(PeerIteratorNext peerIteratorNext, String str, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                str = peerIteratorNext.iteratorID;
            }
            if ((i14 & 2) != 0) {
                i13 = peerIteratorNext.limit;
            }
            return peerIteratorNext.copy(str, i13);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getIteratorID() {
            return this.iteratorID;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getLimit() {
            return this.limit;
        }

        public final PeerIteratorNext copy(String iteratorID, int limit) {
            AbstractC22676k.m65750j(iteratorID, "iteratorID");
            return new PeerIteratorNext(iteratorID, limit);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PeerIteratorNext)) {
                return false;
            }
            PeerIteratorNext peerIteratorNext = (PeerIteratorNext) other;
            return AbstractC22676k.m65745e(this.iteratorID, peerIteratorNext.iteratorID) && this.limit == peerIteratorNext.limit;
        }

        public final String getIteratorID() {
            return this.iteratorID;
        }

        public final int getLimit() {
            return this.limit;
        }

        public int hashCode() {
            return Integer.hashCode(this.limit) + (this.iteratorID.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("PeerIteratorNext(iteratorID=");
            sb4.append(this.iteratorID);
            sb4.append(", limit=");
            return AbstractC11895b.m31999r(sb4, this.limit, ')');
        }
    }

    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$PeerNameSearch;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "query", "", MapboxMap.QFE_LIMIT, "", MapboxMap.QFE_OFFSET, "", "<init>", "(Ljava/lang/String;IJ)V", "getQuery", "()Ljava/lang/String;", "getLimit", "()I", "getOffset", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class PeerNameSearch extends HMSParams {

        @SerializedName(MapboxMap.QFE_LIMIT)
        private final int limit;

        @SerializedName(MapboxMap.QFE_OFFSET)
        private final long offset;

        @SerializedName("query")
        private final String query;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PeerNameSearch(String query, int i13, long j7) {
            super(null);
            AbstractC22676k.m65750j(query, "query");
            this.query = query;
            this.limit = i13;
            this.offset = j7;
        }

        public static /* synthetic */ PeerNameSearch copy$default(PeerNameSearch peerNameSearch, String str, int i13, long j7, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                str = peerNameSearch.query;
            }
            if ((i14 & 2) != 0) {
                i13 = peerNameSearch.limit;
            }
            if ((i14 & 4) != 0) {
                j7 = peerNameSearch.offset;
            }
            return peerNameSearch.copy(str, i13, j7);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getQuery() {
            return this.query;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getLimit() {
            return this.limit;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getOffset() {
            return this.offset;
        }

        public final PeerNameSearch copy(String query, int limit, long offset) {
            AbstractC22676k.m65750j(query, "query");
            return new PeerNameSearch(query, limit, offset);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PeerNameSearch)) {
                return false;
            }
            PeerNameSearch peerNameSearch = (PeerNameSearch) other;
            return AbstractC22676k.m65745e(this.query, peerNameSearch.query) && this.limit == peerNameSearch.limit && this.offset == peerNameSearch.offset;
        }

        public final int getLimit() {
            return this.limit;
        }

        public final long getOffset() {
            return this.offset;
        }

        public final String getQuery() {
            return this.query;
        }

        public int hashCode() {
            return Long.hashCode(this.offset) + AbstractC11266d.m30448b(this.limit, this.query.hashCode() * 31, 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("PeerNameSearch(query=");
            sb4.append(this.query);
            sb4.append(", limit=");
            sb4.append(this.limit);
            sb4.append(", offset=");
            return AbstractC2875y.m8302o(sb4, this.offset, ')');
        }
    }

    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "count", "", "start", "", "state", "Llive/hms/video/polls/models/HmsPollState;", "version", "<init>", "(ILjava/lang/String;Llive/hms/video/polls/models/HmsPollState;Ljava/lang/String;)V", "getCount", "()I", "getStart", "()Ljava/lang/String;", "getState", "()Llive/hms/video/polls/models/HmsPollState;", "getVersion", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class PollListQuery extends HMSParams {

        @SerializedName("count")
        private final int count;

        @SerializedName("start")
        private final String start;

        @SerializedName("state")
        private final HmsPollState state;

        @SerializedName("version")
        private final String version;

        public PollListQuery() {
            this(0, null, null, null, 15, null);
        }

        public static /* synthetic */ PollListQuery copy$default(PollListQuery pollListQuery, int i13, String str, HmsPollState hmsPollState, String str2, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i13 = pollListQuery.count;
            }
            if ((i14 & 2) != 0) {
                str = pollListQuery.start;
            }
            if ((i14 & 4) != 0) {
                hmsPollState = pollListQuery.state;
            }
            if ((i14 & 8) != 0) {
                str2 = pollListQuery.version;
            }
            return pollListQuery.copy(i13, str, hmsPollState, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getStart() {
            return this.start;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final HmsPollState getState() {
            return this.state;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public final PollListQuery copy(int count, String start, HmsPollState state, String version) {
            AbstractC22676k.m65750j(state, "state");
            AbstractC22676k.m65750j(version, "version");
            return new PollListQuery(count, start, state, version);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PollListQuery)) {
                return false;
            }
            PollListQuery pollListQuery = (PollListQuery) other;
            return this.count == pollListQuery.count && AbstractC22676k.m65745e(this.start, pollListQuery.start) && this.state == pollListQuery.state && AbstractC22676k.m65745e(this.version, pollListQuery.version);
        }

        public final int getCount() {
            return this.count;
        }

        public final String getStart() {
            return this.start;
        }

        public final HmsPollState getState() {
            return this.state;
        }

        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.count) * 31;
            String str = this.start;
            return this.version.hashCode() + ((this.state.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("PollListQuery(count=");
            sb4.append(this.count);
            sb4.append(", start=");
            sb4.append(this.start);
            sb4.append(", state=");
            sb4.append(this.state);
            sb4.append(", version=");
            return AbstractC25012a.m73377j(sb4, this.version, ')');
        }

        public /* synthetic */ PollListQuery(int i13, String str, HmsPollState hmsPollState, String str2, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this((i14 & 1) != 0 ? 10 : i13, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? HmsPollState.STARTED : hmsPollState, (i14 & 8) != 0 ? "1.0" : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PollListQuery(int i13, String str, HmsPollState state, String version) {
            super(null);
            AbstractC22676k.m65750j(state, "state");
            AbstractC22676k.m65750j(version, "version");
            this.count = i13;
            this.start = str;
            this.state = state;
            this.version = version;
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$RemovePeerRequest;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "requestedByPeerId", "", "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getRequestedByPeerId", "()Ljava/lang/String;", "getReason", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class RemovePeerRequest extends HMSParams {

        @SerializedName("reason")
        private final String reason;

        @SerializedName("requested_for")
        private final String requestedByPeerId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemovePeerRequest(String requestedByPeerId, String reason) {
            super(null);
            AbstractC22676k.m65750j(requestedByPeerId, "requestedByPeerId");
            AbstractC22676k.m65750j(reason, "reason");
            this.requestedByPeerId = requestedByPeerId;
            this.reason = reason;
        }

        public static /* synthetic */ RemovePeerRequest copy$default(RemovePeerRequest removePeerRequest, String str, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = removePeerRequest.requestedByPeerId;
            }
            if ((i13 & 2) != 0) {
                str2 = removePeerRequest.reason;
            }
            return removePeerRequest.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getRequestedByPeerId() {
            return this.requestedByPeerId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        public final RemovePeerRequest copy(String requestedByPeerId, String reason) {
            AbstractC22676k.m65750j(requestedByPeerId, "requestedByPeerId");
            AbstractC22676k.m65750j(reason, "reason");
            return new RemovePeerRequest(requestedByPeerId, reason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RemovePeerRequest)) {
                return false;
            }
            RemovePeerRequest removePeerRequest = (RemovePeerRequest) other;
            return AbstractC22676k.m65745e(this.requestedByPeerId, removePeerRequest.requestedByPeerId) && AbstractC22676k.m65745e(this.reason, removePeerRequest.reason);
        }

        public final String getReason() {
            return this.reason;
        }

        public final String getRequestedByPeerId() {
            return this.requestedByPeerId;
        }

        public int hashCode() {
            return this.reason.hashCode() + (this.requestedByPeerId.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("RemovePeerRequest(requestedByPeerId=");
            sb4.append(this.requestedByPeerId);
            sb4.append(", reason=");
            return AbstractC25012a.m73377j(sb4, this.reason, ')');
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$RoleChangeAccept;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "token", "", "roleName", "requestedBy", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "getRoleName", "getRequestedBy", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class RoleChangeAccept extends HMSParams {

        @SerializedName("requested_by")
        private final String requestedBy;

        @SerializedName("role")
        private final String roleName;

        @SerializedName("token")
        private final String token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RoleChangeAccept(String token, String roleName, String str) {
            super(null);
            AbstractC22676k.m65750j(token, "token");
            AbstractC22676k.m65750j(roleName, "roleName");
            this.token = token;
            this.roleName = roleName;
            this.requestedBy = str;
        }

        public static /* synthetic */ RoleChangeAccept copy$default(RoleChangeAccept roleChangeAccept, String str, String str2, String str3, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = roleChangeAccept.token;
            }
            if ((i13 & 2) != 0) {
                str2 = roleChangeAccept.roleName;
            }
            if ((i13 & 4) != 0) {
                str3 = roleChangeAccept.requestedBy;
            }
            return roleChangeAccept.copy(str, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getToken() {
            return this.token;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getRoleName() {
            return this.roleName;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getRequestedBy() {
            return this.requestedBy;
        }

        public final RoleChangeAccept copy(String token, String roleName, String requestedBy) {
            AbstractC22676k.m65750j(token, "token");
            AbstractC22676k.m65750j(roleName, "roleName");
            return new RoleChangeAccept(token, roleName, requestedBy);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RoleChangeAccept)) {
                return false;
            }
            RoleChangeAccept roleChangeAccept = (RoleChangeAccept) other;
            return AbstractC22676k.m65745e(this.token, roleChangeAccept.token) && AbstractC22676k.m65745e(this.roleName, roleChangeAccept.roleName) && AbstractC22676k.m65745e(this.requestedBy, roleChangeAccept.requestedBy);
        }

        public final String getRequestedBy() {
            return this.requestedBy;
        }

        public final String getRoleName() {
            return this.roleName;
        }

        public final String getToken() {
            return this.token;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.token.hashCode() * 31, 31, this.roleName);
            String str = this.requestedBy;
            return iM30450d + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("RoleChangeAccept(token=");
            sb4.append(this.token);
            sb4.append(", roleName=");
            sb4.append(this.roleName);
            sb4.append(", requestedBy=");
            return AbstractC25012a.m73377j(sb4, this.requestedBy, ')');
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$RoleChangeRequest;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "requested_for", "", "force", "", "roleName", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "getRequested_for", "()Ljava/lang/String;", "getForce", "()Z", "getRoleName", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class RoleChangeRequest extends HMSParams {

        @SerializedName("force")
        private final boolean force;

        @SerializedName("requested_for")
        private final String requested_for;

        @SerializedName("role")
        private final String roleName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RoleChangeRequest(String requested_for, boolean z4, String roleName) {
            super(null);
            AbstractC22676k.m65750j(requested_for, "requested_for");
            AbstractC22676k.m65750j(roleName, "roleName");
            this.requested_for = requested_for;
            this.force = z4;
            this.roleName = roleName;
        }

        public static /* synthetic */ RoleChangeRequest copy$default(RoleChangeRequest roleChangeRequest, String str, boolean z4, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = roleChangeRequest.requested_for;
            }
            if ((i13 & 2) != 0) {
                z4 = roleChangeRequest.force;
            }
            if ((i13 & 4) != 0) {
                str2 = roleChangeRequest.roleName;
            }
            return roleChangeRequest.copy(str, z4, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getRequested_for() {
            return this.requested_for;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getForce() {
            return this.force;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getRoleName() {
            return this.roleName;
        }

        public final RoleChangeRequest copy(String requested_for, boolean force, String roleName) {
            AbstractC22676k.m65750j(requested_for, "requested_for");
            AbstractC22676k.m65750j(roleName, "roleName");
            return new RoleChangeRequest(requested_for, force, roleName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RoleChangeRequest)) {
                return false;
            }
            RoleChangeRequest roleChangeRequest = (RoleChangeRequest) other;
            return AbstractC22676k.m65745e(this.requested_for, roleChangeRequest.requested_for) && this.force == roleChangeRequest.force && AbstractC22676k.m65745e(this.roleName, roleChangeRequest.roleName);
        }

        public final boolean getForce() {
            return this.force;
        }

        public final String getRequested_for() {
            return this.requested_for;
        }

        public final String getRoleName() {
            return this.roleName;
        }

        public int hashCode() {
            return this.roleName.hashCode() + AbstractC2875y.m8289b(this.requested_for.hashCode() * 31, 31, this.force);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("RoleChangeRequest(requested_for=");
            sb4.append(this.requested_for);
            sb4.append(", force=");
            sb4.append(this.force);
            sb4.append(", roleName=");
            return AbstractC25012a.m73377j(sb4, this.roleName, ')');
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStop;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "version", "", "<init>", "(Ljava/lang/String;)V", "getVersion", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class RtmpStop extends HMSParams {

        @SerializedName("version")
        private final String version;

        /* JADX WARN: Multi-variable type inference failed */
        public RtmpStop() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ RtmpStop copy$default(RtmpStop rtmpStop, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = rtmpStop.version;
            }
            return rtmpStop.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public final RtmpStop copy(String version) {
            AbstractC22676k.m65750j(version, "version");
            return new RtmpStop(version);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RtmpStop) && AbstractC22676k.m65745e(this.version, ((RtmpStop) other).version);
        }

        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            return this.version.hashCode();
        }

        public String toString() {
            return AbstractC25012a.m73377j(new StringBuilder("RtmpStop(version="), this.version, ')');
        }

        public /* synthetic */ RtmpStop(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "1.0" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RtmpStop(String version) {
            super(null);
            AbstractC22676k.m65750j(version, "version");
            this.version = version;
        }
    }

    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$SendBroadcast;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "info", "Llive/hms/video/sdk/models/HMSNotifications$BroadcastInfo;", "peerId", "", "roleNames", "", "<init>", "(Llive/hms/video/sdk/models/HMSNotifications$BroadcastInfo;Ljava/lang/String;Ljava/util/List;)V", "getInfo", "()Llive/hms/video/sdk/models/HMSNotifications$BroadcastInfo;", "getPeerId", "()Ljava/lang/String;", "getRoleNames", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class SendBroadcast extends HMSParams {

        @SerializedName("info")
        private final HMSNotifications.BroadcastInfo info;

        @SerializedName("peer_id")
        private final String peerId;

        @SerializedName("roles")
        private final List<String> roleNames;

        public /* synthetic */ SendBroadcast(HMSNotifications.BroadcastInfo broadcastInfo, String str, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(broadcastInfo, (i13 & 2) != 0 ? null : str, list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SendBroadcast copy$default(SendBroadcast sendBroadcast, HMSNotifications.BroadcastInfo broadcastInfo, String str, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                broadcastInfo = sendBroadcast.info;
            }
            if ((i13 & 2) != 0) {
                str = sendBroadcast.peerId;
            }
            if ((i13 & 4) != 0) {
                list = sendBroadcast.roleNames;
            }
            return sendBroadcast.copy(broadcastInfo, str, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final HMSNotifications.BroadcastInfo getInfo() {
            return this.info;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPeerId() {
            return this.peerId;
        }

        public final List<String> component3() {
            return this.roleNames;
        }

        public final SendBroadcast copy(HMSNotifications.BroadcastInfo info, String peerId, List<String> roleNames) {
            AbstractC22676k.m65750j(info, "info");
            AbstractC22676k.m65750j(roleNames, "roleNames");
            return new SendBroadcast(info, peerId, roleNames);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SendBroadcast)) {
                return false;
            }
            SendBroadcast sendBroadcast = (SendBroadcast) other;
            return AbstractC22676k.m65745e(this.info, sendBroadcast.info) && AbstractC22676k.m65745e(this.peerId, sendBroadcast.peerId) && AbstractC22676k.m65745e(this.roleNames, sendBroadcast.roleNames);
        }

        public final HMSNotifications.BroadcastInfo getInfo() {
            return this.info;
        }

        public final String getPeerId() {
            return this.peerId;
        }

        public final List<String> getRoleNames() {
            return this.roleNames;
        }

        public int hashCode() {
            int iHashCode = this.info.hashCode() * 31;
            String str = this.peerId;
            return this.roleNames.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("SendBroadcast(info=");
            sb4.append(this.info);
            sb4.append(", peerId=");
            sb4.append(this.peerId);
            sb4.append(", roleNames=");
            return AbstractC17176i.m48506h(sb4, this.roleNames, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendBroadcast(HMSNotifications.BroadcastInfo info, String str, List<String> roleNames) {
            super(null);
            AbstractC22676k.m65750j(info, "info");
            AbstractC22676k.m65750j(roleNames, "roleNames");
            this.info = info;
            this.peerId = str;
            this.roleNames = roleNames;
        }
    }

    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\"\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\bj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J*\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\bj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003JJ\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032$\b\u0002\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\bj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR4\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\bj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "description", "Llive/hms/video/connection/models/HMSSessionDescription;", "tracks", "Lkotlin/collections/HashMap;", "", "Llive/hms/video/sdk/models/HMSNotifications$Track;", "Ljava/util/HashMap;", "sfuNodeId", "<init>", "(Llive/hms/video/connection/models/HMSSessionDescription;Ljava/util/HashMap;Ljava/lang/String;)V", "getDescription", "()Llive/hms/video/connection/models/HMSSessionDescription;", "getTracks", "()Ljava/util/HashMap;", "Ljava/util/HashMap;", "getSfuNodeId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Llive/hms/video/connection/models/HMSSessionDescription;Ljava/util/HashMap;Ljava/lang/String;)Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class SendOffer extends HMSParams {

        @SerializedName("desc")
        private final HMSSessionDescription description;

        @SerializedName("sfu_node_id")
        private final String sfuNodeId;

        @SerializedName("tracks")
        private final HashMap<String, HMSNotifications.Track> tracks;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendOffer(HMSSessionDescription description, HashMap<String, HMSNotifications.Track> tracks, String str) {
            super(null);
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(tracks, "tracks");
            this.description = description;
            this.tracks = tracks;
            this.sfuNodeId = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SendOffer copy$default(SendOffer sendOffer, HMSSessionDescription hMSSessionDescription, HashMap map, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                hMSSessionDescription = sendOffer.description;
            }
            if ((i13 & 2) != 0) {
                map = sendOffer.tracks;
            }
            if ((i13 & 4) != 0) {
                str = sendOffer.sfuNodeId;
            }
            return sendOffer.copy(hMSSessionDescription, map, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final HMSSessionDescription getDescription() {
            return this.description;
        }

        public final HashMap<String, HMSNotifications.Track> component2() {
            return this.tracks;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getSfuNodeId() {
            return this.sfuNodeId;
        }

        public final SendOffer copy(HMSSessionDescription description, HashMap<String, HMSNotifications.Track> tracks, String sfuNodeId) {
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(tracks, "tracks");
            return new SendOffer(description, tracks, sfuNodeId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SendOffer)) {
                return false;
            }
            SendOffer sendOffer = (SendOffer) other;
            return AbstractC22676k.m65745e(this.description, sendOffer.description) && AbstractC22676k.m65745e(this.tracks, sendOffer.tracks) && AbstractC22676k.m65745e(this.sfuNodeId, sendOffer.sfuNodeId);
        }

        public final HMSSessionDescription getDescription() {
            return this.description;
        }

        public final String getSfuNodeId() {
            return this.sfuNodeId;
        }

        public final HashMap<String, HMSNotifications.Track> getTracks() {
            return this.tracks;
        }

        public int hashCode() {
            int iHashCode = (this.tracks.hashCode() + (this.description.hashCode() * 31)) * 31;
            String str = this.sfuNodeId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("SendOffer(description=");
            sb4.append(this.description);
            sb4.append(", tracks=");
            sb4.append(this.tracks);
            sb4.append(", sfuNodeId=");
            return AbstractC25012a.m73377j(sb4, this.sfuNodeId, ')');
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$SessionMetadataRequest;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "key", "", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getVersion", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class SessionMetadataRequest extends HMSParams {

        @SerializedName("key")
        private final String key;

        @SerializedName("version")
        private final String version;

        /* JADX WARN: Multi-variable type inference failed */
        public SessionMetadataRequest() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ SessionMetadataRequest copy$default(SessionMetadataRequest sessionMetadataRequest, String str, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = sessionMetadataRequest.key;
            }
            if ((i13 & 2) != 0) {
                str2 = sessionMetadataRequest.version;
            }
            return sessionMetadataRequest.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public final SessionMetadataRequest copy(String key, String version) {
            AbstractC22676k.m65750j(version, "version");
            return new SessionMetadataRequest(key, version);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SessionMetadataRequest)) {
                return false;
            }
            SessionMetadataRequest sessionMetadataRequest = (SessionMetadataRequest) other;
            return AbstractC22676k.m65745e(this.key, sessionMetadataRequest.key) && AbstractC22676k.m65745e(this.version, sessionMetadataRequest.version);
        }

        public final String getKey() {
            return this.key;
        }

        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            String str = this.key;
            return this.version.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("SessionMetadataRequest(key=");
            sb4.append(this.key);
            sb4.append(", version=");
            return AbstractC25012a.m73377j(sb4, this.version, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionMetadataRequest(String str, String version) {
            super(null);
            AbstractC22676k.m65750j(version, "version");
            this.key = str;
            this.version = version;
        }

        public /* synthetic */ SessionMetadataRequest(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? "1.1" : str2);
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$StartTranscription;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "mode", "Llive/hms/video/sdk/models/TranscriptionsMode;", "<init>", "(Llive/hms/video/sdk/models/TranscriptionsMode;)V", "getMode", "()Llive/hms/video/sdk/models/TranscriptionsMode;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class StartTranscription extends HMSParams {

        @SerializedName("mode")
        private final TranscriptionsMode mode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartTranscription(TranscriptionsMode mode) {
            super(null);
            AbstractC22676k.m65750j(mode, "mode");
            this.mode = mode;
        }

        public static /* synthetic */ StartTranscription copy$default(StartTranscription startTranscription, TranscriptionsMode transcriptionsMode, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                transcriptionsMode = startTranscription.mode;
            }
            return startTranscription.copy(transcriptionsMode);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final TranscriptionsMode getMode() {
            return this.mode;
        }

        public final StartTranscription copy(TranscriptionsMode mode) {
            AbstractC22676k.m65750j(mode, "mode");
            return new StartTranscription(mode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StartTranscription) && this.mode == ((StartTranscription) other).mode;
        }

        public final TranscriptionsMode getMode() {
            return this.mode;
        }

        public int hashCode() {
            return this.mode.hashCode();
        }

        public String toString() {
            return "StartTranscription(mode=" + this.mode + ')';
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$StopTranscription;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "mode", "Llive/hms/video/sdk/models/TranscriptionsMode;", "<init>", "(Llive/hms/video/sdk/models/TranscriptionsMode;)V", "getMode", "()Llive/hms/video/sdk/models/TranscriptionsMode;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class StopTranscription extends HMSParams {

        @SerializedName("mode")
        private final TranscriptionsMode mode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StopTranscription(TranscriptionsMode mode) {
            super(null);
            AbstractC22676k.m65750j(mode, "mode");
            this.mode = mode;
        }

        public static /* synthetic */ StopTranscription copy$default(StopTranscription stopTranscription, TranscriptionsMode transcriptionsMode, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                transcriptionsMode = stopTranscription.mode;
            }
            return stopTranscription.copy(transcriptionsMode);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final TranscriptionsMode getMode() {
            return this.mode;
        }

        public final StopTranscription copy(TranscriptionsMode mode) {
            AbstractC22676k.m65750j(mode, "mode");
            return new StopTranscription(mode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StopTranscription) && this.mode == ((StopTranscription) other).mode;
        }

        public final TranscriptionsMode getMode() {
            return this.mode;
        }

        public int hashCode() {
            return this.mode.hashCode();
        }

        public String toString() {
            return "StopTranscription(mode=" + this.mode + ')';
        }
    }

    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JI\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$TrackUpdateAllRequest;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "requestedForPeerId", "", "roles", "", "type", "Llive/hms/video/media/tracks/HMSTrackType;", "source", CommandDefaults.MUTE, "", "<init>", "(Ljava/lang/String;Ljava/util/List;Llive/hms/video/media/tracks/HMSTrackType;Ljava/lang/String;Z)V", "getRequestedForPeerId", "()Ljava/lang/String;", "getRoles", "()Ljava/util/List;", "getType", "()Llive/hms/video/media/tracks/HMSTrackType;", "getSource", "getMute", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class TrackUpdateAllRequest extends HMSParams {

        @SerializedName("value")
        private final boolean mute;

        @SerializedName("requested_for")
        private final String requestedForPeerId;

        @SerializedName("roles")
        private final List<String> roles;

        @SerializedName("source")
        private final String source;

        @SerializedName("type")
        private final HMSTrackType type;

        public TrackUpdateAllRequest(String str, List<String> list, HMSTrackType hMSTrackType, String str2, boolean z4) {
            super(null);
            this.requestedForPeerId = str;
            this.roles = list;
            this.type = hMSTrackType;
            this.source = str2;
            this.mute = z4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TrackUpdateAllRequest copy$default(TrackUpdateAllRequest trackUpdateAllRequest, String str, List list, HMSTrackType hMSTrackType, String str2, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = trackUpdateAllRequest.requestedForPeerId;
            }
            if ((i13 & 2) != 0) {
                list = trackUpdateAllRequest.roles;
            }
            if ((i13 & 4) != 0) {
                hMSTrackType = trackUpdateAllRequest.type;
            }
            if ((i13 & 8) != 0) {
                str2 = trackUpdateAllRequest.source;
            }
            if ((i13 & 16) != 0) {
                z4 = trackUpdateAllRequest.mute;
            }
            boolean z13 = z4;
            HMSTrackType hMSTrackType2 = hMSTrackType;
            return trackUpdateAllRequest.copy(str, list, hMSTrackType2, str2, z13);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getRequestedForPeerId() {
            return this.requestedForPeerId;
        }

        public final List<String> component2() {
            return this.roles;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final HMSTrackType getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getMute() {
            return this.mute;
        }

        public final TrackUpdateAllRequest copy(String requestedForPeerId, List<String> roles, HMSTrackType type, String source, boolean mute) {
            return new TrackUpdateAllRequest(requestedForPeerId, roles, type, source, mute);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrackUpdateAllRequest)) {
                return false;
            }
            TrackUpdateAllRequest trackUpdateAllRequest = (TrackUpdateAllRequest) other;
            return AbstractC22676k.m65745e(this.requestedForPeerId, trackUpdateAllRequest.requestedForPeerId) && AbstractC22676k.m65745e(this.roles, trackUpdateAllRequest.roles) && this.type == trackUpdateAllRequest.type && AbstractC22676k.m65745e(this.source, trackUpdateAllRequest.source) && this.mute == trackUpdateAllRequest.mute;
        }

        public final boolean getMute() {
            return this.mute;
        }

        public final String getRequestedForPeerId() {
            return this.requestedForPeerId;
        }

        public final List<String> getRoles() {
            return this.roles;
        }

        public final String getSource() {
            return this.source;
        }

        public final HMSTrackType getType() {
            return this.type;
        }

        public int hashCode() {
            String str = this.requestedForPeerId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<String> list = this.roles;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            HMSTrackType hMSTrackType = this.type;
            int iHashCode3 = (iHashCode2 + (hMSTrackType == null ? 0 : hMSTrackType.hashCode())) * 31;
            String str2 = this.source;
            return Boolean.hashCode(this.mute) + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("TrackUpdateAllRequest(requestedForPeerId=");
            sb4.append(this.requestedForPeerId);
            sb4.append(", roles=");
            sb4.append(this.roles);
            sb4.append(", type=");
            sb4.append(this.type);
            sb4.append(", source=");
            sb4.append(this.source);
            sb4.append(", mute=");
            return AbstractC2875y.m8305r(sb4, this.mute, ')');
        }
    }

    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$TrackUpdateRequest;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "peerId", "", "trackId", "streamId", CommandDefaults.MUTE, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getPeerId", "()Ljava/lang/String;", "getTrackId", "getStreamId", "getMute", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class TrackUpdateRequest extends HMSParams {

        @SerializedName(CommandDefaults.MUTE)
        private final boolean mute;

        @SerializedName("requested_for")
        private final String peerId;

        @SerializedName("stream_id")
        private final String streamId;

        @SerializedName("track_id")
        private final String trackId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackUpdateRequest(String peerId, String trackId, String streamId, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(peerId, "peerId");
            AbstractC22676k.m65750j(trackId, "trackId");
            AbstractC22676k.m65750j(streamId, "streamId");
            this.peerId = peerId;
            this.trackId = trackId;
            this.streamId = streamId;
            this.mute = z4;
        }

        public static /* synthetic */ TrackUpdateRequest copy$default(TrackUpdateRequest trackUpdateRequest, String str, String str2, String str3, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = trackUpdateRequest.peerId;
            }
            if ((i13 & 2) != 0) {
                str2 = trackUpdateRequest.trackId;
            }
            if ((i13 & 4) != 0) {
                str3 = trackUpdateRequest.streamId;
            }
            if ((i13 & 8) != 0) {
                z4 = trackUpdateRequest.mute;
            }
            return trackUpdateRequest.copy(str, str2, str3, z4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPeerId() {
            return this.peerId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTrackId() {
            return this.trackId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getStreamId() {
            return this.streamId;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getMute() {
            return this.mute;
        }

        public final TrackUpdateRequest copy(String peerId, String trackId, String streamId, boolean mute) {
            AbstractC22676k.m65750j(peerId, "peerId");
            AbstractC22676k.m65750j(trackId, "trackId");
            AbstractC22676k.m65750j(streamId, "streamId");
            return new TrackUpdateRequest(peerId, trackId, streamId, mute);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrackUpdateRequest)) {
                return false;
            }
            TrackUpdateRequest trackUpdateRequest = (TrackUpdateRequest) other;
            return AbstractC22676k.m65745e(this.peerId, trackUpdateRequest.peerId) && AbstractC22676k.m65745e(this.trackId, trackUpdateRequest.trackId) && AbstractC22676k.m65745e(this.streamId, trackUpdateRequest.streamId) && this.mute == trackUpdateRequest.mute;
        }

        public final boolean getMute() {
            return this.mute;
        }

        public final String getPeerId() {
            return this.peerId;
        }

        public final String getStreamId() {
            return this.streamId;
        }

        public final String getTrackId() {
            return this.trackId;
        }

        public int hashCode() {
            return Boolean.hashCode(this.mute) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.peerId.hashCode() * 31, 31, this.trackId), 31, this.streamId);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("TrackUpdateRequest(peerId=");
            sb4.append(this.peerId);
            sb4.append(", trackId=");
            sb4.append(this.trackId);
            sb4.append(", streamId=");
            sb4.append(this.streamId);
            sb4.append(", mute=");
            return AbstractC2875y.m8305r(sb4, this.mute, ')');
        }
    }

    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0080\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$Trickle;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "target", "", "candidate", "Llive/hms/video/connection/models/HMSIceCandidate;", "sfuNodeId", "", "<init>", "(ILlive/hms/video/connection/models/HMSIceCandidate;Ljava/lang/String;)V", "getTarget", "()I", "getCandidate", "()Llive/hms/video/connection/models/HMSIceCandidate;", "getSfuNodeId", "()Ljava/lang/String;", "toTrickle", "Llive/hms/video/connection/models/HMSTrickle;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class Trickle extends HMSParams {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @SerializedName("candidate")
        private final HMSIceCandidate candidate;

        @SerializedName("sfu_node_id")
        private final String sfuNodeId;

        @SerializedName("target")
        private final int target;

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$Trickle$Companion;", "", "<init>", "()V", "from", "Llive/hms/video/signal/jsonrpc/models/HMSParams$Trickle;", "src", "Llive/hms/video/connection/models/HMSTrickle;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Trickle from(HMSTrickle src) {
                AbstractC22676k.m65750j(src, "src");
                return new Trickle(src.getRole().getValue(), src.getCandidate(), src.getSfuNodeId());
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Trickle(int i13, HMSIceCandidate candidate, String str) {
            super(null);
            AbstractC22676k.m65750j(candidate, "candidate");
            this.target = i13;
            this.candidate = candidate;
            this.sfuNodeId = str;
        }

        public static /* synthetic */ Trickle copy$default(Trickle trickle, int i13, HMSIceCandidate hMSIceCandidate, String str, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i13 = trickle.target;
            }
            if ((i14 & 2) != 0) {
                hMSIceCandidate = trickle.candidate;
            }
            if ((i14 & 4) != 0) {
                str = trickle.sfuNodeId;
            }
            return trickle.copy(i13, hMSIceCandidate, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getTarget() {
            return this.target;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final HMSIceCandidate getCandidate() {
            return this.candidate;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getSfuNodeId() {
            return this.sfuNodeId;
        }

        public final Trickle copy(int target, HMSIceCandidate candidate, String sfuNodeId) {
            AbstractC22676k.m65750j(candidate, "candidate");
            return new Trickle(target, candidate, sfuNodeId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Trickle)) {
                return false;
            }
            Trickle trickle = (Trickle) other;
            return this.target == trickle.target && AbstractC22676k.m65745e(this.candidate, trickle.candidate) && AbstractC22676k.m65745e(this.sfuNodeId, trickle.sfuNodeId);
        }

        public final HMSIceCandidate getCandidate() {
            return this.candidate;
        }

        public final String getSfuNodeId() {
            return this.sfuNodeId;
        }

        public final int getTarget() {
            return this.target;
        }

        public int hashCode() {
            int iHashCode = (this.candidate.hashCode() + (Integer.hashCode(this.target) * 31)) * 31;
            String str = this.sfuNodeId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("Trickle(target=");
            sb4.append(this.target);
            sb4.append(", candidate=");
            sb4.append(this.candidate);
            sb4.append(", sfuNodeId=");
            return AbstractC25012a.m73377j(sb4, this.sfuNodeId, ')');
        }

        public final HMSTrickle toTrickle() {
            return new HMSTrickle(this.candidate, HMSConnectionRole.INSTANCE.from(this.target), this.sfuNodeId);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$Unsupported;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "<init>", "()V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class Unsupported extends HMSParams {
        public Unsupported() {
            super(null);
        }
    }

    public /* synthetic */ HMSParams(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012$\b\u0002\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0007j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006`\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J*\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0007j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006`\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u0015\u001a\u00020\tHÆ\u0003JH\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032$\b\u0002\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0007j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006`\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR4\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0007j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006`\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "name", "", "properties", "Lkotlin/collections/HashMap;", "", "Ljava/util/HashMap;", "timestamp", "", "<init>", "(Ljava/lang/String;Ljava/util/HashMap;J)V", "getName", "()Ljava/lang/String;", "getProperties", "()Ljava/util/HashMap;", "Ljava/util/HashMap;", "getTimestamp", "()J", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/util/HashMap;J)Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;", "equals", "", "other", "hashCode", "", "toString", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class Event extends HMSParams {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @SerializedName("name")
        private final String name;

        @SerializedName("info")
        private final HashMap<String, Object> properties;

        @SerializedName("timestamp")
        private final long timestamp;

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$Event$Companion;", "", "<init>", "()V", "from", "Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;", "src", "Llive/hms/video/events/AnalyticsEvent;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Event from(AnalyticsEvent src) {
                AbstractC22676k.m65750j(src, "src");
                return new Event(src.getName(), src.getProperties(), src.getTimestamp());
            }

            private Companion() {
            }
        }

        public /* synthetic */ Event(String str, HashMap map, long j7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? new HashMap() : map, j7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Event copy$default(Event event, String str, HashMap map, long j7, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = event.name;
            }
            if ((i13 & 2) != 0) {
                map = event.properties;
            }
            if ((i13 & 4) != 0) {
                j7 = event.timestamp;
            }
            return event.copy(str, map, j7);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final HashMap<String, Object> component2() {
            return this.properties;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        public final Event copy(String name, HashMap<String, Object> properties, long timestamp) {
            AbstractC22676k.m65750j(name, "name");
            AbstractC22676k.m65750j(properties, "properties");
            return new Event(name, properties, timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Event)) {
                return false;
            }
            Event event = (Event) other;
            return AbstractC22676k.m65745e(this.name, event.name) && AbstractC22676k.m65745e(this.properties, event.properties) && this.timestamp == event.timestamp;
        }

        public final String getName() {
            return this.name;
        }

        public final HashMap<String, Object> getProperties() {
            return this.properties;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return Long.hashCode(this.timestamp) + ((this.properties.hashCode() + (this.name.hashCode() * 31)) * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("Event(name=");
            sb4.append(this.name);
            sb4.append(", properties=");
            sb4.append(this.properties);
            sb4.append(", timestamp=");
            return AbstractC2875y.m8302o(sb4, this.timestamp, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Event(String name, HashMap<String, Object> properties, long j7) {
            super(null);
            AbstractC22676k.m65750j(name, "name");
            AbstractC22676k.m65750j(properties, "properties");
            this.name = name;
            this.properties = properties;
            this.timestamp = j7;
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$GroupAdd;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "groupName", "", "peerId", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGroupName", "()Ljava/lang/String;", "getPeerId", "getVersion", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class GroupAdd extends HMSParams {

        @SerializedName("name")
        private final String groupName;

        @SerializedName("peer_id")
        private final String peerId;

        @SerializedName("version")
        private final String version;

        public /* synthetic */ GroupAdd(String str, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i13 & 4) != 0 ? "1.0" : str3);
        }

        public static /* synthetic */ GroupAdd copy$default(GroupAdd groupAdd, String str, String str2, String str3, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = groupAdd.groupName;
            }
            if ((i13 & 2) != 0) {
                str2 = groupAdd.peerId;
            }
            if ((i13 & 4) != 0) {
                str3 = groupAdd.version;
            }
            return groupAdd.copy(str, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getGroupName() {
            return this.groupName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPeerId() {
            return this.peerId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public final GroupAdd copy(String groupName, String peerId, String version) {
            AbstractC22676k.m65750j(groupName, "groupName");
            AbstractC22676k.m65750j(peerId, "peerId");
            AbstractC22676k.m65750j(version, "version");
            return new GroupAdd(groupName, peerId, version);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GroupAdd)) {
                return false;
            }
            GroupAdd groupAdd = (GroupAdd) other;
            return AbstractC22676k.m65745e(this.groupName, groupAdd.groupName) && AbstractC22676k.m65745e(this.peerId, groupAdd.peerId) && AbstractC22676k.m65745e(this.version, groupAdd.version);
        }

        public final String getGroupName() {
            return this.groupName;
        }

        public final String getPeerId() {
            return this.peerId;
        }

        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            return this.version.hashCode() + AbstractC11266d.m30450d(this.groupName.hashCode() * 31, 31, this.peerId);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("GroupAdd(groupName=");
            sb4.append(this.groupName);
            sb4.append(", peerId=");
            sb4.append(this.peerId);
            sb4.append(", version=");
            return AbstractC25012a.m73377j(sb4, this.version, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GroupAdd(String groupName, String peerId, String version) {
            super(null);
            AbstractC22676k.m65750j(groupName, "groupName");
            AbstractC22676k.m65750j(peerId, "peerId");
            AbstractC22676k.m65750j(version, "version");
            this.groupName = groupName;
            this.peerId = peerId;
            this.version = version;
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$GroupLeave;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "groupName", "", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getGroupName", "()Ljava/lang/String;", "getVersion", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class GroupLeave extends HMSParams {

        @SerializedName("name")
        private final String groupName;

        @SerializedName("version")
        private final String version;

        public /* synthetic */ GroupLeave(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? "1.0" : str2);
        }

        public static /* synthetic */ GroupLeave copy$default(GroupLeave groupLeave, String str, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = groupLeave.groupName;
            }
            if ((i13 & 2) != 0) {
                str2 = groupLeave.version;
            }
            return groupLeave.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getGroupName() {
            return this.groupName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public final GroupLeave copy(String groupName, String version) {
            AbstractC22676k.m65750j(groupName, "groupName");
            AbstractC22676k.m65750j(version, "version");
            return new GroupLeave(groupName, version);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GroupLeave)) {
                return false;
            }
            GroupLeave groupLeave = (GroupLeave) other;
            return AbstractC22676k.m65745e(this.groupName, groupLeave.groupName) && AbstractC22676k.m65745e(this.version, groupLeave.version);
        }

        public final String getGroupName() {
            return this.groupName;
        }

        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            return this.version.hashCode() + (this.groupName.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("GroupLeave(groupName=");
            sb4.append(this.groupName);
            sb4.append(", version=");
            return AbstractC25012a.m73377j(sb4, this.version, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GroupLeave(String groupName, String version) {
            super(null);
            AbstractC22676k.m65750j(groupName, "groupName");
            AbstractC22676k.m65750j(version, "version");
            this.groupName = groupName;
            this.version = version;
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$GroupRemove;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "groupName", "", "peerId", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGroupName", "()Ljava/lang/String;", "getPeerId", "getVersion", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class GroupRemove extends HMSParams {

        @SerializedName("name")
        private final String groupName;

        @SerializedName("peer_id")
        private final String peerId;

        @SerializedName("version")
        private final String version;

        public /* synthetic */ GroupRemove(String str, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i13 & 4) != 0 ? "1.0" : str3);
        }

        public static /* synthetic */ GroupRemove copy$default(GroupRemove groupRemove, String str, String str2, String str3, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = groupRemove.groupName;
            }
            if ((i13 & 2) != 0) {
                str2 = groupRemove.peerId;
            }
            if ((i13 & 4) != 0) {
                str3 = groupRemove.version;
            }
            return groupRemove.copy(str, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getGroupName() {
            return this.groupName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPeerId() {
            return this.peerId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public final GroupRemove copy(String groupName, String peerId, String version) {
            AbstractC22676k.m65750j(groupName, "groupName");
            AbstractC22676k.m65750j(peerId, "peerId");
            AbstractC22676k.m65750j(version, "version");
            return new GroupRemove(groupName, peerId, version);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GroupRemove)) {
                return false;
            }
            GroupRemove groupRemove = (GroupRemove) other;
            return AbstractC22676k.m65745e(this.groupName, groupRemove.groupName) && AbstractC22676k.m65745e(this.peerId, groupRemove.peerId) && AbstractC22676k.m65745e(this.version, groupRemove.version);
        }

        public final String getGroupName() {
            return this.groupName;
        }

        public final String getPeerId() {
            return this.peerId;
        }

        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            return this.version.hashCode() + AbstractC11266d.m30450d(this.groupName.hashCode() * 31, 31, this.peerId);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("GroupRemove(groupName=");
            sb4.append(this.groupName);
            sb4.append(", peerId=");
            sb4.append(this.peerId);
            sb4.append(", version=");
            return AbstractC25012a.m73377j(sb4, this.version, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GroupRemove(String groupName, String peerId, String version) {
            super(null);
            AbstractC22676k.m65750j(groupName, "groupName");
            AbstractC22676k.m65750j(peerId, "peerId");
            AbstractC22676k.m65750j(version, "version");
            this.groupName = groupName;
            this.peerId = peerId;
            this.version = version;
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$ListenMetadataChangeRequest;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "keys", "", "", "version", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getKeys", "()Ljava/util/List;", "getVersion", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class ListenMetadataChangeRequest extends HMSParams {

        @SerializedName("keys")
        private final List<String> keys;

        @SerializedName("version")
        private final String version;

        public /* synthetic */ ListenMetadataChangeRequest(List list, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i13 & 2) != 0 ? "1.1" : str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ListenMetadataChangeRequest copy$default(ListenMetadataChangeRequest listenMetadataChangeRequest, List list, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                list = listenMetadataChangeRequest.keys;
            }
            if ((i13 & 2) != 0) {
                str = listenMetadataChangeRequest.version;
            }
            return listenMetadataChangeRequest.copy(list, str);
        }

        public final List<String> component1() {
            return this.keys;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public final ListenMetadataChangeRequest copy(List<String> keys, String version) {
            AbstractC22676k.m65750j(keys, "keys");
            AbstractC22676k.m65750j(version, "version");
            return new ListenMetadataChangeRequest(keys, version);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ListenMetadataChangeRequest)) {
                return false;
            }
            ListenMetadataChangeRequest listenMetadataChangeRequest = (ListenMetadataChangeRequest) other;
            return AbstractC22676k.m65745e(this.keys, listenMetadataChangeRequest.keys) && AbstractC22676k.m65745e(this.version, listenMetadataChangeRequest.version);
        }

        public final List<String> getKeys() {
            return this.keys;
        }

        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            return this.version.hashCode() + (this.keys.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("ListenMetadataChangeRequest(keys=");
            sb4.append(this.keys);
            sb4.append(", version=");
            return AbstractC25012a.m73377j(sb4, this.version, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ListenMetadataChangeRequest(List<String> keys, String version) {
            super(null);
            AbstractC22676k.m65750j(keys, "keys");
            AbstractC22676k.m65750j(version, "version");
            this.keys = keys;
            this.version = version;
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$PeerMetadataUpdate;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "name", "", "data", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getData", "getVersion", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class PeerMetadataUpdate extends HMSParams {

        @SerializedName("data")
        private final String data;

        @SerializedName("name")
        private final String name;

        @SerializedName("version")
        private final String version;

        public /* synthetic */ PeerMetadataUpdate(String str, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i13 & 4) != 0 ? "1.0" : str3);
        }

        public static /* synthetic */ PeerMetadataUpdate copy$default(PeerMetadataUpdate peerMetadataUpdate, String str, String str2, String str3, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = peerMetadataUpdate.name;
            }
            if ((i13 & 2) != 0) {
                str2 = peerMetadataUpdate.data;
            }
            if ((i13 & 4) != 0) {
                str3 = peerMetadataUpdate.version;
            }
            return peerMetadataUpdate.copy(str, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public final PeerMetadataUpdate copy(String name, String data, String version) {
            AbstractC22676k.m65750j(version, "version");
            return new PeerMetadataUpdate(name, data, version);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PeerMetadataUpdate)) {
                return false;
            }
            PeerMetadataUpdate peerMetadataUpdate = (PeerMetadataUpdate) other;
            return AbstractC22676k.m65745e(this.name, peerMetadataUpdate.name) && AbstractC22676k.m65745e(this.data, peerMetadataUpdate.data) && AbstractC22676k.m65745e(this.version, peerMetadataUpdate.version);
        }

        public final String getData() {
            return this.data;
        }

        public final String getName() {
            return this.name;
        }

        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            String str = this.name;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.data;
            return this.version.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("PeerMetadataUpdate(name=");
            sb4.append(this.name);
            sb4.append(", data=");
            sb4.append(this.data);
            sb4.append(", version=");
            return AbstractC25012a.m73377j(sb4, this.version, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PeerMetadataUpdate(String str, String str2, String version) {
            super(null);
            AbstractC22676k.m65750j(version, "version");
            this.name = str;
            this.data = str2;
            this.version = version;
        }
    }

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JL\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000e¨\u0006&"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$PollLeaderboardQuery;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "pollId", "", "question", "", "count", "startIndex", "includeCurrentPeer", "", "version", "<init>", "(Ljava/lang/String;Ljava/lang/Long;JJZLjava/lang/String;)V", "getPollId", "()Ljava/lang/String;", "getQuestion", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCount", "()J", "getStartIndex", "getIncludeCurrentPeer", "()Z", "getVersion", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Long;JJZLjava/lang/String;)Llive/hms/video/signal/jsonrpc/models/HMSParams$PollLeaderboardQuery;", "equals", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class PollLeaderboardQuery extends HMSParams {

        @SerializedName("count")
        private final long count;

        @SerializedName("includeCurrentPeer")
        private final boolean includeCurrentPeer;

        @SerializedName("poll_id")
        private final String pollId;

        @SerializedName("question")
        private final Long question;

        @SerializedName("position")
        private final long startIndex;

        @SerializedName("version")
        private final String version;

        public /* synthetic */ PollLeaderboardQuery(String str, Long l7, long j7, long j13, boolean z4, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? null : l7, j7, j13, z4, (i13 & 32) != 0 ? "1.0" : str2);
        }

        public static /* synthetic */ PollLeaderboardQuery copy$default(PollLeaderboardQuery pollLeaderboardQuery, String str, Long l7, long j7, long j13, boolean z4, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = pollLeaderboardQuery.pollId;
            }
            if ((i13 & 2) != 0) {
                l7 = pollLeaderboardQuery.question;
            }
            if ((i13 & 4) != 0) {
                j7 = pollLeaderboardQuery.count;
            }
            if ((i13 & 8) != 0) {
                j13 = pollLeaderboardQuery.startIndex;
            }
            if ((i13 & 16) != 0) {
                z4 = pollLeaderboardQuery.includeCurrentPeer;
            }
            if ((i13 & 32) != 0) {
                str2 = pollLeaderboardQuery.version;
            }
            long j14 = j13;
            long j15 = j7;
            return pollLeaderboardQuery.copy(str, l7, j15, j14, z4, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPollId() {
            return this.pollId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getQuestion() {
            return this.question;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getCount() {
            return this.count;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getStartIndex() {
            return this.startIndex;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getIncludeCurrentPeer() {
            return this.includeCurrentPeer;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public final PollLeaderboardQuery copy(String pollId, Long question, long count, long startIndex, boolean includeCurrentPeer, String version) {
            AbstractC22676k.m65750j(pollId, "pollId");
            AbstractC22676k.m65750j(version, "version");
            return new PollLeaderboardQuery(pollId, question, count, startIndex, includeCurrentPeer, version);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PollLeaderboardQuery)) {
                return false;
            }
            PollLeaderboardQuery pollLeaderboardQuery = (PollLeaderboardQuery) other;
            return AbstractC22676k.m65745e(this.pollId, pollLeaderboardQuery.pollId) && AbstractC22676k.m65745e(this.question, pollLeaderboardQuery.question) && this.count == pollLeaderboardQuery.count && this.startIndex == pollLeaderboardQuery.startIndex && this.includeCurrentPeer == pollLeaderboardQuery.includeCurrentPeer && AbstractC22676k.m65745e(this.version, pollLeaderboardQuery.version);
        }

        public final long getCount() {
            return this.count;
        }

        public final boolean getIncludeCurrentPeer() {
            return this.includeCurrentPeer;
        }

        public final String getPollId() {
            return this.pollId;
        }

        public final Long getQuestion() {
            return this.question;
        }

        public final long getStartIndex() {
            return this.startIndex;
        }

        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            int iHashCode = this.pollId.hashCode() * 31;
            Long l7 = this.question;
            return this.version.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30451e(AbstractC11266d.m30451e((iHashCode + (l7 == null ? 0 : l7.hashCode())) * 31, this.count, 31), this.startIndex, 31), 31, this.includeCurrentPeer);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("PollLeaderboardQuery(pollId=");
            sb4.append(this.pollId);
            sb4.append(", question=");
            sb4.append(this.question);
            sb4.append(", count=");
            sb4.append(this.count);
            sb4.append(", startIndex=");
            sb4.append(this.startIndex);
            sb4.append(", includeCurrentPeer=");
            sb4.append(this.includeCurrentPeer);
            sb4.append(", version=");
            return AbstractC25012a.m73377j(sb4, this.version, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PollLeaderboardQuery(String pollId, Long l7, long j7, long j13, boolean z4, String version) {
            super(null);
            AbstractC22676k.m65750j(pollId, "pollId");
            AbstractC22676k.m65750j(version, "version");
            this.pollId = pollId;
            this.question = l7;
            this.count = j7;
            this.startIndex = j13;
            this.includeCurrentPeer = z4;
            this.version = version;
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsGet;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "pollId", "", "fromIndex", "", "numQuestionsToGet", "version", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getPollId", "()Ljava/lang/String;", "getFromIndex", "()I", "getNumQuestionsToGet", "getVersion", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class PollQuestionsGet extends HMSParams {

        @SerializedName("index")
        private final int fromIndex;

        @SerializedName("count")
        private final int numQuestionsToGet;

        @SerializedName("poll_id")
        private final String pollId;

        @SerializedName("version")
        private final String version;

        public /* synthetic */ PollQuestionsGet(String str, int i13, int i14, String str2, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i15 & 2) != 0 ? 0 : i13, (i15 & 4) != 0 ? 50 : i14, (i15 & 8) != 0 ? "1.0" : str2);
        }

        public static /* synthetic */ PollQuestionsGet copy$default(PollQuestionsGet pollQuestionsGet, String str, int i13, int i14, String str2, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                str = pollQuestionsGet.pollId;
            }
            if ((i15 & 2) != 0) {
                i13 = pollQuestionsGet.fromIndex;
            }
            if ((i15 & 4) != 0) {
                i14 = pollQuestionsGet.numQuestionsToGet;
            }
            if ((i15 & 8) != 0) {
                str2 = pollQuestionsGet.version;
            }
            return pollQuestionsGet.copy(str, i13, i14, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPollId() {
            return this.pollId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getFromIndex() {
            return this.fromIndex;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getNumQuestionsToGet() {
            return this.numQuestionsToGet;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public final PollQuestionsGet copy(String pollId, int fromIndex, int numQuestionsToGet, String version) {
            AbstractC22676k.m65750j(pollId, "pollId");
            AbstractC22676k.m65750j(version, "version");
            return new PollQuestionsGet(pollId, fromIndex, numQuestionsToGet, version);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PollQuestionsGet)) {
                return false;
            }
            PollQuestionsGet pollQuestionsGet = (PollQuestionsGet) other;
            return AbstractC22676k.m65745e(this.pollId, pollQuestionsGet.pollId) && this.fromIndex == pollQuestionsGet.fromIndex && this.numQuestionsToGet == pollQuestionsGet.numQuestionsToGet && AbstractC22676k.m65745e(this.version, pollQuestionsGet.version);
        }

        public final int getFromIndex() {
            return this.fromIndex;
        }

        public final int getNumQuestionsToGet() {
            return this.numQuestionsToGet;
        }

        public final String getPollId() {
            return this.pollId;
        }

        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            return this.version.hashCode() + AbstractC11266d.m30448b(this.numQuestionsToGet, AbstractC11266d.m30448b(this.fromIndex, this.pollId.hashCode() * 31, 31), 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("PollQuestionsGet(pollId=");
            sb4.append(this.pollId);
            sb4.append(", fromIndex=");
            sb4.append(this.fromIndex);
            sb4.append(", numQuestionsToGet=");
            sb4.append(this.numQuestionsToGet);
            sb4.append(", version=");
            return AbstractC25012a.m73377j(sb4, this.version, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PollQuestionsGet(String pollId, int i13, int i14, String version) {
            super(null);
            AbstractC22676k.m65750j(pollId, "pollId");
            AbstractC22676k.m65750j(version, "version");
            this.pollId = pollId;
            this.fromIndex = i13;
            this.numQuestionsToGet = i14;
            this.version = version;
        }
    }

    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000e\u0010\u0011\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0012J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001b"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsSet;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "pollId", "", "questions", "", "Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;", "version", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getPollId", "()Ljava/lang/String;", "getQuestions", "()Ljava/util/List;", "getVersion$lib_release", "component1", "component2", "component3", "component3$lib_release", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class PollQuestionsSet extends HMSParams {

        @SerializedName("poll_id")
        private final String pollId;

        @SerializedName("questions")
        private final List<HmsPollQuestionSettingContainer> questions;

        @SerializedName("version")
        private final String version;

        public /* synthetic */ PollQuestionsSet(String str, List list, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, list, (i13 & 4) != 0 ? "1.0" : str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PollQuestionsSet copy$default(PollQuestionsSet pollQuestionsSet, String str, List list, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = pollQuestionsSet.pollId;
            }
            if ((i13 & 2) != 0) {
                list = pollQuestionsSet.questions;
            }
            if ((i13 & 4) != 0) {
                str2 = pollQuestionsSet.version;
            }
            return pollQuestionsSet.copy(str, list, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPollId() {
            return this.pollId;
        }

        public final List<HmsPollQuestionSettingContainer> component2() {
            return this.questions;
        }

        /* JADX INFO: renamed from: component3$lib_release, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public final PollQuestionsSet copy(String pollId, List<HmsPollQuestionSettingContainer> questions, String version) {
            AbstractC22676k.m65750j(pollId, "pollId");
            AbstractC22676k.m65750j(questions, "questions");
            AbstractC22676k.m65750j(version, "version");
            return new PollQuestionsSet(pollId, questions, version);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PollQuestionsSet)) {
                return false;
            }
            PollQuestionsSet pollQuestionsSet = (PollQuestionsSet) other;
            return AbstractC22676k.m65745e(this.pollId, pollQuestionsSet.pollId) && AbstractC22676k.m65745e(this.questions, pollQuestionsSet.questions) && AbstractC22676k.m65745e(this.version, pollQuestionsSet.version);
        }

        public final String getPollId() {
            return this.pollId;
        }

        public final List<HmsPollQuestionSettingContainer> getQuestions() {
            return this.questions;
        }

        public final String getVersion$lib_release() {
            return this.version;
        }

        public int hashCode() {
            return this.version.hashCode() + AbstractC11895b.m31983b(this.pollId.hashCode() * 31, 31, this.questions);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("PollQuestionsSet(pollId=");
            sb4.append(this.pollId);
            sb4.append(", questions=");
            sb4.append(this.questions);
            sb4.append(", version=");
            return AbstractC25012a.m73377j(sb4, this.version, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PollQuestionsSet(String pollId, List<HmsPollQuestionSettingContainer> questions, String version) {
            super(null);
            AbstractC22676k.m65750j(pollId, "pollId");
            AbstractC22676k.m65750j(questions, "questions");
            AbstractC22676k.m65750j(version, "version");
            this.pollId = pollId;
            this.questions = questions;
            this.version = version;
        }
    }

    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001a"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponseSet;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "pollId", "", "responses", "", "Llive/hms/video/polls/models/answer/HmsPollAnswer;", "version", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getPollId", "()Ljava/lang/String;", "getResponses", "()Ljava/util/List;", "getVersion", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class PollResponseSet extends HMSParams {

        @SerializedName("poll_id")
        private final String pollId;

        @SerializedName("responses")
        private final List<HmsPollAnswer> responses;

        @SerializedName("version")
        private final String version;

        public /* synthetic */ PollResponseSet(String str, List list, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, list, (i13 & 4) != 0 ? "1.0" : str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PollResponseSet copy$default(PollResponseSet pollResponseSet, String str, List list, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = pollResponseSet.pollId;
            }
            if ((i13 & 2) != 0) {
                list = pollResponseSet.responses;
            }
            if ((i13 & 4) != 0) {
                str2 = pollResponseSet.version;
            }
            return pollResponseSet.copy(str, list, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPollId() {
            return this.pollId;
        }

        public final List<HmsPollAnswer> component2() {
            return this.responses;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public final PollResponseSet copy(String pollId, List<HmsPollAnswer> responses, String version) {
            AbstractC22676k.m65750j(pollId, "pollId");
            AbstractC22676k.m65750j(responses, "responses");
            AbstractC22676k.m65750j(version, "version");
            return new PollResponseSet(pollId, responses, version);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PollResponseSet)) {
                return false;
            }
            PollResponseSet pollResponseSet = (PollResponseSet) other;
            return AbstractC22676k.m65745e(this.pollId, pollResponseSet.pollId) && AbstractC22676k.m65745e(this.responses, pollResponseSet.responses) && AbstractC22676k.m65745e(this.version, pollResponseSet.version);
        }

        public final String getPollId() {
            return this.pollId;
        }

        public final List<HmsPollAnswer> getResponses() {
            return this.responses;
        }

        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            return this.version.hashCode() + AbstractC11895b.m31983b(this.pollId.hashCode() * 31, 31, this.responses);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("PollResponseSet(pollId=");
            sb4.append(this.pollId);
            sb4.append(", responses=");
            sb4.append(this.responses);
            sb4.append(", version=");
            return AbstractC25012a.m73377j(sb4, this.version, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PollResponseSet(String pollId, List<HmsPollAnswer> responses, String version) {
            super(null);
            AbstractC22676k.m65750j(pollId, "pollId");
            AbstractC22676k.m65750j(responses, "responses");
            AbstractC22676k.m65750j(version, "version");
            this.pollId = pollId;
            this.responses = responses;
            this.version = version;
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\u001f"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "pollId", "", "onlyOwnResponses", "", "fromIndex", "", "numResponses", "version", "<init>", "(Ljava/lang/String;ZIILjava/lang/String;)V", "getPollId", "()Ljava/lang/String;", "getOnlyOwnResponses", "()Z", "getFromIndex", "()I", "getNumResponses", "getVersion", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class PollResponsesQuery extends HMSParams {

        @SerializedName("index")
        private final int fromIndex;

        @SerializedName("count")
        private final int numResponses;

        @SerializedName(ProfileAnalyticsKt.SELF)
        private final boolean onlyOwnResponses;

        @SerializedName("poll_id")
        private final String pollId;

        @SerializedName("version")
        private final String version;

        public /* synthetic */ PollResponsesQuery(String str, boolean z4, int i13, int i14, String str2, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z4, i13, i14, (i15 & 16) != 0 ? "1.0" : str2);
        }

        public static /* synthetic */ PollResponsesQuery copy$default(PollResponsesQuery pollResponsesQuery, String str, boolean z4, int i13, int i14, String str2, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                str = pollResponsesQuery.pollId;
            }
            if ((i15 & 2) != 0) {
                z4 = pollResponsesQuery.onlyOwnResponses;
            }
            if ((i15 & 4) != 0) {
                i13 = pollResponsesQuery.fromIndex;
            }
            if ((i15 & 8) != 0) {
                i14 = pollResponsesQuery.numResponses;
            }
            if ((i15 & 16) != 0) {
                str2 = pollResponsesQuery.version;
            }
            String str3 = str2;
            int i16 = i13;
            return pollResponsesQuery.copy(str, z4, i16, i14, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPollId() {
            return this.pollId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getOnlyOwnResponses() {
            return this.onlyOwnResponses;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getFromIndex() {
            return this.fromIndex;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getNumResponses() {
            return this.numResponses;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public final PollResponsesQuery copy(String pollId, boolean onlyOwnResponses, int fromIndex, int numResponses, String version) {
            AbstractC22676k.m65750j(pollId, "pollId");
            AbstractC22676k.m65750j(version, "version");
            return new PollResponsesQuery(pollId, onlyOwnResponses, fromIndex, numResponses, version);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PollResponsesQuery)) {
                return false;
            }
            PollResponsesQuery pollResponsesQuery = (PollResponsesQuery) other;
            return AbstractC22676k.m65745e(this.pollId, pollResponsesQuery.pollId) && this.onlyOwnResponses == pollResponsesQuery.onlyOwnResponses && this.fromIndex == pollResponsesQuery.fromIndex && this.numResponses == pollResponsesQuery.numResponses && AbstractC22676k.m65745e(this.version, pollResponsesQuery.version);
        }

        public final int getFromIndex() {
            return this.fromIndex;
        }

        public final int getNumResponses() {
            return this.numResponses;
        }

        public final boolean getOnlyOwnResponses() {
            return this.onlyOwnResponses;
        }

        public final String getPollId() {
            return this.pollId;
        }

        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            return this.version.hashCode() + AbstractC11266d.m30448b(this.numResponses, AbstractC11266d.m30448b(this.fromIndex, AbstractC2875y.m8289b(this.pollId.hashCode() * 31, 31, this.onlyOwnResponses), 31), 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("PollResponsesQuery(pollId=");
            sb4.append(this.pollId);
            sb4.append(", onlyOwnResponses=");
            sb4.append(this.onlyOwnResponses);
            sb4.append(", fromIndex=");
            sb4.append(this.fromIndex);
            sb4.append(", numResponses=");
            sb4.append(this.numResponses);
            sb4.append(", version=");
            return AbstractC25012a.m73377j(sb4, this.version, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PollResponsesQuery(String pollId, boolean z4, int i13, int i14, String version) {
            super(null);
            AbstractC22676k.m65750j(pollId, "pollId");
            AbstractC22676k.m65750j(version, "version");
            this.pollId = pollId;
            this.onlyOwnResponses = z4;
            this.fromIndex = i13;
            this.numResponses = i14;
            this.version = version;
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResultsQuery;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "pollId", "", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPollId", "()Ljava/lang/String;", "getVersion", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class PollResultsQuery extends HMSParams {

        @SerializedName("poll_id")
        private final String pollId;

        @SerializedName("version")
        private final String version;

        public /* synthetic */ PollResultsQuery(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? "1.0" : str2);
        }

        public static /* synthetic */ PollResultsQuery copy$default(PollResultsQuery pollResultsQuery, String str, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = pollResultsQuery.pollId;
            }
            if ((i13 & 2) != 0) {
                str2 = pollResultsQuery.version;
            }
            return pollResultsQuery.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPollId() {
            return this.pollId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public final PollResultsQuery copy(String pollId, String version) {
            AbstractC22676k.m65750j(pollId, "pollId");
            AbstractC22676k.m65750j(version, "version");
            return new PollResultsQuery(pollId, version);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PollResultsQuery)) {
                return false;
            }
            PollResultsQuery pollResultsQuery = (PollResultsQuery) other;
            return AbstractC22676k.m65745e(this.pollId, pollResultsQuery.pollId) && AbstractC22676k.m65745e(this.version, pollResultsQuery.version);
        }

        public final String getPollId() {
            return this.pollId;
        }

        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            return this.version.hashCode() + (this.pollId.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("PollResultsQuery(pollId=");
            sb4.append(this.pollId);
            sb4.append(", version=");
            return AbstractC25012a.m73377j(sb4, this.version, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PollResultsQuery(String pollId, String version) {
            super(null);
            AbstractC22676k.m65750j(pollId, "pollId");
            AbstractC22676k.m65750j(version, "version");
            this.pollId = pollId;
            this.version = version;
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$PollStartRequest;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "pollId", "", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPollId", "()Ljava/lang/String;", "getVersion", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class PollStartRequest extends HMSParams {

        @SerializedName("poll_id")
        private final String pollId;

        @SerializedName("version")
        private final String version;

        public /* synthetic */ PollStartRequest(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? "1.0" : str2);
        }

        public static /* synthetic */ PollStartRequest copy$default(PollStartRequest pollStartRequest, String str, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = pollStartRequest.pollId;
            }
            if ((i13 & 2) != 0) {
                str2 = pollStartRequest.version;
            }
            return pollStartRequest.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPollId() {
            return this.pollId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public final PollStartRequest copy(String pollId, String version) {
            AbstractC22676k.m65750j(pollId, "pollId");
            AbstractC22676k.m65750j(version, "version");
            return new PollStartRequest(pollId, version);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PollStartRequest)) {
                return false;
            }
            PollStartRequest pollStartRequest = (PollStartRequest) other;
            return AbstractC22676k.m65745e(this.pollId, pollStartRequest.pollId) && AbstractC22676k.m65745e(this.version, pollStartRequest.version);
        }

        public final String getPollId() {
            return this.pollId;
        }

        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            return this.version.hashCode() + (this.pollId.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("PollStartRequest(pollId=");
            sb4.append(this.pollId);
            sb4.append(", version=");
            return AbstractC25012a.m73377j(sb4, this.version, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PollStartRequest(String pollId, String version) {
            super(null);
            AbstractC22676k.m65750j(pollId, "pollId");
            AbstractC22676k.m65750j(version, "version");
            this.pollId = pollId;
            this.version = version;
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$PollStopRequest;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "pollId", "", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPollId", "()Ljava/lang/String;", "getVersion", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class PollStopRequest extends HMSParams {

        @SerializedName("poll_id")
        private final String pollId;

        @SerializedName("version")
        private final String version;

        public /* synthetic */ PollStopRequest(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? "1.0" : str2);
        }

        public static /* synthetic */ PollStopRequest copy$default(PollStopRequest pollStopRequest, String str, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = pollStopRequest.pollId;
            }
            if ((i13 & 2) != 0) {
                str2 = pollStopRequest.version;
            }
            return pollStopRequest.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPollId() {
            return this.pollId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public final PollStopRequest copy(String pollId, String version) {
            AbstractC22676k.m65750j(pollId, "pollId");
            AbstractC22676k.m65750j(version, "version");
            return new PollStopRequest(pollId, version);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PollStopRequest)) {
                return false;
            }
            PollStopRequest pollStopRequest = (PollStopRequest) other;
            return AbstractC22676k.m65745e(this.pollId, pollStopRequest.pollId) && AbstractC22676k.m65745e(this.version, pollStopRequest.version);
        }

        public final String getPollId() {
            return this.pollId;
        }

        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            return this.version.hashCode() + (this.pollId.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("PollStopRequest(pollId=");
            sb4.append(this.pollId);
            sb4.append(", version=");
            return AbstractC25012a.m73377j(sb4, this.version, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PollStopRequest(String pollId, String version) {
            super(null);
            AbstractC22676k.m65750j(pollId, "pollId");
            AbstractC22676k.m65750j(version, "version");
            this.pollId = pollId;
            this.version = version;
        }
    }

    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\""}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "meetingUrl", "", "rtmpUrls", "", "record", "", "resolution", "Llive/hms/video/media/settings/HMSRtmpVideoResolution;", "version", "<init>", "(Ljava/lang/String;Ljava/util/List;ZLlive/hms/video/media/settings/HMSRtmpVideoResolution;Ljava/lang/String;)V", "getMeetingUrl", "()Ljava/lang/String;", "getRtmpUrls", "()Ljava/util/List;", "getRecord", "()Z", "getResolution", "()Llive/hms/video/media/settings/HMSRtmpVideoResolution;", "getVersion", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class RtmpStart extends HMSParams {

        @SerializedName("meeting_url")
        private final String meetingUrl;

        @SerializedName("record")
        private final boolean record;

        @SerializedName("resolution")
        private final HMSRtmpVideoResolution resolution;

        @SerializedName("rtmp_urls")
        private final List<String> rtmpUrls;

        @SerializedName("version")
        private final String version;

        public /* synthetic */ RtmpStart(String str, List list, boolean z4, HMSRtmpVideoResolution hMSRtmpVideoResolution, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, list, z4, (i13 & 8) != 0 ? null : hMSRtmpVideoResolution, (i13 & 16) != 0 ? "1.0" : str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RtmpStart copy$default(RtmpStart rtmpStart, String str, List list, boolean z4, HMSRtmpVideoResolution hMSRtmpVideoResolution, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = rtmpStart.meetingUrl;
            }
            if ((i13 & 2) != 0) {
                list = rtmpStart.rtmpUrls;
            }
            if ((i13 & 4) != 0) {
                z4 = rtmpStart.record;
            }
            if ((i13 & 8) != 0) {
                hMSRtmpVideoResolution = rtmpStart.resolution;
            }
            if ((i13 & 16) != 0) {
                str2 = rtmpStart.version;
            }
            String str3 = str2;
            boolean z13 = z4;
            return rtmpStart.copy(str, list, z13, hMSRtmpVideoResolution, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMeetingUrl() {
            return this.meetingUrl;
        }

        public final List<String> component2() {
            return this.rtmpUrls;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getRecord() {
            return this.record;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final HMSRtmpVideoResolution getResolution() {
            return this.resolution;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public final RtmpStart copy(String meetingUrl, List<String> rtmpUrls, boolean record, HMSRtmpVideoResolution resolution, String version) {
            AbstractC22676k.m65750j(rtmpUrls, "rtmpUrls");
            AbstractC22676k.m65750j(version, "version");
            return new RtmpStart(meetingUrl, rtmpUrls, record, resolution, version);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RtmpStart)) {
                return false;
            }
            RtmpStart rtmpStart = (RtmpStart) other;
            return AbstractC22676k.m65745e(this.meetingUrl, rtmpStart.meetingUrl) && AbstractC22676k.m65745e(this.rtmpUrls, rtmpStart.rtmpUrls) && this.record == rtmpStart.record && AbstractC22676k.m65745e(this.resolution, rtmpStart.resolution) && AbstractC22676k.m65745e(this.version, rtmpStart.version);
        }

        public final String getMeetingUrl() {
            return this.meetingUrl;
        }

        public final boolean getRecord() {
            return this.record;
        }

        public final HMSRtmpVideoResolution getResolution() {
            return this.resolution;
        }

        public final List<String> getRtmpUrls() {
            return this.rtmpUrls;
        }

        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            String str = this.meetingUrl;
            int iM8289b = AbstractC2875y.m8289b(AbstractC11895b.m31983b((str == null ? 0 : str.hashCode()) * 31, 31, this.rtmpUrls), 31, this.record);
            HMSRtmpVideoResolution hMSRtmpVideoResolution = this.resolution;
            return this.version.hashCode() + ((iM8289b + (hMSRtmpVideoResolution != null ? hMSRtmpVideoResolution.hashCode() : 0)) * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("RtmpStart(meetingUrl=");
            sb4.append(this.meetingUrl);
            sb4.append(", rtmpUrls=");
            sb4.append(this.rtmpUrls);
            sb4.append(", record=");
            sb4.append(this.record);
            sb4.append(", resolution=");
            sb4.append(this.resolution);
            sb4.append(", version=");
            return AbstractC25012a.m73377j(sb4, this.version, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RtmpStart(String str, List<String> rtmpUrls, boolean z4, HMSRtmpVideoResolution hMSRtmpVideoResolution, String version) {
            super(null);
            AbstractC22676k.m65750j(rtmpUrls, "rtmpUrls");
            AbstractC22676k.m65750j(version, "version");
            this.meetingUrl = str;
            this.rtmpUrls = rtmpUrls;
            this.record = z4;
            this.resolution = hMSRtmpVideoResolution;
            this.version = version;
        }
    }

    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\"\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0006j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ*\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0006j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J>\u0010\u0011\u001a\u00020\u00002$\b\u0002\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0006j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001R4\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0006j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$TrackUpdate;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "tracks", "Lkotlin/collections/HashMap;", "", "Llive/hms/video/sdk/models/HMSNotifications$Track;", "Ljava/util/HashMap;", "version", "<init>", "(Ljava/util/HashMap;Ljava/lang/String;)V", "getTracks", "()Ljava/util/HashMap;", "Ljava/util/HashMap;", "getVersion", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/util/HashMap;Ljava/lang/String;)Llive/hms/video/signal/jsonrpc/models/HMSParams$TrackUpdate;", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class TrackUpdate extends HMSParams {

        @SerializedName("tracks")
        private final HashMap<String, HMSNotifications.Track> tracks;

        @SerializedName("version")
        private final String version;

        public /* synthetic */ TrackUpdate(HashMap map, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(map, (i13 & 2) != 0 ? "1.0" : str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TrackUpdate copy$default(TrackUpdate trackUpdate, HashMap map, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                map = trackUpdate.tracks;
            }
            if ((i13 & 2) != 0) {
                str = trackUpdate.version;
            }
            return trackUpdate.copy(map, str);
        }

        public final HashMap<String, HMSNotifications.Track> component1() {
            return this.tracks;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public final TrackUpdate copy(HashMap<String, HMSNotifications.Track> tracks, String version) {
            AbstractC22676k.m65750j(tracks, "tracks");
            AbstractC22676k.m65750j(version, "version");
            return new TrackUpdate(tracks, version);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrackUpdate)) {
                return false;
            }
            TrackUpdate trackUpdate = (TrackUpdate) other;
            return AbstractC22676k.m65745e(this.tracks, trackUpdate.tracks) && AbstractC22676k.m65745e(this.version, trackUpdate.version);
        }

        public final HashMap<String, HMSNotifications.Track> getTracks() {
            return this.tracks;
        }

        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            return this.version.hashCode() + (this.tracks.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("TrackUpdate(tracks=");
            sb4.append(this.tracks);
            sb4.append(", version=");
            return AbstractC25012a.m73377j(sb4, this.version, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackUpdate(HashMap<String, HMSNotifications.Track> tracks, String version) {
            super(null);
            AbstractC22676k.m65750j(tracks, "tracks");
            AbstractC22676k.m65750j(version, "version");
            this.tracks = tracks;
            this.version = version;
        }
    }

    private HMSParams() {
    }

    @Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014B\u0011\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0013\u0010\u0017J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\t\u0010/\u001a\u00020\fHÆ\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0003J\t\u00102\u001a\u00020\u0011HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\u0089\u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0003HÆ\u0001J\u0013\u00105\u001a\u00020\b2\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019¨\u0006;"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$SetPollParams;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "pollId", "", "title", AttachmentExtensionsKt.EXTRA_DURATION, "", CreatePollRequest.VOTING_VISIBILITY_ANONYMOUS, "", "visibility", "locked", "mode", "Llive/hms/video/polls/models/HmsPollUserTrackingMode;", "vote", "", "responses", "type", "Llive/hms/video/polls/models/HmsPollCategory;", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;JZZZLlive/hms/video/polls/models/HmsPollUserTrackingMode;Ljava/util/List;Ljava/util/List;Llive/hms/video/polls/models/HmsPollCategory;Ljava/lang/String;)V", "param", "Llive/hms/video/polls/models/HmsPollCreationParams;", "(Llive/hms/video/polls/models/HmsPollCreationParams;)V", "getPollId", "()Ljava/lang/String;", "getTitle", "getDuration", "()J", "getAnonymous", "()Z", "getVisibility", "getLocked", "getMode", "()Llive/hms/video/polls/models/HmsPollUserTrackingMode;", "getVote", "()Ljava/util/List;", "getResponses", "getType", "()Llive/hms/video/polls/models/HmsPollCategory;", "getVersion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class SetPollParams extends HMSParams {

        @SerializedName(CreatePollRequest.VOTING_VISIBILITY_ANONYMOUS)
        private final boolean anonymous;

        @SerializedName(AttachmentExtensionsKt.EXTRA_DURATION)
        private final long duration;

        @SerializedName("locked")
        private final boolean locked;

        @SerializedName("mode")
        private final HmsPollUserTrackingMode mode;

        @SerializedName("poll_id")
        private final String pollId;

        @SerializedName("responses")
        private final List<String> responses;

        @SerializedName("title")
        private final String title;

        @SerializedName("type")
        private final HmsPollCategory type;

        @SerializedName("version")
        private final String version;

        @SerializedName("visibility")
        private final boolean visibility;

        @SerializedName("vote")
        private final List<String> vote;

        public /* synthetic */ SetPollParams(String str, String str2, long j7, boolean z4, boolean z13, boolean z14, HmsPollUserTrackingMode hmsPollUserTrackingMode, List list, List list2, HmsPollCategory hmsPollCategory, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : str, str2, (i13 & 4) != 0 ? 0L : j7, (i13 & 8) != 0 ? false : z4, (i13 & 16) != 0 ? false : z13, (i13 & 32) != 0 ? false : z14, (i13 & 64) != 0 ? HmsPollUserTrackingMode.USER_ID : hmsPollUserTrackingMode, (i13 & 128) != 0 ? null : list, (i13 & 256) != 0 ? null : list2, hmsPollCategory, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? "1.0" : str3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SetPollParams copy$default(SetPollParams setPollParams, String str, String str2, long j7, boolean z4, boolean z13, boolean z14, HmsPollUserTrackingMode hmsPollUserTrackingMode, List list, List list2, HmsPollCategory hmsPollCategory, String str3, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = setPollParams.pollId;
            }
            if ((i13 & 2) != 0) {
                str2 = setPollParams.title;
            }
            if ((i13 & 4) != 0) {
                j7 = setPollParams.duration;
            }
            if ((i13 & 8) != 0) {
                z4 = setPollParams.anonymous;
            }
            if ((i13 & 16) != 0) {
                z13 = setPollParams.visibility;
            }
            if ((i13 & 32) != 0) {
                z14 = setPollParams.locked;
            }
            if ((i13 & 64) != 0) {
                hmsPollUserTrackingMode = setPollParams.mode;
            }
            if ((i13 & 128) != 0) {
                list = setPollParams.vote;
            }
            if ((i13 & 256) != 0) {
                list2 = setPollParams.responses;
            }
            if ((i13 & 512) != 0) {
                hmsPollCategory = setPollParams.type;
            }
            if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                str3 = setPollParams.version;
            }
            HmsPollCategory hmsPollCategory2 = hmsPollCategory;
            String str4 = str3;
            List list3 = list;
            List list4 = list2;
            long j13 = j7;
            return setPollParams.copy(str, str2, j13, z4, z13, z14, hmsPollUserTrackingMode, list3, list4, hmsPollCategory2, str4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPollId() {
            return this.pollId;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final HmsPollCategory getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getAnonymous() {
            return this.anonymous;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getVisibility() {
            return this.visibility;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getLocked() {
            return this.locked;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final HmsPollUserTrackingMode getMode() {
            return this.mode;
        }

        public final List<String> component8() {
            return this.vote;
        }

        public final List<String> component9() {
            return this.responses;
        }

        public final SetPollParams copy(String pollId, String title, long duration, boolean anonymous, boolean visibility, boolean locked, HmsPollUserTrackingMode mode, List<String> vote, List<String> responses, HmsPollCategory type, String version) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(mode, "mode");
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(version, "version");
            return new SetPollParams(pollId, title, duration, anonymous, visibility, locked, mode, vote, responses, type, version);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetPollParams)) {
                return false;
            }
            SetPollParams setPollParams = (SetPollParams) other;
            return AbstractC22676k.m65745e(this.pollId, setPollParams.pollId) && AbstractC22676k.m65745e(this.title, setPollParams.title) && this.duration == setPollParams.duration && this.anonymous == setPollParams.anonymous && this.visibility == setPollParams.visibility && this.locked == setPollParams.locked && this.mode == setPollParams.mode && AbstractC22676k.m65745e(this.vote, setPollParams.vote) && AbstractC22676k.m65745e(this.responses, setPollParams.responses) && this.type == setPollParams.type && AbstractC22676k.m65745e(this.version, setPollParams.version);
        }

        public final boolean getAnonymous() {
            return this.anonymous;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final boolean getLocked() {
            return this.locked;
        }

        public final HmsPollUserTrackingMode getMode() {
            return this.mode;
        }

        public final String getPollId() {
            return this.pollId;
        }

        public final List<String> getResponses() {
            return this.responses;
        }

        public final String getTitle() {
            return this.title;
        }

        public final HmsPollCategory getType() {
            return this.type;
        }

        public final String getVersion() {
            return this.version;
        }

        public final boolean getVisibility() {
            return this.visibility;
        }

        public final List<String> getVote() {
            return this.vote;
        }

        public int hashCode() {
            String str = this.pollId;
            int iHashCode = (this.mode.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30451e(AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.title), this.duration, 31), 31, this.anonymous), 31, this.visibility), 31, this.locked)) * 31;
            List<String> list = this.vote;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            List<String> list2 = this.responses;
            return this.version.hashCode() + ((this.type.hashCode() + ((iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31)) * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("SetPollParams(pollId=");
            sb4.append(this.pollId);
            sb4.append(", title=");
            sb4.append(this.title);
            sb4.append(", duration=");
            sb4.append(this.duration);
            sb4.append(", anonymous=");
            sb4.append(this.anonymous);
            sb4.append(", visibility=");
            sb4.append(this.visibility);
            sb4.append(", locked=");
            sb4.append(this.locked);
            sb4.append(", mode=");
            sb4.append(this.mode);
            sb4.append(", vote=");
            sb4.append(this.vote);
            sb4.append(", responses=");
            sb4.append(this.responses);
            sb4.append(", type=");
            sb4.append(this.type);
            sb4.append(", version=");
            return AbstractC25012a.m73377j(sb4, this.version, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetPollParams(String str, String title, long j7, boolean z4, boolean z13, boolean z14, HmsPollUserTrackingMode mode, List<String> list, List<String> list2, HmsPollCategory type, String version) {
            super(null);
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(mode, "mode");
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(version, "version");
            this.pollId = str;
            this.title = title;
            this.duration = j7;
            this.anonymous = z4;
            this.visibility = z13;
            this.locked = z14;
            this.mode = mode;
            this.vote = list;
            this.responses = list2;
            this.type = type;
            this.version = version;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public SetPollParams(HmsPollCreationParams param) {
            this(param.getPollId(), param.getTitle(), param.getDuration(), param.getAnonymous(), param.getVisibility(), param.getLocked(), param.getMode(), param.getVote(), param.getResponses(), param.getCategory(), null, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED, null);
            AbstractC22676k.m65750j(param, "param");
        }
    }

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J<\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$SetSessionMetadata;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "key", "", "data", "", "changeVersion", "", "version", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Long;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getData", "()Ljava/lang/Object;", "getChangeVersion", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getVersion", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Long;Ljava/lang/String;)Llive/hms/video/signal/jsonrpc/models/HMSParams$SetSessionMetadata;", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class SetSessionMetadata extends HMSParams {

        @SerializedName("if_change_version")
        private final Long changeVersion;

        @SerializedName("data")
        private final Object data;

        @SerializedName("key")
        private final String key;

        @SerializedName("version")
        private final String version;

        public /* synthetic */ SetSessionMetadata(String str, Object obj, Long l7, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY : str, obj, (i13 & 4) != 0 ? null : l7, (i13 & 8) != 0 ? "1.1" : str2);
        }

        public static /* synthetic */ SetSessionMetadata copy$default(SetSessionMetadata setSessionMetadata, String str, Object obj, Long l7, String str2, int i13, Object obj2) {
            if ((i13 & 1) != 0) {
                str = setSessionMetadata.key;
            }
            if ((i13 & 2) != 0) {
                obj = setSessionMetadata.data;
            }
            if ((i13 & 4) != 0) {
                l7 = setSessionMetadata.changeVersion;
            }
            if ((i13 & 8) != 0) {
                str2 = setSessionMetadata.version;
            }
            return setSessionMetadata.copy(str, obj, l7, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Object getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Long getChangeVersion() {
            return this.changeVersion;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public final SetSessionMetadata copy(String key, Object data, Long changeVersion, String version) {
            AbstractC22676k.m65750j(version, "version");
            return new SetSessionMetadata(key, data, changeVersion, version);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetSessionMetadata)) {
                return false;
            }
            SetSessionMetadata setSessionMetadata = (SetSessionMetadata) other;
            return AbstractC22676k.m65745e(this.key, setSessionMetadata.key) && AbstractC22676k.m65745e(this.data, setSessionMetadata.data) && AbstractC22676k.m65745e(this.changeVersion, setSessionMetadata.changeVersion) && AbstractC22676k.m65745e(this.version, setSessionMetadata.version);
        }

        public final Long getChangeVersion() {
            return this.changeVersion;
        }

        public final Object getData() {
            return this.data;
        }

        public final String getKey() {
            return this.key;
        }

        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            String str = this.key;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Object obj = this.data;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            Long l7 = this.changeVersion;
            return this.version.hashCode() + ((iHashCode2 + (l7 != null ? l7.hashCode() : 0)) * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("SetSessionMetadata(key=");
            sb4.append(this.key);
            sb4.append(", data=");
            sb4.append(this.data);
            sb4.append(", changeVersion=");
            sb4.append(this.changeVersion);
            sb4.append(", version=");
            return AbstractC25012a.m73377j(sb4, this.version, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetSessionMetadata(String str, Object obj, Long l7, String version) {
            super(null);
            AbstractC22676k.m65750j(version, "version");
            this.key = str;
            this.data = obj;
            this.changeVersion = l7;
            this.version = version;
        }
    }

    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/HMSParams$SetHLSSessionMetadata;", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "data", "", "Llive/hms/video/sdk/models/HMSHLSTimedMetadata;", "metaDataId", "", "version", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getData", "()Ljava/util/List;", "getMetaDataId", "()Ljava/lang/String;", "getVersion", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class SetHLSSessionMetadata extends HMSParams {

        @SerializedName("metadata_objs")
        private final List<HMSHLSTimedMetadata> data;

        @SerializedName("metadata_id")
        private final String metaDataId;

        @SerializedName("version")
        private final String version;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetHLSSessionMetadata(List<HMSHLSTimedMetadata> data, String metaDataId, String version) {
            super(null);
            AbstractC22676k.m65750j(data, "data");
            AbstractC22676k.m65750j(metaDataId, "metaDataId");
            AbstractC22676k.m65750j(version, "version");
            this.data = data;
            this.metaDataId = metaDataId;
            this.version = version;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SetHLSSessionMetadata copy$default(SetHLSSessionMetadata setHLSSessionMetadata, List list, String str, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                list = setHLSSessionMetadata.data;
            }
            if ((i13 & 2) != 0) {
                str = setHLSSessionMetadata.metaDataId;
            }
            if ((i13 & 4) != 0) {
                str2 = setHLSSessionMetadata.version;
            }
            return setHLSSessionMetadata.copy(list, str, str2);
        }

        public final List<HMSHLSTimedMetadata> component1() {
            return this.data;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMetaDataId() {
            return this.metaDataId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public final SetHLSSessionMetadata copy(List<HMSHLSTimedMetadata> data, String metaDataId, String version) {
            AbstractC22676k.m65750j(data, "data");
            AbstractC22676k.m65750j(metaDataId, "metaDataId");
            AbstractC22676k.m65750j(version, "version");
            return new SetHLSSessionMetadata(data, metaDataId, version);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetHLSSessionMetadata)) {
                return false;
            }
            SetHLSSessionMetadata setHLSSessionMetadata = (SetHLSSessionMetadata) other;
            return AbstractC22676k.m65745e(this.data, setHLSSessionMetadata.data) && AbstractC22676k.m65745e(this.metaDataId, setHLSSessionMetadata.metaDataId) && AbstractC22676k.m65745e(this.version, setHLSSessionMetadata.version);
        }

        public final List<HMSHLSTimedMetadata> getData() {
            return this.data;
        }

        public final String getMetaDataId() {
            return this.metaDataId;
        }

        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            return this.version.hashCode() + AbstractC11266d.m30450d(this.data.hashCode() * 31, 31, this.metaDataId);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("SetHLSSessionMetadata(data=");
            sb4.append(this.data);
            sb4.append(", metaDataId=");
            sb4.append(this.metaDataId);
            sb4.append(", version=");
            return AbstractC25012a.m73377j(sb4, this.version, ')');
        }

        public /* synthetic */ SetHLSSessionMetadata(List list, String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, str, (i13 & 4) != 0 ? "1.0" : str2);
        }
    }
}
