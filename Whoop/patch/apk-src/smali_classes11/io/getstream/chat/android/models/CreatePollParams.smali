.class public final Lio/getstream/chat/android/models/CreatePollParams;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008(\u0008\u0086\u0008\u0018\u00002\u00020\u0001Be\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0008\u0012\u0006\u0010\u000c\u001a\u00020\u0008\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000e\u0012\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013Bs\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0008\u0012\u0014\u0008\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000e\u00a2\u0006\u0004\u0008\u0012\u0010\u0015J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0006H\u00c6\u0003J\t\u0010,\u001a\u00020\u0008H\u00c6\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\t\u0010.\u001a\u00020\u0008H\u00c6\u0003J\t\u0010/\u001a\u00020\u0008H\u00c6\u0003J\u0015\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000eH\u00c6\u0003J\u000f\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010H\u00c6\u0003J~\u00102\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00082\u0014\u0008\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000e2\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010H\u00c0\u0001\u00a2\u0006\u0004\u00083\u00104J\u0013\u00105\u001a\u00020\u00082\u0008\u00106\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00107\u001a\u00020\nH\u00d6\u0001J\t\u00108\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0015\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\u0008\u001d\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u001cR\u0011\u0010\u000c\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u001cR\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\"\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'R\u0017\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00108F\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010\'\u00a8\u00069"
    }
    d2 = {
        "Lio/getstream/chat/android/models/CreatePollParams;",
        "",
        "name",
        "",
        "description",
        "votingVisibility",
        "Lio/getstream/chat/android/models/VotingVisibility;",
        "enforceUniqueVote",
        "",
        "maxVotesAllowed",
        "",
        "allowUserSuggestedOptions",
        "allowAnswers",
        "extraData",
        "",
        "optionsWithExtraData",
        "",
        "Lio/getstream/chat/android/models/PollOption;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/VotingVisibility;ZLjava/lang/Integer;ZZLjava/util/Map;Ljava/util/List;)V",
        "options",
        "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lio/getstream/chat/android/models/VotingVisibility;ZLjava/lang/Integer;ZZLjava/util/Map;)V",
        "getName",
        "()Ljava/lang/String;",
        "getDescription",
        "getVotingVisibility",
        "()Lio/getstream/chat/android/models/VotingVisibility;",
        "getEnforceUniqueVote",
        "()Z",
        "getMaxVotesAllowed",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getAllowUserSuggestedOptions",
        "getAllowAnswers",
        "getExtraData",
        "()Ljava/util/Map;",
        "getOptionsWithExtraData$annotations",
        "()V",
        "getOptionsWithExtraData",
        "()Ljava/util/List;",
        "getOptions",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "copy$stream_chat_android_core",
        "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/VotingVisibility;ZLjava/lang/Integer;ZZLjava/util/Map;Ljava/util/List;)Lio/getstream/chat/android/models/CreatePollParams;",
        "equals",
        "other",
        "hashCode",
        "toString",
        "stream-chat-android-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final allowAnswers:Z

.field private final allowUserSuggestedOptions:Z

.field private final description:Ljava/lang/String;

.field private final enforceUniqueVote:Z

.field private final extraData:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final maxVotesAllowed:Ljava/lang/Integer;

.field private final name:Ljava/lang/String;

.field private final optionsWithExtraData:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/PollOption;",
            ">;"
        }
    .end annotation
.end field

