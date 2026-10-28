.class public final Ln53/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/f2;


# instance fields
.field public final synthetic w:I

.field public final x:Lec3/l;

.field public final y:Ll83/e;


# direct methods
.method public constructor <init>(Lc93/a;Lec3/l;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ln53/e;->w:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    check-cast p1, Lkotlin/jvm/internal/m;

    iput-object p1, p0, Ln53/e;->y:Ll83/e;

    .line 6
    iput-object p2, p0, Ln53/e;->x:Lec3/l;

    return-void
.end method

.method public constructor <init>(Lec3/l;Lc93/a;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ln53/e;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ln53/e;->x:Lec3/l;

    .line 3
    iput-object p2, p0, Ln53/e;->y:Ll83/e;

    return-void
.end method


# virtual methods
.method public final collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Ln53/e;->w:I

    packed-switch v0, :pswitch_data_0

    instance-of v0, p2, Lq40/b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lq40/b;

    iget v1, v0, Lq40/b;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lq40/b;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lq40/b;

    invoke-direct {v0, p0, p2}, Lq40/b;-><init>(Ln53/e;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lq40/b;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lq40/b;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lq40/b;->w:Lbc3/k1;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p2

    sget-object v2, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {p2, v2}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p2

    check-cast p2, Lbc3/k1;

    iget-object v2, p0, Ln53/e;->x:Lec3/l;

    invoke-static {v2}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object v2

    iput-object p2, v0, Lq40/b;->w:Lbc3/k1;

    iput v3, v0, Lq40/b;->z:I

    invoke-interface {v2, p1, v0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p2

    :cond_4
    :goto_1
    nop

    if-eqz v0, :cond_4

    invoke-interface {v0}, Lbc3/k1;->isActive()Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_1

    :cond_5
    invoke-interface {v0}, Lbc3/k1;->getCancellationException()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    throw p1

    :pswitch_0
    instance-of v0, p2, Ln53/d;

    if-eqz v0, :cond_6

    move-object v0, p2

    check-cast v0, Ln53/d;

    iget v1, v0, Ln53/d;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_6

    sub-int/2addr v1, v2

    iput v1, v0, Ln53/d;->y:I

    goto :goto_2

    :cond_6
    new-instance v0, Ln53/d;

    invoke-direct {v0, p0, p2}, Ln53/d;-><init>(Ln53/e;Lq83/d;)V

    :goto_2
    iget-object p2, v0, Ln53/d;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ln53/d;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_8

    if-eq v2, v3, :cond_7

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_8
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Ln43/a;

    const/4 v2, 0x0

    const/4 v4, 0x1

    invoke-direct {p2, p0, p1, v2, v4}, Ln43/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v3, v0, Ln53/d;->y:I

    invoke-static {p2, v0}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    return-object v1

    :cond_9
    :goto_3
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getReplayCache()Ljava/util/List;
    .locals 1

    iget v0, p0, Ln53/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ln53/e;->y:Ll83/e;

    check-cast v0, Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ln53/e;->y:Ll83/e;

    check-cast v0, Lkotlin/jvm/internal/m;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ln53/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ln53/e;->y:Ll83/e;

    check-cast v0, Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ln53/e;->y:Ll83/e;

    check-cast v0, Lkotlin/jvm/internal/m;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
