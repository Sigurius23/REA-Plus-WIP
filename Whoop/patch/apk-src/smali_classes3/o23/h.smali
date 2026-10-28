.class public final Lo23/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo23/d;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ll83/e;

.field public final d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lbc3/c0;Lc93/m;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lo23/h;->a:I

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lo23/h;->b:Ljava/lang/Object;

    .line 8
    check-cast p2, Ls83/i;

    iput-object p2, p0, Lo23/h;->c:Ll83/e;

    .line 9
    const-string p1, "CoroutineCall"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lo23/h;->d:Ljava/lang/Object;

    .line 10
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lo23/h;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lo23/d;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lo23/h;->a:I

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lo23/h;->b:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lo23/h;->c:Ll83/e;

    .line 4
    new-instance p1, Lac3/a;

    invoke-direct {p1}, Lac3/a;-><init>()V

    .line 5
    iput-object p1, p0, Lo23/h;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final await(Lq83/d;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lo23/h;->a:I

    packed-switch v0, :pswitch_data_0

    instance-of v0, p1, Lo23/m;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lo23/m;

    iget v1, v0, Lo23/m;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lo23/m;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lo23/m;

    invoke-direct {v0, p0, p1}, Lo23/m;-><init>(Lo23/h;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lo23/m;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lo23/m;->z:I

    const-string v3, "The call was canceled before complete its execution."

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lo23/m;->w:Lo23/h;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lo23/h;->b:Ljava/lang/Object;

    check-cast p1, Lo23/d;

    iput-object p0, v0, Lo23/m;->w:Lo23/h;

    iput v5, v0, Lo23/m;->z:I

    invoke-interface {p1, v0}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto/16 :goto_5

    :cond_4
    move-object v2, p0

    :goto_1
    move-object v5, p1

    check-cast v5, Ln23/h;

    iget-object v5, v2, Lo23/h;->d:Ljava/lang/Object;

    check-cast v5, Lac3/a;

    invoke-virtual {v5}, Lac3/a;->a()Z

    move-result v5

    const/4 v6, 0x0

    if-nez v5, :cond_5

    goto :goto_2

    :cond_5
    move-object p1, v6

    :goto_2
    check-cast p1, Ln23/h;

    if-eqz p1, :cond_b

    instance-of v5, p1, Ln23/g;

    if-eqz v5, :cond_9

    check-cast p1, Ln23/g;

    iget-object p1, p1, Ln23/g;->a:Ljava/lang/Object;

    iget-object v5, v2, Lo23/h;->c:Ll83/e;

    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-interface {v5, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lo23/d;

    iput-object v5, v2, Lo23/h;->e:Ljava/lang/Object;

    iget-object v2, v2, Lo23/h;->d:Ljava/lang/Object;

    check-cast v2, Lac3/a;

    invoke-virtual {v2}, Lac3/a;->a()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_3

    :cond_6
    move-object p1, v6

    :goto_3
    check-cast p1, Lo23/d;

    if-eqz p1, :cond_8

    iput-object v6, v0, Lo23/m;->w:Lo23/h;

    iput v4, v0, Lo23/m;->z:I

    invoke-interface {p1, v0}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_5

    :cond_7
    :goto_4
    move-object v1, p1

    check-cast v1, Ln23/h;

    if-eqz v1, :cond_8

    goto :goto_5

    :cond_8
    new-instance v1, Ln23/f;

    new-instance p1, Ln23/a;

    invoke-direct {p1, v3}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, p1}, Ln23/f;-><init>(Ln23/e;)V

    goto :goto_5

    :cond_9
    instance-of v0, p1, Ln23/f;

    if-eqz v0, :cond_a

    move-object v1, p1

    goto :goto_5

    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_b
    new-instance v1, Ln23/f;

    new-instance p1, Ln23/a;

    invoke-direct {p1, v3}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, p1}, Ln23/f;-><init>(Ln23/e;)V

    :goto_5
    return-object v1

    :pswitch_0
    new-instance v0, La6/e;

    const/4 v1, 0x0

    const/16 v2, 0x9

    invoke-direct {v0, p0, v1, v2}, La6/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v0, p1}, Lo23/c;->b(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final cancel()V
    .locals 5

    iget v0, p0, Lo23/h;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lo23/h;->d:Ljava/lang/Object;

    check-cast v0, Lac3/a;

    invoke-virtual {v0}, Lac3/a;->b()V

    iget-object v0, p0, Lo23/h;->b:Ljava/lang/Object;

    check-cast v0, Lo23/d;

    invoke-interface {v0}, Lo23/d;->cancel()V

    iget-object v0, p0, Lo23/h;->e:Ljava/lang/Object;

    check-cast v0, Lo23/d;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lo23/d;->cancel()V

    :cond_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lo23/h;->d:Ljava/lang/Object;

    check-cast v0, Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[cancel] no args"

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    iget-object v0, p0, Lo23/h;->e:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbc3/k1;

    invoke-interface {v2, v4}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final enqueue()V
    .locals 2

    iget v0, p0, Lo23/h;->a:I

    packed-switch v0, :pswitch_data_0

    .line 12
    new-instance v0, Llive/hms/video/factories/c;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Llive/hms/video/factories/c;-><init>(I)V

    invoke-virtual {p0, v0}, Lo23/h;->enqueue(Lo23/a;)V

    return-void

    .line 13
    :pswitch_0
    new-instance v0, Llive/hms/video/factories/c;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Llive/hms/video/factories/c;-><init>(I)V

    invoke-virtual {p0, v0}, Lo23/h;->enqueue(Lo23/a;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final enqueue(Lo23/a;)V
    .locals 5

    iget v0, p0, Lo23/h;->a:I

    packed-switch v0, :pswitch_data_0

    .line 1
    iget-object v0, p0, Lo23/h;->b:Ljava/lang/Object;

    check-cast v0, Lo23/d;

    new-instance v1, Lc9/c;

    const/16 v2, 0x1a

    invoke-direct {v1, v2, p0, p1}, Lc9/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lo23/d;->enqueue(Lo23/a;)V

    return-void

    .line 2
    :pswitch_0
    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lo23/h;->d:Ljava/lang/Object;

    check-cast v0, Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    .line 4
    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    .line 5
    sget-object v2, Lb23/g;->y:Lb23/g;

    .line 6
    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    .line 7
    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    .line 8
    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    .line 9
    const-string v1, "[enqueue] no args"

    .line 10
    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 11
    :cond_0
    iget-object v0, p0, Lo23/h;->b:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    new-instance v1, Ln43/a;

    const/4 v2, 0x2

    invoke-direct {v1, p0, p1, v4, v2}, Ln43/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    invoke-static {v0, v4, v4, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final execute()Ln23/h;
    .locals 3

    iget v0, p0, Lo23/h;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lkd/f;

    const/16 v1, 0x15

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2, v1}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    sget-object v1, Lq83/k;->w:Lq83/k;

    invoke-static {v1, v0}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln23/h;

    return-object v0

    :pswitch_0
    new-instance v0, Lkd/f;

    const/16 v1, 0x13

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2, v1}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    sget-object v1, Lq83/k;->w:Lq83/k;

    invoke-static {v1, v0}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln23/h;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