.field private final votingVisibility:Lio/getstream/chat/android/models/VotingVisibility;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/VotingVisibility;ZLjava/lang/Integer;ZZLjava/util/Map;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/VotingVisibility;",
            "Z",
            "Ljava/lang/Integer;",
            "ZZ",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/PollOption;",
            ">;)V"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "votingVisibility"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "optionsWithExtraData"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/models/CreatePollParams;->name:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/models/CreatePollParams;->description:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/models/CreatePollParams;->votingVisibility:Lio/getstream/chat/android/models/VotingVisibility;

    .line 5
    iput-boolean p4, p0, Lio/getstream/chat/android/models/CreatePollParams;->enforceUniqueVote:Z

    .line 6
    iput-object p5, p0, Lio/getstream/chat/android/models/CreatePollParams;->maxVotesAllowed:Ljava/lang/Integer;

    .line 7
    iput-boolean p6, p0, Lio/getstream/chat/android/models/CreatePollParams;->allowUserSuggestedOptions:Z

    .line 8
    iput-boolean p7, p0, Lio/getstream/chat/android/models/CreatePollParams;->allowAnswers:Z

    .line 9
    iput-object p8, p0, Lio/getstream/chat/android/models/CreatePollParams;->extraData:Ljava/util/Map;

    .line 10
    iput-object p9, p0, Lio/getstream/chat/android/models/CreatePollParams;->optionsWithExtraData:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lio/getstream/chat/android/models/VotingVisibility;ZLjava/lang/Integer;ZZLjava/util/Map;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/PollOption;",
            ">;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/VotingVisibility;",
            "Z",
            "Ljava/lang/Integer;",
            "ZZ",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "votingVisibility"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    move-object/from16 v9, p9

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p0

    move-object v2, p1

    move-object v10, p2

    move-object v3, p3

    move-object v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    .line 16
    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/models/CreatePollParams;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/VotingVisibility;ZLjava/lang/Integer;ZZLjava/util/Map;Ljava/util/List;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lio/getstream/chat/android/models/VotingVisibility;ZLjava/lang/Integer;ZZLjava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_0

    .line 11
    const-string p3, ""

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, v0, 0x8

    if-eqz p3, :cond_1

    .line 12
    sget-object p3, Lio/getstream/chat/android/models/VotingVisibility;->PUBLIC:Lio/getstream/chat/android/models/VotingVisibility;

    move-object v4, p3

    goto :goto_0

    :cond_1
    move-object v4, p4

    :goto_0
    and-int/lit8 p3, v0, 0x10

    const/4 v1, 0x1

    if-eqz p3, :cond_2

    move v5, v1

    goto :goto_1

    :cond_2
    move v5, p5

    :goto_1
    and-int/lit8 p3, v0, 0x20

    if-eqz p3, :cond_3

    .line 13
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    move-object v6, p3

    goto :goto_2

    :cond_3
    move-object/from16 v6, p6

    :goto_2
    and-int/lit8 p3, v0, 0x40

    const/4 v1, 0x0

    if-eqz p3, :cond_4

    move v7, v1

    goto :goto_3

    :cond_4
    move/from16 v7, p7

    :goto_3
    and-int/lit16 p3, v0, 0x80

    if-eqz p3, :cond_5

    move v8, v1

    goto :goto_4

    :cond_5
    move/from16 v8, p8

    :goto_4
    and-int/lit16 p3, v0, 0x100

    if-eqz p3, :cond_6

    .line 14
    sget-object p3, Lm83/z;->w:Lm83/z;

    move-object v9, p3

    :goto_5
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    goto :goto_6

    :cond_6
    move-object/from16 v9, p9

    goto :goto_5

    .line 15
    :goto_6
    invoke-direct/range {v0 .. v9}, Lio/getstream/chat/android/models/CreatePollParams;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lio/getstream/chat/android/models/VotingVisibility;ZLjava/lang/Integer;ZZLjava/util/Map;)V

    return-void
.end method

.method public static synthetic copy$stream_chat_android_core$default(Lio/getstream/chat/android/models/CreatePollParams;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/VotingVisibility;ZLjava/lang/Integer;ZZLjava/util/Map;Ljava/util/List;ILjava/lang/Object;)Lio/getstream/chat/android/models/CreatePollParams;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/models/CreatePollParams;->name:Ljava/lang/String;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/models/CreatePollParams;->description:Ljava/lang/String;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/models/CreatePollParams;->votingVisibility:Lio/getstream/chat/android/models/VotingVisibility;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-boolean p4, p0, Lio/getstream/chat/android/models/CreatePollParams;->enforceUniqueVote:Z

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lio/getstream/chat/android/models/CreatePollParams;->maxVotesAllowed:Ljava/lang/Integer;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-boolean p6, p0, Lio/getstream/chat/android/models/CreatePollParams;->allowUserSuggestedOptions:Z

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-boolean p7, p0, Lio/getstream/chat/android/models/CreatePollParams;->allowAnswers:Z

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lio/getstream/chat/android/models/CreatePollParams;->extraData:Ljava/util/Map;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lio/getstream/chat/android/models/CreatePollParams;->optionsWithExtraData:Ljava/util/List;

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move p8, p6

    move p9, p7

    move p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lio/getstream/chat/android/models/CreatePollParams;->copy$stream_chat_android_core(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/VotingVisibility;ZLjava/lang/Integer;ZZLjava/util/Map;Ljava/util/List;)Lio/getstream/chat/android/models/CreatePollParams;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getOptionsWithExtraData$annotations()V
    .locals 0
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/CreatePollParams;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/CreatePollParams;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lio/getstream/chat/android/models/VotingVisibility;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/CreatePollParams;->votingVisibility:Lio/getstream/chat/android/models/VotingVisibility;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/CreatePollParams;->enforceUniqueVote:Z

    return v0
.end method

.method public final component5()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/CreatePollParams;->maxVotesAllowed:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/CreatePollParams;->allowUserSuggestedOptions:Z

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/CreatePollParams;->allowAnswers:Z

    return v0
.end method

.method public final component8()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/CreatePollParams;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final component9()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/PollOption;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/CreatePollParams;->optionsWithExtraData:Ljava/util/List;

    return-object v0
.end method

