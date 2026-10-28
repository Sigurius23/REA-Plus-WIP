.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 \'2\u00020\u0001:\u0001\'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001e\u0010\n\u001a\u00020\t2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u000cH\u0096@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000cH\u0096@\u00a2\u0006\u0004\u0008\u0010\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0011R\u001a\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&\u00a8\u0006("
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao;",
        "Landroidx/room/z0;",
        "__db",
        "<init>",
        "(Landroidx/room/z0;)V",
        "",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;",
        "polls",
        "Ll83/a0;",
        "insertPolls",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "",
        "pollId",
        "getPoll",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "deletePoll",
        "Landroidx/room/z0;",
        "Landroidx/room/k;",
        "__insertAdapterOfPollEntity",
        "Landroidx/room/k;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/OptionConverter;",
        "__optionConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/OptionConverter;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;",
        "__mapConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/VoteConverter;",
        "__voteConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/VoteConverter;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;",
        "__dateConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/AnswerConverter;",
        "__answerConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/AnswerConverter;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;",
        "__extraDataConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;",
        "Companion",
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


# static fields
.field public static final Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl$Companion;


# instance fields
.field private final __answerConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/AnswerConverter;

.field private final __dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

.field private final __db:Landroidx/room/z0;

.field private final __extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

.field private final __insertAdapterOfPollEntity:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field

.field private final __mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

.field private final __optionConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/OptionConverter;

.field private final __voteConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/VoteConverter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl$Companion;

    return-void
.end method

