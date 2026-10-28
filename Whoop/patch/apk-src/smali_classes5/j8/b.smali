.class public final Lj8/b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Lec3/l;

.field public final synthetic z:Lp1/r1;


# direct methods
.method public synthetic constructor <init>(Lec3/l;Lp1/r1;Lq83/d;I)V
    .locals 0

    iput p4, p0, Lj8/b;->w:I

    iput-object p1, p0, Lj8/b;->y:Lec3/l;

    iput-object p2, p0, Lj8/b;->z:Lp1/r1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget p1, p0, Lj8/b;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lj8/b;

    iget-object v0, p0, Lj8/b;->z:Lp1/r1;

    const/4 v1, 0x1

    iget-object v2, p0, Lj8/b;->y:Lec3/l;

    invoke-direct {p1, v2, v0, p2, v1}, Lj8/b;-><init>(Lec3/l;Lp1/r1;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lj8/b;

    iget-object v0, p0, Lj8/b;->z:Lp1/r1;

    const/4 v1, 0x0

    iget-object v2, p0, Lj8/b;->y:Lec3/l;

    invoke-direct {p1, v2, v0, p2, v1}, Lj8/b;-><init>(Lec3/l;Lp1/r1;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lj8/b;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lj8/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lj8/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lj8/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lj8/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lj8/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lj8/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lj8/b;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lj8/b;->x:I

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

    new-instance p1, Lj8/a;

    iget-object v1, p0, Lj8/b;->z:Lp1/r1;

    const/4 v3, 0x2

    invoke-direct {p1, v1, v3}, Lj8/a;-><init>(Lp1/r1;I)V

    iput v2, p0, Lj8/b;->x:I

    iget-object v1, p0, Lj8/b;->y:Lec3/l;

    invoke-interface {v1, p1, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_1
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lj8/b;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_4

    if-ne v1, v2, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lj8/a;

    iget-object v1, p0, Lj8/b;->z:Lp1/r1;

    const/4 v3, 0x1

    invoke-direct {p1, v1, v3}, Lj8/a;-><init>(Lp1/r1;I)V

    iput v2, p0, Lj8/b;->x:I

    iget-object v1, p0, Lj8/b;->y:Lec3/l;

    invoke-interface {v1, p1, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_3
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
