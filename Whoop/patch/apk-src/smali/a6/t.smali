.class public final La6/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lec3/m;


# direct methods
.method public synthetic constructor <init>(Lec3/m;I)V
    .locals 0

    iput p2, p0, La6/t;->w:I

    iput-object p1, p0, La6/t;->x:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, La6/t;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    iget-object v2, p0, La6/t;->x:Lec3/m;

    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    const/high16 v4, -0x80000000

    const/4 v5, 0x1

    packed-switch v0, :pswitch_data_0

    instance-of v0, p2, Lec3/h1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lec3/h1;

    iget v6, v0, Lec3/h1;->x:I

    and-int v7, v6, v4

    if-eqz v7, :cond_0

    sub-int/2addr v6, v4

    iput v6, v0, Lec3/h1;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lec3/h1;

    invoke-direct {v0, p0, p2}, Lec3/h1;-><init>(La6/t;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lec3/h1;->w:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v6, v0, Lec3/h1;->x:I

    if-eqz v6, :cond_2

    if-ne v6, v5, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    if-eqz p1, :cond_3

    iput v5, v0, Lec3/h1;->x:I

    invoke-interface {v2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v4, :cond_3

    move-object v1, v4

    :cond_3
    :goto_1
    return-object v1

    :pswitch_0
    instance-of v0, p2, Lch/h;

    if-eqz v0, :cond_4

    move-object v0, p2

    check-cast v0, Lch/h;

    iget v6, v0, Lch/h;->x:I

    and-int v7, v6, v4

    if-eqz v7, :cond_4

    sub-int/2addr v6, v4

    iput v6, v0, Lch/h;->x:I

    goto :goto_2

    :cond_4
    new-instance v0, Lch/h;

    invoke-direct {v0, p0, p2}, Lch/h;-><init>(La6/t;Lq83/d;)V

    :goto_2
    iget-object p2, v0, Lch/h;->w:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v6, v0, Lch/h;->x:I

    if-eqz v6, :cond_6

    if-ne v6, v5, :cond_5

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Lh2/e;

    iget-wide p1, p1, Lh2/e;->a:J

    const-wide v6, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v3, p1, v6

    if-nez v3, :cond_7

    sget-object p1, Lnh/h;->c:Lnh/h;

    goto :goto_4

    :cond_7
    sget-object v3, Lch/v;->b:Lnh/e;

    invoke-static {p1, p2}, Lh2/e;->e(J)F

    move-result v3

    float-to-double v6, v3

    const-wide/high16 v8, 0x3fe0000000000000L    # 0.5

    cmpl-double v3, v6, v8

    if-ltz v3, :cond_a

    invoke-static {p1, p2}, Lh2/e;->c(J)F

    move-result v3

    float-to-double v6, v3

    cmpl-double v3, v6, v8

    if-ltz v3, :cond_a

    new-instance v3, Lnh/h;

    invoke-static {p1, p2}, Lh2/e;->e(J)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v7

    sget-object v8, Lnh/b;->a:Lnh/b;

    if-nez v7, :cond_8

    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    if-nez v6, :cond_8

    invoke-static {p1, p2}, Lh2/e;->e(J)F

    move-result v6

    invoke-static {v6}, Le93/b;->X(F)I

    move-result v6

    new-instance v7, Lnh/a;

    invoke-direct {v7, v6}, Lnh/a;-><init>(I)V

    goto :goto_3

    :cond_8
    move-object v7, v8

    :goto_3
    invoke-static {p1, p2}, Lh2/e;->c(J)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v9

    if-nez v9, :cond_9

    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    if-nez v6, :cond_9

    invoke-static {p1, p2}, Lh2/e;->c(J)F

    move-result p1

    invoke-static {p1}, Le93/b;->X(F)I

    move-result p1

    new-instance v8, Lnh/a;

    invoke-direct {v8, p1}, Lnh/a;-><init>(I)V

    :cond_9
    invoke-direct {v3, v7, v8}, Lnh/h;-><init>(Ldt/b;Ldt/b;)V

    move-object p1, v3

    goto :goto_4

    :cond_a
    const/4 p1, 0x0

    :goto_4
    if-eqz p1, :cond_b

    iput v5, v0, Lch/h;->x:I

    invoke-interface {v2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v4, :cond_b

    move-object v1, v4

    :cond_b
    :goto_5
    return-object v1

    :pswitch_1
    instance-of v0, p2, La6/s;

    if-eqz v0, :cond_c

    move-object v0, p2

    check-cast v0, La6/s;

    iget v6, v0, La6/s;->x:I

    and-int v7, v6, v4

    if-eqz v7, :cond_c

    sub-int/2addr v6, v4

    iput v6, v0, La6/s;->x:I

    goto :goto_6

    :cond_c
    new-instance v0, La6/s;

    invoke-direct {v0, p0, p2}, La6/s;-><init>(La6/t;Lq83/d;)V

    :goto_6
    iget-object p2, v0, La6/s;->w:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v6, v0, La6/s;->x:I

    if-eqz v6, :cond_e

    if-ne v6, v5, :cond_d

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_7

    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, La6/e1;

    instance-of p2, p1, La6/v0;

    if-nez p2, :cond_13

    instance-of p2, p1, La6/b;

    if-eqz p2, :cond_10

    check-cast p1, La6/b;

    iget-object p1, p1, La6/b;->b:Ljava/lang/Object;

    iput v5, v0, La6/s;->x:I

    invoke-interface {v2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v4, :cond_f

    move-object v1, v4

    :cond_f
    :goto_7
    return-object v1

    :cond_10
    instance-of p2, p1, La6/s0;

    if-nez p2, :cond_12

    instance-of p2, p1, La6/h1;

    if-nez p2, :cond_12

    instance-of p1, p1, La6/u0;

    if-eqz p1, :cond_11

    goto :goto_8

    :cond_11
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_12
    :goto_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_13
    check-cast p1, La6/v0;

    iget-object p1, p1, La6/v0;->b:Ljava/lang/Throwable;

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
