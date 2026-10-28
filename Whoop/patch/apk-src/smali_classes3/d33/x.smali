.class public final Ld33/x;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILq83/d;)V
    .locals 0

    iput p2, p0, Ld33/x;->w:I

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, Ld33/x;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ld33/x;

    const/4 v1, 0x2

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2, p2}, Ld33/x;-><init>(IILq83/d;)V

    iput-object p1, v0, Ld33/x;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_0
    new-instance v0, Ld33/x;

    const/4 v1, 0x2

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2, p2}, Ld33/x;-><init>(IILq83/d;)V

    iput-object p1, v0, Ld33/x;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_1
    new-instance v0, Ld33/x;

    const/4 v1, 0x2

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2, p2}, Ld33/x;-><init>(IILq83/d;)V

    iput-object p1, v0, Ld33/x;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_2
    new-instance v0, Ld33/x;

    const/4 v1, 0x2

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2, p2}, Ld33/x;-><init>(IILq83/d;)V

    iput-object p1, v0, Ld33/x;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_3
    new-instance v0, Ld33/x;

    const/4 v1, 0x2

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, p2}, Ld33/x;-><init>(IILq83/d;)V

    iput-object p1, v0, Ld33/x;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_4
    new-instance v0, Ld33/x;

    const/4 v1, 0x2

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, p2}, Ld33/x;-><init>(IILq83/d;)V

    iput-object p1, v0, Ld33/x;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_5
    new-instance v0, Ld33/x;

    const/4 v1, 0x2

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, p2}, Ld33/x;-><init>(IILq83/d;)V

    iput-object p1, v0, Ld33/x;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_6
    new-instance v0, Ld33/x;

    const/4 v1, 0x2

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, p2}, Ld33/x;-><init>(IILq83/d;)V

    iput-object p1, v0, Ld33/x;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_7
    new-instance v0, Ld33/x;

    const/4 v1, 0x2

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, p2}, Ld33/x;-><init>(IILq83/d;)V

    iput-object p1, v0, Ld33/x;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_8
    new-instance v0, Ld33/x;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p2}, Ld33/x;-><init>(IILq83/d;)V

    iput-object p1, v0, Ld33/x;->x:Ljava/lang/Object;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ld33/x;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld33/x;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld33/x;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld33/x;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/String;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld33/x;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld33/x;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld33/x;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ln23/h;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld33/x;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld33/x;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld33/x;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ll40/a;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld33/x;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld33/x;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld33/x;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/lang/String;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld33/x;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld33/x;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld33/x;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Li53/j;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld33/x;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld33/x;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld33/x;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lh0/g1;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld33/x;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld33/x;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld33/x;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_6
    check-cast p1, Lg53/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld33/x;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld33/x;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld33/x;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld33/x;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld33/x;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld33/x;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Li53/j;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld33/x;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld33/x;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld33/x;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Ld33/x;->w:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ld33/x;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ld33/x;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_0

    move v1, v2

    :cond_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ld33/x;->x:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    return-object p1

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ld33/x;->x:Ljava/lang/Object;

    check-cast p1, Ll40/a;

    iget-boolean v0, p1, Ll40/a;->b:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_2

    iget-object v1, p1, Ll40/a;->a:Ljava/lang/String;

    :cond_2
    return-object v1

    :pswitch_3
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ld33/x;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_3

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    move v1, v2

    :cond_4
    xor-int/lit8 p1, v1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_4
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ld33/x;->x:Ljava/lang/Object;

    check-cast p1, Li53/j;

    instance-of p1, p1, Li53/a;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_5
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ld33/x;->x:Ljava/lang/Object;

    check-cast p1, Lh0/g1;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lh0/g1;->a(F)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_6
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ld33/x;->x:Ljava/lang/Object;

    check-cast p1, Lg53/m;

    instance-of p1, p1, Lg53/c;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_7
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ld33/x;->x:Ljava/lang/Object;

    instance-of p1, p1, Le10/y;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_8
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ld33/x;->x:Ljava/lang/Object;

    check-cast p1, Li53/j;

    instance-of v0, p1, Li53/a;

    if-nez v0, :cond_5

    instance-of p1, p1, Li53/i;

    if-eqz p1, :cond_6

    :cond_5
    move v1, v2

    :cond_6
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
