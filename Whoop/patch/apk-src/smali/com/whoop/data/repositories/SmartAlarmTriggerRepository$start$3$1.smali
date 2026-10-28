.class final Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$3$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->start()V
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
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.data.repositories.SmartAlarmTriggerRepository$start$3$1"
    f = "SmartAlarmTriggerRepository.kt"
    l = {
        0x86,
        0x8a,
        0x8e
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$3$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$3$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$3$1;

    iget-object v0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$3$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-direct {p1, v0, p2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$3$1;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$3$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$3$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$3$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$3$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$3$1;->label:I

    const/4 v2, 0x3

    const/4 v3, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$3$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, p0

    goto/16 :goto_7

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$3$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    iget-object v1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$3$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$3$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    iput v3, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$3$1;->label:I

    invoke-static {p1, p0}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getSmartAlarmUserInfo(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_0
    move-object v9, p0

    goto/16 :goto_6

    :cond_4
    :goto_1
    check-cast p1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    if-eqz p1, :cond_a

    iget-object v1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$3$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getWhoopStrap$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Ltd1/b;

    move-result-object v1

    invoke-interface {v1}, Ltd1/b;->f()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lcom/whoop/domain/model/WhoopStrapInfo;->getHardwareVersion()Loh2/c;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Loh2/c;->a()J

    move-result-wide v6

    long-to-int v1, v6

    new-instance v3, Ljava/lang/Integer;

    invoke-direct {v3, v1}, Ljava/lang/Integer;-><init>(I)V

    goto :goto_2

    :cond_5
    move-object v3, v5

    :goto_2
    if-nez v3, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v6, 0x6

    if-eq v1, v6, :cond_8

    :goto_3
    if-nez v3, :cond_7

    goto :goto_4

    :cond_7
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v6, 0xd

    if-ne v1, v6, :cond_9

    :cond_8
    invoke-virtual {p1}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getSmartAlarmEnabled()Z

    move-result p1

    if-nez p1, :cond_9

    iget-object p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$3$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    iput-object v5, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$3$1;->L$0:Ljava/lang/Object;

    iput-object v5, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$3$1;->L$1:Ljava/lang/Object;

    iput v4, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$3$1;->label:I

    invoke-static {p1, p0}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$disableAlarmOnStrapWhenAlarmWasDisabled(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    goto :goto_0

    :cond_9
    :goto_4
    if-nez v3, :cond_a

    iget-object p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$3$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    const-string v1, "failed to get strap generation upon connection"

    invoke-static {p1, v1, v5, v4, v5}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->handledException$default(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Ljava/lang/String;Ljava/lang/Exception;ILjava/lang/Object;)V

    :cond_a
    :goto_5
    iget-object v6, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$3$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    iput-object v5, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$3$1;->L$0:Ljava/lang/Object;

    iput-object v5, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$3$1;->L$1:Ljava/lang/Object;

    iput v2, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$3$1;->label:I

    const-string v7, "connection"

    const/4 v8, 0x0

    const/4 v10, 0x2

    const/4 v11, 0x0

    move-object v9, p0

    invoke-static/range {v6 .. v11}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->resetLwt$default(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Ljava/lang/String;ZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_b

    :goto_6
    return-object v0

    :cond_b
    :goto_7
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$3$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v0}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getLogger(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Ltr2/n;

    move-result-object v0

    const-string v1, "reset lwt on strap connect: "

    invoke-static {v1, p1}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
