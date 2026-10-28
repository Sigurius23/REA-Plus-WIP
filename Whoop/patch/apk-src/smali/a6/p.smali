.class public final La6/p;
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

    iput p2, p0, La6/p;->w:I

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, La6/p;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, La6/p;

    const/4 v1, 0x2

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, p2}, La6/p;-><init>(IILq83/d;)V

    iput-object p1, v0, La6/p;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_0
    new-instance v0, La6/p;

    const/4 v1, 0x2

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, p2}, La6/p;-><init>(IILq83/d;)V

    iput-object p1, v0, La6/p;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_1
    new-instance v0, La6/p;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p2}, La6/p;-><init>(IILq83/d;)V

    iput-object p1, v0, La6/p;->x:Ljava/lang/Object;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, La6/p;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lp1/w1;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lec3/y1;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, La6/e1;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, La6/p;->w:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La6/p;->x:Ljava/lang/Object;

    check-cast p1, Lp1/w1;

    sget-object v0, Lp1/w1;->w:Lp1/w1;

    if-ne p1, v0, :cond_0

    move v1, v2

    :cond_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La6/p;->x:Ljava/lang/Object;

    check-cast p1, Lec3/y1;

    sget-object v0, Lec3/y1;->w:Lec3/y1;

    if-eq p1, v0, :cond_1

    move v1, v2

    :cond_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La6/p;->x:Ljava/lang/Object;

    check-cast p1, La6/e1;

    instance-of p1, p1, La6/s0;

    xor-int/2addr p1, v2

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
