.class public final Lio/getstream/chat/android/client/parser2/direct/PollAdapter;
.super Lcom/squareup/moshi/JsonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/moshi/JsonAdapter<",
        "Lio/getstream/chat/android/models/Poll;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-BA\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0001\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0001\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ+\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\u0017\u0018\u00010\u001c2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020 2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0004\u0008!\u0010\"J\u0019\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008#\u0010$J!\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0008\u0010\'\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008)\u0010*R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010+R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010+R\u001a\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010+R\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010,\u00a8\u0006."
    }
    d2 = {
        "Lio/getstream/chat/android/client/parser2/direct/PollAdapter;",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lio/getstream/chat/android/models/Poll;",
        "Lio/getstream/chat/android/models/User;",
        "userAdapter",
        "Lio/getstream/chat/android/models/Option;",
        "optionAdapter",
        "Ljava/util/Date;",
        "dateAdapter",
        "Lkotlin/Function0;",
        "",
        "currentUserIdProvider",
        "<init>",
        "(Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lc93/a;)V",
        "Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;",
        "Lio/getstream/chat/android/models/Vote;",
        "toVote",
        "(Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;)Lio/getstream/chat/android/models/Vote;",
        "Lio/getstream/chat/android/models/Answer;",
        "toAnswer",
        "(Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;)Lio/getstream/chat/android/models/Answer;",
        "Lcom/squareup/moshi/JsonReader;",
        "reader",
        "",
        "parseParsedVotesList",
        "(Lcom/squareup/moshi/JsonReader;)Ljava/util/List;",
        "parseParsedVote",
        "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;",
        "",
        "parseParsedVotesMap",
        "(Lcom/squareup/moshi/JsonReader;)Ljava/util/Map;",
        "value",
        "Lio/getstream/chat/android/models/VotingVisibility;",
        "toVotingVisibility",
        "(Ljava/lang/String;)Lio/getstream/chat/android/models/VotingVisibility;",
        "fromJson",
        "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/models/Poll;",
        "Lqx/c0;",
        "p0",
        "p1",
        "Ll83/a0;",
        "toJson",
        "(Lqx/c0;Lio/getstream/chat/android/models/Poll;)V",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lc93/a;",
        "ParsedVoteDto",
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
.field private final currentUserIdProvider:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final dateAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/Date;",
            ">;"
        }
    .end annotation
.end field

.field private final optionAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/models/Option;",
            ">;"
        }
    .end annotation
.end field

.field private final userAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/models/User;",
            ">;",
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/models/Option;",
            ">;",
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/Date;",
            ">;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "userAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "optionAdapter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateAdapter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentUserIdProvider"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/squareup/moshi/JsonAdapter;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter;->userAdapter:Lcom/squareup/moshi/JsonAdapter;

    iput-object p2, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter;->optionAdapter:Lcom/squareup/moshi/JsonAdapter;

    iput-object p3, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    iput-object p4, p0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter;->currentUserIdProvider:Lc93/a;

    return-void
.end method

