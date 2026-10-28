.class public final La6/c0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public F:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public synthetic y:Z

.field public final synthetic z:La6/i0;


# direct methods
.method public synthetic constructor <init>(La6/i0;ILq83/d;I)V
    .locals 0

    iput p4, p0, La6/c0;->w:I

    iput-object p1, p0, La6/c0;->z:La6/i0;

    iput p2, p0, La6/c0;->E:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4

    iget v0, p0, La6/c0;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, La6/c0;

    iget v1, p0, La6/c0;->E:I

    const/4 v2, 0x1

    iget-object v3, p0, La6/c0;->z:La6/i0;

    invoke-direct {v0, v3, v1, p2, v2}, La6/c0;-><init>(La6/i0;ILq83/d;I)V

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, v0, La6/c0;->y:Z

    return-object v0

    :pswitch_0
    new-instance v0, La6/c0;

    iget v1, p0, La6/c0;->E:I

    const/4 v2, 0x0

    iget-object v3, p0, La6/c0;->z:La6/i0;

    invoke-direct {v0, v3, v1, p2, v2}, La6/c0;-><init>(La6/i0;ILq83/d;I)V

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, v0, La6/c0;->y:Z

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, La6/c0;->w:I

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, La6/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, La6/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, La6/c0;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La6/c0;->x:I

    iget-object v2, p0, La6/c0;->z:La6/i0;

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, La6/c0;->F:Ljava/lang/Object;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-boolean v1, p0, La6/c0;->y:Z

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean v1, p0, La6/c0;->y:Z

    iput-boolean v1, p0, La6/c0;->y:Z

    iput v4, p0, La6/c0;->x:I

    invoke-virtual {v2, p0}, La6/i0;->i(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_4

    :cond_3
    :goto_0
    if-eqz v1, :cond_5

    invoke-virtual {v2}, La6/i0;->h()La6/d1;

    move-result-object v1

    iput-object p1, p0, La6/c0;->F:Ljava/lang/Object;

    iput v3, p0, La6/c0;->x:I

    invoke-virtual {v1}, La6/d1;->a()Ljava/lang/Integer;

    move-result-object v1

    if-ne v1, v0, :cond_4

    goto :goto_4

    :cond_4
    move-object v0, p1

    move-object p1, v1

    :goto_1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    goto :goto_2

    :cond_5
    iget v0, p0, La6/c0;->E:I

    move v5, v0

    move-object v0, p1

    move p1, v5

    :goto_2
    new-instance v1, La6/b;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_3

    :cond_6
    const/4 v2, 0x0

    :goto_3
    invoke-direct {v1, v0, v2, p1}, La6/b;-><init>(Ljava/lang/Object;II)V

    move-object v0, v1

    :goto_4
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La6/c0;->x:I

    iget-object v2, p0, La6/c0;->z:La6/i0;

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_9

    if-eq v1, v4, :cond_8

    if-ne v1, v3, :cond_7

    iget-boolean v0, p0, La6/c0;->y:Z

    iget-object v1, p0, La6/c0;->F:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_7

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    iget-boolean v1, p0, La6/c0;->y:Z

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_5

    :catchall_0
    move-exception p1

    goto :goto_6

    :cond_9
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean v1, p0, La6/c0;->y:Z

    :try_start_1
    iput-boolean v1, p0, La6/c0;->y:Z

    iput v4, p0, La6/c0;->x:I

    invoke-static {v2, v1, p0}, La6/i0;->g(La6/i0;ZLs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    goto :goto_a

    :cond_a
    :goto_5
    check-cast p1, La6/e1;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_9

    :goto_6
    if-eqz v1, :cond_c

    invoke-virtual {v2}, La6/i0;->h()La6/d1;

    move-result-object v2

    iput-object p1, p0, La6/c0;->F:Ljava/lang/Object;

    iput-boolean v1, p0, La6/c0;->y:Z

    iput v3, p0, La6/c0;->x:I

    invoke-virtual {v2}, La6/d1;->a()Ljava/lang/Integer;

    move-result-object v2

    if-ne v2, v0, :cond_b

    goto :goto_a

    :cond_b
    move v0, v1

    move-object v1, p1

    move-object p1, v2

    :goto_7
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    goto :goto_8

    :cond_c
    iget v0, p0, La6/c0;->E:I

    move v5, v1

    move-object v1, p1

    move p1, v0

    move v0, v5

    :goto_8
    new-instance v2, La6/v0;

    invoke-direct {v2, p1, v1}, La6/v0;-><init>(ILjava/lang/Throwable;)V

    move v1, v0

    move-object p1, v2

    :goto_9
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    new-instance v1, Ll83/k;

    invoke-direct {v1, p1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v0, v1

    :goto_a
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
