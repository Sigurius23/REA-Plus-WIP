.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008!\u0008\u0001\u0018\u00002\u00020\u0001B\u00db\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u0012\u0012\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0007\u0012\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\r\u0012\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u0007\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0012\u00a2\u0006\u0004\u0008\u001f\u0010 R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\"R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010\"R\u0017\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010\"R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010)R\u0015\u0010\u000c\u001a\u0004\u0018\u00010\r\u00a2\u0006\n\n\u0002\u0010,\u001a\u0004\u0008*\u0010+R\u0011\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010)R\u0011\u0010\u000f\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010)R\u0011\u0010\u0010\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u00100R\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u00102R\u0017\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u0010&R\u0017\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u0010&R\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00085\u00106R\u0011\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00087\u00106R\u0011\u0010\u0019\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00088\u0010)R\u0011\u0010\u001a\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00089\u00100R\u0017\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008:\u0010&R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008;\u0010\"R\u001d\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008<\u00102\u00a8\u0006="
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;",
        "",
        "id",
        "",
        "name",
        "description",
        "options",
        "",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/OptionEntity;",
        "votingVisibility",
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
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/VoteEntity;",
        "ownVotes",
        "createdAt",
        "Ljava/util/Date;",
        "updatedAt",
        "closed",
        "answersCount",
        "answers",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/AnswerEntity;",
        "createdById",
        "extraData",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/lang/Integer;ZZILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;ZILjava/util/List;Ljava/lang/String;Ljava/util/Map;)V",
        "getId",
        "()Ljava/lang/String;",
        "getName",
        "getDescription",
        "getOptions",
        "()Ljava/util/List;",
        "getVotingVisibility",
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
        "getCreatedById",
        "getExtraData",
        "stream-chat-android-client_release"
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
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/AnswerEntity;",
            ">;"
        }
    .end annotation
.end field

.field private final answersCount:I

.field private final closed:Z

.field private final createdAt:Ljava/util/Date;

.field private final createdById:Ljava/lang/String;

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
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/OptionEntity;",
            ">;"
        }
    .end annotation
.end field

.field private final ownVotes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/VoteEntity;",
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
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/VoteEntity;",
            ">;"
        }
    .end annotation
.end field

.field private final votingVisibility:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/lang/Integer;ZZILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;ZILjava/util/List;Ljava/lang/String;Ljava/util/Map;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/OptionEntity;",
            ">;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/Integer;",
            "ZZI",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/VoteEntity;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/VoteEntity;",
            ">;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "ZI",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/AnswerEntity;",
            ">;",
            "Ljava/lang/String;",
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

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->id:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->name:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->description:Ljava/lang/String;

    iput-object p4, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->options:Ljava/util/List;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->votingVisibility:Ljava/lang/String;

    move p1, p6

    iput-boolean p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->enforceUniqueVote:Z

    move-object/from16 p1, p7

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->maxVotesAllowed:Ljava/lang/Integer;

    move/from16 p1, p8

    iput-boolean p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->allowUserSuggestedOptions:Z

    move/from16 p1, p9

    iput-boolean p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->allowAnswers:Z

    move/from16 p1, p10

    iput p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->voteCount:I

    iput-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->voteCountsByOption:Ljava/util/Map;

    iput-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->votes:Ljava/util/List;

    iput-object v3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->ownVotes:Ljava/util/List;

    iput-object v4, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->createdAt:Ljava/util/Date;

    iput-object v5, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->updatedAt:Ljava/util/Date;

    move/from16 p1, p16

    iput-boolean p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->closed:Z

    move/from16 p1, p17

    iput p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->answersCount:I

    iput-object v6, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->answers:Ljava/util/List;

    move-object/from16 p1, p19

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->createdById:Ljava/lang/String;

    iput-object v7, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->extraData:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final getAllowAnswers()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->allowAnswers:Z

    return v0
.end method

.method public final getAllowUserSuggestedOptions()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->allowUserSuggestedOptions:Z

    return v0
.end method

.method public final getAnswers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/AnswerEntity;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->answers:Ljava/util/List;

    return-object v0
.end method

.method public final getAnswersCount()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->answersCount:I

    return v0
.end method

.method public final getClosed()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->closed:Z

    return v0
.end method

.method public final getCreatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getCreatedById()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->createdById:Ljava/lang/String;

    return-object v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getEnforceUniqueVote()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->enforceUniqueVote:Z

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getMaxVotesAllowed()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->maxVotesAllowed:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getOptions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/OptionEntity;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->options:Ljava/util/List;

    return-object v0
.end method

.method public final getOwnVotes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/VoteEntity;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->ownVotes:Ljava/util/List;

    return-object v0
.end method

.method public final getUpdatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->updatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getVoteCount()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->voteCount:I

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->voteCountsByOption:Ljava/util/Map;

    return-object v0
.end method

.method public final getVotes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/VoteEntity;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->votes:Ljava/util/List;

    return-object v0
.end method

.method public final getVotingVisibility()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->votingVisibility:Ljava/lang/String;

    return-object v0
.end method
