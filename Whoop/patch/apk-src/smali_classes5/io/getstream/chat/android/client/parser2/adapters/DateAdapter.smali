.class public final Lio/getstream/chat/android/client/parser2/adapters/DateAdapter;
.super Lcom/squareup/moshi/JsonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/moshi/JsonAdapter<",
        "Ljava/util/Date;",
        ">;"
    }
.end annotation

.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J!\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000c\u001a\u00020\u000bH\u0017\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lio/getstream/chat/android/client/parser2/adapters/DateAdapter;",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Ljava/util/Date;",
        "<init>",
        "()V",
        "Lqx/c0;",
        "writer",
        "value",
        "Ll83/a0;",
        "toJson",
        "(Lqx/c0;Ljava/util/Date;)V",
        "Lcom/squareup/moshi/JsonReader;",
        "reader",
        "fromJson",
        "(Lcom/squareup/moshi/JsonReader;)Ljava/util/Date;",
        "Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;",
        "streamDateFormatter",
        "Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;",
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
.field private final streamDateFormatter:Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lcom/squareup/moshi/JsonAdapter;-><init>()V

    new-instance v0, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;

    const-string v1, "DateAdapter"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/DateAdapter;->streamDateFormatter:Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;

    return-void
.end method


# virtual methods
.method public final bridge synthetic fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/parser2/adapters/DateAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/util/Date;

    move-result-object p1

    return-object p1
.end method

.method public fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/util/Date;
    .locals 2
    .annotation runtime Lqx/p;
    .end annotation

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->k()Lqx/w;

    move-result-object v0

    .line 3
    sget-object v1, Lqx/w;->I:Lqx/w;

    if-ne v0, v1, :cond_0

    .line 4
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->skipValue()V

    const/4 p1, 0x0

    return-object p1

    .line 5
    :cond_0
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->nextString()Ljava/lang/String;

    move-result-object p1

    .line 6
    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/DateAdapter;->streamDateFormatter:Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->parse$stream_chat_android_client_release(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic toJson(Lqx/c0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ljava/util/Date;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/parser2/adapters/DateAdapter;->toJson(Lqx/c0;Ljava/util/Date;)V

    return-void
.end method

.method public toJson(Lqx/c0;Ljava/util/Date;)V
    .locals 1
    .annotation runtime Lqx/t0;
    .end annotation

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lqx/c0;->J()Lqx/c0;

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/DateAdapter;->streamDateFormatter:Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;

    invoke-virtual {v0, p2}, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p2

    .line 4
    invoke-virtual {p1, p2}, Lqx/c0;->F0(Ljava/lang/String;)Lqx/c0;

    return-void
.end method
