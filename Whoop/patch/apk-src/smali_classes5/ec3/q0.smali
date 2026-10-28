.class public final Lec3/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lec3/m;

.field public final synthetic y:Ls83/i;


# direct methods
.method public constructor <init>(Lc93/m;Lec3/m;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lec3/q0;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    check-cast p1, Ls83/i;

    iput-object p1, p0, Lec3/q0;->y:Ls83/i;

    iput-object p2, p0, Lec3/q0;->x:Lec3/m;

    return-void
.end method

.method public constructor <init>(Lec3/m;Lc93/m;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lec3/q0;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lec3/q0;->x:Lec3/m;

    check-cast p2, Ls83/i;

    iput-object p2, p0, Lec3/q0;->y:Ls83/i;

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lec3/q0;->w:I

    packed-switch v0, :pswitch_data_0

    instance-of v0, p2, Lec3/u0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lec3/u0;

    iget v1, v0, Lec3/u0;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lec3/u0;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lec3/u0;

    invoke-direct {v0, p0, p2}, Lec3/u0;-><init>(Lec3/q0;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lec3/u0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lec3/u0;->x:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lec3/u0;->y:Lec3/m;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lec3/q0;->x:Lec3/m;

    iput-object p2, v0, Lec3/u0;->y:Lec3/m;

    iput v4, v0, Lec3/u0;->x:I

    iget-object v2, p0, Lec3/q0;->y:Ls83/i;

    invoke-interface {v2, p1, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_3

    :cond_4
    move-object v6, p2

    move-object p2, p1

    move-object p1, v6

    :goto_1
    const/4 v2, 0x0

    iput-object v2, v0, Lec3/u0;->y:Lec3/m;

    iput v3, v0, Lec3/u0;->x:I

    invoke-interface {p1, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_3
    return-object v1

    :pswitch_0
    instance-of v0, p2, Lec3/p0;

    if-eqz v0, :cond_6

    move-object v0, p2

    check-cast v0, Lec3/p0;

    iget v1, v0, Lec3/p0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_6

    sub-int/2addr v1, v2

    iput v1, v0, Lec3/p0;->y:I

    goto :goto_4

    :cond_6
    new-instance v0, Lec3/p0;

    invoke-direct {v0, p0, p2}, Lec3/p0;-><init>(Lec3/q0;Lq83/d;)V

    :goto_4
    iget-object p2, v0, Lec3/p0;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lec3/p0;->y:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_9

    if-eq v2, v4, :cond_8

    if-ne v2, v3, :cond_7

    iget-object p1, v0, Lec3/p0;->w:Lec3/q0;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_6

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    iget-object p1, v0, Lec3/p0;->E:Ljava/lang/Object;

    iget-object v2, v0, Lec3/p0;->w:Lec3/q0;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v6, p2

    move-object p2, p1

    move-object p1, v2

    move-object v2, v6

    goto :goto_5

    :cond_9
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Lec3/p0;->w:Lec3/q0;

    iput-object p1, v0, Lec3/p0;->E:Ljava/lang/Object;

    iput v4, v0, Lec3/p0;->y:I

    iget-object p2, p0, Lec3/q0;->y:Ls83/i;

    invoke-interface {p2, p1, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_a

    goto :goto_7

    :cond_a
    move-object v2, p2

    move-object p2, p1

    move-object p1, p0

    :goto_5
    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_b

    iget-object v2, p1, Lec3/q0;->x:Lec3/m;

    iput-object p1, v0, Lec3/p0;->w:Lec3/q0;

    const/4 v5, 0x0

    iput-object v5, v0, Lec3/p0;->E:Ljava/lang/Object;

    iput v3, v0, Lec3/p0;->y:I

    invoke-interface {v2, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_c

    goto :goto_7

    :cond_b
    const/4 v4, 0x0

    :cond_c
    :goto_6
    if-eqz v4, :cond_d

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_7
    return-object v1

    :cond_d
    new-instance p2, Lkotlinx/coroutines/flow/internal/AbortFlowException;

    invoke-direct {p2, p1}, Lkotlinx/coroutines/flow/internal/AbortFlowException;-><init>(Ljava/lang/Object;)V

    throw p2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
