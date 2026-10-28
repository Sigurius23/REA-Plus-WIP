.class public final Lio/getstream/chat/android/client/parser2/DirectEventParser$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/parser2/DirectEventParser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/getstream/chat/android/client/parser2/DirectEventParser$Companion;",
        "",
        "<init>",
        "()V",
        "",
        "raw",
        "extractType$stream_chat_android_client_release",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "extractType",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$getLogger(Lio/getstream/chat/android/client/parser2/DirectEventParser$Companion;)Lb23/k;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser$Companion;->getLogger()Lb23/k;

    move-result-object p0

    return-object p0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->access$getLogger$delegate$cp()Ll83/h;

    move-result-object v0

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method


# virtual methods
.method public final extractType$stream_chat_android_client_release(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const-string v0, "raw"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto/16 :goto_4

    :cond_0
    new-instance v0, Lne3/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, p1}, Lne3/h;->u1(Ljava/lang/String;)V

    new-instance p1, Lqx/x;

    invoke-direct {p1, v0}, Lqx/x;-><init>(Lne3/j;)V

    :try_start_0
    invoke-virtual {p1}, Lqx/x;->k()Lqx/w;

    move-result-object v0

    sget-object v2, Lqx/w;->y:Lqx/w;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eq v0, v2, :cond_1

    :try_start_1
    invoke-virtual {p1}, Lqx/x;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object v1

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_1
    :try_start_2
    invoke-virtual {p1}, Lqx/x;->beginObject()V

    :goto_0
    invoke-virtual {p1}, Lqx/x;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lqx/x;->nextName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "type"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lqx/x;->k()Lqx/w;

    move-result-object v0

    sget-object v2, Lqx/w;->I:Lqx/w;

    if-ne v0, v2, :cond_2

    invoke-virtual {p1}, Lqx/x;->i()V

    move-object v0, v1

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lqx/x;->nextString()Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_1
    :try_start_3
    invoke-virtual {p1}, Lqx/x;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    return-object v0

    :cond_3
    :try_start_4
    invoke-virtual {p1}, Lqx/x;->skipValue()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_0

    :cond_4
    :try_start_5
    invoke-virtual {p1}, Lqx/x;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    return-object v1

    :goto_2
    :try_start_6
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :catchall_1
    move-exception v2

    :try_start_7
    invoke-static {p1, v0}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    :goto_3
    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser$Companion;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v2, "extractType failed; falling back to DTO path: "

    invoke-static {v2, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v4, v3, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    :goto_4
    return-object v1
.end method
