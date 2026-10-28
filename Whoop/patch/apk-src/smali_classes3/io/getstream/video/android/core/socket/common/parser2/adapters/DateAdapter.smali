.class public final Lio/getstream/video/android/core/socket/common/parser2/adapters/DateAdapter;
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

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0017\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tH\u0017\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lio/getstream/video/android/core/socket/common/parser2/adapters/DateAdapter;",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Ljava/util/Date;",
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
        "stream-video-android-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lb53/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/squareup/moshi/JsonAdapter;-><init>()V

    new-instance v0, Lb53/b;

    invoke-direct {v0}, Lb53/b;-><init>()V

    iput-object v0, p0, Lio/getstream/video/android/core/socket/common/parser2/adapters/DateAdapter;->a:Lb53/b;

    return-void
.end method


# virtual methods
.method public final bridge synthetic fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/getstream/video/android/core/socket/common/parser2/adapters/DateAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/util/Date;

    move-result-object p1

    return-object p1
.end method

.method public fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/util/Date;
    .locals 6
    .annotation runtime Lqx/p;
    .end annotation

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->k()Lqx/w;

    move-result-object v0

    .line 3
    sget-object v1, Lqx/w;->I:Lqx/w;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    .line 4
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->skipValue()V

    return-object v2

    .line 5
    :cond_0
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->nextString()Ljava/lang/String;

    move-result-object p1

    .line 6
    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, p0, Lio/getstream/video/android/core/socket/common/parser2/adapters/DateAdapter;->a:Lb53/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v0, Lb53/b;->b:Ll83/p;

    .line 7
    iget-object v3, v0, Lb53/b;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 8
    iget-object v4, v0, Lb53/b;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 9
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 10
    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La0/a0;

    .line 11
    invoke-virtual {v3, p1}, La0/a0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Date;

    if-eqz v3, :cond_1

    .line 12
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    return-object v3

    .line 13
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    .line 14
    :cond_2
    :try_start_0
    invoke-static {p1}, Lsc3/l;->i(Ljava/lang/String;)Ljava/time/OffsetDateTime;

    move-result-object v3

    invoke-virtual {v3}, Ljava/time/OffsetDateTime;->toInstant()Ljava/time/Instant;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Date;->from(Ljava/time/Instant;)Ljava/util/Date;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v2, v0

    goto :goto_0

    .line 15
    :catchall_0
    :try_start_1
    iget-object v3, v0, Lb53/b;->a:Lio/sentry/internal/debugmeta/c;

    sget-object v4, Lb53/b;->e:[Lj93/z;

    const/4 v5, 0x1

    aget-object v4, v4, v5

    invoke-virtual {v3, v0, v4}, Lio/sentry/internal/debugmeta/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/text/SimpleDateFormat;

    .line 16
    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    :goto_0
    if-nez v2, :cond_3

    goto :goto_1

    .line 17
    :cond_3
    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La0/a0;

    .line 18
    invoke-virtual {v0, p1, v2}, La0/a0;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    return-object v2
.end method

.method public final bridge synthetic toJson(Lqx/c0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ljava/util/Date;

    invoke-virtual {p0, p1, p2}, Lio/getstream/video/android/core/socket/common/parser2/adapters/DateAdapter;->toJson(Lqx/c0;Ljava/util/Date;)V

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
    iget-object v0, p0, Lio/getstream/video/android/core/socket/common/parser2/adapters/DateAdapter;->a:Lb53/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    invoke-virtual {p2}, Ljava/util/Date;->toInstant()Ljava/time/Instant;

    move-result-object p2

    sget-object v0, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    invoke-virtual {p2, v0}, Ljava/time/Instant;->atOffset(Ljava/time/ZoneOffset;)Ljava/time/OffsetDateTime;

    move-result-object p2

    invoke-static {p2}, Lsc3/l;->g(Ljava/time/OffsetDateTime;)Ljava/lang/String;

    move-result-object p2

    .line 5
    invoke-virtual {p1, p2}, Lqx/c0;->F0(Ljava/lang/String;)Lqx/c0;

    return-void
.end method
