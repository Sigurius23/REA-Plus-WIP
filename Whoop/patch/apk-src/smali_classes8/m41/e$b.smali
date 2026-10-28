.class final Lm41/e$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm41/e;->F(Ln41/e;ZLc93/a;Landroidx/compose/runtime/Composer;II)Ln41/f;
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
    c = "com.whoop.design.atomic.molecule.timer.TimerComponentKt$rememberTimerState$1$1"
    f = "TimerComponent.kt"
    l = {
        0x98
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:J

.field final synthetic F:Ln41/f;

.field final synthetic G:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field w:J

.field x:J

.field y:I

.field final synthetic z:Z


# direct methods
.method public constructor <init>(ZJLn41/f;Lp1/t2;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZJ",
            "Ln41/f;",
            "Lp1/t2;",
            "Lq83/d<",
            "-",
            "Lm41/e$b;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lm41/e$b;->z:Z

    iput-wide p2, p0, Lm41/e$b;->E:J

    iput-object p4, p0, Lm41/e$b;->F:Ln41/f;

    iput-object p5, p0, Lm41/e$b;->G:Lp1/t2;

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

    new-instance v0, Lm41/e$b;

    iget-boolean v1, p0, Lm41/e$b;->z:Z

    iget-wide v2, p0, Lm41/e$b;->E:J

    iget-object v4, p0, Lm41/e$b;->F:Ln41/f;

    iget-object v5, p0, Lm41/e$b;->G:Lp1/t2;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lm41/e$b;-><init>(ZJLn41/f;Lp1/t2;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lm41/e$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lm41/e$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lm41/e$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lm41/e$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lm41/e$b;->y:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lm41/e$b;->z:Z

    if-nez p1, :cond_2

    return-object v2

    :cond_2
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lm41/e$b;->E:J

    sub-long/2addr v6, v4

    const-wide/16 v8, 0x0

    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    iget-object p1, p0, Lm41/e$b;->F:Ln41/f;

    invoke-virtual {p1, v6, v7}, Ln41/f;->b(J)V

    cmp-long p1, v6, v8

    if-gtz p1, :cond_4

    iget-object p1, p0, Lm41/e$b;->G:Lp1/t2;

    invoke-static {p1}, Lm41/e;->E(Lp1/t2;)Lc93/a;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_3
    return-object v2

    :cond_4
    sget-object p1, Lo41/a;->a:Lo41/a;

    invoke-virtual {p1, v6, v7}, Lo41/a;->b(J)J

    move-result-wide v8

    iput-wide v4, p0, Lm41/e$b;->w:J

    iput-wide v6, p0, Lm41/e$b;->x:J

    iput v3, p0, Lm41/e$b;->y:I

    invoke-static {v8, v9, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0
.end method
