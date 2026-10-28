.class public final Lio/getstream/chat/android/models/Poll;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\"\n\u0002\u0010\u000f\n\u0002\u0008\u001c\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u00df\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000c\u0012\u0006\u0010\u0010\u001a\u00020\u000c\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0013\u0012\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0007\u0012\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u000c\u0012\u0006\u0010\u001b\u001a\u00020\u000e\u0012\u000e\u0008\u0002\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u0007\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\u0014\u0008\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!0\u0013\u00a2\u0006\u0004\u0008\"\u0010#J\u0014\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00072\u0006\u0010B\u001a\u00020\u0008J\u0016\u0010C\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010D2\u0006\u0010E\u001a\u00020\u0003H\u0016J\t\u0010F\u001a\u00020\u0003H\u00c6\u0003J\t\u0010G\u001a\u00020\u0003H\u00c6\u0003J\t\u0010H\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010I\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0003J\t\u0010J\u001a\u00020\nH\u00c6\u0003J\t\u0010K\u001a\u00020\u000cH\u00c6\u0003J\u0010\u0010L\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010/J\t\u0010M\u001a\u00020\u000cH\u00c6\u0003J\t\u0010N\u001a\u00020\u000cH\u00c6\u0003J\t\u0010O\u001a\u00020\u000eH\u00c6\u0003J\u0015\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0013H\u00c6\u0003J\u000f\u0010Q\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0007H\u00c6\u0003J\u000f\u0010R\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0007H\u00c6\u0003J\t\u0010S\u001a\u00020\u0018H\u00c6\u0003J\t\u0010T\u001a\u00020\u0018H\u00c6\u0003J\t\u0010U\u001a\u00020\u000cH\u00c6\u0003J\t\u0010V\u001a\u00020\u000eH\u00c6\u0003J\u000f\u0010W\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u0007H\u00c6\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u001fH\u00c6\u0003J\u0015\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!0\u0013H\u00c6\u0003J\u008a\u0002\u0010Z\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000e2\u0014\u0008\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u00132\u000e\u0008\u0002\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00072\u000e\u0008\u0002\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00072\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00182\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00182\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u000e2\u000e\u0008\u0002\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u00072\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0014\u0008\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!0\u0013H\u00c6\u0001\u00a2\u0006\u0002\u0010[J\u0013\u0010\\\u001a\u00020\u000c2\u0008\u0010]\u001a\u0004\u0018\u00010!H\u00d6\u0003J\t\u0010^\u001a\u00020\u000eH\u00d6\u0001J\t\u0010_\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010%R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010%R\u0017\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010)R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010+R\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010-R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\n\n\u0002\u00100\u001a\u0004\u0008.\u0010/R\u0011\u0010\u000f\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u0010-R\u0011\u0010\u0010\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u0010-R\u0011\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u00104R\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00085\u00106R\u0017\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00087\u0010)R\u0017\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00088\u0010)R\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00089\u0010:R\u0011\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008;\u0010:R\u0011\u0010\u001a\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008<\u0010-R\u0011\u0010\u001b\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008=\u00104R\u0017\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008>\u0010)R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008?\u0010@R\u001d\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!0\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008A\u00106\u00a8\u0006`"
    }
    d2 = {
        "Lio/getstream/chat/android/models/Poll;",
        "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;",
        "id",
        "",
        "name",
        "description",
        "options",
        "",
        "Lio/getstream/chat/android/models/Option;",
        "votingVisibility",
        "Lio/getstream/chat/android/models/VotingVisibility;",
        "enforceUniqueVote",
        "",
        "maxVotesAllowed",
        "",
        "allowUserSuggestedOptions",
        "allowAnswers",
        "voteCount",
        "voteCountsByOption",
        "",
        "votes",
        "Lio/getstream/chat/android/models/Vote;",
        "ownVotes",
        "createdAt",
        "Ljava/util/Date;",
        "updatedAt",
        "closed",
        "answersCount",
        "answers",
        "Lio/getstream/chat/android/models/Answer;",
        "createdBy",
        "Lio/getstream/chat/android/models/User;",
        "extraData",
        "",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/VotingVisibility;ZLjava/lang/Integer;ZZILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;ZILjava/util/List;Lio/getstream/chat/android/models/User;Ljava/util/Map;)V",
        "getId",
        "()Ljava/lang/String;",
        "getName",
        "getDescription",
        "getOptions",
        "()Ljava/util/List;",
        "getVotingVisibility",
        "()Lio/getstream/chat/android/models/VotingVisibility;",
        "getEnforceUniqueVote",
        "()Z",
        "getMaxVotesAllowed",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getAllowUserSuggestedOptions",
        "getAllowAnswers",
        "getVoteCount",
        "()I",
        "getVoteCountsByOption",
        "()Ljava/util/Map;",
        "getVotes",
        "getOwnVotes",
        "getCreatedAt",
        "()Ljava/util/Date;",
        "getUpdatedAt",
        "getClosed",
        "getAnswersCount",
        "getAnswers",
        "getCreatedBy",
        "()Lio/getstream/chat/android/models/User;",
        "getExtraData",
        "option",
        "getComparableField",
        "",
        "fieldName",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component20",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/VotingVisibility;ZLjava/lang/Integer;ZZILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;ZILjava/util/List;Lio/getstream/chat/android/models/User;Ljava/util/Map;)Lio/getstream/chat/android/models/Poll;",
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

