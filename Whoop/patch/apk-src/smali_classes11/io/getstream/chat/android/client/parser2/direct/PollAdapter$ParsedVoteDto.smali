.class final Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/parser2/direct/PollAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ParsedVoteDto"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u001a\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0082\u0008\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010!\u001a\u00020\u000cH\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J]\u0010#\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010$\u001a\u00020\u000c2\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\'H\u00d6\u0001J\t\u0010(\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0011\u00a8\u0006)"
    }
    d2 = {
        "Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;",
        "",
        "id",
        "",
        "pollId",
        "optionId",
        "createdAt",
        "Ljava/util/Date;",
        "updatedAt",
        "user",
        "Lio/getstream/chat/android/models/User;",
        "isAnswer",
        "",
        "answerText",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;ZLjava/lang/String;)V",
        "getId",
        "()Ljava/lang/String;",
        "getPollId",
        "getOptionId",
        "getCreatedAt",
        "()Ljava/util/Date;",
        "getUpdatedAt",
        "getUser",
        "()Lio/getstream/chat/android/models/User;",
        "()Z",
        "getAnswerText",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
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
.field private final answerText:Ljava/lang/String;

.field private final createdAt:Ljava/util/Date;

.field private final id:Ljava/lang/String;

.field private final isAnswer:Z

.field private final optionId:Ljava/lang/String;

.field private final pollId:Ljava/lang/String;

.field private final updatedAt:Ljava/util/Date;

.field private final user:Lio/getstream/chat/android/models/User;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;ZLjava/lang/String;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "optionId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatedAt"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->id:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->pollId:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->optionId:Ljava/lang/String;

    iput-object p4, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->createdAt:Ljava/util/Date;

    iput-object p5, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->updatedAt:Ljava/util/Date;

    iput-object p6, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->user:Lio/getstream/chat/android/models/User;

    iput-boolean p7, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->isAnswer:Z

    iput-object p8, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->answerText:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;ZLjava/lang/String;ILjava/lang/Object;)Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->pollId:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->optionId:Ljava/lang/String;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->createdAt:Ljava/util/Date;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->updatedAt:Ljava/util/Date;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->user:Lio/getstream/chat/android/models/User;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-boolean p7, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->isAnswer:Z

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->answerText:Ljava/lang/String;

    :cond_7
    move p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;ZLjava/lang/String;)Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->pollId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->optionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component5()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->updatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component6()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->user:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->isAnswer:Z

    return v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->answerText:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;ZLjava/lang/String;)Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;
    .locals 10

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "optionId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatedAt"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;ZLjava/lang/String;)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;

    iget-object v1, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->pollId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->pollId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->optionId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->optionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->createdAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->createdAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->updatedAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->updatedAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->user:Lio/getstream/chat/android/models/User;

    iget-object v3, p1, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->user:Lio/getstream/chat/android/models/User;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->isAnswer:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->isAnswer:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->answerText:Ljava/lang/String;

    iget-object p1, p1, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->answerText:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getAnswerText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->answerText:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getOptionId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->optionId:Ljava/lang/String;

    return-object v0
.end method

.method public final getPollId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->pollId:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->updatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getUser()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->user:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->pollId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->optionId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->createdAt:Ljava/util/Date;

    invoke-static {v2, v0, v1}, Ly00/t7;->c(Ljava/util/Date;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->updatedAt:Ljava/util/Date;

    invoke-static {v2, v0, v1}, Ly00/t7;->c(Ljava/util/Date;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->user:Lio/getstream/chat/android/models/User;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->isAnswer:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->answerText:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public final isAnswer()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->isAnswer:Z

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->id:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->pollId:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->optionId:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->createdAt:Ljava/util/Date;

    iget-object v4, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->updatedAt:Ljava/util/Date;

    iget-object v5, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->user:Lio/getstream/chat/android/models/User;

    iget-boolean v6, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->isAnswer:Z

    iget-object v7, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->answerText:Ljava/lang/String;

    const-string v8, ", pollId="

    const-string v9, ", optionId="

    const-string v10, "ParsedVoteDto(id="

    invoke-static {v10, v0, v8, v1, v9}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", createdAt="

    const-string v8, ", updatedAt="

    invoke-static {v0, v2, v1, v3, v8}, Lev/n;->z(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", user="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isAnswer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", answerText="

    const-string v2, ")"

    invoke-static {v0, v6, v1, v7, v2}, Ljh3/c;->j(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
