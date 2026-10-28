.class final Lcom/whoop/realtime/presentation/RealTimeRecordActivity$r;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/realtime/presentation/RealTimeRecordActivity;->i1(Z)V
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
    c = "com.whoop.realtime.presentation.RealTimeRecordActivity$splashNonWorkout$2"
    f = "RealTimeRecordActivity.kt"
    l = {
        0x205,
        0x206
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
            "Lcom/whoop/realtime/presentation/RealTimeRecordActivity$r;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$r;->E:Lcom/whoop/realtime/presentation/RealTimeRecordActivity;

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

    new-instance v0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$r;

    iget-object v1, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$r;->E:Lcom/whoop/realtime/presentation/RealTimeRecordActivity;

    invoke-direct {v0, v1, p2}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$r;-><init>(Lcom/whoop/realtime/presentation/RealTimeRecordActivity;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$r;->z:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$r;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$r;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$r;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$r;->z:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$r;->y:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$r;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/i0;

    iget-object v0, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$r;->w:Ljava/lang/Object;

    check-cast v0, Lbc3/i0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$r;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/i0;

    iget-object v2, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$r;->w:Ljava/lang/Object;

    check-cast v2, Lbc3/i0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$r$a;

    invoke-direct {p1, v5}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$r$a;-><init>(Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {v0, v5, p1, v2}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object p1

    new-instance v6, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$r$b;

    iget-object v7, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$r;->E:Lcom/whoop/realtime/presentation/RealTimeRecordActivity;

    invoke-direct {v6, v7, v5}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$r$b;-><init>(Lcom/whoop/realtime/presentation/RealTimeRecordActivity;Lq83/d;)V

    invoke-static {v0, v5, v6, v2}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v0

    iput-object v5, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$r;->z:Ljava/lang/Object;

    iput-object v5, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$r;->w:Ljava/lang/Object;

    iput-object v0, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$r;->x:Ljava/lang/Object;

    iput v4, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$r;->y:I

    invoke-virtual {p1, p0}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iput-object v5, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$r;->z:Ljava/lang/Object;

    iput-object v5, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$r;->w:Ljava/lang/Object;

    iput-object v5, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$r;->x:Ljava/lang/Object;

    iput v3, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$r;->y:I

    invoke-interface {v0, p0}, Lbc3/i0;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    :goto_1
    return-object v1

    :cond_4
    :goto_2
    check-cast p1, Lcom/whoop/data/repositories/RestingHeartRate;

    iget-object v0, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$r;->E:Lcom/whoop/realtime/presentation/RealTimeRecordActivity;

    invoke-static {v0}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity;->Q(Lcom/whoop/realtime/presentation/RealTimeRecordActivity;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_7

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$r;->E:Lcom/whoop/realtime/presentation/RealTimeRecordActivity;

    invoke-static {v0}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity;->P(Lcom/whoop/realtime/presentation/RealTimeRecordActivity;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-object v4, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$r;->E:Lcom/whoop/realtime/presentation/RealTimeRecordActivity;

    invoke-static {v4}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity;->M(Lcom/whoop/realtime/presentation/RealTimeRecordActivity;)Lcom/whoop/realtime/service/b;

    move-result-object v4

    if-eqz v4, :cond_5

    iget-object v5, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$r;->E:Lcom/whoop/realtime/presentation/RealTimeRecordActivity;

    invoke-static {v5}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity;->L(Lcom/whoop/realtime/presentation/RealTimeRecordActivity;)Llm2/b;

    move-result-object v5

    invoke-virtual {v4, v2, v3, v5, p1}, Lcom/whoop/realtime/service/b;->Q(JLlm2/b;Lcom/whoop/data/repositories/RestingHeartRate;)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$r;->E:Lcom/whoop/realtime/presentation/RealTimeRecordActivity;

    invoke-static {p1, v0, v2, v3}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity;->W(Lcom/whoop/realtime/presentation/RealTimeRecordActivity;Landroid/view/View;J)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$r;->E:Lcom/whoop/realtime/presentation/RealTimeRecordActivity;

    invoke-static {p1}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity;->X(Lcom/whoop/realtime/presentation/RealTimeRecordActivity;)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$r;->E:Lcom/whoop/realtime/presentation/RealTimeRecordActivity;

    invoke-static {p1, v1}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity;->Z(Lcom/whoop/realtime/presentation/RealTimeRecordActivity;Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_5
    const-string p1, "controller"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v5

    :cond_6
    const-string p1, "sleepSplash"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v5

    :cond_7
    const-string p1, "sleepSplashContent"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v5
.end method