.field private final answers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Answer;",
            ">;"
        }
    .end annotation
.end field

.field private final answersCount:I

.field private final closed:Z

.field private final createdAt:Ljava/util/Date;

.field private final createdBy:Lio/getstream/chat/android/models/User;

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

.field private final id:Ljava/lang/String;

.field private final maxVotesAllowed:Ljava/lang/Integer;

.field private final name:Ljava/lang/String;

.field private final options:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Option;",
            ">;"
        }
    .end annotation
.end field

.field private final ownVotes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Vote;",
            ">;"
        }
    .end annotation
.end field

.field private final updatedAt:Ljava/util/Date;

.field private final voteCount:I

.field private final voteCountsByOption:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final votes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Vote;",
            ">;"
        }
    .end annotation
.end field

.field private final votingVisibility:Lio/getstream/chat/android/models/VotingVisibility;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/VotingVisibility;ZLjava/lang/Integer;ZZILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;ZILjava/util/List;Lio/getstream/chat/android/models/User;Ljava/util/Map;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Option;",
            ">;",
            "Lio/getstream/chat/android/models/VotingVisibility;",
            "Z",
            "Ljava/lang/Integer;",
            "ZZI",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Vote;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Vote;",
            ">;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "ZI",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Answer;",
            ">;",
            "Lio/getstream/chat/android/models/User;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    move-object v0, p5

    move-object/from16 v1, p11

    move-object/from16 v2, p12

    move-object/from16 v3, p13

    move-object/from16 v4, p14

    move-object/from16 v5, p15

    move-object/from16 v6, p18

    move-object/from16 v7, p20

    const-string v8, "id"

    invoke-static {p1, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "name"

    invoke-static {p2, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "description"

    invoke-static {p3, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "options"

    invoke-static {p4, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "votingVisibility"

    invoke-static {p5, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "voteCountsByOption"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "votes"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "ownVotes"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "createdAt"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "updatedAt"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "answers"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "extraData"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/models/Poll;->id:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/models/Poll;->name:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/models/Poll;->description:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lio/getstream/chat/android/models/Poll;->options:Ljava/util/List;

    .line 6
    iput-object v0, p0, Lio/getstream/chat/android/models/Poll;->votingVisibility:Lio/getstream/chat/android/models/VotingVisibility;

    move p1, p6

    .line 7
    iput-boolean p1, p0, Lio/getstream/chat/android/models/Poll;->enforceUniqueVote:Z

    move-object/from16 p1, p7

    .line 8
    iput-object p1, p0, Lio/getstream/chat/android/models/Poll;->maxVotesAllowed:Ljava/lang/Integer;

    move/from16 p1, p8

    .line 9
    iput-boolean p1, p0, Lio/getstream/chat/android/models/Poll;->allowUserSuggestedOptions:Z

    move/from16 p1, p9

    .line 10
    iput-boolean p1, p0, Lio/getstream/chat/android/models/Poll;->allowAnswers:Z

    move/from16 p1, p10

    .line 11
    iput p1, p0, Lio/getstream/chat/android/models/Poll;->voteCount:I

    .line 12
    iput-object v1, p0, Lio/getstream/chat/android/models/Poll;->voteCountsByOption:Ljava/util/Map;

    .line 13
    iput-object v2, p0, Lio/getstream/chat/android/models/Poll;->votes:Ljava/util/List;

    .line 14
    iput-object v3, p0, Lio/getstream/chat/android/models/Poll;->ownVotes:Ljava/util/List;

    .line 15
    iput-object v4, p0, Lio/getstream/chat/android/models/Poll;->createdAt:Ljava/util/Date;

    .line 16
    iput-object v5, p0, Lio/getstream/chat/android/models/Poll;->updatedAt:Ljava/util/Date;

    move/from16 p1, p16

    .line 17
    iput-boolean p1, p0, Lio/getstream/chat/android/models/Poll;->closed:Z

    move/from16 p1, p17

    .line 18
    iput p1, p0, Lio/getstream/chat/android/models/Poll;->answersCount:I

    .line 19
    iput-object v6, p0, Lio/getstream/chat/android/models/Poll;->answers:Ljava/util/List;

    move-object/from16 p1, p19

    .line 20
    iput-object p1, p0, Lio/getstream/chat/android/models/Poll;->createdBy:Lio/getstream/chat/android/models/User;

    .line 21
    iput-object v7, p0, Lio/getstream/chat/android/models/Poll;->extraData:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/VotingVisibility;ZLjava/lang/Integer;ZZILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;ZILjava/util/List;Lio/getstream/chat/android/models/User;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 22

    const/high16 v0, 0x20000

    and-int v0, p21, v0

    if-eqz v0, :cond_0

    .line 22
    sget-object v0, Lm83/y;->w:Lm83/y;

    move-object/from16 v19, v0

    goto :goto_0

    :cond_0
    move-object/from16 v19, p18

    :goto_0
    const/high16 v0, 0x80000

    and-int v0, p21, v0

    if-eqz v0, :cond_1

    .line 23
    sget-object v0, Lm83/z;->w:Lm83/z;

    move-object/from16 v21, v0

    :goto_1
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move/from16 v17, p16

    move/from16 v18, p17

    move-object/from16 v20, p19

    goto :goto_2

    :cond_1
    move-object/from16 v21, p20

    goto :goto_1

    .line 24
    :goto_2
    invoke-direct/range {v1 .. v21}, Lio/getstream/chat/android/models/Poll;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/VotingVisibility;ZLjava/lang/Integer;ZZILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;ZILjava/util/List;Lio/getstream/chat/android/models/User;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/models/Poll;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/VotingVisibility;ZLjava/lang/Integer;ZZILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;ZILjava/util/List;Lio/getstream/chat/android/models/User;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/models/Poll;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p21

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lio/getstream/chat/android/models/Poll;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lio/getstream/chat/android/models/Poll;->name:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lio/getstream/chat/android/models/Poll;->description:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lio/getstream/chat/android/models/Poll;->options:Ljava/util/List;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lio/getstream/chat/android/models/Poll;->votingVisibility:Lio/getstream/chat/android/models/VotingVisibility;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-boolean v7, v0, Lio/getstream/chat/android/models/Poll;->enforceUniqueVote:Z

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lio/getstream/chat/android/models/Poll;->maxVotesAllowed:Ljava/lang/Integer;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-boolean v9, v0, Lio/getstream/chat/android/models/Poll;->allowUserSuggestedOptions:Z

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-boolean v10, v0, Lio/getstream/chat/android/models/Poll;->allowAnswers:Z

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget v11, v0, Lio/getstream/chat/android/models/Poll;->voteCount:I

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lio/getstream/chat/android/models/Poll;->voteCountsByOption:Ljava/util/Map;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lio/getstream/chat/android/models/Poll;->votes:Ljava/util/List;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lio/getstream/chat/android/models/Poll;->ownVotes:Ljava/util/List;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lio/getstream/chat/android/models/Poll;->createdAt:Ljava/util/Date;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lio/getstream/chat/android/models/Poll;->updatedAt:Ljava/util/Date;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-boolean v1, v0, Lio/getstream/chat/android/models/Poll;->closed:Z

    goto :goto_f

    :cond_f
    move/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p21, v16

    move/from16 p2, v1

    if-eqz v16, :cond_10

    iget v1, v0, Lio/getstream/chat/android/models/Poll;->answersCount:I

    goto :goto_10

    :cond_10
    move/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p21, v16

    move/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lio/getstream/chat/android/models/Poll;->answers:Ljava/util/List;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p21, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lio/getstream/chat/android/models/Poll;->createdBy:Lio/getstream/chat/android/models/User;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p21, v16

    if-eqz v16, :cond_13

    move-object/from16 p5, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Poll;->extraData:Ljava/util/Map;

    move-object/from16 p20, p5

    move-object/from16 p21, v1

    :goto_13
    move/from16 p17, p2

    move/from16 p18, p3

    move-object/from16 p19, p4

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move/from16 p7, v7

    move-object/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_14

    :cond_13
    move-object/from16 p21, p20

    move-object/from16 p20, v1

    goto :goto_13

    :goto_14
    invoke-virtual/range {p1 .. p21}, Lio/getstream/chat/android/models/Poll;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/VotingVisibility;ZLjava/lang/Integer;ZZILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;ZILjava/util/List;Lio/getstream/chat/android/models/User;Ljava/util/Map;)Lio/getstream/chat/android/models/Poll;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Poll;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/Poll;->voteCount:I

    return v0
.end method

.method public final component11()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Poll;->voteCountsByOption:Ljava/util/Map;

    return-object v0
.end method

.method public final component12()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Vote;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Poll;->votes:Ljava/util/List;

    return-object v0
.end method

.method public final component13()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Vote;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Poll;->ownVotes:Ljava/util/List;

    return-object v0
.end method

.method public final component14()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Poll;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component15()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Poll;->updatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component16()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/Poll;->closed:Z

    return v0
.end method

.method public final component17()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/Poll;->answersCount:I

    return v0
.end method

.method public final component18()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Answer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Poll;->answers:Ljava/util/List;

    return-object v0
.end method

.method public final component19()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Poll;->createdBy:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Poll;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component20()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/chat/android/models/Poll;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Poll;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Option;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Poll;->options:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Lio/getstream/chat/android/models/VotingVisibility;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Poll;->votingVisibility:Lio/getstream/chat/android/models/VotingVisibility;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/Poll;->enforceUniqueVote:Z

    return v0
.end method

.method public final component7()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Poll;->maxVotesAllowed:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/Poll;->allowUserSuggestedOptions:Z

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/Poll;->allowAnswers:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/VotingVisibility;ZLjava/lang/Integer;ZZILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;ZILjava/util/List;Lio/getstream/chat/android/models/User;Ljava/util/Map;)Lio/getstream/chat/android/models/Poll;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Option;",
            ">;",
            "Lio/getstream/chat/android/models/VotingVisibility;",
            "Z",
            "Ljava/lang/Integer;",
            "ZZI",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Vote;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Vote;",
            ">;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "ZI",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Answer;",
            ">;",
            "Lio/getstream/chat/android/models/User;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/chat/android/models/Poll;"
        }
    .end annotation

    const-string v0, "id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "votingVisibility"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "voteCountsByOption"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "votes"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownVotes"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatedAt"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "answers"

    move-object/from16 v7, p18

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    move-object/from16 v8, p20

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/models/Poll;

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v16, p15

    move/from16 v17, p16

    move/from16 v18, p17

    move-object/from16 v20, p19

    move-object/from16 v19, v7

    move-object/from16 v21, v8

    move/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v21}, Lio/getstream/chat/android/models/Poll;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/VotingVisibility;ZLjava/lang/Integer;ZZILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;ZILjava/util/List;Lio/getstream/chat/android/models/User;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/models/Poll;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/models/Poll;

    iget-object v1, p0, Lio/getstream/chat/android/models/Poll;->id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/Poll;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/models/Poll;->name:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/Poll;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/models/Poll;->description:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/Poll;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/models/Poll;->options:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/models/Poll;->options:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/models/Poll;->votingVisibility:Lio/getstream/chat/android/models/VotingVisibility;

    iget-object v3, p1, Lio/getstream/chat/android/models/Poll;->votingVisibility:Lio/getstream/chat/android/models/VotingVisibility;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lio/getstream/chat/android/models/Poll;->enforceUniqueVote:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/models/Poll;->enforceUniqueVote:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/models/Poll;->maxVotesAllowed:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/chat/android/models/Poll;->maxVotesAllowed:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lio/getstream/chat/android/models/Poll;->allowUserSuggestedOptions:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/models/Poll;->allowUserSuggestedOptions:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lio/getstream/chat/android/models/Poll;->allowAnswers:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/models/Poll;->allowAnswers:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lio/getstream/chat/android/models/Poll;->voteCount:I

    iget v3, p1, Lio/getstream/chat/android/models/Poll;->voteCount:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lio/getstream/chat/android/models/Poll;->voteCountsByOption:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/models/Poll;->voteCountsByOption:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lio/getstream/chat/android/models/Poll;->votes:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/models/Poll;->votes:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lio/getstream/chat/android/models/Poll;->ownVotes:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/models/Poll;->ownVotes:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lio/getstream/chat/android/models/Poll;->createdAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/models/Poll;->createdAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lio/getstream/chat/android/models/Poll;->updatedAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/models/Poll;->updatedAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-boolean v1, p0, Lio/getstream/chat/android/models/Poll;->closed:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/models/Poll;->closed:Z

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget v1, p0, Lio/getstream/chat/android/models/Poll;->answersCount:I

    iget v3, p1, Lio/getstream/chat/android/models/Poll;->answersCount:I

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lio/getstream/chat/android/models/Poll;->answers:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/models/Poll;->answers:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lio/getstream/chat/android/models/Poll;->createdBy:Lio/getstream/chat/android/models/User;

    iget-object v3, p1, Lio/getstream/chat/android/models/Poll;->createdBy:Lio/getstream/chat/android/models/User;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lio/getstream/chat/android/models/Poll;->extraData:Ljava/util/Map;

    iget-object p1, p1, Lio/getstream/chat/android/models/Poll;->extraData:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_15

    return v2

    :cond_15
    return v0
.end method

.method public final getAllowAnswers()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/Poll;->allowAnswers:Z

    return v0
.end method

.method public final getAllowUserSuggestedOptions()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/Poll;->allowUserSuggestedOptions:Z

    return v0
.end method

.method public final getAnswers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Answer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Poll;->answers:Ljava/util/List;

    return-object v0
.end method

.method public final getAnswersCount()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/Poll;->answersCount:I

    return v0
.end method

.method public final getClosed()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/Poll;->closed:Z

    return v0
.end method

.method public getComparableField(Ljava/lang/String;)Ljava/lang/Comparable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Comparable<",
            "*>;"
        }
    .end annotation

    const-string v0, "fieldName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "created_at"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :sswitch_1
    const-string v0, "createdAt"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/models/Poll;->createdAt:Ljava/util/Date;

    return-object p1

    :sswitch_2
    const-string v0, "name"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lio/getstream/chat/android/models/Poll;->name:Ljava/lang/String;

    return-object p1

    :sswitch_3
    const-string v0, "id"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lio/getstream/chat/android/models/Poll;->id:Ljava/lang/String;

    return-object p1

    :sswitch_4
    const-string v0, "updated_at"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :sswitch_5
    const-string v0, "isClosed"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :sswitch_6
    const-string v0, "is_closed"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    iget-boolean p1, p0, Lio/getstream/chat/android/models/Poll;->closed:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :sswitch_7
    const-string v0, "updatedAt"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    :goto_0
    const/4 p1, 0x0

    return-object p1

    :cond_4
    iget-object p1, p0, Lio/getstream/chat/android/models/Poll;->updatedAt:Ljava/util/Date;

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x742e59b2 -> :sswitch_7
        -0x354171df -> :sswitch_6
        -0x28bd2cca -> :sswitch_5
        -0x119c6dc9 -> :sswitch_4
        0xd1b -> :sswitch_3
        0x337a8b -> :sswitch_2
        0x23aa6d3b -> :sswitch_1
        0x51a3a8ea -> :sswitch_0
    .end sparse-switch
