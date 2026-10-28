.class public final Lio/getstream/chat/android/client/cdn/internal/CDNOkHttpInterceptor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lud3/g0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\u000c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lio/getstream/chat/android/client/cdn/internal/CDNOkHttpInterceptor;",
        "Lud3/g0;",
        "Lio/getstream/chat/android/client/cdn/CDN;",
        "cdn",
        "<init>",
        "(Lio/getstream/chat/android/client/cdn/CDN;)V",
        "Lud3/f0;",
        "chain",
        "Lud3/x0;",
        "intercept",
        "(Lud3/f0;)Lud3/x0;",
        "Lio/getstream/chat/android/client/cdn/CDN;",
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


# instance fields
.field private final cdn:Lio/getstream/chat/android/client/cdn/CDN;

.field private final logger$delegate:Ll83/h;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/cdn/CDN;)V
    .locals 1

    const-string v0, "cdn"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/cdn/internal/CDNOkHttpInterceptor;->cdn:Lio/getstream/chat/android/client/cdn/CDN;

    const-string p1, "Chat:CDNOkHttpInterceptor"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/cdn/internal/CDNOkHttpInterceptor;->logger$delegate:Ll83/h;

    return-void
.end method

.method public static final synthetic access$getCdn$p(Lio/getstream/chat/android/client/cdn/internal/CDNOkHttpInterceptor;)Lio/getstream/chat/android/client/cdn/CDN;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/cdn/internal/CDNOkHttpInterceptor;->cdn:Lio/getstream/chat/android/client/cdn/CDN;

    return-object p0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/cdn/internal/CDNOkHttpInterceptor;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method


# virtual methods
.method public final intercept(Lud3/f0;)Lud3/x0;
    .locals 9

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lae3/i;

    iget-object v0, p1, Lae3/i;->e:Lud3/o0;

    iget-object v1, v0, Lud3/o0;->a:Lud3/e0;

    iget-object v1, v1, Lud3/e0;->i:Ljava/lang/String;

    const/4 v2, 0x0

    :try_start_0
    new-instance v3, Lio/getstream/chat/android/client/cdn/internal/CDNOkHttpInterceptor$intercept$1;

    invoke-direct {v3, p0, v1, v2}, Lio/getstream/chat/android/client/cdn/internal/CDNOkHttpInterceptor$intercept$1;-><init>(Lio/getstream/chat/android/client/cdn/internal/CDNOkHttpInterceptor;Ljava/lang/String;Lq83/d;)V

    sget-object v4, Lq83/k;->w:Lq83/k;

    invoke-static {v4, v3}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/client/cdn/CDNRequest;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    invoke-direct {p0}, Lio/getstream/chat/android/client/cdn/internal/CDNOkHttpInterceptor;->getLogger()Lb23/k;

    move-result-object v4

    invoke-virtual {v4}, Lb23/k;->c()Lb23/e;

    move-result-object v5

    sget-object v6, Lb23/g;->F:Lb23/g;

    invoke-virtual {v4}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v6, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v4}, Lb23/k;->a()Lb23/j;

    move-result-object v5

    invoke-virtual {v4}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v4

    const-string v7, "[intercept] CDN.fileRequest() failed for url: "

    const-string v8, ". Falling back to original request."

    invoke-static {v7, v1, v8}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v6, v4, v7, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    new-instance v3, Lio/getstream/chat/android/client/cdn/CDNRequest;

    const/4 v4, 0x2

    invoke-direct {v3, v1, v2, v4, v2}, Lio/getstream/chat/android/client/cdn/CDNRequest;-><init>(Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_0
    invoke-virtual {v3}, Lio/getstream/chat/android/client/cdn/CDNRequest;->component1()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3}, Lio/getstream/chat/android/client/cdn/CDNRequest;->component2()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v0}, Lud3/o0;->b()Lud3/n0;

    move-result-object v0

    invoke-virtual {v0, v1}, Lud3/n0;->f(Ljava/lang/String;)V

    if-eqz v2, :cond_1

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v3, v2}, Lud3/n0;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    new-instance v1, Lud3/o0;

    invoke-direct {v1, v0}, Lud3/o0;-><init>(Lud3/n0;)V

    invoke-virtual {p1, v1}, Lae3/i;->b(Lud3/o0;)Lud3/x0;

    move-result-object p1

    return-object p1
.end method
