.class final Lcom/whoop/coaching/sleepcoach/wizard/h$c$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/coaching/sleepcoach/wizard/h$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;",
        "it",
        "Ll83/a0;",
        "<anonymous>",
        "(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.coaching.sleepcoach.wizard.TonightsSleepContainerViewModel$onCreate$1$2"
    f = "TonightsSleepContainerViewModel.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lcom/whoop/coaching/sleepcoach/wizard/h;


# direct methods
.method public constructor <init>(Lcom/whoop/coaching/sleepcoach/wizard/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/coaching/sleepcoach/wizard/h;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/coaching/sleepcoach/wizard/h$c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/wizard/h$c$a;->y:Lcom/whoop/coaching/sleepcoach/wizard/h;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance v0, Lcom/whoop/coaching/sleepcoach/wizard/h$c$a;

    iget-object v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/h$c$a;->y:Lcom/whoop/coaching/sleepcoach/wizard/h;

    invoke-direct {v0, v1, p2}, Lcom/whoop/coaching/sleepcoach/wizard/h$c$a;-><init>(Lcom/whoop/coaching/sleepcoach/wizard/h;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/coaching/sleepcoach/wizard/h$c$a;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/whoop/coaching/sleepcoach/wizard/h$c$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/coaching/sleepcoach/wizard/h$c$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/coaching/sleepcoach/wizard/h$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/coaching/sleepcoach/wizard/h$c$a;->f(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/h$c$a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/h$c$a;->w:I

    if-nez v1, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/coaching/sleepcoach/wizard/h$c$a;->y:Lcom/whoop/coaching/sleepcoach/wizard/h;

    invoke-static {p1, v0}, Lcom/whoop/coaching/sleepcoach/wizard/h;->R(Lcom/whoop/coaching/sleepcoach/wizard/h;Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