.method public final copy$stream_chat_android_core(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/VotingVisibility;ZLjava/lang/Integer;ZZLjava/util/Map;Ljava/util/List;)Lio/getstream/chat/android/models/CreatePollParams;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/VotingVisibility;",
            "Z",
            "Ljava/lang/Integer;",
            "ZZ",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/PollOption;",
            ">;)",
            "Lio/getstream/chat/android/models/CreatePollParams;"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "votingVisibility"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "optionsWithExtraData"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/models/CreatePollParams;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/models/CreatePollParams;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/VotingVisibility;ZLjava/lang/Integer;ZZLjava/util/Map;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/models/CreatePollParams;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/models/CreatePollParams;

    iget-object v1, p0, Lio/getstream/chat/android/models/CreatePollParams;->name:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/CreatePollParams;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/models/CreatePollParams;->description:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/CreatePollParams;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/models/CreatePollParams;->votingVisibility:Lio/getstream/chat/android/models/VotingVisibility;

    iget-object v3, p1, Lio/getstream/chat/android/models/CreatePollParams;->votingVisibility:Lio/getstream/chat/android/models/VotingVisibility;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lio/getstream/chat/android/models/CreatePollParams;->enforceUniqueVote:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/models/CreatePollParams;->enforceUniqueVote:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/models/CreatePollParams;->maxVotesAllowed:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/chat/android/models/CreatePollParams;->maxVotesAllowed:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lio/getstream/chat/android/models/CreatePollParams;->allowUserSuggestedOptions:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/models/CreatePollParams;->allowUserSuggestedOptions:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lio/getstream/chat/android/models/CreatePollParams;->allowAnswers:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/models/CreatePollParams;->allowAnswers:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/models/CreatePollParams;->extraData:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/models/CreatePollParams;->extraData:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/chat/android/models/CreatePollParams;->optionsWithExtraData:Ljava/util/List;

    iget-object p1, p1, Lio/getstream/chat/android/models/CreatePollParams;->optionsWithExtraData:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getAllowAnswers()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/CreatePollParams;->allowAnswers:Z

    return v0
.end method

.method public final getAllowUserSuggestedOptions()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/CreatePollParams;->allowUserSuggestedOptions:Z

    return v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/CreatePollParams;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getEnforceUniqueVote()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/CreatePollParams;->enforceUniqueVote:Z

    return v0
.end method

.method public final getExtraData()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/CreatePollParams;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final getMaxVotesAllowed()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/CreatePollParams;->maxVotesAllowed:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/CreatePollParams;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getOptions()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/CreatePollParams;->optionsWithExtraData:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/PollOption;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/PollOption;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public final getOptionsWithExtraData()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/PollOption;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/CreatePollParams;->optionsWithExtraData:Ljava/util/List;

    return-object v0
.end method

.method public final getVotingVisibility()Lio/getstream/chat/android/models/VotingVisibility;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/CreatePollParams;->votingVisibility:Lio/getstream/chat/android/models/VotingVisibility;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/models/CreatePollParams;->name:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/CreatePollParams;->description:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/CreatePollParams;->votingVisibility:Lio/getstream/chat/android/models/VotingVisibility;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/CreatePollParams;->enforceUniqueVote:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/CreatePollParams;->maxVotesAllowed:Ljava/lang/Integer;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/chat/android/models/CreatePollParams;->allowUserSuggestedOptions:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/models/CreatePollParams;->allowAnswers:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/CreatePollParams;->extraData:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/models/CreatePollParams;->optionsWithExtraData:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lio/getstream/chat/android/models/CreatePollParams;->name:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/models/CreatePollParams;->description:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/models/CreatePollParams;->votingVisibility:Lio/getstream/chat/android/models/VotingVisibility;

    iget-boolean v3, p0, Lio/getstream/chat/android/models/CreatePollParams;->enforceUniqueVote:Z

    iget-object v4, p0, Lio/getstream/chat/android/models/CreatePollParams;->maxVotesAllowed:Ljava/lang/Integer;

    iget-boolean v5, p0, Lio/getstream/chat/android/models/CreatePollParams;->allowUserSuggestedOptions:Z

    iget-boolean v6, p0, Lio/getstream/chat/android/models/CreatePollParams;->allowAnswers:Z

    iget-object v7, p0, Lio/getstream/chat/android/models/CreatePollParams;->extraData:Ljava/util/Map;

    iget-object v8, p0, Lio/getstream/chat/android/models/CreatePollParams;->optionsWithExtraData:Ljava/util/List;

    const-string v9, ", description="

    const-string v10, ", votingVisibility="

    const-string v11, "CreatePollParams(name="

    invoke-static {v11, v0, v9, v1, v10}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", enforceUniqueVote="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", maxVotesAllowed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", allowUserSuggestedOptions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", allowAnswers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", extraData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", optionsWithExtraData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v0, v8, v1}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
