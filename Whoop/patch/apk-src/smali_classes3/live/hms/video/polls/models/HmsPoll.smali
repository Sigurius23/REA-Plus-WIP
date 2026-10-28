.class public final Llive/hms/video/polls/models/HmsPoll;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008T\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u00cd\u0001\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u000e\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\u0008\u001f\u0010 B1\u0008\u0010\u0012\u0006\u0010\"\u001a\u00020!\u0012\u000e\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010#\u001a\u00020\u0019\u0012\u0006\u0010$\u001a\u00020\u001d\u00a2\u0006\u0004\u0008\u001f\u0010%J\u0010\u0010&\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010\'J\u0010\u0010)\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0010\u0010-\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\u0018\u0010/\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u00081\u00102J\u0010\u00103\u001a\u00020\u000fH\u00c6\u0003\u00a2\u0006\u0004\u00083\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0004\u00085\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u00087\u0010,J\u0012\u00108\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0004\u00088\u00109J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002H\u00c0\u0003\u00a2\u0006\u0004\u0008:\u0010\'J\u0012\u0010=\u001a\u0004\u0018\u00010\u0002H\u00c0\u0003\u00a2\u0006\u0004\u0008<\u0010\'J\u0012\u0010?\u001a\u0004\u0018\u00010\u0002H\u00c0\u0003\u00a2\u0006\u0004\u0008>\u0010\'J\u0010\u0010B\u001a\u00020\u001dH\u00c0\u0003\u00a2\u0006\u0004\u0008@\u0010AJ\u00ec\u0001\u0010C\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0010\u0008\u0002\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00192\u0010\u0008\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\u0010\u0008\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u001dH\u00c6\u0001\u00a2\u0006\u0004\u0008C\u0010DJ\u0010\u0010E\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008E\u0010\'J\u0010\u0010F\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008F\u0010GJ\u001a\u0010I\u001a\u00020\u00082\u0008\u0010H\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008I\u0010JJ\u0010\u0010K\u001a\u00020\u0019H\u00c2\u0003\u00a2\u0006\u0004\u0008K\u0010LJ\u0018\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nH\u00c2\u0003\u00a2\u0006\u0004\u0008M\u00100J\u0018\u0010N\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nH\u00c2\u0003\u00a2\u0006\u0004\u0008N\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010O\u001a\u0004\u0008P\u0010\'R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010O\u001a\u0004\u0008Q\u0010\'R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010R\u001a\u0004\u0008S\u0010*R$\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010T\u001a\u0004\u0008U\u0010,\"\u0004\u0008V\u0010WR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010X\u001a\u0004\u0008Y\u0010.R*\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010Z\u001a\u0004\u0008[\u00100\"\u0004\u0008\\\u0010]R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010^\u001a\u0004\u0008_\u00102R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010`\u001a\u0004\u0008a\u00104R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010b\u001a\u0004\u0008c\u00106R$\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010T\u001a\u0004\u0008d\u0010,\"\u0004\u0008e\u0010WR$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010f\u001a\u0004\u0008g\u00109\"\u0004\u0008h\u0010iR$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010O\u001a\u0004\u0008j\u0010\'\"\u0004\u0008k\u0010lR$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010O\u001a\u0004\u0008m\u0010\'\"\u0004\u0008n\u0010lR$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010O\u001a\u0004\u0008o\u0010\'\"\u0004\u0008p\u0010lR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010qR\u001c\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010ZR\u001c\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010ZR\"\u0010\u001e\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001e\u0010r\u001a\u0004\u0008s\u0010A\"\u0004\u0008t\u0010uR\u001d\u0010{\u001a\u0004\u0018\u00010v8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008w\u0010x\u001a\u0004\u0008y\u0010zR\u0019\u0010|\u001a\u0004\u0018\u00010v8\u0006\u00a2\u0006\u000c\n\u0004\u0008|\u0010}\u001a\u0004\u0008~\u0010zR\u001a\u0010\u007f\u001a\u0004\u0018\u00010v8\u0006\u00a2\u0006\r\n\u0004\u0008\u007f\u0010}\u001a\u0005\u0008\u0080\u0001\u0010zR%\u0010\u0084\u0001\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010\n8FX\u0086\u0084\u0002\u00a2\u0006\u000e\n\u0005\u0008\u0082\u0001\u0010x\u001a\u0005\u0008\u0083\u0001\u00100R%\u0010\u0087\u0001\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010\n8FX\u0086\u0084\u0002\u00a2\u0006\u000e\n\u0005\u0008\u0085\u0001\u0010x\u001a\u0005\u0008\u0086\u0001\u00100R\u0012\u0010$\u001a\u00020\u001d8F\u00a2\u0006\u0007\u001a\u0005\u0008\u0088\u0001\u0010A\u00a8\u0006\u0089\u0001"
    }
    d2 = {
        "Llive/hms/video/polls/models/HmsPoll;",
        "",
        "",
        "pollId",
        "title",
        "",
        "startedAt",
        "duration",
        "",
        "anonymous",
        "",
        "Llive/hms/video/polls/models/question/HMSPollQuestion;",
        "questions",
        "Llive/hms/video/polls/models/HmsPollUserTrackingMode;",
        "mode",
        "Llive/hms/video/polls/models/HmsPollCategory;",
        "category",
        "",
        "questionCount",
        "stoppedAt",
        "Llive/hms/video/polls/network/PollResultsDisplay;",
        "result",
        "_createdBy",
        "_startedBy",
        "_stoppedBy",
        "Llive/hms/video/sdk/SDKStore;",
        "store",
        "_rolesThatCanVote",
        "_rolesThatCanViewResponses",
        "Llive/hms/video/polls/models/HmsPollState;",
        "_state",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;ZLjava/util/List;Llive/hms/video/polls/models/HmsPollUserTrackingMode;Llive/hms/video/polls/models/HmsPollCategory;Ljava/lang/Integer;Ljava/lang/Long;Llive/hms/video/polls/network/PollResultsDisplay;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/SDKStore;Ljava/util/List;Ljava/util/List;Llive/hms/video/polls/models/HmsPollState;)V",
        "Llive/hms/video/sdk/models/HMSNotifications$StartedPolls;",
        "startedPolls",
        "sdkStore",
        "state",
        "(Llive/hms/video/sdk/models/HMSNotifications$StartedPolls;Ljava/util/List;Llive/hms/video/sdk/SDKStore;Llive/hms/video/polls/models/HmsPollState;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()J",
        "component4",
        "()Ljava/lang/Long;",
        "component5",
        "()Z",
        "component6",
        "()Ljava/util/List;",
        "component7",
        "()Llive/hms/video/polls/models/HmsPollUserTrackingMode;",
        "component8",
        "()Llive/hms/video/polls/models/HmsPollCategory;",
        "component9",
        "()Ljava/lang/Integer;",
        "component10",
        "component11",
        "()Llive/hms/video/polls/network/PollResultsDisplay;",
        "component12$lib_release",
        "component12",
        "component13$lib_release",
        "component13",
        "component14$lib_release",
        "component14",
        "component18$lib_release",
        "()Llive/hms/video/polls/models/HmsPollState;",
        "component18",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;ZLjava/util/List;Llive/hms/video/polls/models/HmsPollUserTrackingMode;Llive/hms/video/polls/models/HmsPollCategory;Ljava/lang/Integer;Ljava/lang/Long;Llive/hms/video/polls/network/PollResultsDisplay;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/SDKStore;Ljava/util/List;Ljava/util/List;Llive/hms/video/polls/models/HmsPollState;)Llive/hms/video/polls/models/HmsPoll;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "component15",
        "()Llive/hms/video/sdk/SDKStore;",
        "component16",
        "component17",
        "Ljava/lang/String;",
        "getPollId",
        "getTitle",
        "J",
        "getStartedAt",
        "Ljava/lang/Long;",
        "getDuration",
        "setDuration",
        "(Ljava/lang/Long;)V",
        "Z",
        "getAnonymous",
        "Ljava/util/List;",
        "getQuestions",
        "setQuestions",
        "(Ljava/util/List;)V",
        "Llive/hms/video/polls/models/HmsPollUserTrackingMode;",
        "getMode",
        "Llive/hms/video/polls/models/HmsPollCategory;",
        "getCategory",
        "Ljava/lang/Integer;",
        "getQuestionCount",
        "getStoppedAt",
        "setStoppedAt",
        "Llive/hms/video/polls/network/PollResultsDisplay;",
        "getResult",
        "setResult",
        "(Llive/hms/video/polls/network/PollResultsDisplay;)V",
        "get_createdBy$lib_release",
        "set_createdBy$lib_release",
        "(Ljava/lang/String;)V",
        "get_startedBy$lib_release",
        "set_startedBy$lib_release",
        "get_stoppedBy$lib_release",
        "set_stoppedBy$lib_release",
        "Llive/hms/video/sdk/SDKStore;",
        "Llive/hms/video/polls/models/HmsPollState;",
        "get_state$lib_release",
        "set_state$lib_release",
        "(Llive/hms/video/polls/models/HmsPollState;)V",
        "Llive/hms/video/sdk/models/HMSPeer;",
        "createdBy$delegate",
        "Ll83/h;",
        "getCreatedBy",
        "()Llive/hms/video/sdk/models/HMSPeer;",
        "createdBy",
        "startedBy",
        "Llive/hms/video/sdk/models/HMSPeer;",
        "getStartedBy",
        "stoppedBy",
        "getStoppedBy",
        "Llive/hms/video/sdk/models/role/HMSRole;",
        "rolesThatCanVote$delegate",
        "getRolesThatCanVote",
        "rolesThatCanVote",
        "rolesThatCanViewResponses$delegate",
        "getRolesThatCanViewResponses",
        "rolesThatCanViewResponses",
        "getState",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private _createdBy:Ljava/lang/String;

