.class final Llive/hms/video/sdk/HMSSDK$preview$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/sdk/HMSSDK;->preview(Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/sdk/HMSPreviewListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "live.hms.video.sdk.HMSSDK$preview$1"
    f = "HMSSDK.kt"
    l = {
        0x315,
        0x53
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $config:Llive/hms/video/sdk/models/HMSConfig;

.field final synthetic $listener:Llive/hms/video/sdk/HMSPreviewListener;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Llive/hms/video/sdk/HMSSDK;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/HMSSDK;Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/sdk/HMSPreviewListener;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/HMSSDK;",
            "Llive/hms/video/sdk/models/HMSConfig;",
            "Llive/hms/video/sdk/HMSPreviewListener;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/sdk/HMSSDK$preview$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/sdk/HMSSDK$preview$1;->this$0:Llive/hms/video/sdk/HMSSDK;

    iput-object p2, p0, Llive/hms/video/sdk/HMSSDK$preview$1;->$config:Llive/hms/video/sdk/models/HMSConfig;

    iput-object p3, p0, Llive/hms/video/sdk/HMSSDK$preview$1;->$listener:Llive/hms/video/sdk/HMSPreviewListener;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Llive/hms/video/sdk/HMSSDK$preview$1;

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK$preview$1;->this$0:Llive/hms/video/sdk/HMSSDK;

    iget-object v1, p0, Llive/hms/video/sdk/HMSSDK$preview$1;->$config:Llive/hms/video/sdk/models/HMSConfig;

    iget-object v2, p0, Llive/hms/video/sdk/HMSSDK$preview$1;->$listener:Llive/hms/video/sdk/HMSPreviewListener;

    invoke-direct {p1, v0, v1, v2, p2}, Llive/hms/video/sdk/HMSSDK$preview$1;-><init>(Llive/hms/video/sdk/HMSSDK;Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/sdk/HMSPreviewListener;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/HMSSDK$preview$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/sdk/HMSSDK$preview$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/sdk/HMSSDK$preview$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/HMSSDK$preview$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/sdk/HMSSDK$preview$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK$preview$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lmc3/a;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Llive/hms/video/sdk/HMSSDK$preview$1;->L$3:Ljava/lang/Object;

    check-cast v1, Llive/hms/video/sdk/HMSPreviewListener;

    iget-object v3, p0, Llive/hms/video/sdk/HMSSDK$preview$1;->L$2:Ljava/lang/Object;

    check-cast v3, Llive/hms/video/sdk/models/HMSConfig;

    iget-object v5, p0, Llive/hms/video/sdk/HMSSDK$preview$1;->L$1:Ljava/lang/Object;

    check-cast v5, Llive/hms/video/sdk/HMSSDK;

    iget-object v6, p0, Llive/hms/video/sdk/HMSSDK$preview$1;->L$0:Ljava/lang/Object;

    check-cast v6, Lmc3/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p1, v6

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llive/hms/video/sdk/HMSSDK$preview$1;->this$0:Llive/hms/video/sdk/HMSSDK;

    invoke-static {p1}, Llive/hms/video/sdk/HMSSDK;->access$getJoinLeavePreviewMutex$p(Llive/hms/video/sdk/HMSSDK;)Lmc3/a;

    move-result-object p1

    iget-object v5, p0, Llive/hms/video/sdk/HMSSDK$preview$1;->this$0:Llive/hms/video/sdk/HMSSDK;

    iget-object v1, p0, Llive/hms/video/sdk/HMSSDK$preview$1;->$config:Llive/hms/video/sdk/models/HMSConfig;

    iget-object v6, p0, Llive/hms/video/sdk/HMSSDK$preview$1;->$listener:Llive/hms/video/sdk/HMSPreviewListener;

    iput-object p1, p0, Llive/hms/video/sdk/HMSSDK$preview$1;->L$0:Ljava/lang/Object;

    iput-object v5, p0, Llive/hms/video/sdk/HMSSDK$preview$1;->L$1:Ljava/lang/Object;

    iput-object v1, p0, Llive/hms/video/sdk/HMSSDK$preview$1;->L$2:Ljava/lang/Object;

    iput-object v6, p0, Llive/hms/video/sdk/HMSSDK$preview$1;->L$3:Ljava/lang/Object;

    iput v3, p0, Llive/hms/video/sdk/HMSSDK$preview$1;->label:I

    invoke-interface {p1, p0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_3

    goto :goto_1

    :cond_3
    move-object v3, v1

    move-object v1, v6

    :goto_0
    :try_start_1
    invoke-static {v5}, Llive/hms/video/sdk/HMSSDK;->access$getDelegate$p(Llive/hms/video/sdk/HMSSDK;)Llive/hms/video/sdk/SDKDelegate;

    move-result-object v5

    iput-object p1, p0, Llive/hms/video/sdk/HMSSDK$preview$1;->L$0:Ljava/lang/Object;

    iput-object v4, p0, Llive/hms/video/sdk/HMSSDK$preview$1;->L$1:Ljava/lang/Object;

    iput-object v4, p0, Llive/hms/video/sdk/HMSSDK$preview$1;->L$2:Ljava/lang/Object;

    iput-object v4, p0, Llive/hms/video/sdk/HMSSDK$preview$1;->L$3:Ljava/lang/Object;

    iput v2, p0, Llive/hms/video/sdk/HMSSDK$preview$1;->label:I

    invoke-virtual {v5, v3, v1, p0}, Llive/hms/video/sdk/SDKDelegate;->preview(Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/sdk/HMSPreviewListener;Lq83/d;)Ljava/lang/Object;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    move-object v0, p1

    :goto_2
    invoke-interface {v0, v4}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_1
    move-exception v0

    move-object v7, v0

    move-object v0, p1

    move-object p1, v7

    :goto_3
    invoke-interface {v0, v4}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method
