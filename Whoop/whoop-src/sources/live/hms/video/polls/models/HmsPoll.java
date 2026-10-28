package live.hms.video.polls.models;

import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import io.getstream.chat.android.client.api2.model.requests.CreatePollRequest;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.InterfaceC23462h;
import live.hms.video.polls.models.HmsPoll;
import live.hms.video.polls.models.question.HMSPollQuestion;
import live.hms.video.polls.network.PollResultsDisplay;
import live.hms.video.sdk.SDKStore;
import live.hms.video.sdk.models.HMSNotifications;
import live.hms.video.sdk.models.HMSPeer;
import live.hms.video.sdk.models.role.HMSRole;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bT\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BÍ\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 B1\b\u0010\u0012\u0006\u0010\"\u001a\u00020!\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010#\u001a\u00020\u0019\u0012\u0006\u0010$\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0018\u0010/\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b7\u0010,J\u0012\u00108\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÀ\u0003¢\u0006\u0004\b:\u0010'J\u0012\u0010=\u001a\u0004\u0018\u00010\u0002HÀ\u0003¢\u0006\u0004\b<\u0010'J\u0012\u0010?\u001a\u0004\u0018\u00010\u0002HÀ\u0003¢\u0006\u0004\b>\u0010'J\u0010\u0010B\u001a\u00020\u001dHÀ\u0003¢\u0006\u0004\b@\u0010AJì\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\b\b\u0002\u0010\u001e\u001a\u00020\u001dHÆ\u0001¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bE\u0010'J\u0010\u0010F\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\bF\u0010GJ\u001a\u0010I\u001a\u00020\b2\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bI\u0010JJ\u0010\u0010K\u001a\u00020\u0019HÂ\u0003¢\u0006\u0004\bK\u0010LJ\u0018\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nHÂ\u0003¢\u0006\u0004\bM\u00100J\u0018\u0010N\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nHÂ\u0003¢\u0006\u0004\bN\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010O\u001a\u0004\bP\u0010'R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010O\u001a\u0004\bQ\u0010'R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010R\u001a\u0004\bS\u0010*R$\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010T\u001a\u0004\bU\u0010,\"\u0004\bV\u0010WR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010X\u001a\u0004\bY\u0010.R*\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010Z\u001a\u0004\b[\u00100\"\u0004\b\\\u0010]R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010^\u001a\u0004\b_\u00102R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010`\u001a\u0004\ba\u00104R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010b\u001a\u0004\bc\u00106R$\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010T\u001a\u0004\bd\u0010,\"\u0004\be\u0010WR$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010f\u001a\u0004\bg\u00109\"\u0004\bh\u0010iR$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010O\u001a\u0004\bj\u0010'\"\u0004\bk\u0010lR$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010O\u001a\u0004\bm\u0010'\"\u0004\bn\u0010lR$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010O\u001a\u0004\bo\u0010'\"\u0004\bp\u0010lR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010qR\u001c\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010ZR\u001c\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010ZR\"\u0010\u001e\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010r\u001a\u0004\bs\u0010A\"\u0004\bt\u0010uR\u001d\u0010{\u001a\u0004\u0018\u00010v8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR\u0019\u0010|\u001a\u0004\u0018\u00010v8\u0006¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010zR\u001a\u0010\u007f\u001a\u0004\u0018\u00010v8\u0006¢\u0006\r\n\u0004\b\u007f\u0010}\u001a\u0005\b\u0080\u0001\u0010zR%\u0010\u0084\u0001\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010\n8FX\u0086\u0084\u0002¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010x\u001a\u0005\b\u0083\u0001\u00100R%\u0010\u0087\u0001\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010\n8FX\u0086\u0084\u0002¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010x\u001a\u0005\b\u0086\u0001\u00100R\u0012\u0010$\u001a\u00020\u001d8F¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010A¨\u0006\u0089\u0001"}, m65681d2 = {"Llive/hms/video/polls/models/HmsPoll;", "", "", "pollId", "title", "", "startedAt", AttachmentExtensionsKt.EXTRA_DURATION, "", CreatePollRequest.VOTING_VISIBILITY_ANONYMOUS, "", "Llive/hms/video/polls/models/question/HMSPollQuestion;", "questions", "Llive/hms/video/polls/models/HmsPollUserTrackingMode;", "mode", "Llive/hms/video/polls/models/HmsPollCategory;", "category", "", "questionCount", "stoppedAt", "Llive/hms/video/polls/network/PollResultsDisplay;", "result", "_createdBy", "_startedBy", "_stoppedBy", "Llive/hms/video/sdk/SDKStore;", "store", "_rolesThatCanVote", "_rolesThatCanViewResponses", "Llive/hms/video/polls/models/HmsPollState;", "_state", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;ZLjava/util/List;Llive/hms/video/polls/models/HmsPollUserTrackingMode;Llive/hms/video/polls/models/HmsPollCategory;Ljava/lang/Integer;Ljava/lang/Long;Llive/hms/video/polls/network/PollResultsDisplay;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/SDKStore;Ljava/util/List;Ljava/util/List;Llive/hms/video/polls/models/HmsPollState;)V", "Llive/hms/video/sdk/models/HMSNotifications$StartedPolls;", "startedPolls", "sdkStore", "state", "(Llive/hms/video/sdk/models/HMSNotifications$StartedPolls;Ljava/util/List;Llive/hms/video/sdk/SDKStore;Llive/hms/video/polls/models/HmsPollState;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()J", "component4", "()Ljava/lang/Long;", "component5", "()Z", "component6", "()Ljava/util/List;", "component7", "()Llive/hms/video/polls/models/HmsPollUserTrackingMode;", "component8", "()Llive/hms/video/polls/models/HmsPollCategory;", "component9", "()Ljava/lang/Integer;", "component10", "component11", "()Llive/hms/video/polls/network/PollResultsDisplay;", "component12$lib_release", "component12", "component13$lib_release", "component13", "component14$lib_release", "component14", "component18$lib_release", "()Llive/hms/video/polls/models/HmsPollState;", "component18", "copy", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;ZLjava/util/List;Llive/hms/video/polls/models/HmsPollUserTrackingMode;Llive/hms/video/polls/models/HmsPollCategory;Ljava/lang/Integer;Ljava/lang/Long;Llive/hms/video/polls/network/PollResultsDisplay;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/SDKStore;Ljava/util/List;Ljava/util/List;Llive/hms/video/polls/models/HmsPollState;)Llive/hms/video/polls/models/HmsPoll;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "component15", "()Llive/hms/video/sdk/SDKStore;", "component16", "component17", "Ljava/lang/String;", "getPollId", "getTitle", "J", "getStartedAt", "Ljava/lang/Long;", "getDuration", "setDuration", "(Ljava/lang/Long;)V", "Z", "getAnonymous", "Ljava/util/List;", "getQuestions", "setQuestions", "(Ljava/util/List;)V", "Llive/hms/video/polls/models/HmsPollUserTrackingMode;", "getMode", "Llive/hms/video/polls/models/HmsPollCategory;", "getCategory", "Ljava/lang/Integer;", "getQuestionCount", "getStoppedAt", "setStoppedAt", "Llive/hms/video/polls/network/PollResultsDisplay;", "getResult", "setResult", "(Llive/hms/video/polls/network/PollResultsDisplay;)V", "get_createdBy$lib_release", "set_createdBy$lib_release", "(Ljava/lang/String;)V", "get_startedBy$lib_release", "set_startedBy$lib_release", "get_stoppedBy$lib_release", "set_stoppedBy$lib_release", "Llive/hms/video/sdk/SDKStore;", "Llive/hms/video/polls/models/HmsPollState;", "get_state$lib_release", "set_state$lib_release", "(Llive/hms/video/polls/models/HmsPollState;)V", "Llive/hms/video/sdk/models/HMSPeer;", "createdBy$delegate", "Ll83/h;", "getCreatedBy", "()Llive/hms/video/sdk/models/HMSPeer;", "createdBy", "startedBy", "Llive/hms/video/sdk/models/HMSPeer;", "getStartedBy", "stoppedBy", "getStoppedBy", "Llive/hms/video/sdk/models/role/HMSRole;", "rolesThatCanVote$delegate", "getRolesThatCanVote", "rolesThatCanVote", "rolesThatCanViewResponses$delegate", "getRolesThatCanViewResponses", "rolesThatCanViewResponses", "getState", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HmsPoll {
    private String _createdBy;
    private final List<String> _rolesThatCanViewResponses;
    private final List<String> _rolesThatCanVote;
    private String _startedBy;
    private HmsPollState _state;
    private String _stoppedBy;
    private final boolean anonymous;
    private final HmsPollCategory category;

    /* JADX INFO: renamed from: createdBy$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h createdBy;
    private Long duration;
    private final HmsPollUserTrackingMode mode;
    private final String pollId;
    private final Integer questionCount;
    private List<HMSPollQuestion> questions;
    private PollResultsDisplay result;

    /* JADX INFO: renamed from: rolesThatCanViewResponses$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h rolesThatCanViewResponses;

    /* JADX INFO: renamed from: rolesThatCanVote$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h rolesThatCanVote;
    private final long startedAt;
    private final HMSPeer startedBy;
    private Long stoppedAt;
    private final HMSPeer stoppedBy;
    private final SDKStore store;
    private final String title;

    public HmsPoll(String pollId, String title, long j7, Long l7, boolean z4, List<HMSPollQuestion> list, HmsPollUserTrackingMode hmsPollUserTrackingMode, HmsPollCategory category, Integer num, Long l12, PollResultsDisplay pollResultsDisplay, String str, String str2, String str3, SDKStore store, List<String> list2, List<String> list3, HmsPollState _state) {
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(category, "category");
        AbstractC22676k.m65750j(store, "store");
        AbstractC22676k.m65750j(_state, "_state");
        this.pollId = pollId;
        this.title = title;
        this.startedAt = j7;
        this.duration = l7;
        this.anonymous = z4;
        this.questions = list;
        this.mode = hmsPollUserTrackingMode;
        this.category = category;
        this.questionCount = num;
        this.stoppedAt = l12;
        this.result = pollResultsDisplay;
        this._createdBy = str;
        this._startedBy = str2;
        this._stoppedBy = str3;
        this.store = store;
        this._rolesThatCanVote = list2;
        this._rolesThatCanViewResponses = list3;
        this._state = _state;
        final int i13 = 0;
        this.createdBy = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: id3.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ HmsPoll f71773x;

            {
                this.f71773x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return HmsPoll.createdBy_delegate$lambda$0(this.f71773x);
                    case 1:
                        return HmsPoll.rolesThatCanVote_delegate$lambda$2(this.f71773x);
                    default:
                        return HmsPoll.rolesThatCanViewResponses_delegate$lambda$4(this.f71773x);
                }
            }
        });
        this.startedBy = store.getPeerById(this._startedBy);
        this.stoppedBy = store.getPeerById(this._stoppedBy);
        final int i14 = 1;
        this.rolesThatCanVote = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: id3.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ HmsPoll f71773x;

            {
                this.f71773x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return HmsPoll.createdBy_delegate$lambda$0(this.f71773x);
                    case 1:
                        return HmsPoll.rolesThatCanVote_delegate$lambda$2(this.f71773x);
                    default:
                        return HmsPoll.rolesThatCanViewResponses_delegate$lambda$4(this.f71773x);
                }
            }
        });
        final int i15 = 2;
        this.rolesThatCanViewResponses = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: id3.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ HmsPoll f71773x;

            {
                this.f71773x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return HmsPoll.createdBy_delegate$lambda$0(this.f71773x);
                    case 1:
                        return HmsPoll.rolesThatCanVote_delegate$lambda$2(this.f71773x);
                    default:
                        return HmsPoll.rolesThatCanViewResponses_delegate$lambda$4(this.f71773x);
                }
            }
        });
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    private final SDKStore getStore() {
        return this.store;
    }

    private final List<String> component16() {
        return this._rolesThatCanVote;
    }

    private final List<String> component17() {
        return this._rolesThatCanViewResponses;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HmsPoll copy$default(HmsPoll hmsPoll, String str, String str2, long j7, Long l7, boolean z4, List list, HmsPollUserTrackingMode hmsPollUserTrackingMode, HmsPollCategory hmsPollCategory, Integer num, Long l12, PollResultsDisplay pollResultsDisplay, String str3, String str4, String str5, SDKStore sDKStore, List list2, List list3, HmsPollState hmsPollState, int i13, Object obj) {
        HmsPollState hmsPollState2;
        List list4;
        String str6 = (i13 & 1) != 0 ? hmsPoll.pollId : str;
        String str7 = (i13 & 2) != 0 ? hmsPoll.title : str2;
        long j13 = (i13 & 4) != 0 ? hmsPoll.startedAt : j7;
        Long l13 = (i13 & 8) != 0 ? hmsPoll.duration : l7;
        boolean z13 = (i13 & 16) != 0 ? hmsPoll.anonymous : z4;
        List list5 = (i13 & 32) != 0 ? hmsPoll.questions : list;
        HmsPollUserTrackingMode hmsPollUserTrackingMode2 = (i13 & 64) != 0 ? hmsPoll.mode : hmsPollUserTrackingMode;
        HmsPollCategory hmsPollCategory2 = (i13 & 128) != 0 ? hmsPoll.category : hmsPollCategory;
        Integer num2 = (i13 & 256) != 0 ? hmsPoll.questionCount : num;
        Long l14 = (i13 & 512) != 0 ? hmsPoll.stoppedAt : l12;
        PollResultsDisplay pollResultsDisplay2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? hmsPoll.result : pollResultsDisplay;
        String str8 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? hmsPoll._createdBy : str3;
        String str9 = (i13 & 4096) != 0 ? hmsPoll._startedBy : str4;
        String str10 = str6;
        String str11 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? hmsPoll._stoppedBy : str5;
        SDKStore sDKStore2 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? hmsPoll.store : sDKStore;
        List list6 = (i13 & 32768) != 0 ? hmsPoll._rolesThatCanVote : list2;
        List list7 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? hmsPoll._rolesThatCanViewResponses : list3;
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0) {
            list4 = list7;
            hmsPollState2 = hmsPoll._state;
        } else {
            hmsPollState2 = hmsPollState;
            list4 = list7;
        }
        return hmsPoll.copy(str10, str7, j13, l13, z13, list5, hmsPollUserTrackingMode2, hmsPollCategory2, num2, l14, pollResultsDisplay2, str8, str9, str11, sDKStore2, list6, list4, hmsPollState2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HMSPeer createdBy_delegate$lambda$0(HmsPoll this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        return this$0.store.getPeerById(this$0._createdBy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List rolesThatCanViewResponses_delegate$lambda$4(HmsPoll this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        List<String> list = this$0._rolesThatCanViewResponses;
        if (list == null) {
            return C25271y.f99162w;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            HMSRole hMSRole = this$0.store.getRolesMap().get((String) it.next());
            if (hMSRole != null) {
                arrayList.add(hMSRole);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List rolesThatCanVote_delegate$lambda$2(HmsPoll this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        List<String> list = this$0._rolesThatCanVote;
        if (list == null) {
            return C25271y.f99162w;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            HMSRole hMSRole = this$0.store.getRolesMap().get((String) it.next());
            if (hMSRole != null) {
                arrayList.add(hMSRole);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPollId() {
        return this.pollId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getStoppedAt() {
        return this.stoppedAt;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final PollResultsDisplay getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component12$lib_release, reason: from getter */
    public final String get_createdBy() {
        return this._createdBy;
    }

    /* JADX INFO: renamed from: component13$lib_release, reason: from getter */
    public final String get_startedBy() {
        return this._startedBy;
    }

    /* JADX INFO: renamed from: component14$lib_release, reason: from getter */
    public final String get_stoppedBy() {
        return this._stoppedBy;
    }

    /* JADX INFO: renamed from: component18$lib_release, reason: from getter */
    public final HmsPollState get_state() {
        return this._state;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getStartedAt() {
        return this.startedAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getAnonymous() {
        return this.anonymous;
    }

    public final List<HMSPollQuestion> component6() {
        return this.questions;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final HmsPollUserTrackingMode getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final HmsPollCategory getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getQuestionCount() {
        return this.questionCount;
    }

    public final HmsPoll copy(String pollId, String title, long startedAt, Long duration, boolean anonymous, List<HMSPollQuestion> questions, HmsPollUserTrackingMode mode, HmsPollCategory category, Integer questionCount, Long stoppedAt, PollResultsDisplay result, String _createdBy, String _startedBy, String _stoppedBy, SDKStore store, List<String> _rolesThatCanVote, List<String> _rolesThatCanViewResponses, HmsPollState _state) {
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(category, "category");
        AbstractC22676k.m65750j(store, "store");
        AbstractC22676k.m65750j(_state, "_state");
        return new HmsPoll(pollId, title, startedAt, duration, anonymous, questions, mode, category, questionCount, stoppedAt, result, _createdBy, _startedBy, _stoppedBy, store, _rolesThatCanVote, _rolesThatCanViewResponses, _state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HmsPoll)) {
            return false;
        }
        HmsPoll hmsPoll = (HmsPoll) other;
        return AbstractC22676k.m65745e(this.pollId, hmsPoll.pollId) && AbstractC22676k.m65745e(this.title, hmsPoll.title) && this.startedAt == hmsPoll.startedAt && AbstractC22676k.m65745e(this.duration, hmsPoll.duration) && this.anonymous == hmsPoll.anonymous && AbstractC22676k.m65745e(this.questions, hmsPoll.questions) && this.mode == hmsPoll.mode && this.category == hmsPoll.category && AbstractC22676k.m65745e(this.questionCount, hmsPoll.questionCount) && AbstractC22676k.m65745e(this.stoppedAt, hmsPoll.stoppedAt) && AbstractC22676k.m65745e(this.result, hmsPoll.result) && AbstractC22676k.m65745e(this._createdBy, hmsPoll._createdBy) && AbstractC22676k.m65745e(this._startedBy, hmsPoll._startedBy) && AbstractC22676k.m65745e(this._stoppedBy, hmsPoll._stoppedBy) && AbstractC22676k.m65745e(this.store, hmsPoll.store) && AbstractC22676k.m65745e(this._rolesThatCanVote, hmsPoll._rolesThatCanVote) && AbstractC22676k.m65745e(this._rolesThatCanViewResponses, hmsPoll._rolesThatCanViewResponses) && this._state == hmsPoll._state;
    }

    public final boolean getAnonymous() {
        return this.anonymous;
    }

    public final HmsPollCategory getCategory() {
        return this.category;
    }

    public final HMSPeer getCreatedBy() {
        return (HMSPeer) this.createdBy.getValue();
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final HmsPollUserTrackingMode getMode() {
        return this.mode;
    }

    public final String getPollId() {
        return this.pollId;
    }

    public final Integer getQuestionCount() {
        return this.questionCount;
    }

    public final List<HMSPollQuestion> getQuestions() {
        return this.questions;
    }

    public final PollResultsDisplay getResult() {
        return this.result;
    }

    public final List<HMSRole> getRolesThatCanViewResponses() {
        return (List) this.rolesThatCanViewResponses.getValue();
    }

    public final List<HMSRole> getRolesThatCanVote() {
        return (List) this.rolesThatCanVote.getValue();
    }

    public final long getStartedAt() {
        return this.startedAt;
    }

    public final HMSPeer getStartedBy() {
        return this.startedBy;
    }

    public final HmsPollState getState() {
        return this._state;
    }

    public final Long getStoppedAt() {
        return this.stoppedAt;
    }

    public final HMSPeer getStoppedBy() {
        return this.stoppedBy;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String get_createdBy$lib_release() {
        return this._createdBy;
    }

    public final String get_startedBy$lib_release() {
        return this._startedBy;
    }

    public final HmsPollState get_state$lib_release() {
        return this._state;
    }

    public final String get_stoppedBy$lib_release() {
        return this._stoppedBy;
    }

    public int hashCode() {
        int iM30451e = AbstractC11266d.m30451e(AbstractC11266d.m30450d(this.pollId.hashCode() * 31, 31, this.title), this.startedAt, 31);
        Long l7 = this.duration;
        int iM8289b = AbstractC2875y.m8289b((iM30451e + (l7 == null ? 0 : l7.hashCode())) * 31, 31, this.anonymous);
        List<HMSPollQuestion> list = this.questions;
        int iHashCode = (iM8289b + (list == null ? 0 : list.hashCode())) * 31;
        HmsPollUserTrackingMode hmsPollUserTrackingMode = this.mode;
        int iHashCode2 = (this.category.hashCode() + ((iHashCode + (hmsPollUserTrackingMode == null ? 0 : hmsPollUserTrackingMode.hashCode())) * 31)) * 31;
        Integer num = this.questionCount;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l12 = this.stoppedAt;
        int iHashCode4 = (iHashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        PollResultsDisplay pollResultsDisplay = this.result;
        int iHashCode5 = (iHashCode4 + (pollResultsDisplay == null ? 0 : pollResultsDisplay.hashCode())) * 31;
        String str = this._createdBy;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this._startedBy;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this._stoppedBy;
        int iHashCode8 = (this.store.hashCode() + ((iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        List<String> list2 = this._rolesThatCanVote;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this._rolesThatCanViewResponses;
        return this._state.hashCode() + ((iHashCode9 + (list3 != null ? list3.hashCode() : 0)) * 31);
    }

    public final void setDuration(Long l7) {
        this.duration = l7;
    }

    public final void setQuestions(List<HMSPollQuestion> list) {
        this.questions = list;
    }

    public final void setResult(PollResultsDisplay pollResultsDisplay) {
        this.result = pollResultsDisplay;
    }

    public final void setStoppedAt(Long l7) {
        this.stoppedAt = l7;
    }

    public final void set_createdBy$lib_release(String str) {
        this._createdBy = str;
    }

    public final void set_startedBy$lib_release(String str) {
        this._startedBy = str;
    }

    public final void set_state$lib_release(HmsPollState hmsPollState) {
        AbstractC22676k.m65750j(hmsPollState, "<set-?>");
        this._state = hmsPollState;
    }

    public final void set_stoppedBy$lib_release(String str) {
        this._stoppedBy = str;
    }

    public String toString() {
        return "HmsPoll(pollId=" + this.pollId + ", title=" + this.title + ", startedAt=" + this.startedAt + ", duration=" + this.duration + ", anonymous=" + this.anonymous + ", questions=" + this.questions + ", mode=" + this.mode + ", category=" + this.category + ", questionCount=" + this.questionCount + ", stoppedAt=" + this.stoppedAt + ", result=" + this.result + ", _createdBy=" + this._createdBy + ", _startedBy=" + this._startedBy + ", _stoppedBy=" + this._stoppedBy + ", store=" + this.store + ", _rolesThatCanVote=" + this._rolesThatCanVote + ", _rolesThatCanViewResponses=" + this._rolesThatCanViewResponses + ", _state=" + this._state + ')';
    }

    public /* synthetic */ HmsPoll(String str, String str2, long j7, Long l7, boolean z4, List list, HmsPollUserTrackingMode hmsPollUserTrackingMode, HmsPollCategory hmsPollCategory, Integer num, Long l12, PollResultsDisplay pollResultsDisplay, String str3, String str4, String str5, SDKStore sDKStore, List list2, List list3, HmsPollState hmsPollState, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j7, l7, z4, list, hmsPollUserTrackingMode, hmsPollCategory, (i13 & 256) != 0 ? null : num, (i13 & 512) != 0 ? null : l12, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : pollResultsDisplay, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str3, (i13 & 4096) != 0 ? null : str4, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : str5, sDKStore, list2, list3, hmsPollState);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HmsPoll(HMSNotifications.StartedPolls startedPolls, List<HMSPollQuestion> list, SDKStore sdkStore, HmsPollState state) {
        this(startedPolls.getPollId(), startedPolls.getTitle(), startedPolls.getStartedAt(), Long.valueOf(startedPolls.getDuration()), startedPolls.getAnonymous(), list, startedPolls.getPollUserTrackingMode(), startedPolls.getCategory(), list != null ? Integer.valueOf(list.size()) : null, null, null, startedPolls.getCreatedBy(), startedPolls.getStartedBy(), null, sdkStore, startedPolls.getEligibleVoters(), startedPolls.getEligibleToViewResponses(), state);
        AbstractC22676k.m65750j(startedPolls, "startedPolls");
        AbstractC22676k.m65750j(sdkStore, "sdkStore");
        AbstractC22676k.m65750j(state, "state");
    }
}
