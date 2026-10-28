.class public final Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxh/i;


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0008\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0096@\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u000cR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor;",
        "Lxh/i;",
        "Lkotlin/Function0;",
        "Lio/getstream/chat/android/client/cdn/CDN;",
        "cdn",
        "<init>",
        "(Lc93/a;)V",
        "Lxh/h;",
        "chain",
        "Lfi/l;",
        "intercept",
        "(Lxh/h;Lq83/d;)Ljava/lang/Object;",
        "Lc93/a;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "stream-chat-android-ui-common_release"
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
.field public static final $stable:I = 0x8


# instance fields
.field private final cdn:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final logger$delegate:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor;-><init>(Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "cdn"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor;->cdn:Lc93/a;

    .line 4
    const-string p1, "Chat:CDNImageInterceptor"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor;->logger$delegate:Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 5
    new-instance p1, Lio/getstream/chat/android/client/k;

    const/16 p2, 0x12

    invoke-direct {p1, p2}, Lio/getstream/chat/android/client/k;-><init>(I)V

    .line 6
    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor;-><init>(Lc93/a;)V

    return-void
.end method

.method private static final _init_$lambda$0()Lio/getstream/chat/android/client/cdn/CDN;
    .locals 2

    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient$Companion;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient;->getCdn()Lio/getstream/chat/android/client/cdn/CDN;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static synthetic a()Lio/getstream/chat/android/client/cdn/CDN;
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor;->_init_$lambda$0()Lio/getstream/chat/android/client/cdn/CDN;

    move-result-object v0

    return-object v0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method


# virtual methods
.method public final intercept(Lxh/h;Lq83/d;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxh/h;",
            "Lq83/d<",
            "-",
            "Lfi/l;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;

    iget v1, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;-><init>(Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->label:I

    const/4 v3, 0x5

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v2, :cond_6

    if-eq v2, v7, :cond_2

    if-eq v2, v6, :cond_1

    if-eq v2, v5, :cond_5

    if-eq v2, v4, :cond_4

    if-ne v2, v3, :cond_3

    iget-object p1, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->L$7:Ljava/lang/Object;

    check-cast p1, Lfi/i;

    iget-object p1, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->L$6:Ljava/lang/Object;

    check-cast p1, Lbi/q;

    iget-object p1, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->L$5:Ljava/lang/Object;

    check-cast p1, Lbi/q;

    iget-object p1, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->L$4:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/cdn/CDNRequest;

    :cond_1
    :goto_1
    iget-object p1, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->L$3:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lfi/i;

    iget-object p1, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/cdn/CDN;

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lxh/h;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p2

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    iget-object p1, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->L$4:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Exception;

    goto :goto_1

    :cond_5
    iget-object p1, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->L$3:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->L$2:Ljava/lang/Object;

    check-cast v2, Lfi/i;

    iget-object v5, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->L$1:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/client/cdn/CDN;

    iget-object v5, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->L$0:Ljava/lang/Object;

    check-cast v5, Lxh/h;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v10, p1

    move-object p1, v5

    goto :goto_2

    :catch_0
    move-exception p2

    goto/16 :goto_4

    :cond_6
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor;->cdn:Lc93/a;

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/client/cdn/CDN;

    if-nez p2, :cond_8

    iput-object v8, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->L$0:Ljava/lang/Object;

    iput v7, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->label:I

    check-cast p1, Lxh/k;

    invoke-virtual {p1, v0}, Lxh/k;->c(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto/16 :goto_5

    :cond_7
    return-object p1

    :cond_8
    move-object v2, p1

    check-cast v2, Lxh/k;

    iget-object v9, v2, Lxh/k;->d:Lfi/i;

    iget-object v10, v9, Lfi/i;->b:Ljava/lang/Object;

    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v10

    const-string v11, "http://"

    invoke-static {v10, v11, v7}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v11

    if-nez v11, :cond_a

    const-string v11, "https://"

    invoke-static {v10, v11, v7}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v11

    if-nez v11, :cond_a

    iput-object v8, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->L$0:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->L$1:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->L$2:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->L$3:Ljava/lang/Object;

    iput v6, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->label:I

    invoke-virtual {v2, v0}, Lxh/k;->c(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    goto/16 :goto_5

    :cond_9
    return-object p1

    :cond_a
    :try_start_1
    sget-object v2, Lbc3/q0;->a:Lkc3/e;

    sget-object v2, Lkc3/d;->w:Lkc3/d;

    new-instance v6, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$cdnRequest$1;

    invoke-direct {v6, p2, v10, v8}, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$cdnRequest$1;-><init>(Lio/getstream/chat/android/client/cdn/CDN;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->L$0:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->L$1:Ljava/lang/Object;

    iput-object v9, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->L$2:Ljava/lang/Object;

    iput-object v10, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->L$3:Ljava/lang/Object;

    iput v5, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->label:I

    invoke-static {v2, v6, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_b

    goto/16 :goto_5

    :cond_b
    move-object v2, v9

    :goto_2
    check-cast p2, Lio/getstream/chat/android/client/cdn/CDNRequest;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    sget-object v4, Lbi/h;->b:Lf93/a;

    invoke-static {v2, v4}, Lrh/o;->e(Lfi/i;Lf93/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lbi/q;

    new-instance v5, Ln83/f;

    invoke-direct {v5}, Ln83/f;-><init>()V

    iget-object v4, v4, Lbi/q;->a:Ljava/util/Map;

    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_c
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v6}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-eqz v6, :cond_c

    invoke-virtual {v5, v9, v6}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_d
    invoke-virtual {p2}, Lio/getstream/chat/android/client/cdn/CDNRequest;->getHeaders()Ljava/util/Map;

    move-result-object v4

    if-eqz v4, :cond_e

    invoke-virtual {v5, v4}, Ln83/f;->putAll(Ljava/util/Map;)V

    :cond_e
    invoke-virtual {v5}, Ln83/f;->b()Ln83/f;

    move-result-object v4

    invoke-static {v4}, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoaderKt;->toNetworkHeaders(Ljava/util/Map;)Lbi/q;

    move-result-object v4

    iget-object v5, v2, Lfi/i;->a:Landroid/content/Context;

    new-instance v6, Lfi/e;

    invoke-direct {v6, v2, v5}, Lfi/e;-><init>(Lfi/i;Landroid/content/Context;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/client/cdn/CDNRequest;->getUrl()Ljava/lang/String;

    move-result-object p2

    iput-object p2, v6, Lfi/e;->c:Ljava/lang/Object;

    invoke-virtual {v6}, Lfi/e;->b()Lrh/h;

    move-result-object p2

    sget-object v2, Lbi/h;->b:Lf93/a;

    invoke-virtual {p2, v2, v4}, Lrh/h;->a(Lf93/a;Ljava/lang/Object;)V

    invoke-virtual {v6}, Lfi/e;->a()Lfi/i;

    move-result-object p2

    check-cast p1, Lxh/k;

    iget v2, p1, Lxh/k;->c:I

    if-lez v2, :cond_f

    iget-object v4, p1, Lxh/k;->b:Ljava/util/List;

    sub-int/2addr v2, v7

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lxh/i;

    invoke-virtual {p1, p2, v2}, Lxh/k;->a(Lfi/i;Lxh/i;)V

    :cond_f
    const/4 v2, 0x0

    invoke-static {p1, v2, p2, v3}, Lxh/k;->b(Lxh/k;ILfi/i;I)Lxh/k;

    move-result-object p1

    iput-object v8, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->L$0:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->L$1:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->L$2:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->L$3:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->L$4:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->L$5:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->L$6:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->L$7:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->label:I

    invoke-virtual {p1, v0}, Lxh/k;->c(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_10

    goto :goto_5

    :cond_10
    return-object p1

    :catch_1
    move-exception p2

    move-object v5, p1

    move-object p1, v10

    :goto_4
    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v6, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->F:Lb23/g;

    invoke-interface {v3, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_11

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    const-string v3, "[intercept] CDN.imageRequest() failed for url: "

    const-string v9, ". Falling back to original request."

    invoke-static {v3, p1, v9}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, v7, v6, p1, p2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_11
    iput-object v8, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->L$0:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->L$1:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->L$2:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->L$3:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->L$4:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor$intercept$1;->label:I

    check-cast v5, Lxh/k;

    invoke-virtual {v5, v0}, Lxh/k;->c(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_12

    :goto_5
    return-object v1

    :cond_12
    return-object p1
.end method
