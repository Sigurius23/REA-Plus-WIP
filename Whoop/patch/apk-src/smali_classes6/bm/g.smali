.class public final Lbm/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/l;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lbm/g;->w:I

    iput-object p1, p0, Lbm/g;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lbm/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbm/g;->x:Ljava/lang/Object;

    check-cast v0, Lbm/g;

    new-instance v1, Lw;

    const/16 v2, 0x1b

    invoke-direct {v1, p1, v2}, Lw;-><init>(Lec3/m;I)V

    invoke-virtual {v0, v1, p2}, Lbm/g;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_0
    return-object p1

    :pswitch_0
    iget-object v0, p0, Lbm/g;->x:Ljava/lang/Object;

    check-cast v0, Lec3/h2;

    new-instance v1, Lw;

    const/16 v2, 0x1a

    invoke-direct {v1, p1, v2}, Lw;-><init>(Lec3/m;I)V

    invoke-virtual {v0, v1, p2}, Lec3/h2;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lbm/g;->x:Ljava/lang/Object;

    check-cast v0, Ln53/e;

    new-instance v1, Lw;

    const/16 v2, 0x8

    invoke-direct {v1, p1, v2}, Lw;-><init>(Lec3/m;I)V

    invoke-virtual {v0, v1, p2}, Ln53/e;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_2
    instance-of v0, p2, Lec3/p;

    if-eqz v0, :cond_1

    move-object v0, p2

    check-cast v0, Lec3/p;

    iget v1, v0, Lec3/p;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_1

    sub-int/2addr v1, v2

    iput v1, v0, Lec3/p;->x:I

    goto :goto_1

    :cond_1
    new-instance v0, Lec3/p;

    invoke-direct {v0, p0, p2}, Lec3/p;-><init>(Lbm/g;Lq83/d;)V

    :goto_1
    iget-object p2, v0, Lec3/p;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lec3/p;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    if-ne v2, v3, :cond_2

    iget p1, v0, Lec3/p;->G:I

    iget v2, v0, Lec3/p;->F:I

    iget-object v4, v0, Lec3/p;->E:Lec3/m;

    iget-object v5, v0, Lec3/p;->z:Lbm/g;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, v4

    goto :goto_3

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lbm/g;->x:Ljava/lang/Object;

    check-cast p2, [Ljava/lang/Object;

    array-length p2, p2

    const/4 v2, 0x0

    move v5, p2

    move-object p2, p1

    move p1, v5

    move-object v5, p0

    :goto_2
    if-ge v2, p1, :cond_5

    iget-object v4, v5, Lbm/g;->x:Ljava/lang/Object;

    check-cast v4, [Ljava/lang/Object;

    aget-object v4, v4, v2

    iput-object v5, v0, Lec3/p;->z:Lbm/g;

    iput-object p2, v0, Lec3/p;->E:Lec3/m;

    iput v2, v0, Lec3/p;->F:I

    iput p1, v0, Lec3/p;->G:I

    iput v3, v0, Lec3/p;->x:I

    invoke-interface {p2, v4, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_4

    goto :goto_4

    :cond_4
    :goto_3
    add-int/2addr v2, v3

    goto :goto_2

    :cond_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_4
    return-object v1

    :pswitch_3
    instance-of v0, p2, Lec3/o;

    if-eqz v0, :cond_6

    move-object v0, p2

    check-cast v0, Lec3/o;

    iget v1, v0, Lec3/o;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_6

    sub-int/2addr v1, v2

    iput v1, v0, Lec3/o;->x:I

    goto :goto_5

    :cond_6
    new-instance v0, Lec3/o;

    invoke-direct {v0, p0, p2}, Lec3/o;-><init>(Lbm/g;Lq83/d;)V

    :goto_5
    iget-object p2, v0, Lec3/o;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lec3/o;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_8

    if-ne v2, v3, :cond_7

    iget-object p1, v0, Lec3/o;->E:Ljava/util/Iterator;

    iget-object v2, v0, Lec3/o;->z:Lec3/m;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, v2

    goto :goto_6

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lbm/g;->x:Ljava/lang/Object;

    check-cast p2, Li93/j;

    invoke-virtual {p2}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move-object v6, p2

    move-object p2, p1

    move-object p1, v6

    :cond_9
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    move-object v2, p1

    check-cast v2, Lm83/e0;

    invoke-virtual {v2}, Lm83/e0;->nextInt()I

    move-result v2

    new-instance v4, Ljava/lang/Integer;

    invoke-direct {v4, v2}, Ljava/lang/Integer;-><init>(I)V

    iput-object p2, v0, Lec3/o;->z:Lec3/m;

    iput-object p1, v0, Lec3/o;->E:Ljava/util/Iterator;

    iput v3, v0, Lec3/o;->x:I

    invoke-interface {p2, v4, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_9

    goto :goto_7

    :cond_a
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_7
    return-object v1

    :pswitch_4
    instance-of v0, p2, Lec3/n;

    if-eqz v0, :cond_b

    move-object v0, p2

    check-cast v0, Lec3/n;

    iget v1, v0, Lec3/n;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_b

    sub-int/2addr v1, v2

    iput v1, v0, Lec3/n;->x:I

    goto :goto_8

    :cond_b
    new-instance v0, Lec3/n;

    invoke-direct {v0, p0, p2}, Lec3/n;-><init>(Lbm/g;Lq83/d;)V

    :goto_8
    iget-object p2, v0, Lec3/n;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lec3/n;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_d

    if-ne v2, v3, :cond_c

    iget-object p1, v0, Lec3/n;->E:Ljava/util/Iterator;

    iget-object v2, v0, Lec3/n;->z:Lec3/m;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, v2

    goto :goto_9

    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lbm/g;->x:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move-object v6, p2

    move-object p2, p1

    move-object p1, v6

    :cond_e
    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    iput-object p2, v0, Lec3/n;->z:Lec3/m;

    iput-object p1, v0, Lec3/n;->E:Ljava/util/Iterator;

    iput v3, v0, Lec3/n;->x:I

    invoke-interface {p2, v2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_e

    goto :goto_a

    :cond_f
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_a
    return-object v1

    :pswitch_5
    iget-object v0, p0, Lbm/g;->x:Ljava/lang/Object;

    check-cast v0, Lec3/s1;

    new-instance v1, Lw;

    const/4 v2, 0x2

    invoke-direct {v1, p1, v2}, Lw;-><init>(Lec3/m;I)V

    invoke-virtual {v0, v1, p2}, Lec3/s1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_10

    goto :goto_b

    :cond_10
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_b
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