.method private final parseParsedVote(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->k()Lqx/w;

    move-result-object v2

    sget-object v3, Lqx/w;->I:Lqx/w;

    const/4 v4, 0x0

    if-ne v2, v3, :cond_0

    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->i()V

    return-object v4

    :cond_0
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->beginObject()V

    move-object v6, v4

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v13, v11

    :cond_1
    const/4 v12, 0x0

    :goto_0
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->hasNext()Z

    move-result v3

    const-string v4, "poll_id"

    const-string v5, "updated_at"

    const-string v14, "id"

    const-string v15, "created_at"

    const-string v2, "option_id"

    if-eqz v3, :cond_c

    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->nextName()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_b

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v16

    sparse-switch v16, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto/16 :goto_1

    :cond_2
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v8

    goto :goto_0

    :sswitch_1
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto/16 :goto_1

    :cond_3
    iget-object v2, v0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Ljava/util/Date;

    goto :goto_0

    :sswitch_2
    const-string v2, "user"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto/16 :goto_1

    :cond_4
    iget-object v2, v0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter;->userAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Lio/getstream/chat/android/models/User;

    goto :goto_0

    :sswitch_3
    invoke-virtual {v3, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_1

    :cond_5
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    :sswitch_4
    const-string v2, "user_id"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_1

    :cond_6
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->skipValue()V

    goto :goto_0

    :sswitch_5
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_1

    :cond_7
    iget-object v2, v0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Ljava/util/Date;

    goto :goto_0

    :sswitch_6
    const-string v2, "answer_text"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_1

    :cond_8
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->readNullableString(Lcom/squareup/moshi/JsonReader;)Ljava/lang/String;

    move-result-object v13

    goto/16 :goto_0

    :sswitch_7
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    goto :goto_1

    :cond_9
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v7

    goto/16 :goto_0

    :sswitch_8
    const-string v2, "is_answer"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    goto :goto_1

    :cond_a
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->readNullableBoolean(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Boolean;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    move v12, v2

    goto/16 :goto_0

    :cond_b
    :goto_1
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->skipValue()V

    goto/16 :goto_0

    :cond_c
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->endObject()V

    sget-object v3, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v3, v6, v14, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    invoke-virtual {v3, v7, v4, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    invoke-virtual {v3, v8, v2, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    invoke-virtual {v3, v9, v15, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    invoke-virtual {v3, v10, v5, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    new-instance v5, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;

    invoke-direct/range {v5 .. v13}, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;ZLjava/lang/String;)V

    return-object v5

    nop

    :sswitch_data_0
    .sparse-switch
        -0x388d138d -> :sswitch_8
        -0x17b7b265 -> :sswitch_7
        -0x12911af2 -> :sswitch_6
        -0x119c6dc9 -> :sswitch_5
        -0x8c511f1 -> :sswitch_4
        0xd1b -> :sswitch_3
        0x36ebcb -> :sswitch_2
        0x51a3a8ea -> :sswitch_1
        0x6dff1925 -> :sswitch_0
    .end sparse-switch
.end method

.method private final parseParsedVotesList(Lcom/squareup/moshi/JsonReader;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/squareup/moshi/JsonReader;",
            ")",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->k()Lqx/w;

    move-result-object v0

    sget-object v1, Lqx/w;->I:Lqx/w;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->i()V

    return-object v2

    :cond_0
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->k()Lqx/w;

    move-result-object v0

    sget-object v1, Lqx/w;->w:Lqx/w;

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->skipValue()V

    return-object v2

    :cond_1
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->beginArray()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_2
    :goto_0
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/parser2/direct/PollAdapter;->parseParsedVote(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->endArray()V

    return-object v0
.end method

.method private final parseParsedVotesMap(Lcom/squareup/moshi/JsonReader;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/squareup/moshi/JsonReader;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->k()Lqx/w;

    move-result-object v0

    sget-object v1, Lqx/w;->I:Lqx/w;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->i()V

    return-object v2

    :cond_0
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->k()Lqx/w;

    move-result-object v0

    sget-object v1, Lqx/w;->y:Lqx/w;

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->skipValue()V

    return-object v2

    :cond_1
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->beginObject()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    :cond_2
    :goto_0
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->nextName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/parser2/direct/PollAdapter;->parseParsedVotesList(Lcom/squareup/moshi/JsonReader;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->endObject()V

    return-object v0
.end method

.method private final toAnswer(Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;)Lio/getstream/chat/android/models/Answer;
    .locals 7

    new-instance v0, Lio/getstream/chat/android/models/Answer;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->getPollId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->getAnswerText()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    const-string v3, ""

    :cond_0
    invoke-virtual {p1}, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->getCreatedAt()Ljava/util/Date;

    move-result-object v4

    invoke-virtual {p1}, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->getUpdatedAt()Ljava/util/Date;

    move-result-object v5

    invoke-virtual {p1}, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/models/Answer;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;)V

    return-object v0
.end method

.method private final toVote(Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;)Lio/getstream/chat/android/models/Vote;
    .locals 7

    new-instance v0, Lio/getstream/chat/android/models/Vote;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->getPollId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->getOptionId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->getCreatedAt()Ljava/util/Date;

    move-result-object v4

    invoke-virtual {p1}, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->getUpdatedAt()Ljava/util/Date;

    move-result-object v5

    invoke-virtual {p1}, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/models/Vote;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;)V

    return-object v0
.end method

.method private final toVotingVisibility(Ljava/lang/String;)Lio/getstream/chat/android/models/VotingVisibility;
    .locals 2

    if-eqz p1, :cond_2

    const-string v0, "public"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "anonymous"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lio/getstream/chat/android/models/VotingVisibility;->ANONYMOUS:Lio/getstream/chat/android/models/VotingVisibility;

    return-object p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unknown voting visibility: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    sget-object p1, Lio/getstream/chat/android/models/VotingVisibility;->PUBLIC:Lio/getstream/chat/android/models/VotingVisibility;

    return-object p1
.end method


# virtual methods
.method public final fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/models/Poll;
    .locals 38

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "reader"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->k()Lqx/w;

    move-result-object v2

    sget-object v3, Lqx/w;->I:Lqx/w;

    const/4 v4, 0x0

    if-ne v2, v3, :cond_0

    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->i()V

    return-object v4

    .line 3
    :cond_0
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->beginObject()V

    move-object v2, v4

    move-object v3, v2

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v17, v15

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v24, v20

    move-object/from16 v26, v24

    .line 4
    :goto_0
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->hasNext()Z

    move-result v21

    move-object/from16 v22, v15

    const-string v15, "description"

    move-object/from16 v23, v14

    const-string v14, "allow_answers"

    move-object/from16 v25, v13

    const-string v13, "options"

    move-object/from16 v27, v12

    const-string v12, "updated_at"

    move-object/from16 v28, v11

    const-string v11, "own_votes"

    move-object/from16 v29, v10

    const-string v10, "id"

    move-object/from16 v30, v5

    const-string v5, "name"

    move-object/from16 v31, v3

    const-string v3, "allow_user_suggested_options"

    move-object/from16 v32, v2

    const-string v2, "answers_count"

    move-object/from16 v33, v9

    const-string v9, "created_at"

    move-object/from16 v34, v8

    const-string v8, "enforce_unique_vote"

    move-object/from16 v35, v7

    const-string v7, "vote_count"

    if-eqz v21, :cond_16

    move-object/from16 v21, v6

    .line 5
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->nextName()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_15

    .line 6
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v36

    sparse-switch v36, :sswitch_data_0

    goto/16 :goto_e

    :sswitch_0
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_e

    .line 7
    :cond_1
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->nextInt()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    move-object/from16 v6, v21

    move-object/from16 v15, v22

    move-object/from16 v14, v23

    move-object/from16 v13, v25

    move-object/from16 v12, v27

    move-object/from16 v11, v28

    :goto_1
    move-object/from16 v5, v30

    :goto_2
    move-object/from16 v3, v31

    :goto_3
    move-object/from16 v2, v32

    :goto_4
    move-object/from16 v9, v33

    :goto_5
    move-object/from16 v8, v34

    :goto_6
    move-object/from16 v7, v35

    goto :goto_0

    .line 8
    :sswitch_1
    const-string v2, "created_by_id"

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto/16 :goto_e

    .line 9
    :cond_2
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->skipValue()V

    :goto_7
    move-object/from16 v6, v21

    :goto_8
    move-object/from16 v15, v22

    :goto_9
    move-object/from16 v14, v23

    :goto_a
    move-object/from16 v13, v25

    :goto_b
    move-object/from16 v12, v27

    :goto_c
    move-object/from16 v11, v28

    :goto_d
    move-object/from16 v10, v29

    goto :goto_1

    .line 10
    :sswitch_2
    const-string v2, "latest_votes_by_option"

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto/16 :goto_e

    .line 11
    :cond_3
    invoke-direct/range {p0 .. p1}, Lio/getstream/chat/android/client/parser2/direct/PollAdapter;->parseParsedVotesMap(Lcom/squareup/moshi/JsonReader;)Ljava/util/Map;

    move-result-object v17

    goto :goto_7

    .line 12
    :sswitch_3
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto/16 :goto_e

    .line 13
    :cond_4
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->h()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    move-object/from16 v6, v21

    move-object/from16 v15, v22

    move-object/from16 v14, v23

    move-object/from16 v13, v25

    move-object/from16 v12, v27

    move-object/from16 v11, v28

    move-object/from16 v10, v29

    move-object/from16 v5, v30

    move-object/from16 v3, v31

    goto :goto_4

    .line 14
    :sswitch_4
    const-string v2, "created_by"

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto/16 :goto_e

    .line 15
    :cond_5
    iget-object v2, v0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter;->userAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v24, v2

    check-cast v24, Lio/getstream/chat/android/models/User;

    goto :goto_7

    .line 16
    :sswitch_5
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto/16 :goto_e

    .line 17
    :cond_6
    iget-object v2, v0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Ljava/util/Date;

    move-object/from16 v6, v21

    move-object/from16 v15, v22

    move-object/from16 v14, v23

    move-object/from16 v13, v25

    goto :goto_c

    .line 18
    :sswitch_6
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto/16 :goto_e

    .line 19
    :cond_7
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->nextInt()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    move-object/from16 v6, v21

    move-object/from16 v15, v22

    goto :goto_a

    .line 20
    :sswitch_7
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto/16 :goto_e

    .line 21
    :cond_8
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->h()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    move-object/from16 v6, v21

    move-object/from16 v15, v22

    move-object/from16 v14, v23

    move-object/from16 v13, v25

    move-object/from16 v12, v27

    move-object/from16 v11, v28

    move-object/from16 v10, v29

    move-object/from16 v5, v30

    goto/16 :goto_3

    .line 22
    :sswitch_8
    const-string v2, "latest_answers"

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    goto/16 :goto_e

    .line 23
    :cond_9
    invoke-direct/range {p0 .. p1}, Lio/getstream/chat/android/client/parser2/direct/PollAdapter;->parseParsedVotesList(Lcom/squareup/moshi/JsonReader;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v6, v21

    goto/16 :goto_9

    .line 24
    :sswitch_9
    const-string v2, "vote_counts_by_option"

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    goto/16 :goto_e

    .line 25
    :cond_a
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->parseIntMap(Lcom/squareup/moshi/JsonReader;)Ljava/util/Map;

    move-result-object v19

    goto/16 :goto_7

    .line 26
    :sswitch_a
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    goto/16 :goto_e

    .line 27
    :cond_b
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v7

    move-object/from16 v6, v21

    move-object/from16 v15, v22

    move-object/from16 v14, v23

    move-object/from16 v13, v25

    move-object/from16 v12, v27

    move-object/from16 v11, v28

    move-object/from16 v10, v29

    move-object/from16 v5, v30

    move-object/from16 v3, v31

    move-object/from16 v2, v32

    move-object/from16 v9, v33

    move-object/from16 v8, v34

    goto/16 :goto_0

    .line 28
    :sswitch_b
    invoke-virtual {v6, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    goto/16 :goto_e

    .line 29
    :cond_c
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v6

    goto/16 :goto_8

    .line 30
    :sswitch_c
    invoke-virtual {v6, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    goto/16 :goto_e

    .line 31
    :cond_d
    invoke-direct/range {p0 .. p1}, Lio/getstream/chat/android/client/parser2/direct/PollAdapter;->parseParsedVotesList(Lcom/squareup/moshi/JsonReader;)Ljava/util/List;

    move-result-object v11

    move-object/from16 v6, v21

    move-object/from16 v15, v22

    move-object/from16 v14, v23

    move-object/from16 v13, v25

    move-object/from16 v12, v27

    goto/16 :goto_d

    .line 32
    :sswitch_d
    invoke-virtual {v6, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    goto/16 :goto_e

    .line 33
    :cond_e
    iget-object v2, v0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Ljava/util/Date;

    move-object/from16 v6, v21

    move-object/from16 v15, v22

    move-object/from16 v14, v23

    goto/16 :goto_b

    .line 34
    :sswitch_e
    const-string v2, "max_votes_allowed"

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    goto/16 :goto_e

    .line 35
    :cond_f
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->readNullableInt(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Integer;

    move-result-object v18

    goto/16 :goto_7

    .line 36
    :sswitch_f
    const-string v2, "is_closed"

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    goto/16 :goto_e

    .line 37
    :cond_10
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->readNullableBoolean(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Boolean;

    move-result-object v20

    goto/16 :goto_7

    .line 38
    :sswitch_10
    invoke-virtual {v6, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    goto/16 :goto_e

    .line 39
    :cond_11
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    iget-object v3, v0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter;->optionAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1, v3}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->parseList(Lcom/squareup/moshi/JsonReader;Lcom/squareup/moshi/JsonAdapter;)Ljava/util/List;

    move-result-object v9

    move-object/from16 v6, v21

    move-object/from16 v15, v22

    move-object/from16 v14, v23

    move-object/from16 v13, v25

    move-object/from16 v12, v27

    move-object/from16 v11, v28

    move-object/from16 v10, v29

    move-object/from16 v5, v30

    move-object/from16 v3, v31

    move-object/from16 v2, v32

    goto/16 :goto_5

    .line 40
    :sswitch_11
    const-string v2, "voting_visibility"

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    goto :goto_e

    .line 41
    :cond_12
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->readNullableString(Lcom/squareup/moshi/JsonReader;)Ljava/lang/String;

    move-result-object v26

    goto/16 :goto_7

    .line 42
    :sswitch_12
    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_13

    goto :goto_e

    .line 43
    :cond_13
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->h()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    move-object/from16 v6, v21

    move-object/from16 v15, v22

    move-object/from16 v14, v23

    move-object/from16 v13, v25

    move-object/from16 v12, v27

    move-object/from16 v11, v28

    move-object/from16 v10, v29

    goto/16 :goto_2

    .line 44
    :sswitch_13
    invoke-virtual {v6, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_14

    goto :goto_e

    .line 45
    :cond_14
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v8

    move-object/from16 v6, v21

    move-object/from16 v15, v22

    move-object/from16 v14, v23

    move-object/from16 v13, v25

    move-object/from16 v12, v27

    move-object/from16 v11, v28

    move-object/from16 v10, v29

    move-object/from16 v5, v30

    move-object/from16 v3, v31

    move-object/from16 v2, v32

    move-object/from16 v9, v33

    goto/16 :goto_6

    .line 46
    :cond_15
    :goto_e
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2, v6, v1, v4}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->accumulateExtraData(Ljava/lang/String;Lcom/squareup/moshi/JsonReader;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v4

    goto/16 :goto_7

    :cond_16
    move-object/from16 v21, v6

    .line 47
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->endObject()V

    .line 48
    sget-object v6, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    move-object/from16 v36, v4

    move-object/from16 v4, v21

    invoke-virtual {v6, v4, v10, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-object/from16 v10, v35

    .line 49
    invoke-virtual {v6, v10, v5, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-object/from16 v5, v34

    .line 50
    invoke-virtual {v6, v5, v15, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-object/from16 v15, v33

    .line 51
    invoke-virtual {v6, v15, v13, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-object/from16 v13, v32

    .line 52
    invoke-virtual {v6, v13, v8, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-object/from16 v8, v31

    .line 53
    invoke-virtual {v6, v8, v3, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-object/from16 v3, v30

    .line 54
    invoke-virtual {v6, v3, v14, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-object/from16 v14, v29

    .line 55
    invoke-virtual {v6, v14, v7, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-object/from16 v7, v28

    .line 56
    invoke-virtual {v6, v7, v11, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-object/from16 v11, v27

    .line 57
    invoke-virtual {v6, v11, v9, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-object/from16 v9, v25

    .line 58
    invoke-virtual {v6, v9, v12, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-object/from16 v12, v23

    .line 59
    invoke-virtual {v6, v12, v2, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    .line 60
    iget-object v1, v0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter;->currentUserIdProvider:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_18

    invoke-static {v7}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;

    if-eqz v1, :cond_17

    invoke-virtual {v1}, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    if-eqz v1, :cond_17

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v1

    goto :goto_f

    :cond_17
    const/4 v1, 0x0

    .line 61
    :cond_18
    :goto_f
    sget-object v2, Lm83/y;->w:Lm83/y;

    if-eqz v17, :cond_1b

    invoke-interface/range {v17 .. v17}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v17

    if-eqz v17, :cond_1b

    .line 62
    check-cast v17, Ljava/lang/Iterable;

    .line 63
    invoke-static/range {v17 .. v17}, Lm83/u;->j0(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v17

    .line 64
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 65
    invoke-virtual/range {v17 .. v17}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_10
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v21

    if-eqz v21, :cond_1a

    move-object/from16 v21, v2

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v23, v2

    check-cast v23, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;

    .line 66
    invoke-virtual/range {v23 .. v23}, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->isAnswer()Z

    move-result v23

    if-nez v23, :cond_19

    .line 67
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_19
    move-object/from16 v2, v21

    goto :goto_10

    :cond_1a
    move-object/from16 v21, v2

    .line 68
    new-instance v2, Ljava/util/ArrayList;

    move-object/from16 v30, v3

    move-object/from16 v17, v4

    const/16 v3, 0xa

    invoke-static {v6, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 69
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_11
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 70
    check-cast v4, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;

    .line 71
    invoke-direct {v0, v4}, Lio/getstream/chat/android/client/parser2/direct/PollAdapter;->toVote(Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;)Lio/getstream/chat/android/models/Vote;

    move-result-object v4

    .line 72
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_11

    :cond_1b
    move-object/from16 v21, v2

    move-object/from16 v30, v3

    move-object/from16 v17, v4

    move-object/from16 v2, v21

    .line 73
    :cond_1c
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 74
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1d
    :goto_12
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1e

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;

    .line 75
    invoke-virtual {v7}, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;->isAnswer()Z

    move-result v7

    if-nez v7, :cond_1d

    .line 76
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_12

    .line 77
    :cond_1e
    new-instance v4, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v3, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 78
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_13
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1f

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 79
    check-cast v6, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;

    .line 80
    invoke-direct {v0, v6}, Lio/getstream/chat/android/client/parser2/direct/PollAdapter;->toVote(Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;)Lio/getstream/chat/android/models/Vote;

    move-result-object v6

    .line 81
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_13

    .line 82
    :cond_1f
    move-object v3, v2

    check-cast v3, Ljava/lang/Iterable;

    .line 83
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 84
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_14
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_22

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object/from16 v23, v7

    check-cast v23, Lio/getstream/chat/android/models/Vote;

    .line 85
    invoke-virtual/range {v23 .. v23}, Lio/getstream/chat/android/models/Vote;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v23

    if-eqz v23, :cond_20

    invoke-virtual/range {v23 .. v23}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v23

    move-object/from16 v37, v23

    move-object/from16 v23, v2

    move-object/from16 v2, v37

    goto :goto_15

    :cond_20
    move-object/from16 v23, v2

    const/4 v2, 0x0

    :goto_15
    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_21

    .line 86
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_21
    move-object/from16 v2, v23

    goto :goto_14

    :cond_22
    move-object/from16 v23, v2

    .line 87
    invoke-static {v4, v6}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v1

    const/16 v3, 0xa

    .line 88
    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-static {v2}, Lm83/g0;->W(I)I

    move-result v2

    const/16 v3, 0x10

    if-ge v2, v3, :cond_23

    move v2, v3

    .line 89
    :cond_23
    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 90
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_16
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_24

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 91
    move-object v4, v2

    check-cast v4, Lio/getstream/chat/android/models/Vote;

    .line 92
    invoke-virtual {v4}, Lio/getstream/chat/android/models/Vote;->getId()Ljava/lang/String;

    move-result-object v4

    .line 93
    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_16

    .line 94
    :cond_24
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 95
    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    if-eqz v22, :cond_26

    .line 96
    new-instance v2, Ljava/util/ArrayList;

    move-object/from16 v4, v22

    const/16 v3, 0xa

    invoke-static {v4, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 97
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_17
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_25

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 98
    check-cast v4, Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;

    .line 99
    invoke-direct {v0, v4}, Lio/getstream/chat/android/client/parser2/direct/PollAdapter;->toAnswer(Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;)Lio/getstream/chat/android/models/Answer;

    move-result-object v4

    .line 100
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_17

    :cond_25
    :goto_18
    move-object/from16 v34, v5

    goto :goto_19

    :cond_26
    move-object/from16 v2, v21

    goto :goto_18

    .line 101
    :goto_19
    new-instance v5, Lio/getstream/chat/android/models/Poll;

    move-object/from16 v4, v26

    .line 102
    invoke-direct {v0, v4}, Lio/getstream/chat/android/client/parser2/direct/PollAdapter;->toVotingVisibility(Ljava/lang/String;)Lio/getstream/chat/android/models/VotingVisibility;

    move-result-object v3

    .line 103
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    .line 104
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13

    .line 105
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    .line 106
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 107
    sget-object v8, Lm83/z;->w:Lm83/z;

    if-nez v19, :cond_27

    move-object/from16 v16, v8

    goto :goto_1a

    :cond_27
    move-object/from16 v16, v19

    :goto_1a
    if-eqz v20, :cond_28

    .line 108
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v14

    :goto_1b
    move/from16 v21, v14

    goto :goto_1c

    :cond_28
    const/4 v14, 0x0

    goto :goto_1b

    .line 109
    :goto_1c
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v22

    if-eqz v36, :cond_29

    .line 110
    invoke-static/range {v36 .. v36}, Lm83/g0;->j0(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v8

    :cond_29
    move v14, v6

    move-object/from16 v25, v8

    move-object/from16 v20, v9

    move-object/from16 v19, v11

    move-object v9, v15

    move-object/from16 v6, v17

    move-object/from16 v12, v18

    move-object/from16 v17, v23

    move-object/from16 v8, v34

    move-object/from16 v18, v1

    move-object/from16 v23, v2

    move v11, v4

    move v15, v7

    move-object v7, v10

    move-object v10, v3

    .line 111
    invoke-direct/range {v5 .. v25}, Lio/getstream/chat/android/models/Poll;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/VotingVisibility;ZLjava/lang/Integer;ZZILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;ZILjava/util/List;Lio/getstream/chat/android/models/User;Ljava/util/Map;)V

    return-object v5

    nop

    :sswitch_data_0
    .sparse-switch
        -0x66ca7c04 -> :sswitch_13
        -0x5f385681 -> :sswitch_12
        -0x5eb592d6 -> :sswitch_11
        -0x4a797962 -> :sswitch_10
        -0x354171df -> :sswitch_f
        -0x2f3ded69 -> :sswitch_e
        -0x119c6dc9 -> :sswitch_d
        -0x8eb1f30 -> :sswitch_c
        0xd1b -> :sswitch_b
        0x337a8b -> :sswitch_a
        0x1b0640d7 -> :sswitch_9
        0x29fd77bd -> :sswitch_8
        0x314137c4 -> :sswitch_7
        0x4b5080c5 -> :sswitch_6
        0x51a3a8ea -> :sswitch_5
        0x51a3a90e -> :sswitch_4
        0x6b7cd5bb -> :sswitch_3
        0x712b0eaf -> :sswitch_2
        0x745785ec -> :sswitch_1
        0x7c27af7a -> :sswitch_0
    .end sparse-switch
.end method

.method public final bridge synthetic fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/parser2/direct/PollAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/models/Poll;

    move-result-object p1

    return-object p1
.end method

.method public final toJson(Lqx/c0;Lio/getstream/chat/android/models/Poll;)V
    .locals 0

    const-string p2, "p0"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    .line 2
    const-string p2, "Serialization not supported for direct-to-domain path"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final bridge synthetic toJson(Lqx/c0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lio/getstream/chat/android/models/Poll;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/parser2/direct/PollAdapter;->toJson(Lqx/c0;Lio/getstream/chat/android/models/Poll;)V

    const/4 p1, 0x0

    throw p1
.end method
