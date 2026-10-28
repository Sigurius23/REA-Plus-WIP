.class final Lod1/b0$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lod1/b0;->d()V
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
    c = "com.whoop.domain.UserStateLifecycleObserver$checkAndCorrectUserState$1"
    f = "UserStateLifecycleObserver.kt"
    l = {
        0x3c,
        0x45,
        0x47
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lod1/b0;


# direct methods
.method public constructor <init>(Lod1/b0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lod1/b0;",
            "Lq83/d<",
            "-",
            "Lod1/b0$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lod1/b0$a;->y:Lod1/b0;

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

    new-instance p1, Lod1/b0$a;

    iget-object v0, p0, Lod1/b0$a;->y:Lod1/b0;

    invoke-direct {p1, v0, p2}, Lod1/b0$a;-><init>(Lod1/b0;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lod1/b0$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lod1/b0$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lod1/b0$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lod1/b0$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lod1/b0$a;->x:I

    const/4 v9, 0x0

    const/4 v10, 0x3

    const/4 v11, 0x2

    const/4 v1, 0x1

    const/4 v12, 0x0

    if-eqz v0, :cond_3

    if-eq v0, v1, :cond_2

    if-eq v0, v11, :cond_1

    if-ne v0, v10, :cond_0

    iget-object v0, p0, Lod1/b0$a;->w:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lod1/b0$a;->w:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, p1

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, p1

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v2, p0, Lod1/b0$a;->y:Lod1/b0;

    invoke-static {v2}, Lod1/b0;->b(Lod1/b0;)Ltr2/n;

    move-result-object v2

    new-instance v4, Lod1/b0$a$b;

    iget-object v3, p0, Lod1/b0$a;->y:Lod1/b0;

    invoke-direct {v4, v3, v12}, Lod1/b0$a$b;-><init>(Lod1/b0;Lq83/d;)V

    iput v1, p0, Lod1/b0$a;->x:I

    move-object v1, v2

    const/4 v2, 0x0

    const-string v3, "Failed to get user state"

    const/4 v6, 0x2

    const/4 v7, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_4

    goto :goto_2

    :cond_4
    :goto_0
    check-cast v0, Lu02/a;

    instance-of v1, v0, Lu02/a$c;

    if-eqz v1, :cond_6

    iget-object v1, p0, Lod1/b0$a;->y:Lod1/b0;

    check-cast v0, Lu02/a$c;

    invoke-virtual {v0}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpg3/v0;

    iput-object v12, p0, Lod1/b0$a;->w:Ljava/lang/Object;

    iput v11, p0, Lod1/b0$a;->x:I

    invoke-static {v1, v0, p0}, Lod1/b0;->c(Lod1/b0;Lpg3/v0;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lod1/b0$a;->y:Lod1/b0;

    invoke-static {v0}, Lod1/b0;->b(Lod1/b0;)Ltr2/n;

    move-result-object v0

    const-string v1, "Auto-correcting stuck user state to IDLE"

    new-array v2, v9, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v1, p0, Lod1/b0$a;->y:Lod1/b0;

    invoke-static {v1}, Lod1/b0;->b(Lod1/b0;)Ltr2/n;

    move-result-object v1

    new-instance v4, Lod1/b0$a$a;

    iget-object v2, p0, Lod1/b0$a;->y:Lod1/b0;

    invoke-direct {v4, v2, v12}, Lod1/b0$a$a;-><init>(Lod1/b0;Lq83/d;)V

    iput-object v12, p0, Lod1/b0$a;->w:Ljava/lang/Object;

    iput v10, p0, Lod1/b0$a;->x:I

    const/4 v2, 0x0

    const-string v3, "Failed to set user state to IDLE"

    const/4 v6, 0x2

    const/4 v7, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_7

    :goto_2
    return-object v8

    :cond_6
    instance-of v0, v0, Lu02/a$b;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lod1/b0$a;->y:Lod1/b0;

    invoke-static {v0}, Lod1/b0;->b(Lod1/b0;)Ltr2/n;

    move-result-object v0

    const-string v1, "Skipping user state correction due to error"

    new-array v2, v9, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_7
    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_8
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