.end method

.method public final getCreatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Poll;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getCreatedBy()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Poll;->createdBy:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Poll;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getEnforceUniqueVote()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/Poll;->enforceUniqueVote:Z

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

    iget-object v0, p0, Lio/getstream/chat/android/models/Poll;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Poll;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getMaxVotesAllowed()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Poll;->maxVotesAllowed:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Poll;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getOptions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Option;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Poll;->options:Ljava/util/List;

    return-object v0
.end method

.method public final getOwnVotes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Vote;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Poll;->ownVotes:Ljava/util/List;

    return-object v0
.end method

.method public final getUpdatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Poll;->updatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getVoteCount()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/Poll;->voteCount:I

    return v0
.end method

.method public final getVoteCountsByOption()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Poll;->voteCountsByOption:Ljava/util/Map;

    return-object v0
.end method

.method public final getVotes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Vote;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/models/Poll;->votes:Ljava/util/List;

    return-object v0
.end method

.method public final getVotes(Lio/getstream/chat/android/models/Option;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Option;",
            ")",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Vote;",
            ">;"
        }
    .end annotation

    const-string v0, "option"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/models/Poll;->votes:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/models/Vote;

    .line 5
    invoke-virtual {v3}, Lio/getstream/chat/android/models/Vote;->getOptionId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Option;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 6
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public final getVotingVisibility()Lio/getstream/chat/android/models/VotingVisibility;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Poll;->votingVisibility:Lio/getstream/chat/android/models/VotingVisibility;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/models/Poll;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/Poll;->name:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Poll;->description:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Poll;->options:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Poll;->votingVisibility:Lio/getstream/chat/android/models/VotingVisibility;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/Poll;->enforceUniqueVote:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Poll;->maxVotesAllowed:Ljava/lang/Integer;

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

    iget-boolean v2, p0, Lio/getstream/chat/android/models/Poll;->allowUserSuggestedOptions:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/models/Poll;->allowAnswers:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/models/Poll;->voteCount:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Poll;->voteCountsByOption:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Poll;->votes:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Poll;->ownVotes:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Poll;->createdAt:Ljava/util/Date;

    invoke-static {v2, v0, v1}, Ly00/t7;->c(Ljava/util/Date;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Poll;->updatedAt:Ljava/util/Date;

    invoke-static {v2, v0, v1}, Ly00/t7;->c(Ljava/util/Date;II)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/models/Poll;->closed:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/models/Poll;->answersCount:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Poll;->answers:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Poll;->createdBy:Lio/getstream/chat/android/models/User;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/chat/android/models/Poll;->extraData:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 23

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/models/Poll;->id:Ljava/lang/String;

    iget-object v2, v0, Lio/getstream/chat/android/models/Poll;->name:Ljava/lang/String;

    iget-object v3, v0, Lio/getstream/chat/android/models/Poll;->description:Ljava/lang/String;

    iget-object v4, v0, Lio/getstream/chat/android/models/Poll;->options:Ljava/util/List;

    iget-object v5, v0, Lio/getstream/chat/android/models/Poll;->votingVisibility:Lio/getstream/chat/android/models/VotingVisibility;

    iget-boolean v6, v0, Lio/getstream/chat/android/models/Poll;->enforceUniqueVote:Z

    iget-object v7, v0, Lio/getstream/chat/android/models/Poll;->maxVotesAllowed:Ljava/lang/Integer;

    iget-boolean v8, v0, Lio/getstream/chat/android/models/Poll;->allowUserSuggestedOptions:Z

    iget-boolean v9, v0, Lio/getstream/chat/android/models/Poll;->allowAnswers:Z

    iget v10, v0, Lio/getstream/chat/android/models/Poll;->voteCount:I

    iget-object v11, v0, Lio/getstream/chat/android/models/Poll;->voteCountsByOption:Ljava/util/Map;

    iget-object v12, v0, Lio/getstream/chat/android/models/Poll;->votes:Ljava/util/List;

    iget-object v13, v0, Lio/getstream/chat/android/models/Poll;->ownVotes:Ljava/util/List;

    iget-object v14, v0, Lio/getstream/chat/android/models/Poll;->createdAt:Ljava/util/Date;

    iget-object v15, v0, Lio/getstream/chat/android/models/Poll;->updatedAt:Ljava/util/Date;

    move-object/from16 v16, v15

    iget-boolean v15, v0, Lio/getstream/chat/android/models/Poll;->closed:Z

    move/from16 v17, v15

    iget v15, v0, Lio/getstream/chat/android/models/Poll;->answersCount:I

    move/from16 v18, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/Poll;->answers:Ljava/util/List;

    move-object/from16 v19, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/Poll;->createdBy:Lio/getstream/chat/android/models/User;

    move-object/from16 v20, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/Poll;->extraData:Ljava/util/Map;

    const-string v0, ", name="

    move-object/from16 v21, v15

    const-string v15, ", description="

    move-object/from16 v22, v14

    const-string v14, "Poll(id="

    invoke-static {v14, v1, v0, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", options="

    const-string v2, ", votingVisibility="

    invoke-static {v3, v1, v2, v0, v4}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", enforceUniqueVote="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", maxVotesAllowed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", allowUserSuggestedOptions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", allowAnswers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", voteCount="

    const-string v2, ", voteCountsByOption="

    invoke-static {v10, v1, v2, v0, v9}, Lr;->r(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", votes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ownVotes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", createdAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", updatedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", closed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", answersCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", answers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", createdBy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", extraData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
