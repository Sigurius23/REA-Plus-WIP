.class public final Lj00/f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Lj00/h;


# direct methods
.method public synthetic constructor <init>(Lj00/h;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lj00/f;->w:I

    iput-object p1, p0, Lj00/f;->y:Lj00/h;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Lj00/f;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lj00/f;

    iget-object v0, p0, Lj00/f;->y:Lj00/h;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Lj00/f;-><init>(Lj00/h;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lj00/f;

    iget-object v0, p0, Lj00/f;->y:Lj00/h;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Lj00/f;-><init>(Lj00/h;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lj00/f;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lj00/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lj00/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lj00/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lj00/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lj00/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lj00/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lj00/f;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lj00/f;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v7, p0, Lj00/f;->y:Lj00/h;

    iget-object p1, v7, Lj00/h;->P:Ln53/e;

    iget-object v1, v7, Lj00/h;->Q:Ln53/e;

    iget-object v10, v7, Lj00/h;->R:Ln53/e;

    iget-object v3, v7, Lj00/h;->H:Lec3/h2;

    new-instance v4, Liz0/d;

    const/16 v5, 0x8

    invoke-direct {v4, v5}, Liz0/d;-><init>(I)V

    invoke-static {v3, v4}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v11

    new-instance v3, Lj00/g;

    const-string v9, "mapToUserInput(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/stripe/android/link/ui/inline/UserInput;"

    const/4 v5, 0x4

    const/4 v4, 0x5

    const-class v6, Lj00/h;

    const-string v8, "mapToUserInput"

    invoke-direct/range {v3 .. v9}, Lkotlin/jvm/internal/a;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1, v1, v10, v11, v3}, Lec3/v;->o(Lec3/l;Lec3/l;Lec3/l;Lec3/l;Lc93/o;)Landroidx/room/y;

    move-result-object p1

    new-instance v1, Lu;

    const/16 v3, 0xf

    invoke-direct {v1, v7, v3}, Lu;-><init>(Ljava/lang/Object;I)V

    iput v2, p0, Lj00/f;->x:I

    invoke-virtual {p1, v1, p0}, Landroidx/room/y;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_1
    return-object v0

    :pswitch_0
    iget-object v0, p0, Lj00/f;->y:Lj00/h;

    iget-object v1, v0, Lj00/h;->P:Ln53/e;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lj00/f;->x:I

    const/4 v4, 0x0

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v3, :cond_6

    if-eq v3, v8, :cond_5

    if-eq v3, v7, :cond_4

    if-ne v3, v6, :cond_3

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_6

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v0, Lj00/h;->G:Lj00/k;

    iget-object p1, p1, Lj00/k;->d:Ljava/util/List;

    invoke-static {p1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    sget-object v3, Lj00/c0;->x:Lj00/c0;

    if-ne p1, v3, :cond_9

    iput v8, p0, Lj00/f;->x:I

    invoke-static {v0, p0}, Lj00/h;->j(Lj00/h;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_7

    goto :goto_7

    :cond_7
    :goto_3
    iput v7, p0, Lj00/f;->x:I

    new-instance p1, Lio/getstream/chat/android/ui/viewmodel/typing/a;

    const/4 v3, 0x3

    invoke-direct {p1, v0, v3}, Lio/getstream/chat/android/ui/viewmodel/typing/a;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1, v8}, Lec3/v;->v(Lec3/l;I)Lec3/h0;

    move-result-object v1

    new-instance v3, Lg20/p;

    const/16 v6, 0x13

    invoke-direct {v3, v0, p1, v4, v6}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v1, v3, p0}, Lec3/v;->n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_8

    goto :goto_4

    :cond_8
    move-object p1, v5

    :goto_4
    if-ne p1, v2, :cond_b

    goto :goto_7

    :cond_9
    iput v6, p0, Lj00/f;->x:I

    new-instance p1, Lio/getstream/chat/android/ui/viewmodel/typing/a;

    const/4 v3, 0x3

    invoke-direct {p1, v0, v3}, Lio/getstream/chat/android/ui/viewmodel/typing/a;-><init>(Ljava/lang/Object;I)V

    const/4 v3, 0x0

    invoke-static {v1, v3}, Lec3/v;->v(Lec3/l;I)Lec3/h0;

    move-result-object v1

    new-instance v3, Lg20/p;

    const/16 v6, 0x13

    invoke-direct {v3, v0, p1, v4, v6}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v1, v3, p0}, Lec3/v;->n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_a

    goto :goto_5

    :cond_a
    move-object p1, v5

    :goto_5
    if-ne p1, v2, :cond_b

    goto :goto_7

    :cond_b
    :goto_6
    move-object v2, v5

    :goto_7
    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