.method public constructor <init>(Landroidx/room/z0;)V
    .locals 1

    const-string v0, "__db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/OptionConverter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/OptionConverter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->__optionConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/OptionConverter;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/VoteConverter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/VoteConverter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->__voteConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/VoteConverter;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/AnswerConverter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/AnswerConverter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->__answerConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/AnswerConverter;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->__db:Landroidx/room/z0;

    new-instance p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl$1;

    invoke-direct {p1, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->__insertAdapterOfPollEntity:Landroidx/room/k;

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Ltb/a;)V
    .locals 1

    const-string v0, "DELETE FROM stream_chat_poll WHERE id = ?"

    invoke-static {v0, p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->deletePoll$lambda$2(Ljava/lang/String;Ljava/lang/String;Ltb/a;)Ll83/a0;

    return-void
.end method

.method public static final synthetic access$get__answerConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/AnswerConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->__answerConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/AnswerConverter;

    return-object p0
.end method

.method public static final synthetic access$get__dateConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    return-object p0
.end method

.method public static final synthetic access$get__extraDataConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    return-object p0
.end method

.method public static final synthetic access$get__mapConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    return-object p0
.end method

.method public static final synthetic access$get__optionConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/OptionConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->__optionConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/OptionConverter;

    return-object p0
.end method

.method public static final synthetic access$get__voteConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/VoteConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->__voteConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/VoteConverter;

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;
    .locals 1

    const-string v0, "SELECT * From stream_chat_poll  WHERE id = ?"

    invoke-static {v0, p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->getPoll$lambda$1(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;Ljava/util/List;Ltb/a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->insertPolls$lambda$0(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;Ljava/util/List;Ltb/a;)Ll83/a0;

    return-void
.end method

.method private static final deletePoll$lambda$2(Ljava/lang/String;Ljava/lang/String;Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    const/4 p2, 0x1

    :try_start_0
    invoke-interface {p0, p2, p1}, Ltb/c;->L(ILjava/lang/String;)V

    invoke-interface {p0}, Ltb/c;->e1()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :catchall_0
    move-exception p1

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw p1
.end method

.method private static final getPoll$lambda$1(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;
    .locals 43

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    const-string v2, "_connection"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p0

    invoke-interface {v1, v2}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    const/4 v2, 0x1

    move-object/from16 v3, p1

    :try_start_0
    invoke-interface {v1, v2, v3}, Ltb/c;->L(ILjava/lang/String;)V

    const-string v3, "id"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "name"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "description"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "options"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "votingVisibility"

    invoke-static {v1, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "enforceUniqueVote"

    invoke-static {v1, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "maxVotesAllowed"

    invoke-static {v1, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "allowUserSuggestedOptions"

    invoke-static {v1, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "allowAnswers"

    invoke-static {v1, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "voteCount"

    invoke-static {v1, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "voteCountsByOption"

    invoke-static {v1, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "votes"

    invoke-static {v1, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "ownVotes"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    const-string v2, "createdAt"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 p1, v2

    const-string v2, "updatedAt"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 p3, v2

    const-string v2, "closed"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v16, v2

    const-string v2, "answersCount"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v17, v2

    const-string v2, "answers"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v18, v2

    const-string v2, "createdById"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v19, v2

    const-string v2, "extraData"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v20

    const/16 v21, 0x0

    if-eqz v20, :cond_16

    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v23

    invoke-interface {v1, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v24

    invoke-interface {v1, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v25

    invoke-interface {v1, v6}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_0

    move-object/from16 v3, v21

    goto :goto_0

    :cond_0
    invoke-interface {v1, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    :goto_0
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->__optionConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/OptionConverter;

    invoke-virtual {v4, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/OptionConverter;->stringToOptionList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v26

    if-eqz v26, :cond_15

    invoke-interface {v1, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v27

    invoke-interface {v1, v8}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    const/16 v28, 0x1

    goto :goto_1

    :cond_1
    move/from16 v28, v4

    :goto_1
    invoke-interface {v1, v9}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_2

    move-object/from16 v29, v21

    goto :goto_2

    :cond_2
    invoke-interface {v1, v9}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v3, v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    move-object/from16 v29, v3

    :goto_2
    invoke-interface {v1, v10}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v3, v5

    if-eqz v3, :cond_3

    const/16 v30, 0x1

    goto :goto_3

    :cond_3
    move/from16 v30, v4

    :goto_3
    invoke-interface {v1, v11}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v3, v5

    if-eqz v3, :cond_4

    const/16 v31, 0x1

    goto :goto_4

    :cond_4
    move/from16 v31, v4

    :goto_4
    invoke-interface {v1, v12}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v3, v5

    invoke-interface {v1, v13}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_5

    move-object/from16 v5, v21

    goto :goto_5

    :cond_5
    invoke-interface {v1, v13}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    :goto_5
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v6, v5}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v33

    if-eqz v33, :cond_14

    invoke-interface {v1, v14}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_6

    move-object/from16 v5, v21

    goto :goto_6

    :cond_6
    invoke-interface {v1, v14}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    :goto_6
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->__voteConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/VoteConverter;

    invoke-virtual {v6, v5}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/VoteConverter;->stringToVoteList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v34
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v5, "Expected NON-NULL \'kotlin.collections.List<io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.VoteEntity>\', but it was NULL."

    if-eqz v34, :cond_13

    :try_start_1
    invoke-interface {v1, v15}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_7

    move-object/from16 v6, v21

    goto :goto_7

    :cond_7
    invoke-interface {v1, v15}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    :goto_7
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->__voteConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/VoteConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/VoteConverter;->stringToVoteList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v35

    if-eqz v35, :cond_12

    move/from16 v6, p1

    invoke-interface {v1, v6}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_8

    move-object/from16 v5, v21

    goto :goto_8

    :cond_8
    invoke-interface {v1, v6}, Ltb/c;->getLong(I)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    :goto_8
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v5}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v36
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v5, "Expected NON-NULL \'java.util.Date\', but it was NULL."

    if-eqz v36, :cond_11

    move/from16 v6, p3

    :try_start_2
    invoke-interface {v1, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_9

    move-object/from16 v6, v21

    goto :goto_9

    :cond_9
    invoke-interface {v1, v6}, Ltb/c;->getLong(I)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    :goto_9
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v37

    if-eqz v37, :cond_10

    move/from16 v6, v16

    invoke-interface {v1, v6}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    if-eqz v5, :cond_a

    const/16 v38, 0x1

    :goto_a
    move/from16 v4, v17

    goto :goto_b

    :cond_a
    move/from16 v38, v4

    goto :goto_a

    :goto_b
    invoke-interface {v1, v4}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    move/from16 v5, v18

    invoke-interface {v1, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_b

    move-object/from16 v5, v21

    goto :goto_c

    :cond_b
    invoke-interface {v1, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    :goto_c
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->__answerConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/AnswerConverter;

    invoke-virtual {v6, v5}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/AnswerConverter;->stringToAnswerList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v40

    if-eqz v40, :cond_f

    move/from16 v5, v19

    invoke-interface {v1, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_c

    move-object/from16 v41, v21

    goto :goto_d

    :cond_c
    invoke-interface {v1, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v41, v5

    :goto_d
    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_d

    :goto_e
    move-object/from16 v2, v21

    goto :goto_f

    :cond_d
    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v21

    goto :goto_e

    :goto_f
    iget-object v0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-virtual {v0, v2}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v42

    if-eqz v42, :cond_e

    new-instance v22, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;

    move/from16 v32, v3

    move/from16 v39, v4

    invoke-direct/range {v22 .. v42}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/lang/Integer;ZZILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;ZILjava/util/List;Ljava/lang/String;Ljava/util/Map;)V

    move-object/from16 v21, v22

    goto :goto_10

    :catchall_0
    move-exception v0

    goto :goto_11

    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Any>\', but it was NULL."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Expected NON-NULL \'kotlin.collections.List<io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.AnswerEntity>\', but it was NULL."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_10
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_13
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_14
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Int>\', but it was NULL."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Expected NON-NULL \'kotlin.collections.List<io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.OptionEntity>\', but it was NULL."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_16
    :goto_10
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v21

    :goto_11
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static final insertPolls$lambda$0(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;Ljava/util/List;Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->__insertAdapterOfPollEntity:Landroidx/room/k;

    check-cast p1, Ljava/lang/Iterable;

    invoke-virtual {p0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Iterable;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final deletePoll(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lht2/d;

    const/4 v2, 0x7

    invoke-direct {v1, p1, v2}, Lht2/d;-><init>(Ljava/lang/String;I)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final getPoll(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lh02/h;

    const/16 v2, 0x1a

    invoke-direct {v1, v2, p1, p0}, Lh02/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final insertPolls(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lh02/h;

    const/16 v2, 0x19

    invoke-direct {v1, v2, p0, p1}, Lh02/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
