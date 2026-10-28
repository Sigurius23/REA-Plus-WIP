.class final Lcom/whoop/realtime/presentation/RealTimeRecordActivity$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/realtime/presentation/RealTimeRecordActivity;->g0()V
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
    c = "com.whoop.realtime.presentation.RealTimeRecordActivity$countdownWorkout$2"
    f = "RealTimeRecordActivity.kt"
    l = {
        0x22f,
        0x230
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/realtime/presentation/RealTimeRecordActivity;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field private synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/whoop/realtime/presentation/RealTimeRecordActivity;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/realtime/presentation/RealTimeRecordActivity;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/realtime/presentation/RealTimeRecordActivity$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$e;->E:Lcom/whoop/realtime/presentation/RealTimeRecordActivity;

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

    new-instance v0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$e;

    iget-object v1, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$e;->E:Lcom/whoop/realtime/presentation/RealTimeRecordActivity;

    invoke-direct {v0, v1, p2}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$e;-><init>(Lcom/whoop/realtime/presentation/RealTimeRecordActivity;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$e;->z:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$e;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$e;->z:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$e;->y:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$e;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity;

    iget-object v1, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$e;->w:Ljava/lang/Object;

    check-cast v1, Lbc3/i0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$e;->w:Ljava/lang/Object;

    check-cast v0, Lbc3/i0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$e$a;

    iget-object v2, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$e;->E:Lcom/whoop/realtime/presentation/RealTimeRecordActivity;

    invoke-direct {p1, v2, v5}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$e$a;-><init>(Lcom/whoop/realtime/presentation/RealTimeRecordActivity;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {v0, v5, p1, v2}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v0

    iget-object p1, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$e;->E:Lcom/whoop/realtime/presentation/RealTimeRecordActivity;

    iput-object v5, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$e;->z:Ljava/lang/Object;

    iput-object v0, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$e;->w:Ljava/lang/Object;

    iput v4, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$e;->y:I

    invoke-static {p1, p0}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity;->K(Lcom/whoop/realtime/presentation/RealTimeRecordActivity;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$e;->E:Lcom/whoop/realtime/presentation/RealTimeRecordActivity;

    iput-object v5, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$e;->z:Ljava/lang/Object;

    iput-object v5, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$e;->w:Ljava/lang/Object;

    iput-object p1, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$e;->x:Ljava/lang/Object;

    iput v3, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$e;->y:I

    invoke-interface {v0, p0}, Lbc3/i0;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_4

    :goto_1
    return-object v1

    :cond_4
    move-object v6, v0

    move-object v0, p1

    move-object p1, v6

    :goto_2
    check-cast p1, Lcom/whoop/data/repositories/RestingHeartRate;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity;->b0(Lcom/whoop/realtime/presentation/RealTimeRecordActivity;Lcom/whoop/data/repositories/RestingHeartRate;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
