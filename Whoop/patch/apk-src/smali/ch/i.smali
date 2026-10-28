.class public final Lch/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/l;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lec3/l;


# direct methods
.method public synthetic constructor <init>(Lec3/l;I)V
    .locals 0

    iput p2, p0, Lch/i;->w:I

    iput-object p1, p0, Lch/i;->x:Lec3/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lch/i;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, La6/t;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, La6/t;-><init>(Lec3/m;I)V

    iget-object p1, p0, Lch/i;->x:Lec3/l;

    invoke-interface {p1, v0, p2}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_0
    return-object p1

    :pswitch_0
    instance-of v0, p2, Lec3/m0;

    if-eqz v0, :cond_1

    move-object v0, p2

    check-cast v0, Lec3/m0;

    iget v1, v0, Lec3/m0;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_1

    sub-int/2addr v1, v2

    iput v1, v0, Lec3/m0;->x:I

    goto :goto_1

    :cond_1
    new-instance v0, Lec3/m0;

    invoke-direct {v0, p0, p2}, Lec3/m0;-><init>(Lch/i;Lq83/d;)V

    :goto_1
    iget-object p2, v0, Lec3/m0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lec3/m0;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    if-ne v2, v3, :cond_2

    iget-object p1, v0, Lec3/m0;->z:Ljava/lang/Object;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/coroutines/flow/internal/AbortFlowException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p2

    goto :goto_2

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Ljava/lang/Object;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    new-instance v2, Lkotlin/jvm/internal/e0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    :try_start_1
    iget-object v4, p0, Lch/i;->x:Lec3/l;

    new-instance v5, Lc0/a0;

    const/4 v6, 0x3

    invoke-direct {v5, v2, p1, p2, v6}, Lc0/a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object p2, v0, Lec3/m0;->z:Ljava/lang/Object;

    iput v3, v0, Lec3/m0;->x:I

    invoke-interface {v4, v5, v0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Lkotlinx/coroutines/flow/internal/AbortFlowException; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p1, v1, :cond_4

    goto :goto_4

    :catch_1
    move-exception p1

    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    :goto_2
    iget-object v0, p2, Lkotlinx/coroutines/flow/internal/AbortFlowException;->w:Ljava/lang/Object;

    if-ne v0, p1, :cond_5

    :cond_4
    :goto_3
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_4
    return-object v1

    :cond_5
    throw p2

    :pswitch_1
    new-instance v0, La6/t;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, La6/t;-><init>(Lec3/m;I)V

    iget-object p1, p0, Lch/i;->x:Lec3/l;

    invoke-interface {p1, v0, p2}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_6

    goto :goto_5

    :cond_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_5
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