.field private final _rolesThatCanViewResponses:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final _rolesThatCanVote:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private _startedBy:Ljava/lang/String;

.field private _state:Llive/hms/video/polls/models/HmsPollState;

.field private _stoppedBy:Ljava/lang/String;

.field private final anonymous:Z

.field private final category:Llive/hms/video/polls/models/HmsPollCategory;

.field private final createdBy$delegate:Ll83/h;

.field private duration:Ljava/lang/Long;

.field private final mode:Llive/hms/video/polls/models/HmsPollUserTrackingMode;

.field private final pollId:Ljava/lang/String;

.field private final questionCount:Ljava/lang/Integer;

.field private questions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/question/HMSPollQuestion;",
            ">;"
        }
    .end annotation
.end field

.field private result:Llive/hms/video/polls/network/PollResultsDisplay;

.field private final rolesThatCanViewResponses$delegate:Ll83/h;

.field private final rolesThatCanVote$delegate:Ll83/h;

.field private final startedAt:J

.field private final startedBy:Llive/hms/video/sdk/models/HMSPeer;

.field private stoppedAt:Ljava/lang/Long;

.field private final stoppedBy:Llive/hms/video/sdk/models/HMSPeer;

.field private final store:Llive/hms/video/sdk/SDKStore;

.field private final title:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;ZLjava/util/List;Llive/hms/video/polls/models/HmsPollUserTrackingMode;Llive/hms/video/polls/models/HmsPollCategory;Ljava/lang/Integer;Ljava/lang/Long;Llive/hms/video/polls/network/PollResultsDisplay;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/SDKStore;Ljava/util/List;Ljava/util/List;Llive/hms/video/polls/models/HmsPollState;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "J",
            "Ljava/lang/Long;",
            "Z",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/question/HMSPollQuestion;",
            ">;",
            "Llive/hms/video/polls/models/HmsPollUserTrackingMode;",
            "Llive/hms/video/polls/models/HmsPollCategory;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Long;",
            "Llive/hms/video/polls/network/PollResultsDisplay;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Llive/hms/video/sdk/SDKStore;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Llive/hms/video/polls/models/HmsPollState;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p16

    move-object/from16 v1, p19

    const-string v2, "pollId"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "title"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "category"

    invoke-static {p9, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "store"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "_state"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Llive/hms/video/polls/models/HmsPoll;->pollId:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Llive/hms/video/polls/models/HmsPoll;->title:Ljava/lang/String;

    .line 4
    iput-wide p3, p0, Llive/hms/video/polls/models/HmsPoll;->startedAt:J

    .line 5
    iput-object p5, p0, Llive/hms/video/polls/models/HmsPoll;->duration:Ljava/lang/Long;

    .line 6
    iput-boolean p6, p0, Llive/hms/video/polls/models/HmsPoll;->anonymous:Z

    .line 7
    iput-object p7, p0, Llive/hms/video/polls/models/HmsPoll;->questions:Ljava/util/List;

    .line 8
    iput-object p8, p0, Llive/hms/video/polls/models/HmsPoll;->mode:Llive/hms/video/polls/models/HmsPollUserTrackingMode;

    .line 9
    iput-object p9, p0, Llive/hms/video/polls/models/HmsPoll;->category:Llive/hms/video/polls/models/HmsPollCategory;

    .line 10
    iput-object p10, p0, Llive/hms/video/polls/models/HmsPoll;->questionCount:Ljava/lang/Integer;

    .line 11
    iput-object p11, p0, Llive/hms/video/polls/models/HmsPoll;->stoppedAt:Ljava/lang/Long;

    .line 12
    iput-object p12, p0, Llive/hms/video/polls/models/HmsPoll;->result:Llive/hms/video/polls/network/PollResultsDisplay;

    move-object/from16 p1, p13

    .line 13
    iput-object p1, p0, Llive/hms/video/polls/models/HmsPoll;->_createdBy:Ljava/lang/String;

    move-object/from16 p1, p14

    .line 14
    iput-object p1, p0, Llive/hms/video/polls/models/HmsPoll;->_startedBy:Ljava/lang/String;

    move-object/from16 p1, p15

    .line 15
    iput-object p1, p0, Llive/hms/video/polls/models/HmsPoll;->_stoppedBy:Ljava/lang/String;

    .line 16
    iput-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->store:Llive/hms/video/sdk/SDKStore;

    move-object/from16 p1, p17

    .line 17
    iput-object p1, p0, Llive/hms/video/polls/models/HmsPoll;->_rolesThatCanVote:Ljava/util/List;

    move-object/from16 p1, p18

    .line 18
    iput-object p1, p0, Llive/hms/video/polls/models/HmsPoll;->_rolesThatCanViewResponses:Ljava/util/List;

    .line 19
    iput-object v1, p0, Llive/hms/video/polls/models/HmsPoll;->_state:Llive/hms/video/polls/models/HmsPollState;

    .line 20
    new-instance p1, Lid3/a;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lid3/a;-><init>(Llive/hms/video/polls/models/HmsPoll;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/polls/models/HmsPoll;->createdBy$delegate:Ll83/h;

    .line 21
    iget-object p1, p0, Llive/hms/video/polls/models/HmsPoll;->_startedBy:Ljava/lang/String;

    invoke-virtual {v0, p1}, Llive/hms/video/sdk/SDKStore;->getPeerById(Ljava/lang/String;)Llive/hms/video/sdk/models/HMSPeer;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/polls/models/HmsPoll;->startedBy:Llive/hms/video/sdk/models/HMSPeer;

    .line 22
    iget-object p1, p0, Llive/hms/video/polls/models/HmsPoll;->_stoppedBy:Ljava/lang/String;

    invoke-virtual {v0, p1}, Llive/hms/video/sdk/SDKStore;->getPeerById(Ljava/lang/String;)Llive/hms/video/sdk/models/HMSPeer;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/polls/models/HmsPoll;->stoppedBy:Llive/hms/video/sdk/models/HMSPeer;

    .line 23
    new-instance p1, Lid3/a;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Lid3/a;-><init>(Llive/hms/video/polls/models/HmsPoll;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/polls/models/HmsPoll;->rolesThatCanVote$delegate:Ll83/h;

    .line 24
    new-instance p1, Lid3/a;

    const/4 p2, 0x2

    invoke-direct {p1, p0, p2}, Lid3/a;-><init>(Llive/hms/video/polls/models/HmsPoll;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/polls/models/HmsPoll;->rolesThatCanViewResponses$delegate:Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;ZLjava/util/List;Llive/hms/video/polls/models/HmsPollUserTrackingMode;Llive/hms/video/polls/models/HmsPollCategory;Ljava/lang/Integer;Ljava/lang/Long;Llive/hms/video/polls/network/PollResultsDisplay;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/SDKStore;Ljava/util/List;Ljava/util/List;Llive/hms/video/polls/models/HmsPollState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 23

    move/from16 v0, p20

    and-int/lit16 v1, v0, 0x100

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v13, v2

    goto :goto_0

    :cond_0
    move-object/from16 v13, p10

    :goto_0
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_1

    move-object v14, v2

    goto :goto_1

    :cond_1
    move-object/from16 v14, p11

    :goto_1
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_2

    move-object v15, v2

    goto :goto_2

    :cond_2
    move-object/from16 v15, p12

    :goto_2
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_3

    move-object/from16 v16, v2

    goto :goto_3

    :cond_3
    move-object/from16 v16, p13

    :goto_3
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_4

    move-object/from16 v17, v2

    goto :goto_4

    :cond_4
    move-object/from16 v17, p14

    :goto_4
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_5

    move-object/from16 v18, v2

    :goto_5
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-wide/from16 v6, p3

    move-object/from16 v8, p5

    move/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    move-object/from16 v12, p9

    move-object/from16 v19, p16

    move-object/from16 v20, p17

    move-object/from16 v21, p18

    move-object/from16 v22, p19

    goto :goto_6

    :cond_5
    move-object/from16 v18, p15

    goto :goto_5

    .line 25
    :goto_6
    invoke-direct/range {v3 .. v22}, Llive/hms/video/polls/models/HmsPoll;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;ZLjava/util/List;Llive/hms/video/polls/models/HmsPollUserTrackingMode;Llive/hms/video/polls/models/HmsPollCategory;Ljava/lang/Integer;Ljava/lang/Long;Llive/hms/video/polls/network/PollResultsDisplay;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/SDKStore;Ljava/util/List;Ljava/util/List;Llive/hms/video/polls/models/HmsPollState;)V

    return-void
.end method

.method public constructor <init>(Llive/hms/video/sdk/models/HMSNotifications$StartedPolls;Ljava/util/List;Llive/hms/video/sdk/SDKStore;Llive/hms/video/polls/models/HmsPollState;)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/models/HMSNotifications$StartedPolls;",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/question/HMSPollQuestion;",
            ">;",
            "Llive/hms/video/sdk/SDKStore;",
            "Llive/hms/video/polls/models/HmsPollState;",
            ")V"
        }
    .end annotation

    const-string v0, "startedPolls"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sdkStore"

    move-object/from16 v2, p3

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    move-object/from16 v3, p4

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$StartedPolls;->getPollId()Ljava/lang/String;

    move-result-object v2

    .line 27
    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$StartedPolls;->getTitle()Ljava/lang/String;

    move-result-object v3

    .line 28
    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$StartedPolls;->getStartedAt()J

    move-result-wide v4

    .line 29
    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$StartedPolls;->getDuration()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    .line 30
    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$StartedPolls;->getAnonymous()Z

    move-result v7

    .line 31
    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$StartedPolls;->getPollUserTrackingMode()Llive/hms/video/polls/models/HmsPollUserTrackingMode;

    move-result-object v9

    .line 32
    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$StartedPolls;->getCategory()Llive/hms/video/polls/models/HmsPollCategory;

    move-result-object v10

    if-eqz p2, :cond_0

    .line 33
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_0
    move-object v11, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 34
    :goto_1
    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$StartedPolls;->getCreatedBy()Ljava/lang/String;

    move-result-object v14

    .line 35
    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$StartedPolls;->getStartedBy()Ljava/lang/String;

    move-result-object v15

    .line 36
    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$StartedPolls;->getEligibleVoters()Ljava/util/List;

    move-result-object v18

    .line 37
    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$StartedPolls;->getEligibleToViewResponses()Ljava/util/List;

    move-result-object v19

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    move-object/from16 v1, p0

    move-object/from16 v8, p2

    move-object/from16 v17, p3

    move-object/from16 v20, p4

    .line 38
    invoke-direct/range {v1 .. v20}, Llive/hms/video/polls/models/HmsPoll;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;ZLjava/util/List;Llive/hms/video/polls/models/HmsPollUserTrackingMode;Llive/hms/video/polls/models/HmsPollCategory;Ljava/lang/Integer;Ljava/lang/Long;Llive/hms/video/polls/network/PollResultsDisplay;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/SDKStore;Ljava/util/List;Ljava/util/List;Llive/hms/video/polls/models/HmsPollState;)V

    return-void
.end method

.method public static synthetic a(Llive/hms/video/polls/models/HmsPoll;)Llive/hms/video/sdk/models/HMSPeer;
    .locals 0

    invoke-static {p0}, Llive/hms/video/polls/models/HmsPoll;->createdBy_delegate$lambda$0(Llive/hms/video/polls/models/HmsPoll;)Llive/hms/video/sdk/models/HMSPeer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llive/hms/video/polls/models/HmsPoll;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Llive/hms/video/polls/models/HmsPoll;->rolesThatCanVote_delegate$lambda$2(Llive/hms/video/polls/models/HmsPoll;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Llive/hms/video/polls/models/HmsPoll;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Llive/hms/video/polls/models/HmsPoll;->rolesThatCanViewResponses_delegate$lambda$4(Llive/hms/video/polls/models/HmsPoll;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final component15()Llive/hms/video/sdk/SDKStore;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->store:Llive/hms/video/sdk/SDKStore;

    return-object v0
.end method

.method private final component16()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->_rolesThatCanVote:Ljava/util/List;

    return-object v0
.end method

.method private final component17()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->_rolesThatCanViewResponses:Ljava/util/List;

    return-object v0
.end method

.method public static synthetic copy$default(Llive/hms/video/polls/models/HmsPoll;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;ZLjava/util/List;Llive/hms/video/polls/models/HmsPollUserTrackingMode;Llive/hms/video/polls/models/HmsPollCategory;Ljava/lang/Integer;Ljava/lang/Long;Llive/hms/video/polls/network/PollResultsDisplay;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/SDKStore;Ljava/util/List;Ljava/util/List;Llive/hms/video/polls/models/HmsPollState;ILjava/lang/Object;)Llive/hms/video/polls/models/HmsPoll;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p20

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Llive/hms/video/polls/models/HmsPoll;->pollId:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Llive/hms/video/polls/models/HmsPoll;->title:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-wide v4, v0, Llive/hms/video/polls/models/HmsPoll;->startedAt:J

    goto :goto_2

    :cond_2
    move-wide/from16 v4, p3

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget-object v6, v0, Llive/hms/video/polls/models/HmsPoll;->duration:Ljava/lang/Long;

    goto :goto_3

    :cond_3
    move-object/from16 v6, p5

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget-boolean v7, v0, Llive/hms/video/polls/models/HmsPoll;->anonymous:Z

    goto :goto_4

    :cond_4
    move/from16 v7, p6

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget-object v8, v0, Llive/hms/video/polls/models/HmsPoll;->questions:Ljava/util/List;

    goto :goto_5

    :cond_5
    move-object/from16 v8, p7

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget-object v9, v0, Llive/hms/video/polls/models/HmsPoll;->mode:Llive/hms/video/polls/models/HmsPollUserTrackingMode;

    goto :goto_6

    :cond_6
    move-object/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget-object v10, v0, Llive/hms/video/polls/models/HmsPoll;->category:Llive/hms/video/polls/models/HmsPollCategory;

    goto :goto_7

    :cond_7
    move-object/from16 v10, p9

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget-object v11, v0, Llive/hms/video/polls/models/HmsPoll;->questionCount:Ljava/lang/Integer;

    goto :goto_8

    :cond_8
    move-object/from16 v11, p10

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget-object v12, v0, Llive/hms/video/polls/models/HmsPoll;->stoppedAt:Ljava/lang/Long;

    goto :goto_9

    :cond_9
    move-object/from16 v12, p11

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget-object v13, v0, Llive/hms/video/polls/models/HmsPoll;->result:Llive/hms/video/polls/network/PollResultsDisplay;

    goto :goto_a

    :cond_a
    move-object/from16 v13, p12

    :goto_a
    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget-object v14, v0, Llive/hms/video/polls/models/HmsPoll;->_createdBy:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v14, p13

    :goto_b
    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget-object v15, v0, Llive/hms/video/polls/models/HmsPoll;->_startedBy:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v15, p14

    :goto_c
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x2000

    if-eqz v2, :cond_d

    iget-object v2, v0, Llive/hms/video/polls/models/HmsPoll;->_stoppedBy:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v2, p15

    :goto_d
    move-object/from16 p2, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Llive/hms/video/polls/models/HmsPoll;->store:Llive/hms/video/sdk/SDKStore;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p16

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Llive/hms/video/polls/models/HmsPoll;->_rolesThatCanVote:Ljava/util/List;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p17

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p20, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Llive/hms/video/polls/models/HmsPoll;->_rolesThatCanViewResponses:Ljava/util/List;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p18

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p20, v16

    if-eqz v16, :cond_11

    move-object/from16 p4, v1

    iget-object v1, v0, Llive/hms/video/polls/models/HmsPoll;->_state:Llive/hms/video/polls/models/HmsPollState;

    move-object/from16 p19, p4

    move-object/from16 p20, v1

    :goto_11
    move-object/from16 p16, p2

    move-object/from16 p18, p3

    move-object/from16 p17, v2

    move-object/from16 p3, v3

    move-wide/from16 p4, v4

    move-object/from16 p6, v6

    move/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_12

    :cond_11
    move-object/from16 p20, p19

    move-object/from16 p19, v1

    goto :goto_11

    :goto_12
    invoke-virtual/range {p1 .. p20}, Llive/hms/video/polls/models/HmsPoll;->copy(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;ZLjava/util/List;Llive/hms/video/polls/models/HmsPollUserTrackingMode;Llive/hms/video/polls/models/HmsPollCategory;Ljava/lang/Integer;Ljava/lang/Long;Llive/hms/video/polls/network/PollResultsDisplay;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/SDKStore;Ljava/util/List;Ljava/util/List;Llive/hms/video/polls/models/HmsPollState;)Llive/hms/video/polls/models/HmsPoll;

    move-result-object v0

    return-object v0
.end method

.method private static final createdBy_delegate$lambda$0(Llive/hms/video/polls/models/HmsPoll;)Llive/hms/video/sdk/models/HMSPeer;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->store:Llive/hms/video/sdk/SDKStore;

    iget-object p0, p0, Llive/hms/video/polls/models/HmsPoll;->_createdBy:Ljava/lang/String;

    invoke-virtual {v0, p0}, Llive/hms/video/sdk/SDKStore;->getPeerById(Ljava/lang/String;)Llive/hms/video/sdk/models/HMSPeer;

    move-result-object p0

    return-object p0
.end method

.method private static final rolesThatCanViewResponses_delegate$lambda$4(Llive/hms/video/polls/models/HmsPoll;)Ljava/util/List;
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->_rolesThatCanViewResponses:Ljava/util/List;

    if-eqz v0, :cond_2

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Llive/hms/video/polls/models/HmsPoll;->store:Llive/hms/video/sdk/SDKStore;

    invoke-virtual {v3}, Llive/hms/video/sdk/SDKStore;->getRolesMap()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llive/hms/video/sdk/models/role/HMSRole;

    if-eqz v2, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1

    :cond_2
    sget-object p0, Lm83/y;->w:Lm83/y;

    return-object p0
.end method

.method private static final rolesThatCanVote_delegate$lambda$2(Llive/hms/video/polls/models/HmsPoll;)Ljava/util/List;
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->_rolesThatCanVote:Ljava/util/List;

    if-eqz v0, :cond_2

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Llive/hms/video/polls/models/HmsPoll;->store:Llive/hms/video/sdk/SDKStore;

    invoke-virtual {v3}, Llive/hms/video/sdk/SDKStore;->getRolesMap()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llive/hms/video/sdk/models/role/HMSRole;

    if-eqz v2, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1

    :cond_2
    sget-object p0, Lm83/y;->w:Lm83/y;

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->pollId:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->stoppedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public final component11()Llive/hms/video/polls/network/PollResultsDisplay;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->result:Llive/hms/video/polls/network/PollResultsDisplay;

    return-object v0
.end method

.method public final component12$lib_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->_createdBy:Ljava/lang/String;

    return-object v0
.end method

.method public final component13$lib_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->_startedBy:Ljava/lang/String;

    return-object v0
.end method

.method public final component14$lib_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->_stoppedBy:Ljava/lang/String;

    return-object v0
.end method

.method public final component18$lib_release()Llive/hms/video/polls/models/HmsPollState;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->_state:Llive/hms/video/polls/models/HmsPollState;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/polls/models/HmsPoll;->startedAt:J

    return-wide v0
.end method

.method public final component4()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->duration:Ljava/lang/Long;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/polls/models/HmsPoll;->anonymous:Z

    return v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/question/HMSPollQuestion;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->questions:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Llive/hms/video/polls/models/HmsPollUserTrackingMode;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->mode:Llive/hms/video/polls/models/HmsPollUserTrackingMode;

    return-object v0
.end method

.method public final component8()Llive/hms/video/polls/models/HmsPollCategory;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->category:Llive/hms/video/polls/models/HmsPollCategory;

    return-object v0
.end method

.method public final component9()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->questionCount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;ZLjava/util/List;Llive/hms/video/polls/models/HmsPollUserTrackingMode;Llive/hms/video/polls/models/HmsPollCategory;Ljava/lang/Integer;Ljava/lang/Long;Llive/hms/video/polls/network/PollResultsDisplay;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/SDKStore;Ljava/util/List;Ljava/util/List;Llive/hms/video/polls/models/HmsPollState;)Llive/hms/video/polls/models/HmsPoll;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "J",
            "Ljava/lang/Long;",
            "Z",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/question/HMSPollQuestion;",
            ">;",
            "Llive/hms/video/polls/models/HmsPollUserTrackingMode;",
            "Llive/hms/video/polls/models/HmsPollCategory;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Long;",
            "Llive/hms/video/polls/network/PollResultsDisplay;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Llive/hms/video/sdk/SDKStore;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Llive/hms/video/polls/models/HmsPollState;",
            ")",
            "Llive/hms/video/polls/models/HmsPoll;"
        }
    .end annotation

    const-string v0, "pollId"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "category"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "store"

    move-object/from16 v1, p16

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "_state"

    move-object/from16 v4, p19

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/polls/models/HmsPoll;

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, v4

    move-wide/from16 v4, p3

    invoke-direct/range {v1 .. v20}, Llive/hms/video/polls/models/HmsPoll;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;ZLjava/util/List;Llive/hms/video/polls/models/HmsPollUserTrackingMode;Llive/hms/video/polls/models/HmsPollCategory;Ljava/lang/Integer;Ljava/lang/Long;Llive/hms/video/polls/network/PollResultsDisplay;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/SDKStore;Ljava/util/List;Ljava/util/List;Llive/hms/video/polls/models/HmsPollState;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/polls/models/HmsPoll;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/polls/models/HmsPoll;

    iget-object v1, p0, Llive/hms/video/polls/models/HmsPoll;->pollId:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/polls/models/HmsPoll;->pollId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/polls/models/HmsPoll;->title:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/polls/models/HmsPoll;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Llive/hms/video/polls/models/HmsPoll;->startedAt:J

    iget-wide v5, p1, Llive/hms/video/polls/models/HmsPoll;->startedAt:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Llive/hms/video/polls/models/HmsPoll;->duration:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/polls/models/HmsPoll;->duration:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Llive/hms/video/polls/models/HmsPoll;->anonymous:Z

    iget-boolean v3, p1, Llive/hms/video/polls/models/HmsPoll;->anonymous:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Llive/hms/video/polls/models/HmsPoll;->questions:Ljava/util/List;

    iget-object v3, p1, Llive/hms/video/polls/models/HmsPoll;->questions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Llive/hms/video/polls/models/HmsPoll;->mode:Llive/hms/video/polls/models/HmsPollUserTrackingMode;

    iget-object v3, p1, Llive/hms/video/polls/models/HmsPoll;->mode:Llive/hms/video/polls/models/HmsPollUserTrackingMode;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Llive/hms/video/polls/models/HmsPoll;->category:Llive/hms/video/polls/models/HmsPollCategory;

    iget-object v3, p1, Llive/hms/video/polls/models/HmsPoll;->category:Llive/hms/video/polls/models/HmsPollCategory;

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Llive/hms/video/polls/models/HmsPoll;->questionCount:Ljava/lang/Integer;

    iget-object v3, p1, Llive/hms/video/polls/models/HmsPoll;->questionCount:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Llive/hms/video/polls/models/HmsPoll;->stoppedAt:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/polls/models/HmsPoll;->stoppedAt:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Llive/hms/video/polls/models/HmsPoll;->result:Llive/hms/video/polls/network/PollResultsDisplay;

    iget-object v3, p1, Llive/hms/video/polls/models/HmsPoll;->result:Llive/hms/video/polls/network/PollResultsDisplay;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Llive/hms/video/polls/models/HmsPoll;->_createdBy:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/polls/models/HmsPoll;->_createdBy:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Llive/hms/video/polls/models/HmsPoll;->_startedBy:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/polls/models/HmsPoll;->_startedBy:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Llive/hms/video/polls/models/HmsPoll;->_stoppedBy:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/polls/models/HmsPoll;->_stoppedBy:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Llive/hms/video/polls/models/HmsPoll;->store:Llive/hms/video/sdk/SDKStore;

    iget-object v3, p1, Llive/hms/video/polls/models/HmsPoll;->store:Llive/hms/video/sdk/SDKStore;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Llive/hms/video/polls/models/HmsPoll;->_rolesThatCanVote:Ljava/util/List;

    iget-object v3, p1, Llive/hms/video/polls/models/HmsPoll;->_rolesThatCanVote:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Llive/hms/video/polls/models/HmsPoll;->_rolesThatCanViewResponses:Ljava/util/List;

    iget-object v3, p1, Llive/hms/video/polls/models/HmsPoll;->_rolesThatCanViewResponses:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Llive/hms/video/polls/models/HmsPoll;->_state:Llive/hms/video/polls/models/HmsPollState;

    iget-object p1, p1, Llive/hms/video/polls/models/HmsPoll;->_state:Llive/hms/video/polls/models/HmsPollState;

    if-eq v1, p1, :cond_13

    return v2

    :cond_13
    return v0
.end method

.method public final getAnonymous()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/polls/models/HmsPoll;->anonymous:Z

    return v0
.end method

.method public final getCategory()Llive/hms/video/polls/models/HmsPollCategory;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->category:Llive/hms/video/polls/models/HmsPollCategory;

    return-object v0
.end method

.method public final getCreatedBy()Llive/hms/video/sdk/models/HMSPeer;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->createdBy$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llive/hms/video/sdk/models/HMSPeer;

    return-object v0
.end method

.method public final getDuration()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->duration:Ljava/lang/Long;

    return-object v0
.end method

.method public final getMode()Llive/hms/video/polls/models/HmsPollUserTrackingMode;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->mode:Llive/hms/video/polls/models/HmsPollUserTrackingMode;

    return-object v0
.end method

.method public final getPollId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->pollId:Ljava/lang/String;

    return-object v0
.end method

.method public final getQuestionCount()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->questionCount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getQuestions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/question/HMSPollQuestion;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->questions:Ljava/util/List;

    return-object v0
.end method

.method public final getResult()Llive/hms/video/polls/network/PollResultsDisplay;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->result:Llive/hms/video/polls/network/PollResultsDisplay;

    return-object v0
.end method

.method public final getRolesThatCanViewResponses()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/role/HMSRole;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->rolesThatCanViewResponses$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final getRolesThatCanVote()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/role/HMSRole;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->rolesThatCanVote$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final getStartedAt()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/polls/models/HmsPoll;->startedAt:J

    return-wide v0
.end method

.method public final getStartedBy()Llive/hms/video/sdk/models/HMSPeer;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->startedBy:Llive/hms/video/sdk/models/HMSPeer;

    return-object v0
.end method

.method public final getState()Llive/hms/video/polls/models/HmsPollState;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->_state:Llive/hms/video/polls/models/HmsPollState;

    return-object v0
.end method

.method public final getStoppedAt()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->stoppedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public final getStoppedBy()Llive/hms/video/sdk/models/HMSPeer;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->stoppedBy:Llive/hms/video/sdk/models/HMSPeer;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final get_createdBy$lib_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->_createdBy:Ljava/lang/String;

    return-object v0
.end method

.method public final get_startedBy$lib_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->_startedBy:Ljava/lang/String;

    return-object v0
.end method

.method public final get_state$lib_release()Llive/hms/video/polls/models/HmsPollState;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->_state:Llive/hms/video/polls/models/HmsPollState;

    return-object v0
.end method

.method public final get_stoppedBy$lib_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->_stoppedBy:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->pollId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Llive/hms/video/polls/models/HmsPoll;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-wide v2, p0, Llive/hms/video/polls/models/HmsPoll;->startedAt:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-object v2, p0, Llive/hms/video/polls/models/HmsPoll;->duration:Ljava/lang/Long;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Llive/hms/video/polls/models/HmsPoll;->anonymous:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Llive/hms/video/polls/models/HmsPoll;->questions:Ljava/util/List;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Llive/hms/video/polls/models/HmsPoll;->mode:Llive/hms/video/polls/models/HmsPollUserTrackingMode;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Llive/hms/video/polls/models/HmsPoll;->category:Llive/hms/video/polls/models/HmsPollCategory;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->questionCount:Ljava/lang/Integer;

    if-nez v0, :cond_3

    move v0, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_3
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->stoppedAt:Ljava/lang/Long;

    if-nez v0, :cond_4

    move v0, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_4
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->result:Llive/hms/video/polls/network/PollResultsDisplay;

    if-nez v0, :cond_5

    move v0, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v0}, Llive/hms/video/polls/network/PollResultsDisplay;->hashCode()I

    move-result v0

    :goto_5
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->_createdBy:Ljava/lang/String;

    if-nez v0, :cond_6

    move v0, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_6
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->_startedBy:Ljava/lang/String;

    if-nez v0, :cond_7

    move v0, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_7
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->_stoppedBy:Ljava/lang/String;

    if-nez v0, :cond_8

    move v0, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_8
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPoll;->store:Llive/hms/video/sdk/SDKStore;

    invoke-virtual {v0}, Llive/hms/video/sdk/SDKStore;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Llive/hms/video/polls/models/HmsPoll;->_rolesThatCanVote:Ljava/util/List;

    if-nez v2, :cond_9

    move v2, v3

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Llive/hms/video/polls/models/HmsPoll;->_rolesThatCanViewResponses:Ljava/util/List;

    if-nez v2, :cond_a

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_a
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Llive/hms/video/polls/models/HmsPoll;->_state:Llive/hms/video/polls/models/HmsPollState;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final setDuration(Ljava/lang/Long;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/polls/models/HmsPoll;->duration:Ljava/lang/Long;

    return-void
.end method

.method public final setQuestions(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/question/HMSPollQuestion;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/polls/models/HmsPoll;->questions:Ljava/util/List;

    return-void
.end method

.method public final setResult(Llive/hms/video/polls/network/PollResultsDisplay;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/polls/models/HmsPoll;->result:Llive/hms/video/polls/network/PollResultsDisplay;

    return-void
.end method

.method public final setStoppedAt(Ljava/lang/Long;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/polls/models/HmsPoll;->stoppedAt:Ljava/lang/Long;

    return-void
.end method

.method public final set_createdBy$lib_release(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/polls/models/HmsPoll;->_createdBy:Ljava/lang/String;

    return-void
.end method

.method public final set_startedBy$lib_release(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/polls/models/HmsPoll;->_startedBy:Ljava/lang/String;

    return-void
.end method

.method public final set_state$lib_release(Llive/hms/video/polls/models/HmsPollState;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/polls/models/HmsPoll;->_state:Llive/hms/video/polls/models/HmsPollState;

    return-void
.end method

.method public final set_stoppedBy$lib_release(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/polls/models/HmsPoll;->_stoppedBy:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HmsPoll(pollId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/polls/models/HmsPoll;->pollId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/HmsPoll;->title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", startedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/polls/models/HmsPoll;->startedAt:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", duration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/HmsPoll;->duration:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", anonymous="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/polls/models/HmsPoll;->anonymous:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", questions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/HmsPoll;->questions:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/HmsPoll;->mode:Llive/hms/video/polls/models/HmsPollUserTrackingMode;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", category="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/HmsPoll;->category:Llive/hms/video/polls/models/HmsPollCategory;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", questionCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/HmsPoll;->questionCount:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", stoppedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/HmsPoll;->stoppedAt:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", result="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/HmsPoll;->result:Llive/hms/video/polls/network/PollResultsDisplay;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", _createdBy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/HmsPoll;->_createdBy:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", _startedBy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/HmsPoll;->_startedBy:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", _stoppedBy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/HmsPoll;->_stoppedBy:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", store="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/HmsPoll;->store:Llive/hms/video/sdk/SDKStore;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", _rolesThatCanVote="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/HmsPoll;->_rolesThatCanVote:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", _rolesThatCanViewResponses="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/HmsPoll;->_rolesThatCanViewResponses:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", _state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/HmsPoll;->_state:Llive/hms/video/polls/models/HmsPollState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
