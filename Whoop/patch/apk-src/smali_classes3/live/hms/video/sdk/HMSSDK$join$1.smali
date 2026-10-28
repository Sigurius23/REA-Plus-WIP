.class final Llive/hms/video/sdk/HMSSDK$join$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/sdk/HMSSDK;->join(Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/sdk/HMSUpdateListener;)V
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
    c = "live.hms.video.sdk.HMSSDK$join$1"
    f = "HMSSDK.kt"
    l = {
        0x315,
        0x74
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $config:Llive/hms/video/sdk/models/HMSConfig;

.field final synthetic $hmsUpdateListener:Llive/hms/video/sdk/HMSUpdateListener;

.field final synthetic $time:J

.field J$0:J

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Llive/hms/video/sdk/HMSSDK;


# direct methods
.method public constructor <init>(JLlive/hms/video/sdk/HMSSDK;Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/sdk/HMSUpdateListener;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Llive/hms/video/sdk/HMSSDK;",
            "Llive/hms/video/sdk/models/HMSConfig;",
            "Llive/hms/video/sdk/HMSUpdateListener;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/sdk/HMSSDK$join$1;",
            ">;)V"
        }
    .end annotation

    iput-wide p1, p0, Llive/hms/video/sdk/HMSSDK$join$1;->$time:J

    iput-object p3, p0, Llive/hms/video/sdk/HMSSDK$join$1;->this$0:Llive/hms/video/sdk/HMSSDK;

    iput-object p4, p0, Llive/hms/video/sdk/HMSSDK$join$1;->$config:Llive/hms/video/sdk/models/HMSConfig;

    iput-object p5, p0, Llive/hms/video/sdk/HMSSDK$join$1;->$hmsUpdateListener:Llive/hms/video/sdk/HMSUpdateListener;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
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

    new-instance v0, Llive/hms/video/sdk/HMSSDK$join$1;

    iget-wide v1, p0, Llive/hms/video/sdk/HMSSDK$join$1;->$time:J

    iget-object v3, p0, Llive/hms/video/sdk/HMSSDK$join$1;->this$0:Llive/hms/video/sdk/HMSSDK;

    iget-object v4, p0, Llive/hms/video/sdk/HMSSDK$join$1;->$config:Llive/hms/video/sdk/models/HMSConfig;

    iget-object v5, p0, Llive/hms/video/sdk/HMSSDK$join$1;->$hmsUpdateListener:Llive/hms/video/sdk/HMSUpdateListener;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Llive/hms/video/sdk/HMSSDK$join$1;-><init>(JLlive/hms/video/sdk/HMSSDK;Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/sdk/HMSUpdateListener;Lq83/d;)V

    return-object v0
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
    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/HMSSDK$join$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/sdk/HMSSDK$join$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/sdk/HMSSDK$join$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/HMSSDK$join$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    const-string v0, " ~~ Post lock Actual SDK join started :: waited for "

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Llive/hms/video/sdk/HMSSDK$join$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const-string v5, "Profiling"

    const/4 v6, 0x0

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK$join$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lmc3/a;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-wide v7, p0, Llive/hms/video/sdk/HMSSDK$join$1;->J$0:J

    iget-object v2, p0, Llive/hms/video/sdk/HMSSDK$join$1;->L$3:Ljava/lang/Object;

    check-cast v2, Llive/hms/video/sdk/HMSUpdateListener;

    iget-object v4, p0, Llive/hms/video/sdk/HMSSDK$join$1;->L$2:Ljava/lang/Object;

    check-cast v4, Llive/hms/video/sdk/models/HMSConfig;

    iget-object v9, p0, Llive/hms/video/sdk/HMSSDK$join$1;->L$1:Ljava/lang/Object;

    check-cast v9, Llive/hms/video/sdk/HMSSDK;

    iget-object v10, p0, Llive/hms/video/sdk/HMSSDK$join$1;->L$0:Ljava/lang/Object;

    check-cast v10, Lmc3/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p1, v10

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v2, "Join Coroutine starting :: waited for "

    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    iget-wide v9, p0, Llive/hms/video/sdk/HMSSDK$join$1;->$time:J

    sub-long/2addr v7, v9

    invoke-virtual {p1, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " m"

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v5, p1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Llive/hms/video/sdk/HMSSDK$join$1;->this$0:Llive/hms/video/sdk/HMSSDK;

    invoke-static {p1}, Llive/hms/video/sdk/HMSSDK;->access$getJoinLeavePreviewMutex$p(Llive/hms/video/sdk/HMSSDK;)Lmc3/a;

    move-result-object p1

    iget-wide v7, p0, Llive/hms/video/sdk/HMSSDK$join$1;->$time:J

    iget-object v9, p0, Llive/hms/video/sdk/HMSSDK$join$1;->this$0:Llive/hms/video/sdk/HMSSDK;

    iget-object v2, p0, Llive/hms/video/sdk/HMSSDK$join$1;->$config:Llive/hms/video/sdk/models/HMSConfig;

    iget-object v10, p0, Llive/hms/video/sdk/HMSSDK$join$1;->$hmsUpdateListener:Llive/hms/video/sdk/HMSUpdateListener;

    iput-object p1, p0, Llive/hms/video/sdk/HMSSDK$join$1;->L$0:Ljava/lang/Object;

    iput-object v9, p0, Llive/hms/video/sdk/HMSSDK$join$1;->L$1:Ljava/lang/Object;

    iput-object v2, p0, Llive/hms/video/sdk/HMSSDK$join$1;->L$2:Ljava/lang/Object;

    iput-object v10, p0, Llive/hms/video/sdk/HMSSDK$join$1;->L$3:Ljava/lang/Object;

    iput-wide v7, p0, Llive/hms/video/sdk/HMSSDK$join$1;->J$0:J

    iput v4, p0, Llive/hms/video/sdk/HMSSDK$join$1;->label:I

    invoke-interface {p1, p0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_3

    goto :goto_1

    :cond_3
    move-object v4, v2

    move-object v2, v10

    :goto_0
    :try_start_1
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    sub-long/2addr v11, v7

    invoke-virtual {v10, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " ms"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v9}, Llive/hms/video/sdk/HMSSDK;->access$getDelegate$p(Llive/hms/video/sdk/HMSSDK;)Llive/hms/video/sdk/SDKDelegate;

    move-result-object v0

    iput-object p1, p0, Llive/hms/video/sdk/HMSSDK$join$1;->L$0:Ljava/lang/Object;

    iput-object v6, p0, Llive/hms/video/sdk/HMSSDK$join$1;->L$1:Ljava/lang/Object;

    iput-object v6, p0, Llive/hms/video/sdk/HMSSDK$join$1;->L$2:Ljava/lang/Object;

    iput-object v6, p0, Llive/hms/video/sdk/HMSSDK$join$1;->L$3:Ljava/lang/Object;

    iput v3, p0, Llive/hms/video/sdk/HMSSDK$join$1;->label:I

    invoke-virtual {v0, v4, v2, p0}, Llive/hms/video/sdk/SDKDelegate;->join(Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/sdk/HMSUpdateListener;Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v0, v1, :cond_4

    :goto_1
    return-object v1

    :cond_4
    move-object v0, p1

    :goto_2
    :try_start_2
    const-string p1, "~~ joinLeavePreviewMutex released ~~"

    invoke-static {v5, p1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-interface {v0, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_1
    move-exception v0

    move-object v13, v0

    move-object v0, p1

    move-object p1, v13

    :goto_3
    invoke-interface {v0, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method
