.class public final Landroidx/room/d2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Landroidx/room/i2;


# direct methods
.method public synthetic constructor <init>(Landroidx/room/i2;Lq83/d;I)V
    .locals 0

    iput p3, p0, Landroidx/room/d2;->w:I

    iput-object p1, p0, Landroidx/room/d2;->z:Landroidx/room/i2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, Landroidx/room/d2;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Landroidx/room/d2;

    iget-object v1, p0, Landroidx/room/d2;->z:Landroidx/room/i2;

    const/4 v2, 0x1

    invoke-direct {v0, v1, p2, v2}, Landroidx/room/d2;-><init>(Landroidx/room/i2;Lq83/d;I)V

    iput-object p1, v0, Landroidx/room/d2;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_0
    new-instance v0, Landroidx/room/d2;

    iget-object v1, p0, Landroidx/room/d2;->z:Landroidx/room/i2;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p2, v2}, Landroidx/room/d2;-><init>(Landroidx/room/i2;Lq83/d;I)V

    iput-object p1, v0, Landroidx/room/d2;->y:Ljava/lang/Object;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Landroidx/room/d2;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/room/x1;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/d2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/d2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/d2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Landroidx/room/v1;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/d2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/d2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/d2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Landroidx/room/d2;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Landroidx/room/d2;->x:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Landroidx/room/d2;->y:Ljava/lang/Object;

    check-cast v1, Landroidx/room/x1;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/d2;->y:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Landroidx/room/x1;

    iput-object v1, p0, Landroidx/room/d2;->y:Ljava/lang/Object;

    iput v3, p0, Landroidx/room/d2;->x:I

    invoke-interface {v1, p0}, Landroidx/room/x1;->a(Lq83/d;)Ljava/lang/Boolean;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_3

    :cond_3
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    :try_start_1
    sget-object p1, Landroidx/room/w1;->x:Landroidx/room/w1;

    new-instance v3, Landroidx/room/d2;

    iget-object v4, p0, Landroidx/room/d2;->z:Landroidx/room/i2;

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct {v3, v4, v6, v5}, Landroidx/room/d2;-><init>(Landroidx/room/i2;Lq83/d;I)V

    iput-object v6, p0, Landroidx/room/d2;->y:Ljava/lang/Object;

    iput v2, p0, Landroidx/room/d2;->x:I

    invoke-interface {v1, p1, v3, p0}, Landroidx/room/x1;->b(Landroidx/room/w1;Lc93/m;Ls83/i;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_3

    :cond_5
    :goto_1
    move-object v0, p1

    check-cast v0, Ljava/util/Set;
    :try_end_1
    .catch Landroid/database/SQLException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :catch_0
    :goto_2
    sget-object v0, Lm83/a0;->w:Lm83/a0;

    :goto_3
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Landroidx/room/d2;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_7

    if-ne v1, v2, :cond_6

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/d2;->y:Ljava/lang/Object;

    check-cast p1, Landroidx/room/v1;

    iput v2, p0, Landroidx/room/d2;->x:I

    iget-object v1, p0, Landroidx/room/d2;->z:Landroidx/room/i2;

    invoke-static {v1, p1, p0}, Landroidx/room/i2;->a(Landroidx/room/i2;Landroidx/room/j0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    move-object p1, v0

    :cond_8
    :goto_4
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
